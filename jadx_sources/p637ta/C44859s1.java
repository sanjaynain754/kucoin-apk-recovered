package p637ta;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.withdraw.view.WithdrawNoticeView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.s1 */
/* JADX INFO: compiled from: AssetListBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44859s1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f100767a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f100768b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f100769c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f100770d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f100771e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RecyclerView f100772f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final WithdrawNoticeView f100773g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100774h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44859s1 m99242a(@NonNull View view) {
        View viewFindChildViewById;
        WithdrawNoticeView withdrawNoticeViewFindChildViewById;
        int i11 = R$id.btnCancelHide;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.layoutHiddenSmallAssetEmpty;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.loadLayout;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.loadView))) != null) {
                    i11 = R$id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView != null && (withdrawNoticeViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.sortSettingNoticeView))) != null) {
                        i11 = R$id.tvHiddenSmallAssetTip;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            return new C44859s1((FrameLayout) view, kcPrimaryButton, linearLayout, frameLayout, viewFindChildViewById, recyclerView, withdrawNoticeViewFindChildViewById, baseTextView);
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
        return this.f100767a;
    }

    public C44859s1(@NonNull FrameLayout frameLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout2, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull WithdrawNoticeView withdrawNoticeView, @NonNull BaseTextView baseTextView) {
        this.f100767a = frameLayout;
        this.f100768b = kcPrimaryButton;
        this.f100769c = linearLayout;
        this.f100770d = frameLayout2;
        this.f100771e = view;
        this.f100772f = recyclerView;
        this.f100773g = withdrawNoticeView;
        this.f100774h = baseTextView;
    }
}
