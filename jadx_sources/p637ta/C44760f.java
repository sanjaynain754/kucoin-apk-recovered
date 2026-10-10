package p637ta;

import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.f */
/* JADX INFO: compiled from: AssetAccountBillFutureFilterBarBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44760f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final HorizontalScrollView f99853a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f99854b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f99855c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99856d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99857e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44760f m99034a(@NonNull View view) {
        int i11 = R$id.selectCoin;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.selectSides;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.selectTime;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.selectType;
                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView4 != null) {
                        return new C44760f((HorizontalScrollView) view, baseTextView, baseTextView2, baseTextView3, baseTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public HorizontalScrollView getRoot() {
        return this.f99853a;
    }

    public C44760f(@NonNull HorizontalScrollView horizontalScrollView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f99853a = horizontalScrollView;
        this.f99854b = baseTextView;
        this.f99855c = baseTextView2;
        this.f99856d = baseTextView3;
        this.f99857e = baseTextView4;
    }
}
