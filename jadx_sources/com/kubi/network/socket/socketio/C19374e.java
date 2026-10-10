package com.kubi.network.socket.socketio;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.socket.utils.C19387c;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.network.socket.socketio.e */
/* JADX INFO: compiled from: SocketIOParser.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00060\rj\b\u0012\u0004\u0012\u00020\u0006`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/network/socket/socketio/e;", "", "Lcom/kubi/network/socket/socketio/d;", "packet", "<init>", "(Lcom/kubi/network/socket/socketio/d;)V", "", "binData", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "([B)Lcom/kubi/network/socket/socketio/d;", "Lcom/kubi/network/socket/socketio/d;", "getPacket", "()Lcom/kubi/network/socket/socketio/d;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "buffers", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSocketIOParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketIOParser.kt\ncom/kubi/network/socket/socketio/SocketIOParser$BinaryReconstructor\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,127:1\n37#2,2:128\n*S KotlinDebug\n*F\n+ 1 SocketIOParser.kt\ncom/kubi/network/socket/socketio/SocketIOParser$BinaryReconstructor\n*L\n120#1:128,2\n*E\n"})
public final class C19374e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C19373d<Object> packet;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<byte[]> buffers;

    public C19374e(@NotNull C19373d<Object> packet) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        this.packet = packet;
        this.buffers = new ArrayList<>();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C19373d m43006b(C19374e c19374e, byte[] bArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bArr = null;
        }
        return c19374e.m43007a(bArr);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final C19373d<?> m43007a(@Nullable byte[] binData) {
        if (binData != null) {
            this.buffers.add(binData);
        }
        Integer attachments = this.packet.getAttachments();
        if (attachments != null && attachments.intValue() == 0) {
            return this.packet;
        }
        int size = this.buffers.size();
        Integer attachments2 = this.packet.getAttachments();
        if (attachments2 != null && size == attachments2.intValue()) {
            return C19387c.f36149a.m43051d(this.packet, (byte[][]) this.buffers.toArray(new byte[0][]));
        }
        return null;
    }
}
