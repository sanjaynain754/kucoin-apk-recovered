package com.tencent.imsdk.offlinepush;

import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.common.IMCallback;
import com.tencent.imsdk.manager.BaseManager;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class OfflinePushManager {

    public static class OfflinePushManagerHolder {
        private static final OfflinePushManager offlinePushManager = new OfflinePushManager();

        private OfflinePushManagerHolder() {
        }
    }

    public native void nativeDoEnterBackground(EnterBackgroundParam enterBackgroundParam, IMCallback iMCallback);

    public native void nativeDoEnterForeground(EnterForegroundParam enterForegroundParam, IMCallback iMCallback);

    public native void nativeGetOfflinePushConfig(IMCallback iMCallback);

    public native void nativeReportOfflinePushEvent(List<OfflinePushEventItem> list, IMCallback iMCallback);

    public native void nativeSetOfflinePushConfig(OfflinePushConfig offlinePushConfig, IMCallback iMCallback);

    public native void nativeSetOfflinePushInfo(String str, int i11, String str2, int i12, String str3);

    public native void nativeSetOfflinePushToken(OfflinePushToken offlinePushToken, IMCallback iMCallback);

    public static OfflinePushManager getInstance() {
        return OfflinePushManagerHolder.offlinePushManager;
    }

    public void doEnterBackground(EnterBackgroundParam enterBackgroundParam, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeDoEnterBackground(enterBackgroundParam, iMCallback);
    }

    public void doEnterForeground(EnterForegroundParam enterForegroundParam, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeDoEnterForeground(enterForegroundParam, iMCallback);
    }

    public void getOfflinePushConfig(IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetOfflinePushConfig(iMCallback);
    }

    public void reportOfflinePushEvent(List<OfflinePushEventItem> list, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeReportOfflinePushEvent(list, iMCallback);
    }

    public void setOfflinePushConfig(OfflinePushConfig offlinePushConfig, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSetOfflinePushConfig(offlinePushConfig, iMCallback);
    }

    public void setOfflinePushInfo(String str, int i11, String str2, int i12, String str3) {
        nativeSetOfflinePushInfo(str, i11, str2, i12, str3);
    }

    public void setOfflinePushToken(OfflinePushToken offlinePushToken, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSetOfflinePushToken(offlinePushToken, iMCallback);
    }
}
