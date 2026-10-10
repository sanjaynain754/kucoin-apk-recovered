package w90;

import androidx.exifinterface.media.ExifInterface;
import com.otaliastudios.transcoder.common.TrackType;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: w90.d */
/* JADX INFO: compiled from: TrackMap.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Lw90/d;", ExifInterface.GPS_DIRECTION_TRUE, "Lw90/j;", "video", "audio", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lcom/otaliastudios/transcoder/common/TrackType;", "type", "M", "(Lcom/otaliastudios/transcoder/common/TrackType;)Ljava/lang/Object;", "", "w", "(Lcom/otaliastudios/transcoder/common/TrackType;)Z", "value", "", "z", "(Lcom/otaliastudios/transcoder/common/TrackType;Ljava/lang/Object;)V", "", "b", "Ljava/util/Map;", "map", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C45765d<T> implements InterfaceC45771j<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<TrackType, T> map;

    public C45765d(@Nullable T t11, @Nullable T t12) {
        this.map = MapsKt.mutableMapOf(TuplesKt.m90091to(TrackType.VIDEO, t11), TuplesKt.m90091to(TrackType.AUDIO, t12));
    }

    @Override // w90.InterfaceC45773l
    /* JADX INFO: renamed from: C */
    public boolean mo67870C() {
        return InterfaceC45771j.a.m101077d(this);
    }

    @Override // w90.InterfaceC45773l
    /* JADX INFO: renamed from: E */
    public boolean mo67871E() {
        return InterfaceC45771j.a.m101076c(this);
    }

    @Override // w90.InterfaceC45773l
    @Nullable
    /* JADX INFO: renamed from: J */
    public T mo67872J() {
        return (T) InterfaceC45771j.a.m101074a(this);
    }

    @Override // w90.InterfaceC45771j
    /* JADX INFO: renamed from: L */
    public void mo101051L(T t11) {
        InterfaceC45771j.a.m101084k(this, t11);
    }

    @Override // w90.InterfaceC45773l
    /* JADX INFO: renamed from: M */
    public T mo67873M(@NotNull TrackType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        T t11 = this.map.get(type);
        if (t11 != null) {
            return t11;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // w90.InterfaceC45773l
    public int getSize() {
        return InterfaceC45771j.a.m101079f(this);
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return InterfaceC45771j.a.m101081h(this);
    }

    @Override // w90.InterfaceC45771j, w90.InterfaceC45773l
    /* JADX INFO: renamed from: o */
    public T mo67880o() {
        return (T) InterfaceC45771j.a.m101080g(this);
    }

    @Override // w90.InterfaceC45771j, w90.InterfaceC45773l
    /* JADX INFO: renamed from: p */
    public T mo67881p() {
        return (T) InterfaceC45771j.a.m101075b(this);
    }

    @Override // w90.InterfaceC45773l
    @Nullable
    /* JADX INFO: renamed from: q */
    public T mo67882q() {
        return (T) InterfaceC45771j.a.m101085l(this);
    }

    @Override // w90.InterfaceC45773l
    @Nullable
    /* JADX INFO: renamed from: u */
    public T mo67883u(@NotNull TrackType trackType) {
        return (T) InterfaceC45771j.a.m101078e(this, trackType);
    }

    @Override // w90.InterfaceC45771j
    /* JADX INFO: renamed from: v */
    public void mo101052v(T t11) {
        InterfaceC45771j.a.m101083j(this, t11);
    }

    @Override // w90.InterfaceC45773l
    /* JADX INFO: renamed from: w */
    public boolean mo67884w(@NotNull TrackType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.map.get(type) != null) {
            return true;
        }
        return false;
    }

    @Override // w90.InterfaceC45771j
    /* JADX INFO: renamed from: x */
    public void mo101053x(@Nullable T t11, @Nullable T t12) {
        InterfaceC45771j.a.m101082i(this, t11, t12);
    }

    @Override // w90.InterfaceC45771j
    /* JADX INFO: renamed from: z */
    public void mo101054z(@NotNull TrackType type, @Nullable T value) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.map.put(type, value);
    }
}
