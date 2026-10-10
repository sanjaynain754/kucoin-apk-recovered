package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.q */
/* JADX INFO: compiled from: BotcFragmentFiatCapitualWithdrawConfirmBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37671q implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84404a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f84405b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84406c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84407d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84408e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84409f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84410g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84411h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84412i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37671q m84928a(@NonNull View view) {
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
                            i11 = R$id.tv_payment_tip;
                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView6 != null) {
                                i11 = R$id.tv_point_1;
                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView7 != null) {
                                    i11 = R$id.tv_recharge_amount;
                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView8 != null) {
                                        return new C37671q((ConstraintLayout) view, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8);
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
        return this.f84404a;
    }

    public C37671q(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8) {
        this.f84404a = constraintLayout;
        this.f84405b = baseTextView;
        this.f84406c = baseTextView2;
        this.f84407d = baseTextView3;
        this.f84408e = baseTextView4;
        this.f84409f = baseTextView5;
        this.f84410g = baseTextView6;
        this.f84411h = baseTextView7;
        this.f84412i = baseTextView8;
    }
}
