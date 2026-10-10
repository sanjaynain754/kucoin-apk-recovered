package com.sensorsdata.analytics.android.sdk.visual.view;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes59.dex */
class PairingCodeEditText extends EditText implements IPairingCodeInterface, TextWatcher {
    private static final int DEFAULT_CURSOR_DURATION = 400;
    private boolean isCursorShowing;
    private float mBottomLineHeight;
    private int mBottomNormalColor;
    private Paint mBottomNormalPaint;
    private int mBottomSelectedColor;
    private Paint mBottomSelectedPaint;
    private int mCurrentPosition;
    private int mCursorColor;
    private int mCursorDuration;
    private Paint mCursorPaint;
    private Timer mCursorTimer;
    private TimerTask mCursorTimerTask;
    private int mCursorWidth;
    private int mEachRectLength;
    private int mFigures;
    private Paint mNormalBackgroundPaint;
    private int mPairingCodeMargin;
    private int mSelectedBackgroundColor;
    private Paint mSelectedBackgroundPaint;
    private IPairingCodeInterface.OnPairingCodeChangedListener onCodeChangedListener;

    public PairingCodeEditText(Context context) {
        this(context, null);
    }

    private int dp2px(int i11) {
        return (int) TypedValue.applyDimension(1, i11, getResources().getDisplayMetrics());
    }

    private void initAttrs() {
        this.mFigures = 4;
        this.mPairingCodeMargin = dp2px(10);
        this.mBottomSelectedColor = Color.parseColor("#00c48e");
        this.mBottomNormalColor = getColor(R.color.darker_gray);
        this.mBottomLineHeight = dp2px(2);
        this.mSelectedBackgroundColor = getColor(R.color.transparent);
        this.mCursorWidth = dp2px(1);
        this.mCursorColor = Color.parseColor("#00c48e");
        this.mCursorDuration = 400;
        setLayoutDirection(0);
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface
    public void setBottomLineHeight(int i11) {
        this.mBottomLineHeight = i11;
        postInvalidate();
    }

    public PairingCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int getScreenWidth(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService(InterfaceC33953u5.f72199F);
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels;
    }

    private void initCursorTimer() {
        this.mCursorTimerTask = new TimerTask() { // from class: com.sensorsdata.analytics.android.sdk.visual.view.PairingCodeEditText.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                PairingCodeEditText pairingCodeEditText = PairingCodeEditText.this;
                pairingCodeEditText.isCursorShowing = !pairingCodeEditText.isCursorShowing;
                PairingCodeEditText.this.postInvalidate();
            }
        };
        this.mCursorTimer = new Timer();
    }

