package p532pc;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.copytrading.R$id;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: pc.c */
/* JADX INFO: compiled from: FragmentAssetCopyTradingBinding.java */
/* JADX INFO: loaded from: classes8.dex */
public final class C43434c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KuCoinRefreshLayout f95896a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f95897b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCoinRefreshLayout f95898c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43434c m95629a(@NonNull View view) {
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) view;
        return new C43434c(kuCoinRefreshLayout, recyclerView, kuCoinRefreshLayout);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public KuCoinRefreshLayout getRoot() {
        return this.f95896a;
    }

    public C43434c(@NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull RecyclerView recyclerView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout2) {
        this.f95896a = kuCoinRefreshLayout;
        this.f95897b = recyclerView;
        this.f95898c = kuCoinRefreshLayout2;
    }
}
