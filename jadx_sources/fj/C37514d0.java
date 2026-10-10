package fj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;

/* JADX INFO: renamed from: fj.d0 */
/* JADX INFO: compiled from: KucoinFragmentCardsSettingBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37514d0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f83233a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f83234b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37514d0 m84487a(@NonNull View view) {
        int i11 = R$id.card_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            return new C37514d0((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f83233a;
    }

    public C37514d0(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView) {
        this.f83233a = linearLayout;
        this.f83234b = recyclerView;
    }
}
