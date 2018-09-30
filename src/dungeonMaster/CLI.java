*-package dungeonMaster;

public class CLI {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true){

            System.out.print("A: Create NPC");
            System.out.print("B: Delete NPC ")

            String name = reader.readLine();
            System.out.println("Your name is: " + name);
        }
    }
}
*