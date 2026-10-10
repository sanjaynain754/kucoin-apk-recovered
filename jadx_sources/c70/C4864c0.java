package c70;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.c0 */
/* JADX INFO: compiled from: BusercenterLayoutLoginExternalAccountEntranceBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4864c0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f5056a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f5057b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f5058c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f5059d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4864c0 m5006a(@NonNull View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        int i11 = R$id.llPasskey;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.llTelegram;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout2 != null) {
                return new C4864c0(linearLayoutCompat, linearLayoutCompat, linearLayout, linearLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f5056a;
    }

    public C4864c0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.f5056a = linearLayoutCompat;
        this.f5057b = linearLayoutCompat2;
        this.f5058c = linearLayout;
        this.f5059d = linearLayout2;
    }
}
