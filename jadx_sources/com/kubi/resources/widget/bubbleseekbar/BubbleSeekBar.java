package com.kubi.resources.widget.bubbleseekbar;

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
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$styleable;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public class BubbleSeekBar extends View {
    static final int NONE = -1;

    /* JADX INFO: renamed from: dx */
    float f44261dx;
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
    private C23007a mConfigBuilder;
    private InterfaceC23009c mCustomStartHandle;
    private float mDelta;
    private int mFillColor;
    private int mFillSize;
    private InterfaceC22998j mFormatCallback;
    private WindowManager.LayoutParams mLayoutParams;
    private float mLeft;
    private float mMax;
    private float mMin;
    private Paint mPaint;
    private int[] mPoint;
    private float mPreSecValue;
    private float mPreThumbCenterX;
    private float mProgress;
    private InterfaceC22999k mProgressListener;
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
    private boolean triggerBubbleShowing;
    private boolean triggerSeekBySection;

    public class BubbleView extends View {

        /* JADX INFO: renamed from: b */
        public Paint f44262b;

        /* JADX INFO: renamed from: c */
        public Path f44263c;

        /* JADX INFO: renamed from: d */
        public RectF f44264d;

        /* JADX INFO: renamed from: e */
        public Rect f44265e;

        /* JADX INFO: renamed from: f */
        public String f44266f;

        public BubbleView(BubbleSeekBar bubbleSeekBar, Context context) {
            this(bubbleSeekBar, context, null);
        }

        public BubbleView(BubbleSeekBar bubbleSeekBar, Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        /* JADX INFO: renamed from: a */
        public void m54984a(String str) {
            if (BubbleSeekBar.this.mFormatCallback != null) {
                str = BubbleSeekBar.this.mFormatCallback.mo40277a(str);
            }
            if (str == null || this.f44266f.equals(str)) {
                return;
            }
            this.f44266f = str;
            invalidate();
        }

        @Override // android.view.View
        public void onMeasure(int i11, int i12) {
            setMeasuredDimension(C23008b.m55029a(32), C23008b.m55029a(19));
        }

        public BubbleView(Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
            this.f44266f = "";
            Paint paint = new Paint();
            this.f44262b = paint;
            paint.setAntiAlias(true);
            this.f44262b.setTextAlign(Paint.Align.CENTER);
            this.f44263c = new Path();
            this.f44264d = new RectF();
            this.f44265e = new Rect();
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            this.f44263c.reset();
            this.f44263c.moveTo(getMeasuredWidth() / 2.0f, getMeasuredHeight());
            this.f44263c.lineTo((getMeasuredWidth() / 2.0f) - (C23008b.m55029a(4) / 2.0f), getMeasuredHeight() - C23008b.m55029a(3));
            this.f44263c.lineTo(C23008b.m55029a(2), getMeasuredHeight() - C23008b.m55029a(3));
            this.f44264d.set(0.0f, (getMeasuredHeight() - C23008b.m55029a(3)) - (C23008b.m55029a(2) * 2), C23008b.m55029a(2) * 2, getMeasuredHeight() - C23008b.m55029a(3));
            this.f44263c.arcTo(this.f44264d, 90.0f, 90.0f);
            this.f44263c.lineTo(0.0f, C23008b.m55029a(2));
            this.f44264d.set(0.0f, 0.0f, C23008b.m55029a(2) * 2, C23008b.m55029a(2) * 2);
            this.f44263c.arcTo(this.f44264d, 180.0f, 90.0f);
            this.f44263c.lineTo(getMeasuredWidth() - C23008b.m55029a(2), 0.0f);
            this.f44264d.set(getMeasuredWidth() - (C23008b.m55029a(2) * 2), 0.0f, getMeasuredWidth(), C23008b.m55029a(2) * 2);
            this.f44263c.arcTo(this.f44264d, 270.0f, 90.0f);
            this.f44263c.lineTo(getMeasuredWidth(), (getMeasuredHeight() - C23008b.m55029a(3)) - C23008b.m55029a(2));
            this.f44264d.set(getMeasuredWidth() - (C23008b.m55029a(2) * 2), (getMeasuredHeight() - C23008b.m55029a(3)) - (C23008b.m55029a(2) * 2), getMeasuredWidth(), getMeasuredHeight() - C23008b.m55029a(3));
            this.f44263c.arcTo(this.f44264d, 0.0f, 90.0f);
            this.f44263c.lineTo((getMeasuredWidth() / 2.0f) + (C23008b.m55029a(4) / 2.0f), getMeasuredHeight() - C23008b.m55029a(3));
            this.f44263c.lineTo(getMeasuredWidth() / 2.0f, getMeasuredHeight());
            this.f44262b.setColor(BubbleSeekBar.this.mBubbleColor);
            this.f44262b.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.f44263c, this.f44262b);
            this.f44262b.setTextSize(BubbleSeekBar.this.mBubbleTextSize);
            this.f44262b.setColor(BubbleSeekBar.this.mBubbleTextColor);
            Paint paint = this.f44262b;
            String str = this.f44266f;
            paint.getTextBounds(str, 0, str.length(), this.f44265e);
            Paint.FontMetrics fontMetrics = this.f44262b.getFontMetrics();
            float measuredHeight = (getMeasuredHeight() - C23008b.m55029a(3)) / 2.0f;
            float f11 = fontMetrics.descent;
            canvas.drawText(this.f44266f, getMeasuredWidth() / 2.0f, (measuredHeight + ((f11 - fontMetrics.ascent) / 2.0f)) - f11, this.f44262b);
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar$a */
    public class RunnableC22989a implements Runnable {
        public RunnableC22989a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar$b */
    public class RunnableC22990b implements Runnable {
        public RunnableC22990b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.isTouchToSeekAnimEnd = false;
            BubbleSeekBar.this.autoAdjustSection();
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar$c */
    public class C22991c extends AnimatorListenerAdapter {
        public C22991c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            BubbleSeekBar.this.isThumbOnDragging = false;
            BubbleSeekBar.this.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BubbleSeekBar.this.isThumbOnDragging = false;
            BubbleSeekBar.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar$d */
    public class RunnableC22992d implements Runnable {

        /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar$d$a */
        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (!BubbleSeekBar.this.isAlwaysShowBubble) {
                    BubbleSeekBar.this.hideBubble();
                }
                BubbleSeekBar.this.isThumbOnDragging = false;
                BubbleSeekBar.this.invalidate();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!BubbleSeekBar.this.isAlwaysShowBubble) {
                    BubbleSeekBar.this.hideBubble();
                }
                BubbleSeekBar.this.isThumbOnDragging = false;
                BubbleSeekBar.this.invalidate();
            }
        }

        public RunnableC22992d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.mBubbleView.animate().alpha(BubbleSeekBar.this.isAlwaysShowBubble ? 1.0f : 0.0f).setDuration(BubbleSeekBar.this.mAnimDuration).setListener(new a()).start();
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar$e */
    public class C22993e implements ValueAnimator.AnimatorUpdateListener {
        public C22993e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BubbleSeekBar.this.mThumbCenterX = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.mProgress = bubbleSeekBar.calculateProgress();
            if (BubbleSeekBar.this.isHideBubble || BubbleSeekBar.this.mBubbleView.getParent() == null) {
                BubbleSeekBar.this.processProgress();
            } else {
                BubbleSeekBar bubbleSeekBar2 = BubbleSeekBar.this;
                bubbleSeekBar2.mBubbleCenterRawX = bubbleSeekBar2.calculateCenterRawXofBubbleView();
                BubbleSeekBar.this.mLayoutParams.x = (int) (BubbleSeekBar.this.mBubbleCenterRawX + 0.5f);
                BubbleSeekBar.this.mWindowManager.updateViewLayout(BubbleSeekBar.this.mBubbleView, BubbleSeekBar.this.mLayoutParams);
                BubbleSeekBar.this.mBubbleView.m54984a(BubbleSeekBar.this.isShowProgressInFloat ? String.valueOf(BubbleSeekBar.this.getProgressFloat()) : String.valueOf(BubbleSeekBar.this.getProgress()));
            }
            BubbleSeekBar.this.invalidate();
            if (BubbleSeekBar.this.mProgressListener != null) {
                InterfaceC22999k interfaceC22999k = BubbleSeekBar.this.mProgressListener;
                BubbleSeekBar bubbleSeekBar3 = BubbleSeekBar.this;
                interfaceC22999k.mo54985a(bubbleSeekBar3, bubbleSeekBar3.getProgress(), BubbleSeekBar.this.getProgressFloat(), true);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar$f */
    public class C22994f extends AnimatorListenerAdapter {
        public C22994f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (!BubbleSeekBar.this.isHideBubble && !BubbleSeekBar.this.isAlwaysShowBubble) {
                BubbleSeekBar.this.hideBubble();
            }
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.mProgress = bubbleSeekBar.calculateProgress();
            BubbleSeekBar.this.isThumbOnDragging = false;
            BubbleSeekBar.this.isTouchToSeekAnimEnd = true;
            BubbleSeekBar.this.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!BubbleSeekBar.this.isHideBubble && !BubbleSeekBar.this.isAlwaysShowBubble) {
                BubbleSeekBar.this.hideBubble();
            }
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.mProgress = bubbleSeekBar.calculateProgress();
            BubbleSeekBar.this.isThumbOnDragging = false;
            BubbleSeekBar.this.isTouchToSeekAnimEnd = true;
            BubbleSeekBar.this.invalidate();
            if (BubbleSeekBar.this.mProgressListener != null) {
                InterfaceC22999k interfaceC22999k = BubbleSeekBar.this.mProgressListener;
                BubbleSeekBar bubbleSeekBar2 = BubbleSeekBar.this;
                interfaceC22999k.mo54986c(bubbleSeekBar2, bubbleSeekBar2.getProgress(), BubbleSeekBar.this.getProgressFloat(), true);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar$g */
    public class C22995g extends AnimatorListenerAdapter {
        public C22995g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BubbleSeekBar.this.mWindowManager.addView(BubbleSeekBar.this.mBubbleView, BubbleSeekBar.this.mLayoutParams);
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar$h */
    public class RunnableC22996h implements Runnable {
        public RunnableC22996h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.showBubble();
            BubbleSeekBar.this.triggerBubbleShowing = true;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar$i */
    public interface InterfaceC22997i {
        @NonNull
        /* JADX INFO: renamed from: a */
        SparseArray<String> mo40278a(int i11, @NonNull SparseArray<String> sparseArray);
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar$j */
    public interface InterfaceC22998j {
        /* JADX INFO: renamed from: a */
        String mo40277a(String str);
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar$k */
    public interface InterfaceC22999k {
        /* JADX INFO: renamed from: a */
        void mo54985a(BubbleSeekBar bubbleSeekBar, int i11, float f11, boolean z11);

        /* JADX INFO: renamed from: b */
        void mo37833b(BubbleSeekBar bubbleSeekBar, int i11, float f11);

        /* JADX INFO: renamed from: c */
        void mo54986c(BubbleSeekBar bubbleSeekBar, int i11, float f11, boolean z11);
    }

    public BubbleSeekBar(Context context) {
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
            valueAnimatorOfFloat.addUpdateListener(new C22993e());
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
        animatorSet.addListener(new C22994f());
        animatorSet.start();
    }

    private float formatFloat(float f11) {
        try {
            return BigDecimal.valueOf(f11).setScale(1, this.roundMode).floatValue();
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public BubbleSeekBar(Context context, AttributeSet attributeSet) {
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
        int iM55029a = C23008b.m55029a(14);
        this.mBubbleRadius = iM55029a;
        this.mBubbleRadius = Math.max(iM55029a, Math.max(iWidth, iWidth2)) + this.mTextSpace;
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
            this.mSecondTrackSize = i12 + C23008b.m55029a(2);
        }
        int i13 = this.mThumbRadius;
        int i14 = this.mSecondTrackSize;
        if (i13 <= i14) {
            this.mThumbRadius = i14 + C23008b.m55029a(2);
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
        float measuredHeight = this.mPoint[1] - this.mBubbleView.getMeasuredHeight();
        this.mBubbleCenterRawSolidY = measuredHeight;
        float fM55029a = measuredHeight - C23008b.m55029a(24);
        this.mBubbleCenterRawSolidY = fM55029a;
        this.mBubbleCenterRawSolidY = fM55029a - (Math.max(this.mThumbRadius, this.mThumbRadiusOnDragging) + C23008b.m55029a(3));
        if (C23008b.m55030b()) {
            this.mBubbleCenterRawSolidY -= C23008b.m55029a(4);
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
        this.mBubbleView.animate().alpha(1.0f).setDuration(this.isTouchToSeek ? 0L : this.mAnimDuration).setListener(new C22995g()).start();
        this.mBubbleView.m54984a(this.isShowProgressInFloat ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
    }

    public void config(C23007a c23007a) {
        this.mMin = c23007a.f44362a;
        this.mMax = c23007a.f44363b;
        this.mProgress = c23007a.f44364c;
        this.isFloatType = c23007a.f44365d;
        this.mTrackSize = c23007a.f44366e;
        this.mSecondTrackSize = c23007a.f44367f;
        this.mThumbRadius = c23007a.f44368g;
        this.mThumbRadiusOnDragging = c23007a.f44369h;
        this.mTrackColor = c23007a.f44370i;
        this.mSecondTrackColor = c23007a.f44371j;
        this.mThumbColor = c23007a.f44372k;
        this.mSectionCount = c23007a.f44373l;
        this.isShowSectionMark = c23007a.f44374m;
        this.isAutoAdjustSectionMark = c23007a.f44375n;
        this.isShowSectionText = c23007a.f44376o;
        this.mSectionTextSize = c23007a.f44377p;
        this.mSectionTextColor = c23007a.f44378q;
        this.mSectionTextPosition = c23007a.f44379r;
        this.mSectionTextInterval = c23007a.f44380s;
        this.isShowThumbText = c23007a.f44381t;
        this.mThumbTextSize = c23007a.f44382u;
        this.mThumbTextColor = c23007a.f44383v;
        this.isShowProgressInFloat = c23007a.f44384w;
        this.mAnimDuration = c23007a.f44385x;
        this.isTouchToSeek = c23007a.f44386y;
        this.isSeekStepSection = c23007a.f44387z;
        this.isSeekBySection = c23007a.f44350A;
        this.mBubbleColor = c23007a.f44351B;
        this.mBubbleTextSize = c23007a.f44352C;
        this.mBubbleTextColor = c23007a.f44353D;
        this.isAlwaysShowBubble = c23007a.f44354E;
        this.mAlwaysShowBubbleDelay = c23007a.f44355F;
        this.isHideBubble = c23007a.f44356G;
        this.isRtl = c23007a.f44357H;
        this.roundMode = c23007a.f44358I;
        this.hideNoTextSectionMark = c23007a.f44360K;
        this.mCanSeek = Boolean.valueOf(c23007a.f44359J);
        initConfigByPriority();
        calculateRadiusOfBubble();
        InterfaceC22999k interfaceC22999k = this.mProgressListener;
        if (interfaceC22999k != null) {
            interfaceC22999k.mo54985a(this, getProgress(), getProgressFloat(), false);
            this.mProgressListener.mo54986c(this, getProgress(), getProgressFloat(), false);
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

    public C23007a getConfigBuilder() {
        if (this.mConfigBuilder == null) {
            this.mConfigBuilder = new C23007a(this);
        }
        C23007a c23007a = this.mConfigBuilder;
        c23007a.f44362a = this.mMin;
        c23007a.f44363b = this.mMax;
        c23007a.f44364c = this.mProgress;
        c23007a.f44365d = this.isFloatType;
        c23007a.f44366e = this.mTrackSize;
        c23007a.f44367f = this.mSecondTrackSize;
        c23007a.f44368g = this.mThumbRadius;
        c23007a.f44369h = this.mThumbRadiusOnDragging;
        c23007a.f44370i = this.mTrackColor;
        c23007a.f44371j = this.mSecondTrackColor;
        c23007a.f44372k = this.mThumbColor;
        c23007a.f44373l = this.mSectionCount;
        c23007a.f44374m = this.isShowSectionMark;
        c23007a.f44375n = this.isAutoAdjustSectionMark;
        c23007a.f44376o = this.isShowSectionText;
        c23007a.f44377p = this.mSectionTextSize;
        c23007a.f44378q = this.mSectionTextColor;
        c23007a.f44379r = this.mSectionTextPosition;
        c23007a.f44380s = this.mSectionTextInterval;
        c23007a.f44381t = this.isShowThumbText;
        c23007a.f44382u = this.mThumbTextSize;
        c23007a.f44383v = this.mThumbTextColor;
        c23007a.f44384w = this.isShowProgressInFloat;
        c23007a.f44385x = this.mAnimDuration;
        c23007a.f44386y = this.isTouchToSeek;
        c23007a.f44387z = this.isSeekStepSection;
        c23007a.f44350A = this.isSeekBySection;
        c23007a.f44351B = this.mBubbleColor;
        c23007a.f44352C = this.mBubbleTextSize;
        c23007a.f44353D = this.mBubbleTextColor;
        c23007a.f44354E = this.isAlwaysShowBubble;
        c23007a.f44355F = this.mAlwaysShowBubbleDelay;
        c23007a.f44356G = this.isHideBubble;
        c23007a.f44357H = this.isRtl;
        c23007a.f44358I = this.roundMode;
        c23007a.f44360K = this.hideNoTextSectionMark;
        return c23007a;
    }

    public float getMax() {
        return this.mMax;
    }

    public float getMin() {
        return this.mMin;
    }

    public InterfaceC22999k getOnProgressChangedListener() {
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
            bubbleView.m54984a(this.isShowProgressInFloat ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
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
        InterfaceC22999k interfaceC22999k;
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
            this.f44261dx = this.mThumbCenterX - motionEvent.getX();
        } else if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            if (this.isAutoAdjustSectionMark) {
                if (this.isTouchToSeek) {
                    postDelayed(new RunnableC22990b(), this.mAnimDuration);
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
                    duration.setStartDelay(j11).setListener(new C22991c()).start();
                } else {
                    postDelayed(new RunnableC22992d(), this.mAnimDuration);
                }
            }
            interfaceC22999k = this.mProgressListener;
            if (interfaceC22999k != null) {
                interfaceC22999k.mo54985a(this, getProgress(), getProgressFloat(), true);
                this.mProgressListener.mo37833b(this, getProgress(), getProgressFloat());
            }
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                getParent().requestDisallowInterceptTouchEvent(false);
                if (this.isAutoAdjustSectionMark) {
                    if (this.isTouchToSeek) {
                        postDelayed(new RunnableC22990b(), this.mAnimDuration);
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
                        duration2.setStartDelay(j11).setListener(new C22991c()).start();
                    } else {
                        postDelayed(new RunnableC22992d(), this.mAnimDuration);
                    }
                } else if (this.isHideBubble) {
                    ViewPropertyAnimator duration3 = animate().setDuration(this.mAnimDuration);
                    if (this.isThumbOnDragging) {
                        j11 = 0;
                    } else {
                        j11 = 0;
                    }
                    duration3.setStartDelay(j11).setListener(new C22991c()).start();
                } else {
                    postDelayed(new RunnableC22992d(), this.mAnimDuration);
                }
                interfaceC22999k = this.mProgressListener;
                if (interfaceC22999k != null) {
                    interfaceC22999k.mo54985a(this, getProgress(), getProgressFloat(), true);
                    this.mProgressListener.mo37833b(this, getProgress(), getProgressFloat());
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
                float x12 = motionEvent.getX() + this.f44261dx;
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
                this.mBubbleView.m54984a(this.isShowProgressInFloat ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
            }
            invalidate();
            InterfaceC22999k interfaceC22999k2 = this.mProgressListener;
            if (interfaceC22999k2 != null) {
                interfaceC22999k2.mo54985a(this, getProgress(), getProgressFloat(), true);
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

    public void setCustomSectionTextArray(@NonNull InterfaceC22997i interfaceC22997i) {
        this.mSectionTextArray = interfaceC22997i.mo40278a(this.mSectionCount, this.mSectionTextArray);
        for (int i11 = 0; i11 <= this.mSectionCount; i11++) {
            if (this.mSectionTextArray.get(i11) == null) {
                this.mSectionTextArray.put(i11, "");
            }
        }
        this.isShowThumbText = false;
        requestLayout();
        invalidate();
    }

    public void setOnProgressChangedListener(InterfaceC22999k interfaceC22999k) {
        this.mProgressListener = interfaceC22999k;
    }

    public void setProgress(float f11) {
        this.mProgress = f11;
        InterfaceC22999k interfaceC22999k = this.mProgressListener;
        if (interfaceC22999k != null) {
            interfaceC22999k.mo54985a(this, getProgress(), getProgressFloat(), false);
            this.mProgressListener.mo54986c(this, getProgress(), getProgressFloat(), false);
        }
        if (!this.isHideBubble) {
            this.mBubbleCenterRawX = calculateCenterRawXofBubbleView();
        }
        if (this.isAlwaysShowBubble) {
            hideBubble();
            postDelayed(new RunnableC22996h(), this.mAlwaysShowBubbleDelay);
        }
        if (this.isSeekBySection) {
            this.triggerSeekBySection = false;
        }
        postInvalidate();
    }

    public void setProgressFormatCallback(InterfaceC22998j interfaceC22998j) {
        this.mFormatCallback = interfaceC22998j;
    }

    public void setSecondTrackColor(@ColorInt int i11) {
        if (this.mSecondTrackColor != i11) {
            this.mSecondTrackColor = i11;
            invalidate();
        }
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

    public BubbleSeekBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mSectionTextPosition = -1;
        this.roundMode = 4;
        this.mSectionTextArray = new SparseArray<>();
        this.mPoint = new int[2];
        this.isTouchToSeekAnimEnd = true;
        this.mCanSeek = Boolean.TRUE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BubbleSeekBar, i11, 0);
        this.mMin = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_min, 0.0f);
        this.mMax = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_max, 100.0f);
        this.mProgress = typedArrayObtainStyledAttributes.getFloat(R$styleable.BubbleSeekBar_bsb_progress, this.mMin);
        this.isFloatType = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_is_float_type, false);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_track_size, C23008b.m55029a(2));
        this.mTrackSize = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_second_track_size, dimensionPixelSize + C23008b.m55029a(2));
        this.mSecondTrackSize = dimensionPixelSize2;
        this.mTrackRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_track_radius, dimensionPixelSize2 + C23008b.m55029a(2));
        this.mThumbRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_radius, this.mSecondTrackSize + C23008b.m55029a(2));
        this.mThumbRadiusOnDragging = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_radius_on_dragging, this.mSecondTrackSize * 2);
        this.mSectionCount = typedArrayObtainStyledAttributes.getInteger(R$styleable.BubbleSeekBar_bsb_section_count, 10);
        this.mFillSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_fill_size, C23008b.m55029a(2));
        int i12 = R$styleable.BubbleSeekBar_bsb_fill_color;
        int i13 = R$color.emphasis;
        this.mFillColor = typedArrayObtainStyledAttributes.getColor(i12, ContextCompat.getColor(context, i13));
        this.mTrackColor = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_track_color, ContextCompat.getColor(context, i13));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_second_track_color, ContextCompat.getColor(context, i13));
        this.mSecondTrackColor = color;
        this.mThumbColor = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_thumb_color, color);
        this.isShowSectionText = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_show_section_text, false);
        this.mSectionTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_section_text_size, C23008b.m55031c(14));
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
        this.mThumbTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_thumb_text_size, C23008b.m55031c(14));
        this.mThumbTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_thumb_text_color, this.mSecondTrackColor);
        this.mBubbleColor = typedArrayObtainStyledAttributes.getColor(R$styleable.BubbleSeekBar_bsb_bubble_color, this.mSecondTrackColor);
        this.mBubbleTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BubbleSeekBar_bsb_bubble_text_size, C23008b.m55031c(14));
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
        this.isRtl = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_bsb_rtl, false);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.BubbleSeekBar_android_enabled, isEnabled()));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mPaint.setTextAlign(Paint.Align.CENTER);
        this.mRectText = new Rect();
        this.mTextSpace = C23008b.m55029a(2);
        initConfigByPriority();
        if (this.isHideBubble) {
            return;
        }
        this.mWindowManager = (WindowManager) context.getSystemService(InterfaceC33953u5.f72199F);
        BubbleView bubbleView = new BubbleView(this, context);
        this.mBubbleView = bubbleView;
        bubbleView.m54984a(this.isShowProgressInFloat ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.mLayoutParams = layoutParams;
        layoutParams.gravity = 8388659;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.flags = 524328;
        if (!C23008b.m55030b() && Build.VERSION.SDK_INT < 25) {
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
        if (((motionEvent.getX() - f11) * (motionEvent.getX() - f11)) + ((motionEvent.getY() - measuredHeight) * (motionEvent.getY() - measuredHeight)) > (this.mLeft + C23008b.m55029a(8)) * (this.mLeft + C23008b.m55029a(8))) {
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

    /* JADX WARN: Code duplicated, block: B:100:0x02c8  */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f11;
        float f12;
        boolean z11;
        float fAbs;
        int i11;
        int i12;
        int i13;
        int i14;
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float measuredWidth = getMeasuredWidth() - getPaddingRight();
        float paddingTop = getPaddingTop() + this.mThumbRadiusOnDragging;
        if (this.isShowSectionText) {
            this.mPaint.setColor(this.mSectionTextColor);
            this.mPaint.setTextSize(this.mSectionTextSize);
            this.mPaint.getTextBounds("0123456789", 0, 10, this.mRectText);
            int i15 = this.mSectionTextPosition;
            if (i15 == 0) {
                float fHeight = (this.mRectText.height() / 2.0f) + paddingTop;
                String str = this.mSectionTextArray.get(0);
                this.mPaint.getTextBounds(str, 0, str.length(), this.mRectText);
                canvas.drawText(str, (this.mRectText.width() / 2.0f) + paddingLeft, fHeight, this.mPaint);
                paddingLeft += this.mRectText.width() + this.mTextSpace;
                String str2 = this.mSectionTextArray.get(this.mSectionCount);
                this.mPaint.getTextBounds(str2, 0, str2.length(), this.mRectText);
                canvas.drawText(str2, measuredWidth - ((this.mRectText.width() + 0.5f) / 2.0f), fHeight, this.mPaint);
                measuredWidth -= this.mRectText.width() + this.mTextSpace;
            } else if (i15 >= 1) {
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
            int i16 = this.mThumbRadiusOnDragging;
            paddingLeft += i16;
            measuredWidth -= i16;
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
        if (this.isShowSectionText && this.mSectionTextPosition == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || this.isShowSectionMark) {
            this.mPaint.setTextSize(this.mSectionTextSize);
            this.mPaint.getTextBounds("0123456789", 0, 10, this.mRectText);
            float fHeight3 = this.mRectText.height() + paddingTop + this.mThumbRadiusOnDragging + this.mTextSpace;
            if (this.isRtl) {
                fAbs = this.mRight - ((this.mTrackLength / this.mDelta) * Math.abs(this.mProgress - this.mMin));
            } else {
                fAbs = this.mLeft + ((this.mTrackLength / this.mDelta) * Math.abs(this.mProgress - this.mMin));
            }
            for (int i17 = 0; i17 <= this.mSectionCount; i17++) {
                if (!this.hideNoTextSectionMark || !TextUtils.isEmpty(this.mSectionTextArray.get(i17))) {
                    float f18 = (i17 * this.mSectionOffset) + f12;
                    this.mPaint.setColor(this.mFillColor);
                    canvas2.drawCircle(f18, paddingTop, this.mTrackRadius, this.mPaint);
                    if (this.isRtl) {
                        Paint paint = this.mPaint;
                        if (f18 <= fAbs) {
                            i12 = this.mTrackColor;
                        } else {
                            i12 = this.mSecondTrackColor;
                        }
                        paint.setColor(i12);
                    } else {
                        Paint paint2 = this.mPaint;
                        if (f18 <= fAbs) {
                            i11 = this.mSecondTrackColor;
                        } else {
                            i11 = this.mTrackColor;
                        }
                        paint2.setColor(i11);
                    }
                    canvas2.drawCircle(f18, paddingTop, this.mTrackRadius - this.mFillSize, this.mPaint);
                    if (z11) {
                        this.mPaint.setColor(this.mSectionTextColor);
                        if (this.mSectionTextArray.get(i17, null) != null) {
                            canvas2.drawText(this.mSectionTextArray.get(i17), f18, fHeight3, this.mPaint);
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
            if (!this.isFloatType) {
                if (this.isShowProgressInFloat && this.mSectionTextPosition == 1) {
                    float f19 = this.mProgress;
                    if (f19 != this.mMin && f19 != this.mMax) {
                        canvas2.drawText(String.valueOf(getProgressFloat()), this.mThumbCenterX, fHeight4, this.mPaint);
                    }
                }
                canvas2.drawText(String.valueOf(getProgress()), this.mThumbCenterX, fHeight4, this.mPaint);
            } else {
                canvas2.drawText(String.valueOf(getProgressFloat()), this.mThumbCenterX, fHeight4, this.mPaint);
            }
        }
        this.mPaint.setColor(this.mThumbColor);
        float f21 = this.mThumbCenterX;
        if (this.isThumbOnDragging) {
            i13 = this.mThumbRadiusOnDragging;
        } else {
            i13 = this.mThumbRadius;
        }
        canvas2.drawCircle(f21, paddingTop, i13, this.mPaint);
        this.mPaint.setColor(this.mFillColor);
        float f22 = this.mThumbCenterX;
        if (this.isThumbOnDragging) {
            i14 = this.mThumbRadiusOnDragging;
        } else {
            i14 = this.mThumbRadius;
        }
        canvas2.drawCircle(f22, paddingTop, i14 - this.mFillSize, this.mPaint);
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
        setMeasuredDimension(View.resolveSize(C23008b.m55029a(180), i11), iMax + (this.mTextSpace * 2));
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
        post(new RunnableC22989a());
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setCustomStartHandle(InterfaceC23009c interfaceC23009c) {
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar$l */
    public static abstract class AbstractC23000l implements InterfaceC22999k {
        @Override // com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar.InterfaceC22999k
        /* JADX INFO: renamed from: b */
        public void mo37833b(BubbleSeekBar bubbleSeekBar, int i11, float f11) {
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar.InterfaceC22999k
        /* JADX INFO: renamed from: a */
        public void mo54985a(BubbleSeekBar bubbleSeekBar, int i11, float f11, boolean z11) {
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.BubbleSeekBar.InterfaceC22999k
        /* JADX INFO: renamed from: c */
        public void mo54986c(BubbleSeekBar bubbleSeekBar, int i11, float f11, boolean z11) {
        }
    }
}
