package androidx.core.text;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
public final class ICUCompat {
    private static final String TAG = "ICUCompat";
    private static Method sAddLikelySubtagsMethod;
    private static Method sGetScriptMethod;

    @RequiresApi(24)
    public static class Api24Impl {
        public static ULocale addLikelySubtags(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        public static String getScript(Object obj) {
            return ((ULocale) obj).getScript();
        }

        private Api24Impl() {
        }

        public static ULocale forLocale(Locale locale) {
            return ULocale.forLocale(locale);
        }
    }

    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static String getScript(Locale locale) {
            return locale.getScript();
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String addLikelySubtagsBelowApi21(Locale locale) {
        String string = locale.toString();
        try {
            Method method = sAddLikelySubtagsMethod;
            if (method != null) {
                return (String) method.invoke(null, string);
            }
        } catch (IllegalAccessException e11) {
            Log.w(TAG, e11);
        } catch (InvocationTargetException e12) {
            Log.w(TAG, e12);
        }
        return string;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String getScriptBelowApi21(String str) {
        try {
            Method method = sGetScriptMethod;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e11) {
            Log.w(TAG, e11);
        } catch (InvocationTargetException e12) {
            Log.w(TAG, e12);
        }
        return null;
    }

    private ICUCompat() {
    }

    @Nullable
    public static String maximizeAndGetScript(@NonNull Locale locale) {
        return Api24Impl.getScript(Api24Impl.addLikelySubtags(Api24Impl.forLocale(locale)));
    }
}
