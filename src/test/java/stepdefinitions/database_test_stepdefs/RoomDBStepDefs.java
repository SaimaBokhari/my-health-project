package stepdefinitions.database_test_stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import stepdefinitions.ui_test_stepdefs.RoomPageStepDefs;
import utilities.DBUtils;
import utilities.JdbcUtils;
import utilities.ReusableMethods;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.List;

public class RoomDBStepDefs {
    RoomPageStepDefs roomPageStepDefs = new RoomPageStepDefs();
    private static Connection connection;
    private static Statement statement;

    @When("\"Admin\"verify {string} from DB")
    public void admin_verify_from_db(String string) throws SQLException {
        ReusableMethods.waitFor(3);
//        JdbcUtils.connectToDatabase("157.230.48.97", "medunna_db_v2", "select_user", "Medunna_pass_@6");
//        List<Object> roomList = JdbcUtils.getColumnList("id","\"public\".room");
//        System.out.println(roomList);
//        System.out.println("roomPageStepDefs.getIdNumber() = " + roomPageStepDefs.getIdNumber());
//        Assert.assertTrue(roomList.contains(roomPageStepDefs.getIdNumber()));

// ==================================================================
        JdbcUtils.connectToDatabase("157.230.48.97", "medunna_db_v2", "select_user", "Medunna_pass_@6");
        statement = JdbcUtils.createStatement();

        String query = "SELECT id FROM \"public\".room WHERE id ="+roomPageStepDefs.getIdNumber();
        ResultSet resultSet = statement.executeQuery(query);
        String actualData="";
        while (resultSet.next()){
            actualData = resultSet.getString(1);
        }
        System.out.println(actualData);
        Assert.assertEquals(roomPageStepDefs.getIdNumber(),actualData);

        JdbcUtils.closeConnectionAndStatement();



    }

    @Then("{string} verify room_number from DB")
    public void verifyRoom_numberFromDB(String arg0) {
        JdbcUtils.connectToDatabase("157.230.48.97", "medunna_db_v2", "select_user", "Medunna_pass_@6");

        List<Object> roomList = JdbcUtils.getColumnList("room_number","\"public\".room");
        System.out.println(roomList);
        System.out.println("roomPageStepDefs.getIdNumber() = " + roomPageStepDefs.getRoomNumber());
        Assert.assertTrue(roomList.contains(roomPageStepDefs.getRoomNumber()));
    }

    @Then("Admin verify room_type from DB")
    public void adminVerifyRoom_typeFromDB() throws SQLException {
        JdbcUtils.connectToDatabase("157.230.48.97", "medunna_db_v2", "select_user", "Medunna_pass_@6");
        statement = JdbcUtils.createStatement();

        String query = "SELECT room_type FROM \"public\".room WHERE id ="+roomPageStepDefs.getIdNumber();
        ResultSet resultSet = statement.executeQuery(query);
        String actualData="";
        while (resultSet.next()){
            actualData = resultSet.getString(1);
        }
        System.out.println(actualData);
        Assert.assertEquals("DELUXE",actualData);

        JdbcUtils.closeConnectionAndStatement();

    }

    @Then("Admin verify {string} is {string} from DB")
    public void adminVerifyIsFromDB(String queryData, String result) throws SQLException {
        JdbcUtils.connectToDatabase("157.230.48.97", "medunna_db_v2", "select_user", "Medunna_pass_@6");
        statement = JdbcUtils.createStatement();

        String query = "SELECT "+queryData+" FROM \"public\".room WHERE id ="+roomPageStepDefs.getIdNumber();
        ResultSet resultSet = statement.executeQuery(query);
        String actualData="";
        while (resultSet.next()){
            actualData = resultSet.getString(1);
        }
        System.out.println(actualData);
        System.out.println(result);
        Assert.assertEquals(result,actualData);

        JdbcUtils.closeConnectionAndStatement();
    }

    @Then("Admin verify {string} from DB")
    public void adminVerifyFromDB(String queryData) throws SQLException {
        JdbcUtils.connectToDatabase("157.230.48.97", "medunna_db_v2", "select_user", "Medunna_pass_@6");
        statement = JdbcUtils.createStatement();

        String query = "SELECT "+queryData+" FROM \"public\".room WHERE id ="+roomPageStepDefs.getIdNumber();
        ResultSet resultSet = statement.executeQuery(query);
        String actualData="";
        while (resultSet.next()){
            actualData = resultSet.getString(1);
        }
        System.out.println(actualData);
        System.out.println(roomPageStepDefs.getRoomPrice());
        Assert.assertEquals(roomPageStepDefs.getRoomPrice(),actualData.substring(0,3));

        JdbcUtils.closeConnectionAndStatement();

    }
}
