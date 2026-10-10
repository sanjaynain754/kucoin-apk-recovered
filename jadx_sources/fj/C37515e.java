package fj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;

/* JADX INFO: renamed from: fj.e */
/* JADX INFO: compiled from: HomeCardBuyCryptoSmallBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37515e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83235a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f83236b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f83237c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f83238d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37515e m84489a(@NonNull View view) {
        int i11 = R$id.iconArrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.summary;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                i11 = R$id.title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView2 != null) {
                    return new C37515e((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37515e m84490c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.home_card_buy_crypto_small, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84489a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83235a;
    }

    public C37515e(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f83235a = constraintLayout;
        this.f83236b = imageView;
        this.f83237c = textView;
        this.f83238d = textView2;
    }
}
