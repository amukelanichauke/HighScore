package com.amukelani.chauke.high.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static com.amukelani.chauke.high.score.Constants.EMPTY_STRING;
import static com.amukelani.chauke.high.score.Constants.LINE_SEPERATOR;

public class DataReaderService {

    public String getDataFromCSVFile(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        StringBuilder stringBuilder = new StringBuilder();
        String line = EMPTY_STRING;


        reader.readLine(); // remove headers
        while (((line = reader.readLine())!= null)) {

            stringBuilder.append(line);
            stringBuilder.append(LINE_SEPERATOR);
        }

        if (stringBuilder.length()!=0){
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }

        reader.close();
        return stringBuilder.toString();
    }
}
