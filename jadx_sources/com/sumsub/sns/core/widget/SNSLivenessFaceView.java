package com.sumsub.sns.core.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntProgression;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b*\u0001&\u0018\u0000 h2\u00020\u0001:\u0003hijB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0007H\u0002J\u0010\u0010Q\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0007H\u0002J\u0010\u0010R\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0007H\u0002J\u0010\u0010S\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0007H\u0002J\u0006\u0010T\u001a\u00020OJ\u0006\u0010U\u001a\u00020OJ\u0006\u0010V\u001a\u00020OJ\u0006\u0010W\u001a\u00020OJ\b\u0010X\u001a\u00020OH\u0014J(\u0010Y\u001a\u00020O2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\u0007H\u0014J\u0018\u0010^\u001a\u00020O2\u0006\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u0007H\u0014J\u0010\u0010a\u001a\u00020O2\u0006\u0010b\u001a\u00020cH\u0014J\u0010\u0010d\u001a\u00020O2\u0006\u0010b\u001a\u00020cH\u0002J\u0010\u0010e\u001a\u00020O2\u0006\u0010b\u001a\u00020cH\u0002J\u0010\u0010f\u001a\u00020O2\u0006\u0010b\u001a\u00020cH\u0002J\b\u0010g\u001a\u00020OH\u0002R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001c@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\"R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u00100\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b1\u0010\u0017R\u000e\u00102\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010;\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b<\u0010\u0017R\u000e\u0010=\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010K\u001a\u00020J2\u0006\u0010\u0013\u001a\u00020J@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\bL\u0010M¨\u0006k"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "faceCapturingRect", "Landroid/graphics/Rect;", "getFaceCapturingRect", "()Landroid/graphics/Rect;", "helperRectF", "Landroid/graphics/RectF;", "getHelperRectF", "()Landroid/graphics/RectF;", "value", "", "recognizingFactor", "setRecognizingFactor", "(F)V", "faceRectangle", "getFaceRectangle", "setFaceRectangle", "(Landroid/graphics/RectF;)V", "Landroid/graphics/Bitmap;", "bgBitmap", "setBgBitmap", "(Landroid/graphics/Bitmap;)V", "isAnalyzing", "", "()Z", "maxRadius", "focusRadius", "radiusHolder", "com/sumsub/sns/core/widget/SNSLivenessFaceView$radiusHolder$1", "Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$radiusHolder$1;", "radiusAnimation", "Landroidx/dynamicanimation/animation/SpringAnimation;", "stateListener", "Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;", "getStateListener", "()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;", "setStateListener", "(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;)V", "detectingFactor", "setDetectingFactor", "detectingAnimationSpeed", "", "detectingArc1RotationAngle", "detectingArc2RotationAngle", "updater", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "recognizingAnimationDirect", "Landroid/animation/ValueAnimator;", "recognizingAnimationInDirect", "progressRotationAngle", "setProgressRotationAngle", "progressRotationAnimator", "mFaceProgressMarkerPaint", "Landroid/graphics/Paint;", "mFaceDetectionCirclePaint", "mFaceCutCirclePaint", "mFaceScanCompletePaint", "mFaceRecognizingPaint", "mFaceRectanglePaint", "mColorFaceMarkerActive", "mColorFaceMarkerInActive", "mColorOverlay", "mMarkerSize", "mMarkerPadding", "Lkotlin/ranges/IntRange;", "progressRange", "setProgressRange", "(Lkotlin/ranges/IntRange;)V", "setOverlayColor", "", "color", "setFaceRecognizedColor", "setFaceMarkerActiveColor", "setFaceMarkerInActiveColor", "setRecognizingState", "setFaceDetectedState", "setFaceAnalyzingState", "setScanCompleteState", "onDetachedFromWindow", "onSizeChanged", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawRecognizingCircle", "drawMarkers", "drawRecognizingArc", "updateOverlay", "Companion", "SNSFaceViewState", "SNSFaceStateListener", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSLivenessFaceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSLivenessFaceView.kt\ncom/sumsub/sns/core/widget/SNSLivenessFaceView\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 3 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,491:1\n30#2:492\n91#2,14:493\n30#2:507\n91#2,14:508\n37#3:522\n37#3:523\n37#3:524\n1#4:525\n43#5,3:526\n*S KotlinDebug\n*F\n+ 1 SNSLivenessFaceView.kt\ncom/sumsub/sns/core/widget/SNSLivenessFaceView\n*L\n131#1:492\n131#1:493,14\n138#1:507\n138#1:508,14\n271#1:522\n275#1:523\n280#1:524\n473#1:526,3\n*E\n"})
public final class SNSLivenessFaceView extends View {

