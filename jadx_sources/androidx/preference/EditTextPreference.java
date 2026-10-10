package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: loaded from: classes34.dex */
public class EditTextPreference extends DialogPreference {

    @Nullable
    private OnBindEditTextListener mOnBindEditTextListener;
    private String mText;

    public interface OnBindEditTextListener {
        void onBindEditText(@NonNull EditText editText);
    }

    public static final class SimpleSummaryProvider implements Preference.SummaryProvider<EditTextPreference> {
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
        public CharSequence provideSummary(@NonNull EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.getText()) ? editTextPreference.getContext().getString(C3729R.string.not_set) : editTextPreference.getText();
        }

        private SimpleSummaryProvider() {
        }
    }

    public EditTextPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3729R.styleable.EditTextPreference, i11, i12);
        int i13 = C3729R.styleable.EditTextPreference_useSimpleSummaryProvider;
        if (TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, i13, i13, false)) {
            setSummaryProvider(SimpleSummaryProvider.getInstance());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.EditTextPreference.SavedState.1
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
        String mText;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mText = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.mText);
        }
    }

    @Nullable
    public OnBindEditTextListener getOnBindEditTextListener() {
        return this.mOnBindEditTextListener;
    }

    @Nullable
    public String getText() {
        return this.mText;
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.mText);
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        setText(getPersistedString((String) obj));
    }

    public void setOnBindEditTextListener(@Nullable OnBindEditTextListener onBindEditTextListener) {
        this.mOnBindEditTextListener = onBindEditTextListener;
    }

    @Override // androidx.preference.Preference
    public boolean shouldDisableDependents() {
        return TextUtils.isEmpty(this.mText) || super.shouldDisableDependents();
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
        savedState.mText = getText();
        return savedState;
    }

    public void setText(@Nullable String str) {
        boolean zShouldDisableDependents = shouldDisableDependents();
        this.mText = str;
        persistString(str);
        boolean zShouldDisableDependents2 = shouldDisableDependents();
        if (zShouldDisableDependents2 != zShouldDisableDependents) {
            notifyDependencyChange(zShouldDisableDependents2);
        }
        notifyChanged();
    }

    public EditTextPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public EditTextPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, C3729R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle));
    }

    public EditTextPreference(@NonNull Context context) {
        this(context, null);
    }
}
