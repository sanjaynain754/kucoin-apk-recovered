package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: ta.n3 */
/* JADX INFO: compiled from: FragmentAssetAddressAddBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44826n3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100500a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RtlViewPager f100501b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SlidingTabLayout f100502c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44826n3 m99178a(@NonNull View view) {
        int i11 = R$id.addressPager;
        RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
        if (rtlViewPager != null) {
            i11 = R$id.addressTab;
            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
            if (slidingTabLayout != null) {
                return new C44826n3((LinearLayout) view, rtlViewPager, slidingTabLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f100500a;
    }

    public C44826n3(@NonNull LinearLayout linearLayout, @NonNull RtlViewPager rtlViewPager, @NonNull SlidingTabLayout slidingTabLayout) {
        this.f100500a = linearLayout;
        this.f100501b = rtlViewPager;
        this.f100502c = slidingTabLayout;
    }
}
