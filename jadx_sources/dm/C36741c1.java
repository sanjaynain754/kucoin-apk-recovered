package dm;

import android.view.View;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.c1 */
/* JADX INFO: compiled from: BkumexDialogSelectShareDisplayInfoBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36741c1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f79801a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f79802b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCheckBox f79803c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KuCheckBox f79804d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final C36785j3 f79805e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final Space f79806f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcPrimaryButton f79807g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36741c1 m82333a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.bottom_sheet;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
        if (linearLayoutCompat != null) {
            i11 = R$id.cb_pnl;
            KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
            if (kuCheckBox != null) {
                i11 = R$id.cb_userInfo;
                KuCheckBox kuCheckBox2 = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
                if (kuCheckBox2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.shareInclude))) != null) {
                    C36785j3 c36785j3M82428a = C36785j3.m82428a(viewFindChildViewById);
                    i11 = R$id.space;
                    Space space = (Space) ViewBindings.findChildViewById(view, i11);
                    if (space != null) {
                        i11 = R$id.tv_ok;
                        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                        if (kcPrimaryButton != null) {
                            return new C36741c1((LinearLayoutCompat) view, linearLayoutCompat, kuCheckBox, kuCheckBox2, c36785j3M82428a, space, kcPrimaryButton);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f79801a;
    }

    public C36741c1(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull KuCheckBox kuCheckBox, @NonNull KuCheckBox kuCheckBox2, @NonNull C36785j3 c36785j3, @NonNull Space space, @NonNull KcPrimaryButton kcPrimaryButton) {
        this.f79801a = linearLayoutCompat;
        this.f79802b = linearLayoutCompat2;
        this.f79803c = kuCheckBox;
        this.f79804d = kuCheckBox2;
        this.f79805e = c36785j3;
        this.f79806f = space;
        this.f79807g = kcPrimaryButton;
    }
}
