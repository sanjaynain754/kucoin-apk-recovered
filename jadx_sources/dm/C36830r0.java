package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: dm.r0 */
/* JADX INFO: compiled from: BkumexDialogPositionModeGuideBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36830r0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f80938a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f80939b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f80940c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80941d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f80942e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f80943f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f80944g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KcPrimaryButton f80945h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80946i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f80947j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final KcSecondaryButton f80948k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f80949l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f80950m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36830r0 m82523a(@NonNull View view) {
        int i11 = R$id.cl_hedge;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.cl_oneWay;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout2 != null) {
                i11 = R$id.desc;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.iv_hedge;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.iv_oneWay;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView2 != null) {
                            i11 = R$id.title;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tv_confirm;
                                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                if (kcPrimaryButton != null) {
                                    i11 = R$id.tv_hedge;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tv_hedgeDesc;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tv_later;
                                            KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                                            if (kcSecondaryButton != null) {
                                                i11 = R$id.tv_oneWay;
                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView5 != null) {
                                                    i11 = R$id.tv_oneWayDesc;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        return new C36830r0((LinearLayout) view, constraintLayout, constraintLayout2, baseTextView, appCompatImageView, appCompatImageView2, baseTextView2, kcPrimaryButton, baseTextView3, baseTextView4, kcSecondaryButton, baseTextView5, baseTextView6);
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
    public LinearLayout getRoot() {
        return this.f80938a;
    }

    public C36830r0(@NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull BaseTextView baseTextView2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f80938a = linearLayout;
        this.f80939b = constraintLayout;
        this.f80940c = constraintLayout2;
        this.f80941d = baseTextView;
        this.f80942e = appCompatImageView;
        this.f80943f = appCompatImageView2;
        this.f80944g = baseTextView2;
        this.f80945h = kcPrimaryButton;
        this.f80946i = baseTextView3;
        this.f80947j = baseTextView4;
        this.f80948k = kcSecondaryButton;
        this.f80949l = baseTextView5;
        this.f80950m = baseTextView6;
    }
}
