package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cpiz.android.bubbleview.BubbleTextView;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.round.widget.RoundLinearLayout;

/* JADX INFO: renamed from: ta.z3 */
/* JADX INFO: compiled from: FragmentWithdrawConfirmBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44910z3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101242a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f101243b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f101244c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KuCheckBox f101245d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f101246e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f101247f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f101248g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f101249h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f101250i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f101251j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final RoundLinearLayout f101252k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f101253l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f101254m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f101255n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BubbleTextView f101256o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f101257p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f101258q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f101259r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f101260s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f101261t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f101262u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f101263v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f101264w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f101265x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final BaseTextView f101266y;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44910z3 m99344a(@NonNull View view) {
        int i11 = R$id.amountDivider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            i11 = R$id.btn_confirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.cb_agree;
                KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
                if (kuCheckBox != null) {
                    i11 = R$id.diaoyuma_container;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.ll_agree_section;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout2 != null) {
                            i11 = R$id.ll_details_container;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout3 != null) {
                                i11 = R$id.ll_memo_container;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout4 != null) {
                                    i11 = R$id.ll_network_container;
                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout5 != null) {
                                        i11 = R$id.ll_remark_container;
                                        LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                        if (linearLayout6 != null) {
                                            i11 = R$id.ll_warning;
                                            RoundLinearLayout roundLinearLayout = (RoundLinearLayout) ViewBindings.findChildViewById(view, i11);
                                            if (roundLinearLayout != null) {
                                                i11 = R$id.tv_address;
                                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView != null) {
                                                    i11 = R$id.tv_address_remark;
                                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView2 != null) {
                                                        i11 = R$id.tv_agree_text;
                                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView3 != null) {
                                                            i11 = R$id.tv_agree_tooltip;
                                                            BubbleTextView bubbleTextView = (BubbleTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (bubbleTextView != null) {
                                                                i11 = R$id.tv_diaoyuma;
                                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView4 != null) {
                                                                    i11 = R$id.tv_fee_label;
                                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView5 != null) {
                                                                        i11 = R$id.tv_memo;
                                                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView6 != null) {
                                                                            i11 = R$id.tv_network;
                                                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView7 != null) {
                                                                                i11 = R$id.tv_network_fee;
                                                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView8 != null) {
                                                                                    i11 = R$id.tv_receive_amount;
                                                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView9 != null) {
                                                                                        i11 = R$id.tv_receive_amount_label;
                                                                                        BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView10 != null) {
                                                                                            i11 = R$id.tv_remark;
                                                                                            BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (baseTextView11 != null) {
                                                                                                i11 = R$id.tv_warning;
                                                                                                BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView12 != null) {
                                                                                                    i11 = R$id.tv_withdraw_amount;
                                                                                                    BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (baseTextView13 != null) {
                                                                                                        return new C44910z3((ConstraintLayout) view, viewFindChildViewById, kcPrimaryButton, kuCheckBox, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, roundLinearLayout, baseTextView, baseTextView2, baseTextView3, bubbleTextView, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, baseTextView13);
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
        return this.f101242a;
    }

    public C44910z3(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KuCheckBox kuCheckBox, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull RoundLinearLayout roundLinearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BubbleTextView bubbleTextView, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13) {
        this.f101242a = constraintLayout;
        this.f101243b = view;
        this.f101244c = kcPrimaryButton;
        this.f101245d = kuCheckBox;
        this.f101246e = linearLayout;
        this.f101247f = linearLayout2;
        this.f101248g = linearLayout3;
        this.f101249h = linearLayout4;
        this.f101250i = linearLayout5;
        this.f101251j = linearLayout6;
        this.f101252k = roundLinearLayout;
        this.f101253l = baseTextView;
        this.f101254m = baseTextView2;
        this.f101255n = baseTextView3;
        this.f101256o = bubbleTextView;
        this.f101257p = baseTextView4;
        this.f101258q = baseTextView5;
        this.f101259r = baseTextView6;
        this.f101260s = baseTextView7;
        this.f101261t = baseTextView8;
        this.f101262u = baseTextView9;
        this.f101263v = baseTextView10;
        this.f101264w = baseTextView11;
        this.f101265x = baseTextView12;
        this.f101266y = baseTextView13;
    }
}
