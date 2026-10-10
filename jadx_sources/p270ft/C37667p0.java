package p270ft;

import android.view.View;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.RadioGroupPlus;

/* JADX INFO: renamed from: ft.p0 */
/* JADX INFO: compiled from: PaymentActivityP2pBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37667p0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84383a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RadioGroupPlus f84384b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RadioButton f84385c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f84386d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FragmentContainerView f84387e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RadioButton f84388f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RadioButton f84389g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RadioButton f84390h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37667p0 m84919a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.bottomBar;
        RadioGroupPlus radioGroupPlus = (RadioGroupPlus) ViewBindings.findChildViewById(view, i11);
        if (radioGroupPlus != null) {
            i11 = R$id.chat;
            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
            if (radioButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider_line))) != null) {
                i11 = R$id.fragmentContainer;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
                if (fragmentContainerView != null) {
                    i11 = R$id.orderHistory;
                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                    if (radioButton2 != null) {
                        i11 = R$id.p2p;
                        RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                        if (radioButton3 != null) {
                            i11 = R$id.profile;
                            RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                            if (radioButton4 != null) {
                                return new C37667p0((ConstraintLayout) view, radioGroupPlus, radioButton, viewFindChildViewById, fragmentContainerView, radioButton2, radioButton3, radioButton4);
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
    public ConstraintLayout getRoot() {
        return this.f84383a;
    }

    public C37667p0(@NonNull ConstraintLayout constraintLayout, @NonNull RadioGroupPlus radioGroupPlus, @NonNull RadioButton radioButton, @NonNull View view, @NonNull FragmentContainerView fragmentContainerView, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4) {
        this.f84383a = constraintLayout;
        this.f84384b = radioGroupPlus;
        this.f84385c = radioButton;
        this.f84386d = view;
        this.f84387e = fragmentContainerView;
        this.f84388f = radioButton2;
        this.f84389g = radioButton3;
        this.f84390h = radioButton4;
    }
}
