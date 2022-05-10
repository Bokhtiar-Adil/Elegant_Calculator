package Branch;

public class my_branch_Branch1 {
    int roll;
    float cgpa;

    String hall;

    public my_branch_Branch1(int roll, float cgpa, String hall) {
        this.roll = roll;
        this.cgpa = cgpa;
        this.hall = hall;

    int session;

    public my_branch_Branch1(int roll, float cgpa, int session) {
        this.roll = roll;
        this.cgpa = cgpa;
        this.session = session;


    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;

    public int getSession() {
        return session;
    }

    public void setSession(int session) {
        this.session = session;

    }
}
