package androidx.camera.core.internal;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import com.tencent.bugly.proguard.C33978va;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class SupportedOutputSizesSorter {
    private static final String TAG = "SupportedOutputSizesCollector";
    private final CameraInfoInternal mCameraInfoInternal;
    private final Rational mFullFovRatio;
    private final int mLensFacing;
    private final int mSensorOrientation;
    private final SupportedOutputSizesSorterLegacy mSupportedOutputSizesSorterLegacy;

    private static LinkedHashMap<Rational, List<Size>> applyAspectRatioStrategyFallbackRule(Map<Rational, List<Size>> map, AspectRatioStrategy aspectRatioStrategy, Rational rational) {
        boolean z11 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z11 = false;
        }
        Rational targetAspectRatioRationalValue = getTargetAspectRatioRationalValue(aspectRatioStrategy.getPreferredAspectRatio(), z11);
        if (aspectRatioStrategy.getFallbackRule() == 0) {
            Rational targetAspectRatioRationalValue2 = getTargetAspectRatioRationalValue(aspectRatioStrategy.getPreferredAspectRatio(), z11);
            for (Rational rational2 : new ArrayList(map.keySet())) {
                if (!rational2.equals(targetAspectRatioRationalValue2)) {
                    map.remove(rational2);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new AspectRatioUtil.CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(targetAspectRatioRationalValue, rational));
        LinkedHashMap<Rational, List<Size>> linkedHashMap = new LinkedHashMap<>();
        for (Rational rational3 : arrayList) {
            linkedHashMap.put(rational3, map.get(rational3));
        }
        return linkedHashMap;
    }

    private List<Size> getSizeListByFormat(List<Pair<Integer, Size[]>> list, int i11) {
        Size[] sizeArr;
        if (list != null) {
            for (Pair<Integer, Size[]> pair : list) {
                if (((Integer) pair.first).intValue() == i11) {
                    sizeArr = (Size[]) pair.second;
                }
            }
            sizeArr = null;
        } else {
            sizeArr = null;
        }
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    public static Rational getTargetAspectRatioRationalValue(int i11, boolean z11) {
        if (i11 == -1) {
            return null;
        }
        if (i11 == 0) {
            return z11 ? AspectRatioUtil.ASPECT_RATIO_4_3 : AspectRatioUtil.ASPECT_RATIO_3_4;
        }
        if (i11 == 1) {
            return z11 ? AspectRatioUtil.ASPECT_RATIO_16_9 : AspectRatioUtil.ASPECT_RATIO_9_16;
        }
        Logger.m1868e(TAG, "Undefined target aspect ratio: " + i11);
        return null;
    }

    public List<Size> getSortedSupportedOutputSizes(UseCaseConfig<?> useCaseConfig) {
        ImageOutputConfig imageOutputConfig = (ImageOutputConfig) useCaseConfig;
        List<Size> customOrderedResolutions = imageOutputConfig.getCustomOrderedResolutions(null);
        if (customOrderedResolutions != null) {
            return customOrderedResolutions;
        }
        ResolutionSelector resolutionSelector = imageOutputConfig.getResolutionSelector(null);
        List<Size> resolutionCandidateList = getResolutionCandidateList(imageOutputConfig.getSupportedResolutions(null), useCaseConfig.getInputFormat());
        if (resolutionSelector == null) {
            return this.mSupportedOutputSizesSorterLegacy.sortSupportedOutputSizes(resolutionCandidateList, useCaseConfig);
        }
        Size maxResolution = ((ImageOutputConfig) useCaseConfig).getMaxResolution(null);
        int targetRotation = imageOutputConfig.getTargetRotation(0);
        if (!useCaseConfig.isHighResolutionDisabled(false)) {
            resolutionCandidateList = applyHighResolutionSettings(resolutionCandidateList, resolutionSelector, useCaseConfig.getInputFormat());
        }
        List<Size> list = resolutionCandidateList;
        Logger.m1866d(TAG, "useCaseConfig = " + useCaseConfig + ", candidateSizes = " + list);
        return sortSupportedOutputSizesByResolutionSelector(imageOutputConfig.getResolutionSelector(), list, maxResolution, targetRotation, this.mFullFovRatio, this.mSensorOrientation, this.mLensFacing);
    }

    private static List<Size> applyResolutionFilter(List<Size> list, ResolutionFilter resolutionFilter, int i11, int i12, int i13) {
        if (resolutionFilter == null) {
            return list;
        }
        List<Size> listFilter = resolutionFilter.filter(new ArrayList(list), CameraOrientationUtil.getRelativeImageRotation(CameraOrientationUtil.surfaceRotationToDegrees(i11), i12, i13 == 1));
        if (list.containsAll(listFilter)) {
            return listFilter;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    private static void applyResolutionStrategy(LinkedHashMap<Rational, List<Size>> linkedHashMap, ResolutionStrategy resolutionStrategy) {
        if (resolutionStrategy == null) {
            return;
        }
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            applyResolutionStrategyFallbackRule(linkedHashMap.get(it.next()), resolutionStrategy);
        }
    }

    private Rational calculateFullFovRatioFromActiveArraySize(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational calculateFullFovRatioFromSupportedOutputSizes(CameraInfoInternal cameraInfoInternal) {
        List<Size> supportedResolutions = cameraInfoInternal.getSupportedResolutions(256);
        if (supportedResolutions.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(supportedResolutions, new CompareSizesByArea());
        return new Rational(size.getWidth(), size.getHeight());
    }

    public static List<Rational> getResolutionListGroupingAspectRatioKeys(List<Size> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AspectRatioUtil.ASPECT_RATIO_4_3);
        arrayList.add(AspectRatioUtil.ASPECT_RATIO_16_9);
        for (Size size : list) {
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                } while (!AspectRatioUtil.hasMatchingAspectRatio(size, (Rational) it.next()));
            }
        }
        return arrayList;
    }

    public static Map<Rational, List<Size>> groupSizesByAspectRatio(List<Size> list) {
        HashMap map = new HashMap();
        Iterator<Rational> it = getResolutionListGroupingAspectRatioKeys(list).iterator();
        while (it.hasNext()) {
            map.put(it.next(), new ArrayList());
        }
        for (Size size : list) {
            for (Rational rational : map.keySet()) {
                if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static void sortSupportedSizesByFallbackRuleClosestHigherThenLower(List<Size> list, Size size, boolean z11) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z11) {
            list.addAll(arrayList);
        }
    }

    private static void sortSupportedSizesByFallbackRuleClosestLowerThenHigher(List<Size> list, Size size, boolean z11) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            Size size2 = list.get(i11);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z11) {
            list.addAll(arrayList);
        }
    }

    public SupportedOutputSizesSorter(CameraInfoInternal cameraInfoInternal, Size size) {
        Rational rationalCalculateFullFovRatioFromSupportedOutputSizes;
        this.mCameraInfoInternal = cameraInfoInternal;
        this.mSensorOrientation = cameraInfoInternal.getSensorRotationDegrees();
        this.mLensFacing = cameraInfoInternal.getLensFacing();
        if (size != null) {
            rationalCalculateFullFovRatioFromSupportedOutputSizes = calculateFullFovRatioFromActiveArraySize(size);
        } else {
            rationalCalculateFullFovRatioFromSupportedOutputSizes = calculateFullFovRatioFromSupportedOutputSizes(cameraInfoInternal);
        }
        this.mFullFovRatio = rationalCalculateFullFovRatioFromSupportedOutputSizes;
        this.mSupportedOutputSizesSorterLegacy = new SupportedOutputSizesSorterLegacy(cameraInfoInternal, rationalCalculateFullFovRatioFromSupportedOutputSizes);
    }

    private static LinkedHashMap<Rational, List<Size>> applyAspectRatioStrategy(List<Size> list, AspectRatioStrategy aspectRatioStrategy, Rational rational) {
        return applyAspectRatioStrategyFallbackRule(groupSizesByAspectRatio(list), aspectRatioStrategy, rational);
    }

    private List<Size> applyHighResolutionSettings(List<Size> list, ResolutionSelector resolutionSelector, int i11) {
        if (resolutionSelector.getAllowedResolutionMode() == 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            arrayList.addAll(this.mCameraInfoInternal.getSupportedHighResolutions(i11));
            Collections.sort(arrayList, new CompareSizesByArea(true));
            return arrayList;
        }
        return list;
    }

    private static void applyMaxResolutionRestriction(LinkedHashMap<Rational, List<Size>> linkedHashMap, Size size) {
        int area = SizeUtil.getArea(size);
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = linkedHashMap.get(it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (SizeUtil.getArea(size2) <= area) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    private static void applyResolutionStrategyFallbackRule(List<Size> list, ResolutionStrategy resolutionStrategy) {
        if (!list.isEmpty()) {
            int fallbackRule = resolutionStrategy.getFallbackRule();
            if (!resolutionStrategy.equals(ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY)) {
                Size boundSize = resolutionStrategy.getBoundSize();
                if (fallbackRule != 0) {
                    if (fallbackRule != 1) {
                        if (fallbackRule != 2) {
                            if (fallbackRule != 3) {
                                if (fallbackRule != 4) {
                                    return;
                                }
                                sortSupportedSizesByFallbackRuleClosestLowerThenHigher(list, boundSize, false);
                                return;
                            }
                            sortSupportedSizesByFallbackRuleClosestLowerThenHigher(list, boundSize, true);
                            return;
                        }
                        sortSupportedSizesByFallbackRuleClosestHigherThenLower(list, boundSize, false);
                        return;
                    }
                    sortSupportedSizesByFallbackRuleClosestHigherThenLower(list, boundSize, true);
                    return;
                }
                sortSupportedSizesByFallbackRuleNone(list, boundSize);
            }
        }
    }

    private List<Size> getResolutionCandidateList(List<Pair<Integer, Size[]>> list, int i11) {
        List<Size> sizeListByFormat = getSizeListByFormat(list, i11);
        if (sizeListByFormat == null) {
            sizeListByFormat = this.mCameraInfoInternal.getSupportedResolutions(i11);
        }
        ArrayList arrayList = new ArrayList(sizeListByFormat);
        Collections.sort(arrayList, new CompareSizesByArea(true));
        if (arrayList.isEmpty()) {
            Logger.m1872w(TAG, "The retrieved supported resolutions from camera info internal is empty. Format is " + i11 + C33978va.f72339h);
        }
        return arrayList;
    }

    public static List<Size> sortSupportedOutputSizesByResolutionSelector(ResolutionSelector resolutionSelector, List<Size> list, Size size, int i11, Rational rational, int i12, int i13) {
        LinkedHashMap<Rational, List<Size>> linkedHashMapApplyAspectRatioStrategy = applyAspectRatioStrategy(list, resolutionSelector.getAspectRatioStrategy(), rational);
        if (size != null) {
            applyMaxResolutionRestriction(linkedHashMapApplyAspectRatioStrategy, size);
        }
        applyResolutionStrategy(linkedHashMapApplyAspectRatioStrategy, resolutionSelector.getResolutionStrategy());
        ArrayList arrayList = new ArrayList();
        Iterator<List<Size>> it = linkedHashMapApplyAspectRatioStrategy.values().iterator();
        while (it.hasNext()) {
            for (Size size2 : it.next()) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        return applyResolutionFilter(arrayList, resolutionSelector.getResolutionFilter(), i11, i12, i13);
    }

    private static void sortSupportedSizesByFallbackRuleNone(List<Size> list, Size size) {
        boolean zContains = list.contains(size);
        list.clear();
        if (zContains) {
            list.add(size);
        }
    }
}
