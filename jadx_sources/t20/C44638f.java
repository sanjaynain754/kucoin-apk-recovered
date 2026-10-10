package t20;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: t20.f */
/* JADX INFO: compiled from: BkucoinFragmentMarketCoinInfoBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44638f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RecyclerView f99059a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f99060b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44638f m98753a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C44638f(recyclerView, recyclerView);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f99059a;
    }

    public C44638f(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f99059a = recyclerView;
        this.f99060b = recyclerView2;
    }
}
