package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.widget.ConfirmCountDownView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.h3 */
/* JADX INFO: compiled from: PaymentViewFastConfirmInfoBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37630h3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f83979a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConfirmCountDownView f83980b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f83981c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f83982d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f83983e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f83984f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f83985g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f83986h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f83987i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37630h3 m84843a(@NonNull View view) {
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
                                    return new C37630h3(view, confirmCountDownView, viewFindChildViewById, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6);
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
        return this.f83979a;
    }

    public C37630h3(@NonNull View view, @NonNull ConfirmCountDownView confirmCountDownView, @NonNull View view2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f83979a = view;
        this.f83980b = confirmCountDownView;
        this.f83981c = view2;
        this.f83982d = baseTextView;
        this.f83983e = baseTextView2;
        this.f83984f = baseTextView3;
        this.f83985g = baseTextView4;
        this.f83986h = baseTextView5;
        this.f83987i = baseTextView6;
    }
}
