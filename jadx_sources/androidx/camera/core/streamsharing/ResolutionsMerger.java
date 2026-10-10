package androidx.camera.core.streamsharing;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.SupportedOutputSizesSorter;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import com.tencent.bugly.proguard.C33978va;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class ResolutionsMerger {
    private static final double SAME_AREA_WIDTH_HEIGHT_RATIO = Math.sqrt(2.3703703703703702d);
    private static final String TAG = "ResolutionsMerger";
    private final CameraInfoInternal mCameraInfo;
    private final Map<UseCaseConfig<?>, List<Size>> mChildSizesCache;
    private final Set<UseCaseConfig<?>> mChildrenConfigs;
    private final Rational mFallbackAspectRatio;
    private final Rational mSensorAspectRatio;
    private final Size mSensorSize;
    private final SupportedOutputSizesSorter mSizeSorter;

    public static class CompareAspectRatioByOverlappingAreaToReference implements Comparator<Rational> {
        private final Rational mReferenceAspectRatio;
        private final boolean mReverse;

        @Override // java.util.Comparator
        public int compare(Rational rational, Rational rational2) {
            float fComputeAreaOverlapping = ResolutionsMerger.computeAreaOverlapping(rational, this.mReferenceAspectRatio);
            float fComputeAreaOverlapping2 = ResolutionsMerger.computeAreaOverlapping(rational2, this.mReferenceAspectRatio);
            return this.mReverse ? Float.compare(fComputeAreaOverlapping2, fComputeAreaOverlapping) : Float.compare(fComputeAreaOverlapping, fComputeAreaOverlapping2);
        }

        public CompareAspectRatioByOverlappingAreaToReference(Rational rational, boolean z11) {
            this.mReferenceAspectRatio = rational;
            this.mReverse = z11;
        }
    }

    public ResolutionsMerger(CameraInternal cameraInternal, Set<UseCaseConfig<?>> set) {
        this(TransformUtils.rectToSize(cameraInternal.getCameraInfoInternal().getSensorRect()), cameraInternal.getCameraInfoInternal(), set);
    }

    private boolean isDoubleCropping(Rational rational, Size size) {
        if (this.mSensorAspectRatio.equals(rational) || AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
            return false;
        }
        return areCroppingInDifferentDirection(this.mSensorAspectRatio.floatValue(), rational.floatValue(), toRationalWithMod16Considered(size).floatValue());
    }

    public PreferredChildSize getPreferredChildSize(UseCaseConfig<?> useCaseConfig, Rect rect, int i11, boolean z11) {
        boolean z12;
        if (TransformUtils.is90or270(i11)) {
            rect = reverseRect(rect);
            z12 = true;
        } else {
            z12 = false;
        }
        PreferredChildSize preferredChildSizeInternal = getPreferredChildSizeInternal(rect, useCaseConfig, z11);
        return z12 ? new PreferredChildSize(reverseRect(preferredChildSizeInternal.getCropRectBeforeScaling()), TransformUtils.reverseSize(preferredChildSizeInternal.getChildSizeToScale()), preferredChildSizeInternal.getOriginalSelectedChildSize()) : preferredChildSizeInternal;
    }

    private boolean areCroppingInDifferentDirection(float f11, float f12, float f13) {
        if (f11 != f12 && f12 != f13) {
            if (f11 > f12) {
                return f12 < f13;
            }
            if (f12 > f13) {
                return true;
            }
        }
        return false;
    }

    private List<Size> filterOutChildSizesCausingDoubleCropping(Rational rational, List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (!isDoubleCropping(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private static List<Size> filterOutChildSizesThatWillNeverBeSelected(List<Size> list) {
        Rational rational;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            Iterator it = map.keySet().iterator();
            do {
                if (!it.hasNext()) {
                    rational = null;
                    break;
                }
                rational = (Rational) it.next();
            } while (!AspectRatioUtil.hasMatchingAspectRatio(size, rational));
            if (rational != null) {
                Size size2 = (Size) map.get(rational);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rational = toRational(size);
            }
            arrayList.add(size);
            map.put(rational, size);
        }
        return arrayList;
    }

    @VisibleForTesting
    public static List<Size> filterResolutionsByAspectRatio(Rational rational, List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private List<Size> getCameraSupportedHighResolutions() {
        return this.mCameraInfo.getSupportedHighResolutions(34);
    }

    private List<Size> getCameraSupportedResolutions() {
        return this.mCameraInfo.getSupportedResolutions(34);
    }

    private Set<Size> getChildrenRequiredResolutions() {
        HashSet hashSet = new HashSet();
        Iterator<UseCaseConfig<?>> it = this.mChildrenConfigs.iterator();
        while (it.hasNext()) {
            hashSet.addAll(getSortedChildSizes(it.next()));
        }
        return hashSet;
    }

    private static Rational getFallbackAspectRatio(Rational rational) {
        Rational rational2 = AspectRatioUtil.ASPECT_RATIO_4_3;
        if (rational.equals(rational2)) {
            return AspectRatioUtil.ASPECT_RATIO_16_9;
        }
        if (rational.equals(AspectRatioUtil.ASPECT_RATIO_16_9)) {
            return rational2;
        }
        throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    private PreferredChildSize getPreferredChildSizeInternal(Rect rect, UseCaseConfig<?> useCaseConfig, boolean z11) {
        Size preferredChildSize;
        Size size;
        if (z11) {
            Pair<Size, Size> preferredChildSizeForViewport = getPreferredChildSizeForViewport(TransformUtils.rectToSize(rect), useCaseConfig);
            preferredChildSize = (Size) preferredChildSizeForViewport.first;
            size = (Size) preferredChildSizeForViewport.second;
        } else {
            Size sizeRectToSize = TransformUtils.rectToSize(rect);
            preferredChildSize = getPreferredChildSize(sizeRectToSize, useCaseConfig);
            rect = getCropRectOfReferenceAspectRatio(sizeRectToSize, preferredChildSize);
            size = preferredChildSize;
        }
        return new PreferredChildSize(rect, size, preferredChildSize);
    }

    private List<Size> getSortedChildSizes(UseCaseConfig<?> useCaseConfig) {
        if (!this.mChildrenConfigs.contains(useCaseConfig)) {
            throw new IllegalArgumentException("Invalid child config: " + useCaseConfig);
        }
        if (this.mChildSizesCache.containsKey(useCaseConfig)) {
            List<Size> list = this.mChildSizesCache.get(useCaseConfig);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> listFilterOutChildSizesThatWillNeverBeSelected = filterOutChildSizesThatWillNeverBeSelected(this.mSizeSorter.getSortedSupportedOutputSizes(useCaseConfig));
        this.mChildSizesCache.put(useCaseConfig, listFilterOutChildSizesThatWillNeverBeSelected);
        return listFilterOutChildSizesThatWillNeverBeSelected;
    }

    private Map<Rational, List<Size>> groupSizesByAspectRatio(List<Size> list) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = AspectRatioUtil.ASPECT_RATIO_4_3;
        map.put(rational, new ArrayList());
        Rational rational2 = AspectRatioUtil.ASPECT_RATIO_16_9;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        for (Size size : list) {
            if (size.getHeight() > 0) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it.next();
                    if (AspectRatioUtil.hasMatchingAspectRatio(size, rational3)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rational4 = toRational(size);
                    arrayList2.add(rational4);
                    map.put(rational4, arrayList);
                }
                arrayList.add(size);
            }
        }
        return map;
    }

    @VisibleForTesting
    public static Rect reverseRect(Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    private List<Size> selectParentResolutions(List<Size> list) {
        ArrayList arrayList = new ArrayList();
        if (needToAddSensorResolutions()) {
            arrayList.addAll(selectParentResolutionsByAspectRatio(this.mSensorAspectRatio, list, false));
        }
        int size = arrayList.size();
        if (shouldPrioritizeFallbackAspectRatio()) {
            size = 0;
        }
        arrayList.addAll(size, selectParentResolutionsByAspectRatio(this.mFallbackAspectRatio, list, false));
        arrayList.addAll(selectOtherAspectRatioParentResolutionsWithFovPriority(list, false));
        if (arrayList.isEmpty()) {
            Logger.m1872w(TAG, "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(selectOtherAspectRatioParentResolutionsWithFovPriority(list, true));
        }
        Logger.m1866d(TAG, "Parent resolutions: " + arrayList);
        return arrayList;
    }

    private boolean shouldIncludeHighResolutions() {
        boolean z11;
        ResolutionSelector resolutionSelector;
        Iterator<UseCaseConfig<?>> it = this.mChildrenConfigs.iterator();
        while (true) {
            z11 = false;
            if (!it.hasNext()) {
                break;
            }
            UseCaseConfig<?> next = it.next();
            if (!next.isHighResolutionDisabled(false) && (next instanceof ImageOutputConfig) && (resolutionSelector = ((ImageOutputConfig) next).getResolutionSelector(null)) != null) {
                z11 = true;
                if (resolutionSelector.getAllowedResolutionMode() == 1) {
                    break;
                }
            }
        }
        return z11;
    }

    private boolean shouldPrioritizeFallbackAspectRatio() {
        if (this.mChildrenConfigs.isEmpty()) {
            return false;
        }
        Iterator<UseCaseConfig<?>> it = this.mChildrenConfigs.iterator();
        while (it.hasNext()) {
            Iterator<Size> it2 = getSortedChildSizes(it.next()).iterator();
            boolean z11 = false;
            boolean z12 = false;
            while (it2.hasNext()) {
                boolean zHasMatchingAspectRatio = AspectRatioUtil.hasMatchingAspectRatio(it2.next(), this.mFallbackAspectRatio);
                if (zHasMatchingAspectRatio) {
                    z11 = true;
                }
                if (z12 && zHasMatchingAspectRatio) {
                    return false;
                }
                if (!zHasMatchingAspectRatio) {
                    z12 = true;
                }
            }
            if (!z11) {
                return false;
            }
        }
        return true;
    }

    private void sortByFov(List<Rational> list) {
        Collections.sort(list, new CompareAspectRatioByOverlappingAreaToReference(toRational(this.mSensorSize), true));
    }

    @VisibleForTesting
    public static void sortInDescendingOrder(List<Size> list) {
        Collections.sort(list, new CompareSizesByArea(true));
    }

    private static Rational toRational(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private static Rational toRationalWithMod16Considered(Size size) {
        Rational rational = AspectRatioUtil.ASPECT_RATIO_4_3;
        if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
            return rational;
        }
        Rational rational2 = AspectRatioUtil.ASPECT_RATIO_16_9;
        return AspectRatioUtil.hasMatchingAspectRatio(size, rational2) ? rational2 : toRational(size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float computeAreaOverlapping(Rational rational, Rational rational2) {
        float fFloatValue = rational.floatValue();
        float fFloatValue2 = rational2.floatValue();
        if (fFloatValue > fFloatValue2) {
            return fFloatValue2 / fFloatValue;
        }
        return fFloatValue / fFloatValue2;
    }

    @VisibleForTesting
    public static List<Size> filterOutParentSizeThatIsTooSmall(Collection<Size> collection, List<Size> list) {
        if (!collection.isEmpty() && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Size size : list) {
                if (isAnyChildSizeCanBeCroppedOutWithoutUpscalingParent(collection, size)) {
                    arrayList.add(size);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    private static Rational findCloserAspectRatio(Size size) {
        if (((double) size.getWidth()) / ((double) size.getHeight()) > SAME_AREA_WIDTH_HEIGHT_RATIO) {
            return AspectRatioUtil.ASPECT_RATIO_16_9;
        }
        return AspectRatioUtil.ASPECT_RATIO_4_3;
    }

    private static Rect getCenterCroppedRectangle(Rational rational, Size size) {
        RectF rectF;
        RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = toRational(size);
        if (rational.floatValue() == rational2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rational.floatValue() > rational2.floatValue()) {
                float f11 = width;
                float fFloatValue = f11 / rational.floatValue();
                float f12 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f12, f11, fFloatValue + f12);
            } else {
                float f13 = height;
                float fFloatValue2 = rational.floatValue() * f13;
                float f14 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f14, 0.0f, fFloatValue2 + f14, f13);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    @VisibleForTesting
    public static Rect getCropRectOfReferenceAspectRatio(Size size, Size size2) {
        return getCenterCroppedRectangle(toRational(size2), size);
    }

    @VisibleForTesting
    public static List<Size> getParentSizesThatAreTooLarge(Collection<Size> collection, List<Size> list) {
        if (!collection.isEmpty() && !list.isEmpty()) {
            List<Size> listRemoveDuplicates = removeDuplicates(list);
            ArrayList arrayList = new ArrayList();
            for (Size size : listRemoveDuplicates) {
                if (isAllChildSizesCanBeCroppedOutWithoutUpscalingParent(collection, size)) {
                    arrayList.add(size);
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.remove(arrayList.size() - 1);
            }
            return arrayList;
        }
        return new ArrayList();
    }

    private static Rational getSensorAspectRatio(Size size) {
        Rational rationalFindCloserAspectRatio = findCloserAspectRatio(size);
        Logger.m1866d(TAG, "The closer aspect ratio to the sensor size (" + size + ") is " + rationalFindCloserAspectRatio + C33978va.f72339h);
        return rationalFindCloserAspectRatio;
    }

    private static List<Size> getSupportedPrivResolutions(List<Pair<Integer, Size[]>> list) {
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).equals(34)) {
                return Arrays.asList((Size[]) pair.second);
            }
        }
        return new ArrayList();
    }

    @VisibleForTesting
    public static boolean hasUpscaling(Size size, Size size2) {
        if (size.getHeight() <= size2.getHeight() && size.getWidth() <= size2.getWidth()) {
            return false;
        }
        return true;
    }

    private static boolean isAllChildSizesCanBeCroppedOutWithoutUpscalingParent(Collection<Size> collection, Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (hasUpscaling(it.next(), size)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAnyChildSizeCanBeCroppedOutWithoutUpscalingParent(Collection<Size> collection, Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (!hasUpscaling(it.next(), size)) {
                return true;
            }
        }
        return false;
    }

    private boolean needToAddSensorResolutions() {
        Iterator<Size> it = getChildrenRequiredResolutions().iterator();
        while (it.hasNext()) {
            if (!AspectRatioUtil.hasMatchingAspectRatio(it.next(), this.mFallbackAspectRatio)) {
                return true;
            }
        }
        return false;
    }

    private static List<Size> removeDuplicates(List<Size> list) {
        if (list.isEmpty()) {
            return list;
        }
        return new ArrayList(new LinkedHashSet(list));
    }

    private List<Size> selectOtherAspectRatioParentResolutionsWithFovPriority(List<Size> list, boolean z11) {
        Map<Rational, List<Size>> mapGroupSizesByAspectRatio = groupSizesByAspectRatio(list);
        ArrayList arrayList = new ArrayList(mapGroupSizesByAspectRatio.keySet());
        sortByFov(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Rational rational : arrayList) {
            if (!rational.equals(AspectRatioUtil.ASPECT_RATIO_16_9) && !rational.equals(AspectRatioUtil.ASPECT_RATIO_4_3)) {
                List<Size> list2 = mapGroupSizesByAspectRatio.get(rational);
                Objects.requireNonNull(list2);
                arrayList2.addAll(selectParentResolutionsByAspectRatio(rational, list2, z11));
            }
        }
        return arrayList2;
    }

    private List<Size> selectParentResolutionsByAspectRatio(Rational rational, List<Size> list, boolean z11) {
        List<Size> listFilterResolutionsByAspectRatio = filterResolutionsByAspectRatio(rational, list);
        sortInDescendingOrder(listFilterResolutionsByAspectRatio);
        HashSet hashSet = new HashSet(listFilterResolutionsByAspectRatio);
        Iterator<UseCaseConfig<?>> it = this.mChildrenConfigs.iterator();
        while (it.hasNext()) {
            List<Size> sortedChildSizes = getSortedChildSizes(it.next());
            if (!z11) {
                sortedChildSizes = filterOutChildSizesCausingDoubleCropping(rational, sortedChildSizes);
            }
            if (sortedChildSizes.isEmpty()) {
                return new ArrayList();
            }
            listFilterResolutionsByAspectRatio = filterOutParentSizeThatIsTooSmall(sortedChildSizes, listFilterResolutionsByAspectRatio);
            hashSet.retainAll(getParentSizesThatAreTooLarge(sortedChildSizes, listFilterResolutionsByAspectRatio));
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : listFilterResolutionsByAspectRatio) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public List<Size> getMergedResolutions(MutableConfig mutableConfig) {
        List<Size> cameraSupportedResolutions = getCameraSupportedResolutions();
        if (shouldIncludeHighResolutions()) {
            ArrayList arrayList = new ArrayList(cameraSupportedResolutions);
            arrayList.addAll(getCameraSupportedHighResolutions());
            cameraSupportedResolutions = arrayList;
        }
        List list = (List) mutableConfig.retrieveOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, null);
        if (list != null) {
            cameraSupportedResolutions = getSupportedPrivResolutions(list);
        }
        return selectParentResolutions(cameraSupportedResolutions);
    }

    @VisibleForTesting
    public Pair<Size, Size> getPreferredChildSizeForViewport(Size size, UseCaseConfig<?> useCaseConfig) {
        for (Size size2 : getSortedChildSizes(useCaseConfig)) {
            Size sizeRectToSize = TransformUtils.rectToSize(getCropRectOfReferenceAspectRatio(size2, size));
            if (!hasUpscaling(sizeRectToSize, size)) {
                return Pair.create(size2, sizeRectToSize);
            }
        }
        return Pair.create(size, size);
    }

    private ResolutionsMerger(Size size, CameraInfoInternal cameraInfoInternal, Set<UseCaseConfig<?>> set) {
        this(size, cameraInfoInternal, set, new SupportedOutputSizesSorter(cameraInfoInternal, size));
    }

    @VisibleForTesting
    public ResolutionsMerger(Size size, CameraInfoInternal cameraInfoInternal, Set<UseCaseConfig<?>> set, SupportedOutputSizesSorter supportedOutputSizesSorter) {
        this.mChildSizesCache = new HashMap();
        this.mSensorSize = size;
        Rational sensorAspectRatio = getSensorAspectRatio(size);
        this.mSensorAspectRatio = sensorAspectRatio;
        this.mFallbackAspectRatio = getFallbackAspectRatio(sensorAspectRatio);
        this.mCameraInfo = cameraInfoInternal;
        this.mChildrenConfigs = set;
        this.mSizeSorter = supportedOutputSizesSorter;
    }

    private boolean isDoubleCropping(Size size, Size size2) {
        return isDoubleCropping(toRationalWithMod16Considered(size), size2);
    }

    @VisibleForTesting
    public Size getPreferredChildSize(Size size, UseCaseConfig<?> useCaseConfig) {
        List<Size> sortedChildSizes = getSortedChildSizes(useCaseConfig);
        for (Size size2 : sortedChildSizes) {
            if (!isDoubleCropping(size, size2) && !hasUpscaling(size2, size)) {
                return size2;
            }
        }
        for (Size size3 : sortedChildSizes) {
            if (!hasUpscaling(size3, size)) {
                return size3;
            }
        }
        return size;
    }
}
