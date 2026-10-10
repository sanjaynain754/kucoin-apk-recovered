package t20;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.l */
/* JADX INFO: compiled from: BkucoinFragmentMarketTradeBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44650l implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final NestedScrollView f99175a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f99176b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f99177c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FragmentContainerView f99178d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FragmentContainerView f99179e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FragmentContainerView f99180f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final C44668u f99181g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final NestedScrollView f99182h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final RadioButton f99183i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RadioButton f99184j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final RadioButton f99185k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final RadioGroupPlus f99186l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44650l m98776a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.call_auction_progress;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.fl_main_container;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout2 != null) {
                i11 = R$id.fragment_container_hottopic;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
                if (fragmentContainerView != null) {
                    i11 = R$id.fragment_count_down;
                    FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
                    if (fragmentContainerView2 != null) {
                        i11 = R$id.fragment_kline;
                        FragmentContainerView fragmentContainerView3 = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
                        if (fragmentContainerView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.marketDetail))) != null) {
                            C44668u c44668uM98812a = C44668u.m98812a(viewFindChildViewById);
                            NestedScrollView nestedScrollView = (NestedScrollView) view;
                            i11 = R$id.rb_order_book;
                            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
                            if (radioButton != null) {
                                i11 = R$id.rb_recent_deal;
                                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                if (radioButton2 != null) {
                                    i11 = R$id.rb_trade_guide;
                                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                    if (radioButton3 != null) {
                                        i11 = R$id.rgp;
                                        RadioGroupPlus radioGroupPlus = (RadioGroupPlus) ViewBindings.findChildViewById(view, i11);
                                        if (radioGroupPlus != null) {
                                            return new C44650l(nestedScrollView, frameLayout, frameLayout2, fragmentContainerView, fragmentContainerView2, fragmentContainerView3, c44668uM98812a, nestedScrollView, radioButton, radioButton2, radioButton3, radioGroupPlus);
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

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f99175a;
    }

    public C44650l(@NonNull NestedScrollView nestedScrollView, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2, @NonNull FragmentContainerView fragmentContainerView3, @NonNull C44668u c44668u, @NonNull NestedScrollView nestedScrollView2, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioGroupPlus radioGroupPlus) {
        this.f99175a = nestedScrollView;
        this.f99176b = frameLayout;
        this.f99177c = frameLayout2;
        this.f99178d = fragmentContainerView;
        this.f99179e = fragmentContainerView2;
        this.f99180f = fragmentContainerView3;
        this.f99181g = c44668u;
        this.f99182h = nestedScrollView2;
        this.f99183i = radioButton;
        this.f99184j = radioButton2;
        this.f99185k = radioButton3;
        this.f99186l = radioGroupPlus;
    }
}
