package p206dp;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: dp.y */
/* JADX INFO: compiled from: BmarginFragmentMarketCoinInfoBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36949y implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RecyclerView f82058a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f82059b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36949y m82767a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C36949y(recyclerView, recyclerView);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f82058a;
    }

    public C36949y(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f82058a = recyclerView;
        this.f82059b = recyclerView2;
    }
}
