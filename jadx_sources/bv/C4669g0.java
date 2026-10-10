package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.ScrollTabIndicatorView;

/* JADX INFO: renamed from: bv.g0 */
/* JADX INFO: compiled from: QuoteFragmentTradeChanceBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4669g0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f4347a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f4348b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ScrollTabIndicatorView f4349c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4669g0 m4650a(@NonNull View view) {
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.scrollTabIndicator;
            ScrollTabIndicatorView scrollTabIndicatorView = (ScrollTabIndicatorView) ViewBindings.findChildViewById(view, i11);
            if (scrollTabIndicatorView != null) {
                return new C4669g0((LinearLayoutCompat) view, recyclerView, scrollTabIndicatorView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f4347a;
    }

    public C4669g0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView, @NonNull ScrollTabIndicatorView scrollTabIndicatorView) {
        this.f4347a = linearLayoutCompat;
        this.f4348b = recyclerView;
        this.f4349c = scrollTabIndicatorView;
    }
}
