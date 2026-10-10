package com.kubi.payment.fasttradev2.buy.confirm.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.util.TypedValueCompat;
import com.kubi.payment.fast.data.entities.BuyPreviewOrder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BuyFeeLayout.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFeeLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "bindData", "", "feeInfoList", "", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyFeeInfo;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyFeeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyFeeLayout.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFeeLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1878#2,3:37\n*S KotlinDebug\n*F\n+ 1 BuyFeeLayout.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFeeLayout\n*L\n22#1:37,3\n*E\n"})
public final class BuyFeeLayout extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyFeeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyFeeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public final void m47743a(@Nullable List<BuyPreviewOrder.Response.BuyFeeInfo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        removeAllViews();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BuyFeeItemView buyFeeItemView = new BuyFeeItemView(context);
            buyFeeItemView.m47742a((BuyPreviewOrder.Response.BuyFeeInfo) obj);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.topMargin = (i11 == 0 ? 0 : Float.valueOf(TypedValueCompat.dpToPx(8.0f, getResources().getDisplayMetrics()))).intValue();
            Unit unit = Unit.INSTANCE;
            addView(buyFeeItemView, marginLayoutParams);
            i11 = i12;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyFeeLayout(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
