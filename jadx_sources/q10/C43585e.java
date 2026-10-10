package q10;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.search.R$id;

/* JADX INFO: renamed from: q10.e */
/* JADX INFO: compiled from: SearchFragmentResultBinding.java */
/* JADX INFO: loaded from: classes44.dex */
public final class C43585e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f96199a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C43588h f96200b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f96201c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C43589i f96202d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RtlViewPager f96203e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final SlidingTabLayout f96204f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43585e m95920a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.emptyBinding;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 != null) {
            C43588h c43588hM95926a = C43588h.m95926a(viewFindChildViewById2);
            i11 = R$id.layoutContent;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.loadingBinding))) != null) {
                C43589i c43589iM95928a = C43589i.m95928a(viewFindChildViewById);
                i11 = R$id.searchPager;
                RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
                if (rtlViewPager != null) {
                    i11 = R$id.searchTab;
                    SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                    if (slidingTabLayout != null) {
                        return new C43585e((FrameLayout) view, c43588hM95926a, linearLayoutCompat, c43589iM95928a, rtlViewPager, slidingTabLayout);
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
        return this.f96199a;
    }

    public C43585e(@NonNull FrameLayout frameLayout, @NonNull C43588h c43588h, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull C43589i c43589i, @NonNull RtlViewPager rtlViewPager, @NonNull SlidingTabLayout slidingTabLayout) {
        this.f96199a = frameLayout;
        this.f96200b = c43588h;
        this.f96201c = linearLayoutCompat;
        this.f96202d = c43589i;
        this.f96203e = rtlViewPager;
        this.f96204f = slidingTabLayout;
    }
}
