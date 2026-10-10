package j90;

import android.widget.ImageView;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: j90.f */
/* JADX INFO: compiled from: SVGAScaleInfo.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u0003R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\"\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\"\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\"\u0010'\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010#\u001a\u0004\b\u000f\u0010$\"\u0004\b%\u0010&¨\u0006("}, m90084d2 = {"Lj90/f;", "", "<init>", "()V", "", "canvasWidth", "canvasHeight", "videoWidth", "videoHeight", "Landroid/widget/ImageView$ScaleType;", "scaleType", "", "f", "(FFFFLandroid/widget/ImageView$ScaleType;)V", "g", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "F", "d", "()F", "setTranFx", "(F)V", "tranFx", "b", "e", "setTranFy", "tranFy", "c", "setScaleFx", "scaleFx", "setScaleFy", "scaleFy", "getRatio", "setRatio", "ratio", "", "Z", "()Z", "setRatioX", "(Z)V", "ratioX", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class C40357f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public float tranFx;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public float tranFy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public float scaleFx = 1.0f;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float scaleFy = 1.0f;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public float ratio = 1.0f;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean ratioX;

    /* JADX INFO: renamed from: f */
    public final void m88938f(float canvasWidth, float canvasHeight, float videoWidth, float videoHeight, @NotNull ImageView.ScaleType scaleType) {
        if (canvasWidth == 0.0f || canvasHeight == 0.0f || videoWidth == 0.0f || videoHeight == 0.0f) {
            return;
        }
        m88939g();
        float f11 = (canvasWidth - videoWidth) / 2.0f;
        float f12 = (canvasHeight - videoHeight) / 2.0f;
        float f13 = videoWidth / videoHeight;
        float f14 = canvasWidth / canvasHeight;
        float f15 = canvasHeight / videoHeight;
        float f16 = canvasWidth / videoWidth;
        switch (C40356e.$EnumSwitchMapping$0[scaleType.ordinal()]) {
            case 1:
                this.tranFx = f11;
                this.tranFy = f12;
                break;
            case 2:
                if (f13 <= f14) {
                    this.ratio = f16;
                    this.ratioX = true;
                    this.scaleFx = f16;
                    this.scaleFy = f16;
                    this.tranFy = (canvasHeight - (videoHeight * f16)) / 2.0f;
                } else {
                    this.ratio = f15;
                    this.ratioX = false;
                    this.scaleFx = f15;
                    this.scaleFy = f15;
                    this.tranFx = (canvasWidth - (videoWidth * f15)) / 2.0f;
                }
                break;
            case 3:
                if (videoWidth < canvasWidth && videoHeight < canvasHeight) {
                    this.tranFx = f11;
                    this.tranFy = f12;
                } else if (f13 <= f14) {
                    this.ratio = f15;
                    this.ratioX = false;
                    this.scaleFx = f15;
                    this.scaleFy = f15;
                    this.tranFx = (canvasWidth - (videoWidth * f15)) / 2.0f;
                } else {
                    this.ratio = f16;
                    this.ratioX = true;
                    this.scaleFx = f16;
                    this.scaleFy = f16;
                    this.tranFy = (canvasHeight - (videoHeight * f16)) / 2.0f;
                }
                break;
            case 4:
                if (f13 <= f14) {
                    this.ratio = f15;
                    this.ratioX = false;
                    this.scaleFx = f15;
                    this.scaleFy = f15;
                    this.tranFx = (canvasWidth - (videoWidth * f15)) / 2.0f;
                } else {
                    this.ratio = f16;
                    this.ratioX = true;
                    this.scaleFx = f16;
                    this.scaleFy = f16;
                    this.tranFy = (canvasHeight - (videoHeight * f16)) / 2.0f;
                }
                break;
            case 5:
                if (f13 <= f14) {
                    this.ratio = f15;
                    this.ratioX = false;
                    this.scaleFx = f15;
                    this.scaleFy = f15;
                } else {
                    this.ratio = f16;
                    this.ratioX = true;
                    this.scaleFx = f16;
                    this.scaleFy = f16;
                }
                break;
            case 6:
                if (f13 <= f14) {
                    this.ratio = f15;
                    this.ratioX = false;
                    this.scaleFx = f15;
                    this.scaleFy = f15;
                    this.tranFx = canvasWidth - (videoWidth * f15);
                } else {
                    this.ratio = f16;
                    this.ratioX = true;
                    this.scaleFx = f16;
                    this.scaleFy = f16;
                    this.tranFy = canvasHeight - (videoHeight * f16);
                }
                break;
            case 7:
                this.ratio = Math.max(f16, f15);
                this.ratioX = f16 > f15;
                this.scaleFx = f16;
                this.scaleFy = f15;
                break;
            default:
                this.ratio = f16;
                this.ratioX = true;
                this.scaleFx = f16;
                this.scaleFy = f16;
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m88939g() {
        this.tranFx = 0.0f;
        this.tranFy = 0.0f;
        this.scaleFx = 1.0f;
        this.scaleFy = 1.0f;
        this.ratio = 1.0f;
        this.ratioX = false;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getRatioX() {
        return this.ratioX;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getScaleFx() {
        return this.scaleFx;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getScaleFy() {
        return this.scaleFy;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getTranFx() {
        return this.tranFx;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getTranFy() {
        return this.tranFy;
    }
}
