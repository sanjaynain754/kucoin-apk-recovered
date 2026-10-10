package q70;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.utaspotlib.R$id;
import v30.C45413z;

/* JADX INFO: renamed from: q70.c */
/* JADX INFO: compiled from: UtaDelegationHistoryFragmentBinding.java */
/* JADX INFO: loaded from: classes54.dex */
public final class C43656c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f96357a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f96358b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f96359c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final SwipeRefreshRecyclerView f96360d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final C45413z f96361e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43656c m96072a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.flOrderListContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
            i11 = R$id.m_swipe_recycler_view;
            SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
            if (swipeRefreshRecyclerView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.toolbar))) != null) {
                return new C43656c((LinearLayout) view, frameLayout, viewFindChildViewById, swipeRefreshRecyclerView, C45413z.m100363a(viewFindChildViewById2));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f96357a;
    }

    public C43656c(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull View view, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull C45413z c45413z) {
        this.f96357a = linearLayout;
        this.f96358b = frameLayout;
        this.f96359c = view;
        this.f96360d = swipeRefreshRecyclerView;
        this.f96361e = c45413z;
    }
}
