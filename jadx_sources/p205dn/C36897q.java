package p205dn;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.kyc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dn.q */
/* JADX INFO: compiled from: LayoutJumioNfcScanViewBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36897q implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f81514a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LottieAnimationView f81515b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f81516c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81517d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcPrimaryButton f81518e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f81519f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f81520g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81521h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KcPrimaryButton f81522i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f81523j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ImageView f81524k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f81525l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f81526m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f81527n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ConstraintLayout f81528o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final ConstraintLayout f81529p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final ConstraintLayout f81530q;

    public C36897q(@NonNull FrameLayout frameLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull BaseTextView baseTextView2, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView3, @NonNull KcPrimaryButton kcPrimaryButton3, @NonNull BaseTextView baseTextView4, @NonNull ImageView imageView2, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3) {
        this.f81514a = frameLayout;
        this.f81515b = lottieAnimationView;
        this.f81516c = kcPrimaryButton;
        this.f81517d = baseTextView;
        this.f81518e = kcPrimaryButton2;
        this.f81519f = baseTextView2;
        this.f81520g = imageView;
        this.f81521h = baseTextView3;
        this.f81522i = kcPrimaryButton3;
        this.f81523j = baseTextView4;
        this.f81524k = imageView2;
        this.f81525l = baseTextView5;
        this.f81526m = baseTextView6;
        this.f81527n = baseTextView7;
        this.f81528o = constraintLayout;
        this.f81529p = constraintLayout2;
        this.f81530q = constraintLayout3;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36897q m82663a(@NonNull View view) {
        int i11 = R$id.jumio_nfc_lottieView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i11);
        if (lottieAnimationView != null) {
            i11 = R$id.jumio_nfc_not_open_cancel;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.jumio_nfc_not_open_content;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.jumio_nfc_not_open_go_setting;
                    KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                    if (kcPrimaryButton2 != null) {
                        i11 = R$id.jumio_nfc_not_open_hint;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.jumio_nfc_not_open_icon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView != null) {
                                i11 = R$id.jumio_nfc_not_open_title;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.jumio_nfc_result_action;
                                    KcPrimaryButton kcPrimaryButton3 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                    if (kcPrimaryButton3 != null) {
                                        i11 = R$id.jumio_nfc_result_content;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.jumio_nfc_result_icon;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                            if (imageView2 != null) {
                                                i11 = R$id.jumio_nfc_result_title;
                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView5 != null) {
                                                    i11 = R$id.jumio_nfc_scan_hint;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        i11 = R$id.jumio_nfc_scan_title;
                                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView7 != null) {
                                                            i11 = R$id.layout_not_open_view;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                            if (constraintLayout != null) {
                                                                i11 = R$id.layout_result_view;
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                if (constraintLayout2 != null) {
                                                                    i11 = R$id.layout_scan_view;
                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                    if (constraintLayout3 != null) {
                                                                        return new C36897q((FrameLayout) view, lottieAnimationView, kcPrimaryButton, baseTextView, kcPrimaryButton2, baseTextView2, imageView, baseTextView3, kcPrimaryButton3, baseTextView4, imageView2, baseTextView5, baseTextView6, baseTextView7, constraintLayout, constraintLayout2, constraintLayout3);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f81514a;
    }
}
