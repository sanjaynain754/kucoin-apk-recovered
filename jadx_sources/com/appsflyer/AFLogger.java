package com.appsflyer;

import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFg1bSDK;
import com.appsflyer.internal.AFh1ySDK;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001<B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ7\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0015J+\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0016J3\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0017J#\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0015J+\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\bJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\bJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b!\u0010\u000bJ'\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&JG\u0010)\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010,J'\u0010-\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010&J!\u00100\u001a\u00020\u00062\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010.\"\u00020\u0001¢\u0006\u0004\b0\u00101J!\u00102\u001a\u00020\u00062\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010.\"\u00020\u0001¢\u0006\u0004\b2\u00101J'\u00103\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u0010&J'\u00104\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u0010&R\u0015\u00108\u001a\u0002058BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0001098BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b:\u00107"}, m90084d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFg1bSDK;", "<init>", "()V", "", "debugLogMessage", "", "afDebugLog", "(Ljava/lang/String;)V", "", "shouldRemoteDebug", "(Ljava/lang/String;Z)V", "message", "", "ex", "printMessage", "printThrowable", "shouldReportToExManager", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "errorLogMessage", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", "afErrorLogForExcManagerOnly", "disableReporting", "logMessage", "afInfoLog", "afLogForce", "rdLogMessage", "afRDLog", "afVerboseLog", "warningLogMessage", "afWarnLog", "Lcom/appsflyer/internal/AFh1ySDK;", "tag", "msg", "d", "(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;Z)V", "throwable", "printMsg", "e", "(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;)V", "i", "", "client", "registerClient", "([Lcom/appsflyer/internal/AFg1bSDK;)V", "unregisterClient", "v", "w", "Ljava/util/concurrent/ExecutorService;", "AFAdRevenueData", "Lkotlin/Lazy;", "getMonetizationNetwork", "", "getCurrencyIso4217Code", "getRevenue", "LogLevel"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAFLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AFLogger.kt\ncom/appsflyer/AFLogger\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n36#2:279\n36#2:280\n36#2:281\n36#2:282\n36#2:283\n1855#3,2:284\n*S KotlinDebug\n*F\n+ 1 AFLogger.kt\ncom/appsflyer/AFLogger\n*L\n177#1:279\n189#1:280\n208#1:281\n224#1:282\n243#1:283\n35#1:284,2\n*E\n"})
public final class AFLogger extends AFg1bSDK {

