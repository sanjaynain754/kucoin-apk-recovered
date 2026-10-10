package com.tencent.qcloud.tim.push.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.qcloud.tim.push.TIMPushConstants;
import com.tencent.qcloud.tim.push.bean.ConfigBean;
import com.tencent.qcloud.tim.push.utils.TIMPushLog;
import com.tencent.qcloud.tuicore.TUIConfig;

/* JADX INFO: loaded from: classes56.dex */
public class TIMPushConfig {
    public static final String JSON_VERSION = "version";
    public static final String TAG = "TIMPushConfig";
    private static TIMPushConfig instance;
    private Context mContext;
    private boolean mEnableFCMPrivateRing;
    private String mLastUserID;
    private String mReadJsonVersion;
    public int mPushChannelId = 0;
    private ConfigBean mRegisterConfigBean = new ConfigBean();
    private boolean mAutoRegisterPush = true;
    private long mPushSDKRunningPlatform = 1;
    private boolean mHaveReadPushSDKRunningPlatform = false;
    private boolean mBackupChannelsEnabled = false;
    private int mPostNotificationInForeground = -1;
    private boolean mRequestPostNotificationPermission = true;
    private boolean mNotificationPermissionDenied = false;
    private int mPushSDKRunningScene = 0;
    private int mCustomBadgeNumber = -1;
    private int mPushStatus = -1;

    public static TIMPushConfig getInstance() {
        if (instance == null) {
            instance = new TIMPushConfig();
        }
        return instance;
    }

    public int canPostNotificationInForeground() {
        return this.mPostNotificationInForeground;
    }

    public boolean canRequestPostNotificationPermission() {
        return this.mRequestPostNotificationPermission;
    }

    public void enableBackupChannels(boolean z11) {
        TIMPushLog.m77016d(TAG, "enableBackupChannels = " + z11);
        this.mBackupChannelsEnabled = z11;
    }

    public void enablePostNotificationInForeground(int i11) {
        TIMPushLog.m77016d(TAG, "enablePostNotificationInForeground = " + i11);
        this.mPostNotificationInForeground = i11;
    }

    public void enableRequestPostNotificationPermission(boolean z11) {
        TIMPushLog.m77016d(TAG, "enableRequestPostNotificationPermission = " + z11);
        this.mRequestPostNotificationPermission = z11;
    }

    public boolean getAutoRegisterPush() {
        return this.mAutoRegisterPush;
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getCustomBadgeNumber() {
        return this.mCustomBadgeNumber;
    }

    public boolean getEnableFCMPrivateRing() {
        return this.mEnableFCMPrivateRing;
    }

    public boolean getNotificationPermissionDenied() {
        return this.mNotificationPermissionDenied;
    }

    public int getPushChannelId() {
        return this.mPushChannelId;
    }

    public int getPushStatus() {
        return this.mPushStatus;
    }

    public String getReadJsonVersion() {
        return this.mReadJsonVersion;
    }

    public ConfigBean getRegisterConfigBean() {
        return this.mRegisterConfigBean;
    }

    public long getRunningPlatform() {
        if (this.mHaveReadPushSDKRunningPlatform) {
            return this.mPushSDKRunningPlatform;
        }
        this.mHaveReadPushSDKRunningPlatform = true;
        long j11 = this.mContext.getSharedPreferences(TIMPushConstants.TPUSH_PREFERENCE, 0).getLong(TIMPushConstants.PREFERENCE_PLATFORM, 1L);
        this.mPushSDKRunningPlatform = j11;
        return j11;
    }

    public int getRunningScene() {
        return this.mPushSDKRunningScene;
    }

    public boolean isBackupChannelsEnabled() {
        return this.mBackupChannelsEnabled;
    }

    public void setAutoRegisterPush(boolean z11) {
        this.mAutoRegisterPush = z11;
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public void setCustomBadgeNumber(int i11) {
        this.mCustomBadgeNumber = i11;
    }

    public void setEnableFCMPrivateRing(boolean z11) {
        this.mEnableFCMPrivateRing = z11;
    }

    public void setNotificationPermissionDenied(boolean z11) {
        this.mNotificationPermissionDenied = z11;
    }

    public void setPushChannelId(int i11) {
        this.mPushChannelId = i11;
        TUIConfig.setCustomData("pushChannelId", Integer.valueOf(i11));
    }

    public void setPushStatus(int i11) {
        this.mPushStatus = i11;
        TUIConfig.setCustomData("pushStatus", Integer.valueOf(i11));
    }

    public void setReadJsonVersion(String str) {
        this.mReadJsonVersion = str;
    }

    public void setRegisterConfigBean(ConfigBean configBean) {
        this.mRegisterConfigBean = configBean;
    }

    public void setRunningPlatform(long j11) {
        if (j11 < 1 || j11 > 7) {
            TIMPushLog.m77017e(TAG, "setRunningPlatform invalid param " + j11);
            return;
        }
        TIMPushLog.m77016d(TAG, "setRunningPlatform " + j11);
        this.mPushSDKRunningPlatform = j11;
        SharedPreferences.Editor editorEdit = this.mContext.getSharedPreferences(TIMPushConstants.TPUSH_PREFERENCE, 0).edit();
        editorEdit.putLong(TIMPushConstants.PREFERENCE_PLATFORM, j11);
        editorEdit.apply();
    }

    public void setRunningScene(int i11, String str) {
        if (TextUtils.equals(this.mLastUserID, str)) {
            this.mPushSDKRunningScene = i11 | this.mPushSDKRunningScene;
        } else {
            this.mPushSDKRunningScene = i11;
        }
        this.mLastUserID = str;
    }

    private TIMPushConfig() {
    }
}
