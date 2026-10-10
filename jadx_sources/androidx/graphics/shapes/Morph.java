package androidx.graphics.shapes;

import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.PublishedApi;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Morph.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u001c\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013J2\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00190\u001dH\u0087\bø\u0001\u0000R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, m90084d2 = {"Landroidx/graphics/shapes/Morph;", "", "start", "Landroidx/graphics/shapes/RoundedPolygon;", "end", "(Landroidx/graphics/shapes/RoundedPolygon;Landroidx/graphics/shapes/RoundedPolygon;)V", "_morphMatch", "", "Lkotlin/Pair;", "Landroidx/graphics/shapes/Cubic;", "morphMatch", "getMorphMatch$annotations", "()V", "getMorphMatch", "()Ljava/util/List;", "asCubics", "progress", "", "calculateBounds", "", "bounds", "approximate", "", "calculateMaxBounds", "forEachCubic", "", "mutableCubic", "Landroidx/graphics/shapes/MutableCubic;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Companion", "graphics-shapes_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMorph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Morph.kt\nandroidx/graphics/shapes/Morph\n*L\n1#1,342:1\n173#1,10:343\n*S KotlinDebug\n*F\n+ 1 Morph.kt\nandroidx/graphics/shapes/Morph\n*L\n-1#1:343,10\n*E\n"})
public final class Morph {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<Pair<Cubic, Cubic>> _morphMatch;

    @NotNull
    private final RoundedPolygon end;

    @NotNull
    private final RoundedPolygon start;

