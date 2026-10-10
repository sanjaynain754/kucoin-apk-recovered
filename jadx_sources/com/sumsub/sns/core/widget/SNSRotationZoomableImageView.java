package com.sumsub.sns.core.widget;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.Scroller;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import com.google.android.material.imageview.ShapeableImageView;
import com.p059BV.LinearGradient.LinearGradientManager;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$styleable;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0011\u0018\u0000 d2\u00020\u0001:\u0003bcdB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020:H\u0017J\b\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020\u000bH\u0002J\b\u0010>\u001a\u00020<H\u0002J\u0012\u0010?\u001a\u00020/2\b\b\u0002\u0010@\u001a\u00020\u000bH\u0002J\u0012\u0010A\u001a\u00020/2\b\b\u0002\u0010@\u001a\u00020\u000bH\u0002J\u0012\u0010B\u001a\u00020\u000b2\b\b\u0002\u0010C\u001a\u00020\u000bH\u0002J\u0012\u0010D\u001a\u00020\u000b2\b\b\u0002\u0010C\u001a\u00020\u000bH\u0002J\b\u0010E\u001a\u00020\u000bH\u0002J\b\u0010F\u001a\u00020\u000bH\u0002J\b\u0010G\u001a\u00020<H\u0002J\b\u0010H\u001a\u00020<H\u0002J \u0010I\u001a\u00020<2\u0006\u0010J\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u000bH\u0002J\u0018\u0010M\u001a\u00020<2\u0006\u0010N\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u0007H\u0002J\u0012\u0010P\u001a\u00020<2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0016J\u0018\u0010S\u001a\u00020<2\u0006\u0010T\u001a\u00020\u00072\u0006\u0010U\u001a\u00020\u0007H\u0014J\b\u0010V\u001a\u00020<H\u0016J\b\u0010W\u001a\u00020<H\u0014J\u0006\u0010X\u001a\u00020<J\u0006\u0010Y\u001a\u00020<J\u0018\u0010Z\u001a\u00020<2\u0006\u0010[\u001a\u00020\u000b2\b\b\u0002\u0010\\\u001a\u00020/J\u0018\u0010]\u001a\u00020<2\b\u0010^\u001a\u0004\u0018\u00010_2\u0006\u0010`\u001a\u00020\u0007J\u0006\u0010a\u001a\u00020<R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u00020/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0011\u00105\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006e"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;", "Lcom/google/android/material/imageview/ShapeableImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "rotationAngle", "setRotationAngle", "(F)V", "targetAngle", "rotationPositionHolder", "com/sumsub/sns/core/widget/SNSRotationZoomableImageView$rotationPositionHolder$1", "Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$rotationPositionHolder$1;", "rotationAnimation", "Landroidx/dynamicanimation/animation/SpringAnimation;", "getRotationAnimation$annotations", "()V", "scaleAnimation", "Landroid/animation/ValueAnimator;", "gestureDetector", "Landroid/view/GestureDetector;", "mtrx", "Landroid/graphics/Matrix;", "touchMode", "Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;", "touchStartDistance", "touchStartX", "touchStartY", "pointerId1", "pointerId2", "currentScale", "minScale", "getMinScale", "()F", "viewPort", "Landroid/graphics/RectF;", "scroller", "Landroid/widget/Scroller;", "lastViewPortCenterX", "lastViewPortCenterY", "lastViewPortCenterSaved", "", "zoomEnabled", "getZoomEnabled", "()Z", "setZoomEnabled", "(Z)V", "rotation", "getRotation", "()I", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "reduceClipping", "", "getFitScale", "finishScale", "canTranslateX", "scale", "canTranslateY", "getDrawableScaledWidth", "scaleFactor", "getDrawableScaledHeight", "getDrawableWidth", "getDrawableHeight", "computeViewPort", "updateMatrix", "animateScale", "scaleTo", "drawableCenterEndX", "drawableCenterEndY", "fling", "velocityX", "velocityY", "setImageDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "computeScroll", "onDetachedFromWindow", "rotateCW", "rotateCCW", "rotate", LinearGradientManager.PROP_ANGLE, "exact", "setImageBitmapWithRotation", "bm", "Landroid/graphics/Bitmap;", "rotationDegrees", "clearImage", "GestureListener", "TouchMode", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSRotationZoomableImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSRotationZoomableImageView.kt\ncom/sumsub/sns/core/widget/SNSRotationZoomableImageView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,530:1\n37#2:531\n53#2:532\n*S KotlinDebug\n*F\n+ 1 SNSRotationZoomableImageView.kt\ncom/sumsub/sns/core/widget/SNSRotationZoomableImageView\n*L\n407#1:531\n407#1:532\n*E\n"})
public final class SNSRotationZoomableImageView extends ShapeableImageView {
    private float currentScale;

    @NotNull
    private final GestureDetector gestureDetector;
    private boolean lastViewPortCenterSaved;
    private float lastViewPortCenterX;
    private float lastViewPortCenterY;

    @NotNull
    private final Matrix mtrx;
    private int pointerId1;
    private int pointerId2;
    private float rotationAngle;

    @NotNull
    private final SpringAnimation rotationAnimation;

    @NotNull
    private final SNSRotationZoomableImageView$rotationPositionHolder$1 rotationPositionHolder;

    @Nullable
    private ValueAnimator scaleAnimation;

    @NotNull
    private final Scroller scroller;
    private float targetAngle;

    @NotNull
    private TouchMode touchMode;
    private float touchStartDistance;
    private float touchStartX;
    private float touchStartY;

    @NotNull
    private final RectF viewPort;
    private boolean zoomEnabled;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;)V", "onFling", "", "e1", "Landroid/view/MotionEvent;", "e2", "velocityX", "", "velocityY", "onSingleTapConfirmed", "e", "onDoubleTap", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(@NotNull MotionEvent e11) {
            SNSRotationZoomableImageView.this.scroller.forceFinished(true);
            if (SNSRotationZoomableImageView.this.currentScale > SNSRotationZoomableImageView.this.getFitScale()) {
                SNSRotationZoomableImageView sNSRotationZoomableImageView = SNSRotationZoomableImageView.this;
                sNSRotationZoomableImageView.animateScale(sNSRotationZoomableImageView.getFitScale(), SNSRotationZoomableImageView.this.getWidth() / 2.0f, SNSRotationZoomableImageView.this.getHeight() / 2.0f);
            } else {
                SNSRotationZoomableImageView.this.computeViewPort();
                SNSRotationZoomableImageView.this.animateScale(2.6666667f, SNSRotationZoomableImageView.this.viewPort.centerX() - ((e11.getX(0) - SNSRotationZoomableImageView.this.viewPort.centerX()) * 2.6666667f), SNSRotationZoomableImageView.this.viewPort.centerY() - ((e11.getY(0) - SNSRotationZoomableImageView.this.viewPort.centerY()) * 2.6666667f));
            }
            return super.onDoubleTap(e11);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(@Nullable MotionEvent e11, @NotNull MotionEvent e12, float velocityX, float velocityY) {
            SNSRotationZoomableImageView.this.fling((int) velocityX, (int) velocityY);
            return super.onFling(e11, e12, velocityX, velocityY);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(@NotNull MotionEvent e11) {
            SNSRotationZoomableImageView.this.performClick();
            return super.onSingleTapConfirmed(e11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "DRAG", "ZOOM", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum TouchMode {
        NONE,
        DRAG,
        ZOOM;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<TouchMode> getEntries() {
            return $ENTRIES;
        }
    }

    @JvmOverloads
    public SNSRotationZoomableImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public final void rotateCCW() {
        rotate$default(this, -90.0f, false, 2, null);
    }

    public final void rotateCW() {
        rotate$default(this, 90.0f, false, 2, null);
    }

    @JvmOverloads
    public SNSRotationZoomableImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateScale(float scaleTo, float drawableCenterEndX, float drawableCenterEndY) {
        ValueAnimator valueAnimator = this.scaleAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final float f11 = this.currentScale;
        final float f12 = scaleTo - f11;
        final float fCenterX = drawableCenterEndX - this.viewPort.centerX();
        final float fCenterY = drawableCenterEndY - this.viewPort.centerY();
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(2.0f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sumsub.sns.core.widget.e0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SNSRotationZoomableImageView.animateScale$lambda$7$lambda$6(f11, f12, this, floatRef, fCenterX, fCenterY, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.start();
        this.scaleAnimation = valueAnimatorOfFloat;
    }

    private final boolean canTranslateX(float scale) {
        if (scale > 4.0f) {
            return false;
        }
        if (this.targetAngle % 180 == 0.0f) {
            return getDrawableScaledWidth(scale) > ((float) getWidth());
        }
        return getDrawableScaledHeight(scale) > ((float) getHeight());
    }

    public static /* synthetic */ boolean canTranslateX$default(SNSRotationZoomableImageView sNSRotationZoomableImageView, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = sNSRotationZoomableImageView.currentScale;
        }
        return sNSRotationZoomableImageView.canTranslateX(f11);
    }

    private final boolean canTranslateY(float scale) {
        if (scale > 4.0f) {
            return false;
        }
        if (this.targetAngle % 180 == 0.0f) {
            return getDrawableScaledHeight(scale) > ((float) getHeight());
        }
        return getDrawableScaledWidth(scale) > ((float) getWidth());
    }

    public static /* synthetic */ boolean canTranslateY$default(SNSRotationZoomableImageView sNSRotationZoomableImageView, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = sNSRotationZoomableImageView.currentScale;
        }
        return sNSRotationZoomableImageView.canTranslateY(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void computeViewPort() {
        RectF rectF = this.viewPort;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getDrawableWidth();
        rectF.bottom = getDrawableHeight();
        this.mtrx.mapRect(this.viewPort);
    }

    private final void finishScale() {
        if (this.currentScale < getMinScale()) {
            this.scroller.forceFinished(true);
            animateScale(getFitScale(), getWidth() / 2.0f, getHeight() / 2.0f);
        } else if (this.currentScale > 4.0f) {
            this.scroller.forceFinished(true);
            this.lastViewPortCenterSaved = false;
            animateScale(4.0f, this.lastViewPortCenterX, this.lastViewPortCenterY);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fling(int velocityX, int velocityY) {
        this.scroller.forceFinished(true);
        RectF rectF = this.viewPort;
        float f11 = rectF.left;
        this.touchStartX = f11;
        float f12 = rectF.top;
        this.touchStartY = f12;
        this.scroller.fling((int) f11, (int) f12, velocityX, velocityY, getWidth() - ((int) this.viewPort.width()), 0, getHeight() - ((int) this.viewPort.height()), 0);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public static /* synthetic */ void rotate$default(SNSRotationZoomableImageView sNSRotationZoomableImageView, float f11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        sNSRotationZoomableImageView.rotate(f11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rotationAnimation$lambda$3$lambda$2(SNSRotationZoomableImageView sNSRotationZoomableImageView, DynamicAnimation dynamicAnimation, boolean z11, float f11, float f12) {
        float f13 = sNSRotationZoomableImageView.targetAngle;
        float f14 = TXVodDownloadDataSource.QUALITY_360P;
        float f15 = f13 % f14;
        if (f15 < 0.0f) {
            f15 += f14;
        }
        sNSRotationZoomableImageView.setRotationAngle(f15);
        sNSRotationZoomableImageView.targetAngle = f15;
    }

    private final void updateMatrix() {
        setImageMatrix(this.mtrx);
        computeViewPort();
    }

    @Override // android.view.View
    public final int getRotation() {
        return (int) this.targetAngle;
    }

    public final boolean getZoomEnabled() {
        return this.zoomEnabled;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0196  */
    /* JADX WARN: Code duplicated, block: B:76:0x019c  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a2  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r0 != 6) goto L65;
     */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        TouchMode touchMode;
        TouchMode touchMode2;
        if (!this.zoomEnabled) {
            return super.onTouchEvent(event);
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(!(this.currentScale == getFitScale()));
        }
        this.gestureDetector.onTouchEvent(event);
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.touchMode = TouchMode.NONE;
                finishScale();
                return true;
            }
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                    }
                }
                this.touchMode = TouchMode.NONE;
                return true;
            }
            TouchMode touchMode3 = this.touchMode;
            if (touchMode3 == TouchMode.DRAG) {
                float x11 = event.getX(0) - this.touchStartX;
                float y11 = event.getY(0) - this.touchStartY;
                Matrix matrix = this.mtrx;
                if (!canTranslateX$default(this, 0.0f, 1, null)) {
                    x11 = 0.0f;
                }
                matrix.postTranslate(x11, canTranslateY$default(this, 0.0f, 1, null) ? y11 : 0.0f);
                this.touchStartX = event.getX(0);
                this.touchStartY = event.getY(0);
                reduceClipping();
                return true;
            }
            if (touchMode3 == TouchMode.ZOOM) {
                int iFindPointerIndex = event.findPointerIndex(this.pointerId1);
                int iFindPointerIndex2 = event.findPointerIndex(this.pointerId2);
                if (iFindPointerIndex < 0 || iFindPointerIndex2 < 0) {
                    this.touchMode = TouchMode.NONE;
                    return false;
                }
                float fHypot = (float) Math.hypot(event.getX(iFindPointerIndex2) - event.getX(iFindPointerIndex), event.getY(iFindPointerIndex2) - event.getY(iFindPointerIndex));
                float f11 = fHypot / this.touchStartDistance;
                float x12 = (event.getX(iFindPointerIndex2) + event.getX(iFindPointerIndex)) / 2.0f;
                float y12 = (event.getY(iFindPointerIndex2) + event.getY(iFindPointerIndex)) / 2.0f;
                float f12 = x12 - this.touchStartX;
                float f13 = y12 - this.touchStartY;
                boolean zCanTranslateX = canTranslateX(this.currentScale * f11);
                boolean zCanTranslateY = canTranslateY(this.currentScale * f11);
                if (this.currentScale * f11 > 4.0f && !this.lastViewPortCenterSaved) {
                    this.lastViewPortCenterX = this.viewPort.centerX();
                    this.lastViewPortCenterY = this.viewPort.centerY();
                    this.lastViewPortCenterSaved = true;
                }
                this.mtrx.postScale(f11, f11, zCanTranslateX ? this.touchStartX : getWidth() / 2.0f, zCanTranslateY ? this.touchStartY : getHeight() / 2.0f);
                Matrix matrix2 = this.mtrx;
                if (!zCanTranslateX) {
                    f12 = 0.0f;
                }
                matrix2.postTranslate(f12, zCanTranslateY ? f13 : 0.0f);
                this.currentScale *= f11;
                this.touchStartDistance = fHypot;
                this.touchStartX = x12;
                this.touchStartY = y12;
                reduceClipping();
                return true;
            }
            return super.onTouchEvent(event);
        }
        this.scroller.forceFinished(true);
        if (event.getPointerCount() == 2) {
            TouchMode touchMode4 = this.touchMode;
            TouchMode touchMode5 = TouchMode.ZOOM;
            if (touchMode4 != touchMode5) {
                this.touchMode = touchMode5;
                this.pointerId1 = event.getPointerId(0);
                this.pointerId2 = event.getPointerId(1);
                this.touchStartDistance = (float) Math.hypot(event.getX(1) - event.getX(0), event.getY(1) - event.getY(0));
                this.touchStartX = (event.getX(1) + event.getX(0)) / 2.0f;
                this.touchStartY = (event.getY(1) + event.getY(0)) / 2.0f;
            } else if (event.getPointerCount() == 1) {
                touchMode = this.touchMode;
                touchMode2 = TouchMode.DRAG;
                if (touchMode != touchMode2) {
                    this.touchMode = touchMode2;
                    this.touchStartX = event.getX(0);
                    this.touchStartY = event.getY(0);
                }
            }
        } else if (event.getPointerCount() == 1) {
            touchMode = this.touchMode;
            touchMode2 = TouchMode.DRAG;
            if (touchMode != touchMode2) {
                this.touchMode = touchMode2;
                this.touchStartX = event.getX(0);
                this.touchStartY = event.getY(0);
            }
        }
        return true;
    }

    public final void rotate(float angle, boolean exact) {
        this.scroller.forceFinished(true);
        if (exact) {
            this.targetAngle = angle;
        } else {
            this.targetAngle += angle;
        }
        this.rotationAnimation.animateToFinalPosition(this.targetAngle * 1000.0f);
    }

    public final void setZoomEnabled(boolean z11) {
        this.zoomEnabled = z11;
    }

    public /* synthetic */ SNSRotationZoomableImageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? R$attr.sns_RotationZoomableImageViewStyle : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateScale$lambda$7$lambda$6(float f11, float f12, SNSRotationZoomableImageView sNSRotationZoomableImageView, Ref.FloatRef floatRef, float f13, float f14, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f15 = (f12 * fFloatValue) + f11;
        float f16 = f15 / sNSRotationZoomableImageView.currentScale;
        sNSRotationZoomableImageView.mtrx.postScale(f16, f16, sNSRotationZoomableImageView.viewPort.centerX(), sNSRotationZoomableImageView.viewPort.centerY());
        float f17 = fFloatValue - floatRef.element;
        sNSRotationZoomableImageView.mtrx.postTranslate(f13 * f17, f17 * f14);
        sNSRotationZoomableImageView.currentScale = f15;
        floatRef.element = fFloatValue;
        sNSRotationZoomableImageView.reduceClipping();
    }

    private final float getDrawableHeight() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 0.0f;
    }

    private final float getDrawableScaledHeight(float scaleFactor) {
        return getDrawableHeight() * scaleFactor;
    }

    private final float getDrawableScaledWidth(float scaleFactor) {
        return getDrawableWidth() * scaleFactor;
    }

    private final float getDrawableWidth() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getFitScale() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return 1.0f;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (this.targetAngle % 180 == 0.0f) {
            return Math.min(getWidth() / intrinsicWidth, getHeight() / intrinsicHeight);
        }
        return Math.min(getWidth() / intrinsicHeight, getHeight() / intrinsicWidth);
    }

    private final float getMinScale() {
        return getFitScale();
    }

    private final void reduceClipping() {
        computeViewPort();
        if (this.viewPort.width() > getWidth()) {
            RectF rectF = this.viewPort;
            if (rectF.left > 0.0f && rectF.right > getWidth()) {
                this.mtrx.postTranslate(-this.viewPort.left, 0.0f);
            }
            if (this.viewPort.right < getWidth() && this.viewPort.left < 0.0f) {
                this.mtrx.postTranslate(getWidth() - this.viewPort.right, 0.0f);
            }
        }
        if (this.viewPort.height() > getHeight()) {
            RectF rectF2 = this.viewPort;
            if (rectF2.top > 0.0f && rectF2.bottom > getHeight()) {
                this.mtrx.postTranslate(0.0f, -this.viewPort.top);
            }
            if (this.viewPort.bottom < getHeight() && this.viewPort.top < 0.0f) {
                this.mtrx.postTranslate(0.0f, getHeight() - this.viewPort.bottom);
            }
        }
        if (this.viewPort.width() < getWidth()) {
            float width = (getWidth() / 2.0f) - this.viewPort.centerX();
            if (width != 0.0f) {
                this.mtrx.postTranslate(width, 0.0f);
            }
        }
        if (this.viewPort.height() < getHeight()) {
            float height = (getHeight() / 2.0f) - this.viewPort.centerY();
            if (height != 0.0f) {
                this.mtrx.postTranslate(0.0f, height);
            }
        }
        updateMatrix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRotationAngle(float f11) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            this.rotationAngle = f11;
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            Matrix matrix = this.mtrx;
            float f12 = intrinsicWidth / 2.0f;
            float f13 = intrinsicHeight / 2.0f;
            matrix.setRotate(f11, f12, f13);
            float fitScale = getFitScale();
            matrix.postScale(fitScale, fitScale, f12, f13);
            float f14 = 2;
            matrix.postTranslate((-(intrinsicWidth - getWidth())) / f14, (-(intrinsicHeight - getHeight())) / f14);
            this.currentScale = fitScale;
            updateMatrix();
        }
    }

    public final void clearImage() {
        setImageResource(R.color.transparent);
        this.rotationAnimation.cancel();
        ValueAnimator valueAnimator = this.scaleAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.scaleAnimation = null;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.scroller.computeScrollOffset()) {
            int currX = this.scroller.getCurrX();
            int currY = this.scroller.getCurrY();
            float f11 = currX;
            float f12 = f11 - this.touchStartX;
            float f13 = currY;
            float f14 = f13 - this.touchStartY;
            Matrix matrix = this.mtrx;
            if (!canTranslateX$default(this, 0.0f, 1, null)) {
                f12 = 0.0f;
            }
            if (!canTranslateY$default(this, 0.0f, 1, null)) {
                f14 = 0.0f;
            }
            matrix.postTranslate(f12, f14);
            this.touchStartX = f11;
            this.touchStartY = f13;
            reduceClipping();
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.scaleAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.scaleAnimation = null;
        this.rotationAnimation.cancel();
    }

    @Override // com.google.android.material.imageview.ShapeableImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.currentScale = getFitScale();
    }

    public final void setImageBitmapWithRotation(@Nullable Bitmap bm2, int rotationDegrees) {
        setImageBitmap(bm2);
        float f11 = rotationDegrees;
        this.targetAngle = f11;
        this.rotationAnimation.animateToFinalPosition(f11 * 1000.0f);
        this.rotationAnimation.skipToEnd();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
        this.targetAngle = 0.0f;
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.sumsub.sns.core.widget.SNSRotationZoomableImageView$setImageDrawable$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                this.this$0.rotationAnimation.animateToFinalPosition(0.0f);
                this.this$0.rotationAnimation.skipToEnd();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.dynamicanimation.animation.FloatPropertyCompat, com.sumsub.sns.core.widget.SNSRotationZoomableImageView$rotationPositionHolder$1] */
    @JvmOverloads
    public SNSRotationZoomableImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        ?? r11 = new FloatPropertyCompat<SNSRotationZoomableImageView>() { // from class: com.sumsub.sns.core.widget.SNSRotationZoomableImageView$rotationPositionHolder$1
            {
                super("rotationDegree");
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float getValue(SNSRotationZoomableImageView view) {
                return this.this$0.rotationAngle * 1000.0f;
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void setValue(SNSRotationZoomableImageView view, float value) {
                this.this$0.setRotationAngle(value / 1000.0f);
            }
        };
        this.rotationPositionHolder = r11;
        SpringAnimation springAnimation = new SpringAnimation(this, r11, 0.0f);
        springAnimation.getSpring().setDampingRatio(1.0f);
        springAnimation.getSpring().setStiffness(1500.0f);
        springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: com.sumsub.sns.core.widget.f0
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z11, float f11, float f12) {
                SNSRotationZoomableImageView.rotationAnimation$lambda$3$lambda$2(this.f57580a, dynamicAnimation, z11, f11, f12);
            }
        });
        this.rotationAnimation = springAnimation;
        this.gestureDetector = new GestureDetector(context, new GestureListener());
        Matrix matrix = new Matrix();
        matrix.setTranslate(1.0f, 1.0f);
        matrix.setScale(1.0f, 1.0f);
        this.mtrx = matrix;
        this.touchMode = TouchMode.NONE;
        this.currentScale = 1.0f;
        this.viewPort = new RectF();
        this.scroller = new Scroller(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSRotationZoomableImageView, i11, 0);
        this.zoomEnabled = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SNSRotationZoomableImageView_sns_zoomEnabled, false);
        typedArrayObtainStyledAttributes.recycle();
        setScaleType(ImageView.ScaleType.MATRIX);
        updateMatrix();
    }

    private static /* synthetic */ void getRotationAnimation$annotations() {
    }
}
