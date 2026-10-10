package com.tencent.qcloud.tim.push.components;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.qcloud.tim.push.TIMPushConstants;
import com.tencent.qcloud.tim.push.bean.ConfigBean;
import com.tencent.qcloud.tim.push.config.TIMPushConfig;
import com.tencent.qcloud.tim.push.utils.TIMPushLog;
import com.tencent.qcloud.tim.push.utils.TIMPushUtils;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback;
import java.util.HashMap;

/* JADX INFO: loaded from: classes56.dex */
public class TokenRequester {

    /* JADX INFO: renamed from: f */
    public static final String f74915f = "TokenRequester";

    /* JADX INFO: renamed from: a */
    public Handler f74916a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public int f74917b;

    /* JADX INFO: renamed from: c */
    public TUIServiceCallback f74918c;

    /* JADX INFO: renamed from: d */
    public ResultCallBack f74919d;

    /* JADX INFO: renamed from: e */
    public TimeoutThread f74920e;

    public class ResultCallBack extends TUIServiceCallback {

        /* JADX INFO: renamed from: a */
        public int f74921a = 2001;

        /* JADX INFO: renamed from: a */
        public void m76870a() {
            TIMPushLog.m77017e(TokenRequester.f74915f, TIMPushUtils.m77023a(this.f74921a) + " token timeout");
            TokenRequester.this.m76869c();
            Bundle bundle = new Bundle();
            bundle.putInt(TUIConstants.TIMPush.PUSH_BRAND_ID_KEY, this.f74921a);
            if (TokenRequester.this.f74918c != null) {
                TokenRequester.this.f74918c.onServiceCallback(TIMPushConstants.ERR_REGISTER_PUSH_FAILED_TIMEOUT, TIMPushUtils.m77023a(this.f74921a) + " token timeout", bundle);
                TokenRequester.this.f74918c = null;
            }
        }

        public ResultCallBack() {
        }

        @Override // com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback
        public void onServiceCallback(final int i11, final String str, Bundle bundle) {
            TokenRequester.this.f74916a.post(new Runnable() { // from class: com.tencent.qcloud.tim.push.components.TokenRequester.ResultCallBack.1
                @Override // java.lang.Runnable
                public void run() {
                    if (i11 == 0 && TextUtils.isEmpty(str)) {
                        TIMPushLog.m77016d(TokenRequester.f74915f, TIMPushUtils.m77023a(ResultCallBack.this.f74921a) + " token is empty, wait timeout");
                        return;
                    }
                    TokenRequester.this.m76869c();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TUIConstants.TIMPush.PUSH_BRAND_ID_KEY, ResultCallBack.this.f74921a);
                    if (i11 == 0) {
                        TIMPushLog.m77016d(TokenRequester.f74915f, TIMPushUtils.m77023a(ResultCallBack.this.f74921a) + " register success, tokenState = valid");
                        if (TokenRequester.this.f74918c != null) {
                            TokenRequester.this.f74918c.onServiceCallback(0, str, bundle2);
                            TokenRequester.this.f74918c = null;
                            return;
                        }
                        return;
                    }
                    TIMPushLog.m77017e(TokenRequester.f74915f, TIMPushUtils.m77023a(ResultCallBack.this.f74921a) + " register failed, errorCode = " + i11 + ", errorMessage = " + str);
                    if (TokenRequester.this.f74918c != null) {
                        TokenRequester.this.f74918c.onServiceCallback(i11, str, bundle2);
                        TokenRequester.this.f74918c = null;
                    }
                }
            });
        }

