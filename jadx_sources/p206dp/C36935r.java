package p206dp;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.resources.widget.drop.DropMenuView;

/* JADX INFO: renamed from: dp.r */
/* JADX INFO: compiled from: BmarginFragmentEtfRecordListBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36935r implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81927a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f81928b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f81929c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f81930d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final DropMenuView f81931e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final SwipeRefreshRecyclerView f81932f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f81933g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81934h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f81935i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36935r m82739a(@NonNull View view) {
        int i11 = R$id.fl_empty;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.iv_empty_his;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.iv_logo;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView2 != null) {
                    i11 = R$id.m_drop_menu_view;
                    DropMenuView dropMenuView = (DropMenuView) ViewBindings.findChildViewById(view, i11);
                    if (dropMenuView != null) {
                        i11 = R$id.m_swipe_recycler_view;
                        SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
                        if (swipeRefreshRecyclerView != null) {
                            i11 = R$id.tv_coin_type;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tv_empty_tips;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tv_filter;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        return new C36935r((LinearLayout) view, frameLayout, imageView, imageView2, dropMenuView, swipeRefreshRecyclerView, baseTextView, baseTextView2, baseTextView3);
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
    public LinearLayout getRoot() {
        return this.f81927a;
    }

    public C36935r(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull DropMenuView dropMenuView, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f81927a = linearLayout;
        this.f81928b = frameLayout;
        this.f81929c = imageView;
        this.f81930d = imageView2;
        this.f81931e = dropMenuView;
        this.f81932f = swipeRefreshRecyclerView;
        this.f81933g = baseTextView;
        this.f81934h = baseTextView2;
        this.f81935i = baseTextView3;
    }
}
