package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: dm.a3 */
/* JADX INFO: compiled from: BkumexFragmentPositionBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36731a3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RecyclerView f79694a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f79695b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36731a3 m82312a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C36731a3(recyclerView, recyclerView);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f79694a;
    }

    public C36731a3(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f79694a = recyclerView;
        this.f79695b = recyclerView2;
    }
}
