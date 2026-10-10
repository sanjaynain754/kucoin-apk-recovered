package bv;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.view.QuoteViewPager;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.flyco.SlidingTabLayout;

/* JADX INFO: renamed from: bv.d0 */
/* JADX INFO: compiled from: KucoinLayoutHomeMarketSwitchFragmentbarBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4660d0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f4273a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f4274b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f4275c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final SlidingTabLayout f4276d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f4277e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final QuoteViewPager f4278f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4660d0 m4632a(@NonNull View view) {
        int i11 = R$id.iv_alert;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_back;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.tabLayout;
                SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
                if (slidingTabLayout != null) {
                    i11 = R$id.tvSearch;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.view_pager;
                        QuoteViewPager quoteViewPager = (QuoteViewPager) ViewBindings.findChildViewById(view, i11);
                        if (quoteViewPager != null) {
                            return new C4660d0((LinearLayout) view, imageView, imageView2, slidingTabLayout, baseTextView, quoteViewPager);
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
        return this.f4273a;
    }

    public C4660d0(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull SlidingTabLayout slidingTabLayout, @NonNull BaseTextView baseTextView, @NonNull QuoteViewPager quoteViewPager) {
        this.f4273a = linearLayout;
        this.f4274b = imageView;
        this.f4275c = imageView2;
        this.f4276d = slidingTabLayout;
        this.f4277e = baseTextView;
        this.f4278f = quoteViewPager;
    }
}
