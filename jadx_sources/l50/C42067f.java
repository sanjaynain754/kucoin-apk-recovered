package l50;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.f */
/* JADX INFO: compiled from: BtradingBotKitDialogBeginnerGuideBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42067f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f92683a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Button f92684b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Button f92685c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f92686d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatTextView f92687e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f92688f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatTextView f92689g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42067f m92285a(@NonNull View view) {
        int i11 = R$id.button_next;
        Button button = (Button) ViewBindings.findChildViewById(view, i11);
        if (button != null) {
            i11 = R$id.button_pre;
            Button button2 = (Button) ViewBindings.findChildViewById(view, i11);
            if (button2 != null) {
                i11 = R$id.fl_container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout != null) {
                    i11 = R$id.tv_step_number;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatTextView != null) {
                        i11 = R$id.tv_title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView != null) {
                            i11 = R$id.tv_video_guide;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatTextView2 != null) {
                                return new C42067f((ConstraintLayout) view, button, button2, frameLayout, appCompatTextView, textView, appCompatTextView2);
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
    public ConstraintLayout getRoot() {
        return this.f92683a;
    }

    public C42067f(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull Button button2, @NonNull FrameLayout frameLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull TextView textView, @NonNull AppCompatTextView appCompatTextView2) {
        this.f92683a = constraintLayout;
        this.f92684b = button;
        this.f92685c = button2;
        this.f92686d = frameLayout;
        this.f92687e = appCompatTextView;
        this.f92688f = textView;
        this.f92689g = appCompatTextView2;
    }
}
