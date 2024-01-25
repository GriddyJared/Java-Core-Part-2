package org.example.Regex;

public class regex {


    public static void main(String[] args) {

        String orderUUID = "app=edi_adapter_converter wingtipsTrace=8faeae6709355291 INFO  OrderCreateClient - " +
                "action=EDIOrderSent originalFilename=Integration_test_Contract customerName=0005084863 " +
                "orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 poNum=Test_TS5155079515 lineCount=3";

        String email = "test 2667843 (test_email@griddynamics.com) test 67483 some string";

        String order = "app=edi_adapter_splitter wingtipsTrace=225debfbe6e5fac7 poiFileName=Integration_" +
                "test_Contract INFO  LogUtils - POI file name: [Integration_test_Contract], total number of orders successfully processed: [2]";

        FindContains regexContain = new FindContains();


        boolean containsorderUUID = regexContain.containsOrderUUid(orderUUID);
        String foundOrderUUID = regexContain.findOrderUUid(orderUUID);
        String foundEmail = regexContain.findEmail(email);
        int numOrders = regexContain.findOrders(order);

        if (containsorderUUID) {
            System.out.println("This string contains an orderUUID: " + containsorderUUID+"\n");
            System.out.println("orderUUID:" + foundOrderUUID+"\n");
        }else {
            System.out.println("This string contains an orderUUID: " + containsorderUUID+"\n");
        }

        System.out.println("found email:" + foundEmail+"\n");
        System.out.println("number of orders:" + numOrders);
    }
}
