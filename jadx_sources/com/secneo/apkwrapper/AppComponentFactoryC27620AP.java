package com.secneo.apkwrapper;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.secneo.apkwrapper.AP */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(28)
public final class AppComponentFactoryC27620AP extends AppComponentFactory {

    /* JADX INFO: renamed from: a */
    private AppComponentFactory f56487a = null;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    private synchronized AppComponentFactory m68576a(ClassLoader classLoader) throws Exception {
        AppComponentFactory appComponentFactory;
        try {
            int[] iArr = new int[0];
            synchronized (this) {
                if (this.f56487a == null && !TextUtils.isEmpty(C27623H.ACFNAME)) {
                    try {
                        this.f56487a = (AppComponentFactory) classLoader.loadClass(C27623H.ACFNAME).newInstance();
                    } catch (Exception unused) {
                    }
                }
                appComponentFactory = this.f56487a;
            }
            return appComponentFactory;
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    private static boolean m68577a() throws Exception {
        try {
            int[] iArr = new int[0];
            return (!Boolean.parseBoolean(ApplicationC27621AW.validACF) || "androidx.core.app.CoreComponentFactory".equals(C27623H.ACFNAME) || "android.app.AppComponentFactory".equals(C27623H.ACFNAME) || "android.support.v4.app.CoreComponentFactory".equals(C27623H.ACFNAME)) ? false : true;
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public synchronized void m68578a(AppComponentFactory appComponentFactory) throws Exception {
        try {
            int[] iArr = new int[0];
            synchronized (this) {
                this.f56487a = appComponentFactory;
            }
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) throws Exception {
        try {
            int[] iArr = new int[0];
            if (m68577a()) {
                AppComponentFactory appComponentFactoryM68576a = m68576a(classLoader);
                m68578a(appComponentFactoryM68576a);
                if (appComponentFactoryM68576a != null) {
                    return appComponentFactoryM68576a.instantiateActivity(classLoader, str, intent);
                }
            }
            return super.instantiateActivity(classLoader, str, intent);
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public Application instantiateApplication(ClassLoader classLoader, String str) throws Exception {
        try {
            int[] iArr = new int[0];
            if (Build.VERSION.SDK_INT >= 29 && !Boolean.parseBoolean(ApplicationC27621AW.gameCenter) && !TextUtils.isEmpty(C27623H.APPNAME)) {
                str = C27623H.APPNAME;
            }
            if (m68577a()) {
                AppComponentFactory appComponentFactoryM68576a = m68576a(classLoader);
                m68578a(appComponentFactoryM68576a);
                if (appComponentFactoryM68576a != null) {
                    C27623H.sApp = appComponentFactoryM68576a.instantiateApplication(classLoader, str);
                }
            }
            if (C27623H.sApp == null) {
                C27623H.sApp = super.instantiateApplication(classLoader, str);
            }
            return C27623H.sApp;
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @TargetApi(29)
    public ClassLoader instantiateClassLoader(ClassLoader classLoader, ApplicationInfo applicationInfo) throws Exception {
        try {
            int[] iArr = new int[0];
            C27623H.sAppInfo = applicationInfo;
            C27623H.load(applicationInfo);
            if (m68577a()) {
                AppComponentFactory appComponentFactoryM68576a = m68576a(classLoader);
                m68578a(appComponentFactoryM68576a);
                if (appComponentFactoryM68576a != null) {
                    return appComponentFactoryM68576a.instantiateClassLoader(classLoader, applicationInfo);
                }
            }
            return super.instantiateClassLoader(classLoader, applicationInfo);
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) throws Exception {
        try {
            int[] iArr = new int[0];
            if (m68577a()) {
                AppComponentFactory appComponentFactoryM68576a = m68576a(classLoader);
                m68578a(appComponentFactoryM68576a);
                if (appComponentFactoryM68576a != null) {
                    return appComponentFactoryM68576a.instantiateProvider(classLoader, str);
                }
            }
            return super.instantiateProvider(classLoader, str);
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) throws Exception {
        try {
            int[] iArr = new int[0];
            if (m68577a()) {
                AppComponentFactory appComponentFactoryM68576a = m68576a(classLoader);
                m68578a(appComponentFactoryM68576a);
                if (appComponentFactoryM68576a != null) {
                    return appComponentFactoryM68576a.instantiateReceiver(classLoader, str, intent);
                }
            }
            return super.instantiateReceiver(classLoader, str, intent);
        } catch (Exception ex1) {
            throw ex1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) throws Exception {
        try {
            int[] iArr = new int[0];
            if (m68577a()) {
                AppComponentFactory appComponentFactoryM68576a = m68576a(classLoader);
                m68578a(appComponentFactoryM68576a);
                if (appComponentFactoryM68576a != null) {
                    return appComponentFactoryM68576a.instantiateService(classLoader, str, intent);
                }
            }
            return super.instantiateService(classLoader, str, intent);
        } catch (Exception ex1) {
            throw ex1;
        }
    }
}
