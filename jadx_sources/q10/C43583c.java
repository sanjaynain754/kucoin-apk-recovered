package q10;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.search.R$id;
import com.kubi.search.widget.TouchableView;

/* JADX INFO: renamed from: q10.c */
/* JADX INFO: compiled from: SearchFragmentInitialBinding.java */
/* JADX INFO: loaded from: classes44.dex */
public final class C43583c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f96185a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C43588h f96186b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FragmentContainerView f96187c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FragmentContainerView f96188d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FragmentContainerView f96189e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TouchableView f96190f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final C43589i f96191g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43583c m95916a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.emptyBinding;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 != null) {
            C43588h c43588hM95926a = C43588h.m95926a(viewFindChildViewById2);
            i11 = R$id.fHistory;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
            if (fragmentContainerView != null) {
                i11 = R$id.fRecommend;
                FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
                if (fragmentContainerView2 != null) {
                    i11 = R$id.fTopSearch;
                    FragmentContainerView fragmentContainerView3 = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
                    if (fragmentContainerView3 != null) {
                        i11 = R$id.layoutContent;
                        TouchableView touchableView = (TouchableView) ViewBindings.findChildViewById(view, i11);
                        if (touchableView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.loadingBinding))) != null) {
                            return new C43583c((FrameLayout) view, c43588hM95926a, fragmentContainerView, fragmentContainerView2, fragmentContainerView3, touchableView, C43589i.m95928a(viewFindChildViewById));
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
    public FrameLayout getRoot() {
        return this.f96185a;
    }

    public C43583c(@NonNull FrameLayout frameLayout, @NonNull C43588h c43588h, @NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2, @NonNull FragmentContainerView fragmentContainerView3, @NonNull TouchableView touchableView, @NonNull C43589i c43589i) {
        this.f96185a = frameLayout;
        this.f96186b = c43588h;
        this.f96187c = fragmentContainerView;
        this.f96188d = fragmentContainerView2;
        this.f96189e = fragmentContainerView3;
        this.f96190f = touchableView;
        this.f96191g = c43589i;
    }
}
