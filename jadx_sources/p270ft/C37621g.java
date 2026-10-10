package p270ft;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.AlignTopCheckBox;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.resources.widget.PrefixTextView;

/* JADX INFO: renamed from: ft.g */
/* JADX INFO: compiled from: BotcFragmentCapitualKycBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37621g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83887a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AlignTopCheckBox f83888b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FilterEmojiEditText f83889c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FilterEmojiEditText f83890d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FilterEmojiEditText f83891e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f83892f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f83893g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f83894h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final PrefixTextView f83895i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final PrefixTextView f83896j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final PrefixTextView f83897k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f83898l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f83899m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final View f83900n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37621g m84822a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.cb_terms;
        AlignTopCheckBox alignTopCheckBox = (AlignTopCheckBox) ViewBindings.findChildViewById(view, i11);
        if (alignTopCheckBox != null) {
            i11 = R$id.et_email;
            FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) ViewBindings.findChildViewById(view, i11);
            if (filterEmojiEditText != null) {
                i11 = R$id.et_full_name;
                FilterEmojiEditText filterEmojiEditText2 = (FilterEmojiEditText) ViewBindings.findChildViewById(view, i11);
                if (filterEmojiEditText2 != null) {
                    i11 = R$id.et_phone_number;
                    FilterEmojiEditText filterEmojiEditText3 = (FilterEmojiEditText) ViewBindings.findChildViewById(view, i11);
                    if (filterEmojiEditText3 != null) {
                        i11 = R$id.ll_phone_number;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout != null) {
                            i11 = R$id.tv_choose_phone_code;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tv_confirm;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tv_email;
                                    PrefixTextView prefixTextView = (PrefixTextView) ViewBindings.findChildViewById(view, i11);
                                    if (prefixTextView != null) {
                                        i11 = R$id.tv_full_name;
                                        PrefixTextView prefixTextView2 = (PrefixTextView) ViewBindings.findChildViewById(view, i11);
                                        if (prefixTextView2 != null) {
                                            i11 = R$id.tv_phone_number;
                                            PrefixTextView prefixTextView3 = (PrefixTextView) ViewBindings.findChildViewById(view, i11);
                                            if (prefixTextView3 != null) {
                                                i11 = R$id.tv_tip;
                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView3 != null) {
                                                    i11 = R$id.tv_title;
                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_divider))) != null) {
                                                        return new C37621g((ConstraintLayout) view, alignTopCheckBox, filterEmojiEditText, filterEmojiEditText2, filterEmojiEditText3, linearLayout, baseTextView, baseTextView2, prefixTextView, prefixTextView2, prefixTextView3, baseTextView3, baseTextView4, viewFindChildViewById);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83887a;
    }

    public C37621g(@NonNull ConstraintLayout constraintLayout, @NonNull AlignTopCheckBox alignTopCheckBox, @NonNull FilterEmojiEditText filterEmojiEditText, @NonNull FilterEmojiEditText filterEmojiEditText2, @NonNull FilterEmojiEditText filterEmojiEditText3, @NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull PrefixTextView prefixTextView, @NonNull PrefixTextView prefixTextView2, @NonNull PrefixTextView prefixTextView3, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull View view) {
        this.f83887a = constraintLayout;
        this.f83888b = alignTopCheckBox;
        this.f83889c = filterEmojiEditText;
        this.f83890d = filterEmojiEditText2;
        this.f83891e = filterEmojiEditText3;
        this.f83892f = linearLayout;
        this.f83893g = baseTextView;
        this.f83894h = baseTextView2;
        this.f83895i = prefixTextView;
        this.f83896j = prefixTextView2;
        this.f83897k = prefixTextView3;
        this.f83898l = baseTextView3;
        this.f83899m = baseTextView4;
        this.f83900n = view;
    }
}
