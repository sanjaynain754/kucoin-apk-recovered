package dm;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.u */
/* JADX INFO: compiled from: BkumexDialogFutureBonusDistributionFinishBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36847u implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81090a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f81091b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f81092c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f81093d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LottieAnimationView f81094e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f81095f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f81096g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81097h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36847u m82559a(@NonNull View view) {
        int i11 = R$id.btnActive;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.iv1;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView2 != null) {
                    i11 = R$id.lottie_view;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i11);
                    if (lottieAnimationView != null) {
                        i11 = R$id.tv1;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv2;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tv3;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    return new C36847u((LinearLayout) view, kcPrimaryButton, imageView, imageView2, lottieAnimationView, baseTextView, baseTextView2, baseTextView3);
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
    public LinearLayout getRoot() {
        return this.f81090a;
    }

    public C36847u(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LottieAnimationView lottieAnimationView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f81090a = linearLayout;
        this.f81091b = kcPrimaryButton;
        this.f81092c = imageView;
        this.f81093d = imageView2;
        this.f81094e = lottieAnimationView;
        this.f81095f = baseTextView;
        this.f81096g = baseTextView2;
        this.f81097h = baseTextView3;
    }
}
