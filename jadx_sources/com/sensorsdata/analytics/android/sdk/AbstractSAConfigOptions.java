package com.sensorsdata.analytics.android.sdk;

import com.sensorsdata.analytics.android.sdk.encrypt.IPersistentSecretKey;
import com.sensorsdata.analytics.android.sdk.encrypt.SAEncryptListener;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractSAConfigOptions {
    boolean isAutoAddChannelCallbackEvent;
    boolean isAutoTrackWebView;
    boolean isWebViewSupportJellyBean;
    String mAnonymousId;
    int mAutoTrackEventType;
    public boolean mDisableDebugAssistant;
    public boolean mDisableRandomTimeRequestRemoteConfig;
    boolean mEnableTrackAppCrash;
    public boolean mEnableTrackPush;
    int mFlushBulkSize;
    int mFlushInterval;
    boolean mHeatMapConfirmDialogEnabled;
    boolean mHeatMapEnabled;
    boolean mLogEnabled;
    IPersistentSecretKey mPersistentSecretKey;
    boolean mRNAutoTrackEnabled;
    public String mRemoteConfigUrl;
    public SSLSocketFactory mSSLSocketFactory;
    String mServerUrl;
    boolean mTrackScreenOrientationEnabled;
    boolean mVisualizedConfirmDialogEnabled;
    boolean mVisualizedEnabled;
    public int mMinRequestInterval = 24;
    public int mMaxRequestInterval = 48;
    long mMaxCacheSize = 33554432;
    int mNetworkTypePolicy = 30;
    boolean mEnableSaveDeepLinkInfo = false;
    boolean mEnableMultipleChannelMatch = false;
    boolean isSubProcessFlushData = false;
    boolean mEnableEncrypt = false;
    boolean isDataCollectEnable = true;
    boolean isDisableSDK = false;
    boolean mEnableReferrerTitle = false;
    List<SAEncryptListener> mEncryptors = new ArrayList();
    protected boolean mIsTrackPageLeave = false;

    public List<SAEncryptListener> getEncryptors() {
        return this.mEncryptors;
    }

    public boolean isDataCollectEnable() {
        return this.isDataCollectEnable;
    }

    public boolean isDisableSDK() {
        return this.isDisableSDK;
    }

    public boolean isEnableTrackPush() {
        return this.mEnableTrackPush;
    }

    public boolean isMultiProcessFlush() {
        return this.isSubProcessFlushData;
    }

    public boolean isSaveDeepLinkInfo() {
        return this.mEnableSaveDeepLinkInfo;
    }

    public boolean isTrackPageLeave() {
        return this.mIsTrackPageLeave;
    }
}
