package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;

/* JADX INFO: renamed from: ta.o2 */
/* JADX INFO: compiled from: AssetViewLoadingBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44832o2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100538a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f100539b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44832o2 m99190a(@NonNull View view) {
        int i11 = R$id.iv_loading;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            return new C44832o2((LinearLayout) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f100538a;
    }

    public C44832o2(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView) {
        this.f100538a = linearLayout;
        this.f100539b = appCompatImageView;
    }
}
