package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FlexBoxLayoutMaxLines;

/* JADX INFO: renamed from: ft.i0 */
/* JADX INFO: compiled from: HistoryCurrencyLayoutBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37632i0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84029a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f84030b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FlexBoxLayoutMaxLines f84031c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84032d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37632i0 m84846a(@NonNull View view) {
        int i11 = R$id.delete_history;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.flexbox_layout;
            FlexBoxLayoutMaxLines flexBoxLayoutMaxLines = (FlexBoxLayoutMaxLines) ViewBindings.findChildViewById(view, i11);
            if (flexBoxLayoutMaxLines != null) {
                i11 = R$id.history_title;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    return new C37632i0((ConstraintLayout) view, appCompatImageView, flexBoxLayoutMaxLines, baseTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f84029a;
    }

    public C37632i0(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull FlexBoxLayoutMaxLines flexBoxLayoutMaxLines, @NonNull BaseTextView baseTextView) {
        this.f84029a = constraintLayout;
        this.f84030b = appCompatImageView;
        this.f84031c = flexBoxLayoutMaxLines;
        this.f84032d = baseTextView;
    }
}
