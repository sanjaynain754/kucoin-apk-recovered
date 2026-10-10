package com.tencent.qcloud.tim.push.utils;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.messaging.FirebaseMessaging;
import com.tencent.qcloud.tim.push.TIMPushCallback;
import com.tencent.qcloud.tim.push.TIMPushConstants;
import com.tencent.qcloud.tim.push.bean.ConfigBean;
import com.tencent.qcloud.tim.push.config.TIMPushConfig;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.permission.PermissionRequester;
import com.tencent.qcloud.tuicore.util.TUIBuild;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes56.dex */
public class TIMPushUtils {

    /* JADX INFO: renamed from: a */
    public static final String f75163a = "TIMPushUtils";

    /* JADX INFO: renamed from: b */
    public static int f75164b;

    /* JADX INFO: renamed from: c */
    public static String f75165c;

    /* JADX INFO: renamed from: d */
    public static String f75166d;

    /* JADX INFO: renamed from: a */
    public static String m77023a(int i11) {
        switch (i11) {
            case 2000:
                return "Xiaomi";
            case 2001:
                return "Huawei";
            case 2002:
                return FirebaseMessaging.INSTANCE_ID_SCOPE;
            case 2003:
                return "Meizu";
            case 2004:
                return "OPPO";
            case 2005:
                return "VIVO";
            case 2006:
                return "Honor";
            default:
                return "Unknown(" + i11 + ")";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m77029b(int i11) {
        if (i11 == 1) {
            return "specified";
        }
        if (i11 == 2) {
            return "built-in";
        }
        if (i11 != 3) {
            return i11 != 4 ? "unknown" : "fallback-fcm";
        }
        return "detected";
    }

    /* JADX INFO: renamed from: g */
    public static String m77034g() {
        String str = m77028b() + "_" + m77022a() + "_" + m77030c() + "_" + TIMPushConfig.getInstance().getPushChannelId();
        String strM77037j = m77037j();
        if (TextUtils.isEmpty(strM77037j)) {
            return str;
        }
        return str + "_" + strM77037j;
    }

    /* JADX INFO: renamed from: h */
    public static String m77035h() {
        String str = m77028b() + "|" + m77022a() + "|" + m77031d();
        String strM77037j = m77037j();
        if (!TextUtils.isEmpty(strM77037j)) {
            str = str + "|" + strM77037j;
        }
        return str + "|9.0.7667";
    }

    /* JADX INFO: renamed from: i */
    public static int m77036i() {
        int i11 = f75164b;
        if (i11 != 0) {
            return i11;
        }
        f75164b = 2002;
        if (m77048u()) {
            f75164b = 2000;
        } else if (m77042o()) {
            f75164b = 2006;
        } else if (m77043p()) {
            f75164b = 2001;
        } else if (m77044q()) {
            f75164b = 2003;
        } else if (m77046s()) {
            f75164b = 2004;
        } else if (m77047t()) {
            f75164b = 2005;
        }
        return f75164b;
    }

    /* JADX INFO: renamed from: j */
    public static String m77037j() {
        String str = f75165c;
        if (str != null) {
            return str;
        }
        try {
            f75165c = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "ro.build.version.emui");
        } catch (Exception unused) {
            f75165c = "";
        }
        return f75165c;
    }

    /* JADX INFO: renamed from: k */
    public static String m77038k() {
        if (!TextUtils.isEmpty(f75166d)) {
            return f75166d;
        }
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (TextUtils.isEmpty(language)) {
            language = "null";
        }
        if (TextUtils.isEmpty(country)) {
            country = "null";
        }
        String script = locale.getScript();
        return language + "_" + country + "_" + (TextUtils.isEmpty(script) ? "null" : script);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m77040m() {
        return PermissionRequester.newInstance(PermissionRequester.BG_START_PERMISSION).has();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m77041n() {
        return PermissionRequester.newInstance(PermissionRequester.FLOAT_PERMISSION).has();
    }

    /* JADX INFO: renamed from: r */
    public static boolean m77045r() {
        try {
            Object objCallService = TUICore.callService(TUIConstants.TIMPush.MeiZu.MEIZU_SERVICE_NAME, TUIConstants.TIMPush.MeiZu.METHOD_IS_MEIZU_DEVICE, null);
            if (objCallService instanceof Boolean) {
                return ((Boolean) objCallService).booleanValue();
            }
            return false;
        } catch (Throwable th2) {
            Log.i(f75163a, "throwable: " + th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m77030c() {
        return TUIBuild.getModel();
    }

    /* JADX INFO: renamed from: d */
    public static String m77031d() {
        return TUIBuild.getVersion();
    }

    /* JADX INFO: renamed from: e */
    public static int m77032e() {
        return TUIBuild.getVersionInt();
    }

    /* JADX INFO: renamed from: f */
    public static long m77033f() {
        ConfigBean registerConfigBean = TIMPushConfig.getInstance().getRegisterConfigBean();
        int pushChannelId = TIMPushConfig.getInstance().getPushChannelId();
        try {
            switch (pushChannelId) {
                case 2000:
                    return Long.parseLong(registerConfigBean.getXiaomiPushBussinessId());
                case 2001:
                    return Long.parseLong(registerConfigBean.getHuaweiPushBussinessId());
                case 2002:
                default:
                    return Long.parseLong(registerConfigBean.getFcmPushBussinessId());
                case 2003:
                    return Long.parseLong(registerConfigBean.getMeizuPushBussinessId());
                case 2004:
                    return Long.parseLong(registerConfigBean.getOppoPushBussinessId());
                case 2005:
                    return Long.parseLong(registerConfigBean.getVivoPushBussinessId());
                case 2006:
                    return Long.parseLong(registerConfigBean.getHonorPushBussinessId());
            }
        } catch (Exception e11) {
            TIMPushLog.m77017e(f75163a, "getCurrentBussinessId deviceBrand = " + pushChannelId + ",e = " + e11);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m77039l() {
        return TUIBuild.getVersion();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m77042o() {
        if (JPushConstants.Manufacturer.HONOR.equalsIgnoreCase(m77022a()) && JPushConstants.Manufacturer.HONOR.equalsIgnoreCase(m77028b())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m77043p() {
        if (!JPushConstants.Manufacturer.HUAWEI.equalsIgnoreCase(m77022a()) && !JPushConstants.Manufacturer.HUAWEI.equalsIgnoreCase(m77028b()) && !JPushConstants.Manufacturer.HONOR.equalsIgnoreCase(m77022a()) && !m77049v()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m77044q() {
        if (!JPushConstants.Manufacturer.MEIZU.equalsIgnoreCase(m77022a()) && !JPushConstants.Manufacturer.MEIZU.equalsIgnoreCase(m77028b()) && !"22c4185e".equalsIgnoreCase(m77022a()) && !m77045r()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m77046s() {
        if (!JPushConstants.Manufacturer.OPPO.equalsIgnoreCase(m77022a()) && !JPushConstants.Manufacturer.REALME.equalsIgnoreCase(m77022a()) && !JPushConstants.Manufacturer.ONEPLUS.equalsIgnoreCase(m77022a()) && !JPushConstants.Manufacturer.OPPO.equalsIgnoreCase(m77028b()) && !JPushConstants.Manufacturer.REALME.equalsIgnoreCase(m77028b()) && !JPushConstants.Manufacturer.ONEPLUS.equalsIgnoreCase(m77028b())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m77047t() {
        if (!JPushConstants.Manufacturer.VIVO.equalsIgnoreCase(m77022a()) && !JPushConstants.Manufacturer.VIVO.equalsIgnoreCase(m77028b()) && !"iQOO".equalsIgnoreCase(m77022a()) && !"iQOO".equalsIgnoreCase(m77028b())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m77048u() {
        if (!JPushConstants.Manufacturer.XIAOMI.equalsIgnoreCase(m77022a()) && !JPushConstants.Manufacturer.XIAOMI.equalsIgnoreCase(m77028b()) && !"Redmi".equalsIgnoreCase(m77022a()) && !"Redmi".equalsIgnoreCase(m77028b())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m77049v() {
        String strM77037j = m77037j();
        if (TextUtils.isEmpty(strM77037j)) {
            return false;
        }
        String lowerCase = strM77037j.toLowerCase();
        if (!lowerCase.contains("emotionui") && !lowerCase.contains("harmony")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static String m77028b() {
        return TUIBuild.getManufacturer();
    }

    /* JADX INFO: renamed from: a */
    public static String m77022a() {
        return TUIBuild.getBrand();
    }

    /* JADX INFO: renamed from: a */
    public static int m77021a(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((NotificationManager) context.getSystemService("notification")).areNotificationsEnabled() ? 1 : 2;
        }
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i11 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.getClass();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i11), packageName)).intValue() == 0 ? 1 : 2;
        } catch (Exception e11) {
            e11.printStackTrace();
            TIMPushLog.m77017e(f75163a, "isNotificationEnabled e = " + e11);
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m77024a(Context context, int i11, TIMPushCallback tIMPushCallback) {
        String honorBadgeClassName;
        ConfigBean registerConfigBean = TIMPushConfig.getInstance().getRegisterConfigBean();
        if (TIMPushConfig.getInstance().getPushChannelId() == 2001) {
            honorBadgeClassName = registerConfigBean.getHuaweiBadgeClassName();
        } else if (TIMPushConfig.getInstance().getPushChannelId() == 2006) {
            honorBadgeClassName = registerConfigBean.getHonorBadgeClassName();
        } else {
            m77025a(tIMPushCallback, TIMPushConstants.ERR_INVALID_PARAM, "not support", null);
            return;
        }
        if (TextUtils.isEmpty(honorBadgeClassName)) {
            m77025a(tIMPushCallback, TIMPushConstants.ERR_INVALID_PARAM, "badge classname not set", null);
            return;
        }
        TIMPushLog.m77016d(f75163a, "badge number = " + i11);
        try {
            Bundle bundle = new Bundle();
            bundle.putString(TPDownloadProxyEnum.DLPARAM_PACKAGE, context.getPackageName());
            bundle.putString("class", honorBadgeClassName);
            bundle.putInt("badgenumber", i11);
            context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
        } catch (Exception e11) {
            TIMPushLog.m77020w(f75163a, "update badge exception: " + e11.getLocalizedMessage());
        }
        m77026a(tIMPushCallback, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m77027a(String str) {
        f75166d = str;
    }

    /* JADX INFO: renamed from: a */
    public static <T> void m77026a(TIMPushCallback<T> tIMPushCallback, T t11) {
        if (tIMPushCallback != null) {
            tIMPushCallback.onSuccess(t11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> void m77025a(TIMPushCallback<T> tIMPushCallback, int i11, String str, T t11) {
        if (tIMPushCallback != null) {
            tIMPushCallback.onError(i11, str, t11);
        }
    }
}
