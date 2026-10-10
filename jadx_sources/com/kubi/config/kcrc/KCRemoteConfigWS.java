package com.kubi.config.kcrc;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.config.Config;
import com.kubi.network.websocket.DefaultWebSocketClient;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.SocketRequest;
import com.kubi.utils.extensions.C27041f;
import er.C37237b;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o00.C42918h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.random.Random;

/* JADX INFO: compiled from: KCRemoteConfigWS.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u0003J\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, m90084d2 = {"Lcom/kubi/config/kcrc/KCRemoteConfigWS;", "", "<init>", "()V", "Lcom/kubi/config/Config;", "conf", "Lkotlin/Function1;", "", "", "versionTrigger", "Lkotlin/Function0;", "requestTrigger", "i", "(Lcom/kubi/config/Config;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "m", "Lcom/kubi/network/websocket/model/Message;", "msg", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/kubi/network/websocket/model/Message;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/jvm/functions/Function1;", "b", "Lkotlin/jvm/functions/Function0;", "Lio/reactivex/disposables/Disposable;", "c", "Lio/reactivex/disposables/Disposable;", "disposable", "", "d", "Ljava/lang/String;", "topic", "e", "J", "delayWhenPush", "", "f", "Z", "isDelaying", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "Ljava/util/concurrent/atomic/AtomicBoolean;", "subscribe", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class KCRemoteConfigWS {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Function1<? super Long, Unit> versionTrigger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> requestTrigger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Disposable disposable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String topic;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isDelaying;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long delayWhenPush = 10;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean subscribe = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.kubi.config.kcrc.KCRemoteConfigWS$a */
    /* JADX INFO: compiled from: KCRemoteConfigUtils.kt */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m90083d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m90084d2 = {"", "run", "()V", "<anonymous>"}, m90085k = 3, m90086mv = {1, 7, 1})
    public static final class RunnableC11414a implements Runnable {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f19680c;

        public RunnableC11414a(long j11) {
            this.f19680c = j11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Function1<Throwable, Unit> function1M20447c;
            try {
                KCRemoteConfigWS.this.isDelaying = false;
                C11426l.m20571d("websocket trigger. invoke after " + this.f19680c + 's');
                Function0 function0 = KCRemoteConfigWS.this.requestTrigger;
                if (function0 != null) {
                    function0.invoke();
                }
            } catch (Exception e11) {
                Config configM20528H = KCRemoteConfigFetcher.f19652a.m20528H();
                if (configM20528H == null || (function1M20447c = configM20528H.m20447c()) == null) {
                    return;
                }
                function1M20447c.invoke(e11);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m20545j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public static final void m20546k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: renamed from: l */
    public static final void m20547l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: renamed from: h */
    public final void m20548h(Message msg) {
        Object objM103844constructorimpl;
        if (this.topic != null) {
            if (Intrinsics.areEqual(msg != null ? msg.getTopic() : null, this.topic) && this.subscribe.get()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("websocket trigger. msg=");
                sb2.append(msg != null ? msg.getData() : null);
                C11426l.m20571d(sb2.toString());
                try {
                    Result.Companion companion = Result.INSTANCE;
                    String data = msg != null ? msg.getData() : null;
                    Intrinsics.checkNotNull(data);
                    objM103844constructorimpl = Result.m103844constructorimpl(Long.valueOf(new JSONObject(data).optLong("version", -1L)));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                    objM103844constructorimpl = -1L;
                }
                long jLongValue = ((Number) objM103844constructorimpl).longValue();
                if (jLongValue == -1) {
                    return;
                }
                Function1<? super Long, Unit> function1 = this.versionTrigger;
                if (function1 != null) {
                    function1.invoke(Long.valueOf(jLongValue));
                }
                if (this.isDelaying) {
                    return;
                }
                this.isDelaying = true;
                long jNextLong = Random.INSTANCE.nextLong(this.delayWhenPush);
                C42918h.m94142b(jNextLong, TimeUnit.SECONDS, new RunnableC11414a(jNextLong));
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m20549i(@NotNull Config conf, @NotNull Function1<? super Long, Unit> versionTrigger, @NotNull Function0<Unit> requestTrigger) {
        Function1<Throwable, Unit> function1M20447c;
        Intrinsics.checkNotNullParameter(conf, "conf");
        Intrinsics.checkNotNullParameter(versionTrigger, "versionTrigger");
        Intrinsics.checkNotNullParameter(requestTrigger, "requestTrigger");
        this.versionTrigger = versionTrigger;
        this.requestTrigger = requestTrigger;
        this.topic = "/remoteConfig/version:" + conf.getKcParam().getAppId();
        this.delayWhenPush = conf.getKcParam().getMaxDelayAfterPush();
        try {
            if (C37237b.m83283f("network/channel_default") && this.subscribe.compareAndSet(false, true)) {
                C11426l.m20569b(this.disposable);
                DefaultWebSocketClient.Companion companion = DefaultWebSocketClient.INSTANCE;
                Observable<Message> observableSubscribeOn = companion.get().m43111e().subscribeOn(Schedulers.m87969io());
                final Function1<Message, Boolean> function1 = new Function1<Message, Boolean>() { // from class: com.kubi.config.kcrc.KCRemoteConfigWS$subscribe$1
                    @Override // p852kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull Message it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), this.this$0.topic));
                    }

                    {
                        super(1);
                    }
                };
                Observable<Message> observableFilter = observableSubscribeOn.filter(new Predicate() { // from class: com.kubi.config.kcrc.m
                    @Override // io.reactivex.functions.Predicate
                    public final boolean test(Object obj) {
                        return KCRemoteConfigWS.m20545j(function1, obj);
                    }
                });
                final Function1<Message, Unit> function2 = new Function1<Message, Unit>() { // from class: com.kubi.config.kcrc.KCRemoteConfigWS$subscribe$2
                    @Override // p852kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Message message) {
                        invoke2(message);
                        return Unit.INSTANCE;
                    }

                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Message message) {
                        this.this$0.m20548h(message);
                    }
                };
                Consumer<? super Message> consumer = new Consumer() { // from class: com.kubi.config.kcrc.n
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        KCRemoteConfigWS.m20546k(function2, obj);
                    }
                };
                final KCRemoteConfigWS$subscribe$3 kCRemoteConfigWS$subscribe$3 = new Function1<Throwable, Unit>() { // from class: com.kubi.config.kcrc.KCRemoteConfigWS$subscribe$3
                    @Override // p852kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                        invoke2(th2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Function1<Throwable, Unit> function1M20447c2;
                        Config configM20528H = KCRemoteConfigFetcher.f19652a.m20528H();
                        if (configM20528H == null || (function1M20447c2 = configM20528H.m20447c()) == null) {
                            return;
                        }
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        function1M20447c2.invoke(it);
                    }
                };
                this.disposable = observableFilter.subscribe(consumer, new Consumer() { // from class: com.kubi.config.kcrc.o
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        KCRemoteConfigWS.m20547l(kCRemoteConfigWS$subscribe$3, obj);
                    }
                });
                companion.get().m43108b(new SocketRequest(null, "subscribe", C27041f.m66668h(this.topic), false, 9, null));
                C11426l.m20571d("KCRC.subscribe, topic=" + this.topic);
            }
        } catch (Throwable th2) {
            Config configM20528H = KCRemoteConfigFetcher.f19652a.m20528H();
            if (configM20528H == null || (function1M20447c = configM20528H.m20447c()) == null) {
                return;
            }
            function1M20447c.invoke(th2);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m20550m() {
        Object objM103844constructorimpl;
        Config configM20528H;
        Function1<Throwable, Unit> function1M20447c;
        this.subscribe.set(false);
        try {
            Result.Companion companion = Result.INSTANCE;
            C11426l.m20569b(this.disposable);
            if (C37237b.m83283f("network/channel_default")) {
                DefaultWebSocketClient.INSTANCE.get().m43108b(new SocketRequest(null, "unsubscribe", C27041f.m66668h(this.topic), false, 9, null));
                C11426l.m20571d("KCRC.unSubscribe, topic=" + this.topic);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl == null || (configM20528H = KCRemoteConfigFetcher.f19652a.m20528H()) == null || (function1M20447c = configM20528H.m20447c()) == null) {
            return;
        }
        function1M20447c.invoke(thM103847exceptionOrNullimpl);
    }
}
