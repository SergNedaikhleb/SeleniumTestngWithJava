package library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcellReader {

    public FileInputStream fis =null;
  //  private XSSFWorkbook workbook = null;

    String path = null;

    public ExcellReader() throws FileNotFoundException {
        path = System.getProperty("user.dir")+ "\\testdata\\testdata.xlsx";
        fis = new FileInputStream(path);
    }
}
