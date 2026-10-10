package p610rz;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.sdk.mode.R$id;
import com.kubi.sdk.mode.widget.SwitchLayout;

/* JADX INFO: renamed from: rz.a */
/* JADX INFO: compiled from: HomeMaskBinding.java */
/* JADX INFO: loaded from: classes41.dex */
public final class C44200a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f97540a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f97541b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f97542c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final SwitchLayout f97543d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44200a m97422a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.backView;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.fakeStatusBar))) != null) {
            i11 = R$id.switchLayout;
            SwitchLayout switchLayout = (SwitchLayout) ViewBindings.findChildViewById(view, i11);
            if (switchLayout != null) {
                return new C44200a((FrameLayout) view, constraintLayout, viewFindChildViewById, switchLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f97540a;
    }

    public C44200a(@NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull SwitchLayout switchLayout) {
        this.f97540a = frameLayout;
        this.f97541b = constraintLayout;
        this.f97542c = view;
        this.f97543d = switchLayout;
    }
}
