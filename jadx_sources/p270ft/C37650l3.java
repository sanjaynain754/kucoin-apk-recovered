package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.widget.ConfirmCountDownView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.l3 */
/* JADX INFO: compiled from: PaymentViewFastSellConfirmInfoBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37650l3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f84239a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConfirmCountDownView f84240b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f84241c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84242d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84243e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84244f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84245g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84246h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84247i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84248j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f84249k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37650l3 m84884a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.countDownView;
        ConfirmCountDownView confirmCountDownView = (ConfirmCountDownView) ViewBindings.findChildViewById(view, i11);
        if (confirmCountDownView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider))) != null) {
            i11 = R$id.tvFee;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvFeeValue;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tvPaymentMethod;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.tvPaymentMethodValue;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null) {
                            i11 = R$id.tvReceive;
                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView5 != null) {
                                i11 = R$id.tvReceiveValue;
                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView6 != null) {
                                    i11 = R$id.tvTax;
                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView7 != null) {
                                        i11 = R$id.tvTaxValue;
                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView8 != null) {
                                            return new C37650l3(view, confirmCountDownView, viewFindChildViewById, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8);
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
    public View getRoot() {
        return this.f84239a;
    }

    public C37650l3(@NonNull View view, @NonNull ConfirmCountDownView confirmCountDownView, @NonNull View view2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8) {
        this.f84239a = view;
        this.f84240b = confirmCountDownView;
        this.f84241c = view2;
        this.f84242d = baseTextView;
        this.f84243e = baseTextView2;
        this.f84244f = baseTextView3;
        this.f84245g = baseTextView4;
        this.f84246h = baseTextView5;
        this.f84247i = baseTextView6;
        this.f84248j = baseTextView7;
        this.f84249k = baseTextView8;
    }
}
