package p611s;

import ai.advance.sdk.global.iqa.lib.code.ImageWarnCode;
import org.json.JSONObject;

/* JADX INFO: renamed from: s.c */
/* JADX INFO: loaded from: classes23.dex */
public class C44209c {

    /* JADX INFO: renamed from: a */
    public JSONObject f97580a;

    /* JADX INFO: renamed from: b */
    public float f97581b;

    /* JADX INFO: renamed from: c */
    public boolean f97582c;

    /* JADX INFO: renamed from: d */
    public boolean f97583d;

    /* JADX INFO: renamed from: e */
    public boolean f97584e;

    /* JADX INFO: renamed from: f */
    public boolean f97585f;

    /* JADX INFO: renamed from: g */
    public boolean f97586g;

    /* JADX INFO: renamed from: h */
    public float f97587h;

    /* JADX INFO: renamed from: i */
    public boolean f97588i;

    /* JADX INFO: renamed from: j */
    public boolean f97589j;

    /* JADX INFO: renamed from: k */
    public long f97590k;

    /* JADX INFO: renamed from: l */
    public String f97591l;

    /* JADX INFO: renamed from: m */
    public JSONObject f97592m;

    /* JADX INFO: renamed from: n */
    public long f97593n;

    /* JADX INFO: renamed from: o */
    public float f97594o;

    /* JADX INFO: renamed from: p */
    public float f97595p;

    /* JADX INFO: renamed from: q */
    public float f97596q;

    /* JADX INFO: renamed from: r */
    public float f97597r;

    /* JADX INFO: renamed from: s */
    public float f97598s;

    /* JADX INFO: renamed from: t */
    public float f97599t;

    /* JADX INFO: renamed from: u */
    public float f97600u;

    /* JADX INFO: renamed from: v */
    public float f97601v;

    /* JADX INFO: renamed from: w */
    public float f97602w;

    /* JADX INFO: renamed from: x */
    public float f97603x;

    /* JADX INFO: renamed from: y */
    public float f97604y;

    /* JADX INFO: renamed from: a */
    public ImageWarnCode m97480a() {
        if (this.f97582c) {
            return ImageWarnCode.NO_CARD;
        }
        if (this.f97585f) {
            return ImageWarnCode.TOO_SMALL_CARD;
        }
        if (this.f97584e) {
            return ImageWarnCode.EDGE_CROSS;
        }
        if (this.f97589j) {
            return ImageWarnCode.CARD_GLOSSY;
        }
        if (this.f97586g) {
            return ImageWarnCode.CARD_POOR_QUALITY;
        }
        return this.f97588i ? ImageWarnCode.CARD_OCCLUDED : ImageWarnCode.GOOD;
    }

    /* JADX INFO: renamed from: b */
    public boolean m97481b() {
        return this.f97583d;
    }

    public String toString() {
        return "ModelResultData{modelValues=" + this.f97580a + ", cardSize=" + this.f97581b + ", cardNotExists=" + this.f97582c + ", isBlur=" + this.f97583d + ", cardEdgeCross=" + this.f97584e + ", cardAreaTooSmall=" + this.f97585f + ", isPoorQuality=" + this.f97586g + ", isCardOccluded=" + this.f97588i + ", isCardGlossy=" + this.f97589j + ", qualityScore=" + this.f97587h + ", timestamp=" + this.f97590k + ", detectionResultJSON='" + this.f97591l + "', outputEventInfo=" + this.f97592m + ", detectionTimeMills=" + this.f97593n + ", cardLeft=" + this.f97594o + ", cardRight=" + this.f97595p + ", cardTop=" + this.f97596q + ", cardBottom=" + this.f97597r + ", area=" + this.f97598s + ", minGapRatio=" + this.f97599t + ", exposureScore=" + this.f97600u + ", blurScore=" + this.f97601v + ", dimScore=" + this.f97602w + ", occlusionScore=" + this.f97603x + ", glossyScore=" + this.f97604y + '}';
    }
}
