package q10;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.search.R$id;

/* JADX INFO: renamed from: q10.a */
/* JADX INFO: compiled from: SearchActivityBinding.java */
/* JADX INFO: loaded from: classes44.dex */
public final class C43581a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f96175a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FragmentContainerView f96176b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FragmentContainerView f96177c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ClearEditText f96178d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ViewSwitcher f96179e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f96180f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43581a m95912a(@NonNull View view) {
        int i11 = R$id.fragment_container_recent;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
        if (fragmentContainerView != null) {
            i11 = R$id.fragment_container_result;
            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
            if (fragmentContainerView2 != null) {
                i11 = R$id.searchInput;
                ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
                if (clearEditText != null) {
                    i11 = R$id.searchSwitcher;
                    ViewSwitcher viewSwitcher = (ViewSwitcher) ViewBindings.findChildViewById(view, i11);
                    if (viewSwitcher != null) {
                        i11 = R$id.tvCancel;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            return new C43581a((LinearLayout) view, fragmentContainerView, fragmentContainerView2, clearEditText, viewSwitcher, baseTextView);
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
        return this.f96175a;
    }

    public C43581a(@NonNull LinearLayout linearLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2, @NonNull ClearEditText clearEditText, @NonNull ViewSwitcher viewSwitcher, @NonNull BaseTextView baseTextView) {
        this.f96175a = linearLayout;
        this.f96176b = fragmentContainerView;
        this.f96177c = fragmentContainerView2;
        this.f96178d = clearEditText;
        this.f96179e = viewSwitcher;
        this.f96180f = baseTextView;
    }
}
