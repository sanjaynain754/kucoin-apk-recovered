package p205dn;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kyc.R$id;
import com.kubi.kyc.vendor.jumio.p095ui.JumioLayoutRejectIndicator;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: dn.r */
/* JADX INFO: compiled from: LayoutJumioRejectScanBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36898r implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81531a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f81532b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final JumioLayoutRejectIndicator f81533c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f81534d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f81535e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f81536f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RtlViewPager f81537g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36898r m82665a(@NonNull View view) {
        int i11 = R$id.btnRetry;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.indicator;
            JumioLayoutRejectIndicator jumioLayoutRejectIndicator = (JumioLayoutRejectIndicator) ViewBindings.findChildViewById(view, i11);
            if (jumioLayoutRejectIndicator != null) {
                i11 = R$id.ivBack;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.tvTips;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView != null) {
                        i11 = R$id.tvTitle;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView2 != null) {
                            i11 = R$id.viewPager;
                            RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
                            if (rtlViewPager != null) {
                                return new C36898r((LinearLayout) view, kcPrimaryButton, jumioLayoutRejectIndicator, imageView, textView, textView2, rtlViewPager);
                            }
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
        return this.f81531a;
    }

    public C36898r(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull JumioLayoutRejectIndicator jumioLayoutRejectIndicator, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RtlViewPager rtlViewPager) {
        this.f81531a = linearLayout;
        this.f81532b = kcPrimaryButton;
        this.f81533c = jumioLayoutRejectIndicator;
        this.f81534d = imageView;
        this.f81535e = textView;
        this.f81536f = textView2;
        this.f81537g = rtlViewPager;
    }
}
