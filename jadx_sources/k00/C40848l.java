package k00;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.res.R$id;

/* JADX INFO: renamed from: k00.l */
/* JADX INFO: compiled from: LayoutSearchBarBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40848l implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f90780a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f90781b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f90782c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f90783d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40848l m89395a(@NonNull View view) {
        int i11 = R$id.ivQrScan;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
            int i12 = R$id.tvSearch;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i12);
            if (baseTextView != null) {
                return new C40848l(linearLayoutCompat, imageView, linearLayoutCompat, baseTextView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f90780a;
    }

    public C40848l(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull BaseTextView baseTextView) {
        this.f90780a = linearLayoutCompat;
        this.f90781b = imageView;
        this.f90782c = linearLayoutCompat2;
        this.f90783d = baseTextView;
    }
}
