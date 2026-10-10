package p284g6;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: g6.h */
/* JADX INFO: compiled from: TiffUtil.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lg6/h;", "", "<init>", "()V", "", "orientation", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)I", "Ljava/io/InputStream;", "stream", SessionDescription.ATTR_LENGTH, "d", "(Ljava/io/InputStream;I)I", "Lg6/h$a;", "tiffHeader", "e", "(Ljava/io/InputStream;ILg6/h$a;)I", "", "isLittleEndian", "tagToFind", "c", "(Ljava/io/InputStream;IZI)I", "b", "(Ljava/io/InputStream;IZ)I", "Ljava/lang/Class;", "Ljava/lang/Class;", "TAG", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C37823h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37823h f85199a = new C37823h();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Class<?> TAG = C37823h.class;

    /* JADX INFO: renamed from: g6.h$a */
    /* JADX INFO: compiled from: TiffUtil.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, m90084d2 = {"Lg6/h$a;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "c", "()Z", "f", "(Z)V", "isLittleEndian", "", "b", "I", "()I", "d", "(I)V", "byteOrder", "e", "firstIfdOffset", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isLittleEndian;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int byteOrder;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public int firstIfdOffset;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getByteOrder() {
            return this.byteOrder;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getFirstIfdOffset() {
            return this.firstIfdOffset;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsLittleEndian() {
            return this.isLittleEndian;
        }

        /* JADX INFO: renamed from: d */
        public final void m85364d(int i11) {
            this.byteOrder = i11;
        }

        /* JADX INFO: renamed from: e */
        public final void m85365e(int i11) {
            this.firstIfdOffset = i11;
        }

        /* JADX INFO: renamed from: f */
        public final void m85366f(boolean z11) {
            this.isLittleEndian = z11;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m85356a(int orientation) {
        if (orientation == 0 || orientation == 1) {
            return 0;
        }
        if (orientation == 3) {
            return 180;
        }
        if (orientation != 6) {
            return orientation != 8 ? 0 : 270;
        }
        return 90;
    }

    /* JADX INFO: renamed from: e */
    public final int m85360e(InputStream stream, int length, a tiffHeader) throws IOException {
        if (length <= 8) {
            return 0;
        }
        tiffHeader.m85364d(C37822g.m85355a(stream, 4, false));
        if (tiffHeader.getByteOrder() != 1229531648 && tiffHeader.getByteOrder() != 1296891946) {
            C45999a.m101503i(TAG, "Invalid TIFF header");
            return 0;
        }
        tiffHeader.m85366f(tiffHeader.getByteOrder() == 1229531648);
        tiffHeader.m85365e(C37822g.m85355a(stream, 4, tiffHeader.getIsLittleEndian()));
        int i11 = length - 8;
        if (tiffHeader.getFirstIfdOffset() >= 8 && tiffHeader.getFirstIfdOffset() - 8 <= i11) {
            return i11;
        }
        C45999a.m101503i(TAG, "Invalid offset");
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m85358b(InputStream stream, int length, boolean isLittleEndian) throws IOException {
        if (length >= 10 && C37822g.m85355a(stream, 2, isLittleEndian) == 3 && C37822g.m85355a(stream, 4, isLittleEndian) == 1) {
            return C37822g.m85355a(stream, 2, isLittleEndian);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m85359c(InputStream stream, int length, boolean isLittleEndian, int tagToFind) throws IOException {
        if (length < 14) {
            return 0;
        }
        int iM85355a = C37822g.m85355a(stream, 2, isLittleEndian);
        int i11 = length - 2;
        while (true) {
            int i12 = iM85355a - 1;
            if (iM85355a <= 0 || i11 < 12) {
                break;
            }
            int i13 = i11 - 2;
            if (C37822g.m85355a(stream, 2, isLittleEndian) == tagToFind) {
                return i13;
            }
            stream.skip(10L);
            i11 -= 12;
            iM85355a = i12;
        }
        return 0;
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final int m85357d(@NotNull InputStream stream, int length) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        a aVar = new a();
        C37823h c37823h = f85199a;
        int iM85360e = c37823h.m85360e(stream, length, aVar);
        int firstIfdOffset = aVar.getFirstIfdOffset() - 8;
        if (iM85360e != 0 && firstIfdOffset <= iM85360e) {
            stream.skip(firstIfdOffset);
            return c37823h.m85358b(stream, c37823h.m85359c(stream, iM85360e - firstIfdOffset, aVar.getIsLittleEndian(), 274), aVar.getIsLittleEndian());
        }
        return 0;
    }
}
