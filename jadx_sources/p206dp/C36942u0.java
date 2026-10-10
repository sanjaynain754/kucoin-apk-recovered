package p206dp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dp.u0 */
/* JADX INFO: compiled from: BmarginSettingSelectOptionBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36942u0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81996a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f81997b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f81998c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36942u0 m82753a(@NonNull View view) {
        int i11 = R$id.item_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.item_text;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C36942u0((LinearLayout) view, appCompatImageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C36942u0 m82754c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bmargin_setting_select_option, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82753a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81996a;
    }

    public C36942u0(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView) {
        this.f81996a = linearLayout;
        this.f81997b = appCompatImageView;
        this.f81998c = baseTextView;
    }
}
