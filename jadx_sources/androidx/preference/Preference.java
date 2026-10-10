package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
public class Preference implements Comparable<Preference> {
    private static final String CLIPBOARD_ID = "Preference";
    public static final int DEFAULT_ORDER = Integer.MAX_VALUE;
    private boolean mAllowDividerAbove;
    private boolean mAllowDividerBelow;
    private boolean mBaseMethodCalled;
    private final View.OnClickListener mClickListener;

    @NonNull
    private final Context mContext;
    private boolean mCopyingEnabled;
    private Object mDefaultValue;
    private String mDependencyKey;
    private boolean mDependencyMet;
    private List<Preference> mDependents;
    private boolean mEnabled;
    private Bundle mExtras;
    private String mFragment;
    private boolean mHasId;
    private boolean mHasSingleLineTitleAttr;
    private Drawable mIcon;
    private int mIconResId;
    private boolean mIconSpaceReserved;
    private long mId;
    private Intent mIntent;
    private String mKey;
    private int mLayoutResId;
    private OnPreferenceChangeInternalListener mListener;
    private OnPreferenceChangeListener mOnChangeListener;
    private OnPreferenceClickListener mOnClickListener;
    private OnPreferenceCopyListener mOnCopyListener;
    private int mOrder;
    private boolean mParentDependencyMet;
    private PreferenceGroup mParentGroup;
    private boolean mPersistent;

    @Nullable
    private PreferenceDataStore mPreferenceDataStore;

    @Nullable
    private PreferenceManager mPreferenceManager;
    private boolean mRequiresKey;
    private boolean mSelectable;
    private boolean mShouldDisableView;
    private boolean mSingleLineTitle;
    private CharSequence mSummary;
    private SummaryProvider mSummaryProvider;
    private CharSequence mTitle;
    private int mViewId;
    private boolean mVisible;
    private boolean mWasDetached;
    private int mWidgetLayoutResId;

    public static class BaseSavedState extends AbsSavedState {

        @NonNull
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new Parcelable.Creator<BaseSavedState>() { // from class: androidx.preference.Preference.BaseSavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public BaseSavedState[] newArray(int i11) {
                return new BaseSavedState[i11];
            }
        };

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface OnPreferenceChangeInternalListener {
        void onPreferenceChange(@NonNull Preference preference);

        void onPreferenceHierarchyChange(@NonNull Preference preference);

        void onPreferenceVisibilityChange(@NonNull Preference preference);
    }

    public interface OnPreferenceChangeListener {
        boolean onPreferenceChange(@NonNull Preference preference, Object obj);
    }

    public interface OnPreferenceClickListener {
        boolean onPreferenceClick(@NonNull Preference preference);
    }

    public static class OnPreferenceCopyListener implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
        private final Preference mPreference;

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence summary = this.mPreference.getSummary();
            if (!this.mPreference.isCopyingEnabled() || TextUtils.isEmpty(summary)) {
                return;
            }
            contextMenu.setHeaderTitle(summary);
            contextMenu.add(0, 0, 0, C3729R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.mPreference.getContext().getSystemService("clipboard");
            CharSequence summary = this.mPreference.getSummary();
            clipboardManager.setPrimaryClip(ClipData.newPlainText(Preference.CLIPBOARD_ID, summary));
            Toast.makeText(this.mPreference.getContext(), this.mPreference.getContext().getString(C3729R.string.preference_copied, summary), 0).show();
            return true;
        }

