package fj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.home.shortcut.IndicatorView2;

/* JADX INFO: renamed from: fj.u0 */
/* JADX INFO: compiled from: KucoinLayoutHomeFastlinkBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37548u0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f83427a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final IndicatorView2 f83428b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f83429c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37548u0 m84568a(@NonNull View view) {
        int i11 = R$id.page_indicator;
        IndicatorView2 indicatorView2 = (IndicatorView2) ViewBindings.findChildViewById(view, i11);
        if (indicatorView2 != null) {
            i11 = R$id.recycler_view_function;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                return new C37548u0((LinearLayout) view, indicatorView2, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f83427a;
    }

    public C37548u0(@NonNull LinearLayout linearLayout, @NonNull IndicatorView2 indicatorView2, @NonNull RecyclerView recyclerView) {
        this.f83427a = linearLayout;
        this.f83428b = indicatorView2;
        this.f83429c = recyclerView;
    }
}
