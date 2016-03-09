#CODE TO PARSE JSON FROM FILE
   - First, create a Parser object. This parser object will read data from the file.
   
    ```ssh
    Here filepath is defined as the "Data_file.json" file path in local system.
    ```
    
   - After reading data from file store the content of the file in a string and create a JSONObject "jsonobject" from the string.
   - Then create a JSONObject instance for "ResultSet".
   - Then get the JSONArray "items" from "ResultSet".
   - And finally loop through the array and get the JSONObject from the index.
   - Fetch and Print only "Title" and "Price" fields for every item in the Array.
   
