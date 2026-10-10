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
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: ft.q1 */
/* JADX INFO: compiled from: PaymentFragmentFastTradeBuyBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37673q1 implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final BaseTextView f84423A;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84424a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f84425b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Barrier f84426c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84427d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f84428e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f84429f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f84430g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatImageView f84431h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AppCompatImageView f84432i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AppCompatImageView f84433j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final AppCompatImageView f84434k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final NumberKeyboardView f84435l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ConstraintLayout f84436m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final FastTradeInputView f84437n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ConstraintLayout f84438o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final ConstraintLayout f84439p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final KcPrimaryButton f84440q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final KcSecondaryButton f84441r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final KcPrimaryButton f84442s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f84443t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f84444u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f84445v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f84446w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f84447x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final BaseTextView f84448y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final BaseTextView f84449z;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37673q1 m84932a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.bottom_button_barrier;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i11);
            if (barrier2 != null) {
                i11 = R$id.discount_info_tag;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider))) != null) {
                    i11 = R$id.ivArrowDown;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.ivCryptoCurrency;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView2 != null) {
                            i11 = R$id.ivCryptoCurrencyArrowEnd;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatImageView3 != null) {
                                i11 = R$id.ivPaymentMethod;
                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatImageView4 != null) {
                                    i11 = R$id.ivPaymentMethodArrowEnd;
                                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                    if (appCompatImageView5 != null) {
                                        i11 = R$id.ivRecurringQuestion;
                                        AppCompatImageView appCompatImageView6 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                        if (appCompatImageView6 != null) {
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
                                                            i11 = R$id.layoutRecurring;
                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                            if (constraintLayout3 != null) {
                                                                i11 = R$id.pay_by_zen_bing;
                                                                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                if (kcPrimaryButton != null) {
                                                                    i11 = R$id.tv_buy_max;
                                                                    KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                                                                    if (kcSecondaryButton != null) {
                                                                        i11 = R$id.tvConfirm;
                                                                        KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                        if (kcPrimaryButton2 != null) {
                                                                            i11 = R$id.tvCryptoCurrencyName;
                                                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView2 != null) {
                                                                                i11 = R$id.tvEstimated;
                                                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView3 != null) {
                                                                                    i11 = R$id.tvLimitTip;
                                                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView4 != null) {
                                                                                        i11 = R$id.tvNeedHigherLimits;
                                                                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView5 != null) {
                                                                                            i11 = R$id.tvPaymentMethodName;
                                                                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (baseTextView6 != null) {
                                                                                                i11 = R$id.tvRecurring;
                                                                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView7 != null) {
                                                                                                    i11 = R$id.tvTag;
                                                                                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (baseTextView8 != null) {
                                                                                                        i11 = R$id.tvTo;
                                                                                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (baseTextView9 != null) {
                                                                                                            return new C37673q1((ConstraintLayout) view, barrier, barrier2, baseTextView, viewFindChildViewById, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, numberKeyboardView, constraintLayout, fastTradeInputView, constraintLayout2, constraintLayout3, kcPrimaryButton, kcSecondaryButton, kcPrimaryButton2, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9);
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
        return this.f84424a;
    }

    public C37673q1(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull BaseTextView baseTextView, @NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull AppCompatImageView appCompatImageView4, @NonNull AppCompatImageView appCompatImageView5, @NonNull AppCompatImageView appCompatImageView6, @NonNull NumberKeyboardView numberKeyboardView, @NonNull ConstraintLayout constraintLayout2, @NonNull FastTradeInputView fastTradeInputView, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9) {
        this.f84424a = constraintLayout;
        this.f84425b = barrier;
        this.f84426c = barrier2;
        this.f84427d = baseTextView;
        this.f84428e = view;
        this.f84429f = appCompatImageView;
        this.f84430g = appCompatImageView2;
        this.f84431h = appCompatImageView3;
        this.f84432i = appCompatImageView4;
        this.f84433j = appCompatImageView5;
        this.f84434k = appCompatImageView6;
        this.f84435l = numberKeyboardView;
        this.f84436m = constraintLayout2;
        this.f84437n = fastTradeInputView;
        this.f84438o = constraintLayout3;
        this.f84439p = constraintLayout4;
        this.f84440q = kcPrimaryButton;
        this.f84441r = kcSecondaryButton;
        this.f84442s = kcPrimaryButton2;
        this.f84443t = baseTextView2;
        this.f84444u = baseTextView3;
        this.f84445v = baseTextView4;
        this.f84446w = baseTextView5;
        this.f84447x = baseTextView6;
        this.f84448y = baseTextView7;
        this.f84449z = baseTextView8;
        this.f84423A = baseTextView9;
    }
}
