package com.blankj.utilcode.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: renamed from: com.blankj.utilcode.util.t */
/* JADX INFO: compiled from: LanguageUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class C5296t {
    /* JADX INFO: renamed from: a */
    public static void m6400a(@NonNull Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        String strM6175c = C5299u0.m6500w().m6175c("KEY_LOCALE");
        if (TextUtils.isEmpty(strM6175c)) {
            return;
        }
        if ("VALUE_FOLLOW_SYSTEM".equals(strM6175c)) {
            Locale locale = Resources.getSystem().getConfiguration().locale;
            m6403d(C5287o0.m6331a(), locale);
            m6403d(activity, locale);
        } else {
            Locale localeM6402c = m6402c(strM6175c);
            if (localeM6402c == null) {
                return;
            }
            m6403d(C5287o0.m6331a(), localeM6402c);
            m6403d(activity, localeM6402c);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Locale m6402c(String str) {
        String[] strArrSplit = str.split("\\$");
        if (strArrSplit.length == 2) {
            return new Locale(strArrSplit[0], strArrSplit[1]);
        }
        Log.e("LanguageUtils", "The string of " + str + " is not in the correct format.");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6401b(Locale locale, Locale locale2) {
        if (C5299u0.m6485h(locale2.getLanguage(), locale.getLanguage()) && C5299u0.m6485h(locale2.getCountry(), locale.getCountry())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m6403d(Context context, Locale locale) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        if (m6401b(configuration.locale, locale)) {
            return;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration.setLocale(locale);
        if (context instanceof Application) {
            Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
            try {
                Field declaredField = ContextWrapper.class.getDeclaredField("mBase");
                declaredField.setAccessible(true);
                declaredField.set(context, contextCreateConfigurationContext);
            } catch (Exception unused) {
            }
        }
        resources.updateConfiguration(configuration, displayMetrics);
    }
}
