package p637ta;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.e4 */
/* JADX INFO: compiled from: KucoinFragmentDepositAccountBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44757e4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99809a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AlertTipsTextView f99810b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f99811c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f99812d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f99813e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayoutCompat f99814f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99815g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99816h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AlertTipsTextView f99817i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f99818j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44757e4 m99028a(@NonNull View view) {
        int i11 = R$id.deposit_tip;
        AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
        if (alertTipsTextView != null) {
            i11 = R$id.flDepositTip;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.ivCloseDepositTip;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i11 = R$id.llSelectAccount;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat != null) {
                        i11 = R$id.sub_account_name;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv_account_title;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tvDepositTip;
                                AlertTipsTextView alertTipsTextView2 = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                                if (alertTipsTextView2 != null) {
                                    i11 = R$id.tvSelectAccount;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        return new C44757e4(linearLayout, alertTipsTextView, frameLayout, imageView, linearLayout, linearLayoutCompat, baseTextView, baseTextView2, alertTipsTextView2, baseTextView3);
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
        return this.f99809a;
    }

    public C44757e4(@NonNull LinearLayout linearLayout, @NonNull AlertTipsTextView alertTipsTextView, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull AlertTipsTextView alertTipsTextView2, @NonNull BaseTextView baseTextView3) {
        this.f99809a = linearLayout;
        this.f99810b = alertTipsTextView;
        this.f99811c = frameLayout;
        this.f99812d = imageView;
        this.f99813e = linearLayout2;
        this.f99814f = linearLayoutCompat;
        this.f99815g = baseTextView;
        this.f99816h = baseTextView2;
        this.f99817i = alertTipsTextView2;
        this.f99818j = baseTextView3;
    }
}
