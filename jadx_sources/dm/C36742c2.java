package dm;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;

/* JADX INFO: renamed from: dm.c2 */
/* JADX INFO: compiled from: BkumexFragmentDrawerContractBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36742c2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f79808a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f79809b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ClearEditText f79810c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ViewPager2 f79811d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ViewSwitcher f79812e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final SlidingTabLayout f79813f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FrameLayout f79814g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ViewStub f79815h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36742c2 m82335a(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.drawerInput;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.drawerPager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i11);
            if (viewPager2 != null) {
                i11 = R$id.drawerSwitcher;
                ViewSwitcher viewSwitcher = (ViewSwitcher) ViewBindings.findChildViewById(view, i11);
                if (viewSwitcher != null) {
                    i11 = R$id.drawerTab;
                    SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                    if (slidingTabLayout != null) {
                        i11 = R$id.searchContainer;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                        if (frameLayout != null) {
                            i11 = R$id.viewStub;
                            ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i11);
                            if (viewStub != null) {
                                return new C36742c2(linearLayout, linearLayout, clearEditText, viewPager2, viewSwitcher, slidingTabLayout, frameLayout, viewStub);
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
        return this.f79808a;
    }

    public C36742c2(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ClearEditText clearEditText, @NonNull ViewPager2 viewPager2, @NonNull ViewSwitcher viewSwitcher, @NonNull SlidingTabLayout slidingTabLayout, @NonNull FrameLayout frameLayout, @NonNull ViewStub viewStub) {
        this.f79808a = linearLayout;
        this.f79809b = linearLayout2;
        this.f79810c = clearEditText;
        this.f79811d = viewPager2;
        this.f79812e = viewSwitcher;
        this.f79813f = slidingTabLayout;
        this.f79814g = frameLayout;
        this.f79815h = viewStub;
    }
}
