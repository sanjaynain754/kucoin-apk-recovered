package k00;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.res.R$id;

/* JADX INFO: renamed from: k00.a */
/* JADX INFO: compiled from: CommonLayoutTradepairNameBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40837a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f90720a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f90721b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f90722c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f90723d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40837a m89370a(@NonNull View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        int i11 = R$id.tvCurrencyBase;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tvCurrencyQuote;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                return new C40837a(linearLayoutCompat, linearLayoutCompat, baseTextView, baseTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f90720a;
    }

    public C40837a(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f90720a = linearLayoutCompat;
        this.f90721b = linearLayoutCompat2;
        this.f90722c = baseTextView;
        this.f90723d = baseTextView2;
    }
}
