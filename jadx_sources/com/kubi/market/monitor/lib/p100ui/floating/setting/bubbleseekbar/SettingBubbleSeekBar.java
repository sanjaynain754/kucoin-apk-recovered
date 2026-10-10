package com.kubi.market.monitor.lib.p100ui.floating.setting.bubbleseekbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$styleable;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes27.dex */
@Keep
public class SettingBubbleSeekBar extends View {
    static final int NONE = -1;
    public int bubbleMarginBottom;

    /* JADX INFO: renamed from: dx */
    float f34313dx;
    private boolean hideNoTextSectionMark;
    private boolean isAlwaysShowBubble;
    private boolean isAutoAdjustSectionMark;
    private boolean isFloatType;
    private boolean isHideBubble;
    private boolean isRtl;
    private boolean isSeekBySection;
    private boolean isSeekStepSection;
    private boolean isShowProgressInFloat;
    private boolean isShowSectionMark;
    private boolean isShowSectionText;
    private boolean isShowThumbText;
    private boolean isThumbOnDragging;
    private boolean isTouchToSeek;
    private boolean isTouchToSeekAnimEnd;
    private long mAlwaysShowBubbleDelay;
    private long mAnimDuration;
    private float mBubbleCenterRawSolidX;
    private float mBubbleCenterRawSolidY;
    private float mBubbleCenterRawX;
    private int mBubbleColor;
    private int mBubbleRadius;
    private int mBubbleTextColor;
    private int mBubbleTextSize;
    private BubbleView mBubbleView;
    private Boolean mCanSeek;
    private C18672b mConfigBuilder;
    private InterfaceC18671a mCustomStartHandle;
    private float mDefaultProgress;
    private float mDelta;
    private int mFillColor;
    private int mFillSize;
    private InterfaceC18668j mFormatCallback;
    private WindowManager.LayoutParams mLayoutParams;
    private float mLeft;
    private float mMax;
    private float mMin;
    private Paint mPaint;
    private int[] mPoint;
    private float mPreSecValue;
    private float mPreThumbCenterX;
    private float mProgress;
    private InterfaceC18669k mProgressListener;
    private Rect mRectText;
    private float mRight;
    private int mSecondTrackColor;
    private int mSecondTrackSize;
    private int mSectionCount;
    private float mSectionOffset;
    private SparseArray<String> mSectionTextArray;
    private int mSectionTextColor;
    private int mSectionTextInterval;
    private int mSectionTextPosition;
    private int mSectionTextSize;
    private float mSectionValue;
    private int mTextSpace;
    private float mThumbCenterX;
    private int mThumbColor;
    private int mThumbRadius;
    private int mThumbRadiusOnDragging;
    private int mThumbTextColor;
    private int mThumbTextSize;
    private int mTrackColor;
    private float mTrackLength;
    private int mTrackRadius;
    private int mTrackSize;
    private WindowManager mWindowManager;
    private int roundMode;
    private boolean showCenterPoint;
    private boolean triggerBubbleShowing;
    private boolean triggerSeekBySection;

    public class BubbleView extends View {

        /* JADX INFO: renamed from: b */
        public Paint f34314b;

        /* JADX INFO: renamed from: c */
        public Path f34315c;

        /* JADX INFO: renamed from: d */
        public RectF f34316d;

        /* JADX INFO: renamed from: e */
        public Rect f34317e;

        /* JADX INFO: renamed from: f */
        public String f34318f;

        public BubbleView(SettingBubbleSeekBar settingBubbleSeekBar, Context context) {
            this(settingBubbleSeekBar, context, null);
        }

