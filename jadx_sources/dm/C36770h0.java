package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.h0 */
/* JADX INFO: compiled from: BkumexDialogLiqPriceDescBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36770h0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f80162a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80163b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ScrollView f80164c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80165d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f80166e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80167f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f80168g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80169h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f80170i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f80171j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f80172k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f80173l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final View f80174m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36770h0 m82395a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.baseMarkPrice;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.contentScrollView;
            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i11);
            if (scrollView != null) {
                i11 = R$id.desc;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.learnMore;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.learnMoreText;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.liqPriceValue;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.markPriceValue;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.priceInfoContainer;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout2 != null) {
                                        i11 = R$id.showMarkPriceGuide;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                        if (linearLayout3 != null) {
                                            i11 = R$id.showMarkPriceGuideText;
                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView6 != null) {
                                                i11 = R$id.title;
                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView7 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.topDivider))) != null) {
                                                    return new C36770h0((LinearLayoutCompat) view, baseTextView, scrollView, baseTextView2, linearLayout, baseTextView3, baseTextView4, baseTextView5, linearLayout2, linearLayout3, baseTextView6, baseTextView7, viewFindChildViewById);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C36770h0 m82396c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_dialog_liq_price_desc, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82395a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f80162a;
    }

    public C36770h0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull ScrollView scrollView, @NonNull BaseTextView baseTextView2, @NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull View view) {
        this.f80162a = linearLayoutCompat;
        this.f80163b = baseTextView;
        this.f80164c = scrollView;
        this.f80165d = baseTextView2;
        this.f80166e = linearLayout;
        this.f80167f = baseTextView3;
        this.f80168g = baseTextView4;
        this.f80169h = baseTextView5;
        this.f80170i = linearLayout2;
        this.f80171j = linearLayout3;
        this.f80172k = baseTextView6;
        this.f80173l = baseTextView7;
        this.f80174m = view;
    }
}
