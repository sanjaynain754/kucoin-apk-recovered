package com.geetest.captcha;

import android.content.Context;
import com.geetest.captcha.utils.LogUtils;
import com.geetest.gtc4.GeeGuard;
import com.geetest.gtc4.GeeGuardConfiguration;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.geetest.captcha.c */
/* JADX INFO: loaded from: classes45.dex */
public final class C6660c {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static Map<String, ? extends JSONObject> f11145a;

    /* JADX INFO: renamed from: a */
    public static String m12527a(Context context, String str) {
        try {
            LogUtils.f11200a.m12557e("isGtc4Available");
            Object objNewInstance = GeeGuardConfiguration.Builder.class.newInstance();
            Method method = GeeGuardConfiguration.Builder.class.getMethod("setAppId", String.class);
            if (method != null) {
                method.invoke(objNewInstance, "54847f3301740c85982a1d3d566bd24e");
            }
            Method method2 = GeeGuardConfiguration.Builder.class.getMethod("setExtraInfo", HashMap.class);
            if (method2 != null) {
                method2.invoke(objNewInstance, f11145a);
            }
            Class cls = Boolean.TYPE;
            Method method3 = GeeGuardConfiguration.Builder.class.getMethod("setAlInfo", cls);
            if (method3 != null) {
                method3.invoke(objNewInstance, Boolean.FALSE);
            }
            Method method4 = GeeGuardConfiguration.Builder.class.getMethod("setDevInfo", cls);
            if (method4 != null) {
                method4.invoke(objNewInstance, Boolean.TRUE);
            }
            Method method5 = GeeGuardConfiguration.Builder.class.getMethod("setLevel", Integer.TYPE);
            if (method5 != null) {
                method5.invoke(objNewInstance, 1);
            }
            Method method6 = GeeGuardConfiguration.Builder.class.getMethod("addSignature", String.class);
            if (method6 != null) {
                method6.invoke(objNewInstance, str);
            }
            Method method7 = GeeGuardConfiguration.Builder.class.getMethod("build", new Class[0]);
            Object objInvoke = method7 != null ? method7.invoke(objNewInstance, new Object[0]) : null;
            Method method8 = GeeGuard.class.getMethod("getData", Context.class, GeeGuardConfiguration.class);
            Object objInvoke2 = method8 != null ? method8.invoke(null, context, objInvoke) : null;
            if (objInvoke2 != null) {
                return (String) objInvoke2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception e11) {
            LogUtils.f11200a.m12557e("gtc4 date:" + e11);
            return null;
        }
    }
}
