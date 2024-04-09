package org.utils;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import java.util.ArrayList;

public class FilloCatcher {
    Fillo fillo = new Fillo();
     Recordset recordset;
    Connection  connection ;
    public FilloCatcher() throws FilloException {
        connection = fillo.getConnection("./src/test/resources/CallServiceData.xlsx");
    }

    public Object fetchData(String query) throws FilloException {
        recordset =connection.executeQuery(query);

        return getData() ;
    }

    public Object getData() throws FilloException {
        String data = "";
        int index =0;
        ArrayList<String> fieldNames =recordset.getFieldNames();
//        for (String tem:fieldNames
//             ) {
//            data = data + tem+ " ";
//
//        }
        data = (data+System.lineSeparator()).trim();
        if(fieldNames.size()==1){
            while (recordset.next() && index >-1){

                data = data + recordset.getField(fieldNames.get(index));
                index ++;

            }
            return data;
        }else {
            ArrayList<Object> dumper =new ArrayList<Object>();
            for (String fieldName:recordset.getFieldNames()
                 ) {
                    index = fieldNames.indexOf(fieldName);
                    data="";
              //  !recordset.getField(index).value().equals("")
                while (  index >-1){

                    data = data + recordset.getField(fieldNames.get(index));
                    dumper.add(data);
                    index =-1;

                }


            }

            return dumper;
        }


    }





}
