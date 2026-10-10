package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import k00.C40849m;

/* JADX INFO: renamed from: ta.h3 */
/* JADX INFO: compiled from: DialogAssetContactsAddrBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44780h3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100027a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C40849m f100028b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f100029c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f100030d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f100031e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f100032f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100033g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ConstraintLayout f100034h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f100035i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RecyclerView f100036j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f100037k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f100038l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f100039m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f100040n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final AlertTipsTextView f100041o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44780h3 m99077a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.bottom_sheet;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 != null) {
            C40849m c40849mM89397a = C40849m.m89397a(viewFindChildViewById2);
            i11 = R$id.btn_add;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.btn_next;
                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divide_line))) != null) {
                    i11 = R$id.empty_icon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView != null) {
                        i11 = R$id.empty_tips;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.layout_eidt;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (constraintLayout != null) {
                                i11 = R$id.ll_empty;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout != null) {
                                    i11 = R$id.recyclerView;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                    if (recyclerView != null) {
                                        i11 = R$id.tv_check_all;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.tv_delete;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                i11 = R$id.tv_edit;
                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView5 != null) {
                                                    i11 = R$id.tv_title;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        i11 = R$id.withdrawSettingTips;
                                                        AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (alertTipsTextView != null) {
                                                            return new C44780h3((LinearLayout) view, c40849mM89397a, baseTextView, kcPrimaryButton, viewFindChildViewById, imageView, baseTextView2, constraintLayout, linearLayout, recyclerView, baseTextView3, baseTextView4, baseTextView5, baseTextView6, alertTipsTextView);
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
    public LinearLayout getRoot() {
        return this.f100027a;
    }

    public C44780h3(@NonNull LinearLayout linearLayout, @NonNull C40849m c40849m, @NonNull BaseTextView baseTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull View view, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView2, @NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull AlertTipsTextView alertTipsTextView) {
        this.f100027a = linearLayout;
        this.f100028b = c40849m;
        this.f100029c = baseTextView;
        this.f100030d = kcPrimaryButton;
        this.f100031e = view;
        this.f100032f = imageView;
        this.f100033g = baseTextView2;
        this.f100034h = constraintLayout;
        this.f100035i = linearLayout2;
        this.f100036j = recyclerView;
        this.f100037k = baseTextView3;
        this.f100038l = baseTextView4;
        this.f100039m = baseTextView5;
        this.f100040n = baseTextView6;
        this.f100041o = alertTipsTextView;
    }
}
