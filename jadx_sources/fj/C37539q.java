package fj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;

/* JADX INFO: renamed from: fj.q */
/* JADX INFO: compiled from: HomeShimmerNavigationBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37539q implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f83394a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f83395b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f83396c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37539q m84544a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.icon;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.f25375v1))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C37539q((LinearLayoutCompat) view, viewFindChildViewById2, viewFindChildViewById);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37539q m84545c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.home_shimmer_navigation, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84544a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f83394a;
    }

    public C37539q(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull View view2) {
        this.f83394a = linearLayoutCompat;
        this.f83395b = view;
        this.f83396c = view2;
    }
}
