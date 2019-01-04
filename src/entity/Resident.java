package entity;

public abstract class Resident {
    private String resident_ID;
    private String name;
    private String phone;
    private int community_ID;

    public Resident(String resident_ID){
        this.resident_ID=resident_ID;
    }

    public void setResident_ID(String resident_id){
        this.resident_ID=resident_id;
    }

    public void  setName(String name){
        this.name=name;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }

    public void setCommunity_ID(int community_ID){
        this.community_ID=community_ID;
    }

    public String getResident_ID(){
        return resident_ID;
    }

    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }

    public int getCommunity_ID() {
        return community_ID;
    }


}
