package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C7090R;
import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
public class ChipGroup extends FlowLayout {
    private static final int DEF_STYLE_RES = C7090R.style.Widget_MaterialComponents_ChipGroup;
    private final CheckableGroup<Chip> checkableGroup;

    @Dimension
    private int chipSpacingHorizontal;

    @Dimension
    private int chipSpacingVertical;
    private final int defaultCheckedId;

    @Nullable
    private OnCheckedStateChangeListener onCheckedStateChangeListener;

    @NonNull
    private final PassThroughHierarchyChangeListener passThroughListener;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Deprecated
    public interface OnCheckedChangeListener {
        void onCheckedChanged(@NonNull ChipGroup chipGroup, @IdRes int i11);
    }

    public interface OnCheckedStateChangeListener {
        void onCheckedChanged(@NonNull ChipGroup chipGroup, @NonNull List<Integer> list);
    }

    public class PassThroughHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        private ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;

        private PassThroughHierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(View.generateViewId());
                }
                ChipGroup.this.checkableGroup.addCheckable((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.checkableGroup.removeCheckable((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getVisibleChipCount() {
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if ((getChildAt(i12) instanceof Chip) && isChildVisible(i12)) {
                i11++;
            }
        }
        return i11;
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z11) {
        super.setSingleLine(z11);
    }

    public void setSingleSelection(boolean z11) {
        this.checkableGroup.setSingleSelection(z11);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.chipGroupStyle);
    }

    public void check(@IdRes int i11) {
        this.checkableGroup.check(i11);
    }

    public void clearCheck() {
        this.checkableGroup.clearCheck();
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @IdRes
    public int getCheckedChipId() {
        return this.checkableGroup.getSingleCheckedId();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.checkableGroup.getCheckedIdsSortedByChildOrder(this);
    }

    @Dimension
    public int getChipSpacingHorizontal() {
        return this.chipSpacingHorizontal;
    }

    @Dimension
    public int getChipSpacingVertical() {
        return this.chipSpacingVertical;
    }

    public int getIndexOfChip(@Nullable View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if ((childAt instanceof Chip) && isChildVisible(i12)) {
                if (((Chip) childAt) == view) {
                    return i11;
                }
                i11++;
            }
        }
        return -1;
    }

    public boolean isSelectionRequired() {
        return this.checkableGroup.isSelectionRequired();
    }

    public boolean isSingleSelection() {
        return this.checkableGroup.isSingleSelection();
    }

    public void setChipSpacingHorizontal(@Dimension int i11) {
        if (this.chipSpacingHorizontal != i11) {
            this.chipSpacingHorizontal = i11;
            setItemSpacing(i11);
            requestLayout();
        }
    }

    public void setChipSpacingVertical(@Dimension int i11) {
        if (this.chipSpacingVertical != i11) {
            this.chipSpacingVertical = i11;
            setLineSpacing(i11);
            requestLayout();
        }
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i11) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@Nullable final OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new OnCheckedStateChangeListener() { // from class: com.google.android.material.chip.ChipGroup.2
                @Override // com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener
                public void onCheckedChanged(@NonNull ChipGroup chipGroup, @NonNull List<Integer> list) {
                    if (ChipGroup.this.checkableGroup.isSingleSelection()) {
                        onCheckedChangeListener.onCheckedChanged(chipGroup, ChipGroup.this.getCheckedChipId());
                    }
                }
            });
        }
    }

    public void setOnCheckedStateChangeListener(@Nullable OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = onCheckedStateChangeListener;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.passThroughListener.onHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z11) {
        this.checkableGroup.setSelectionRequired(z11);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i11) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i11) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(@BoolRes int i11) {
        setSingleLine(getResources().getBoolean(i11));
    }

    public void setSingleSelection(@BoolRes int i11) {
        setSingleSelection(getResources().getBoolean(i11));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i11) {
        int i12 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        CheckableGroup<Chip> checkableGroup = new CheckableGroup<>();
        this.checkableGroup = checkableGroup;
        PassThroughHierarchyChangeListener passThroughHierarchyChangeListener = new PassThroughHierarchyChangeListener();
        this.passThroughListener = passThroughHierarchyChangeListener;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, C7090R.styleable.ChipGroup, i11, i12, new int[0]);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7090R.styleable.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7090R.styleable.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7090R.styleable.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.ChipGroup_singleLine, false));
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.ChipGroup_singleSelection, false));
        setSelectionRequired(typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.ChipGroup_selectionRequired, false));
        this.defaultCheckedId = typedArrayObtainStyledAttributes.getResourceId(C7090R.styleable.ChipGroup_checkedChip, -1);
        typedArrayObtainStyledAttributes.recycle();
        checkableGroup.setOnCheckedStateChangeListener(new CheckableGroup.OnCheckedStateChangeListener() { // from class: com.google.android.material.chip.ChipGroup.1
            @Override // com.google.android.material.internal.CheckableGroup.OnCheckedStateChangeListener
            public void onCheckedStateChanged(Set<Integer> set) {
                if (ChipGroup.this.onCheckedStateChangeListener != null) {
                    OnCheckedStateChangeListener onCheckedStateChangeListener = ChipGroup.this.onCheckedStateChangeListener;
                    ChipGroup chipGroup = ChipGroup.this;
                    onCheckedStateChangeListener.onCheckedChanged(chipGroup, chipGroup.checkableGroup.getCheckedIdsSortedByChildOrder(ChipGroup.this));
                }
            }
        });
        super.setOnHierarchyChangeListener(passThroughHierarchyChangeListener);
        setImportantForAccessibility(1);
    }

    private boolean isChildVisible(int i11) {
        if (getChildAt(i11).getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean isSingleLine() {
        return super.isSingleLine();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i11 = this.defaultCheckedId;
        if (i11 != -1) {
            this.checkableGroup.check(i11);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int visibleChipCount;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        if (isSingleLine()) {
            visibleChipCount = getVisibleChipCount();
        } else {
            visibleChipCount = -1;
        }
        int rowCount = getRowCount();
        if (isSingleSelection()) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        accessibilityNodeInfoCompatWrap.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(rowCount, visibleChipCount, false, i11));
    }

    public void setChipSpacing(@Dimension int i11) {
        setChipSpacingHorizontal(i11);
        setChipSpacingVertical(i11);
    }

    public void setChipSpacingHorizontalResource(@DimenRes int i11) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i11));
    }

    public void setChipSpacingResource(@DimenRes int i11) {
        setChipSpacing(getResources().getDimensionPixelOffset(i11));
    }

    public void setChipSpacingVerticalResource(@DimenRes int i11) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i11));
    }
}
