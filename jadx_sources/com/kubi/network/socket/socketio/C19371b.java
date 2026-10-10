package com.kubi.network.socket.socketio;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.network.socket.socketio.b */
/* JADX INFO: compiled from: SocketIOPacket.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/network/socket/socketio/b;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/kubi/network/socket/socketio/d;", "packet", "", "", "buffers", "<init>", "(Lcom/kubi/network/socket/socketio/d;[[B)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/network/socket/socketio/d;", "b", "()Lcom/kubi/network/socket/socketio/d;", "setPacket", "(Lcom/kubi/network/socket/socketio/d;)V", "[[B", "()[[B", "setBuffers", "([[B)V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19371b<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public C19373d<T> packet;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public byte[][] buffers;

    public C19371b(@NotNull C19373d<T> packet, @NotNull byte[][] buffers) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        Intrinsics.checkNotNullParameter(buffers, "buffers");
        this.packet = packet;
        this.buffers = buffers;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[][] getBuffers() {
        return this.buffers;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final C19373d<T> m42995b() {
        return this.packet;
    }
}
