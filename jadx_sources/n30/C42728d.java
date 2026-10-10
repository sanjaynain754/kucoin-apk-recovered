package n30;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradebase.R$id;

/* JADX INFO: renamed from: n30.d */
/* JADX INFO: compiled from: BtradebaseDialogKlineSettingsNewBinding.java */
/* JADX INFO: loaded from: classes48.dex */
public final class C42728d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f94594a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f94595b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f94596c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f94597d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Group f94598e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final CheckBox f94599f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final CheckBox f94600g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f94601h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f94602i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42728d m93627a(@NonNull View view) {
        int i11 = R$id.dialog_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.dialog_title;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.dialog_trading_display;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.draw_tools_group;
                    Group group = (Group) ViewBindings.findChildViewById(view, i11);
                    if (group != null) {
                        i11 = R$id.history_order;
                        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i11);
                        if (checkBox != null) {
                            i11 = R$id.open_order;
                            CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, i11);
                            if (checkBox2 != null) {
                                i11 = R$id.tvDrawTool;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.tvDrawToolTitle;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null) {
                                        return new C42728d((ConstraintLayout) view, imageView, baseTextView, baseTextView2, group, checkBox, checkBox2, baseTextView3, baseTextView4);
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
    public ConstraintLayout getRoot() {
        return this.f94594a;
    }

    public C42728d(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull Group group, @NonNull CheckBox checkBox, @NonNull CheckBox checkBox2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f94594a = constraintLayout;
        this.f94595b = imageView;
        this.f94596c = baseTextView;
        this.f94597d = baseTextView2;
        this.f94598e = group;
        this.f94599f = checkBox;
        this.f94600g = checkBox2;
        this.f94601h = baseTextView3;
        this.f94602i = baseTextView4;
    }
}
