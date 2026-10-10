package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: dm.i2 */
/* JADX INFO: compiled from: BkumexFragmentFuturesMoreCampaignBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36778i2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KuCoinRefreshLayout f80256a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f80257b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCoinRefreshLayout f80258c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36778i2 m82414a(@NonNull View view) {
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) view;
        return new C36778i2(kuCoinRefreshLayout, recyclerView, kuCoinRefreshLayout);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public KuCoinRefreshLayout getRoot() {
        return this.f80256a;
    }

    public C36778i2(@NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull RecyclerView recyclerView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout2) {
        this.f80256a = kuCoinRefreshLayout;
        this.f80257b = recyclerView;
        this.f80258c = kuCoinRefreshLayout2;
    }
}
