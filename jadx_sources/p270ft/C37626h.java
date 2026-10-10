package p270ft;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.chat.p105ui.InputBottomBar;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: ft.h */
/* JADX INFO: compiled from: BotcFragmentChatBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37626h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83935a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f83936b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f83937c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final SwipeRefreshLayout f83938d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f83939e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcSecondaryButton f83940f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f83941g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f83942h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final FrameLayout f83943i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final FrameLayout f83944j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final InputBottomBar f83945k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37626h m84833a(@NonNull View view) {
        int i11 = R$id.ivSide;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.layoutOrderInfo;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.refreshLayout;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, i11);
                if (swipeRefreshLayout != null) {
                    i11 = R$id.rv_chat;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView != null) {
                        i11 = R$id.tvDetails;
                        KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                        if (kcSecondaryButton != null) {
                            i11 = R$id.tvSubtitle;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tvTitle;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.view_bottom;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                    if (frameLayout != null) {
                                        i11 = R$id.view_forbid_tip;
                                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                        if (frameLayout2 != null) {
                                            i11 = R$id.view_input_bar;
                                            InputBottomBar inputBottomBar = (InputBottomBar) ViewBindings.findChildViewById(view, i11);
                                            if (inputBottomBar != null) {
                                                return new C37626h((ConstraintLayout) view, appCompatImageView, constraintLayout, swipeRefreshLayout, recyclerView, kcSecondaryButton, baseTextView, baseTextView2, frameLayout, frameLayout2, inputBottomBar);
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

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83935a;
    }

    public C37626h(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull ConstraintLayout constraintLayout2, @NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull RecyclerView recyclerView, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull InputBottomBar inputBottomBar) {
        this.f83935a = constraintLayout;
        this.f83936b = appCompatImageView;
        this.f83937c = constraintLayout2;
        this.f83938d = swipeRefreshLayout;
        this.f83939e = recyclerView;
        this.f83940f = kcSecondaryButton;
        this.f83941g = baseTextView;
        this.f83942h = baseTextView2;
        this.f83943i = frameLayout;
        this.f83944j = frameLayout2;
        this.f83945k = inputBottomBar;
    }
}
