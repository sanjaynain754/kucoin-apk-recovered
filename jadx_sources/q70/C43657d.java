package q70;

import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.utaspotlib.R$id;

/* JADX INFO: renamed from: q70.d */
/* JADX INFO: compiled from: UtaDelegationRecodFragmentBinding.java */
/* JADX INFO: loaded from: classes54.dex */
public final class C43657d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f96362a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CheckedTextView f96363b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SlidingTabLayout f96364c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RtlViewPager f96365d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f96366e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f96367f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43657d m96074a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.ctx_current;
        CheckedTextView checkedTextView = (CheckedTextView) ViewBindings.findChildViewById(view, i11);
        if (checkedTextView != null) {
            i11 = R$id.delegation_tablayout;
            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
            if (slidingTabLayout != null) {
                i11 = R$id.delegation_viewpager;
                RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
                if (rtlViewPager != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                    i11 = R$id.tvCancel;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        return new C43657d((LinearLayout) view, checkedTextView, slidingTabLayout, rtlViewPager, viewFindChildViewById, baseTextView);
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
        return this.f96362a;
    }

    public C43657d(@NonNull LinearLayout linearLayout, @NonNull CheckedTextView checkedTextView, @NonNull SlidingTabLayout slidingTabLayout, @NonNull RtlViewPager rtlViewPager, @NonNull View view, @NonNull BaseTextView baseTextView) {
        this.f96362a = linearLayout;
        this.f96363b = checkedTextView;
        this.f96364c = slidingTabLayout;
        this.f96365d = rtlViewPager;
        this.f96366e = view;
        this.f96367f = baseTextView;
    }
}
