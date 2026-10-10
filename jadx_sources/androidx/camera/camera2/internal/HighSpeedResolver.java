package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HighSpeedResolver.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u0002H\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00110\u0016\"\u0004\b\u0000\u0010\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u0002H\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00110\u0016J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\fJ&\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00110\u00112\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00110\u0011J'\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0 \u0018\u00010\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0002\u0010\"J$\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0011\"\u0004\b\u0000\u0010\u0017*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u00110\u0011H\u0002J\u001c\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0 0\u00112\u0006\u0010\u001b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m90084d2 = {"Landroidx/camera/camera2/internal/HighSpeedResolver;", "", "characteristics", "Landroidx/camera/camera2/internal/compat/CameraCharacteristicsCompat;", "<init>", "(Landroidx/camera/camera2/internal/compat/CameraCharacteristicsCompat;)V", "isHighSpeedSupported", "", "()Z", "isHighSpeedSupported$delegate", "Lkotlin/Lazy;", "maxSize", "Landroid/util/Size;", "getMaxSize", "()Landroid/util/Size;", "maxSize$delegate", "supportedSizes", "", "getSupportedSizes", "()Ljava/util/List;", "supportedSizes$delegate", "filterCommonSupportedSizes", "", ExifInterface.GPS_DIRECTION_TRUE, "sizesMap", "getMaxFrameRate", "", "size", "getSizeArrangements", "sizesList", "getFrameRateRangesFor", "", "Landroid/util/Range;", "surfaceSizes", "(Ljava/util/List;)[Landroid/util/Range;", "findCommonElements", "getHighSpeedVideoFpsRangesFor", "Companion", "camera-camera2_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHighSpeedResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HighSpeedResolver.kt\nandroidx/camera/camera2/internal/HighSpeedResolver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,230:1\n774#2:231\n865#2,2:232\n1246#2,2:236\n774#2:238\n865#2,2:239\n1249#2:241\n1557#2:243\n1628#2,3:244\n774#2:247\n865#2,2:248\n1863#2,2:252\n1948#2,14:256\n462#3:234\n412#3:235\n1#4:242\n37#5,2:250\n12604#6,2:254\n*S KotlinDebug\n*F\n+ 1 HighSpeedResolver.kt\nandroidx/camera/camera2/internal/HighSpeedResolver\n*L\n71#1:231\n71#1:232,2\n72#1:236,2\n72#1:238\n72#1:239,2\n72#1:241\n121#1:243\n121#1:244,3\n151#1:247\n151#1:248,2\n173#1:252,2\n45#1:256,14\n72#1:234\n72#1:235\n155#1:250,2\n38#1:254,2\n*E\n"})
public final class HighSpeedResolver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Range<Integer> DEFAULT_FPS = new Range<>(120, 120);

    @NotNull
    private static final String TAG = "HighSpeedResolver";

    @NotNull
    private final CameraCharacteristicsCompat characteristics;

    /* JADX INFO: renamed from: isHighSpeedSupported$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isHighSpeedSupported;

    /* JADX INFO: renamed from: maxSize$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy maxSize;

    /* JADX INFO: renamed from: supportedSizes$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy supportedSizes;

    /* JADX INFO: compiled from: HighSpeedResolver.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Landroidx/camera/camera2/internal/HighSpeedResolver$Companion;", "", "<init>", "()V", "TAG", "", "DEFAULT_FPS", "Landroid/util/Range;", "", "isHighSpeedOn", "", "attachedSurfaces", "", "Landroidx/camera/core/impl/AttachedSurfaceInfo;", "newUseCaseConfigs", "Landroidx/camera/core/impl/UseCaseConfig;", "camera-camera2_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nHighSpeedResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HighSpeedResolver.kt\nandroidx/camera/camera2/internal/HighSpeedResolver$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1557#2:231\n1628#2,3:232\n1557#2:235\n1628#2,3:236\n1755#2,3:239\n1734#2,3:242\n*S KotlinDebug\n*F\n+ 1 HighSpeedResolver.kt\nandroidx/camera/camera2/internal/HighSpeedResolver$Companion\n*L\n215#1:231\n215#1:232,3\n216#1:235\n216#1:236,3\n218#1:239,3\n222#1:242,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final boolean isHighSpeedOn(@NotNull Collection<? extends AttachedSurfaceInfo> attachedSurfaces, @NotNull Collection<? extends UseCaseConfig<?>> newUseCaseConfigs) {
            boolean z11;
            Intrinsics.checkNotNullParameter(attachedSurfaces, "attachedSurfaces");
            Intrinsics.checkNotNullParameter(newUseCaseConfigs, "newUseCaseConfigs");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(attachedSurfaces, 10));
            Iterator<T> it = attachedSurfaces.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((AttachedSurfaceInfo) it.next()).getSessionType()));
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(newUseCaseConfigs, 10));
            Iterator<T> it2 = newUseCaseConfigs.iterator();
            while (true) {
                z11 = false;
                if (!it2.hasNext()) {
                    break;
                }
                arrayList2.add(Integer.valueOf(((UseCaseConfig) it2.next()).getSessionType(0)));
            }
            List listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
            if (listPlus == null || !listPlus.isEmpty()) {
                Iterator it3 = listPlus.iterator();
                while (it3.hasNext()) {
                    if (((Number) it3.next()).intValue() == 1) {
                        z11 = true;
                        break;
                    }
                }
            }
            if (!z11 || (listPlus != null && listPlus.isEmpty())) {
                return z11;
            }
            Iterator it4 = listPlus.iterator();
            while (it4.hasNext()) {
                if (((Number) it4.next()).intValue() != 1) {
                    throw new IllegalArgumentException("All sessionTypes should be high-speed when any of them is high-speed");
                }
            }
            return z11;
        }
    }

    public HighSpeedResolver(@NotNull CameraCharacteristicsCompat characteristics) {
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        this.characteristics = characteristics;
        this.isHighSpeedSupported = LazyKt.lazy(new Function0() { // from class: androidx.camera.camera2.internal.g3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(HighSpeedResolver.isHighSpeedSupported_delegate$lambda$1(this.f1351b));
            }
        });
        this.maxSize = LazyKt.lazy(new Function0() { // from class: androidx.camera.camera2.internal.h3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HighSpeedResolver.maxSize_delegate$lambda$4(this.f1358b);
            }
        });
        this.supportedSizes = LazyKt.lazy(new Function0() { // from class: androidx.camera.camera2.internal.i3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HighSpeedResolver.supportedSizes_delegate$lambda$5(this.f1365b);
            }
        });
    }

    private final List<Range<Integer>> getHighSpeedVideoFpsRangesFor(Size size) {
        Object objM103844constructorimpl;
        List listFilterNotNull;
        List<Range<Integer>> list;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(this.characteristics.getStreamConfigurationMapCompat().getHighSpeedVideoFpsRangesFor(size));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        Range[] rangeArr = (Range[]) objM103844constructorimpl;
        return (rangeArr == null || (listFilterNotNull = ArraysKt.filterNotNull(rangeArr)) == null || (list = CollectionsKt.toList(listFilterNotNull)) == null) ? CollectionsKt.emptyList() : list;
    }

    private final List<Size> getSupportedSizes() {
        return (List) this.supportedSizes.getValue();
    }

    @JvmStatic
    public static final boolean isHighSpeedOn(@NotNull Collection<? extends AttachedSurfaceInfo> collection, @NotNull Collection<? extends UseCaseConfig<?>> collection2) {
        return INSTANCE.isHighSpeedOn(collection, collection2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isHighSpeedSupported_delegate$lambda$1(HighSpeedResolver highSpeedResolver) {
        int[] iArr = (int[]) highSpeedResolver.characteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List supportedSizes_delegate$lambda$5(HighSpeedResolver highSpeedResolver) {
        List listFilterNotNull;
        Size[] highSpeedVideoSizes = highSpeedResolver.characteristics.getStreamConfigurationMapCompat().getHighSpeedVideoSizes();
        return (highSpeedVideoSizes == null || (listFilterNotNull = ArraysKt.filterNotNull(highSpeedVideoSizes)) == null) ? CollectionsKt.emptyList() : listFilterNotNull;
    }

    @Nullable
    public final Size getMaxSize() {
        return (Size) this.maxSize.getValue();
    }

    public final boolean isHighSpeedSupported() {
        return ((Boolean) this.isHighSpeedSupported.getValue()).booleanValue();
    }

    private final <T> List<T> findCommonElements(List<? extends List<? extends T>> list) {
        if (list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List<T> mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.first((List) list));
        Iterator<T> it = CollectionsKt.drop(list, 1).iterator();
        while (it.hasNext()) {
            mutableList.retainAll((List) it.next());
        }
        return mutableList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Size maxSize_delegate$lambda$4(HighSpeedResolver highSpeedResolver) {
        List<Size> supportedSizes = highSpeedResolver.getSupportedSizes();
        if (supportedSizes.isEmpty()) {
            supportedSizes = null;
        }
        if (supportedSizes == null) {
            return null;
        }
        Iterator<T> it = supportedSizes.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int area = SizeUtil.getArea((Size) next);
                do {
                    Object next2 = it.next();
                    int area2 = SizeUtil.getArea((Size) next2);
                    if (area < area2) {
                        next = next2;
                        area = area2;
                    }
                } while (it.hasNext());
            }
            return (Size) next;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public final <T> Map<T, List<Size>> filterCommonSupportedSizes(@NotNull Map<T, ? extends List<Size>> sizesMap) {
        Intrinsics.checkNotNullParameter(sizesMap, "sizesMap");
        List<T> listFindCommonElements = findCommonElements(CollectionsKt.toList(sizesMap.values()));
        ArrayList arrayList = new ArrayList();
        for (T t11 : listFindCommonElements) {
            if (getSupportedSizes().contains((Size) t11)) {
                arrayList.add(t11);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(sizesMap.size()));
        Iterator<T> it = sizesMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (arrayList.contains((Size) obj)) {
                    arrayList2.add(obj);
                }
            }
            linkedHashMap.put(key, arrayList2);
        }
        return linkedHashMap;
    }

    @Nullable
    public final Range<Integer>[] getFrameRateRangesFor(@NotNull List<Size> surfaceSizes) {
        Intrinsics.checkNotNullParameter(surfaceSizes, "surfaceSizes");
        int size = surfaceSizes.size();
        if (1 > size || size >= 3 || CollectionsKt.distinct(surfaceSizes).size() != 1) {
            return null;
        }
        List<Range<Integer>> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(surfaceSizes.get(0));
        if (highSpeedVideoFpsRangesFor.isEmpty()) {
            highSpeedVideoFpsRangesFor = null;
        }
        if (highSpeedVideoFpsRangesFor == null) {
            return null;
        }
        if (surfaceSizes.size() == 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : highSpeedVideoFpsRangesFor) {
                Range range = (Range) obj;
                if (Intrinsics.areEqual(range.getLower(), range.getUpper())) {
                    arrayList.add(obj);
                }
            }
            highSpeedVideoFpsRangesFor = arrayList;
        }
        return (Range[]) highSpeedVideoFpsRangesFor.toArray(new Range[0]);
    }

    public final int getMaxFrameRate(@NotNull Size size) {
        Intrinsics.checkNotNullParameter(size, "size");
        List<Range<Integer>> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(size);
        if (highSpeedVideoFpsRangesFor.isEmpty()) {
            highSpeedVideoFpsRangesFor = null;
        }
        if (highSpeedVideoFpsRangesFor == null) {
            Logger.m1872w(TAG, "No supported high speed  fps for " + size);
            return 0;
        }
        Iterator<T> it = highSpeedVideoFpsRangesFor.iterator();
        if (it.hasNext()) {
            Integer num = (Integer) ((Range) it.next()).getUpper();
            while (it.hasNext()) {
                Integer num2 = (Integer) ((Range) it.next()).getUpper();
                if (num.compareTo(num2) < 0) {
                    num = num2;
                }
            }
            Intrinsics.checkNotNullExpressionValue(num, "maxOf(...)");
            return num.intValue();
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public final List<List<Size>> getSizeArrangements(@NotNull List<? extends List<Size>> sizesList) {
        Intrinsics.checkNotNullParameter(sizesList, "sizesList");
        if (sizesList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List<Size> listFindCommonElements = findCommonElements(sizesList);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFindCommonElements, 10));
        for (Size size : listFindCommonElements) {
            int size2 = sizesList.size();
            ArrayList arrayList2 = new ArrayList(size2);
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList2.add(size);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }
}
