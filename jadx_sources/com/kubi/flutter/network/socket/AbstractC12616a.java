package com.kubi.flutter.network.socket;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.flutter.network.channel.BaseNetworkClient;
import com.kubi.flutter.network.channel.NetworkChannel;
import com.tencent.qcloud.tuicore.TUIConstants;
import er.InterfaceC37236a;
import fr.InterfaceC37583d;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.flutter.network.socket.a */
/* JADX INFO: compiled from: BaseSocketClient.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\t*\u0001 \b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH¦@¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010'\u001a\u0004\u0018\u00010\u00178\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010$\u001a\u0004\b!\u0010%\"\u0004\b&\u0010\u001a¨\u0006("}, m90084d2 = {"Lcom/kubi/flutter/network/socket/a;", "Lcom/kubi/flutter/network/channel/BaseNetworkClient;", "", "channelName", "Lcom/kubi/flutter/network/channel/NetworkChannel;", "channelProxy", "<init>", "(Ljava/lang/String;Lcom/kubi/flutter/network/channel/NetworkChannel;)V", "", "arguments", "", "j", "(Ljava/lang/Object;)V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "onDetachedFromEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", FirebaseAnalytics.Param.METHOD, "e", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "i", "Ler/a;", "client", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ler/a;)V", "m", "f", "Ljava/lang/String;", "g", "Lcom/kubi/flutter/network/channel/NetworkChannel;", "com/kubi/flutter/network/socket/a$a", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/kubi/flutter/network/socket/a$a;", TUIConstants.TUIChat.CALL_BACK, "Ler/a;", "()Ler/a;", "setNetworkClient", "networkClient", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class AbstractC12616a extends BaseNetworkClient {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String channelName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final NetworkChannel channelProxy;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final a callback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public InterfaceC37236a networkClient;

    /* JADX INFO: renamed from: com.kubi.flutter.network.socket.a$a */
    /* JADX INFO: compiled from: BaseSocketClient.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m90084d2 = {"com/kubi/flutter/network/socket/a$a", "Lfr/d;", "", "onConnecting", "()V", "onConnected", "onDisconnect", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class a implements InterfaceC37583d {
        public a() {
        }

        @Override // fr.InterfaceC37583d
        public void onConnected() {
            BaseNetworkClient.m23796g(AbstractC12616a.this, "onConnected", null, 2, null);
        }

        @Override // fr.InterfaceC37583d
        public void onConnecting() {
            BaseNetworkClient.m23796g(AbstractC12616a.this, "onConnecting", null, 2, null);
        }

        @Override // fr.InterfaceC37583d
        public void onDisconnect() {
            BaseNetworkClient.m23796g(AbstractC12616a.this, "onDisconnect", null, 2, null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public abstract Object mo23831i(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    /* JADX INFO: renamed from: k */
    public abstract Object mo23832k(@Nullable Object obj, @NotNull Continuation<Object> continuation);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12616a(@NotNull String channelName, @NotNull NetworkChannel channelProxy) {
        super(channelName, channelProxy);
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(channelProxy, "channelProxy");
        this.channelName = channelName;
        this.channelProxy = channelProxy;
        this.callback = new a();
    }

    /* JADX INFO: renamed from: j */
    private final void m23841j(Object arguments) {
        C12620e c12620e = C12620e.f22041a;
        FlutterPlugin.FlutterPluginBinding networkBinding = getNetworkBinding();
        c12620e.m23858m(networkBinding != null ? networkBinding.getApplicationContext() : null, this.channelName, arguments);
        m23844l(c12620e.m23852d(this.channelName));
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC37236a getNetworkClient() {
        return this.networkClient;
    }

    /* JADX INFO: renamed from: l */
    public final void m23844l(InterfaceC37236a client) {
        if (client == null) {
            return;
        }
        this.networkClient = client;
        client.mo42856a(this.callback);
    }

    /* JADX INFO: renamed from: m */
    public final void m23845m(InterfaceC37236a client) {
        InterfaceC37236a interfaceC37236a = this.networkClient;
        if (interfaceC37236a != null) {
            interfaceC37236a.mo42857b(this.callback);
        }
        this.networkClient = null;
    }

    @Override // com.kubi.flutter.network.channel.BaseNetworkClient, com.kubi.flutter.network.channel.InterfaceC12605c
    public void onDetachedFromEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        super.onDetachedFromEngine(binding);
        m23845m(C12620e.f22041a.m23852d(this.channelName));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Object m23842n(AbstractC12616a abstractC12616a, String str, Object obj, Continuation<Object> continuation) throws Throwable {
        switch (str.hashCode()) {
            case -1367724422:
                if (str.equals("cancel")) {
                    Object objMo23831i = abstractC12616a.mo23831i(obj, continuation);
                    if (objMo23831i == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objMo23831i;
                    }
                    return Unit.INSTANCE;
                }
                break;
            case 3237136:
                if (str.equals("init")) {
                    abstractC12616a.m23841j(obj);
                    return Unit.INSTANCE;
                }
                break;
            case 530405532:
                if (str.equals("disconnect")) {
                    InterfaceC37236a interfaceC37236a = abstractC12616a.networkClient;
                    if (interfaceC37236a == null) {
                        return null;
                    }
                    interfaceC37236a.disconnect();
                    return Unit.INSTANCE;
                }
                break;
            case 951351530:
                if (str.equals("connect")) {
                    InterfaceC37236a interfaceC37236a2 = abstractC12616a.networkClient;
                    if (interfaceC37236a2 == null) {
                        return null;
                    }
                    interfaceC37236a2.connect();
                    return Unit.INSTANCE;
                }
                break;
            case 1095692943:
                if (str.equals("request")) {
                    return abstractC12616a.mo23832k(obj, continuation);
                }
                break;
            case 2038372806:
                if (str.equals("getConnectStatus")) {
                    InterfaceC37236a interfaceC37236a3 = abstractC12616a.networkClient;
                    if (interfaceC37236a3 == null) {
                        return null;
                    }
                    return interfaceC37236a3.mo42858c();
                }
                break;
        }
        throw new RuntimeException("not support method: " + str);
    }

    @Override // com.kubi.flutter.network.channel.BaseNetworkClient
    @Nullable
    /* JADX INFO: renamed from: e */
    public Object mo23799e(@NotNull String str, @Nullable Object obj, @NotNull Continuation<Object> continuation) throws Throwable {
        return m23842n(this, str, obj, continuation);
    }
}
