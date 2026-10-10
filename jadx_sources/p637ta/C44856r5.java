package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;

/* JADX INFO: renamed from: ta.r5 */
/* JADX INFO: compiled from: LiteAssetViewAccountDetailHeaderBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44856r5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100749a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatCheckBox f100750b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f100751c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShowHideTextView f100752d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShowHideTextView f100753e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44856r5 m99236a(@NonNull View view) {
        int i11 = R$id.cbHideOrShow;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, i11);
        if (appCompatCheckBox != null) {
            i11 = R$id.tvAmount;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvTotalCoin;
                ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                if (showHideTextView != null) {
                    i11 = R$id.tvTotalValue;
                    ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                    if (showHideTextView2 != null) {
                        return new C44856r5((ConstraintLayout) view, appCompatCheckBox, baseTextView, showHideTextView, showHideTextView2);
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
        return this.f100749a;
    }

    public C44856r5(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatCheckBox appCompatCheckBox, @NonNull BaseTextView baseTextView, @NonNull ShowHideTextView showHideTextView, @NonNull ShowHideTextView showHideTextView2) {
        this.f100749a = constraintLayout;
        this.f100750b = appCompatCheckBox;
        this.f100751c = baseTextView;
        this.f100752d = showHideTextView;
        this.f100753e = showHideTextView2;
    }
}
