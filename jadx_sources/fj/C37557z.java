package fj;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.kubi.home.R$id;
import com.kubi.home.v2.container.p088ui.view.HomeBannerView;
import com.kubi.resources.widget.ReloadRefreshView;

/* JADX INFO: renamed from: fj.z */
/* JADX INFO: compiled from: HomeWidgetBannerBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37557z implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f83508a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final HomeBannerView f83509b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final MaterialCardView f83510c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ReloadRefreshView f83511d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37557z m84588a(@NonNull View view) {
        int i11 = R$id.banner;
        HomeBannerView homeBannerView = (HomeBannerView) ViewBindings.findChildViewById(view, i11);
        if (homeBannerView != null) {
            MaterialCardView materialCardView = (MaterialCardView) view;
            int i12 = R$id.reloadView;
            ReloadRefreshView reloadRefreshView = (ReloadRefreshView) ViewBindings.findChildViewById(view, i12);
            if (reloadRefreshView != null) {
                return new C37557z(materialCardView, homeBannerView, materialCardView, reloadRefreshView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f83508a;
    }

    public C37557z(@NonNull MaterialCardView materialCardView, @NonNull HomeBannerView homeBannerView, @NonNull MaterialCardView materialCardView2, @NonNull ReloadRefreshView reloadRefreshView) {
        this.f83508a = materialCardView;
        this.f83509b = homeBannerView;
        this.f83510c = materialCardView2;
        this.f83511d = reloadRefreshView;
    }
}
