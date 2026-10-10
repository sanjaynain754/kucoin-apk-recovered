package fj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;

/* JADX INFO: renamed from: fj.m */
/* JADX INFO: compiled from: HomeLayoutRealtimeDialogBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37531m implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f83368a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f83369b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37531m m84525a(@NonNull View view) {
        int i11 = R$id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            return new C37531m((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f83368a;
    }

    public C37531m(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView) {
        this.f83368a = linearLayout;
        this.f83369b = recyclerView;
    }
}
