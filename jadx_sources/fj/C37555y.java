package fj;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;

/* JADX INFO: renamed from: fj.y */
/* JADX INFO: compiled from: HomeShimmerWidgetGridBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37555y implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f83494a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f83495b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f83496c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f83497d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f83498e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f83499f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f83500g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f83501h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f83502i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37555y m84583a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        View viewFindChildViewById5;
        View viewFindChildViewById6;
        View viewFindChildViewById7;
        int i11 = R$id.f25375v1;
        View viewFindChildViewById8 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById8 == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.v11))) == null || (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.f25376v2))) == null || (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.v22))) == null || (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i11 = R$id.f25377v3))) == null || (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i11 = R$id.v33))) == null || (viewFindChildViewById6 = ViewBindings.findChildViewById(view, (i11 = R$id.f25378v4))) == null || (viewFindChildViewById7 = ViewBindings.findChildViewById(view, (i11 = R$id.v44))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C37555y((LinearLayoutCompat) view, viewFindChildViewById8, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f83494a;
    }

    public C37555y(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @NonNull View view6, @NonNull View view7, @NonNull View view8) {
        this.f83494a = linearLayoutCompat;
        this.f83495b = view;
        this.f83496c = view2;
        this.f83497d = view3;
        this.f83498e = view4;
        this.f83499f = view5;
        this.f83500g = view6;
        this.f83501h = view7;
        this.f83502i = view8;
    }
}
