package p270ft;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.y */
/* JADX INFO: compiled from: BotcFragmentFiatWithdrawOrderDetailBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37709y implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final View f84886A;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84887a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f84888b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C37595a3 f84889c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84890d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84891e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84892f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84893g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84894h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84895i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84896j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f84897k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f84898l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f84899m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f84900n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f84901o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f84902p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f84903q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f84904r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f84905s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f84906t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f84907u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f84908v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final ConstraintLayout f84909w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final View f84910x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final View f84911y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final ConstraintLayout f84912z;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37709y m85004a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        int i11 = R$id.iv_receive_question;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.layoutEdd))) != null) {
            C37595a3 c37595a3M84774a = C37595a3.m84774a(viewFindChildViewById);
            i11 = R$id.tv_amount;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tv_fee;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tv_fee_tip;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.tv_order_no;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null) {
                            i11 = R$id.tv_order_no_tip;
                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView5 != null) {
                                i11 = R$id.tv_other_question;
                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView6 != null) {
                                    i11 = R$id.tv_receive;
                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView7 != null) {
                                        i11 = R$id.tv_receive_tip;
                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView8 != null) {
                                            i11 = R$id.tv_result;
                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView9 != null) {
                                                i11 = R$id.tv_reversed_tip;
                                                BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView10 != null) {
                                                    i11 = R$id.tv_tax_tip;
                                                    BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView11 != null) {
                                                        i11 = R$id.tv_tax_value;
                                                        BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView12 != null) {
                                                            i11 = R$id.tv_time;
                                                            BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView13 != null) {
                                                                i11 = R$id.tv_time_tip;
                                                                BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView14 != null) {
                                                                    i11 = R$id.tv_tip;
                                                                    BaseTextView baseTextView15 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView15 != null) {
                                                                        i11 = R$id.tv_withdraw_account;
                                                                        BaseTextView baseTextView16 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView16 != null) {
                                                                            i11 = R$id.tv_withdraw_account_tip;
                                                                            BaseTextView baseTextView17 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView17 != null) {
                                                                                i11 = R$id.tv_withdraw_type;
                                                                                BaseTextView baseTextView18 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView18 != null) {
                                                                                    i11 = R$id.tv_withdraw_type_tip;
                                                                                    BaseTextView baseTextView19 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView19 != null) {
                                                                                        i11 = R$id.view_bottom_tip;
                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                                        if (constraintLayout != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.view_line))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.view_line_top))) != null) {
                                                                                            i11 = R$id.view_receive;
                                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                                            if (constraintLayout2 != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i11 = R$id.view_space))) != null) {
                                                                                                return new C37709y((ConstraintLayout) view, imageView, c37595a3M84774a, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, baseTextView13, baseTextView14, baseTextView15, baseTextView16, baseTextView17, baseTextView18, baseTextView19, constraintLayout, viewFindChildViewById2, viewFindChildViewById3, constraintLayout2, viewFindChildViewById4);
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
        return this.f84887a;
    }

    public C37709y(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull C37595a3 c37595a3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14, @NonNull BaseTextView baseTextView15, @NonNull BaseTextView baseTextView16, @NonNull BaseTextView baseTextView17, @NonNull BaseTextView baseTextView18, @NonNull BaseTextView baseTextView19, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull View view2, @NonNull ConstraintLayout constraintLayout3, @NonNull View view3) {
        this.f84887a = constraintLayout;
        this.f84888b = imageView;
        this.f84889c = c37595a3;
        this.f84890d = baseTextView;
        this.f84891e = baseTextView2;
        this.f84892f = baseTextView3;
        this.f84893g = baseTextView4;
        this.f84894h = baseTextView5;
        this.f84895i = baseTextView6;
        this.f84896j = baseTextView7;
        this.f84897k = baseTextView8;
        this.f84898l = baseTextView9;
        this.f84899m = baseTextView10;
        this.f84900n = baseTextView11;
        this.f84901o = baseTextView12;
        this.f84902p = baseTextView13;
        this.f84903q = baseTextView14;
        this.f84904r = baseTextView15;
        this.f84905s = baseTextView16;
        this.f84906t = baseTextView17;
        this.f84907u = baseTextView18;
        this.f84908v = baseTextView19;
        this.f84909w = constraintLayout2;
        this.f84910x = view;
        this.f84911y = view2;
        this.f84912z = constraintLayout3;
        this.f84886A = view3;
    }
}
