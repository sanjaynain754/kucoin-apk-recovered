package com.kubi.sdk.websocket;

import com.kubi.mvi.common.MviExKt;
import com.kubi.mvi.p102vm.InterfaceC19307b;
import com.kubi.mvi.p102vm.InterfaceC19308c;
import com.kubi.mvi.p102vm.WidgetLifeEvent;
import com.kubi.network.websocket.model.HeartbeatRequest;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.SocketRequest;
import com.kubi.network.websocket.observable.C19406c;
import com.kubi.network.websocket.observable.C19409f;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.websocket.SocketTask;
import com.tencent.qcloud.tuicore.TUIConstants;
import g10.C37779j;
import g10.C37781l;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SocketTask.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 92\u00020\u0001:\u00019B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u001b\u001a\u00020\u0018*\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u0003H\u0002J\u0016\u0010\u001d\u001a\u00020\u0018*\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u0003H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\u0016\u0010 \u001a\u00020\u00002\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\"J\u001a\u0010#\u001a\u00020\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u0016J\u001a\u0010%\u001a\u00020\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0002J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170,H\u0002J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0017H\u0002J\u0010\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020\u0003H\u0002J\u0006\u00102\u001a\u00020\u0018J\b\u00103\u001a\u00020\u0018H\u0002J\b\u00104\u001a\u00020\u0018H\u0016J\b\u00105\u001a\u00020\u0018H\u0002J\b\u00106\u001a\u00020\u0018H\u0016J\u0006\u00107\u001a\u00020\u0018J\b\u00108\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, m90084d2 = {"Lcom/kubi/sdk/websocket/SocketTask;", "Lcom/kubi/mvi/vm/WidgetLifecycleObserver;", "mTopic", "", "widgetLifecycleOwner", "Lcom/kubi/mvi/vm/WidgetLifecycleOwner;", "config", "Lcom/kubi/sdk/websocket/SocketTaskConfig;", "<init>", "(Ljava/lang/String;Lcom/kubi/mvi/vm/WidgetLifecycleOwner;Lcom/kubi/sdk/websocket/SocketTaskConfig;)V", "getMTopic", "()Ljava/lang/String;", "getWidgetLifecycleOwner", "()Lcom/kubi/mvi/vm/WidgetLifecycleOwner;", "getConfig", "()Lcom/kubi/sdk/websocket/SocketTaskConfig;", "filterTopicList", "", "logTag", "dispose", "Lio/reactivex/disposables/Disposable;", "messageCallback", "Lkotlin/Function1;", "Lcom/kubi/network/websocket/model/Message;", "", "isSubscribe", "Ljava/util/concurrent/atomic/AtomicBoolean;", "log", "tag", "logData", "startReceiveMessage", "stopReceiveMessage", "setFilterTopic", "topicList", "", "bindData", "block", "bindMessage", "createSubscribeHeartbeatRequest", "Lcom/kubi/network/websocket/model/HeartbeatRequest;", "request", "Lokhttp3/Request;", "createUnsubscribeHeartbeatRequest", "subscribeSocketByObservable", "Lio/reactivex/Observable;", "filterMessage", "", "it", "filterTopic", "topic", "unBindSocket", "subscribeSocket", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "checkNeedStartReceiveMessage", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "onDestroy", "Companion", "LWebSocket_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSocketTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketTask.kt\ncom/kubi/sdk/websocket/SocketTask\n+ 2 WebSocketIssue.kt\ncom/kubi/sdk/websocket/WebSocketIssueKt\n*L\n1#1,312:1\n46#2,2:313\n*S KotlinDebug\n*F\n+ 1 SocketTask.kt\ncom/kubi/sdk/websocket/SocketTask\n*L\n113#1:313,2\n*E\n"})
public final class SocketTask implements InterfaceC19307b {

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Companion f48571i = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f48572a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC19308c f48573b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final C37779j f48574c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public List<String> f48575d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final String f48576e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Disposable f48577f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Function1<? super Message, Unit> f48578g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public AtomicBoolean f48579h;

