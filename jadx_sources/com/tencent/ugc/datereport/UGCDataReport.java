package com.tencent.ugc.datereport;

import android.text.TextUtils;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.liteav.base.datareport.Event4XReporter;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.HouseBuilder;
import com.tencent.ugc.UGCLicenseChecker;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class UGCDataReport {
    private static final String TAG = "UGCDataReport";
    private static UGCDataReport sInstance;
    private String mNetType = Integer.toString(LiteavSystemInfo.getNetworkType());
    private String mDevId = LiteavSystemInfo.getDeviceUuid();
    private String mDevUUID = LiteavSystemInfo.getDeviceUuid();
    private String mPkgName = LiteavSystemInfo.getAppPackageName();
    private String mAppName = LiteavSystemInfo.getAppName() + C33844oi.f71346o + this.mPkgName;
    private String mSystemVersion = String.valueOf(LiteavSystemInfo.getSystemOSVersionInt());
    private final Event4XReporter mDAUReporter = new Event4XReporter(UGCDataReportDef.COMMAND_ID_DAU, 1004, "", true, 1);

    public static synchronized void reportDAU(int i11) {
        getInstance().reportDAUImpl(i11, 0, "");
    }

    private static UGCDataReport getInstance() {
        if (sInstance == null) {
            synchronized (UGCDataReport.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new UGCDataReport();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return sInstance;
    }

    private void setCommonInfo() {
        String str = this.mNetType;
        if (str != null) {
            this.mDAUReporter.setCommonStringValue("net_type", str);
        }
        String str2 = this.mDevId;
        if (str2 != null) {
            this.mDAUReporter.setCommonStringValue(UGCDataReportDef.DR_KEY_DEV_ID, str2);
        }
        String str3 = this.mDevUUID;
        if (str3 != null) {
            this.mDAUReporter.setCommonStringValue(UGCDataReportDef.DR_KEY_DEV_UUID, str3);
        }
        String str4 = this.mAppName;
        if (str4 != null) {
            this.mDAUReporter.setCommonStringValue("app_name", str4);
        }
        String str5 = this.mSystemVersion;
        if (str5 != null) {
            this.mDAUReporter.setCommonStringValue(UGCDataReportDef.DR_KEY_SYS_VER, str5);
        }
        long appId = getAppId();
        if (appId != 0) {
            this.mDAUReporter.setCommonIntValue(UGCDataReportDef.DR_KEY_APP_ID, appId);
        }
    }

    private UGCDataReport() {
    }

    private long getAppId() {
        String licenseAppId = UGCLicenseChecker.getLicenseAppId();
        if (!TextUtils.isEmpty(licenseAppId)) {
            try {
                return Long.parseLong(licenseAppId);
            } catch (Exception unused) {
                return 0L;
            }
        }
        return 0L;
    }

    public static synchronized void reportDAU(int i11, int i12, String str) {
        getInstance().reportDAUImpl(i11, i12, str);
    }

    private void reportDAUImpl(int i11, int i12, String str) {
        String str2;
        setCommonInfo();
        Event4XReporter event4XReporter = this.mDAUReporter;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        event4XReporter.reportDau(i11, i12, str2);
        LiteavLog.m76087i(TAG, String.format(Locale.ENGLISH, "reportDAU devUUID = %s, eventId = %d,  errCode = %d, errInfo = %s", this.mDevUUID, Integer.valueOf(i11), Integer.valueOf(i12), str));
    }

    public static void reportLicenseIsValid() {
        HouseBuilder.EnumC34768d enumC34768dValid = HouseBuilder.getInstance().valid(HouseBuilder.EnumC34765a.UGC_SIMPLE);
        if (enumC34768dValid == HouseBuilder.EnumC34768d.OK) {
            reportDAU(1016);
        } else {
            reportDAU(1017, enumC34768dValid.value, "");
        }
    }
}
