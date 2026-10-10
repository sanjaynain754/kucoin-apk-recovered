package androidx.media3.p022ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class DefaultTimeBar extends View implements TimeBar {
    private static final String ACCESSIBILITY_CLASS_NAME = "android.widget.SeekBar";
    public static final int BAR_GRAVITY_BOTTOM = 1;
    public static final int BAR_GRAVITY_CENTER = 0;
    public static final int DEFAULT_AD_MARKER_COLOR = -1291845888;
    public static final int DEFAULT_AD_MARKER_WIDTH_DP = 4;
    public static final int DEFAULT_BAR_HEIGHT_DP = 4;
    public static final int DEFAULT_BUFFERED_COLOR = -855638017;
    private static final int DEFAULT_INCREMENT_COUNT = 20;
    public static final int DEFAULT_PLAYED_AD_MARKER_COLOR = 872414976;
    public static final int DEFAULT_PLAYED_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_DISABLED_SIZE_DP = 0;
    public static final int DEFAULT_SCRUBBER_DRAGGED_SIZE_DP = 16;
    public static final int DEFAULT_SCRUBBER_ENABLED_SIZE_DP = 12;
    public static final int DEFAULT_TOUCH_TARGET_HEIGHT_DP = 26;
    public static final int DEFAULT_UNPLAYED_COLOR = 872415231;
    private static final int FINE_SCRUB_RATIO = 3;
    private static final int FINE_SCRUB_Y_THRESHOLD_DP = -50;
    private static final float HIDDEN_SCRUBBER_SCALE = 0.0f;
    private static final float SHOWN_SCRUBBER_SCALE = 1.0f;
    private static final long STOP_SCRUBBING_TIMEOUT_MS = 1000;
    private int adGroupCount;

    @Nullable
    private long[] adGroupTimesMs;
    private final Paint adMarkerPaint;
    private final int adMarkerWidth;
    private final int barGravity;
    private final int barHeight;
    private final Rect bufferedBar;
    private final Paint bufferedPaint;
    private long bufferedPosition;
    private final float density;
    private long duration;
    private final int fineScrubYThreshold;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private int keyCountIncrement;
    private long keyTimeIncrement;
    private int lastCoarseScrubXPosition;
    private Rect lastExclusionRectangle;
    private final CopyOnWriteArraySet<TimeBar.OnScrubListener> listeners;

    @Nullable
    private boolean[] playedAdGroups;
    private final Paint playedAdMarkerPaint;
    private final Paint playedPaint;
    private long position;
    private final Rect progressBar;
    private long scrubPosition;
    private final Rect scrubberBar;
    private final int scrubberDisabledSize;
    private final int scrubberDraggedSize;

    @Nullable
    private final Drawable scrubberDrawable;
    private final int scrubberEnabledSize;
    private final int scrubberPadding;
    private boolean scrubberPaddingDisabled;
    private final Paint scrubberPaint;
    private float scrubberScale;
    private ValueAnimator scrubberScalingAnimator;
    private boolean scrubbing;
    private final Rect seekBounds;
    private final Runnable stopScrubbingRunnable;
    private final Point touchPosition;
    private final int touchTargetHeight;
    private final Paint unplayedPaint;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    private static int dpToPx(float f11, int i11) {
        return (int) ((i11 * f11) + 0.5f);
    }

    private static int pxToDp(float f11, int i11) {
        return (int) (i11 / f11);
    }

    private boolean setDrawableLayoutDirection(Drawable drawable) {
        return Util.SDK_INT >= 23 && setDrawableLayoutDirection(drawable, getLayoutDirection());
    }

    public void hideScrubber(boolean z11) {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberPaddingDisabled = z11;
        this.scrubberScale = 0.0f;
        invalidate(this.seekBounds);
    }

    @Override // android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int paddingBottom;
        int iMax;
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i15 - getPaddingRight();
        int i17 = this.scrubberPaddingDisabled ? 0 : this.scrubberPadding;
        if (this.barGravity == 1) {
            paddingBottom = (i16 - getPaddingBottom()) - this.touchTargetHeight;
            int paddingBottom2 = i16 - getPaddingBottom();
            int i18 = this.barHeight;
            iMax = (paddingBottom2 - i18) - Math.max(i17 - (i18 / 2), 0);
        } else {
            paddingBottom = (i16 - this.touchTargetHeight) / 2;
            iMax = (i16 - this.barHeight) / 2;
        }
        this.seekBounds.set(paddingLeft, paddingBottom, paddingRight, this.touchTargetHeight + paddingBottom);
        Rect rect = this.progressBar;
        Rect rect2 = this.seekBounds;
        rect.set(rect2.left + i17, iMax, rect2.right - i17, this.barHeight + iMax);
        if (Util.SDK_INT >= 29) {
            setSystemGestureExclusionRectsV29(i15, i16);
        }
        update();
    }

    public void showScrubber() {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberPaddingDisabled = false;
        this.scrubberScale = 1.0f;
        invalidate(this.seekBounds);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void drawPlayhead(Canvas canvas) {
        int i11;
        if (this.duration <= 0) {
            return;
        }
        Rect rect = this.scrubberBar;
        int iConstrainValue = Util.constrainValue(rect.right, rect.left, this.progressBar.right);
        int iCenterY = this.scrubberBar.centerY();
        Drawable drawable = this.scrubberDrawable;
        if (drawable == null) {
            if (this.scrubbing || isFocused()) {
                i11 = this.scrubberDraggedSize;
            } else {
                i11 = isEnabled() ? this.scrubberEnabledSize : this.scrubberDisabledSize;
            }
            canvas.drawCircle(iConstrainValue, iCenterY, (int) ((i11 * this.scrubberScale) / 2.0f), this.scrubberPaint);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.scrubberScale)) / 2;
        int intrinsicHeight = ((int) (this.scrubberDrawable.getIntrinsicHeight() * this.scrubberScale)) / 2;
        this.scrubberDrawable.setBounds(iConstrainValue - intrinsicWidth, iCenterY - intrinsicHeight, iConstrainValue + intrinsicWidth, iCenterY + intrinsicHeight);
        this.scrubberDrawable.draw(canvas);
    }

    private void drawTimeBar(Canvas canvas) {
        int iHeight = this.progressBar.height();
        int iCenterY = this.progressBar.centerY() - (iHeight / 2);
        int i11 = iHeight + iCenterY;
        if (this.duration <= 0) {
            Rect rect = this.progressBar;
            canvas.drawRect(rect.left, iCenterY, rect.right, i11, this.unplayedPaint);
            return;
        }
        Rect rect2 = this.bufferedBar;
        int i12 = rect2.left;
        int i13 = rect2.right;
        int iMax = Math.max(Math.max(this.progressBar.left, i13), this.scrubberBar.right);
        int i14 = this.progressBar.right;
        if (iMax < i14) {
            canvas.drawRect(iMax, iCenterY, i14, i11, this.unplayedPaint);
        }
        int iMax2 = Math.max(i12, this.scrubberBar.right);
        if (i13 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i13, i11, this.bufferedPaint);
        }
        if (this.scrubberBar.width() > 0) {
            Rect rect3 = this.scrubberBar;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i11, this.playedPaint);
        }
        if (this.adGroupCount == 0) {
            return;
        }
        long[] jArr = (long[]) Assertions.checkNotNull(this.adGroupTimesMs);
        boolean[] zArr = (boolean[]) Assertions.checkNotNull(this.playedAdGroups);
        int i15 = this.adMarkerWidth / 2;
        for (int i16 = 0; i16 < this.adGroupCount; i16++) {
            int iWidth = ((int) ((((long) this.progressBar.width()) * Util.constrainValue(jArr[i16], 0L, this.duration)) / this.duration)) - i15;
            Rect rect4 = this.progressBar;
            int iMin = rect4.left + Math.min(rect4.width() - this.adMarkerWidth, Math.max(0, iWidth));
            canvas.drawRect(iMin, iCenterY, iMin + this.adMarkerWidth, i11, zArr[i16] ? this.playedAdMarkerPaint : this.adMarkerPaint);
        }
    }

    private long getPositionIncrement() {
        long j11 = this.keyTimeIncrement;
        if (j11 != C2711C.TIME_UNSET) {
            return j11;
        }
        long j12 = this.duration;
        if (j12 == C2711C.TIME_UNSET) {
            return 0L;
        }
        return j12 / ((long) this.keyCountIncrement);
    }

    private String getProgressText() {
        return Util.getStringForTime(this.formatBuilder, this.formatter, this.position);
    }

    private long getScrubberPosition() {
        if (this.progressBar.width() <= 0 || this.duration == C2711C.TIME_UNSET) {
            return 0L;
        }
        return (((long) this.scrubberBar.width()) * this.duration) / ((long) this.progressBar.width());
    }

    private boolean isInSeekBar(float f11, float f12) {
        return this.seekBounds.contains((int) f11, (int) f12);
    }

    private void positionScrubber(float f11) {
        Rect rect = this.scrubberBar;
        Rect rect2 = this.progressBar;
        rect.right = Util.constrainValue((int) f11, rect2.left, rect2.right);
    }

    private Point resolveRelativeTouchPosition(MotionEvent motionEvent) {
        this.touchPosition.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.touchPosition;
    }

    private boolean scrubIncrementally(long j11) {
        long j12 = this.duration;
        if (j12 <= 0) {
            return false;
        }
        long j13 = this.scrubbing ? this.scrubPosition : this.position;
        long jConstrainValue = Util.constrainValue(j13 + j11, 0L, j12);
        if (jConstrainValue == j13) {
            return false;
        }
        if (this.scrubbing) {
            updateScrubbing(jConstrainValue);
        } else {
            startScrubbing(jConstrainValue);
        }
        update();
        return true;
    }

    private static boolean setDrawableLayoutDirection(Drawable drawable, int i11) {
        return Util.SDK_INT >= 23 && drawable.setLayoutDirection(i11);
    }

    @RequiresApi(29)
    private void setSystemGestureExclusionRectsV29(int i11, int i12) {
        Rect rect = this.lastExclusionRectangle;
        if (rect != null && rect.width() == i11 && this.lastExclusionRectangle.height() == i12) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i11, i12);
        this.lastExclusionRectangle = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void startScrubbing(long j11) {
        this.scrubPosition = j11;
        this.scrubbing = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubStart(this, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopScrubbing(boolean z11) {
        removeCallbacks(this.stopScrubbingRunnable);
        this.scrubbing = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubStop(this, this.scrubPosition, z11);
        }
    }

    private void update() {
        this.bufferedBar.set(this.progressBar);
        this.scrubberBar.set(this.progressBar);
        long j11 = this.scrubbing ? this.scrubPosition : this.position;
        if (this.duration > 0) {
            int iWidth = (int) ((((long) this.progressBar.width()) * this.bufferedPosition) / this.duration);
            Rect rect = this.bufferedBar;
            Rect rect2 = this.progressBar;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.progressBar.width()) * j11) / this.duration);
            Rect rect3 = this.scrubberBar;
            Rect rect4 = this.progressBar;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.bufferedBar;
            int i11 = this.progressBar.left;
            rect5.right = i11;
            this.scrubberBar.right = i11;
        }
        invalidate(this.seekBounds);
    }

    private void updateDrawableState() {
        Drawable drawable = this.scrubberDrawable;
        if (drawable != null && drawable.isStateful() && this.scrubberDrawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void updateScrubbing(long j11) {
        if (this.scrubPosition == j11) {
            return;
        }
        this.scrubPosition = j11;
        Iterator<TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubMove(this, j11);
        }
    }

    @Override // androidx.media3.p022ui.TimeBar
    public long getPreferredUpdateDelay() {
        int iPxToDp = pxToDp(this.density, this.progressBar.width());
        if (iPxToDp == 0) {
            return Long.MAX_VALUE;
        }
        long j11 = this.duration;
        if (j11 == 0 || j11 == C2711C.TIME_UNSET) {
            return Long.MAX_VALUE;
        }
        return j11 / ((long) iPxToDp);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        Drawable drawable = this.scrubberDrawable;
        if (drawable == null || !setDrawableLayoutDirection(drawable, i11)) {
            return;
        }
        invalidate();
    }

    @Override // androidx.media3.p022ui.TimeBar
    public void removeListener(TimeBar.OnScrubListener onScrubListener) {
        this.listeners.remove(onScrubListener);
    }

    @Override // androidx.media3.p022ui.TimeBar
    public void setAdGroupTimesMs(@Nullable long[] jArr, @Nullable boolean[] zArr, int i11) {
        Assertions.checkArgument(i11 == 0 || !(jArr == null || zArr == null));
        this.adGroupCount = i11;
        this.adGroupTimesMs = jArr;
        this.playedAdGroups = zArr;
        update();
    }

    public void setAdMarkerColor(@ColorInt int i11) {
        this.adMarkerPaint.setColor(i11);
        invalidate(this.seekBounds);
    }

    public void setBufferedColor(@ColorInt int i11) {
        this.bufferedPaint.setColor(i11);
        invalidate(this.seekBounds);
    }

    @Override // androidx.media3.p022ui.TimeBar
    public void setBufferedPosition(long j11) {
        if (this.bufferedPosition == j11) {
            return;
        }
        this.bufferedPosition = j11;
        update();
    }

    @Override // androidx.media3.p022ui.TimeBar
    public void setDuration(long j11) {
        if (this.duration == j11) {
            return;
        }
        this.duration = j11;
        if (this.scrubbing && j11 == C2711C.TIME_UNSET) {
            stopScrubbing(true);
        }
        update();
    }

    @Override // androidx.media3.p022ui.TimeBar
    public void setKeyCountIncrement(int i11) {
        Assertions.checkArgument(i11 > 0);
        this.keyCountIncrement = i11;
        this.keyTimeIncrement = C2711C.TIME_UNSET;
    }

    @Override // androidx.media3.p022ui.TimeBar
    public void setKeyTimeIncrement(long j11) {
        Assertions.checkArgument(j11 > 0);
        this.keyCountIncrement = -1;
        this.keyTimeIncrement = j11;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i11) {
        this.playedAdMarkerPaint.setColor(i11);
        invalidate(this.seekBounds);
    }

    public void setPlayedColor(@ColorInt int i11) {
        this.playedPaint.setColor(i11);
        invalidate(this.seekBounds);
    }

    @Override // androidx.media3.p022ui.TimeBar
    public void setPosition(long j11) {
        if (this.position == j11) {
            return;
        }
        this.position = j11;
        setContentDescription(getProgressText());
        update();
    }

    public void setScrubberColor(@ColorInt int i11) {
        this.scrubberPaint.setColor(i11);
        invalidate(this.seekBounds);
    }

    public void setUnplayedColor(@ColorInt int i11) {
        this.unplayedPaint.setColor(i11);
        invalidate(this.seekBounds);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3548a(DefaultTimeBar defaultTimeBar, ValueAnimator valueAnimator) {
        defaultTimeBar.getClass();
        defaultTimeBar.scrubberScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        defaultTimeBar.invalidate(defaultTimeBar.seekBounds);
    }

    @Override // androidx.media3.p022ui.TimeBar
    public void addListener(TimeBar.OnScrubListener onScrubListener) {
        Assertions.checkNotNull(onScrubListener);
        this.listeners.add(onScrubListener);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        updateDrawableState();
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.scrubberDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        drawTimeBar(canvas);
        drawPlayhead(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z11, int i11, @Nullable Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (this.scrubbing && !z11) {
            stopScrubbing(false);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.duration <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i11 != 66) {
                switch (i11) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (scrubIncrementally(positionIncrement)) {
                            removeCallbacks(this.stopScrubbingRunnable);
                            postDelayed(this.stopScrubbingRunnable, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (scrubIncrementally(positionIncrement)) {
                            removeCallbacks(this.stopScrubbingRunnable);
                            postDelayed(this.stopScrubbingRunnable, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.scrubbing) {
                            stopScrubbing(false);
                            return true;
                        }
                        break;
                }
            } else if (this.scrubbing) {
                stopScrubbing(false);
                return true;
            }
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode == 0) {
            size = this.touchTargetHeight;
        } else if (mode != 1073741824) {
            size = Math.min(this.touchTargetHeight, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i11), size);
        updateDrawableState();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11 = false;
        if (isEnabled() && this.duration > 0) {
            Point pointResolveRelativeTouchPosition = resolveRelativeTouchPosition(motionEvent);
            int i11 = pointResolveRelativeTouchPosition.x;
            int i12 = pointResolveRelativeTouchPosition.y;
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            if (this.scrubbing) {
                                if (motionEvent.getAction() == 3) {
                                    z11 = true;
                                }
                                stopScrubbing(z11);
                                return true;
                            }
                        }
                    } else if (this.scrubbing) {
                        if (i12 < this.fineScrubYThreshold) {
                            int i13 = this.lastCoarseScrubXPosition;
                            positionScrubber(i13 + ((i11 - i13) / 3));
                        } else {
                            this.lastCoarseScrubXPosition = i11;
                            positionScrubber(i11);
                        }
                        updateScrubbing(getScrubberPosition());
                        update();
                        invalidate();
                        return true;
                    }
                } else if (this.scrubbing) {
                    if (motionEvent.getAction() == 3) {
                        z11 = true;
                    }
                    stopScrubbing(z11);
                    return true;
                }
            } else {
                float f11 = i11;
                if (isInSeekBar(f11, i12)) {
                    positionScrubber(f11);
                    startScrubbing(getScrubberPosition());
                    update();
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i11, @Nullable Bundle bundle) {
        if (super.performAccessibilityAction(i11, bundle)) {
            return true;
        }
        if (this.duration <= 0) {
            return false;
        }
        if (i11 == 8192) {
            if (scrubIncrementally(-getPositionIncrement())) {
                stopScrubbing(false);
            }
        } else {
            if (i11 != 4096) {
                return false;
            }
            if (scrubIncrementally(getPositionIncrement())) {
                stopScrubbing(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // android.view.View, androidx.media3.p022ui.TimeBar
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        if (this.scrubbing && !z11) {
            stopScrubbing(true);
        }
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i11, @Nullable AttributeSet attributeSet2) {
        this(context, attributeSet, i11, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i11, @Nullable AttributeSet attributeSet2, int i12) {
        super(context, attributeSet, i11);
        this.seekBounds = new Rect();
        this.progressBar = new Rect();
        this.bufferedBar = new Rect();
        this.scrubberBar = new Rect();
        Paint paint = new Paint();
        this.playedPaint = paint;
        Paint paint2 = new Paint();
        this.bufferedPaint = paint2;
        Paint paint3 = new Paint();
        this.unplayedPaint = paint3;
        Paint paint4 = new Paint();
        this.adMarkerPaint = paint4;
        Paint paint5 = new Paint();
        this.playedAdMarkerPaint = paint5;
        Paint paint6 = new Paint();
        this.scrubberPaint = paint6;
        paint6.setAntiAlias(true);
        this.listeners = new CopyOnWriteArraySet<>();
        this.touchPosition = new Point();
        float f11 = context.getResources().getDisplayMetrics().density;
        this.density = f11;
        this.fineScrubYThreshold = dpToPx(f11, FINE_SCRUB_Y_THRESHOLD_DP);
        int iDpToPx = dpToPx(f11, 4);
        int iDpToPx2 = dpToPx(f11, 26);
        int iDpToPx3 = dpToPx(f11, 4);
        int iDpToPx4 = dpToPx(f11, 12);
        int iDpToPx5 = dpToPx(f11, 0);
        int iDpToPx6 = dpToPx(f11, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C3627R.styleable.DefaultTimeBar, i11, i12);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C3627R.styleable.DefaultTimeBar_scrubber_drawable);
                this.scrubberDrawable = drawable;
                if (drawable != null) {
                    setDrawableLayoutDirection(drawable);
                    iDpToPx2 = Math.max(drawable.getMinimumHeight(), iDpToPx2);
                }
                this.barHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3627R.styleable.DefaultTimeBar_bar_height, iDpToPx);
                this.touchTargetHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3627R.styleable.DefaultTimeBar_touch_target_height, iDpToPx2);
                this.barGravity = typedArrayObtainStyledAttributes.getInt(C3627R.styleable.DefaultTimeBar_bar_gravity, 0);
                this.adMarkerWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3627R.styleable.DefaultTimeBar_ad_marker_width, iDpToPx3);
                this.scrubberEnabledSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3627R.styleable.DefaultTimeBar_scrubber_enabled_size, iDpToPx4);
                this.scrubberDisabledSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3627R.styleable.DefaultTimeBar_scrubber_disabled_size, iDpToPx5);
                this.scrubberDraggedSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3627R.styleable.DefaultTimeBar_scrubber_dragged_size, iDpToPx6);
                int i13 = typedArrayObtainStyledAttributes.getInt(C3627R.styleable.DefaultTimeBar_played_color, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(C3627R.styleable.DefaultTimeBar_scrubber_color, -1);
                int i15 = typedArrayObtainStyledAttributes.getInt(C3627R.styleable.DefaultTimeBar_buffered_color, DEFAULT_BUFFERED_COLOR);
                int i16 = typedArrayObtainStyledAttributes.getInt(C3627R.styleable.DefaultTimeBar_unplayed_color, DEFAULT_UNPLAYED_COLOR);
                int i17 = typedArrayObtainStyledAttributes.getInt(C3627R.styleable.DefaultTimeBar_ad_marker_color, DEFAULT_AD_MARKER_COLOR);
                int i18 = typedArrayObtainStyledAttributes.getInt(C3627R.styleable.DefaultTimeBar_played_ad_marker_color, DEFAULT_PLAYED_AD_MARKER_COLOR);
                paint.setColor(i13);
                paint6.setColor(i14);
                paint2.setColor(i15);
                paint3.setColor(i16);
                paint4.setColor(i17);
                paint5.setColor(i18);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.barHeight = iDpToPx;
            this.touchTargetHeight = iDpToPx2;
            this.barGravity = 0;
            this.adMarkerWidth = iDpToPx3;
            this.scrubberEnabledSize = iDpToPx4;
            this.scrubberDisabledSize = iDpToPx5;
            this.scrubberDraggedSize = iDpToPx6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(DEFAULT_BUFFERED_COLOR);
            paint3.setColor(DEFAULT_UNPLAYED_COLOR);
            paint4.setColor(DEFAULT_AD_MARKER_COLOR);
            paint5.setColor(DEFAULT_PLAYED_AD_MARKER_COLOR);
            this.scrubberDrawable = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.formatBuilder = sb2;
        this.formatter = new Formatter(sb2, Locale.getDefault());
        this.stopScrubbingRunnable = new Runnable() { // from class: androidx.media3.ui.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f3547b.stopScrubbing(false);
            }
        };
        Drawable drawable2 = this.scrubberDrawable;
        if (drawable2 != null) {
            this.scrubberPadding = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.scrubberPadding = (Math.max(this.scrubberDisabledSize, Math.max(this.scrubberEnabledSize, this.scrubberDraggedSize)) + 1) / 2;
        }
        this.scrubberScale = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.scrubberScalingAnimator = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DefaultTimeBar.m3548a(this.f3549b, valueAnimator2);
            }
        });
        this.duration = C2711C.TIME_UNSET;
        this.keyTimeIncrement = C2711C.TIME_UNSET;
        this.keyCountIncrement = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public void hideScrubber(long j11) {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberScalingAnimator.setFloatValues(this.scrubberScale, 0.0f);
        this.scrubberScalingAnimator.setDuration(j11);
        this.scrubberScalingAnimator.start();
    }

    public void showScrubber(long j11) {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberPaddingDisabled = false;
        this.scrubberScalingAnimator.setFloatValues(this.scrubberScale, 1.0f);
        this.scrubberScalingAnimator.setDuration(j11);
        this.scrubberScalingAnimator.start();
    }
}
