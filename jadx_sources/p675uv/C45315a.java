package p675uv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;

/* JADX INFO: renamed from: uv.a */
/* JADX INFO: compiled from: BredpackageActivityChooseCoinBinding.java */
/* JADX INFO: loaded from: classes38.dex */
public final class C45315a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final SwipeRefreshRecyclerView f101879a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SwipeRefreshRecyclerView f101880b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45315a m100184a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) view;
        return new C45315a(swipeRefreshRecyclerView, swipeRefreshRecyclerView);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SwipeRefreshRecyclerView getRoot() {
        return this.f101879a;
    }

    public C45315a(@NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView2) {
        this.f101879a = swipeRefreshRecyclerView;
        this.f101880b = swipeRefreshRecyclerView2;
    }
}
