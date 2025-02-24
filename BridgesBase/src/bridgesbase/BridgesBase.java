//Starter code for BRIDGES projects (https://bridgesuncc.github.io)
//Created by James Vanderhyde, 13 February 2025

package bridgesbase;

import bridges.connect.Bridges;

public class BridgesBase 
{
    public static void main(String[] args) 
    {
        //Create the BRIDGES object with credentials.
        //  If you are doing a BRIDGES assignment, use the assignment number. 
        //  Otherwise, use any number.
        //  Use your user name and API key from your BRIDGES registation.
        Bridges bridges = new Bridges(ASSIGNMENT, USER_NAME, API_KEY); //do not commit your API key!
        
        try 
        {
            //Run the assignment code in a separate .java file, 
            //  so you don't have to commit this one.
            BridgesApp app = new BridgesApp();
            app.run(bridges);

            //Activate the visualization on the server  
            bridges.visualize();
        } 
        catch (java.io.IOException | bridges.validation.RateLimitException e) 
        {
            System.err.println(e);
        }
    }
}
