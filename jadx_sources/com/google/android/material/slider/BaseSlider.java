package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.C7090R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes45.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {
    private static final int DEFAULT_LABEL_ANIMATION_ENTER_DURATION = 83;
    private static final int DEFAULT_LABEL_ANIMATION_EXIT_DURATION = 117;
    private static final String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION = "minSeparation(%s) must be greater or equal to 0";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final int HALO_ALPHA = 63;
    private static final float LEFT_LABEL_PIVOT_X = 1.2f;
    private static final float LEFT_LABEL_PIVOT_Y = 0.5f;
    private static final int MAX_TIMEOUT_TOOLTIP_WITH_ACCESSIBILITY = 120000;
    private static final int MIN_TIMEOUT_TOOLTIP_WITH_ACCESSIBILITY = 10000;
    private static final float RIGHT_LABEL_PIVOT_X = -0.2f;
    private static final float RIGHT_LABEL_PIVOT_Y = 0.5f;
    private static final String TAG = "BaseSlider";
    private static final double THRESHOLD = 1.0E-4d;
    private static final float THUMB_WIDTH_PRESSED_RATIO = 0.5f;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    private static final float TOP_LABEL_PIVOT_X = 0.5f;
    private static final float TOP_LABEL_PIVOT_Y = 1.2f;
    private static final float TOUCH_SLOP_RATIO = 0.8f;
    private static final int TRACK_CORNER_SIZE_UNSET = -1;
    static final int UNIT_PX = 0;
    static final int UNIT_VALUE = 1;
    private static final String WARNING_FLOATING_POINT_ERROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    private static final String WARNING_PARSE_ERROR = "Error parsing value(%s), valueFrom(%s), and valueTo(%s) into a float.";
    private BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender;

    @NonNull
    private final AccessibilityHelper accessibilityHelper;
    private final AccessibilityManager accessibilityManager;
    private int activeThumbIdx;

    @NonNull
    private final Paint activeTicksPaint;

    @NonNull
    private final Paint activeTrackPaint;

    @NonNull
    private final RectF activeTrackRect;
    private boolean centered;

    @NonNull
    private final List<L> changeListeners;

    @NonNull
    private final RectF cornerRect;

    @Nullable
    private Drawable customThumbDrawable;

    @NonNull
    private List<Drawable> customThumbDrawablesForValues;

    @NonNull
    private final MaterialShapeDrawable defaultThumbDrawable;
    private int defaultThumbRadius;
    private int defaultThumbTrackGapSize;
    private int defaultThumbWidth;
    private int defaultTickActiveRadius;
    private int defaultTickInactiveRadius;
    private int defaultTrackThickness;
    private boolean dirtyConfig;
    private int focusedThumbIdx;
    private boolean forceDrawCompatHalo;
    private LabelFormatter formatter;

    @NonNull
    private ColorStateList haloColor;

    @NonNull
    private final Paint haloPaint;
    private int haloRadius;

    @NonNull
    private final Rect iconRect;

    @NonNull
    private final RectF iconRectF;

    @NonNull
    private final Paint inactiveTicksPaint;

    @NonNull
    private final RectF inactiveTrackLeftRect;

    @NonNull
    private final Paint inactiveTrackPaint;

    @NonNull
    private final RectF inactiveTrackRightRect;
    private boolean isLongPress;
    private int labelBehavior;
    private int labelPadding;

    @NonNull
    private final Rect labelRect;
    private int labelStyle;

    @NonNull
    private final List<TooltipDrawable> labels;
    private boolean labelsAreAnimatedIn;
    private ValueAnimator labelsInAnimator;
    private ValueAnimator labelsOutAnimator;
    private MotionEvent lastEvent;
    private int minTickSpacing;

    @Px
    private int minTouchTargetSize;
    private int minTrackSidePadding;
    private int minWidgetThickness;

    @NonNull
    private final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;

    @NonNull
    private final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;

    @NonNull
    private final Runnable resetActiveThumbIndex;

    @NonNull
    private final Matrix rotationMatrix;
    private final int scaledTouchSlop;
    private int separationUnit;
    private float stepSize;

    @NonNull
    private final Paint stopIndicatorPaint;
    private boolean thisAndAncestorsVisible;
    private int thumbHeight;
    private boolean thumbIsPressed;

    @NonNull
    private final Paint thumbPaint;
    private int thumbTrackGapSize;
    private int thumbWidth;
    private int tickActiveRadius;

    @NonNull
    private ColorStateList tickColorActive;

    @NonNull
    private ColorStateList tickColorInactive;
    private int tickInactiveRadius;
    private int tickVisibilityMode;
    private float[] ticksCoordinates;
    private final int tooltipTimeoutMillis;
    private float touchDownAxis1;
    private float touchDownAxis2;

    @NonNull
    private final List<T> touchListeners;
    private float touchPosition;

    @NonNull
    private ColorStateList trackColorActive;

    @NonNull
    private ColorStateList trackColorInactive;
    private int trackCornerSize;

    @Nullable
    private ColorStateList trackIconActiveColor;

    @Nullable
    private Drawable trackIconActiveEnd;
    private boolean trackIconActiveEndMutated;

    @Nullable
    private Drawable trackIconActiveStart;
    private boolean trackIconActiveStartMutated;

    @Nullable
    private ColorStateList trackIconInactiveColor;

    @Nullable
    private Drawable trackIconInactiveEnd;
    private boolean trackIconInactiveEndMutated;

    @Nullable
    private Drawable trackIconInactiveStart;
    private boolean trackIconInactiveStartMutated;

    @Px
    private int trackIconPadding;

    @Px
    private int trackIconSize;
    private int trackInsideCornerSize;

    @NonNull
    private final Path trackPath;
    private int trackSidePadding;
    private int trackStopIndicatorSize;
    private int trackThickness;
    private int trackWidth;
    private float valueFrom;
    private float valueTo;
    private ArrayList<Float> values;
    private int widgetOrientation;
    private int widgetThickness;
    static final int DEF_STYLE_RES = C7090R.style.Widget_MaterialComponents_Slider;
    private static final int LABEL_ANIMATION_ENTER_DURATION_ATTR = C7090R.attr.motionDurationMedium4;
    private static final int LABEL_ANIMATION_EXIT_DURATION_ATTR = C7090R.attr.motionDurationShort3;
    private static final int LABEL_ANIMATION_ENTER_EASING_ATTR = C7090R.attr.motionEasingEmphasizedInterpolator;
    private static final int LABEL_ANIMATION_EXIT_EASING_ATTR = C7090R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public class AccessibilityEventSender implements Runnable {
        int virtualViewId;

        private AccessibilityEventSender() {
            this.virtualViewId = -1;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.accessibilityHelper.sendEventForVirtualView(this.virtualViewId, 4);
        }

        public void setVirtualViewId(int i11) {
            this.virtualViewId = i11;
        }
    }

    public static class AccessibilityHelper extends ExploreByTouchHelper {
        private final BaseSlider<?, ?, ?> slider;
        final Rect virtualViewBounds;

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f11, float f12) {
            for (int i11 = 0; i11 < this.slider.getValues().size(); i11++) {
                this.slider.updateBoundsForVirtualViewId(i11, this.virtualViewBounds);
                if (this.virtualViewBounds.contains((int) f11, (int) f12)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(@NonNull List<Integer> list) {
            for (int i11 = 0; i11 < this.slider.getValues().size(); i11++) {
                list.add(Integer.valueOf(i11));
            }
        }

        @NonNull
        private String startOrEndDescription(int i11) {
            if (i11 == this.slider.getValues().size() - 1) {
                return this.slider.getContext().getString(C7090R.string.material_slider_range_end);
            }
            return i11 == 0 ? this.slider.getContext().getString(C7090R.string.material_slider_range_start) : "";
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i11, int i12, @Nullable Bundle bundle) {
            if (!this.slider.isEnabled()) {
                return false;
            }
            if (i12 != 4096 && i12 != 8192) {
                if (i12 == 16908349 && bundle != null && bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)) {
                    if (this.slider.snapThumbToValue(i11, bundle.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE))) {
                        this.slider.updateHaloHotspot();
                        this.slider.postInvalidate();
                        invalidateVirtualView(i11);
                        return true;
                    }
                }
                return false;
            }
            float fCalculateStepIncrement = this.slider.calculateStepIncrement(20);
            if (i12 == 8192) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            if (this.slider.isRtl()) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            if (!this.slider.snapThumbToValue(i11, MathUtils.clamp(this.slider.getValues().get(i11).floatValue() + fCalculateStepIncrement, this.slider.getValueFrom(), this.slider.getValueTo()))) {
                return false;
            }
            this.slider.setActiveThumbIndex(i11);
            this.slider.scheduleTooltipTimeout();
            this.slider.updateHaloHotspot();
            this.slider.postInvalidate();
            invalidateVirtualView(i11);
            return true;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i11, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            List<Float> values = this.slider.getValues();
            Float f11 = values.get(i11);
            float fFloatValue = f11.floatValue();
            float valueFrom = this.slider.getValueFrom();
            float valueTo = this.slider.getValueTo();
            if (this.slider.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (fFloatValue < valueTo) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMaximumFractionDigits(2);
            try {
                valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
                valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
                fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
            } catch (ParseException unused) {
                Log.w(BaseSlider.TAG, String.format(BaseSlider.WARNING_PARSE_ERROR, f11, Float.valueOf(valueFrom), Float.valueOf(valueTo)));
            }
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, valueFrom, valueTo, fFloatValue));
            accessibilityNodeInfoCompat.setClassName(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (this.slider.getContentDescription() != null) {
                sb2.append(this.slider.getContentDescription());
                sb2.append(",");
            }
            String value = this.slider.formatValue(fFloatValue);
            String string = this.slider.getContext().getString(C7090R.string.material_slider_value);
            if (values.size() > 1) {
                string = startOrEndDescription(i11);
            }
            CharSequence stateDescription = ViewCompat.getStateDescription(this.slider);
            if (TextUtils.isEmpty(stateDescription)) {
                sb2.append(String.format(Locale.getDefault(), "%s, %s", string, value));
            } else {
                accessibilityNodeInfoCompat.setStateDescription(stateDescription);
            }
            accessibilityNodeInfoCompat.setContentDescription(sb2.toString());
            this.slider.updateBoundsForVirtualViewId(i11, this.virtualViewBounds);
            accessibilityNodeInfoCompat.setBoundsInParent(this.virtualViewBounds);
        }

        public AccessibilityHelper(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.virtualViewBounds = new Rect();
            this.slider = baseSlider;
        }
    }

    public enum FullCornerDirection {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new Parcelable.Creator<SliderState>() { // from class: com.google.android.material.slider.BaseSlider.SliderState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState createFromParcel(@NonNull Parcel parcel) {
                return new SliderState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState[] newArray(int i11) {
                return new SliderState[i11];
            }
        };
        boolean hasFocus;
        float stepSize;
        float valueFrom;
        float valueTo;
        ArrayList<Float> values;

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(@NonNull Parcel parcel) {
            super(parcel);
            this.valueFrom = parcel.readFloat();
            this.valueTo = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.values = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.stepSize = parcel.readFloat();
            this.hasFocus = parcel.createBooleanArray()[0];
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeFloat(this.valueFrom);
            parcel.writeFloat(this.valueTo);
            parcel.writeList(this.values);
            parcel.writeFloat(this.stepSize);
            parcel.writeBooleanArray(new boolean[]{this.hasFocus});
        }
    }

    public BaseSlider(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13176a(BaseSlider baseSlider) {
        baseSlider.setActiveThumbIndex(-1);
        baseSlider.invalidate();
    }

    private float calculateStepIncrement() {
        float f11 = this.stepSize;
        if (f11 == 0.0f) {
            return 1.0f;
        }
        return f11;
    }

    private float dimenToValue(float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        float f12 = (f11 - this.trackSidePadding) / this.trackWidth;
        float f13 = this.valueFrom;
        return (f12 * (f13 - this.valueTo)) + f13;
    }

    private void drawThumbs(@NonNull Canvas canvas, int i11, int i12) {
        Canvas canvas2;
        int i13;
        int i14;
        int i15 = 0;
        while (i15 < this.values.size()) {
            float fFloatValue = this.values.get(i15).floatValue();
            Drawable drawable = this.customThumbDrawable;
            if (drawable != null) {
                canvas2 = canvas;
                i13 = i11;
                i14 = i12;
                drawThumbDrawable(canvas2, i13, i14, fFloatValue, drawable);
            } else {
                canvas2 = canvas;
                i13 = i11;
                i14 = i12;
                if (i15 < this.customThumbDrawablesForValues.size()) {
                    drawThumbDrawable(canvas2, i13, i14, fFloatValue, this.customThumbDrawablesForValues.get(i15));
                } else {
                    if (!isEnabled()) {
                        canvas2.drawCircle(this.trackSidePadding + (normalizeValue(fFloatValue) * i13), i14, getThumbRadius(), this.thumbPaint);
                    }
                    drawThumbDrawable(canvas2, i13, i14, fFloatValue, this.defaultThumbDrawable);
                }
            }
            i15++;
            canvas = canvas2;
            i11 = i13;
            i12 = i14;
        }
    }

    private void focusThumbOnFocusGained(int i11) {
        if (i11 == 1) {
            moveFocus(Integer.MAX_VALUE);
            return;
        }
        if (i11 == 2) {
            moveFocus(Integer.MIN_VALUE);
        } else if (i11 == 17) {
            moveFocusInAbsoluteDirection(Integer.MAX_VALUE);
        } else {
            if (i11 != 66) {
                return;
            }
            moveFocusInAbsoluteDirection(Integer.MIN_VALUE);
        }
    }

    private float[] getCornerRadii(float f11, float f12) {
        return isVertical() ? new float[]{f11, f11, f11, f11, f12, f12, f12, f12} : new float[]{f11, f11, f12, f12, f12, f12, f11, f11};
    }

    private static boolean isMouseEvent(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    private void maybeDrawCompatHalo(@NonNull Canvas canvas, int i11, int i12) {
        Canvas canvas2;
        if (shouldDrawCompatHalo()) {
            float[] fArr = {this.trackSidePadding + (normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * i11), i12};
            if (isVertical()) {
                this.rotationMatrix.mapPoints(fArr);
            }
            if (Build.VERSION.SDK_INT < 28) {
                float f11 = fArr[0];
                int i13 = this.haloRadius;
                float f12 = fArr[1];
                canvas2 = canvas;
                canvas2.clipRect(f11 - i13, f12 - i13, f11 + i13, f12 + i13, Region.Op.UNION);
            } else {
                canvas2 = canvas;
            }
            canvas2.drawCircle(fArr[0], fArr[1], this.haloRadius, this.haloPaint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHaloHotspot() {
        if (shouldDrawCompatHalo() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            float fNormalizeValue = (normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * this.trackWidth) + this.trackSidePadding;
            int iCalculateTrackCenter = calculateTrackCenter();
            int i11 = this.haloRadius;
            float[] fArr = {fNormalizeValue - i11, iCalculateTrackCenter - i11, fNormalizeValue + i11, iCalculateTrackCenter + i11};
            if (isVertical()) {
                this.rotationMatrix.mapPoints(fArr);
            }
            background.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
    }

    private void updateTicksCoordinates() {
        validateConfigurationIfDirty();
        int iMin = 0;
        if (this.stepSize <= 0.0f) {
            updateTicksCoordinates(0);
            return;
        }
        int i11 = this.tickVisibilityMode;
        if (i11 == 0) {
            iMin = Math.min(getDesiredTickCount(), getMaxTickCount());
        } else if (i11 == 1) {
            int desiredTickCount = getDesiredTickCount();
            if (desiredTickCount <= getMaxTickCount()) {
                iMin = desiredTickCount;
            }
        } else if (i11 != 2) {
            throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.tickVisibilityMode);
        }
        updateTicksCoordinates(iMin);
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, @NonNull KeyEvent keyEvent) {
        this.isLongPress = false;
        return super.onKeyUp(i11, keyEvent);
    }

    public void setCustomThumbDrawable(@DrawableRes int i11) {
        setCustomThumbDrawable(getResources().getDrawable(i11));
    }

    public void setCustomThumbDrawablesForValues(@NonNull @DrawableRes int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            drawableArr[i11] = getResources().getDrawable(iArr[i11]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    public void setStepSize(float f11) {
        if (f11 < 0.0f) {
            throw new IllegalArgumentException(String.format(EXCEPTION_ILLEGAL_STEP_SIZE, Float.valueOf(f11), Float.valueOf(this.valueFrom), Float.valueOf(this.valueTo)));
        }
        if (this.stepSize != f11) {
            this.stepSize = f11;
            this.dirtyConfig = true;
            postInvalidate();
        }
    }

    public void setTrackIconActiveEnd(@Nullable Drawable drawable) {
        if (drawable == this.trackIconActiveEnd) {
            return;
        }
        this.trackIconActiveEnd = drawable;
        this.trackIconActiveEndMutated = false;
        updateTrackIconActiveEnd();
        invalidate();
    }

    public void setTrackIconActiveStart(@Nullable Drawable drawable) {
        if (drawable == this.trackIconActiveStart) {
            return;
        }
        this.trackIconActiveStart = drawable;
        this.trackIconActiveStartMutated = false;
        updateTrackIconActiveStart();
        invalidate();
    }

    public void setTrackIconInactiveEnd(@Nullable Drawable drawable) {
        if (drawable == this.trackIconInactiveEnd) {
            return;
        }
        this.trackIconInactiveEnd = drawable;
        this.trackIconInactiveEndMutated = false;
        updateTrackIconInactiveEnd();
        invalidate();
    }

    public void setTrackIconInactiveStart(@Nullable Drawable drawable) {
        if (drawable == this.trackIconInactiveStart) {
            return;
        }
        this.trackIconInactiveStart = drawable;
        this.trackIconInactiveStartMutated = false;
        updateTrackIconInactiveStart();
        invalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.sliderStyle);
    }

    private void calculateBoundsAndDrawTrackIcon(@NonNull Canvas canvas, @NonNull RectF rectF, @Nullable Drawable drawable, boolean z11) {
        if (drawable != null) {
            calculateTrackIconBounds(rectF, this.iconRectF, this.trackIconSize, this.trackIconPadding, z11);
            if (this.iconRectF.isEmpty()) {
                return;
            }
            drawTrackIcon(canvas, this.iconRectF, drawable);
        }
    }

    private float calculateEndTrackCornerSize(float f11) {
        if (this.values.isEmpty() || !hasGapBetweenThumbAndTrack()) {
            return f11;
        }
        float fValueToX = valueToX(this.values.get((isRtl() || isVertical()) ? 0 : this.values.size() - 1).floatValue()) - this.trackSidePadding;
        int i11 = this.trackWidth;
        return fValueToX > ((float) i11) - f11 ? Math.max(i11 - fValueToX, this.trackInsideCornerSize) : f11;
    }

    @Nullable
    private Float calculateIncrementForKey(int i11) {
        float fCalculateStepIncrement = this.isLongPress ? calculateStepIncrement(20) : calculateStepIncrement();
        if (i11 == 69) {
            return Float.valueOf(-fCalculateStepIncrement);
        }
        if (i11 == 70 || i11 == 81) {
            return Float.valueOf(fCalculateStepIncrement);
        }
        switch (i11) {
            case 19:
                if (isVertical()) {
                    return Float.valueOf(fCalculateStepIncrement);
                }
                return null;
            case 20:
                if (isVertical()) {
                    return Float.valueOf(-fCalculateStepIncrement);
                }
                return null;
            case 21:
                if (!isRtl()) {
                    fCalculateStepIncrement = -fCalculateStepIncrement;
                }
                return Float.valueOf(fCalculateStepIncrement);
            case 22:
                if (isRtl()) {
                    fCalculateStepIncrement = -fCalculateStepIncrement;
                }
                return Float.valueOf(fCalculateStepIncrement);
            default:
                return null;
        }
    }

    private float calculateStartTrackCornerSize(float f11) {
        if (this.values.isEmpty() || !hasGapBetweenThumbAndTrack()) {
            return f11;
        }
        float fValueToX = valueToX(this.values.get((isRtl() || isVertical()) ? this.values.size() - 1 : 0).floatValue()) - this.trackSidePadding;
        return fValueToX < f11 ? Math.max(fValueToX, this.trackInsideCornerSize) : f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float calculateStepIncrement(int i11) {
        float fCalculateStepIncrement = calculateStepIncrement();
        float f11 = (this.valueTo - this.valueFrom) / fCalculateStepIncrement;
        float f12 = i11;
        return f11 <= f12 ? fCalculateStepIncrement : Math.round(f11 / f12) * fCalculateStepIncrement;
    }

    private int calculateTrackCenter() {
        return (this.widgetThickness / 2) + ((this.labelBehavior == 1 || shouldAlwaysShowLabel()) ? this.labels.get(0).getIntrinsicHeight() : 0);
    }

    private void calculateTrackIconBounds(@NonNull RectF rectF, @NonNull RectF rectF2, @Px int i11, @Px int i12, boolean z11) {
        if (rectF.right - rectF.left < (i12 * 2) + i11) {
            rectF2.setEmpty();
            return;
        }
        float f11 = z11 ^ (isRtl() || isVertical()) ? rectF.left + i12 : (rectF.right - i12) - i11;
        float f12 = i11;
        float fCalculateTrackCenter = calculateTrackCenter() - (f12 / 2.0f);
        rectF2.set(f11, fCalculateTrackCenter, f11 + f12, f12 + fCalculateTrackCenter);
    }

    private int convertToTickVisibilityMode(boolean z11) {
        return z11 ? 0 : 2;
    }

    private ValueAnimator createLabelAnimator(boolean z11) {
        int iResolveThemeDuration;
        TimeInterpolator timeInterpolatorResolveThemeInterpolator;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getAnimatorCurrentValueOrDefault(z11 ? this.labelsOutAnimator : this.labelsInAnimator, z11 ? 0.0f : 1.0f), z11 ? 1.0f : 0.0f);
        if (z11) {
            iResolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), LABEL_ANIMATION_ENTER_DURATION_ATTR, 83);
            timeInterpolatorResolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), LABEL_ANIMATION_ENTER_EASING_ATTR, AnimationUtils.DECELERATE_INTERPOLATOR);
        } else {
            iResolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), LABEL_ANIMATION_EXIT_DURATION_ATTR, 117);
            timeInterpolatorResolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), LABEL_ANIMATION_EXIT_EASING_ATTR, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        }
        valueAnimatorOfFloat.setDuration(iResolveThemeDuration);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorResolveThemeInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseSlider.m13177b(this.f11914b, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void createLabelPool() {
        if (this.labels.size() > this.values.size()) {
            List<TooltipDrawable> listSubList = this.labels.subList(this.values.size(), this.labels.size());
            for (TooltipDrawable tooltipDrawable : listSubList) {
                if (isAttachedToWindow()) {
                    detachLabelFromContentView(tooltipDrawable);
                }
            }
            listSubList.clear();
        }
        while (true) {
            if (this.labels.size() >= this.values.size()) {
                break;
            }
            TooltipDrawable tooltipDrawableCreateFromAttributes = TooltipDrawable.createFromAttributes(getContext(), null, 0, this.labelStyle);
            this.labels.add(tooltipDrawableCreateFromAttributes);
            if (isAttachedToWindow()) {
                attachLabelToContentView(tooltipDrawableCreateFromAttributes);
            }
        }
        int i11 = this.labels.size() != 1 ? 1 : 0;
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            it.next().setStrokeWidth(i11);
        }
    }

    private void dispatchOnChangedFromUser(int i11) {
        Iterator<L> it = this.changeListeners.iterator();
        while (it.hasNext()) {
            it.next().onValueChange(this, this.values.get(i11).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        scheduleAccessibilityEventSender(i11);
    }

    private void dispatchOnChangedProgrammatically() {
        for (L l11 : this.changeListeners) {
            Iterator<Float> it = this.values.iterator();
            while (it.hasNext()) {
                l11.onValueChange(this, it.next().floatValue(), false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    private void drawActiveTracks(@NonNull Canvas canvas, int i11, int i12) {
        int i13;
        float f11;
        float f12;
        BaseSlider<S, L, T> baseSlider = this;
        float[] activeRange = baseSlider.getActiveRange();
        int i14 = baseSlider.trackSidePadding;
        float f13 = i11;
        float fValueToX = i14 + (activeRange[1] * f13);
        float fValueToX2 = i14 + (activeRange[0] * f13);
        if (fValueToX2 >= fValueToX) {
            baseSlider.activeTrackRect.setEmpty();
            return;
        }
        FullCornerDirection fullCornerDirection = FullCornerDirection.NONE;
        if (baseSlider.values.size() == 1 && !baseSlider.isCentered()) {
            fullCornerDirection = (baseSlider.isRtl() || baseSlider.isVertical()) ? FullCornerDirection.RIGHT : FullCornerDirection.LEFT;
        }
        FullCornerDirection fullCornerDirection2 = fullCornerDirection;
        int i15 = 0;
        while (i15 < baseSlider.values.size()) {
            if (baseSlider.values.size() > 1) {
                if (i15 > 0) {
                    fValueToX2 = baseSlider.valueToX(baseSlider.values.get(i15 - 1).floatValue());
                }
                fValueToX = baseSlider.valueToX(baseSlider.values.get(i15).floatValue());
                if (baseSlider.isRtl() || baseSlider.isVertical()) {
                    fValueToX = fValueToX2;
                    fValueToX2 = fValueToX;
                }
            }
            int trackCornerSize = baseSlider.getTrackCornerSize();
            int iOrdinal = fullCornerDirection2.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    fValueToX2 += baseSlider.thumbTrackGapSize;
                    fValueToX += trackCornerSize;
                } else if (iOrdinal == 3) {
                    if (!baseSlider.isCentered()) {
                        i13 = baseSlider.thumbTrackGapSize;
                        fValueToX2 += i13;
                    } else if (activeRange[1] == 0.5f) {
                        fValueToX2 += baseSlider.thumbTrackGapSize;
                    } else if (activeRange[0] == 0.5f) {
                        i13 = baseSlider.thumbTrackGapSize;
                    }
                }
                f11 = fValueToX2;
                f12 = fValueToX;
                if (f11 >= f12) {
                    baseSlider.activeTrackRect.setEmpty();
                } else {
                    RectF rectF = baseSlider.activeTrackRect;
                    float f14 = i12;
                    int i16 = baseSlider.trackThickness;
                    rectF.set(f11, f14 - (i16 / 2.0f), f12, f14 + (i16 / 2.0f));
                    baseSlider.updateTrack(canvas, baseSlider.activeTrackPaint, baseSlider.activeTrackRect, trackCornerSize, fullCornerDirection2);
                }
                i15++;
                baseSlider = this;
                fValueToX2 = f11;
                fValueToX = f12;
            } else {
                fValueToX2 -= trackCornerSize;
                i13 = baseSlider.thumbTrackGapSize;
            }
            fValueToX -= i13;
            f11 = fValueToX2;
            f12 = fValueToX;
            if (f11 >= f12) {
                baseSlider.activeTrackRect.setEmpty();
            } else {
                RectF rectF2 = baseSlider.activeTrackRect;
                float f15 = i12;
                int i17 = baseSlider.trackThickness;
                rectF2.set(f11, f15 - (i17 / 2.0f), f12, f15 + (i17 / 2.0f));
                baseSlider.updateTrack(canvas, baseSlider.activeTrackPaint, baseSlider.activeTrackRect, trackCornerSize, fullCornerDirection2);
            }
            i15++;
            baseSlider = this;
            fValueToX2 = f11;
            fValueToX = f12;
        }
    }

    private void drawInactiveTrackSection(float f11, float f12, float f13, float f14, @NonNull Canvas canvas, RectF rectF, FullCornerDirection fullCornerDirection) {
        if (f12 - f11 > getTrackCornerSize() - this.thumbTrackGapSize) {
            rectF.set(f11, f13, f12, f14);
        } else {
            rectF.setEmpty();
        }
        updateTrack(canvas, this.inactiveTrackPaint, rectF, getTrackCornerSize(), fullCornerDirection);
    }

    private void drawStopIndicator(@NonNull Canvas canvas, float f11, float f12) {
        Iterator<Float> it = this.values.iterator();
        while (it.hasNext()) {
            float fValueToX = valueToX(it.next().floatValue());
            float f13 = this.thumbTrackGapSize + (this.thumbWidth / 2.0f);
            if (f11 >= fValueToX - f13 && f11 <= fValueToX + f13) {
                return;
            }
        }
        if (isVertical()) {
            canvas.drawPoint(f12, f11, this.stopIndicatorPaint);
        } else {
            canvas.drawPoint(f11, f12, this.stopIndicatorPaint);
        }
    }

    private void drawTicks(int i11, int i12, Canvas canvas, Paint paint) {
        while (i11 < i12) {
            float f11 = isVertical() ? this.ticksCoordinates[i11 + 1] : this.ticksCoordinates[i11];
            if (!isOverlappingThumb(f11) && (!isCentered() || !isOverlappingCenterGap(f11))) {
                float[] fArr = this.ticksCoordinates;
                canvas.drawPoint(fArr[i11], fArr[i11 + 1], paint);
            }
            i11 += 2;
        }
    }

    private void ensureLabelsAdded() {
        if (!this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = true;
            ValueAnimator valueAnimatorCreateLabelAnimator = createLabelAnimator(true);
            this.labelsInAnimator = valueAnimatorCreateLabelAnimator;
            this.labelsOutAnimator = null;
            valueAnimatorCreateLabelAnimator.start();
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        for (int i11 = 0; i11 < this.values.size() && it.hasNext(); i11++) {
            if (i11 != this.focusedThumbIdx) {
                setValueForLabel(it.next(), this.values.get(i11).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.labels.size()), Integer.valueOf(this.values.size())));
        }
        setValueForLabel(it.next(), this.values.get(this.focusedThumbIdx).floatValue());
    }

    private void ensureLabelsRemoved() {
        if (this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = false;
            ValueAnimator valueAnimatorCreateLabelAnimator = createLabelAnimator(false);
            this.labelsOutAnimator = valueAnimatorCreateLabelAnimator;
            this.labelsInAnimator = null;
            valueAnimatorCreateLabelAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.slider.BaseSlider.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ViewOverlay contentViewOverlay = BaseSlider.this.getContentViewOverlay();
                    if (contentViewOverlay != null) {
                        Iterator it = BaseSlider.this.labels.iterator();
                        while (it.hasNext()) {
                            contentViewOverlay.remove((TooltipDrawable) it.next());
                        }
                    }
                }
            });
            this.labelsOutAnimator.start();
        }
    }

    private float[] getActiveRange() {
        float fFloatValue = this.values.get(0).floatValue();
        ArrayList<Float> arrayList = this.values;
        float fFloatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (this.values.size() == 1) {
            fFloatValue = this.valueFrom;
        }
        float fNormalizeValue = normalizeValue(fFloatValue);
        float fNormalizeValue2 = normalizeValue(fFloatValue2);
        if (isCentered()) {
            float fMin = Math.min(0.5f, fNormalizeValue2);
            fNormalizeValue2 = Math.max(0.5f, fNormalizeValue2);
            fNormalizeValue = fMin;
        }
        return (isCentered() || !(isRtl() || isVertical())) ? new float[]{fNormalizeValue, fNormalizeValue2} : new float[]{fNormalizeValue2, fNormalizeValue};
    }

    private static float getAnimatorCurrentValueOrDefault(ValueAnimator valueAnimator, float f11) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f11;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return fFloatValue;
    }

    private int getDesiredTickCount() {
        return (int) (((this.valueTo - this.valueFrom) / this.stepSize) + 1.0f);
    }

    private int getMaxTickCount() {
        return (this.trackWidth / this.minTickSpacing) + 1;
    }

    private float getValueOfTouchPosition() {
        double dSnapPosition = snapPosition(this.touchPosition);
        if (isRtl() || isVertical()) {
            dSnapPosition = 1.0d - dSnapPosition;
        }
        float f11 = this.valueTo;
        float f12 = this.valueFrom;
        return (float) ((dSnapPosition * ((double) (f11 - f12))) + ((double) f12));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f11 = this.touchPosition;
        if (isRtl() || isVertical()) {
            f11 = 1.0f - f11;
        }
        float f12 = this.valueTo;
        float f13 = this.valueFrom;
        return (f11 * (f12 - f13)) + f13;
    }

    private boolean hasGapBetweenThumbAndTrack() {
        return this.thumbTrackGapSize > 0;
    }

    private boolean hasTrackIcons() {
        return (this.trackIconActiveStart == null && this.trackIconActiveEnd == null && this.trackIconInactiveStart == null && this.trackIconInactiveEnd == null) ? false : true;
    }

    private void invalidateTrack() {
        this.inactiveTrackPaint.setStrokeWidth(this.trackThickness);
        this.activeTrackPaint.setStrokeWidth(this.trackThickness);
    }

    private boolean isMultipleOfStepSize(double d11) {
        double dDoubleValue = new BigDecimal(Double.toString(d11)).divide(new BigDecimal(Float.toString(this.stepSize)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < THRESHOLD;
    }

    private boolean isOverlappingCenterGap(float f11) {
        float f12 = this.thumbTrackGapSize + (this.thumbWidth / 2.0f);
        float f13 = (this.trackWidth + (this.trackSidePadding * 2)) / 2.0f;
        return f11 >= f13 - f12 && f11 <= f13 + f12;
    }

    private boolean isOverlappingThumb(float f11) {
        float f12 = this.thumbTrackGapSize + (this.thumbWidth / 2.0f);
        Iterator<Float> it = this.values.iterator();
        if (it.hasNext()) {
            float fValueToX = valueToX(it.next().floatValue());
            if (f11 >= fValueToX - f12 && f11 <= fValueToX + f12) {
                return true;
            }
        }
        return false;
    }

    private boolean isSliderVisibleOnScreen() {
        Rect rect = new Rect();
        ViewUtils.getContentView(this).getHitRect(rect);
        return getLocalVisibleRect(rect) && isThisAndAncestorsVisible();
    }

    private boolean isThisAndAncestorsVisible() {
        return this.thisAndAncestorsVisible;
    }

    private void loadResources(@NonNull Resources resources) {
        this.minWidgetThickness = resources.getDimensionPixelSize(C7090R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C7090R.dimen.mtrl_slider_track_side_padding);
        this.minTrackSidePadding = dimensionPixelOffset;
        this.trackSidePadding = dimensionPixelOffset;
        this.defaultThumbRadius = resources.getDimensionPixelSize(C7090R.dimen.mtrl_slider_thumb_radius);
        this.defaultTrackThickness = resources.getDimensionPixelSize(C7090R.dimen.mtrl_slider_track_height);
        int i11 = C7090R.dimen.mtrl_slider_tick_radius;
        this.defaultTickActiveRadius = resources.getDimensionPixelSize(i11);
        this.defaultTickInactiveRadius = resources.getDimensionPixelSize(i11);
        this.minTickSpacing = resources.getDimensionPixelSize(C7090R.dimen.mtrl_slider_tick_min_spacing);
        this.labelPadding = resources.getDimensionPixelSize(C7090R.dimen.mtrl_slider_label_padding);
        this.trackIconPadding = resources.getDimensionPixelOffset(C7090R.dimen.m3_slider_track_icon_padding);
    }

    private void maybeDrawStopIndicator(@NonNull Canvas canvas, int i11) {
        if (this.trackStopIndicatorSize <= 0 || this.values.isEmpty()) {
            return;
        }
        ArrayList<Float> arrayList = this.values;
        float fFloatValue = arrayList.get(arrayList.size() - 1).floatValue();
        float f11 = this.valueTo;
        if (fFloatValue < f11) {
            drawStopIndicator(canvas, valueToX(f11), i11);
        }
        if (isCentered() || (this.values.size() > 1 && this.values.get(0).floatValue() > this.valueFrom)) {
            drawStopIndicator(canvas, valueToX(this.valueFrom), i11);
        }
    }

    private void maybeDrawTicks(@NonNull Canvas canvas) {
        float[] fArr = this.ticksCoordinates;
        if (fArr == null || fArr.length == 0) {
            return;
        }
        float[] activeRange = getActiveRange();
        int iCeil = (int) Math.ceil(activeRange[0] * ((this.ticksCoordinates.length / 2.0f) - 1.0f));
        int iFloor = (int) Math.floor(activeRange[1] * ((this.ticksCoordinates.length / 2.0f) - 1.0f));
        if (iCeil > 0) {
            drawTicks(0, iCeil * 2, canvas, this.inactiveTicksPaint);
        }
        if (iCeil <= iFloor) {
            drawTicks(iCeil * 2, (iFloor + 1) * 2, canvas, this.activeTicksPaint);
        }
        int i11 = (iFloor + 1) * 2;
        float[] fArr2 = this.ticksCoordinates;
        if (i11 < fArr2.length) {
            drawTicks(i11, fArr2.length, canvas, this.inactiveTicksPaint);
        }
    }

    private boolean maybeIncreaseTrackSidePadding() {
        int iMax = this.minTrackSidePadding + Math.max(Math.max(Math.max((this.thumbWidth / 2) - this.defaultThumbRadius, 0), Math.max((this.trackThickness - this.defaultTrackThickness) / 2, 0)), Math.max(Math.max(this.tickActiveRadius - this.defaultTickActiveRadius, 0), Math.max(this.tickInactiveRadius - this.defaultTickInactiveRadius, 0)));
        if (this.trackSidePadding == iMax) {
            return false;
        }
        this.trackSidePadding = iMax;
        if (!isLaidOut()) {
            return true;
        }
        updateTrackWidth(isVertical() ? getHeight() : getWidth());
        return true;
    }

    private boolean moveFocus(int i11) {
        int i12 = this.focusedThumbIdx;
        int iClamp = (int) MathUtils.clamp(((long) i12) + ((long) i11), 0L, this.values.size() - 1);
        this.focusedThumbIdx = iClamp;
        if (iClamp == i12) {
            return false;
        }
        if (this.activeThumbIdx != -1) {
            this.activeThumbIdx = iClamp;
        }
        updateHaloHotspot();
        postInvalidate();
        return true;
    }

    private float normalizeValue(float f11) {
        float f12 = this.valueFrom;
        float f13 = (f11 - f12) / (this.valueTo - f12);
        return (isRtl() || isVertical()) ? 1.0f - f13 : f13;
    }

    @Nullable
    private Boolean onKeyDownNoActiveThumb(int i11, @NonNull KeyEvent keyEvent) {
        if (i11 == 61) {
            if (keyEvent.hasNoModifiers()) {
                return Boolean.valueOf(moveFocus(1));
            }
            return keyEvent.isShiftPressed() ? Boolean.valueOf(moveFocus(-1)) : Boolean.FALSE;
        }
        if (i11 != 66) {
            if (i11 != 81) {
                if (i11 == 69) {
                    moveFocus(-1);
                    return Boolean.TRUE;
                }
                if (i11 != 70) {
                    switch (i11) {
                        case 21:
                            moveFocusInAbsoluteDirection(-1);
                            return Boolean.TRUE;
                        case 22:
                            moveFocusInAbsoluteDirection(1);
                            return Boolean.TRUE;
                        case 23:
                            break;
                        default:
                            return null;
                    }
                }
            }
            moveFocus(1);
            return Boolean.TRUE;
        }
        this.activeThumbIdx = this.focusedThumbIdx;
        postInvalidate();
        return Boolean.TRUE;
    }

    private void onStartTrackingTouch() {
        Iterator<T> it = this.touchListeners.iterator();
        while (it.hasNext()) {
            it.next().onStartTrackingTouch(this);
        }
    }

    private void onStopTrackingTouch() {
        Iterator<T> it = this.touchListeners.iterator();
        while (it.hasNext()) {
            it.next().onStopTrackingTouch(this);
        }
    }

    private void processAttributes(Context context, AttributeSet attributeSet, int i11) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C7090R.styleable.Slider, i11, DEF_STYLE_RES, new int[0]);
        setOrientation(typedArrayObtainStyledAttributes.getInt(C7090R.styleable.Slider_android_orientation, 0));
        this.labelStyle = typedArrayObtainStyledAttributes.getResourceId(C7090R.styleable.Slider_labelStyle, C7090R.style.Widget_MaterialComponents_Tooltip);
        this.valueFrom = typedArrayObtainStyledAttributes.getFloat(C7090R.styleable.Slider_android_valueFrom, 0.0f);
        this.valueTo = typedArrayObtainStyledAttributes.getFloat(C7090R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.valueFrom));
        setCentered(typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.Slider_centered, false));
        this.stepSize = typedArrayObtainStyledAttributes.getFloat(C7090R.styleable.Slider_android_stepSize, 0.0f);
        this.minTouchTargetSize = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(C7090R.styleable.Slider_minTouchTargetSize, MaterialAttributes.resolveMinimumAccessibleTouchTarget(context)));
        int i12 = C7090R.styleable.Slider_trackColor;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i12);
        int i13 = zHasValue ? i12 : C7090R.styleable.Slider_trackColorInactive;
        if (!zHasValue) {
            i12 = C7090R.styleable.Slider_trackColorActive;
        }
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i13);
        if (colorStateList == null) {
            colorStateList = AppCompatResources.getColorStateList(context, C7090R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(colorStateList);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i12);
        if (colorStateList2 == null) {
            colorStateList2 = AppCompatResources.getColorStateList(context, C7090R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(colorStateList2);
        this.defaultThumbDrawable.setFillColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C7090R.styleable.Slider_thumbColor));
        int i14 = C7090R.styleable.Slider_thumbStrokeColor;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            setThumbStrokeColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i14));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(C7090R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C7090R.styleable.Slider_haloColor);
        if (colorStateList3 == null) {
            colorStateList3 = AppCompatResources.getColorStateList(context, C7090R.color.material_slider_halo_color);
        }
        setHaloTintList(colorStateList3);
        int i15 = C7090R.styleable.Slider_tickVisibilityMode;
        this.tickVisibilityMode = typedArrayObtainStyledAttributes.hasValue(i15) ? typedArrayObtainStyledAttributes.getInt(i15, -1) : convertToTickVisibilityMode(typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.Slider_tickVisible, true));
        int i16 = C7090R.styleable.Slider_tickColor;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i16);
        int i17 = zHasValue2 ? i16 : C7090R.styleable.Slider_tickColorInactive;
        if (!zHasValue2) {
            i16 = C7090R.styleable.Slider_tickColorActive;
        }
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i17);
        if (colorStateList4 == null) {
            colorStateList4 = AppCompatResources.getColorStateList(context, C7090R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(colorStateList4);
        ColorStateList colorStateList5 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i16);
        if (colorStateList5 == null) {
            colorStateList5 = AppCompatResources.getColorStateList(context, C7090R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(colorStateList5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_trackStopIndicatorSize, 0));
        setTrackCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_trackCornerSize, -1));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_trackInsideCornerSize, 0));
        setTrackIconActiveStart(MaterialResources.getDrawable(context, typedArrayObtainStyledAttributes, C7090R.styleable.Slider_trackIconActiveStart));
        setTrackIconActiveEnd(MaterialResources.getDrawable(context, typedArrayObtainStyledAttributes, C7090R.styleable.Slider_trackIconActiveEnd));
        setTrackIconActiveColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C7090R.styleable.Slider_trackIconActiveColor));
        setTrackIconInactiveStart(MaterialResources.getDrawable(context, typedArrayObtainStyledAttributes, C7090R.styleable.Slider_trackIconInactiveStart));
        setTrackIconInactiveEnd(MaterialResources.getDrawable(context, typedArrayObtainStyledAttributes, C7090R.styleable.Slider_trackIconInactiveEnd));
        setTrackIconInactiveColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C7090R.styleable.Slider_trackIconInactiveColor));
        setTrackIconSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_trackIconSize, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_haloRadius, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(C7090R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_tickRadiusActive, this.trackStopIndicatorSize / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.Slider_tickRadiusInactive, this.trackStopIndicatorSize / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(C7090R.styleable.Slider_labelBehavior, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void scheduleAccessibilityEventSender(int i11) {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender == null) {
            this.accessibilityEventSender = new AccessibilityEventSender();
        } else {
            removeCallbacks(accessibilityEventSender);
        }
        this.accessibilityEventSender.setVirtualViewId(i11);
        postDelayed(this.accessibilityEventSender, 200L);
    }

    private boolean shouldAlwaysShowLabel() {
        return this.labelBehavior == 3;
    }

    private boolean shouldDrawCompatHalo() {
        return this.forceDrawCompatHalo || !(getBackground() instanceof RippleDrawable);
    }

    private boolean snapActiveThumbToValue(float f11) {
        return snapThumbToValue(this.activeThumbIdx, f11);
    }

    private double snapPosition(float f11) {
        float f12 = this.stepSize;
        if (f12 <= 0.0f) {
            return f11;
        }
        int i11 = (int) ((this.valueTo - this.valueFrom) / f12);
        return ((double) Math.round(f11 * i11)) / ((double) i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean snapThumbToValue(int i11, float f11) {
        this.focusedThumbIdx = i11;
        if (Math.abs(f11 - this.values.get(i11).floatValue()) < THRESHOLD) {
            return false;
        }
        this.values.set(i11, Float.valueOf(getClampedValue(i11, f11)));
        dispatchOnChangedFromUser(i11);
        return true;
    }

    private void updateTrackIconActiveEnd() {
        Drawable drawable = this.trackIconActiveEnd;
        if (drawable != null) {
            if (!this.trackIconActiveEndMutated && this.trackIconActiveColor != null) {
                this.trackIconActiveEnd = DrawableCompat.wrap(drawable).mutate();
                this.trackIconActiveEndMutated = true;
            }
            if (this.trackIconActiveEndMutated) {
                this.trackIconActiveEnd.setTintList(this.trackIconActiveColor);
            }
        }
    }

    private void updateTrackIconActiveStart() {
        Drawable drawable = this.trackIconActiveStart;
        if (drawable != null) {
            if (!this.trackIconActiveStartMutated && this.trackIconActiveColor != null) {
                this.trackIconActiveStart = DrawableCompat.wrap(drawable).mutate();
                this.trackIconActiveStartMutated = true;
            }
            if (this.trackIconActiveStartMutated) {
                this.trackIconActiveStart.setTintList(this.trackIconActiveColor);
            }
        }
    }

    private void updateTrackIconInactiveEnd() {
        Drawable drawable = this.trackIconInactiveEnd;
        if (drawable != null) {
            if (!this.trackIconInactiveEndMutated && this.trackIconInactiveColor != null) {
                this.trackIconInactiveEnd = DrawableCompat.wrap(drawable).mutate();
                this.trackIconInactiveEndMutated = true;
            }
            if (this.trackIconInactiveEndMutated) {
                this.trackIconInactiveEnd.setTintList(this.trackIconInactiveColor);
            }
        }
    }

    private void updateTrackIconInactiveStart() {
        Drawable drawable = this.trackIconInactiveStart;
        if (drawable != null) {
            if (!this.trackIconInactiveStartMutated && this.trackIconInactiveColor != null) {
                this.trackIconInactiveStart = DrawableCompat.wrap(drawable).mutate();
                this.trackIconInactiveStartMutated = true;
            }
            if (this.trackIconInactiveStartMutated) {
                this.trackIconInactiveStart.setTintList(this.trackIconInactiveColor);
            }
        }
    }

    private void updateTrackWidth(int i11) {
        this.trackWidth = Math.max(i11 - (this.trackSidePadding * 2), 0);
        updateTicksCoordinates();
    }

    private void validateConfigurationIfDirty() {
        if (this.dirtyConfig) {
            validateValues();
            validateStepSize();
            validateMinSeparation();
            warnAboutFloatingPointError();
            this.dirtyConfig = false;
        }
    }

    private void validateStepSize() {
        if (this.stepSize > 0.0f && !valueLandsOnTick(this.valueTo)) {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_STEP_SIZE, Float.valueOf(this.stepSize), Float.valueOf(this.valueFrom), Float.valueOf(this.valueTo)));
        }
    }

    private void validateValues() {
        if (this.valueFrom >= this.valueTo) {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_VALUE_FROM, Float.valueOf(this.valueFrom), Float.valueOf(this.valueTo)));
        }
        for (Float f11 : this.values) {
            if (f11.floatValue() < this.valueFrom || f11.floatValue() > this.valueTo) {
                throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_VALUE, f11, Float.valueOf(this.valueFrom), Float.valueOf(this.valueTo)));
            }
            if (this.stepSize > 0.0f && !valueLandsOnTick(f11.floatValue())) {
                throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_DISCRETE_VALUE, f11, Float.valueOf(this.valueFrom), Float.valueOf(this.stepSize), Float.valueOf(this.stepSize)));
            }
        }
    }

    private boolean valueLandsOnTick(float f11) {
        return isMultipleOfStepSize(new BigDecimal(Float.toString(f11)).subtract(new BigDecimal(Float.toString(this.valueFrom)), MathContext.DECIMAL64).doubleValue());
    }

    private void warnAboutFloatingPointError() {
        float f11 = this.stepSize;
        if (f11 == 0.0f) {
            return;
        }
        if (((int) f11) != f11) {
            Log.w(TAG, String.format(WARNING_FLOATING_POINT_ERROR, "stepSize", Float.valueOf(f11)));
        }
        float f12 = this.valueFrom;
        if (((int) f12) != f12) {
            Log.w(TAG, String.format(WARNING_FLOATING_POINT_ERROR, "valueFrom", Float.valueOf(f12)));
        }
        float f13 = this.valueTo;
        if (((int) f13) != f13) {
            Log.w(TAG, String.format(WARNING_FLOATING_POINT_ERROR, "valueTo", Float.valueOf(f13)));
        }
    }

    public void addOnChangeListener(@NonNull L l11) {
        this.changeListeners.add(l11);
    }

    public void addOnSliderTouchListener(@NonNull T t11) {
        this.touchListeners.add(t11);
    }

    public void clearOnChangeListeners() {
        this.changeListeners.clear();
    }

    public void clearOnSliderTouchListeners() {
        this.touchListeners.clear();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return this.accessibilityHelper.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @VisibleForTesting
    public void forceDrawCompatHalo(boolean z11) {
        this.forceDrawCompatHalo = z11;
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.accessibilityHelper.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.activeThumbIdx;
    }

    public int getFocusedThumbIndex() {
        return this.focusedThumbIdx;
    }

    @Px
    public int getHaloRadius() {
        return this.haloRadius;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.haloColor;
    }

    public int getLabelBehavior() {
        return this.labelBehavior;
    }

    public float getStepSize() {
        return this.stepSize;
    }

    public float getThumbElevation() {
        return this.defaultThumbDrawable.getElevation();
    }

    @Px
    public int getThumbHeight() {
        return this.thumbHeight;
    }

    @Px
    public int getThumbRadius() {
        return this.thumbWidth / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.defaultThumbDrawable.getStrokeColor();
    }

    public float getThumbStrokeWidth() {
        return this.defaultThumbDrawable.getStrokeWidth();
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.defaultThumbDrawable.getFillColor();
    }

    public int getThumbTrackGapSize() {
        return this.thumbTrackGapSize;
    }

    @Px
    public int getThumbWidth() {
        return this.thumbWidth;
    }

    @Px
    public int getTickActiveRadius() {
        return this.tickActiveRadius;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.tickColorActive;
    }

    @Px
    public int getTickInactiveRadius() {
        return this.tickInactiveRadius;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.tickColorInactive;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.tickColorInactive.equals(this.tickColorActive)) {
            return this.tickColorActive;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public int getTickVisibilityMode() {
        return this.tickVisibilityMode;
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.trackColorActive;
    }

    @Px
    public int getTrackCornerSize() {
        int i11 = this.trackCornerSize;
        return i11 == -1 ? this.trackThickness / 2 : i11;
    }

    @Px
    public int getTrackHeight() {
        return this.trackThickness;
    }

    @Nullable
    public ColorStateList getTrackIconActiveColor() {
        return this.trackIconActiveColor;
    }

    @Nullable
    public Drawable getTrackIconActiveEnd() {
        return this.trackIconActiveEnd;
    }

    @Nullable
    public Drawable getTrackIconActiveStart() {
        return this.trackIconActiveStart;
    }

    @Nullable
    public ColorStateList getTrackIconInactiveColor() {
        return this.trackIconInactiveColor;
    }

    @Nullable
    public Drawable getTrackIconInactiveEnd() {
        return this.trackIconInactiveEnd;
    }

    @Nullable
    public Drawable getTrackIconInactiveStart() {
        return this.trackIconInactiveStart;
    }

    public int getTrackIconSize() {
        return this.trackIconSize;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.trackColorInactive;
    }

    public int getTrackInsideCornerSize() {
        return this.trackInsideCornerSize;
    }

    @Px
    public int getTrackSidePadding() {
        return this.trackSidePadding;
    }

    public int getTrackStopIndicatorSize() {
        return this.trackStopIndicatorSize;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.trackColorInactive.equals(this.trackColorActive)) {
            return this.trackColorActive;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @Px
    public int getTrackWidth() {
        return this.trackWidth;
    }

    public float getValueFrom() {
        return this.valueFrom;
    }

    public float getValueTo() {
        return this.valueTo;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.values);
    }

    public boolean hasLabelFormatter() {
        return this.formatter != null;
    }

    public boolean isCentered() {
        return this.centered;
    }

    public boolean isTickVisible() {
        int i11 = this.tickVisibilityMode;
        if (i11 == 0) {
            return true;
        }
        if (i11 == 1) {
            return getDesiredTickCount() <= getMaxTickCount();
        }
        if (i11 == 2) {
            return false;
        }
        throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.tickVisibilityMode);
    }

    public boolean isVertical() {
        return this.widgetOrientation == 1;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender != null) {
            removeCallbacks(accessibilityEventSender);
        }
        this.labelsAreAnimatedIn = false;
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            detachLabelFromContentView(it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.onScrollChangedListener);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.dirtyConfig) {
            validateConfigurationIfDirty();
            updateTicksCoordinates();
        }
        super.onDraw(canvas);
        int iCalculateTrackCenter = calculateTrackCenter();
        drawInactiveTracks(canvas, this.trackWidth, iCalculateTrackCenter);
        drawActiveTracks(canvas, this.trackWidth, iCalculateTrackCenter);
        if (isRtl() || isVertical()) {
            drawTrackIcons(canvas, this.activeTrackRect, this.inactiveTrackLeftRect);
        } else {
            drawTrackIcons(canvas, this.activeTrackRect, this.inactiveTrackRightRect);
        }
        maybeDrawTicks(canvas);
        maybeDrawStopIndicator(canvas, iCalculateTrackCenter);
        if ((this.thumbIsPressed || isFocused()) && isEnabled()) {
            maybeDrawCompatHalo(canvas, this.trackWidth, iCalculateTrackCenter);
        }
        updateLabels();
        drawThumbs(canvas, this.trackWidth, iCalculateTrackCenter);
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.widgetThickness + ((this.labelBehavior == 1 || shouldAlwaysShowLabel()) ? this.labels.get(0).getIntrinsicHeight() : 0), 1073741824);
        if (isVertical()) {
            super.onMeasure(iMakeMeasureSpec, i12);
        } else {
            super.onMeasure(i11, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.valueFrom = sliderState.valueFrom;
        this.valueTo = sliderState.valueTo;
        setValuesInternal(sliderState.values);
        this.stepSize = sliderState.stepSize;
        if (sliderState.hasFocus) {
            requestFocus();
        }
    }

    public boolean pickActiveThumb() {
        if (this.activeThumbIdx != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fValueToX = valueToX(valueOfTouchPositionAbsolute);
        this.activeThumbIdx = 0;
        float fAbs = Math.abs(this.values.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i11 = 1; i11 < this.values.size(); i11++) {
            float fAbs2 = Math.abs(this.values.get(i11).floatValue() - valueOfTouchPositionAbsolute);
            float fValueToX2 = valueToX(this.values.get(i11).floatValue());
            if (Float.compare(fAbs2, fAbs) > 0) {
                break;
            }
            boolean z11 = isRtl() || isVertical() ? fValueToX2 - fValueToX > 0.0f : fValueToX2 - fValueToX < 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.activeThumbIdx = i11;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fValueToX2 - fValueToX) < this.scaledTouchSlop) {
                        this.activeThumbIdx = -1;
                        return false;
                    }
                    if (z11) {
                        this.activeThumbIdx = i11;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.activeThumbIdx != -1;
    }

    public void removeOnChangeListener(@NonNull L l11) {
        this.changeListeners.remove(l11);
    }

    public void removeOnSliderTouchListener(@NonNull T t11) {
        this.touchListeners.remove(t11);
    }

    public void scheduleTooltipTimeout() {
        removeCallbacks(this.resetActiveThumbIndex);
        postDelayed(this.resetActiveThumbIndex, this.tooltipTimeoutMillis);
    }

    public void setActiveThumbIndex(int i11) {
        this.activeThumbIdx = i11;
    }

    public void setCentered(boolean z11) {
        if (this.centered == z11) {
            return;
        }
        this.centered = z11;
        if (z11) {
            setValues(Float.valueOf((this.valueFrom + this.valueTo) / 2.0f));
        } else {
            setValues(Float.valueOf(this.valueFrom));
        }
        updateWidgetLayout(true);
    }

    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        this.customThumbDrawable = initializeCustomThumbDrawable(drawable);
        this.customThumbDrawablesForValues.clear();
        postInvalidate();
    }

    public void setFocusedThumbIndex(int i11) {
        if (i11 < 0 || i11 >= this.values.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.focusedThumbIdx = i11;
        this.accessibilityHelper.requestKeyboardFocusForVirtualView(i11);
        postInvalidate();
    }

    public void setHaloRadius(@IntRange(from = 0) @Px int i11) {
        if (i11 == this.haloRadius) {
            return;
        }
        this.haloRadius = i11;
        Drawable background = getBackground();
        if (shouldDrawCompatHalo() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            DrawableUtils.setRippleDrawableRadius((RippleDrawable) background, this.haloRadius);
        }
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.haloColor)) {
            return;
        }
        this.haloColor = colorStateList;
        Drawable background = getBackground();
        if (!shouldDrawCompatHalo() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.haloPaint.setColor(getColorForState(colorStateList));
        this.haloPaint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i11) {
        if (this.labelBehavior != i11) {
            this.labelBehavior = i11;
            updateWidgetLayout(true);
        }
    }

    public void setLabelFormatter(@Nullable LabelFormatter labelFormatter) {
        this.formatter = labelFormatter;
    }

    public void setOrientation(int i11) {
        if (this.widgetOrientation == i11) {
            return;
        }
        this.widgetOrientation = i11;
        updateWidgetLayout(true);
    }

    public void setSeparationUnit(int i11) {
        this.separationUnit = i11;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setThumbElevation(float f11) {
        this.defaultThumbDrawable.setElevation(f11);
    }

    public void setThumbHeight(@IntRange(from = 0) @Px int i11) {
        if (i11 == this.thumbHeight) {
            return;
        }
        this.thumbHeight = i11;
        this.defaultThumbDrawable.setBounds(0, 0, this.thumbWidth, i11);
        Drawable drawable = this.customThumbDrawable;
        if (drawable != null) {
            adjustCustomThumbDrawableBounds(drawable);
        }
        Iterator<Drawable> it = this.customThumbDrawablesForValues.iterator();
        while (it.hasNext()) {
            adjustCustomThumbDrawableBounds(it.next());
        }
        updateWidgetLayout(false);
    }

    public void setThumbRadius(@IntRange(from = 0) @Px int i11) {
        int i12 = i11 * 2;
        setThumbWidth(i12);
        setThumbHeight(i12);
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        this.defaultThumbDrawable.setStrokeColor(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@ColorRes int i11) {
        if (i11 != 0) {
            setThumbStrokeColor(AppCompatResources.getColorStateList(getContext(), i11));
        }
    }

    public void setThumbStrokeWidth(float f11) {
        this.defaultThumbDrawable.setStrokeWidth(f11);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@DimenRes int i11) {
        if (i11 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i11));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.defaultThumbDrawable.getFillColor())) {
            return;
        }
        this.defaultThumbDrawable.setFillColor(colorStateList);
        invalidate();
    }

    public void setThumbTrackGapSize(@Px int i11) {
        if (this.thumbTrackGapSize == i11) {
            return;
        }
        this.thumbTrackGapSize = i11;
        invalidate();
    }

    public void setThumbWidth(@IntRange(from = 0) @Px int i11) {
        if (i11 == this.thumbWidth) {
            return;
        }
        this.thumbWidth = i11;
        this.defaultThumbDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCorners(0, this.thumbWidth / 2.0f).build());
        this.defaultThumbDrawable.setBounds(0, 0, this.thumbWidth, this.thumbHeight);
        Drawable drawable = this.customThumbDrawable;
        if (drawable != null) {
            adjustCustomThumbDrawableBounds(drawable);
        }
        Iterator<Drawable> it = this.customThumbDrawablesForValues.iterator();
        while (it.hasNext()) {
            adjustCustomThumbDrawableBounds(it.next());
        }
        updateWidgetLayout(false);
    }

    public void setTickActiveRadius(@IntRange(from = 0) @Px int i11) {
        if (this.tickActiveRadius != i11) {
            this.tickActiveRadius = i11;
            this.activeTicksPaint.setStrokeWidth(i11 * 2);
            updateWidgetLayout(false);
        }
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.tickColorActive)) {
            return;
        }
        this.tickColorActive = colorStateList;
        this.activeTicksPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(@IntRange(from = 0) @Px int i11) {
        if (this.tickInactiveRadius != i11) {
            this.tickInactiveRadius = i11;
            this.inactiveTicksPaint.setStrokeWidth(i11 * 2);
            updateWidgetLayout(false);
        }
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.tickColorInactive)) {
            return;
        }
        this.tickColorInactive = colorStateList;
        this.inactiveTicksPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTickVisibilityMode(int i11) {
        if (this.tickVisibilityMode != i11) {
            this.tickVisibilityMode = i11;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.trackColorActive)) {
            return;
        }
        this.trackColorActive = colorStateList;
        this.activeTrackPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTrackCornerSize(@Px int i11) {
        if (this.trackCornerSize == i11) {
            return;
        }
        this.trackCornerSize = i11;
        invalidate();
    }

    public void setTrackHeight(@IntRange(from = 0) @Px int i11) {
        if (this.trackThickness != i11) {
            this.trackThickness = i11;
            invalidateTrack();
            updateWidgetLayout(false);
        }
    }

    public void setTrackIconActiveColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == this.trackIconActiveColor) {
            return;
        }
        this.trackIconActiveColor = colorStateList;
        updateTrackIconActiveStart();
        updateTrackIconActiveEnd();
        invalidate();
    }

    public void setTrackIconInactiveColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == this.trackIconInactiveColor) {
            return;
        }
        this.trackIconInactiveColor = colorStateList;
        updateTrackIconInactiveStart();
        updateTrackIconInactiveEnd();
        invalidate();
    }

    public void setTrackIconSize(@Px int i11) {
        if (this.trackIconSize == i11) {
            return;
        }
        this.trackIconSize = i11;
        invalidate();
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.trackColorInactive)) {
            return;
        }
        this.trackColorInactive = colorStateList;
        this.inactiveTrackPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(@Px int i11) {
        if (this.trackInsideCornerSize == i11) {
            return;
        }
        this.trackInsideCornerSize = i11;
        invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int i11) {
        if (this.trackStopIndicatorSize == i11) {
            return;
        }
        this.trackStopIndicatorSize = i11;
        this.stopIndicatorPaint.setStrokeWidth(i11);
        invalidate();
    }

    public void setValueFrom(float f11) {
        this.valueFrom = f11;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setValueTo(float f11) {
        this.valueTo = f11;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void updateBoundsForVirtualViewId(int i11, Rect rect) {
        int iNormalizeValue = this.trackSidePadding + ((int) (normalizeValue(getValues().get(i11).floatValue()) * this.trackWidth));
        int iCalculateTrackCenter = calculateTrackCenter();
        int iMax = Math.max(this.thumbWidth / 2, this.minTouchTargetSize / 2);
        int iMax2 = Math.max(this.thumbHeight / 2, this.minTouchTargetSize / 2);
        RectF rectF = new RectF(iNormalizeValue - iMax, iCalculateTrackCenter - iMax2, iNormalizeValue + iMax, iCalculateTrackCenter + iMax2);
        if (isVertical()) {
            this.rotationMatrix.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, DEF_STYLE_RES), attributeSet, i11);
        this.labels = new ArrayList();
        this.changeListeners = new ArrayList();
        this.touchListeners = new ArrayList();
        this.labelsAreAnimatedIn = false;
        this.defaultThumbWidth = -1;
        this.defaultThumbTrackGapSize = -1;
        this.centered = false;
        this.trackIconActiveStartMutated = false;
        this.trackIconActiveEndMutated = false;
        this.trackIconInactiveStartMutated = false;
        this.trackIconInactiveEndMutated = false;
        this.thumbIsPressed = false;
        this.values = new ArrayList<>();
        this.activeThumbIdx = -1;
        this.focusedThumbIdx = -1;
        this.stepSize = 0.0f;
        this.isLongPress = false;
        this.trackPath = new Path();
        this.activeTrackRect = new RectF();
        this.inactiveTrackLeftRect = new RectF();
        this.inactiveTrackRightRect = new RectF();
        this.cornerRect = new RectF();
        this.labelRect = new Rect();
        this.iconRectF = new RectF();
        this.iconRect = new Rect();
        this.rotationMatrix = new Matrix();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.defaultThumbDrawable = materialShapeDrawable;
        this.customThumbDrawablesForValues = Collections.EMPTY_LIST;
        this.separationUnit = 0;
        this.onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.b
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f11915b.updateLabels();
            }
        };
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.slider.c
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f11916b.updateLabels();
            }
        };
        this.resetActiveThumbIndex = new Runnable() { // from class: com.google.android.material.slider.d
            @Override // java.lang.Runnable
            public final void run() {
                BaseSlider.m13176a(this.f11917b);
            }
        };
        Context context2 = getContext();
        this.thisAndAncestorsVisible = isShown();
        this.inactiveTrackPaint = new Paint();
        this.activeTrackPaint = new Paint();
        Paint paint = new Paint(1);
        this.thumbPaint = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.haloPaint = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.inactiveTicksPaint = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.activeTicksPaint = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.stopIndicatorPaint = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        loadResources(context2.getResources());
        processAttributes(context2, attributeSet, i11);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        this.scaledTouchSlop = ViewConfiguration.get(context2).getScaledTouchSlop();
        AccessibilityHelper accessibilityHelper = new AccessibilityHelper(this);
        this.accessibilityHelper = accessibilityHelper;
        ViewCompat.setAccessibilityDelegate(this, accessibilityHelper);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.accessibilityManager = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.tooltipTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
        } else {
            this.tooltipTimeoutMillis = MAX_TIMEOUT_TOOLTIP_WITH_ACCESSIBILITY;
        }
    }

    private void adjustCustomThumbDrawableBounds(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.thumbWidth, this.thumbHeight);
        } else {
            float fMax = Math.max(this.thumbWidth, this.thumbHeight) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    private void attachLabelToContentView(TooltipDrawable tooltipDrawable) {
        tooltipDrawable.setRelativeToView(ViewUtils.getContentView(this));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m13177b(BaseSlider baseSlider, ValueAnimator valueAnimator) {
        baseSlider.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator<TooltipDrawable> it = baseSlider.labels.iterator();
        while (it.hasNext()) {
            it.next().setRevealFraction(fFloatValue);
        }
        baseSlider.postInvalidateOnAnimation();
    }

    private void calculateLabelBounds(TooltipDrawable tooltipDrawable, float f11) {
        int iNormalizeValue;
        int intrinsicWidth;
        int iCalculateTrackCenter;
        int intrinsicHeight;
        int i11;
        if (isVertical()) {
            iNormalizeValue = (this.trackSidePadding + ((int) (normalizeValue(f11) * this.trackWidth))) - (tooltipDrawable.getIntrinsicHeight() / 2);
            intrinsicWidth = tooltipDrawable.getIntrinsicHeight() + iNormalizeValue;
            if (isRtl()) {
                iCalculateTrackCenter = calculateTrackCenter() - (this.labelPadding + (this.thumbHeight / 2));
                intrinsicHeight = tooltipDrawable.getIntrinsicWidth();
            } else {
                int iCalculateTrackCenter2 = calculateTrackCenter() + this.labelPadding + (this.thumbHeight / 2);
                iCalculateTrackCenter = tooltipDrawable.getIntrinsicWidth() + iCalculateTrackCenter2;
                i11 = iCalculateTrackCenter2;
            }
            this.labelRect.set(iNormalizeValue, i11, intrinsicWidth, iCalculateTrackCenter);
        }
        iNormalizeValue = (this.trackSidePadding + ((int) (normalizeValue(f11) * this.trackWidth))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        intrinsicWidth = tooltipDrawable.getIntrinsicWidth() + iNormalizeValue;
        iCalculateTrackCenter = calculateTrackCenter() - (this.labelPadding + (this.thumbHeight / 2));
        intrinsicHeight = tooltipDrawable.getIntrinsicHeight();
        i11 = iCalculateTrackCenter - intrinsicHeight;
        this.labelRect.set(iNormalizeValue, i11, intrinsicWidth, iCalculateTrackCenter);
    }

    private void detachLabelFromContentView(TooltipDrawable tooltipDrawable) {
        ViewGroup contentView = ViewUtils.getContentView(this);
        if (contentView == null) {
            return;
        }
        contentView.getOverlay().remove(tooltipDrawable);
        tooltipDrawable.detachView(contentView);
    }

    private void drawInactiveTracks(@NonNull Canvas canvas, int i11, int i12) {
        float[] activeRange = getActiveRange();
        float f11 = i12;
        int i13 = this.trackThickness;
        float f12 = f11 - (i13 / 2.0f);
        float f13 = f11 + (i13 / 2.0f);
        float f14 = i11;
        drawInactiveTrackSection(this.trackSidePadding - getTrackCornerSize(), (this.trackSidePadding + (activeRange[0] * f14)) - this.thumbTrackGapSize, f12, f13, canvas, this.inactiveTrackLeftRect, FullCornerDirection.LEFT);
        int i14 = this.trackSidePadding;
        drawInactiveTrackSection(i14 + (activeRange[1] * f14) + this.thumbTrackGapSize, i14 + i11 + getTrackCornerSize(), f12, f13, canvas, this.inactiveTrackRightRect, FullCornerDirection.RIGHT);
    }

    private void drawThumbDrawable(@NonNull Canvas canvas, int i11, int i12, float f11, @NonNull Drawable drawable) {
        canvas.save();
        if (isVertical()) {
            canvas.concat(this.rotationMatrix);
        }
        canvas.translate((this.trackSidePadding + ((int) (normalizeValue(f11) * i11))) - (drawable.getBounds().width() / 2.0f), i12 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    private void drawTrackIcon(@NonNull Canvas canvas, @NonNull RectF rectF, @NonNull Drawable drawable) {
        if (isVertical()) {
            this.rotationMatrix.mapRect(rectF);
        }
        rectF.round(this.iconRect);
        drawable.setBounds(this.iconRect);
        drawable.draw(canvas);
    }

    private void drawTrackIcons(@NonNull Canvas canvas, @NonNull RectF rectF, @NonNull RectF rectF2) {
        if (!hasTrackIcons()) {
            return;
        }
        if (this.values.size() > 1) {
            Log.w(TAG, "Track icons can only be used when only 1 thumb is present.");
        }
        calculateBoundsAndDrawTrackIcon(canvas, rectF, this.trackIconActiveStart, true);
        calculateBoundsAndDrawTrackIcon(canvas, rectF2, this.trackIconInactiveStart, true);
        calculateBoundsAndDrawTrackIcon(canvas, rectF, this.trackIconActiveEnd, false);
        calculateBoundsAndDrawTrackIcon(canvas, rectF2, this.trackIconInactiveEnd, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatValue(float f11) {
        String str;
        if (hasLabelFormatter()) {
            return this.formatter.getFormattedValue(f11);
        }
        if (((int) f11) == f11) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        return String.format(str, Float.valueOf(f11));
    }

    private float getClampedValue(int i11, float f11) {
        float fFloatValue;
        float fFloatValue2;
        float minSeparation = getMinSeparation();
        if (this.separationUnit == 0) {
            minSeparation = dimenToValue(minSeparation);
        }
        if (isRtl() || isVertical()) {
            minSeparation = -minSeparation;
        }
        int i12 = i11 + 1;
        if (i12 >= this.values.size()) {
            fFloatValue = this.valueTo;
        } else {
            fFloatValue = this.values.get(i12).floatValue() - minSeparation;
        }
        int i13 = i11 - 1;
        if (i13 < 0) {
            fFloatValue2 = this.valueFrom;
        } else {
            fFloatValue2 = this.values.get(i13).floatValue() + minSeparation;
        }
        return MathUtils.clamp(f11, fFloatValue2, fFloatValue);
    }

    @ColorInt
    private int getColorForState(@NonNull ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public ViewOverlay getContentViewOverlay() {
        ViewGroup contentView = ViewUtils.getContentView(this);
        if (contentView == null) {
            return null;
        }
        return contentView.getOverlay();
    }

    private Drawable initializeCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        adjustCustomThumbDrawableBounds(drawableNewDrawable);
        return drawableNewDrawable;
    }

    private boolean isInHorizontalScrollingContainer() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private boolean isInVerticalScrollingContainer() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private boolean isPotentialHorizontalScroll(MotionEvent motionEvent) {
        if (!isMouseEvent(motionEvent) && isInHorizontalScrollingContainer()) {
            return true;
        }
        return false;
    }

    private boolean isPotentialVerticalScroll(MotionEvent motionEvent) {
        if (!isMouseEvent(motionEvent) && isInVerticalScrollingContainer()) {
            return true;
        }
        return false;
    }

    private boolean maybeIncreaseWidgetThickness() {
        int paddingTop;
        int paddingBottom;
        if (isVertical()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i11 = paddingTop + paddingBottom;
        int iMax = Math.max(this.minWidgetThickness, Math.max(this.trackThickness + i11, this.thumbHeight + i11));
        if (iMax == this.widgetThickness) {
            return false;
        }
        this.widgetThickness = iMax;
        return true;
    }

    private boolean moveFocusInAbsoluteDirection(int i11) {
        if (isRtl() || isVertical()) {
            if (i11 == Integer.MIN_VALUE) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = -i11;
            }
        }
        return moveFocus(i11);
    }

    private void positionLabel(TooltipDrawable tooltipDrawable, float f11) {
        calculateLabelBounds(tooltipDrawable, f11);
        if (isVertical()) {
            RectF rectF = new RectF(this.labelRect);
            this.rotationMatrix.mapRect(rectF);
            rectF.round(this.labelRect);
        }
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, this.labelRect);
        tooltipDrawable.setBounds(this.labelRect);
    }

    private void setValueForLabel(TooltipDrawable tooltipDrawable, float f11) {
        tooltipDrawable.setText(formatValue(f11));
        positionLabel(tooltipDrawable, f11);
        ViewOverlay contentViewOverlay = getContentViewOverlay();
        if (contentViewOverlay == null) {
            return;
        }
        contentViewOverlay.add(tooltipDrawable);
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.values.size() == arrayList.size() && this.values.equals(arrayList)) {
                return;
            }
            this.values = arrayList;
            this.dirtyConfig = true;
            this.focusedThumbIdx = 0;
            updateHaloHotspot();
            createLabelPool();
            dispatchOnChangedProgrammatically();
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    private boolean snapTouchPosition() {
        return snapActiveThumbToValue(getValueOfTouchPosition());
    }

    private void updateLabelPivots() {
        float f11;
        boolean zIsVertical = isVertical();
        boolean zIsRtl = isRtl();
        float f12 = 0.5f;
        if (zIsVertical && zIsRtl) {
            f11 = 0.5f;
            f12 = -0.2f;
        } else {
            f11 = 1.2f;
            if (zIsVertical) {
                f12 = 1.2f;
                f11 = 0.5f;
            }
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            it.next().setPivots(f12, f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLabels() {
        updateLabelPivots();
        int i11 = this.labelBehavior;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    if (isEnabled() && isSliderVisibleOnScreen()) {
                        ensureLabelsAdded();
                        return;
                    } else {
                        ensureLabelsRemoved();
                        return;
                    }
                }
                throw new IllegalArgumentException("Unexpected labelBehavior: " + this.labelBehavior);
            }
            ensureLabelsRemoved();
            return;
        }
        if (this.activeThumbIdx != -1 && isEnabled()) {
            ensureLabelsAdded();
        } else {
            ensureLabelsRemoved();
        }
    }

    private void updateRotationMatrix() {
        float fCalculateTrackCenter = calculateTrackCenter();
        this.rotationMatrix.reset();
        this.rotationMatrix.setRotate(90.0f, fCalculateTrackCenter, fCalculateTrackCenter);
    }

    private void updateThumbWidthWhenPressed() {
        if (hasGapBetweenThumbAndTrack()) {
            int i11 = this.thumbWidth;
            this.defaultThumbWidth = i11;
            this.defaultThumbTrackGapSize = this.thumbTrackGapSize;
            int iRound = Math.round(i11 * 0.5f);
            int i12 = this.thumbWidth - iRound;
            setThumbWidth(iRound);
            setThumbTrackGapSize(this.thumbTrackGapSize - (i12 / 2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    private void updateTrack(Canvas canvas, Paint paint, RectF rectF, float f11, FullCornerDirection fullCornerDirection) {
        int i11;
        RectF rectF2;
        float fMax;
        int iOrdinal;
        if (rectF.isEmpty()) {
            return;
        }
        float fCalculateStartTrackCornerSize = calculateStartTrackCornerSize(f11);
        float fCalculateEndTrackCornerSize = calculateEndTrackCornerSize(f11);
        int iOrdinal2 = fullCornerDirection.ordinal();
        if (iOrdinal2 != 1) {
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    i11 = this.trackInsideCornerSize;
                    fCalculateStartTrackCornerSize = i11;
                }
            } else {
                fCalculateStartTrackCornerSize = this.trackInsideCornerSize;
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeCap(Paint.Cap.BUTT);
            if (hasGapBetweenThumbAndTrack()) {
                paint.setAntiAlias(true);
            }
            rectF2 = new RectF(rectF);
            if (isVertical()) {
                this.rotationMatrix.mapRect(rectF2);
            }
            this.trackPath.reset();
            if (rectF.width() >= fCalculateStartTrackCornerSize + fCalculateEndTrackCornerSize) {
                this.trackPath.addRoundRect(rectF2, getCornerRadii(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize), Path.Direction.CW);
                canvas.drawPath(this.trackPath, paint);
                return;
            }
            float fMin = Math.min(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize);
            fMax = Math.max(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize);
            canvas.save();
            this.trackPath.addRoundRect(rectF2, fMin, fMin, Path.Direction.CW);
            canvas.clipPath(this.trackPath);
            iOrdinal = fullCornerDirection.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    this.cornerRect.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
                } else {
                    RectF rectF3 = this.cornerRect;
                    float f12 = rectF.right;
                    rectF3.set(f12 - (2.0f * fMax), rectF.top, f12, rectF.bottom);
                }
            } else {
                RectF rectF4 = this.cornerRect;
                float f13 = rectF.left;
                rectF4.set(f13, rectF.top, (2.0f * fMax) + f13, rectF.bottom);
            }
            if (isVertical()) {
                this.rotationMatrix.mapRect(this.cornerRect);
            }
            canvas.drawRoundRect(this.cornerRect, fMax, fMax, paint);
            canvas.restore();
        }
        i11 = this.trackInsideCornerSize;
        fCalculateEndTrackCornerSize = i11;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        if (hasGapBetweenThumbAndTrack()) {
            paint.setAntiAlias(true);
        }
        rectF2 = new RectF(rectF);
        if (isVertical()) {
            this.rotationMatrix.mapRect(rectF2);
        }
        this.trackPath.reset();
        if (rectF.width() >= fCalculateStartTrackCornerSize + fCalculateEndTrackCornerSize) {
            this.trackPath.addRoundRect(rectF2, getCornerRadii(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize), Path.Direction.CW);
            canvas.drawPath(this.trackPath, paint);
            return;
        }
        float fMin2 = Math.min(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize);
        fMax = Math.max(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize);
        canvas.save();
        this.trackPath.addRoundRect(rectF2, fMin2, fMin2, Path.Direction.CW);
        canvas.clipPath(this.trackPath);
        iOrdinal = fullCornerDirection.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                this.cornerRect.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
            } else {
                RectF rectF5 = this.cornerRect;
                float f14 = rectF.right;
                rectF5.set(f14 - (2.0f * fMax), rectF.top, f14, rectF.bottom);
            }
        } else {
            RectF rectF6 = this.cornerRect;
            float f15 = rectF.left;
            rectF6.set(f15, rectF.top, (2.0f * fMax) + f15, rectF.bottom);
        }
        if (isVertical()) {
            this.rotationMatrix.mapRect(this.cornerRect);
        }
        canvas.drawRoundRect(this.cornerRect, fMax, fMax, paint);
        canvas.restore();
    }

    private void updateWidgetLayout(boolean z11) {
        boolean zMaybeIncreaseWidgetThickness = maybeIncreaseWidgetThickness();
        boolean zMaybeIncreaseTrackSidePadding = maybeIncreaseTrackSidePadding();
        if (isVertical()) {
            updateRotationMatrix();
        }
        if (!zMaybeIncreaseWidgetThickness && !z11) {
            if (zMaybeIncreaseTrackSidePadding) {
                postInvalidate();
                return;
            }
            return;
        }
        requestLayout();
    }

    private void validateMinSeparation() {
        float minSeparation = getMinSeparation();
        if (minSeparation >= 0.0f) {
            float f11 = this.stepSize;
            if (f11 > 0.0f && minSeparation > 0.0f) {
                if (this.separationUnit == 1) {
                    if (minSeparation < f11 || !isMultipleOfStepSize(minSeparation)) {
                        throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE, Float.valueOf(minSeparation), Float.valueOf(this.stepSize), Float.valueOf(this.stepSize)));
                    }
                    return;
                }
                throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT, Float.valueOf(minSeparation), Float.valueOf(this.stepSize)));
            }
            return;
        }
        throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_MIN_SEPARATION, Float.valueOf(minSeparation)));
    }

    private float valueToX(float f11) {
        return (normalizeValue(f11) * this.trackWidth) + this.trackSidePadding;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.inactiveTrackPaint.setColor(getColorForState(this.trackColorInactive));
        this.activeTrackPaint.setColor(getColorForState(this.trackColorActive));
        this.inactiveTicksPaint.setColor(getColorForState(this.tickColorInactive));
        this.activeTicksPaint.setColor(getColorForState(this.tickColorActive));
        this.stopIndicatorPaint.setColor(getColorForState(this.tickColorInactive));
        for (TooltipDrawable tooltipDrawable : this.labels) {
            if (tooltipDrawable.isStateful()) {
                tooltipDrawable.setState(getDrawableState());
            }
        }
        if (this.defaultThumbDrawable.isStateful()) {
            this.defaultThumbDrawable.setState(getDrawableState());
        }
        this.haloPaint.setColor(getColorForState(this.haloColor));
        this.haloPaint.setAlpha(63);
    }

    public final boolean isRtl() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.thisAndAncestorsVisible = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.onScrollChangedListener);
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            attachLabelToContentView(it.next());
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z11, int i11, @Nullable Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (!z11) {
            this.activeThumbIdx = -1;
            this.accessibilityHelper.clearKeyboardFocusForVirtualView(this.focusedThumbIdx);
        } else {
            focusThumbOnFocusGained(i11);
            this.accessibilityHelper.requestKeyboardFocusForVirtualView(this.focusedThumbIdx);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i11, keyEvent);
        }
        if (this.values.size() == 1) {
            this.activeThumbIdx = 0;
        }
        if (this.activeThumbIdx == -1) {
            Boolean boolOnKeyDownNoActiveThumb = onKeyDownNoActiveThumb(i11, keyEvent);
            if (boolOnKeyDownNoActiveThumb != null) {
                return boolOnKeyDownNoActiveThumb.booleanValue();
            }
            return super.onKeyDown(i11, keyEvent);
        }
        this.isLongPress |= keyEvent.isLongPress();
        Float fCalculateIncrementForKey = calculateIncrementForKey(i11);
        if (fCalculateIncrementForKey != null) {
            if (snapActiveThumbToValue(this.values.get(this.activeThumbIdx).floatValue() + fCalculateIncrementForKey.floatValue())) {
                updateHaloHotspot();
                postInvalidate();
            }
            return true;
        }
        if (i11 != 23) {
            if (i11 != 61) {
                if (i11 != 66) {
                    return super.onKeyDown(i11, keyEvent);
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return moveFocus(1);
                }
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return moveFocus(-1);
            }
        }
        this.activeThumbIdx = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.valueFrom = this.valueFrom;
        sliderState.valueTo = this.valueTo;
        sliderState.values = new ArrayList<>(this.values);
        sliderState.stepSize = this.stepSize;
        sliderState.hasFocus = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        if (isVertical()) {
            i11 = i12;
        }
        updateTrackWidth(i11);
        updateHaloHotspot();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        float x11;
        float y11;
        MotionEvent motionEvent2;
        int i11;
        if (!isEnabled()) {
            return false;
        }
        if (isVertical()) {
            x11 = motionEvent.getY();
        } else {
            x11 = motionEvent.getX();
        }
        if (isVertical()) {
            y11 = motionEvent.getX();
        } else {
            y11 = motionEvent.getY();
        }
        float f11 = (x11 - this.trackSidePadding) / this.trackWidth;
        this.touchPosition = f11;
        float fMax = Math.max(0.0f, f11);
        this.touchPosition = fMax;
        this.touchPosition = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.thumbIsPressed = false;
                        motionEvent2 = this.lastEvent;
                        if (motionEvent2 != null) {
                            onStartTrackingTouch();
                        }
                        if (this.activeThumbIdx != -1) {
                            snapTouchPosition();
                            updateHaloHotspot();
                            if (hasGapBetweenThumbAndTrack()) {
                                setThumbWidth(i11);
                                setThumbTrackGapSize(this.defaultThumbTrackGapSize);
                            }
                            this.activeThumbIdx = -1;
                            onStopTrackingTouch();
                        }
                        invalidate();
                    }
                } else if (!this.thumbIsPressed) {
                    if (!isVertical() && isPotentialVerticalScroll(motionEvent) && Math.abs(x11 - this.touchDownAxis1) < this.scaledTouchSlop) {
                        return false;
                    }
                    if (isVertical() && isPotentialHorizontalScroll(motionEvent) && Math.abs(y11 - this.touchDownAxis2) < this.scaledTouchSlop * 0.8f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (pickActiveThumb()) {
                        this.thumbIsPressed = true;
                        updateThumbWidthWhenPressed();
                        onStartTrackingTouch();
                        snapTouchPosition();
                        updateHaloHotspot();
                        invalidate();
                    }
                } else {
                    snapTouchPosition();
                    updateHaloHotspot();
                    invalidate();
                }
            } else {
                this.thumbIsPressed = false;
                motionEvent2 = this.lastEvent;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.lastEvent.getX() - motionEvent.getX()) <= this.scaledTouchSlop && Math.abs(this.lastEvent.getY() - motionEvent.getY()) <= this.scaledTouchSlop && pickActiveThumb()) {
                    onStartTrackingTouch();
                }
                if (this.activeThumbIdx != -1) {
                    snapTouchPosition();
                    updateHaloHotspot();
                    if (hasGapBetweenThumbAndTrack() && (i11 = this.defaultThumbWidth) != -1 && this.defaultThumbTrackGapSize != -1) {
                        setThumbWidth(i11);
                        setThumbTrackGapSize(this.defaultThumbTrackGapSize);
                    }
                    this.activeThumbIdx = -1;
                    onStopTrackingTouch();
                }
                invalidate();
            }
        } else {
            this.touchDownAxis1 = x11;
            this.touchDownAxis2 = y11;
            if ((isVertical() || !isPotentialVerticalScroll(motionEvent)) && (!isVertical() || !isPotentialHorizontalScroll(motionEvent))) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (pickActiveThumb()) {
                    requestFocus();
                    this.thumbIsPressed = true;
                    updateThumbWidthWhenPressed();
                    onStartTrackingTouch();
                    snapTouchPosition();
                    updateHaloHotspot();
                    invalidate();
                }
            }
        }
        setPressed(this.thumbIsPressed);
        this.lastEvent = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z11) {
        super.onVisibilityAggregated(z11);
        this.thisAndAncestorsVisible = z11;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i11) {
        ViewOverlay contentViewOverlay;
        super.onVisibilityChanged(view, i11);
        if (i11 != 0 && (contentViewOverlay = getContentViewOverlay()) != null) {
            Iterator<TooltipDrawable> it = this.labels.iterator();
            while (it.hasNext()) {
                contentViewOverlay.remove(it.next());
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        int i11;
        super.setEnabled(z11);
        if (z11) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        setLayerType(i11, null);
    }

    public void setHaloRadiusResource(@DimenRes int i11) {
        setHaloRadius(getResources().getDimensionPixelSize(i11));
    }

    public void setThumbElevationResource(@DimenRes int i11) {
        setThumbElevation(getResources().getDimension(i11));
    }

    public void setThumbHeightResource(@DimenRes int i11) {
        setThumbHeight(getResources().getDimensionPixelSize(i11));
    }

    public void setThumbRadiusResource(@DimenRes int i11) {
        setThumbRadius(getResources().getDimensionPixelSize(i11));
    }

    public void setThumbWidthResource(@DimenRes int i11) {
        setThumbWidth(getResources().getDimensionPixelSize(i11));
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    @Deprecated
    public void setTickVisible(boolean z11) {
        setTickVisibilityMode(convertToTickVisibilityMode(z11));
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValues(@NonNull List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.customThumbDrawable = null;
        this.customThumbDrawablesForValues = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.customThumbDrawablesForValues.add(initializeCustomThumbDrawable(drawable));
        }
        postInvalidate();
    }

    public void setTrackIconActiveEnd(@DrawableRes int i11) {
        setTrackIconActiveEnd(i11 != 0 ? AppCompatResources.getDrawable(getContext(), i11) : null);
    }

    public void setTrackIconActiveStart(@DrawableRes int i11) {
        setTrackIconActiveStart(i11 != 0 ? AppCompatResources.getDrawable(getContext(), i11) : null);
    }

    public void setTrackIconInactiveEnd(@DrawableRes int i11) {
        setTrackIconInactiveEnd(i11 != 0 ? AppCompatResources.getDrawable(getContext(), i11) : null);
    }

    public void setTrackIconInactiveStart(@DrawableRes int i11) {
        setTrackIconInactiveStart(i11 != 0 ? AppCompatResources.getDrawable(getContext(), i11) : null);
    }

    private void updateTicksCoordinates(int i11) {
        if (i11 == 0) {
            this.ticksCoordinates = null;
            return;
        }
        float[] fArr = this.ticksCoordinates;
        if (fArr == null || fArr.length != i11 * 2) {
            this.ticksCoordinates = new float[i11 * 2];
        }
        float f11 = this.trackWidth / (i11 - 1);
        float fCalculateTrackCenter = calculateTrackCenter();
        for (int i12 = 0; i12 < i11 * 2; i12 += 2) {
            float[] fArr2 = this.ticksCoordinates;
            fArr2[i12] = this.trackSidePadding + ((i12 / 2.0f) * f11);
            fArr2[i12 + 1] = fCalculateTrackCenter;
        }
        if (isVertical()) {
            this.rotationMatrix.mapPoints(this.ticksCoordinates);
        }
    }
}
