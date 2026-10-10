package w90;

import androidx.exifinterface.media.ExifInterface;
import com.otaliastudios.transcoder.common.TrackType;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: w90.j */
/* JADX INFO: compiled from: TrackMap.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H¦\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00018\u00002\b\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR$\u0010\n\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, m90084d2 = {"Lw90/j;", ExifInterface.GPS_DIRECTION_TRUE, "Lw90/l;", "Lcom/otaliastudios/transcoder/common/TrackType;", "type", "value", "", "z", "(Lcom/otaliastudios/transcoder/common/TrackType;Ljava/lang/Object;)V", "video", "audio", "x", "(Ljava/lang/Object;Ljava/lang/Object;)V", "p", "()Ljava/lang/Object;", "v", "(Ljava/lang/Object;)V", "o", "L", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public interface InterfaceC45771j<T> extends InterfaceC45773l<T> {
    /* JADX INFO: renamed from: L */
    void mo101051L(T t11);

    @Override // w90.InterfaceC45773l
    /* JADX INFO: renamed from: o */
    T mo67880o();

    @Override // w90.InterfaceC45773l
    /* JADX INFO: renamed from: p */
    T mo67881p();

    /* JADX INFO: renamed from: v */
    void mo101052v(T t11);

    /* JADX INFO: renamed from: x */
    void mo101053x(@Nullable T video, @Nullable T audio);

    /* JADX INFO: renamed from: z */
    void mo101054z(@NotNull TrackType type, @Nullable T value);

    /* JADX INFO: renamed from: w90.j$a */
    /* JADX INFO: compiled from: TrackMap.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class a {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static <T> T m101074a(@NotNull InterfaceC45771j<T> interfaceC45771j) {
            Intrinsics.checkNotNullParameter(interfaceC45771j, "this");
            return (T) InterfaceC45773l.a.m101087a(interfaceC45771j);
        }

        /* JADX INFO: renamed from: b */
        public static <T> T m101075b(@NotNull InterfaceC45771j<T> interfaceC45771j) {
            Intrinsics.checkNotNullParameter(interfaceC45771j, "this");
            return (T) InterfaceC45773l.a.m101088b(interfaceC45771j);
        }

        /* JADX INFO: renamed from: c */
        public static <T> boolean m101076c(@NotNull InterfaceC45771j<T> interfaceC45771j) {
            Intrinsics.checkNotNullParameter(interfaceC45771j, "this");
            return InterfaceC45773l.a.m101089c(interfaceC45771j);
        }

        /* JADX INFO: renamed from: d */
        public static <T> boolean m101077d(@NotNull InterfaceC45771j<T> interfaceC45771j) {
            Intrinsics.checkNotNullParameter(interfaceC45771j, "this");
            return InterfaceC45773l.a.m101090d(interfaceC45771j);
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public static <T> T m101078e(@NotNull InterfaceC45771j<T> interfaceC45771j, @NotNull TrackType type) {
            Intrinsics.checkNotNullParameter(interfaceC45771j, "this");
            Intrinsics.checkNotNullParameter(type, "type");
            return (T) InterfaceC45773l.a.m101091e(interfaceC45771j, type);
        }

        /* JADX INFO: renamed from: f */
        public static <T> int m101079f(@NotNull InterfaceC45771j<T> interfaceC45771j) {
            Intrinsics.checkNotNullParameter(interfaceC45771j, "this");
            return InterfaceC45773l.a.m101092f(interfaceC45771j);
        }

        /* JADX INFO: renamed from: g */
        public static <T> T m101080g(@NotNull InterfaceC45771j<T> interfaceC45771j) {
            Intrinsics.checkNotNullParameter(interfaceC45771j, "this");
            return (T) InterfaceC45773l.a.m101093g(interfaceC45771j);
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public static <T> Iterator<T> m101081h(@NotNull InterfaceC45771j<T> interfaceC45771j) {
            Intrinsics.checkNotNullParameter(interfaceC45771j, "this");
            return InterfaceC45773l.a.m101094h(interfaceC45771j);
        }

        /* JADX INFO: renamed from: i */
        public static <T> void m101082i(@NotNull InterfaceC45771j<T> interfaceC45771j, @Nullable T t11, @Nullable T t12) {
            Intrinsics.checkNotNullParameter(interfaceC45771j, "this");
            interfaceC45771j.mo101054z(TrackType.VIDEO, t11);
            interfaceC45771j.mo101054z(TrackType.AUDIO, t12);
        }

        /* JADX INFO: renamed from: j */
        public static <T> void m101083j(@NotNull InterfaceC45771j<T> interfaceC45771j, T t11) {
            Intrinsics.checkNotNullParameter(interfaceC45771j, "this");
            interfaceC45771j.mo101054z(TrackType.AUDIO, t11);
        }

        /* JADX INFO: renamed from: k */
        public static <T> void m101084k(@NotNull InterfaceC45771j<T> interfaceC45771j, T t11) {
            Intrinsics.checkNotNullParameter(interfaceC45771j, "this");
            interfaceC45771j.mo101054z(TrackType.VIDEO, t11);
        }

        @Nullable
        /* JADX INFO: renamed from: l */
        public static <T> T m101085l(@NotNull InterfaceC45771j<T> interfaceC45771j) {
            Intrinsics.checkNotNullParameter(interfaceC45771j, "this");
            return (T) InterfaceC45773l.a.m101095i(interfaceC45771j);
        }
    }
}
