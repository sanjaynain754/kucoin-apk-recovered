package fj;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.resources.widget.ReloadRefreshView;

/* JADX INFO: renamed from: fj.a0 */
/* JADX INFO: compiled from: HomeWidgetGridNavigationBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37508a0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83207a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f83208b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C37555y f83209c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f83210d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ReloadRefreshView f83211e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37508a0 m84474a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.includeShimmer;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C37555y c37555yM84583a = C37555y.m84583a(viewFindChildViewById);
            i11 = R$id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.reloadView;
                ReloadRefreshView reloadRefreshView = (ReloadRefreshView) ViewBindings.findChildViewById(view, i11);
                if (reloadRefreshView != null) {
                    return new C37508a0(constraintLayout, constraintLayout, c37555yM84583a, recyclerView, reloadRefreshView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83207a;
    }

    public C37508a0(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull C37555y c37555y, @NonNull RecyclerView recyclerView, @NonNull ReloadRefreshView reloadRefreshView) {
        this.f83207a = constraintLayout;
        this.f83208b = constraintLayout2;
        this.f83209c = c37555y;
        this.f83210d = recyclerView;
        this.f83211e = reloadRefreshView;
    }
}