        public OnPreferenceCopyListener(@NonNull Preference preference) {
            this.mPreference = preference;
        }
    }

    public interface SummaryProvider<T extends Preference> {
        @Nullable
        CharSequence provideSummary(@NonNull T t11);
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        this.mOrder = Integer.MAX_VALUE;
        this.mViewId = 0;
        this.mEnabled = true;
        this.mSelectable = true;
        this.mPersistent = true;
        this.mDependencyMet = true;
        this.mParentDependencyMet = true;
        this.mVisible = true;
        this.mAllowDividerAbove = true;
        this.mAllowDividerBelow = true;
        this.mSingleLineTitle = true;
        this.mShouldDisableView = true;
        int i13 = C3729R.layout.preference;
        this.mLayoutResId = i13;
        this.mClickListener = new View.OnClickListener() { // from class: androidx.preference.Preference.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Preference.this.performClick(view);
            }
        };
        this.mContext = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3729R.styleable.Preference, i11, i12);
        this.mIconResId = TypedArrayUtils.getResourceId(typedArrayObtainStyledAttributes, C3729R.styleable.Preference_icon, C3729R.styleable.Preference_android_icon, 0);
        this.mKey = TypedArrayUtils.getString(typedArrayObtainStyledAttributes, C3729R.styleable.Preference_key, C3729R.styleable.Preference_android_key);
        this.mTitle = TypedArrayUtils.getText(typedArrayObtainStyledAttributes, C3729R.styleable.Preference_title, C3729R.styleable.Preference_android_title);
        this.mSummary = TypedArrayUtils.getText(typedArrayObtainStyledAttributes, C3729R.styleable.Preference_summary, C3729R.styleable.Preference_android_summary);
        this.mOrder = TypedArrayUtils.getInt(typedArrayObtainStyledAttributes, C3729R.styleable.Preference_order, C3729R.styleable.Preference_android_order, Integer.MAX_VALUE);
        this.mFragment = TypedArrayUtils.getString(typedArrayObtainStyledAttributes, C3729R.styleable.Preference_fragment, C3729R.styleable.Preference_android_fragment);
        this.mLayoutResId = TypedArrayUtils.getResourceId(typedArrayObtainStyledAttributes, C3729R.styleable.Preference_layout, C3729R.styleable.Preference_android_layout, i13);
        this.mWidgetLayoutResId = TypedArrayUtils.getResourceId(typedArrayObtainStyledAttributes, C3729R.styleable.Preference_widgetLayout, C3729R.styleable.Preference_android_widgetLayout, 0);
        this.mEnabled = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, C3729R.styleable.Preference_enabled, C3729R.styleable.Preference_android_enabled, true);
        this.mSelectable = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, C3729R.styleable.Preference_selectable, C3729R.styleable.Preference_android_selectable, true);
        this.mPersistent = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, C3729R.styleable.Preference_persistent, C3729R.styleable.Preference_android_persistent, true);
        this.mDependencyKey = TypedArrayUtils.getString(typedArrayObtainStyledAttributes, C3729R.styleable.Preference_dependency, C3729R.styleable.Preference_android_dependency);
        int i14 = C3729R.styleable.Preference_allowDividerAbove;
        this.mAllowDividerAbove = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, i14, i14, this.mSelectable);
        int i15 = C3729R.styleable.Preference_allowDividerBelow;
        this.mAllowDividerBelow = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, i15, i15, this.mSelectable);
        int i16 = C3729R.styleable.Preference_defaultValue;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            this.mDefaultValue = onGetDefaultValue(typedArrayObtainStyledAttributes, i16);
        } else {
            int i17 = C3729R.styleable.Preference_android_defaultValue;
            if (typedArrayObtainStyledAttributes.hasValue(i17)) {
                this.mDefaultValue = onGetDefaultValue(typedArrayObtainStyledAttributes, i17);
            }
        }
        this.mShouldDisableView = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, C3729R.styleable.Preference_shouldDisableView, C3729R.styleable.Preference_android_shouldDisableView, true);
        int i18 = C3729R.styleable.Preference_singleLineTitle;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i18);
        this.mHasSingleLineTitleAttr = zHasValue;
        if (zHasValue) {
            this.mSingleLineTitle = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, i18, C3729R.styleable.Preference_android_singleLineTitle, true);
        }
        this.mIconSpaceReserved = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, C3729R.styleable.Preference_iconSpaceReserved, C3729R.styleable.Preference_android_iconSpaceReserved, false);
        int i19 = C3729R.styleable.Preference_isPreferenceVisible;
        this.mVisible = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, i19, i19, true);
        int i21 = C3729R.styleable.Preference_enableCopying;
        this.mCopyingEnabled = TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, i21, i21, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void clearWasDetached() {
        this.mWasDetached = false;
    }

    public void onAttachedToHierarchy(@NonNull PreferenceManager preferenceManager) {
        this.mPreferenceManager = preferenceManager;
        if (!this.mHasId) {
            this.mId = preferenceManager.getNextId();
        }
        dispatchSetInitialValue();
    }

    @Nullable
    public Object onGetDefaultValue(@NonNull TypedArray typedArray, int i11) {
        return null;
    }

    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        this.mBaseMethodCalled = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    @Nullable
    public Parcelable onSaveInstanceState() {
        this.mBaseMethodCalled = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void onSetInitialValue(@Nullable Object obj) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void performClick(@NonNull View view) {
        performClick();
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.mIcon != drawable) {
            this.mIcon = drawable;
            this.mIconResId = 0;
            notifyChanged();
        }
    }

    public void setSingleLineTitle(boolean z11) {
        this.mHasSingleLineTitleAttr = true;
        this.mSingleLineTitle = z11;
    }

    public void setSummary(@Nullable CharSequence charSequence) {
        if (getSummaryProvider() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.mSummary, charSequence)) {
            return;
        }
        this.mSummary = charSequence;
        notifyChanged();
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.mTitle)) {
            return;
        }
        this.mTitle = charSequence;
        notifyChanged();
    }

    private void registerDependency() {
        if (TextUtils.isEmpty(this.mDependencyKey)) {
            return;
        }
        Preference preferenceFindPreferenceInHierarchy = findPreferenceInHierarchy(this.mDependencyKey);
        if (preferenceFindPreferenceInHierarchy != null) {
            preferenceFindPreferenceInHierarchy.registerDependent(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.mDependencyKey + "\" not found for preference \"" + this.mKey + "\" (title: \"" + ((Object) this.mTitle) + "\"");
    }

    private void registerDependent(Preference preference) {
        if (this.mDependents == null) {
            this.mDependents = new ArrayList();
        }
        this.mDependents.add(preference);
        preference.onDependencyChanged(this, shouldDisableDependents());
    }

    private void tryCommit(@NonNull SharedPreferences.Editor editor) {
        if (this.mPreferenceManager.shouldCommit()) {
            editor.apply();
        }
    }

    private void unregisterDependency() {
        Preference preferenceFindPreferenceInHierarchy;
        String str = this.mDependencyKey;
        if (str == null || (preferenceFindPreferenceInHierarchy = findPreferenceInHierarchy(str)) == null) {
            return;
        }
        preferenceFindPreferenceInHierarchy.unregisterDependent(this);
    }

    private void unregisterDependent(Preference preference) {
        List<Preference> list = this.mDependents;
        if (list != null) {
            list.remove(preference);
        }
    }

    public void assignParent(@Nullable PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.mParentGroup != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.mParentGroup = preferenceGroup;
    }

    public boolean callChangeListener(Object obj) {
        OnPreferenceChangeListener onPreferenceChangeListener = this.mOnChangeListener;
        return onPreferenceChangeListener == null || onPreferenceChangeListener.onPreferenceChange(this, obj);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Preference preference) {
        int i11 = this.mOrder;
        int i12 = preference.mOrder;
        if (i11 != i12) {
            return i11 - i12;
        }
        CharSequence charSequence = this.mTitle;
        CharSequence charSequence2 = preference.mTitle;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.mTitle.toString());
    }

    @Nullable
    public <T extends Preference> T findPreferenceInHierarchy(@NonNull String str) {
        PreferenceManager preferenceManager = this.mPreferenceManager;
        if (preferenceManager == null) {
            return null;
        }
        return (T) preferenceManager.findPreference(str);
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    @Nullable
    public String getDependency() {
        return this.mDependencyKey;
    }

    @NonNull
    public Bundle getExtras() {
        if (this.mExtras == null) {
            this.mExtras = new Bundle();
        }
        return this.mExtras;
    }

    @NonNull
    public StringBuilder getFilterableStringBuilder() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence title = getTitle();
        if (!TextUtils.isEmpty(title)) {
            sb2.append(title);
            sb2.append(' ');
        }
        CharSequence summary = getSummary();
        if (!TextUtils.isEmpty(summary)) {
            sb2.append(summary);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2;
    }

    @Nullable
    public String getFragment() {
        return this.mFragment;
    }

    @Nullable
    public Drawable getIcon() {
        int i11;
        if (this.mIcon == null && (i11 = this.mIconResId) != 0) {
            this.mIcon = AppCompatResources.getDrawable(this.mContext, i11);
        }
        return this.mIcon;
    }

    public long getId() {
        return this.mId;
    }

    @Nullable
    public Intent getIntent() {
        return this.mIntent;
    }

    public String getKey() {
        return this.mKey;
    }

    public final int getLayoutResource() {
        return this.mLayoutResId;
    }

    @Nullable
    public OnPreferenceChangeListener getOnPreferenceChangeListener() {
        return this.mOnChangeListener;
    }

    @Nullable
    public OnPreferenceClickListener getOnPreferenceClickListener() {
        return this.mOnClickListener;
    }

    public int getOrder() {
        return this.mOrder;
    }

    @Nullable
    public PreferenceGroup getParent() {
        return this.mParentGroup;
    }

    @Nullable
    public PreferenceDataStore getPreferenceDataStore() {
        PreferenceDataStore preferenceDataStore = this.mPreferenceDataStore;
        if (preferenceDataStore != null) {
            return preferenceDataStore;
        }
        PreferenceManager preferenceManager = this.mPreferenceManager;
        if (preferenceManager != null) {
            return preferenceManager.getPreferenceDataStore();
        }
        return null;
    }

    public PreferenceManager getPreferenceManager() {
        return this.mPreferenceManager;
    }

    @Nullable
    public SharedPreferences getSharedPreferences() {
        if (this.mPreferenceManager == null || getPreferenceDataStore() != null) {
            return null;
        }
        return this.mPreferenceManager.getSharedPreferences();
    }

    public boolean getShouldDisableView() {
        return this.mShouldDisableView;
    }

    @Nullable
    public final SummaryProvider getSummaryProvider() {
        return this.mSummaryProvider;
    }

    @Nullable
    public CharSequence getTitle() {
        return this.mTitle;
    }

    public final int getWidgetLayoutResource() {
        return this.mWidgetLayoutResId;
    }

    public boolean hasKey() {
        return !TextUtils.isEmpty(this.mKey);
    }

    public boolean isCopyingEnabled() {
        return this.mCopyingEnabled;
    }

    public boolean isEnabled() {
        return this.mEnabled && this.mDependencyMet && this.mParentDependencyMet;
    }

    public boolean isIconSpaceReserved() {
        return this.mIconSpaceReserved;
    }

    public boolean isPersistent() {
        return this.mPersistent;
    }

    public boolean isSelectable() {
        return this.mSelectable;
    }

    public boolean isSingleLineTitle() {
        return this.mSingleLineTitle;
    }

    public final boolean isVisible() {
        return this.mVisible;
    }

    public void notifyChanged() {
        OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.mListener;
        if (onPreferenceChangeInternalListener != null) {
            onPreferenceChangeInternalListener.onPreferenceChange(this);
        }
    }

    public void notifyDependencyChange(boolean z11) {
        List<Preference> list = this.mDependents;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            list.get(i11).onDependencyChanged(this, z11);
        }
    }

    public void notifyHierarchyChanged() {
        OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.mListener;
        if (onPreferenceChangeInternalListener != null) {
            onPreferenceChangeInternalListener.onPreferenceHierarchyChange(this);
        }
    }

    public void onBindViewHolder(@NonNull PreferenceViewHolder preferenceViewHolder) {
        Integer numValueOf;
        View view = preferenceViewHolder.itemView;
        view.setOnClickListener(this.mClickListener);
        view.setId(this.mViewId);
        TextView textView = (TextView) preferenceViewHolder.findViewById(android.R.id.summary);
        if (textView != null) {
            CharSequence summary = getSummary();
            if (TextUtils.isEmpty(summary)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(summary);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) preferenceViewHolder.findViewById(android.R.id.title);
        if (textView2 != null) {
            CharSequence title = getTitle();
            if (TextUtils.isEmpty(title)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(title);
                textView2.setVisibility(0);
                if (this.mHasSingleLineTitleAttr) {
                    textView2.setSingleLine(this.mSingleLineTitle);
                }
                if (!isSelectable() && isEnabled() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) preferenceViewHolder.findViewById(android.R.id.icon);
        if (imageView != null) {
            int i11 = this.mIconResId;
            if (i11 != 0 || this.mIcon != null) {
                if (this.mIcon == null) {
                    this.mIcon = AppCompatResources.getDrawable(this.mContext, i11);
                }
                Drawable drawable = this.mIcon;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.mIcon != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.mIconSpaceReserved ? 4 : 8);
            }
        }
        View viewFindViewById = preferenceViewHolder.findViewById(C3729R.id.icon_frame);
        if (viewFindViewById == null) {
            viewFindViewById = preferenceViewHolder.findViewById(16908350);
        }
        if (viewFindViewById != null) {
            if (this.mIcon != null) {
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.setVisibility(this.mIconSpaceReserved ? 4 : 8);
            }
        }
        if (this.mShouldDisableView) {
            setEnabledStateOnViews(view, isEnabled());
        } else {
            setEnabledStateOnViews(view, true);
        }
        boolean zIsSelectable = isSelectable();
        view.setFocusable(zIsSelectable);
        view.setClickable(zIsSelectable);
        preferenceViewHolder.setDividerAllowedAbove(this.mAllowDividerAbove);
        preferenceViewHolder.setDividerAllowedBelow(this.mAllowDividerBelow);
        boolean zIsCopyingEnabled = isCopyingEnabled();
        if (zIsCopyingEnabled && this.mOnCopyListener == null) {
            this.mOnCopyListener = new OnPreferenceCopyListener(this);
        }
        view.setOnCreateContextMenuListener(zIsCopyingEnabled ? this.mOnCopyListener : null);
        view.setLongClickable(zIsCopyingEnabled);
        if (!zIsCopyingEnabled || zIsSelectable) {
            return;
        }
        ViewCompat.setBackground(view, null);
    }

    public void onDependencyChanged(@NonNull Preference preference, boolean z11) {
        if (this.mDependencyMet == z11) {
            this.mDependencyMet = !z11;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public void onParentChanged(@NonNull Preference preference, boolean z11) {
        if (this.mParentDependencyMet == z11) {
            this.mParentDependencyMet = !z11;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    @Deprecated
    public void onSetInitialValue(boolean z11, Object obj) {
        onSetInitialValue(obj);
    }

    @Nullable
    public Bundle peekExtras() {
        return this.mExtras;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void performClick() {
        PreferenceManager.OnPreferenceTreeClickListener onPreferenceTreeClickListener;
        if (isEnabled() && isSelectable()) {
            onClick();
            OnPreferenceClickListener onPreferenceClickListener = this.mOnClickListener;
            if (onPreferenceClickListener == null || !onPreferenceClickListener.onPreferenceClick(this)) {
                PreferenceManager preferenceManager = getPreferenceManager();
                if ((preferenceManager == null || (onPreferenceTreeClickListener = preferenceManager.getOnPreferenceTreeClickListener()) == null || !onPreferenceTreeClickListener.onPreferenceTreeClick(this)) && this.mIntent != null) {
                    getContext().startActivity(this.mIntent);
                }
            }
        }
    }

    public void requireKey() {
        if (TextUtils.isEmpty(this.mKey)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.mRequiresKey = true;
    }

    public void setCopyingEnabled(boolean z11) {
        if (this.mCopyingEnabled != z11) {
            this.mCopyingEnabled = z11;
            notifyChanged();
        }
    }

    public void setDefaultValue(Object obj) {
        this.mDefaultValue = obj;
    }

    public void setEnabled(boolean z11) {
        if (this.mEnabled != z11) {
            this.mEnabled = z11;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public void setFragment(@Nullable String str) {
        this.mFragment = str;
    }

    public void setIconSpaceReserved(boolean z11) {
        if (this.mIconSpaceReserved != z11) {
            this.mIconSpaceReserved = z11;
            notifyChanged();
        }
    }

    public void setIntent(@Nullable Intent intent) {
        this.mIntent = intent;
    }

    public void setKey(String str) {
        this.mKey = str;
        if (!this.mRequiresKey || hasKey()) {
            return;
        }
        requireKey();
    }

    public void setLayoutResource(int i11) {
        this.mLayoutResId = i11;
    }

    public final void setOnPreferenceChangeInternalListener(@Nullable OnPreferenceChangeInternalListener onPreferenceChangeInternalListener) {
        this.mListener = onPreferenceChangeInternalListener;
    }

    public void setOnPreferenceChangeListener(@Nullable OnPreferenceChangeListener onPreferenceChangeListener) {
        this.mOnChangeListener = onPreferenceChangeListener;
    }

    public void setOnPreferenceClickListener(@Nullable OnPreferenceClickListener onPreferenceClickListener) {
        this.mOnClickListener = onPreferenceClickListener;
    }

    public void setOrder(int i11) {
        if (i11 != this.mOrder) {
            this.mOrder = i11;
            notifyHierarchyChanged();
        }
    }

    public void setPersistent(boolean z11) {
        this.mPersistent = z11;
    }

    public void setPreferenceDataStore(@Nullable PreferenceDataStore preferenceDataStore) {
        this.mPreferenceDataStore = preferenceDataStore;
    }

    public void setSelectable(boolean z11) {
        if (this.mSelectable != z11) {
            this.mSelectable = z11;
            notifyChanged();
        }
    }

    public void setShouldDisableView(boolean z11) {
        if (this.mShouldDisableView != z11) {
            this.mShouldDisableView = z11;
            notifyChanged();
        }
    }

    public final void setSummaryProvider(@Nullable SummaryProvider summaryProvider) {
        this.mSummaryProvider = summaryProvider;
        notifyChanged();
    }

    public void setViewId(int i11) {
        this.mViewId = i11;
    }

    public final void setVisible(boolean z11) {
        if (this.mVisible != z11) {
            this.mVisible = z11;
            OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.mListener;
            if (onPreferenceChangeInternalListener != null) {
                onPreferenceChangeInternalListener.onPreferenceVisibilityChange(this);
            }
        }
    }

    public void setWidgetLayoutResource(int i11) {
        this.mWidgetLayoutResId = i11;
    }

    public boolean shouldPersist() {
        return this.mPreferenceManager != null && isPersistent() && hasKey();
    }

    public final boolean wasDetached() {
        return this.mWasDetached;
    }

    private void dispatchSetInitialValue() {
        if (getPreferenceDataStore() != null) {
            onSetInitialValue(true, this.mDefaultValue);
            return;
        }
        if (shouldPersist() && getSharedPreferences().contains(this.mKey)) {
            onSetInitialValue(true, null);
            return;
        }
        Object obj = this.mDefaultValue;
        if (obj != null) {
            onSetInitialValue(false, obj);
        }
    }

    private void setEnabledStateOnViews(@NonNull View view, boolean z11) {
        view.setEnabled(z11);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                setEnabledStateOnViews(viewGroup.getChildAt(childCount), z11);
            }
        }
    }

    public void dispatchRestoreInstanceState(@NonNull Bundle bundle) {
        Parcelable parcelable;
        if (hasKey() && (parcelable = bundle.getParcelable(this.mKey)) != null) {
            this.mBaseMethodCalled = false;
            onRestoreInstanceState(parcelable);
            if (!this.mBaseMethodCalled) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    public void dispatchSaveInstanceState(@NonNull Bundle bundle) {
        if (hasKey()) {
            this.mBaseMethodCalled = false;
            Parcelable parcelableOnSaveInstanceState = onSaveInstanceState();
            if (this.mBaseMethodCalled) {
                if (parcelableOnSaveInstanceState != null) {
                    bundle.putParcelable(this.mKey, parcelableOnSaveInstanceState);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
    }

    public boolean getPersistedBoolean(boolean z11) {
        if (!shouldPersist()) {
            return z11;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getBoolean(this.mKey, z11);
        }
        return this.mPreferenceManager.getSharedPreferences().getBoolean(this.mKey, z11);
    }

    public float getPersistedFloat(float f11) {
        if (!shouldPersist()) {
            return f11;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getFloat(this.mKey, f11);
        }
        return this.mPreferenceManager.getSharedPreferences().getFloat(this.mKey, f11);
    }

    public int getPersistedInt(int i11) {
        if (!shouldPersist()) {
            return i11;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getInt(this.mKey, i11);
        }
        return this.mPreferenceManager.getSharedPreferences().getInt(this.mKey, i11);
    }

    public long getPersistedLong(long j11) {
        if (!shouldPersist()) {
            return j11;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getLong(this.mKey, j11);
        }
        return this.mPreferenceManager.getSharedPreferences().getLong(this.mKey, j11);
    }

    public String getPersistedString(String str) {
        if (!shouldPersist()) {
            return str;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getString(this.mKey, str);
        }
        return this.mPreferenceManager.getSharedPreferences().getString(this.mKey, str);
    }

    public Set<String> getPersistedStringSet(Set<String> set) {
        if (!shouldPersist()) {
            return set;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getStringSet(this.mKey, set);
        }
        return this.mPreferenceManager.getSharedPreferences().getStringSet(this.mKey, set);
    }

    @Nullable
    public CharSequence getSummary() {
        if (getSummaryProvider() != null) {
            return getSummaryProvider().provideSummary(this);
        }
        return this.mSummary;
    }

    public final boolean isShown() {
        if (!isVisible() || getPreferenceManager() == null) {
            return false;
        }
        if (this == getPreferenceManager().getPreferenceScreen()) {
            return true;
        }
        PreferenceGroup parent = getParent();
        if (parent == null) {
            return false;
        }
        return parent.isShown();
    }

    public void onAttached() {
        registerDependency();
    }

    public void onDetached() {
        unregisterDependency();
        this.mWasDetached = true;
    }

    public void onPrepareForRemoval() {
        unregisterDependency();
    }

    public boolean persistBoolean(boolean z11) {
        if (!shouldPersist()) {
            return false;
        }
        if (z11 == getPersistedBoolean(!z11)) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putBoolean(this.mKey, z11);
        } else {
            SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putBoolean(this.mKey, z11);
            tryCommit(editor);
        }
        return true;
    }

    public boolean persistFloat(float f11) {
        if (!shouldPersist()) {
            return false;
        }
        if (f11 == getPersistedFloat(Float.NaN)) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putFloat(this.mKey, f11);
        } else {
            SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putFloat(this.mKey, f11);
            tryCommit(editor);
        }
        return true;
    }

    public boolean persistInt(int i11) {
        if (!shouldPersist()) {
            return false;
        }
        if (i11 == getPersistedInt(~i11)) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putInt(this.mKey, i11);
        } else {
            SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putInt(this.mKey, i11);
            tryCommit(editor);
        }
        return true;
    }

    public boolean persistLong(long j11) {
        if (!shouldPersist()) {
            return false;
        }
        if (j11 == getPersistedLong(~j11)) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putLong(this.mKey, j11);
        } else {
            SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putLong(this.mKey, j11);
            tryCommit(editor);
        }
        return true;
    }

    public boolean persistString(String str) {
        if (!shouldPersist()) {
            return false;
        }
        if (TextUtils.equals(str, getPersistedString(null))) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putString(this.mKey, str);
        } else {
            SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putString(this.mKey, str);
            tryCommit(editor);
        }
        return true;
    }

    public boolean persistStringSet(Set<String> set) {
        if (!shouldPersist()) {
            return false;
        }
        if (set.equals(getPersistedStringSet(null))) {
            return true;
        }
        PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putStringSet(this.mKey, set);
        } else {
            SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
            editor.putStringSet(this.mKey, set);
            tryCommit(editor);
        }
        return true;
    }

    public void restoreHierarchyState(@NonNull Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveHierarchyState(@NonNull Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void setDependency(@Nullable String str) {
        unregisterDependency();
        this.mDependencyKey = str;
        registerDependency();
    }

    public boolean shouldDisableDependents() {
        return !isEnabled();
    }

    @NonNull
    public String toString() {
        return getFilterableStringBuilder().toString();
    }

    public void setTitle(int i11) {
        setTitle(this.mContext.getString(i11));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onAttachedToHierarchy(@NonNull PreferenceManager preferenceManager, long j11) {
        this.mId = j11;
        this.mHasId = true;
        try {
            onAttachedToHierarchy(preferenceManager);
        } finally {
            this.mHasId = false;
        }
    }

    public void setIcon(int i11) {
        setIcon(AppCompatResources.getDrawable(this.mContext, i11));
        this.mIconResId = i11;
    }

    public void setSummary(int i11) {
        setSummary(this.mContext.getString(i11));
    }

    public void onClick() {
    }

    @CallSuper
    @Deprecated
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, C3729R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(@NonNull Context context) {
        this(context, null);
    }
}
