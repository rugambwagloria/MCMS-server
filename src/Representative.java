import java.io.*;


public class Representative {
    private String name;
    private String email;
    private String schoolRegNo;
    private String username;
    BufferedReader bufferedFileReader=null;

    public Representative(String[] repDetails) {
        this.name = repDetails[1]+" "+repDetails[2];
        this.email = repDetails[3];
        this.schoolRegNo = repDetails[4];
        this.username = repDetails[0];

    }

    public void validateParticipant() {
        String line;
        DBO dbo = new DBO();
        dbo.connect();
        try {
            bufferedFileReader=new BufferedReader(new FileReader("src/participants.txt"));
            String reply;
            while ((line = bufferedFileReader.readLine()) != null) {
//                System.out.println(line);

                Main.server.printWriter.println(line);
                reply=Main.server.reader.readLine();
                if (reply.equalsIgnoreCase("yes")) {
                    dbo.insertParticipant(line.split(" "));
                } else if (reply.equalsIgnoreCase("no") ){
                    dbo.insertRejectedParticipant(line.split(" "));
                }

            }
            //clear the file
            BufferedWriter bufferedFileWriter = new BufferedWriter(new FileWriter("src/participants.txt"));
            bufferedFileWriter.write("");
            Main.server.printWriter.println("done");

            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        dbo.close();


    }
}