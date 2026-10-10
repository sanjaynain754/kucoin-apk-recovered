package fj;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;

/* JADX INFO: renamed from: fj.x */
/* JADX INFO: compiled from: HomeShimmerV2RankinglistBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class C37553x implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f83485a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f83486b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f83487c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f83488d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f83489e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37553x m84579a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i11 = R$id.f25375v1;
        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById4 == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.f25376v2))) == null || (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.f25377v3))) == null || (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.f25378v4))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C37553x((LinearLayoutCompat) view, viewFindChildViewById4, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f83485a;
    }

    public C37553x(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4) {
        this.f83485a = linearLayoutCompat;
        this.f83486b = view;
        this.f83487c = view2;
        this.f83488d = view3;
        this.f83489e = view4;
    }
}
