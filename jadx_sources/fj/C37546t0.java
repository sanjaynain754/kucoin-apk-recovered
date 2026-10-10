package fj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;

/* JADX INFO: renamed from: fj.t0 */
/* JADX INFO: compiled from: KucoinLayoutHomeEditBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37546t0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f83416a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageButton f83417b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CardView f83418c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageButton f83419d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37546t0 m84562a(@NonNull View view) {
        int i11 = R$id.home_card_add;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i11);
        if (imageButton != null) {
            i11 = R$id.home_card_edit_bottom;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i11);
            if (cardView != null) {
                i11 = R$id.home_card_ok;
                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i11);
                if (imageButton2 != null) {
                    return new C37546t0((FrameLayout) view, imageButton, cardView, imageButton2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37546t0 m84563c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.kucoin_layout_home_edit, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84562a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f83416a;
    }

    public C37546t0(@NonNull FrameLayout frameLayout, @NonNull ImageButton imageButton, @NonNull CardView cardView, @NonNull ImageButton imageButton2) {
        this.f83416a = frameLayout;
        this.f83417b = imageButton;
        this.f83418c = cardView;
        this.f83419d = imageButton2;
    }
}
