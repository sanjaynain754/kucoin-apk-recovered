package p270ft;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.AlignTopCheckBox;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.u */
/* JADX INFO: compiled from: BotcFragmentFiatRechargeCapitualRemindBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37691u implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84680a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f84681b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84682c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84683d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84684e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84685f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84686g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84687h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84688i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84689j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final AlignTopCheckBox f84690k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37691u m84973a(@NonNull View view) {
        int i11 = R$id.iv_remind;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tv_content_1;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tv_content_2;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tv_content_3;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.tv_continue;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null) {
                            i11 = R$id.tv_point_1;
                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView5 != null) {
                                i11 = R$id.tv_point_2;
                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView6 != null) {
                                    i11 = R$id.tv_point_3;
                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView7 != null) {
                                        i11 = R$id.tv_remind;
                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView8 != null) {
                                            i11 = R$id.view_check_next_time;
                                            AlignTopCheckBox alignTopCheckBox = (AlignTopCheckBox) ViewBindings.findChildViewById(view, i11);
                                            if (alignTopCheckBox != null) {
                                                return new C37691u((ConstraintLayout) view, imageView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, alignTopCheckBox);
                                            }
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
    public ConstraintLayout getRoot() {
        return this.f84680a;
    }

    public C37691u(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull AlignTopCheckBox alignTopCheckBox) {
        this.f84680a = constraintLayout;
        this.f84681b = imageView;
        this.f84682c = baseTextView;
        this.f84683d = baseTextView2;
        this.f84684e = baseTextView3;
        this.f84685f = baseTextView4;
        this.f84686g = baseTextView5;
        this.f84687h = baseTextView6;
        this.f84688i = baseTextView7;
        this.f84689j = baseTextView8;
        this.f84690k = alignTopCheckBox;
    }
}
