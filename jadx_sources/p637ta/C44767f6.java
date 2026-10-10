package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;

/* JADX INFO: renamed from: ta.f6 */
/* JADX INFO: compiled from: ViewMarginPnlAssetsHeaderBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44767f6 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f99937a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f99938b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f99939c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f99940d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShowHideTextView f99941e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final DashTextView f99942f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44767f6 m99049a(@NonNull View view) {
        int i11 = R$id.ivArrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.ivInfo;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.pnlClickView;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.viewPnlCoin;
                    ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                    if (showHideTextView != null) {
                        i11 = R$id.viewTodayPnl;
                        DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                        if (dashTextView != null) {
                            return new C44767f6((LinearLayoutCompat) view, imageView, appCompatImageView, linearLayoutCompat, showHideTextView, dashTextView);
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
    public LinearLayoutCompat getRoot() {
        return this.f99937a;
    }

    public C44767f6(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull ShowHideTextView showHideTextView, @NonNull DashTextView dashTextView) {
        this.f99937a = linearLayoutCompat;
        this.f99938b = imageView;
        this.f99939c = appCompatImageView;
        this.f99940d = linearLayoutCompat2;
        this.f99941e = showHideTextView;
        this.f99942f = dashTextView;
    }
}
