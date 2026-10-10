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

/* JADX INFO: renamed from: fj.u */
/* JADX INFO: compiled from: HomeShimmerThreegripBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37547u implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f83420a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f83421b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f83422c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f83423d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f83424e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f83425f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f83426g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37547u m84565a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        View viewFindChildViewById5;
        int i11 = R$id.f25375v1;
        View viewFindChildViewById6 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById6 == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.f25376v2))) == null || (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.f25377v3))) == null || (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.f25378v4))) == null || (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i11 = R$id.f25379v5))) == null || (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i11 = R$id.f25380v6))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C37547u((LinearLayoutCompat) view, viewFindChildViewById6, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37547u m84566c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.home_shimmer_threegrip, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84565a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f83420a;
    }

    public C37547u(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @NonNull View view6) {
        this.f83420a = linearLayoutCompat;
        this.f83421b = view;
        this.f83422c = view2;
        this.f83423d = view3;
        this.f83424e = view4;
        this.f83425f = view5;
        this.f83426g = view6;
    }
}
