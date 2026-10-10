package p270ft;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.p */
/* JADX INFO: compiled from: BotcFragmentFiatCapitualStatusBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37666p implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84377a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f84378b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84379c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84380d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84381e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84382f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37666p m84917a(@NonNull View view) {
        int i11 = R$id.iv_status;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tv_action_one;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tv_action_two;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tv_status;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.tv_status_des;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null) {
                            return new C37666p((ConstraintLayout) view, imageView, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
        return this.f84377a;
    }

    public C37666p(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f84377a = constraintLayout;
        this.f84378b = imageView;
        this.f84379c = baseTextView;
        this.f84380d = baseTextView2;
        this.f84381e = baseTextView3;
        this.f84382f = baseTextView4;
    }
}
