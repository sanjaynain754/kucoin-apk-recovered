package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FilterEmojiEditText;

/* JADX INFO: renamed from: ta.t2 */
/* JADX INFO: compiled from: AssetViewWithdrawDescribeBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44867t2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100866a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FilterEmojiEditText f100867b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f100868c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f100869d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f100870e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AlignTopTextView f100871f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AlignTopTextView f100872g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AlignTopTextView f100873h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AlignTopTextView f100874i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f100875j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f100876k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44867t2 m99258a(@NonNull View view) {
        int i11 = R$id.et_remark;
        FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) ViewBindings.findChildViewById(view, i11);
        if (filterEmojiEditText != null) {
            i11 = R$id.iv_remark_arrow;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.ll_remark;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.ll_sub_remark;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat2 != null) {
                        i11 = R$id.tv_desc_0;
                        AlignTopTextView alignTopTextView = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                        if (alignTopTextView != null) {
                            i11 = R$id.tv_desc_1;
                            AlignTopTextView alignTopTextView2 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                            if (alignTopTextView2 != null) {
                                i11 = R$id.tv_desc_2;
                                AlignTopTextView alignTopTextView3 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                if (alignTopTextView3 != null) {
                                    i11 = R$id.tv_desc_3;
                                    AlignTopTextView alignTopTextView4 = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                    if (alignTopTextView4 != null) {
                                        i11 = R$id.tv_desc_title;
                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView != null) {
                                            i11 = R$id.tv_input_status;
                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView2 != null) {
                                                return new C44867t2((ConstraintLayout) view, filterEmojiEditText, imageView, linearLayoutCompat, linearLayoutCompat2, alignTopTextView, alignTopTextView2, alignTopTextView3, alignTopTextView4, baseTextView, baseTextView2);
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
        return this.f100866a;
    }

    public C44867t2(@NonNull ConstraintLayout constraintLayout, @NonNull FilterEmojiEditText filterEmojiEditText, @NonNull ImageView imageView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull AlignTopTextView alignTopTextView, @NonNull AlignTopTextView alignTopTextView2, @NonNull AlignTopTextView alignTopTextView3, @NonNull AlignTopTextView alignTopTextView4, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f100866a = constraintLayout;
        this.f100867b = filterEmojiEditText;
        this.f100868c = imageView;
        this.f100869d = linearLayoutCompat;
        this.f100870e = linearLayoutCompat2;
        this.f100871f = alignTopTextView;
        this.f100872g = alignTopTextView2;
        this.f100873h = alignTopTextView3;
        this.f100874i = alignTopTextView4;
        this.f100875j = baseTextView;
        this.f100876k = baseTextView2;
    }
}
