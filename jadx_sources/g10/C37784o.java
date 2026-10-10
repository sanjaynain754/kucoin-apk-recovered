package g10;

import com.kubi.network.websocket.DefaultWebSocketClient;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.SocketRequest;
import com.kubi.utils.C27058k0;
import fr.InterfaceC37583d;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: g10.o */
/* JADX INFO: compiled from: WebSocketManager.kt */
/* JADX INFO: loaded from: classes43.dex */
@Deprecated(message = "please use WebSocketClient class")
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u0018\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\nH\u0002J\u0006\u0010\u0016\u001a\u00020\u000fR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/websocket/WebSocketManager;", "", "<init>", "()V", "dataHelperContainer", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/kubi/sdk/websocket/WsDataHelper;", "", "globalMsgObs", "Lio/reactivex/subjects/PublishSubject;", "Lcom/kubi/network/websocket/model/Message;", "kotlin.jvm.PlatformType", "getGlobalMsgObs", "()Lio/reactivex/subjects/PublishSubject;", "removeDataHelper", "", "wsDataHelper", "sendMsg", "request", "Lcom/kubi/network/websocket/model/SocketRequest;", "dispatchMessage", "msg", "clearAllSub", "LWebSocket_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebSocketManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketManager.kt\ncom/kubi/sdk/websocket/WebSocketManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1869#2,2:89\n1869#2,2:91\n*S KotlinDebug\n*F\n+ 1 WebSocketManager.kt\ncom/kubi/sdk/websocket/WebSocketManager\n*L\n77#1:89,2\n83#1:91,2\n*E\n"})
public final class C37784o {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37784o f85096a = new C37784o();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ConcurrentHashMap<C37787r, Boolean> f85097b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final PublishSubject<Message> f85098c;

    /* JADX INFO: renamed from: g10.o$a */
    /* JADX INFO: compiled from: WebSocketManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/kubi/sdk/websocket/WebSocketManager$1", "Lcom/kubi/network/api/core/IConnectCallback;", "onConnected", "", "onDisconnect", "LWebSocket_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nWebSocketManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketManager.kt\ncom/kubi/sdk/websocket/WebSocketManager$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1869#2,2:89\n1869#2,2:91\n*S KotlinDebug\n*F\n+ 1 WebSocketManager.kt\ncom/kubi/sdk/websocket/WebSocketManager$1\n*L\n35#1:89,2\n40#1:91,2\n*E\n"})
    public static final class a implements InterfaceC37583d {
        @Override // fr.InterfaceC37583d
        public void onDisconnect() {
            if (C27058k0.f54342a.m66755e()) {
                Set setKeySet = C37784o.f85097b.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    ((C37787r) it.next()).m85238k(true);
                }
            }
        }

        @Override // fr.InterfaceC37583d
        public void onConnected() {
            Set setKeySet = C37784o.f85097b.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                ((C37787r) it.next()).m85230c();
            }
        }

        @Override // fr.InterfaceC37583d
        public void onConnecting() {
            InterfaceC37583d.a.m84721b(this);
        }
    }

    static {
        PublishSubject<Message> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        f85098c = publishSubjectCreate;
        DefaultWebSocketClient.Companion companion = DefaultWebSocketClient.INSTANCE;
        companion.get().m43112g(new a());
        Observable<Message> observableSubscribeOn = companion.get().m43111e().subscribeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: g10.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37784o.m85219c((Message) obj);
            }
        };
        observableSubscribeOn.subscribe(new Consumer() { // from class: g10.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C37784o.m85220d(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m85222f() {
        Set<C37787r> setKeySet = f85097b.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            ((C37787r) it.next()).m85236i(false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m85223g(Message message) {
        f85098c.onNext(message);
        Set<C37787r> setKeySet = f85097b.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            ((C37787r) it.next()).m85232e(message);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m85224h(@NotNull C37787r wsDataHelper) {
        Intrinsics.checkNotNullParameter(wsDataHelper, "wsDataHelper");
        f85097b.remove(wsDataHelper);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m85225i(@Nullable C37787r c37787r, @NotNull SocketRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (c37787r != null) {
            ConcurrentHashMap<C37787r, Boolean> concurrentHashMap = f85097b;
            if (!concurrentHashMap.contains(c37787r)) {
                concurrentHashMap.put(c37787r, Boolean.TRUE);
            }
        }
        DefaultWebSocketClient.Companion companion = DefaultWebSocketClient.INSTANCE;
        companion.get().m43108b(request);
        return companion.get().m43110d();
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m85219c(Message message) {
        if (Intrinsics.areEqual(message.getSource(), "socket")) {
            C37784o c37784o = f85096a;
            Intrinsics.checkNotNull(message);
            c37784o.m85223g(message);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static final void m85220d(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
