package k00;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.sdk.res.R$id;

/* JADX INFO: renamed from: k00.t */
/* JADX INFO: compiled from: ViewUpDownCompareIndicatorBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40856t implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f90820a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f90821b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f90822c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f90823d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f90824e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40856t m89413a(@NonNull View view) {
        int i11 = R$id.ivLeft;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.ivMiddle;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView2 != null) {
                i11 = R$id.ivRight;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView3 != null) {
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                    return new C40856t(linearLayoutCompat, appCompatImageView, appCompatImageView2, appCompatImageView3, linearLayoutCompat);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f90820a;
    }

    public C40856t(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull LinearLayoutCompat linearLayoutCompat2) {
        this.f90820a = linearLayoutCompat;
        this.f90821b = appCompatImageView;
        this.f90822c = appCompatImageView2;
        this.f90823d = appCompatImageView3;
        this.f90824e = linearLayoutCompat2;
    }
}
