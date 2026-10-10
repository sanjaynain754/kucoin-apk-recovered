package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C7090R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.Locale;

/* JADX INFO: loaded from: classes45.dex */
class TimePickerView extends ConstraintLayout implements TimePickerControls {
    static final String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    private final ClockFaceView clockFace;
    private final ClockHandView clockHandView;
    private final Chip hourView;
    private final Chip minuteView;
    private OnDoubleTapListener onDoubleTapListener;
    private OnPeriodChangeListener onPeriodChangeListener;
    private OnSelectionChange onSelectionChangeListener;
    private final View.OnClickListener selectionListener;
    private final MaterialButtonToggleGroup toggle;

    public interface OnDoubleTapListener {
        void onDoubleTap();
    }

    public interface OnPeriodChangeListener {
        void onPeriodChange(int i11);
    }

    public interface OnSelectionChange {
        void onSelectionChanged(int i11);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setHandRotation(float f11) {
        this.clockHandView.setHandRotation(f11);
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    @SuppressLint({"DefaultLocale"})
    public void updateTime(int i11, int i12, int i13) {
        this.toggle.check(i11 == 1 ? C7090R.id.material_clock_period_pm_button : C7090R.id.material_clock_period_am_button);
        Locale locale = getResources().getConfiguration().locale;
        String str = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i13));
        String str2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i12));
        if (!TextUtils.equals(this.minuteView.getText(), str)) {
            this.minuteView.setText(str);
        }
        if (TextUtils.equals(this.hourView.getText(), str2)) {
            return;
        }
        this.hourView.setText(str2);
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13208a(TimePickerView timePickerView, MaterialButtonToggleGroup materialButtonToggleGroup, int i11, boolean z11) {
        if (!z11) {
            timePickerView.getClass();
            return;
        }
        OnPeriodChangeListener onPeriodChangeListener = timePickerView.onPeriodChangeListener;
        if (onPeriodChangeListener != null) {
            onPeriodChangeListener.onPeriodChange(i11 == C7090R.id.material_clock_period_pm_button ? 1 : 0);
        }
    }

    private void setUpDisplay() {
        Chip chip = this.minuteView;
        int i11 = C7090R.id.selection_type;
        chip.setTag(i11, 12);
        this.hourView.setTag(i11, 10);
        this.minuteView.setOnClickListener(this.selectionListener);
        this.hourView.setOnClickListener(this.selectionListener);
        this.minuteView.setAccessibilityClassName(GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME);
        this.hourView.setAccessibilityClassName(GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setupDoubleTap() {
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.material.timepicker.TimePickerView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                OnDoubleTapListener onDoubleTapListener = TimePickerView.this.onDoubleTapListener;
                if (onDoubleTapListener == null) {
                    return false;
                }
                onDoubleTapListener.onDoubleTap();
                return true;
            }
        });
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.google.android.material.timepicker.TimePickerView.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (((Checkable) view).isChecked()) {
                    return gestureDetector.onTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.minuteView.setOnTouchListener(onTouchListener);
        this.hourView.setOnTouchListener(onTouchListener);
    }

    public void addOnRotateListener(ClockHandView.OnRotateListener onRotateListener) {
        this.clockHandView.addOnRotateListener(onRotateListener);
    }

    public int getCurrentLevel() {
        return this.clockFace.getCurrentLevel();
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setActiveSelection(int i11) {
        updateSelection(this.minuteView, i11 == 12);
        updateSelection(this.hourView, i11 == 10);
    }

    public void setAnimateOnTouchUp(boolean z11) {
        this.clockHandView.setAnimateOnTouchUp(z11);
    }

    public void setCurrentLevel(int i11) {
        this.clockFace.setCurrentLevel(i11);
    }

    public void setHandRotation(float f11, boolean z11) {
        this.clockHandView.setHandRotation(f11, z11);
    }

    public void setHourClickDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.minuteView, accessibilityDelegateCompat);
    }

    public void setMinuteHourDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.hourView, accessibilityDelegateCompat);
    }

    public void setOnActionUpListener(ClockHandView.OnActionUpListener onActionUpListener) {
        this.clockHandView.setOnActionUpListener(onActionUpListener);
    }

    public void setOnDoubleTapListener(@Nullable OnDoubleTapListener onDoubleTapListener) {
        this.onDoubleTapListener = onDoubleTapListener;
    }

    public void setOnPeriodChangeListener(OnPeriodChangeListener onPeriodChangeListener) {
        this.onPeriodChangeListener = onPeriodChangeListener;
    }

    public void setOnSelectionChangeListener(OnSelectionChange onSelectionChange) {
        this.onSelectionChangeListener = onSelectionChange;
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setValues(String[] strArr, @StringRes int i11) {
        this.clockFace.setValues(strArr, i11);
    }

    public void showToggle() {
        this.toggle.setVisibility(0);
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.selectionListener = new View.OnClickListener() { // from class: com.google.android.material.timepicker.TimePickerView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TimePickerView.this.onSelectionChangeListener != null) {
                    TimePickerView.this.onSelectionChangeListener.onSelectionChanged(((Integer) view.getTag(C7090R.id.selection_type)).intValue());
                }
            }
        };
        LayoutInflater.from(context).inflate(C7090R.layout.material_timepicker, this);
        this.clockFace = (ClockFaceView) findViewById(C7090R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C7090R.id.material_clock_period_toggle);
        this.toggle = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() { // from class: com.google.android.material.timepicker.e
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
            public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup2, int i12, boolean z11) {
                TimePickerView.m13208a(this.f11940a, materialButtonToggleGroup2, i12, z11);
            }
        });
        this.minuteView = (Chip) findViewById(C7090R.id.material_minute_tv);
        this.hourView = (Chip) findViewById(C7090R.id.material_hour_tv);
        this.clockHandView = (ClockHandView) findViewById(C7090R.id.material_clock_hand);
        setupDoubleTap();
        setUpDisplay();
    }

    private void updateSelection(Chip chip, boolean z11) {
        int i11;
        chip.setChecked(z11);
        if (z11) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        chip.setAccessibilityLiveRegion(i11);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (view == this && i11 == 0) {
            this.hourView.sendAccessibilityEvent(8);
        }
    }
}
