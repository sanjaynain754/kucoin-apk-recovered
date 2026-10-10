package com.kubi.sdk.lib.kunlun.sdk.handler;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.NetworkUtils;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.sdk.lib.kunlun.sdk.KunLunSdk;
import com.kubi.sdk.lib.kunlun.sdk.handler.KunlunReporter;
import com.kubi.sdk.lib.kunlun.sdk.network.KunlunReportEvents;
import com.kubi.sdk.lib.kunlun.sdk.p115db.KunlunDBEventData;
import com.kubi.sdk.lib.kunlun.sdk.p115db.KunlunEventDBProxy;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import mr.C42597a;
import mz.C42679a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p386jz.InterfaceC40824b;
import p441lz.InterfaceC42330a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KunlunReporter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001.B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003J\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0003J\u0019\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010,¨\u0006/"}, m90084d2 = {"Lcom/kubi/sdk/lib/kunlun/sdk/handler/KunlunReporter;", "", "<init>", "()V", "Lcom/kubi/sdk/lib/kunlun/sdk/handler/KunlunRecorder;", "recorder", "", "j", "(Lcom/kubi/sdk/lib/kunlun/sdk/handler/KunlunRecorder;)V", "", "update", "e", "(Z)V", CmcdData.Factory.STREAM_TYPE_LIVE, "m", "", "delay", "n", "(J)V", "f", "k", "b", "J", "lastCheckTime", "Landroid/os/HandlerThread;", "c", "Landroid/os/HandlerThread;", "handlerThread", "Lcom/kubi/sdk/lib/kunlun/sdk/handler/KunlunReporter$KunlunReportHandler;", "d", "Lcom/kubi/sdk/lib/kunlun/sdk/handler/KunlunReporter$KunlunReportHandler;", "handler", "Lcom/kubi/sdk/lib/kunlun/sdk/handler/KunlunRecorder;", "Ljz/b;", "Lkotlin/Lazy;", "i", "()Ljz/b;", "dbDao", "Llz/a;", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Llz/a;", "api", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "reportStatus", "KunlunReportHandler", "kunlun-sdk_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKunlunReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KunlunReporter.kt\ncom/kubi/sdk/lib/kunlun/sdk/handler/KunlunReporter\n+ 2 KunlunLogger.kt\ncom/kubi/sdk/lib/kunlun/sdk/utils/KunlunLoggerKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n*L\n1#1,195:1\n29#2,4:196\n29#2,4:205\n35#2,3:209\n126#3:200\n60#4,4:201\n*S KotlinDebug\n*F\n+ 1 KunlunReporter.kt\ncom/kubi/sdk/lib/kunlun/sdk/handler/KunlunReporter\n*L\n133#1:196,4\n103#1:205,4\n110#1:209,3\n139#1:200\n152#1:201,4\n*E\n"})
public final class KunlunReporter {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static long lastCheckTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static KunlunReportHandler handler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static KunlunRecorder recorder;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KunlunReporter f46937a = new KunlunReporter();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final HandlerThread handlerThread = new HandlerThread("kunlun-reporter");

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Lazy dbDao = LazyKt.lazy(new Function0<InterfaceC40824b>() { // from class: com.kubi.sdk.lib.kunlun.sdk.handler.KunlunReporter$dbDao$2
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final InterfaceC40824b invoke() {
            InterfaceC40824b interfaceC40824bMo57144d;
            KunlunEventDBProxy companion = KunlunEventDBProxy.f46930a.getInstance();
            if (companion == null || (interfaceC40824bMo57144d = companion.mo57144d()) == null) {
                throw new NullPointerException("kunlunEventDao is null");
            }
            return interfaceC40824bMo57144d;
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Lazy api = LazyKt.lazy(new Function0<InterfaceC42330a>() { // from class: com.kubi.sdk.lib.kunlun.sdk.handler.KunlunReporter$api$2
        @Override // p852kotlin.jvm.functions.Function0
        public final InterfaceC42330a invoke() {
            return (InterfaceC42330a) C42597a.m93392h(C42597a.m93389e()).create(InterfaceC42330a.class);
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static AtomicBoolean reportStatus = new AtomicBoolean(false);

    /* JADX INFO: compiled from: KunlunReporter.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/sdk/lib/kunlun/sdk/handler/KunlunReporter$KunlunReportHandler;", "Landroid/os/Handler;", InterfaceC33617e1.f69652a, "Landroid/os/Looper;", "(Landroid/os/Looper;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "kunlun-sdk_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class KunlunReportHandler extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KunlunReportHandler(@NotNull Looper looper) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "looper");
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            int i11 = msg.what;
            if (i11 == 1) {
                KunlunReporter.f46937a.m57171f();
                return;
            }
            if (i11 == 2) {
                KunlunReporter.f46937a.m57175k();
                return;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    return;
                }
                C27100x0.m66923d(new Function0<Unit>() { // from class: com.kubi.sdk.lib.kunlun.sdk.handler.KunlunReporter$KunlunReportHandler$handleMessage$1
                    @Override // p852kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        KunlunReporter.f46937a.m57173i().deleteAll();
                    }
                });
            } else {
                KunlunReporter kunlunReporter = KunlunReporter.f46937a;
                kunlunReporter.m57176l();
                kunlunReporter.m57177m();
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.lib.kunlun.sdk.handler.KunlunReporter$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/lib/kunlun/sdk/handler/KunlunReporter$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C23869a extends TypeToken<JsonObject> {
    }

    /* JADX INFO: renamed from: g */
    public static final void m57168g() {
        Object objM103844constructorimpl;
        KunlunReporter kunlunReporter = f46937a;
        try {
            Result.Companion companion = Result.INSTANCE;
            KunlunRecorder kunlunRecorder = recorder;
            JsonArray jsonArrayM57160a = kunlunRecorder != null ? kunlunRecorder.m57160a() : null;
            if (jsonArrayM57160a != null && !jsonArrayM57160a.isEmpty()) {
                if (KunLunSdk.f46915a.m57122h()) {
                    C44128b.m97259c("KunlunSDK::KunlunReporter", "collect count is " + jsonArrayM57160a.size());
                }
                ArrayList arrayList = new ArrayList();
                Iterator<JsonElement> it = jsonArrayM57160a.iterator();
                while (it.hasNext()) {
                    arrayList.add(new KunlunDBEventData(0L, it.next().toString(), 0L, 5, null));
                }
                kunlunReporter.m57173i().mo89308a(arrayList);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    C42679a.m93503a(thM103847exceptionOrNullimpl, "KunlunSDK::KunlunReporter", "collectData");
                    C44128b.m97262f("KunlunSDK::KunlunReporter", "collectData", thM103847exceptionOrNullimpl);
                }
                m57169o(f46937a, 0L, 1, null);
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m57169o(KunlunReporter kunlunReporter, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        kunlunReporter.m57178n(j11);
    }

    /* JADX INFO: renamed from: e */
    public final void m57170e(boolean update) {
        reportStatus.compareAndSet(!update, update);
    }

    /* JADX INFO: renamed from: f */
    public final void m57171f() {
        KunLunSdk.f46915a.m57119e().execute(new Runnable() { // from class: kz.a
            @Override // java.lang.Runnable
            public final void run() {
                KunlunReporter.m57168g();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC42330a m57172h() {
        Object value = api.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-api>(...)");
        return (InterfaceC42330a) value;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC40824b m57173i() {
        return (InterfaceC40824b) dbDao.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final void m57174j(@NotNull KunlunRecorder recorder2) {
        Intrinsics.checkNotNullParameter(recorder2, "recorder");
        HandlerThread handlerThread2 = handlerThread;
        handlerThread2.start();
        recorder = recorder2;
        Looper looper = handlerThread2.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "handlerThread.looper");
        handler = new KunlunReportHandler(looper);
        m57177m();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x010b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0124  */
    /* JADX WARN: Code duplicated, block: B:45:0x0132  */
    /* JADX WARN: Code duplicated, block: B:46:0x0140  */
    /* JADX WARN: Code duplicated, block: B:49:0x014a  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: k */
    public final void m57175k() {
        long j11;
        Object objM103844constructorimpl;
        Throwable thM103847exceptionOrNullimpl;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire;
        String message;
        if (!reportStatus.get()) {
            C44128b.m97266j("KunlunSDK::KunlunReporter", "report is not open");
            return;
        }
        long jMo89310c = 0;
        try {
            Result.Companion companion = Result.INSTANCE;
            try {
                if (NetworkUtils.m6063k()) {
                    InterfaceC40824b interfaceC40824bM57173i = m57173i();
                    KunLunSdk kunLunSdk = KunLunSdk.f46915a;
                    List<KunlunDBEventData> listMo89309b = interfaceC40824bM57173i.mo89309b(kunLunSdk.m57120f().getSizeLimit());
                    if (!listMo89309b.isEmpty()) {
                        long size = listMo89309b.size();
                        try {
                            if (kunLunSdk.m57122h()) {
                                C44128b.m97259c("KunlunSDK::KunlunReporter", "db events count is " + listMo89309b.size());
                            }
                            ArrayList arrayList = new ArrayList();
                            for (KunlunDBEventData kunlunDBEventData : listMo89309b) {
                                if (System.currentTimeMillis() - kunlunDBEventData.getTimeStamp() <= ((long) (KunLunSdk.f46915a.m57120f().getExpiredTimeInterval() * 60)) * 1000) {
                                    String event = kunlunDBEventData.getEvent();
                                    C27099x c27099x = C27099x.f54458a;
                                    arrayList.add(C27099x.m66914d(event, new C23869a().getType()));
                                }
                            }
                            m57172h().m92878a(new KunlunReportEvents(arrayList));
                            m57173i().mo89311d(listMo89309b);
                            if (System.currentTimeMillis() - lastCheckTime > FundingRateEntity.MILLIS_PER_HOUR) {
                                jMo89310c = m57173i().mo89310c(System.currentTimeMillis() - (((long) (KunLunSdk.f46915a.m57120f().getExpiredTimeInterval() * 60)) * 1000));
                                lastCheckTime = System.currentTimeMillis();
                            }
                            j11 = jMo89310c;
                            jMo89310c = size;
                        } catch (Throwable th2) {
                            th = th2;
                            j11 = jMo89310c;
                            jMo89310c = size;
                            Result.Companion companion2 = Result.INSTANCE;
                            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                            if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
                                f46937a.m57178n(KunLunSdk.f46915a.m57120f().getReportTimeInterval());
                            }
                            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                            if (thM103847exceptionOrNullimpl != null) {
                                TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
                                eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
                                if (thM103847exceptionOrNullimpl instanceof ApiException) {
                                    String str = ((ApiException) thM103847exceptionOrNullimpl).code;
                                    Intrinsics.checkNotNullExpressionValue(str, "it.code");
                                    eventParametersBuilderAcquire.m42393d("code", str);
                                } else {
                                    eventParametersBuilderAcquire.m42391b("code", -1);
                                }
                                message = thM103847exceptionOrNullimpl.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                eventParametersBuilderAcquire.m42393d("error_message", message);
                                eventParametersBuilderAcquire.m42394e("success", false);
                                eventParametersBuilderAcquire.m42396g("number1", jMo89310c);
                                eventParametersBuilderAcquire.m42396g("number2", j11);
                                TechnologyEvent.m42388d("kunlun_sdk_report", eventParametersBuilderAcquire);
                                f46937a.m57178n(Math.max(KunLunSdk.f46915a.m57120f().getReportTimeInterval(), 5000L));
                            }
                        }
                    }
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                    if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
                        f46937a.m57178n(KunLunSdk.f46915a.m57120f().getReportTimeInterval());
                    }
                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                    if (thM103847exceptionOrNullimpl != null) {
                        TechnologyEvent technologyEvent2 = TechnologyEvent.f35482a;
                        eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
                        if (thM103847exceptionOrNullimpl instanceof ApiException) {
                            String str2 = ((ApiException) thM103847exceptionOrNullimpl).code;
                            Intrinsics.checkNotNullExpressionValue(str2, "it.code");
                            eventParametersBuilderAcquire.m42393d("code", str2);
                        } else {
                            eventParametersBuilderAcquire.m42391b("code", -1);
                        }
                        message = thM103847exceptionOrNullimpl.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        eventParametersBuilderAcquire.m42393d("error_message", message);
                        eventParametersBuilderAcquire.m42394e("success", false);
                        eventParametersBuilderAcquire.m42396g("number1", jMo89310c);
                        eventParametersBuilderAcquire.m42396g("number2", j11);
                        TechnologyEvent.m42388d("kunlun_sdk_report", eventParametersBuilderAcquire);
                        f46937a.m57178n(Math.max(KunLunSdk.f46915a.m57120f().getReportTimeInterval(), 5000L));
                    }
                }
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
            }
            j11 = 0;
        } catch (Throwable th4) {
            th = th4;
            j11 = 0;
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            f46937a.m57178n(KunLunSdk.f46915a.m57120f().getReportTimeInterval());
        }
        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            TechnologyEvent technologyEvent3 = TechnologyEvent.f35482a;
            eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            if (thM103847exceptionOrNullimpl instanceof ApiException) {
                String str3 = ((ApiException) thM103847exceptionOrNullimpl).code;
                Intrinsics.checkNotNullExpressionValue(str3, "it.code");
                eventParametersBuilderAcquire.m42393d("code", str3);
            } else {
                eventParametersBuilderAcquire.m42391b("code", -1);
            }
            message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            eventParametersBuilderAcquire.m42393d("error_message", message);
            eventParametersBuilderAcquire.m42394e("success", false);
            eventParametersBuilderAcquire.m42396g("number1", jMo89310c);
            eventParametersBuilderAcquire.m42396g("number2", j11);
            TechnologyEvent.m42388d("kunlun_sdk_report", eventParametersBuilderAcquire);
            f46937a.m57178n(Math.max(KunLunSdk.f46915a.m57120f().getReportTimeInterval(), 5000L));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m57178n(long delay) {
        KunlunReportHandler kunlunReportHandler = handler;
        if (kunlunReportHandler != null) {
            kunlunReportHandler.removeMessages(2);
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        KunlunReportHandler kunlunReportHandler2 = handler;
        if (kunlunReportHandler2 != null) {
            kunlunReportHandler2.sendMessageDelayed(messageObtain, delay);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m57176l() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        KunlunReportHandler kunlunReportHandler = handler;
        if (kunlunReportHandler != null) {
            kunlunReportHandler.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m57177m() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        KunlunReportHandler kunlunReportHandler = handler;
        if (kunlunReportHandler != null) {
            kunlunReportHandler.sendMessageDelayed(messageObtain, ((long) KunLunSdk.f46915a.m57120f().getCollectTimeInterval()) * 1000);
        }
    }
}
