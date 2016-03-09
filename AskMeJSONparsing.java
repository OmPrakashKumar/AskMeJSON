/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askmejsonparsing;

/**
 *
 * @author OmGupta
 */
import org.json.*;
import java.util.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import static java.util.Spliterators.iterator;
public class AskMeJSONparsing {
    private static final String filePath = "C:\\Users\\OmGupta\\Desktop\\Data_file.json";
    public static void main(String[] args) throws JSONException {
        JSONParser parser = new JSONParser();
	try { 
		Object obj = parser.parse(new FileReader(filePath));
		JSONObject jsonObject = new JSONObject(obj.toString());
                JSONObject ressultSet = jsonObject.getJSONObject("ResultSet");
//                System.out.println(obj.toString());
                JSONArray jSONArray =ressultSet.getJSONArray("items");
                for(int i=0;i<jSONArray.length();i++){
                    JSONObject item = jSONArray.getJSONObject(i);
                    System.out.println(item.getString("Title")+"  "+item.getString("Price"));
                }
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ParseException e) {
		e.printStackTrace();
	}

    }
    
}