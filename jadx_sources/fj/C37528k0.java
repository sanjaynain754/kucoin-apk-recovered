package fj;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.kubi.home.R$id;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;

/* JADX INFO: renamed from: fj.k0 */
/* JADX INFO: compiled from: KucoinItemHomeBannerBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37528k0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f83356a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final MaterialCardView f83357b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BGABanner f83358c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37528k0 m84518a(@NonNull View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i11 = R$id.m_banner;
        BGABanner bGABanner = (BGABanner) ViewBindings.findChildViewById(view, i11);
        if (bGABanner != null) {
            return new C37528k0(materialCardView, materialCardView, bGABanner);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f83356a;
    }

    public C37528k0(@NonNull MaterialCardView materialCardView, @NonNull MaterialCardView materialCardView2, @NonNull BGABanner bGABanner) {
        this.f83356a = materialCardView;
        this.f83357b = materialCardView2;
        this.f83358c = bGABanner;
    }
}
