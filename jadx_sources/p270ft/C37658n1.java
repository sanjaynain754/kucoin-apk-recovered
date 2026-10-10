package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.fasttrade.widget.FastTradeInputView;
import com.kubi.payment.widget.NumberKeyboardView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: ft.n1 */
/* JADX INFO: compiled from: PaymentFragmentFastSellBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37658n1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84301a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f84302b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f84303c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f84304d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f84305e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f84306f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f84307g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final NumberKeyboardView f84308h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ConstraintLayout f84309i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final FastTradeInputView f84310j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ConstraintLayout f84311k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final DashTextView f84312l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f84313m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f84314n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final KcSecondaryButton f84315o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final KcPrimaryButton f84316p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f84317q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f84318r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f84319s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f84320t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f84321u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f84322v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f84323w;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37658n1 m84899a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.bottom_button_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider))) != null) {
            i11 = R$id.ivCryptoCurrency;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.ivCryptoCurrencyArrowEnd;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView2 != null) {
                    i11 = R$id.ivPaymentMethod;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView3 != null) {
                        i11 = R$id.ivPaymentMethodArrowEnd;
                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView4 != null) {
                            i11 = R$id.keyboard;
                            NumberKeyboardView numberKeyboardView = (NumberKeyboardView) ViewBindings.findChildViewById(view, i11);
                            if (numberKeyboardView != null) {
                                i11 = R$id.layoutCryptoCurrency;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                if (constraintLayout != null) {
                                    i11 = R$id.layoutInput;
                                    FastTradeInputView fastTradeInputView = (FastTradeInputView) ViewBindings.findChildViewById(view, i11);
                                    if (fastTradeInputView != null) {
                                        i11 = R$id.layoutPaymentMethod;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                        if (constraintLayout2 != null) {
                                            i11 = R$id.tvAvailable;
                                            DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                            if (dashTextView != null) {
                                                i11 = R$id.tvBalance;
                                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView != null) {
                                                    i11 = R$id.tvBalanceLimitTip;
                                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView2 != null) {
                                                        i11 = R$id.tv_buy_max;
                                                        KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                                                        if (kcSecondaryButton != null) {
                                                            i11 = R$id.tvConfirm;
                                                            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                            if (kcPrimaryButton != null) {
                                                                i11 = R$id.tvCryptoCurrencyName;
                                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView3 != null) {
                                                                    i11 = R$id.tvEstimated;
                                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView4 != null) {
                                                                        i11 = R$id.tvLimitTip;
                                                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView5 != null) {
                                                                            i11 = R$id.tvNeedHigherLimits;
                                                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView6 != null) {
                                                                                i11 = R$id.tvPaymentMethodName;
                                                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView7 != null) {
                                                                                    i11 = R$id.tvTag;
                                                                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView8 != null) {
                                                                                        i11 = R$id.tvTo;
                                                                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView9 != null) {
                                                                                            return new C37658n1((ConstraintLayout) view, barrier, viewFindChildViewById, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, numberKeyboardView, constraintLayout, fastTradeInputView, constraintLayout2, dashTextView, baseTextView, baseTextView2, kcSecondaryButton, kcPrimaryButton, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9);
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
        return this.f84301a;
    }

    public C37658n1(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull AppCompatImageView appCompatImageView4, @NonNull NumberKeyboardView numberKeyboardView, @NonNull ConstraintLayout constraintLayout2, @NonNull FastTradeInputView fastTradeInputView, @NonNull ConstraintLayout constraintLayout3, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9) {
        this.f84301a = constraintLayout;
        this.f84302b = barrier;
        this.f84303c = view;
        this.f84304d = appCompatImageView;
        this.f84305e = appCompatImageView2;
        this.f84306f = appCompatImageView3;
        this.f84307g = appCompatImageView4;
        this.f84308h = numberKeyboardView;
        this.f84309i = constraintLayout2;
        this.f84310j = fastTradeInputView;
        this.f84311k = constraintLayout3;
        this.f84312l = dashTextView;
        this.f84313m = baseTextView;
        this.f84314n = baseTextView2;
        this.f84315o = kcSecondaryButton;
        this.f84316p = kcPrimaryButton;
        this.f84317q = baseTextView3;
        this.f84318r = baseTextView4;
        this.f84319s = baseTextView5;
        this.f84320t = baseTextView6;
        this.f84321u = baseTextView7;
        this.f84322v = baseTextView8;
        this.f84323w = baseTextView9;
    }
}
