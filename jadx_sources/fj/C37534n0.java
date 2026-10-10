package fj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.home.shortcut.IndicatorView2;

/* JADX INFO: renamed from: fj.n0 */
/* JADX INFO: compiled from: KucoinItemHomeTradeBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37534n0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f83376a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f83377b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final IndicatorView2 f83378c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f83379d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37534n0 m84532a(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.page_indicator;
        IndicatorView2 indicatorView2 = (IndicatorView2) ViewBindings.findChildViewById(view, i11);
        if (indicatorView2 != null) {
            i11 = R$id.trade_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                return new C37534n0(linearLayout, linearLayout, indicatorView2, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f83376a;
    }

    public C37534n0(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull IndicatorView2 indicatorView2, @NonNull RecyclerView recyclerView) {
        this.f83376a = linearLayout;
        this.f83377b = linearLayout2;
        this.f83378c = indicatorView2;
        this.f83379d = recyclerView;
    }
}
