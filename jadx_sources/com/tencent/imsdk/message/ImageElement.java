package com.tencent.imsdk.message;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes59.dex */
public class ImageElement extends MessageBaseElement {
    private int compressType;
    private int imageFormat;
    private int largeImageFileSize;
    private int largeImageHeight;
    private String largeImageUUID;
    private String largeImageUrl;
    private int largeImageWidth;
    private String originImageFilePath;
    private int originImageFileSize;
    private int originImageHeight;
    private String originImageUUID;
    private String originImageUrl;
    private int originImageWidth;
    private int thumbImageFileSize;
    private int thumbImageHeight;
    private String thumbImageUUID;
    private String thumbImageUrl;
    private int thumbImageWidth;

    public int getCompressType() {
        return this.compressType;
    }

    public int getImageFormat() {
        return this.imageFormat;
    }

    public int getLargeImageFileSize() {
        return this.largeImageFileSize;
    }

    public int getLargeImageHeight() {
        return this.largeImageHeight;
    }

    public String getLargeImageUUID() {
        return this.largeImageUUID;
    }

    public String getLargeImageUrl() {
        return this.largeImageUrl;
    }

    public int getLargeImageWidth() {
        return this.largeImageWidth;
    }

    public String getOriginImageFilePath() {
        return this.originImageFilePath;
    }

    public int getOriginImageFileSize() {
        return this.originImageFileSize;
    }

    public int getOriginImageHeight() {
        return this.originImageHeight;
    }

    public String getOriginImageUUID() {
        return this.originImageUUID;
    }

    public String getOriginImageUrl() {
        return this.originImageUrl;
    }

    public int getOriginImageWidth() {
        return this.originImageWidth;
    }

    public int getThumbImageFileSize() {
        return this.thumbImageFileSize;
    }

    public int getThumbImageHeight() {
        return this.thumbImageHeight;
    }

    public String getThumbImageUUID() {
        return this.thumbImageUUID;
    }

    public String getThumbImageUrl() {
        return this.thumbImageUrl;
    }

    public int getThumbImageWidth() {
        return this.thumbImageWidth;
    }

    public void setLargeImageFileSize(int i11) {
        this.largeImageFileSize = i11;
    }

    public void setLargeImageHeight(int i11) {
        this.largeImageHeight = i11;
    }

    public void setLargeImageUUID(String str) {
        this.largeImageUUID = str;
    }

    public void setLargeImageUrl(String str) {
        this.largeImageUrl = str;
    }

    public void setLargeImageWidth(int i11) {
        this.largeImageWidth = i11;
    }

    public void setOriginImageFilePath(String str) {
        this.originImageFilePath = str;
    }

    public void setOriginImageFileSize(int i11) {
        this.originImageFileSize = i11;
    }

    public void setOriginImageHeight(int i11) {
        this.originImageHeight = i11;
    }

    public void setOriginImageUUID(String str) {
        this.originImageUUID = str;
    }

    public void setOriginImageUrl(String str) {
        this.originImageUrl = str;
    }

    public void setOriginImageWidth(int i11) {
        this.originImageWidth = i11;
    }

    public void setThumbImageFileSize(int i11) {
        this.thumbImageFileSize = i11;
    }

    public void setThumbImageHeight(int i11) {
        this.thumbImageHeight = i11;
    }

    public void setThumbImageUUID(String str) {
        this.thumbImageUUID = str;
    }

    public void setThumbImageUrl(String str) {
        this.thumbImageUrl = str;
    }

    public void setThumbImageWidth(int i11) {
        this.thumbImageWidth = i11;
    }

    @Override // com.tencent.imsdk.message.MessageBaseElement
    public boolean update(MessageBaseElement messageBaseElement) {
        if (this.elementType != messageBaseElement.elementType) {
            return false;
        }
        ImageElement imageElement = (ImageElement) messageBaseElement;
        if (TextUtils.isEmpty(this.originImageFilePath) || !this.originImageFilePath.equals(imageElement.originImageFilePath)) {
            return false;
        }
        this.imageFormat = imageElement.imageFormat;
        this.compressType = imageElement.compressType;
        this.originImageUUID = imageElement.originImageUUID;
        this.originImageUrl = imageElement.originImageUrl;
        this.originImageFileSize = imageElement.originImageFileSize;
        this.originImageWidth = imageElement.originImageWidth;
        this.originImageHeight = imageElement.originImageHeight;
        this.thumbImageUUID = imageElement.thumbImageUUID;
        this.thumbImageUrl = imageElement.thumbImageUrl;
        this.thumbImageFileSize = imageElement.thumbImageFileSize;
        this.thumbImageWidth = imageElement.thumbImageWidth;
        this.thumbImageHeight = imageElement.thumbImageHeight;
        this.largeImageUUID = imageElement.largeImageUUID;
        this.largeImageUrl = imageElement.largeImageUrl;
        this.largeImageFileSize = imageElement.largeImageFileSize;
        this.largeImageWidth = imageElement.largeImageWidth;
        this.largeImageHeight = imageElement.largeImageHeight;
        return true;
    }

    public ImageElement() {
        setElementType(3);
    }
}
