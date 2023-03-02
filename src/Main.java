import java.util.HashMap;
class Main {
    public static void main(String[] args){
        HashMap<String,String> a=new HashMap<>();
        a.put("Street","Patrick ST");
        a.put("Suite","265");
        a.put("City","Vienna");
        a.put("Zip","22180");
        a.put("Country","United State");

        var entrySet1=a.entrySet();
        for(var entry: entrySet1){
            System.out.println(entry.getValue().toUpperCase());
        }
    }
}
