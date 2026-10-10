package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.c0 */
/* JADX INFO: compiled from: BkumexDialogFuturesTrialRulesBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36740c0 implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final AnimateDrawableEndView f79765A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final BaseTextView f79766B;

    /* JADX INFO: renamed from: C */
    @NonNull
    public final BaseTextView f79767C;

    /* JADX INFO: renamed from: D */
    @NonNull
    public final LinearLayoutCompat f79768D;

    /* JADX INFO: renamed from: E */
    @NonNull
    public final BaseTextView f79769E;

    /* JADX INFO: renamed from: F */
    @NonNull
    public final LinearLayout f79770F;

    /* JADX INFO: renamed from: G */
    @NonNull
    public final KcPrimaryButton f79771G;

    /* JADX INFO: renamed from: H */
    @NonNull
    public final BaseTextView f79772H;

    /* JADX INFO: renamed from: I */
    @NonNull
    public final LinearLayoutCompat f79773I;

    /* JADX INFO: renamed from: J */
    @NonNull
    public final BaseTextView f79774J;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f79775a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f79776b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f79777c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f79778d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f79779e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f79780f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayoutCompat f79781g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f79782h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f79783i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayoutCompat f79784j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f79785k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final View f79786l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final View f79787m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final View f79788n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final View f79789o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f79790p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final LinearLayoutCompat f79791q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f79792r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f79793s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final LinearLayoutCompat f79794t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f79795u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f79796v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f79797w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f79798x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final LinearLayoutCompat f79799y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final BaseTextView f79800z;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36740c0 m82331a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        int i11 = R$id.amount;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.condition;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.currency;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.desc;
                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView4 != null) {
                        i11 = R$id.expireLabel;
                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView5 != null) {
                            i11 = R$id.expireLayout;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                            if (linearLayoutCompat != null) {
                                i11 = R$id.expireValue;
                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView6 != null) {
                                    i11 = R$id.leverageLabel;
                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView7 != null) {
                                        i11 = R$id.leverageLayout;
                                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                        if (linearLayoutCompat2 != null) {
                                            i11 = R$id.leverageValue;
                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView8 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.line1))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.line2))) != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i11 = R$id.line3))) != null) {
                                                i11 = R$id.maxLabel;
                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView9 != null) {
                                                    i11 = R$id.maxLayout;
                                                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                    if (linearLayoutCompat3 != null) {
                                                        i11 = R$id.maxValue;
                                                        BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView10 != null) {
                                                            i11 = R$id.minLabel;
                                                            BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView11 != null) {
                                                                i11 = R$id.minLayout;
                                                                LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                                if (linearLayoutCompat4 != null) {
                                                                    i11 = R$id.minValue;
                                                                    BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView12 != null) {
                                                                        i11 = R$id.ruleDetails;
                                                                        BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView13 != null) {
                                                                            i11 = R$id.ruleUrl;
                                                                            BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView14 != null) {
                                                                                i11 = R$id.supportLabel;
                                                                                BaseTextView baseTextView15 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView15 != null) {
                                                                                    i11 = R$id.supportLayout;
                                                                                    LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                                                    if (linearLayoutCompat5 != null) {
                                                                                        i11 = R$id.supportPairs;
                                                                                        BaseTextView baseTextView16 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView16 != null) {
                                                                                            i11 = R$id.supportValue;
                                                                                            AnimateDrawableEndView animateDrawableEndView = (AnimateDrawableEndView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (animateDrawableEndView != null) {
                                                                                                i11 = R$id.title;
                                                                                                BaseTextView baseTextView17 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView17 != null) {
                                                                                                    i11 = R$id.totalLabel;
                                                                                                    BaseTextView baseTextView18 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (baseTextView18 != null) {
                                                                                                        i11 = R$id.totalLayout;
                                                                                                        LinearLayoutCompat linearLayoutCompat6 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (linearLayoutCompat6 != null) {
                                                                                                            i11 = R$id.totalValue;
                                                                                                            BaseTextView baseTextView19 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                            if (baseTextView19 != null) {
                                                                                                                i11 = R$id.trialUsageIns;
                                                                                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                                                                                if (linearLayout != null) {
                                                                                                                    i11 = R$id.tv_confirm;
                                                                                                                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                                                                    if (kcPrimaryButton != null) {
                                                                                                                        i11 = R$id.validLabel;
                                                                                                                        BaseTextView baseTextView20 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                        if (baseTextView20 != null) {
                                                                                                                            i11 = R$id.validLayout;
                                                                                                                            LinearLayoutCompat linearLayoutCompat7 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                                                                                                            if (linearLayoutCompat7 != null) {
                                                                                                                                i11 = R$id.validValue;
                                                                                                                                BaseTextView baseTextView21 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                                if (baseTextView21 != null) {
                                                                                                                                    return new C36740c0((LinearLayoutCompat) view, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, linearLayoutCompat, baseTextView6, baseTextView7, linearLayoutCompat2, baseTextView8, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, baseTextView9, linearLayoutCompat3, baseTextView10, baseTextView11, linearLayoutCompat4, baseTextView12, baseTextView13, baseTextView14, baseTextView15, linearLayoutCompat5, baseTextView16, animateDrawableEndView, baseTextView17, baseTextView18, linearLayoutCompat6, baseTextView19, linearLayout, kcPrimaryButton, baseTextView20, linearLayoutCompat7, baseTextView21);
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
    public LinearLayoutCompat getRoot() {
        return this.f79775a;
    }

    public C36740c0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull BaseTextView baseTextView8, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull BaseTextView baseTextView9, @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull LinearLayoutCompat linearLayoutCompat5, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14, @NonNull BaseTextView baseTextView15, @NonNull LinearLayoutCompat linearLayoutCompat6, @NonNull BaseTextView baseTextView16, @NonNull AnimateDrawableEndView animateDrawableEndView, @NonNull BaseTextView baseTextView17, @NonNull BaseTextView baseTextView18, @NonNull LinearLayoutCompat linearLayoutCompat7, @NonNull BaseTextView baseTextView19, @NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView20, @NonNull LinearLayoutCompat linearLayoutCompat8, @NonNull BaseTextView baseTextView21) {
        this.f79775a = linearLayoutCompat;
        this.f79776b = baseTextView;
        this.f79777c = baseTextView2;
        this.f79778d = baseTextView3;
        this.f79779e = baseTextView4;
        this.f79780f = baseTextView5;
        this.f79781g = linearLayoutCompat2;
        this.f79782h = baseTextView6;
        this.f79783i = baseTextView7;
        this.f79784j = linearLayoutCompat3;
        this.f79785k = baseTextView8;
        this.f79786l = view;
        this.f79787m = view2;
        this.f79788n = view3;
        this.f79789o = view4;
        this.f79790p = baseTextView9;
        this.f79791q = linearLayoutCompat4;
        this.f79792r = baseTextView10;
        this.f79793s = baseTextView11;
        this.f79794t = linearLayoutCompat5;
        this.f79795u = baseTextView12;
        this.f79796v = baseTextView13;
        this.f79797w = baseTextView14;
        this.f79798x = baseTextView15;
        this.f79799y = linearLayoutCompat6;
        this.f79800z = baseTextView16;
        this.f79765A = animateDrawableEndView;
        this.f79766B = baseTextView17;
        this.f79767C = baseTextView18;
        this.f79768D = linearLayoutCompat7;
        this.f79769E = baseTextView19;
        this.f79770F = linearLayout;
        this.f79771G = kcPrimaryButton;
        this.f79772H = baseTextView20;
        this.f79773I = linearLayoutCompat8;
        this.f79774J = baseTextView21;
    }
}
