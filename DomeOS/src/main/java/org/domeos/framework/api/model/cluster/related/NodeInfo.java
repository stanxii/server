package org.domeos.framework.api.model.cluster.related;

import io.fabric8.kubernetes.api.model.Quantity;

import java.util.Map;

/**
 * Created by feiliu206363 on 2015/12/17.
 */
public class NodeInfo {

    private String name;
    private String ip;
    private Map<String, String> labels;
    private Map<String, Quantity> capacity;
    private int runningPods;
    private String status;
    private long createTime;
    private String diskInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public Map<String, Quantity> getCapacity() {
        return capacity;
    }

    public void setCapacity(Map<String, Quantity> capacity) {
        this.capacity = capacity;
    }

    public int getRunningPods() {
        return runningPods;
    }

    public void setRunningPods(int runningPods) {
        this.runningPods = runningPods;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getDiskInfo() {
        return diskInfo;
    }

    public void setDiskInfo(String diskInfo) {
        this.diskInfo = diskInfo;
    }
}
