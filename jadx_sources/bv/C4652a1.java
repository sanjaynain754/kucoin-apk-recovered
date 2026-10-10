package bv;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.bizshimmer.HomeShimmerFullCard;

/* JADX INFO: renamed from: bv.a1 */
/* JADX INFO: compiled from: QuoteWidgetHotSectorsFullBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4652a1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f4201a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Group f4202b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final MaterialCardView f4203c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f4204d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f4205e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f4206f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f4207g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ConstraintLayout f4208h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final HomeShimmerFullCard f4209i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f4210j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ReloadRefreshView f4211k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f4212l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f4213m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f4214n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f4215o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f4216p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f4217q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f4218r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f4219s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f4220t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f4221u;

    public C4652a1(@NonNull MaterialCardView materialCardView, @NonNull Group group, @NonNull MaterialCardView materialCardView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull HomeShimmerFullCard homeShimmerFullCard, @NonNull LinearLayout linearLayout, @NonNull ReloadRefreshView reloadRefreshView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10) {
        this.f4201a = materialCardView;
        this.f4202b = group;
        this.f4203c = materialCardView2;
        this.f4204d = linearLayoutCompat;
        this.f4205e = constraintLayout;
        this.f4206f = constraintLayout2;
        this.f4207g = constraintLayout3;
        this.f4208h = constraintLayout4;
        this.f4209i = homeShimmerFullCard;
        this.f4210j = linearLayout;
        this.f4211k = reloadRefreshView;
        this.f4212l = baseTextView;
        this.f4213m = baseTextView2;
        this.f4214n = baseTextView3;
        this.f4215o = baseTextView4;
        this.f4216p = baseTextView5;
        this.f4217q = baseTextView6;
        this.f4218r = baseTextView7;
        this.f4219s = baseTextView8;
        this.f4220t = baseTextView9;
        this.f4221u = baseTextView10;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4652a1 m4616a(@NonNull View view) {
        int i11 = R$id.groupContent;
        Group group = (Group) ViewBindings.findChildViewById(view, i11);
        if (group != null) {
            MaterialCardView materialCardView = (MaterialCardView) view;
            i11 = R$id.layoutContent;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.layoutSector1;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout != null) {
                    i11 = R$id.layoutSector2;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout2 != null) {
                        i11 = R$id.layoutSector3;
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                        if (constraintLayout3 != null) {
                            i11 = R$id.layoutSector4;
                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (constraintLayout4 != null) {
                                i11 = R$id.layoutShimmer;
                                HomeShimmerFullCard homeShimmerFullCard = (HomeShimmerFullCard) ViewBindings.findChildViewById(view, i11);
                                if (homeShimmerFullCard != null) {
                                    i11 = R$id.layoutSubSectors;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout != null) {
                                        i11 = R$id.reloadView;
                                        ReloadRefreshView reloadRefreshView = (ReloadRefreshView) ViewBindings.findChildViewById(view, i11);
                                        if (reloadRefreshView != null) {
                                            i11 = R$id.tvCoins1;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                i11 = R$id.tvName1;
                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView2 != null) {
                                                    i11 = R$id.tvName2;
                                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView3 != null) {
                                                        i11 = R$id.tvName3;
                                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView4 != null) {
                                                            i11 = R$id.tvName4;
                                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView5 != null) {
                                                                i11 = R$id.tvRate1;
                                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView6 != null) {
                                                                    i11 = R$id.tvRate2;
                                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView7 != null) {
                                                                        i11 = R$id.tvRate3;
                                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView8 != null) {
                                                                            i11 = R$id.tvRate4;
                                                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView9 != null) {
                                                                                i11 = R$id.tvTitle;
                                                                                BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView10 != null) {
                                                                                    return new C4652a1(materialCardView, group, materialCardView, linearLayoutCompat, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, homeShimmerFullCard, linearLayout, reloadRefreshView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10);
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
    public MaterialCardView getRoot() {
        return this.f4201a;
    }
}
