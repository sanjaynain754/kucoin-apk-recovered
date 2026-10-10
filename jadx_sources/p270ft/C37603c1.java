package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.c1 */
/* JADX INFO: compiled from: PaymentFragmentBirapiWithdrawConfirmBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37603c1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83740a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f83741b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f83742c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f83743d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f83744e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f83745f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f83746g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f83747h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f83748i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f83749j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f83750k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f83751l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final View f83752m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37603c1 m84789a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.tv_account_name;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tv_account_sub_name;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.tv_continue;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.tv_pay_fee;
                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView4 != null) {
                        i11 = R$id.tv_pay_fee_tip;
                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView5 != null) {
                            i11 = R$id.tv_pay_fee_unit;
                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView6 != null) {
                                i11 = R$id.tv_payment_tip;
                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView7 != null) {
                                    i11 = R$id.tv_receive;
                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView8 != null) {
                                        i11 = R$id.tv_receive_tip;
                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView9 != null) {
                                            i11 = R$id.tv_receive_unit;
                                            BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView10 != null) {
                                                i11 = R$id.tv_recharge_amount;
                                                BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView11 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_line))) != null) {
                                                    return new C37603c1((ConstraintLayout) view, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, viewFindChildViewById);
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
        return this.f83740a;
    }

    public C37603c1(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull View view) {
        this.f83740a = constraintLayout;
        this.f83741b = baseTextView;
        this.f83742c = baseTextView2;
        this.f83743d = baseTextView3;
        this.f83744e = baseTextView4;
        this.f83745f = baseTextView5;
        this.f83746g = baseTextView6;
        this.f83747h = baseTextView7;
        this.f83748i = baseTextView8;
        this.f83749j = baseTextView9;
        this.f83750k = baseTextView10;
        this.f83751l = baseTextView11;
        this.f83752m = view;
    }
}
