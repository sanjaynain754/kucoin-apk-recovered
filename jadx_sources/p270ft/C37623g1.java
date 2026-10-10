package p270ft;

import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.fasttradev2.buy.confirm.p2p.widget.BuyP2PConfirmTermsView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmHeaderView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmInfoView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.g1 */
/* JADX INFO: compiled from: PaymentFragmentFastBuyConfirmP2pBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37623g1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83903a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f83904b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f83905c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BuyConfirmHeaderView f83906d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f83907e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f83908f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayoutCompat f83909g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final C37652m0 f83910h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BuyConfirmInfoView f83911i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ProgressBar f83912j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BuyP2PConfirmTermsView f83913k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final KcPrimaryButton f83914l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f83915m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f83916n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f83917o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f83918p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f83919q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f83920r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f83921s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f83922t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f83923u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f83924v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f83925w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f83926x;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37623g1 m84827a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.barrier1;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider_line))) != null) {
            i11 = R$id.headerView;
            BuyConfirmHeaderView buyConfirmHeaderView = (BuyConfirmHeaderView) ViewBindings.findChildViewById(view, i11);
            if (buyConfirmHeaderView != null) {
                i11 = R$id.layoutLimitTip;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout != null) {
                    i11 = R$id.layoutP2PExpress;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout2 != null) {
                        i11 = R$id.layoutStep1;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                        if (linearLayoutCompat != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.merchant_info_card_layout))) != null) {
                            C37652m0 c37652m0M84887a = C37652m0.m84887a(viewFindChildViewById2);
                            i11 = R$id.oneTimeInfoView;
                            BuyConfirmInfoView buyConfirmInfoView = (BuyConfirmInfoView) ViewBindings.findChildViewById(view, i11);
                            if (buyConfirmInfoView != null) {
                                i11 = R$id.progress_bar;
                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i11);
                                if (progressBar != null) {
                                    i11 = R$id.termsView;
                                    BuyP2PConfirmTermsView buyP2PConfirmTermsView = (BuyP2PConfirmTermsView) ViewBindings.findChildViewById(view, i11);
                                    if (buyP2PConfirmTermsView != null) {
                                        i11 = R$id.tvConfirm;
                                        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                        if (kcPrimaryButton != null) {
                                            i11 = R$id.tv_count_down;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                i11 = R$id.tv_dash_p2p_tip;
                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView2 != null) {
                                                    i11 = R$id.tv_price2;
                                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView3 != null) {
                                                        i11 = R$id.tv_price2_tip;
                                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView4 != null) {
                                                            i11 = R$id.tv_receive2;
                                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView5 != null) {
                                                                i11 = R$id.tv_receive2_tip;
                                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView6 != null) {
                                                                    i11 = R$id.tv_slippage_tolerance;
                                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView7 != null) {
                                                                        i11 = R$id.tv_slippage_tolerance_value;
                                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView8 != null) {
                                                                            i11 = R$id.tvStep1;
                                                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView9 != null) {
                                                                                i11 = R$id.tvStep1Value;
                                                                                BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView10 != null) {
                                                                                    i11 = R$id.tvStep2;
                                                                                    BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView11 != null) {
                                                                                        i11 = R$id.tv_step_2_value;
                                                                                        BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView12 != null) {
                                                                                            return new C37623g1((ConstraintLayout) view, barrier, viewFindChildViewById, buyConfirmHeaderView, constraintLayout, constraintLayout2, linearLayoutCompat, c37652m0M84887a, buyConfirmInfoView, progressBar, buyP2PConfirmTermsView, kcPrimaryButton, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12);
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
        return this.f83903a;
    }

    public C37623g1(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull View view, @NonNull BuyConfirmHeaderView buyConfirmHeaderView, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull C37652m0 c37652m0, @NonNull BuyConfirmInfoView buyConfirmInfoView, @NonNull ProgressBar progressBar, @NonNull BuyP2PConfirmTermsView buyP2PConfirmTermsView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12) {
        this.f83903a = constraintLayout;
        this.f83904b = barrier;
        this.f83905c = view;
        this.f83906d = buyConfirmHeaderView;
        this.f83907e = constraintLayout2;
        this.f83908f = constraintLayout3;
        this.f83909g = linearLayoutCompat;
        this.f83910h = c37652m0;
        this.f83911i = buyConfirmInfoView;
        this.f83912j = progressBar;
        this.f83913k = buyP2PConfirmTermsView;
        this.f83914l = kcPrimaryButton;
        this.f83915m = baseTextView;
        this.f83916n = baseTextView2;
        this.f83917o = baseTextView3;
        this.f83918p = baseTextView4;
        this.f83919q = baseTextView5;
        this.f83920r = baseTextView6;
        this.f83921s = baseTextView7;
        this.f83922t = baseTextView8;
        this.f83923u = baseTextView9;
        this.f83924v = baseTextView10;
        this.f83925w = baseTextView11;
        this.f83926x = baseTextView12;
    }
}
