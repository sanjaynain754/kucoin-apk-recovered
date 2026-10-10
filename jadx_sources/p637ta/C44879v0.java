package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.kucoin.view.IndexBar;

/* JADX INFO: renamed from: ta.v0 */
/* JADX INFO: compiled from: AssetFragmentSearchCoinBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44879v0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100983a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f100984b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C44779h2 f100985c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final IndexBar f100986d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44879v0 m99282a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.coin_list_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.layout_search_coin))) != null) {
            C44779h2 c44779h2M99075a = C44779h2.m99075a(viewFindChildViewById);
            int i12 = R$id.side_bar;
            IndexBar indexBar = (IndexBar) ViewBindings.findChildViewById(view, i12);
            if (indexBar != null) {
                return new C44879v0((ConstraintLayout) view, recyclerView, c44779h2M99075a, indexBar);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f100983a;
    }

    public C44879v0(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull C44779h2 c44779h2, @NonNull IndexBar indexBar) {
        this.f100983a = constraintLayout;
        this.f100984b = recyclerView;
        this.f100985c = c44779h2;
        this.f100986d = indexBar;
    }
}