        public BubbleView(SettingBubbleSeekBar settingBubbleSeekBar, Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        /* JADX INFO: renamed from: a */
        public void m40904a(String str) {
            if (SettingBubbleSeekBar.this.mFormatCallback != null) {
                str = SettingBubbleSeekBar.this.mFormatCallback.mo40906a(str);
            }
            if (str == null || this.f34318f.equals(str)) {
                return;
            }
            this.f34318f = str;
            invalidate();
        }

        @Override // android.view.View
        public void onMeasure(int i11, int i12) {
            setMeasuredDimension(C18673c.m40909b(32), C18673c.m40909b(19));
        }

        public BubbleView(Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
            this.f34318f = "";
            Paint paint = new Paint();
            this.f34314b = paint;
            paint.setAntiAlias(true);
            this.f34314b.setTextAlign(Paint.Align.CENTER);
            this.f34315c = new Path();
            this.f34316d = new RectF();
            this.f34317e = new Rect();
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            this.f34315c.reset();
            this.f34315c.moveTo(getMeasuredWidth() / 2.0f, getMeasuredHeight());
            this.f34315c.lineTo((getMeasuredWidth() / 2.0f) - (C18673c.m40909b(4) / 2.0f), getMeasuredHeight() - C18673c.m40909b(3));
            this.f34315c.lineTo(C18673c.m40909b(2), getMeasuredHeight() - C18673c.m40909b(3));
            this.f34316d.set(0.0f, (getMeasuredHeight() - C18673c.m40909b(3)) - (C18673c.m40909b(2) * 2), C18673c.m40909b(2) * 2, getMeasuredHeight() - C18673c.m40909b(3));
            this.f34315c.arcTo(this.f34316d, 90.0f, 90.0f);
            this.f34315c.lineTo(0.0f, C18673c.m40909b(2));
            this.f34316d.set(0.0f, 0.0f, C18673c.m40909b(2) * 2, C18673c.m40909b(2) * 2);
            this.f34315c.arcTo(this.f34316d, 180.0f, 90.0f);
            this.f34315c.lineTo(getMeasuredWidth() - C18673c.m40909b(2), 0.0f);
            this.f34316d.set(getMeasuredWidth() - (C18673c.m40909b(2) * 2), 0.0f, getMeasuredWidth(), C18673c.m40909b(2) * 2);
            this.f34315c.arcTo(this.f34316d, 270.0f, 90.0f);
            this.f34315c.lineTo(getMeasuredWidth(), (getMeasuredHeight() - C18673c.m40909b(3)) - C18673c.m40909b(2));
            this.f34316d.set(getMeasuredWidth() - (C18673c.m40909b(2) * 2), (getMeasuredHeight() - C18673c.m40909b(3)) - (C18673c.m40909b(2) * 2), getMeasuredWidth(), getMeasuredHeight() - C18673c.m40909b(3));
            this.f34315c.arcTo(this.f34316d, 0.0f, 90.0f);
            this.f34315c.lineTo((getMeasuredWidth() / 2.0f) + (C18673c.m40909b(4) / 2.0f), getMeasuredHeight() - C18673c.m40909b(3));
            this.f34315c.lineTo(getMeasuredWidth() / 2.0f, getMeasuredHeight());
            this.f34314b.setColor(SettingBubbleSeekBar.this.mBubbleColor);
            this.f34314b.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.f34315c, this.f34314b);
            this.f34314b.setTextSize(SettingBubbleSeekBar.this.mBubbleTextSize);
            this.f34314b.setColor(SettingBubbleSeekBar.this.mBubbleTextColor);
            Paint paint = this.f34314b;
            String str = this.f34318f;
            paint.getTextBounds(str, 0, str.length(), this.f34317e);
            Paint.FontMetrics fontMetrics = this.f34314b.getFontMetrics();
            float measuredHeight = (getMeasuredHeight() - C18673c.m40909b(3)) / 2.0f;
            float f11 = fontMetrics.descent;
            canvas.drawText(this.f34318f, getMeasuredWidth() / 2.0f, (measuredHeight + ((f11 - fontMetrics.ascent) / 2.0f)) - f11, this.f34314b);
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar$a */
    public class RunnableC18659a implements Runnable {
        public RunnableC18659a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SettingBubbleSeekBar.this.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar$b */
    public class RunnableC18660b implements Runnable {
        public RunnableC18660b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SettingBubbleSeekBar.this.isTouchToSeekAnimEnd = false;
            SettingBubbleSeekBar.this.autoAdjustSection();
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar$c */
    public class C18661c extends AnimatorListenerAdapter {
        public C18661c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            SettingBubbleSeekBar.this.isThumbOnDragging = false;
            SettingBubbleSeekBar.this.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SettingBubbleSeekBar.this.isThumbOnDragging = false;
            SettingBubbleSeekBar.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar$d */
    public class RunnableC18662d implements Runnable {

        /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar$d$a */
        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (!SettingBubbleSeekBar.this.isAlwaysShowBubble) {
                    SettingBubbleSeekBar.this.hideBubble();
                }
                SettingBubbleSeekBar.this.isThumbOnDragging = false;
                SettingBubbleSeekBar.this.invalidate();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!SettingBubbleSeekBar.this.isAlwaysShowBubble) {
                    SettingBubbleSeekBar.this.hideBubble();
                }
                SettingBubbleSeekBar.this.isThumbOnDragging = false;
                SettingBubbleSeekBar.this.invalidate();
            }
        }

        public RunnableC18662d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SettingBubbleSeekBar.this.mBubbleView.animate().alpha(SettingBubbleSeekBar.this.isAlwaysShowBubble ? 1.0f : 0.0f).setDuration(SettingBubbleSeekBar.this.mAnimDuration).setListener(new a()).start();
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar$e */
    public class C18663e implements ValueAnimator.AnimatorUpdateListener {
        public C18663e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SettingBubbleSeekBar.this.mThumbCenterX = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SettingBubbleSeekBar settingBubbleSeekBar = SettingBubbleSeekBar.this;
            settingBubbleSeekBar.mProgress = settingBubbleSeekBar.calculateProgress();
            if (SettingBubbleSeekBar.this.isHideBubble || SettingBubbleSeekBar.this.mBubbleView.getParent() == null) {
                SettingBubbleSeekBar.this.processProgress();
            } else {
                SettingBubbleSeekBar settingBubbleSeekBar2 = SettingBubbleSeekBar.this;
                settingBubbleSeekBar2.mBubbleCenterRawX = settingBubbleSeekBar2.calculateCenterRawXofBubbleView();
                SettingBubbleSeekBar.this.mLayoutParams.x = (int) (SettingBubbleSeekBar.this.mBubbleCenterRawX + 0.5f);
                SettingBubbleSeekBar.this.mWindowManager.updateViewLayout(SettingBubbleSeekBar.this.mBubbleView, SettingBubbleSeekBar.this.mLayoutParams);
                SettingBubbleSeekBar.this.mBubbleView.m40904a(SettingBubbleSeekBar.this.isShowProgressInFloat ? String.valueOf(SettingBubbleSeekBar.this.getProgressFloat()) : String.valueOf(SettingBubbleSeekBar.this.getProgress()));
            }
            SettingBubbleSeekBar.this.invalidate();
            if (SettingBubbleSeekBar.this.mProgressListener != null) {
                InterfaceC18669k interfaceC18669k = SettingBubbleSeekBar.this.mProgressListener;
                SettingBubbleSeekBar settingBubbleSeekBar3 = SettingBubbleSeekBar.this;
                interfaceC18669k.mo40791c(settingBubbleSeekBar3, settingBubbleSeekBar3.getProgress(), SettingBubbleSeekBar.this.getProgressFloat(), true);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar$f */
    public class C18664f extends AnimatorListenerAdapter {
        public C18664f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (!SettingBubbleSeekBar.this.isHideBubble && !SettingBubbleSeekBar.this.isAlwaysShowBubble) {
                SettingBubbleSeekBar.this.hideBubble();
            }
            SettingBubbleSeekBar settingBubbleSeekBar = SettingBubbleSeekBar.this;
            settingBubbleSeekBar.mProgress = settingBubbleSeekBar.calculateProgress();
            SettingBubbleSeekBar.this.isThumbOnDragging = false;
            SettingBubbleSeekBar.this.isTouchToSeekAnimEnd = true;
            SettingBubbleSeekBar.this.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!SettingBubbleSeekBar.this.isHideBubble && !SettingBubbleSeekBar.this.isAlwaysShowBubble) {
                SettingBubbleSeekBar.this.hideBubble();
            }
            SettingBubbleSeekBar settingBubbleSeekBar = SettingBubbleSeekBar.this;
            settingBubbleSeekBar.mProgress = settingBubbleSeekBar.calculateProgress();
            SettingBubbleSeekBar.this.isThumbOnDragging = false;
            SettingBubbleSeekBar.this.isTouchToSeekAnimEnd = true;
            SettingBubbleSeekBar.this.invalidate();
            if (SettingBubbleSeekBar.this.mProgressListener != null) {
                InterfaceC18669k interfaceC18669k = SettingBubbleSeekBar.this.mProgressListener;
                SettingBubbleSeekBar settingBubbleSeekBar2 = SettingBubbleSeekBar.this;
                interfaceC18669k.mo40789a(settingBubbleSeekBar2, settingBubbleSeekBar2.getProgress(), SettingBubbleSeekBar.this.getProgressFloat(), true);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar$g */
    public class C18665g extends AnimatorListenerAdapter {
        public C18665g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SettingBubbleSeekBar.this.mWindowManager.addView(SettingBubbleSeekBar.this.mBubbleView, SettingBubbleSeekBar.this.mLayoutParams);
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar$h */
    public class RunnableC18666h implements Runnable {
        public RunnableC18666h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SettingBubbleSeekBar.this.showBubble();
            SettingBubbleSeekBar.this.triggerBubbleShowing = true;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar$i */
    public interface InterfaceC18667i {
        @NonNull
        /* JADX INFO: renamed from: a */
        SparseArray<String> m40905a(int i11, @NonNull SparseArray<String> sparseArray);
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar$j */
    public interface InterfaceC18668j {
        /* JADX INFO: renamed from: a */
        String mo40906a(String str);
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar$k */
    public interface InterfaceC18669k {
        /* JADX INFO: renamed from: a */
        void mo40789a(SettingBubbleSeekBar settingBubbleSeekBar, int i11, float f11, boolean z11);

        /* JADX INFO: renamed from: b */
        void mo40790b(SettingBubbleSeekBar settingBubbleSeekBar, int i11, float f11);

        /* JADX INFO: renamed from: c */
        void mo40791c(SettingBubbleSeekBar settingBubbleSeekBar, int i11, float f11, boolean z11);
    }

    public SettingBubbleSeekBar(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void autoAdjustSection() {
        ValueAnimator valueAnimatorOfFloat;
        float f11 = 0.0f;
        int i11 = 0;
        while (i11 <= this.mSectionCount) {
            float f12 = this.mSectionOffset;
            f11 = (i11 * f12) + this.mLeft;
            float f13 = this.mThumbCenterX;
            if (f11 <= f13 && f13 - f11 <= f12) {
                break;
            } else {
                i11++;
            }
        }
        boolean z11 = BigDecimal.valueOf((double) this.mThumbCenterX).setScale(1, this.roundMode).floatValue() == f11;
        AnimatorSet animatorSet = new AnimatorSet();
        if (z11) {
            valueAnimatorOfFloat = null;
        } else {
            float f14 = this.mThumbCenterX;
            float f15 = f14 - f11;
            float f16 = this.mSectionOffset;
            valueAnimatorOfFloat = f15 <= f16 / 2.0f ? ValueAnimator.ofFloat(f14, f11) : ValueAnimator.ofFloat(f14, ((i11 + 1) * f16) + this.mLeft);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new C18663e());
        }
        if (!this.isHideBubble) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mBubbleView, (Property<BubbleView, Float>) View.ALPHA, this.isAlwaysShowBubble ? 1.0f : 0.0f);
            if (z11) {
                animatorSet.setDuration(this.mAnimDuration).play(objectAnimatorOfFloat);
            } else {
                animatorSet.setDuration(this.mAnimDuration).playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat);
            }
        } else if (!z11) {
            animatorSet.setDuration(this.mAnimDuration).playTogether(valueAnimatorOfFloat);
        }
        animatorSet.addListener(new C18664f());
        animatorSet.start();
    }

    private float formatFloat(float f11) {
        try {
            return BigDecimal.valueOf(f11).setScale(1, this.roundMode).floatValue();
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02c8  */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f11;
        float f12;
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float measuredWidth = getMeasuredWidth() - getPaddingRight();
        float paddingTop = getPaddingTop() + this.mThumbRadiusOnDragging;
        if (this.isShowSectionText) {
            this.mPaint.setColor(this.mSectionTextColor);
            this.mPaint.setTextSize(this.mSectionTextSize);
            this.mPaint.getTextBounds("0123456789", 0, 10, this.mRectText);
            int i11 = this.mSectionTextPosition;
            if (i11 == 0) {
                float fHeight = (this.mRectText.height() / 2.0f) + paddingTop;
                String str = this.mSectionTextArray.get(0);
                this.mPaint.getTextBounds(str, 0, str.length(), this.mRectText);
                canvas.drawText(str, (this.mRectText.width() / 2.0f) + paddingLeft, fHeight, this.mPaint);
                paddingLeft += this.mRectText.width() + this.mTextSpace;
                String str2 = this.mSectionTextArray.get(this.mSectionCount);
                this.mPaint.getTextBounds(str2, 0, str2.length(), this.mRectText);
                canvas.drawText(str2, measuredWidth - ((this.mRectText.width() + 0.5f) / 2.0f), fHeight, this.mPaint);
                measuredWidth -= this.mRectText.width() + this.mTextSpace;
            } else if (i11 >= 1) {
                float f13 = this.mThumbRadiusOnDragging + paddingTop + this.mTextSpace;
                String str3 = this.mSectionTextArray.get(0);
                this.mPaint.getTextBounds(str3, 0, str3.length(), this.mRectText);
                float fHeight2 = f13 + this.mRectText.height();
                float f14 = this.mLeft;
                if (this.mSectionTextPosition == 1) {
                    canvas.drawText(str3, f14, fHeight2, this.mPaint);
                }
                String str4 = this.mSectionTextArray.get(this.mSectionCount);
                this.mPaint.getTextBounds(str4, 0, str4.length(), this.mRectText);
                float f15 = this.mRight;
                if (this.mSectionTextPosition == 1) {
                    canvas.drawText(str4, f15, fHeight2, this.mPaint);
                }
                paddingLeft = f14;
                measuredWidth = f15;
            }
        } else if (this.isShowThumbText && this.mSectionTextPosition == -1) {
            paddingLeft = this.mLeft;
            measuredWidth = this.mRight;
        }
        if ((!this.isShowSectionText && !this.isShowThumbText) || this.mSectionTextPosition == 0) {
            int i12 = this.mThumbRadiusOnDragging;
            paddingLeft += i12;
            measuredWidth -= i12;
        }
        float f16 = measuredWidth;
        if (!this.isThumbOnDragging || this.isAlwaysShowBubble) {
            if (this.isRtl) {
                this.mThumbCenterX = f16 - ((this.mTrackLength / this.mDelta) * (this.mProgress - this.mMin));
            } else {
                this.mThumbCenterX = ((this.mTrackLength / this.mDelta) * (this.mProgress - this.mMin)) + paddingLeft;
            }
        }
        this.mPaint.setColor(this.mSecondTrackColor);
        this.mPaint.setStrokeWidth(this.mSecondTrackSize);
        if (this.isRtl) {
            canvas2 = canvas;
            canvas2.drawLine(f16, paddingTop, this.mThumbCenterX, paddingTop, this.mPaint);
            f11 = paddingLeft;
        } else {
            canvas2 = canvas;
            f11 = paddingLeft;
            canvas2.drawLine(f11, paddingTop, this.mThumbCenterX, paddingTop, this.mPaint);
        }
        this.mPaint.setColor(this.mTrackColor);
        this.mPaint.setStrokeWidth(this.mTrackSize);
        if (this.isRtl) {
            float f17 = f11;
            canvas2.drawLine(this.mThumbCenterX, paddingTop, f17, paddingTop, this.mPaint);
            f12 = f17;
        } else {
            f12 = f11;
            canvas2.drawLine(this.mThumbCenterX, paddingTop, f16, paddingTop, this.mPaint);
        }
        boolean z11 = this.isShowSectionText && this.mSectionTextPosition == 2;
        if (z11 || this.isShowSectionMark) {
            this.mPaint.setTextSize(this.mSectionTextSize);
            this.mPaint.getTextBounds("0123456789", 0, 10, this.mRectText);
            float fHeight3 = this.mRectText.height() + paddingTop + this.mThumbRadiusOnDragging + this.mTextSpace;
            float fAbs = this.isRtl ? this.mRight - ((this.mTrackLength / this.mDelta) * Math.abs(this.mProgress - this.mMin)) : this.mLeft + ((this.mTrackLength / this.mDelta) * Math.abs(this.mProgress - this.mMin));
            for (int i13 = 0; i13 <= this.mSectionCount; i13++) {
                if (!this.hideNoTextSectionMark || !TextUtils.isEmpty(this.mSectionTextArray.get(i13))) {
                    float f18 = (i13 * this.mSectionOffset) + f12;
                    this.mPaint.setColor(this.mFillColor);
                    canvas2.drawCircle(f18, paddingTop, this.mTrackRadius, this.mPaint);
                    if (this.isRtl) {
                        this.mPaint.setColor(f18 <= fAbs ? this.mTrackColor : this.mSecondTrackColor);
                    } else {
                        this.mPaint.setColor(f18 <= fAbs ? this.mSecondTrackColor : this.mTrackColor);
                    }
                    canvas2.drawCircle(f18, paddingTop, this.mTrackRadius - this.mFillSize, this.mPaint);
                    if (z11) {
                        this.mPaint.setColor(this.mSectionTextColor);
                        if (this.mSectionTextArray.get(i13, null) != null) {
                            canvas2.drawText(this.mSectionTextArray.get(i13), f18, fHeight3, this.mPaint);
                        }
                    }
                }
            }
        }
        if (this.isShowThumbText && !this.isThumbOnDragging && this.isTouchToSeekAnimEnd) {
            this.mPaint.setColor(this.mThumbTextColor);
            this.mPaint.setTextSize(this.mThumbTextSize);
            this.mPaint.getTextBounds("0123456789", 0, 10, this.mRectText);
            float fHeight4 = this.mRectText.height() + paddingTop + this.mThumbRadiusOnDragging + this.mTextSpace;
            if (this.isFloatType) {
                canvas2.drawText(String.valueOf(getProgressFloat()), this.mThumbCenterX, fHeight4, this.mPaint);
            } else {
                if (this.isShowProgressInFloat && this.mSectionTextPosition == 1) {
                    float f19 = this.mProgress;
                    if (f19 != this.mMin && f19 != this.mMax) {
                        canvas2.drawText(String.valueOf(getProgressFloat()), this.mThumbCenterX, fHeight4, this.mPaint);
                    }
                }
                canvas2.drawText(String.valueOf(getProgress()), this.mThumbCenterX, fHeight4, this.mPaint);
            }
        }
        if (this.showCenterPoint) {
            float f21 = this.mDefaultProgress;
            if (f21 > 0.0f) {
                float f22 = this.isRtl ? f16 - ((this.mTrackLength / this.mDelta) * (f21 - this.mMin)) : f12 + ((this.mTrackLength / this.mDelta) * (f21 - this.mMin));
                this.mPaint.setColor(getResources().getColor(R$color.c_overlay));
                canvas2.drawCircle(f22, paddingTop, C18673c.m40909b(5), this.mPaint);
                if (this.isRtl) {
                    if (this.mThumbCenterX < f22) {
                        this.mPaint.setColor(this.mSecondTrackColor);
                    } else {
                        this.mPaint.setColor(this.mTrackColor);
                    }
                } else if (this.mThumbCenterX > f22) {
                    this.mPaint.setColor(this.mSecondTrackColor);
                } else {
                    this.mPaint.setColor(this.mTrackColor);
                }
                canvas2.drawCircle(f22, paddingTop, C18673c.m40908a(3.5f), this.mPaint);
            }
        }
        this.mPaint.setColor(this.mThumbColor);
        canvas2.drawCircle(this.mThumbCenterX, paddingTop, this.isThumbOnDragging ? this.mThumbRadiusOnDragging : this.mThumbRadius, this.mPaint);
        this.mPaint.setColor(this.mFillColor);
        canvas2.drawCircle(this.mThumbCenterX, paddingTop, (this.isThumbOnDragging ? this.mThumbRadiusOnDragging : this.mThumbRadius) - this.mFillSize, this.mPaint);
    }

    public SettingBubbleSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private float calThumbCxWhenSeekStepSection(float f11) {
        float f12 = this.mLeft;
        if (f11 <= f12) {
            return f12;
        }
        float f13 = this.mRight;
        if (f11 >= f13) {
            return f13;
        }
        float f14 = 0.0f;
        int i11 = 0;
        while (i11 <= this.mSectionCount) {
            float f15 = this.mSectionOffset;
            f14 = (i11 * f15) + this.mLeft;
            if (f14 <= f11 && f11 - f14 <= f15) {
                break;
            }
            i11++;
        }
        float f16 = f11 - f14;
        float f17 = this.mSectionOffset;
        return f16 <= f17 / 2.0f ? f14 : ((i11 + 1) * f17) + this.mLeft;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float calculateCenterRawXofBubbleView() {
        return this.isRtl ? this.mBubbleCenterRawSolidX - ((this.mTrackLength * (this.mProgress - this.mMin)) / this.mDelta) : this.mBubbleCenterRawSolidX + ((this.mTrackLength * (this.mProgress - this.mMin)) / this.mDelta);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float calculateProgress() {
        float f11;
        float f12;
        if (this.isRtl) {
            f11 = ((this.mRight - this.mThumbCenterX) * this.mDelta) / this.mTrackLength;
            f12 = this.mMin;
        } else {
            f11 = ((this.mThumbCenterX - this.mLeft) * this.mDelta) / this.mTrackLength;
            f12 = this.mMin;
        }
        return f11 + f12;
    }

    private void calculateRadiusOfBubble() {
        String strFloat2String;
        String strFloat2String2;
        this.mPaint.setTextSize(this.mBubbleTextSize);
        if (this.isShowProgressInFloat) {
            strFloat2String = float2String(this.isRtl ? this.mMax : this.mMin);
        } else if (this.isRtl) {
            strFloat2String = this.isFloatType ? float2String(this.mMax) : String.valueOf((int) this.mMax);
        } else {
            strFloat2String = this.isFloatType ? float2String(this.mMin) : String.valueOf((int) this.mMin);
        }
        this.mPaint.getTextBounds(strFloat2String, 0, strFloat2String.length(), this.mRectText);
        int iWidth = (this.mRectText.width() + (this.mTextSpace * 2)) >> 1;
        if (this.isShowProgressInFloat) {
            strFloat2String2 = float2String(this.isRtl ? this.mMin : this.mMax);
        } else if (this.isRtl) {
            strFloat2String2 = this.isFloatType ? float2String(this.mMin) : String.valueOf((int) this.mMin);
        } else {
            strFloat2String2 = this.isFloatType ? float2String(this.mMax) : String.valueOf((int) this.mMax);
        }
        this.mPaint.getTextBounds(strFloat2String2, 0, strFloat2String2.length(), this.mRectText);
        int iWidth2 = (this.mRectText.width() + (this.mTextSpace * 2)) >> 1;
        int iM40909b = C18673c.m40909b(14);
        this.mBubbleRadius = iM40909b;
        this.mBubbleRadius = Math.max(iM40909b, Math.max(iWidth, iWidth2)) + this.mTextSpace;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideBubble() {
        BubbleView bubbleView = this.mBubbleView;
        if (bubbleView == null) {
            return;
        }
        bubbleView.setVisibility(8);
        if (this.mBubbleView.getParent() != null) {
            this.mWindowManager.removeViewImmediate(this.mBubbleView);
        }
    }

    private void initConfigByPriority() {
        if (this.mMin == this.mMax) {
            this.mMin = 0.0f;
            this.mMax = 100.0f;
        }
        float f11 = this.mMin;
        float f12 = this.mMax;
        if (f11 > f12) {
            this.mMax = f11;
            this.mMin = f12;
        }
        float f13 = this.mProgress;
        float f14 = this.mMin;
        if (f13 < f14) {
            this.mProgress = f14;
        }
        float f15 = this.mProgress;
        float f16 = this.mMax;
        if (f15 > f16) {
            this.mProgress = f16;
        }
        int i11 = this.mSecondTrackSize;
        int i12 = this.mTrackSize;
        if (i11 < i12) {
            this.mSecondTrackSize = i12 + C18673c.m40909b(2);
        }
        int i13 = this.mThumbRadius;
        int i14 = this.mSecondTrackSize;
        if (i13 <= i14) {
            this.mThumbRadius = i14 + C18673c.m40909b(2);
        }
        int i15 = this.mThumbRadiusOnDragging;
        int i16 = this.mSecondTrackSize;
        if (i15 <= i16) {
            this.mThumbRadiusOnDragging = i16 * 2;
        }
        if (this.mSectionCount <= 0) {
            this.mSectionCount = 10;
        }
        float f17 = this.mMax - this.mMin;
        this.mDelta = f17;
        float f18 = f17 / this.mSectionCount;
        this.mSectionValue = f18;
        if (f18 < 1.0f) {
            this.isFloatType = true;
        }
        if (this.isFloatType) {
            this.isShowProgressInFloat = true;
        }
        int i17 = this.mSectionTextPosition;
        if (i17 != -1) {
            this.isShowSectionText = true;
        }
        if (this.isShowSectionText) {
            if (i17 == -1) {
                this.mSectionTextPosition = 0;
            }
            if (this.mSectionTextPosition == 2) {
                this.isShowSectionMark = true;
            }
        }
        if (this.mSectionTextInterval < 1) {
            this.mSectionTextInterval = 1;
        }
        initSectionTextArray();
        if (this.isSeekStepSection) {
            this.isSeekBySection = false;
            this.isAutoAdjustSectionMark = false;
        }
        if (this.isAutoAdjustSectionMark && !this.isShowSectionMark) {
            this.isAutoAdjustSectionMark = false;
        }
        if (this.isSeekBySection) {
            float f19 = this.mMin;
            this.mPreSecValue = f19;
            if (this.mProgress != f19) {
                this.mPreSecValue = this.mSectionValue;
            }
            this.isShowSectionMark = true;
            this.isAutoAdjustSectionMark = true;
        }
        if (this.isHideBubble) {
            this.isAlwaysShowBubble = false;
        }
        if (this.isAlwaysShowBubble) {
            setProgress(this.mProgress);
        }
        this.mThumbTextSize = (this.isFloatType || this.isSeekBySection || (this.isShowSectionText && this.mSectionTextPosition == 2)) ? this.mSectionTextSize : this.mThumbTextSize;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e A[PHI: r5
      0x004e: PHI (r5v3 float) = (r5v2 float), (r5v2 float), (r5v2 float), (r5v7 float) binds: [B:26:0x0049, B:27:0x004b, B:19:0x002e, B:24:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0059, please report this as an issue */
    private void initSectionTextArray() {
        String strFloat2String;
        int i11 = 0;
        boolean z11 = this.mSectionTextPosition == 2;
        boolean z12 = this.mSectionTextInterval > 1 && this.mSectionCount % 2 == 0;
        while (true) {
            int i12 = this.mSectionCount;
            if (i11 > i12) {
                return;
            }
            boolean z13 = this.isRtl;
            float f11 = z13 ? this.mMax - (this.mSectionValue * i11) : this.mMin + (this.mSectionValue * i11);
            if (z11) {
                if (!z12) {
                    SparseArray<String> sparseArray = this.mSectionTextArray;
                    if (this.isFloatType) {
                        strFloat2String = float2String(f11);
                    } else {
                        strFloat2String = ((int) f11) + "";
                    }
                    sparseArray.put(i11, strFloat2String);
                } else if (i11 % this.mSectionTextInterval == 0) {
                    f11 = z13 ? this.mMax - (this.mSectionValue * i11) : this.mMin + (this.mSectionValue * i11);
                    SparseArray<String> sparseArray2 = this.mSectionTextArray;
                    if (this.isFloatType) {
                        strFloat2String = float2String(f11);
                    } else {
                        strFloat2String = ((int) f11) + "";
                    }
                    sparseArray2.put(i11, strFloat2String);
                }
            } else if (i11 == 0 || i11 == i12) {
                SparseArray<String> sparseArray3 = this.mSectionTextArray;
                if (this.isFloatType) {
                    strFloat2String = float2String(f11);
                } else {
                    strFloat2String = ((int) f11) + "";
                }
                sparseArray3.put(i11, strFloat2String);
            }
            i11++;
        }
    }

    private void locatePositionInWindow() {
        Window window;
        getLocationInWindow(this.mPoint);
        Object parent = getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            if (view.getMeasuredWidth() > 0) {
                int[] iArr = this.mPoint;
                iArr[0] = iArr[0] % view.getMeasuredWidth();
            }
        }
        if (this.isRtl) {
            this.mBubbleCenterRawSolidX = (this.mPoint[0] + this.mRight) - (this.mBubbleView.getMeasuredWidth() / 2.0f);
        } else {
            this.mBubbleCenterRawSolidX = (this.mPoint[0] + this.mLeft) - (this.mBubbleView.getMeasuredWidth() / 2.0f);
        }
        this.mBubbleCenterRawX = calculateCenterRawXofBubbleView();
        float measuredHeight = (this.mPoint[1] - this.mBubbleView.getMeasuredHeight()) + getPaddingTop();
        this.mBubbleCenterRawSolidY = measuredHeight;
        float fM58272j = measuredHeight - EdgeToEdgeCompat.f48106a.m58272j();
        this.mBubbleCenterRawSolidY = fM58272j;
        this.mBubbleCenterRawSolidY = fM58272j - C18673c.m40909b(this.bubbleMarginBottom);
        if (C18673c.m40910c()) {
            this.mBubbleCenterRawSolidY -= C18673c.m40909b(4);
        }
        Context context = getContext();
        if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (window.getAttributes().flags & 1024) == 0) {
            return;
        }
        Resources system = Resources.getSystem();
        this.mBubbleCenterRawSolidY += system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float processProgress() {
        float f11 = this.mProgress;
        if (this.isSeekBySection && this.triggerSeekBySection) {
            float f12 = this.mSectionValue / 2.0f;
            if (this.isTouchToSeek) {
                if (f11 != this.mMin && f11 != this.mMax) {
                    for (int i11 = 0; i11 <= this.mSectionCount; i11++) {
                        float f13 = this.mSectionValue;
                        float f14 = i11 * f13;
                        if (f14 < f11 && f14 + f13 >= f11) {
                            return f12 + f14 > f11 ? f14 : f14 + f13;
                        }
                    }
                }
            }
            float f15 = this.mPreSecValue;
            if (f11 >= f15) {
                if (f11 >= f12 + f15) {
                    float f16 = f15 + this.mSectionValue;
                    this.mPreSecValue = f16;
                    return f16;
                }
            } else if (f11 < f15 - f12) {
                float f17 = f15 - this.mSectionValue;
                this.mPreSecValue = f17;
                return f17;
            }
            return f15;
        }
        return f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showBubble() {
        BubbleView bubbleView = this.mBubbleView;
        if (bubbleView == null || bubbleView.getParent() != null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.mLayoutParams;
        layoutParams.x = (int) (this.mBubbleCenterRawX + 0.5f);
        layoutParams.y = (int) (this.mBubbleCenterRawSolidY + 0.5f);
        this.mBubbleView.setAlpha(0.0f);
        this.mBubbleView.setVisibility(0);
        this.mBubbleView.animate().alpha(1.0f).setDuration(this.isTouchToSeek ? 0L : this.mAnimDuration).setListener(new C18665g()).start();
        this.mBubbleView.m40904a(this.isShowProgressInFloat ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
    }

    public void config(C18672b c18672b) {
        this.mMin = c18672b.f34341a;
        this.mMax = c18672b.f34342b;
        this.mProgress = c18672b.f34343c;
        this.isFloatType = c18672b.f34344d;
        this.mTrackSize = c18672b.f34345e;
        this.mSecondTrackSize = c18672b.f34346f;
        this.mThumbRadius = c18672b.f34347g;
        this.mThumbRadiusOnDragging = c18672b.f34348h;
        this.mTrackColor = c18672b.f34349i;
        this.mSecondTrackColor = c18672b.f34350j;
        this.mThumbColor = c18672b.f34351k;
        this.mSectionCount = c18672b.f34352l;
        this.isShowSectionMark = c18672b.f34353m;
        this.isAutoAdjustSectionMark = c18672b.f34354n;
        this.isShowSectionText = c18672b.f34355o;
        this.mSectionTextSize = c18672b.f34356p;
        this.mSectionTextColor = c18672b.f34357q;
        this.mSectionTextPosition = c18672b.f34358r;
        this.mSectionTextInterval = c18672b.f34359s;
        this.isShowThumbText = c18672b.f34360t;
        this.mThumbTextSize = c18672b.f34361u;
        this.mThumbTextColor = c18672b.f34362v;
        this.isShowProgressInFloat = c18672b.f34363w;
        this.mAnimDuration = c18672b.f34364x;
        this.isTouchToSeek = c18672b.f34365y;
        this.isSeekStepSection = c18672b.f34366z;
        this.isSeekBySection = c18672b.f34329A;
        this.mBubbleColor = c18672b.f34330B;
        this.mBubbleTextSize = c18672b.f34331C;
        this.mBubbleTextColor = c18672b.f34332D;
        this.isAlwaysShowBubble = c18672b.f34333E;
        this.mAlwaysShowBubbleDelay = c18672b.f34334F;
        this.isHideBubble = c18672b.f34335G;
        this.isRtl = c18672b.f34336H;
        this.roundMode = c18672b.f34337I;
        this.hideNoTextSectionMark = c18672b.f34339K;
        this.mCanSeek = Boolean.valueOf(c18672b.f34338J);
        initConfigByPriority();
        calculateRadiusOfBubble();
        InterfaceC18669k interfaceC18669k = this.mProgressListener;
        if (interfaceC18669k != null) {
            interfaceC18669k.mo40791c(this, getProgress(), getProgressFloat(), false);
            this.mProgressListener.mo40789a(this, getProgress(), getProgressFloat(), false);
        }
        this.mConfigBuilder = null;
        requestLayout();
    }

    public void correctOffsetWhenContainerOnScrolling() {
        if (this.isHideBubble) {
            return;
        }
        locatePositionInWindow();
        if (this.mBubbleView.getParent() != null) {
            if (!this.isAlwaysShowBubble) {
                postInvalidate();
                return;
            }
            WindowManager.LayoutParams layoutParams = this.mLayoutParams;
            layoutParams.y = (int) (this.mBubbleCenterRawSolidY + 0.5f);
            this.mWindowManager.updateViewLayout(this.mBubbleView, layoutParams);
        }
    }

    public C18672b getConfigBuilder() {
        if (this.mConfigBuilder == null) {
            this.mConfigBuilder = new C18672b(this);
        }
        C18672b c18672b = this.mConfigBuilder;
        c18672b.f34341a = this.mMin;
        c18672b.f34342b = this.mMax;
        c18672b.f34343c = this.mProgress;
        c18672b.f34344d = this.isFloatType;
        c18672b.f34345e = this.mTrackSize;
        c18672b.f34346f = this.mSecondTrackSize;
        c18672b.f34347g = this.mThumbRadius;
        c18672b.f34348h = this.mThumbRadiusOnDragging;
        c18672b.f34349i = this.mTrackColor;
        c18672b.f34350j = this.mSecondTrackColor;
        c18672b.f34351k = this.mThumbColor;
        c18672b.f34352l = this.mSectionCount;
        c18672b.f34353m = this.isShowSectionMark;
        c18672b.f34354n = this.isAutoAdjustSectionMark;
        c18672b.f34355o = this.isShowSectionText;
        c18672b.f34356p = this.mSectionTextSize;
        c18672b.f34357q = this.mSectionTextColor;
        c18672b.f34358r = this.mSectionTextPosition;
        c18672b.f34359s = this.mSectionTextInterval;
        c18672b.f34360t = this.isShowThumbText;
        c18672b.f34361u = this.mThumbTextSize;
        c18672b.f34362v = this.mThumbTextColor;
        c18672b.f34363w = this.isShowProgressInFloat;
        c18672b.f34364x = this.mAnimDuration;
        c18672b.f34365y = this.isTouchToSeek;
        c18672b.f34366z = this.isSeekStepSection;
        c18672b.f34329A = this.isSeekBySection;
        c18672b.f34330B = this.mBubbleColor;
        c18672b.f34331C = this.mBubbleTextSize;
        c18672b.f34332D = this.mBubbleTextColor;
        c18672b.f34333E = this.isAlwaysShowBubble;
        c18672b.f34334F = this.mAlwaysShowBubbleDelay;
        c18672b.f34335G = this.isHideBubble;
        c18672b.f34336H = this.isRtl;
        c18672b.f34337I = this.roundMode;
        c18672b.f34339K = this.hideNoTextSectionMark;
        return c18672b;
    }

    public float getMax() {
        return this.mMax;
    }

    public float getMin() {
        return this.mMin;
    }

    public InterfaceC18669k getOnProgressChangedListener() {
        return this.mProgressListener;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.mProgress = bundle.getFloat("progress");
        super.onRestoreInstanceState(bundle.getParcelable("save_instance"));
        BubbleView bubbleView = this.mBubbleView;
        if (bubbleView != null) {
            bubbleView.m40904a(this.isShowProgressInFloat ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
        }
        setProgress(this.mProgress);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("save_instance", super.onSaveInstanceState());
        bundle.putFloat("progress", this.mProgress);
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:61:0x010a  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        long j11;
        InterfaceC18669k interfaceC18669k;
        if (!this.mCanSeek.booleanValue()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            locatePositionInWindow();
            performClick();
            getParent().requestDisallowInterceptTouchEvent(true);
            boolean zIsThumbTouched = isThumbTouched(motionEvent);
            this.isThumbOnDragging = zIsThumbTouched;
            if (zIsThumbTouched) {
                if (this.isSeekBySection && !this.triggerSeekBySection) {
                    this.triggerSeekBySection = true;
                }
                if (this.isAlwaysShowBubble && !this.triggerBubbleShowing) {
                    this.triggerBubbleShowing = true;
                }
                if (!this.isHideBubble) {
                    showBubble();
                }
                invalidate();
            } else if (this.isTouchToSeek && isTrackTouched(motionEvent)) {
                this.isThumbOnDragging = true;
                if (this.isSeekBySection && !this.triggerSeekBySection) {
                    this.triggerSeekBySection = true;
                }
                if (this.isAlwaysShowBubble) {
                    hideBubble();
                    this.triggerBubbleShowing = true;
                }
                if (this.isSeekStepSection) {
                    float fCalThumbCxWhenSeekStepSection = calThumbCxWhenSeekStepSection(motionEvent.getX());
                    this.mPreThumbCenterX = fCalThumbCxWhenSeekStepSection;
                    this.mThumbCenterX = fCalThumbCxWhenSeekStepSection;
                } else {
                    float x11 = motionEvent.getX();
                    this.mThumbCenterX = x11;
                    float f11 = this.mLeft;
                    if (x11 < f11) {
                        this.mThumbCenterX = f11;
                    }
                    float f12 = this.mThumbCenterX;
                    float f13 = this.mRight;
                    if (f12 > f13) {
                        this.mThumbCenterX = f13;
                    }
                }
                this.mProgress = calculateProgress();
                if (!this.isHideBubble) {
                    this.mBubbleCenterRawX = calculateCenterRawXofBubbleView();
                    showBubble();
                }
                invalidate();
            }
            this.f34313dx = this.mThumbCenterX - motionEvent.getX();
        } else if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            if (this.isAutoAdjustSectionMark) {
                if (this.isTouchToSeek) {
                    postDelayed(new RunnableC18660b(), this.mAnimDuration);
                } else {
                    autoAdjustSection();
                }
            } else if (this.isThumbOnDragging || this.isTouchToSeek) {
                if (this.isHideBubble) {
                    ViewPropertyAnimator duration = animate().setDuration(this.mAnimDuration);
                    if (this.isThumbOnDragging && this.isTouchToSeek) {
                        j11 = 300;
                    } else {
                        j11 = 0;
                    }
                    duration.setStartDelay(j11).setListener(new C18661c()).start();
                } else {
                    postDelayed(new RunnableC18662d(), this.mAnimDuration);
                }
            }
            interfaceC18669k = this.mProgressListener;
            if (interfaceC18669k != null) {
                interfaceC18669k.mo40791c(this, getProgress(), getProgressFloat(), true);
                this.mProgressListener.mo40790b(this, getProgress(), getProgressFloat());
            }
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                getParent().requestDisallowInterceptTouchEvent(false);
                if (this.isAutoAdjustSectionMark) {
                    if (this.isTouchToSeek) {
                        postDelayed(new RunnableC18660b(), this.mAnimDuration);
                    } else {
                        autoAdjustSection();
                    }
                } else if (this.isThumbOnDragging) {
                    if (this.isHideBubble) {
                        ViewPropertyAnimator duration2 = animate().setDuration(this.mAnimDuration);
                        if (this.isThumbOnDragging) {
                            j11 = 0;
                        } else {
                            j11 = 0;
                        }
                        duration2.setStartDelay(j11).setListener(new C18661c()).start();
                    } else {
                        postDelayed(new RunnableC18662d(), this.mAnimDuration);
                    }
                } else if (this.isHideBubble) {
                    ViewPropertyAnimator duration3 = animate().setDuration(this.mAnimDuration);
                    if (this.isThumbOnDragging) {
                        j11 = 0;
                    } else {
                        j11 = 0;
                    }
                    duration3.setStartDelay(j11).setListener(new C18661c()).start();
                } else {
                    postDelayed(new RunnableC18662d(), this.mAnimDuration);
                }
                interfaceC18669k = this.mProgressListener;
                if (interfaceC18669k != null) {
                    interfaceC18669k.mo40791c(this, getProgress(), getProgressFloat(), true);
                    this.mProgressListener.mo40790b(this, getProgress(), getProgressFloat());
                }
            }
        } else if (this.isThumbOnDragging) {
            if (this.isSeekStepSection) {
                float fCalThumbCxWhenSeekStepSection2 = calThumbCxWhenSeekStepSection(motionEvent.getX());
                if (fCalThumbCxWhenSeekStepSection2 != this.mPreThumbCenterX) {
                    this.mPreThumbCenterX = fCalThumbCxWhenSeekStepSection2;
                    this.mThumbCenterX = fCalThumbCxWhenSeekStepSection2;
                }
            } else {
                float x12 = motionEvent.getX() + this.f34313dx;
                this.mThumbCenterX = x12;
                float f14 = this.mLeft;
                if (x12 < f14) {
                    this.mThumbCenterX = f14;
                }
                float f15 = this.mThumbCenterX;
                float f16 = this.mRight;
                if (f15 > f16) {
                    this.mThumbCenterX = f16;
                }
            }
            this.mProgress = calculateProgress();
            if (this.isHideBubble || this.mBubbleView.getParent() == null) {
                processProgress();
            } else {
                float fCalculateCenterRawXofBubbleView = calculateCenterRawXofBubbleView();
                this.mBubbleCenterRawX = fCalculateCenterRawXofBubbleView;
                WindowManager.LayoutParams layoutParams = this.mLayoutParams;
                layoutParams.x = (int) (fCalculateCenterRawXofBubbleView + 0.5f);
                this.mWindowManager.updateViewLayout(this.mBubbleView, layoutParams);
                this.mBubbleView.m40904a(this.isShowProgressInFloat ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
            }
            invalidate();
            InterfaceC18669k interfaceC18669k2 = this.mProgressListener;
            if (interfaceC18669k2 != null) {
                interfaceC18669k2.mo40791c(this, getProgress(), getProgressFloat(), true);
            }
        }
        return this.isThumbOnDragging || this.isTouchToSeek || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i11) {
        if (this.isHideBubble || !this.isAlwaysShowBubble) {
            return;
        }
        if (i11 != 0) {
            hideBubble();
        } else if (this.triggerBubbleShowing) {
            showBubble();
        }
        super.onVisibilityChanged(view, i11);
    }

    public void setBubbleColor(@ColorInt int i11) {
        if (this.mBubbleColor != i11) {
            this.mBubbleColor = i11;
            BubbleView bubbleView = this.mBubbleView;
            if (bubbleView != null) {
                bubbleView.invalidate();
            }
        }
    }

    public void setCanSeek(Boolean bool) {
        this.mCanSeek = bool;
    }

    public void setCustomSectionTextArray(@NonNull InterfaceC18667i interfaceC18667i) {
        this.mSectionTextArray = interfaceC18667i.m40905a(this.mSectionCount, this.mSectionTextArray);
        for (int i11 = 0; i11 <= this.mSectionCount; i11++) {
            if (this.mSectionTextArray.get(i11) == null) {
                this.mSectionTextArray.put(i11, "");
            }
        }
        this.isShowThumbText = false;
        requestLayout();
        invalidate();
    }

    public void setDefaultProgress(float f11) {
        this.mDefaultProgress = f11;
        invalidate();
    }

    public void setOnProgressChangedListener(InterfaceC18669k interfaceC18669k) {
        this.mProgressListener = interfaceC18669k;
    }

    public void setProgress(float f11) {
        this.mProgress = f11;
        InterfaceC18669k interfaceC18669k = this.mProgressListener;
        if (interfaceC18669k != null) {
            interfaceC18669k.mo40791c(this, getProgress(), getProgressFloat(), false);
            this.mProgressListener.mo40789a(this, getProgress(), getProgressFloat(), false);
        }
        if (!this.isHideBubble) {
            this.mBubbleCenterRawX = calculateCenterRawXofBubbleView();
        }
        if (this.isAlwaysShowBubble) {
            hideBubble();
            postDelayed(new RunnableC18666h(), this.mAlwaysShowBubbleDelay);
        }
        if (this.isSeekBySection) {
            this.triggerSeekBySection = false;
        }
        postInvalidate();
    }

    public void setProgressFormatCallback(InterfaceC18668j interfaceC18668j) {
        this.mFormatCallback = interfaceC18668j;
    }

    public void setSecondTrackColor(@ColorInt int i11) {
        if (this.mSecondTrackColor != i11) {
            this.mSecondTrackColor = i11;
            invalidate();
        }
    }

    public void setShowCenterPoint(boolean z11) {
        this.showCenterPoint = z11;
        invalidate();
    }

    public void setThumbColor(@ColorInt int i11) {
        if (this.mThumbColor != i11) {
            this.mThumbColor = i11;
            invalidate();
        }
    }

    public void setTrackColor(@ColorInt int i11) {
        if (this.mTrackColor != i11) {
            this.mTrackColor = i11;
            invalidate();
        }
    }

    public SettingBubbleSeekBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mDefaultProgress = -1.0f;
        this.mSectionTextPosition = -1;
        this.roundMode = 4;
        this.showCenterPoint = false;
        this.mSectionTextArray = new SparseArray<>();
        this.mPoint = new int[2];
        this.isTouchToSeekAnimEnd = true;
        this.mCanSeek = Boolean.TRUE;
        this.bubbleMarginBottom = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BubbleSeekBar, i11, 0);
        this.mMin = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_min, 0.0f);
        this.mMax = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_max, 100.0f);
        this.mProgress = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_progress, this.mMin);
        this.isFloatType = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_is_float_type, false);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_track_size, C18673c.m40909b(2));
        this.mTrackSize = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_second_track_size, dimensionPixelSize + C18673c.m40909b(2));
        this.mSecondTrackSize = dimensionPixelSize2;
        this.mTrackRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_track_radius, dimensionPixelSize2 + C18673c.m40909b(2));
        this.mThumbRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_radius, this.mSecondTrackSize + C18673c.m40909b(2));
        this.mThumbRadiusOnDragging = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_radius_on_dragging, this.mSecondTrackSize * 2);
        this.mSectionCount = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_section_count, 10);
        this.mFillSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_fill_size, C18673c.m40909b(2));
        int i12 = R$styleable.BubbleSeekBar_bsb_fill_color;
        int i13 = R$color.emphasis;
        this.mFillColor = typedArrayObtainStyledAttributes.getColor(i12, ContextCompat.getColor(context, i13));
        this.mTrackColor = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_track_color, ContextCompat.getColor(context, i13));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_second_track_color, ContextCompat.getColor(context, i13));
        this.mSecondTrackColor = color;
        this.mThumbColor = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_thumb_color, color);
        this.isShowSectionText = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_section_text, false);
        this.mSectionTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_section_text_size, C18673c.m40911d(14));
        this.mSectionTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_section_text_color, this.mTrackColor);
        this.isSeekStepSection = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_seek_step_section, false);
        this.isSeekBySection = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_seek_by_section, false);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_section_text_position, -1);
        if (integer == 0) {
            this.mSectionTextPosition = 0;
        } else if (integer == 1) {
            this.mSectionTextPosition = 1;
        } else if (integer == 2) {
            this.mSectionTextPosition = 2;
        } else {
            this.mSectionTextPosition = -1;
        }
        this.mSectionTextInterval = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_section_text_interval, 1);
        this.isShowThumbText = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_thumb_text, false);
        this.mThumbTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_text_size, C18673c.m40911d(14));
        this.mThumbTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_thumb_text_color, this.mSecondTrackColor);
        this.mBubbleColor = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_bubble_color, this.mSecondTrackColor);
        this.mBubbleTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_bubble_text_size, C18673c.m40911d(14));
        this.mBubbleTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_bubble_text_color, -1);
        this.isShowSectionMark = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_section_mark, false);
        this.isAutoAdjustSectionMark = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_auto_adjust_section_mark, false);
        this.isShowProgressInFloat = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_progress_in_float, false);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_anim_duration, -1);
        this.mAnimDuration = integer2 < 0 ? 200L : integer2;
        this.isTouchToSeek = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_touch_to_seek, false);
        this.isAlwaysShowBubble = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_always_show_bubble, false);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_always_show_bubble_delay, 0);
        this.mAlwaysShowBubbleDelay = integer3 < 0 ? 0L : integer3;
        this.isHideBubble = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_hide_bubble, false);
        this.isRtl = C5303w0.m6511a();
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_android_enabled, isEnabled()));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mPaint.setTextAlign(Paint.Align.CENTER);
        this.mRectText = new Rect();
        this.mTextSpace = C18673c.m40909b(2);
        initConfigByPriority();
        if (this.isHideBubble) {
            return;
        }
        this.mWindowManager = (WindowManager) context.getSystemService(InterfaceC33953u5.f72199F);
        BubbleView bubbleView = new BubbleView(this, context);
        this.mBubbleView = bubbleView;
        bubbleView.m40904a(this.isShowProgressInFloat ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.mLayoutParams = layoutParams;
        layoutParams.gravity = 8388659;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.flags = 524328;
        if (!C18673c.m40910c() && Build.VERSION.SDK_INT < 25) {
            this.mLayoutParams.type = 2005;
        } else {
            this.mLayoutParams.type = 2;
        }
        calculateRadiusOfBubble();
    }

    private String float2String(float f11) {
        return String.valueOf(formatFloat(f11));
    }

    private boolean isThumbTouched(MotionEvent motionEvent) {
        float f11;
        if (!isEnabled()) {
            return false;
        }
        float f12 = (this.mTrackLength / this.mDelta) * (this.mProgress - this.mMin);
        if (this.isRtl) {
            f11 = this.mRight - f12;
        } else {
            f11 = this.mLeft + f12;
        }
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (((motionEvent.getX() - f11) * (motionEvent.getX() - f11)) + ((motionEvent.getY() - measuredHeight) * (motionEvent.getY() - measuredHeight)) > (this.mLeft + C18673c.m40909b(8)) * (this.mLeft + C18673c.m40909b(8))) {
            return false;
        }
        return true;
    }

    private boolean isTrackTouched(MotionEvent motionEvent) {
        if (isEnabled() && motionEvent.getX() >= getPaddingLeft() && motionEvent.getX() <= getMeasuredWidth() - getPaddingRight() && motionEvent.getY() >= getPaddingTop() && motionEvent.getY() <= getMeasuredHeight() - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    public int getProgress() {
        return (int) processProgress();
    }

    public float getProgressFloat() {
        return formatFloat(processProgress());
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        hideBubble();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (!this.isHideBubble) {
            locatePositionInWindow();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int iMax = this.mThumbRadiusOnDragging * 2;
        if (this.isShowThumbText) {
            this.mPaint.setTextSize(this.mThumbTextSize);
            this.mPaint.getTextBounds("j", 0, 1, this.mRectText);
            iMax += this.mRectText.height();
        }
        if (this.isShowSectionText && this.mSectionTextPosition >= 1) {
            this.mPaint.setTextSize(this.mSectionTextSize);
            this.mPaint.getTextBounds("j", 0, 1, this.mRectText);
            iMax = Math.max(iMax, (this.mThumbRadiusOnDragging * 2) + this.mRectText.height());
        }
        setMeasuredDimension(View.resolveSize(C18673c.m40909b(180), i11), iMax + getPaddingTop() + getPaddingBottom());
        this.mLeft = getPaddingLeft() + this.mThumbRadiusOnDragging;
        this.mRight = (getMeasuredWidth() - getPaddingRight()) - this.mThumbRadiusOnDragging;
        if (this.isShowSectionText) {
            this.mPaint.setTextSize(this.mSectionTextSize);
            int i13 = this.mSectionTextPosition;
            if (i13 == 0) {
                String str = this.mSectionTextArray.get(0);
                this.mPaint.getTextBounds(str, 0, str.length(), this.mRectText);
                this.mLeft += this.mRectText.width() + this.mTextSpace;
                String str2 = this.mSectionTextArray.get(this.mSectionCount);
                this.mPaint.getTextBounds(str2, 0, str2.length(), this.mRectText);
                this.mRight -= this.mRectText.width() + this.mTextSpace;
            } else if (i13 >= 1) {
                String str3 = this.mSectionTextArray.get(0);
                this.mPaint.getTextBounds(str3, 0, str3.length(), this.mRectText);
                this.mLeft = getPaddingLeft() + Math.max(this.mThumbRadiusOnDragging, this.mRectText.width() / 2.0f) + this.mTextSpace;
                String str4 = this.mSectionTextArray.get(this.mSectionCount);
                this.mPaint.getTextBounds(str4, 0, str4.length(), this.mRectText);
                this.mRight = ((getMeasuredWidth() - getPaddingRight()) - Math.max(this.mThumbRadiusOnDragging, this.mRectText.width() / 2.0f)) - this.mTextSpace;
            }
        } else if (this.isShowThumbText && this.mSectionTextPosition == -1) {
            this.mPaint.setTextSize(this.mThumbTextSize);
            String str5 = this.mSectionTextArray.get(0);
            this.mPaint.getTextBounds(str5, 0, str5.length(), this.mRectText);
            this.mLeft = getPaddingLeft() + Math.max(this.mThumbRadiusOnDragging, this.mRectText.width() / 2.0f) + this.mTextSpace;
            String str6 = this.mSectionTextArray.get(this.mSectionCount);
            this.mPaint.getTextBounds(str6, 0, str6.length(), this.mRectText);
            this.mRight = ((getMeasuredWidth() - getPaddingRight()) - Math.max(this.mThumbRadiusOnDragging, this.mRectText.width() / 2.0f)) - this.mTextSpace;
        }
        float f11 = this.mRight - this.mLeft;
        this.mTrackLength = f11;
        this.mSectionOffset = (f11 * 1.0f) / this.mSectionCount;
        if (!this.isHideBubble) {
            this.mBubbleView.measure(i11, i12);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        post(new RunnableC18659a());
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setCustomStartHandle(InterfaceC18671a interfaceC18671a) {
    }
}
