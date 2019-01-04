import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/pjcharacterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
        String usr = "root";
        String pwd = "123456";
        String className = "com.mysql.cj.jdbc.Driver";
        Database myDB = new Database(url, usr, pwd, className);

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the tiny property manage system!");

        boolean isOn=true;

        while (isOn){
            boolean isSonOn=true;
            Tools.showMenu();
            int option = Integer.parseInt(input.nextLine());
            int sonOption=0;
            switch (option) {
                case 1:
                    System.out.println("已进入停车管理模块");

                    while (isSonOn){
                        Tools.showPortMenu();
                       sonOption=Integer.parseInt(input.nextLine());
                       switch (sonOption){
                           case 1:
                               System.out.println("输入（空格分隔）：身份证号 小区编号");

                               break;



                       }


                    }
                    break;
                case 2:
                    System.out.println("已进入设备管理模块");
                    while (isSonOn){
                        Tools.showFacilityMenu();
                        sonOption=Integer.parseInt(input.nextLine());


                    }
                    break;
                case 3:
                    System.out.println("已进入费用管理模块");
                    while (isSonOn){
                        Tools.showFeeMenu();
                        sonOption=Integer.parseInt(input.nextLine());


                    }
                    break;
                case 4:
                    System.out.println("已进入投诉意见管理模块");
                    while (isSonOn){
                        Tools.showComplaintMenu();
                        sonOption=Integer.parseInt(input.nextLine());


                    }

                    break;
                case 5:
                    System.out.println("已进入房屋住户管理模块");
                    while (isSonOn){
                        Tools.showRoomResidentMenu();
                        sonOption=Integer.parseInt(input.nextLine());


                    }
                    break;
                case 6:
                    isOn=false;
                    break;
                default:
                    System.out.println("请选择列表中的功能模块");
            }
        }
    }
}
