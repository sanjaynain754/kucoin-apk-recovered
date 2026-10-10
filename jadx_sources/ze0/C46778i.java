package ze0;

import android.graphics.Rect;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ze0.i */
/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a+\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a'\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000b*\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u000e\u001a\u00020\u0000*\u00020\t2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0010\u001a\u00020\u0000*\u00020\t2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\u0000*\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"", "width", "", "Landroid/graphics/Rect;", "other", "d", "(I[Landroid/graphics/Rect;)I", "height", "b", "Lze0/e;", "dst", "Lkotlin/Pair;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lze0/e;Lze0/e;)Lkotlin/Pair;", "e", "(Lze0/e;[Landroid/graphics/Rect;)I", "c", "planeIndex", "f", "(Lze0/e;I)I", "core_release"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C46778i {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Pair<Integer, Integer> m103082a(@NotNull InterfaceC46774e interfaceC46774e, @NotNull InterfaceC46774e dst) {
        Intrinsics.checkNotNullParameter(interfaceC46774e, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        return new Pair<>(Integer.valueOf(m103086e(interfaceC46774e, interfaceC46774e.getCropRect(), dst.getCropRect())), Integer.valueOf(m103084c(interfaceC46774e, interfaceC46774e.getCropRect(), dst.getCropRect())));
    }

    /* JADX INFO: renamed from: b */
    public static final int m103083b(int i11, @NotNull Rect... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (Rect rect : other) {
            i11 = Math.min(i11, rect.height());
        }
        return i11;
    }

    /* JADX INFO: renamed from: c */
    public static final int m103084c(@NotNull InterfaceC46774e interfaceC46774e, @NotNull Rect... other) {
        Intrinsics.checkNotNullParameter(interfaceC46774e, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return m103083b(interfaceC46774e.getCropRect().height(), (Rect[]) Arrays.copyOf(other, other.length));
    }

    /* JADX INFO: renamed from: d */
    public static final int m103085d(int i11, @NotNull Rect... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (Rect rect : other) {
            i11 = Math.min(i11, rect.width());
        }
        return i11;
    }

    /* JADX INFO: renamed from: e */
    public static final int m103086e(@NotNull InterfaceC46774e interfaceC46774e, @NotNull Rect... other) {
        Intrinsics.checkNotNullParameter(interfaceC46774e, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return m103085d(interfaceC46774e.getCropRect().width(), (Rect[]) Arrays.copyOf(other, other.length));
    }

    /* JADX INFO: renamed from: f */
    public static final int m103087f(@NotNull InterfaceC46774e interfaceC46774e, int i11) {
        Intrinsics.checkNotNullParameter(interfaceC46774e, "<this>");
        return interfaceC46774e.getPlanes()[i11].m103109d(interfaceC46774e, i11);
    }
}
