package com.tencent.qcloud.tuicore;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.util.SPUtils;
import com.tencent.qcloud.tuicore.util.TUIBuild;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public class TUIThemeManager {
    public static final String LANGUAGE_AR = "ar";
    public static final String LANGUAGE_EN = "en";
    public static final String LANGUAGE_ZH_CN = "zh";
    public static final String LANGUAGE_ZH_HK = "zh-traditional";
    private static final String SP_KEY_ENABLE_CHANGE_LANGUAGE = "enable_change_language";
    private static final String SP_KEY_LANGUAGE = "language";
    private static final String SP_KEY_THEME = "theme";
    private static final String SP_THEME_AND_LANGUAGE_NAME = "TUIThemeAndLanguage";
    private static final String TAG = "TUIThemeManager";
    public static final int THEME_LIGHT = 0;
    public static final int THEME_LIVELY = 1;
    public static final int THEME_SERIOUS = 2;
    private static String currentProcessName = "";
    private String currentLanguage;
    private int currentThemeID;
    private Locale defaultLocale;
    private boolean enableLanguageSwitch;
    private boolean isInit;
    private final Map<String, Locale> languageMap;
    private final Map<Integer, List<Integer>> themeResIDMap;

    public static final class ThemeManagerHolder {
        private static final TUIThemeManager instance = new TUIThemeManager();

        private ThemeManagerHolder() {
        }
    }

    public static void addLightTheme(int i11) {
        addTheme(0, i11);
    }

    public static void addLivelyTheme(int i11) {
        addTheme(1, i11);
    }

    public static void addSeriousTheme(int i11) {
        addTheme(2, i11);
    }

    public static class ThemeAndLanguageCallback implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            TUIThemeManager.getInstance().applyTheme(activity);
            TUIThemeManager.getInstance().applyLanguage(activity);
            TUIThemeManager.getInstance().applyLanguage(activity.getApplicationContext());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }
    }

    private TUIThemeManager() {
        this.isInit = false;
        this.themeResIDMap = new HashMap();
        HashMap map = new HashMap();
        this.languageMap = map;
        this.currentThemeID = 0;
        this.currentLanguage = "";
        this.defaultLocale = null;
        this.enableLanguageSwitch = false;
        map.put(LANGUAGE_ZH_CN, Locale.CHINESE);
        map.put(LANGUAGE_ZH_HK, Locale.TRADITIONAL_CHINESE);
        map.put(LANGUAGE_EN, Locale.ENGLISH);
        map.put(LANGUAGE_AR, new Locale(LANGUAGE_AR));
    }

    public static void addLanguage(String str, Locale locale) {
        Log.i(TAG, "addLanguage language=" + str + " locale=" + locale);
        getInstance().languageMap.put(str, locale);
    }

    public static void addTheme(int i11, int i12) {
        if (i12 == 0) {
            Log.e(TAG, "addTheme failed, theme resID is zero");
            return;
        }
        Log.i(TAG, "addTheme themeID=" + i11 + " resID=" + i12);
        List<Integer> arrayList = getInstance().themeResIDMap.get(Integer.valueOf(i11));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            getInstance().themeResIDMap.put(Integer.valueOf(i11), arrayList);
        }
        if (arrayList.contains(Integer.valueOf(i12))) {
            return;
        }
        arrayList.add(Integer.valueOf(i12));
        getInstance().applyTheme(ServiceInitializer.getAppContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyTheme(Context context) {
        if (context == null) {
            return;
        }
        Resources.Theme theme = context.getTheme();
        if (theme == null) {
            context.setTheme(C35071R.style.TUIBaseTheme);
            theme = context.getTheme();
        }
        mergeTheme(theme);
    }

    public static int getAttrResId(Context context, int i11) {
        if (context == null || i11 == 0) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue.resourceId;
    }

    public static String getProcessName() {
        if (!TextUtils.isEmpty(currentProcessName)) {
            return currentProcessName;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            currentProcessName = processName;
            return processName;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                currentProcessName = (String) objInvoke;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return currentProcessName;
    }

    private void mergeTheme(Resources.Theme theme) {
        List<Integer> list;
        if (theme == null || (list = this.themeResIDMap.get(Integer.valueOf(this.currentThemeID))) == null) {
            return;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            theme.applyStyle(it.next().intValue(), true);
        }
    }

    private void notifySetLanguageEvent() {
        TUICore.notifyEvent(TUIConstants.TUICore.LANGUAGE_EVENT, TUIConstants.TUICore.LANGUAGE_EVENT_SUB_KEY, null);
    }

    private void setThemeInternal(Context context) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (!this.isInit) {
            this.isInit = true;
            SPUtils sPUtils = SPUtils.getInstance(SP_THEME_AND_LANGUAGE_NAME);
            this.enableLanguageSwitch = sPUtils.getBoolean(SP_KEY_ENABLE_CHANGE_LANGUAGE, false);
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new ThemeAndLanguageCallback());
            }
            notifySetLanguageEvent();
            this.currentLanguage = sPUtils.getString("language", getLocale(applicationContext).getLanguage());
            this.currentThemeID = sPUtils.getInt("theme", 0);
            applyLanguage(applicationContext);
        }
        applyTheme(applicationContext);
    }

    public static void setWebViewLanguage(Context context) {
        try {
            Log.i(TAG, "setWebViewLanguage");
            if (Build.VERSION.SDK_INT >= 28) {
                WebView.setDataDirectorySuffix(getProcessName());
            }
            new WebView(context).destroy();
        } catch (Throwable th2) {
            Log.e(TUIConstants.TUICore.LANGUAGE_EVENT, "init language settings failed, " + th2.getMessage());
        }
    }

    public void applyLanguage(Context context) {
        if (this.enableLanguageSwitch && context != null) {
            Locale locale = this.languageMap.get(this.currentLanguage);
            if (locale == null && (locale = this.defaultLocale) == null) {
                locale = getLocale(context);
            }
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            configuration.locale = locale;
            configuration.setLocale(locale);
            resources.updateConfiguration(configuration, null);
            if (Build.VERSION.SDK_INT >= 25) {
                context.createConfigurationContext(configuration).getResources().updateConfiguration(configuration, resources.getDisplayMetrics());
            }
        }
    }

    public void changeLanguage(Context context, String str) {
        if (context == null || TextUtils.equals(str, this.currentLanguage)) {
            return;
        }
        setEnableLanguageSwitch(true);
        this.currentLanguage = str;
        SPUtils.getInstance(SP_THEME_AND_LANGUAGE_NAME).put("language", str, true);
        applyLanguage(context.getApplicationContext());
        applyLanguage(context);
        TUICore.notifyEvent(TUIConstants.TUICore.LANGUAGE_EVENT, TUIConstants.TUICore.LANGUAGE_CHANGED_EVENT_SUB_KEY, null);
    }

    public void changeTheme(Context context, int i11) {
        if (context == null || i11 == this.currentThemeID) {
            return;
        }
        this.currentThemeID = i11;
        SPUtils.getInstance(SP_THEME_AND_LANGUAGE_NAME).put("theme", i11, true);
        applyTheme(context.getApplicationContext());
        applyTheme(context);
    }

    public String getCurrentLanguage() {
        return this.currentLanguage;
    }

    public int getCurrentTheme() {
        return this.currentThemeID;
    }

    public void setDefaultLocale(Locale locale) {
        this.defaultLocale = locale;
    }

    public static TUIThemeManager getInstance() {
        return ThemeManagerHolder.instance;
    }

    public static void setEnableLanguageSwitch(boolean z11) {
        getInstance().enableLanguageSwitch = z11;
        SPUtils.getInstance(SP_THEME_AND_LANGUAGE_NAME).put(SP_KEY_ENABLE_CHANGE_LANGUAGE, z11);
    }

    public static void setTheme(Context context) {
        getInstance().setThemeInternal(context);
    }

    public Locale getLocale(Context context) {
        if (TUIBuild.getVersionInt() < 24) {
            return context.getResources().getConfiguration().locale;
        }
        return context.getResources().getConfiguration().getLocales().get(0);
    }
}
