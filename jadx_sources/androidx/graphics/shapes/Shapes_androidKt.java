package androidx.graphics.shapes;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.collection.FloatFloatPair;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Shapes.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0003*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0007\u001a\u00020\u0003*\u00020\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0012\u0010\f\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, m90084d2 = {"pathFromCubics", "", "path", "Landroid/graphics/Path;", "cubics", "", "Landroidx/graphics/shapes/Cubic;", "toPath", "Landroidx/graphics/shapes/Morph;", "progress", "", "Landroidx/graphics/shapes/RoundedPolygon;", "transformed", "matrix", "Landroid/graphics/Matrix;", "graphics-shapes_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class Shapes_androidKt {
    @JvmOverloads
    @NotNull
    public static final Path toPath(@NotNull RoundedPolygon roundedPolygon) {
        Intrinsics.checkNotNullParameter(roundedPolygon, "<this>");
        return toPath$default(roundedPolygon, null, 1, null);
    }

    public static /* synthetic */ Path toPath$default(RoundedPolygon roundedPolygon, Path path, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            path = new Path();
        }
        return toPath(roundedPolygon, path);
    }

    @JvmOverloads
    @NotNull
    public static final Path toPath(@NotNull RoundedPolygon roundedPolygon, @NotNull Path path) {
        Intrinsics.checkNotNullParameter(roundedPolygon, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        pathFromCubics(path, roundedPolygon.getCubics());
        return path;
    }

    public static /* synthetic */ Path toPath$default(Morph morph, float f11, Path path, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            path = new Path();
        }
        return toPath(morph, f11, path);
    }

    @NotNull
    public static final RoundedPolygon transformed(@NotNull RoundedPolygon roundedPolygon, @NotNull final Matrix matrix) {
        Intrinsics.checkNotNullParameter(roundedPolygon, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        final float[] fArr = new float[2];
        return roundedPolygon.transformed(new PointTransformer() { // from class: androidx.graphics.shapes.Shapes_androidKt.transformed.1
            @Override // androidx.graphics.shapes.PointTransformer
            /* JADX INFO: renamed from: transform-XgqJiTY */
            public final long mo103571transformXgqJiTY(float f11, float f12) {
                float[] fArr2 = fArr;
                fArr2[0] = f11;
                fArr2[1] = f12;
                matrix.mapPoints(fArr2);
                float[] fArr3 = fArr;
                return FloatFloatPair.m103448constructorimpl(fArr3[0], fArr3[1]);
            }
        });
    }

    private static final void pathFromCubics(Path path, List<? extends Cubic> list) {
        path.rewind();
        int size = list.size();
        boolean z11 = true;
        for (int i11 = 0; i11 < size; i11++) {
            Cubic cubic = list.get(i11);
            if (z11) {
                path.moveTo(cubic.getAnchor0X(), cubic.getAnchor0Y());
                z11 = false;
            }
            path.cubicTo(cubic.getControl0X(), cubic.getControl0Y(), cubic.getControl1X(), cubic.getControl1Y(), cubic.getAnchor1X(), cubic.getAnchor1Y());
        }
        path.close();
    }

    @NotNull
    public static final Path toPath(@NotNull Morph morph, float f11, @NotNull Path path) {
        Intrinsics.checkNotNullParameter(morph, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        pathFromCubics(path, morph.asCubics(f11));
        return path;
    }
}
