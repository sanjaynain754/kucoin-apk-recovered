package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;

/* JADX INFO: renamed from: ta.q4 */
/* JADX INFO: compiled from: KucoinFragmentGhostExchangeDetailBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44848q4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100694a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f100695b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44848q4 m99221a(@NonNull View view) {
        int i11 = R$id.view_exchange_detail;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            return new C44848q4((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f100694a;
    }

    public C44848q4(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView) {
        this.f100694a = linearLayout;
        this.f100695b = recyclerView;
    }
}
