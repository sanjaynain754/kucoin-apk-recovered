package w90;

import androidx.exifinterface.media.ExifInterface;
import com.otaliastudios.transcoder.common.TrackType;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: renamed from: w90.l */
/* JADX INFO: compiled from: TrackMap.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0011\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0011\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0014\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lw90/l;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/otaliastudios/transcoder/common/TrackType;", "type", "M", "(Lcom/otaliastudios/transcoder/common/TrackType;)Ljava/lang/Object;", "", "w", "(Lcom/otaliastudios/transcoder/common/TrackType;)Z", "u", "q", "()Ljava/lang/Object;", "J", "o", "video", "p", "audio", "C", "()Z", "hasVideo", ExifInterface.LONGITUDE_EAST, "hasAudio", "", "getSize", "()I", "size", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public interface InterfaceC45773l<T> extends Iterable<T>, KMappedMarker {
    /* JADX INFO: renamed from: C */
    boolean mo67870C();

    /* JADX INFO: renamed from: E */
    boolean mo67871E();

    @Nullable
    /* JADX INFO: renamed from: J */
    T mo67872J();

    /* JADX INFO: renamed from: M */
    T mo67873M(@NotNull TrackType type);

    int getSize();

    /* JADX INFO: renamed from: o */
    T mo67880o();

    /* JADX INFO: renamed from: p */
    T mo67881p();

    @Nullable
    /* JADX INFO: renamed from: q */
    T mo67882q();

    @Nullable
    /* JADX INFO: renamed from: u */
    T mo67883u(@NotNull TrackType type);

    /* JADX INFO: renamed from: w */
    boolean mo67884w(@NotNull TrackType type);

    /* JADX INFO: renamed from: w90.l$a */
    /* JADX INFO: compiled from: TrackMap.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class a {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static <T> T m101087a(@NotNull InterfaceC45773l<T> interfaceC45773l) {
            Intrinsics.checkNotNullParameter(interfaceC45773l, "this");
            return interfaceC45773l.mo67883u(TrackType.AUDIO);
        }

        /* JADX INFO: renamed from: b */
        public static <T> T m101088b(@NotNull InterfaceC45773l<T> interfaceC45773l) {
            Intrinsics.checkNotNullParameter(interfaceC45773l, "this");
            return interfaceC45773l.mo67873M(TrackType.AUDIO);
        }

        /* JADX INFO: renamed from: c */
        public static <T> boolean m101089c(@NotNull InterfaceC45773l<T> interfaceC45773l) {
            Intrinsics.checkNotNullParameter(interfaceC45773l, "this");
            return interfaceC45773l.mo67884w(TrackType.AUDIO);
        }

        /* JADX INFO: renamed from: d */
        public static <T> boolean m101090d(@NotNull InterfaceC45773l<T> interfaceC45773l) {
            Intrinsics.checkNotNullParameter(interfaceC45773l, "this");
            return interfaceC45773l.mo67884w(TrackType.VIDEO);
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public static <T> T m101091e(@NotNull InterfaceC45773l<T> interfaceC45773l, @NotNull TrackType type) {
            Intrinsics.checkNotNullParameter(interfaceC45773l, "this");
            Intrinsics.checkNotNullParameter(type, "type");
            if (interfaceC45773l.mo67884w(type)) {
                return interfaceC45773l.mo67873M(type);
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        public static <T> int m101092f(@NotNull InterfaceC45773l<T> interfaceC45773l) {
            Intrinsics.checkNotNullParameter(interfaceC45773l, "this");
            return CollectionsKt.listOfNotNull(interfaceC45773l.mo67882q(), interfaceC45773l.mo67872J()).size();
        }

        /* JADX INFO: renamed from: g */
        public static <T> T m101093g(@NotNull InterfaceC45773l<T> interfaceC45773l) {
            Intrinsics.checkNotNullParameter(interfaceC45773l, "this");
            return interfaceC45773l.mo67873M(TrackType.VIDEO);
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public static <T> Iterator<T> m101094h(@NotNull InterfaceC45773l<T> interfaceC45773l) {
            Intrinsics.checkNotNullParameter(interfaceC45773l, "this");
            return CollectionsKt.listOfNotNull(interfaceC45773l.mo67882q(), interfaceC45773l.mo67872J()).iterator();
        }

        @Nullable
        /* JADX INFO: renamed from: i */
        public static <T> T m101095i(@NotNull InterfaceC45773l<T> interfaceC45773l) {
            Intrinsics.checkNotNullParameter(interfaceC45773l, "this");
            return interfaceC45773l.mo67883u(TrackType.VIDEO);
        }
    }
}
