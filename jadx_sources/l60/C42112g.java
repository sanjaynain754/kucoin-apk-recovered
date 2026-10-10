package l60;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.unify.R$id;

/* JADX INFO: renamed from: l60.g */
/* JADX INFO: compiled from: UnifyLiabilityListDialogBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C42112g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f93512a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f93513b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f93514c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f93515d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f93516e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f93517f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42112g m92379a(@NonNull View view) {
        int i11 = R$id.btnConfirm;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.flContent;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.title;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvHeaderAmount;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            return new C42112g((LinearLayout) view, kcPrimaryButton, frameLayout, recyclerView, baseTextView, baseTextView2);
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
        return this.f93512a;
    }

    public C42112g(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f93512a = linearLayout;
        this.f93513b = kcPrimaryButton;
        this.f93514c = frameLayout;
        this.f93515d = recyclerView;
        this.f93516e = baseTextView;
        this.f93517f = baseTextView2;
    }
}
