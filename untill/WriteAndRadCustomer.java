package untill;

import model.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndRadCustomer {
    public static void writeProduct(List<Customer> customerList, String PATH) {
        File file = new File(PATH);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer e : customerList) {
                bufferedWriter.write(e.getCustomToCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Customer> readCustomer(String path) {
        List<Customer> customerList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] customerArr = line.split(",");
                Customer custommer = new Customer(customerArr[0], customerArr[1], customerArr[2],
                        customerArr[3], customerArr[4], customerArr[5], customerArr[6], customerArr[7],
                        customerArr[8]);
                customerList.add(custommer);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return customerList;
    }
}
