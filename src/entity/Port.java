package entity;

public abstract class Port {
    private String port_id;
    private boolean state;
    private int community_id;

    public Port(String port_id){
        this.port_id=port_id;
    }

    public void setCommunity_id(int community_id) {
        this.community_id = community_id;
    }

    public void setPort_id(String port_id) {
        this.port_id = port_id;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getCommunity_id() {
        return community_id;
    }

    public String getPort_id() {
        return port_id;
    }

    public boolean getState() {
        return state;
    }


}
