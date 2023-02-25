package stepdefinitions.database_test_stepdefs;

import io.cucumber.java.en.*;
import utilities.DBUtils;
import java.sql.SQLException;
import java.util.List;
import static org.junit.Assert.assertTrue;

public class US11_Db_StepDefs {
    @Given("doctor connects to the database")
    public void doctor_connects_to_the_database() {
        DBUtils.getConnection();
    }
    @Given("doctor sends query to get data of {string} column from {string} table")
    public void doctor_sends_query_to_get_data_of_column_from_table(String columnName, String tableName) {
        String query = "SELECT "+columnName+" FROM "+tableName;
        System.out.println("query = " + query);
        DBUtils.executeQuery(query);
    }
    @Given("doctor reads all of the {string} column data")
    public void doctor_reads_all_of_the_column_data(String column) throws SQLException {
        int counter= 0;
        while (DBUtils.getResultset().next()) {
            Object columnData1 = DBUtils.getResultset().getObject("id");
            counter++;
        }
        System.out.println("Total appointments = "+counter);
    }
    @Given("doctor verifies the appointments by {string}")
    public void doctor_verifies_the_appointments_by(String id) {
        String query = "SELECT ID FROM appointment";
        List<Object> appointmentDetails =DBUtils.getColumnData(query,"id");
        for (Object w: appointmentDetails)
            System.out.println(w.toString());

        boolean flag=false;
        if (appointmentDetails.isEmpty()){
            flag=true;
        }
        assertTrue(appointmentDetails.size() != 0);

    }

    @Then("close the database connection")
    public void close_the_database_connection() {
        DBUtils.closeConnection();

    }


}
