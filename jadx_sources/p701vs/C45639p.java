package p701vs;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.kubi.operation.lib.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: vs.p */
/* JADX INFO: compiled from: OperationWidgetLearnBinding.java */
/* JADX INFO: loaded from: classes32.dex */
public final class C45639p implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f102892a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Group f102893b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f102894c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f102895d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f102896e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f102897f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f102898g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f102899h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f102900i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45639p m100769a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i11 = R$id.groupContent;
        Group group = (Group) ViewBindings.findChildViewById(view, i11);
        if (group != null) {
            i11 = R$id.ivImage;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.shimmerLearn;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.tvTips;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvTitle;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.f36610v1))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.f36611v2))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.f36612v3))) != null) {
                            return new C45639p((MaterialCardView) view, group, appCompatImageView, linearLayoutCompat, baseTextView, baseTextView2, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3);
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
    public MaterialCardView getRoot() {
        return this.f102892a;
    }

    public C45639p(@NonNull MaterialCardView materialCardView, @NonNull Group group, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f102892a = materialCardView;
        this.f102893b = group;
        this.f102894c = appCompatImageView;
        this.f102895d = linearLayoutCompat;
        this.f102896e = baseTextView;
        this.f102897f = baseTextView2;
        this.f102898g = view;
        this.f102899h = view2;
        this.f102900i = view3;
    }
}
