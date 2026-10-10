package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.q */
/* JADX INFO: compiled from: AssetDialogAutoEarnCloseBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44843q implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100646a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f100647b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f100648c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f100649d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f100650e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f100651f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100652g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100653h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44843q m99212a(@NonNull View view) {
        int i11 = R$id.btnCancel;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.btnClose;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.contentContainer;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.ivClose;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.ivTop;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView2 != null) {
                            i11 = R$id.tvDesc;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tvTitle;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    return new C44843q((LinearLayout) view, baseTextView, kcPrimaryButton, linearLayout, appCompatImageView, appCompatImageView2, baseTextView2, baseTextView3);
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
    public LinearLayout getRoot() {
        return this.f100646a;
    }

    public C44843q(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull LinearLayout linearLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f100646a = linearLayout;
        this.f100647b = baseTextView;
        this.f100648c = kcPrimaryButton;
        this.f100649d = linearLayout2;
        this.f100650e = appCompatImageView;
        this.f100651f = appCompatImageView2;
        this.f100652g = baseTextView2;
        this.f100653h = baseTextView3;
    }
}
