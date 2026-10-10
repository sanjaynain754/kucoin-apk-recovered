package com.tencent.live2.impl;

import android.content.Context;
import com.tencent.liteav.LiveSettingJni;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.live.V2TXLivePremierJni;
import com.tencent.liteav.sdk.common.HouseBuilder;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePremier;

/* JADX INFO: renamed from: com.tencent.live2.impl.a */
/* JADX INFO: loaded from: classes45.dex */
public final class C34984a {

    /* JADX INFO: renamed from: a */
    public static final a f74811a = new a();

    /* JADX INFO: renamed from: b */
    private static V2TXLivePremier.V2TXLivePremierObserver f74812b;

    /* JADX INFO: renamed from: com.tencent.live2.impl.a$a */
    public static final class a implements LiteavLog.InterfaceC34734a {

        /* JADX INFO: renamed from: a */
        V2TXLivePremier.V2TXLivePremierObserver f74813a;

        @Override // com.tencent.liteav.base.util.LiteavLog.InterfaceC34734a
        /* JADX INFO: renamed from: a */
        public final void mo76095a(int i11, String str, String str2) {
            V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = this.f74813a;
            if (v2TXLivePremierObserver != null) {
                v2TXLivePremierObserver.onLog(i11, str2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m76782a() {
        return CommonUtil.getSDKVersionStr();
    }

    /* JADX INFO: renamed from: a */
    public static void m76785a(V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver) {
        f74812b = v2TXLivePremierObserver;
        f74811a.f74813a = v2TXLivePremierObserver;
        V2TXLivePremierJni.setObserver(v2TXLivePremierObserver);
    }

    /* JADX INFO: renamed from: b */
    public static void m76792b(boolean z11, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        V2TXLivePremierJni.enableAudioPlayoutObserver(z11, v2TXLiveAudioFrameObserverFormat);
    }

    /* JADX INFO: renamed from: b */
    public static void m76791b(String str) {
        LiveSettingJni.setUserId(str);
    }

    /* JADX INFO: renamed from: c */
    public static int m76793c(String str) {
        return V2TXLivePremierJni.callExperimentalAPI(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m76784a(V2TXLiveDef.V2TXLiveLogConfig v2TXLiveLogConfig) {
        LiteavLog.EnumC34735b enumC34735b;
        if (v2TXLiveLogConfig != null) {
            LiteavLog.nativeSetConsoleLogEnabled(v2TXLiveLogConfig.enableConsole);
            LiteavLog.nativeSetLogToFileEnabled(v2TXLiveLogConfig.enableLogFile);
            String str = v2TXLiveLogConfig.logPath;
            if (str != null) {
                LiteavLog.nativeSetLogFilePath(str);
            }
            int i11 = v2TXLiveLogConfig.logLevel;
            if (i11 == 2) {
                enumC34735b = LiteavLog.EnumC34735b.kInfo;
            } else if (i11 == 3) {
                enumC34735b = LiteavLog.EnumC34735b.kWarning;
            } else if (i11 == 4) {
                enumC34735b = LiteavLog.EnumC34735b.kError;
            } else if (i11 == 5) {
                enumC34735b = LiteavLog.EnumC34735b.kFatal;
            } else if (i11 != 6) {
                enumC34735b = LiteavLog.EnumC34735b.kAll;
            } else {
                enumC34735b = LiteavLog.EnumC34735b.kNone;
            }
            LiteavLog.nativeSetLogLevel(enumC34735b.mNativeValue);
            a aVar = f74811a;
            boolean z11 = v2TXLiveLogConfig.enableObserver;
            if (!z11) {
                aVar = null;
            }
            LiteavLog.setCallback(aVar);
            LiteavLog.nativeSetLogCallbackEnabled(z11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m76786a(String str) {
        CommonUtil.setGlobalEnv(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m76783a(Context context, String str, String str2) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        HouseBuilder.getInstance().setListener(new HouseBuilder.InterfaceC34766b() { // from class: com.tencent.live2.impl.a.1
            @Override // com.tencent.liteav.sdk.common.HouseBuilder.InterfaceC34766b
            /* JADX INFO: renamed from: a */
            public final void mo76164a(int i11, String str3) {
                V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = C34984a.f74812b;
                if (v2TXLivePremierObserver != null) {
                    v2TXLivePremierObserver.onLicenceLoaded(i11, str3);
                }
            }
        });
        HouseBuilder.getInstance().setHouse(HouseBuilder.EnumC34767c.LIVE, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m76787a(String str, int i11, String str2, String str3, V2TXLiveDef.V2TXLiveSocks5ProxyConfig v2TXLiveSocks5ProxyConfig) {
        CommonUtil.setSocks5Proxy(str, i11, str2, str3, v2TXLiveSocks5ProxyConfig.supportHttps, v2TXLiveSocks5ProxyConfig.supportTcp, v2TXLiveSocks5ProxyConfig.supportUdp);
    }

    /* JADX INFO: renamed from: a */
    public static void m76789a(boolean z11, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        V2TXLivePremierJni.enableAudioCaptureObserver(z11, v2TXLiveAudioFrameObserverFormat);
    }

    /* JADX INFO: renamed from: a */
    public static void m76788a(boolean z11) {
        V2TXLivePremierJni.enableVoiceEarMonitorObserver(z11);
    }
}
