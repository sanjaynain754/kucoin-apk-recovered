package androidx.graphics.shapes;

import androidx.annotation.FloatRange;
import androidx.collection.FloatList;
import androidx.collection.MutableFloatList;
import com.tencent.bugly.proguard.AbstractC34022xe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.AbstractList;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: PolygonMeasure.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00182\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0018\u0019B3\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0010H\u0096\u0002R\u0018\u0010\b\u001a\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, m90084d2 = {"Landroidx/graphics/shapes/MeasuredPolygon;", "Lkotlin/collections/AbstractList;", "Landroidx/graphics/shapes/MeasuredPolygon$MeasuredCubic;", "measurer", "Landroidx/graphics/shapes/Measurer;", AbstractC34022xe.f72514e, "", "Landroidx/graphics/shapes/ProgressableFeature;", "cubics", "Landroidx/graphics/shapes/Cubic;", "outlineProgress", "Landroidx/collection/FloatList;", "(Landroidx/graphics/shapes/Measurer;Ljava/util/List;Ljava/util/List;Landroidx/collection/FloatList;)V", "getFeatures", "()Ljava/util/List;", "size", "", "getSize", "()I", "cutAndShift", "cuttingPoint", "", "get", "index", "Companion", "MeasuredCubic", "graphics-shapes_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPolygonMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PolygonMeasure.kt\nandroidx/graphics/shapes/MeasuredPolygon\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Utils.kt\nandroidx/graphics/shapes/Utils\n*L\n1#1,353:1\n1#2:354\n350#3,7:355\n108#4,4:362\n*S KotlinDebug\n*F\n+ 1 PolygonMeasure.kt\nandroidx/graphics/shapes/MeasuredPolygon\n*L\n169#1:355,7\n182#1:362,4\n*E\n"})
public final class MeasuredPolygon extends AbstractList<MeasuredCubic> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<MeasuredCubic> cubics;

    @NotNull
    private final List<ProgressableFeature> features;

    @NotNull
    private final Measurer measurer;

    /* JADX INFO: compiled from: PolygonMeasure.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\t¨\u0006\n"}, m90084d2 = {"Landroidx/graphics/shapes/MeasuredPolygon$Companion;", "", "()V", "measurePolygon", "Landroidx/graphics/shapes/MeasuredPolygon;", "measurer", "Landroidx/graphics/shapes/Measurer;", "polygon", "Landroidx/graphics/shapes/RoundedPolygon;", "measurePolygon$graphics_shapes_release", "graphics-shapes_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nPolygonMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PolygonMeasure.kt\nandroidx/graphics/shapes/MeasuredPolygon$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Utils.kt\nandroidx/graphics/shapes/Utils\n*L\n1#1,353:1\n2949#2:354\n2847#2,3:355\n2850#2,6:359\n1#3:358\n108#4,4:365\n*S KotlinDebug\n*F\n+ 1 PolygonMeasure.kt\nandroidx/graphics/shapes/MeasuredPolygon$Companion\n*L\n259#1:354\n259#1:355,3\n259#1:359,6\n259#1:358\n275#1:365,4\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final MeasuredPolygon measurePolygon$graphics_shapes_release(@NotNull Measurer measurer, @NotNull RoundedPolygon polygon) {
            List listListOf;
            Intrinsics.checkNotNullParameter(measurer, "measurer");
            Intrinsics.checkNotNullParameter(polygon, "polygon");
            ArrayList<Cubic> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = polygon.getFeatures$graphics_shapes_release().size();
            for (int i11 = 0; i11 < size; i11++) {
                Feature feature = polygon.getFeatures$graphics_shapes_release().get(i11);
                int size2 = feature.getCubics().size();
                for (int i12 = 0; i12 < size2; i12++) {
                    if ((feature instanceof Feature.Corner) && i12 == feature.getCubics().size() / 2) {
                        arrayList2.add(TuplesKt.m90091to(feature, Integer.valueOf(arrayList.size())));
                    }
                    arrayList.add(feature.getCubics().get(i12));
                }
            }
            Float fValueOf = Float.valueOf(0.0f);
            int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(arrayList, 9);
            if (iCollectionSizeOrDefault == 0) {
                listListOf = CollectionsKt.listOf(fValueOf);
            } else {
                ArrayList arrayList3 = new ArrayList(iCollectionSizeOrDefault + 1);
                arrayList3.add(fValueOf);
                for (Cubic cubic : arrayList) {
                    float fFloatValue = fValueOf.floatValue();
                    float fMeasureCubic = measurer.measureCubic(cubic);
                    if (fMeasureCubic < 0.0f) {
                        throw new IllegalArgumentException("Measured cubic is expected to be greater or equal to zero");
                    }
                    Unit unit = Unit.INSTANCE;
                    fValueOf = Float.valueOf(fFloatValue + fMeasureCubic);
                    arrayList3.add(fValueOf);
                }
                listListOf = arrayList3;
            }
            float fFloatValue2 = ((Number) CollectionsKt.last(listListOf)).floatValue();
            MutableFloatList mutableFloatList = new MutableFloatList(listListOf.size());
            int size3 = listListOf.size();
            for (int i13 = 0; i13 < size3; i13++) {
                mutableFloatList.add(((Number) listListOf.get(i13)).floatValue() / fFloatValue2);
            }
            String unused = PolygonMeasureKt.LOG_TAG;
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            int size4 = arrayList2.size();
            for (int i14 = 0; i14 < size4; i14++) {
                int iIntValue = ((Number) ((Pair) arrayList2.get(i14)).getSecond()).intValue();
                listCreateListBuilder.add(new ProgressableFeature((mutableFloatList.get(iIntValue) + mutableFloatList.get(iIntValue + 1)) / 2, (Feature) ((Pair) arrayList2.get(i14)).getFirst()));
            }
            return new MeasuredPolygon(measurer, CollectionsKt.build(listCreateListBuilder), arrayList, mutableFloatList, null);
        }
    }

    /* JADX INFO: compiled from: PolygonMeasure.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\"\u0010\u0010\u001a\u0016\u0012\b\u0012\u00060\u0000R\u00020\u0012\u0012\b\u0012\u00060\u0000R\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0016J!\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0019"}, m90084d2 = {"Landroidx/graphics/shapes/MeasuredPolygon$MeasuredCubic;", "", "cubic", "Landroidx/graphics/shapes/Cubic;", "startOutlineProgress", "", "endOutlineProgress", "(Landroidx/graphics/shapes/MeasuredPolygon;Landroidx/graphics/shapes/Cubic;FF)V", "getCubic", "()Landroidx/graphics/shapes/Cubic;", "<set-?>", "getEndOutlineProgress", "()F", "measuredSize", "getMeasuredSize", "getStartOutlineProgress", "cutAtProgress", "Lkotlin/Pair;", "Landroidx/graphics/shapes/MeasuredPolygon;", "cutOutlineProgress", "toString", "", "updateProgressRange", "", "updateProgressRange$graphics_shapes_release", "graphics-shapes_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nPolygonMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PolygonMeasure.kt\nandroidx/graphics/shapes/MeasuredPolygon$MeasuredCubic\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Utils.kt\nandroidx/graphics/shapes/Utils\n*L\n1#1,353:1\n1#2:354\n108#3,4:355\n*S KotlinDebug\n*F\n+ 1 PolygonMeasure.kt\nandroidx/graphics/shapes/MeasuredPolygon$MeasuredCubic\n*L\n128#1:355,4\n*E\n"})
    public final class MeasuredCubic {

        @NotNull
        private final Cubic cubic;
        private float endOutlineProgress;

        /* JADX INFO: renamed from: measuredSize, reason: from kotlin metadata and from toString */
        private final float size;

        /* JADX INFO: renamed from: startOutlineProgress, reason: from kotlin metadata and from toString */
        private float outlineProgress;
        final /* synthetic */ MeasuredPolygon this$0;

        public MeasuredCubic(@NotNull MeasuredPolygon measuredPolygon, @FloatRange(from = 0.0d, m1552to = 1.0d) Cubic cubic, @FloatRange(from = 0.0d, m1552to = 1.0d) float f11, float f12) {
            Intrinsics.checkNotNullParameter(cubic, "cubic");
            this.this$0 = measuredPolygon;
            this.cubic = cubic;
            if (f12 < f11) {
                throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            }
            this.size = measuredPolygon.measurer.measureCubic(cubic);
            this.outlineProgress = f11;
            this.endOutlineProgress = f12;
        }

        public static /* synthetic */ void updateProgressRange$graphics_shapes_release$default(MeasuredCubic measuredCubic, float f11, float f12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = measuredCubic.outlineProgress;
            }
            if ((i11 & 2) != 0) {
                f12 = measuredCubic.endOutlineProgress;
            }
            measuredCubic.updateProgressRange$graphics_shapes_release(f11, f12);
        }

        @NotNull
        public final Pair<MeasuredCubic, MeasuredCubic> cutAtProgress(float cutOutlineProgress) {
            float fCoerceIn = RangesKt.coerceIn(cutOutlineProgress, this.outlineProgress, this.endOutlineProgress);
            float f11 = this.endOutlineProgress;
            float f12 = this.outlineProgress;
            float fFindCubicCutPoint = this.this$0.measurer.findCubicCutPoint(this.cubic, ((fCoerceIn - f12) / (f11 - f12)) * this.size);
            if (0.0f > fFindCubicCutPoint || fFindCubicCutPoint > 1.0f) {
                throw new IllegalArgumentException("Cubic cut point is expected to be between 0 and 1");
            }
            String unused = PolygonMeasureKt.LOG_TAG;
            Pair<Cubic, Cubic> pairSplit = this.cubic.split(fFindCubicCutPoint);
            return TuplesKt.m90091to(new MeasuredCubic(this.this$0, pairSplit.component1(), this.outlineProgress, fCoerceIn), new MeasuredCubic(this.this$0, pairSplit.component2(), fCoerceIn, this.endOutlineProgress));
        }

        @NotNull
        public final Cubic getCubic() {
            return this.cubic;
        }

        public final float getEndOutlineProgress() {
            return this.endOutlineProgress;
        }

        /* JADX INFO: renamed from: getMeasuredSize, reason: from getter */
        public final float getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: getStartOutlineProgress, reason: from getter */
        public final float getOutlineProgress() {
            return this.outlineProgress;
        }

        @NotNull
        public String toString() {
            return "MeasuredCubic(outlineProgress=[" + this.outlineProgress + " .. " + this.endOutlineProgress + "], size=" + this.size + ", cubic=" + this.cubic + ')';
        }

        public final void updateProgressRange$graphics_shapes_release(float startOutlineProgress, float endOutlineProgress) {
            if (endOutlineProgress < startOutlineProgress) {
                throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            }
            this.outlineProgress = startOutlineProgress;
            this.endOutlineProgress = endOutlineProgress;
        }
    }

    public /* synthetic */ MeasuredPolygon(Measurer measurer, List list, List list2, FloatList floatList, DefaultConstructorMarker defaultConstructorMarker) {
        this(measurer, list, list2, floatList);
    }

    public /* bridge */ boolean contains(MeasuredCubic measuredCubic) {
        return super.contains((Object) measuredCubic);
    }

    @NotNull
    public final MeasuredPolygon cutAndShift(float cuttingPoint) {
        float fPositiveModulo;
        if (0.0f > cuttingPoint || cuttingPoint > 1.0f) {
            throw new IllegalArgumentException("Cutting point is expected to be between 0 and 1");
        }
        if (cuttingPoint < 1.0E-4f) {
            return this;
        }
        Iterator<MeasuredCubic> it = this.cubics.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            MeasuredCubic next = it.next();
            float outlineProgress = next.getOutlineProgress();
            if (cuttingPoint <= next.getEndOutlineProgress() && outlineProgress <= cuttingPoint) {
                break;
            }
            i11++;
        }
        Pair<MeasuredCubic, MeasuredCubic> pairCutAtProgress = this.cubics.get(i11).cutAtProgress(cuttingPoint);
        MeasuredCubic measuredCubicComponent1 = pairCutAtProgress.component1();
        MeasuredCubic measuredCubicComponent2 = pairCutAtProgress.component2();
        String unused = PolygonMeasureKt.LOG_TAG;
        List listMutableListOf = CollectionsKt.mutableListOf(measuredCubicComponent2.getCubic());
        int size = this.cubics.size();
        for (int i12 = 1; i12 < size; i12++) {
            List<MeasuredCubic> list = this.cubics;
            listMutableListOf.add(list.get((i12 + i11) % list.size()).getCubic());
        }
        listMutableListOf.add(measuredCubicComponent1.getCubic());
        MutableFloatList mutableFloatList = new MutableFloatList(this.cubics.size() + 2);
        int size2 = this.cubics.size() + 2;
        for (int i13 = 0; i13 < size2; i13++) {
            if (i13 == 0) {
                fPositiveModulo = 0.0f;
            } else if (i13 == this.cubics.size() + 1) {
                fPositiveModulo = 1.0f;
            } else {
                fPositiveModulo = Utils.positiveModulo(this.cubics.get(((i11 + i13) - 1) % this.cubics.size()).getEndOutlineProgress() - cuttingPoint, 1.0f);
            }
            mutableFloatList.add(fPositiveModulo);
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int size3 = this.features.size();
        for (int i14 = 0; i14 < size3; i14++) {
            listCreateListBuilder.add(new ProgressableFeature(Utils.positiveModulo(this.features.get(i14).getProgress() - cuttingPoint, 1.0f), this.features.get(i14).getFeature()));
        }
        return new MeasuredPolygon(this.measurer, CollectionsKt.build(listCreateListBuilder), listMutableListOf, mutableFloatList);
    }

    public /* bridge */ int indexOf(MeasuredCubic measuredCubic) {
        return super.indexOf((Object) measuredCubic);
    }

    public /* bridge */ int lastIndexOf(MeasuredCubic measuredCubic) {
        return super.lastIndexOf((Object) measuredCubic);
    }

    private MeasuredPolygon(Measurer measurer, List<ProgressableFeature> list, List<? extends Cubic> list2, FloatList floatList) {
        if (floatList.getSize() != list2.size() + 1) {
            throw new IllegalArgumentException("Outline progress size is expected to be the cubics size + 1");
        }
        if (floatList.first() != 0.0f) {
            throw new IllegalArgumentException("First outline progress value is expected to be zero");
        }
        if (floatList.last() != 1.0f) {
            throw new IllegalArgumentException("Last outline progress value is expected to be one");
        }
        this.measurer = measurer;
        this.features = list;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int i11 = 0;
        float f11 = 0.0f;
        while (i11 < size) {
            int i12 = i11 + 1;
            if (floatList.get(i12) - floatList.get(i11) > 1.0E-4f) {
                arrayList.add(new MeasuredCubic(this, list2.get(i11), f11, floatList.get(i12)));
                f11 = floatList.get(i12);
            }
            i11 = i12;
        }
        MeasuredCubic.updateProgressRange$graphics_shapes_release$default((MeasuredCubic) arrayList.get(CollectionsKt.getLastIndex(arrayList)), 0.0f, 1.0f, 1, null);
        this.cubics = arrayList;
    }

    @Override // p852kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof MeasuredCubic) {
            return contains((MeasuredCubic) obj);
        }
        return false;
    }

    @Override // p852kotlin.collections.AbstractList, java.util.List
    @NotNull
    public MeasuredCubic get(int index) {
        return this.cubics.get(index);
    }

    @NotNull
    public final List<ProgressableFeature> getFeatures() {
        return this.features;
    }

    @Override // p852kotlin.collections.AbstractList, p852kotlin.collections.AbstractCollection
    public int getSize() {
        return this.cubics.size();
    }

    @Override // p852kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof MeasuredCubic) {
            return indexOf((MeasuredCubic) obj);
        }
        return -1;
    }

    @Override // p852kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof MeasuredCubic) {
            return lastIndexOf((MeasuredCubic) obj);
        }
        return -1;
    }
}
