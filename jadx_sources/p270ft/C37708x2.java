package p270ft;

import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.x2 */
/* JADX INFO: compiled from: PaymentViewConfirmHeaderBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37708x2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f84872a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f84873b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f84874c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ProgressBar f84875d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84876e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84877f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84878g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84879h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84880i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84881j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f84882k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f84883l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f84884m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f84885n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37708x2 m85003a(@NonNull View view) {
        int i11 = R$id.barrier1;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.iv_fee_question;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.progress_bar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i11);
                if (progressBar != null) {
                    i11 = R$id.tv_amount;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_count_down;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tv_estimated_tip;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tv_fee;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.tv_fee_tip;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.tv_payment_method;
                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView6 != null) {
                                            i11 = R$id.tv_payment_method_tip;
                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView7 != null) {
                                                i11 = R$id.tv_price;
                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView8 != null) {
                                                    i11 = R$id.tv_price_tip;
                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView9 != null) {
                                                        i11 = R$id.tv_will_pay_tip;
                                                        BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView10 != null) {
                                                            return new C37708x2(view, barrier, appCompatImageView, progressBar, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84872a;
    }

    public C37708x2(@NonNull View view, @NonNull Barrier barrier, @NonNull AppCompatImageView appCompatImageView, @NonNull ProgressBar progressBar, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10) {
        this.f84872a = view;
        this.f84873b = barrier;
        this.f84874c = appCompatImageView;
        this.f84875d = progressBar;
        this.f84876e = baseTextView;
        this.f84877f = baseTextView2;
        this.f84878g = baseTextView3;
        this.f84879h = baseTextView4;
        this.f84880i = baseTextView5;
        this.f84881j = baseTextView6;
        this.f84882k = baseTextView7;
        this.f84883l = baseTextView8;
        this.f84884m = baseTextView9;
        this.f84885n = baseTextView10;
    }
}
