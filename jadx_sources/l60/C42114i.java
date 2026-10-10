package l60;

import android.view.View;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.unify.R$id;

/* JADX INFO: renamed from: l60.i */
/* JADX INFO: compiled from: ViewUnifyHideSmallBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C42114i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93539a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CheckBox f93540b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f93541c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42114i m92383a(@NonNull View view) {
        int i11 = R$id.hideSmallCheckBox;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i11);
        if (checkBox != null) {
            i11 = R$id.ivSortView;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                return new C42114i((ConstraintLayout) view, checkBox, appCompatImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f93539a;
    }

    public C42114i(@NonNull ConstraintLayout constraintLayout, @NonNull CheckBox checkBox, @NonNull AppCompatImageView appCompatImageView) {
        this.f93539a = constraintLayout;
        this.f93540b = checkBox;
        this.f93541c = appCompatImageView;
    }
}
