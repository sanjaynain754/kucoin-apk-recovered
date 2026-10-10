package com.kubi.network.socket.engineio;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.network.socket.engineio.b */
/* JADX INFO: compiled from: EngineIOPacket.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/network/socket/engineio/b;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "type", "data", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19362b<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final T data;

    public C19362b(@NotNull String type, @Nullable T t11) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.data = t11;
    }

    public /* synthetic */ C19362b(String str, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : obj);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final T m42958a() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
