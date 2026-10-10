package com.sensorsdata.analytics.android.sdk;

import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils;
import com.sensorsdata.analytics.android.sdk.encrypt.IPersistentSecretKey;
import com.sensorsdata.analytics.android.sdk.encrypt.SAEncryptListener;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes23.dex */
public final class SAConfigOptions extends AbstractSAConfigOptions implements Cloneable {
    boolean mInvokeHeatMapConfirmDialog;
    boolean mInvokeHeatMapEnabled;
    boolean mInvokeHeatMapSSLCheck;
    boolean mInvokeLog;
    boolean mInvokeVisualizedConfirmDialog;
    boolean mInvokeVisualizedEnabled;
    boolean mInvokeVisualizedSSLCheck;

    private SAConfigOptions() {
    }

    public SAConfigOptions disableDataCollect() {
        this.isDataCollectEnable = false;
        return this;
    }

    public SAConfigOptions disableDebugAssistant() {
        this.mDisableDebugAssistant = true;
        return this;
    }

    public SAConfigOptions disableRandomTimeRequestRemoteConfig() {
        this.mDisableRandomTimeRequestRemoteConfig = true;
        return this;
    }

    public SAConfigOptions enableJavaScriptBridge(boolean z11) {
        this.isAutoTrackWebView = true;
        this.isWebViewSupportJellyBean = z11;
        return this;
    }

    public SAConfigOptions enableSubProcessFlushData() {
        this.isSubProcessFlushData = true;
        return this;
    }

    public SAConfigOptions enableTrackAppCrash() {
        this.mEnableTrackAppCrash = true;
        return this;
    }

    public SAConfigOptions(String str) {
        this.mServerUrl = str;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SAConfigOptions m103802clone() {
        try {
            return (SAConfigOptions) super.clone();
        } catch (CloneNotSupportedException e11) {
            SALog.printStackTrace(e11);
            return this;
        }
    }

    public SAConfigOptions disableSDK(boolean z11) {
        this.isDisableSDK = z11;
        return this;
    }

    public SAConfigOptions enableAutoAddChannelCallbackEvent(boolean z11) {
        this.isAutoAddChannelCallbackEvent = z11;
        return this;
    }

    public SAConfigOptions enableEncrypt(boolean z11) {
        this.mEnableEncrypt = z11;
        return this;
    }

    public SAConfigOptions enableHeatMap(boolean z11) {
        this.mHeatMapEnabled = z11;
        this.mInvokeHeatMapEnabled = true;
        return this;
    }

    public SAConfigOptions enableHeatMapConfirmDialog(boolean z11) {
        this.mHeatMapConfirmDialogEnabled = z11;
        this.mInvokeHeatMapConfirmDialog = true;
        return this;
    }

    public SAConfigOptions enableLog(boolean z11) {
        this.mLogEnabled = z11;
        this.mInvokeLog = true;
        return this;
    }

    public SAConfigOptions enableMultipleChannelMatch(boolean z11) {
        this.mEnableMultipleChannelMatch = z11;
        return this;
    }

    public SAConfigOptions enableReactNativeAutoTrack(boolean z11) {
        this.mRNAutoTrackEnabled = z11;
        return this;
    }

    public SAConfigOptions enableReferrerTitle(boolean z11) {
        this.mEnableReferrerTitle = z11;
        return this;
    }

    public SAConfigOptions enableSaveDeepLinkInfo(boolean z11) {
        this.mEnableSaveDeepLinkInfo = z11;
        return this;
    }

    public SAConfigOptions enableTrackPageLeave(boolean z11) {
        this.mIsTrackPageLeave = z11;
        return this;
    }

    public SAConfigOptions enableTrackPush(boolean z11) {
        this.mEnableTrackPush = z11;
        return this;
    }

    public SAConfigOptions enableTrackScreenOrientation(boolean z11) {
        this.mTrackScreenOrientationEnabled = z11;
        return this;
    }

    public SAConfigOptions enableVisualizedAutoTrack(boolean z11) {
        this.mVisualizedEnabled = z11;
        this.mInvokeVisualizedEnabled = true;
        return this;
    }

    public SAConfigOptions enableVisualizedAutoTrackConfirmDialog(boolean z11) {
        this.mVisualizedConfirmDialogEnabled = z11;
        this.mInvokeVisualizedConfirmDialog = true;
        return this;
    }

    public SAConfigOptions persistentSecretKey(IPersistentSecretKey iPersistentSecretKey) {
        this.mPersistentSecretKey = iPersistentSecretKey;
        return this;
    }

    public SAConfigOptions registerEncryptor(SAEncryptListener sAEncryptListener) {
        if (sAEncryptListener != null && !TextUtils.isEmpty(sAEncryptListener.asymmetricEncryptType()) && !TextUtils.isEmpty(sAEncryptListener.symmetricEncryptType()) && !this.mEncryptors.contains(sAEncryptListener)) {
            this.mEncryptors.add(0, sAEncryptListener);
        }
        return this;
    }

    public SAConfigOptions setAnonymousId(String str) {
        this.mAnonymousId = str;
        return this;
    }

    public SAConfigOptions setAutoTrackEventType(int i11) {
        this.mAutoTrackEventType = i11;
        return this;
    }

    public SAConfigOptions setFlushBulkSize(int i11) {
        this.mFlushBulkSize = Math.max(50, i11);
        return this;
    }

    public SAConfigOptions setFlushInterval(int i11) {
        this.mFlushInterval = Math.max(5000, i11);
        return this;
    }

    public SAConfigOptions setMaxRequestInterval(int i11) {
        if (i11 > 0) {
            this.mMaxRequestInterval = Math.min(i11, 168);
        }
        return this;
    }

    public SAConfigOptions setMinRequestInterval(int i11) {
        if (i11 > 0) {
            this.mMinRequestInterval = Math.min(i11, 168);
        }
        return this;
    }

    public SAConfigOptions setNetworkTypePolicy(int i11) {
        this.mNetworkTypePolicy = i11;
        return this;
    }

    public SAConfigOptions setRemoteConfigUrl(String str) {
        this.mRemoteConfigUrl = str;
        return this;
    }

    public SAConfigOptions setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.mSSLSocketFactory = sSLSocketFactory;
        return this;
    }

    public SAConfigOptions setServerUrl(String str) {
        this.mServerUrl = str;
        return this;
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ List getEncryptors() {
        return super.getEncryptors();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isDataCollectEnable() {
        return super.isDataCollectEnable();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isDisableSDK() {
        return super.isDisableSDK();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isEnableTrackPush() {
        return super.isEnableTrackPush();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isMultiProcessFlush() {
        return super.isMultiProcessFlush();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isSaveDeepLinkInfo() {
        return super.isSaveDeepLinkInfo();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isTrackPageLeave() {
        return super.isTrackPageLeave();
    }

    public SAConfigOptions setMaxCacheSize(long j11) {
        this.mMaxCacheSize = Math.max(16777216L, j11);
        return this;
    }

    public SAConfigOptions setSourceChannels(String... strArr) {
        ChannelUtils.setSourceChannelKeys(strArr);
        return this;
    }
}
