package com.kubi.sdk.log.realtime;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5288p;
import com.blankj.utilcode.util.NetworkUtils;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.log.core.C17473a;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.sdk.log.realtime.cache.LogCache;
import com.kubi.sdk.log.realtime.p116db.LogData;
import com.kubi.utils.C27100x0;
import com.tencent.bugly.proguard.C33590cg;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Type;
import java.lang.reflect.UndeclaredThrowableException;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import mr.C42597a;
import o00.C42917g;
import okhttp3.internal.http2.StreamResetException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p542pz.InterfaceC43567a;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: RealTimeReporter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0005*\u0001P\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001SB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0003R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R#\u0010=\u001a\n 8*\u0004\u0018\u000107078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010CR\"\u0010K\u001a\u00020E8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bF\u0010H\"\u0004\bI\u0010JR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bL\u0010N\"\u0004\bO\u0010\bR\u0014\u0010R\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010Q¨\u0006T"}, m90084d2 = {"Lcom/kubi/sdk/log/realtime/RealTimeReporter;", "", "<init>", "()V", "Landroid/app/Application;", "context", "", "q", "(Landroid/app/Application;)V", "Lcom/kubi/sdk/log/realtime/db/LogData;", "message", "v", "(Lcom/kubi/sdk/log/realtime/db/LogData;)V", "m", "(Lcom/kubi/sdk/log/realtime/db/LogData;)Lcom/kubi/sdk/log/realtime/db/LogData;", "Lcom/kubi/sdk/log/realtime/cache/LogCache$a;", "data", CmcdData.Factory.STREAMING_FORMAT_SS, "(Lcom/kubi/sdk/log/realtime/cache/LogCache$a;)V", "r", "t", "Lcom/kubi/network/retrofit/exception/ApiException;", "exception", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lcom/kubi/network/retrofit/exception/ApiException;)Z", "p", "", "throwable", "o", "(Lcom/kubi/sdk/log/realtime/cache/LogCache$a;Ljava/lang/Throwable;)V", "isSuccess", "n", "(ZLcom/kubi/sdk/log/realtime/cache/LogCache$a;)V", "u", "", "b", "J", "lastReportTime", "Lcom/kubi/sdk/log/realtime/cache/LogCache;", "c", "Lcom/kubi/sdk/log/realtime/cache/LogCache;", C33590cg.f69440j, "Ljava/util/concurrent/ExecutorService;", "d", "Ljava/util/concurrent/ExecutorService;", "processThread", "Landroid/os/HandlerThread;", "e", "Landroid/os/HandlerThread;", "reportThread", "Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;", "f", "Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;", "handler", "Lpz/a;", "kotlin.jvm.PlatformType", "g", "Lkotlin/Lazy;", "i", "()Lpz/a;", "api", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "I", "rateLimitTimes", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isReport", "Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;", "j", "Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;", "()Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;", "x", "(Lcom/kubi/sdk/log/realtime/LogRemoteConfigData;)V", "config", "k", "Landroid/app/Application;", "()Landroid/app/Application;", "setContext$Logger_realtime_release", "com/kubi/sdk/log/realtime/RealTimeReporter$b", "Lcom/kubi/sdk/log/realtime/RealTimeReporter$b;", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Logger-realtime_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRealTimeReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealTimeReporter.kt\ncom/kubi/sdk/log/realtime/RealTimeReporter\n+ 2 RealLogger.kt\ncom/kubi/sdk/log/realtime/utils/RealLoggerKt\n+ 3 RealTimeIssue.kt\ncom/kubi/sdk/log/realtime/RealTimeIssueKt\n*L\n1#1,342:1\n16#2,4:343\n16#2,4:347\n16#2,4:351\n16#2,4:355\n16#2,4:359\n16#2,4:363\n16#2,4:372\n16#2,4:376\n36#3,5:367\n*S KotlinDebug\n*F\n+ 1 RealTimeReporter.kt\ncom/kubi/sdk/log/realtime/RealTimeReporter\n*L\n139#1:343,4\n159#1:347,4\n164#1:351,4\n170#1:355,4\n177#1:359,4\n222#1:363,4\n275#1:372,4\n283#1:376,4\n266#1:367,5\n*E\n"})
public final class RealTimeReporter {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static HandlerC23870a handler;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static int rateLimitTimes;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public static Application context;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final RealTimeReporter f46947a = new RealTimeReporter();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static long lastReportTime = System.currentTimeMillis();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final LogCache cache = new LogCache();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final ExecutorService processThread = C42917g.m94140f("logger-uploader-processor");

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final HandlerThread reportThread = new HandlerThread("realtime-reporter-handler");

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Lazy api = LazyKt.lazy(new Function0<InterfaceC43567a>() { // from class: com.kubi.sdk.log.realtime.RealTimeReporter$api$2
        @Override // p852kotlin.jvm.functions.Function0
        public final InterfaceC43567a invoke() {
            return (InterfaceC43567a) C42597a.m93392h(C42597a.m93389e()).create(InterfaceC43567a.class);
        }
    });

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static AtomicBoolean isReport = new AtomicBoolean(true);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public static LogRemoteConfigData config = new LogRemoteConfigData(null, null, null, false, 0, 0, 0, false, 255, null);

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public static final C23871b callback = new C23871b();

