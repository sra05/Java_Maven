
public class SubDepartment extends Department{
    private int size;

    public SubDepartment(int size) {
        this.size = size;
    }

    @Override
    public int getDepartmentSize() {
        return size;
    }
}