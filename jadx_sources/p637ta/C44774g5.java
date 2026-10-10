package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.ClearEditText;

/* JADX INFO: renamed from: ta.g5 */
/* JADX INFO: compiled from: KucoinViewCommonSearchBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44774g5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99994a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f99995b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f99996c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44774g5 m99064a(@NonNull View view) {
        int i11 = R$id.et_search;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new C44774g5(linearLayout, clearEditText, linearLayout);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f99994a;
    }

    public C44774g5(@NonNull LinearLayout linearLayout, @NonNull ClearEditText clearEditText, @NonNull LinearLayout linearLayout2) {
        this.f99994a = linearLayout;
        this.f99995b = clearEditText;
        this.f99996c = linearLayout2;
    }
}
