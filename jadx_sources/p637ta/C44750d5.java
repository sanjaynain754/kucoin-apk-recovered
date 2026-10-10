package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.d5 */
/* JADX INFO: compiled from: KucoinIncludeWithdrawGuideBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44750d5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final BubbleLinearLayout f99753a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BubbleLinearLayout f99754b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f99755c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99756d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44750d5 m99014a(@NonNull View view) {
        BubbleLinearLayout bubbleLinearLayout = (BubbleLinearLayout) view;
        int i11 = R$id.guideClose;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.guideContent;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C44750d5(bubbleLinearLayout, bubbleLinearLayout, appCompatImageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BubbleLinearLayout getRoot() {
        return this.f99753a;
    }

    public C44750d5(@NonNull BubbleLinearLayout bubbleLinearLayout, @NonNull BubbleLinearLayout bubbleLinearLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView) {
        this.f99753a = bubbleLinearLayout;
        this.f99754b = bubbleLinearLayout2;
        this.f99755c = appCompatImageView;
        this.f99756d = baseTextView;
    }
}
