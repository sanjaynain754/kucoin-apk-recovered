package p270ft;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.e2 */
/* JADX INFO: compiled from: PaymentItemFastBuyBankcardBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37614e2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83839a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f83840b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f83841c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f83842d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37614e2 m84809a(@NonNull View view) {
        int i11 = R$id.ivDelete;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.ivIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.tvTitle;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    return new C37614e2((ConstraintLayout) view, appCompatImageView, imageView, baseTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37614e2 m84810c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.payment_item_fast_buy_bankcard, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84809a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83839a;
    }

    public C37614e2(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView) {
        this.f83839a = constraintLayout;
        this.f83840b = appCompatImageView;
        this.f83841c = imageView;
        this.f83842d = baseTextView;
    }
}
