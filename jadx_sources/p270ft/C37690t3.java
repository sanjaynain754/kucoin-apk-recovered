package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.t3 */
/* JADX INFO: compiled from: PaymentViewPaymentMethodsThirdPartyBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37690t3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84675a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f84676b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f84677c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84678d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84679e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37690t3 m84971a(@NonNull View view) {
        int i11 = R$id.layout_payment_method;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.ll_third_party;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.tv_category_name;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tv_category_tips;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C37690t3((ConstraintLayout) view, constraintLayout, linearLayoutCompat, baseTextView, baseTextView2);
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
        return this.f84675a;
    }

    public C37690t3(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f84675a = constraintLayout;
        this.f84676b = constraintLayout2;
        this.f84677c = linearLayoutCompat;
        this.f84678d = baseTextView;
        this.f84679e = baseTextView2;
    }
}
