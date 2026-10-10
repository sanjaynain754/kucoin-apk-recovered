package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.otc.view.FeeListLayout;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.k */
/* JADX INFO: compiled from: BotcFragmentFastFiatDetailBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37641k implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84103a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AlertTipsTextView f84104b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AlertTipsTextView f84105c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Barrier f84106d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Barrier f84107e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f84108f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f84109g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final FeeListLayout f84110h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84111i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84112j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f84113k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f84114l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f84115m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f84116n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f84117o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f84118p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f84119q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f84120r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f84121s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f84122t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f84123u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f84124v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f84125w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f84126x;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37641k m84865a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.alertNormal;
        AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
        if (alertTipsTextView != null) {
            i11 = R$id.alertWaring;
            AlertTipsTextView alertTipsTextView2 = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
            if (alertTipsTextView2 != null) {
                i11 = R$id.barrier;
                Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
                if (barrier != null) {
                    i11 = R$id.barrierAlert;
                    Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i11);
                    if (barrier2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider1))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.divider2))) != null) {
                        i11 = R$id.ll_fee;
                        FeeListLayout feeListLayout = (FeeListLayout) ViewBindings.findChildViewById(view, i11);
                        if (feeListLayout != null) {
                            i11 = R$id.tv_amount;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tv_fee;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tv_fee_tip;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tv_order_numer;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tv_order_numer_tip;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.tv_pay_time;
                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView6 != null) {
                                                    i11 = R$id.tv_pay_time_tip;
                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView7 != null) {
                                                        i11 = R$id.tv_pay_type;
                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView8 != null) {
                                                            i11 = R$id.tv_pay_type_tip;
                                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView9 != null) {
                                                                i11 = R$id.tv_price;
                                                                BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView10 != null) {
                                                                    i11 = R$id.tv_price_tip;
                                                                    BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView11 != null) {
                                                                        i11 = R$id.tv_quantity;
                                                                        BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView12 != null) {
                                                                            i11 = R$id.tv_quantity_tip;
                                                                            BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView13 != null) {
                                                                                i11 = R$id.tv_result;
                                                                                BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView14 != null) {
                                                                                    i11 = R$id.tv_tip;
                                                                                    BaseTextView baseTextView15 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView15 != null) {
                                                                                        i11 = R$id.tvTips;
                                                                                        BaseTextView baseTextView16 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView16 != null) {
                                                                                            return new C37641k((ConstraintLayout) view, alertTipsTextView, alertTipsTextView2, barrier, barrier2, viewFindChildViewById, viewFindChildViewById2, feeListLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, baseTextView13, baseTextView14, baseTextView15, baseTextView16);
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
        return this.f84103a;
    }

    public C37641k(@NonNull ConstraintLayout constraintLayout, @NonNull AlertTipsTextView alertTipsTextView, @NonNull AlertTipsTextView alertTipsTextView2, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull View view, @NonNull View view2, @NonNull FeeListLayout feeListLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14, @NonNull BaseTextView baseTextView15, @NonNull BaseTextView baseTextView16) {
        this.f84103a = constraintLayout;
        this.f84104b = alertTipsTextView;
        this.f84105c = alertTipsTextView2;
        this.f84106d = barrier;
        this.f84107e = barrier2;
        this.f84108f = view;
        this.f84109g = view2;
        this.f84110h = feeListLayout;
        this.f84111i = baseTextView;
        this.f84112j = baseTextView2;
        this.f84113k = baseTextView3;
        this.f84114l = baseTextView4;
        this.f84115m = baseTextView5;
        this.f84116n = baseTextView6;
        this.f84117o = baseTextView7;
        this.f84118p = baseTextView8;
        this.f84119q = baseTextView9;
        this.f84120r = baseTextView10;
        this.f84121s = baseTextView11;
        this.f84122t = baseTextView12;
        this.f84123u = baseTextView13;
        this.f84124v = baseTextView14;
        this.f84125w = baseTextView15;
        this.f84126x = baseTextView16;
    }
}
