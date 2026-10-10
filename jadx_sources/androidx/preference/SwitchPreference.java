package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: loaded from: classes34.dex */
public class SwitchPreference extends TwoStatePreference {
    private final Listener mListener;
    private CharSequence mSwitchOff;
    private CharSequence mSwitchOn;

    public class Listener implements CompoundButton.OnCheckedChangeListener {
        public Listener() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            if (SwitchPreference.this.callChangeListener(Boolean.valueOf(z11))) {
                SwitchPreference.this.setChecked(z11);
            } else {
                compoundButton.setChecked(!z11);
            }
        }
    }

    public SwitchPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.mListener = new Listener();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3729R.styleable.SwitchPreference, i11, i12);
        setSummaryOn(TypedArrayUtils.getString(typedArrayObtainStyledAttributes, C3729R.styleable.SwitchPreference_summaryOn, C3729R.styleable.SwitchPreference_android_summaryOn));
        setSummaryOff(TypedArrayUtils.getString(typedArrayObtainStyledAttributes, C3729R.styleable.SwitchPreference_summaryOff, C3729R.styleable.SwitchPreference_android_summaryOff));
        setSwitchTextOn(TypedArrayUtils.getString(typedArrayObtainStyledAttributes, C3729R.styleable.SwitchPreference_switchTextOn, C3729R.styleable.SwitchPreference_android_switchTextOn));
        setSwitchTextOff(TypedArrayUtils.getString(typedArrayObtainStyledAttributes, C3729R.styleable.SwitchPreference_switchTextOff, C3729R.styleable.SwitchPreference_android_switchTextOff));
        setDisableDependentsState(TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, C3729R.styleable.SwitchPreference_disableDependentsState, C3729R.styleable.SwitchPreference_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setSwitchTextOff(@Nullable CharSequence charSequence) {
        this.mSwitchOff = charSequence;
        notifyChanged();
    }

    public void setSwitchTextOn(@Nullable CharSequence charSequence) {
        this.mSwitchOn = charSequence;
        notifyChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void syncSwitchView(View view) {
        boolean z11 = view instanceof Switch;
        if (z11) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.mChecked);
        }
        if (z11) {
            Switch r11 = (Switch) view;
            r11.setTextOn(this.mSwitchOn);
            r11.setTextOff(this.mSwitchOff);
            r11.setOnCheckedChangeListener(this.mListener);
        }
    }

    @Nullable
    public CharSequence getSwitchTextOff() {
        return this.mSwitchOff;
    }

    @Nullable
    public CharSequence getSwitchTextOn() {
        return this.mSwitchOn;
    }

    private void syncViewIfAccessibilityEnabled(View view) {
        if (!((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        syncSwitchView(view.findViewById(android.R.id.switch_widget));
        syncSummaryView(view.findViewById(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(@NonNull PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        syncSwitchView(preferenceViewHolder.findViewById(android.R.id.switch_widget));
        syncSummaryView(preferenceViewHolder);
    }

    @Override // androidx.preference.Preference
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void performClick(@NonNull View view) {
        super.performClick(view);
        syncViewIfAccessibilityEnabled(view);
    }

    public void setSwitchTextOff(int i11) {
        setSwitchTextOff(getContext().getString(i11));
    }

    public void setSwitchTextOn(int i11) {
        setSwitchTextOn(getContext().getString(i11));
    }

    public SwitchPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public SwitchPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, C3729R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(@NonNull Context context) {
        this(context, null);
    }
}
