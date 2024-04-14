package aprill_13;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class array_2 {
    public static void main(String[] args) {

        int sum = 0;
        int[] arr = {23, 44, 55, 54, 23, 87, 87};
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];


        }
        System.out.println("sum :" + sum);
    }
}