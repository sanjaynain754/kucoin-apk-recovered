package p270ft;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.a0 */
/* JADX INFO: compiled from: BotcFragmentPayBuyStatusBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37592a0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83590a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f83591b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CircularProgressIndicator f83592c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f83593d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f83594e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f83595f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f83596g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f83597h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f83598i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37592a0 m84768a(@NonNull View view) {
        int i11 = R$id.iv_status;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.progress_bar;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i11);
            if (circularProgressIndicator != null) {
                i11 = R$id.tv_action_one;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tv_action_two;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.tv_amount;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.tv_count_down;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.tv_status;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.tv_status_des;
                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView6 != null) {
                                        return new C37592a0((ConstraintLayout) view, imageView, circularProgressIndicator, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6);
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
        return this.f83590a;
    }

    public C37592a0(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f83590a = constraintLayout;
        this.f83591b = imageView;
        this.f83592c = circularProgressIndicator;
        this.f83593d = baseTextView;
        this.f83594e = baseTextView2;
        this.f83595f = baseTextView3;
        this.f83596g = baseTextView4;
        this.f83597h = baseTextView5;
        this.f83598i = baseTextView6;
    }
}
