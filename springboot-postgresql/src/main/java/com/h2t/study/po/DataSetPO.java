package com.h2t.study.po;

import java.time.LocalDateTime;

/**
 * 数据库实体
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/12/16 11:24
 */
public class DataSetPO {
    private String uuid;

    private String userUuid;

    private String name;

    private String description;

    private int status;

    private String savePath;

    private LocalDateTime gmtModified;

    public DataSetPO() {
    }

    public DataSetPO(String uuid, String userUuid, String name, String description,
                     int status, String savePath, LocalDateTime gmtModified) {
        this.uuid = uuid;
        this.userUuid = userUuid;
        this.name = name;
        this.description = description;
        this.status = status;
        this.savePath = savePath;
        this.gmtModified = gmtModified;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "DataSetPO{" +
                "uuid='" + uuid + '\'' +
                ", userUuid='" + userUuid + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", savePath='" + savePath + '\'' +
                ", gmtModified=" + gmtModified +
                '}';
    }
}