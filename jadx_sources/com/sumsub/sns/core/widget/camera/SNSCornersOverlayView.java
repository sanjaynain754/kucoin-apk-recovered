package com.sumsub.sns.core.widget.camera;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.widget.SNSDocBoundsCheckResultView;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001:\u0001CB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010)\u001a\u00020*H\u0014J\u000e\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u001bJ\u0010\u0010-\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010/J\u0010\u00100\u001a\u00020*2\u0006\u00101\u001a\u000202H\u0014J0\u00103\u001a\u00020*2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007H\u0014J\b\u0010:\u001a\u00020*H\u0014J\b\u0010;\u001a\u00020*H\u0002J\u0010\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020\u0007H\u0002J\b\u0010>\u001a\u00020*H\u0002J\b\u0010?\u001a\u00020\u0017H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0012\u001a\u0004\u0018\u00010#@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0018\u0010@\u001a\u00020\u0007*\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "cornersPaint", "Landroid/graphics/Paint;", "cornersPath", "Landroid/graphics/Path;", "cornerRadius", "", "cornerSize", "value", "cornersWidth", "getCornersWidth", "()F", "stateFrameColors", "Landroid/content/res/ColorStateList;", "colorAnimator", "Landroid/animation/ValueAnimator;", "boundPreview", "Landroidx/camera/view/PreviewView;", "docBoundsView", "Lcom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView;", "halfCornersWidth", "getHalfCornersWidth", "()I", "previewLayoutListener", "Landroid/view/View$OnLayoutChangeListener;", "Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;", "state", "getState", "()Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;", "setState", "(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;)V", "onAttachedToWindow", "", "bind", "previewView", "setDocRect", "rect", "Landroid/graphics/RectF;", "onDraw", "canvas", "Landroid/graphics/Canvas;", ViewProps.ON_LAYOUT, "changed", "", "left", ViewProps.TOP, "right", ViewProps.BOTTOM, "onDetachedFromWindow", "updateConstraintsToMatchPreview", "animateColorTo", "targetColor", "cancelColorAnimation", "loadStateFrameColors", "color", "getColor", "(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;)I", "State", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSCornersOverlayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSCornersOverlayView.kt\ncom/sumsub/sns/core/widget/camera/SNSCornersOverlayView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n233#2,3:281\n1#3:284\n*S KotlinDebug\n*F\n+ 1 SNSCornersOverlayView.kt\ncom/sumsub/sns/core/widget/camera/SNSCornersOverlayView\n*L\n82#1:281,3\n*E\n"})
public final class SNSCornersOverlayView extends FrameLayout {

    @Nullable
    private PreviewView boundPreview;

    @Nullable
    private ValueAnimator colorAnimator;
    private float cornerRadius;
    private float cornerSize;

    @NotNull
    private final Paint cornersPaint;

    @NotNull
    private final Path cornersPath;
    private float cornersWidth;

    @Nullable
    private SNSDocBoundsCheckResultView docBoundsView;

    @NotNull
    private final View.OnLayoutChangeListener previewLayoutListener;

    @Nullable
    private State state;

