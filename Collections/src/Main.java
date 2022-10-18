import java.awt.image.ImageProducer;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //arrays in java are immutable
        String[] perrudos = {"nudera", "kof", "chico", "punky", "momesno"};
        System.out.println(perrudos[3]);

        ArrayList<String> newPerrudos = new ArrayList<>();


//        for (int i = 0; 1 < perrudos.length; i++) {
//                newPerrudos[i] = perrudos[i];
//        }
//            newPerrudos[5] = "perra";


//            ArrayList<String> perrudos2 = new ArrayList<>();
//            List<String> students = new ArrayList<>();
////            perrudos2.add("punky");
////            perrudos2.add("nudera");
//
//            System.out.println(perrudos2);
//            System.out.println(perrudos2.get(0));
//
//            perrudos2.add(2, "chico");
//            perrudos2.add(3, "kof");
//
//            System.out.println(perrudos2);
//            System.out.println(perrudos2.size());
//
//            // perrudos2.clear(); //this methos clrear the list
//            perrudos2.remove("nudera"); //requires string of the elemnet
//            System.out.println(perrudos2);


            ArrayList<Integer> nums = new ArrayList<Integer>();
            nums.add(1);
            nums.add(2);
            nums.add(3);
            System.out.println(nums);

            ArrayList<String> perrudosNombres = new ArrayList<String>();
            perrudosNombres.add("punky");
            perrudosNombres.add("nudera");
            perrudosNombres.add("kof");
            perrudosNombres.add("chico");
            perrudosNombres.add("panke");
            System.out.println(perrudosNombres);


            for (int i = 0; i < perrudosNombres.size(); i++) {
                System.out.println(perrudosNombres.get(i));


            }

            //key value pairs structure
            Map<String, String> perrudosEmailList = new HashMap<>();
            perrudosEmailList.put("punky", "punky@google.com");
            perrudosEmailList.put("kof", "kofy@google.com");
            perrudosEmailList.put("nudera", "nudera@google.com");
            perrudosEmailList.put("chico", "chicoy@google.com");
            perrudosEmailList.put("blanco", "blancoy@google.com");
            System.out.println(perrudosEmailList);

            System.out.println(perrudosEmailList.get("punky"));
            System.out.println(perrudosEmailList.get("kof"));
            System.out.println(perrudosEmailList.size());
            perrudosEmailList.remove("blanco");
            System.out.println(perrudosEmailList.size());
            System.out.println(perrudosEmailList);
            System.out.println(perrudosEmailList.containsKey("panke"));
            System.out.println(perrudosEmailList.containsKey("kof"));
            System.out.println(perrudosEmailList.containsValue("chara@google.com"));

            ArrayList<Perrudo> perrudosClass = new ArrayList<>();
perrudosClass.add(new PerrudosClass);
        }

    }








