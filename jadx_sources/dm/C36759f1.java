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

/* JADX INFO: renamed from: dm.f1 */
/* JADX INFO: compiled from: BkumexDialogTwapIntervalTimeBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36759f1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80010a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f80011b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f80012c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final WheelView f80013d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcSecondaryButton f80014e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final WheelView f80015f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f80016g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ConstraintLayout f80017h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36759f1 m82369a(@NonNull View view) {
        int i11 = R$id.confirmTv;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.ivClose;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.minute;
                WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i11);
                if (wheelView != null) {
                    i11 = R$id.resetTv;
                    KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                    if (kcSecondaryButton != null) {
                        i11 = R$id.second;
                        WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, i11);
                        if (wheelView2 != null) {
                            i11 = R$id.titleTv;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView != null) {
                                i11 = R$id.wheelLayout;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                if (constraintLayout != null) {
                                    return new C36759f1((ConstraintLayout) view, kcPrimaryButton, imageView, wheelView, kcSecondaryButton, wheelView2, textView, constraintLayout);
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
    public static C36759f1 m82370c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_dialog_twap_interval_time, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82369a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f80010a;
    }

    public C36759f1(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ImageView imageView, @NonNull WheelView wheelView, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull WheelView wheelView2, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2) {
        this.f80010a = constraintLayout;
        this.f80011b = kcPrimaryButton;
        this.f80012c = imageView;
        this.f80013d = wheelView;
        this.f80014e = kcSecondaryButton;
        this.f80015f = wheelView2;
        this.f80016g = textView;
        this.f80017h = constraintLayout2;
    }
}