    /* JADX INFO: renamed from: com.kubi.sdk.log.realtime.RealTimeReporter$a */
    /* JADX INFO: compiled from: RealTimeReporter.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/sdk/log/realtime/RealTimeReporter$a;", "Landroid/os/Handler;", "Landroid/os/Looper;", InterfaceC33617e1.f69652a, "<init>", "(Landroid/os/Looper;)V", "Landroid/os/Message;", "msg", "", "handleMessage", "(Landroid/os/Message;)V", "Logger-realtime_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class HandlerC23870a extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerC23870a(@NotNull Looper looper) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "looper");
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            try {
                int i11 = msg.what;
                if (i11 == 1) {
                    RealTimeReporter realTimeReporter = RealTimeReporter.f46947a;
                    Object obj = msg.obj;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.kubi.sdk.log.realtime.cache.LogCache.CacheDataWrapper");
                    realTimeReporter.m57198s((LogCache.CacheDataWrapper) obj);
                    return;
                }
                if (i11 == 2) {
                    RealTimeReporter.f46947a.m57197r();
                    return;
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        return;
                    }
                    C44128b.m97266j("Logger::RealTimeReporter", "清空缓存");
                    RealTimeReporter.cache.m57222h();
                    return;
                }
                C44128b.m97266j("Logger::RealTimeReporter", "停止上报日志,清空缓存");
                RealTimeReporter.isReport.set(false);
                RealTimeReporter.cache.m57224l();
                HandlerC23870a handlerC23870a = RealTimeReporter.handler;
                if (handlerC23870a != null) {
                    handlerC23870a.removeMessages(2);
                }
            } catch (Throwable th2) {
                C44128b.m97270n("Logger::RealTimeReporter", "handleMessage exception, msg=" + msg.what + ": " + th2);
                RealTimeReporter.f46947a.m57200u();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m57195p(LogCache.CacheDataWrapper data) {
        rateLimitTimes = 0;
        m57193n(true, data);
    }

    /* JADX INFO: renamed from: com.kubi.sdk.log.realtime.RealTimeReporter$b */
    /* JADX INFO: compiled from: RealTimeReporter.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"com/kubi/sdk/log/realtime/RealTimeReporter$b", "Lcom/kubi/sdk/log/realtime/cache/LogCache$b;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "Logger-realtime_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRealTimeReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealTimeReporter.kt\ncom/kubi/sdk/log/realtime/RealTimeReporter$callback$1\n+ 2 RealLogger.kt\ncom/kubi/sdk/log/realtime/utils/RealLoggerKt\n*L\n1#1,342:1\n16#2,4:343\n16#2,4:347\n*S KotlinDebug\n*F\n+ 1 RealTimeReporter.kt\ncom/kubi/sdk/log/realtime/RealTimeReporter$callback$1\n*L\n89#1:343,4\n102#1:347,4\n*E\n"})
    public static final class C23871b implements LogCache.InterfaceC23877b {
        @Override // com.kubi.sdk.log.realtime.cache.LogCache.InterfaceC23877b
        /* JADX INFO: renamed from: a */
        public void mo57203a() {
            if (System.currentTimeMillis() - RealTimeReporter.lastReportTime > 1000) {
                LogCache.CacheDataWrapper cacheDataWrapperM57226o = RealTimeReporter.cache.m57226o(RealTimeReporter.f46947a.m57189j().getLimitSize());
                if (!cacheDataWrapperM57226o.m57231a().isEmpty()) {
                    HandlerC23870a handlerC23870a = RealTimeReporter.handler;
                    if (handlerC23870a != null) {
                        handlerC23870a.removeMessages(2);
                    }
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    messageObtain.obj = cacheDataWrapperM57226o;
                    HandlerC23870a handlerC23870a2 = RealTimeReporter.handler;
                    if (handlerC23870a2 != null) {
                        handlerC23870a2.sendMessage(messageObtain);
                        return;
                    }
                    return;
                }
                C44128b.m97270n("Logger::RealTimeReporter", "缓存满，但是缓存队列为空，跳过上报");
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m57187w(LogData message) {
        Intrinsics.checkNotNullParameter(message, "$message");
        cache.m57221g(f46947a.m57192m(message));
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC43567a m57188i() {
        return (InterfaceC43567a) api.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final LogRemoteConfigData m57189j() {
        return config;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final Application m57190k() {
        return context;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m57191l(ApiException exception) {
        if (Intrinsics.areEqual(exception.code, "429") || Intrinsics.areEqual(exception.code, "403")) {
            int i11 = rateLimitTimes + 1;
            rateLimitTimes = i11;
            if (i11 >= 3) {
                C44128b.m97266j("Logger::RealTimeReporter", "连续三次收到" + exception.code + "，停止上报日志");
                HandlerC23870a handlerC23870a = handler;
                if (handlerC23870a != null) {
                    handlerC23870a.sendEmptyMessage(3);
                }
                return true;
            }
        }
        if (!Intrinsics.areEqual(exception.code, "4001")) {
            return false;
        }
        C44128b.m97266j("Logger::RealTimeReporter", "收到4001，清空缓存");
        HandlerC23870a handlerC23870a2 = handler;
        if (handlerC23870a2 != null) {
            handlerC23870a2.sendEmptyMessage(4);
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m57193n(boolean isSuccess, LogCache.CacheDataWrapper data) {
        if (isSuccess) {
            if (!data.getIsFromMem()) {
                cache.m57225m(data.m57231a());
            }
        } else if (data.getIsFromMem()) {
            cache.m57230t(data.m57231a());
        }
        cache.m57223j();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX INFO: renamed from: o */
    public final void m57194o(LogCache.CacheDataWrapper data, Throwable throwable) {
        boolean zM57191l;
        Throwable th2;
        Throwable cause;
        Throwable undeclaredThrowable = throwable instanceof UndeclaredThrowableException ? ((UndeclaredThrowableException) throwable).getUndeclaredThrowable() : throwable;
        if (undeclaredThrowable instanceof ApiException) {
            zM57191l = m57191l((ApiException) undeclaredThrowable);
        } else if (undeclaredThrowable.getCause() instanceof ApiException) {
            Throwable cause2 = undeclaredThrowable.getCause();
            Intrinsics.checkNotNull(cause2, "null cannot be cast to non-null type com.kubi.network.retrofit.exception.ApiException");
            zM57191l = m57191l((ApiException) cause2);
        } else {
            zM57191l = undeclaredThrowable instanceof StreamResetException;
        }
        if (zM57191l) {
            return;
        }
        if (C23874b.m57209a(throwable)) {
            th2 = throwable;
        } else {
            Throwable cause3 = throwable.getCause();
            if (cause3 != null && C23874b.m57209a(cause3)) {
                th2 = throwable;
            } else {
                Throwable cause4 = throwable.getCause();
                if ((cause4 == null || (cause = cause4.getCause()) == null || !C23874b.m57209a(cause)) ? false : true) {
                    th2 = throwable;
                } else {
                    th2 = throwable;
                    C43846g.m96568c(new RealTimeLogException(th2, "上报日志失败", false, null, 8, null), null, 2, null);
                }
            }
        }
        C44128b.m97270n("Logger::RealTimeReporter", "reportMessage，上报失败:: " + th2);
        m57193n(false, data);
    }

    /* JADX INFO: renamed from: q */
    public final void m57196q(@NotNull Application context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        context = context2;
        C27100x0.m66923d(new Function0<Unit>() { // from class: com.kubi.sdk.log.realtime.RealTimeReporter$init$1

            /* JADX INFO: renamed from: com.kubi.sdk.log.realtime.RealTimeReporter$init$1$a */
            /* JADX INFO: compiled from: RemoteConfig.kt */
            @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/log/realtime/RealTimeReporter$init$1$a", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,94:1\n*E\n"})
            public static final class C23872a extends TypeToken<LogRemoteConfigData> {
            }

            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new C23872a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                LogRemoteConfigData logRemoteConfigData = (LogRemoteConfigData) RemoteConfig.m20457a("real_time_log_config_Android", type);
                if (logRemoteConfigData != null) {
                    RealTimeReporter realTimeReporter = this.this$0;
                    C44128b.m97259c("Logger::RealTimeReporter", "获取到远端配置 " + logRemoteConfigData);
                    realTimeReporter.m57202x(logRemoteConfigData);
                }
            }
        });
        if (!config.isOpen()) {
            C44128b.m97266j("Logger::RealTimeReporter", "未开启实时日志上报");
            return;
        }
        HandlerThread handlerThread = reportThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "reportThread.looper");
        handler = new HandlerC23870a(looper);
        m57200u();
        cache.m57228q(callback);
    }

    /* JADX INFO: renamed from: r */
    public final void m57197r() {
        LogCache.CacheDataWrapper cacheDataWrapperM57226o = cache.m57226o(config.getLimitSize());
        if (cacheDataWrapperM57226o.m57231a().isEmpty()) {
            m57200u();
        } else {
            m57199t(cacheDataWrapperM57226o);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m57200u() {
        HandlerC23870a handlerC23870a = handler;
        if (handlerC23870a != null) {
            handlerC23870a.removeMessages(2);
        }
        HandlerC23870a handlerC23870a2 = handler;
        if (handlerC23870a2 != null) {
            handlerC23870a2.sendEmptyMessageDelayed(2, Math.max(config.getPoolingInterval() * 1000, 3000L));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m57201v(@NotNull final LogData message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (isReport.get()) {
            processThread.execute(new Runnable() { // from class: com.kubi.sdk.log.realtime.c
                @Override // java.lang.Runnable
                public final void run() {
                    RealTimeReporter.m57187w(message);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m57202x(@NotNull LogRemoteConfigData logRemoteConfigData) {
        Intrinsics.checkNotNullParameter(logRemoteConfigData, "<set-?>");
        config = logRemoteConfigData;
    }

    /* JADX INFO: renamed from: m */
    public final LogData m57192m(LogData message) {
        message.setContent(StringsKt.take(message.getContent(), 3000));
        return message;
    }

    /* JADX INFO: renamed from: s */
    public final void m57198s(LogCache.CacheDataWrapper data) {
        m57199t(data);
    }

    /* JADX INFO: renamed from: t */
    public final void m57199t(LogCache.CacheDataWrapper data) {
        Object objM103844constructorimpl;
        m57200u();
        lastReportTime = System.currentTimeMillis();
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(NetworkUtils.m6063k()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = bool;
        }
        if (!((Boolean) objM103844constructorimpl).booleanValue()) {
            C44128b.m97266j("Logger::RealTimeReporter", "网络不通，跳过上报");
            m57193n(false, data);
            return;
        }
        try {
            String strM6348j = C5288p.m6348j(data.m57231a());
            Intrinsics.checkNotNullExpressionValue(strM6348j, "toJson(cacheList)");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = strM6348j.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bArrEncode = Base64.encode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(\n                …NO_WRAP\n                )");
            String str = new String(bArrEncode, charset);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C17473a c17473a = C17473a.f32591a;
            if (!TextUtils.isEmpty(c17473a.m37856a().getProvider().mo37854a())) {
                linkedHashMap.put("uid", c17473a.m37856a().getProvider().mo37854a());
            }
            InterfaceC43567a api2 = m57188i();
            Intrinsics.checkNotNullExpressionValue(api2, "api");
            InterfaceC43567a.a.m95843a(api2, linkedHashMap, str, null, 4, null);
            m57195p(data);
        } catch (Throwable th3) {
            m57194o(data, th3);
        }
    }
}
