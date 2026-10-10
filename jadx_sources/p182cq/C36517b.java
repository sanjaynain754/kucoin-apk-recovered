package p182cq;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mart.R$id;
import com.kubi.resources.widget.ScrollTabIndicatorView;

/* JADX INFO: renamed from: cq.b */
/* JADX INFO: compiled from: MartFragmentSpotSidebarTabListBinding.java */
/* JADX INFO: loaded from: classes28.dex */
public final class C36517b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f79351a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C36519d f79352b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C36518c f79353c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f79354d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ScrollTabIndicatorView f79355e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36517b m81763a(@NonNull View view) {
        int i11 = R$id.emptyBinding;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C36519d c36519dM81767a = C36519d.m81767a(viewFindChildViewById);
            i11 = R$id.headerBinding;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById2 != null) {
                C36518c c36518cM81765a = C36518c.m81765a(viewFindChildViewById2);
                i11 = R$id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.scrollTabIndicator;
                    ScrollTabIndicatorView scrollTabIndicatorView = (ScrollTabIndicatorView) ViewBindings.findChildViewById(view, i11);
                    if (scrollTabIndicatorView != null) {
                        return new C36517b((ConstraintLayout) view, c36519dM81767a, c36518cM81765a, recyclerView, scrollTabIndicatorView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f79351a;
    }

    public C36517b(@NonNull ConstraintLayout constraintLayout, @NonNull C36519d c36519d, @NonNull C36518c c36518c, @NonNull RecyclerView recyclerView, @NonNull ScrollTabIndicatorView scrollTabIndicatorView) {
        this.f79351a = constraintLayout;
        this.f79352b = c36519d;
        this.f79353c = c36518c;
        this.f79354d = recyclerView;
        this.f79355e = scrollTabIndicatorView;
    }
}
