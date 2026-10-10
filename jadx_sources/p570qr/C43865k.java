package p570qr;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qr.k */
/* JADX INFO: compiled from: SocketPacket.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lqr/k;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "id", "type", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C43865k<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final T data;

    public C43865k(@NotNull String id2, @NotNull String type, @Nullable T t11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id2;
        this.type = type;
        this.data = t11;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final T m96638a() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
