package com.kubi.network.socket;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkMessage;
import com.kubi.network.api.model.NetworkRequest;
import com.kubi.network.socket.core.InterfaceC19356b;
import er.InterfaceC37236a;
import java.util.List;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.network.socket.b */
/* JADX INFO: compiled from: ISubscribeClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR'\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u0011\u0010\u001d¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/network/socket/b;", "", "Lokhttp3/OkHttpClient;", "okHttpClient", "Ler/a;", "socketClient", "", "Lcom/kubi/network/socket/core/b;", "requestInterceptors", "Lkotlin/Function1;", "Lcom/kubi/network/api/model/NetworkRequest;", "", "requestSender", "Lcom/kubi/network/api/model/NetworkMessage;", "messageSender", "<init>", "(Lokhttp3/OkHttpClient;Ler/a;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lokhttp3/OkHttpClient;", "b", "()Lokhttp3/OkHttpClient;", "Ler/a;", "e", "()Ler/a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19343b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final OkHttpClient okHttpClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37236a socketClient;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC19356b> requestInterceptors;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function1<NetworkRequest, Unit> requestSender;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Function1<NetworkMessage<?>, Unit> messageSender;

    /* JADX WARN: Multi-variable type inference failed */
    public C19343b(@NotNull OkHttpClient okHttpClient, @NotNull InterfaceC37236a socketClient, @NotNull List<InterfaceC19356b> requestInterceptors, @NotNull Function1<? super NetworkRequest, Unit> requestSender, @NotNull Function1<? super NetworkMessage<?>, Unit> messageSender) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(socketClient, "socketClient");
        Intrinsics.checkNotNullParameter(requestInterceptors, "requestInterceptors");
        Intrinsics.checkNotNullParameter(requestSender, "requestSender");
        Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        this.okHttpClient = okHttpClient;
        this.socketClient = socketClient;
        this.requestInterceptors = requestInterceptors;
        this.requestSender = requestSender;
        this.messageSender = messageSender;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Function1<NetworkMessage<?>, Unit> m42894a() {
        return this.messageSender;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final OkHttpClient getOkHttpClient() {
        return this.okHttpClient;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<InterfaceC19356b> m42896c() {
        return this.requestInterceptors;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Function1<NetworkRequest, Unit> m42897d() {
        return this.requestSender;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC37236a getSocketClient() {
        return this.socketClient;
    }
}