    @NotNull
    public static final AFLogger INSTANCE = new AFLogger();

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    private static final Lazy getRevenue = LazyKt.lazy(new Function0<Set<AFg1bSDK>>() { // from class: com.appsflyer.AFLogger.7
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final Set<AFg1bSDK> invoke() {
            return new LinkedHashSet();
        }
    });

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    private static final Lazy getMonetizationNetwork = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.AFLogger.1
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return AFc1oSDK.getMonetizationNetwork();
        }
    });

    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, m90084d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", FirebaseAnalytics.Param.LEVEL, "I", "getLevel", "()I", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        @JvmName(name = "getLevel")
        public final int getLevel() {
            return this.level;
        }

        LogLevel(int i11) {
            this.level = i11;
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.d()", imports = {}))
    @JvmStatic
    public static final void afDebugLog(@NotNull String debugLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.mo5914d(AFh1ySDK.OTHER, debugLogMessage, shouldRemoteDebug);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(@NotNull String message, @NotNull Throwable ex2, boolean printMessage, boolean printThrowable, boolean shouldReportToExManager) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(ex2, "");
        AFg1bSDK.e$default(INSTANCE, AFh1ySDK.OTHER, message, ex2, printMessage, printThrowable, shouldReportToExManager, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLogForExcManagerOnly(@Nullable String errorLogMessage, @Nullable Throwable ex2) {
        AFLogger aFLogger = INSTANCE;
        AFh1ySDK aFh1ySDK = AFh1ySDK.OTHER;
        if (errorLogMessage == null || StringsKt.isBlank(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex2 == null) {
            ex2 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1bSDK.e$default(aFLogger, aFh1ySDK, str, ex2, false, false, true, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.i()", imports = {}))
    @JvmStatic
    public static final void afInfoLog(@NotNull String logMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.mo5916i(AFh1ySDK.OTHER, logMessage, shouldRemoteDebug);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.w()", imports = {}))
    @JvmStatic
    public static final void afWarnLog(@NotNull String warningLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        INSTANCE.mo5918w(AFh1ySDK.OTHER, warningLogMessage, shouldRemoteDebug);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator it = ((Set) getRevenue.getValue()).iterator();
        while (it.hasNext()) {
            function1.invoke((AFg1bSDK) it.next());
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.d()", imports = {}))
    @JvmStatic
    public static final void afDebugLog(@NotNull String debugLogMessage) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.mo5914d(AFh1ySDK.OTHER, debugLogMessage, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.i()", imports = {}))
    @JvmStatic
    public static final void afInfoLog(@NotNull String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.mo5916i(AFh1ySDK.OTHER, logMessage, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.force()", imports = {}))
    @JvmStatic
    public static final void afLogForce(@NotNull String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.force(AFh1ySDK.OTHER, logMessage);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.v()", imports = {}))
    @JvmStatic
    public static final void afRDLog(@NotNull String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.mo5917v(AFh1ySDK.OTHER, rdLogMessage, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.v()", imports = {}))
    @JvmStatic
    public static final void afVerboseLog(@NotNull String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.mo5917v(AFh1ySDK.OTHER, rdLogMessage, false);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.w()", imports = {}))
    @JvmStatic
    public static final void afWarnLog(@NotNull String warningLogMessage) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        AFg1bSDK.w$default(INSTANCE, AFh1ySDK.OTHER, warningLogMessage, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFg1bSDK[] aFg1bSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1bSDKArr, "");
        ((Set) getRevenue.getValue()).removeAll(ArraysKt.toSet(aFg1bSDKArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFg1bSDK[] aFg1bSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1bSDKArr, "");
        CollectionsKt.addAll((Set) getRevenue.getValue(), aFg1bSDKArr);
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    /* JADX INFO: renamed from: d */
    public final void mo5914d(@NotNull final AFh1ySDK tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getMonetizationNetwork.getValue()).execute(new RunnableC5133b(new Function1<AFg1bSDK, Unit>() { // from class: com.appsflyer.AFLogger.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getCurrencyIso4217Code(@NotNull AFg1bSDK aFg1bSDK) {
                Intrinsics.checkNotNullParameter(aFg1bSDK, "");
                aFg1bSDK.mo5914d(tag, msg, shouldRemoteDebug);
            }

            @Override // p852kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1bSDK aFg1bSDK) {
                getCurrencyIso4217Code(aFg1bSDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    /* JADX INFO: renamed from: e */
    public final void mo5915e(@NotNull final AFh1ySDK tag, @NotNull final String msg, @NotNull final Throwable throwable, final boolean printMsg, final boolean printThrowable, final boolean shouldReportToExManager, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
        ((ExecutorService) getMonetizationNetwork.getValue()).execute(new RunnableC5133b(new Function1<AFg1bSDK, Unit>() { // from class: com.appsflyer.AFLogger.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getRevenue(@NotNull AFg1bSDK aFg1bSDK) {
                Intrinsics.checkNotNullParameter(aFg1bSDK, "");
                aFg1bSDK.mo5915e(tag, msg, throwable, printMsg, printThrowable, shouldReportToExManager, shouldRemoteDebug);
            }

            @Override // p852kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1bSDK aFg1bSDK) {
                getRevenue(aFg1bSDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void force(@NotNull final AFh1ySDK tag, @NotNull final String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getMonetizationNetwork.getValue()).execute(new RunnableC5133b(new Function1<AFg1bSDK, Unit>() { // from class: com.appsflyer.AFLogger.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getMonetizationNetwork(@NotNull AFg1bSDK aFg1bSDK) {
                Intrinsics.checkNotNullParameter(aFg1bSDK, "");
                aFg1bSDK.force(tag, msg);
            }

            @Override // p852kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1bSDK aFg1bSDK) {
                getMonetizationNetwork(aFg1bSDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    /* JADX INFO: renamed from: i */
    public final void mo5916i(@NotNull final AFh1ySDK tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getMonetizationNetwork.getValue()).execute(new RunnableC5133b(new Function1<AFg1bSDK, Unit>() { // from class: com.appsflyer.AFLogger.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getMonetizationNetwork(@NotNull AFg1bSDK aFg1bSDK) {
                Intrinsics.checkNotNullParameter(aFg1bSDK, "");
                aFg1bSDK.mo5916i(tag, msg, shouldRemoteDebug);
            }

            @Override // p852kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1bSDK aFg1bSDK) {
                getMonetizationNetwork(aFg1bSDK);
                return Unit.INSTANCE;
            }
        }));
    }

    public final void registerClient(@NotNull final AFg1bSDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) getMonetizationNetwork.getValue()).execute(new Runnable() { // from class: com.appsflyer.a
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getMediationNetwork(client);
            }
        });
    }

    public final void unregisterClient(@NotNull final AFg1bSDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) getMonetizationNetwork.getValue()).execute(new Runnable() { // from class: com.appsflyer.c
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getCurrencyIso4217Code(client);
            }
        });
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    /* JADX INFO: renamed from: v */
    public final void mo5917v(@NotNull final AFh1ySDK tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getMonetizationNetwork.getValue()).execute(new RunnableC5133b(new Function1<AFg1bSDK, Unit>() { // from class: com.appsflyer.AFLogger.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getMediationNetwork(@NotNull AFg1bSDK aFg1bSDK) {
                Intrinsics.checkNotNullParameter(aFg1bSDK, "");
                aFg1bSDK.mo5917v(tag, msg, shouldRemoteDebug);
            }

            @Override // p852kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1bSDK aFg1bSDK) {
                getMediationNetwork(aFg1bSDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    /* JADX INFO: renamed from: w */
    public final void mo5918w(@NotNull final AFh1ySDK tag, @NotNull final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getMonetizationNetwork.getValue()).execute(new RunnableC5133b(new Function1<AFg1bSDK, Unit>() { // from class: com.appsflyer.AFLogger.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void getCurrencyIso4217Code(@NotNull AFg1bSDK aFg1bSDK) {
                Intrinsics.checkNotNullParameter(aFg1bSDK, "");
                aFg1bSDK.mo5918w(tag, msg, shouldRemoteDebug);
            }

            @Override // p852kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1bSDK aFg1bSDK) {
                getCurrencyIso4217Code(aFg1bSDK);
                return Unit.INSTANCE;
            }
        }));
    }

    private AFLogger() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex2) {
        AFLogger aFLogger = INSTANCE;
        AFh1ySDK aFh1ySDK = AFh1ySDK.OTHER;
        if (errorLogMessage == null || StringsKt.isBlank(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex2 == null) {
            ex2 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1bSDK.e$default(aFLogger, aFh1ySDK, str, ex2, false, false, false, false, 120, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLogForExcManagerOnly(@Nullable String errorLogMessage, @Nullable Throwable ex2, boolean disableReporting) {
        AFLogger aFLogger = INSTANCE;
        AFh1ySDK aFh1ySDK = AFh1ySDK.OTHER;
        if (errorLogMessage == null || StringsKt.isBlank(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex2 == null) {
            ex2 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1bSDK.e$default(aFLogger, aFh1ySDK, str, ex2, false, false, !disableReporting, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex2, boolean printThrowable) {
        AFLogger aFLogger = INSTANCE;
        AFh1ySDK aFh1ySDK = AFh1ySDK.OTHER;
        if (errorLogMessage == null || StringsKt.isBlank(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex2 == null) {
            ex2 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1bSDK.e$default(aFLogger, aFh1ySDK, str, ex2, false, printThrowable, false, false, 104, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex2, boolean printThrowable, boolean shouldReportToExManager) {
        AFLogger aFLogger = INSTANCE;
        AFh1ySDK aFh1ySDK = AFh1ySDK.OTHER;
        if (errorLogMessage == null || StringsKt.isBlank(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex2 == null) {
            ex2 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1bSDK.e$default(aFLogger, aFh1ySDK, str, ex2, false, printThrowable, shouldReportToExManager, false, 72, null);
    }
}
