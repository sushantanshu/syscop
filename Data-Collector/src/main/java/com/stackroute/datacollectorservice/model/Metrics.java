package com.stackroute.datacollectorservice.model;

import org.springframework.stereotype.Component;



@Component
public class Metrics {

    private String containerId;
    private String containerName;
    private String cpu;
    private String mem;
    private String netIO;
    private String blockIO;
    private String pId;

    public Metrics() {
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public String getNetIO() {
        return netIO;
    }

    public void setNetIO(String netIO) {
        this.netIO = netIO;
    }

    public String getBlockIO() {
        return blockIO;
    }

    public void setBlockIO(String blockIO) {
        this.blockIO = blockIO;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public Metrics(String containerId, String containerName, String cpu, String mem, String netIO, String blockIO, String pId) {
        this.containerId = containerId;
        this.containerName = containerName;
        this.cpu = cpu;
        this.mem = mem;
        this.netIO = netIO;
        this.blockIO = blockIO;
        this.pId = pId;
    }
}
