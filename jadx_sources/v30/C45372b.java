package v30;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.kubi.resources.widget.CustomViewPager;

/* JADX INFO: renamed from: v30.b */
/* JADX INFO: compiled from: BkcoinCoreOrderFundsViewpagerBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45372b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CustomViewPager f102021a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CustomViewPager f102022b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45372b m100274a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CustomViewPager customViewPager = (CustomViewPager) view;
        return new C45372b(customViewPager, customViewPager);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CustomViewPager getRoot() {
        return this.f102021a;
    }

    public C45372b(@NonNull CustomViewPager customViewPager, @NonNull CustomViewPager customViewPager2) {
        this.f102021a = customViewPager;
        this.f102022b = customViewPager2;
    }
}
