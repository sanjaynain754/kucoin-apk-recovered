package ai.advance.sdk.global.iqa;

import ai.advance.sdk.global.iqa.lib.GlobalIQAView;
import ai.advance.sdk.global.iqa.lib.IQAPageState;
import ai.advance.sdk.global.iqa.lib.TipViewUIElements;
import ai.advance.sdk.global.iqa.lib.UIExtras;
import ai.advance.sdk.global.iqa.lib.code.ImageWarnCode;
import ai.advance.sdk.global.iqa.lib.widgets.ImageQualityRootLayout;
import android.animation.ObjectAnimator;
import android.app.ProgressDialog;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.proguard.C33627eb;

/* JADX INFO: renamed from: ai.advance.sdk.global.iqa.c */
/* JADX INFO: loaded from: classes23.dex */
public class ViewOnClickListenerC0346c implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public GlobalIQAActivity f949b;

    /* JADX INFO: renamed from: c */
    public GlobalIQAView f950c;

    /* JADX INFO: renamed from: d */
    public ImageQualityRootLayout f951d;

    /* JADX INFO: renamed from: e */
    public TextView f952e;

    /* JADX INFO: renamed from: f */
    public ImageView f953f;

    /* JADX INFO: renamed from: g */
    public TextView f954g;

    /* JADX INFO: renamed from: h */
    public ImageView f955h;

    /* JADX INFO: renamed from: i */
    public TextView f956i;

    /* JADX INFO: renamed from: j */
    public TextView f957j;

    /* JADX INFO: renamed from: k */
    public TextView f958k;

    /* JADX INFO: renamed from: l */
    public final Resources f959l;

    /* JADX INFO: renamed from: m */
    public final IQAPageState f960m;

    /* JADX INFO: renamed from: n */
    public TextView f961n;

    /* JADX INFO: renamed from: o */
    public ImageView f962o;

    /* JADX INFO: renamed from: p */
    public View f963p;

    /* JADX INFO: renamed from: q */
    public TextView f964q;

    /* JADX INFO: renamed from: r */
    public ImageView f965r;

    /* JADX INFO: renamed from: s */
    public View f966s;

    /* JADX INFO: renamed from: t */
    public ProgressDialog f967t;

    /* JADX INFO: renamed from: u */
    public ImageView f968u;

    /* JADX INFO: renamed from: v */
    public InterfaceC0348e f969v;

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.c$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewOnClickListenerC0346c.this.f950c.m1339s();
            ViewOnClickListenerC0346c.this.f962o.setImageResource(ViewOnClickListenerC0346c.this.f950c.m1327g() ? R$drawable.iqa_light_off : R$drawable.iqa_light_on);
        }
    }

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.c$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewOnClickListenerC0346c.this.f950c.m1340t();
            ViewOnClickListenerC0346c viewOnClickListenerC0346c = ViewOnClickListenerC0346c.this;
            viewOnClickListenerC0346c.m1310s((!viewOnClickListenerC0346c.f950c.m1328h() || ViewOnClickListenerC0346c.this.f950c.m1326f()) ? 8 : 0);
            ViewOnClickListenerC0346c.this.f962o.setImageResource(ViewOnClickListenerC0346c.this.f950c.m1327g() ? R$drawable.iqa_light_off : R$drawable.iqa_light_on);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Integer m1283e(TipViewUIElements tipViewUIElements, ImageWarnCode imageWarnCode) {
        if (tipViewUIElements == null || imageWarnCode == null) {
            return null;
        }
        int i11 = c.f972a[imageWarnCode.ordinal()];
        if (i11 == 1) {
            return tipViewUIElements.getNoCardDrawableResId();
        }
        if (i11 == 2) {
            return tipViewUIElements.getCardPoorQualityDrawableResId();
        }
        if (i11 == 3) {
            return tipViewUIElements.getCardTooSmallDrawableResId();
        }
        if (i11 == 4) {
            return tipViewUIElements.getCardIncompleteDrawableResId();
        }
        if (i11 != 7) {
            return null;
        }
        return tipViewUIElements.getHoldSteadilyDrawableResId();
    }

    /* JADX INFO: renamed from: E */
    public void m1289E() {
        m1310s(0);
        m1308q(0);
        this.f961n.setVisibility(0);
        TextView textView = this.f956i;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.f955h.setVisibility(8);
        this.f957j.setVisibility(8);
        this.f958k.setVisibility(8);
    }

    /* JADX INFO: renamed from: F */
    public void m1290F() {
        m1308q(0);
        this.f961n.setVisibility(0);
        TextView textView = this.f956i;
        if (textView != null) {
            textView.setVisibility(0);
            CharSequence charSequenceM1312u = m1312u();
            if (charSequenceM1312u == null) {
                this.f956i.setText(R$string.iqa_take_photo_tips);
            } else {
                this.f956i.setText(charSequenceM1312u);
            }
            UIExtras uIExtras = this.f960m.uiExtras;
            if (uIExtras != null && uIExtras.getTakePhotoTipViewBackgroundColor() != null) {
                this.f956i.setBackgroundColor(this.f960m.uiExtras.getTakePhotoTipViewBackgroundColor().intValue());
            }
            this.f956i.setCompoundDrawablesWithIntrinsicBounds(m1316y() ? R$drawable.iqa_take_photo_tip : 0, 0, 0, 0);
        }
        if (!this.f960m.isPortrait()) {
            this.f952e.setVisibility(0);
            CharSequence charSequenceM1312u2 = m1312u();
            if (charSequenceM1312u2 == null) {
                this.f952e.setText(R$string.iqa_take_photo_tips);
            } else {
                this.f952e.setText(charSequenceM1312u2);
            }
            UIExtras uIExtras2 = this.f960m.uiExtras;
            if (uIExtras2 != null && uIExtras2.getTakePhotoTipViewBackgroundColor() != null) {
                this.f952e.setBackgroundColor(this.f960m.uiExtras.getTakePhotoTipViewBackgroundColor().intValue());
            }
            this.f952e.setCompoundDrawablesWithIntrinsicBounds(m1316y() ? R$drawable.iqa_take_photo_tip : 0, 0, 0, 0);
        }
        this.f955h.setVisibility(0);
        this.f957j.setVisibility(8);
        this.f958k.setVisibility(8);
        m1305n();
    }

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.c$c */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f972a;

        static {
            int[] iArr = new int[ImageWarnCode.values().length];
            f972a = iArr;
            try {
                iArr[ImageWarnCode.NO_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f972a[ImageWarnCode.CARD_POOR_QUALITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f972a[ImageWarnCode.TOO_SMALL_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f972a[ImageWarnCode.EDGE_CROSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f972a[ImageWarnCode.CARD_OCCLUDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f972a[ImageWarnCode.CARD_GLOSSY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f972a[ImageWarnCode.GOOD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m1286B() {
        ConstraintLayout.LayoutParams layoutParams;
        UIExtras uIExtras = this.f960m.uiExtras;
        if (uIExtras != null) {
            this.f963p.setVisibility(uIExtras.isFlipCameraBtnVisible() ? 0 : 8);
            Integer frameRectColor = this.f960m.uiExtras.getFrameRectColor();
            if (frameRectColor != null) {
                this.f951d.setLineColor(frameRectColor.intValue());
            }
            Integer frameRectCornerRadius = this.f960m.uiExtras.getFrameRectCornerRadius();
            if (frameRectCornerRadius != null) {
                this.f951d.setCornerRadius(frameRectCornerRadius);
            }
            Integer pageColor = this.f960m.uiExtras.getPageColor();
            if (pageColor != null) {
                View viewFindViewById = this.f949b.findViewById(R$id.bg_iqa_view_activity);
                viewFindViewById.setVisibility(0);
                viewFindViewById.setBackgroundColor(pageColor.intValue());
                View view = this.f966s;
                if (view != null) {
                    view.setBackgroundColor(pageColor.intValue());
                }
            }
            Integer titleTextColor = this.f960m.uiExtras.getTitleTextColor();
            if (titleTextColor != null) {
                this.f964q.setTextColor(titleTextColor.intValue());
            }
            Integer primaryTextColor = this.f960m.uiExtras.getPrimaryTextColor();
            if (primaryTextColor != null) {
                this.f961n.setTextColor(primaryTextColor.intValue());
                this.f954g.setTextColor(primaryTextColor.intValue());
                GradientDrawable gradientDrawable = (GradientDrawable) this.f954g.getBackground();
                gradientDrawable.mutate();
                gradientDrawable.setStroke(gradientDrawable.getIntrinsicWidth(), primaryTextColor.intValue());
                this.f952e.setTextColor(primaryTextColor.intValue());
            }
            CharSequence spannableTextAboveCamera = this.f960m.uiExtras.getSpannableTextAboveCamera();
            if (spannableTextAboveCamera != null) {
                this.f961n.setText(spannableTextAboveCamera);
            }
            Integer takePhotoViewIcon = this.f960m.uiExtras.getTakePhotoViewIcon();
            if (takePhotoViewIcon != null) {
                this.f955h.setImageResource(takePhotoViewIcon.intValue());
            }
            Integer pagePortraitBackgroundResource = this.f960m.isPortrait() ? this.f960m.uiExtras.getPagePortraitBackgroundResource() : this.f960m.uiExtras.getPageLandscapeBackgroundResource();
            if (pagePortraitBackgroundResource != null) {
                this.f965r.setImageResource(pagePortraitBackgroundResource.intValue());
                View view2 = this.f966s;
                if (view2 != null) {
                    view2.setAlpha(0.0f);
                }
            }
            if (!this.f960m.uiExtras.isCountdownTimerVisible()) {
                m1305n();
            }
            Integer retakeBtnTextColor = this.f960m.uiExtras.getRetakeBtnTextColor();
            if (retakeBtnTextColor != null) {
                this.f957j.setTextColor(retakeBtnTextColor.intValue());
            }
            Integer continueBtnTextColor = this.f960m.uiExtras.getContinueBtnTextColor();
            if (continueBtnTextColor != null) {
                this.f958k.setTextColor(continueBtnTextColor.intValue());
            }
            if (this.f960m.isPortrait()) {
                Float cameraWidthPercentInPortraitState = this.f960m.uiExtras.getCameraWidthPercentInPortraitState();
                if (cameraWidthPercentInPortraitState != null) {
                    layoutParams = (ConstraintLayout.LayoutParams) this.f950c.getLayoutParams();
                    layoutParams.matchConstraintPercentWidth = cameraWidthPercentInPortraitState.floatValue();
                    this.f950c.setLayoutParams(layoutParams);
                }
            } else {
                Float cameraHeightPercentInLandscapeState = this.f960m.uiExtras.getCameraHeightPercentInLandscapeState();
                if (cameraHeightPercentInLandscapeState != null) {
                    layoutParams = (ConstraintLayout.LayoutParams) this.f950c.getLayoutParams();
                    layoutParams.matchConstraintPercentHeight = cameraHeightPercentInLandscapeState.floatValue();
                    this.f950c.setLayoutParams(layoutParams);
                }
            }
            Integer pagePortraitTitleBgResource = this.f960m.isPortrait() ? this.f960m.uiExtras.getPagePortraitTitleBgResource() : this.f960m.uiExtras.getPageLandscapeTitleBgResource();
            if (pagePortraitTitleBgResource != null) {
                this.f968u.setVisibility(0);
                this.f968u.setImageResource(pagePortraitTitleBgResource.intValue());
            }
            Integer titleBgColor = this.f960m.uiExtras.getTitleBgColor();
            if (titleBgColor != null) {
                this.f968u.setVisibility(0);
                this.f968u.setBackgroundColor(titleBgColor.intValue());
            }
            this.f950c.setOnSizeChangedListener(new GlobalIQAView.InterfaceC0351c() { // from class: ai.advance.sdk.global.iqa.a
                @Override // ai.advance.sdk.global.iqa.lib.GlobalIQAView.InterfaceC0351c
                public final void onSizeChanged(int i11, int i12, int i13, int i14) {
                    this.f945a.m1301i(i11, i12, i13, i14);
                }
            });
        }
        String pageId = this.f960m.getPageId();
        if (pageId == null) {
            this.f960m.setPageId(this.f950c.getPageId());
        } else {
            this.f950c.setPageId(pageId);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m1287C() {
        this.f949b.findViewById(R$id.back_view_iqa_activity).setOnClickListener(this);
        this.f955h.setOnClickListener(this);
        this.f957j.setOnClickListener(this);
        this.f958k.setOnClickListener(this);
        this.f951d.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: D */
    public final void m1288D() {
        this.f949b.getWindow().getDecorView().setSystemUiVisibility(1792);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 34) {
            this.f949b.getWindow().setStatusBarColor(0);
        }
        final View viewFindViewById = this.f949b.findViewById(R$id.root_view_iqa_activity);
        final View viewFindViewById2 = this.f949b.findViewById(R$id.status_bar_iqa_activity);
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new OnApplyWindowInsetsListener() { // from class: ai.advance.sdk.global.iqa.b
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f946b.m1297d(viewFindViewById, viewFindViewById2, view, windowInsetsCompat);
            }
        });
        int systemUiVisibility = viewFindViewById.getSystemUiVisibility();
        int i12 = systemUiVisibility | 8192;
        if (i11 >= 26) {
            i12 = systemUiVisibility | 8208;
        }
        viewFindViewById.setSystemUiVisibility(i12);
    }

    /* JADX INFO: renamed from: G */
    public void m1291G() {
        m1310s(8);
        m1308q(8);
        this.f961n.setVisibility(8);
        UIExtras uIExtras = this.f960m.uiExtras;
        CharSequence spannablePreviewTipOfTakePhoto = uIExtras == null ? null : uIExtras.getSpannablePreviewTipOfTakePhoto();
        TextView textView = this.f956i;
        if (textView != null) {
            textView.setVisibility(0);
            TextView textView2 = this.f956i;
            if (spannablePreviewTipOfTakePhoto == null) {
                textView2.setText(R$string.iqa_take_photo_ensure);
            } else {
                textView2.setText(spannablePreviewTipOfTakePhoto);
            }
            this.f956i.setCompoundDrawablesWithIntrinsicBounds(m1316y() ? R$drawable.iqa_icon_info_normal : 0, 0, 0, 0);
        }
        if (!this.f960m.isPortrait()) {
            if (spannablePreviewTipOfTakePhoto == null) {
                this.f952e.setText(R$string.iqa_take_photo_ensure);
            } else {
                this.f952e.setText(spannablePreviewTipOfTakePhoto);
            }
            this.f952e.setBackgroundResource(R$drawable.iqa_land_black_tips);
            this.f952e.setCompoundDrawablesWithIntrinsicBounds(m1316y() ? R$drawable.iqa_icon_info_normal : 0, 0, 0, 0);
        }
        this.f955h.setVisibility(8);
        this.f957j.setVisibility(0);
        this.f958k.setVisibility(0);
    }

    /* JADX INFO: renamed from: H */
    public void m1292H() {
        this.f967t.show();
    }

    /* JADX INFO: renamed from: I */
    public void m1293I() {
        this.f952e.setVisibility(0);
        this.f952e.setText(this.f959l.getString(R$string.iqa_scan_successfully));
        m1300h(R$drawable.iqa_scan_successfully, R$drawable.iqa_land_green_tips);
    }

    /* JADX INFO: renamed from: J */
    public void m1294J() {
        this.f952e.setVisibility(0);
        this.f952e.setText(this.f959l.getString(R$string.hold_phone));
        m1300h(R$drawable.iqa_scan_processing, R$drawable.iqa_land_black_tips);
    }

    /* JADX INFO: renamed from: K */
    public void m1295K() {
        this.f953f.setVisibility(0);
        ImageView imageView = this.f953f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "translationX", -imageView.getMeasuredWidth(), this.f950c.getMeasuredWidth());
        objectAnimatorOfFloat.setDuration(4000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.start();
        this.f953f.setTag(objectAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: L */
    public void m1296L() {
        this.f953f.setVisibility(4);
        Object tag = this.f953f.getTag();
        if (tag instanceof ObjectAnimator) {
            ((ObjectAnimator) tag).cancel();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1298f() {
        this.f952e.setVisibility(4);
        m1300h(0, 0);
    }

    /* JADX INFO: renamed from: g */
    public void m1299g(int i11) {
        UIExtras uIExtras = this.f960m.uiExtras;
        if (uIExtras == null || uIExtras.isCountdownTimerVisible()) {
            if (this.f954g.getVisibility() != 0) {
                this.f954g.setVisibility(0);
            }
            if (this.f954g.getVisibility() == 0) {
                this.f954g.setText(i11 + " s");
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1300h(int i11, int i12) {
        if (!this.f960m.isPortrait()) {
            this.f952e.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f952e.setBackgroundResource(i12);
            return;
        }
        UIExtras uIExtras = this.f960m.uiExtras;
        if (uIExtras == null || uIExtras.isTipIconVisible()) {
            this.f952e.setCompoundDrawablesWithIntrinsicBounds(0, i11, 0, 0);
        } else {
            this.f952e.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m1301i(int i11, int i12, int i13, int i14) {
        Float viewWidthPercentRelativeToCameraView;
        TipViewUIElements portraitTipViewBackgrounds = this.f960m.isPortrait() ? this.f960m.uiExtras.getPortraitTipViewBackgrounds() : this.f960m.uiExtras.getLandscapeTipViewBackgrounds();
        if (portraitTipViewBackgrounds == null || (viewWidthPercentRelativeToCameraView = portraitTipViewBackgrounds.getViewWidthPercentRelativeToCameraView()) == null) {
            return;
        }
        float f11 = i11;
        this.f952e.setWidth((int) (viewWidthPercentRelativeToCameraView.floatValue() * f11));
        this.f952e.setHeight((int) (f11 * viewWidthPercentRelativeToCameraView.floatValue() * portraitTipViewBackgrounds.getAspectRatio().floatValue()));
    }

    /* JADX INFO: renamed from: k */
    public void m1302k(ImageWarnCode imageWarnCode) {
        int i11;
        if (imageWarnCode == null) {
            return;
        }
        Resources resources = this.f949b.getResources();
        switch (c.f972a[imageWarnCode.ordinal()]) {
            case 1:
                i11 = R$string.no_card;
                m1304m(resources.getString(i11));
                break;
            case 2:
                i11 = R$string.iqa_card_poor_quality;
                m1304m(resources.getString(i11));
                break;
            case 3:
                i11 = R$string.too_small_card;
                m1304m(resources.getString(i11));
                break;
            case 4:
                i11 = R$string.iqa_min_gap_ratio;
                m1304m(resources.getString(i11));
                break;
            case 5:
                i11 = R$string.iqa_card_occluded;
                m1304m(resources.getString(i11));
                break;
            case 6:
                i11 = R$string.iqa_card_too_glossy;
                m1304m(resources.getString(i11));
                break;
            case 7:
                m1294J();
                break;
            default:
                m1298f();
                break;
        }
        IQAPageState iQAPageState = this.f960m;
        if (iQAPageState.uiExtras == null) {
            return;
        }
        Integer numM1283e = m1283e(iQAPageState.isPortrait() ? this.f960m.uiExtras.getPortraitTipViewBackgrounds() : this.f960m.uiExtras.getLandscapeTipViewBackgrounds(), imageWarnCode);
        if (numM1283e == null) {
            this.f952e.setBackground(null);
        } else {
            this.f952e.setBackgroundResource(numM1283e.intValue());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m1303l(CharSequence charSequence, int i11) {
        this.f951d.m1422k(charSequence, i11);
    }

    /* JADX INFO: renamed from: m */
    public void m1304m(String str) {
        this.f952e.setVisibility(0);
        this.f952e.setText(str);
        m1300h(R$drawable.iqa_scan_warning, R$drawable.iqa_land_red_tips);
    }

    /* JADX INFO: renamed from: n */
    public void m1305n() {
        this.f954g.setVisibility(4);
    }

    /* JADX INFO: renamed from: o */
    public void m1306o(int i11) {
        if (i11 == 0) {
            m1290F();
            m1311t();
            return;
        }
        String str = this.f959l.getString(R$string.iqa_time_out_tips) + C33627eb.f69716f + i11 + CmcdData.Factory.STREAMING_FORMAT_SS;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(this.f959l.getColor(R$color.iqa_round_green)), str.lastIndexOf(C33627eb.f69716f), str.length(), 33);
        this.f951d.m1417a(spannableString);
    }

    /* JADX INFO: renamed from: p */
    public void m1307p() {
        this.f967t.dismiss();
    }

    /* JADX INFO: renamed from: q */
    public final void m1308q(int i11) {
        UIExtras uIExtras = this.f960m.uiExtras;
        if (uIExtras == null || uIExtras.isFlipCameraBtnVisible()) {
            this.f963p.setVisibility(i11);
        } else {
            this.f963p.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m1309r() {
        this.f955h.setVisibility(8);
        TextView textView = this.f956i;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1310s(int i11) {
        UIExtras uIExtras = this.f960m.uiExtras;
        if (uIExtras == null || uIExtras.isLightBtnVisible()) {
            this.f962o.setVisibility(i11);
        } else {
            this.f962o.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m1311t() {
        this.f951d.m1418f();
    }

    /* JADX INFO: renamed from: u */
    public final CharSequence m1312u() {
        UIExtras uIExtras = this.f960m.uiExtras;
        if (uIExtras == null) {
            return null;
        }
        return uIExtras.getSpannableTipTextOfTakePhoto();
    }

    /* JADX INFO: renamed from: v */
    public final void m1313v() {
        TextView textView = (TextView) this.f949b.findViewById(R$id.card_side_desc_iqa_activity);
        if (!this.f960m.isPortrait()) {
            textView.setText(R$string.iqa_top_desc);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f959l.getString(this.f960m.isFrontCardSide() ? R$string.iqa_front_side_of_document : R$string.iqa_back_side_of_document));
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append(this.f959l.getString(R$string.iqa_top_desc));
        String string = sb2.toString();
        SpannableString spannableString = new SpannableString(string);
        int iIndexOf = string.indexOf(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        spannableString.setSpan(new StyleSpan(1), 0, iIndexOf, 33);
        spannableString.setSpan(new RelativeSizeSpan(1.5f), 0, iIndexOf, 33);
        textView.setText(spannableString);
    }

    /* JADX INFO: renamed from: w */
    public final void m1314w() {
        ImageView imageView = (ImageView) this.f949b.findViewById(R$id.light_view_iqa_activity);
        this.f962o = imageView;
        imageView.setOnClickListener(new a());
        m1310s((!this.f950c.m1328h() || this.f960m.isFrontCamera()) ? 8 : 0);
        View viewFindViewById = this.f949b.findViewById(R$id.flip_camera_view_iqa_activity);
        this.f963p = viewFindViewById;
        viewFindViewById.setOnClickListener(new b());
    }

    /* JADX INFO: renamed from: x */
    public final void m1315x() {
        this.f950c = (GlobalIQAView) this.f949b.findViewById(R$id.camera_view_iqa_activity);
        this.f951d = (ImageQualityRootLayout) this.f949b.findViewById(R$id.root_view_iqa_activity);
        this.f952e = (TextView) this.f949b.findViewById(R$id.tip_view_iqa_activity);
        this.f953f = (ImageView) this.f949b.findViewById(R$id.scan_view_iqa_activity);
        this.f954g = (TextView) this.f949b.findViewById(R$id.countdown_iqa_activity);
        this.f955h = (ImageView) this.f949b.findViewById(R$id.take_photo_view_iqa_activity);
        this.f956i = (TextView) this.f949b.findViewById(R$id.take_photo_tip_view_iqa_activity);
        this.f957j = (TextView) this.f949b.findViewById(R$id.retake_view_iqa_activity);
        this.f958k = (TextView) this.f949b.findViewById(R$id.continue_view_iqa_activity);
        this.f961n = (TextView) this.f949b.findViewById(R$id.card_side_desc_iqa_activity);
        this.f950c.setVoiceRawId(R$raw.global_iqa_voice);
        this.f965r = (ImageView) this.f949b.findViewById(R$id.full_bg_iqa_view_activity);
        this.f964q = (TextView) this.f949b.findViewById(R$id.title_view_iqa_activity);
        this.f968u = (ImageView) this.f949b.findViewById(R$id.title_bg_view_iqa_activity);
        this.f966s = this.f949b.findViewById(R$id.frame_for_android19_iqa_activity);
        ProgressDialog progressDialog = new ProgressDialog(this.f949b);
        this.f967t = progressDialog;
        progressDialog.setMessage(this.f949b.getResources().getString(R$string.iqa_auth_check));
        this.f967t.setCanceledOnTouchOutside(false);
        if (!this.f960m.canRetry()) {
            this.f955h.setVisibility(0);
            TextView textView = this.f956i;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
        if (!this.f960m.isPortrait()) {
            this.f958k.setCompoundDrawablesWithIntrinsicBounds(0, R$drawable.iqa_land_confirm, 0, 0);
            this.f957j.setCompoundDrawablesWithIntrinsicBounds(0, R$drawable.iqa_land_retake, 0, 0);
        }
        m1314w();
        m1313v();
    }

    /* JADX INFO: renamed from: y */
    public final boolean m1316y() {
        UIExtras uIExtras = this.f960m.uiExtras;
        return uIExtras == null || uIExtras.isTakePhotoTipViewLeftIconVisible();
    }

    /* JADX INFO: renamed from: z */
    public void m1317z() {
        if (this.f967t.isShowing()) {
            this.f967t.dismiss();
        }
        this.f950c.m1325e();
        this.f951d.m1418f();
        this.f949b = null;
        this.f969v = null;
    }

    public ViewOnClickListenerC0346c(GlobalIQAActivity globalIQAActivity) {
        this.f949b = globalIQAActivity;
        this.f959l = globalIQAActivity.getResources();
        this.f960m = globalIQAActivity.f973i;
        this.f969v = globalIQAActivity;
        m1315x();
        m1287C();
        m1286B();
        m1288D();
    }

    /* JADX INFO: renamed from: A */
    public void m1285A() {
        m1296L();
        m1298f();
        if (this.f960m.canRetry()) {
            UIExtras uIExtras = this.f960m.uiExtras;
            if (uIExtras != null && uIExtras.getTakePhotoTipDialogShowSeconds().intValue() <= 0) {
                return;
            }
            m1303l(this.f959l.getString(R$string.iqa_retry_tips), R$drawable.advance_iqa_tip_warning);
            return;
        }
        m1305n();
        m1303l(null, R$drawable.advance_iqa_tip_capture);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ WindowInsetsCompat m1297d(View view, View view2, View view3, WindowInsetsCompat windowInsetsCompat) {
        int paddingLeft;
        int paddingTop;
        int systemWindowInsetRight;
        int paddingBottom;
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        if (this.f960m.isPortrait()) {
            paddingLeft = view.getPaddingLeft();
            paddingTop = view.getPaddingTop();
            systemWindowInsetRight = view.getPaddingRight();
            paddingBottom = view.getPaddingBottom() + windowInsetsCompat.getSystemWindowInsetBottom();
        } else {
            paddingLeft = view.getPaddingLeft();
            paddingTop = view.getPaddingTop();
            systemWindowInsetRight = windowInsetsCompat.getSystemWindowInsetRight();
            paddingBottom = view.getPaddingBottom();
        }
        view.setPadding(paddingLeft, paddingTop, systemWindowInsetRight, paddingBottom);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.height = systemWindowInsetTop;
        view2.setLayoutParams(layoutParams);
        return windowInsetsCompat;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R$id.back_view_iqa_activity) {
            this.f969v.mo1268a();
            return;
        }
        if (id2 == R$id.take_photo_view_iqa_activity) {
            m1309r();
            this.f969v.mo1271d();
        } else if (id2 == R$id.retake_view_iqa_activity) {
            this.f969v.mo1269b();
            m1290F();
        } else if (id2 == R$id.continue_view_iqa_activity) {
            this.f969v.mo1270c();
        } else if (id2 == R$id.root_view_iqa_activity) {
            this.f950c.m1324d();
        }
    }
}
