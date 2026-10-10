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
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.bizshimmer.HomeShimmerHalfCard;

/* JADX INFO: renamed from: bv.y0 */
/* JADX INFO: compiled from: QuoteWidgetGemboxBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4705y0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f4630a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final MaterialCardView f4631b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Group f4632c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f4633d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final CoinAvatarView f4634e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayoutCompat f4635f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final HomeShimmerHalfCard f4636g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ReloadRefreshView f4637h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f4638i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f4639j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f4640k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f4641l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f4642m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4705y0 m4722a(@NonNull View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i11 = R$id.groupContent;
        Group group = (Group) ViewBindings.findChildViewById(view, i11);
        if (group != null) {
            i11 = R$id.ivHeat;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.ivLogo;
                CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
                if (coinAvatarView != null) {
                    i11 = R$id.layoutNameRate;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat != null) {
                        i11 = R$id.layoutShimmer;
                        HomeShimmerHalfCard homeShimmerHalfCard = (HomeShimmerHalfCard) ViewBindings.findChildViewById(view, i11);
                        if (homeShimmerHalfCard != null) {
                            i11 = R$id.reloadView;
                            ReloadRefreshView reloadRefreshView = (ReloadRefreshView) ViewBindings.findChildViewById(view, i11);
                            if (reloadRefreshView != null) {
                                i11 = R$id.tvCoinName;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tvCoinPrice;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tvCoinRate;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.tvTips;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                i11 = R$id.tvTitle;
                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView5 != null) {
                                                    return new C4705y0(materialCardView, materialCardView, group, appCompatImageView, coinAvatarView, linearLayoutCompat, homeShimmerHalfCard, reloadRefreshView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5);
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
        return this.f4630a;
    }

    public C4705y0(@NonNull MaterialCardView materialCardView, @NonNull MaterialCardView materialCardView2, @NonNull Group group, @NonNull AppCompatImageView appCompatImageView, @NonNull CoinAvatarView coinAvatarView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull HomeShimmerHalfCard homeShimmerHalfCard, @NonNull ReloadRefreshView reloadRefreshView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5) {
        this.f4630a = materialCardView;
        this.f4631b = materialCardView2;
        this.f4632c = group;
        this.f4633d = appCompatImageView;
        this.f4634e = coinAvatarView;
        this.f4635f = linearLayoutCompat;
        this.f4636g = homeShimmerHalfCard;
        this.f4637h = reloadRefreshView;
        this.f4638i = baseTextView;
        this.f4639j = baseTextView2;
        this.f4640k = baseTextView3;
        this.f4641l = baseTextView4;
        this.f4642m = baseTextView5;
    }
}