    /* JADX INFO: compiled from: Morph.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0002\b\n¨\u0006\u000b"}, m90084d2 = {"Landroidx/graphics/shapes/Morph$Companion;", "", "()V", "match", "", "Lkotlin/Pair;", "Landroidx/graphics/shapes/Cubic;", "p1", "Landroidx/graphics/shapes/RoundedPolygon;", "p2", "match$graphics_shapes_release", "graphics-shapes_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMorph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Morph.kt\nandroidx/graphics/shapes/Morph$Companion\n+ 2 Utils.kt\nandroidx/graphics/shapes/Utils\n*L\n1#1,342:1\n108#2,4:343\n108#2,4:347\n108#2,4:351\n108#2,4:355\n108#2,4:359\n*S KotlinDebug\n*F\n+ 1 Morph.kt\nandroidx/graphics/shapes/Morph$Companion\n*L\n239#1:343,4\n284#1:347,4\n290#1:351,4\n297#1:355,4\n304#1:359,4\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final List<Pair<Cubic, Cubic>> match$graphics_shapes_release(@NotNull RoundedPolygon p11, @NotNull RoundedPolygon p12) {
            float endOutlineProgress;
            float fMapBack;
            Pair<MeasuredPolygon.MeasuredCubic, MeasuredPolygon.MeasuredCubic> pairM90091to;
            Pair<MeasuredPolygon.MeasuredCubic, MeasuredPolygon.MeasuredCubic> pairM90091to2;
            Intrinsics.checkNotNullParameter(p11, "p1");
            Intrinsics.checkNotNullParameter(p12, "p2");
            MeasuredPolygon.Companion companion = MeasuredPolygon.INSTANCE;
            MeasuredPolygon measuredPolygonMeasurePolygon$graphics_shapes_release = companion.measurePolygon$graphics_shapes_release(new AngleMeasurer(p11.getCenterX(), p11.getCenterY()), p11);
            MeasuredPolygon measuredPolygonMeasurePolygon$graphics_shapes_release2 = companion.measurePolygon$graphics_shapes_release(new AngleMeasurer(p12.getCenterX(), p12.getCenterY()), p12);
            DoubleMapper doubleMapperFeatureMapper = FeatureMappingKt.featureMapper(measuredPolygonMeasurePolygon$graphics_shapes_release.getFeatures(), measuredPolygonMeasurePolygon$graphics_shapes_release2.getFeatures());
            float map = doubleMapperFeatureMapper.map(0.0f);
            String unused = MorphKt.LOG_TAG;
            MeasuredPolygon measuredPolygonCutAndShift = measuredPolygonMeasurePolygon$graphics_shapes_release2.cutAndShift(map);
            ArrayList arrayList = new ArrayList();
            MeasuredPolygon.MeasuredCubic measuredCubicComponent2 = (MeasuredPolygon.MeasuredCubic) CollectionsKt.getOrNull(measuredPolygonMeasurePolygon$graphics_shapes_release, 0);
            MeasuredPolygon.MeasuredCubic measuredCubicComponent3 = (MeasuredPolygon.MeasuredCubic) CollectionsKt.getOrNull(measuredPolygonCutAndShift, 0);
            int i11 = 1;
            int i12 = 1;
            while (measuredCubicComponent2 != null && measuredCubicComponent3 != null) {
                if (i11 == measuredPolygonMeasurePolygon$graphics_shapes_release.size()) {
                    endOutlineProgress = 1.0f;
                } else {
                    endOutlineProgress = measuredCubicComponent2.getEndOutlineProgress();
                }
                if (i12 == measuredPolygonCutAndShift.size()) {
                    fMapBack = 1.0f;
                } else {
                    fMapBack = doubleMapperFeatureMapper.mapBack(Utils.positiveModulo(measuredCubicComponent3.getEndOutlineProgress() + map, 1.0f));
                }
                float fMin = Math.min(endOutlineProgress, fMapBack);
                String unused2 = MorphKt.LOG_TAG;
                float f11 = 1.0E-6f + fMin;
                if (endOutlineProgress > f11) {
                    String unused3 = MorphKt.LOG_TAG;
                    pairM90091to = measuredCubicComponent2.cutAtProgress(fMin);
                } else {
                    pairM90091to = TuplesKt.m90091to(measuredCubicComponent2, CollectionsKt.getOrNull(measuredPolygonMeasurePolygon$graphics_shapes_release, i11));
                    i11++;
                }
                MeasuredPolygon.MeasuredCubic measuredCubicComponent1 = pairM90091to.component1();
                measuredCubicComponent2 = pairM90091to.component2();
                if (fMapBack > f11) {
                    String unused4 = MorphKt.LOG_TAG;
                    pairM90091to2 = measuredCubicComponent3.cutAtProgress(Utils.positiveModulo(doubleMapperFeatureMapper.map(fMin) - map, 1.0f));
                } else {
                    pairM90091to2 = TuplesKt.m90091to(measuredCubicComponent3, CollectionsKt.getOrNull(measuredPolygonCutAndShift, i12));
                    i12++;
                }
                MeasuredPolygon.MeasuredCubic measuredCubicComponent4 = pairM90091to2.component1();
                measuredCubicComponent3 = pairM90091to2.component2();
                String unused5 = MorphKt.LOG_TAG;
                arrayList.add(TuplesKt.m90091to(measuredCubicComponent1.getCubic(), measuredCubicComponent4.getCubic()));
            }
            if (measuredCubicComponent2 == null && measuredCubicComponent3 == null) {
                return arrayList;
            }
            throw new IllegalArgumentException("Expected both Polygon's Cubic to be fully matched");
        }
    }

    @JvmOverloads
    @NotNull
    public final float[] calculateBounds() {
        return calculateBounds$default(this, null, false, 3, null);
    }

    @JvmOverloads
    public final void forEachCubic(float progress, @NotNull MutableCubic mutableCubic, @NotNull Function1<? super MutableCubic, Unit> callback) {
        Intrinsics.checkNotNullParameter(mutableCubic, "mutableCubic");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int size = getMorphMatch().size();
        for (int i11 = 0; i11 < size; i11++) {
            mutableCubic.interpolate(getMorphMatch().get(i11).getFirst(), getMorphMatch().get(i11).getSecond(), progress);
            callback.invoke(mutableCubic);
        }
    }

    public static /* synthetic */ float[] calculateBounds$default(Morph morph, float[] fArr, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fArr = new float[4];
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return morph.calculateBounds(fArr, z11);
    }

