package androidx.graphics.shapes;

import androidx.annotation.IntRange;
import androidx.collection.FloatFloatPair;
import androidx.collection.MutableFloatList;
import io.flutter.embedding.android.KeyboardMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: RoundedPolygon.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a@\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007\u001aL\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0007\u001a\u0019\u0010\u000f\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0012\u001a(\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\u0014"}, m90084d2 = {"RoundedPolygon", "Landroidx/graphics/shapes/RoundedPolygon;", "source", "vertices", "", "rounding", "Landroidx/graphics/shapes/CornerRounding;", "perVertexRounding", "", "centerX", "", "centerY", "numVertices", "", "radius", "calculateCenter", "Landroidx/collection/FloatFloatPair;", "Landroidx/graphics/shapes/Point;", "([F)J", "verticesFromNumVerts", "graphics-shapes_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRoundedPolygon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedPolygon.kt\nandroidx/graphics/shapes/RoundedPolygonKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 4 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,686:1\n1549#2:687\n1620#2,3:688\n67#3:691\n81#3:693\n22#4:692\n22#4:694\n*S KotlinDebug\n*F\n+ 1 RoundedPolygon.kt\nandroidx/graphics/shapes/RoundedPolygonKt\n*L\n356#1:687\n356#1:688,3\n426#1:691\n425#1:693\n426#1:692\n425#1:694\n*E\n"})
public final class RoundedPolygonKt {
    @JvmOverloads
    @NotNull
    public static final RoundedPolygon RoundedPolygon(@IntRange(from = 3) int i11) {
        return RoundedPolygon$default(i11, 0.0f, 0.0f, 0.0f, null, null, 62, null);
    }

    public static /* synthetic */ RoundedPolygon RoundedPolygon$default(int i11, float f11, float f12, float f13, CornerRounding cornerRounding, List list, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i12 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i12 & 8) != 0) {
            f13 = 0.0f;
        }
        if ((i12 & 16) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        if ((i12 & 32) != 0) {
            list = null;
        }
        List list2 = list;
        return RoundedPolygon(i11, f11, f12, f13, cornerRounding, list2);
    }

    private static final long calculateCenter(float[] fArr) {
        float f11 = 0.0f;
        int i11 = 0;
        float f12 = 0.0f;
        while (i11 < fArr.length) {
            int i12 = i11 + 1;
            f11 += fArr[i11];
            i11 += 2;
            f12 += fArr[i12];
        }
        float f13 = 2;
        return FloatFloatPair.m103448constructorimpl((f11 / fArr.length) / f13, (f12 / fArr.length) / f13);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon RoundedPolygon(@IntRange(from = 3) int i11, float f11) {
        return RoundedPolygon$default(i11, f11, 0.0f, 0.0f, null, null, 60, null);
    }

    private static final float[] verticesFromNumVerts(int i11, float f11, float f12, float f13) {
        float[] fArr = new float[i11 * 2];
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            float f14 = f11;
            long jM103566plusybeJwSQ = PointKt.m103566plusybeJwSQ(Utils.m103582radialToCartesianL6JJ3z0$default(f14, (Utils.getFloatPi() / i11) * 2 * i12, 0L, 4, null), FloatFloatPair.m103448constructorimpl(f12, f13));
            int i14 = i13 + 1;
            fArr[i13] = PointKt.m103562getXDnnuFBc(jM103566plusybeJwSQ);
            i13 += 2;
            fArr[i14] = PointKt.m103563getYDnnuFBc(jM103566plusybeJwSQ);
            i12++;
            f11 = f14;
        }
        return fArr;
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon RoundedPolygon(@IntRange(from = 3) int i11, float f11, float f12) {
        return RoundedPolygon$default(i11, f11, f12, 0.0f, null, null, 56, null);
    }

    public static /* synthetic */ RoundedPolygon RoundedPolygon$default(float[] fArr, CornerRounding cornerRounding, List list, float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        if ((i11 & 4) != 0) {
            list = null;
        }
        if ((i11 & 8) != 0) {
            f11 = Float.MIN_VALUE;
        }
        if ((i11 & 16) != 0) {
            f12 = Float.MIN_VALUE;
        }
        return RoundedPolygon(fArr, cornerRounding, (List<CornerRounding>) list, f11, f12);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon RoundedPolygon(@IntRange(from = 3) int i11, float f11, float f12, float f13) {
        return RoundedPolygon$default(i11, f11, f12, f13, null, null, 48, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon RoundedPolygon(@IntRange(from = 3) int i11, float f11, float f12, float f13, @NotNull CornerRounding rounding) {
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return RoundedPolygon$default(i11, f11, f12, f13, rounding, null, 32, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon RoundedPolygon(@NotNull float[] vertices) {
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        return RoundedPolygon$default(vertices, null, null, 0.0f, 0.0f, 30, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon RoundedPolygon(@NotNull float[] vertices, @NotNull CornerRounding rounding) {
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return RoundedPolygon$default(vertices, rounding, null, 0.0f, 0.0f, 28, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon RoundedPolygon(@NotNull float[] vertices, @NotNull CornerRounding rounding, @Nullable List<CornerRounding> list) {
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return RoundedPolygon$default(vertices, rounding, list, 0.0f, 0.0f, 24, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon RoundedPolygon(@NotNull float[] vertices, @NotNull CornerRounding rounding, @Nullable List<CornerRounding> list, float f11) {
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return RoundedPolygon$default(vertices, rounding, list, f11, 0.0f, 16, null);
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon RoundedPolygon(@IntRange(from = 3) int i11, float f11, float f12, float f13, @NotNull CornerRounding rounding, @Nullable List<CornerRounding> list) {
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return RoundedPolygon(verticesFromNumVerts(i11, f11, f12, f13), rounding, list, f12, f13);
    }

    @NotNull
    public static final RoundedPolygon RoundedPolygon(@NotNull RoundedPolygon source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new RoundedPolygon(source.getFeatures$graphics_shapes_release(), source.getCenterX(), source.getCenterY());
    }

    @JvmOverloads
    @NotNull
    public static final RoundedPolygon RoundedPolygon(@NotNull float[] vertices, @NotNull CornerRounding rounding, @Nullable List<CornerRounding> list, float f11, float f12) {
        long jCalculateCenter;
        Pair pairM90091to;
        CornerRounding cornerRounding;
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        if (vertices.length >= 6) {
            int i11 = 2;
            int i12 = 1;
            if (vertices.length % 2 != 1) {
                if (list != null && list.size() * 2 != vertices.length) {
                    throw new IllegalArgumentException("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
                }
                ArrayList arrayList = new ArrayList();
                int length = vertices.length / 2;
                ArrayList arrayList2 = new ArrayList();
                int i13 = 0;
                int i14 = 0;
                while (i14 < length) {
                    CornerRounding cornerRounding2 = (list == null || (cornerRounding = list.get(i14)) == null) ? rounding : cornerRounding;
                    int i15 = (((i14 + length) - 1) % length) * 2;
                    int i16 = i14 + 1;
                    int i17 = (i16 % length) * 2;
                    int i18 = i14 * 2;
                    arrayList2.add(new RoundedCorner(FloatFloatPair.m103448constructorimpl(vertices[i15], vertices[i15 + 1]), FloatFloatPair.m103448constructorimpl(vertices[i18], vertices[i18 + 1]), FloatFloatPair.m103448constructorimpl(vertices[i17], vertices[i17 + 1]), cornerRounding2, null));
                    i14 = i16;
                }
                p852kotlin.ranges.IntRange intRangeUntil = RangesKt.until(0, length);
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
                Iterator<Integer> it = intRangeUntil.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((IntIterator) it).nextInt();
                    int i19 = (iNextInt + 1) % length;
                    float expectedRoundCut = ((RoundedCorner) arrayList2.get(iNextInt)).getExpectedRoundCut() + ((RoundedCorner) arrayList2.get(i19)).getExpectedRoundCut();
                    float expectedCut = ((RoundedCorner) arrayList2.get(iNextInt)).getExpectedCut() + ((RoundedCorner) arrayList2.get(i19)).getExpectedCut();
                    int i21 = iNextInt * 2;
                    int i22 = i19 * 2;
                    float fDistance = Utils.distance(vertices[i21] - vertices[i22], vertices[i21 + 1] - vertices[i22 + 1]);
                    if (expectedRoundCut > fDistance) {
                        pairM90091to = TuplesKt.m90091to(Float.valueOf(fDistance / expectedRoundCut), Float.valueOf(0.0f));
                    } else if (expectedCut > fDistance) {
                        pairM90091to = TuplesKt.m90091to(Float.valueOf(1.0f), Float.valueOf((fDistance - expectedRoundCut) / (expectedCut - expectedRoundCut)));
                    } else {
                        pairM90091to = TuplesKt.m90091to(Float.valueOf(1.0f), Float.valueOf(1.0f));
                    }
                    arrayList3.add(pairM90091to);
                }
                for (int i23 = 0; i23 < length; i23++) {
                    MutableFloatList mutableFloatList = new MutableFloatList(2);
                    for (int i24 = 0; i24 < 2; i24++) {
                        Pair pair = (Pair) arrayList3.get((((i23 + length) - 1) + i24) % length);
                        mutableFloatList.add((((RoundedCorner) arrayList2.get(i23)).getExpectedRoundCut() * ((Number) pair.component1()).floatValue()) + ((((RoundedCorner) arrayList2.get(i23)).getExpectedCut() - ((RoundedCorner) arrayList2.get(i23)).getExpectedRoundCut()) * ((Number) pair.component2()).floatValue()));
                    }
                    arrayList.add(((RoundedCorner) arrayList2.get(i23)).getCubics(mutableFloatList.get(0), mutableFloatList.get(1)));
                }
                ArrayList arrayList4 = new ArrayList();
                while (i13 < length) {
                    int i25 = i13 + 1;
                    int i26 = i25 % length;
                    int i27 = i13 * 2;
                    long jM103448constructorimpl = FloatFloatPair.m103448constructorimpl(vertices[i27], vertices[i27 + i12]);
                    int i28 = (((i13 + length) - i12) % length) * i11;
                    long jM103448constructorimpl2 = FloatFloatPair.m103448constructorimpl(vertices[i28], vertices[i28 + i12]);
                    int i29 = i26 * 2;
                    arrayList4.add(new Feature.Corner((List) arrayList.get(i13), jM103448constructorimpl, ((RoundedCorner) arrayList2.get(i13)).getCenter(), PointKt.m103553clockwiseybeJwSQ(PointKt.m103565minusybeJwSQ(jM103448constructorimpl, jM103448constructorimpl2), PointKt.m103565minusybeJwSQ(FloatFloatPair.m103448constructorimpl(vertices[i29], vertices[i29 + i12]), jM103448constructorimpl)), null));
                    arrayList4.add(new Feature.Edge(CollectionsKt.listOf(Cubic.INSTANCE.straightLine(((Cubic) CollectionsKt.last((List) arrayList.get(i13))).getAnchor1X(), ((Cubic) CollectionsKt.last((List) arrayList.get(i13))).getAnchor1Y(), ((Cubic) CollectionsKt.first((List) arrayList.get(i26))).getAnchor0X(), ((Cubic) CollectionsKt.first((List) arrayList.get(i26))).getAnchor0Y()))));
                    i13 = i25;
                    i11 = 2;
                    i12 = 1;
                }
                if (f11 == Float.MIN_VALUE || f12 == Float.MIN_VALUE) {
                    jCalculateCenter = calculateCenter(vertices);
                } else {
                    jCalculateCenter = FloatFloatPair.m103448constructorimpl(f11, f12);
                }
                return new RoundedPolygon(arrayList4, Float.intBitsToFloat((int) (jCalculateCenter >> 32)), Float.intBitsToFloat((int) (jCalculateCenter & KeyboardMap.kValueMask)));
            }
            throw new IllegalArgumentException("The vertices array should have even size");
        }
        throw new IllegalArgumentException("Polygons must have at least 3 vertices");
    }
}
