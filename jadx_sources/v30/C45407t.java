package v30;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.t */
/* JADX INFO: compiled from: FragmentCoreDelegationTodoTradeBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45407t implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final NestedScrollView f102339a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C45375c0 f102340b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C45377d0 f102341c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final SwipeRefreshRecyclerView f102342d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45407t m100351a(@NonNull View view) {
        int i11 = R$id.layoutDelegationGuideLayout;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C45375c0 c45375c0M100280a = C45375c0.m100280a(viewFindChildViewById);
            int i12 = R$id.layoutGuideTradeLayout;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i12);
            if (viewFindChildViewById2 != null) {
                C45377d0 c45377d0M100284a = C45377d0.m100284a(viewFindChildViewById2);
                int i13 = R$id.m_swipe_recycler_view;
                SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i13);
                if (swipeRefreshRecyclerView != null) {
                    return new C45407t((NestedScrollView) view, c45375c0M100280a, c45377d0M100284a, swipeRefreshRecyclerView);
                }
                i11 = i13;
            } else {
                i11 = i12;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f102339a;
    }

    public C45407t(@NonNull NestedScrollView nestedScrollView, @NonNull C45375c0 c45375c0, @NonNull C45377d0 c45377d0, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView) {
        this.f102339a = nestedScrollView;
        this.f102340b = c45375c0;
        this.f102341c = c45377d0;
        this.f102342d = swipeRefreshRecyclerView;
    }
}
