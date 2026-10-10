package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.bizshimmer.HomeShimmerHalfCard;

/* JADX INFO: renamed from: bv.z0 */
/* JADX INFO: compiled from: QuoteWidgetHotSectorsBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4707z0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f4651a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Group f4652b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final MaterialCardView f4653c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f4654d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f4655e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final HomeShimmerHalfCard f4656f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ReloadRefreshView f4657g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f4658h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f4659i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f4660j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f4661k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f4662l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4707z0 m4726a(@NonNull View view) {
        int i11 = R$id.groupContent;
        Group group = (Group) ViewBindings.findChildViewById(view, i11);
        if (group != null) {
            MaterialCardView materialCardView = (MaterialCardView) view;
            i11 = R$id.layoutSector1;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.layoutSector2;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat2 != null) {
                    i11 = R$id.layoutShimmer;
                    HomeShimmerHalfCard homeShimmerHalfCard = (HomeShimmerHalfCard) ViewBindings.findChildViewById(view, i11);
                    if (homeShimmerHalfCard != null) {
                        i11 = R$id.reloadView;
                        ReloadRefreshView reloadRefreshView = (ReloadRefreshView) ViewBindings.findChildViewById(view, i11);
                        if (reloadRefreshView != null) {
                            i11 = R$id.tvName1;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tvName2;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tvRate1;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tvRate2;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tvTitle;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                return new C4707z0(materialCardView, group, materialCardView, linearLayoutCompat, linearLayoutCompat2, homeShimmerHalfCard, reloadRefreshView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5);
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
        return this.f4651a;
    }

    public C4707z0(@NonNull MaterialCardView materialCardView, @NonNull Group group, @NonNull MaterialCardView materialCardView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull HomeShimmerHalfCard homeShimmerHalfCard, @NonNull ReloadRefreshView reloadRefreshView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5) {
        this.f4651a = materialCardView;
        this.f4652b = group;
        this.f4653c = materialCardView2;
        this.f4654d = linearLayoutCompat;
        this.f4655e = linearLayoutCompat2;
        this.f4656f = homeShimmerHalfCard;
        this.f4657g = reloadRefreshView;
        this.f4658h = baseTextView;
        this.f4659i = baseTextView2;
        this.f4660j = baseTextView3;
        this.f4661k = baseTextView4;
        this.f4662l = baseTextView5;
    }
}
