package cn.chentyit.pojo;

import java.io.Serializable;
import java.util.Objects;

public class Manager implements Serializable {

    private int managerId;
    private String managerName;
    private String managerPassword;
    private int managerPermissions;

    public Manager() {
    }

    public Manager(int managerId, String managerName, String managerPassword, int managerPermissions) {
        this.managerId = managerId;
        this.managerName = managerName;
        this.managerPassword = managerPassword;
        this.managerPermissions = managerPermissions;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    public int getManagerPermissions() {
        return managerPermissions;
    }

    public void setManagerPermissions(int managerPermissions) {
        this.managerPermissions = managerPermissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        Manager manager = (Manager) o;
        return getManagerId() == manager.getManagerId() &&
                getManagerPermissions() == manager.getManagerPermissions() &&
                Objects.equals(getManagerName(), manager.getManagerName()) &&
                Objects.equals(getManagerPassword(), manager.getManagerPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getManagerId(),
                getManagerName(),
                getManagerPassword(),
                getManagerPermissions(),
                System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", managerName='" + managerName + '\'' +
                ", managerPassword='" + managerPassword + '\'' +
                ", managerPermissions=" + managerPermissions +
                '}';
    }
}
