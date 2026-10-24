package obj;

import java.util.ArrayList;
import java.util.List;

public class Device {

    private String name;
    private String id;
    private String password;

    List<Object> deviceData = new ArrayList<>();

    public Device() { }

    public Device(String name, String id, String password) {

        this.name = name;
        this.id = id;
        this.password = password;
    }

    public void addDeviceData(Object data) {

        this.deviceData.add(data);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
