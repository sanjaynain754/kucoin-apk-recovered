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

/* JADX INFO: renamed from: fj.p */
/* JADX INFO: compiled from: HomeShimmerMessageboxBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37537p implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f83383a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f83384b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f83385c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f83386d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37537p m84539a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.f25375v1;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById3 == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.f25376v2))) == null || (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.f25377v3))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C37537p((LinearLayoutCompat) view, viewFindChildViewById3, viewFindChildViewById, viewFindChildViewById2);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37537p m84540c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.home_shimmer_messagebox, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84539a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f83383a;
    }

    public C37537p(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f83383a = linearLayoutCompat;
        this.f83384b = view;
        this.f83385c = view2;
        this.f83386d = view3;
    }
}
