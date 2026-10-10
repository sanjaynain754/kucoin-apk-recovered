package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.widget.PaymentTermView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.x1 */
/* JADX INFO: compiled from: PaymentFragmentRechargeConfirmIvyBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37707x1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84860a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f84861b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84862c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84863d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84864e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84865f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84866g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84867h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84868i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84869j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f84870k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final PaymentTermView f84871l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37707x1 m85001a(@NonNull View view) {
        int i11 = R$id.confirm;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.deposit_title;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.fee_title;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.fee_tv;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.money_tv;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null) {
                            i11 = R$id.money_unit_tv;
                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView5 != null) {
                                i11 = R$id.payin_tv;
                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView6 != null) {
                                    i11 = R$id.payment_method_title;
                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView7 != null) {
                                        i11 = R$id.payment_method_tv;
                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView8 != null) {
                                            i11 = R$id.receive_title;
                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView9 != null) {
                                                i11 = R$id.termsView;
                                                PaymentTermView paymentTermView = (PaymentTermView) ViewBindings.findChildViewById(view, i11);
                                                if (paymentTermView != null) {
                                                    return new C37707x1((ConstraintLayout) view, kcPrimaryButton, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, paymentTermView);
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
    public ConstraintLayout getRoot() {
        return this.f84860a;
    }

    public C37707x1(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull PaymentTermView paymentTermView) {
        this.f84860a = constraintLayout;
        this.f84861b = kcPrimaryButton;
        this.f84862c = baseTextView;
        this.f84863d = baseTextView2;
        this.f84864e = baseTextView3;
        this.f84865f = baseTextView4;
        this.f84866g = baseTextView5;
        this.f84867h = baseTextView6;
        this.f84868i = baseTextView7;
        this.f84869j = baseTextView8;
        this.f84870k = baseTextView9;
        this.f84871l = paymentTermView;
    }
}
