package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: dm.c3 */
/* JADX INFO: compiled from: BkumexFragmentProfitDetailBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36743c3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KuCoinRefreshLayout f79816a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f79817b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCoinRefreshLayout f79818c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36743c3 m82337a(@NonNull View view) {
        int i11 = R$id.list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) view;
        return new C36743c3(kuCoinRefreshLayout, recyclerView, kuCoinRefreshLayout);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public KuCoinRefreshLayout getRoot() {
        return this.f79816a;
    }

    public C36743c3(@NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull RecyclerView recyclerView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout2) {
        this.f79816a = kuCoinRefreshLayout;
        this.f79817b = recyclerView;
        this.f79818c = kuCoinRefreshLayout2;
    }
}
