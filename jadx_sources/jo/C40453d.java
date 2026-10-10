package jo;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.loan.R$id;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: jo.d */
/* JADX INFO: compiled from: BloanFragmentBorrowRepayBinding.java */
/* JADX INFO: loaded from: classes26.dex */
public final class C40453d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f89775a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f89776b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CustomViewPager f89777c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40453d m89095a(@NonNull View view) {
        int i11 = R$id.tablayout;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.viewpager;
            CustomViewPager customViewPager = (CustomViewPager) ViewBindings.findChildViewById(view, i11);
            if (customViewPager != null) {
                return new C40453d((LinearLayout) view, slidingTabLayout, customViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f89775a;
    }

    public C40453d(@NonNull LinearLayout linearLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull CustomViewPager customViewPager) {
        this.f89775a = linearLayout;
        this.f89776b = slidingTabLayout;
        this.f89777c = customViewPager;
    }
}
