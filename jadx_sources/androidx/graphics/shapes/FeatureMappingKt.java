package androidx.graphics.shapes;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;

/* JADX INFO: compiled from: FeatureMapping.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0000\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\nH\u0000\u001a,\u0010\u000b\u001a\u00020\f2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0010\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000*\u0018\b\u0000\u0010\u000f\"\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0010"}, m90084d2 = {"LOG_TAG", "", "doMapping", "", "Landroidx/graphics/shapes/ProgressableFeature;", "Landroidx/graphics/shapes/MeasuredFeatures;", "f1", "f2", "featureDistSquared", "", "Landroidx/graphics/shapes/Feature;", "featureMapper", "Landroidx/graphics/shapes/DoubleMapper;", "features1", "features2", "MeasuredFeatures", "graphics-shapes_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFeatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureMapping.kt\nandroidx/graphics/shapes/FeatureMappingKt\n+ 2 Utils.kt\nandroidx/graphics/shapes/Utils\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n108#2,4:132\n108#2,4:138\n108#2,4:142\n37#3,2:136\n2310#4,14:146\n2310#4,14:161\n1#5:160\n*S KotlinDebug\n*F\n+ 1 FeatureMapping.kt\nandroidx/graphics/shapes/FeatureMappingKt\n*L\n65#1:132,4\n67#1:138,4\n90#1:142,4\n66#1:136,2\n111#1:146,14\n123#1:161,14\n*E\n"})
public final class FeatureMappingKt {

    @NotNull
    private static final String LOG_TAG = "FeatureMapping";

    @NotNull
    public static final List<ProgressableFeature> doMapping(@NotNull List<ProgressableFeature> f11, @NotNull List<ProgressableFeature> f12) {
        Intrinsics.checkNotNullParameter(f11, "f1");
        Intrinsics.checkNotNullParameter(f12, "f2");
        Iterator<Integer> it = CollectionsKt.getIndices(f12).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        IntIterator intIterator = (IntIterator) it;
        int iNextInt = intIterator.nextInt();
        if (it.hasNext()) {
            float fFeatureDistSquared = featureDistSquared(f11.get(0).getFeature(), f12.get(iNextInt).getFeature());
            do {
                int iNextInt2 = intIterator.nextInt();
                float fFeatureDistSquared2 = featureDistSquared(f11.get(0).getFeature(), f12.get(iNextInt2).getFeature());
                if (Float.compare(fFeatureDistSquared, fFeatureDistSquared2) > 0) {
                    iNextInt = iNextInt2;
                    fFeatureDistSquared = fFeatureDistSquared2;
                }
            } while (it.hasNext());
        }
        int size = f11.size();
        int size2 = f12.size();
        List<ProgressableFeature> listMutableListOf = CollectionsKt.mutableListOf(f12.get(iNextInt));
        int i11 = iNextInt;
        for (int i12 = 1; i12 < size; i12++) {
            int i13 = iNextInt - (size - i12);
            if (i13 <= i11) {
                i13 += size2;
            }
            Iterator<Integer> it2 = new IntRange(i11 + 1, i13).iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            IntIterator intIterator2 = (IntIterator) it2;
            int iNextInt3 = intIterator2.nextInt();
            if (it2.hasNext()) {
                float fFeatureDistSquared3 = featureDistSquared(f11.get(i12).getFeature(), f12.get(iNextInt3 % size2).getFeature());
                do {
                    int iNextInt4 = intIterator2.nextInt();
                    float fFeatureDistSquared4 = featureDistSquared(f11.get(i12).getFeature(), f12.get(iNextInt4 % size2).getFeature());
                    if (Float.compare(fFeatureDistSquared3, fFeatureDistSquared4) > 0) {
                        iNextInt3 = iNextInt4;
                        fFeatureDistSquared3 = fFeatureDistSquared4;
                    }
                } while (it2.hasNext());
            }
            i11 = iNextInt3;
            listMutableListOf.add(f12.get(i11 % size2));
        }
        return listMutableListOf;
    }

    public static final float featureDistSquared(@NotNull Feature f11, @NotNull Feature f12) {
        Intrinsics.checkNotNullParameter(f11, "f1");
        Intrinsics.checkNotNullParameter(f12, "f2");
        if ((f11 instanceof Feature.Corner) && (f12 instanceof Feature.Corner) && ((Feature.Corner) f11).getConvex() != ((Feature.Corner) f12).getConvex()) {
            return Float.MAX_VALUE;
        }
        float anchor0X = (((Cubic) CollectionsKt.first((List) f11.getCubics())).getAnchor0X() + ((Cubic) CollectionsKt.last((List) f11.getCubics())).getAnchor1X()) / 2.0f;
        float anchor0Y = (((Cubic) CollectionsKt.first((List) f11.getCubics())).getAnchor0Y() + ((Cubic) CollectionsKt.last((List) f11.getCubics())).getAnchor1Y()) / 2.0f;
        float anchor0X2 = anchor0X - ((((Cubic) CollectionsKt.first((List) f12.getCubics())).getAnchor0X() + ((Cubic) CollectionsKt.last((List) f12.getCubics())).getAnchor1X()) / 2.0f);
        float anchor0Y2 = anchor0Y - ((((Cubic) CollectionsKt.first((List) f12.getCubics())).getAnchor0Y() + ((Cubic) CollectionsKt.last((List) f12.getCubics())).getAnchor1Y()) / 2.0f);
        return (anchor0X2 * anchor0X2) + (anchor0Y2 * anchor0Y2);
    }

    @NotNull
    public static final DoubleMapper featureMapper(@NotNull List<ProgressableFeature> features1, @NotNull List<ProgressableFeature> features2) {
        Intrinsics.checkNotNullParameter(features1, "features1");
        Intrinsics.checkNotNullParameter(features2, "features2");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int size = features1.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (features1.get(i11).getFeature() instanceof Feature.Corner) {
                listCreateListBuilder.add(features1.get(i11));
            }
        }
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        List listCreateListBuilder2 = CollectionsKt.createListBuilder();
        int size2 = features2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (features2.get(i12).getFeature() instanceof Feature.Corner) {
                listCreateListBuilder2.add(features2.get(i12));
            }
        }
        List listBuild2 = CollectionsKt.build(listCreateListBuilder2);
        Pair pairM90091to = listBuild.size() > listBuild2.size() ? TuplesKt.m90091to(doMapping(listBuild2, listBuild), listBuild2) : TuplesKt.m90091to(listBuild, doMapping(listBuild, listBuild2));
        List list = (List) pairM90091to.component1();
        List list2 = (List) pairM90091to.component2();
        List listCreateListBuilder3 = CollectionsKt.createListBuilder();
        int size3 = list.size();
        for (int i13 = 0; i13 < size3 && i13 != list2.size(); i13++) {
            listCreateListBuilder3.add(TuplesKt.m90091to(Float.valueOf(((ProgressableFeature) list.get(i13)).getProgress()), Float.valueOf(((ProgressableFeature) list2.get(i13)).getProgress())));
        }
        Pair[] pairArr = (Pair[]) CollectionsKt.build(listCreateListBuilder3).toArray(new Pair[0]);
        return new DoubleMapper((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}
