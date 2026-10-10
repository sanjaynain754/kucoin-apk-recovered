package g10;

import android.annotation.SuppressLint;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.SocketRequest;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseUiActivity;
import com.kubi.sdk.function.looper.KuCoinLooper;
import com.tencent.qcloud.tuicore.TUIConstants;
import dz.C36993c;
import io.reactivex.functions.Action;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: g10.r */
/* JADX INFO: compiled from: WsDataHelper.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0001¢\u0006\u0002\b\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\bJ\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0011J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u000eJ\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u000eJ\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eJ\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#H\u0007J\u0006\u0010$\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/sdk/websocket/WsDataHelper;", "Landroidx/lifecycle/LifecycleObserver;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "msgObs", "Lio/reactivex/subjects/PublishSubject;", "Lcom/kubi/network/websocket/model/Message;", "kotlin.jvm.PlatformType", "getMsgObs", "()Lio/reactivex/subjects/PublishSubject;", "msgList", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlin/Pair;", "isUserLooper", "", "isVisibleToUser", "onDestroy", "", TUIConstants.TUIChat.OWNER, "onDestroy$LWebSocket_googleRelease", "useLooper", "onMsgReceived", "msg", "toggleSubscribe", "isSub", "unSubTopic", "topic", "subTopic", "registerData", TypedValues.Custom.S_STRING, "startRegister", "call", "Lio/reactivex/functions/Action;", "connectSucceed", "LWebSocket_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"WrongConstant"})
@Deprecated(message = "please use CompositeObservable class")
@SourceDebugExtension({"SMAP\nWsDataHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WsDataHelper.kt\ncom/kubi/sdk/websocket/WsDataHelper\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,174:1\n19#2,2:175\n*S KotlinDebug\n*F\n+ 1 WsDataHelper.kt\ncom/kubi/sdk/websocket/WsDataHelper\n*L\n59#1:175,2\n*E\n"})
public final class C37787r implements LifecycleObserver {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LifecycleOwner f85101b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final PublishSubject<Message> f85102c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final ConcurrentHashMap<String, Pair<String, String>> f85103d;

    /* JADX INFO: renamed from: e */
    public boolean f85104e;

    /* JADX INFO: renamed from: f */
    public boolean f85105f;

    public C37787r(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f85101b = lifecycleOwner;
        PublishSubject<Message> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        this.f85102c = publishSubjectCreate;
        this.f85103d = new ConcurrentHashMap<>();
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    /* JADX INFO: renamed from: l */
    public static final void m85228l(final C37787r c37787r) {
        KuCoinLooper.INSTANCE.addTask(new C36993c.b(c37787r.f85101b.toString()).m82827g(c37787r.f85101b).m82829i(5L).m82826f(new Runnable() { // from class: g10.q
            @Override // java.lang.Runnable
            public final void run() {
                C37787r.m85229m(this.f85100b);
            }
        }).m82828h());
    }

    /* JADX INFO: renamed from: m */
    public static final void m85229m(C37787r c37787r) {
        LifecycleOwner lifecycleOwner = c37787r.f85101b;
        if (lifecycleOwner instanceof InterfaceC37770a) {
            if (!(lifecycleOwner instanceof BaseFragment) || !((BaseFragment) lifecycleOwner).isShowing()) {
                LifecycleOwner lifecycleOwner2 = c37787r.f85101b;
                if (!(lifecycleOwner2 instanceof BaseUiActivity) || !((BaseUiActivity) lifecycleOwner2).m56589d0()) {
                    return;
                }
            }
            ((InterfaceC37770a) c37787r.f85101b).mo22379g(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m85230c() {
        boolean z11 = this.f85105f;
        if (z11) {
            m85236i(z11);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final PublishSubject<Message> m85231d() {
        return this.f85102c;
    }

    /* JADX INFO: renamed from: e */
    public final void m85232e(@NotNull Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        m85238k(false);
        if (!Intrinsics.areEqual(msg.getSubject(), "trade.snapshot")) {
            this.f85102c.onNext(msg);
            return;
        }
        PublishSubject<Message> publishSubject = this.f85102c;
        Message message = new Message();
        message.setId(msg.getId());
        message.setSource(msg.getSource());
        message.setTopic(msg.getTopic());
        message.setSubject(msg.getSubject());
        message.setUserId(msg.getUserId());
        message.setData(new JSONObject(msg.getData()).optString("data"));
        message.setExtension(msg.getExtension());
        publishSubject.onNext(message);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final PublishSubject<Message> m85233f(@NotNull String topic, @NotNull String string) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(string, "string");
        synchronized (this.f85103d) {
            this.f85103d.put(topic + string, new Pair<>(topic, string));
            Unit unit = Unit.INSTANCE;
        }
        C37784o c37784o = C37784o.f85096a;
        String str = String.format(topic, Arrays.copyOf(new Object[]{string}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        m85238k(!c37784o.m85225i(this, new SocketRequest(null, "subscribe", str, false, 9, null)));
        this.f85105f = true;
        return this.f85102c;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: g */
    public final void m85234g(@NotNull Action call) throws Exception {
        Intrinsics.checkNotNullParameter(call, "call");
        m85236i(false);
        synchronized (this.f85103d) {
            this.f85103d.clear();
            Unit unit = Unit.INSTANCE;
        }
        call.run();
    }

    /* JADX INFO: renamed from: h */
    public final void m85235h(@NotNull String topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        C37784o.f85096a.m85225i(this, new SocketRequest(null, "subscribe", topic, false, 9, null));
    }

    /* JADX INFO: renamed from: i */
    public final void m85236i(boolean z11) {
        SocketRequest socketRequest;
        this.f85105f = z11;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f85103d) {
            try {
                for (Map.Entry<String, Pair<String, String>> entry : this.f85103d.entrySet()) {
                    if (z11) {
                        String str = String.format(entry.getValue().getFirst(), Arrays.copyOf(new Object[]{entry.getValue().getSecond()}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        socketRequest = new SocketRequest(null, "subscribe", str, false, 9, null);
                    } else {
                        String str2 = String.format(entry.getValue().getFirst(), Arrays.copyOf(new Object[]{entry.getValue().getSecond()}, 1));
                        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                        socketRequest = new SocketRequest(null, "unsubscribe", str2, false, 9, null);
                    }
                    arrayList.add(socketRequest);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            m85238k(!C37784o.f85096a.m85225i(this, (SocketRequest) next));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m85237j(@NotNull String topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        C37784o.f85096a.m85225i(this, new SocketRequest(null, "unsubscribe", topic, false, 9, null));
    }

    /* JADX INFO: renamed from: k */
    public final void m85238k(boolean z11) {
        if (z11 == this.f85104e) {
            return;
        }
        this.f85104e = z11;
        if (!z11) {
            KuCoinLooper.INSTANCE.removeTask(this.f85101b.toString());
        } else {
            C42917g.m94139e().execute(new Runnable() { // from class: g10.p
                @Override // java.lang.Runnable
                public final void run() {
                    C37787r.m85228l(this.f85099b);
                }
            });
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy$LWebSocket_googleRelease(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        synchronized (this.f85103d) {
            this.f85103d.clear();
            Unit unit = Unit.INSTANCE;
        }
        C37784o.f85096a.m85224h(this);
        owner.getLifecycle().removeObserver(this);
    }
}
