package q10;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: q10.f */
/* JADX INFO: compiled from: SearchFragmentResultDatalistBinding.java */
/* JADX INFO: loaded from: classes44.dex */
public final class C43586f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RecyclerView f96205a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f96206b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43586f m95922a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C43586f(recyclerView, recyclerView);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f96205a;
    }

    public C43586f(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f96205a = recyclerView;
        this.f96206b = recyclerView2;
    }
}
