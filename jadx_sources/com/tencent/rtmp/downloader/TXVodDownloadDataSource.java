package com.tencent.rtmp.downloader;

import android.text.TextUtils;
import com.tencent.rtmp.TXPlayerAuthBuilder;

/* JADX INFO: loaded from: classes56.dex */
public class TXVodDownloadDataSource {
    public static final int QUALITY_1080P = 1080;
    public static final int QUALITY_240P = 240;
    public static final int QUALITY_2K = 5;
    public static final int QUALITY_360P = 360;
    public static final int QUALITY_480P = 480;
    public static final int QUALITY_4K = 6;
    public static final int QUALITY_540P = 540;
    public static final int QUALITY_720P = 720;

    @Deprecated
    public static final int QUALITY_FHD = 4;

    @Deprecated
    public static final int QUALITY_FLU = 1;

    @Deprecated
    public static final int QUALITY_HD = 3;
    public static final int QUALITY_OD = 0;

    @Deprecated
    public static final int QUALITY_SD = 2;
    public static final int QUALITY_UNK = 1000;
    protected int appId;
    protected TXPlayerAuthBuilder authBuilder;
    protected String fileId;
    protected int mEncryptedLevel;
    protected String mUrl;
    protected String overlayIv;
    protected String overlayKey;
    protected String pSign;
    protected int quality;
    protected String templateName;
    protected String token;
    protected String userName;

    public TXVodDownloadDataSource(int i11, String str, int i12, String str2, String str3) {
        this.userName = "default";
        this.overlayKey = "";
        this.overlayIv = "";
        this.mEncryptedLevel = 0;
        this.appId = i11;
        this.fileId = str;
        this.quality = i12;
        this.pSign = str2;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        this.userName = str3;
    }

    public int getAppId() {
        return this.appId;
    }

    @Deprecated
    public TXPlayerAuthBuilder getAuthBuilder() {
        return this.authBuilder;
    }

    public int getEncryptedLevel() {
        return this.mEncryptedLevel;
    }

    public String getFileId() {
        return this.fileId;
    }

    public String getOverlayIv() {
        return this.overlayIv;
    }

    public String getOverlayKey() {
        return this.overlayKey;
    }

    public String getPSign() {
        return this.pSign;
    }

    public int getQuality() {
        return this.quality;
    }

    @Deprecated
    public String getTemplateName() {
        return this.templateName;
    }

    public String getToken() {
        return this.token;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setEncryptedLevel(int i11) {
        this.mEncryptedLevel = i11;
    }

    public void setQuality(int i11) {
        this.quality = i11;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public TXVodDownloadDataSource(String str, int i11) {
        this.appId = -1;
        this.fileId = "";
        this.pSign = "";
        this.userName = "default";
        this.overlayKey = "";
        this.overlayIv = "";
        this.mEncryptedLevel = 0;
        this.mUrl = str;
        this.quality = i11;
    }

    @Deprecated
    public TXVodDownloadDataSource(TXPlayerAuthBuilder tXPlayerAuthBuilder, int i11) {
        this.appId = -1;
        this.fileId = "";
        this.pSign = "";
        this.userName = "default";
        this.overlayKey = "";
        this.overlayIv = "";
        this.mEncryptedLevel = 0;
        this.authBuilder = tXPlayerAuthBuilder;
        this.quality = i11;
    }

    @Deprecated
    public TXVodDownloadDataSource(TXPlayerAuthBuilder tXPlayerAuthBuilder, String str) {
        this.appId = -1;
        this.fileId = "";
        this.pSign = "";
        this.quality = 1000;
        this.userName = "default";
        this.overlayKey = "";
        this.overlayIv = "";
        this.mEncryptedLevel = 0;
        this.authBuilder = tXPlayerAuthBuilder;
        this.templateName = str;
    }

    public TXVodDownloadDataSource() {
        this.appId = -1;
        this.fileId = "";
        this.pSign = "";
        this.quality = 1000;
        this.userName = "default";
        this.overlayKey = "";
        this.overlayIv = "";
        this.mEncryptedLevel = 0;
    }
}
