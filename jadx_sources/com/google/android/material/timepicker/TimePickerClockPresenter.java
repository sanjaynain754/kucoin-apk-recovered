package com.google.android.material.timepicker;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C7090R;
import com.kubi.otc.entity.OtcAd;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;

/* JADX INFO: loaded from: classes45.dex */
class TimePickerClockPresenter implements ClockHandView.OnRotateListener, TimePickerView.OnSelectionChange, TimePickerView.OnPeriodChangeListener, ClockHandView.OnActionUpListener, TimePickerPresenter {
    private static final int DEGREES_PER_HOUR = 30;
    private static final int DEGREES_PER_MINUTE = 6;
    private boolean broadcasting = false;
    private float hourRotation;
    private float minuteRotation;
    private final TimeModel time;
    private final TimePickerView timePickerView;
    private static final String[] HOUR_CLOCK_VALUES = {TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_TYPING, "1", "2", "3", "4", "5", "6", TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO, "8", "9", "10", "11"};
    private static final String[] HOUR_CLOCK_24_VALUES = {"00", "1", "2", "3", "4", "5", "6", TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO, "8", "9", "10", "11", TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_TYPING, "13", "14", "15", "16", "17", "18", TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_END, "20", TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_COLLECTION, TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_CARD, TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_EVALUATION_SETTING};
    private static final String[] MINUTE_CLOCK_VALUES = {"00", "5", "10", "15", "20", "25", "30", "35", "40", OtcAd.TRADE_TIME_FORTYFIVE, "50", "55"};

    private void updateValues() {
        updateValues(HOUR_CLOCK_VALUES, TimeModel.NUMBER_FORMAT);
        updateValues(HOUR_CLOCK_24_VALUES, TimeModel.NUMBER_FORMAT);
        updateValues(MINUTE_CLOCK_VALUES, TimeModel.ZERO_LEADING_NUMBER_FORMAT);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnActionUpListener
    public void onActionUp(float f11, boolean z11) {
        this.broadcasting = true;
        TimeModel timeModel = this.time;
        int i11 = timeModel.minute;
        int i12 = timeModel.hour;
        if (timeModel.selection == 10) {
            this.timePickerView.setHandRotation(this.hourRotation, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(this.timePickerView.getContext(), AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                setSelection(12, true);
            }
        } else {
            int iRound = Math.round(f11);
            if (!z11) {
                this.time.setMinute(((iRound + 15) / 30) * 5);
                this.minuteRotation = this.time.minute * 6;
            }
            this.timePickerView.setHandRotation(this.minuteRotation, z11);
        }
        this.broadcasting = false;
        updateTime();
        performHapticFeedback(i12, i11);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i11) {
        setSelection(i11, true);
    }

    private String[] getHourClockValues() {
        return this.time.format == 1 ? HOUR_CLOCK_24_VALUES : HOUR_CLOCK_VALUES;
    }

    private int getHourRotation() {
        return (this.time.getHourForDisplay() * 30) % TXVodDownloadDataSource.QUALITY_360P;
    }

    private void performHapticFeedback(int i11, int i12) {
        TimeModel timeModel = this.time;
        if (timeModel.minute == i12 && timeModel.hour == i11) {
            return;
        }
        this.timePickerView.performHapticFeedback(4);
    }

    private void updateCurrentLevel() {
        TimeModel timeModel = this.time;
        int i11 = 1;
        if (timeModel.selection == 10 && timeModel.format == 1 && timeModel.hour >= 12) {
            i11 = 2;
        }
        this.timePickerView.setCurrentLevel(i11);
    }

    private void updateTime() {
        TimePickerView timePickerView = this.timePickerView;
        TimeModel timeModel = this.time;
        timePickerView.updateTime(timeModel.period, timeModel.getHourForDisplay(), this.time.minute);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
        this.timePickerView.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
        if (this.time.format == 0) {
            this.timePickerView.showToggle();
        }
        this.timePickerView.addOnRotateListener(this);
        this.timePickerView.setOnSelectionChangeListener(this);
        this.timePickerView.setOnPeriodChangeListener(this);
        this.timePickerView.setOnActionUpListener(this);
        updateValues();
        invalidate();
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener
    public void onPeriodChange(int i11) {
        this.time.setPeriod(i11);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f11, boolean z11) {
        if (this.broadcasting || z11) {
            return;
        }
        TimeModel timeModel = this.time;
        int i11 = timeModel.hour;
        int i12 = timeModel.minute;
        int iRound = Math.round(f11);
        TimeModel timeModel2 = this.time;
        if (timeModel2.selection == 12) {
            timeModel2.setMinute((iRound + 3) / 6);
            this.minuteRotation = (float) Math.floor(this.time.minute * 6);
        } else {
            int i13 = (iRound + 15) / 30;
            if (timeModel2.format == 1) {
                i13 %= 12;
                if (this.timePickerView.getCurrentLevel() == 2) {
                    i13 += 12;
                }
            }
            this.time.setHour(i13);
            this.hourRotation = getHourRotation();
        }
        updateTime();
        performHapticFeedback(i11, i12);
    }

    public void setSelection(int i11, boolean z11) {
        boolean z12 = i11 == 12;
        this.timePickerView.setAnimateOnTouchUp(z12);
        this.time.selection = i11;
        this.timePickerView.setValues(z12 ? MINUTE_CLOCK_VALUES : getHourClockValues(), z12 ? C7090R.string.material_minute_suffix : this.time.getHourContentDescriptionResId());
        updateCurrentLevel();
        this.timePickerView.setHandRotation(z12 ? this.minuteRotation : this.hourRotation, z11);
        this.timePickerView.setActiveSelection(i11);
        this.timePickerView.setMinuteHourDelegate(new ClickActionDelegate(this.timePickerView.getContext(), C7090R.string.material_hour_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.1
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(TimePickerClockPresenter.this.time.getHourContentDescriptionResId(), String.valueOf(TimePickerClockPresenter.this.time.getHourForDisplay())));
            }
        });
        this.timePickerView.setHourClickDelegate(new ClickActionDelegate(this.timePickerView.getContext(), C7090R.string.material_minute_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.2
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(C7090R.string.material_minute_suffix, String.valueOf(TimePickerClockPresenter.this.time.minute)));
            }
        });
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
        this.timePickerView.setVisibility(0);
    }

    public TimePickerClockPresenter(TimePickerView timePickerView, TimeModel timeModel) {
        this.timePickerView = timePickerView;
        this.time = timeModel;
        initialize();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
        this.hourRotation = getHourRotation();
        TimeModel timeModel = this.time;
        this.minuteRotation = timeModel.minute * 6;
        setSelection(timeModel.selection, false);
        updateTime();
    }

    private void updateValues(String[] strArr, String str) {
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr[i11] = TimeModel.formatText(this.timePickerView.getResources(), strArr[i11], str);
        }
    }
}
