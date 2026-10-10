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

/* JADX INFO: renamed from: fj.t */
/* JADX INFO: compiled from: HomeShimmerRecommendpositionBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37545t implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f83413a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f83414b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SkeletonLayout f83415c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37545t m84559a(@NonNull View view) {
        int i11 = R$id.icon;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            i11 = R$id.f25375v1;
            SkeletonLayout skeletonLayout = (SkeletonLayout) ViewBindings.findChildViewById(view, i11);
            if (skeletonLayout != null) {
                return new C37545t((LinearLayoutCompat) view, viewFindChildViewById, skeletonLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37545t m84560c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.home_shimmer_recommendposition, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84559a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f83413a;
    }

    public C37545t(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull SkeletonLayout skeletonLayout) {
        this.f83413a = linearLayoutCompat;
        this.f83414b = view;
        this.f83415c = skeletonLayout;
    }
}
