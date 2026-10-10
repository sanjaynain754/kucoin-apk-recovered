package l60;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cpiz.android.bubbleview.BubbleTextView;
import com.kubi.resources.widget.AlignTopCheckBox;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.unify.R$id;

/* JADX INFO: renamed from: l60.f */
/* JADX INFO: compiled from: FragmentUnifyTradeExamBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C42111f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f93506a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f93507b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BubbleTextView f93508c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AlignTopCheckBox f93509d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f93510e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RecyclerView f93511f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42111f m92377a(@NonNull View view) {
        int i11 = R$id.btnActive;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.bubbleTips;
            BubbleTextView bubbleTextView = (BubbleTextView) ViewBindings.findChildViewById(view, i11);
            if (bubbleTextView != null) {
                i11 = R$id.checkBox;
                AlignTopCheckBox alignTopCheckBox = (AlignTopCheckBox) ViewBindings.findChildViewById(view, i11);
                if (alignTopCheckBox != null) {
                    i11 = R$id.confirmLayout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout != null) {
                        i11 = R$id.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                        if (recyclerView != null) {
                            return new C42111f((LinearLayoutCompat) view, kcPrimaryButton, bubbleTextView, alignTopCheckBox, constraintLayout, recyclerView);
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
    public LinearLayoutCompat getRoot() {
        return this.f93506a;
    }

    public C42111f(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BubbleTextView bubbleTextView, @NonNull AlignTopCheckBox alignTopCheckBox, @NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView) {
        this.f93506a = linearLayoutCompat;
        this.f93507b = kcPrimaryButton;
        this.f93508c = bubbleTextView;
        this.f93509d = alignTopCheckBox;
        this.f93510e = constraintLayout;
        this.f93511f = recyclerView;
    }
}
