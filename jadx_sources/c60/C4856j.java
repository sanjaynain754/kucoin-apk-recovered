package c60;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.transfer.lib.R$id;

/* JADX INFO: renamed from: c60.j */
/* JADX INFO: compiled from: BtransferViewTransferTipBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C4856j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f5010a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AlertTipsTextView f5011b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f5012c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeConstraintLayout f5013d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShapeLinearLayout f5014e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f5015f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f5016g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f5017h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f5018i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AlertTipsTextView f5019j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4856j m4986a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.financeTipView;
        AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
        if (alertTipsTextView != null) {
            i11 = R$id.ivInfo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.layoutAutoTip;
                ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (shapeConstraintLayout != null) {
                    i11 = R$id.layoutFutureTip;
                    ShapeLinearLayout shapeLinearLayout = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (shapeLinearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                        i11 = R$id.tvAutoTip;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView != null) {
                            i11 = R$id.tvAutoTitle;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView2 != null) {
                                i11 = R$id.tvFutureTip;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView3 != null) {
                                    i11 = R$id.tvUnifiedModeTradeTip;
                                    AlertTipsTextView alertTipsTextView2 = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                                    if (alertTipsTextView2 != null) {
                                        return new C4856j((ConstraintLayout) view, alertTipsTextView, imageView, shapeConstraintLayout, shapeLinearLayout, viewFindChildViewById, textView, textView2, textView3, alertTipsTextView2);
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
        return this.f5010a;
    }

    public C4856j(@NonNull ConstraintLayout constraintLayout, @NonNull AlertTipsTextView alertTipsTextView, @NonNull ImageView imageView, @NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull ShapeLinearLayout shapeLinearLayout, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull AlertTipsTextView alertTipsTextView2) {
        this.f5010a = constraintLayout;
        this.f5011b = alertTipsTextView;
        this.f5012c = imageView;
        this.f5013d = shapeConstraintLayout;
        this.f5014e = shapeLinearLayout;
        this.f5015f = view;
        this.f5016g = textView;
        this.f5017h = textView2;
        this.f5018i = textView3;
        this.f5019j = alertTipsTextView2;
    }
}
