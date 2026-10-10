package androidx.graphics.shapes;

import com.facebook.react.uimanager.ViewProps;
import io.flutter.embedding.android.KeyboardMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Cubic.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, m90084d2 = {"Landroidx/graphics/shapes/MutableCubic;", "Landroidx/graphics/shapes/Cubic;", "()V", "interpolate", "", "c1", "c2", "progress", "", ViewProps.TRANSFORM, "f", "Landroidx/graphics/shapes/PointTransformer;", "transformOnePoint", "ix", "", "graphics-shapes_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCubic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cubic.kt\nandroidx/graphics/shapes/MutableCubic\n+ 2 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,448:1\n48#2:449\n54#2:451\n22#3:450\n22#3:452\n1#4:453\n*S KotlinDebug\n*F\n+ 1 Cubic.kt\nandroidx/graphics/shapes/MutableCubic\n*L\n433#1:449\n434#1:451\n433#1:450\n434#1:452\n*E\n"})
public final class MutableCubic extends Cubic {
    public MutableCubic() {
        super(null, 1, null);
    }

    public final void interpolate(@NotNull Cubic c11, @NotNull Cubic c12, float progress) {
        Intrinsics.checkNotNullParameter(c11, "c1");
        Intrinsics.checkNotNullParameter(c12, "c2");
        for (int i11 = 0; i11 < 8; i11++) {
            getPoints()[i11] = Utils.interpolate(c11.getPoints()[i11], c12.getPoints()[i11], progress);
        }
    }

    public final void transform(@NotNull PointTransformer f11) {
        Intrinsics.checkNotNullParameter(f11, "f");
        transformOnePoint(f11, 0);
        transformOnePoint(f11, 2);
        transformOnePoint(f11, 4);
        transformOnePoint(f11, 6);
    }

    private final void transformOnePoint(PointTransformer f11, int ix2) {
        int i11 = ix2 + 1;
        long jMo103571transformXgqJiTY = f11.mo103571transformXgqJiTY(getPoints()[ix2], getPoints()[i11]);
        getPoints()[ix2] = Float.intBitsToFloat((int) (jMo103571transformXgqJiTY >> 32));
        getPoints()[i11] = Float.intBitsToFloat((int) (jMo103571transformXgqJiTY & KeyboardMap.kValueMask));
    }
}
