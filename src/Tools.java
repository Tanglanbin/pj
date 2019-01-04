import java.text.SimpleDateFormat;

public class Tools {
    public static  void showMenu(){
        System.out.println("系统功能菜单");
        System.out.println("1:停车管理");
        System.out.println("2.设备管理");
        System.out.println("3.费用管理");
        System.out.println("4.投诉意见管理");
        System.out.println("5.房屋住户管理");
        System.out.println("6.退出");
    }

    public static void showPortMenu(){
        System.out.println("1.购买车位");
        System.out.println("2.租用车位");
        System.out.println("3.临时停车签入");
        System.out.println("4.临时停车签出");
        System.out.println("5.返回主菜单");
    }

    public static void showFeeMenu(){
        System.out.println("1.月度收支报表");
        System.out.println("2.季度收支报表");
        System.out.println("3.返回主菜单");
    }

    public static void showFacilityMenu(){
        //设备排查
        System.out.println("1.排查记录登记");
        System.out.println("2.排查损坏设备维修");
        //设备报修
        System.out.println("3.报修单录入");
        System.out.println("4.报修处理时间安排");
        System.out.println("5.报修处理完成情况填写");
        System.out.println("6.小区月度报修表");
        System.out.println("7.小区季度报修表");
        System.out.println("8.设备损坏统计");
        System.out.println("9.返回主菜单");
    }

    public static void showComplaintMenu(){
        System.out.println("1.投诉登记");
        System.out.println("2.投诉处理");
        System.out.println("3.月度投诉意见查看");
        System.out.println("4.季度投诉意见查看");
        System.out.println("5.返回主菜单");
    }

    public static void showRoomResidentMenu(){
        System.out.println("1.闲置房屋统计");
        System.out.println("2.住户信息登记");
        System.out.println("3.住户月账单缴费情况");
        System.out.println("4.住户缴费");
        System.out.println("5.返回主菜单");
    }
    //规定格式: YYYY-MM-DD
    public static boolean checkDateFormat(String date) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");
            dateFormat.parse(date);
            return true;
        } catch (Exception e) {
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            return false;
        }
    }

    //规定格式: HH:MM:SS
    public static boolean checkTimeFormat(String time){
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:MM");
            dateFormat.parse(time);
            return true;
        } catch (Exception e) {
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            return false;
        }
    }

    //检查日期先后关系是否正确
    public static boolean checkDateOrder(String start, String end) {
        String[] tmp1 = start.split("-");
        String[] tmp2 = end.split("-");
        for (int i = 0; i < tmp1.length; i++) {
            int a = Integer.parseInt(tmp1[i]);
            int b = Integer.parseInt(tmp2[i]);
            if (a > b) {
                return false;
            }
        }
        return true;
    }

    //检查时间先后关系是否正确
    public static boolean checkTimeOrder(String start, String end) {
        String[] tmp1 = start.split(":");
        String[] tmp2 = end.split(":");
        for (int i = 0; i < tmp1.length; i++) {
            int a = Integer.parseInt(tmp1[i]);
            int b = Integer.parseInt(tmp2[i]);
            if (a > b) {
                return false;
            }
        }
        return true;
    }
}