    public static /* synthetic */ float[] calculateMaxBounds$default(Morph morph, float[] fArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fArr = new float[4];
        }
        return morph.calculateMaxBounds(fArr);
    }

    public static /* synthetic */ void forEachCubic$default(Morph morph, float f11, MutableCubic mutableCubic, Function1 callback, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            mutableCubic = new MutableCubic();
        }
        Intrinsics.checkNotNullParameter(mutableCubic, "mutableCubic");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int size = morph.getMorphMatch().size();
        for (int i12 = 0; i12 < size; i12++) {
            mutableCubic.interpolate(morph.getMorphMatch().get(i12).getFirst(), morph.getMorphMatch().get(i12).getSecond(), f11);
            callback.invoke(mutableCubic);
        }
    }

    @NotNull
    public final List<Cubic> asCubics(float progress) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int size = this._morphMatch.size();
        Cubic cubic = null;
        Cubic cubic2 = null;
        int i11 = 0;
        while (i11 < size) {
            float[] fArr = new float[8];
            for (int i12 = 0; i12 < 8; i12++) {
                fArr[i12] = Utils.interpolate(this._morphMatch.get(i11).getFirst().getPoints()[i12], this._morphMatch.get(i11).getSecond().getPoints()[i12], progress);
            }
            Cubic cubic3 = new Cubic(fArr);
            if (cubic2 == null) {
                cubic2 = cubic3;
            }
            if (cubic != null) {
                listCreateListBuilder.add(cubic);
            }
            i11++;
            cubic = cubic3;
        }
        if (cubic != null && cubic2 != null) {
            listCreateListBuilder.add(CubicKt.Cubic(cubic.getAnchor0X(), cubic.getAnchor0Y(), cubic.getControl0X(), cubic.getControl0Y(), cubic.getControl1X(), cubic.getControl1Y(), cubic2.getAnchor0X(), cubic2.getAnchor0Y()));
        }
        return CollectionsKt.build(listCreateListBuilder);
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
        this.start.calculateMaxBounds(bounds);
        float f11 = bounds[0];
        float f12 = bounds[1];
        float f13 = bounds[2];
        float f14 = bounds[3];
        this.end.calculateMaxBounds(bounds);
        bounds[0] = Math.min(f11, bounds[0]);
        bounds[1] = Math.min(f12, bounds[1]);
        bounds[2] = Math.max(f13, bounds[2]);
        bounds[3] = Math.max(f14, bounds[3]);
        return bounds;
    }

    @NotNull
    public final List<Pair<Cubic, Cubic>> getMorphMatch() {
        return this._morphMatch;
    }

    public Morph(@NotNull RoundedPolygon start, @NotNull RoundedPolygon end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.start = start;
        this.end = end;
        this._morphMatch = INSTANCE.match$graphics_shapes_release(start, end);
    }

    @JvmOverloads
    @NotNull
    public final float[] calculateBounds(@NotNull float[] bounds, boolean approximate) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.start.calculateBounds(bounds, approximate);
        float f11 = bounds[0];
        float f12 = bounds[1];
        float f13 = bounds[2];
        float f14 = bounds[3];
        this.end.calculateBounds(bounds, approximate);
        bounds[0] = Math.min(f11, bounds[0]);
        bounds[1] = Math.min(f12, bounds[1]);
        bounds[2] = Math.max(f13, bounds[2]);
        bounds[3] = Math.max(f14, bounds[3]);
        return bounds;
    }

    @JvmOverloads
    public final void forEachCubic(float f11, @NotNull Function1<? super MutableCubic, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        MutableCubic mutableCubic = new MutableCubic();
        int size = getMorphMatch().size();
        for (int i11 = 0; i11 < size; i11++) {
            mutableCubic.interpolate(getMorphMatch().get(i11).getFirst(), getMorphMatch().get(i11).getSecond(), f11);
            callback.invoke(mutableCubic);
        }
    }

    @PublishedApi
    public static /* synthetic */ void getMorphMatch$annotations() {
    }
}
