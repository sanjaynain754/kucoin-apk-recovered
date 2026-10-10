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

/* JADX INFO: renamed from: k00.p */
/* JADX INFO: compiled from: ViewShimmerHomeCardHalfBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40852p implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f90806a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f90807b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f90808c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f90809d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40852p m89403a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.f47633v1;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById3 == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.f47634v2))) == null || (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.f47635v3))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C40852p((LinearLayoutCompat) view, viewFindChildViewById3, viewFindChildViewById, viewFindChildViewById2);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C40852p m89404c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.view_shimmer_home_card_half, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m89403a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f90806a;
    }

    public C40852p(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f90806a = linearLayoutCompat;
        this.f90807b = view;
        this.f90808c = view2;
        this.f90809d = view3;
    }
}
