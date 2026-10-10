package k00;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;

/* JADX INFO: renamed from: k00.i */
/* JADX INFO: compiled from: KucoinViewHoldingEarnEntryCardBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40845i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeConstraintLayout f90764a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f90765b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ShapeConstraintLayout f90766c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f90767d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f90768e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f90769f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40845i m89388a(@NonNull View view) {
        int i11 = R$id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) view;
            i11 = R$id.tv_desc;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                i11 = R$id.tv_rate;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView2 != null) {
                    i11 = R$id.tv_title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView3 != null) {
                        return new C40845i(shapeConstraintLayout, imageView, shapeConstraintLayout, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C40845i m89389c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.kucoin_view_holding_earn_entry_card, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m89388a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeConstraintLayout getRoot() {
        return this.f90764a;
    }

    public C40845i(@NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull ImageView imageView, @NonNull ShapeConstraintLayout shapeConstraintLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f90764a = shapeConstraintLayout;
        this.f90765b = imageView;
        this.f90766c = shapeConstraintLayout2;
        this.f90767d = textView;
        this.f90768e = textView2;
        this.f90769f = textView3;
    }
}
