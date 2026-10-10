package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public class SeekBarPreference extends Preference {
    private static final String TAG = "SeekBarPreference";
    boolean mAdjustable;
    private int mMax;
    int mMin;
    SeekBar mSeekBar;
    private final SeekBar.OnSeekBarChangeListener mSeekBarChangeListener;
    private int mSeekBarIncrement;
    private final View.OnKeyListener mSeekBarKeyListener;
    int mSeekBarValue;
    private TextView mSeekBarValueTextView;
    private boolean mShowSeekBarValue;
    boolean mTrackingTouch;
    boolean mUpdatesContinuously;

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.mSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener() { // from class: androidx.preference.SeekBarPreference.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i13, boolean z11) {
                if (z11) {
                    SeekBarPreference seekBarPreference = SeekBarPreference.this;
                    if (seekBarPreference.mUpdatesContinuously || !seekBarPreference.mTrackingTouch) {
                        seekBarPreference.syncValueInternal(seekBar);
                        return;
                    }
                }
                SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
                seekBarPreference2.updateLabelValue(i13 + seekBarPreference2.mMin);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                SeekBarPreference.this.mTrackingTouch = true;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                SeekBarPreference.this.mTrackingTouch = false;
                int progress = seekBar.getProgress();
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (progress + seekBarPreference.mMin != seekBarPreference.mSeekBarValue) {
                    seekBarPreference.syncValueInternal(seekBar);
                }
            }
        };
        this.mSeekBarKeyListener = new View.OnKeyListener() { // from class: androidx.preference.SeekBarPreference.2
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i13, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if ((!seekBarPreference.mAdjustable && (i13 == 21 || i13 == 22)) || i13 == 23 || i13 == 66) {
                    return false;
                }
                SeekBar seekBar = seekBarPreference.mSeekBar;
                if (seekBar == null) {
                    Log.e(SeekBarPreference.TAG, "SeekBar view is null and hence cannot be adjusted.");
                    return false;
                }
                return seekBar.onKeyDown(i13, keyEvent);
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3729R.styleable.SeekBarPreference, i11, i12);
        this.mMin = typedArrayObtainStyledAttributes.getInt(C3729R.styleable.SeekBarPreference_min, 0);
        setMax(typedArrayObtainStyledAttributes.getInt(C3729R.styleable.SeekBarPreference_android_max, 100));
        setSeekBarIncrement(typedArrayObtainStyledAttributes.getInt(C3729R.styleable.SeekBarPreference_seekBarIncrement, 0));
        this.mAdjustable = typedArrayObtainStyledAttributes.getBoolean(C3729R.styleable.SeekBarPreference_adjustable, true);
        this.mShowSeekBarValue = typedArrayObtainStyledAttributes.getBoolean(C3729R.styleable.SeekBarPreference_showSeekBarValue, false);
        this.mUpdatesContinuously = typedArrayObtainStyledAttributes.getBoolean(C3729R.styleable.SeekBarPreference_updatesContinuously, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    @Nullable
    public Object onGetDefaultValue(@NonNull TypedArray typedArray, int i11) {
        return Integer.valueOf(typedArray.getInt(i11, 0));
    }

    public void setValue(int i11) {
        setValueInternal(i11, true);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.SeekBarPreference.SavedState.1
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
        int mMax;
        int mMin;
        int mSeekBarValue;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mSeekBarValue = parcel.readInt();
            this.mMin = parcel.readInt();
            this.mMax = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.mSeekBarValue);
            parcel.writeInt(this.mMin);
            parcel.writeInt(this.mMax);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private void setValueInternal(int i11, boolean z11) {
        int i12 = this.mMin;
        if (i11 < i12) {
            i11 = i12;
        }
        int i13 = this.mMax;
        if (i11 > i13) {
            i11 = i13;
        }
        if (i11 != this.mSeekBarValue) {
            this.mSeekBarValue = i11;
            updateLabelValue(i11);
            persistInt(i11);
            if (z11) {
                notifyChanged();
            }
        }
    }

    public int getMax() {
        return this.mMax;
    }

    public int getMin() {
        return this.mMin;
    }

    public final int getSeekBarIncrement() {
        return this.mSeekBarIncrement;
    }

    public boolean getShowSeekBarValue() {
        return this.mShowSeekBarValue;
    }

    public boolean getUpdatesContinuously() {
        return this.mUpdatesContinuously;
    }

    public int getValue() {
        return this.mSeekBarValue;
    }

    public boolean isAdjustable() {
        return this.mAdjustable;
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mSeekBarValue = savedState.mSeekBarValue;
        this.mMin = savedState.mMin;
        this.mMax = savedState.mMax;
        notifyChanged();
    }

    @Override // androidx.preference.Preference
    public void onSetInitialValue(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        setValue(getPersistedInt(((Integer) obj).intValue()));
    }

    public void setAdjustable(boolean z11) {
        this.mAdjustable = z11;
    }

    public final void setMax(int i11) {
        int i12 = this.mMin;
        if (i11 < i12) {
            i11 = i12;
        }
        if (i11 != this.mMax) {
            this.mMax = i11;
            notifyChanged();
        }
    }

    public void setMin(int i11) {
        int i12 = this.mMax;
        if (i11 > i12) {
            i11 = i12;
        }
        if (i11 != this.mMin) {
            this.mMin = i11;
            notifyChanged();
        }
    }

    public final void setSeekBarIncrement(int i11) {
        if (i11 != this.mSeekBarIncrement) {
            this.mSeekBarIncrement = Math.min(this.mMax - this.mMin, Math.abs(i11));
            notifyChanged();
        }
    }

    public void setShowSeekBarValue(boolean z11) {
        this.mShowSeekBarValue = z11;
        notifyChanged();
    }

    public void setUpdatesContinuously(boolean z11) {
        this.mUpdatesContinuously = z11;
    }

    public void syncValueInternal(@NonNull SeekBar seekBar) {
        int progress = this.mMin + seekBar.getProgress();
        if (progress != this.mSeekBarValue) {
            if (callChangeListener(Integer.valueOf(progress))) {
                setValueInternal(progress, false);
            } else {
                seekBar.setProgress(this.mSeekBarValue - this.mMin);
                updateLabelValue(this.mSeekBarValue);
            }
        }
    }

    public void updateLabelValue(int i11) {
        TextView textView = this.mSeekBarValueTextView;
        if (textView != null) {
            textView.setText(String.valueOf(i11));
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(@NonNull PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        preferenceViewHolder.itemView.setOnKeyListener(this.mSeekBarKeyListener);
        this.mSeekBar = (SeekBar) preferenceViewHolder.findViewById(C3729R.id.seekbar);
        TextView textView = (TextView) preferenceViewHolder.findViewById(C3729R.id.seekbar_value);
        this.mSeekBarValueTextView = textView;
        if (this.mShowSeekBarValue) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.mSeekBarValueTextView = null;
        }
        SeekBar seekBar = this.mSeekBar;
        if (seekBar == null) {
            Log.e(TAG, "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.mSeekBarChangeListener);
        this.mSeekBar.setMax(this.mMax - this.mMin);
        int i11 = this.mSeekBarIncrement;
        if (i11 != 0) {
            this.mSeekBar.setKeyProgressIncrement(i11);
        } else {
            this.mSeekBarIncrement = this.mSeekBar.getKeyProgressIncrement();
        }
        this.mSeekBar.setProgress(this.mSeekBarValue - this.mMin);
        updateLabelValue(this.mSeekBarValue);
        this.mSeekBar.setEnabled(isEnabled());
    }

    @Override // androidx.preference.Preference
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.mSeekBarValue = this.mSeekBarValue;
        savedState.mMin = this.mMin;
        savedState.mMax = this.mMax;
        return savedState;
    }

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C3729R.attr.seekBarPreferenceStyle);
    }

    public SeekBarPreference(@NonNull Context context) {
        this(context, null);
    }
}
