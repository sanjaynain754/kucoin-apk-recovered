package com.tencent.live2;

import android.content.Context;
import com.tencent.live2.impl.C34984a;

/* JADX INFO: loaded from: classes45.dex */
public class V2TXLivePremier {
    public static int callExperimentalAPI(String str) {
        return C34984a.m76793c(str);
    }

    public static void enableAudioCaptureObserver(boolean z11, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        C34984a.m76789a(z11, v2TXLiveAudioFrameObserverFormat);
    }

    public static void enableAudioPlayoutObserver(boolean z11, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        C34984a.m76792b(z11, v2TXLiveAudioFrameObserverFormat);
    }

    public static void enableVoiceEarMonitorObserver(boolean z11) {
        C34984a.m76788a(z11);
    }

    public static String getSDKVersionStr() {
        return C34984a.m76782a();
    }

    public static void setEnvironment(String str) {
        C34984a.m76786a(str);
    }

    public static void setLicence(Context context, String str, String str2) {
        C34984a.m76783a(context, str, str2);
    }

    public static void setLogConfig(V2TXLiveDef.V2TXLiveLogConfig v2TXLiveLogConfig) {
        C34984a.m76784a(v2TXLiveLogConfig);
    }

    public static void setObserver(V2TXLivePremierObserver v2TXLivePremierObserver) {
        C34984a.m76785a(v2TXLivePremierObserver);
    }

    public static void setSocks5Proxy(String str, int i11, String str2, String str3, V2TXLiveDef.V2TXLiveSocks5ProxyConfig v2TXLiveSocks5ProxyConfig) {
        C34984a.m76787a(str, i11, str2, str3, v2TXLiveSocks5ProxyConfig);
    }

    public static void setUserId(String str) {
        C34984a.m76791b(str);
    }

    public static abstract class V2TXLivePremierObserver {
        public void onCaptureAudioFrame(V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
        }

        public void onPlayoutAudioFrame(V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
        }

        public void onVoiceEarMonitorAudioFrame(V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
        }

        public void onLicenceLoaded(int i11, String str) {
        }

        public void onLog(int i11, String str) {
        }
    }
}
