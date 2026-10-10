package com.kubi.assets.dialog.payment;

import com.kubi.assets.R$layout;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetMultiPaymentContentAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/AssetMultiPaymentContentAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/dialog/payment/MergeGroupItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "tradeType", "", "itemClick", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getTradeType", "()Ljava/lang/String;", "getItemClick", "()Lkotlin/jvm/functions/Function0;", "updateData", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/assets/dialog/payment/AssetPaymentListConfig;", "convert", "helper", "item", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetMultiPaymentContentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetMultiPaymentContentAdapter.kt\ncom/kubi/assets/dialog/payment/AssetMultiPaymentContentAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,258:1\n1869#2,2:259\n*S KotlinDebug\n*F\n+ 1 AssetMultiPaymentContentAdapter.kt\ncom/kubi/assets/dialog/payment/AssetMultiPaymentContentAdapter\n*L\n41#1:259,2\n*E\n"})
public final class AssetMultiPaymentContentAdapter extends BaseQuickAdapter<MergeGroupItem, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f17151i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final Function0<Unit> f17152j;

    public AssetMultiPaymentContentAdapter(@Nullable String str, @Nullable Function0<Unit> function0) {
        super(R$layout.asset_multi_payment_dialog_item_group, new ArrayList());
        this.f17151i = str;
        this.f17152j = function0;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m16317j(AssetMultiPaymentContentAdapter assetMultiPaymentContentAdapter, AssetPaymentListItem item, boolean z11) {
        Intrinsics.checkNotNullParameter(item, "item");
        AssetPaymentLastUseHelper.f17185a.m16378d(assetMultiPaymentContentAdapter.f17151i, item.getPaymentMethodCode());
        C9829d.m16373c(item.getRedirectUrl(), item.getPaymentMethodCode(), assetMultiPaymentContentAdapter.f17151i, z11);
        Function0<Unit> function0 = assetMultiPaymentContentAdapter.f17152j;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull MergeGroupItem item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        item.m16379a(helper);
    }

    /* JADX INFO: renamed from: i */
    public final void m16319i(@Nullable AssetPaymentListConfig assetPaymentListConfig) {
        if (assetPaymentListConfig == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<AssetPaymentListGroup> paymentMethod = assetPaymentListConfig.getPaymentMethod();
        if (paymentMethod != null) {
            for (AssetPaymentListGroup assetPaymentListGroup : paymentMethod) {
                List<AssetPaymentListItem> paymentMethodList = assetPaymentListGroup.getPaymentMethodList();
                if (paymentMethodList != null && !paymentMethodList.isEmpty()) {
                    arrayList.add(new MergeGroupItem(assetPaymentListGroup, this.f17151i, new Function2() { // from class: com.kubi.assets.dialog.payment.c
                        @Override // p852kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AssetMultiPaymentContentAdapter.m16317j(this.f17179b, (AssetPaymentListItem) obj, ((Boolean) obj2).booleanValue());
                        }
                    }));
                }
            }
        }
        setNewData(arrayList);
    }
}
