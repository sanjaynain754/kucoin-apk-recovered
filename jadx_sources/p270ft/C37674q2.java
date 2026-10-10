package p270ft;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.payment.p2p.trade.view.CurrencyEditView;
import com.kubi.payment.p2p.trade.view.DashedUnderlineTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.q2 */
/* JADX INFO: compiled from: PaymentItemP2pExpressBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37674q2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f84450a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f84451b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f84452c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CurrencyEditView f84453d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcPrimaryButton f84454e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f84455f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84456g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84457h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84458i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84459j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final DashedUnderlineTextView f84460k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f84461l;

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37674q2 m84935c(@NonNull LayoutInflater layoutInflater) {
        return m84936d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37674q2 m84934a(@NonNull View view) {
        int i11 = R$id.cl_content;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.container;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout2 != null) {
                i11 = R$id.edit_currency;
                CurrencyEditView currencyEditView = (CurrencyEditView) ViewBindings.findChildViewById(view, i11);
                if (currencyEditView != null) {
                    i11 = R$id.express_buy;
                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                    if (kcPrimaryButton != null) {
                        i11 = R$id.iv_arrow;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView != null) {
                            i11 = R$id.tv_i_will_pay;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tv_mode;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tv_only_p2p_express;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tv_reference_price_tip;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tv_reference_price_value;
                                            DashedUnderlineTextView dashedUnderlineTextView = (DashedUnderlineTextView) ViewBindings.findChildViewById(view, i11);
                                            if (dashedUnderlineTextView != null) {
                                                i11 = R$id.tv_title;
                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView5 != null) {
                                                    return new C37674q2((LinearLayout) view, constraintLayout, constraintLayout2, currencyEditView, kcPrimaryButton, appCompatImageView, baseTextView, baseTextView2, baseTextView3, baseTextView4, dashedUnderlineTextView, baseTextView5);
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

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C37674q2 m84936d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.payment_item_p2p_express, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84934a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f84450a;
    }

    public C37674q2(@NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull CurrencyEditView currencyEditView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull DashedUnderlineTextView dashedUnderlineTextView, @NonNull BaseTextView baseTextView5) {
        this.f84450a = linearLayout;
        this.f84451b = constraintLayout;
        this.f84452c = constraintLayout2;
        this.f84453d = currencyEditView;
        this.f84454e = kcPrimaryButton;
        this.f84455f = appCompatImageView;
        this.f84456g = baseTextView;
        this.f84457h = baseTextView2;
        this.f84458i = baseTextView3;
        this.f84459j = baseTextView4;
        this.f84460k = dashedUnderlineTextView;
        this.f84461l = baseTextView5;
    }
}
