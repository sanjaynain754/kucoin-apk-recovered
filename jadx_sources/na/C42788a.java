package na;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.app.facade.R$id;

/* JADX INFO: renamed from: na.a */
/* JADX INFO: compiled from: AppmodeSelectorLayoutBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C42788a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f94776a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f94777b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Guideline f94778c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f94779d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f94780e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f94781f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f94782g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f94783h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f94784i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f94785j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f94786k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextView f94787l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42788a m93775a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.guideHalf;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i11);
        if (guideline != null) {
            i11 = R$id.ivNewCrypto;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.ivNewCrypto1;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView2 != null) {
                    i11 = R$id.mode_new;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.mode_old;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout2 != null) {
                            i11 = R$id.tvNewDesc;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView != null) {
                                i11 = R$id.tvNewDesc1;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView2 != null) {
                                    i11 = R$id.tvNewTitle;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView3 != null) {
                                        i11 = R$id.tvNewTitle1;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView4 != null) {
                                            i11 = R$id.tvTitle;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                            if (textView5 != null) {
                                                return new C42788a(constraintLayout, constraintLayout, guideline, imageView, imageView2, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5);
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
        return this.f94776a;
    }

    public C42788a(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull Guideline guideline, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f94776a = constraintLayout;
        this.f94777b = constraintLayout2;
        this.f94778c = guideline;
        this.f94779d = imageView;
        this.f94780e = imageView2;
        this.f94781f = linearLayout;
        this.f94782g = linearLayout2;
        this.f94783h = textView;
        this.f94784i = textView2;
        this.f94785j = textView3;
        this.f94786k = textView4;
        this.f94787l = textView5;
    }
}
