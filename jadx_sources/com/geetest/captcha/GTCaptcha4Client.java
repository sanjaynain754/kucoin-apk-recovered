package com.geetest.captcha;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Pair;
import com.geetest.captcha.utils.LogUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.otc.entity.OtcAd;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes45.dex */
public final class GTCaptcha4Client implements NoProguard {

    /* JADX INFO: renamed from: a */
    public final C6680m f11107a;

    public interface OnDialogShowListener extends NoProguard {
        void actionAfterDialogShow(Dialog dialog);

        void actionBeforeDialogShow(Dialog dialog);

        void onDialogFocusChanged(Dialog dialog, boolean z11);
    }

    public interface OnFailureListener extends NoProguard {
        void onFailure(String str);
    }

    public interface OnSuccessListener extends NoProguard {
        void onSuccess(boolean z11, String str);
    }

    public interface OnWebViewShowListener extends NoProguard {
        void onWebViewShow();
    }

    public GTCaptcha4Client init(String str) {
        this.f11107a.m12546a(str, null);
        return this;
    }

    public static GTCaptcha4Client getClient(Context context) {
        return new GTCaptcha4Client(context);
    }

    public static String getVersion() {
        return "1.8.9";
    }

    public GTCaptcha4Client addOnFailureListener(OnFailureListener listener) {
        C6680m c6680m = this.f11107a;
        c6680m.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        c6680m.f11190c = listener;
        return this;
    }

    public GTCaptcha4Client addOnSuccessListener(OnSuccessListener response) {
        C6680m c6680m = this.f11107a;
        c6680m.getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        c6680m.f11189b = response;
        return this;
    }

    public GTCaptcha4Client addOnWebViewShowListener(OnWebViewShowListener webViewShowListener) {
        C6680m c6680m = this.f11107a;
        c6680m.getClass();
        Intrinsics.checkNotNullParameter(webViewShowListener, "webViewShowListener");
        c6680m.f11191d = webViewShowListener;
        return this;
    }

