package gq;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: gq.r */
/* JADX INFO: compiled from: KucoinMineViewRecyclerviewBinding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37997r implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RecyclerView f85591a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f85592b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37997r m85869a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C37997r(recyclerView, recyclerView);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f85591a;
    }

    public C37997r(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f85591a = recyclerView;
        this.f85592b = recyclerView2;
    }
}