    private void initPaint() {
        Paint paint = new Paint();
        this.mSelectedBackgroundPaint = paint;
        paint.setColor(this.mSelectedBackgroundColor);
        Paint paint2 = new Paint();
        this.mNormalBackgroundPaint = paint2;
        paint2.setColor(getColor(R.color.transparent));
        this.mBottomSelectedPaint = new Paint();
        this.mBottomNormalPaint = new Paint();
        this.mBottomSelectedPaint.setColor(this.mBottomSelectedColor);
        this.mBottomNormalPaint.setColor(this.mBottomNormalColor);
        this.mBottomSelectedPaint.setStrokeWidth(this.mBottomLineHeight);
        this.mBottomNormalPaint.setStrokeWidth(this.mBottomLineHeight);
        Paint paint3 = new Paint();
        this.mCursorPaint = paint3;
        paint3.setAntiAlias(true);
        this.mCursorPaint.setColor(this.mCursorColor);
        this.mCursorPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mCursorPaint.setStrokeWidth(this.mCursorWidth);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        this.mCurrentPosition = getText().length();
        int paddingLeft = (this.mEachRectLength - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        for (int i11 = 0; i11 < this.mFigures; i11++) {
            canvas.save();
            int i12 = (paddingLeft * i11) + (this.mPairingCodeMargin * i11);
            int i13 = paddingLeft + i12;
            if (i11 == this.mCurrentPosition) {
                canvas.drawRect(i12, 0.0f, i13, measuredHeight, this.mSelectedBackgroundPaint);
            } else {
                canvas.drawRect(i12, 0.0f, i13, measuredHeight, this.mNormalBackgroundPaint);
            }
            canvas.restore();
        }
        String string = getText().toString();
        for (int i14 = 0; i14 < string.length(); i14++) {
            canvas.save();
            float f11 = (paddingLeft * i14) + (this.mPairingCodeMargin * i14) + (paddingLeft / 2);
            TextPaint paint = getPaint();
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setColor(getCurrentTextColor());
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            float f12 = measuredHeight - fontMetrics.bottom;
            float f13 = fontMetrics.top;
            canvas.drawText(String.valueOf(string.charAt(i14)), f11, ((f12 + f13) / 2.0f) - f13, paint);
            canvas.restore();
        }
        for (int i15 = 0; i15 < this.mFigures; i15++) {
            canvas.save();
            float f14 = measuredHeight - (this.mBottomLineHeight / 2.0f);
            int i16 = (paddingLeft * i15) + (this.mPairingCodeMargin * i15);
            int i17 = paddingLeft + i16;
            if (i15 < this.mCurrentPosition) {
                canvas.drawLine(i16, f14, i17, f14, this.mBottomSelectedPaint);
            } else {
                canvas.drawLine(i16, f14, i17, f14, this.mBottomNormalPaint);
            }
            canvas.restore();
        }
        boolean zIsCursorVisible = isCursorVisible();
        if (this.isCursorShowing || !zIsCursorVisible || this.mCurrentPosition >= this.mFigures || !hasFocus()) {
            return;
        }
        canvas.save();
        int i18 = (this.mCurrentPosition * (this.mPairingCodeMargin + paddingLeft)) + (paddingLeft / 2);
        int i19 = measuredHeight / 4;
        float f15 = i18;
        canvas.drawLine(f15, i19, f15, measuredHeight - i19, this.mCursorPaint);
        canvas.restore();
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface
    public void setFigures(int i11) {
        this.mFigures = i11;
        postInvalidate();
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface
    public void setOnPairingCodeChangedListener(IPairingCodeInterface.OnPairingCodeChangedListener onPairingCodeChangedListener) {
        this.onCodeChangedListener = onPairingCodeChangedListener;
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface
    public void setPairingCodeMargin(int i11) {
        this.mPairingCodeMargin = i11;
        postInvalidate();
    }

    public void showKeyBoard(Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this, 2);
        }
    }

    public PairingCodeEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mCurrentPosition = 0;
        this.mEachRectLength = 0;
        initAttrs();
        setBackgroundColor(getColor(R.color.transparent));
        initPaint();
        initCursorTimer();
        setFocusableInTouchMode(true);
        setSelection(getText().length());
        requestFocus();
        super.addTextChangedListener(this);
    }

    private int getColor(int i11) {
        return getContext().getResources().getColor(i11);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.mCurrentPosition = getText().length();
        postInvalidate();
        if (getText().length() == this.mFigures) {
            IPairingCodeInterface.OnPairingCodeChangedListener onPairingCodeChangedListener = this.onCodeChangedListener;
            if (onPairingCodeChangedListener != null) {
                onPairingCodeChangedListener.onInputCompleted(getText());
                return;
            }
            return;
        }
        if (getText().length() > this.mFigures) {
            getText().delete(this.mFigures, getText().length());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        this.mCurrentPosition = getText().length();
        postInvalidate();
    }

    public void clearText() {
        getText().delete(0, getText().length());
    }

    public void hiddenKeyBord() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mCursorTimer.scheduleAtFixedRate(this.mCursorTimerTask, 0L, this.mCursorDuration);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mCursorTimer.cancel();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824) {
            size = getScreenWidth(getContext());
        }
        int i13 = this.mPairingCodeMargin;
        int i14 = this.mFigures;
        this.mEachRectLength = (size - (i13 * (i14 - 1))) / i14;
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mode2 != 1073741824) {
            size2 = this.mEachRectLength;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        this.mCurrentPosition = getText().length();
        postInvalidate();
        IPairingCodeInterface.OnPairingCodeChangedListener onPairingCodeChangedListener = this.onCodeChangedListener;
        if (onPairingCodeChangedListener != null) {
            onPairingCodeChangedListener.onPairingCodeChanged(getText(), i11, i12, i13);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface
    public void setBottomNormalColor(int i11) {
        this.mBottomSelectedColor = getColor(i11);
        postInvalidate();
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface
    public void setBottomSelectedColor(int i11) {
        this.mBottomSelectedColor = getColor(i11);
        postInvalidate();
    }

    @Override // android.widget.TextView
    public final void setCursorVisible(boolean z11) {
        super.setCursorVisible(z11);
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface
    public void setSelectedBackgroundColor(int i11) {
        this.mSelectedBackgroundColor = getColor(i11);
        postInvalidate();
    }
}