    public void cancel() throws JSONException {
        C6680m c6680m = this.f11107a;
        c6680m.getClass();
        if (System.currentTimeMillis() - C6680m.f11187e < 1000) {
            LogUtils.f11200a.release("The interval between the two cancel is at least 1 second.");
            return;
        }
        C6658b c6658b = c6680m.f11188a;
        C6704x c6704x = c6658b.f11140g;
        C6704x c6704x2 = null;
        if (c6704x == null) {
            Intrinsics.throwUninitializedPropertyAccessException("request");
            c6704x = null;
        }
        if (c6704x.m12591a()) {
            return;
        }
        C6704x c6704x3 = c6658b.f11140g;
        if (c6704x3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("request");
            c6704x3 = null;
        }
        c6704x3.m12588a(EnumC6657a0.FAIL);
        String type = EnumC6657a0.CANCEL.getType();
        String code = EnumC6672i.USER_ERROR.getType() + OtcAd.TRADE_TIME_SIXTY;
        Intrinsics.checkNotNullParameter(code, "code");
        String code2 = type + code;
        String msg = C6674j.f11174f;
        JSONObject desc = new JSONObject();
        desc.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "User cancelled 'Captcha'");
        Unit unit = Unit.INSTANCE;
        Intrinsics.checkNotNullParameter(code2, "code");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(desc, "desc");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", code2);
            jSONObject.put("msg", msg);
            jSONObject.put("desc", desc);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        LogUtils.f11200a.release("Controller: " + string);
        C6704x c6704x4 = c6658b.f11140g;
        if (c6704x4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("request");
            c6704x4 = null;
        }
        C6664e c6664e = c6704x4.f11245e;
        if (c6664e != null) {
            c6664e.m12536a();
        }
        c6704x4.f11245e = null;
        C6704x c6704x5 = c6658b.f11140g;
        if (c6704x5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("request");
        } else {
            c6704x2 = c6704x5;
        }
        c6704x2.m12589a(string);
    }

    public void configurationChanged(Configuration newConfig) {
        DialogC6678l dialogC6678l;
        C6680m c6680m = this.f11107a;
        c6680m.getClass();
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        C6658b c6658b = c6680m.f11188a;
        c6658b.getClass();
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        try {
            C6704x c6704x = c6658b.f11140g;
            if (c6704x == null) {
                Intrinsics.throwUninitializedPropertyAccessException("request");
                c6704x = null;
            }
            C6664e c6664e = c6704x.f11245e;
            if (c6664e == null || (dialogC6678l = c6664e.f11159a) == null) {
                return;
            }
            dialogC6678l.m12545a();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void destroy() {
        this.f11107a.getClass();
        LogUtils.f11200a.destroy();
    }

    public GTCaptcha4Client init(String str, GTCaptcha4Config gTCaptcha4Config) {
        this.f11107a.m12546a(str, gTCaptcha4Config);
        return this;
    }

    public void setLogEnable(boolean z11) {
        this.f11107a.getClass();
        LogUtils.f11200a.setReleaseLog(z11);
    }

    public GTCaptcha4Client verifyWithCaptcha() throws JSONException {
        C6680m c6680m = this.f11107a;
        c6680m.getClass();
        if (System.currentTimeMillis() - C6680m.f11187e < 1000) {
            LogUtils.f11200a.release("The interval between the two captcha is at least 1 second.");
            return this;
        }
        C6680m.f11187e = System.currentTimeMillis();
        C6658b c6658b = c6680m.f11188a;
        OnSuccessListener onSuccessListener = c6680m.f11189b;
        c6658b.f11136c = onSuccessListener;
        OnFailureListener onFailureListener = c6680m.f11190c;
        c6658b.f11137d = onFailureListener;
        c6658b.f11138e = c6680m.f11191d;
        Context context = c6658b.f11134a;
        if (onFailureListener == null) {
            throw new IllegalArgumentException("The OnFailureListener object cannot be null.");
        }
        if (onSuccessListener == null) {
            String code = EnumC6657a0.FLOWING.getType() + EnumC6672i.PARAM.getType() + "70";
            String msg = C6674j.f11173e;
            JSONObject desc = new JSONObject();
            desc.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "The GTC4SessionResponse object cannot be null");
            Unit unit = Unit.INSTANCE;
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(msg, "msg");
            Intrinsics.checkNotNullParameter(desc, "desc");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", code);
                jSONObject.put("msg", msg);
                jSONObject.put("desc", desc);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
            LogUtils.f11200a.release(string);
            OnFailureListener onFailureListener2 = c6658b.f11137d;
            if (onFailureListener2 != null) {
                onFailureListener2.onFailure(string);
            }
        } else if (context == null) {
            String code2 = EnumC6657a0.FLOWING.getType() + EnumC6672i.PARAM.getType() + "71";
            String msg2 = C6674j.f11173e;
            JSONObject desc2 = new JSONObject();
            desc2.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "The context parameter should not be null");
            Unit unit2 = Unit.INSTANCE;
            Intrinsics.checkNotNullParameter(code2, "code");
            Intrinsics.checkNotNullParameter(msg2, "msg");
            Intrinsics.checkNotNullParameter(desc2, "desc");
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("code", code2);
                jSONObject2.put("msg", msg2);
                jSONObject2.put("desc", desc2);
            } catch (JSONException e12) {
                e12.printStackTrace();
            }
            String string2 = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.toString()");
            LogUtils.f11200a.release(string2);
            OnFailureListener onFailureListener3 = c6658b.f11137d;
            if (onFailureListener3 != null) {
                onFailureListener3.onFailure(string2);
            }
        } else if (context instanceof Activity) {
            String str = c6658b.f11135b;
            C6704x c6704x = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException(RemoteConfigConstants.RequestFieldKey.APP_ID);
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C6704x c6704x2 = c6658b.f11140g;
                if (c6704x2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("request");
                    c6704x2 = null;
                }
                EnumC6657a0.a aVar = c6704x2.f11243c;
                EnumC6657a0.a aVar2 = EnumC6657a0.a.NONE;
                if (aVar != aVar2) {
                    C6704x c6704x3 = c6658b.f11140g;
                    if (c6704x3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("request");
                        c6704x3 = null;
                    }
                    if (c6704x3.f11244d == EnumC6657a0.NONE) {
                        C6704x c6704x4 = c6658b.f11140g;
                        if (c6704x4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("request");
                            c6704x4 = null;
                        }
                        c6704x4.m12588a(EnumC6657a0.FLOWING);
                        C6704x c6704x5 = c6658b.f11140g;
                        if (c6704x5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("request");
                            c6704x5 = null;
                        }
                        c6704x5.f11246f = c6658b.f11136c;
                        C6704x c6704x6 = c6658b.f11140g;
                        if (c6704x6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("request");
                            c6704x6 = null;
                        }
                        c6704x6.f11247g = c6658b.f11137d;
                        C6704x c6704x7 = c6658b.f11140g;
                        if (c6704x7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("request");
                            c6704x7 = null;
                        }
                        c6704x7.f11248h = c6658b.f11138e;
                        C6659b0 c6659b0 = c6658b.f11142i;
                        if (c6659b0 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("webViewHandler");
                            c6659b0 = null;
                        }
                        C6704x c6704x8 = c6658b.f11140g;
                        if (c6704x8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("request");
                        } else {
                            c6704x = c6704x8;
                        }
                        c6659b0.m12551b(c6704x);
                        return this;
                    }
                }
                c6658b.f11142i = new C6659b0();
                Context context2 = c6658b.f11134a;
                String captchaId = c6658b.f11135b;
                if (captchaId == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(RemoteConfigConstants.RequestFieldKey.APP_ID);
                    captchaId = null;
                }
                GTCaptcha4Config gTCaptcha4Config = c6658b.f11139f;
                Intrinsics.checkNotNullParameter(captchaId, "captchaId");
                C6662d c6662d = new C6662d();
                c6662d.f11147a = captchaId;
                if (gTCaptcha4Config != null) {
                    c6662d.f11149c = gTCaptcha4Config.isDebug();
                    String html = gTCaptcha4Config.getHtml();
                    Intrinsics.checkNotNullExpressionValue(html, "it.html");
                    c6662d.f11148b = html;
                    c6662d.f11150d = gTCaptcha4Config.getLanguage();
                    c6662d.f11151e = gTCaptcha4Config.getApiServers();
                    c6662d.f11152f = gTCaptcha4Config.getStaticServers();
                    c6662d.f11154h = gTCaptcha4Config.isCanceledOnTouchOutside();
                    c6662d.f11155i = gTCaptcha4Config.isGTC4ViewHidden();
                    c6662d.f11153g = gTCaptcha4Config.getParams();
                    c6662d.f11156j = gTCaptcha4Config.getTimeOut();
                    c6662d.f11157k = gTCaptcha4Config.getBackgroundColor();
                    c6662d.f11158l = gTCaptcha4Config.getDialogStyle();
                }
                if (StringsKt.isBlank(c6662d.f11148b)) {
                    c6662d.f11148b = "file:///android_asset/gt4-index.html";
                }
                C6704x c6704x9 = new C6704x(context2, c6662d);
                c6658b.f11140g = c6704x9;
                c6704x9.m12587a(aVar2);
                C6704x c6704x10 = c6658b.f11140g;
                if (c6704x10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("request");
                    c6704x10 = null;
                }
                c6704x10.m12588a(EnumC6657a0.FLOWING);
                C6704x c6704x11 = c6658b.f11140g;
                if (c6704x11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("request");
                    c6704x11 = null;
                }
                GTCaptcha4Config gTCaptcha4Config2 = c6658b.f11139f;
                c6704x11.f11245e = new C6664e(gTCaptcha4Config2 != null ? gTCaptcha4Config2.getDialogShowListener() : null);
                C6704x c6704x12 = c6658b.f11140g;
                if (c6704x12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("request");
                    c6704x12 = null;
                }
                c6704x12.f11246f = c6658b.f11136c;
                C6704x c6704x13 = c6658b.f11140g;
                if (c6704x13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("request");
                    c6704x13 = null;
                }
                c6704x13.f11247g = c6658b.f11137d;
                C6704x c6704x14 = c6658b.f11140g;
                if (c6704x14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("request");
                    c6704x14 = null;
                }
                c6704x14.f11248h = c6658b.f11138e;
                C6659b0 c6659b1 = c6658b.f11142i;
                if (c6659b1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webViewHandler");
                    c6659b1 = null;
                }
                C6704x c6704x15 = c6658b.f11140g;
                if (c6704x15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("request");
                } else {
                    c6704x = c6704x15;
                }
                c6659b1.m12551b(c6704x);
                return this;
            }
            String code3 = EnumC6657a0.FLOWING.getType() + EnumC6672i.PARAM.getType() + "74";
            String msg3 = C6674j.f11173e;
            JSONObject desc3 = new JSONObject();
            desc3.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "The 'AppId' parameter should not be null");
            Unit unit3 = Unit.INSTANCE;
            Intrinsics.checkNotNullParameter(code3, "code");
            Intrinsics.checkNotNullParameter(msg3, "msg");
            Intrinsics.checkNotNullParameter(desc3, "desc");
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("code", code3);
                jSONObject3.put("msg", msg3);
                jSONObject3.put("desc", desc3);
            } catch (JSONException e13) {
                e13.printStackTrace();
            }
            String string3 = jSONObject3.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.toString()");
            LogUtils.f11200a.release(string3);
            OnFailureListener onFailureListener4 = c6658b.f11137d;
            if (onFailureListener4 != null) {
                onFailureListener4.onFailure(string3);
            }
        } else {
            String code4 = EnumC6657a0.FLOWING.getType() + EnumC6672i.PARAM.getType() + "72";
            String msg4 = C6674j.f11173e;
            JSONObject desc4 = new JSONObject();
            desc4.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "The context must be an 'Activity' object");
            Unit unit4 = Unit.INSTANCE;
            Intrinsics.checkNotNullParameter(code4, "code");
            Intrinsics.checkNotNullParameter(msg4, "msg");
            Intrinsics.checkNotNullParameter(desc4, "desc");
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("code", code4);
                jSONObject4.put("msg", msg4);
                jSONObject4.put("desc", desc4);
            } catch (JSONException e14) {
                e14.printStackTrace();
            }
            String string4 = jSONObject4.toString();
            Intrinsics.checkNotNullExpressionValue(string4, "jsonObject.toString()");
            LogUtils.f11200a.release(string4);
            OnFailureListener onFailureListener5 = c6658b.f11137d;
            if (onFailureListener5 != null) {
                onFailureListener5.onFailure(string4);
            }
        }
        return this;
    }

    private GTCaptcha4Client(Context context) {
        this.f11107a = new C6680m(context);
    }

    public static Pair<Boolean, String> isSupportWebView(Context context) {
        return C6680m.b.m12547a(context);
    }
}
