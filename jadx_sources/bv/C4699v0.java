package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.UpdownCompareIndicator;
import com.kubi.resources.widget.bizshimmer.HomeShimmerHalfCard;

/* JADX INFO: renamed from: bv.v0 */
/* JADX INFO: compiled from: QuoteWidgetEmotionFullBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4699v0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f4568a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final UpdownCompareIndicator f4569b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final MaterialCardView f4570c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Group f4571d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f4572e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f4573f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final HomeShimmerHalfCard f4574g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayoutCompat f4575h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayoutCompat f4576i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ReloadRefreshView f4577j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f4578k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f4579l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f4580m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f4581n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f4582o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f4583p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f4584q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f4585r;

    public C4699v0(@NonNull MaterialCardView materialCardView, @NonNull UpdownCompareIndicator updownCompareIndicator, @NonNull MaterialCardView materialCardView2, @NonNull Group group, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull HomeShimmerHalfCard homeShimmerHalfCard, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull ReloadRefreshView reloadRefreshView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8) {
        this.f4568a = materialCardView;
        this.f4569b = updownCompareIndicator;
        this.f4570c = materialCardView2;
        this.f4571d = group;
        this.f4572e = appCompatImageView;
        this.f4573f = appCompatImageView2;
        this.f4574g = homeShimmerHalfCard;
        this.f4575h = linearLayoutCompat;
        this.f4576i = linearLayoutCompat2;
        this.f4577j = reloadRefreshView;
        this.f4578k = baseTextView;
        this.f4579l = baseTextView2;
        this.f4580m = baseTextView3;
        this.f4581n = baseTextView4;
        this.f4582o = baseTextView5;
        this.f4583p = baseTextView6;
        this.f4584q = baseTextView7;
        this.f4585r = baseTextView8;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4699v0 m4710a(@NonNull View view) {
        int i11 = R$id.compareIndicator;
        UpdownCompareIndicator updownCompareIndicator = (UpdownCompareIndicator) ViewBindings.findChildViewById(view, i11);
        if (updownCompareIndicator != null) {
            MaterialCardView materialCardView = (MaterialCardView) view;
            i11 = R$id.groupContent;
            Group group = (Group) ViewBindings.findChildViewById(view, i11);
            if (group != null) {
                i11 = R$id.ivDown;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.ivUp;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView2 != null) {
                        i11 = R$id.layoutShimmer;
                        HomeShimmerHalfCard homeShimmerHalfCard = (HomeShimmerHalfCard) ViewBindings.findChildViewById(view, i11);
                        if (homeShimmerHalfCard != null) {
                            i11 = R$id.layoutTopDown;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                            if (linearLayoutCompat != null) {
                                i11 = R$id.layoutTopUp;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                if (linearLayoutCompat2 != null) {
                                    i11 = R$id.reloadView;
                                    ReloadRefreshView reloadRefreshView = (ReloadRefreshView) ViewBindings.findChildViewById(view, i11);
                                    if (reloadRefreshView != null) {
                                        i11 = R$id.tvAvgMarketChange;
                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView != null) {
                                            i11 = R$id.tvDownCount;
                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView2 != null) {
                                                i11 = R$id.tvTitle;
                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView3 != null) {
                                                    i11 = R$id.tvTopDownName;
                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView4 != null) {
                                                        i11 = R$id.tvTopDownRate;
                                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView5 != null) {
                                                            i11 = R$id.tvTopUpName;
                                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView6 != null) {
                                                                i11 = R$id.tvTopUpRate;
                                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView7 != null) {
                                                                    i11 = R$id.tvUpCount;
                                                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView8 != null) {
                                                                        return new C4699v0(materialCardView, updownCompareIndicator, materialCardView, group, appCompatImageView, appCompatImageView2, homeShimmerHalfCard, linearLayoutCompat, linearLayoutCompat2, reloadRefreshView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8);
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
        return this.f4568a;
    }
}
