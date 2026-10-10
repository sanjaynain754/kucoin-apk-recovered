package k00;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.kubi.resources.widget.bar.CollapsingCenterToolbarLayout;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;

/* JADX INFO: renamed from: k00.e */
/* JADX INFO: compiled from: KcLayoutScrollbarBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40841e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final AppBarLayout f90746a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppBarLayout f90747b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final MaterialToolbar f90748c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CollapsingCenterToolbarLayout f90749d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40841e m89378a(@NonNull View view) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        int i11 = R$id.toolBar;
        MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(view, i11);
        if (materialToolbar != null) {
            i11 = R$id.toolBarLayout;
            CollapsingCenterToolbarLayout collapsingCenterToolbarLayout = (CollapsingCenterToolbarLayout) ViewBindings.findChildViewById(view, i11);
            if (collapsingCenterToolbarLayout != null) {
                return new C40841e(appBarLayout, appBarLayout, materialToolbar, collapsingCenterToolbarLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C40841e m89379c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.kc_layout_scrollbar, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m89378a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AppBarLayout getRoot() {
        return this.f90746a;
    }

    public C40841e(@NonNull AppBarLayout appBarLayout, @NonNull AppBarLayout appBarLayout2, @NonNull MaterialToolbar materialToolbar, @NonNull CollapsingCenterToolbarLayout collapsingCenterToolbarLayout) {
        this.f90746a = appBarLayout;
        this.f90747b = appBarLayout2;
        this.f90748c = materialToolbar;
        this.f90749d = collapsingCenterToolbarLayout;
    }
}
