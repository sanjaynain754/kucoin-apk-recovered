package com.tencentcloudapi.cls.android.producer.request;

import com.tencentcloudapi.cls.android.cls.Cls$LogGroup;
import com.tencentcloudapi.cls.android.cls.Cls$LogGroupList;
import com.tencentcloudapi.cls.android.producer.common.Constants;

/* JADX INFO: loaded from: classes2.dex */
public class PutLogsRequest extends Request {
    private static final long serialVersionUID = 7226856831224917838L;
    private Constants.CompressType compressType = Constants.CompressType.LZ4;
    private String mContentType = "application/x-protobuf";
    private String mFilename;
    private String mSource;
    private String mTopic;
    private Cls$LogGroup.C35857a mlogItems;

    public Constants.CompressType GetCompressType() {
        return this.compressType;
    }

    public Cls$LogGroup.C35857a GetLogItems() {
        return this.mlogItems;
    }

    public String GetSource() {
        return this.mSource;
    }

    public String GetTopic() {
        return this.mTopic;
    }

    public void SetCompressType(Constants.CompressType compressType) {
        this.compressType = compressType;
    }

    public void SetSource(String str) {
        this.mSource = str;
    }

    public void SetTopic(String str) {
        this.mTopic = str;
    }

    public void SetlogItems(Cls$LogGroup.C35857a c35857a) {
        this.mlogItems = c35857a;
    }

    public String getContentType() {
        return this.mContentType;
    }

    public String getFilename() {
        return this.mFilename;
    }

    public void setContentType(String str) {
        this.mContentType = str;
    }

    public void setFilename(String str) {
        this.mFilename = str;
    }

    public PutLogsRequest(String str, String str2, String str3, Cls$LogGroup.C35857a c35857a) {
        this.mTopic = str;
        this.mSource = str2;
        this.mFilename = str3;
        this.mlogItems = c35857a;
    }

    public byte[] GetLogGroupBytes(String str, String str2) {
        Cls$LogGroupList.C35858a c35858aNewBuilder = Cls$LogGroupList.newBuilder();
        this.mlogItems.m79343c(this.mFilename);
        this.mlogItems.m79342b(str2);
        String str3 = this.mSource;
        if (str3 != null && !str3.isEmpty()) {
            this.mlogItems.m79344d(this.mSource);
        } else {
            this.mlogItems.m79344d(str);
        }
        return c35858aNewBuilder.m79345a(this.mlogItems).build().toByteArray();
    }
}
