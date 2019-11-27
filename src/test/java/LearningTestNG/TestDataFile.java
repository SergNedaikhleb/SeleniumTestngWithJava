package LearningTestNG;

import org.testng.annotations.DataProvider;

public class TestDataFile {

    @DataProvider(name="data")
    public static Object[][] testData() {
        Object[][] obj = new Object[3][4];

        obj[0][0] = "Mike";
        obj[0][1] = "Tyson";
        obj[0][2] = "mike@mail.ru";
        obj[0][3] = "123456";

        obj[1][0] = "Jack";
        obj[1][1] = "Daniels";
        obj[1][2] = "jack@mail.ru";
        obj[1][3] = "123456";

        obj[2][0] = "Jeam";
        obj[2][1] = "Beam";
        obj[2][2] = "jeam@mail.ru";
        obj[2][3] = "123456";

        return obj;
    }}

