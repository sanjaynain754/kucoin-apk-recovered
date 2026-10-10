package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class KeylineStateList {
    private static final int NO_INDEX = -1;
    private final KeylineState defaultState;
    private final float endShiftRange;
    private final List<KeylineState> endStateSteps;
    private final float[] endStateStepsInterpolationPoints;
    private final float startShiftRange;
    private final List<KeylineState> startStateSteps;
    private final float[] startStateStepsInterpolationPoints;

    private static int findFirstNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int i11 = 0; i11 < keylineState.getKeylines().size(); i11++) {
            if (!keylineState.getKeylines().get(i11).isAnchor) {
                return i11;
            }
        }
        return -1;
    }

    private static float[] getStateStepsRange(List<KeylineState> list, float f11, float[] fArr) {
        int size = list.size();
        float f12 = fArr[0];
        int i11 = 1;
        while (i11 < size) {
            float f13 = fArr[i11];
            if (f11 <= f13) {
                return new float[]{AnimationUtils.lerp(0.0f, 1.0f, f12, f13, f11), i11 - 1, i11};
            }
            i11++;
            f12 = f13;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    @NonNull
    public KeylineState getShiftedState(float f11, float f12, float f13) {
        return getShiftedState(f11, f12, f13, false);
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.KeylineStateList$1 */
    public static /* synthetic */ class C71651 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$android$material$carousel$CarouselStrategy$StrategyType */
        static final /* synthetic */ int[] f11758xb90fbfa;

        static {
            int[] iArr = new int[CarouselStrategy.StrategyType.values().length];
            f11758xb90fbfa = iArr;
            try {
                iArr[CarouselStrategy.StrategyType.CONTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static KeylineStateList from(Carousel carousel, KeylineState keylineState, float f11, float f12, float f13, CarouselStrategy.StrategyType strategyType) {
        return new KeylineStateList(keylineState, getStateStepsStart(carousel, keylineState, f11, f12, strategyType), getStateStepsEnd(carousel, keylineState, f11, f13, strategyType));
    }

    private static List<KeylineState> getStateStepsEnd(Carousel carousel, KeylineState keylineState, float f11, float f12, CarouselStrategy.StrategyType strategyType) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int iFindLastNonAnchorKeylineIndex = findLastNonAnchorKeylineIndex(keylineState);
        int containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        if (!isLastFocalItemVisibleAtRightOfContainer(carousel, keylineState) && iFindLastNonAnchorKeylineIndex != -1) {
            int lastFocalKeylineIndex = iFindLastNonAnchorKeylineIndex - keylineState.getLastFocalKeylineIndex();
            float f13 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (lastFocalKeylineIndex <= 0 && keylineState.getLastFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, (f13 - keylineState.getLastFocalKeyline().cutoff) - f12, containerWidth));
                return arrayList;
            }
            float f14 = 0.0f;
            int i11 = 0;
            while (i11 < lastFocalKeylineIndex) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int i12 = iFindLastNonAnchorKeylineIndex - i11;
                float f15 = f14 + keylineState.getKeylines().get(i12).cutoff;
                int i13 = i12 + 1;
                int i14 = containerWidth;
                KeylineState keylineStateMoveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, iFindLastNonAnchorKeylineIndex, i13 < keylineState.getKeylines().size() ? findLastIndexBeforeFirstFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i13).mask) + 1 : 0, f13 - f15, keylineState.getFirstFocalKeylineIndex() + i11 + 1, keylineState.getLastFocalKeylineIndex() + i11 + 1, i14);
                if (i11 == lastFocalKeylineIndex - 1 && f12 > 0.0f) {
                    keylineStateMoveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(keylineStateMoveKeylineAndCreateKeylineState, f12, i14, false, f11, strategyType);
                    i14 = i14;
                }
                arrayList.add(keylineStateMoveKeylineAndCreateKeylineState);
                i11++;
                containerWidth = i14;
                f14 = f15;
            }
        } else if (f12 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f12, containerWidth, false, f11, strategyType));
        }
        return arrayList;
    }

    private static List<KeylineState> getStateStepsStart(Carousel carousel, KeylineState keylineState, float f11, float f12, CarouselStrategy.StrategyType strategyType) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int iFindFirstNonAnchorKeylineIndex = findFirstNonAnchorKeylineIndex(keylineState);
        int containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        if (!isFirstFocalItemAtLeftOfContainer(keylineState) && iFindFirstNonAnchorKeylineIndex != -1) {
            int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - iFindFirstNonAnchorKeylineIndex;
            float f13 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (firstFocalKeylineIndex <= 0 && keylineState.getFirstFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, f13 + keylineState.getFirstFocalKeyline().cutoff + f12, containerWidth));
                return arrayList;
            }
            float f14 = 0.0f;
            for (int i11 = 0; i11 < firstFocalKeylineIndex; i11++) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int i12 = iFindFirstNonAnchorKeylineIndex + i11;
                int size = keylineState.getKeylines().size() - 1;
                f14 += keylineState.getKeylines().get(i12).cutoff;
                int i13 = i12 - 1;
                if (i13 >= 0) {
                    size = findFirstIndexAfterLastFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i13).mask) - 1;
                }
                int i14 = containerWidth;
                KeylineState keylineStateMoveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, iFindFirstNonAnchorKeylineIndex, size, f13 + f14, (keylineState.getFirstFocalKeylineIndex() - i11) - 1, (keylineState.getLastFocalKeylineIndex() - i11) - 1, i14);
                containerWidth = i14;
                if (i11 == firstFocalKeylineIndex - 1 && f12 > 0.0f) {
                    keylineStateMoveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(keylineStateMoveKeylineAndCreateKeylineState, f12, containerWidth, true, f11, strategyType);
                }
                arrayList.add(keylineStateMoveKeylineAndCreateKeylineState);
            }
        } else if (f12 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f12, containerWidth, true, f11, strategyType));
        }
        return arrayList;
    }

    private static KeylineState moveKeylineAndCreateKeylineState(KeylineState keylineState, int i11, int i12, float f11, int i13, int i14, int i15) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        arrayList.add(i12, (KeylineState.Keyline) arrayList.remove(i11));
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), i15);
        int i16 = 0;
        while (i16 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i16);
            float f12 = keyline.maskedItemSize;
            builder.addKeyline(f11 + (f12 / 2.0f), keyline.mask, f12, i16 >= i13 && i16 <= i14, keyline.isAnchor, keyline.cutoff);
            f11 += keyline.maskedItemSize;
            i16++;
        }
        return builder.build();
    }

    @NonNull
    private static KeylineState shiftKeylineStateForPadding(@NonNull KeylineState keylineState, float f11, int i11, boolean z11, float f12, CarouselStrategy.StrategyType strategyType) {
        return C71651.f11758xb90fbfa[strategyType.ordinal()] != 1 ? shiftKeylineStateForPaddingUncontained(keylineState, f11, i11, z11) : shiftKeylineStateForPaddingContained(keylineState, f11, i11, z11, f12);
    }

    private static KeylineState shiftKeylineStateForPaddingContained(KeylineState keylineState, float f11, int i11, boolean z11, float f12) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), i11);
        float numberOfNonAnchorKeylines = f11 / keylineState.getNumberOfNonAnchorKeylines();
        float f13 = z11 ? f11 : 0.0f;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i12);
            if (keyline.isAnchor) {
                builder.addKeyline(keyline.locOffset, keyline.mask, keyline.maskedItemSize, false, true, keyline.cutoff);
            } else {
                boolean z12 = i12 >= keylineState.getFirstFocalKeylineIndex() && i12 <= keylineState.getLastFocalKeylineIndex();
                float f14 = keyline.maskedItemSize - numberOfNonAnchorKeylines;
                float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(f14, keylineState.getItemSize(), f12);
                float f15 = (f14 / 2.0f) + f13;
                float fAbs = Math.abs(f15 - keyline.locOffset);
                builder.addKeyline(f15, childMaskPercentage, f14, z12, false, keyline.cutoff, z11 ? fAbs : 0.0f, z11 ? 0.0f : fAbs);
                f13 += f14;
            }
            i12++;
        }
        return builder.build();
    }

    @NonNull
    private static KeylineState shiftKeylineStateForPaddingUncontained(@NonNull KeylineState keylineState, float f11, int i11, boolean z11) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), i11);
        boolean z12 = true;
        int size = z11 ? 0 : arrayList.size() - 1;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i12);
            if (keyline.isAnchor && i12 == size) {
                builder.addKeyline(keyline.locOffset, keyline.mask, keyline.maskedItemSize, false, true, keyline.cutoff);
            } else {
                float f12 = keyline.locOffset;
                float f13 = z11 ? f12 + f11 : f12 - f11;
                float f14 = z11 ? f11 : 0.0f;
                float f15 = z11 ? 0.0f : f11;
                boolean z13 = (i12 < keylineState.getFirstFocalKeylineIndex() || i12 > keylineState.getLastFocalKeylineIndex()) ? false : z12;
                float f16 = f13;
                float f17 = keyline.mask;
                float f18 = keyline.maskedItemSize;
                builder.addKeyline(f16, f17, f18, z13, keyline.isAnchor, Math.abs(z11 ? Math.max(0.0f, ((f18 / 2.0f) + f16) - i11) : Math.min(0.0f, f16 - (f18 / 2.0f))), f14, f15);
            }
            i12++;
            z12 = true;
        }
        return builder.build();
    }

    public KeylineState getDefaultState() {
        return this.defaultState;
    }

    public KeylineState getEndState() {
        List<KeylineState> list = this.endStateSteps;
        return list.get(list.size() - 1);
    }

    public Map<Integer, KeylineState> getKeylineStateForPositionMap(int i11, int i12, int i13, boolean z11) {
        float itemSize = this.defaultState.getItemSize();
        HashMap map = new HashMap();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i14 >= i11) {
                break;
            }
            int i16 = z11 ? (i11 - i14) - 1 : i14;
            if (i16 * itemSize * (z11 ? -1 : 1) > i13 - this.endShiftRange || i14 >= i11 - this.endStateSteps.size()) {
                Integer numValueOf = Integer.valueOf(i16);
                List<KeylineState> list = this.endStateSteps;
                map.put(numValueOf, list.get(MathUtils.clamp(i15, 0, list.size() - 1)));
                i15++;
            }
            i14++;
        }
        int i17 = 0;
        for (int i18 = i11 - 1; i18 >= 0; i18--) {
            int i19 = z11 ? (i11 - i18) - 1 : i18;
            if (i19 * itemSize * (z11 ? -1 : 1) < i12 + this.startShiftRange || i18 < this.startStateSteps.size()) {
                Integer numValueOf2 = Integer.valueOf(i19);
                List<KeylineState> list2 = this.startStateSteps;
                map.put(numValueOf2, list2.get(MathUtils.clamp(i17, 0, list2.size() - 1)));
                i17++;
            }
        }
        return map;
    }

    public KeylineState getShiftedState(float f11, float f12, float f13, boolean z11) {
        float fLerp;
        List<KeylineState> list;
        float[] fArr;
        float f14 = this.startShiftRange + f12;
        float f15 = f13 - this.endShiftRange;
        float f16 = getStartState().getFirstFocalKeyline().leftOrTopPaddingShift;
        float f17 = getEndState().getFirstFocalKeyline().rightOrBottomPaddingShift;
        if (this.startShiftRange == f16) {
            f14 += f16;
        }
        if (this.endShiftRange == f17) {
            f15 -= f17;
        }
        if (f11 < f14) {
            fLerp = AnimationUtils.lerp(1.0f, 0.0f, f12, f14, f11);
            list = this.startStateSteps;
            fArr = this.startStateStepsInterpolationPoints;
        } else {
            if (f11 <= f15) {
                return this.defaultState;
            }
            fLerp = AnimationUtils.lerp(0.0f, 1.0f, f15, f13, f11);
            list = this.endStateSteps;
            fArr = this.endStateStepsInterpolationPoints;
        }
        return z11 ? closestStateStepFromInterpolation(list, fLerp, fArr) : lerp(list, fLerp, fArr);
    }

    public KeylineState getStartState() {
        List<KeylineState> list = this.startStateSteps;
        return list.get(list.size() - 1);
    }

    private KeylineStateList(@NonNull KeylineState keylineState, List<KeylineState> list, List<KeylineState> list2) {
        this.defaultState = keylineState;
        this.startStateSteps = Collections.unmodifiableList(list);
        this.endStateSteps = Collections.unmodifiableList(list2);
        float f11 = list.get(list.size() - 1).getFirstKeyline().loc - keylineState.getFirstKeyline().loc;
        this.startShiftRange = f11;
        float f12 = keylineState.getLastKeyline().loc - list2.get(list2.size() - 1).getLastKeyline().loc;
        this.endShiftRange = f12;
        this.startStateStepsInterpolationPoints = getStateStepInterpolationPoints(f11, list, true);
        this.endStateStepsInterpolationPoints = getStateStepInterpolationPoints(f12, list2, false);
    }

    private KeylineState closestStateStepFromInterpolation(List<KeylineState> list, float f11, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f11, fArr);
        if (stateStepsRange[0] >= 0.5f) {
            return list.get((int) stateStepsRange[2]);
        }
        return list.get((int) stateStepsRange[1]);
    }

    private static int findFirstIndexAfterLastFocalKeylineWithMask(KeylineState keylineState, float f11) {
        for (int lastFocalKeylineIndex = keylineState.getLastFocalKeylineIndex(); lastFocalKeylineIndex < keylineState.getKeylines().size(); lastFocalKeylineIndex++) {
            if (f11 == keylineState.getKeylines().get(lastFocalKeylineIndex).mask) {
                return lastFocalKeylineIndex;
            }
        }
        return keylineState.getKeylines().size() - 1;
    }

    private static int findLastIndexBeforeFirstFocalKeylineWithMask(KeylineState keylineState, float f11) {
        for (int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - 1; firstFocalKeylineIndex >= 0; firstFocalKeylineIndex--) {
            if (f11 == keylineState.getKeylines().get(firstFocalKeylineIndex).mask) {
                return firstFocalKeylineIndex;
            }
        }
        return 0;
    }

    private static int findLastNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int size = keylineState.getKeylines().size() - 1; size >= 0; size--) {
            if (!keylineState.getKeylines().get(size).isAnchor) {
                return size;
            }
        }
        return -1;
    }

    private static float[] getStateStepInterpolationPoints(float f11, List<KeylineState> list, boolean z11) {
        float f12;
        float f13;
        int size = list.size();
        float[] fArr = new float[size];
        for (int i11 = 1; i11 < size; i11++) {
            int i12 = i11 - 1;
            KeylineState keylineState = list.get(i12);
            KeylineState keylineState2 = list.get(i11);
            if (z11) {
                f12 = keylineState2.getFirstKeyline().loc - keylineState.getFirstKeyline().loc;
            } else {
                f12 = keylineState.getLastKeyline().loc - keylineState2.getLastKeyline().loc;
            }
            float f14 = f12 / f11;
            if (i11 == size - 1) {
                f13 = 1.0f;
            } else {
                f13 = fArr[i12] + f14;
            }
            fArr[i11] = f13;
        }
        return fArr;
    }

    private static boolean isFirstFocalItemAtLeftOfContainer(KeylineState keylineState) {
        if (keylineState.getFirstFocalKeyline().locOffset - (keylineState.getFirstFocalKeyline().maskedItemSize / 2.0f) >= 0.0f && keylineState.getFirstFocalKeyline() == keylineState.getFirstNonAnchorKeyline()) {
            return true;
        }
        return false;
    }

    private static boolean isLastFocalItemVisibleAtRightOfContainer(Carousel carousel, KeylineState keylineState) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        if (keylineState.getLastFocalKeyline().locOffset + (keylineState.getLastFocalKeyline().maskedItemSize / 2.0f) <= containerHeight && keylineState.getLastFocalKeyline() == keylineState.getLastNonAnchorKeyline()) {
            return true;
        }
        return false;
    }

    private static KeylineState lerp(List<KeylineState> list, float f11, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f11, fArr);
        return KeylineState.lerp(list.get((int) stateStepsRange[1]), list.get((int) stateStepsRange[2]), stateStepsRange[0]);
    }

    private static KeylineState shiftKeylinesAndCreateKeylineState(KeylineState keylineState, float f11, int i11) {
        return moveKeylineAndCreateKeylineState(keylineState, 0, 0, f11, keylineState.getFirstFocalKeylineIndex(), keylineState.getLastFocalKeylineIndex(), i11);
    }
}
