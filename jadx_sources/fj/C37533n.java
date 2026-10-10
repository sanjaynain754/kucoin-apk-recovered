package fj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;

/* JADX INFO: renamed from: fj.n */
/* JADX INFO: compiled from: HomeShimmerHotsymbolBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37533n implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f83372a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f83373b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f83374c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f83375d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37533n m84529a(@NonNull View view) {
        int i11 = R$id.layout1;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
        if (linearLayoutCompat != null) {
            i11 = R$id.layout2;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat2 != null) {
                i11 = R$id.layout3;
                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat3 != null) {
                    return new C37533n((FrameLayout) view, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37533n m84530c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.home_shimmer_hotsymbol, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84529a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f83372a;
    }

    public C37533n(@NonNull FrameLayout frameLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3) {
        this.f83372a = frameLayout;
        this.f83373b = linearLayoutCompat;
        this.f83374c = linearLayoutCompat2;
        this.f83375d = linearLayoutCompat3;
    }
}