    @Nullable
    private Bitmap bgBitmap;
    private long detectingAnimationSpeed;
    private float detectingArc1RotationAngle;
    private float detectingArc2RotationAngle;
    private float detectingFactor;

    @Nullable
    private RectF faceRectangle;
    private int focusRadius;

    @NotNull
    private final RectF helperRectF;
    private int mColorFaceMarkerActive;
    private int mColorFaceMarkerInActive;
    private int mColorOverlay;

    @NotNull
    private final Paint mFaceCutCirclePaint;

    @NotNull
    private final Paint mFaceDetectionCirclePaint;

    @NotNull
    private final Paint mFaceProgressMarkerPaint;

    @NotNull
    private final Paint mFaceRecognizingPaint;

    @NotNull
    private final Paint mFaceRectanglePaint;

    @NotNull
    private final Paint mFaceScanCompletePaint;
    private final int mMarkerPadding;
    private final int mMarkerSize;
    private int maxRadius;

    @NotNull
    private IntRange progressRange;
    private float progressRotationAngle;

    @NotNull
    private final ValueAnimator progressRotationAnimator;

    @NotNull
    private final SpringAnimation radiusAnimation;

    @NotNull
    private final SNSLivenessFaceView$radiusHolder$1 radiusHolder;

    @NotNull
    private final ValueAnimator recognizingAnimationDirect;

    @NotNull
    private final ValueAnimator recognizingAnimationInDirect;
    private float recognizingFactor;

    @Nullable
    private SNSFaceStateListener stateListener;

    @NotNull
    private final ValueAnimator.AnimatorUpdateListener updater;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;", "", "onState", "", "state", "Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public interface SNSFaceStateListener {
        void onState(@NotNull SNSFaceViewState state);
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;", "", "<init>", "(Ljava/lang/String;I)V", "Recognizing", "Recognized", "Analyzing", "Complete", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum SNSFaceViewState {
        Recognizing,
        Recognized,
        Analyzing,
        Complete;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<SNSFaceViewState> getEntries() {
            return $ENTRIES;
        }
    }

