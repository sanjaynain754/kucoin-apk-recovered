package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.google.android.material.internal.MaterialCheckable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UiThread
public class CheckableGroup<T extends MaterialCheckable<T>> {
    private final Map<Integer, T> checkables = new HashMap();
    private final Set<Integer> checkedIds = new HashSet();
    private OnCheckedStateChangeListener onCheckedStateChangeListener;
    private boolean selectionRequired;
    private boolean singleSelection;

    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(@NonNull Set<Integer> set);
    }

    public void removeCheckable(T t11) {
        t11.setInternalOnCheckedChangeListener(null);
        this.checkables.remove(Integer.valueOf(t11.getId()));
        this.checkedIds.remove(Integer.valueOf(t11.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCheckedStateChanged() {
        OnCheckedStateChangeListener onCheckedStateChangeListener = this.onCheckedStateChangeListener;
        if (onCheckedStateChangeListener != null) {
            onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addCheckable(T t11) {
        this.checkables.put(Integer.valueOf(t11.getId()), t11);
        if (t11.isChecked()) {
            checkInternal(t11);
        }
        t11.setInternalOnCheckedChangeListener(new MaterialCheckable.OnCheckedChangeListener<T>() { // from class: com.google.android.material.internal.CheckableGroup.1
            @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
            public void onCheckedChanged(T t12, boolean z11) {
                if (!z11) {
                    CheckableGroup checkableGroup = CheckableGroup.this;
                    if (!checkableGroup.uncheckInternal(t12, checkableGroup.selectionRequired)) {
                        return;
                    }
                } else if (!CheckableGroup.this.checkInternal(t12)) {
                    return;
                }
                CheckableGroup.this.onCheckedStateChanged();
            }
        });
    }

    public void check(@IdRes int i11) {
        T t11 = this.checkables.get(Integer.valueOf(i11));
        if (t11 != null && checkInternal(t11)) {
            onCheckedStateChanged();
        }
    }

    public void clearCheck() {
        boolean zIsEmpty = this.checkedIds.isEmpty();
        Iterator<T> it = this.checkables.values().iterator();
        while (it.hasNext()) {
            uncheckInternal(it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        onCheckedStateChanged();
    }

    @NonNull
    public Set<Integer> getCheckedIds() {
        return new HashSet(this.checkedIds);
    }

    @IdRes
    public int getSingleCheckedId() {
        if (!this.singleSelection || this.checkedIds.isEmpty()) {
            return -1;
        }
        return this.checkedIds.iterator().next().intValue();
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void setOnCheckedStateChangeListener(@Nullable OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = onCheckedStateChangeListener;
    }

    public void setSelectionRequired(boolean z11) {
        this.selectionRequired = z11;
    }

    public void setSingleSelection(boolean z11) {
        if (this.singleSelection != z11) {
            this.singleSelection = z11;
            clearCheck();
        }
    }

    public void uncheck(@IdRes int i11) {
        T t11 = this.checkables.get(Integer.valueOf(i11));
        if (t11 != null && uncheckInternal(t11, this.selectionRequired)) {
            onCheckedStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkInternal(@NonNull MaterialCheckable<T> materialCheckable) {
        int id2 = materialCheckable.getId();
        if (this.checkedIds.contains(Integer.valueOf(id2))) {
            return false;
        }
        T t11 = this.checkables.get(Integer.valueOf(getSingleCheckedId()));
        if (t11 != null) {
            uncheckInternal(t11, false);
        }
        boolean zAdd = this.checkedIds.add(Integer.valueOf(id2));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uncheckInternal(@NonNull MaterialCheckable<T> materialCheckable, boolean z11) {
        int id2 = materialCheckable.getId();
        if (!this.checkedIds.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z11 && this.checkedIds.size() == 1 && this.checkedIds.contains(Integer.valueOf(id2))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean zRemove = this.checkedIds.remove(Integer.valueOf(id2));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return zRemove;
    }

    @NonNull
    public List<Integer> getCheckedIdsSortedByChildOrder(@NonNull ViewGroup viewGroup) {
        Set<Integer> checkedIds = getCheckedIds();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof MaterialCheckable) && checkedIds.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }
}
