package entity;

public  class Complaint {
    private long  complaint_id;
    private  String resident_id;
    private  String category;
    private  String complaint_time;
    private  String complaint_details;
    private  String process;
    private boolean isFinished;

    public Complaint(long complaint_id,String resident_id,String category,String complaint_time,String complaint_details){
        this.complaint_id=complaint_id;
        this.resident_id=resident_id;
        this.category=category;
        this.complaint_time=complaint_time;
        this.complaint_details=complaint_details;
    }


    public long getComplaint_id() {
        return complaint_id;
    }

    public void setComplaint_id(long complaint_id) {
        this.complaint_id = complaint_id;
    }

    public String getResident_id() {
        return resident_id;
    }

    public void setResident_id(String resident_id) {
        this.resident_id = resident_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getComplaint_time() {
        return complaint_time;
    }

    public void setComplaint_time(String complaint_time) {
        this.complaint_time = complaint_time;
    }

    public String getComplaint_details() {
        return complaint_details;
    }

    public void setComplaint_details(String complaint_details) {
        this.complaint_details = complaint_details;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }
}
