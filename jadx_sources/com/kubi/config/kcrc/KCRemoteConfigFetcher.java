package com.kubi.config.kcrc;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5287o0;
import com.blankj.utilcode.util.NetworkUtils;
import com.kubi.config.Config;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33590cg;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import mr.C42597a;
import o00.C42916f;
import o00.C42918h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import y70.C46396e;

/* JADX INFO: compiled from: KCRemoteConfigFetcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0005*\u0001Z\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ/\u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0006J%\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u0004\u0018\u00010\f2\u0006\u0010!\u001a\u00020\fH\u0000¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010\u0003R$\u0010-\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010&R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010.R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00109R#\u0010@\u001a\n <*\u0004\u0018\u00010;0;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010CR\u0014\u0010H\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010CR\u0014\u0010J\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010CR\u0016\u0010M\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010\"R\u0016\u0010O\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010\"R\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u00108R\u0016\u0010W\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u00108R\u0016\u0010Y\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u00108R\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006^"}, m90084d2 = {"Lcom/kubi/config/kcrc/KCRemoteConfigFetcher;", "", "<init>", "()V", "", "z", "()Z", "restart", "delay", "", ExifInterface.LATITUDE_SOUTH, "(ZZ)V", "", "fetchBy", "C", "(Ljava/lang/String;)V", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "beginId", "version", "isFirst", "N", "(Ljava/lang/String;JJZ)V", "clean", "Q", "(Z)V", "M", "Lcom/kubi/config/Config;", "c", "Lio/reactivex/subjects/PublishSubject;", "ps", "K", "(Lcom/kubi/config/Config;Lio/reactivex/subjects/PublishSubject;)V", "name", "I", "(Ljava/lang/String;)Ljava/lang/String;", "updateConfig", "B", "(Lcom/kubi/config/Config;)V", "L", "b", "Lcom/kubi/config/Config;", "H", "()Lcom/kubi/config/Config;", "setConfig$Config_release", "config", "Lio/reactivex/subjects/PublishSubject;", "publishSubject", "Lcom/kubi/config/kcrc/KCRemoteConfigCache;", "d", "Lkotlin/Lazy;", "G", "()Lcom/kubi/config/kcrc/KCRemoteConfigCache;", C33590cg.f69440j, "Lcom/kubi/config/kcrc/KCRemoteConfigWS;", "e", "J", "()Lcom/kubi/config/kcrc/KCRemoteConfigWS;", "ws", "Lcom/kubi/config/kcrc/a;", "kotlin.jvm.PlatformType", "f", "F", "()Lcom/kubi/config/kcrc/a;", "api", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", CmcdData.Factory.STREAMING_FORMAT_HLS, "allFetching", "i", "hasAllFetchSuccess", "j", "openStart", "", "k", "retryAllCount", CmcdData.Factory.STREAM_TYPE_LIVE, "retryIncrementCount", "Lio/reactivex/disposables/Disposable;", "m", "Lio/reactivex/disposables/Disposable;", "disposableInterval", "n", "currentVersion", "o", "pushVersion", "p", "lastForegroundTime", "com/kubi/config/kcrc/KCRemoteConfigFetcher$onAppStatusChangedListener$1", "q", "Lcom/kubi/config/kcrc/KCRemoteConfigFetcher$onAppStatusChangedListener$1;", "onAppStatusChangedListener", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
@SuppressLint({"CheckResult"})
public final class KCRemoteConfigFetcher {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static Config config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static PublishSubject<Boolean> publishSubject;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static int retryAllCount;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static int retryIncrementCount;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public static Disposable disposableInterval;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public static long currentVersion;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public static long pushVersion;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KCRemoteConfigFetcher f19652a = new KCRemoteConfigFetcher();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Lazy cache = LazyKt.lazy(new Function0<KCRemoteConfigCache>() { // from class: com.kubi.config.kcrc.KCRemoteConfigFetcher$cache$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final KCRemoteConfigCache invoke() {
            return new KCRemoteConfigCache();
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Lazy ws = LazyKt.lazy(new Function0<KCRemoteConfigWS>() { // from class: com.kubi.config.kcrc.KCRemoteConfigFetcher$ws$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final KCRemoteConfigWS invoke() {
            return new KCRemoteConfigWS();
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Lazy api = LazyKt.lazy(new Function0<InterfaceC11415a>() { // from class: com.kubi.config.kcrc.KCRemoteConfigFetcher$api$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        public final InterfaceC11415a invoke() {
            return (InterfaceC11415a) C42597a.m93386b().create(InterfaceC11415a.class);
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean initialized = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean allFetching = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean hasAllFetchSuccess = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean openStart = new AtomicBoolean(false);

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public static long lastForegroundTime = System.currentTimeMillis();

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public static final KCRemoteConfigFetcher$onAppStatusChangedListener$1 onAppStatusChangedListener = new C5287o0.b() { // from class: com.kubi.config.kcrc.KCRemoteConfigFetcher$onAppStatusChangedListener$1
        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onBackground(@Nullable Activity activity) {
            C11426l.m20571d("app onBackground>>> resetPoll.");
            KCRemoteConfigFetcher kCRemoteConfigFetcher = KCRemoteConfigFetcher.f19652a;
            KCRemoteConfigFetcher.m20495T(kCRemoteConfigFetcher, false, false, 2, null);
            kCRemoteConfigFetcher.m20530J().m20550m();
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onForeground(@Nullable Activity activity) {
            KCRemoteConfigFetcher kCRemoteConfigFetcher = KCRemoteConfigFetcher.f19652a;
            Config configM20528H = kCRemoteConfigFetcher.m20528H();
            if (configM20528H == null) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - KCRemoteConfigFetcher.lastForegroundTime;
            if (jCurrentTimeMillis >= configM20528H.getKcParam().getForegroundThrottle() * ((long) 1000)) {
                KCRemoteConfigFetcher.lastForegroundTime = System.currentTimeMillis();
                C11426l.m20571d("app onForeground>>> lanchPoll.");
                KCRemoteConfigFetcher.m20495T(kCRemoteConfigFetcher, true, false, 2, null);
                kCRemoteConfigFetcher.m20530J().m20549i(configM20528H, new Function1<Long, Unit>() { // from class: com.kubi.config.kcrc.KCRemoteConfigFetcher$onAppStatusChangedListener$1$onForeground$1
                    @Override // p852kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
                        invoke(l11.longValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(long j11) {
                        KCRemoteConfigFetcher.pushVersion = j11;
                    }
                }, new Function0<Unit>() { // from class: com.kubi.config.kcrc.KCRemoteConfigFetcher$onAppStatusChangedListener$1$onForeground$2
                    @Override // p852kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        KCRemoteConfigFetcher.f19652a.m20525C("websocket");
                    }
                });
                return;
            }
            C11426l.m20571d("app onForeground>>> Throttle Limit. at " + jCurrentTimeMillis + " ms");
        }
    };

    /* JADX INFO: renamed from: D */
    public static final void m20490D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: renamed from: E */
    public static final void m20491E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: renamed from: O */
    public static final void m20492O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: renamed from: P */
    public static final void m20493P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m20494R(KCRemoteConfigFetcher kCRemoteConfigFetcher, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        kCRemoteConfigFetcher.m20535Q(z11);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m20495T(KCRemoteConfigFetcher kCRemoteConfigFetcher, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        kCRemoteConfigFetcher.m20536S(z11, z12);
    }

    /* JADX INFO: renamed from: U */
    public static final void m20496U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: renamed from: V */
    public static final void m20497V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: renamed from: A */
    public final void m20523A(String fetchBy) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fetchConfigsAll. fetching=");
        AtomicBoolean atomicBoolean = allFetching;
        sb2.append(atomicBoolean.get());
        C11426l.m20571d(sb2.toString());
        if (atomicBoolean.compareAndSet(false, true)) {
            retryAllCount = 0;
            m20534N(fetchBy, 0L, 0L, true);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m20524B(@Nullable Config updateConfig) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fetchConfigsImmediatly. updateConfig=");
        sb2.append(updateConfig != null ? updateConfig.getKcParam() : null);
        C11426l.m20571d(sb2.toString());
        if (updateConfig != null) {
            config = updateConfig;
        }
        m20523A("context_change");
    }

    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: C */
    public final void m20525C(final String fetchBy) {
        if (!openStart.get()) {
            C11426l.m20571d("fetchConfigsIncrement. openStart is false");
            return;
        }
        if (allFetching.get()) {
            C11426l.m20571d("fetchConfigsIncrement. cancel by: allFetching is run");
            return;
        }
        if (!hasAllFetchSuccess.get()) {
            m20523A(fetchBy);
            return;
        }
        final Config config2 = config;
        if (config2 == null) {
            return;
        }
        C11426l.m20571d("fetchConfigsIncrement. pushVersion=" + pushVersion + ", currentVersion=" + currentVersion);
        currentVersion = RangesKt.coerceAtLeast(pushVersion, currentVersion);
        if (m20533M()) {
            C11426l.m20571d("fetchConfigsIncrement. no network");
            return;
        }
        C11424j.f19691a.m20559b("[fetchIncrement]-fetchBy:" + fetchBy);
        DataMapUtil.f54245a.m66380o("key_kc_remote_config_lcc", config2.getKcParam().realCountry());
        Map<String, String> mapQueryMap = config2.getKcParam().queryMap();
        mapQueryMap.put("version", String.valueOf(currentVersion));
        Observable<KCRCIncrementEntity> observableSubscribeOn = m20526F().m20552b(mapQueryMap).subscribeOn(C42916f.m94127f());
        final Function1<KCRCIncrementEntity, Unit> function1 = new Function1<KCRCIncrementEntity, Unit>() { // from class: com.kubi.config.kcrc.KCRemoteConfigFetcher$fetchConfigsIncrement$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KCRCIncrementEntity kCRCIncrementEntity) throws Exception {
                invoke2(kCRCIncrementEntity);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x006a  */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KCRCIncrementEntity kCRCIncrementEntity) throws Exception {
                boolean z11;
                if (kCRCIncrementEntity.needRetry()) {
                    throw new Exception("Retry configIncrease");
                }
                KCRemoteConfigFetcher.retryIncrementCount = 0;
                C11425k.m20564c(fetchBy, C27025c.m66566d(kCRCIncrementEntity.getSuccess()), null, 4, null);
                if (C11416b.f19681a.m20553a().contains(C27041f.m66668h(kCRCIncrementEntity.getCode()))) {
                    KCRemoteConfigFetcher.f19652a.m20523A("re_all");
                    return;
                }
                KCRCDataIncrement data = kCRCIncrementEntity.getData();
                if (data != null) {
                    Long version = data.getVersion();
                    if (version != null) {
                        KCRemoteConfigFetcher.currentVersion = version.longValue();
                    }
                    Map<String, ? extends Object> update = data.getUpdate();
                    if (update == null) {
                        z11 = false;
                    } else {
                        if (Intrinsics.areEqual(update.toString(), "{}")) {
                            update = null;
                        }
                        if (update != null) {
                            KCRemoteConfigFetcher.f19652a.m20527G().m20486p(update);
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    List<String> remove = data.getRemove();
                    if (remove != null) {
                        if (remove.isEmpty()) {
                            remove = null;
                        }
                        if (remove != null) {
                            Result.m103843boximpl(KCRemoteConfigFetcher.f19652a.m20527G().m20487q(remove));
                            z11 = true;
                        }
                    }
                    if (!z11) {
                        C11426l.m20571d("fetchConfigsIncrement. nothing changed");
                        return;
                    }
                    C11426l.m20571d("fetchConfigsIncrement. changed and notify");
                    PublishSubject publishSubject2 = KCRemoteConfigFetcher.publishSubject;
                    if (publishSubject2 != null) {
                        publishSubject2.onNext(Boolean.TRUE);
                    }
                    KCRemoteConfigCache.m20478n(KCRemoteConfigFetcher.f19652a.m20527G(), false, 1, null);
                }
            }
        };
        Consumer<? super KCRCIncrementEntity> consumer = new Consumer() { // from class: com.kubi.config.kcrc.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KCRemoteConfigFetcher.m20490D(function1, obj);
            }
        };
        final Function1<Throwable, Unit> function2 = new Function1<Throwable, Unit>() { // from class: com.kubi.config.kcrc.KCRemoteConfigFetcher$fetchConfigsIncrement$2

            /* JADX INFO: renamed from: com.kubi.config.kcrc.KCRemoteConfigFetcher$fetchConfigsIncrement$2$a */
            /* JADX INFO: compiled from: KCRemoteConfigUtils.kt */
            @Metadata(m90083d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m90084d2 = {"", "run", "()V", "<anonymous>"}, m90085k = 3, m90086mv = {1, 7, 1})
            public static final class RunnableC11410a implements Runnable {
                @Override // java.lang.Runnable
                public final void run() {
                    Function1<Throwable, Unit> function1M20447c;
                    try {
                        KCRemoteConfigFetcher.f19652a.m20525C("retry");
                    } catch (Exception e11) {
                        Config configM20528H = KCRemoteConfigFetcher.f19652a.m20528H();
                        if (configM20528H == null || (function1M20447c = configM20528H.m20447c()) == null) {
                            return;
                        }
                        function1M20447c.invoke(e11);
                    }
                }
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                C11425k.m20563b(fetchBy, false, String.valueOf(th2.getMessage()));
                if (KCRemoteConfigFetcher.retryIncrementCount >= config2.getKcParam().getRetryCount() || KCRemoteConfigFetcher.f19652a.m20533M()) {
                    KCRemoteConfigFetcher.retryIncrementCount = 0;
                } else {
                    KCRemoteConfigFetcher.retryIncrementCount++;
                    C42918h.m94142b(2L, TimeUnit.SECONDS, new RunnableC11410a());
                }
            }
        };
        observableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.kubi.config.kcrc.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KCRemoteConfigFetcher.m20491E(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final InterfaceC11415a m20526F() {
        return (InterfaceC11415a) api.getValue();
    }

    /* JADX INFO: renamed from: G */
    public final KCRemoteConfigCache m20527G() {
        return (KCRemoteConfigCache) cache.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public final Config m20528H() {
        return config;
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public final String m20529I(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return m20527G().m20480h(name);
    }

    /* JADX INFO: renamed from: J */
    public final KCRemoteConfigWS m20530J() {
        return (KCRemoteConfigWS) ws.getValue();
    }

    /* JADX INFO: renamed from: K */
    public final void m20531K(@NotNull Config c11, @NotNull PublishSubject<Boolean> ps2) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(ps2, "ps");
        if (initialized.compareAndSet(false, true)) {
            config = c11;
            publishSubject = ps2;
            m20527G().m20483l();
            KCRemoteConfigFetcher$onAppStatusChangedListener$1 kCRemoteConfigFetcher$onAppStatusChangedListener$1 = onAppStatusChangedListener;
            C5264d.unregisterAppStatusChangedListener(kCRemoteConfigFetcher$onAppStatusChangedListener$1);
            C5264d.registerAppStatusChangedListener(kCRemoteConfigFetcher$onAppStatusChangedListener$1);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m20532L() {
        openStart.set(true);
        Config config2 = config;
        if (config2 == null) {
            return;
        }
        m20536S(true, true);
        m20530J().m20549i(config2, new Function1<Long, Unit>() { // from class: com.kubi.config.kcrc.KCRemoteConfigFetcher$lanchPoll$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
                invoke(l11.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j11) {
                KCRemoteConfigFetcher.pushVersion = j11;
            }
        }, new Function0<Unit>() { // from class: com.kubi.config.kcrc.KCRemoteConfigFetcher$lanchPoll$2
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                KCRemoteConfigFetcher.f19652a.m20525C("websocket");
            }
        });
        if (m20537z()) {
            m20524B(config2);
            C11426l.m20571d("lanchPoll. countryCodeChanged, exc fetchConfigsImmediatly");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        DataMapUtil dataMapUtil = DataMapUtil.f54245a;
        long jM66372e = jCurrentTimeMillis - dataMapUtil.m66372e("key_kc_remote_config_ifa", 0L);
        if (jM66372e > FundingRateEntity.MILLIS_PER_HOUR) {
            dataMapUtil.m66379n("key_kc_remote_config_ifa", System.currentTimeMillis());
            m20523A("loop");
            return;
        }
        C11426l.m20571d("lanchPoll. time limit at " + (jM66372e / ((long) 1000)) + 's');
    }

    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: N */
    public final void m20534N(final String fetchBy, final long beginId, final long version, final boolean isFirst) {
        C11426l.m20571d("recursiveFetch. beginId=" + beginId + ", version=" + version + ", isFirst=" + isFirst);
        if (!openStart.get()) {
            C11426l.m20571d("recursiveFetch. openStart is false");
            allFetching.set(false);
            return;
        }
        if (m20533M()) {
            C11426l.m20571d("recursiveFetch. no network");
            allFetching.set(false);
            return;
        }
        final Config config2 = config;
        if (config2 == null) {
            allFetching.set(false);
            return;
        }
        DataMapUtil.f54245a.m66380o("key_kc_remote_config_lcc", config2.getKcParam().realCountry());
        Map<String, String> mapQueryMap = config2.getKcParam().queryMap();
        mapQueryMap.put("beginId", String.valueOf(beginId));
        mapQueryMap.put("version", String.valueOf(version));
        C11424j.f19691a.m20559b("[fetchAll]-fetchBy:" + fetchBy + ",beginId=" + beginId + ",version=" + version + ",isFirst=" + isFirst);
        Observable<KCRCAllEntity> observableSubscribeOn = m20526F().m20551a(mapQueryMap).subscribeOn(C42916f.m94127f());
        final Function1<KCRCAllEntity, Unit> function1 = new Function1<KCRCAllEntity, Unit>() { // from class: com.kubi.config.kcrc.KCRemoteConfigFetcher$recursiveFetch$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KCRCAllEntity kCRCAllEntity) throws Exception {
                invoke2(kCRCAllEntity);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KCRCAllEntity entity) throws Exception {
                C11425k.m20564c(fetchBy, C27025c.m66566d(entity.getSuccess()), null, 4, null);
                if (entity.needRetry()) {
                    throw new Exception("Retry config");
                }
                KCRemoteConfigFetcher.allFetching.set(false);
                KCRemoteConfigFetcher.hasAllFetchSuccess.set(true);
                if (C11416b.f19681a.m20553a().contains(C27041f.m66668h(entity.getCode()))) {
                    KCRemoteConfigFetcher.f19652a.m20523A("re_all");
                    return;
                }
                if (isFirst) {
                    C11430p c11430p = C11430p.f19709a;
                    Intrinsics.checkNotNullExpressionValue(entity, "entity");
                    c11430p.m20573b(entity);
                }
                KCRCDataAll data = entity.getData();
                if (data == null) {
                    if (isFirst) {
                        return;
                    }
                    KCRemoteConfigFetcher.m20494R(KCRemoteConfigFetcher.f19652a, false, 1, null);
                    return;
                }
                boolean zM66566d = C27025c.m66566d(data.getHasMore());
                C46396e.m102356m("category_kc_remote_config", "key_kc_remote_config_data_version", C27039d.m66652l(data.getVersion()));
                Long version2 = data.getVersion();
                if (version2 != null) {
                    KCRemoteConfigFetcher.currentVersion = version2.longValue();
                }
                Map<String, ? extends Object> values = data.getValues();
                if (values != null) {
                    KCRemoteConfigFetcher.f19652a.m20527G().m20486p(values);
                }
                if (zM66566d) {
                    KCRemoteConfigFetcher.f19652a.m20534N(fetchBy, C27039d.m66652l(data.getBeginId()), C27039d.m66652l(data.getVersion()), false);
                } else {
                    KCRemoteConfigFetcher.f19652a.m20535Q(true);
                }
            }
        };
        Consumer<? super KCRCAllEntity> consumer = new Consumer() { // from class: com.kubi.config.kcrc.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KCRemoteConfigFetcher.m20492O(function1, obj);
            }
        };
        final Function1<Throwable, Unit> function2 = new Function1<Throwable, Unit>() { // from class: com.kubi.config.kcrc.KCRemoteConfigFetcher$recursiveFetch$2

            /* JADX INFO: renamed from: com.kubi.config.kcrc.KCRemoteConfigFetcher$recursiveFetch$2$a */
            /* JADX INFO: compiled from: KCRemoteConfigUtils.kt */
            @Metadata(m90083d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m90084d2 = {"", "run", "()V", "<anonymous>"}, m90085k = 3, m90086mv = {1, 7, 1})
            public static final class RunnableC11413a implements Runnable {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f19669b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ long f19670c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f19671d;

                public RunnableC11413a(long j11, long j12, boolean z11) {
                    this.f19669b = j11;
                    this.f19670c = j12;
                    this.f19671d = z11;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Function1<Throwable, Unit> function1M20447c;
                    try {
                        KCRemoteConfigFetcher.f19652a.m20534N("retry", this.f19669b, this.f19670c, this.f19671d);
                    } catch (Exception e11) {
                        Config configM20528H = KCRemoteConfigFetcher.f19652a.m20528H();
                        if (configM20528H == null || (function1M20447c = configM20528H.m20447c()) == null) {
                            return;
                        }
                        function1M20447c.invoke(e11);
                    }
                }
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                if (isFirst) {
                    C11430p c11430p = C11430p.f19709a;
                    Config config3 = config2;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    c11430p.m20572a(config3, it);
                }
                C11425k.m20563b(fetchBy, false, String.valueOf(it.getMessage()));
                if (KCRemoteConfigFetcher.retryAllCount >= config2.getKcParam().getRetryCount() || KCRemoteConfigFetcher.f19652a.m20533M()) {
                    KCRemoteConfigFetcher.retryAllCount = 0;
                    KCRemoteConfigFetcher.allFetching.set(false);
                    if (isFirst) {
                        return;
                    }
                    KCRemoteConfigCache.m20478n(KCRemoteConfigFetcher.f19652a.m20527G(), false, 1, null);
                    return;
                }
                KCRemoteConfigFetcher.retryAllCount++;
                C42918h.m94142b(2L, TimeUnit.SECONDS, new RunnableC11413a(beginId, version, isFirst));
            }
        };
        observableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.kubi.config.kcrc.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KCRemoteConfigFetcher.m20493P(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m20535Q(boolean clean) {
        PublishSubject<Boolean> publishSubject2 = publishSubject;
        if (publishSubject2 != null) {
            publishSubject2.onNext(Boolean.TRUE);
        }
        m20527G().m20484m(clean);
        if (pushVersion > currentVersion) {
            m20525C("websocket");
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m20536S(boolean restart, final boolean delay) {
        C11426l.m20571d("resetPoll. restart=" + restart);
        final Config config2 = config;
        if (config2 == null) {
            return;
        }
        C11426l.m20569b(disposableInterval);
        if (restart) {
            long jCoerceAtLeast = RangesKt.coerceAtLeast(config2.getKcParam().getIntervalDuration(), C11416b.f19681a.m20554b());
            long j11 = delay ? jCoerceAtLeast : 0L;
            C11426l.m20571d("resetPoll. start interval with " + jCoerceAtLeast + 's');
            Observable<Long> observableInterval = Observable.interval(j11, jCoerceAtLeast, TimeUnit.SECONDS, C42916f.m94127f());
            final Function1<Long, Unit> function1 = new Function1<Long, Unit>() { // from class: com.kubi.config.kcrc.KCRemoteConfigFetcher$resetPoll$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
                    invoke2(l11);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Long l11) {
                    String str = "loop";
                    if (l11 != null && l11.longValue() == 0 && delay) {
                        str = "on_foreground";
                    }
                    KCRemoteConfigFetcher.f19652a.m20525C(str);
                }
            };
            Consumer<? super Long> consumer = new Consumer() { // from class: com.kubi.config.kcrc.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KCRemoteConfigFetcher.m20496U(function1, obj);
                }
            };
            final Function1<Throwable, Unit> function2 = new Function1<Throwable, Unit>() { // from class: com.kubi.config.kcrc.KCRemoteConfigFetcher$resetPoll$2
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    invoke2(th2);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable it) {
                    Function1<Throwable, Unit> function1M20447c = config2.m20447c();
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    function1M20447c.invoke(it);
                    KCRemoteConfigFetcher.f19652a.m20536S(true, delay);
                }
            };
            disposableInterval = observableInterval.subscribe(consumer, new Consumer() { // from class: com.kubi.config.kcrc.e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KCRemoteConfigFetcher.m20497V(function2, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m20537z() {
        KCRemoteConfigParam kcParam;
        String strRealCountry = null;
        String strM66369j = DataMapUtil.m66369j(DataMapUtil.f54245a, "key_kc_remote_config_lcc", null, 2, null);
        if (strM66369j.length() == 0) {
            return true;
        }
        Config config2 = config;
        if (config2 != null && (kcParam = config2.getKcParam()) != null) {
            strRealCountry = kcParam.realCountry();
        }
        return !StringsKt.equals(strM66369j, C27041f.m66668h(strRealCountry), true);
    }

    /* JADX INFO: renamed from: M */
    public final boolean m20533M() {
        return !NetworkUtils.m6063k();
    }
}
