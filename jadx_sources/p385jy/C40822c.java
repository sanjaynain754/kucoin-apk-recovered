package p385jy;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.sdk.R$id;

/* JADX INFO: renamed from: jy.c */
/* JADX INFO: compiled from: ViewLoadingBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C40822c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f90683a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f90684b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40822c m89306a(@NonNull View view) {
        int i11 = R$id.iv_loading;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            return new C40822c((LinearLayout) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f90683a;
    }

    public C40822c(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView) {
        this.f90683a = linearLayout;
        this.f90684b = appCompatImageView;
    }
}
