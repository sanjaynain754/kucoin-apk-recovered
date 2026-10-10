package ma;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.app.country.R$id;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;

/* JADX INFO: renamed from: ma.a */
/* JADX INFO: compiled from: BusercenterActivityChooseAreaBinding.java */
/* JADX INFO: loaded from: classes64.dex */
public final class C42495a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f94151a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f94152b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f94153c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f94154d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f94155e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AlertTipsTextView f94156f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42495a m93179a(@NonNull View view) {
        int i11 = R$id.et_search;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.ivClose;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.f15610rv;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.tv_close;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_tips;
                        AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                        if (alertTipsTextView != null) {
                            return new C42495a((LinearLayout) view, clearEditText, imageView, recyclerView, baseTextView, alertTipsTextView);
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
    public LinearLayout getRoot() {
        return this.f94151a;
    }

    public C42495a(@NonNull LinearLayout linearLayout, @NonNull ClearEditText clearEditText, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull AlertTipsTextView alertTipsTextView) {
        this.f94151a = linearLayout;
        this.f94152b = clearEditText;
        this.f94153c = imageView;
        this.f94154d = recyclerView;
        this.f94155e = baseTextView;
        this.f94156f = alertTipsTextView;
    }
}
