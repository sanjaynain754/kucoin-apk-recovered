package dm;

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
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.resources.widget.wheel.view.WheelView;

/* JADX INFO: renamed from: dm.h1 */
/* JADX INFO: compiled from: BkumexDialogTwapTotalTimeBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36771h1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80175a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f80176b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f80177c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final WheelView f80178d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final WheelView f80179e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final WheelView f80180f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcSecondaryButton f80181g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f80182h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ConstraintLayout f80183i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36771h1 m82398a(@NonNull View view) {
        int i11 = R$id.closeIv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.confirmTv;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.days;
                WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i11);
                if (wheelView != null) {
                    i11 = R$id.hours;
                    WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, i11);
                    if (wheelView2 != null) {
                        i11 = R$id.minutes;
                        WheelView wheelView3 = (WheelView) ViewBindings.findChildViewById(view, i11);
                        if (wheelView3 != null) {
                            i11 = R$id.resetTv;
                            KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                            if (kcSecondaryButton != null) {
                                i11 = R$id.titleTv;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView != null) {
                                    i11 = R$id.wheelLayout;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                    if (constraintLayout != null) {
                                        return new C36771h1((ConstraintLayout) view, imageView, kcPrimaryButton, wheelView, wheelView2, wheelView3, kcSecondaryButton, textView, constraintLayout);
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

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C36771h1 m82399c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_dialog_twap_total_time, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82398a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f80175a;
    }

    public C36771h1(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull WheelView wheelView, @NonNull WheelView wheelView2, @NonNull WheelView wheelView3, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2) {
        this.f80175a = constraintLayout;
        this.f80176b = imageView;
        this.f80177c = kcPrimaryButton;
        this.f80178d = wheelView;
        this.f80179e = wheelView2;
        this.f80180f = wheelView3;
        this.f80181g = kcSecondaryButton;
        this.f80182h = textView;
        this.f80183i = constraintLayout2;
    }
}
