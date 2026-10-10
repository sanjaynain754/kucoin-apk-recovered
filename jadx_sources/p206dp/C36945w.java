package p206dp;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: dp.w */
/* JADX INFO: compiled from: BmarginFragmentMarginPositionBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36945w implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RecyclerView f82021a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f82022b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36945w m82759a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C36945w(recyclerView, recyclerView);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f82021a;
    }

    public C36945w(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f82021a = recyclerView;
        this.f82022b = recyclerView2;
    }
}
