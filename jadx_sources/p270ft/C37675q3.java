package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.q3 */
/* JADX INFO: compiled from: PaymentViewPaymentMethodsBankCardBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37675q3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84462a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f84463b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f84464c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f84465d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84466e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84467f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84468g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84469h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37675q3 m84938a(@NonNull View view) {
        int i11 = R$id.bank_card_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            i11 = R$id.layout_credit_card;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.ll_bank_card;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.tv_category_name;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_category_tips;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tv_manage_card;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tv_max_limit_description;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    return new C37675q3((ConstraintLayout) view, viewFindChildViewById, constraintLayout, linearLayoutCompat, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
        return this.f84462a;
    }

    public C37675q3(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f84462a = constraintLayout;
        this.f84463b = view;
        this.f84464c = constraintLayout2;
        this.f84465d = linearLayoutCompat;
        this.f84466e = baseTextView;
        this.f84467f = baseTextView2;
        this.f84468g = baseTextView3;
        this.f84469h = baseTextView4;
    }
}
