package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.view.LabelView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.f0 */
/* JADX INFO: compiled from: AssetDialogWithdrawAccountsBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44761f0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99858a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f99859b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCheckBox f99860c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KuCheckBox f99861d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KuCheckBox f99862e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f99863f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f99864g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ConstraintLayout f99865h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99866i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f99867j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f99868k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f99869l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f99870m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final LabelView f99871n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f99872o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f99873p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final TextView f99874q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f99875r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f99876s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f99877t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f99878u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final View f99879v;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44761f0 m99036a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.btnConfirm;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.cbFinance;
            KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
            if (kuCheckBox != null) {
                i11 = R$id.cbFunding;
                KuCheckBox kuCheckBox2 = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
                if (kuCheckBox2 != null) {
                    i11 = R$id.cbTrading;
                    KuCheckBox kuCheckBox3 = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
                    if (kuCheckBox3 != null) {
                        i11 = R$id.clFinance;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                        if (constraintLayout != null) {
                            i11 = R$id.clFunding;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (constraintLayout2 != null) {
                                i11 = R$id.clTrading;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                if (constraintLayout3 != null) {
                                    i11 = R$id.tvConvert;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        i11 = R$id.tvFinanceBalance;
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            i11 = R$id.tvFinanceName;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.tvFundingBalance;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    i11 = R$id.tvFundingName;
                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView5 != null) {
                                                        i11 = R$id.tvInside;
                                                        LabelView labelView = (LabelView) ViewBindings.findChildViewById(view, i11);
                                                        if (labelView != null) {
                                                            i11 = R$id.tvTip;
                                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView6 != null) {
                                                                i11 = R$id.tvTitle;
                                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView7 != null) {
                                                                    i11 = R$id.tvTotalBalance;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (textView != null) {
                                                                        i11 = R$id.tvTotalLabel;
                                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView8 != null) {
                                                                            i11 = R$id.tvTradingBalance;
                                                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView9 != null) {
                                                                                i11 = R$id.tvTradingName;
                                                                                BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView10 != null) {
                                                                                    i11 = R$id.tvTransfer;
                                                                                    BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView11 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.viewDivider))) != null) {
                                                                                        return new C44761f0((LinearLayout) view, kcPrimaryButton, kuCheckBox, kuCheckBox2, kuCheckBox3, constraintLayout, constraintLayout2, constraintLayout3, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, labelView, baseTextView6, baseTextView7, textView, baseTextView8, baseTextView9, baseTextView10, baseTextView11, viewFindChildViewById);
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
    public LinearLayout getRoot() {
        return this.f99858a;
    }

    public C44761f0(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KuCheckBox kuCheckBox, @NonNull KuCheckBox kuCheckBox2, @NonNull KuCheckBox kuCheckBox3, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull LabelView labelView, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull TextView textView, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull View view) {
        this.f99858a = linearLayout;
        this.f99859b = kcPrimaryButton;
        this.f99860c = kuCheckBox;
        this.f99861d = kuCheckBox2;
        this.f99862e = kuCheckBox3;
        this.f99863f = constraintLayout;
        this.f99864g = constraintLayout2;
        this.f99865h = constraintLayout3;
        this.f99866i = baseTextView;
        this.f99867j = baseTextView2;
        this.f99868k = baseTextView3;
        this.f99869l = baseTextView4;
        this.f99870m = baseTextView5;
        this.f99871n = labelView;
        this.f99872o = baseTextView6;
        this.f99873p = baseTextView7;
        this.f99874q = textView;
        this.f99875r = baseTextView8;
        this.f99876s = baseTextView9;
        this.f99877t = baseTextView10;
        this.f99878u = baseTextView11;
        this.f99879v = view;
    }
}
