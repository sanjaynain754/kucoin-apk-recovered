package fj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.kubi.home.R$layout;

/* JADX INFO: renamed from: fj.o */
/* JADX INFO: compiled from: HomeShimmerMenuBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37535o implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RecyclerView f83380a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f83381b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37535o m84534a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C37535o(recyclerView, recyclerView);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37535o m84535c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.home_shimmer_menu, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84534a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f83380a;
    }

    public C37535o(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f83380a = recyclerView;
        this.f83381b = recyclerView2;
    }
}
