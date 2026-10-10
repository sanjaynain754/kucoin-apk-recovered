package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;

/* JADX INFO: renamed from: ta.n */
/* JADX INFO: compiled from: AssetDepositSelectAccountDialogBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44822n implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100473a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f100474b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44822n m99169a(@NonNull View view) {
        int i11 = R$id.recycleView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            return new C44822n((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f100473a;
    }

    public C44822n(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView) {
        this.f100473a = linearLayout;
        this.f100474b = recyclerView;
    }
}
