package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: dm.i3 */
/* JADX INFO: compiled from: BkumexFragmentSettleRecordBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36779i3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RtlViewPager f80259a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RtlViewPager f80260b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36779i3 m82416a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RtlViewPager rtlViewPager = (RtlViewPager) view;
        return new C36779i3(rtlViewPager, rtlViewPager);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RtlViewPager getRoot() {
        return this.f80259a;
    }

    public C36779i3(@NonNull RtlViewPager rtlViewPager, @NonNull RtlViewPager rtlViewPager2) {
        this.f80259a = rtlViewPager;
        this.f80260b = rtlViewPager2;
    }
}
