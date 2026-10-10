package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.C7090R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.StateListCornerSize;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import com.google.android.material.shape.StateListSizeChange;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes45.dex */
public class MaterialButtonGroup extends LinearLayout {
    private static final int DEF_STYLE_RES = C7090R.style.Widget_Material3_MaterialButtonGroup;
    private static final String LOG_TAG = "MButtonGroup";

    @Nullable
    private StateListSizeChange buttonSizeChange;
    private Integer[] childOrder;
    private final Comparator<MaterialButton> childOrderComparator;
    private boolean childShapesDirty;

    @Nullable
    private StateListShapeAppearanceModel groupStateListShapeAppearance;

    @Nullable
    StateListCornerSize innerCornerSize;
    private final List<ShapeAppearanceModel> originalChildShapeAppearanceModels;
    private final List<StateListShapeAppearanceModel> originalChildStateListShapeAppearanceModels;
    private final PressedStateTracker pressedStateTracker;

    @Px
    private int spacing;

    public class PressedStateTracker implements MaterialButton.OnPressedChangeListener {
        private PressedStateTracker() {
        }

        @Override // com.google.android.material.button.MaterialButton.OnPressedChangeListener
        public void onPressedChanged(@NonNull MaterialButton materialButton, boolean z11) {
            MaterialButtonGroup.this.invalidate();
        }
    }

    public MaterialButtonGroup(@NonNull Context context) {
        this(context, null);
    }

