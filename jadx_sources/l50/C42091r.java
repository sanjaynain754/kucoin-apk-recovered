package l50;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.resources.widget.bizshimmer.HomeShimmerHalfCard;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.r */
/* JADX INFO: compiled from: BtradingBotKitHomeWidgetBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42091r implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f93251a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BGABanner f93252b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final HomeShimmerHalfCard f93253c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ReloadRefreshView f93254d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final MaterialCardView f93255e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42091r m92335a(@NonNull View view) {
        int i11 = R$id.banner;
        BGABanner bGABanner = (BGABanner) ViewBindings.findChildViewById(view, i11);
        if (bGABanner != null) {
            i11 = R$id.layoutShimmer;
            HomeShimmerHalfCard homeShimmerHalfCard = (HomeShimmerHalfCard) ViewBindings.findChildViewById(view, i11);
            if (homeShimmerHalfCard != null) {
                i11 = R$id.reloadView;
                ReloadRefreshView reloadRefreshView = (ReloadRefreshView) ViewBindings.findChildViewById(view, i11);
                if (reloadRefreshView != null) {
                    MaterialCardView materialCardView = (MaterialCardView) view;
                    return new C42091r(materialCardView, bGABanner, homeShimmerHalfCard, reloadRefreshView, materialCardView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f93251a;
    }

    public C42091r(@NonNull MaterialCardView materialCardView, @NonNull BGABanner bGABanner, @NonNull HomeShimmerHalfCard homeShimmerHalfCard, @NonNull ReloadRefreshView reloadRefreshView, @NonNull MaterialCardView materialCardView2) {
        this.f93251a = materialCardView;
        this.f93252b = bGABanner;
        this.f93253c = homeShimmerHalfCard;
        this.f93254d = reloadRefreshView;
        this.f93255e = materialCardView2;
    }
}
