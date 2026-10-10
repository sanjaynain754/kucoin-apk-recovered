package c70;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.b0 */
/* JADX INFO: compiled from: BusercenterLayoutExternalAccountEntranceBinding.java */
/* JADX INFO: loaded from: classes23.dex */
public final class C4862b0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f5048a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f5049b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f5050c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4862b0 m5002a(@NonNull View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        int i11 = R$id.llTelegram;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            return new C4862b0(linearLayoutCompat, linearLayoutCompat, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f5048a;
    }

    public C4862b0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayout linearLayout) {
        this.f5048a = linearLayoutCompat;
        this.f5049b = linearLayoutCompat2;
        this.f5050c = linearLayout;
    }
}
