package p270ft;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.otc.view.FeeListLayout;
import com.kubi.resources.widget.AlignTopCheckBox;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.l1 */
/* JADX INFO: compiled from: PaymentFragmentFastBuyRevolutConfirmBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37648l1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84211a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f84212b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f84213c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f84214d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f84215e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FeeListLayout f84216f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84217g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84218h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84219i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84220j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f84221k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f84222l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f84223m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f84224n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f84225o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f84226p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f84227q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f84228r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f84229s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f84230t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f84231u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f84232v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final AlignTopCheckBox f84233w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final FrameLayout f84234x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final ProgressBar f84235y;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37648l1 m84879a(@NonNull View view) {
        int i11 = R$id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.iv_count_down;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.iv_eurlita;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView2 != null) {
                    i11 = R$id.iv_method_icon;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView3 != null) {
                        i11 = R$id.ll_fee;
                        FeeListLayout feeListLayout = (FeeListLayout) ViewBindings.findChildViewById(view, i11);
                        if (feeListLayout != null) {
                            i11 = R$id.tv_bottom_tip;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tv_buy_fiat_tip;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tv_confirm_buy;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tv_count_down;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tv_estimate;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.tv_fee;
                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView6 != null) {
                                                    i11 = R$id.tv_fee_tip;
                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView7 != null) {
                                                        i11 = R$id.tv_fiat_currency;
                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView8 != null) {
                                                            i11 = R$id.tv_fiat_currency_value;
                                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView9 != null) {
                                                                i11 = R$id.tv_funds;
                                                                BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView10 != null) {
                                                                    i11 = R$id.tv_method;
                                                                    BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView11 != null) {
                                                                        i11 = R$id.tv_method_tip;
                                                                        BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView12 != null) {
                                                                            i11 = R$id.tv_price;
                                                                            BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView13 != null) {
                                                                                i11 = R$id.tv_price_label;
                                                                                BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView14 != null) {
                                                                                    i11 = R$id.tv_total;
                                                                                    BaseTextView baseTextView15 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView15 != null) {
                                                                                        i11 = R$id.tv_total_tip;
                                                                                        BaseTextView baseTextView16 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView16 != null) {
                                                                                            i11 = R$id.view_check_statement;
                                                                                            AlignTopCheckBox alignTopCheckBox = (AlignTopCheckBox) ViewBindings.findChildViewById(view, i11);
                                                                                            if (alignTopCheckBox != null) {
                                                                                                i11 = R$id.view_confirm;
                                                                                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                                                                if (frameLayout != null) {
                                                                                                    i11 = R$id.view_progress;
                                                                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (progressBar != null) {
                                                                                                        return new C37648l1((ConstraintLayout) view, barrier, imageView, imageView2, imageView3, feeListLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, baseTextView13, baseTextView14, baseTextView15, baseTextView16, alignTopCheckBox, frameLayout, progressBar);
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
        return this.f84211a;
    }

    public C37648l1(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull FeeListLayout feeListLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14, @NonNull BaseTextView baseTextView15, @NonNull BaseTextView baseTextView16, @NonNull AlignTopCheckBox alignTopCheckBox, @NonNull FrameLayout frameLayout, @NonNull ProgressBar progressBar) {
        this.f84211a = constraintLayout;
        this.f84212b = barrier;
        this.f84213c = imageView;
        this.f84214d = imageView2;
        this.f84215e = imageView3;
        this.f84216f = feeListLayout;
        this.f84217g = baseTextView;
        this.f84218h = baseTextView2;
        this.f84219i = baseTextView3;
        this.f84220j = baseTextView4;
        this.f84221k = baseTextView5;
        this.f84222l = baseTextView6;
        this.f84223m = baseTextView7;
        this.f84224n = baseTextView8;
        this.f84225o = baseTextView9;
        this.f84226p = baseTextView10;
        this.f84227q = baseTextView11;
        this.f84228r = baseTextView12;
        this.f84229s = baseTextView13;
        this.f84230t = baseTextView14;
        this.f84231u = baseTextView15;
        this.f84232v = baseTextView16;
        this.f84233w = alignTopCheckBox;
        this.f84234x = frameLayout;
        this.f84235y = progressBar;
    }
}
