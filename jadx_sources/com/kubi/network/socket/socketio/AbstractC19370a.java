package com.kubi.network.socket.socketio;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkRequest;
import org.jetbrains.annotations.NotNull;
import p570qr.C43865k;
import p570qr.InterfaceC43860f;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.network.socket.socketio.a */
/* JADX INFO: compiled from: ISocketIOCodec.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\n2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\rH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/network/socket/socketio/a;", "Lqr/f;", "<init>", "()V", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "", "b", "(Lcom/kubi/network/api/model/NetworkRequest;)Ljava/lang/Object;", "message", "Lqr/k;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Lqr/k;", "Lcom/kubi/network/socket/socketio/d;", "d", "(Lcom/kubi/network/api/model/NetworkRequest;)Lcom/kubi/network/socket/socketio/d;", "packet", "c", "(Lcom/kubi/network/socket/socketio/d;)Lqr/k;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class AbstractC19370a implements InterfaceC43860f {
    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract C43865k<?> mo42992c(@NotNull C19373d<?> packet);

    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract C19373d<?> mo42993d(@NotNull NetworkRequest request);

    @Override // p570qr.InterfaceC43860f
    @NotNull
    /* JADX INFO: renamed from: a */
    public final C43865k<?> mo42990a(@NotNull Object message) {
        Intrinsics.checkNotNullParameter(message, "message");
        C19373d<?> c19373d = message instanceof C19373d ? (C19373d) message : null;
        if (c19373d != null) {
            return mo42992c(c19373d);
        }
        throw new ClassCastException("仅支持SocketIOPacket类型,请自定义消息解析器");
    }

    @Override // p570qr.InterfaceC43860f
    @NotNull
    /* JADX INFO: renamed from: b */
    public final Object mo42991b(@NotNull NetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return mo42993d(request);
    }
}
