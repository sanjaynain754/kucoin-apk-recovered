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
import com.kubi.resources.shimmer.SkeletonLayout;

/* JADX INFO: renamed from: fj.r */
/* JADX INFO: compiled from: HomeShimmerNewcoinrecommendBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37541r implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f83398a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f83399b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SkeletonLayout f83400c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final SkeletonLayout f83401d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final SkeletonLayout f83402e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final SkeletonLayout f83403f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37541r m84549a(@NonNull View view) {
        int i11 = R$id.icon;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            i11 = R$id.f25375v1;
            SkeletonLayout skeletonLayout = (SkeletonLayout) ViewBindings.findChildViewById(view, i11);
            if (skeletonLayout != null) {
                i11 = R$id.f25376v2;
                SkeletonLayout skeletonLayout2 = (SkeletonLayout) ViewBindings.findChildViewById(view, i11);
                if (skeletonLayout2 != null) {
                    i11 = R$id.f25377v3;
                    SkeletonLayout skeletonLayout3 = (SkeletonLayout) ViewBindings.findChildViewById(view, i11);
                    if (skeletonLayout3 != null) {
                        i11 = R$id.f25378v4;
                        SkeletonLayout skeletonLayout4 = (SkeletonLayout) ViewBindings.findChildViewById(view, i11);
                        if (skeletonLayout4 != null) {
                            return new C37541r((LinearLayoutCompat) view, viewFindChildViewById, skeletonLayout, skeletonLayout2, skeletonLayout3, skeletonLayout4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37541r m84550c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.home_shimmer_newcoinrecommend, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84549a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f83398a;
    }

    public C37541r(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull SkeletonLayout skeletonLayout, @NonNull SkeletonLayout skeletonLayout2, @NonNull SkeletonLayout skeletonLayout3, @NonNull SkeletonLayout skeletonLayout4) {
        this.f83398a = linearLayoutCompat;
        this.f83399b = view;
        this.f83400c = skeletonLayout;
        this.f83401d = skeletonLayout2;
        this.f83402e = skeletonLayout3;
        this.f83403f = skeletonLayout4;
    }
}
