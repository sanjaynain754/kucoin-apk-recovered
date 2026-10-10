package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: dm.s2 */
/* JADX INFO: compiled from: BkumexFragmentMarketCoinInfoBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36838s2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RecyclerView f81035a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f81036b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36838s2 m82540a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C36838s2(recyclerView, recyclerView);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f81035a;
    }

    public C36838s2(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f81035a = recyclerView;
        this.f81036b = recyclerView2;
    }
}