    private void recoverAllChildrenLayoutParams() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            getChildButton(i11).recoverOriginalLayoutParams();
        }
    }

    public MaterialButtonGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.materialButtonGroupStyle);
    }

    private void adjustChildSizeChange() {
        if (this.buttonSizeChange == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i11 = firstVisibleChildIndex; i11 <= lastVisibleChildIndex; i11++) {
            if (isChildVisible(i11)) {
                int buttonAllowedWidthIncrease = getButtonAllowedWidthIncrease(i11);
                if (i11 != firstVisibleChildIndex && i11 != lastVisibleChildIndex) {
                    buttonAllowedWidthIncrease /= 2;
                }
                iMin = Math.min(iMin, buttonAllowedWidthIncrease);
            }
        }
        int i12 = firstVisibleChildIndex;
        while (i12 <= lastVisibleChildIndex) {
            if (isChildVisible(i12)) {
                getChildButton(i12).setSizeChange(this.buttonSizeChange);
                getChildButton(i12).setWidthChangeMax((i12 == firstVisibleChildIndex || i12 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i12++;
        }
    }

    @NonNull
    private StateListShapeAppearanceModel.Builder getOriginalStateListShapeBuilder(boolean z11, boolean z12, int i11) {
        StateListShapeAppearanceModel stateListShapeAppearanceModel = this.groupStateListShapeAppearance;
        if (stateListShapeAppearanceModel == null || (!z11 && !z12)) {
            stateListShapeAppearanceModel = this.originalChildStateListShapeAppearanceModels.get(i11);
        }
        return stateListShapeAppearanceModel == null ? new StateListShapeAppearanceModel.Builder(this.originalChildShapeAppearanceModels.get(i11)) : stateListShapeAppearanceModel.toBuilder();
    }

    @Nullable
    private MaterialButton getPrevVisibleChildButton(int i11) {
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            if (isChildVisible(i12)) {
                return getChildButton(i12);
            }
        }
        return null;
    }

    private void updateChildOrder() {
        TreeMap treeMap = new TreeMap(this.childOrderComparator);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            treeMap.put(getChildButton(i11), Integer.valueOf(i11));
        }
        this.childOrder = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i11, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(LOG_TAG, "Child views must be of type MaterialButton.");
            return;
        }
        recoverAllChildrenLayoutParams();
        this.childShapesDirty = true;
        super.addView(view, i11, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.pressedStateTracker);
        this.originalChildShapeAppearanceModels.add(materialButton.getShapeAppearanceModel());
        this.originalChildStateListShapeAppearanceModels.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StateListSizeChange getButtonSizeChange() {
        return this.buttonSizeChange;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i11, int i12) {
        Integer[] numArr = this.childOrder;
        if (numArr != null && i12 < numArr.length) {
            return numArr[i12].intValue();
        }
        Log.w(LOG_TAG, "Child order wasn't updated");
        return i12;
    }

    @NonNull
    public CornerSize getInnerCornerSize() {
        return this.innerCornerSize.getDefaultCornerSize();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StateListCornerSize getInnerCornerSizeStateList() {
        return this.innerCornerSize;
    }

    @Nullable
    public ShapeAppearanceModel getShapeAppearance() {
        StateListShapeAppearanceModel stateListShapeAppearanceModel = this.groupStateListShapeAppearance;
        if (stateListShapeAppearanceModel == null) {
            return null;
        }
        return stateListShapeAppearanceModel.getDefaultShape(true);
    }

    @Px
    public int getSpacing() {
        return this.spacing;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StateListShapeAppearanceModel getStateListShapeAppearance() {
        return this.groupStateListShapeAppearance;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setButtonSizeChange(@NonNull StateListSizeChange stateListSizeChange) {
        if (this.buttonSizeChange != stateListSizeChange) {
            this.buttonSizeChange = stateListSizeChange;
            adjustChildSizeChange();
            requestLayout();
            invalidate();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInnerCornerSizeStateList(@NonNull StateListCornerSize stateListCornerSize) {
        this.innerCornerSize = stateListCornerSize;
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    public void setShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.groupStateListShapeAppearance = new StateListShapeAppearanceModel.Builder(shapeAppearanceModel).build();
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    public void setSpacing(@Px int i11) {
        this.spacing = i11;
        invalidate();
        requestLayout();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStateListShapeAppearance(@Nullable StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        this.groupStateListShapeAppearance = stateListShapeAppearanceModel;
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    @VisibleForTesting
    public void updateChildShapes() {
        int iSwapCornerPositionRtl;
        if (!(this.innerCornerSize == null && this.groupStateListShapeAppearance == null) && this.childShapesDirty) {
            this.childShapesDirty = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i11 = 0;
            while (i11 < childCount) {
                MaterialButton childButton = getChildButton(i11);
                if (childButton.getVisibility() != 8) {
                    boolean z11 = i11 == firstVisibleChildIndex;
                    boolean z12 = i11 == lastVisibleChildIndex;
                    StateListShapeAppearanceModel.Builder originalStateListShapeBuilder = getOriginalStateListShapeBuilder(z11, z12, i11);
                    boolean z13 = getOrientation() == 0;
                    boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
                    if (z13) {
                        iSwapCornerPositionRtl = z11 ? 5 : 0;
                        if (z12) {
                            iSwapCornerPositionRtl |= 10;
                        }
                        if (zIsLayoutRtl) {
                            iSwapCornerPositionRtl = StateListShapeAppearanceModel.swapCornerPositionRtl(iSwapCornerPositionRtl);
                        }
                    } else {
                        iSwapCornerPositionRtl = z11 ? 3 : 0;
                        if (z12) {
                            iSwapCornerPositionRtl |= 12;
                        }
                    }
                    StateListShapeAppearanceModel stateListShapeAppearanceModelBuild = originalStateListShapeBuilder.setCornerSizeOverride(this.innerCornerSize, ~iSwapCornerPositionRtl).build();
                    if (stateListShapeAppearanceModelBuild.isStateful()) {
                        childButton.setStateListShapeAppearanceModel(stateListShapeAppearanceModelBuild);
                    } else {
                        childButton.setShapeAppearanceModel(stateListShapeAppearanceModelBuild.getDefaultShape(true));
                    }
                }
                i11++;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        int i12 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        this.originalChildShapeAppearanceModels = new ArrayList();
        this.originalChildStateListShapeAppearanceModels = new ArrayList();
        this.pressedStateTracker = new PressedStateTracker();
        this.childOrderComparator = new Comparator() { // from class: com.google.android.material.button.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MaterialButtonGroup.m12929a(this.f11755b, (MaterialButton) obj, (MaterialButton) obj2);
            }
        };
        this.childShapesDirty = true;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C7090R.styleable.MaterialButtonGroup, i11, i12, new int[0]);
        int i13 = C7090R.styleable.MaterialButtonGroup_buttonSizeChange;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.buttonSizeChange = StateListSizeChange.create(context2, typedArrayObtainStyledAttributes, i13);
        }
        int i14 = C7090R.styleable.MaterialButtonGroup_shapeAppearance;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            StateListShapeAppearanceModel stateListShapeAppearanceModelCreate = StateListShapeAppearanceModel.create(context2, typedArrayObtainStyledAttributes, i14);
            this.groupStateListShapeAppearance = stateListShapeAppearanceModelCreate;
            if (stateListShapeAppearanceModelCreate == null) {
                this.groupStateListShapeAppearance = new StateListShapeAppearanceModel.Builder(ShapeAppearanceModel.builder(context2, typedArrayObtainStyledAttributes.getResourceId(i14, 0), typedArrayObtainStyledAttributes.getResourceId(C7090R.styleable.MaterialButtonGroup_shapeAppearanceOverlay, 0)).build()).build();
            }
        }
        int i15 = C7090R.styleable.MaterialButtonGroup_innerCornerSize;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.innerCornerSize = StateListCornerSize.create(context2, typedArrayObtainStyledAttributes, i15, new AbsoluteCornerSize(0.0f));
        }
        this.spacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.MaterialButtonGroup_android_spacing, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.MaterialButtonGroup_android_enabled, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m12929a(MaterialButtonGroup materialButtonGroup, MaterialButton materialButton, MaterialButton materialButton2) {
        materialButtonGroup.getClass();
        int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        return Integer.compare(materialButtonGroup.indexOfChild(materialButton), materialButtonGroup.indexOfChild(materialButton2));
    }

    private void adjustChildMarginsAndUpdateLayout() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i11 = firstVisibleChildIndex + 1; i11 < getChildCount(); i11++) {
            MaterialButton childButton = getChildButton(i11);
            MaterialButton childButton2 = getChildButton(i11 - 1);
            if (this.spacing <= 0) {
                iMin = Math.min(childButton.getStrokeWidth(), childButton2.getStrokeWidth());
                childButton.setShouldDrawSurfaceColorStroke(true);
                childButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                childButton.setShouldDrawSurfaceColorStroke(false);
                childButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsBuildLayoutParams = buildLayoutParams(childButton);
            if (getOrientation() == 0) {
                layoutParamsBuildLayoutParams.setMarginEnd(0);
                layoutParamsBuildLayoutParams.setMarginStart(this.spacing - iMin);
                layoutParamsBuildLayoutParams.topMargin = 0;
            } else {
                layoutParamsBuildLayoutParams.bottomMargin = 0;
                layoutParamsBuildLayoutParams.topMargin = this.spacing - iMin;
                layoutParamsBuildLayoutParams.setMarginStart(0);
            }
            childButton.setLayoutParams(layoutParamsBuildLayoutParams);
        }
        resetChildMargins(firstVisibleChildIndex);
    }

    private int getButtonAllowedWidthIncrease(int i11) {
        int allowedWidthDecrease;
        int allowedWidthDecrease2 = 0;
        if (!isChildVisible(i11) || this.buttonSizeChange == null) {
            return 0;
        }
        int iMax = Math.max(0, this.buttonSizeChange.getMaxWidthChange(getChildButton(i11).getWidth()));
        MaterialButton prevVisibleChildButton = getPrevVisibleChildButton(i11);
        if (prevVisibleChildButton == null) {
            allowedWidthDecrease = 0;
        } else {
            allowedWidthDecrease = prevVisibleChildButton.getAllowedWidthDecrease();
        }
        MaterialButton nextVisibleChildButton = getNextVisibleChildButton(i11);
        if (nextVisibleChildButton != null) {
            allowedWidthDecrease2 = nextVisibleChildButton.getAllowedWidthDecrease();
        }
        return Math.min(iMax, allowedWidthDecrease + allowedWidthDecrease2);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (isChildVisible(i11)) {
                return i11;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (isChildVisible(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    @Nullable
    private MaterialButton getNextVisibleChildButton(int i11) {
        int childCount = getChildCount();
        do {
            i11++;
            if (i11 >= childCount) {
                return null;
            }
        } while (!isChildVisible(i11));
        return getChildButton(i11);
    }

    private boolean isChildVisible(int i11) {
        if (getChildAt(i11).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    private void resetChildMargins(int i11) {
        if (getChildCount() != 0 && i11 != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildButton(i11).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
            } else {
                layoutParams.setMarginEnd(0);
                layoutParams.setMarginStart(0);
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
            }
        }
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    @NonNull
    public LinearLayout.LayoutParams buildLayoutParams(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        updateChildOrder();
        super.dispatchDraw(canvas);
    }

    @NonNull
    public MaterialButton getChildButton(int i11) {
        return (MaterialButton) getChildAt(i11);
    }

    public void onButtonWidthChanged(@NonNull MaterialButton materialButton, int i11) {
        int iIndexOfChild = indexOfChild(materialButton);
        if (iIndexOfChild >= 0) {
            MaterialButton prevVisibleChildButton = getPrevVisibleChildButton(iIndexOfChild);
            MaterialButton nextVisibleChildButton = getNextVisibleChildButton(iIndexOfChild);
            if (prevVisibleChildButton != null || nextVisibleChildButton != null) {
                if (prevVisibleChildButton == null) {
                    nextVisibleChildButton.setDisplayedWidthDecrease(i11);
                }
                if (nextVisibleChildButton == null) {
                    prevVisibleChildButton.setDisplayedWidthDecrease(i11);
                }
                if (prevVisibleChildButton != null && nextVisibleChildButton != null) {
                    prevVisibleChildButton.setDisplayedWidthDecrease(i11 / 2);
                    nextVisibleChildButton.setDisplayedWidthDecrease((i11 + 1) / 2);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            recoverAllChildrenLayoutParams();
            adjustChildSizeChange();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
        super.onMeasure(i11, i12);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.originalChildShapeAppearanceModels.remove(iIndexOfChild);
            this.originalChildStateListShapeAppearanceModels.remove(iIndexOfChild);
        }
        this.childShapesDirty = true;
        updateChildShapes();
        recoverAllChildrenLayoutParams();
        adjustChildMarginsAndUpdateLayout();
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            getChildButton(i11).setEnabled(z11);
        }
    }

    public void setInnerCornerSize(@NonNull CornerSize cornerSize) {
        this.innerCornerSize = StateListCornerSize.create(cornerSize);
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i11) {
        if (getOrientation() != i11) {
            this.childShapesDirty = true;
        }
        super.setOrientation(i11);
    }
}
