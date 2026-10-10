package jumio.liveness;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.internal.view.SupportMenu;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.log.Log;
import com.jumio.core.C9301R;
import com.jumio.core.MobileContext;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.extraction.ExtractionUpdateState;
import com.jumio.core.extraction.liveness.extraction.LivenessUpdateState;
import com.jumio.core.overlay.BaseLivenessOverlay;
import com.jumio.core.overlay.BaseLivenessOverlayKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.liveness.A */
/* JADX INFO: loaded from: classes61.dex */
public final class C40772A extends BaseLivenessOverlay {

    /* JADX INFO: renamed from: m */
    public RectF f90564m;

    /* JADX INFO: renamed from: n */
    public boolean f90565n;

    /* JADX INFO: renamed from: o */
    public final int f90566o;

    /* JADX INFO: renamed from: p */
    public final int f90567p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40772A(MobileContext mobileContext) {
        super(mobileContext);
        Intrinsics.checkNotNullParameter(mobileContext, "mobileContext");
        this.f90564m = new RectF();
        new RectF();
        Integer num = getStyleMap().get(Integer.valueOf(C9301R.attr.jumio_scanOverlay_livenessStrokeAnimation));
        this.f90566o = num != null ? num.intValue() : C9301R.color.jumio_green_3;
        Integer num2 = getStyleMap().get(Integer.valueOf(C9301R.attr.jumio_scanOverlay_livenessStrokeAnimationCompleted));
        this.f90567p = num2 != null ? num2.intValue() : C9301R.color.jumio_green_6;
        Paint paint = new Paint(1);
        Paint.Join join = Paint.Join.MITER;
        paint.setStrokeJoin(join);
        Integer num3 = getStyleMap().get(Integer.valueOf(C9301R.attr.jumio_scanOverlay));
        paint.setColor(num3 != null ? num3.intValue() : -65536);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        paint2.setStrokeJoin(join);
        paint2.setColor(SupportMenu.CATEGORY_MASK);
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        paint3.setStrokeJoin(join);
        paint3.setColor(-16711936);
        paint3.setStyle(style);
    }

    @Override // com.jumio.core.overlay.BaseLivenessOverlay, com.jumio.core.overlay.Overlay
    public final void calculate(CameraSettings cameraSettings, Rect extractionArea) {
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        super.calculate(cameraSettings, extractionArea);
    }

    @Override // com.jumio.core.overlay.BaseLivenessOverlay, com.jumio.core.overlay.Overlay
    public final void doDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    @Override // com.jumio.core.overlay.BaseLivenessOverlay, com.jumio.core.overlay.Overlay
    public final void update(ExtractionUpdateInterface extractionUpdate) {
        AnimatedVectorDrawable animatedVectorDrawableAnimatedDrawable;
        Intrinsics.checkNotNullParameter(extractionUpdate, "extractionUpdate");
        super.update(extractionUpdate);
        Integer f13842a = extractionUpdate.getF13842a();
        LivenessUpdateState livenessUpdateState = LivenessUpdateState.INSTANCE;
        int faceRoiRect = livenessUpdateState.getFaceRoiRect();
        if (f13842a != null && f13842a.intValue() == faceRoiRect) {
            Object data = extractionUpdate.getData();
            RectF rectF = data instanceof RectF ? (RectF) data : null;
            if (rectF == null) {
                rectF = new RectF();
            }
            this.f90564m = rectF;
            Log.m14479v("LivenessOverlay", "Current corners are " + this.f90564m);
            return;
        }
        int faceCenterArea = livenessUpdateState.getFaceCenterArea();
        if (f13842a != null && f13842a.intValue() == faceCenterArea) {
            Object data2 = extractionUpdate.getData();
            if ((data2 instanceof RectF ? (RectF) data2 : null) == null) {
                new RectF();
                return;
            }
            return;
        }
        ExtractionUpdateState.Companion companion = ExtractionUpdateState.INSTANCE;
        int resetOverlay = companion.getResetOverlay();
        if (f13842a != null && f13842a.intValue() == resetOverlay) {
            resetOverlayAnimation();
            this.f90565n = false;
            Object data3 = extractionUpdate.getData();
            Float f11 = data3 instanceof Float ? (Float) data3 : null;
            resizeOverlay(f11 != null ? f11.floatValue() : 1.0f);
            return;
        }
        int holdStill = companion.getHoldStill();
        if (f13842a != null && f13842a.intValue() == holdStill) {
            if (this.f90565n) {
                return;
            }
            this.f90565n = true;
            AppCompatImageView f14433d = getF14433d();
            if (f14433d != null && (animatedVectorDrawableAnimatedDrawable = BaseLivenessOverlayKt.animatedDrawable(f14433d, C9301R.id.liveness_overlay_main)) != null) {
                BaseLivenessOverlayKt.setColor(animatedVectorDrawableAnimatedDrawable, this.f90566o);
                animatedVectorDrawableAnimatedDrawable.start();
            }
            changeColorOfOverlayCircle(this.f90567p, 500L);
            changeColorOfOverlayCircle(this.f90566o, 660L);
            changeColorOfOverlayCircle(this.f90567p, 830L);
            return;
        }
        int fallbackRequired = companion.getFallbackRequired();
        if (f13842a == null || f13842a.intValue() != fallbackRequired) {
            int moveFaceIntoFrame = livenessUpdateState.getMoveFaceIntoFrame();
            if (f13842a == null || f13842a.intValue() != moveFaceIntoFrame) {
                int centerFace = livenessUpdateState.getCenterFace();
                if (f13842a == null || f13842a.intValue() != centerFace) {
                    int moveFaceCloser = livenessUpdateState.getMoveFaceCloser();
                    if (f13842a == null || f13842a.intValue() != moveFaceCloser) {
                        int faceTooClose = livenessUpdateState.getFaceTooClose();
                        if (f13842a == null || f13842a.intValue() != faceTooClose) {
                            int levelEyesAndDevice = livenessUpdateState.getLevelEyesAndDevice();
                            if (f13842a == null || f13842a.intValue() != levelEyesAndDevice) {
                                int faceTiltUp = livenessUpdateState.getFaceTiltUp();
                                if (f13842a == null || f13842a.intValue() != faceTiltUp) {
                                    int faceTiltDown = livenessUpdateState.getFaceTiltDown();
                                    if (f13842a == null || f13842a.intValue() != faceTiltDown) {
                                        int faceTiltLeft = livenessUpdateState.getFaceTiltLeft();
                                        if (f13842a == null || f13842a.intValue() != faceTiltLeft) {
                                            int faceTiltRight = livenessUpdateState.getFaceTiltRight();
                                            if (f13842a == null || f13842a.intValue() != faceTiltRight) {
                                                int updateColor = livenessUpdateState.getUpdateColor();
                                                if (f13842a != null && f13842a.intValue() == updateColor) {
                                                    Object data4 = extractionUpdate.getData();
                                                    Intrinsics.checkNotNull(data4, "null cannot be cast to non-null type kotlin.Int");
                                                    setPhotinusColor(((Integer) data4).intValue());
                                                    return;
                                                } else {
                                                    Log.m14463d("LivenessOverlay", "Skipped handling for update " + extractionUpdate);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        resetOverlayAnimation();
        this.f90565n = false;
    }
}
