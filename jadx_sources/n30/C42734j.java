package n30;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;

/* JADX INFO: renamed from: n30.j */
/* JADX INFO: compiled from: BtradebaseTradetypeSelectedItemBinding.java */
/* JADX INFO: loaded from: classes48.dex */
public final class C42734j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f94634a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatCheckBox f94635b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f94636c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f94637d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f94638e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f94639f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f94640g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42734j m93639a(@NonNull View view) {
        int i11 = R$id.cbSelect;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, i11);
        if (appCompatCheckBox != null) {
            i11 = R$id.groupHeaderTv;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.ivTypeIcon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.llItemView;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout != null) {
                        i11 = R$id.tvTypeDescription;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvTypeName;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                return new C42734j((ConstraintLayout) view, appCompatCheckBox, baseTextView, appCompatImageView, constraintLayout, baseTextView2, baseTextView3);
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
    public static C42734j m93640c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.btradebase_tradetype_selected_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m93639a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f94634a;
    }

    public C42734j(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatCheckBox appCompatCheckBox, @NonNull BaseTextView baseTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f94634a = constraintLayout;
        this.f94635b = appCompatCheckBox;
        this.f94636c = baseTextView;
        this.f94637d = appCompatImageView;
        this.f94638e = constraintLayout2;
        this.f94639f = baseTextView2;
        this.f94640g = baseTextView3;
    }
}
