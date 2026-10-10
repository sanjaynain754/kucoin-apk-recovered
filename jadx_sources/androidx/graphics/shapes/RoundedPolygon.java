package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import com.tencent.bugly.proguard.AbstractC34022xe;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RoundedPolygon.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!B%\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u001c\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012J\u0013\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0006\u0010\u001b\u001a\u00020\u0000J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\""}, m90084d2 = {"Landroidx/graphics/shapes/RoundedPolygon;", "", AbstractC34022xe.f72514e, "", "Landroidx/graphics/shapes/Feature;", "centerX", "", "centerY", "(Ljava/util/List;FF)V", "getCenterX", "()F", "getCenterY", "cubics", "Landroidx/graphics/shapes/Cubic;", "getCubics", "()Ljava/util/List;", "getFeatures$graphics_shapes_release", "calculateBounds", "", "bounds", "approximate", "", "calculateMaxBounds", "equals", "other", "hashCode", "", "normalized", "toString", "", "transformed", "f", "Landroidx/graphics/shapes/PointTransformer;", "Companion", "graphics-shapes_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRoundedPolygon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedPolygon.kt\nandroidx/graphics/shapes/RoundedPolygon\n+ 2 Utils.kt\nandroidx/graphics/shapes/Utils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,686:1\n108#2,4:687\n108#2,4:691\n108#2,4:695\n1#3:699\n*S KotlinDebug\n*F\n+ 1 RoundedPolygon.kt\nandroidx/graphics/shapes/RoundedPolygon\n*L\n93#1:687,4\n96#1:691,4\n101#1:695,4\n*E\n"})
public final class RoundedPolygon {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final float centerX;
    private final float centerY;

    @NotNull
    private final List<Cubic> cubics;

    @NotNull
    private final List<Feature> features;

    /* JADX INFO: compiled from: RoundedPolygon.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m90084d2 = {"Landroidx/graphics/shapes/RoundedPolygon$Companion;", "", "()V", "graphics-shapes_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @JvmOverloads
    @NotNull
    public final float[] calculateBounds() {
        return calculateBounds$default(this, null, false, 3, null);
    }

    @NotNull
    public final RoundedPolygon normalized() {
        float[] fArrCalculateBounds$default = calculateBounds$default(this, null, false, 3, null);
        float f11 = fArrCalculateBounds$default[2] - fArrCalculateBounds$default[0];
        float f12 = fArrCalculateBounds$default[3] - fArrCalculateBounds$default[1];
        final float fMax = Math.max(f11, f12);
        float f13 = 2;
        final float f14 = ((fMax - f11) / f13) - fArrCalculateBounds$default[0];
        final float f15 = ((fMax - f12) / f13) - fArrCalculateBounds$default[1];
        return transformed(new PointTransformer() { // from class: androidx.graphics.shapes.RoundedPolygon.normalized.1
            @Override // androidx.graphics.shapes.PointTransformer
            /* JADX INFO: renamed from: transform-XgqJiTY */
            public final long mo103571transformXgqJiTY(float f16, float f17) {
                float f18 = f16 + f14;
                float f19 = fMax;
                return FloatFloatPair.m103448constructorimpl(f18 / f19, (f17 + f15) / f19);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RoundedPolygon(@NotNull List<? extends Feature> features, float f11, float f12) {
        List<Cubic> listMutableListOf;
        List<Cubic> listMutableListOf2;
        Cubic cubic;
        List<Cubic> cubics;
        Intrinsics.checkNotNullParameter(features, "features");
        this.features = features;
        this.centerX = f11;
        this.centerY = f12;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int i11 = 0;
        Cubic cubic2 = null;
        if (features.size() <= 0 || ((Feature) features.get(0)).getCubics().size() != 3) {
            listMutableListOf = null;
            listMutableListOf2 = null;
        } else {
            Pair<Cubic, Cubic> pairSplit = ((Feature) features.get(0)).getCubics().get(1).split(0.5f);
            Cubic cubicComponent1 = pairSplit.component1();
            Cubic cubicComponent2 = pairSplit.component2();
            listMutableListOf2 = CollectionsKt.mutableListOf(((Feature) features.get(0)).getCubics().get(0), cubicComponent1);
            listMutableListOf = CollectionsKt.mutableListOf(cubicComponent2, ((Feature) features.get(0)).getCubics().get(2));
        }
        int size = features.size();
        if (size >= 0) {
            int i12 = 0;
            Cubic cubic3 = null;
            while (true) {
                if (i12 == 0 && listMutableListOf != null) {
                    cubics = listMutableListOf;
                } else if (i12 != this.features.size()) {
                    cubics = this.features.get(i12).getCubics();
                } else if (listMutableListOf2 == null) {
                    break;
                } else {
                    cubics = listMutableListOf2;
                }
                int size2 = cubics.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    Cubic cubic4 = cubics.get(i13);
                    if (!cubic4.zeroLength$graphics_shapes_release()) {
                        if (cubic3 != null) {
                            listCreateListBuilder.add(cubic3);
                        }
                        if (cubic2 == null) {
                            cubic2 = cubic4;
                            cubic3 = cubic2;
                        } else {
                            cubic3 = cubic4;
                        }
                    } else if (cubic3 != null) {
                        cubic3.getPoints()[6] = cubic4.getAnchor1X();
                        cubic3.getPoints()[7] = cubic4.getAnchor1Y();
                    }
                }
                if (i12 == size) {
                    break;
                } else {
                    i12++;
                }
            }
            cubic = cubic2;
            cubic2 = cubic3;
        } else {
            cubic = null;
        }
        if (cubic2 != null && cubic != null) {
            listCreateListBuilder.add(CubicKt.Cubic(cubic2.getAnchor0X(), cubic2.getAnchor0Y(), cubic2.getControl0X(), cubic2.getControl0Y(), cubic2.getControl1X(), cubic2.getControl1Y(), cubic.getAnchor0X(), cubic.getAnchor0Y()));
        }
        List<Cubic> listBuild = CollectionsKt.build(listCreateListBuilder);
        this.cubics = listBuild;
        Cubic cubic5 = listBuild.get(listBuild.size() - 1);
        int size3 = listBuild.size();
        while (i11 < size3) {
            Cubic cubic6 = this.cubics.get(i11);
            Cubic cubic7 = cubic5;
            if (Math.abs(cubic6.getAnchor0X() - cubic7.getAnchor1X()) > 1.0E-4f || Math.abs(cubic6.getAnchor0Y() - cubic7.getAnchor1Y()) > 1.0E-4f) {
                throw new IllegalArgumentException("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
            }
            i11++;
            cubic5 = cubic6;
        }
    }

    public static /* synthetic */ float[] calculateBounds$default(RoundedPolygon roundedPolygon, float[] fArr, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fArr = new float[4];
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return roundedPolygon.calculateBounds(fArr, z11);
    }

    public static /* synthetic */ float[] calculateMaxBounds$default(RoundedPolygon roundedPolygon, float[] fArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fArr = new float[4];
        }
        return roundedPolygon.calculateMaxBounds(fArr);
    }

