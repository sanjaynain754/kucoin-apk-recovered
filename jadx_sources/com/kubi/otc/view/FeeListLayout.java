package com.kubi.otc.view;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.kubi.otc.R$color;
import com.kubi.otc.R$font;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.MultiFee;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FeeListLayout.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/otc/view/FeeListLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bindData", "", "feeList", "", "Lcom/kubi/otc/entity/MultiFee;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFeeListLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeeListLayout.kt\ncom/kubi/otc/view/FeeListLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n1869#2,2:50\n*S KotlinDebug\n*F\n+ 1 FeeListLayout.kt\ncom/kubi/otc/view/FeeListLayout\n*L\n29#1:50,2\n*E\n"})
public final class FeeListLayout extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeeListLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeeListLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public final void m45500a(@Nullable List<MultiFee> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        removeAllViews();
        for (MultiFee multiFee : list) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BaseTextView baseTextView = new BaseTextView(context);
            baseTextView.setTextSize(2, 14.0f);
            baseTextView.setTextColor(ContextCompat.getColor(baseTextView.getContext(), R$color.c_text40));
            baseTextView.setLineSpacing(1.3f, 1.3f);
            baseTextView.setTypeface(ResourcesCompat.getFont(baseTextView.getContext(), R$font.regular));
            baseTextView.setText(getContext().getString(R$string.payment_fee_message, multiFee.getTips(), multiFee.getFeeMsg()));
            HighlightTextHelper.f43497a.m54120f(baseTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(ContextCompat.getColor(getContext(), R$color.c_text))));
            addView(baseTextView, new LinearLayout.LayoutParams(-2, -2));
        }
    }
}
