package com.kubi.network.socket.socketio;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.kubi.network.socket.socketio.d */
/* JADX INFO: compiled from: SocketIOPacket.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B?\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\b\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u0012\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\r\u001a\u0004\b\f\u0010\u000f\"\u0004\b!\u0010\u0011¨\u0006\""}, m90084d2 = {"Lcom/kubi/network/socket/socketio/d;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "id", "", "nsp", "type", "data", "attachments", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Integer;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/Integer;)V", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "i", "(Ljava/lang/String;)V", "I", "e", "()I", "j", "(I)V", "Ljava/lang/Object;", "()Ljava/lang/Object;", "g", "(Ljava/lang/Object;)V", "f", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19373d<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Integer id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String nsp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public T data;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Integer attachments;

    public C19373d(@Nullable Integer num, @Nullable String str, int i11, @Nullable T t11, @Nullable Integer num2) {
        this.id = num;
        this.nsp = str;
        this.type = i11;
        this.data = t11;
        this.attachments = num2;
    }

    public /* synthetic */ C19373d(Integer num, String str, int i11, Object obj, Integer num2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : str, i11, (i12 & 8) != 0 ? null : obj, (i12 & 16) != 0 ? 0 : num2);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getAttachments() {
        return this.attachments;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final T m42997b() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNsp() {
        return this.nsp;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: f */
    public final void m43001f(@Nullable Integer num) {
        this.attachments = num;
    }

    /* JADX INFO: renamed from: g */
    public final void m43002g(@Nullable T t11) {
        this.data = t11;
    }

    /* JADX INFO: renamed from: h */
    public final void m43003h(@Nullable Integer num) {
        this.id = num;
    }

    /* JADX INFO: renamed from: i */
    public final void m43004i(@Nullable String str) {
        this.nsp = str;
    }

    /* JADX INFO: renamed from: j */
    public final void m43005j(int i11) {
        this.type = i11;
    }
}
