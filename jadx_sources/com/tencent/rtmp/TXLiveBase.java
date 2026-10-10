package com.tencent.rtmp;

import android.content.Context;
import com.tencent.liteav.LiveSettingJni;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.HttpDnsUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.SoLoader;
import com.tencent.liteav.sdk.common.HouseBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
public class TXLiveBase {
    private static final String TAG = "TXLiveBase";
    private static TXLiveBase instance = new TXLiveBase();
    private static C35196b networkTimeCallback = new C35196b(0);
    private static TXLiveBaseListener sListener;

    /* JADX INFO: renamed from: com.tencent.rtmp.TXLiveBase$a */
    public static class C35195a implements LiteavLog.InterfaceC34734a {
        private C35195a() {
        }

        public /* synthetic */ C35195a(byte b11) {
            this();
        }

        @Override // com.tencent.liteav.base.util.LiteavLog.InterfaceC34734a
        /* JADX INFO: renamed from: a */
        public final void mo76095a(int i11, String str, String str2) {
            TXLiveBaseListener tXLiveBaseListener = TXLiveBase.sListener;
            if (tXLiveBaseListener != null) {
                tXLiveBaseListener.onLog(i11, str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.rtmp.TXLiveBase$b */
    public static class C35196b implements CommonUtil.InterfaceC34729a {
        private C35196b() {
        }

        public /* synthetic */ C35196b(byte b11) {
            this();
        }

        @Override // com.tencent.liteav.base.util.CommonUtil.InterfaceC34729a
        /* JADX INFO: renamed from: a */
        public final void mo76075a(int i11, String str) {
            TXLiveBase.onUpdateNetworkTime(i11, str);
        }
    }

    public static boolean isLibraryPathValid(String str) {
        return false;
    }

    static {
        if (SoLoader.loadAllLibraries()) {
            CommonUtil.setUpdateNetworkTimeCallback(networkTimeCallback);
        }
    }

    public static void enableCustomHttpDNS(boolean z11) {
        if (z11) {
            HttpDnsUtil.enableCustomHttpDNS(true, new HttpDnsUtil.InterfaceC34732a() { // from class: com.tencent.rtmp.TXLiveBase.2
                @Override // com.tencent.liteav.base.util.HttpDnsUtil.InterfaceC34732a
                /* JADX INFO: renamed from: a */
                public final void mo76077a(String str, List<String> list) {
                    if (TXLiveBase.sListener != null) {
                        TXLiveBase.sListener.onCustomHttpDNS(str, list);
                    }
                }
            });
        } else {
            HttpDnsUtil.enableCustomHttpDNS(false, null);
        }
    }

    public static TXLiveBase getInstance() {
        return instance;
    }

    public static String getPituSDKVersion() {
        return "";
    }

    public static void onUpdateNetworkTime(int i11, String str) {
        TXLiveBaseListener tXLiveBaseListener = sListener;
        if (tXLiveBaseListener != null) {
            tXLiveBaseListener.onUpdateNetworkTime(i11, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setListener(TXLiveBaseListener tXLiveBaseListener) {
        LiteavLog.setCallback(new C35195a(0 == true ? 1 : 0));
        LiteavLog.nativeSetLogCallbackEnabled(tXLiveBaseListener != null);
        sListener = tXLiveBaseListener;
    }

    public static void setLogLevel(int i11) {
        LiteavLog.EnumC34735b enumC34735b;
        LiteavLog.EnumC34735b enumC34735b2 = LiteavLog.EnumC34735b.kAll;
        if (i11 == 2) {
            enumC34735b = LiteavLog.EnumC34735b.kInfo;
        } else if (i11 == 3) {
            enumC34735b = LiteavLog.EnumC34735b.kWarning;
        } else if (i11 == 4) {
            enumC34735b = LiteavLog.EnumC34735b.kError;
        } else if (i11 != 5) {
            enumC34735b = i11 != 6 ? LiteavLog.EnumC34735b.kAll : LiteavLog.EnumC34735b.kNone;
        } else {
            enumC34735b = LiteavLog.EnumC34735b.kFatal;
        }
        LiteavLog.nativeSetLogLevel(enumC34735b.mNativeValue);
    }

    private TXLiveBase() {
    }

    public static long getNetworkTimestamp() {
        return CommonUtil.getNetworkTimestamp();
    }

    public static String getSDKVersionStr() {
        return CommonUtil.getSDKVersionStr();
    }

    public static void setAppID(String str) {
        LiveSettingJni.setAppId(str);
    }

    public static void setAppVersion(String str) {
        LiteavLog.m76087i(TAG, "Set app version:".concat(String.valueOf(str)));
        LiveSettingJni.setAppVersion(str);
    }

    public static void setConsoleEnabled(boolean z11) {
        LiteavLog.nativeSetConsoleLogEnabled(z11);
    }

    public static boolean setExtID(String str, String str2) {
        return LiteavSystemInfo.setExtID(str, str2);
    }

    public static int setGlobalEnv(String str) {
        return CommonUtil.setGlobalEnv(str);
    }

    public static boolean setLibraryPath(String str) {
        SoLoader.setLibraryPath(str);
        boolean zLoadAllLibraries = SoLoader.loadAllLibraries();
        if (zLoadAllLibraries) {
            CommonUtil.setUpdateNetworkTimeCallback(networkTimeCallback);
        }
        return zLoadAllLibraries;
    }

    public static void setUserId(String str) {
        LiveSettingJni.setUserId(str);
    }

    public static int updateNetworkTime() {
        return CommonUtil.updateNetworkTime();
    }

    public String getLicenceInfo(Context context) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        return HouseBuilder.getInstance().getHouse(HouseBuilder.EnumC34767c.LIVE);
    }

    public void setLicence(Context context, String str, String str2) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        HouseBuilder.getInstance().setListener(new HouseBuilder.InterfaceC34766b() { // from class: com.tencent.rtmp.TXLiveBase.1
            @Override // com.tencent.liteav.sdk.common.HouseBuilder.InterfaceC34766b
            /* JADX INFO: renamed from: a */
            public final void mo76164a(int i11, String str3) {
                TXLiveBaseListener tXLiveBaseListener = TXLiveBase.sListener;
                if (tXLiveBaseListener != null) {
                    tXLiveBaseListener.onLicenceLoaded(i11, str3);
                }
            }
        });
        HouseBuilder.getInstance().setHouse(HouseBuilder.EnumC34767c.LIVE, str, str2);
    }

    public static void setPituLicencePath(String str) {
    }
}
