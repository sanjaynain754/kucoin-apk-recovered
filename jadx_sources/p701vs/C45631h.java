package p701vs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.operation.lib.R$id;
import com.kubi.operation.lib.R$layout;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: vs.h */
/* JADX INFO: compiled from: OperationItemBonusTaskBinding.java */
/* JADX INFO: loaded from: classes32.dex */
public final class C45631h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f102842a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f102843b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f102844c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f102845d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45631h m100747a(@NonNull View view) {
        int i11 = R$id.tvSummary;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tvTitle;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.tvValue;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    return new C45631h((LinearLayoutCompat) view, baseTextView, baseTextView2, baseTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C45631h m100748c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.operation_item_bonus_task, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m100747a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f102842a;
    }

    public C45631h(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f102842a = linearLayoutCompat;
        this.f102843b = baseTextView;
        this.f102844c = baseTextView2;
        this.f102845d = baseTextView3;
    }
}
