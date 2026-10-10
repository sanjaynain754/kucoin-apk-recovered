package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.n0 */
/* JADX INFO: compiled from: AssetFragmentConvertBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44823n0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100475a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f100476b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FragmentContainerView f100477c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44823n0 m99171a(@NonNull View view) {
        int i11 = R$id.accountType;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.childFragmentContainer;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
            if (fragmentContainerView != null) {
                return new C44823n0((LinearLayout) view, baseTextView, fragmentContainerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f100475a;
    }

    public C44823n0(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull FragmentContainerView fragmentContainerView) {
        this.f100475a = linearLayout;
        this.f100476b = baseTextView;
        this.f100477c = fragmentContainerView;
    }
}
