package k00;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: k00.j */
/* JADX INFO: compiled from: KucoinViewRecyclerviewBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40846j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RecyclerView f90770a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f90771b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40846j m89391a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C40846j(recyclerView, recyclerView);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f90770a;
    }

    public C40846j(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f90770a = recyclerView;
        this.f90771b = recyclerView2;
    }
}