        /* JADX INFO: renamed from: a */
        public void m76871a(int i11) {
            this.f74921a = i11;
        }
    }

    public class TimeoutThread extends Thread {

        /* JADX INFO: renamed from: a */
        public volatile boolean f74926a = true;

        /* JADX INFO: renamed from: b */
        public ResultCallBack f74927b;

        /* JADX INFO: renamed from: c */
        public int f74928c;

        /* JADX INFO: renamed from: a */
        public void m76872a() {
            this.f74926a = false;
        }

        public TimeoutThread(int i11, ResultCallBack resultCallBack) {
            this.f74928c = i11;
            this.f74927b = resultCallBack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(this.f74928c);
                TIMPushLog.m77016d(TokenRequester.f74915f, "running =" + this.f74926a);
                if (!this.f74926a || this.f74927b == null) {
                    return;
                }
                TokenRequester.this.f74916a.post(new Runnable() { // from class: com.tencent.qcloud.tim.push.components.TokenRequester.TimeoutThread.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TimeoutThread.this.f74927b.m76870a();
                    }
                });
            } catch (Exception e11) {
                TIMPushLog.m77017e(TokenRequester.f74915f, "timeout exception =" + e11);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m76868b() {
        m76869c();
        this.f74918c = null;
        this.f74917b = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m76869c() {
        this.f74919d = null;
        TimeoutThread timeoutThread = this.f74920e;
        if (timeoutThread != null) {
            timeoutThread.m76872a();
        }
    }

    public TokenRequester(int i11) {
        this.f74917b = i11;
    }

    /* JADX INFO: renamed from: a */
    public final void m76865a(int i11, String str) {
        m76869c();
        TUIServiceCallback tUIServiceCallback = this.f74918c;
        if (tUIServiceCallback != null) {
            tUIServiceCallback.onServiceCallback(i11, str, null);
            this.f74918c = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m76867a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return false;
        }
        TIMPushLog.m77017e(f74915f, "param missing before call push service, channel = " + TIMPushUtils.m77023a(this.f74917b) + ", reason = " + str2);
        m76865a(TIMPushConstants.ERR_SET_PUSH_CONFIG_FAILED, str2);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m76866a(Context context, int i11, int i12, TUIServiceCallback tUIServiceCallback) {
        this.f74917b = i11;
        this.f74918c = tUIServiceCallback;
        String str = f74915f;
        TIMPushLog.m77016d(str, "requestPushToken start, channel = " + TIMPushUtils.m77023a(i11));
        if (context == null) {
            TIMPushLog.m77017e(str, "requestPushToken context is null");
            m76865a(TIMPushConstants.ERR_INVALID_PARAM, "Context is null");
            return;
        }
        ConfigBean registerConfigBean = TIMPushConfig.getInstance().getRegisterConfigBean();
        if (registerConfigBean == null) {
            TIMPushLog.m77017e(str, "registerPushBean is null");
            m76865a(TIMPushConstants.ERR_SET_PUSH_CONFIG_FAILED, "Push config missing");
            return;
        }
        HashMap map = new HashMap();
        map.put("context", context);
        ResultCallBack resultCallBack = new ResultCallBack();
        this.f74919d = resultCallBack;
        resultCallBack.m76871a(this.f74917b);
        try {
            switch (i11) {
                case 2000:
                    if (!m76867a(registerConfigBean.getXiaomiPushAppId(), "Xiaomi appId or appKey missing") && !m76867a(registerConfigBean.getXiaomiPushAppKey(), "Xiaomi appId or appKey missing")) {
                        map.put(TUIConstants.TIMPush.XiaoMi.XIAOMI_APPID, registerConfigBean.getXiaomiPushAppId());
                        map.put(TUIConstants.TIMPush.XiaoMi.XIAOMI_APPKEY, registerConfigBean.getXiaomiPushAppKey());
                        TIMPushLog.m77016d(str, "call Xiaomi push service");
                        TUICore.callService(TUIConstants.TIMPush.XiaoMi.XIAOMI_SERVICE_NAME, TUIConstants.TIMPush.XiaoMi.METHOD_REGISTER_XIAOMI_PUSH, map, this.f74919d);
                        break;
                    }
                    return;
                case 2001:
                    TIMPushLog.m77016d(str, "call Huawei push service");
                    TUICore.callService(TUIConstants.TIMPush.HuaWei.HUAWEI_SERVICE_NAME, TUIConstants.TIMPush.HuaWei.METHOD_REGISTER_HUAWEI_PUSH, map, this.f74919d);
                    break;
                case 2002:
                default:
                    this.f74917b = 2002;
                    this.f74919d.m76871a(2002);
                    map.put(TUIConstants.TIMPush.FCM.ENABLE_FCM_PRIVATE_RING, Boolean.valueOf(TIMPushConfig.getInstance().getEnableFCMPrivateRing()));
                    map.put(TUIConstants.TIMPush.FCM.FCM_CHANNEL_ID, registerConfigBean.getFcmPushChannelId());
                    map.put(TUIConstants.TIMPush.FCM.FCM_CHANNEL_SOUND_NAME, registerConfigBean.getFcmPushChannelSoundName());
                    TIMPushLog.m77016d(str, "call FCM push service");
                    TUICore.callService(TUIConstants.TIMPush.FCM.FCM_SERVICE_NAME, TUIConstants.TIMPush.FCM.METHOD_REGISTER_FCM_PUSH, map, this.f74919d);
                    break;
                case 2003:
                    if (!m76867a(registerConfigBean.getMeizuPushAppId(), "Meizu appId or appKey missing") && !m76867a(registerConfigBean.getMeizuPushAppKey(), "Meizu appId or appKey missing")) {
                        map.put(TUIConstants.TIMPush.MeiZu.MEIZU_APPID, registerConfigBean.getMeizuPushAppId());
                        map.put(TUIConstants.TIMPush.MeiZu.MEIZU_APPKEY, registerConfigBean.getMeizuPushAppKey());
                        TIMPushLog.m77016d(str, "call Meizu push service");
                        TUICore.callService(TUIConstants.TIMPush.MeiZu.MEIZU_SERVICE_NAME, TUIConstants.TIMPush.MeiZu.METHOD_REGISTER_MEIZU_PUSH, map, this.f74919d);
                        break;
                    }
                    return;
                case 2004:
                    if (!m76867a(registerConfigBean.getOppoPushAppKey(), "OPPO appKey or appSecret missing") && !m76867a(registerConfigBean.getOppoPushAppSecret(), "OPPO appKey or appSecret missing")) {
                        map.put(TUIConstants.TIMPush.OPPO.OPPO_APPKEY, registerConfigBean.getOppoPushAppKey());
                        map.put(TUIConstants.TIMPush.OPPO.OPPO_APPSECRET, registerConfigBean.getOppoPushAppSecret());
                        TIMPushLog.m77016d(str, "call OPPO push service");
                        TUICore.callService(TUIConstants.TIMPush.OPPO.OPPO_SERVICE_NAME, TUIConstants.TIMPush.OPPO.METHOD_REGISTER_OPPO_PUSH, map, this.f74919d);
                        break;
                    }
                    return;
                case 2005:
                    TIMPushLog.m77016d(str, "call vivo push service");
                    TUICore.callService(TUIConstants.TIMPush.VIVO.VIVO_SERVICE_NAME, TUIConstants.TIMPush.VIVO.METHOD_REGISTER_VIVO_PUSH, map, this.f74919d);
                    break;
                case 2006:
                    TIMPushLog.m77016d(str, "call Honor push service");
                    TUICore.callService(TUIConstants.TIMPush.Honor.HONOR_SERVICE_NAME, TUIConstants.TIMPush.Honor.METHOD_REGISTER_HONOR_PUSH, map, this.f74919d);
                    break;
            }
            TimeoutThread timeoutThread = new TimeoutThread(i12, this.f74919d);
            this.f74920e = timeoutThread;
            timeoutThread.start();
        } catch (Exception e11) {
            TIMPushLog.m77017e(f74915f, TIMPushUtils.m77023a(this.f74917b) + " call push service exception = " + e11);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(TIMPushUtils.m77023a(this.f74917b));
            sb2.append(" service call failed");
            m76865a(TIMPushConstants.ERR_REGISTER_PUSH_CONNECT_FAILED, sb2.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public int m76863a() {
        return this.f74917b;
    }

    /* JADX INFO: renamed from: a */
    public void m76864a(int i11) {
        this.f74917b = i11;
    }
}
