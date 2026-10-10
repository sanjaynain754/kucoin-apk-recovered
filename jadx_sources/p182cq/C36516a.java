package p182cq;

import android.view.View;
import android.widget.ViewSwitcher;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.kubi.mart.R$id;
import com.kubi.mart.sidebar.spot.search.SpotSidebarSearchLayout;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;

/* JADX INFO: renamed from: cq.a */
/* JADX INFO: compiled from: MartFragmentSpotSidebarBinding.java */
/* JADX INFO: loaded from: classes28.dex */
public final class C36516a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f79345a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f79346b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SlidingTabLayout f79347c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final SpotSidebarSearchLayout f79348d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ViewPager2 f79349e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ViewSwitcher f79350f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36516a m81761a(@NonNull View view) {
        int i11 = R$id.etSearch;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.menuTabLayout;
            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
            if (slidingTabLayout != null) {
                i11 = R$id.searchLayout;
                SpotSidebarSearchLayout spotSidebarSearchLayout = (SpotSidebarSearchLayout) ViewBindings.findChildViewById(view, i11);
                if (spotSidebarSearchLayout != null) {
                    i11 = R$id.viewPager;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i11);
                    if (viewPager2 != null) {
                        i11 = R$id.viewSwitcher;
                        ViewSwitcher viewSwitcher = (ViewSwitcher) ViewBindings.findChildViewById(view, i11);
                        if (viewSwitcher != null) {
                            return new C36516a((LinearLayoutCompat) view, clearEditText, slidingTabLayout, spotSidebarSearchLayout, viewPager2, viewSwitcher);
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
    public LinearLayoutCompat getRoot() {
        return this.f79345a;
    }

    public C36516a(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ClearEditText clearEditText, @NonNull SlidingTabLayout slidingTabLayout, @NonNull SpotSidebarSearchLayout spotSidebarSearchLayout, @NonNull ViewPager2 viewPager2, @NonNull ViewSwitcher viewSwitcher) {
        this.f79345a = linearLayoutCompat;
        this.f79346b = clearEditText;
        this.f79347c = slidingTabLayout;
        this.f79348d = spotSidebarSearchLayout;
        this.f79349e = viewPager2;
        this.f79350f = viewSwitcher;
    }
}
