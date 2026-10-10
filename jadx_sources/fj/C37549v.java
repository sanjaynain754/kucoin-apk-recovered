package fj;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;

/* JADX INFO: renamed from: fj.v */
/* JADX INFO: compiled from: HomeShimmerV2BannerBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class C37549v implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f83430a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f83431b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f83432c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f83433d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37549v m84570a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.f25375v1;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById3 == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.f25376v2))) == null || (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.f25377v3))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C37549v((LinearLayoutCompat) view, viewFindChildViewById3, viewFindChildViewById, viewFindChildViewById2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f83430a;
    }

    public C37549v(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f83430a = linearLayoutCompat;
        this.f83431b = view;
        this.f83432c = view2;
        this.f83433d = view3;
    }
}
