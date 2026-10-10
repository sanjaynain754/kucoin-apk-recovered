package p270ft;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: ft.b1 */
/* JADX INFO: compiled from: PaymentDialogP2pMerchantQualificationBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37598b1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83623a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f83624b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f83625c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Group f83626d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Group f83627e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f83628f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f83629g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatImageView f83630h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AppCompatImageView f83631i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final KcSecondaryButton f83632j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f83633k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f83634l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextView f83635m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f83636n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final TextView f83637o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final TextView f83638p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f83639q;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37598b1 m84780a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.divider1;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider2))) != null) {
            i11 = R$id.foxKingGroup;
            Group group = (Group) ViewBindings.findChildViewById(view, i11);
            if (group != null) {
                i11 = R$id.goldMerchantGroup;
                Group group2 = (Group) ViewBindings.findChildViewById(view, i11);
                if (group2 != null) {
                    i11 = R$id.ivClose;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.ivFoxKing;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView2 != null) {
                            i11 = R$id.ivGoldMerchant;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatImageView3 != null) {
                                i11 = R$id.ivVerifiedMerchant;
                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatImageView4 != null) {
                                    i11 = R$id.tvConfirm;
                                    KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                                    if (kcSecondaryButton != null) {
                                        i11 = R$id.tvFoxKing;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView != null) {
                                            i11 = R$id.tvFoxKingDescription;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                i11 = R$id.tvGoldMerchant;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                if (textView2 != null) {
                                                    i11 = R$id.tvGoldMerchantDescription;
                                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView2 != null) {
                                                        i11 = R$id.tvTitle;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                        if (textView3 != null) {
                                                            i11 = R$id.tvVerifiedMerchant;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                            if (textView4 != null) {
                                                                i11 = R$id.tvVerifiedMerchantDescription;
                                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView3 != null) {
                                                                    return new C37598b1((ConstraintLayout) view, viewFindChildViewById2, viewFindChildViewById, group, group2, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, kcSecondaryButton, textView, baseTextView, textView2, baseTextView2, textView3, textView4, baseTextView3);
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
        return this.f83623a;
    }

    public C37598b1(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull View view2, @NonNull Group group, @NonNull Group group2, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull AppCompatImageView appCompatImageView4, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull TextView textView, @NonNull BaseTextView baseTextView, @NonNull TextView textView2, @NonNull BaseTextView baseTextView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull BaseTextView baseTextView3) {
        this.f83623a = constraintLayout;
        this.f83624b = view;
        this.f83625c = view2;
        this.f83626d = group;
        this.f83627e = group2;
        this.f83628f = appCompatImageView;
        this.f83629g = appCompatImageView2;
        this.f83630h = appCompatImageView3;
        this.f83631i = appCompatImageView4;
        this.f83632j = kcSecondaryButton;
        this.f83633k = textView;
        this.f83634l = baseTextView;
        this.f83635m = textView2;
        this.f83636n = baseTextView2;
        this.f83637o = textView3;
        this.f83638p = textView4;
        this.f83639q = baseTextView3;
    }
}
