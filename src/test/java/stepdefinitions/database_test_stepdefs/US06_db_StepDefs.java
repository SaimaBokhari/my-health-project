package stepdefinitions.database_test_stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;

import static org.junit.Assert.assertTrue;

public class US06_db_StepDefs {

    @Given("patient connects to the database")
    public void patient_connects_to_the_database() {
        DBUtils.getConnection();
    }

    @Given("patient sends query to get data from {string} table for id {string}")
    public void patient_sends_query_to_get_dat_from_table(String tableName, String id) {
        String query = "SELECT * FROM " + tableName + "WHERE id = " + id;
        System.out.println("query = " + query);
        DBUtils.executeQuery(query);
    }

    @Given("patient reads all of the {string} column data")
    public void patient_reads_all_of_the_column_data(String column) throws SQLException {
        int counter= 0;
        while (DBUtils.getResultset().next()) {
            Object first_name = DBUtils.getResultset().getObject("id");
            counter++;
        }
        System.out.println("Total appointments = "+counter);
    }

    @When("patient sends query to get data of the patient the appointment is booked for")
    public void patientSendsQueryToGetDataOfThePatientTheAppointmentIsBookedFor() {
        String query = "Select * from patient WHERE id = (select patient_id  from appointment WHERE id = 13013)";
        System.out.println("query = " + query);
        DBUtils.executeQuery(query);
    }

    @Then("patient conforms First name is {string}, Last name is {string}, email is {string}, phone is {string}")
    public void patientConformsFirstNameIsLastNameIsEmailIsPhoneIs(String firstName, String lastName, String email, String phone) throws SQLException {


        while (DBUtils.getResultset().next()) {
            Assert.assertEquals(DBUtils.getResultset().getString("first_name"), firstName);
            Assert.assertEquals(DBUtils.getResultset().getString("last_name"), lastName);
            Assert.assertEquals(DBUtils.getResultset().getString("email"), email);
            Assert.assertEquals(DBUtils.getResultset().getString("phone"), phone);
        }
    }
}
