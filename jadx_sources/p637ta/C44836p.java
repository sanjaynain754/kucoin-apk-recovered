package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;

/* JADX INFO: renamed from: ta.p */
/* JADX INFO: compiled from: AssetDialogAlphaNetworkBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44836p implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100571a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f100572b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44836p m99198a(@NonNull View view) {
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            return new C44836p((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f100571a;
    }

    public C44836p(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView) {
        this.f100571a = linearLayout;
        this.f100572b = recyclerView;
    }
}
