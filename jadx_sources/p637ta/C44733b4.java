package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;

/* JADX INFO: renamed from: ta.b4 */
/* JADX INFO: compiled from: KucoinActivitySearchCoinBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44733b4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99621a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SwipeRefreshRecyclerView f99622b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C44853r2 f99623c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44733b4 m98976a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.m_swipe_recycler_view;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
        if (swipeRefreshRecyclerView == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.searchBar))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C44733b4((LinearLayout) view, swipeRefreshRecyclerView, C44853r2.m99230a(viewFindChildViewById));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f99621a;
    }

    public C44733b4(@NonNull LinearLayout linearLayout, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull C44853r2 c44853r2) {
        this.f99621a = linearLayout;
        this.f99622b = swipeRefreshRecyclerView;
        this.f99623c = c44853r2;
    }
}
