package com.google.android.material.timepicker;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C7090R;
import com.google.android.material.resources.MaterialResources;
import java.util.Arrays;

/* JADX INFO: loaded from: classes45.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.OnRotateListener {
    private static final float EPSILON = 0.001f;
    private static final int INITIAL_CAPACITY = 12;
    private static final String VALUE_PLACEHOLDER = "";
    private final int clockHandPadding;
    private final ClockHandView clockHandView;
    private final int clockSize;
    private float currentHandRotation;
    private final int[] gradientColors;
    private final float[] gradientPositions;
    private final int minimumHeight;
    private final int minimumWidth;
    private final RectF scratch;
    private final Rect scratchLineBounds;
    private final ColorStateList textColor;
    private final SparseArray<TextView> textViewPool;
    private final Rect textViewRect;
    private final AccessibilityDelegateCompat valueAccessibilityDelegate;
    private String[] values;

    public ClockFaceView(@NonNull Context context) {
        this(context, null);
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.materialClockStyle);
    }

    private void findIntersectingTextView() {
        RectF currentSelectorBox = this.clockHandView.getCurrentSelectorBox();
        TextView selectedTextView = getSelectedTextView(currentSelectorBox);
        for (int i11 = 0; i11 < this.textViewPool.size(); i11++) {
            TextView textView = this.textViewPool.get(i11);
            if (textView != null) {
                textView.setSelected(textView == selectedTextView);
                textView.getPaint().setShader(getGradientForTextView(currentSelectorBox, textView));
                textView.invalidate();
            }
        }
    }

    @Nullable
    private RadialGradient getGradientForTextView(RectF rectF, TextView textView) {
        textView.getHitRect(this.textViewRect);
        this.scratch.set(this.textViewRect);
        textView.getLineBounds(0, this.scratchLineBounds);
        RectF rectF2 = this.scratch;
        Rect rect = this.scratchLineBounds;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.scratch)) {
            return new RadialGradient(rectF.centerX() - this.scratch.left, rectF.centerY() - this.scratch.top, rectF.width() * 0.5f, this.gradientColors, this.gradientPositions, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public int getCurrentLevel() {
        return this.clockHandView.getCurrentLevel();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f11, boolean z11) {
        if (Math.abs(this.currentHandRotation - f11) > EPSILON) {
            this.currentHandRotation = f11;
            findIntersectingTextView();
        }
    }

    public void setCurrentLevel(int i11) {
        this.clockHandView.setCurrentLevel(i11);
    }

    public void setHandRotation(@FloatRange(from = 0.0d, m1552to = 360.0d) float f11) {
        this.clockHandView.setHandRotation(f11);
        findIntersectingTextView();
    }

    public void setValues(String[] strArr, @StringRes int i11) {
        this.values = strArr;
        updateTextViews(i11);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.textViewRect = new Rect();
        this.scratch = new RectF();
        this.scratchLineBounds = new Rect();
        this.textViewPool = new SparseArray<>();
        this.gradientPositions = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7090R.styleable.ClockFaceView, i11, C7090R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C7090R.styleable.ClockFaceView_clockNumberTextColor);
        this.textColor = colorStateList;
        LayoutInflater.from(context).inflate(C7090R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C7090R.id.material_clock_hand);
        this.clockHandView = clockHandView;
        this.clockHandPadding = resources.getDimensionPixelSize(C7090R.dimen.material_clock_hand_padding);
        int colorForState = colorStateList.getColorForState(new int[]{R.attr.state_selected}, colorStateList.getDefaultColor());
        this.gradientColors = new int[]{colorForState, colorForState, colorStateList.getDefaultColor()};
        clockHandView.addOnRotateListener(this);
        int defaultColor = AppCompatResources.getColorStateList(context, C7090R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C7090R.styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.timepicker.ClockFaceView.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (!ClockFaceView.this.isShown()) {
                    return true;
                }
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView.this.setRadius(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.clockHandView.getSelectorRadius()) - ClockFaceView.this.clockHandPadding);
                return true;
            }
        });
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.valueAccessibilityDelegate = new AccessibilityDelegateCompat() { // from class: com.google.android.material.timepicker.ClockFaceView.2
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(View view, int i12, Bundle bundle) {
                if (i12 != 16) {
                    return super.performAccessibilityAction(view, i12, bundle);
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                view.getHitRect(ClockFaceView.this.textViewRect);
                float fCenterX = ClockFaceView.this.textViewRect.centerX();
                float fCenterY = ClockFaceView.this.textViewRect.centerY();
                ClockFaceView.this.clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                ClockFaceView.this.clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                return true;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                int iIntValue = ((Integer) view.getTag(C7090R.id.material_value_index)).intValue();
                if (iIntValue > 0) {
                    accessibilityNodeInfoCompat.setTraversalAfter((View) ClockFaceView.this.textViewPool.get(iIntValue - 1));
                }
                accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
                accessibilityNodeInfoCompat.setClickable(true);
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            }
        };
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.minimumHeight = resources.getDimensionPixelSize(C7090R.dimen.material_time_picker_minimum_screen_height);
        this.minimumWidth = resources.getDimensionPixelSize(C7090R.dimen.material_time_picker_minimum_screen_width);
        this.clockSize = resources.getDimensionPixelSize(C7090R.dimen.material_clock_size);
    }

    @Nullable
    private TextView getSelectedTextView(RectF rectF) {
        float f11 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i11 = 0; i11 < this.textViewPool.size(); i11++) {
            TextView textView2 = this.textViewPool.get(i11);
            if (textView2 != null) {
                textView2.getHitRect(this.textViewRect);
                this.scratch.set(this.textViewRect);
                this.scratch.union(rectF);
                float fWidth = this.scratch.width() * this.scratch.height();
                if (fWidth < f11) {
                    textView = textView2;
                    f11 = fWidth;
                }
            }
        }
        return textView;
    }

    private static float max3(float f11, float f12, float f13) {
        return Math.max(Math.max(f11, f12), f13);
    }

    private void updateTextViews(@StringRes int i11) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.textViewPool.size();
        boolean z11 = false;
        for (int i12 = 0; i12 < Math.max(this.values.length, size); i12++) {
            TextView textView = this.textViewPool.get(i12);
            if (i12 >= this.values.length) {
                removeView(textView);
                this.textViewPool.remove(i12);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(C7090R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.textViewPool.put(i12, textView);
                    addView(textView);
                }
                textView.setText(this.values[i12]);
                textView.setTag(C7090R.id.material_value_index, Integer.valueOf(i12));
                int i13 = (i12 / 12) + 1;
                textView.setTag(C7090R.id.material_clock_level, Integer.valueOf(i13));
                if (i13 > 1) {
                    z11 = true;
                }
                ViewCompat.setAccessibilityDelegate(textView, this.valueAccessibilityDelegate);
                textView.setTextColor(this.textColor);
                if (i11 != 0) {
                    textView.setContentDescription(getResources().getString(i11, this.values[i12]));
                }
            }
        }
        this.clockHandView.setMultiLevel(z11);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.values.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        findIntersectingTextView();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax3 = (int) (this.clockSize / max3(this.minimumHeight / displayMetrics.heightPixels, this.minimumWidth / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax3, 1073741824);
        setMeasuredDimension(iMax3, iMax3);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void setRadius(int i11) {
        if (i11 != getRadius()) {
            super.setRadius(i11);
            this.clockHandView.setCircleRadius(getRadius());
        }
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void updateLayoutParams() {
        super.updateLayoutParams();
        for (int i11 = 0; i11 < this.textViewPool.size(); i11++) {
            this.textViewPool.get(i11).setVisibility(0);
        }
    }
}
