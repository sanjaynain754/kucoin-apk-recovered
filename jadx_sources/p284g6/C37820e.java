package p284g6;

import android.graphics.ColorSpace;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;

/* JADX INFO: renamed from: g6.e */
/* JADX INFO: compiled from: ImageMetaData.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lg6/e;", "", "", "width", "height", "Landroid/graphics/ColorSpace;", "colorSpace", "<init>", "(IILandroid/graphics/ColorSpace;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/graphics/ColorSpace;", "()Landroid/graphics/ColorSpace;", "Lkotlin/Pair;", "b", "Lkotlin/Pair;", "()Lkotlin/Pair;", "dimensions", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C37820e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final ColorSpace colorSpace;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Pair<Integer, Integer> dimensions;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Pair<Integer, Integer> m85349b() {
        return this.dimensions;
    }

    public C37820e(int i11, int i12, @Nullable ColorSpace colorSpace) {
        Pair<Integer, Integer> pair;
        this.colorSpace = colorSpace;
        if (i11 != -1 && i12 != -1) {
            pair = new Pair<>(Integer.valueOf(i11), Integer.valueOf(i12));
        } else {
            pair = null;
        }
        this.dimensions = pair;
    }
}
