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

/* JADX INFO: renamed from: k00.q */
/* JADX INFO: compiled from: ViewShimmerHomeCardMiddleBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40853q implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f90810a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f90811b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f90812c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40853q m89406a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.f47633v1;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.f47634v2))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C40853q((LinearLayoutCompat) view, viewFindChildViewById2, viewFindChildViewById);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C40853q m89407c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.view_shimmer_home_card_middle, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m89406a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f90810a;
    }

    public C40853q(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull View view2) {
        this.f90810a = linearLayoutCompat;
        this.f90811b = view;
        this.f90812c = view2;
    }
}
