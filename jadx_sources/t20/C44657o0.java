package t20;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.o0 */
/* JADX INFO: compiled from: KucoinLayoutRecyclerBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44657o0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99272a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f99273b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f99274c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44657o0 m98790a(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            return new C44657o0(linearLayout, linearLayout, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f99272a;
    }

    public C44657o0(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView) {
        this.f99272a = linearLayout;
        this.f99273b = linearLayout2;
        this.f99274c = recyclerView;
    }
}
