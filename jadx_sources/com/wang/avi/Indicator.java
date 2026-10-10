package com.wang.avi;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes60.dex */
public abstract class Indicator extends Drawable implements Animatable {
    private static final Rect ZERO_BOUNDS_RECT = new Rect();
    private ArrayList<ValueAnimator> mAnimators;
    private boolean mHasAnimators;
    private Paint mPaint;
    private HashMap<ValueAnimator, ValueAnimator.AnimatorUpdateListener> mUpdateListeners = new HashMap<>();
    private int alpha = 255;
    protected Rect drawBounds = ZERO_BOUNDS_RECT;

    private void startAnimators() {
        for (int i11 = 0; i11 < this.mAnimators.size(); i11++) {
            ValueAnimator valueAnimator = this.mAnimators.get(i11);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.mUpdateListeners.get(valueAnimator);
            if (animatorUpdateListener != null) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
            }
            valueAnimator.start();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        draw(canvas, this.mPaint);
    }

    public abstract void draw(Canvas canvas, Paint paint);

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public abstract ArrayList<ValueAnimator> onCreateAnimators();

    public void setDrawBounds(Rect rect) {
        setDrawBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void ensureAnimators() {
        if (this.mHasAnimators) {
            return;
        }
        this.mAnimators = onCreateAnimators();
        this.mHasAnimators = true;
    }

    private boolean isStarted() {
        Iterator<ValueAnimator> it = this.mAnimators.iterator();
        if (it.hasNext()) {
            return it.next().isStarted();
        }
        return false;
    }

    private void stopAnimators() {
        ArrayList<ValueAnimator> arrayList = this.mAnimators;
        if (arrayList != null) {
            for (ValueAnimator valueAnimator : arrayList) {
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    valueAnimator.removeAllUpdateListeners();
                    valueAnimator.end();
                }
            }
        }
    }

    public void addUpdateListener(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.mUpdateListeners.put(valueAnimator, animatorUpdateListener);
    }

    public int centerX() {
        return this.drawBounds.centerX();
    }

    public int centerY() {
        return this.drawBounds.centerY();
    }

    public float exactCenterX() {
        return this.drawBounds.exactCenterX();
    }

    public float exactCenterY() {
        return this.drawBounds.exactCenterY();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    public int getColor() {
        return this.mPaint.getColor();
    }

    public Rect getDrawBounds() {
        return this.drawBounds;
    }

    public int getHeight() {
        return this.drawBounds.height();
    }

    public int getWidth() {
        return this.drawBounds.width();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Iterator<ValueAnimator> it = this.mAnimators.iterator();
        if (it.hasNext()) {
            return it.next().isRunning();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.alpha = i11;
    }

    public void setColor(int i11) {
        this.mPaint.setColor(i11);
    }

    public void setDrawBounds(int i11, int i12, int i13, int i14) {
        this.drawBounds = new Rect(i11, i12, i13, i14);
    }

    public Indicator() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(-1);
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setDrawBounds(rect);
    }

    public void postInvalidate() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        ensureAnimators();
        if (this.mAnimators == null || isStarted()) {
            return;
        }
        startAnimators();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        stopAnimators();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
