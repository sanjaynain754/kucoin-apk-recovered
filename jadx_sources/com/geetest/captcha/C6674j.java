package com.geetest.captcha;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.geetest.captcha.j */
/* JADX INFO: loaded from: classes45.dex */
public final class C6674j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static String f11169a = "加载遇到一点麻烦";

    /* JADX INFO: renamed from: b */
    @NotNull
    public static String f11170b = "网络错误";

    /* JADX INFO: renamed from: c */
    @NotNull
    public static String f11171c = "网络链接超时";

    /* JADX INFO: renamed from: d */
    @NotNull
    public static String f11172d = "证书错误";

    /* JADX INFO: renamed from: e */
    @NotNull
    public static String f11173e = "参数不合法";

    /* JADX INFO: renamed from: f */
    @NotNull
    public static String f11174f = "验证会话已取消";

    /* JADX INFO: renamed from: g */
    @NotNull
    public static String f11175g = "不支持的 WebView 组件";

    /* JADX INFO: renamed from: a */
    public static void m12542a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("gt4_web_callback_error", "name");
        String string = applicationContext.getString(C6689u.m12554a(context, "gt4_web_callback_error", TypedValues.Custom.S_STRING));
        Intrinsics.checkNotNullExpressionValue(string, "context.applicationConte…gt4_web_callback_error\"))");
        f11169a = string;
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("gt4_web_view_load_error", "name");
        String string2 = applicationContext2.getString(C6689u.m12554a(context, "gt4_web_view_load_error", TypedValues.Custom.S_STRING));
        Intrinsics.checkNotNullExpressionValue(string2, "context.applicationConte…t4_web_view_load_error\"))");
        f11170b = string2;
        Context applicationContext3 = context.getApplicationContext();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("gt4_web_view_load_timeout", "name");
        String string3 = applicationContext3.getString(C6689u.m12554a(context, "gt4_web_view_load_timeout", TypedValues.Custom.S_STRING));
        Intrinsics.checkNotNullExpressionValue(string3, "context.applicationConte…_web_view_load_timeout\"))");
        f11171c = string3;
        Context applicationContext4 = context.getApplicationContext();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("gt4_web_view_ssl_error", "name");
        String string4 = applicationContext4.getString(C6689u.m12554a(context, "gt4_web_view_ssl_error", TypedValues.Custom.S_STRING));
        Intrinsics.checkNotNullExpressionValue(string4, "context.applicationConte…gt4_web_view_ssl_error\"))");
        f11172d = string4;
        Context applicationContext5 = context.getApplicationContext();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("gt4_parameter_config_error", "name");
        String string5 = applicationContext5.getString(C6689u.m12554a(context, "gt4_parameter_config_error", TypedValues.Custom.S_STRING));
        Intrinsics.checkNotNullExpressionValue(string5, "context.applicationConte…parameter_config_error\"))");
        f11173e = string5;
        Context applicationContext6 = context.getApplicationContext();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("gt4_user_cancel", "name");
        String string6 = applicationContext6.getString(C6689u.m12554a(context, "gt4_user_cancel", TypedValues.Custom.S_STRING));
        Intrinsics.checkNotNullExpressionValue(string6, "context.applicationConte…text, \"gt4_user_cancel\"))");
        f11174f = string6;
        Context applicationContext7 = context.getApplicationContext();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("gt4_device_not_supported", "name");
        String string7 = applicationContext7.getString(C6689u.m12554a(context, "gt4_device_not_supported", TypedValues.Custom.S_STRING));
        Intrinsics.checkNotNullExpressionValue(string7, "context.applicationConte…4_device_not_supported\"))");
        f11175g = string7;
    }
}
