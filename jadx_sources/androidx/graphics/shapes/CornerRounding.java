package androidx.graphics.shapes;

import androidx.annotation.FloatRange;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CornerRounding.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0019\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, m90084d2 = {"Landroidx/graphics/shapes/CornerRounding;", "", "radius", "", "smoothing", "(FF)V", "getRadius", "()F", "getSmoothing", "Companion", "graphics-shapes_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class CornerRounding {

    @JvmField
    @NotNull
    public static final CornerRounding Unrounded;
    private final float radius;
    private final float smoothing;

    /* JADX WARN: Illegal instructions before constructor call */
    public CornerRounding() {
        float f11 = 0.0f;
        this(f11, f11, 3, null);
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        float f11 = 0.0f;
        Unrounded = new CornerRounding(f11, f11, 3, defaultConstructorMarker);
    }

    public CornerRounding(@FloatRange(from = 0.0d) float f11, @FloatRange(from = 0.0d, m1552to = 1.0d) float f12) {
        this.radius = f11;
        this.smoothing = f12;
    }

    public final float getRadius() {
        return this.radius;
    }

    public final float getSmoothing() {
        return this.smoothing;
    }

    public /* synthetic */ CornerRounding(float f11, float f12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? 0.0f : f12);
    }
}
