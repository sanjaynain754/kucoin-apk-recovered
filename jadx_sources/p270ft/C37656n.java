package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.n */
/* JADX INFO: compiled from: BotcFragmentFiatAdvcashWithdrawConfirmBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37656n implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84290a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f84291b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84292c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84293d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84294e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84295f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84296g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84297h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37656n m84895a(@NonNull View view) {
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
                                i11 = R$id.tv_recharge_amount;
                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView7 != null) {
                                    return new C37656n((ConstraintLayout) view, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7);
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
        return this.f84290a;
    }

    public C37656n(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7) {
        this.f84290a = constraintLayout;
        this.f84291b = baseTextView;
        this.f84292c = baseTextView2;
        this.f84293d = baseTextView3;
        this.f84294e = baseTextView4;
        this.f84295f = baseTextView5;
        this.f84296g = baseTextView6;
        this.f84297h = baseTextView7;
    }
}
