package bv;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;

/* JADX INFO: renamed from: bv.i0 */
/* JADX INFO: compiled from: QuoteItemMarketTabBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4673i0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f4373a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SlidingTabLayout f4374b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f4375c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4673i0 m4658a(@NonNull View view) {
        int i11 = R$id.actionTab;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
        if (slidingTabLayout != null) {
            i11 = R$id.iv_crypto;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C4673i0((LinearLayout) view, slidingTabLayout, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f4373a;
    }

    public C4673i0(@NonNull LinearLayout linearLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull BaseTextView baseTextView) {
        this.f4373a = linearLayout;
        this.f4374b = slidingTabLayout;
        this.f4375c = baseTextView;
    }
}