    @NotNull
    private ColorStateList stateFrameColors;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "RED", "YELLOW", "GREEN", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum State {
        DEFAULT,
        RED,
        YELLOW,
        GREEN;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }
    }

    @JvmOverloads
    public SNSCornersOverlayView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.YELLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.RED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmOverloads
    public SNSCornersOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateColorTo$lambda$10$lambda$9(SNSCornersOverlayView sNSCornersOverlayView, ValueAnimator valueAnimator) {
        sNSCornersOverlayView.cornersPaint.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        sNSCornersOverlayView.invalidate();
    }

    private final void cancelColorAnimation() {
        ValueAnimator valueAnimator = this.colorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.colorAnimator = null;
    }

    private final int getColor(State state) {
        int[] iArr;
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1) {
            iArr = new int[]{R$attr.sns_statePending};
        } else if (i11 == 2) {
            iArr = new int[]{R$attr.sns_stateApproved};
        } else if (i11 == 3) {
            iArr = new int[]{R$attr.sns_stateRejected};
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iArr = new int[]{R$attr.sns_stateInit};
        }
        return ColorUtils.setAlphaComponent(this.stateFrameColors.getColorForState(iArr, -65281), 255);
    }

    private final int getHalfCornersWidth() {
        return (int) (this.cornersWidth / 2);
    }

    private final ColorStateList loadStateFrameColors() {
        Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_WARNING);
        int iIntValue = numM69174a != null ? numM69174a.intValue() : this.stateFrameColors.getColorForState(new int[]{R$attr.sns_statePending}, -65281);
        Integer numM69174a2 = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_SUCCESS);
        int iIntValue2 = numM69174a2 != null ? numM69174a2.intValue() : this.stateFrameColors.getColorForState(new int[]{R$attr.sns_stateApproved}, -65281);
        Integer numM69174a3 = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_CRITICAL);
        return new ColorStateList(new int[][]{new int[]{R$attr.sns_statePending}, new int[]{R$attr.sns_stateApproved}, new int[]{R$attr.sns_stateRejected}, new int[]{R$attr.sns_stateInit}}, new int[]{iIntValue, iIntValue2, numM69174a3 != null ? numM69174a3.intValue() : this.stateFrameColors.getColorForState(new int[]{R$attr.sns_stateRejected}, -65281), -1});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewLayoutListener$lambda$0(SNSCornersOverlayView sNSCornersOverlayView, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (i11 == i15 && i12 == i16 && i13 == i17 && i14 == i18) {
            return;
        }
        sNSCornersOverlayView.updateConstraintsToMatchPreview();
    }

    private final void updateConstraintsToMatchPreview() {
        PreviewView previewView = this.boundPreview;
        if (previewView == null) {
            return;
        }
        int halfCornersWidth = getHalfCornersWidth();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        int left = previewView.getLeft() - halfCornersWidth;
        int top = previewView.getTop() - halfCornersWidth;
        int i11 = halfCornersWidth * 2;
        int width = previewView.getWidth() + i11;
        int height = previewView.getHeight() + i11;
        if (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin == left && ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin == top && ((ViewGroup.MarginLayoutParams) layoutParams2).width == width && ((ViewGroup.MarginLayoutParams) layoutParams2).height == height) {
            return;
        }
        layoutParams2.leftToLeft = 0;
        layoutParams2.topToTop = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = left;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = top;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = width;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = height;
        setLayoutParams(layoutParams2);
    }

    public final void bind(@NotNull PreviewView previewView) {
        PreviewView previewView2 = this.boundPreview;
        if (previewView2 != null) {
            previewView2.removeOnLayoutChangeListener(this.previewLayoutListener);
        }
        this.boundPreview = previewView;
        previewView.addOnLayoutChangeListener(this.previewLayoutListener);
        bringToFront();
        if (previewView.getWidth() > 0) {
            updateConstraintsToMatchPreview();
        }
    }

    public final float getCornersWidth() {
        return this.cornersWidth;
    }

    @Nullable
    public final State getState() {
        return this.state;
    }

    public final void setDocRect(@Nullable RectF rect) {
        if (this.docBoundsView == null && rect != null) {
            SNSDocBoundsCheckResultView sNSDocBoundsCheckResultView = new SNSDocBoundsCheckResultView(getContext(), null, 0, 6, null);
            addView(sNSDocBoundsCheckResultView, new FrameLayout.LayoutParams(-1, -1));
            this.docBoundsView = sNSDocBoundsCheckResultView;
        }
        SNSDocBoundsCheckResultView sNSDocBoundsCheckResultView2 = this.docBoundsView;
        if (sNSDocBoundsCheckResultView2 != null) {
            sNSDocBoundsCheckResultView2.setDocRectF(rect);
        }
    }

    public final void setState(@Nullable State state) {
        State state2 = this.state;
        this.state = state;
        if (state2 == null && state == null) {
            return;
        }
        if (state2 == null && state != null) {
            int color = getColor(state);
            this.cornersPaint.setColor(ColorUtils.setAlphaComponent(color, 0));
            animateColorTo(color);
        } else if (state == null) {
            animateColorTo(ColorUtils.setAlphaComponent(this.cornersPaint.getColor(), 0));
        } else {
            animateColorTo(getColor(state));
        }
    }

    @JvmOverloads
    public SNSCornersOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    private final void animateColorTo(int targetColor) {
        cancelColorAnimation();
        int color = this.cornersPaint.getColor();
        if (targetColor == color) {
            return;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluatorCompat(), Integer.valueOf(color), Integer.valueOf(targetColor));
        valueAnimatorOfObject.setDuration(getResources().getInteger(R.integer.config_shortAnimTime));
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sumsub.sns.core.widget.camera.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SNSCornersOverlayView.animateColorTo$lambda$10$lambda$9(this.f57570b, valueAnimator);
            }
        });
        valueAnimatorOfObject.start();
        this.colorAnimator = valueAnimatorOfObject;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof ConstraintLayout) {
        } else {
            throw new IllegalStateException("SNSCornersOverlayView must be a direct child of ConstraintLayout");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelColorAnimation();
        PreviewView previewView = this.boundPreview;
        if (previewView != null) {
            previewView.removeOnLayoutChangeListener(this.previewLayoutListener);
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.cornersPaint.getAlpha() != 0 && getWidth() != 0 && getHeight() != 0) {
            float f11 = this.cornersWidth / 2;
            float width = getWidth() - f11;
            float height = getHeight() - f11;
            Path path = this.cornersPath;
            path.reset();
            float f12 = this.cornerRadius;
            path.moveTo(f11, this.cornerSize + f11 + f12);
            path.rLineTo(0.0f, -this.cornerSize);
            float f13 = this.cornerRadius;
            float f14 = -f13;
            path.rQuadTo(0.0f, f14, f13, f14);
            path.rLineTo(this.cornerSize, 0.0f);
            path.moveTo((width - this.cornerSize) - f12, f11);
            path.rLineTo(this.cornerSize, 0.0f);
            float f15 = this.cornerRadius;
            path.rQuadTo(f15, 0.0f, f15, f15);
            path.rLineTo(0.0f, this.cornerSize);
            path.moveTo(width, (height - this.cornerSize) - f12);
            path.rLineTo(0.0f, this.cornerSize);
            float f16 = this.cornerRadius;
            path.rQuadTo(0.0f, f16, -f16, f16);
            path.rLineTo(-this.cornerSize, 0.0f);
            path.moveTo(f11 + this.cornerSize + f12, height);
            path.rLineTo(-this.cornerSize, 0.0f);
            float f17 = -this.cornerRadius;
            path.rQuadTo(f17, 0.0f, f17, f17);
            path.rLineTo(0.0f, -this.cornerSize);
            canvas.drawPath(this.cornersPath, this.cornersPaint);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        SNSDocBoundsCheckResultView sNSDocBoundsCheckResultView;
        super.onLayout(changed, left, top, right, bottom);
        PreviewView previewView = this.boundPreview;
        if (previewView == null || (sNSDocBoundsCheckResultView = this.docBoundsView) == null) {
            return;
        }
        int halfCornersWidth = getHalfCornersWidth();
        sNSDocBoundsCheckResultView.layout(halfCornersWidth, halfCornersWidth, previewView.getWidth() + halfCornersWidth, previewView.getHeight() + halfCornersWidth);
    }

    public /* synthetic */ SNSCornersOverlayView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.snsCornersOverlayViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSCornersOverlayView : i12);
    }

    @JvmOverloads
    public SNSCornersOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.cornersPath = new Path();
        this.stateFrameColors = ColorStateList.valueOf(-65281);
        this.previewLayoutListener = new View.OnLayoutChangeListener() { // from class: com.sumsub.sns.core.widget.camera.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
                SNSCornersOverlayView.previewLayoutListener$lambda$0(this.f57569b, view, i13, i14, i15, i16, i17, i18, i19, i21);
            }
        };
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSCornersOverlayView, i11, i12);
        int i13 = R$styleable.SNSCornersOverlayView_sns_cameraCornersColor;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.stateFrameColors = AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i13);
        }
        this.cornerRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSCornersOverlayView_sns_cameraCornersRadius, getResources().getDimensionPixelSize(R$dimen.sns_state_frame_radius));
        this.cornerSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSCornersOverlayView_sns_cameraCornersSize, getResources().getDimensionPixelSize(R$dimen.sns_frame_corners_size));
        this.cornersWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSCornersOverlayView_sns_cameraCornersWidth, getResources().getDimensionPixelSize(R$dimen.sns_frame_corners_width));
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        this.stateFrameColors = loadStateFrameColors();
        Float fM69170a = AbstractC28233a.m69170a(SNSMetricElement.DOCUMENT_FRAME_CORNER_RADIUS);
        if (fM69170a != null) {
            this.cornerRadius = fM69170a.floatValue();
        }
        Float fM69170a2 = AbstractC28233a.m69170a(SNSMetricElement.DOCUMENT_FRAME_CORNER_SIZE);
        if (fM69170a2 != null) {
            this.cornerSize = fM69170a2.floatValue();
        }
        Float fM69170a3 = AbstractC28233a.m69170a(SNSMetricElement.DOCUMENT_FRAME_BORDER_WIDTH);
        if (fM69170a3 != null) {
            this.cornersWidth = fM69170a3.floatValue();
        }
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(0);
        paint.setStrokeWidth(this.cornersWidth);
        this.cornersPaint = paint;
    }
}
