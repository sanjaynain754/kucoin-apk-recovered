package p270ft;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.fast.paymentmethod.widget.PaymentMethodView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.p3 */
/* JADX INFO: compiled from: PaymentViewPaymentMethodsBalanceBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37670p3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84399a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f84400b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final PaymentMethodView f84401c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84402d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84403e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37670p3 m84926a(@NonNull View view) {
        int i11 = R$id.layout_payment_method;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.payment_method_view;
            PaymentMethodView paymentMethodView = (PaymentMethodView) ViewBindings.findChildViewById(view, i11);
            if (paymentMethodView != null) {
                i11 = R$id.tv_category_name;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tv_category_tips;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C37670p3((ConstraintLayout) view, frameLayout, paymentMethodView, baseTextView, baseTextView2);
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
        return this.f84399a;
    }

    public C37670p3(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull PaymentMethodView paymentMethodView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f84399a = constraintLayout;
        this.f84400b = frameLayout;
        this.f84401c = paymentMethodView;
        this.f84402d = baseTextView;
        this.f84403e = baseTextView2;
    }
}
