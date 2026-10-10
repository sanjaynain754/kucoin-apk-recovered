package ai.advance.sdk.global.iqa.lib;

import ai.advance.sdk.global.iqa.lib.enums.ScreenOrientation;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class UIExtras implements Serializable {

    /* JADX INFO: renamed from: A */
    private TipViewUIElements f1009A;

    /* JADX INFO: renamed from: B */
    private TipViewUIElements f1010B;

    /* JADX INFO: renamed from: C */
    private Integer f1011C;

    /* JADX INFO: renamed from: a */
    private Integer f1012a;

    /* JADX INFO: renamed from: b */
    private Integer f1013b;

    /* JADX INFO: renamed from: f */
    private Integer f1017f;

    /* JADX INFO: renamed from: g */
    private Integer f1018g;

    /* JADX INFO: renamed from: h */
    private Integer f1019h;

    /* JADX INFO: renamed from: i */
    private Integer f1020i;

    /* JADX INFO: renamed from: j */
    private Integer f1021j;

    /* JADX INFO: renamed from: k */
    private Integer f1022k;

    /* JADX INFO: renamed from: l */
    private Integer f1023l;

    /* JADX INFO: renamed from: m */
    private Integer f1024m;

    /* JADX INFO: renamed from: n */
    private Integer f1025n;

    /* JADX INFO: renamed from: o */
    private Integer f1026o;

    /* JADX INFO: renamed from: q */
    private Integer f1028q;

    /* JADX INFO: renamed from: r */
    private Integer f1029r;

    /* JADX INFO: renamed from: s */
    private Float f1030s;

    /* JADX INFO: renamed from: t */
    private Float f1031t;

    /* JADX INFO: renamed from: u */
    private Integer f1032u;

    /* JADX INFO: renamed from: v */
    private CharSequence f1033v;

    /* JADX INFO: renamed from: w */
    private CharSequence f1034w;

    /* JADX INFO: renamed from: x */
    private CharSequence f1035x;

    /* JADX INFO: renamed from: y */
    private Integer f1036y;

    /* JADX INFO: renamed from: z */
    private boolean f1037z;

    /* JADX INFO: renamed from: c */
    private boolean f1014c = true;

    /* JADX INFO: renamed from: d */
    private boolean f1015d = true;

    /* JADX INFO: renamed from: e */
    private boolean f1016e = true;

    /* JADX INFO: renamed from: p */
    private boolean f1027p = true;

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.lib.UIExtras$a */
    public static class C0355a {

        /* JADX INFO: renamed from: a */
        public UIExtras f1038a = new UIExtras();

        /* JADX INFO: renamed from: a */
        public UIExtras m1393a() {
            return this.f1038a;
        }

        /* JADX INFO: renamed from: c */
        public C0355a m1395c(ScreenOrientation screenOrientation) {
            UIExtras uIExtras;
            int i11 = C0356b.f1039a[screenOrientation.ordinal()];
            int i12 = 1;
            if (i11 == 1) {
                uIExtras = this.f1038a;
            } else {
                if (i11 != 2) {
                    return this;
                }
                uIExtras = this.f1038a;
                i12 = 0;
            }
            uIExtras.f1019h = Integer.valueOf(i12);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C0355a m1394b(Integer num) {
            if (num.intValue() <= 5) {
                this.f1038a.f1032u = 5;
                return this;
            }
            if (num.intValue() >= 60) {
                this.f1038a.f1032u = 60;
                return this;
            }
            this.f1038a.f1032u = num;
            return this;
        }
    }

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.lib.UIExtras$b */
    public static /* synthetic */ class C0356b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1039a;

        static {
            int[] iArr = new int[ScreenOrientation.values().length];
            f1039a = iArr;
            try {
                iArr[ScreenOrientation.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1039a[ScreenOrientation.LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public Float getCameraHeightPercentInLandscapeState() {
        return this.f1031t;
    }

    public Float getCameraWidthPercentInPortraitState() {
        return this.f1030s;
    }

    public Integer getContinueBtnTextColor() {
        return this.f1029r;
    }

    public Integer getFrameRectColor() {
        return this.f1017f;
    }

    public Integer getFrameRectCornerRadius() {
        return this.f1018g;
    }

    public TipViewUIElements getLandscapeTipViewBackgrounds() {
        return this.f1010B;
    }

    public Integer getPageColor() {
        return this.f1023l;
    }

    public Integer getPageLandscapeBackgroundResource() {
        return this.f1022k;
    }

    public Integer getPageLandscapeTitleBgResource() {
        return this.f1026o;
    }

    public Integer getPagePortraitBackgroundResource() {
        return this.f1021j;
    }

    public Integer getPagePortraitTitleBgResource() {
        return this.f1025n;
    }

    public TipViewUIElements getPortraitTipViewBackgrounds() {
        return this.f1009A;
    }

    public Integer getPrimaryTextColor() {
        return this.f1012a;
    }

    public Integer getRetakeBtnTextColor() {
        return this.f1028q;
    }

    public Integer getScanLimitSeconds() {
        Integer num = this.f1032u;
        return Integer.valueOf(num == null ? 20 : num.intValue());
    }

    public Integer getScreenOrientation() {
        return this.f1019h;
    }

    public CharSequence getSpannablePreviewTipOfTakePhoto() {
        return this.f1035x;
    }

    public CharSequence getSpannableTextAboveCamera() {
        return this.f1033v;
    }

    public CharSequence getSpannableTipTextOfTakePhoto() {
        return this.f1034w;
    }

    public Integer getTakePhotoTipDialogShowSeconds() {
        Integer num = this.f1011C;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public Integer getTakePhotoTipViewBackgroundColor() {
        return this.f1036y;
    }

    public Integer getTakePhotoViewIcon() {
        return this.f1020i;
    }

    public Integer getTitleBgColor() {
        return this.f1024m;
    }

    public Integer getTitleTextColor() {
        return this.f1013b;
    }

    public boolean isCountdownTimerVisible() {
        return this.f1027p;
    }

    public boolean isFlipCameraBtnVisible() {
        return this.f1015d;
    }

    public boolean isLightBtnVisible() {
        return this.f1014c;
    }

    public boolean isTakePhotoTipViewLeftIconVisible() {
        return this.f1037z;
    }

    public boolean isTipIconVisible() {
        return this.f1016e;
    }

    @Deprecated
    public void setSpannablePreviewTipOfTakePhoto(CharSequence charSequence) {
        this.f1035x = charSequence;
    }

    @Deprecated
    public void setSpannableTextAboveCamera(CharSequence charSequence) {
        this.f1033v = charSequence;
    }

    @Deprecated
    public void setSpannableTipTextOfTakePhoto(CharSequence charSequence) {
        this.f1034w = charSequence;
    }

    /* JADX INFO: renamed from: a */
    public void m1392a(Integer num) {
        this.f1032u = num;
    }
}
