package com.tencent.rtmp;

import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.HouseBuilder;
import com.tencent.liteav.txcplayer.common.C34810b;
import com.tencent.liteav.txcplayer.common.C34811c;
import com.tencent.liteav.txcplayer.common.VodPlayerControl;
import com.tencent.liteav.txcvodplayer.p134c.C34841a;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
public class TXPlayerGlobalSetting {
    private static final String TAG = "TXPlayerGlobalSetting";
    private static DrmProvisionEnv sDrmProvisionEnv = DrmProvisionEnv.DRM_PROVISION_ENV_COM;

    public enum DrmProvisionEnv {
        DRM_PROVISION_ENV_COM,
        DRM_PROVISION_ENV_CN
    }

    public static DrmProvisionEnv getDrmProvisionEnv() {
        return sDrmProvisionEnv;
    }

    public static Object getOptions(int i11) {
        if (i11 == 1000) {
            return C34811c.m76238a(HouseBuilder.EnumC34765a.PLAYER_PROJECTION) ? Boolean.TRUE : Boolean.FALSE;
        }
        return null;
    }

    public static void setLicenseFlexibleValid(boolean z11) {
        LiteavLog.m76087i(TAG, "setLicenseFlexibleValid: ".concat(String.valueOf(z11)));
        LiteavLog.m76087i("VodLicenseCheck", "setLicenseFlexibleValid isOpen=".concat(String.valueOf(z11)));
        VodPlayerControl.nativeSetLicenseFlexibleValid(z11);
    }

    public static void setMaxCacheSize(int i11) {
        LiteavLog.m76087i(TAG, "setMaxCacheSize(MB): ".concat(String.valueOf(i11)));
        C34810b.m76232a(i11);
    }

    public static String getCacheFolderPath() {
        return C34810b.m76231a();
    }

    public static int getMaxCacheSize() {
        return Math.max(C34810b.m76235b(), 0);
    }

    public static void setCacheFolderPath(String str) {
        LiteavLog.m76087i(TAG, "setCacheFolderPath: ".concat(String.valueOf(str)));
        C34810b.m76233a(str);
        if (ContextUtils.getApplicationContext() == null) {
            LiteavLog.m76083e(TAG, "Please call setLicense to configure the license first");
        } else {
            C34841a.m76410a().m76419b();
        }
    }

    public static void setDrmProvisionEnv(DrmProvisionEnv drmProvisionEnv) {
        LiteavLog.m76087i(TAG, "setDrmProvisionEnv: ".concat(String.valueOf(drmProvisionEnv)));
        sDrmProvisionEnv = drmProvisionEnv;
    }

    public static void setPlayCGIHosts(List<String> list) {
        LiteavLog.m76087i(TAG, "setPlayCGIHosts: ".concat(String.valueOf(list)));
        C34810b.m76234a(list);
    }
}
