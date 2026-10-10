package p270ft;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.otc.view.FiatEditTextView;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.x */
/* JADX INFO: compiled from: BotcFragmentFiatWithdrawInputBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37705x implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84831a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f84832b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f84833c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f84834d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final C37595a3 f84835e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84836f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84837g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84838h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84839i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AlertTipsTextView f84840j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final KcPrimaryButton f84841k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f84842l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f84843m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f84844n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f84845o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f84846p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final ConstraintLayout f84847q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final LinearLayout f84848r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final FiatEditTextView f84849s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final ConstraintLayout f84850t;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37705x m84997a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.barrierTop;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.iv_close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.iv_warning;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.layoutEdd))) != null) {
                    C37595a3 c37595a3M84774a = C37595a3.m84774a(viewFindChildViewById);
                    i11 = R$id.tv_account;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_add_account;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tv_balance_max;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tv_balance_tip;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.tvBalanceWarning;
                                    AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                                    if (alertTipsTextView != null) {
                                        i11 = R$id.tv_continue;
                                        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                        if (kcPrimaryButton != null) {
                                            i11 = R$id.tv_des;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.tv_limit_tip;
                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView6 != null) {
                                                    i11 = R$id.tv_tag;
                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView7 != null) {
                                                        i11 = R$id.tv_transfer;
                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView8 != null) {
                                                            i11 = R$id.tv_waring;
                                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView9 != null) {
                                                                i11 = R$id.view_account;
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                if (constraintLayout != null) {
                                                                    i11 = R$id.view_balance_tip;
                                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                                    if (linearLayout != null) {
                                                                        i11 = R$id.view_input_amount;
                                                                        FiatEditTextView fiatEditTextView = (FiatEditTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (fiatEditTextView != null) {
                                                                            i11 = R$id.view_warning;
                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                            if (constraintLayout2 != null) {
                                                                                return new C37705x((ConstraintLayout) view, barrier, imageView, imageView2, c37595a3M84774a, baseTextView, baseTextView2, baseTextView3, baseTextView4, alertTipsTextView, kcPrimaryButton, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, constraintLayout, linearLayout, fiatEditTextView, constraintLayout2);
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
        return this.f84831a;
    }

    public C37705x(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull C37595a3 c37595a3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull AlertTipsTextView alertTipsTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout, @NonNull FiatEditTextView fiatEditTextView, @NonNull ConstraintLayout constraintLayout3) {
        this.f84831a = constraintLayout;
        this.f84832b = barrier;
        this.f84833c = imageView;
        this.f84834d = imageView2;
        this.f84835e = c37595a3;
        this.f84836f = baseTextView;
        this.f84837g = baseTextView2;
        this.f84838h = baseTextView3;
        this.f84839i = baseTextView4;
        this.f84840j = alertTipsTextView;
        this.f84841k = kcPrimaryButton;
        this.f84842l = baseTextView5;
        this.f84843m = baseTextView6;
        this.f84844n = baseTextView7;
        this.f84845o = baseTextView8;
        this.f84846p = baseTextView9;
        this.f84847q = constraintLayout2;
        this.f84848r = linearLayout;
        this.f84849s = fiatEditTextView;
        this.f84850t = constraintLayout3;
    }
}
