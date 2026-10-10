package k00;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;

/* JADX INFO: renamed from: k00.o */
/* JADX INFO: compiled from: ViewShimmerHomeCardFullBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40851o implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f90796a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f90797b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f90798c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f90799d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f90800e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f90801f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f90802g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f90803h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f90804i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final View f90805j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40851o m89400a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        View viewFindChildViewById5;
        View viewFindChildViewById6;
        View viewFindChildViewById7;
        View viewFindChildViewById8;
        int i11 = R$id.f47633v1;
        View viewFindChildViewById9 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById9 == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.f47634v2))) == null || (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.f47635v3))) == null || (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.f47636v4))) == null || (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i11 = R$id.f47637v5))) == null || (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i11 = R$id.f47638v6))) == null || (viewFindChildViewById6 = ViewBindings.findChildViewById(view, (i11 = R$id.f47639v7))) == null || (viewFindChildViewById7 = ViewBindings.findChildViewById(view, (i11 = R$id.f47640v8))) == null || (viewFindChildViewById8 = ViewBindings.findChildViewById(view, (i11 = R$id.f47641v9))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C40851o((LinearLayoutCompat) view, viewFindChildViewById9, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7, viewFindChildViewById8);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C40851o m89401c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.view_shimmer_home_card_full, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m89400a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f90796a;
    }

    public C40851o(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @NonNull View view6, @NonNull View view7, @NonNull View view8, @NonNull View view9) {
        this.f90796a = linearLayoutCompat;
        this.f90797b = view;
        this.f90798c = view2;
        this.f90799d = view3;
        this.f90800e = view4;
        this.f90801f = view5;
        this.f90802g = view6;
        this.f90803h = view7;
        this.f90804i = view8;
        this.f90805j = view9;
    }
}
