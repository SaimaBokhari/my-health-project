package stepdefinitions.database_test_stepdefs;

import io.cucumber.java.en.*;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class US01_Db_StepDefs {

    @Given("user connects to the application database")
    public void userConnectsToTheApplicationDatabase() {
        DBUtils.createConnection();
    }
    @Then("user sends query to get all of {string} column from {string} table")
    public void userSendsQueryToGetAllOfColumnFromTable(String columnName, String tableName) {
        String query = "SELECT " + columnName + " FROM " + tableName;
        System.out.println("query = " + query);
        DBUtils.executeQuery(query);
    }

    @And("user reads all registrant {string} column data")
    public void userReadsAllRegistrantColumnData(String column) throws SQLException {
        int counter = 0;
        while (DBUtils.getResultset().next()) {
            Object ssnColumn = DBUtils.getResultset().getObject("ssn");
            counter++;
        }
        System.out.println("all ssn ids = " + counter);
    }
    @Then("user verifies all registrants {string}")
    public void userVerifiesAllRegistrants(String ssn) {

        String query = "SELECT ssn FROM jhi_user";
        // put them in list
        List<Object> ssnColumnData = DBUtils.getColumnData(query, ssn);
        System.out.println("ssnColumnData = " + ssnColumnData);
        assertTrue(ssnColumnData.contains("856-45-6788"));

        String ids = ssnColumnData.toString();
        System.out.println("ids = " + ids);

        for (int i =0; i<ids.length(); i++){
            assertTrue(ids.contains(ssnColumnData.toString()));
        }
    }


}
