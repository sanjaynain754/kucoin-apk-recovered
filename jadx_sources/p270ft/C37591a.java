package p270ft;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.drop.DropMenuView;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;

/* JADX INFO: renamed from: ft.a */
/* JADX INFO: compiled from: BotcActivityOrderBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37591a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f83585a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final DropMenuView f83586b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final SlidingTabLayout f83587c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f83588d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RtlViewPager f83589e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37591a m84766a(@NonNull View view) {
        int i11 = R$id.drop_menu_view;
        DropMenuView dropMenuView = (DropMenuView) ViewBindings.findChildViewById(view, i11);
        if (dropMenuView != null) {
            i11 = R$id.tab_layout;
            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, i11);
            if (slidingTabLayout != null) {
                i11 = R$id.tv_filter;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.view_pager;
                    RtlViewPager rtlViewPager = (RtlViewPager) ViewBindings.findChildViewById(view, i11);
                    if (rtlViewPager != null) {
                        return new C37591a((FrameLayout) view, dropMenuView, slidingTabLayout, baseTextView, rtlViewPager);
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
        return this.f83585a;
    }

    public C37591a(@NonNull FrameLayout frameLayout, @NonNull DropMenuView dropMenuView, @NonNull SlidingTabLayout slidingTabLayout, @NonNull BaseTextView baseTextView, @NonNull RtlViewPager rtlViewPager) {
        this.f83585a = frameLayout;
        this.f83586b = dropMenuView;
        this.f83587c = slidingTabLayout;
        this.f83588d = baseTextView;
        this.f83589e = rtlViewPager;
    }
}
