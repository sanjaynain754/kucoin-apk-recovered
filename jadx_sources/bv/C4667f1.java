package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.kubi.quotefacade.R$id;

/* JADX INFO: renamed from: bv.f1 */
/* JADX INFO: compiled from: WidgetHomeRankBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4667f1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f4335a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final MaterialCardView f4336b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FragmentContainerView f4337c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4667f1 m4646a(@NonNull View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i11 = R$id.rankingContainer;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
        if (fragmentContainerView != null) {
            return new C4667f1(materialCardView, materialCardView, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f4335a;
    }

    public C4667f1(@NonNull MaterialCardView materialCardView, @NonNull MaterialCardView materialCardView2, @NonNull FragmentContainerView fragmentContainerView) {
        this.f4335a = materialCardView;
        this.f4336b = materialCardView2;
        this.f4337c = fragmentContainerView;
    }
}
