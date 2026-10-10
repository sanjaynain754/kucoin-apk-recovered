package dm;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.round.widget.RoundImageView;

/* JADX INFO: renamed from: dm.v */
/* JADX INFO: compiled from: BkumexDialogFutureBonusGetBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36853v implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f81156a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RoundImageView f81157b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f81158c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f81159d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f81160e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f81161f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LottieAnimationView f81162g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ImageView f81163h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f81164i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f81165j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f81166k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36853v m82571a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.bottom_img;
        RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i11);
        if (roundImageView != null) {
            i11 = R$id.btn_trade_now;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.dialog_ctt;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.fake_status_bar))) != null) {
                    i11 = R$id.img_close;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView != null) {
                        i11 = R$id.lottie_view;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i11);
                        if (lottieAnimationView != null) {
                            i11 = R$id.top_img;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView2 != null) {
                                i11 = R$id.tv_amount;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tv_currency;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tv_title;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            return new C36853v((FrameLayout) view, roundImageView, kcPrimaryButton, constraintLayout, viewFindChildViewById, imageView, lottieAnimationView, imageView2, baseTextView, baseTextView2, baseTextView3);
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
        return this.f81156a;
    }

    public C36853v(@NonNull FrameLayout frameLayout, @NonNull RoundImageView roundImageView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull LottieAnimationView lottieAnimationView, @NonNull ImageView imageView2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f81156a = frameLayout;
        this.f81157b = roundImageView;
        this.f81158c = kcPrimaryButton;
        this.f81159d = constraintLayout;
        this.f81160e = view;
        this.f81161f = imageView;
        this.f81162g = lottieAnimationView;
        this.f81163h = imageView2;
        this.f81164i = baseTextView;
        this.f81165j = baseTextView2;
        this.f81166k = baseTextView3;
    }
}
