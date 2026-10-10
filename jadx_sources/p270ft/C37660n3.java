package p270ft;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.n3 */
/* JADX INFO: compiled from: PaymentViewP2pChatCardEntranceBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37660n3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84331a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f84332b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f84333c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f84334d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f84335e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84336f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcPrimaryButton f84337g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84338h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84339i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final View f84340j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37660n3 m84904a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.iv_approve_business;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_fox_king;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.iv_huangjin_business;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView3 != null) {
                    i11 = R$id.llMerchantQualification;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat != null) {
                        i11 = R$id.tvAvatar;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tvChat;
                            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                            if (kcPrimaryButton != null) {
                                i11 = R$id.tvDot;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tvName;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_status))) != null) {
                                        return new C37660n3((ConstraintLayout) view, imageView, imageView2, imageView3, linearLayoutCompat, baseTextView, kcPrimaryButton, baseTextView2, baseTextView3, viewFindChildViewById);
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
        return this.f84331a;
    }

    public C37660n3(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull View view) {
        this.f84331a = constraintLayout;
        this.f84332b = imageView;
        this.f84333c = imageView2;
        this.f84334d = imageView3;
        this.f84335e = linearLayoutCompat;
        this.f84336f = baseTextView;
        this.f84337g = kcPrimaryButton;
        this.f84338h = baseTextView2;
        this.f84339i = baseTextView3;
        this.f84340j = view;
    }
}
