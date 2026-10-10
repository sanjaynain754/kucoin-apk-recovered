package com.wang.avi;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.tencent.bugly.proguard.C33978va;
import com.wang.avi.indicators.BallPulseIndicator;

/* JADX INFO: loaded from: classes60.dex */
public class AVLoadingIndicatorView extends View {
    private static final BallPulseIndicator DEFAULT_INDICATOR = new BallPulseIndicator();
    private static final int MIN_DELAY = 500;
    private static final int MIN_SHOW_TIME = 500;
    private static final String TAG = "AVLoadingIndicatorView";
    private final Runnable mDelayedHide;
    private final Runnable mDelayedShow;
    private boolean mDismissed;
    private Indicator mIndicator;
    private int mIndicatorColor;
    int mMaxHeight;
    int mMaxWidth;
    int mMinHeight;
    int mMinWidth;
    private boolean mPostedHide;
    private boolean mPostedShow;
    private boolean mShouldStartAnimationDrawable;
    private long mStartTime;

    public AVLoadingIndicatorView(Context context) {
        super(context);
        this.mStartTime = -1L;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.mDelayedHide = new Runnable() { // from class: com.wang.avi.AVLoadingIndicatorView.1
            @Override // java.lang.Runnable
            public void run() {
                AVLoadingIndicatorView.this.mPostedHide = false;
                AVLoadingIndicatorView.this.mStartTime = -1L;
                AVLoadingIndicatorView.this.setVisibility(8);
            }
        };
        this.mDelayedShow = new Runnable() { // from class: com.wang.avi.AVLoadingIndicatorView.2
            @Override // java.lang.Runnable
            public void run() {
                AVLoadingIndicatorView.this.mPostedShow = false;
                if (AVLoadingIndicatorView.this.mDismissed) {
                    return;
                }
                AVLoadingIndicatorView.this.mStartTime = System.currentTimeMillis();
                AVLoadingIndicatorView.this.setVisibility(0);
            }
        };
        init(context, null, 0, 0);
    }

    public void hide() {
        this.mDismissed = true;
        removeCallbacks(this.mDelayedShow);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = this.mStartTime;
        long j12 = jCurrentTimeMillis - j11;
        if (j12 >= 500 || j11 == -1) {
            setVisibility(8);
        } else {
            if (this.mPostedHide) {
                return;
            }
            postDelayed(this.mDelayedHide, 500 - j12);
            this.mPostedHide = true;
        }
    }

