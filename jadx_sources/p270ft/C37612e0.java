package p270ft;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;

/* JADX INFO: renamed from: ft.e0 */
/* JADX INFO: compiled from: BotcMerchantAdsListBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37612e0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f83827a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SwipeRefreshRecyclerView f83828b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37612e0 m84805a(@NonNull View view) {
        int i11 = R$id.m_swipe_recycler_view;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
        if (swipeRefreshRecyclerView != null) {
            return new C37612e0((FrameLayout) view, swipeRefreshRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f83827a;
    }

    public C37612e0(@NonNull FrameLayout frameLayout, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView) {
        this.f83827a = frameLayout;
        this.f83828b = swipeRefreshRecyclerView;
    }
}
