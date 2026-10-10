package com.kubi.flutter.network.http;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.flutter.network.channel.BaseNetworkClient;
import com.kubi.flutter.network.channel.NetworkChannel;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p263fg.InterfaceC37457f;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HttpExternalClient.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J$\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00102\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m90084d2 = {"Lcom/kubi/flutter/network/http/HttpExternalClient;", "Lcom/kubi/flutter/network/channel/BaseNetworkClient;", "", "channelName", "Lfg/f;", "channelCodec", "Lcom/kubi/flutter/network/channel/NetworkChannel;", "channelProxy", "<init>", "(Ljava/lang/String;Lfg/f;Lcom/kubi/flutter/network/channel/NetworkChannel;)V", "", "arguments", "k", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", FirebaseAnalytics.Param.METHOD, "e", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "(Ljava/lang/Object;)V", "f", "Ljava/lang/String;", "g", "Lfg/f;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/kubi/flutter/network/channel/NetworkChannel;", "Lokhttp3/OkHttpClient;", "i", "Lokhttp3/OkHttpClient;", "networkClient", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class HttpExternalClient extends BaseNetworkClient {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String channelName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37457f channelCodec;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final NetworkChannel channelProxy;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public OkHttpClient networkClient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpExternalClient(@NotNull String channelName, @NotNull InterfaceC37457f channelCodec, @NotNull NetworkChannel channelProxy) {
        super(channelName, channelProxy);
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(channelCodec, "channelCodec");
        Intrinsics.checkNotNullParameter(channelProxy, "channelProxy");
        this.channelName = channelName;
        this.channelCodec = channelCodec;
        this.channelProxy = channelProxy;
    }

    @Override // com.kubi.flutter.network.channel.BaseNetworkClient
    @Nullable
    /* JADX INFO: renamed from: e */
    public Object mo23799e(@NotNull String str, @Nullable Object obj, @NotNull Continuation<Object> continuation) throws Throwable {
        if (Intrinsics.areEqual(str, "init")) {
            m23815j(obj);
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(str, "request")) {
            return m23814k(obj, continuation);
        }
        throw new RuntimeException("not support method: " + str);
    }

    @Override // com.kubi.flutter.network.channel.BaseNetworkClient, com.kubi.flutter.network.channel.InterfaceC12605c
    public void onAttachedToEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        super.onAttachedToEngine(binding);
        this.networkClient = new OkHttpClient.Builder().build();
    }

    @Override // com.kubi.flutter.network.channel.BaseNetworkClient, com.kubi.flutter.network.channel.InterfaceC12605c
    public void onDetachedFromEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        super.onDetachedFromEngine(binding);
        this.networkClient = null;
    }

    /* JADX INFO: renamed from: k */
    private final Object m23814k(Object obj, Continuation<Object> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new HttpExternalClient$handleRequest$2(this, obj, null), continuation);
    }

    /* JADX INFO: renamed from: j */
    public final void m23815j(Object arguments) {
    }
}
