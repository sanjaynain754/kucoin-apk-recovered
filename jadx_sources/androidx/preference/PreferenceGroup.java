package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.TypedArrayUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public abstract class PreferenceGroup extends Preference {
    private static final String TAG = "PreferenceGroup";
    private boolean mAttachedToHierarchy;
    private final Runnable mClearRecycleCacheRunnable;
    private int mCurrentPreferenceOrder;
    private final Handler mHandler;
    final SimpleArrayMap<String, Long> mIdRecycleCache;
    private int mInitialExpandedChildrenCount;
    private OnExpandButtonClickListener mOnExpandButtonClickListener;
    private boolean mOrderingAsAdded;
    private final List<Preference> mPreferences;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface OnExpandButtonClickListener {
        void onExpandButtonClick();
    }

    public interface PreferencePositionCallback {
        int getPreferenceAdapterPosition(@NonNull Preference preference);

        int getPreferenceAdapterPosition(@NonNull String str);
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.mIdRecycleCache = new SimpleArrayMap<>();
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mOrderingAsAdded = true;
        this.mCurrentPreferenceOrder = 0;
        this.mAttachedToHierarchy = false;
        this.mInitialExpandedChildrenCount = Integer.MAX_VALUE;
        this.mOnExpandButtonClickListener = null;
        this.mClearRecycleCacheRunnable = new Runnable() { // from class: androidx.preference.PreferenceGroup.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    PreferenceGroup.this.mIdRecycleCache.clear();
                }
            }
        };
        this.mPreferences = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3729R.styleable.PreferenceGroup, i11, i12);
        int i13 = C3729R.styleable.PreferenceGroup_orderingFromXml;
        this.mOrderingAsAdded = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, i13, i13, true);
        int i14 = C3729R.styleable.PreferenceGroup_initialExpandedChildrenCount;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            setInitialExpandedChildrenCount(TypedArrayUtils.getInt(typedArrayObtainStyledAttributes, i14, i14, Integer.MAX_VALUE));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean removePreferenceInt(@NonNull Preference preference) {
        boolean zRemove;
        synchronized (this) {
            try {
                preference.onPrepareForRemoval();
                if (preference.getParent() == this) {
                    preference.assignParent(null);
                }
                zRemove = this.mPreferences.remove(preference);
                if (zRemove) {
                    String key = preference.getKey();
                    if (key != null) {
                        this.mIdRecycleCache.put(key, Long.valueOf(preference.getId()));
                        this.mHandler.removeCallbacks(this.mClearRecycleCacheRunnable);
                        this.mHandler.post(this.mClearRecycleCacheRunnable);
                    }
                    if (this.mAttachedToHierarchy) {
                        preference.onDetached();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRemove;
    }

    public boolean isOnSameScreenAsChildren() {
        return true;
    }

    public void removeAll() {
        synchronized (this) {
            try {
                List<Preference> list = this.mPreferences;
                for (int size = list.size() - 1; size >= 0; size--) {
                    removePreferenceInt(list.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyHierarchyChanged();
    }

    public void sortPreferences() {
        synchronized (this) {
            Collections.sort(this.mPreferences);
        }
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.PreferenceGroup.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        };
        int mInitialExpandedChildrenCount;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mInitialExpandedChildrenCount = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i11) {
            super(parcelable);
            this.mInitialExpandedChildrenCount = i11;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.mInitialExpandedChildrenCount);
        }
    }

    public boolean addPreference(@NonNull Preference preference) {
        long nextId;
        if (this.mPreferences.contains(preference)) {
            return true;
        }
        if (preference.getKey() != null) {
            PreferenceGroup parent = this;
            while (parent.getParent() != null) {
                parent = parent.getParent();
            }
            String key = preference.getKey();
            if (parent.findPreference(key) != null) {
                Log.e(TAG, "Found duplicated key: \"" + key + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.getOrder() == Integer.MAX_VALUE) {
            if (this.mOrderingAsAdded) {
                int i11 = this.mCurrentPreferenceOrder;
                this.mCurrentPreferenceOrder = i11 + 1;
                preference.setOrder(i11);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).setOrderingAsAdded(this.mOrderingAsAdded);
            }
        }
        int iBinarySearch = Collections.binarySearch(this.mPreferences, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        if (!onPrepareAddPreference(preference)) {
            return false;
        }
        synchronized (this) {
            this.mPreferences.add(iBinarySearch, preference);
        }
        PreferenceManager preferenceManager = getPreferenceManager();
        String key2 = preference.getKey();
        if (key2 == null || !this.mIdRecycleCache.containsKey(key2)) {
            nextId = preferenceManager.getNextId();
        } else {
            nextId = this.mIdRecycleCache.get(key2).longValue();
            this.mIdRecycleCache.remove(key2);
        }
        preference.onAttachedToHierarchy(preferenceManager, nextId);
        preference.assignParent(this);
        if (this.mAttachedToHierarchy) {
            preference.onAttached();
        }
        notifyHierarchyChanged();
        return true;
    }

    @Nullable
    public <T extends Preference> T findPreference(@NonNull CharSequence charSequence) {
        T t11;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(getKey(), charSequence)) {
            return this;
        }
        int preferenceCount = getPreferenceCount();
        for (int i11 = 0; i11 < preferenceCount; i11++) {
            PreferenceGroup preferenceGroup = (T) getPreference(i11);
            if (TextUtils.equals(preferenceGroup.getKey(), charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof PreferenceGroup) && (t11 = (T) preferenceGroup.findPreference(charSequence)) != null) {
                return t11;
            }
        }
        return null;
    }

    public int getInitialExpandedChildrenCount() {
        return this.mInitialExpandedChildrenCount;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public OnExpandButtonClickListener getOnExpandButtonClickListener() {
        return this.mOnExpandButtonClickListener;
    }

    @NonNull
    public Preference getPreference(int i11) {
        return this.mPreferences.get(i11);
    }

    public int getPreferenceCount() {
        return this.mPreferences.size();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean isAttached() {
        return this.mAttachedToHierarchy;
    }

    public boolean isOrderingAsAdded() {
        return this.mOrderingAsAdded;
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mInitialExpandedChildrenCount = savedState.mInitialExpandedChildrenCount;
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOnExpandButtonClickListener(@Nullable OnExpandButtonClickListener onExpandButtonClickListener) {
        this.mOnExpandButtonClickListener = onExpandButtonClickListener;
    }

    public void setOrderingAsAdded(boolean z11) {
        this.mOrderingAsAdded = z11;
    }

    public void addItemFromInflater(@NonNull Preference preference) {
        addPreference(preference);
    }

    @Override // androidx.preference.Preference
    public void dispatchRestoreInstanceState(@NonNull Bundle bundle) {
        super.dispatchRestoreInstanceState(bundle);
        int preferenceCount = getPreferenceCount();
        for (int i11 = 0; i11 < preferenceCount; i11++) {
            getPreference(i11).dispatchRestoreInstanceState(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void dispatchSaveInstanceState(@NonNull Bundle bundle) {
        super.dispatchSaveInstanceState(bundle);
        int preferenceCount = getPreferenceCount();
        for (int i11 = 0; i11 < preferenceCount; i11++) {
            getPreference(i11).dispatchSaveInstanceState(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void notifyDependencyChange(boolean z11) {
        super.notifyDependencyChange(z11);
        int preferenceCount = getPreferenceCount();
        for (int i11 = 0; i11 < preferenceCount; i11++) {
            getPreference(i11).onParentChanged(this, z11);
        }
    }

    @Override // androidx.preference.Preference
    public void onAttached() {
        super.onAttached();
        this.mAttachedToHierarchy = true;
        int preferenceCount = getPreferenceCount();
        for (int i11 = 0; i11 < preferenceCount; i11++) {
            getPreference(i11).onAttached();
        }
    }

    @Override // androidx.preference.Preference
    public void onDetached() {
        super.onDetached();
        this.mAttachedToHierarchy = false;
        int preferenceCount = getPreferenceCount();
        for (int i11 = 0; i11 < preferenceCount; i11++) {
            getPreference(i11).onDetached();
        }
    }

    public boolean onPrepareAddPreference(@NonNull Preference preference) {
        preference.onParentChanged(this, shouldDisableDependents());
        return true;
    }

    @Override // androidx.preference.Preference
    @NonNull
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.mInitialExpandedChildrenCount);
    }

    public boolean removePreference(@NonNull Preference preference) {
        boolean zRemovePreferenceInt = removePreferenceInt(preference);
        notifyHierarchyChanged();
        return zRemovePreferenceInt;
    }

    public boolean removePreferenceRecursively(@NonNull CharSequence charSequence) {
        Preference preferenceFindPreference = findPreference(charSequence);
        if (preferenceFindPreference == null) {
            return false;
        }
        return preferenceFindPreference.getParent().removePreference(preferenceFindPreference);
    }

    public void setInitialExpandedChildrenCount(int i11) {
        if (i11 != Integer.MAX_VALUE && !hasKey()) {
            Log.e(TAG, getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.mInitialExpandedChildrenCount = i11;
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
