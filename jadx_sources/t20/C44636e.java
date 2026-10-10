package t20;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.e */
/* JADX INFO: compiled from: BkucoinFragmentKlineMainLiteBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44636e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99040a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C44660q f99041b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f99042c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final HorizontalScrollView f99043d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f99044e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RadioButton f99045f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f99046g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RadioButton f99047h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final RadioGroupPlus f99048i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RadioGroupPlus f99049j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f99050k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44636e m98749a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.coinTick;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 != null) {
            C44660q c44660qM98796a = C44660q.m98796a(viewFindChildViewById2);
            i11 = R$id.fl_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.hsv_type;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i11);
                if (horizontalScrollView != null) {
                    i11 = R$id.layout_type;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout != null) {
                        i11 = R$id.rb_candle;
                        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
                        if (radioButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.rb_divider))) != null) {
                            i11 = R$id.rb_line;
                            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                            if (radioButton2 != null) {
                                i11 = R$id.rgp_time;
                                RadioGroupPlus radioGroupPlus = (RadioGroupPlus) ViewBindings.findChildViewById(view, i11);
                                if (radioGroupPlus != null) {
                                    i11 = R$id.rgp_type;
                                    RadioGroupPlus radioGroupPlus2 = (RadioGroupPlus) ViewBindings.findChildViewById(view, i11);
                                    if (radioGroupPlus2 != null) {
                                        i11 = R$id.tv_hint;
                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView != null) {
                                            return new C44636e((LinearLayout) view, c44660qM98796a, frameLayout, horizontalScrollView, constraintLayout, radioButton, viewFindChildViewById, radioButton2, radioGroupPlus, radioGroupPlus2, baseTextView);
                                        }
                                    }
                                }
                            }
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
        return this.f99040a;
    }

    public C44636e(@NonNull LinearLayout linearLayout, @NonNull C44660q c44660q, @NonNull FrameLayout frameLayout, @NonNull HorizontalScrollView horizontalScrollView, @NonNull ConstraintLayout constraintLayout, @NonNull RadioButton radioButton, @NonNull View view, @NonNull RadioButton radioButton2, @NonNull RadioGroupPlus radioGroupPlus, @NonNull RadioGroupPlus radioGroupPlus2, @NonNull BaseTextView baseTextView) {
        this.f99040a = linearLayout;
        this.f99041b = c44660q;
        this.f99042c = frameLayout;
        this.f99043d = horizontalScrollView;
        this.f99044e = constraintLayout;
        this.f99045f = radioButton;
        this.f99046g = view;
        this.f99047h = radioButton2;
        this.f99048i = radioGroupPlus;
        this.f99049j = radioGroupPlus2;
        this.f99050k = baseTextView;
    }
}
