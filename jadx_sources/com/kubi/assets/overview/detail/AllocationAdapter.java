package com.kubi.assets.overview.detail;

import android.annotation.SuppressLint;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.CurrencyBusinessDistributionTypeEnum;
import com.kubi.assets.entity.CurrencyDistributionItemResponse;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AllocationAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0014\u001a\u00020\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00120\u0011J\u001c\u0010\u0016\u001a\u00020\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00120\u0011J\u0014\u0010\u0017\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fJ\u0006\u0010\u0019\u001a\u00020\u0012J\u001c\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/assets/overview/detail/AllocationAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", FirebaseAnalytics.Param.CURRENCY, "", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "isExpanded", "", "fullData", "", "onGoingClickListener", "Lkotlin/Function1;", "", "onItemClickListener", "setOnItemClickListener", TUIConstants.TUIChat.CALL_BACK, "setOnGoingItemClickListener", "setDataWithLimit", "data", "toggleExpand", "convert", "helper", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAllocationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllocationAdapter.kt\ncom/kubi/assets/overview/detail/AllocationAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
public final class AllocationAdapter extends BaseQuickAdapter<CurrencyDistributionItemResponse, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public String f18300i;

    /* JADX INFO: renamed from: j */
    public boolean f18301j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public List<CurrencyDistributionItemResponse> f18302k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Function1<? super String, Unit> f18303l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public Function1<? super String, Unit> f18304m;

    public AllocationAdapter() {
        super(R$layout.asset_coin_detail_allocation_item);
        this.f18302k = CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m18522j(CurrencyDistributionItemResponse currencyDistributionItemResponse, AllocationAdapter allocationAdapter) {
        CurrencyBusinessDistributionTypeEnum businessType;
        CurrencyBusinessDistributionTypeEnum businessType2;
        String trackerName = null;
        CoinDetailTracker.f18371a.m18637e(C27041f.m66668h((currencyDistributionItemResponse == null || (businessType2 = currencyDistributionItemResponse.getBusinessType()) == null) ? null : businessType2.getTrackerName()));
        Function1<? super String, Unit> function1 = allocationAdapter.f18303l;
        if (function1 != null) {
            if (currencyDistributionItemResponse != null && (businessType = currencyDistributionItemResponse.getBusinessType()) != null) {
                trackerName = businessType.getTrackerName();
            }
            function1.invoke(trackerName);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m18523k(AllocationAdapter allocationAdapter, CurrencyDistributionItemResponse currencyDistributionItemResponse) {
        CurrencyBusinessDistributionTypeEnum businessType;
        Function1<? super String, Unit> function1 = allocationAdapter.f18304m;
        if (function1 != null) {
            function1.invoke((currencyDistributionItemResponse == null || (businessType = currencyDistributionItemResponse.getBusinessType()) == null) ? null : businessType.getRouteName());
        }
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable final CurrencyDistributionItemResponse currencyDistributionItemResponse) {
        View view;
        BigDecimal totalAmount;
        String strM89933g;
        BigDecimal totalAmount2;
        CurrencyBusinessDistributionTypeEnum businessType;
        String colorString;
        CircularProgressView circularProgressView;
        CircularProgressView circularProgressView2;
        BigDecimal proportion;
        CurrencyBusinessDistributionTypeEnum businessType2;
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.account_name, (currencyDistributionItemResponse == null || (businessType2 = currencyDistributionItemResponse.getBusinessType()) == null) ? null : C27017c.f54310a.m66516f(businessType2.getNickNameRes(), new Object[0]));
        }
        if (baseViewHolder != null && (circularProgressView2 = (CircularProgressView) baseViewHolder.getView(R$id.circular_view)) != null) {
            circularProgressView2.m18601a(C27039d.m66649i((currencyDistributionItemResponse == null || (proportion = currencyDistributionItemResponse.getProportion()) == null) ? null : Float.valueOf(proportion.floatValue()), 0.0f, 1, null), currencyDistributionItemResponse != null ? currencyDistributionItemResponse.getTotalAmount() : null);
        }
        if (currencyDistributionItemResponse != null && (businessType = currencyDistributionItemResponse.getBusinessType()) != null && (colorString = businessType.getColorString()) != null && baseViewHolder != null && (circularProgressView = (CircularProgressView) baseViewHolder.getView(R$id.circular_view)) != null) {
            circularProgressView.setProgressColor(colorString);
        }
        String str = "--";
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.coin_amount, C27041f.m66669i((currencyDistributionItemResponse == null || (totalAmount2 = currencyDistributionItemResponse.getTotalAmount()) == null) ? null : C37885i.m85563b(totalAmount2, this.f18300i, 0, 2, null), "--"));
        }
        if (baseViewHolder != null) {
            int i11 = R$id.coin_value;
            if (currencyDistributionItemResponse != null && (totalAmount = currencyDistributionItemResponse.getTotalAmount()) != null && (strM89933g = C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89940n(totalAmount, this.f18300i))), null, null, 0, false, true, true, 15, null)) != null) {
                str = strM89933g;
            }
            baseViewHolder.setText(i11, str);
        }
        ShapeTextView shapeTextView = baseViewHolder != null ? (ShapeTextView) baseViewHolder.getView(R$id.ongoing_label) : null;
        if (shapeTextView != null) {
            AssetExKt.m15138z(shapeTextView, C27025c.m66566d(currencyDistributionItemResponse != null ? currencyDistributionItemResponse.isShowOnGoing() : null));
        }
        if ((currencyDistributionItemResponse != null ? currencyDistributionItemResponse.getOnGoingCount() : null) != null && shapeTextView != null) {
            shapeTextView.setText(C27017c.f54310a.m66516f(R$string.kc_assets_ongoing, new Object[0]) + ": " + currencyDistributionItemResponse.getOnGoingCount());
        }
        if (shapeTextView != null) {
            C27046k.m66711z(shapeTextView, 0L, new Function0() { // from class: com.kubi.assets.overview.detail.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AllocationAdapter.m18522j(currencyDistributionItemResponse, this);
                }
            }, 1, null);
        }
        if (baseViewHolder == null || (view = baseViewHolder.getView(R$id.root_layout)) == null) {
            return;
        }
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.assets.overview.detail.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AllocationAdapter.m18523k(this.f18338b, currencyDistributionItemResponse);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m18525l(@Nullable String str) {
        this.f18300i = str;
    }

    /* JADX INFO: renamed from: m */
    public final void m18526m(@NotNull List<CurrencyDistributionItemResponse> data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f18302k = data;
        if (data.size() > 3 && !this.f18301j) {
            data = CollectionsKt.take(data, 3);
        }
        setNewData(CollectionsKt.toMutableList((Collection) data));
        CoinDetailTracker.f18371a.m18638f(data);
    }

    /* JADX INFO: renamed from: n */
    public final void m18527n(@NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f18303l = callback;
    }

    /* JADX INFO: renamed from: o */
    public final void m18528o(@NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f18304m = callback;
    }

    /* JADX INFO: renamed from: p */
    public final void m18529p() {
        boolean z11 = this.f18301j;
        this.f18301j = !z11;
        setNewData(CollectionsKt.toMutableList((Collection) (!z11 ? this.f18302k : CollectionsKt.take(this.f18302k, 3))));
    }
}
