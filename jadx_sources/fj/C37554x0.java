package fj;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.home.realtime.frame.view.CardStackView;
import com.kubi.resources.widget.KcLabelView;

/* JADX INFO: renamed from: fj.x0 */
/* JADX INFO: compiled from: LayoutHomeRealtimeWidgetBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37554x0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f83490a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f83491b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcLabelView f83492c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CardStackView f83493d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37554x0 m84581a(@NonNull View view) {
        int i11 = R$id.button_close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.label_realtime_count;
            KcLabelView kcLabelView = (KcLabelView) ViewBindings.findChildViewById(view, i11);
            if (kcLabelView != null) {
                i11 = R$id.real_time_card;
                CardStackView cardStackView = (CardStackView) ViewBindings.findChildViewById(view, i11);
                if (cardStackView != null) {
                    return new C37554x0((FrameLayout) view, appCompatImageView, kcLabelView, cardStackView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f83490a;
    }

    public C37554x0(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull KcLabelView kcLabelView, @NonNull CardStackView cardStackView) {
        this.f83490a = frameLayout;
        this.f83491b = appCompatImageView;
        this.f83492c = kcLabelView;
        this.f83493d = cardStackView;
    }
}
