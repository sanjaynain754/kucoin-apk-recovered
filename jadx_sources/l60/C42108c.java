package l60;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: l60.c */
/* JADX INFO: compiled from: FragmentUnifyFundsInfoBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C42108c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RecyclerView f93471a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f93472b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42108c m92371a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C42108c(recyclerView, recyclerView);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f93471a;
    }

    public C42108c(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f93471a = recyclerView;
        this.f93472b = recyclerView2;
    }
}
