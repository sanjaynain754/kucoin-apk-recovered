package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C7090R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.StateListCornerSize;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
public class MaterialButtonToggleGroup extends MaterialButtonGroup {
    private static final int DEF_STYLE_RES = C7090R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;
    private static final String LOG_TAG = "MButtonToggleGroup";
    private Set<Integer> checkedIds;

    @IdRes
    private final int defaultCheckId;
    private final LinkedHashSet<OnButtonCheckedListener> onButtonCheckedListeners;
    private boolean selectionRequired;
    private boolean singleSelection;
    private boolean skipCheckedStateTracker;

    public interface OnButtonCheckedListener {
        void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, @IdRes int i11, boolean z11);
    }

    public MaterialButtonToggleGroup(@NonNull Context context) {
        this(context, null);
    }

    private void checkInternal(@IdRes int i11, boolean z11) {
        if (i11 == -1) {
            Log.e(LOG_TAG, "Button ID is not valid: " + i11);
            return;
        }
        HashSet hashSet = new HashSet(this.checkedIds);
        if (z11 && !hashSet.contains(Integer.valueOf(i11))) {
            if (this.singleSelection && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i11));
        } else {
            if (z11 || !hashSet.contains(Integer.valueOf(i11))) {
                return;
            }
            if (!this.selectionRequired || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i11));
            }
        }
        updateCheckedIds(hashSet);
    }

    private int getVisibleButtonCount() {
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if ((getChildAt(i12) instanceof MaterialButton) && isChildVisible(i12)) {
                i11++;
            }
        }
        return i11;
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    public void check(@IdRes int i11) {
        checkInternal(i11, true);
    }

    public void setSingleSelection(boolean z11) {
        if (this.singleSelection != z11) {
            this.singleSelection = z11;
            clearChecked();
        }
        updateChildrenA11yClassName();
    }

    public void uncheck(@IdRes int i11) {
        checkInternal(i11, false);
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.materialButtonToggleGroupStyle);
    }

    private void dispatchOnButtonChecked(@IdRes int i11, boolean z11) {
        Iterator<OnButtonCheckedListener> it = this.onButtonCheckedListeners.iterator();
        while (it.hasNext()) {
            it.next().onButtonChecked(this, i11, z11);
        }
    }

    @NonNull
    private String getChildrenA11yClassName() {
        return (this.singleSelection ? RadioButton.class : ToggleButton.class).getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getIndexWithinVisibleButtons(@Nullable View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == view) {
                return i11;
            }
            if ((getChildAt(i12) instanceof MaterialButton) && isChildVisible(i12)) {
                i11++;
            }
        }
        return -1;
    }

    private void updateCheckedIds(Set<Integer> set) {
        Set<Integer> set2 = this.checkedIds;
        this.checkedIds = new HashSet(set);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int id2 = getChildButton(i11).getId();
            setCheckedStateForView(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                dispatchOnButtonChecked(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    public void addOnButtonCheckedListener(@NonNull OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.add(onButtonCheckedListener);
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public void addView(@NonNull View view, int i11, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(LOG_TAG, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i11, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        checkInternal(materialButton.getId(), materialButton.isChecked());
        ViewCompat.setAccessibilityDelegate(materialButton, new AccessibilityDelegateCompat() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, MaterialButtonToggleGroup.this.getIndexWithinVisibleButtons(view2), 1, false, ((MaterialButton) view2).isChecked()));
            }
        });
    }

    public void clearChecked() {
        updateCheckedIds(new HashSet());
    }

    public void clearOnButtonCheckedListeners() {
        this.onButtonCheckedListeners.clear();
    }

    @IdRes
    public int getCheckedButtonId() {
        if (!this.singleSelection || this.checkedIds.isEmpty()) {
            return -1;
        }
        return this.checkedIds.iterator().next().intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int id2 = getChildButton(i11).getId();
            if (this.checkedIds.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void onButtonCheckedStateChanged(@NonNull MaterialButton materialButton, boolean z11) {
        if (this.skipCheckedStateTracker) {
            return;
        }
        checkInternal(materialButton.getId(), z11);
    }

    public void removeOnButtonCheckedListener(@NonNull OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.remove(onButtonCheckedListener);
    }

    public void setSelectionRequired(boolean z11) {
        this.selectionRequired = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        int i12 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        this.onButtonCheckedListeners = new LinkedHashSet<>();
        this.skipCheckedStateTracker = false;
        this.checkedIds = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, C7090R.styleable.MaterialButtonToggleGroup, i11, i12, new int[0]);
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.defaultCheckId = typedArrayObtainStyledAttributes.getResourceId(C7090R.styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.selectionRequired = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.MaterialButtonToggleGroup_selectionRequired, false);
        if (this.innerCornerSize == null) {
            this.innerCornerSize = StateListCornerSize.create(new AbsoluteCornerSize(0.0f));
        }
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.MaterialButtonToggleGroup_android_enabled, true));
        typedArrayObtainStyledAttributes.recycle();
        setImportantForAccessibility(1);
    }

    private boolean isChildVisible(int i11) {
        if (getChildAt(i11).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    private void setCheckedStateForView(@IdRes int i11, boolean z11) {
        View viewFindViewById = findViewById(i11);
        if (viewFindViewById instanceof MaterialButton) {
            this.skipCheckedStateTracker = true;
            ((MaterialButton) viewFindViewById).setChecked(z11);
            this.skipCheckedStateTracker = false;
        }
    }

    private void updateChildrenA11yClassName() {
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            getChildButton(i11).setA11yClassName(childrenA11yClassName);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i11 = this.defaultCheckId;
        if (i11 != -1) {
            updateCheckedIds(Collections.singleton(Integer.valueOf(i11)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (isSingleSelection()) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        accessibilityNodeInfoCompatWrap.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, visibleButtonCount, false, i11));
    }

    public void setSingleSelection(@BoolRes int i11) {
        setSingleSelection(getResources().getBoolean(i11));
    }
}
