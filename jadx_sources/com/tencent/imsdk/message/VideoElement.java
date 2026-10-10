package com.tencent.imsdk.message;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes59.dex */
public class VideoElement extends MessageBaseElement {
    private String snapshotDownloadUrl;
    private String snapshotFilePath;
    private int snapshotFileSize;
    private int snapshotHeight;
    private String snapshotType;
    private String snapshotUUID;
    private int snapshotWidth;
    private int videoBusinessID;
    private String videoDownloadUrl;
    private int videoDuration;
    private String videoFilePath;
    private int videoFileSize;
    private String videoType;
    private String videoUUID;

    public String getSnapshotDownloadUrl() {
        return this.snapshotDownloadUrl;
    }

    public String getSnapshotFilePath() {
        return this.snapshotFilePath;
    }

    public int getSnapshotFileSize() {
        return this.snapshotFileSize;
    }

    public int getSnapshotHeight() {
        return this.snapshotHeight;
    }

    public String getSnapshotType() {
        return this.snapshotType;
    }

    public String getSnapshotUUID() {
        return this.snapshotUUID;
    }

    public int getSnapshotWidth() {
        return this.snapshotWidth;
    }

    public int getVideoBusinessID() {
        return this.videoBusinessID;
    }

    public String getVideoDownloadUrl() {
        return this.videoDownloadUrl;
    }

    public int getVideoDuration() {
        return this.videoDuration;
    }

    public String getVideoFilePath() {
        return this.videoFilePath;
    }

    public int getVideoFileSize() {
        return this.videoFileSize;
    }

    public String getVideoType() {
        return this.videoType;
    }

    public String getVideoUUID() {
        return this.videoUUID;
    }

    public void setSnapshotDownloadUrl(String str) {
        this.snapshotDownloadUrl = str;
    }

    public void setSnapshotFilePath(String str) {
        this.snapshotFilePath = str;
    }

    public void setSnapshotFileSize(int i11) {
        this.snapshotFileSize = i11;
    }

    public void setSnapshotHeight(int i11) {
        this.snapshotHeight = i11;
    }

    public void setSnapshotUUID(String str) {
        this.snapshotUUID = str;
    }

    public void setSnapshotWidth(int i11) {
        this.snapshotWidth = i11;
    }

    public void setVideoDownloadUrl(String str) {
        this.videoDownloadUrl = str;
    }

    public void setVideoDuration(int i11) {
        this.videoDuration = i11;
    }

    public void setVideoFilePath(String str) {
        this.videoFilePath = str;
    }

    public void setVideoFileSize(int i11) {
        this.videoFileSize = i11;
    }

    public void setVideoType(String str) {
        this.videoType = str;
    }

    public void setVideoUUID(String str) {
        this.videoUUID = str;
    }

    @Override // com.tencent.imsdk.message.MessageBaseElement
    public boolean update(MessageBaseElement messageBaseElement) {
        if (this.elementType != messageBaseElement.elementType) {
            return false;
        }
        VideoElement videoElement = (VideoElement) messageBaseElement;
        if (TextUtils.isEmpty(this.videoFilePath) || TextUtils.isEmpty(this.snapshotFilePath) || !this.videoFilePath.equals(videoElement.videoFilePath) || !this.snapshotFilePath.equals(videoElement.snapshotFilePath)) {
            return false;
        }
        this.videoUUID = videoElement.videoUUID;
        this.videoType = videoElement.videoType;
        this.videoFileSize = videoElement.videoFileSize;
        this.videoDuration = videoElement.videoDuration;
        this.videoDownloadUrl = videoElement.videoDownloadUrl;
        this.videoBusinessID = videoElement.videoBusinessID;
        this.snapshotUUID = videoElement.snapshotUUID;
        this.snapshotType = videoElement.snapshotType;
        this.snapshotFileSize = videoElement.snapshotFileSize;
        this.snapshotWidth = videoElement.snapshotWidth;
        this.snapshotHeight = videoElement.snapshotHeight;
        this.snapshotDownloadUrl = videoElement.snapshotDownloadUrl;
        return true;
    }

    public VideoElement() {
        setElementType(5);
    }
}