    @JvmOverloads
    @NotNull
    public final float[] calculateBounds(@NotNull float[] bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return calculateBounds$default(this, bounds, false, 2, null);
    }

    @NotNull
    public final float[] calculateMaxBounds(@NotNull float[] bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (bounds.length < 4) {
            throw new IllegalArgumentException("Required bounds size of 4");
        }
        int size = this.cubics.size();
        float fMax = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            Cubic cubic = this.cubics.get(i11);
            float fDistanceSquared = Utils.distanceSquared(cubic.getAnchor0X() - this.centerX, cubic.getAnchor0Y() - this.centerY);
            long jM103550pointOnCurveOOQOV4g$graphics_shapes_release = cubic.m103550pointOnCurveOOQOV4g$graphics_shapes_release(0.5f);
            fMax = Math.max(fMax, Math.max(fDistanceSquared, Utils.distanceSquared(PointKt.m103562getXDnnuFBc(jM103550pointOnCurveOOQOV4g$graphics_shapes_release) - this.centerX, PointKt.m103563getYDnnuFBc(jM103550pointOnCurveOOQOV4g$graphics_shapes_release) - this.centerY)));
        }
        float fSqrt = (float) Math.sqrt(fMax);
        float f11 = this.centerX;
        bounds[0] = f11 - fSqrt;
        float f12 = this.centerY;
        bounds[1] = f12 - fSqrt;
        bounds[2] = f11 + fSqrt;
        bounds[3] = f12 + fSqrt;
        return bounds;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof RoundedPolygon) {
            return Intrinsics.areEqual(this.features, ((RoundedPolygon) other).features);
        }
        return false;
    }

    public final float getCenterX() {
        return this.centerX;
    }

    public final float getCenterY() {
        return this.centerY;
    }

    @NotNull
    public final List<Cubic> getCubics() {
        return this.cubics;
    }

    @NotNull
    public final List<Feature> getFeatures$graphics_shapes_release() {
        return this.features;
    }

    public int hashCode() {
        return this.features.hashCode();
    }

    @NotNull
    public String toString() {
        return "[RoundedPolygon. Cubics = " + CollectionsKt.joinToString$default(this.cubics, null, null, null, 0, null, null, 63, null) + " || Features = " + CollectionsKt.joinToString$default(this.features, null, null, null, 0, null, null, 63, null) + " || Center = (" + this.centerX + ", " + this.centerY + ")]";
    }

    @NotNull
    public final RoundedPolygon transformed(@NotNull PointTransformer f11) {
        Intrinsics.checkNotNullParameter(f11, "f");
        long jM103569transformedso9K2fw = PointKt.m103569transformedso9K2fw(FloatFloatPair.m103448constructorimpl(this.centerX, this.centerY), f11);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int size = this.features.size();
        for (int i11 = 0; i11 < size; i11++) {
            listCreateListBuilder.add(this.features.get(i11).transformed$graphics_shapes_release(f11));
        }
        return new RoundedPolygon(CollectionsKt.build(listCreateListBuilder), PointKt.m103562getXDnnuFBc(jM103569transformedso9K2fw), PointKt.m103563getYDnnuFBc(jM103569transformedso9K2fw));
    }

    @JvmOverloads
    @NotNull
    public final float[] calculateBounds(@NotNull float[] bounds, boolean approximate) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (bounds.length >= 4) {
            int size = this.cubics.size();
            float fMax = Float.MIN_VALUE;
            float fMin = Float.MAX_VALUE;
            float fMin2 = Float.MAX_VALUE;
            float fMax2 = Float.MIN_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                this.cubics.get(i11).calculateBounds$graphics_shapes_release(bounds, approximate);
                fMin = Math.min(fMin, bounds[0]);
                fMin2 = Math.min(fMin2, bounds[1]);
                fMax = Math.max(fMax, bounds[2]);
                fMax2 = Math.max(fMax2, bounds[3]);
            }
            bounds[0] = fMin;
            bounds[1] = fMin2;
            bounds[2] = fMax;
            bounds[3] = fMax2;
            return bounds;
        }
        throw new IllegalArgumentException("Required bounds size of 4");
    }
}
