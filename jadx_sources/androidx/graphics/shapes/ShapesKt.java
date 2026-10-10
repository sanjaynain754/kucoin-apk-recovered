package androidx.graphics.shapes;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.collection.FloatFloatPair;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.rtmp.TXVodConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Shapes.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001aH\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002\u001a0\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002\u001a4\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u0007\u001a>\u0010\u0012\u001a\u00020\u000f*\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u0007\u001a\u0084\u0001\u0010\u0014\u001a\u00020\u000f*\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a2\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u0007\u001aN\u0010\u001b\u001a\u00020\u000f*\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u001ad\u0010\u001c\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u0007¨\u0006\u001d"}, m90084d2 = {"pillStarVerticesFromNumVerts", "", "numVerticesPerRadius", "", "width", "", "height", "innerRadius", "vertexSpacing", "startLocation", "centerX", "centerY", "starVerticesFromNumVerts", "radius", TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "Landroidx/graphics/shapes/RoundedPolygon;", "Landroidx/graphics/shapes/RoundedPolygon$Companion;", "numVertices", "pill", "smoothing", "pillStar", "innerRadiusRatio", "rounding", "Landroidx/graphics/shapes/CornerRounding;", "innerRounding", "perVertexRounding", "", "rectangle", "star", "graphics-shapes_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nShapes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shapes.kt\nandroidx/graphics/shapes/ShapesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,459:1\n1360#2:460\n1446#2,5:461\n1360#2:466\n1446#2,5:467\n*S KotlinDebug\n*F\n+ 1 Shapes.kt\nandroidx/graphics/shapes/ShapesKt\n*L\n155#1:460\n155#1:461,5\n294#1:466\n294#1:467,5\n*E\n"})
public final class ShapesKt {
    @JvmOverloads
    @NotNull
    public static final RoundedPolygon circle(@NotNull RoundedPolygon.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return circle$default(companion, 0, 0.0f, 0.0f, 0.0f, 15, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pill(@NotNull RoundedPolygon.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pill$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pillStar$default(companion, 0.0f, 0.0f, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2047, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon star(@NotNull RoundedPolygon.Companion companion, int i11) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return star$default(companion, i11, 0.0f, 0.0f, null, null, null, 0.0f, 0.0f, 254, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon circle(@NotNull RoundedPolygon.Companion companion, @IntRange(from = 3) int i11) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return circle$default(companion, i11, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static /* synthetic */ RoundedPolygon circle$default(RoundedPolygon.Companion companion, int i11, float f11, float f12, float f13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8;
        }
        if ((i12 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i12 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i12 & 8) != 0) {
            f13 = 0.0f;
        }
        return circle(companion, i11, f11, f12, f13);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pill(@NotNull RoundedPolygon.Companion companion, float f11) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pill$default(companion, f11, 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
    }

    public static /* synthetic */ RoundedPolygon pill$default(RoundedPolygon.Companion companion, float f11, float f12, float f13, float f14, float f15, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 2.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 1.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            f14 = 0.0f;
        }
        return pill(companion, f11, f12, f13, f14, (i11 & 16) != 0 ? 0.0f : f15);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f11) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pillStar$default(companion, f11, 0.0f, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2046, null);
    }

    public static /* synthetic */ RoundedPolygon pillStar$default(RoundedPolygon.Companion companion, float f11, float f12, int i11, float f13, CornerRounding cornerRounding, CornerRounding cornerRounding2, List list, float f14, float f15, float f16, float f17, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f11 = 2.0f;
        }
        if ((i12 & 2) != 0) {
            f12 = 1.0f;
        }
        if ((i12 & 4) != 0) {
            i11 = 8;
        }
        if ((i12 & 8) != 0) {
            f13 = 0.5f;
        }
        if ((i12 & 16) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        if ((i12 & 32) != 0) {
            cornerRounding2 = null;
        }
        if ((i12 & 64) != 0) {
            list = null;
        }
        if ((i12 & 128) != 0) {
            f14 = 0.5f;
        }
        if ((i12 & 256) != 0) {
            f15 = 0.0f;
        }
        if ((i12 & 512) != 0) {
            f16 = 0.0f;
        }
        return pillStar(companion, f11, f12, i11, f13, cornerRounding, cornerRounding2, list, f14, f15, f16, (i12 & 1024) != 0 ? 0.0f : f17);
    }

    private static final float[] pillStarVerticesFromNumVerts(int i11, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18;
        float f19;
        long jM103448constructorimpl;
        float fMin = Math.min(f11, f12);
        float fCoerceAtLeast = RangesKt.coerceAtLeast(f12 - f11, 0.0f);
        float fCoerceAtLeast2 = RangesKt.coerceAtLeast(f11 - f12, 0.0f);
        float f21 = 2;
        float f22 = fCoerceAtLeast / f21;
        float f23 = fCoerceAtLeast2 / f21;
        float twoPi = Utils.getTwoPi() * fMin * Utils.interpolate(f13, 1.0f, f14);
        float f24 = (f21 * fCoerceAtLeast2) + (f21 * fCoerceAtLeast) + twoPi;
        float f25 = twoPi / 4;
        float f26 = f22 + f25;
        float f27 = f26 + fCoerceAtLeast2;
        float f28 = f27 + f25;
        float f29 = f28 + fCoerceAtLeast;
        float f31 = f29 + f25;
        float f32 = f31 + fCoerceAtLeast2;
        float f33 = f32 + f25;
        float[] fArr = {0.0f, f22, f26, f27, f28, f29, f31, f32, f33, f33 + f22, f24};
        int i12 = i11 * 2;
        float f34 = f24 / i12;
        float f35 = f15 * f24;
        float[] fArr2 = new float[i11 * 4];
        long jM103448constructorimpl2 = FloatFloatPair.m103448constructorimpl(f23, f22);
        float f36 = -f23;
        long jM103448constructorimpl3 = FloatFloatPair.m103448constructorimpl(f36, f22);
        float f37 = -f22;
        long jM103448constructorimpl4 = FloatFloatPair.m103448constructorimpl(f36, f37);
        long jM103448constructorimpl5 = FloatFloatPair.m103448constructorimpl(f23, f37);
        float f38 = f22;
        int i13 = 0;
        float f39 = 0.0f;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i12) {
            float f41 = f35 % f24;
            if (f41 < f39) {
                i14 = 0;
            }
            while (true) {
                int i16 = (i14 + 1) % 11;
                float f42 = fArr[i16];
                if (f41 >= f42) {
                    f38 = fArr[(i16 + 1) % 11];
                    i14 = i16;
                    f39 = f42;
                } else {
                    float f43 = (f41 - f39) / (f38 - f39);
                    float f44 = z11 ? fMin * f13 : fMin;
                    switch (i14) {
                        case 0:
                            f18 = f22;
                            float f45 = f44;
                            f19 = f23;
                            jM103448constructorimpl = FloatFloatPair.m103448constructorimpl(f45, f43 * f18);
                            break;
                        case 1:
                            f18 = f22;
                            float f46 = f44;
                            f19 = f23;
                            jM103448constructorimpl = PointKt.m103566plusybeJwSQ(Utils.m103582radialToCartesianL6JJ3z0$default(f46, (f43 * Utils.getFloatPi()) / f21, 0L, 4, null), jM103448constructorimpl2);
                            break;
                        case 2:
                            f18 = f22;
                            float f47 = f44;
                            f19 = f23;
                            jM103448constructorimpl = FloatFloatPair.m103448constructorimpl(f19 - (f43 * fCoerceAtLeast2), f47);
                            break;
                        case 3:
                            f18 = f22;
                            float f48 = f44;
                            f19 = f23;
                            jM103448constructorimpl = PointKt.m103566plusybeJwSQ(Utils.m103582radialToCartesianL6JJ3z0$default(f48, (Utils.getFloatPi() / f21) + ((f43 * Utils.getFloatPi()) / f21), 0L, 4, null), jM103448constructorimpl3);
                            break;
                        case 4:
                            f18 = f22;
                            float f49 = f44;
                            f19 = f23;
                            jM103448constructorimpl = FloatFloatPair.m103448constructorimpl(-f49, f18 - (f43 * fCoerceAtLeast));
                            break;
                        case 5:
                            f18 = f22;
                            float f51 = f44;
                            f19 = f23;
                            jM103448constructorimpl = PointKt.m103566plusybeJwSQ(Utils.m103582radialToCartesianL6JJ3z0$default(f51, Utils.getFloatPi() + ((f43 * Utils.getFloatPi()) / f21), 0L, 4, null), jM103448constructorimpl4);
                            break;
                        case 6:
                            f18 = f22;
                            float f52 = f44;
                            f19 = f23;
                            jM103448constructorimpl = FloatFloatPair.m103448constructorimpl(f36 + (f43 * fCoerceAtLeast2), -f52);
                            break;
                        case 7:
                            f18 = f22;
                            float f53 = f44;
                            f19 = f23;
                            jM103448constructorimpl = PointKt.m103566plusybeJwSQ(Utils.m103582radialToCartesianL6JJ3z0$default(f53, (Utils.getFloatPi() * 1.5f) + ((f43 * Utils.getFloatPi()) / f21), 0L, 4, null), jM103448constructorimpl5);
                            break;
                        default:
                            f18 = f22;
                            jM103448constructorimpl = FloatFloatPair.m103448constructorimpl(f44, f37 + (f43 * f22));
                            f19 = f23;
                            break;
                    }
                    int i17 = i15 + 1;
                    fArr2[i15] = PointKt.m103562getXDnnuFBc(jM103448constructorimpl) + f16;
                    i15 += 2;
                    fArr2[i17] = PointKt.m103563getYDnnuFBc(jM103448constructorimpl) + f17;
                    f35 += f34;
                    z11 = !z11;
                    f23 = f19;
                    i13++;
                    f22 = f18;
                }
            }
        }
        return fArr2;
    }

    @NotNull
    public static final RoundedPolygon rectangle(@NotNull RoundedPolygon.Companion companion, float f11, float f12, @NotNull CornerRounding rounding, @Nullable List<CornerRounding> list, float f13, float f14) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        float f15 = 2;
        float f16 = f11 / f15;
        float f17 = f13 - f16;
        float f18 = f12 / f15;
        float f19 = f14 - f18;
        float f21 = f16 + f13;
        float f22 = f18 + f14;
        return RoundedPolygonKt.RoundedPolygon(new float[]{f21, f22, f17, f22, f17, f19, f21, f19}, rounding, list, f13, f14);
    }

    public static /* synthetic */ RoundedPolygon rectangle$default(RoundedPolygon.Companion companion, float f11, float f12, CornerRounding cornerRounding, List list, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 2.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 2.0f;
        }
        if ((i11 & 4) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        if ((i11 & 8) != 0) {
            list = null;
        }
        if ((i11 & 16) != 0) {
            f13 = 0.0f;
        }
        if ((i11 & 32) != 0) {
            f14 = 0.0f;
        }
        return rectangle(companion, f11, f12, cornerRounding, list, f13, f14);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon star(@NotNull RoundedPolygon.Companion companion, int i11, float f11) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return star$default(companion, i11, f11, 0.0f, null, null, null, 0.0f, 0.0f, 252, null);
    }

    public static /* synthetic */ RoundedPolygon star$default(RoundedPolygon.Companion companion, int i11, float f11, float f12, CornerRounding cornerRounding, CornerRounding cornerRounding2, List list, float f13, float f14, int i12, Object obj) {
        return star(companion, i11, (i12 & 2) != 0 ? 1.0f : f11, (i12 & 4) != 0 ? 0.5f : f12, (i12 & 8) != 0 ? CornerRounding.Unrounded : cornerRounding, (i12 & 16) != 0 ? null : cornerRounding2, (i12 & 32) == 0 ? list : null, (i12 & 64) != 0 ? 0.0f : f13, (i12 & 128) != 0 ? 0.0f : f14);
    }

    private static final float[] starVerticesFromNumVerts(int i11, float f11, float f12, float f13, float f14) {
        float[] fArr = new float[i11 * 4];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            float f15 = i11;
            long jM103582radialToCartesianL6JJ3z0$default = Utils.m103582radialToCartesianL6JJ3z0$default(f11, (Utils.getFloatPi() / f15) * 2 * i13, 0L, 4, null);
            fArr[i12] = PointKt.m103562getXDnnuFBc(jM103582radialToCartesianL6JJ3z0$default) + f13;
            fArr[i12 + 1] = PointKt.m103563getYDnnuFBc(jM103582radialToCartesianL6JJ3z0$default) + f14;
            long jM103582radialToCartesianL6JJ3z0$default2 = Utils.m103582radialToCartesianL6JJ3z0$default(f12, (Utils.getFloatPi() / f15) * ((i13 * 2) + 1), 0L, 4, null);
            int i14 = i12 + 3;
            fArr[i12 + 2] = PointKt.m103562getXDnnuFBc(jM103582radialToCartesianL6JJ3z0$default2) + f13;
            i12 += 4;
            fArr[i14] = PointKt.m103563getYDnnuFBc(jM103582radialToCartesianL6JJ3z0$default2) + f14;
        }
        return fArr;
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon circle(@NotNull RoundedPolygon.Companion companion, @IntRange(from = 3) int i11, float f11) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return circle$default(companion, i11, f11, 0.0f, 0.0f, 12, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pill(@NotNull RoundedPolygon.Companion companion, float f11, float f12) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pill$default(companion, f11, f12, 0.0f, 0.0f, 0.0f, 28, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f11, float f12) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pillStar$default(companion, f11, f12, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2044, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon star(@NotNull RoundedPolygon.Companion companion, int i11, float f11, float f12) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return star$default(companion, i11, f11, f12, null, null, null, 0.0f, 0.0f, 248, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon circle(@NotNull RoundedPolygon.Companion companion, @IntRange(from = 3) int i11, float f11, float f12) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return circle$default(companion, i11, f11, f12, 0.0f, 8, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pill(@NotNull RoundedPolygon.Companion companion, float f11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pill$default(companion, f11, f12, f13, 0.0f, 0.0f, 24, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f11, float f12, int i11) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pillStar$default(companion, f11, f12, i11, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2040, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon star(@NotNull RoundedPolygon.Companion companion, int i11, float f11, float f12, @NotNull CornerRounding rounding) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return star$default(companion, i11, f11, f12, rounding, null, null, 0.0f, 0.0f, 240, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon circle(@NotNull RoundedPolygon.Companion companion, @IntRange(from = 3) int i11, float f11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        if (i11 >= 3) {
            return RoundedPolygonKt.RoundedPolygon$default(i11, f11 / ((float) Math.cos(Utils.getFloatPi() / i11)), f12, f13, new CornerRounding(f11, 0.0f, 2, null), null, 32, null);
        }
        throw new IllegalArgumentException("Circle must have at least three vertices");
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pill(@NotNull RoundedPolygon.Companion companion, float f11, float f12, float f13, float f14) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pill$default(companion, f11, f12, f13, f14, 0.0f, 16, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f11, float f12, int i11, @FloatRange(from = 0.0d, fromInclusive = false, m1552to = 1.0d, toInclusive = false) float f13) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pillStar$default(companion, f11, f12, i11, f13, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2032, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon star(@NotNull RoundedPolygon.Companion companion, int i11, float f11, float f12, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return star$default(companion, i11, f11, f12, rounding, cornerRounding, null, 0.0f, 0.0f, 224, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pill(@NotNull RoundedPolygon.Companion companion, float f11, float f12, float f13, float f14, float f15) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        if (f11 > 0.0f && f12 > 0.0f) {
            float f16 = 2;
            float f17 = f11 / f16;
            float f18 = f12 / f16;
            float f19 = f17 + f14;
            float f21 = f18 + f15;
            float f22 = (-f17) + f14;
            float f23 = (-f18) + f15;
            return RoundedPolygonKt.RoundedPolygon$default(new float[]{f19, f21, f22, f21, f22, f23, f19, f23}, new CornerRounding(Math.min(f17, f18), f13), null, f14, f15, 4, null);
        }
        throw new IllegalArgumentException("Pill shapes must have positive width and height");
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f11, float f12, int i11, @FloatRange(from = 0.0d, fromInclusive = false, m1552to = 1.0d, toInclusive = false) float f13, @NotNull CornerRounding rounding) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f11, f12, i11, f13, rounding, null, null, 0.0f, 0.0f, 0.0f, 0.0f, TXVodConstants.VOD_PLAY_EVT_TCP_CONNECT_SUCC, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon star(@NotNull RoundedPolygon.Companion companion, int i11, float f11, float f12, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding, @Nullable List<CornerRounding> list) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return star$default(companion, i11, f11, f12, rounding, cornerRounding, list, 0.0f, 0.0f, 192, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f11, float f12, int i11, @FloatRange(from = 0.0d, fromInclusive = false, m1552to = 1.0d, toInclusive = false) float f13, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f11, f12, i11, f13, rounding, cornerRounding, null, 0.0f, 0.0f, 0.0f, 0.0f, 1984, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon star(@NotNull RoundedPolygon.Companion companion, int i11, float f11, float f12, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding, @Nullable List<CornerRounding> list, float f13) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return star$default(companion, i11, f11, f12, rounding, cornerRounding, list, f13, 0.0f, 128, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f11, float f12, int i11, @FloatRange(from = 0.0d, fromInclusive = false, m1552to = 1.0d, toInclusive = false) float f13, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding, @Nullable List<CornerRounding> list) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f11, f12, i11, f13, rounding, cornerRounding, list, 0.0f, 0.0f, 0.0f, 0.0f, 1920, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon star(@NotNull RoundedPolygon.Companion companion, int i11, float f11, float f12, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding, @Nullable List<CornerRounding> list, float f13, float f14) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        if (f11 <= 0.0f || f12 <= 0.0f) {
            throw new IllegalArgumentException("Star radii must both be greater than 0");
        }
        if (f12 < f11) {
            if (list == null && cornerRounding != null) {
                p852kotlin.ranges.IntRange intRangeUntil = RangesKt.until(0, i11);
                list = new ArrayList<>();
                Iterator<Integer> it = intRangeUntil.iterator();
                while (it.hasNext()) {
                    ((IntIterator) it).nextInt();
                    CollectionsKt.addAll(list, CollectionsKt.listOf((Object[]) new CornerRounding[]{rounding, cornerRounding}));
                }
            }
            return RoundedPolygonKt.RoundedPolygon(starVerticesFromNumVerts(i11, f11, f12, f13, f14), rounding, list, f13, f14);
        }
        throw new IllegalArgumentException("innerRadius must be less than radius");
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f11, float f12, int i11, @FloatRange(from = 0.0d, fromInclusive = false, m1552to = 1.0d, toInclusive = false) float f13, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding, @Nullable List<CornerRounding> list, @FloatRange(from = 0.0d, m1552to = 1.0d) float f14) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f11, f12, i11, f13, rounding, cornerRounding, list, f14, 0.0f, 0.0f, 0.0f, 1792, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f11, float f12, int i11, @FloatRange(from = 0.0d, fromInclusive = false, m1552to = 1.0d, toInclusive = false) float f13, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding, @Nullable List<CornerRounding> list, @FloatRange(from = 0.0d, m1552to = 1.0d) float f14, @FloatRange(from = 0.0d, m1552to = 1.0d) float f15) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f11, f12, i11, f13, rounding, cornerRounding, list, f14, f15, 0.0f, 0.0f, 1536, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f11, float f12, int i11, @FloatRange(from = 0.0d, fromInclusive = false, m1552to = 1.0d, toInclusive = false) float f13, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding, @Nullable List<CornerRounding> list, @FloatRange(from = 0.0d, m1552to = 1.0d) float f14, @FloatRange(from = 0.0d, m1552to = 1.0d) float f15, float f16) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f11, f12, i11, f13, rounding, cornerRounding, list, f14, f15, f16, 0.0f, 1024, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f11, float f12, int i11, @FloatRange(from = 0.0d, fromInclusive = false, m1552to = 1.0d, toInclusive = false) float f13, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding, @Nullable List<CornerRounding> list, @FloatRange(from = 0.0d, m1552to = 1.0d) float f14, @FloatRange(from = 0.0d, m1552to = 1.0d) float f15, float f16, float f17) {
        List<CornerRounding> arrayList;
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        if (f11 <= 0.0f || f12 <= 0.0f) {
            throw new IllegalArgumentException("Pill shapes must have positive width and height");
        }
        if (f13 > 0.0f && f13 <= 1.0f) {
            if (list != null || cornerRounding == null) {
                arrayList = list;
            } else {
                p852kotlin.ranges.IntRange intRangeUntil = RangesKt.until(0, i11);
                arrayList = new ArrayList<>();
                Iterator<Integer> it = intRangeUntil.iterator();
                while (it.hasNext()) {
                    ((IntIterator) it).nextInt();
                    CollectionsKt.addAll(arrayList, CollectionsKt.listOf((Object[]) new CornerRounding[]{rounding, cornerRounding}));
                }
            }
            return RoundedPolygonKt.RoundedPolygon(pillStarVerticesFromNumVerts(i11, f11, f12, f13, f14, f15, f16, f17), rounding, arrayList, f16, f17);
        }
        throw new IllegalArgumentException("innerRadius must be between 0 and 1");
    }
}
