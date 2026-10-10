package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.round.widget.RoundTextView;

/* JADX INFO: renamed from: ta.z4 */
/* JADX INFO: compiled from: KucoinFragmentWithdrawMemoConfirmDialogBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44911z4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101267a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f101268b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f101269c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RoundTextView f101270d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f101271e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f101272f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RoundTextView f101273g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44911z4 m99346a(@NonNull View view) {
        int i11 = R$id.iv_cancel;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_withdraw_result;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.tv_determine;
                RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i11);
                if (roundTextView != null) {
                    i11 = R$id.tv_tip;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_title;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tv_view_detail;
                            RoundTextView roundTextView2 = (RoundTextView) ViewBindings.findChildViewById(view, i11);
                            if (roundTextView2 != null) {
                                return new C44911z4((ConstraintLayout) view, imageView, imageView2, roundTextView, baseTextView, baseTextView2, roundTextView2);
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
        return this.f101267a;
    }

    public C44911z4(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RoundTextView roundTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull RoundTextView roundTextView2) {
        this.f101267a = constraintLayout;
        this.f101268b = imageView;
        this.f101269c = imageView2;
        this.f101270d = roundTextView;
        this.f101271e = baseTextView;
        this.f101272f = baseTextView2;
        this.f101273g = roundTextView2;
    }
}
