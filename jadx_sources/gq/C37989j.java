package gq;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mine.R$id;
import com.kubi.resources.widget.KcSwitchButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: gq.j */
/* JADX INFO: compiled from: KucoinFragmentBeepBinding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37989j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f85484a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcSecondaryButton f85485b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RelativeLayout f85486c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcSwitchButton f85487d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcSwitchButton f85488e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcSwitchButton f85489f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcSwitchButton f85490g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KcSwitchButton f85491h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KcSwitchButton f85492i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final KcSwitchButton f85493j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37989j m85853a(@NonNull View view) {
        int i11 = R$id.btnCloseAll;
        KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcSecondaryButton != null) {
            i11 = R$id.rl_switch_p2p;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
            if (relativeLayout != null) {
                i11 = R$id.switch_bottom_vibrate;
                KcSwitchButton kcSwitchButton = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
                if (kcSwitchButton != null) {
                    i11 = R$id.switch_in;
                    KcSwitchButton kcSwitchButton2 = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
                    if (kcSwitchButton2 != null) {
                        i11 = R$id.switch_login;
                        KcSwitchButton kcSwitchButton3 = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
                        if (kcSwitchButton3 != null) {
                            i11 = R$id.switch_out;
                            KcSwitchButton kcSwitchButton4 = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
                            if (kcSwitchButton4 != null) {
                                i11 = R$id.switch_p2p;
                                KcSwitchButton kcSwitchButton5 = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
                                if (kcSwitchButton5 != null) {
                                    i11 = R$id.switch_revoke;
                                    KcSwitchButton kcSwitchButton6 = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
                                    if (kcSwitchButton6 != null) {
                                        i11 = R$id.switch_transfer;
                                        KcSwitchButton kcSwitchButton7 = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
                                        if (kcSwitchButton7 != null) {
                                            return new C37989j((LinearLayout) view, kcSecondaryButton, relativeLayout, kcSwitchButton, kcSwitchButton2, kcSwitchButton3, kcSwitchButton4, kcSwitchButton5, kcSwitchButton6, kcSwitchButton7);
                                        }
                                    }
                                }
                            }
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
    public LinearLayout getRoot() {
        return this.f85484a;
    }

    public C37989j(@NonNull LinearLayout linearLayout, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull RelativeLayout relativeLayout, @NonNull KcSwitchButton kcSwitchButton, @NonNull KcSwitchButton kcSwitchButton2, @NonNull KcSwitchButton kcSwitchButton3, @NonNull KcSwitchButton kcSwitchButton4, @NonNull KcSwitchButton kcSwitchButton5, @NonNull KcSwitchButton kcSwitchButton6, @NonNull KcSwitchButton kcSwitchButton7) {
        this.f85484a = linearLayout;
        this.f85485b = kcSecondaryButton;
        this.f85486c = relativeLayout;
        this.f85487d = kcSwitchButton;
        this.f85488e = kcSwitchButton2;
        this.f85489f = kcSwitchButton3;
        this.f85490g = kcSwitchButton4;
        this.f85491h = kcSwitchButton5;
        this.f85492i = kcSwitchButton6;
        this.f85493j = kcSwitchButton7;
    }
}
