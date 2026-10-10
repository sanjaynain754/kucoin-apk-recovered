package com.kubi.kucoin.utils;

import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import android.os.Build;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.facebook.react.devsupport.StackTraceHelper;
import com.kubi.config.exception.KCConfigException;
import com.tencent.bugly.proguard.C34054z6;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kucoin.utils.c0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ThirdPartOrSystemExceptionFix.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/kucoin/utils/ExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "uncaughtExceptionHandler", "<init>", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", "uncaughtException", "", InterfaceC33953u5.f72225u, "Ljava/lang/Thread;", "exception", "", "shouldAbsorb", "", "isGmsGservicesProviderSecurityException", "isAsyncStorageClosedDbException", "isAsyncStorageDatabaseMovedException", "isInsetsRelayoutBadParcelableException", "isHonorFrameworkResourcesNotFoundException", "isFrameworkWindowResourceStack", StackTraceHelper.STACK_KEY, "", "isHonorAsyncStorageResourcesNotFoundException", "isHonorDevice", "isTrichromeBitmapNullPointerException", "isSystemWebViewSpellCheckResourcesNotFoundException", "isTctFreeformCaptionLayoutNullPointerException", "isSamsungFrameLayoutLayoutNullPointerException", "isScheduledThreadPoolDelayedWorkQueueSignalException", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nThirdPartOrSystemExceptionFix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPartOrSystemExceptionFix.kt\ncom/kubi/kucoin/utils/ExceptionHandler\n+ 2 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,406:1\n44#2,2:407\n44#2,2:409\n44#2,2:411\n44#2,2:413\n44#2,2:415\n44#2,2:417\n44#2,2:419\n44#2,2:421\n44#2,2:423\n44#2,2:425\n44#2,2:427\n44#2,2:429\n12637#3,2:431\n12637#3,2:433\n*S KotlinDebug\n*F\n+ 1 ThirdPartOrSystemExceptionFix.kt\ncom/kubi/kucoin/utils/ExceptionHandler\n*L\n41#1:407,2\n48#1:409,2\n57#1:411,2\n65#1:413,2\n72#1:415,2\n79#1:417,2\n87#1:419,2\n95#1:421,2\n103#1:423,2\n111#1:425,2\n119#1:427,2\n126#1:429,2\n166#1:431,2\n187#1:433,2\n*E\n"})
public final class ExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Thread.UncaughtExceptionHandler f28559a;

    /* JADX INFO: renamed from: a */
    public final boolean m33135a(Throwable th2) {
        while (th2 != null) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            if (th2 instanceof IllegalStateException) {
                if (StringsKt.contains$default((CharSequence) message, (CharSequence) "attempt to re-open an already-closed object", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) message, (CharSequence) "RKStorage", false, 2, (Object) null)) {
                    return true;
                }
                StackTraceElement[] stackTrace = ((IllegalStateException) th2).getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    String className = stackTraceElement.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                    if (StringsKt.startsWith$default(className, "com.reactnativecommunity.asyncstorage", false, 2, (Object) null)) {
                        return true;
                    }
                }
            }
            th2 = th2.getCause();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m33136b(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof SQLiteReadOnlyDatabaseException) {
                SQLiteReadOnlyDatabaseException sQLiteReadOnlyDatabaseException = (SQLiteReadOnlyDatabaseException) th2;
                String message = sQLiteReadOnlyDatabaseException.getMessage();
                if (message == null) {
                    message = "";
                }
                if (StringsKt.contains$default((CharSequence) message, (CharSequence) "SQLITE_READONLY_DBMOVED", false, 2, (Object) null)) {
                    StackTraceElement[] stackTrace = sQLiteReadOnlyDatabaseException.getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        String className = stackTraceElement.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                        if (StringsKt.startsWith$default(className, "com.reactnativecommunity.asyncstorage", false, 2, (Object) null)) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            }
            th2 = th2.getCause();
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m33138d(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof SecurityException) {
                String message = ((SecurityException) th2).getMessage();
                if (message == null) {
                    message = "";
                }
                if (StringsKt.contains$default((CharSequence) message, (CharSequence) "Failed to find provider com.google.android.gsf.gservices", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) ExceptionsKt.stackTraceToString(th2), (CharSequence) "com.google.android.gms.common.internal.BaseGmsClient", false, 2, (Object) null)) {
                    return true;
                }
            }
            th2 = th2.getCause();
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m33144j(Throwable th2) {
        while (th2 != null) {
            String strStackTraceToString = ExceptionsKt.stackTraceToString(th2);
            if ((th2 instanceof IllegalMonitorStateException) && StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.signal", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "java.util.concurrent.ThreadPoolExecutor.getTask", false, 2, (Object) null)) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m33137c(String str) {
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "android.view.Window.getDefaultFeatures", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "android.app.Activity.attach", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) C34054z6.f72603b, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) C34054z6.f72605d, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "com.android.internal.policy.DecorView.<init>", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "android.view.animation.AnimationUtils.loadInterpolator", false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m33139e(Throwable th2) {
        if (Build.VERSION.SDK_INT != 36 || !m33140f()) {
            return false;
        }
        while (th2 != null) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            String strStackTraceToString = ExceptionsKt.stackTraceToString(th2);
            if (Intrinsics.areEqual(th2.getClass().getName(), "android.content.res.Resources$NotFoundException") && StringsKt.contains$default((CharSequence) message, (CharSequence) "Resource ID #", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "android.database.sqlite.SQLiteGlobal.getJournalSizeLimit", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "android.database.sqlite.SQLiteOpenHelper.getWritableDatabase", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "com.reactnativecommunity.asyncstorage.ReactDatabaseSupplier.ensureDatabase", false, 2, (Object) null)) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m33140f() {
        String str = Build.BRAND;
        if (str == null) {
            str = "";
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str2 = Build.MANUFACTURER;
        String lowerCase2 = (str2 != null ? str2 : "").toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) JPushConstants.Manufacturer.HONOR, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) JPushConstants.Manufacturer.HONOR, false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m33141g(Throwable th2) {
        int i11 = Build.VERSION.SDK_INT;
        if ((i11 != 35 && i11 != 36) || !m33140f()) {
            return false;
        }
        while (th2 != null) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            String strStackTraceToString = ExceptionsKt.stackTraceToString(th2);
            if (Intrinsics.areEqual(th2.getClass().getName(), "android.content.res.Resources$NotFoundException") && StringsKt.contains$default((CharSequence) message, (CharSequence) "Resource ID #", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "android.content.res.ResourcesImpl.getValue", false, 2, (Object) null) && m33137c(strStackTraceToString)) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m33142h(Throwable th2) {
        if (Build.VERSION.SDK_INT != 30) {
            return false;
        }
        String str = Build.BRAND;
        if (str == null) {
            str = "";
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str2 = Build.MANUFACTURER;
        if (str2 == null) {
            str2 = "";
        }
        String lowerCase2 = str2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) JPushConstants.Manufacturer.OPPO, false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) JPushConstants.Manufacturer.REALME, false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) JPushConstants.Manufacturer.OPPO, false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) JPushConstants.Manufacturer.REALME, false, 2, (Object) null)) {
            return false;
        }
        while (th2 != null) {
            if (Intrinsics.areEqual(th2.getClass().getName(), "android.os.BadParcelableException")) {
                String message = th2.getMessage();
                if (message == null) {
                    message = "";
                }
                String strStackTraceToString = ExceptionsKt.stackTraceToString(th2);
                if (StringsKt.contains$default((CharSequence) message, (CharSequence) "ClassNotFoundException when unmarshalling", false, 2, (Object) null) && (StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "android.view.InsetsSourceControl", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "android.view.IWindowSession$Stub$Proxy.relayout", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "android.view.ViewRootImpl.relayoutWindow", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "android.os.Parcel.readParcelableCreator", false, 2, (Object) null))) {
                    return true;
                }
            }
            th2 = th2.getCause();
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m33143i(Throwable th2) {
        if (Build.VERSION.SDK_INT != 36) {
            return false;
        }
        String str = Build.BRAND;
        if (str == null) {
            str = "";
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str2 = Build.MANUFACTURER;
        if (str2 == null) {
            str2 = "";
        }
        String lowerCase2 = str2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "samsung", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "samsung", false, 2, (Object) null)) {
            return false;
        }
        while (th2 != null) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            String strStackTraceToString = ExceptionsKt.stackTraceToString(th2);
            if ((th2 instanceof NullPointerException) && StringsKt.contains$default((CharSequence) message, (CharSequence) "getVisibility()", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) message, (CharSequence) "null object reference", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "android.widget.FrameLayout.layoutChildren", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "com.android.internal.policy.DecorView.onLayout", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "android.view.ViewRootImpl.performLayout", false, 2, (Object) null)) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m33145k(Throwable th2) {
        if (Build.VERSION.SDK_INT != 36) {
            return false;
        }
        String str = Build.BRAND;
        if (str == null) {
            str = "";
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str2 = Build.MANUFACTURER;
        if (str2 == null) {
            str2 = "";
        }
        String lowerCase2 = str2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) JPushConstants.Manufacturer.OPPO, false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) JPushConstants.Manufacturer.OPPO, false, 2, (Object) null)) {
            return false;
        }
        while (th2 != null) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            String strStackTraceToString = ExceptionsKt.stackTraceToString(th2);
            if (Intrinsics.areEqual(th2.getClass().getName(), "android.content.res.Resources$NotFoundException") && StringsKt.contains$default((CharSequence) message, (CharSequence) "Resource ID #", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "chromium-SystemWebViewGoogle", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "org.chromium.content.browser.input.TextSuggestionHost.showSpellCheckSuggestionMenu", false, 2, (Object) null)) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m33146l(Throwable th2) {
        if (Build.VERSION.SDK_INT != 35) {
            return false;
        }
        String str = Build.BRAND;
        if (str == null) {
            str = "";
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str2 = Build.MANUFACTURER;
        if (str2 == null) {
            str2 = "";
        }
        String lowerCase2 = str2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "tcl", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "tcl", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "tct", false, 2, (Object) null)) {
            return false;
        }
        while (th2 != null) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            String strStackTraceToString = ExceptionsKt.stackTraceToString(th2);
            if ((th2 instanceof NullPointerException) && StringsKt.contains$default((CharSequence) message, (CharSequence) "getMeasuredHeight()", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) message, (CharSequence) "null object reference", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "com.tct.freeform.TctDecorCaptionView.onLayout", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "com.android.internal.policy.DecorView.onLayout", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "android.view.ViewRootImpl.performLayout", false, 2, (Object) null)) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m33147m(Throwable th2) {
        if (Build.VERSION.SDK_INT != 33) {
            return false;
        }
        while (th2 != null) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            String strStackTraceToString = ExceptionsKt.stackTraceToString(th2);
            if ((th2 instanceof NullPointerException) && StringsKt.contains$default((CharSequence) message, (CharSequence) "Bitmap.getWidth()", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) message, (CharSequence) "null object reference", false, 2, (Object) null) && (StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "chromium-TrichromeWebViewGoogle", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) strStackTraceToString, (CharSequence) "Ar.run", false, 2, (Object) null))) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull Thread thread, @NotNull Throwable exception) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (m33148n(exception) || (uncaughtExceptionHandler = this.f28559a) == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, exception);
    }

    public ExceptionHandler(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f28559a = uncaughtExceptionHandler;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m33148n(Throwable th2) {
        String message = th2.getMessage();
        if (message != null && StringsKt.contains$default((CharSequence) message, (CharSequence) "READ_CLIPBOARD", false, 2, (Object) null)) {
            C43846g.m96568c(new KCConfigException(th2, "ThirdPartOrSystemExceptionFix", false, null, 8, null), null, 2, null);
            return true;
        }
        if (m33138d(th2)) {
            C43846g.m96568c(new KCConfigException(th2, "ThirdPartOrSystemExceptionFix", false, null, 8, null), null, 2, null);
            return true;
        }
        if (m33135a(th2)) {
            C43846g.m96568c(new KCConfigException(th2, "ThirdPartOrSystemExceptionFix", false, null, 8, null), null, 2, null);
            return true;
        }
        if (m33136b(th2)) {
            C43846g.m96568c(new KCConfigException(th2, "ThirdPartOrSystemExceptionFix", false, null, 8, null), null, 2, null);
            return true;
        }
        if (m33141g(th2)) {
            C43846g.m96568c(new KCConfigException(th2, "ThirdPartOrSystemExceptionFix", false, null, 8, null), null, 2, null);
            return true;
        }
        if (m33139e(th2)) {
            C43846g.m96568c(new KCConfigException(th2, "ThirdPartOrSystemExceptionFix", false, null, 8, null), null, 2, null);
            return true;
        }
        if (m33142h(th2)) {
            C43846g.m96568c(new KCConfigException(th2, "ThirdPartOrSystemExceptionFix", false, null, 8, null), null, 2, null);
            return true;
        }
        if (m33147m(th2)) {
            C43846g.m96568c(new KCConfigException(th2, "ThirdPartOrSystemExceptionFix", false, null, 8, null), null, 2, null);
            return true;
        }
        if (m33145k(th2)) {
            C43846g.m96568c(new KCConfigException(th2, "ThirdPartOrSystemExceptionFix", false, null, 8, null), null, 2, null);
            return true;
        }
        if (m33146l(th2)) {
            C43846g.m96568c(new KCConfigException(th2, "ThirdPartOrSystemExceptionFix", false, null, 8, null), null, 2, null);
            return true;
        }
        if (m33143i(th2)) {
            C43846g.m96568c(new KCConfigException(th2, "ThirdPartOrSystemExceptionFix", false, null, 8, null), null, 2, null);
            return true;
        }
        if (!m33144j(th2)) {
            return false;
        }
        C43846g.m96568c(new KCConfigException(th2, "ThirdPartOrSystemExceptionFix", false, null, 8, null), null, 2, null);
        return true;
    }
}
