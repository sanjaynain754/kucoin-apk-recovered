package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;

/* JADX INFO: renamed from: ta.z5 */
/* JADX INFO: compiled from: ViewFinanceEmptyBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44912z5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f101274a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f101275b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44912z5 m99348a(@NonNull View view) {
        int i11 = R$id.llRoot;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            return new C44912z5((LinearLayoutCompat) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f101274a;
    }

    public C44912z5(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayout linearLayout) {
        this.f101274a = linearLayoutCompat;
        this.f101275b = linearLayout;
    }
}
