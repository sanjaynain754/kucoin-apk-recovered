package p270ft;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.AlignTopCheckBox;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.widget.web.ui.KWebContainer;

/* JADX INFO: renamed from: ft.h1 */
/* JADX INFO: compiled from: PaymentFragmentFastBuyCreditCardConfirmBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37628h1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83951a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f83952b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f83953c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f83954d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f83955e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f83956f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f83957g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f83958h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f83959i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f83960j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f83961k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f83962l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f83963m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f83964n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f83965o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f83966p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f83967q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f83968r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f83969s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f83970t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f83971u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final AlignTopCheckBox f83972v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final KWebContainer f83973w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final FrameLayout f83974x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final ProgressBar f83975y;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37628h1 m84838a(@NonNull View view) {
        int i11 = R$id.iv_arrow_down;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_count_down;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.iv_eurlita;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView3 != null) {
                    i11 = R$id.iv_fee_question;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView4 != null) {
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
                                                                                            i11 = R$id.view_collect;
                                                                                            KWebContainer kWebContainer = (KWebContainer) ViewBindings.findChildViewById(view, i11);
                                                                                            if (kWebContainer != null) {
                                                                                                i11 = R$id.view_confirm;
                                                                                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                                                                if (frameLayout != null) {
                                                                                                    i11 = R$id.view_progress;
                                                                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (progressBar != null) {
                                                                                                        return new C37628h1((ConstraintLayout) view, imageView, imageView2, imageView3, imageView4, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, baseTextView13, baseTextView14, baseTextView15, baseTextView16, alignTopCheckBox, kWebContainer, frameLayout, progressBar);
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
        return this.f83951a;
    }

    public C37628h1(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14, @NonNull BaseTextView baseTextView15, @NonNull BaseTextView baseTextView16, @NonNull AlignTopCheckBox alignTopCheckBox, @NonNull KWebContainer kWebContainer, @NonNull FrameLayout frameLayout, @NonNull ProgressBar progressBar) {
        this.f83951a = constraintLayout;
        this.f83952b = imageView;
        this.f83953c = imageView2;
        this.f83954d = imageView3;
        this.f83955e = imageView4;
        this.f83956f = baseTextView;
        this.f83957g = baseTextView2;
        this.f83958h = baseTextView3;
        this.f83959i = baseTextView4;
        this.f83960j = baseTextView5;
        this.f83961k = baseTextView6;
        this.f83962l = baseTextView7;
        this.f83963m = baseTextView8;
        this.f83964n = baseTextView9;
        this.f83965o = baseTextView10;
        this.f83966p = baseTextView11;
        this.f83967q = baseTextView12;
        this.f83968r = baseTextView13;
        this.f83969s = baseTextView14;
        this.f83970t = baseTextView15;
        this.f83971u = baseTextView16;
        this.f83972v = alignTopCheckBox;
        this.f83973w = kWebContainer;
        this.f83974x = frameLayout;
        this.f83975y = progressBar;
    }
}
