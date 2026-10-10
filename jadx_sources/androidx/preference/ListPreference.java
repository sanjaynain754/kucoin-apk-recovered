package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: loaded from: classes34.dex */
public class ListPreference extends DialogPreference {
    private static final String TAG = "ListPreference";
    private CharSequence[] mEntries;
    private CharSequence[] mEntryValues;
    private String mSummary;
    private String mValue;
    private boolean mValueSet;

    public static final class SimpleSummaryProvider implements Preference.SummaryProvider<ListPreference> {
        private static SimpleSummaryProvider sSimpleSummaryProvider;

        @NonNull
        public static SimpleSummaryProvider getInstance() {
            if (sSimpleSummaryProvider == null) {
                sSimpleSummaryProvider = new SimpleSummaryProvider();
            }
            return sSimpleSummaryProvider;
        }

        @Override // androidx.preference.Preference.SummaryProvider
        @Nullable
        public CharSequence provideSummary(@NonNull ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.getEntry()) ? listPreference.getContext().getString(C3729R.string.not_set) : listPreference.getEntry();
        }

        private SimpleSummaryProvider() {
        }
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3729R.styleable.ListPreference, i11, i12);
        this.mEntries = TypedArrayUtils.getTextArray(typedArrayObtainStyledAttributes, C3729R.styleable.ListPreference_entries, C3729R.styleable.ListPreference_android_entries);
        this.mEntryValues = TypedArrayUtils.getTextArray(typedArrayObtainStyledAttributes, C3729R.styleable.ListPreference_entryValues, C3729R.styleable.ListPreference_android_entryValues);
        int i13 = C3729R.styleable.ListPreference_useSimpleSummaryProvider;
        if (TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, i13, i13, false)) {
            setSummaryProvider(SimpleSummaryProvider.getInstance());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C3729R.styleable.Preference, i11, i12);
        this.mSummary = TypedArrayUtils.getString(typedArrayObtainStyledAttributes2, C3729R.styleable.Preference_summary, C3729R.styleable.Preference_android_summary);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public void setEntries(CharSequence[] charSequenceArr) {
        this.mEntries = charSequenceArr;
    }

    public void setEntryValues(CharSequence[] charSequenceArr) {
        this.mEntryValues = charSequenceArr;
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.ListPreference.SavedState.1
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
        String mValue;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mValue = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.mValue);
        }
    }

    private int getValueIndex() {
        return findIndexOfValue(this.mValue);
    }

    public int findIndexOfValue(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.mEntryValues) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.mEntryValues[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] getEntries() {
        return this.mEntries;
    }

    public CharSequence[] getEntryValues() {
        return this.mEntryValues;
    }

    public String getValue() {
        return this.mValue;
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setValue(savedState.mValue);
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        setValue(getPersistedString((String) obj));
    }

    public void setEntries(@ArrayRes int i11) {
        setEntries(getContext().getResources().getTextArray(i11));
    }

    public void setEntryValues(@ArrayRes int i11) {
        setEntryValues(getContext().getResources().getTextArray(i11));
    }

    public void setValue(String str) {
        boolean zEquals = TextUtils.equals(this.mValue, str);
        if (zEquals && this.mValueSet) {
            return;
        }
        this.mValue = str;
        this.mValueSet = true;
        persistString(str);
        if (zEquals) {
            return;
        }
        notifyChanged();
    }

    public void setValueIndex(int i11) {
        CharSequence[] charSequenceArr = this.mEntryValues;
        if (charSequenceArr != null) {
            setValue(charSequenceArr[i11].toString());
        }
    }

    @Nullable
    public CharSequence getEntry() {
        CharSequence[] charSequenceArr;
        int valueIndex = getValueIndex();
        if (valueIndex >= 0 && (charSequenceArr = this.mEntries) != null) {
            return charSequenceArr[valueIndex];
        }
        return null;
    }

    @Override // androidx.preference.Preference
    @Nullable
    public CharSequence getSummary() {
        if (getSummaryProvider() != null) {
            return getSummaryProvider().provideSummary(this);
        }
        CharSequence entry = getEntry();
        CharSequence summary = super.getSummary();
        String str = this.mSummary;
        if (str != null) {
            if (entry == null) {
                entry = "";
            }
            String str2 = String.format(str, entry);
            if (!TextUtils.equals(str2, summary)) {
                Log.w(TAG, "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return summary;
    }

    @Override // androidx.preference.Preference
    public Object onGetDefaultValue(@NonNull TypedArray typedArray, int i11) {
        return typedArray.getString(i11);
    }

    @Override // androidx.preference.Preference
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.mValue = getValue();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void setSummary(@Nullable CharSequence charSequence) {
        super.setSummary(charSequence);
        if (charSequence == null) {
            this.mSummary = null;
        } else {
            this.mSummary = charSequence.toString();
        }
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, C3729R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public ListPreference(@NonNull Context context) {
        this(context, null);
    }
}
