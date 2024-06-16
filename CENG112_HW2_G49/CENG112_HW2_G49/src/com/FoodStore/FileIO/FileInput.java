package com.FoodStore.FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileInput {

    private final BufferedReader bufferedReader;
    private StringTokenizer stringTokenizer;
    private final String delimiter = ",";

    public FileInput(String fileName) throws FileNotFoundException {
        bufferedReader = new BufferedReader(new FileReader(fileName));
    }

    public String[][] getInput() throws IOException {
        String[][] inputs = new String[30][5];
        int row = 0, col = 0;
        String line, word;

        while ((line = bufferedReader.readLine()) != null) {

            stringTokenizer = new StringTokenizer(line, delimiter);
            while (stringTokenizer.hasMoreTokens()){
                word = stringTokenizer.nextToken();
                word = word.replaceAll("\\s","");
                inputs[row][col] = word;
                col++;
            }

            row++;
            col = 0;
        }
        return inputs;
    }

}
