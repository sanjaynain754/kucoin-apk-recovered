package p532pc;

import android.view.View;
import android.widget.ViewSwitcher;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.copytrading.R$id;
import com.kubi.copytrading.view.CopyTradingUserAvatarView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: pc.b */
/* JADX INFO: compiled from: BcopytradingViewCopyTradeAccountBinding.java */
/* JADX INFO: loaded from: classes8.dex */
public final class C43433b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f95889a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ViewSwitcher f95890b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f95891c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CopyTradingUserAvatarView f95892d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f95893e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final CopyTradingUserAvatarView f95894f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f95895g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43433b m95627a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.accountSwitcher;
        ViewSwitcher viewSwitcher = (ViewSwitcher) ViewBindings.findChildViewById(view, i11);
        if (viewSwitcher != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.dividerBar))) != null) {
            i11 = R$id.ivAccount;
            CopyTradingUserAvatarView copyTradingUserAvatarView = (CopyTradingUserAvatarView) ViewBindings.findChildViewById(view, i11);
            if (copyTradingUserAvatarView != null) {
                i11 = R$id.ivSwap;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.masterAccountAvatar;
                    CopyTradingUserAvatarView copyTradingUserAvatarView2 = (CopyTradingUserAvatarView) ViewBindings.findChildViewById(view, i11);
                    if (copyTradingUserAvatarView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        return new C43433b(constraintLayout, viewSwitcher, viewFindChildViewById, copyTradingUserAvatarView, baseTextView, copyTradingUserAvatarView2, constraintLayout);
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
        return this.f95889a;
    }

    public C43433b(@NonNull ConstraintLayout constraintLayout, @NonNull ViewSwitcher viewSwitcher, @NonNull View view, @NonNull CopyTradingUserAvatarView copyTradingUserAvatarView, @NonNull BaseTextView baseTextView, @NonNull CopyTradingUserAvatarView copyTradingUserAvatarView2, @NonNull ConstraintLayout constraintLayout2) {
        this.f95889a = constraintLayout;
        this.f95890b = viewSwitcher;
        this.f95891c = view;
        this.f95892d = copyTradingUserAvatarView;
        this.f95893e = baseTextView;
        this.f95894f = copyTradingUserAvatarView2;
        this.f95895g = constraintLayout2;
    }
}
