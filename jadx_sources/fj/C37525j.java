package fj;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: fj.j */
/* JADX INFO: compiled from: HomeLayoutFastToggleBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37525j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RecyclerView f83341a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f83342b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37525j m84511a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C37525j(recyclerView, recyclerView);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f83341a;
    }

    public C37525j(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f83341a = recyclerView;
        this.f83342b = recyclerView2;
    }
}
