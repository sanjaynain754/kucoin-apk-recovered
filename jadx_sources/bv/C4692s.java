package bv;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.kubi.quotefacade.R$id;

/* JADX INFO: renamed from: bv.s */
/* JADX INFO: compiled from: FragmentFutureMarketBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4692s implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f4523a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f4524b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C4673i0 f4525c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ViewPager2 f4526d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ViewStub f4527e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4692s m4696a(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.future_tab;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C4673i0 c4673i0M4658a = C4673i0.m4658a(viewFindChildViewById);
            i11 = R$id.viewPager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i11);
            if (viewPager2 != null) {
                i11 = R$id.viewStub;
                ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i11);
                if (viewStub != null) {
                    return new C4692s(linearLayout, linearLayout, c4673i0M4658a, viewPager2, viewStub);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f4523a;
    }

    public C4692s(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull C4673i0 c4673i0, @NonNull ViewPager2 viewPager2, @NonNull ViewStub viewStub) {
        this.f4523a = linearLayout;
        this.f4524b = linearLayout2;
        this.f4525c = c4673i0;
        this.f4526d = viewPager2;
        this.f4527e = viewStub;
    }
}
