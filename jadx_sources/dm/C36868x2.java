package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.kubi.kumex.R$layout;

/* JADX INFO: renamed from: dm.x2 */
/* JADX INFO: compiled from: BkumexFragmentOrderBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36868x2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RecyclerView f81324a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f81325b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36868x2 m82602a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C36868x2(recyclerView, recyclerView);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C36868x2 m82603c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_fragment_order, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82602a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f81324a;
    }

    public C36868x2(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f81324a = recyclerView;
        this.f81325b = recyclerView2;
    }
}
