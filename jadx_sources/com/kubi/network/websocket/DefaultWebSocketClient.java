package com.kubi.network.websocket;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkMessage;
import com.kubi.network.websocket.DefaultWebSocketClient;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.SocketRequest;
import com.tencent.qcloud.tuicore.TUIConstants;
import er.C37237b;
import er.InterfaceC37236a;
import fr.InterfaceC37583d;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlinx.coroutines.rx2.RxConvertKt;
import org.jetbrains.annotations.NotNull;
import p183cs.C36524a;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DefaultWebSocketClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Deprecated(message = "该类只是为做老API适配，建议使用KCWebSocketClient方式", replaceWith = @ReplaceWith(expression = "KCWebSocketClient", imports = {}))
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u001a\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/network/websocket/DefaultWebSocketClient;", "", "Ler/a;", "client", "<init>", "(Ler/a;)V", "", "d", "()Z", "Lfr/d;", TUIConstants.TUIChat.CALL_BACK, "", "g", "(Lfr/d;)V", "Lio/reactivex/Observable;", "Lcom/kubi/network/websocket/model/Message;", "e", "()Lio/reactivex/Observable;", "Lcom/kubi/network/websocket/model/SocketRequest;", "request", "b", "(Lcom/kubi/network/websocket/model/SocketRequest;)V", "c", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ler/a;", "Companion", "DefaultWebSocketClientHolder", "network-adapter-subscribe-old_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDefaultWebSocketClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultWebSocketClient.kt\ncom/kubi/network/websocket/DefaultWebSocketClient\n+ 2 NetAdptSubOldIssue.kt\ncom/kubi/network/websocket/exception/NetAdptSubOldIssueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n54#2,2:60\n1#3:62\n1855#4,2:63\n*S KotlinDebug\n*F\n+ 1 DefaultWebSocketClient.kt\ncom/kubi/network/websocket/DefaultWebSocketClient\n*L\n38#1:60,2\n43#1:63,2\n*E\n"})
public final class DefaultWebSocketClient {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37236a client;

    /* JADX INFO: compiled from: DefaultWebSocketClient.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/network/websocket/DefaultWebSocketClient$Companion;", "", "()V", "get", "Lcom/kubi/network/websocket/DefaultWebSocketClient;", "network-adapter-subscribe-old_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final DefaultWebSocketClient get() {
            return DefaultWebSocketClientHolder.INSTANCE.getInstance();
        }
    }

    /* JADX INFO: compiled from: DefaultWebSocketClient.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/network/websocket/DefaultWebSocketClient$DefaultWebSocketClientHolder;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "network-adapter-subscribe-old_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class DefaultWebSocketClientHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final DefaultWebSocketClient f36192b = new DefaultWebSocketClient(C37237b.m83278a());

        /* JADX INFO: compiled from: DefaultWebSocketClient.kt */
        @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/network/websocket/DefaultWebSocketClient$DefaultWebSocketClientHolder$Companion;", "", "()V", "instance", "Lcom/kubi/network/websocket/DefaultWebSocketClient;", "getInstance", "()Lcom/kubi/network/websocket/DefaultWebSocketClient;", "network-adapter-subscribe-old_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            @NotNull
            public final DefaultWebSocketClient getInstance() {
                return DefaultWebSocketClientHolder.f36192b;
            }
        }
    }

    public DefaultWebSocketClient(@NotNull InterfaceC37236a client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    /* JADX INFO: renamed from: f */
    public static final Message m43107f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Message) tmp0.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public final void m43108b(@NotNull SocketRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        InterfaceC37236a.a.m83277a(this.client, C36524a.m81798e(request), null, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m43109c() {
        this.client.cancelAll();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m43110d() {
        return Intrinsics.areEqual(this.client.mo42858c(), "connected");
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Observable<Message> m43111e() {
        Observable observableM91207d = RxConvertKt.m91207d(this.client.mo42859d(), null, 1, null);
        final DefaultWebSocketClient$observeMessage$1 defaultWebSocketClient$observeMessage$1 = new Function1<NetworkMessage<?>, Message>() { // from class: com.kubi.network.websocket.DefaultWebSocketClient$observeMessage$1
            @Override // p852kotlin.jvm.functions.Function1
            public final Message invoke(@NotNull NetworkMessage<?> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return C36524a.m81794a(it);
            }
        };
        Observable<Message> map = observableM91207d.map(new Function() { // from class: as.a
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return DefaultWebSocketClient.m43107f(defaultWebSocketClient$observeMessage$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "client.observeNetworkMes…().map { it.toMessage() }");
        return map;
    }

    /* JADX INFO: renamed from: g */
    public final void m43112g(@NotNull InterfaceC37583d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.client.mo42856a(callback);
    }
}