    @Override // android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawTrack(canvas);
    }

    @Override // android.view.View
    public synchronized void onMeasure(int i11, int i12) {
        int iMax;
        int iMax2;
        try {
            Indicator indicator = this.mIndicator;
            if (indicator != null) {
                iMax2 = Math.max(this.mMinWidth, Math.min(this.mMaxWidth, indicator.getIntrinsicWidth()));
                iMax = Math.max(this.mMinHeight, Math.min(this.mMaxHeight, indicator.getIntrinsicHeight()));
            } else {
                iMax = 0;
                iMax2 = 0;
            }
            updateDrawableState();
            setMeasuredDimension(View.resolveSizeAndState(iMax2 + getPaddingLeft() + getPaddingRight(), i11, 0), View.resolveSizeAndState(iMax + getPaddingTop() + getPaddingBottom(), i12, 0));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void setIndicator(Indicator indicator) {
        Indicator indicator2 = this.mIndicator;
        if (indicator2 != indicator) {
            if (indicator2 != null) {
                indicator2.setCallback(null);
                unscheduleDrawable(this.mIndicator);
            }
            this.mIndicator = indicator;
            setIndicatorColor(this.mIndicatorColor);
            if (indicator != null) {
                indicator.setCallback(this);
            }
            postInvalidate();
        }
    }

    private void init(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.mMinWidth = 24;
        this.mMaxWidth = 48;
        this.mMinHeight = 24;
        this.mMaxHeight = 48;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C36463R.styleable.AVLoadingIndicatorView, i11, i12);
        this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C36463R.styleable.AVLoadingIndicatorView_minWidth, this.mMinWidth);
        this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C36463R.styleable.AVLoadingIndicatorView_maxWidth, this.mMaxWidth);
        this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C36463R.styleable.AVLoadingIndicatorView_minHeight, this.mMinHeight);
        this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C36463R.styleable.AVLoadingIndicatorView_maxHeight, this.mMaxHeight);
        String string = typedArrayObtainStyledAttributes.getString(C36463R.styleable.AVLoadingIndicatorView_indicatorName);
        this.mIndicatorColor = typedArrayObtainStyledAttributes.getColor(C36463R.styleable.AVLoadingIndicatorView_indicatorColor, -1);
        setIndicator(string);
        if (this.mIndicator == null) {
            setIndicator(DEFAULT_INDICATOR);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void removeCallbacks() {
        removeCallbacks(this.mDelayedHide);
        removeCallbacks(this.mDelayedShow);
    }

    public void drawTrack(Canvas canvas) {
        Indicator indicator = this.mIndicator;
        if (indicator != null) {
            int iSave = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            indicator.draw(canvas);
            canvas.restoreToCount(iSave);
            if (this.mShouldStartAnimationDrawable) {
                indicator.start();
                this.mShouldStartAnimationDrawable = false;
            }
        }
    }

    public Indicator getIndicator() {
        return this.mIndicator;
    }

    public void setIndicatorColor(int i11) {
        this.mIndicatorColor = i11;
        this.mIndicator.setColor(i11);
    }

    public void show() {
        this.mStartTime = -1L;
        this.mDismissed = false;
        removeCallbacks(this.mDelayedHide);
        if (this.mPostedShow) {
            return;
        }
        postDelayed(this.mDelayedShow, 500L);
        this.mPostedShow = true;
    }

    public void stopAnimation() {
        if (this.mIndicator != null) {
            this.mIndicator.stop();
            this.mShouldStartAnimationDrawable = false;
        }
        postInvalidate();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.mIndicator || super.verifyDrawable(drawable);
    }

    private void updateDrawableBounds(int i11, int i12) {
        int i13;
        int paddingRight = i11 - (getPaddingRight() + getPaddingLeft());
        int paddingTop = i12 - (getPaddingTop() + getPaddingBottom());
        Indicator indicator = this.mIndicator;
        if (indicator != null) {
            float intrinsicWidth = indicator.getIntrinsicWidth() / this.mIndicator.getIntrinsicHeight();
            float f11 = paddingRight;
            float f12 = paddingTop;
            float f13 = f11 / f12;
            int i14 = 0;
            if (intrinsicWidth != f13) {
                if (f13 > intrinsicWidth) {
                    int i15 = (int) (f12 * intrinsicWidth);
                    int i16 = (paddingRight - i15) / 2;
                    i14 = i16;
                    paddingRight = i15 + i16;
                    i13 = 0;
                } else {
                    int i17 = (int) (f11 * (1.0f / intrinsicWidth));
                    int i18 = (paddingTop - i17) / 2;
                    int i19 = i17 + i18;
                    i13 = i18;
                    paddingTop = i19;
                }
            } else {
                i13 = 0;
            }
            this.mIndicator.setBounds(i14, i13, paddingRight, paddingTop);
        }
    }

    private void updateDrawableState() {
        int[] drawableState = getDrawableState();
        Indicator indicator = this.mIndicator;
        if (indicator != null && indicator.isStateful()) {
            this.mIndicator.setState(drawableState);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f11, float f12) {
        super.drawableHotspotChanged(f11, f12);
        Indicator indicator = this.mIndicator;
        if (indicator != null) {
            indicator.setHotspot(f11, f12);
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        updateDrawableState();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (verifyDrawable(drawable)) {
            Rect bounds = drawable.getBounds();
            int scrollX = getScrollX() + getPaddingLeft();
            int scrollY = getScrollY() + getPaddingTop();
            invalidate(bounds.left + scrollX, bounds.top + scrollY, bounds.right + scrollX, bounds.bottom + scrollY);
            return;
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAnimation();
        removeCallbacks();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        stopAnimation();
        super.onDetachedFromWindow();
        removeCallbacks();
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        updateDrawableBounds(i11, i12);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (i11 != 8 && i11 != 4) {
            startAnimation();
        } else {
            stopAnimation();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        if (getVisibility() != i11) {
            super.setVisibility(i11);
            if (i11 != 8 && i11 != 4) {
                startAnimation();
            } else {
                stopAnimation();
            }
        }
    }

    public void smoothToHide() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_out));
        setVisibility(8);
    }

    public void smoothToShow() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_in));
        setVisibility(0);
    }

    public void startAnimation() {
        if (getVisibility() != 0) {
            return;
        }
        if (this.mIndicator != null) {
            this.mShouldStartAnimationDrawable = true;
        }
        postInvalidate();
    }

    public void setIndicator(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (!str.contains(C33978va.f72339h)) {
            sb2.append(getClass().getPackage().getName());
            sb2.append(".indicators");
            sb2.append(C33978va.f72339h);
        }
        sb2.append(str);
        try {
            setIndicator((Indicator) Class.forName(sb2.toString()).newInstance());
        } catch (ClassNotFoundException unused) {
            Log.e(TAG, "Didn't find your class , check the name again !");
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
        } catch (InstantiationException e12) {
            e12.printStackTrace();
        }
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mStartTime = -1L;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.mDelayedHide = new Runnable() { // from class: com.wang.avi.AVLoadingIndicatorView.1
            @Override // java.lang.Runnable
            public void run() {
                AVLoadingIndicatorView.this.mPostedHide = false;
                AVLoadingIndicatorView.this.mStartTime = -1L;
                AVLoadingIndicatorView.this.setVisibility(8);
            }
        };
        this.mDelayedShow = new Runnable() { // from class: com.wang.avi.AVLoadingIndicatorView.2
            @Override // java.lang.Runnable
            public void run() {
                AVLoadingIndicatorView.this.mPostedShow = false;
                if (AVLoadingIndicatorView.this.mDismissed) {
                    return;
                }
                AVLoadingIndicatorView.this.mStartTime = System.currentTimeMillis();
                AVLoadingIndicatorView.this.setVisibility(0);
            }
        };
        init(context, attributeSet, 0, C36463R.style.AVLoadingIndicatorView);
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mStartTime = -1L;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.mDelayedHide = new Runnable() { // from class: com.wang.avi.AVLoadingIndicatorView.1
            @Override // java.lang.Runnable
            public void run() {
                AVLoadingIndicatorView.this.mPostedHide = false;
                AVLoadingIndicatorView.this.mStartTime = -1L;
                AVLoadingIndicatorView.this.setVisibility(8);
            }
        };
        this.mDelayedShow = new Runnable() { // from class: com.wang.avi.AVLoadingIndicatorView.2
            @Override // java.lang.Runnable
            public void run() {
                AVLoadingIndicatorView.this.mPostedShow = false;
                if (AVLoadingIndicatorView.this.mDismissed) {
                    return;
                }
                AVLoadingIndicatorView.this.mStartTime = System.currentTimeMillis();
                AVLoadingIndicatorView.this.setVisibility(0);
            }
        };
        init(context, attributeSet, i11, C36463R.style.AVLoadingIndicatorView);
    }

    @TargetApi(21)
    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.mStartTime = -1L;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.mDelayedHide = new Runnable() { // from class: com.wang.avi.AVLoadingIndicatorView.1
            @Override // java.lang.Runnable
            public void run() {
                AVLoadingIndicatorView.this.mPostedHide = false;
                AVLoadingIndicatorView.this.mStartTime = -1L;
                AVLoadingIndicatorView.this.setVisibility(8);
            }
        };
        this.mDelayedShow = new Runnable() { // from class: com.wang.avi.AVLoadingIndicatorView.2
            @Override // java.lang.Runnable
            public void run() {
                AVLoadingIndicatorView.this.mPostedShow = false;
                if (AVLoadingIndicatorView.this.mDismissed) {
                    return;
                }
                AVLoadingIndicatorView.this.mStartTime = System.currentTimeMillis();
                AVLoadingIndicatorView.this.setVisibility(0);
            }
        };
        init(context, attributeSet, i11, C36463R.style.AVLoadingIndicatorView);
    }
}
