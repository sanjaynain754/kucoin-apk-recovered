package t20;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.i0 */
/* JADX INFO: compiled from: KucoinDelegationManagerLayoutBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44645i0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99129a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KuCheckBox f99130b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SlidingTabLayout f99131c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RtlViewPager f99132d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f99133e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f99134f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99135g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44645i0 m98766a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.ctx_current;
        KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
        if (kuCheckBox != null) {
            i11 = R$id.delegation_tablayout;
            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
            if (slidingTabLayout != null) {
                i11 = R$id.delegation_viewpager;
                RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
                if (rtlViewPager != null) {
                    i11 = R$id.layout1;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                        i11 = R$id.tvCancel;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            return new C44645i0((LinearLayout) view, kuCheckBox, slidingTabLayout, rtlViewPager, constraintLayout, viewFindChildViewById, baseTextView);
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
        return this.f99129a;
    }

    public C44645i0(@NonNull LinearLayout linearLayout, @NonNull KuCheckBox kuCheckBox, @NonNull SlidingTabLayout slidingTabLayout, @NonNull RtlViewPager rtlViewPager, @NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull BaseTextView baseTextView) {
        this.f99129a = linearLayout;
        this.f99130b = kuCheckBox;
        this.f99131c = slidingTabLayout;
        this.f99132d = rtlViewPager;
        this.f99133e = constraintLayout;
        this.f99134f = view;
        this.f99135g = baseTextView;
    }
}
