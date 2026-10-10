package p270ft;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.f3 */
/* JADX INFO: compiled from: PaymentViewFastConfirmCountDownBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37620f3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f83881a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f83882b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ProgressBar f83883c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f83884d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f83885e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f83886f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37620f3 m84821a(@NonNull View view) {
        int i11 = R$id.layoutCountDown;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.progressBar;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i11);
            if (progressBar != null) {
                i11 = R$id.tvCountDown;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tvPrice;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.tvPriceValue;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            return new C37620f3(view, frameLayout, progressBar, baseTextView, baseTextView2, baseTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f83881a;
    }

    public C37620f3(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull ProgressBar progressBar, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f83881a = view;
        this.f83882b = frameLayout;
        this.f83883c = progressBar;
        this.f83884d = baseTextView;
        this.f83885e = baseTextView2;
        this.f83886f = baseTextView3;
    }
}
