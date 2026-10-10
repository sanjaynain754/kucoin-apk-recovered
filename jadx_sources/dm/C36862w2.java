package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;

/* JADX INFO: renamed from: dm.w2 */
/* JADX INFO: compiled from: BkumexFragmentMockBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36862w2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f81280a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SwitchCompat f81281b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36862w2 m82589a(@NonNull View view) {
        int i11 = R$id.interceptMarkPrice;
        SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view, i11);
        if (switchCompat != null) {
            return new C36862w2((LinearLayoutCompat) view, switchCompat);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f81280a;
    }

    public C36862w2(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull SwitchCompat switchCompat) {
        this.f81280a = linearLayoutCompat;
        this.f81281b = switchCompat;
    }
}