    @JvmOverloads
    public SNSLivenessFaceView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSLivenessFaceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00c6  */
    private final void drawMarkers(Canvas canvas) {
        int i11;
        float fAbs = 1 - Math.abs(RangesKt.coerceIn(this.recognizingFactor, -0.11f, 0.11f) * 10);
        if (fAbs > 1.0f || fAbs < 0.0f) {
            return;
        }
        float f11 = this.mMarkerSize * fAbs;
        int i12 = this.focusRadius;
        float f12 = (i12 - ((this.maxRadius - i12) * this.recognizingFactor)) + this.mMarkerPadding;
        float fCenterX = getFaceCapturingRect().centerX();
        float fCenterY = getFaceCapturingRect().centerY();
        canvas.save();
        Canvas canvas2 = canvas;
        canvas2.rotate(this.progressRotationAngle, fCenterX, fCenterY);
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, TXVodDownloadDataSource.QUALITY_360P), 4);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            int i13 = first;
            while (true) {
                double d11 = fCenterX;
                double d12 = f12;
                double radians = (float) Math.toRadians(i13);
                float f13 = fCenterX;
                float f14 = f11;
                float fSin = (float) ((Math.sin(radians) * d12) + d11);
                double d13 = fCenterY;
                float fCos = (float) (d13 - (Math.cos(radians) * d12));
                double d14 = f12 + f14;
                float fSin2 = (float) ((Math.sin(radians) * d14) + d11);
                float fCos2 = (float) (d13 - (Math.cos(radians) * d14));
                Paint paint = this.mFaceProgressMarkerPaint;
                if (isAnalyzing()) {
                    i11 = this.mColorFaceMarkerActive;
                } else {
                    IntRange intRange = this.progressRange;
                    int first2 = intRange.getFirst();
                    if (i13 > intRange.getLast() || first2 > i13) {
                        i11 = this.mColorFaceMarkerInActive;
                    } else {
                        i11 = this.mColorFaceMarkerActive;
                    }
                }
                paint.setColor(i11);
                canvas2.drawLine(fSin, fCos, fSin2, fCos2, this.mFaceProgressMarkerPaint);
                if (i13 == last) {
                    break;
                }
                i13 += step;
                canvas2 = canvas;
                f11 = f14;
                fCenterX = f13;
            }
        }
        canvas.restore();
    }

    private final void drawRecognizingArc(Canvas canvas) {
        this.helperRectF.set(getFaceCapturingRect());
        this.helperRectF.inset(0.0f, (this.helperRectF.height() * (1 - Math.abs(this.detectingFactor))) / 2);
        float f11 = this.detectingFactor > 0.0f ? 180.0f : 0.0f;
        canvas.save();
        canvas.rotate(this.detectingArc1RotationAngle, this.helperRectF.centerX(), this.helperRectF.centerY());
        canvas.drawArc(this.helperRectF, f11, 180.0f, false, this.mFaceRecognizingPaint);
        canvas.rotate((-this.detectingArc1RotationAngle) - this.detectingArc2RotationAngle, this.helperRectF.centerX(), this.helperRectF.centerY());
        canvas.drawArc(this.helperRectF, f11, 180.0f, false, this.mFaceRecognizingPaint);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAnalyzing() {
        return this.recognizingFactor == 0.0f && Intrinsics.areEqual(this.progressRange, IntRange.INSTANCE.getEMPTY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void radiusAnimation$lambda$1$lambda$0(SNSLivenessFaceView sNSLivenessFaceView, DynamicAnimation dynamicAnimation, boolean z11, float f11, float f12) {
        SNSFaceViewState sNSFaceViewState;
        SNSFaceStateListener sNSFaceStateListener = sNSLivenessFaceView.stateListener;
        if (sNSFaceStateListener != null) {
            float f13 = sNSLivenessFaceView.recognizingFactor;
            if (f13 == 0.0f) {
                sNSFaceViewState = sNSLivenessFaceView.isAnalyzing() ? SNSFaceViewState.Analyzing : SNSFaceViewState.Recognized;
            } else {
                sNSFaceViewState = f13 == 1.0f ? SNSFaceViewState.Complete : SNSFaceViewState.Recognizing;
            }
            sNSFaceStateListener.onState(sNSFaceViewState);
        }
    }

    private final void setBgBitmap(Bitmap bitmap) {
        this.bgBitmap = bitmap;
        updateOverlay();
        invalidate();
    }

    private final void setDetectingFactor(float f11) {
        if (this.detectingFactor == f11) {
            return;
        }
        this.detectingFactor = f11;
        postInvalidateOnAnimation();
    }

    private final void setFaceMarkerActiveColor(int color) {
        this.mColorFaceMarkerActive = color;
    }

    private final void setFaceMarkerInActiveColor(int color) {
        this.mColorFaceMarkerInActive = color;
    }

    private final void setFaceRecognizedColor(int color) {
        this.mFaceRecognizingPaint.setColor(color);
        this.mFaceDetectionCirclePaint.setColor(color);
        invalidate();
    }

    private final void setOverlayColor(int color) {
        this.mColorOverlay = color;
        invalidate();
    }

    private final void setProgressRange(IntRange intRange) {
        if (Intrinsics.areEqual(intRange, this.progressRange)) {
            return;
        }
        this.progressRange = intRange;
        postInvalidateOnAnimation();
    }

    private final void setProgressRotationAngle(float f11) {
        if (f11 == this.progressRotationAngle) {
            return;
        }
        this.progressRotationAngle = f11;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRecognizingFactor(float f11) {
        if (this.recognizingFactor == f11) {
            return;
        }
        this.recognizingFactor = RangesKt.coerceIn(f11, -1.0f, 1.0f);
        updateOverlay();
        postInvalidate();
    }

    @NotNull
    public final Rect getFaceCapturingRect() {
        int iCoerceAtMost = RangesKt.coerceAtMost((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) - (((this.mMarkerSize * 2) + (this.mMarkerPadding * 2)) + ((int) this.mFaceProgressMarkerPaint.getStrokeWidth()));
        int paddingLeft = getPaddingLeft() + ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - iCoerceAtMost) / 2);
        int paddingTop = getPaddingTop() + ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - iCoerceAtMost) / 2);
        return new Rect(paddingLeft, paddingTop, paddingLeft + iCoerceAtMost, iCoerceAtMost + paddingTop);
    }

    @Nullable
    public final RectF getFaceRectangle() {
        return this.faceRectangle;
    }

    @NotNull
    public final RectF getHelperRectF() {
        return this.helperRectF;
    }

    @Nullable
    public final SNSFaceStateListener getStateListener() {
        return this.stateListener;
    }

    public final void setFaceAnalyzingState() {
        this.radiusAnimation.animateToFinalPosition(0.0f);
        setProgressRange(IntRange.INSTANCE.getEMPTY());
        this.recognizingAnimationDirect.cancel();
        this.recognizingAnimationInDirect.cancel();
        if (this.progressRotationAnimator.isStarted()) {
            return;
        }
        this.progressRotationAnimator.start();
    }

    public final void setFaceDetectedState() {
        this.radiusAnimation.animateToFinalPosition(0.0f);
        if (!this.recognizingAnimationDirect.isStarted() && !this.recognizingAnimationInDirect.isStarted()) {
            this.recognizingAnimationDirect.start();
            this.recognizingAnimationInDirect.cancel();
        }
        setProgressRange(new IntRange(0, TXVodDownloadDataSource.QUALITY_360P));
        if (this.progressRotationAnimator.isStarted()) {
            return;
        }
        this.progressRotationAnimator.start();
    }

    public final void setFaceRectangle(@Nullable RectF rectF) {
        if (Intrinsics.areEqual(rectF, this.faceRectangle)) {
            return;
        }
        this.faceRectangle = rectF;
        postInvalidate();
    }

    public final void setRecognizingState() {
        this.radiusAnimation.animateToFinalPosition(-50.0f);
        setProgressRange(IntRange.INSTANCE.getEMPTY());
        this.recognizingAnimationDirect.cancel();
        this.recognizingAnimationInDirect.cancel();
        this.progressRotationAnimator.cancel();
    }

    public final void setScanCompleteState() {
        this.radiusAnimation.animateToFinalPosition(1000.0f);
        setProgressRange(IntRange.INSTANCE.getEMPTY());
        this.recognizingAnimationDirect.cancel();
        this.recognizingAnimationInDirect.cancel();
        this.progressRotationAnimator.cancel();
    }

    public final void setStateListener(@Nullable SNSFaceStateListener sNSFaceStateListener) {
        this.stateListener = sNSFaceStateListener;
    }

    @JvmOverloads
    public SNSLivenessFaceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    private final void drawRecognizingCircle(Canvas canvas) {
        float fCenterX = getFaceCapturingRect().centerX();
        float fCenterY = getFaceCapturingRect().centerY();
        float fMax = Math.max((1 - this.recognizingFactor) * this.focusRadius, getFaceCapturingRect().width() / 2.0f);
        Bitmap bitmap = this.bgBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        if (isAnalyzing()) {
            canvas.drawCircle(fCenterX, fCenterY, fMax, this.mFaceScanCompletePaint);
        } else {
            canvas.drawCircle(fCenterX, fCenterY, fMax, this.mFaceDetectionCirclePaint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void progressRotationAnimator$lambda$8$lambda$7(SNSLivenessFaceView sNSLivenessFaceView, ValueAnimator valueAnimator) {
        sNSLivenessFaceView.setProgressRotationAngle(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void updateOverlay() {
        float fCenterX = getFaceCapturingRect().centerX();
        float fCenterY = getFaceCapturingRect().centerY();
        float fMax = Math.max((1 - this.recognizingFactor) * this.focusRadius, getFaceCapturingRect().width() / 2.0f);
        Bitmap bitmap = this.bgBitmap;
        if (bitmap != null) {
            Canvas canvas = new Canvas(bitmap);
            canvas.drawColor(this.mColorOverlay);
            canvas.drawCircle(fCenterX, fCenterY, fMax, this.mFaceCutCirclePaint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updater$lambda$2(SNSLivenessFaceView sNSLivenessFaceView, ValueAnimator valueAnimator) {
        sNSLivenessFaceView.setDetectingFactor(((Float) valueAnimator.getAnimatedValue()).floatValue());
        sNSLivenessFaceView.detectingArc1RotationAngle = (Math.abs(sNSLivenessFaceView.detectingFactor) * 0.3f) + sNSLivenessFaceView.detectingArc1RotationAngle;
        sNSLivenessFaceView.detectingArc2RotationAngle = (Math.abs(sNSLivenessFaceView.detectingFactor) * 0.5f) + sNSLivenessFaceView.detectingArc2RotationAngle;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.radiusAnimation.cancel();
        this.recognizingAnimationDirect.cancel();
        this.recognizingAnimationInDirect.cancel();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        RectF rectF;
        super.onDraw(canvas);
        canvas.save();
        drawRecognizingCircle(canvas);
        if (isAnalyzing()) {
            drawMarkers(canvas);
        }
        if (this.recognizingFactor == 0.0f && !isAnalyzing()) {
            drawRecognizingArc(canvas);
        }
        if (this.recognizingFactor < 0.0f && (rectF = this.faceRectangle) != null) {
            canvas.drawRect(rectF, this.mFaceRectanglePaint);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iCoerceAtMost = RangesKt.coerceAtMost((View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingStart()) - getPaddingEnd(), (View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop()) - getPaddingBottom());
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingEnd() + getPaddingStart() + iCoerceAtMost, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iCoerceAtMost, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        Bitmap bitmap;
        super.onSizeChanged(w11, h11, oldw, oldh);
        Rect faceCapturingRect = getFaceCapturingRect();
        float fCoerceAtLeast = RangesKt.coerceAtLeast(faceCapturingRect.centerX(), w11 - faceCapturingRect.centerX());
        float fCoerceAtLeast2 = RangesKt.coerceAtLeast(faceCapturingRect.centerY(), h11 - faceCapturingRect.centerY());
        this.maxRadius = (int) Math.sqrt((fCoerceAtLeast2 * fCoerceAtLeast2) + (fCoerceAtLeast * fCoerceAtLeast));
        this.focusRadius = getFaceCapturingRect().width() / 2;
        Bitmap bitmap2 = this.bgBitmap;
        if (bitmap2 != null && !bitmap2.isRecycled() && (bitmap = this.bgBitmap) != null) {
            bitmap.recycle();
        }
        setBgBitmap(Bitmap.createBitmap(w11, h11, Bitmap.Config.ARGB_8888));
    }

    public /* synthetic */ SNSLivenessFaceView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_ProofaceViewStyle : i11, (i13 & 8) != 0 ? R$style.SNSProofaceViewStyle : i12);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.dynamicanimation.animation.FloatPropertyCompat, com.sumsub.sns.core.widget.SNSLivenessFaceView$radiusHolder$1] */
    @JvmOverloads
    public SNSLivenessFaceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        Integer numM69172a;
        Integer numM69172a2;
        Integer numM69172a3;
        super(context, attributeSet, i11);
        this.helperRectF = new RectF();
        this.recognizingFactor = -1.0f;
        ?? r11 = new FloatPropertyCompat<SNSLivenessFaceView>() { // from class: com.sumsub.sns.core.widget.SNSLivenessFaceView$radiusHolder$1
            {
                super("recognizingFactor");
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float getValue(SNSLivenessFaceView view) {
                return this.this$0.recognizingFactor * 1000.0f;
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void setValue(SNSLivenessFaceView view, float value) {
                this.this$0.setRecognizingFactor(value / 1000.0f);
            }
        };
        this.radiusHolder = r11;
        SpringAnimation springAnimation = new SpringAnimation(this, r11, this.recognizingFactor);
        springAnimation.getSpring().setDampingRatio(0.75f);
        springAnimation.getSpring().setStiffness(200.0f);
        springAnimation.setMinValue(-1000.0f);
        springAnimation.setMaxValue(1000.0f);
        springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: com.sumsub.sns.core.widget.b0
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z11, float f11, float f12) {
                SNSLivenessFaceView.radiusAnimation$lambda$1$lambda$0(this.f57566a, dynamicAnimation, z11, f11, f12);
            }
        });
        this.radiusAnimation = springAnimation;
        this.detectingFactor = -1.0f;
        this.detectingAnimationSpeed = 1000L;
        this.detectingArc1RotationAngle = 25.0f;
        this.detectingArc2RotationAngle = 25.0f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.sumsub.sns.core.widget.c0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SNSLivenessFaceView.updater$lambda$2(this.f57568b, valueAnimator);
            }
        };
        this.updater = animatorUpdateListener;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-1.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(this.detectingAnimationSpeed);
        valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.sumsub.sns.core.widget.SNSLivenessFaceView$recognizingAnimationDirect$lambda$4$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                if (this.this$0.isAnalyzing()) {
                    return;
                }
                this.this$0.recognizingAnimationInDirect.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        this.recognizingAnimationDirect = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, -1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.setDuration(this.detectingAnimationSpeed);
        valueAnimatorOfFloat2.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfFloat2.addListener(new Animator.AnimatorListener() { // from class: com.sumsub.sns.core.widget.SNSLivenessFaceView$recognizingAnimationInDirect$lambda$6$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                if (this.this$0.isAnalyzing()) {
                    return;
                }
                this.this$0.recognizingAnimationDirect.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        this.recognizingAnimationInDirect = valueAnimatorOfFloat2;
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 4.0f);
        valueAnimatorOfFloat3.setDuration(this.detectingAnimationSpeed);
        valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sumsub.sns.core.widget.d0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SNSLivenessFaceView.progressRotationAnimator$lambda$8$lambda$7(this.f57572b, valueAnimator);
            }
        });
        valueAnimatorOfFloat3.setRepeatCount(-1);
        this.progressRotationAnimator = valueAnimatorOfFloat3;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint.setStyle(style);
        paint.setStrokeJoin(Paint.Join.ROUND);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.mFaceProgressMarkerPaint = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        this.mFaceDetectionCirclePaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.mFaceCutCirclePaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        this.mFaceScanCompletePaint = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(style2);
        paint5.setStrokeCap(cap);
        this.mFaceRecognizingPaint = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStyle(style2);
        paint6.setColor(-65281);
        paint6.setStrokeWidth((int) (2 * Resources.getSystem().getDisplayMetrics().density));
        this.mFaceRectanglePaint = paint6;
        this.progressRange = IntRange.INSTANCE.getEMPTY();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSLivenessFaceView, i11, i12);
        this.mColorFaceMarkerActive = AbstractC28485q.m69379a(typedArrayObtainStyledAttributes, R$styleable.SNSLivenessFaceView_sns_ProofaceMarkerActiveColor, -65281);
        this.mColorFaceMarkerInActive = AbstractC28485q.m69379a(typedArrayObtainStyledAttributes, R$styleable.SNSLivenessFaceView_sns_ProofaceMarkerInActiveColor, -65281);
        paint.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R$styleable.SNSLivenessFaceView_sns_ProofaceMarkerStroke, 0.0f));
        paint2.setStrokeWidth(paint.getStrokeWidth());
        this.mMarkerSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSLivenessFaceView_sns_ProofaceMarkerSize, 0);
        this.mMarkerPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSLivenessFaceView_sns_ProofaceMarkerPadding, 0);
        this.mColorOverlay = AbstractC28485q.m69379a(typedArrayObtainStyledAttributes, R$styleable.SNSLivenessFaceView_sns_ProofaceOverlayColor, -1);
        paint4.setColor(AbstractC28485q.m69379a(typedArrayObtainStyledAttributes, R$styleable.SNSLivenessFaceView_sns_ProofaceCompleteOverlayColor, -1));
        paint5.setColor(AbstractC28485q.m69379a(typedArrayObtainStyledAttributes, R$styleable.SNSLivenessFaceView_sns_ProofaceRecognizingColor, -1));
        paint2.setColor(paint5.getColor());
        paint5.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R$styleable.SNSLivenessFaceView_sns_ProofaceRecognizingStroke, 0.0f));
        this.detectingAnimationSpeed = typedArrayObtainStyledAttributes.getInt(R$styleable.SNSLivenessFaceView_sns_ProofaceRecognizingAnimationSpeed, 1000);
        int i13 = R$styleable.SNSLivenessFaceView_android_padding;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, 0);
            setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        } else {
            setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSLivenessFaceView_android_paddingLeft, getPaddingLeft()), typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSLivenessFaceView_android_paddingTop, getPaddingTop()), typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSLivenessFaceView_android_paddingRight, getPaddingRight()), typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSLivenessFaceView_android_paddingBottom, getPaddingBottom()));
        }
        typedArrayObtainStyledAttributes.recycle();
        paint.setColor(this.mColorFaceMarkerActive);
        SNSColorElement sNSColorElement = SNSColorElement.BACKGROUND_COMMON;
        C28966p c28966pM69169a = AbstractC28233a.m69169a();
        if (c28966pM69169a != null && (numM69172a3 = AbstractC28233a.m69172a(c28966pM69169a, sNSColorElement, AbstractC28458h.m69346a(getResources().getConfiguration()))) != null) {
            setOverlayColor(numM69172a3.intValue());
        }
        SNSColorElement sNSColorElement2 = SNSColorElement.CONTENT_SUCCESS;
        C28966p c28966pM69169a2 = AbstractC28233a.m69169a();
        if (c28966pM69169a2 != null && (numM69172a2 = AbstractC28233a.m69172a(c28966pM69169a2, sNSColorElement2, AbstractC28458h.m69346a(getResources().getConfiguration()))) != null) {
            int iIntValue = numM69172a2.intValue();
            setFaceRecognizedColor(iIntValue);
            setFaceMarkerActiveColor(iIntValue);
        }
        SNSColorElement sNSColorElement3 = SNSColorElement.CONTENT_WEAK;
        C28966p c28966pM69169a3 = AbstractC28233a.m69169a();
        if (c28966pM69169a3 == null || (numM69172a = AbstractC28233a.m69172a(c28966pM69169a3, sNSColorElement3, AbstractC28458h.m69346a(getResources().getConfiguration()))) == null) {
            return;
        }
        setFaceMarkerInActiveColor(numM69172a.intValue());
    }
}
