package p206dp;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.RadioGroupPlus;

/* JADX INFO: renamed from: dp.c0 */
/* JADX INFO: compiled from: BmarginFragmentMarketTradeBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36906c0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final NestedScrollView f81605a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f81606b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FragmentContainerView f81607c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C36936r0 f81608d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final NestedScrollView f81609e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RadioButton f81610f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RadioButton f81611g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RadioButton f81612h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final RadioGroupPlus f81613i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36906c0 m82681a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.fl_main_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.fragment_kline;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i11);
            if (fragmentContainerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.infoLayout))) != null) {
                C36936r0 c36936r0M82741a = C36936r0.m82741a(viewFindChildViewById);
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
                                return new C36906c0(nestedScrollView, frameLayout, fragmentContainerView, c36936r0M82741a, nestedScrollView, radioButton, radioButton2, radioButton3, radioGroupPlus);
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
        return this.f81605a;
    }

    public C36906c0(@NonNull NestedScrollView nestedScrollView, @NonNull FrameLayout frameLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull C36936r0 c36936r0, @NonNull NestedScrollView nestedScrollView2, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioGroupPlus radioGroupPlus) {
        this.f81605a = nestedScrollView;
        this.f81606b = frameLayout;
        this.f81607c = fragmentContainerView;
        this.f81608d = c36936r0;
        this.f81609e = nestedScrollView2;
        this.f81610f = radioButton;
        this.f81611g = radioButton2;
        this.f81612h = radioButton3;
        this.f81613i = radioGroupPlus;
    }
}
