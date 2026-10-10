package fj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.kubi.home.R$layout;

/* JADX INFO: renamed from: fj.s */
/* JADX INFO: compiled from: HomeShimmerRanklistBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37543s implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RecyclerView f83406a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f83407b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37543s m84554a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C37543s(recyclerView, recyclerView);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37543s m84555c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.home_shimmer_ranklist, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84554a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f83406a;
    }

    public C37543s(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f83406a = recyclerView;
        this.f83407b = recyclerView2;
    }
}
