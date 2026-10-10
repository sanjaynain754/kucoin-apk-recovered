package p270ft;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsLayout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.w1 */
/* JADX INFO: compiled from: PaymentFragmentPaymentMethodBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37703w1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84815a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Guideline f84816b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f84817c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f84818d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f84819e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final PaymentMethodsLayout f84820f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84821g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KcPrimaryButton f84822h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84823i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84824j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final View f84825k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37703w1 m84994a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.guideline_1;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i11);
        if (guideline != null) {
            i11 = R$id.iv_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.iv_crypto_currency;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView2 != null) {
                    i11 = R$id.layout_title;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.payment_methods_layout;
                        PaymentMethodsLayout paymentMethodsLayout = (PaymentMethodsLayout) ViewBindings.findChildViewById(view, i11);
                        if (paymentMethodsLayout != null) {
                            i11 = R$id.tv_amount;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tv_confirm;
                                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                if (kcPrimaryButton != null) {
                                    i11 = R$id.tv_description;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tv_title;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_bar))) != null) {
                                            return new C37703w1((ConstraintLayout) view, guideline, imageView, imageView2, linearLayout, paymentMethodsLayout, baseTextView, kcPrimaryButton, baseTextView2, baseTextView3, viewFindChildViewById);
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
    public ConstraintLayout getRoot() {
        return this.f84815a;
    }

    public C37703w1(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull PaymentMethodsLayout paymentMethodsLayout, @NonNull BaseTextView baseTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull View view) {
        this.f84815a = constraintLayout;
        this.f84816b = guideline;
        this.f84817c = imageView;
        this.f84818d = imageView2;
        this.f84819e = linearLayout;
        this.f84820f = paymentMethodsLayout;
        this.f84821g = baseTextView;
        this.f84822h = kcPrimaryButton;
        this.f84823i = baseTextView2;
        this.f84824j = baseTextView3;
        this.f84825k = view;
    }
}
