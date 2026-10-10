package fj;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: fj.h */
/* JADX INFO: compiled from: HomeFragmentDepositBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37521h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RecyclerView f83308a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f83309b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37521h m84502a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C37521h(recyclerView, recyclerView);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f83308a;
    }

    public C37521h(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f83308a = recyclerView;
        this.f83309b = recyclerView2;
    }
}
