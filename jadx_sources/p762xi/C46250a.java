package p762xi;

import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.helpcenter.R$id;

/* JADX INFO: renamed from: xi.a */
/* JADX INFO: compiled from: FragmentChatToOrderBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C46250a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f103814a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Button f103815b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C46250a m102005a(@NonNull View view) {
        int i11 = R$id.btn_enter_order;
        Button button = (Button) ViewBindings.findChildViewById(view, i11);
        if (button != null) {
            return new C46250a((ConstraintLayout) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f103814a;
    }

    public C46250a(@NonNull ConstraintLayout constraintLayout, @NonNull Button button) {
        this.f103814a = constraintLayout;
        this.f103815b = button;
    }
}
