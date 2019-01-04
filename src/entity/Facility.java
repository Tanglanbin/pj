package entity;

public abstract class Facility {
    private String facility_id;
    private int community_id;
    private String name;
    private boolean in_out;
    private String next_check_time;

    public Facility(String facility_id,int community_id,String name,boolean in_out){
        this.facility_id=facility_id;
        this.community_id=community_id;
        this.name=name;
        this.in_out=in_out;
    }



    public String getFacility_id() {
        return facility_id;
    }

    public void setFacility_id(String facility_id) {
        this.facility_id = facility_id;
    }

    public int getCommunity_id() {
        return community_id;
    }

    public void setCommunity_id(int community_id) {
        this.community_id = community_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIn_out() {
        return in_out;
    }

    public void setIn_out(boolean in_out) {
        this.in_out = in_out;
    }

    public String getNext_check_time() {
        return next_check_time;
    }

    public void setNext_check_time(String next_check_time) {
        this.next_check_time = next_check_time;
    }
}
