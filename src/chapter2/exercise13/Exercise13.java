package chapter2.exercise13;

import com.opencsv.CSVReader;
//import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise13 {

    public static final String CSV_FILE_PATH = "src/chapter2/exercise13/phonebook.csv";

    public static void main(String[] args) throws Exception{

        //чтение CSV-файла
        Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
        //CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build(); //без первой строки
        CSVReader csvReader = new CSVReader(reader);
        String [] nextLine;
        while ((nextLine = csvReader.readNext()) != null) {
            System.out.println(nextLine[0] + ". "+ nextLine[1] + " " + nextLine[2] + ": " + nextLine[3]);
        }
        csvReader.close();

        //запись в CSV-файл
        CSVWriter csvWriter = new CSVWriter(new FileWriter(CSV_FILE_PATH,true),
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END);
        csvWriter.writeNext("6,Oleg,Titov,+77895623124".split(","));
        csvWriter.close();
    }
}
