package com.kubi.unify.account;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.unify.R$color;
import com.kubi.unify.R$font;
import com.kubi.unify.R$id;
import com.kubi.unify.R$layout;
import com.kubi.unify.entity.UnifyExam;
import com.kubi.unify.entity.UnifyExamItem;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: UnifyExamAdapter.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/unify/account/UnifyExamAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/unify/entity/UnifyExam;", "Lio/chad/library/adapter/base/BaseViewHolder;", "fragment", "Lcom/kubi/unify/account/UnifyTradeExamFragment;", "<init>", "(Lcom/kubi/unify/account/UnifyTradeExamFragment;)V", "convert", "", "helper", "item", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyExamAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyExamAdapter.kt\ncom/kubi/unify/account/UnifyExamAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1878#2,3:81\n*S KotlinDebug\n*F\n+ 1 UnifyExamAdapter.kt\ncom/kubi/unify/account/UnifyExamAdapter\n*L\n42#1:81,3\n*E\n"})
public final class UnifyExamAdapter extends BaseQuickAdapter<UnifyExam, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final UnifyTradeExamFragment f53118i;

    /* JADX INFO: renamed from: com.kubi.unify.account.UnifyExamAdapter$a */
    /* JADX INFO: compiled from: UnifyExamAdapter.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/unify/account/UnifyExamAdapter$convert$3", "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "isChecked", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nUnifyExamAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyExamAdapter.kt\ncom/kubi/unify/account/UnifyExamAdapter$convert$3\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,80:1\n53#2,4:81\n*S KotlinDebug\n*F\n+ 1 UnifyExamAdapter.kt\ncom/kubi/unify/account/UnifyExamAdapter$convert$3\n*L\n60#1:81,4\n*E\n"})
    public static final class C26473a implements RadioGroupPlus.InterfaceC22946c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UnifyExam f53119a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UnifyExamAdapter f53120b;

        public C26473a(UnifyExam unifyExam, UnifyExamAdapter unifyExamAdapter) {
            this.f53119a = unifyExam;
            this.f53120b = unifyExamAdapter;
        }

        @Override // com.kubi.resources.widget.RadioGroupPlus.InterfaceC22946c
        /* JADX INFO: renamed from: a */
        public void mo16018a(RadioGroupPlus radioGroupPlus, int i11, boolean z11) {
            RadioButton radioButton;
            String str = (String) ((radioGroupPlus == null || (radioButton = (RadioButton) radioGroupPlus.findViewById(i11)) == null) ? null : radioButton.getTag());
            if (str == null) {
                return;
            }
            this.f53119a.setChoose(str);
            if (radioGroupPlus != null) {
                UnifyExam unifyExam = this.f53119a;
                int childCount = radioGroupPlus.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = radioGroupPlus.getChildAt(i12);
                    if (childAt instanceof RadioButton) {
                        RadioButton radioButton2 = (RadioButton) childAt;
                        boolean zAreEqual = Intrinsics.areEqual(radioButton2.getTag(), unifyExam.getRight());
                        if (C27025c.m66566d(Boolean.valueOf(radioButton2.isChecked()))) {
                            C27017c c27017c = C27017c.f54310a;
                            radioButton2.setTextColor(c27017c.m66512a(zAreEqual ? R$color.primary : R$color.secondary));
                            C27046k.m66702q(radioButton2, c27017c.m66512a(zAreEqual ? R$color.primary : R$color.secondary));
                        } else {
                            C27017c c27017c2 = C27017c.f54310a;
                            radioButton2.setTextColor(c27017c2.m66512a(zAreEqual ? R$color.primary : R$color.c_text));
                            C27046k.m66702q(radioButton2, c27017c2.m66512a(zAreEqual ? R$color.primary : R$color.c_icon40));
                        }
                    }
                }
            }
            this.f53120b.f53118i.m64972t4();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyExamAdapter(@NotNull UnifyTradeExamFragment fragment) {
        super(R$layout.unify_item_exam);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f53118i = fragment;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull UnifyExam item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        RadioGroupPlus radioGroupPlus = (RadioGroupPlus) helper.getView(R$id.optionContainer);
        radioGroupPlus.removeAllViews();
        TextView textView = new TextView(this.mContext);
        textView.setTextSize(14.0f);
        textView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
        textView.setTypeface(ResourcesCompat.getFont(textView.getContext(), R$font.semi));
        int i11 = 0;
        textView.setPadding(0, C27040e.m66658b(17), 0, C27040e.m66658b(5));
        textView.setText(helper.getBindingAdapterPosition() + ". " + C27041f.m66668h(item.getTitle()));
        radioGroupPlus.addView(textView);
        List<UnifyExamItem> options = item.getOptions();
        if (options != null) {
            for (Object obj : options) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                UnifyExamItem unifyExamItem = (UnifyExamItem) obj;
                View viewInflate = LayoutInflater.from(this.mContext).inflate(R$layout.unify_item_exam_option, (ViewGroup) null);
                Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.RadioButton");
                RadioButton radioButton = (RadioButton) viewInflate;
                radioButton.setText(unifyExamItem.getLabel());
                radioButton.setTag(unifyExamItem.getValue());
                radioGroupPlus.addView(radioButton, new LinearLayout.LayoutParams(-1, -2));
                i11 = i12;
            }
        }
        radioGroupPlus.setOnCheckedChangeListener(new C26473a(item, this));
        String choose = item.getChoose();
        if (choose == null || choose.length() == 0) {
            return;
        }
        radioGroupPlus.m54743f(((RadioButton) radioGroupPlus.findViewWithTag(item.getChoose())).getId());
    }
}
