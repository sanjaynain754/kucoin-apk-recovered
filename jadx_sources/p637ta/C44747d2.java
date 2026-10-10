package p637ta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.d2 */
/* JADX INFO: compiled from: AssetUnifyMarginGuideBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44747d2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final BubbleLinearLayout f99734a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BubbleLinearLayout f99735b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f99736c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44747d2 m99006a(@NonNull View view) {
        BubbleLinearLayout bubbleLinearLayout = (BubbleLinearLayout) view;
        int i11 = R$id.guideContent;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            return new C44747d2(bubbleLinearLayout, bubbleLinearLayout, baseTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C44747d2 m99007c(@NonNull LayoutInflater layoutInflater) {
        return m99008d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C44747d2 m99008d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.asset_unify_margin_guide, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m99006a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BubbleLinearLayout getRoot() {
        return this.f99734a;
    }

    public C44747d2(@NonNull BubbleLinearLayout bubbleLinearLayout, @NonNull BubbleLinearLayout bubbleLinearLayout2, @NonNull BaseTextView baseTextView) {
        this.f99734a = bubbleLinearLayout;
        this.f99735b = bubbleLinearLayout2;
        this.f99736c = baseTextView;
    }
}
