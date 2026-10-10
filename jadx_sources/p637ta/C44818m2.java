package p637ta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.m2 */
/* JADX INFO: compiled from: AssetViewGuideBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44818m2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final BubbleLinearLayout f100448a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BubbleLinearLayout f100449b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f100450c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f100451d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44818m2 m99158a(@NonNull View view) {
        BubbleLinearLayout bubbleLinearLayout = (BubbleLinearLayout) view;
        int i11 = R$id.guideContent;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.ivClose;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                return new C44818m2(bubbleLinearLayout, bubbleLinearLayout, baseTextView, appCompatImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C44818m2 m99159c(@NonNull LayoutInflater layoutInflater) {
        return m99160d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C44818m2 m99160d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.asset_view_guide, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m99158a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BubbleLinearLayout getRoot() {
        return this.f100448a;
    }

    public C44818m2(@NonNull BubbleLinearLayout bubbleLinearLayout, @NonNull BubbleLinearLayout bubbleLinearLayout2, @NonNull BaseTextView baseTextView, @NonNull AppCompatImageView appCompatImageView) {
        this.f100448a = bubbleLinearLayout;
        this.f100449b = bubbleLinearLayout2;
        this.f100450c = baseTextView;
        this.f100451d = appCompatImageView;
    }
}
