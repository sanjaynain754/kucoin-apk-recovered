package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.WrapContentHeightViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: ta.j3 */
/* JADX INFO: compiled from: DialogFragmentAssetv2NewguideBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44796j3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f100222a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f100223b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final WrapContentHeightViewPager f100224c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44796j3 m99111a(@NonNull View view) {
        int i11 = R$id.tab_layout_new_guide;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.vp_new_guide;
            WrapContentHeightViewPager wrapContentHeightViewPager = (WrapContentHeightViewPager) ViewBindings.findChildViewById(view, i11);
            if (wrapContentHeightViewPager != null) {
                return new C44796j3((LinearLayoutCompat) view, slidingTabLayout, wrapContentHeightViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f100222a;
    }

    public C44796j3(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull SlidingTabLayout slidingTabLayout, @NonNull WrapContentHeightViewPager wrapContentHeightViewPager) {
        this.f100222a = linearLayoutCompat;
        this.f100223b = slidingTabLayout;
        this.f100224c = wrapContentHeightViewPager;
    }
}
