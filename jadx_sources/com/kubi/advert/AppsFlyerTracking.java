package com.kubi.advert;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.media3.common.MimeTypes;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33864ph;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.channels.C41568g;
import kotlinx.coroutines.channels.InterfaceC41565d;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AppsFlyerTracking.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001:\u00011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001dJE\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010'¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020\tJ\b\u0010*\u001a\u00020\u001dH\u0002J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u0005H\u0002JG\u0010-\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010'H\u0002¢\u0006\u0002\u0010(J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u0012H\u0002J\u0010\u00100\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, m90084d2 = {"Lcom/kubi/advert/AppsFlyerTracking;", "", "<init>", "()V", "PREFS_NAME", "", "KEY_INSTALL_TRACE_ID", "KEY_INSTALL_TRACE_CREATED_AT", "INSTALL_TRACE_VALID_MS", "", "GCD_CALLBACK_WINDOW_MS", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "reportingScope", "reportingChannel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/kubi/advert/AppsFlyerTracking$TrackingEvent;", "sinkGate", "Lcom/kubi/advert/AppsFlyerTrackingSinkGate;", "sessionLock", "callbackState", "Lcom/kubi/advert/AppsFlyerCallbackWatchdogState;", "session", "Lcom/kubi/advert/AppsFlyerTrackingSession;", "callbackWatchdog", "Lkotlinx/coroutines/Job;", "initialize", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "onGcdCallbackObserved", "report", "name", "source", DbParams.KEY_CHANNEL_RESULT, "durationMs", "extras", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V", "elapsedSinceSessionStart", "startSession", "reportMissingLocked", "skipReason", "reportLocked", "enqueueTrackingEvent", "trackingEvent", "getInstallTraceId", "TrackingEvent", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppsFlyerTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppsFlyerTracking.kt\ncom/kubi/advert/AppsFlyerTracking\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,238:1\n1#2:239\n39#3,12:240\n*S KotlinDebug\n*F\n+ 1 AppsFlyerTracking.kt\ncom/kubi/advert/AppsFlyerTracking\n*L\n173#1:240,12\n*E\n"})
public final class AppsFlyerTracking {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AppsFlyerTracking f14968a = new AppsFlyerTracking();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final AtomicBoolean f14969b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC41709m0 f14970c = C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C42911a.m94121c()));

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final InterfaceC41709m0 f14971d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final InterfaceC41565d<TrackingEvent> f14972e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final AppsFlyerTrackingSinkGate<TrackingEvent> f14973f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Object f14974g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final AppsFlyerCallbackWatchdogState f14975h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public static volatile AppsFlyerTrackingSession f14976i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public static InterfaceC41775x1 f14977j;

    /* JADX INFO: renamed from: com.kubi.advert.AppsFlyerTracking$1 */
    /* JADX INFO: compiled from: AppsFlyerTracking.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.advert.AppsFlyerTracking$1", m90122f = "AppsFlyerTracking.kt", m90123i = {0}, m90124l = {75}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
    public static final class C93421 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public C93421(Continuation<? super C93421> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C93421 c93421 = new C93421(continuation);
            c93421.L$0 = obj;
            return c93421;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C93421) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0037 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0040  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:12:0x0038). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.L$0
                kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
                java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r6.label
                r3 = 1
                if (r2 == 0) goto L1f
                if (r2 != r3) goto L17
                java.lang.Object r2 = r6.L$1
                kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.InterfaceC41567f) r2
                p852kotlin.ResultKt.throwOnFailure(r7)
                goto L38
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                p852kotlin.ResultKt.throwOnFailure(r7)
                kotlinx.coroutines.channels.d r7 = com.kubi.advert.AppsFlyerTracking.m14723e()
                kotlinx.coroutines.channels.f r7 = r7.iterator()
                r2 = r7
            L2b:
                r6.L$0 = r0
                r6.L$1 = r2
                r6.label = r3
                java.lang.Object r7 = r2.mo90631a(r6)
                if (r7 != r1) goto L38
                return r1
            L38:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L69
                java.lang.Object r7 = r2.next()
                com.kubi.advert.AppsFlyerTracking$a r7 = (com.kubi.advert.AppsFlyerTracking.TrackingEvent) r7
                kotlin.Result$Companion r4 = p852kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L5e
                java.lang.String r4 = r7.getEvent()     // Catch: java.lang.Throwable -> L5e
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5e
                java.util.Map r7 = r7.m14740b()     // Catch: java.lang.Throwable -> L5e
                r5.<init>(r7)     // Catch: java.lang.Throwable -> L5e
                p569qq.C43852m.m96605q(r4, r5)     // Catch: java.lang.Throwable -> L5e
                kotlin.Unit r7 = p852kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5e
                p852kotlin.Result.m103844constructorimpl(r7)     // Catch: java.lang.Throwable -> L5e
                goto L2b
            L5e:
                r7 = move-exception
                kotlin.Result$Companion r4 = p852kotlin.Result.INSTANCE
                java.lang.Object r7 = p852kotlin.ResultKt.createFailure(r7)
                p852kotlin.Result.m103844constructorimpl(r7)
                goto L2b
            L69:
                kotlin.Unit r7 = p852kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kubi.advert.AppsFlyerTracking.C93421.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.kubi.advert.AppsFlyerTracking$a, reason: from toString */
    /* JADX INFO: compiled from: AppsFlyerTracking.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/advert/AppsFlyerTracking$TrackingEvent;", "", "event", "", "properties", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getEvent", "()Ljava/lang/String;", "getProperties", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class TrackingEvent {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String event;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final Map<String, Object> properties;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackingEvent)) {
                return false;
            }
            TrackingEvent trackingEvent = (TrackingEvent) other;
            return Intrinsics.areEqual(this.event, trackingEvent.event) && Intrinsics.areEqual(this.properties, trackingEvent.properties);
        }

        public TrackingEvent(@NotNull String event, @NotNull Map<String, ? extends Object> properties) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(properties, "properties");
            this.event = event;
            this.properties = properties;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEvent() {
            return this.event;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Map<String, Object> m14740b() {
            return this.properties;
        }

        public int hashCode() {
            return (this.event.hashCode() * 31) + this.properties.hashCode();
        }

        @NotNull
        public String toString() {
            return "TrackingEvent(event=" + this.event + ", properties=" + this.properties + ')';
        }
    }

    static {
        InterfaceC41709m0 interfaceC41709m0M91125a = C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C42911a.m94120b()));
        f14971d = interfaceC41709m0M91125a;
        f14972e = C41568g.m90691b(Integer.MAX_VALUE, null, null, 6, null);
        f14973f = new AppsFlyerTrackingSinkGate<>();
        f14974g = new Object();
        f14975h = new AppsFlyerCallbackWatchdogState();
        C41696j.m91104d(interfaceC41709m0M91125a, null, null, new C93421(null), 3, null);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m14728n(String event, Map properties) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(properties, "properties");
        f14973f.m14798a(new TrackingEvent(event, MapsKt.toMap(properties)), new AppsFlyerTracking$initialize$3$1(f14968a));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m14729r(AppsFlyerTracking appsFlyerTracking, String str, String str2, String str3, Long l11, Map map, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            l11 = null;
        }
        Long l12 = l11;
        if ((i11 & 16) != 0) {
            map = MapsKt.emptyMap();
        }
        appsFlyerTracking.m14736q(str, str2, str3, l12, map);
    }

    /* JADX INFO: renamed from: i */
    public final long m14730i() {
        long jM14795a;
        synchronized (f14974g) {
            AppsFlyerTrackingSession appsFlyerTrackingSession = f14976i;
            jM14795a = appsFlyerTrackingSession != null ? appsFlyerTrackingSession.m14795a() : 0L;
        }
        return jM14795a;
    }

    /* JADX INFO: renamed from: j */
    public final void m14731j(TrackingEvent trackingEvent) {
        f14972e.mo90594e(trackingEvent);
    }

    /* JADX INFO: renamed from: k */
    public final String m14732k(Application application) {
        SharedPreferences sharedPreferences = application.getSharedPreferences("appsflyer_tracking", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = sharedPreferences.getLong("install_trace_created_at", 0L);
        String str = null;
        String string = sharedPreferences.getString("install_trace_id", null);
        if (string != null && string.length() != 0) {
            long j12 = jCurrentTimeMillis - j11;
            if (0 <= j12 && j12 < 604800001) {
                str = string;
            }
            return str == null ? "" : str;
        }
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Intrinsics.checkNotNull(sharedPreferences);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("install_trace_id", string2).putLong("install_trace_created_at", jCurrentTimeMillis);
        editorEdit.apply();
        return string2;
    }

    /* JADX INFO: renamed from: l */
    public final void m14733l(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (f14969b.compareAndSet(false, true)) {
            f14976i = new AppsFlyerTrackingSession(AppsFlyerTracking$initialize$1.INSTANCE, m14732k(application), new Function0() { // from class: com.kubi.advert.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AppsFlyerTracking.m14727m();
                }
            }, new Function2() { // from class: com.kubi.advert.k
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppsFlyerTracking.m14728n((String) obj, (Map) obj2);
                }
            });
            m14738t();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m14734o() {
        synchronized (f14974g) {
            try {
                if (f14975h.m14782b()) {
                    InterfaceC41775x1 interfaceC41775x1 = f14977j;
                    if (interfaceC41775x1 != null) {
                        InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                    }
                    f14977j = null;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m14735p(@NotNull String name, @NotNull String source, @NotNull String result, @Nullable Long l11, @NotNull Map<String, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(extras, "extras");
        synchronized (f14974g) {
            f14968a.m14736q(name, source, result, l11, extras);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m14736q(String str, String str2, String str3, Long l11, Map<String, ? extends Object> map) {
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            AppsFlyerTrackingSession appsFlyerTrackingSession = f14976i;
            if (appsFlyerTrackingSession != null) {
                appsFlyerTrackingSession.m14796b(str, str2, str3, l11, map);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m14737s(String str) {
        m14729r(this, "gcd_callback_missing", "GCD", C33864ph.f71456b, null, MapsKt.mapOf(TuplesKt.m90091to("skip_reason", str)), 8, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m14738t() {
        synchronized (f14974g) {
            try {
                InterfaceC41775x1 interfaceC41775x1 = f14977j;
                if (interfaceC41775x1 != null) {
                    InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                }
                AppsFlyerTrackingSession appsFlyerTrackingSession = f14976i;
                if (appsFlyerTrackingSession != null) {
                    appsFlyerTrackingSession.m14797d();
                }
                f14977j = C41696j.m91104d(f14970c, null, null, new AppsFlyerTracking$startSession$1$1(null), 3, null);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static final String m14727m() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
