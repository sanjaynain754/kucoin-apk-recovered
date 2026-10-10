package t20;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.AutoHeightViewPager;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.a */
/* JADX INFO: compiled from: BkucoinActivityCoinBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44628a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f98933a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f98934b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C44656o f98935c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final NestedScrollView f98936d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RadioButton f98937e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RadioButton f98938f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RadioButton f98939g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RadioGroupPlus f98940h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AutoHeightViewPager f98941i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44628a m98735a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.fl_kline;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.ll_bottom))) != null) {
            C44656o c44656oM98788a = C44656o.m98788a(viewFindChildViewById);
            i11 = R$id.nsv;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
            if (nestedScrollView != null) {
                i11 = R$id.rb_overview;
                RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
                if (radioButton != null) {
                    i11 = R$id.rb_state;
                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                    if (radioButton2 != null) {
                        i11 = R$id.rb_trade;
                        RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                        if (radioButton3 != null) {
                            i11 = R$id.rgp;
                            RadioGroupPlus radioGroupPlus = (RadioGroupPlus) ViewBindings.findChildViewById(view, i11);
                            if (radioGroupPlus != null) {
                                i11 = R$id.view_pager;
                                AutoHeightViewPager autoHeightViewPager = (AutoHeightViewPager) ViewBindings.findChildViewById(view, i11);
                                if (autoHeightViewPager != null) {
                                    return new C44628a((FrameLayout) view, frameLayout, c44656oM98788a, nestedScrollView, radioButton, radioButton2, radioButton3, radioGroupPlus, autoHeightViewPager);
                                }
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
    public FrameLayout getRoot() {
        return this.f98933a;
    }

    public C44628a(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull C44656o c44656o, @NonNull NestedScrollView nestedScrollView, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioGroupPlus radioGroupPlus, @NonNull AutoHeightViewPager autoHeightViewPager) {
        this.f98933a = frameLayout;
        this.f98934b = frameLayout2;
        this.f98935c = c44656o;
        this.f98936d = nestedScrollView;
        this.f98937e = radioButton;
        this.f98938f = radioButton2;
        this.f98939g = radioButton3;
        this.f98940h = radioGroupPlus;
        this.f98941i = autoHeightViewPager;
    }
}
