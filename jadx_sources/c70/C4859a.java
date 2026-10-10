package c70;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.a */
/* JADX INFO: compiled from: BusercenterActivityExternalAccountCreateBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4859a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f5034a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FragmentContainerView f5035b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final NavigationBar f5036c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4859a m4996a(@NonNull View view) {
        int i11 = R$id.layoutContainer;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
        if (fragmentContainerView != null) {
            i11 = R$id.navigationBar;
            NavigationBar navigationBar = (NavigationBar) ViewBindings.findChildViewById(view, i11);
            if (navigationBar != null) {
                return new C4859a((LinearLayout) view, fragmentContainerView, navigationBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f5034a;
    }

    public C4859a(@NonNull LinearLayout linearLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull NavigationBar navigationBar) {
        this.f5034a = linearLayout;
        this.f5035b = fragmentContainerView;
        this.f5036c = navigationBar;
    }
}
