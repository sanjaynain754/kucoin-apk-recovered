package fj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: fj.l */
/* JADX INFO: compiled from: HomeLayoutPullRefreshBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class C37529l implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83359a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f83360b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f83361c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f83362d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f83363e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f83364f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37529l m84520a(@NonNull View view) {
        int i11 = R$id.ivArrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.ivIcon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.layoutTips;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.loading;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.tvTips;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            return new C37529l((ConstraintLayout) view, imageView, imageView2, linearLayoutCompat, appCompatImageView, baseTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37529l m84521c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.home_layout_pull_refresh, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84520a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83359a;
    }

    public C37529l(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView) {
        this.f83359a = constraintLayout;
        this.f83360b = imageView;
        this.f83361c = imageView2;
        this.f83362d = linearLayoutCompat;
        this.f83363e = appCompatImageView;
        this.f83364f = baseTextView;
    }
}
