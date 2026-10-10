package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.b2 */
/* JADX INFO: compiled from: PaymentFragmentWithdrawConfirmEeBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37599b2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83640a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f83641b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f83642c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f83643d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f83644e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f83645f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f83646g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f83647h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f83648i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f83649j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f83650k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f83651l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final View f83652m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37599b2 m84782a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.tv_account_name;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tv_account_sub_name;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.tv_amount;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.tv_confirm;
                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView4 != null) {
                        i11 = R$id.tv_pay_fee;
                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView5 != null) {
                            i11 = R$id.tv_pay_fee_tip;
                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView6 != null) {
                                i11 = R$id.tv_pay_fee_unit;
                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView7 != null) {
                                    i11 = R$id.tv_payment_tip;
                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView8 != null) {
                                        i11 = R$id.tv_receive;
                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView9 != null) {
                                            i11 = R$id.tv_receive_tip;
                                            BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView10 != null) {
                                                i11 = R$id.tv_receive_unit;
                                                BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView11 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_line))) != null) {
                                                    return new C37599b2((ConstraintLayout) view, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, viewFindChildViewById);
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
        return this.f83640a;
    }

    public C37599b2(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull View view) {
        this.f83640a = constraintLayout;
        this.f83641b = baseTextView;
        this.f83642c = baseTextView2;
        this.f83643d = baseTextView3;
        this.f83644e = baseTextView4;
        this.f83645f = baseTextView5;
        this.f83646g = baseTextView6;
        this.f83647h = baseTextView7;
        this.f83648i = baseTextView8;
        this.f83649j = baseTextView9;
        this.f83650k = baseTextView10;
        this.f83651l = baseTextView11;
        this.f83652m = view;
    }
}