    /* JADX INFO: compiled from: SocketTask.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/websocket/SocketTask$Companion;", "", "<init>", "()V", "obtain", "Lcom/kubi/sdk/websocket/SocketTask;", "topic", "", "widgetLifecycleOwner", "Lcom/kubi/mvi/vm/WidgetLifecycleOwner;", "config", "Lcom/kubi/sdk/websocket/SocketTaskConfig;", "LWebSocket_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final synchronized SocketTask obtain(@NotNull String topic, @NotNull InterfaceC19308c widgetLifecycleOwner, @NotNull C37779j config) {
            SocketTask socketTaskM85215e;
            try {
                Intrinsics.checkNotNullParameter(topic, "topic");
                Intrinsics.checkNotNullParameter(widgetLifecycleOwner, "widgetLifecycleOwner");
                Intrinsics.checkNotNullParameter(config, "config");
                socketTaskM85215e = C37781l.f85093a.m85215e(topic, widgetLifecycleOwner);
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (socketTaskM85215e != null) {
                    SocketTask.m58905v(socketTaskM85215e, "缓存池中有 SocketHelper Topic->" + topic + " widgetLifecycleOwner->" + widgetLifecycleOwner, null, 1, null);
                } else {
                    socketTaskM85215e = new SocketTask(topic, widgetLifecycleOwner, config, defaultConstructorMarker);
                    SocketTask.m58905v(socketTaskM85215e, "新建 SocketHelper Topic->" + topic + " widgetLifecycleOwner->" + widgetLifecycleOwner, null, 1, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return socketTaskM85215e;
        }

        public Companion() {
        }

        public static /* synthetic */ SocketTask obtain$default(Companion companion, String str, InterfaceC19308c interfaceC19308c, C37779j c37779j, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                c37779j = new C37779j();
            }
            return companion.obtain(str, interfaceC19308c, c37779j);
        }
    }

    public /* synthetic */ SocketTask(String str, InterfaceC19308c interfaceC19308c, C37779j c37779j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC19308c, c37779j);
    }

    /* JADX INFO: renamed from: F */
    public final void m58908F() {
        synchronized (this) {
            try {
                m58905v(this, "subscribeSocket topic:" + this.f48572a + " start isSubscribe->" + this.f48579h + ' ' + this, null, 1, null);
                if (this.f48579h.getAndSet(true)) {
                    m58905v(this, "已经订阅过:" + this.f48572a + ' ' + this, null, 1, null);
                } else {
                    m58905v(this, "开始监听 Socket:Topic:" + this.f48572a + ' ' + this, null, 1, null);
                    m58924z();
                    m58905v(this, "subscribeSocket topic:" + this.f48572a + " end isSubscribe->" + this.f48579h + ' ' + this, null, 1, null);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m58910J() {
        synchronized (this) {
            try {
                m58905v(this, "unBindSocket topic:" + this.f48572a + "  start isSubscribe->" + this.f48579h + ' ' + this, null, 1, null);
                if (this.f48579h.getAndSet(false)) {
                    m58905v(this, "注销Socket Topic:" + this.f48572a, null, 1, null);
                    m58907E();
                    m58905v(this, "topic:" + this.f48572a + " unBindSocket end->" + this.f48579h + ' ' + this, null, 1, null);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m58918r(String str) {
        boolean z11;
        synchronized (this) {
            z11 = Intrinsics.areEqual(this.f48572a, str) || this.f48575d.contains(str);
        }
        return z11;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final SocketTask m58923y(@Nullable List<String> list) {
        synchronized (this) {
            if (list != null) {
                this.f48575d.clear();
                this.f48575d.addAll(list);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: z */
    public final void m58924z() {
        synchronized (this) {
            try {
                m58905v(this, "topic->" + this.f48572a + " 开始接收消息", null, 1, null);
                Disposable disposable = this.f48577f;
                if (disposable != null) {
                    disposable.dispose();
                }
                Observable<Message> observableM58909G = m58909G();
                final Function1 function1 = new Function1() { // from class: g10.c
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SocketTask.m58891A(this.f85082b, (Message) obj);
                    }
                };
                Consumer<? super Message> consumer = new Consumer() { // from class: g10.d
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        SocketTask.m58892B(function1, obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: g10.e
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SocketTask.m58893C(this.f85084b, (Throwable) obj);
                    }
                };
                this.f48577f = observableM58909G.subscribe(consumer, new Consumer() { // from class: g10.f
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        SocketTask.m58894D(function2, obj);
                    }
                });
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public SocketTask(String str, InterfaceC19308c interfaceC19308c, C37779j c37779j) {
        this.f48572a = str;
        this.f48573b = interfaceC19308c;
        this.f48574c = c37779j;
        this.f48575d = new ArrayList();
        this.f48576e = "socket";
        this.f48579h = new AtomicBoolean(false);
        if (str == null || str.length() == 0) {
            return;
        }
        m58905v(this, "绑定Topic->" + str + " widgetLifecycleOwner->" + interfaceC19308c, null, 1, null);
        C37781l.f85093a.m85212b(this);
        interfaceC19308c.getWidgetLifecycle().m42727a(this);
        m58908F();
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m58891A(SocketTask socketTask, Message message) {
        m58905v(socketTask, socketTask.f48572a + "->收到socket消息 " + socketTask, null, 1, null);
        m58906x(socketTask, "==================\n收到Socket消息->Topic:" + message.getTopic() + " 类型:" + message.getSource() + " \n数据:" + message.getData() + "\n==================", null, 1, null);
        Function1<? super Message, Unit> function1 = socketTask.f48578g;
        if (function1 != null) {
            Intrinsics.checkNotNull(message);
            function1.invoke(message);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m58893C(SocketTask socketTask, Throwable th2) {
        C44128b.m97262f("socket", "Topic->" + socketTask.f48572a + " widgetLifecycleOwner->" + socketTask.f48573b + " ReceiveMessage error", th2);
        Intrinsics.checkNotNull(th2);
        if (!C42899b.m94075e(th2)) {
            C43846g.m96568c(new WebSocketException(th2, "Socket", false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m58895H(SocketTask socketTask, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        m58905v(socketTask, "topic:" + socketTask.f48572a + " ------>receive topic:" + it.getTopic(), null, 1, null);
        return socketTask.m58917q(it);
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m58896I(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m58904k(Function1 function1, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String data = it.getData();
        if (data != null) {
            function1.invoke(data);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m58905v(SocketTask socketTask, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "socket";
        }
        socketTask.m58921u(str, str2);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m58906x(SocketTask socketTask, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "socket_data";
        }
        socketTask.m58922w(str, str2);
    }

    /* JADX INFO: renamed from: E */
    public final void m58907E() {
        m58905v(this, "topic->" + this.f48572a + " 停止接收消息", null, 1, null);
        synchronized (this) {
            Disposable disposable = this.f48577f;
            if (disposable != null) {
                disposable.dispose();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final Observable<Message> m58909G() {
        Observable c19409f;
        Observable<Message> observableFilter;
        m58905v(this, "subscribeSocketByObservable topic:" + this.f48572a, null, 1, null);
        synchronized (this) {
            try {
                Request f85090b = this.f48574c.getF85090b();
                if (f85090b != null) {
                    com.kubi.network.websocket.model.Request.Companion companion = com.kubi.network.websocket.model.Request.INSTANCE;
                    c19409f = new C19406c(companion.subscribe(m58914n(f85090b), this.f48572a), companion.unsubscribe(m58915o(f85090b), this.f48572a), null, false, null, 28, null);
                } else {
                    c19409f = new C19409f(new SocketRequest(null, "subscribe", this.f48572a, false, 9, null), new SocketRequest(null, "unsubscribe", this.f48572a, false, 9, null), null, 4, null);
                }
                Observable observableM42515k = MviExKt.m42515k(c19409f);
                final Function1 function1 = new Function1() { // from class: g10.h
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(SocketTask.m58895H(this.f85087b, (Message) obj));
                    }
                };
                observableFilter = observableM42515k.filter(new Predicate() { // from class: g10.i
                    @Override // io.reactivex.functions.Predicate
                    public final boolean test(Object obj) {
                        return SocketTask.m58896I(function1, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return observableFilter;
    }

    @Override // com.kubi.mvi.p102vm.InterfaceC19307b
    /* JADX INFO: renamed from: a */
    public void mo42733a() {
        m58905v(this, this.f48572a + "->onShow", null, 1, null);
        m58908F();
    }

    @Override // com.kubi.mvi.p102vm.InterfaceC19307b
    /* JADX INFO: renamed from: b */
    public void mo42734b() {
        m58905v(this, this.f48572a + "->onHide", null, 1, null);
        m58910J();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final SocketTask m58911j(@NotNull final Function1<? super String, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f48578g = new Function1() { // from class: g10.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SocketTask.m58904k(block, (Message) obj);
            }
        };
        m58913m();
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final SocketTask m58912l(@NotNull Function1<? super Message, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f48578g = block;
        m58913m();
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final void m58913m() {
        if (this.f48573b.getWidgetLifecycle().getCurrentWidgetLifeEvent().compareTo(WidgetLifeEvent.ON_SHOW) >= 0) {
            m58908F();
        }
    }

    /* JADX INFO: renamed from: n */
    public final HeartbeatRequest m58914n(Request request) {
        return new HeartbeatRequest("subscribe", request, this.f48574c.getF85089a(), false, 0, 0, 56, null);
    }

    /* JADX INFO: renamed from: o */
    public final HeartbeatRequest m58915o(Request request) {
        return new HeartbeatRequest("unsubscribe", request, this.f48574c.getF85089a(), false, 0, 0, 56, null);
    }

    @Override // com.kubi.mvi.p102vm.InterfaceC19307b
    public void onDestroy() {
        m58905v(this, "销毁 Topic->" + this.f48572a + ' ' + this, null, 1, null);
        m58910J();
        this.f48578g = null;
        C37781l.f85093a.m85216f(this);
    }

    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getF48572a() {
        return this.f48572a;
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final InterfaceC19308c getF48573b() {
        return this.f48573b;
    }

    /* JADX INFO: renamed from: B */
    public static final void m58892B(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D */
    public static final void m58894D(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p */
    public final void m58916p() {
        onDestroy();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX INFO: renamed from: q */
    public final boolean m58917q(Message message) {
        boolean z11;
        boolean zBooleanValue;
        if (!Intrinsics.areEqual(message.getSource(), "heartbeat") && !m58918r(message.getTopic())) {
            Function1<Message, Boolean> function1M85204a = this.f48574c.m85204a();
            z11 = false;
            if (function1M85204a != null) {
                zBooleanValue = function1M85204a.invoke(message).booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                z11 = true;
            }
        } else {
            z11 = true;
        }
        m58905v(this, "topic:" + this.f48572a + " ------>receive topic:" + message.getTopic() + " filter result:" + z11, null, 1, null);
        return z11;
    }

    /* JADX INFO: renamed from: u */
    public final void m58921u(String str, String str2) {
        C44128b.m97259c(str2, str);
    }

    /* JADX INFO: renamed from: w */
    public final void m58922w(String str, String str2) {
        C44128b.m97259c(str2, str);
    }
}
