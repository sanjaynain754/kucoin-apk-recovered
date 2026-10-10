package t20;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.spot.R$id;
import v30.C45375c0;

/* JADX INFO: renamed from: t20.k0 */
/* JADX INFO: compiled from: KucoinFragmentDelegationTodoTradeBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44649k0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final NestedScrollView f99172a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C45375c0 f99173b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SwipeRefreshRecyclerView f99174c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44649k0 m98774a(@NonNull View view) {
        int i11 = R$id.layoutDelegationGuideLayout;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C45375c0 c45375c0M100280a = C45375c0.m100280a(viewFindChildViewById);
            int i12 = R$id.m_swipe_recycler_view;
            SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i12);
            if (swipeRefreshRecyclerView != null) {
                return new C44649k0((NestedScrollView) view, c45375c0M100280a, swipeRefreshRecyclerView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f99172a;
    }

    public C44649k0(@NonNull NestedScrollView nestedScrollView, @NonNull C45375c0 c45375c0, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView) {
        this.f99172a = nestedScrollView;
        this.f99173b = c45375c0;
        this.f99174c = swipeRefreshRecyclerView;
    }
}
