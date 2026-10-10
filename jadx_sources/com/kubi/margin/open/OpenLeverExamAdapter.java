package com.kubi.margin.open;

import android.R;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.graphics.drawable.DrawableCompat;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.margin.R$color;
import com.kubi.margin.R$drawable;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.entity.OpenLeverExam;
import com.kubi.margin.entity.OpenLeverExamItem;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OpenLeverExamAdapter.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0002H\u0003J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J\"\u0010\u001f\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001b2\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0013H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/margin/open/OpenLeverExamAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/margin/entity/OpenLeverExam;", "Lio/chad/library/adapter/base/BaseViewHolder;", "fragment", "Lcom/kubi/margin/open/OpenLeverFragment;", "isMarginExam", "", "<init>", "(Lcom/kubi/margin/open/OpenLeverFragment;Z)V", "getFragment", "()Lcom/kubi/margin/open/OpenLeverFragment;", "convert", "", "helper", "item", "createTitleView", "Landroid/widget/TextView;", ViewProps.POSITION, "", "createOptionButton", "Landroid/widget/RadioButton;", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "Lcom/kubi/margin/entity/OpenLeverExamItem;", "rightValue", "", "parent", "Lcom/kubi/resources/widget/RadioGroupPlus;", "buildIconTint", "Landroid/content/res/ColorStateList;", "isCorrectStyle", "onOptionSelected", "group", "checkedId", "createOptionLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "index", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOpenLeverExamAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenLeverExamAdapter.kt\ncom/kubi/margin/open/OpenLeverExamAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1878#2,3:104\n1#3:107\n*S KotlinDebug\n*F\n+ 1 OpenLeverExamAdapter.kt\ncom/kubi/margin/open/OpenLeverExamAdapter\n*L\n33#1:104,3\n*E\n"})
public final class OpenLeverExamAdapter extends BaseQuickAdapter<OpenLeverExam, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final OpenLeverFragment f33595i;

    /* JADX INFO: renamed from: j */
    public final boolean f33596j;

    /* JADX INFO: renamed from: com.kubi.margin.open.OpenLeverExamAdapter$a */
    /* JADX INFO: compiled from: OpenLeverExamAdapter.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/margin/open/OpenLeverExamAdapter$convert$2", "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "isChecked", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18119a implements RadioGroupPlus.InterfaceC22946c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OpenLeverExam f33598b;

        public C18119a(OpenLeverExam openLeverExam) {
            this.f33598b = openLeverExam;
        }

        @Override // com.kubi.resources.widget.RadioGroupPlus.InterfaceC22946c
        /* JADX INFO: renamed from: a */
        public void mo16018a(RadioGroupPlus radioGroupPlus, int i11, boolean z11) {
            OpenLeverExamAdapter.this.m39435m(radioGroupPlus, i11, this.f33598b);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m39435m(RadioGroupPlus radioGroupPlus, int i11, OpenLeverExam openLeverExam) {
        RadioButton radioButton;
        RadioButton radioButton2;
        Object tag = (radioGroupPlus == null || (radioButton2 = (RadioButton) radioGroupPlus.findViewById(i11)) == null) ? null : radioButton2.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            return;
        }
        openLeverExam.setChoose(str);
        if (!this.f33596j && openLeverExam.getRight() != null && (radioButton = (RadioButton) radioGroupPlus.findViewWithTag(openLeverExam.getRight())) != null) {
            radioButton.setActivated(!Intrinsics.areEqual(str, openLeverExam.getRight()));
        }
        this.f33595i.m39512Z3();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenLeverExamAdapter(@NotNull OpenLeverFragment fragment, boolean z11) {
        super(R$layout.bmargin_item_open_lever_exam);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f33595i = fragment;
        this.f33596j = z11;
    }

    /* JADX INFO: renamed from: h */
    public final ColorStateList m39430h(boolean z11) {
        C27017c c27017c = C27017c.f54310a;
        int iM66512a = c27017c.m66512a(R$color.primary);
        return z11 ? new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{iM66512a, iM66512a}) : new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{c27017c.m66512a(R$color.secondary), iM66512a});
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable OpenLeverExam openLeverExam) {
        RadioButton radioButton;
        if (baseViewHolder == null || openLeverExam == null) {
            return;
        }
        RadioGroupPlus radioGroupPlus = (RadioGroupPlus) baseViewHolder.getView(R$id.rgp);
        radioGroupPlus.removeAllViews();
        radioGroupPlus.addView(m39434l(baseViewHolder.getAdapterPosition(), openLeverExam));
        List<OpenLeverExamItem> options = openLeverExam.getOptions();
        if (options != null) {
            int i11 = 0;
            for (Object obj : options) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String right = openLeverExam.getRight();
                Intrinsics.checkNotNull(radioGroupPlus);
                radioGroupPlus.addView(m39432j((OpenLeverExamItem) obj, right, radioGroupPlus), m39433k(i11));
                i11 = i12;
            }
        }
        radioGroupPlus.setOnCheckedChangeListener(new C18119a(openLeverExam));
        String choose = openLeverExam.getChoose();
        if (choose == null || choose.length() == 0 || (radioButton = (RadioButton) radioGroupPlus.findViewWithTag(openLeverExam.getChoose())) == null) {
            return;
        }
        radioGroupPlus.m54743f(radioButton.getId());
    }

    /* JADX INFO: renamed from: j */
    public final RadioButton m39432j(OpenLeverExamItem openLeverExamItem, String str, RadioGroupPlus radioGroupPlus) {
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R$layout.bmargin_item_open_lever_option, (ViewGroup) radioGroupPlus, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.RadioButton");
        RadioButton radioButton = (RadioButton) viewInflate;
        radioButton.setText(openLeverExamItem.getLabel());
        radioButton.setTag(openLeverExamItem.getValue());
        boolean z11 = this.f33596j || Intrinsics.areEqual(openLeverExamItem.getValue(), str);
        Drawable[] compoundDrawablesRelative = radioButton.getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "getCompoundDrawablesRelative(...)");
        Drawable drawable = (Drawable) ArraysKt.getOrNull(compoundDrawablesRelative, 0);
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, m39430h(z11));
        }
        radioButton.setBackground(C27017c.m66510d(C27017c.f54310a, z11 ? R$drawable.bmargin_selector_bg_exam_item_correct : R$drawable.bmargin_selector_bg_exam_item_incorrect, null, 2, null));
        return radioButton;
    }

    /* JADX INFO: renamed from: k */
    public final LinearLayout.LayoutParams m39433k(int i11) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = C5275i0.m6236a(i11 == 0 ? 8.0f : 4.0f);
        return layoutParams;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: l */
    public final TextView m39434l(int i11, OpenLeverExam openLeverExam) {
        TextView textView = new TextView(this.mContext);
        textView.setTextSize(14.0f);
        textView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
        textView.setText((i11 + 1) + '.' + C27041f.m66668h(openLeverExam.getTitle()));
        return textView;
    }
}
