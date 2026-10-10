package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;

/* JADX INFO: renamed from: dm.m1 */
/* JADX INFO: compiled from: BkumexFooterPanelHedgeBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36801m1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80534a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80535b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Barrier f80536c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final DashTextView f80537d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80538e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final DashTextView f80539f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f80540g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80541h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80542i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final Group f80543j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final Group f80544k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final DashTextView f80545l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f80546m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final Group f80547n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final DashTextView f80548o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f80549p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f80550q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final Barrier f80551r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final DashTextView f80552s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f80553t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final DashTextView f80554u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f80555v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f80556w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f80557x;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36801m1 m82463a(@NonNull View view) {
        int i11 = R$id.buyAction;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.buyCostBarrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
            if (barrier != null) {
                i11 = R$id.buyCostLabel;
                DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                if (dashTextView != null) {
                    i11 = R$id.buyCostValue;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.buyLiqLabel;
                        DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                        if (dashTextView2 != null) {
                            i11 = R$id.buyLiqValue;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.buyMaxLabel;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.buyMaxValue;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.liqGroup;
                                        Group group = (Group) ViewBindings.findChildViewById(view, i11);
                                        if (group != null) {
                                            i11 = R$id.maxGroup;
                                            Group group2 = (Group) ViewBindings.findChildViewById(view, i11);
                                            if (group2 != null) {
                                                i11 = R$id.perBuyOrderQtyLabelTv;
                                                DashTextView dashTextView3 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                if (dashTextView3 != null) {
                                                    i11 = R$id.perBuyOrderQtyTv;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        i11 = R$id.perOrderQtyGroup;
                                                        Group group3 = (Group) ViewBindings.findChildViewById(view, i11);
                                                        if (group3 != null) {
                                                            i11 = R$id.perSellOrderQtyLabelTv;
                                                            DashTextView dashTextView4 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (dashTextView4 != null) {
                                                                i11 = R$id.perSellOrderQtyTv;
                                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView7 != null) {
                                                                    i11 = R$id.sellAction;
                                                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView8 != null) {
                                                                        i11 = R$id.sellCostBarrier;
                                                                        Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i11);
                                                                        if (barrier2 != null) {
                                                                            i11 = R$id.sellCostLabel;
                                                                            DashTextView dashTextView5 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (dashTextView5 != null) {
                                                                                i11 = R$id.sellCostValue;
                                                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView9 != null) {
                                                                                    i11 = R$id.sellLiqLabel;
                                                                                    DashTextView dashTextView6 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (dashTextView6 != null) {
                                                                                        i11 = R$id.sellLiqValue;
                                                                                        BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView10 != null) {
                                                                                            i11 = R$id.sellMaxLabel;
                                                                                            BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (baseTextView11 != null) {
                                                                                                i11 = R$id.sellMaxValue;
                                                                                                BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView12 != null) {
                                                                                                    return new C36801m1((ConstraintLayout) view, baseTextView, barrier, dashTextView, baseTextView2, dashTextView2, baseTextView3, baseTextView4, baseTextView5, group, group2, dashTextView3, baseTextView6, group3, dashTextView4, baseTextView7, baseTextView8, barrier2, dashTextView5, baseTextView9, dashTextView6, baseTextView10, baseTextView11, baseTextView12);
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
        return this.f80534a;
    }

    public C36801m1(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull Barrier barrier, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView2, @NonNull DashTextView dashTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull Group group, @NonNull Group group2, @NonNull DashTextView dashTextView3, @NonNull BaseTextView baseTextView6, @NonNull Group group3, @NonNull DashTextView dashTextView4, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull Barrier barrier2, @NonNull DashTextView dashTextView5, @NonNull BaseTextView baseTextView9, @NonNull DashTextView dashTextView6, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12) {
        this.f80534a = constraintLayout;
        this.f80535b = baseTextView;
        this.f80536c = barrier;
        this.f80537d = dashTextView;
        this.f80538e = baseTextView2;
        this.f80539f = dashTextView2;
        this.f80540g = baseTextView3;
        this.f80541h = baseTextView4;
        this.f80542i = baseTextView5;
        this.f80543j = group;
        this.f80544k = group2;
        this.f80545l = dashTextView3;
        this.f80546m = baseTextView6;
        this.f80547n = group3;
        this.f80548o = dashTextView4;
        this.f80549p = baseTextView7;
        this.f80550q = baseTextView8;
        this.f80551r = barrier2;
        this.f80552s = dashTextView5;
        this.f80553t = baseTextView9;
        this.f80554u = dashTextView6;
        this.f80555v = baseTextView10;
        this.f80556w = baseTextView11;
        this.f80557x = baseTextView12;
    }
}
