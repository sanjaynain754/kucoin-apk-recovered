package com.kubi.core.biz.order.record.history;

import android.view.View;
import com.kubi.core.biz.order.record.history.C12033x91e94797;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.tradecorebiz.R$id;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.Iterator;
import java.util.List;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qe0.C43724b;

/* JADX INFO: renamed from: com.kubi.core.biz.order.record.history.CoreDelegationHistoryFilterViewHelper$getTradeModeAccountPopup$2$1 */
/* JADX INFO: compiled from: CoreDelegationHistoryFilterViewHelper.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/core/biz/order/record/history/CoreDelegationHistoryFilterViewHelper$getTradeModeAccountPopup$2$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/resources/widget/drop/FilterType$Filter;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", C33954u6.f72238i, "item", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoreDelegationHistoryFilterViewHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreDelegationHistoryFilterViewHelper.kt\ncom/kubi/core/biz/order/record/history/CoreDelegationHistoryFilterViewHelper$getTradeModeAccountPopup$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,406:1\n1869#2,2:407\n*S KotlinDebug\n*F\n+ 1 CoreDelegationHistoryFilterViewHelper.kt\ncom/kubi/core/biz/order/record/history/CoreDelegationHistoryFilterViewHelper$getTradeModeAccountPopup$2$1\n*L\n116#1:407,2\n*E\n"})
public final class C12033x91e94797 extends BaseQuickAdapter<FilterType.C23032a, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C43724b f20615i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Function1<FilterType.C23032a, Unit> f20616j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C12033x91e94797(C43724b c43724b, Function1<? super FilterType.C23032a, Unit> function1, int i11, List<FilterType.C23032a> list) {
        super(i11, list);
        this.f20615i = c43724b;
        this.f20616j = function1;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(final BaseViewHolder holder, final FilterType.C23032a item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(R$id.tvName, item.getF44544a());
        holder.itemView.setSelected(item.getF44546c());
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final C43724b c43724b = this.f20615i;
        final Function1<FilterType.C23032a, Unit> function1 = this.f20616j;
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: ud.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12033x91e94797.m22233i(holder, this, item, c43724b, function1);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m22233i(BaseViewHolder baseViewHolder, C12033x91e94797 c12033x91e94797, FilterType.C23032a c23032a, C43724b c43724b, Function1 function1) {
        C43852m.m96591c("B5orderList", "filterSite", String.valueOf(baseViewHolder.getLayoutPosition() + 1), null, 8, null);
        List<FilterType.C23032a> data = c12033x91e94797.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            ((FilterType.C23032a) it.next()).mo55155c(false);
        }
        c23032a.mo55155c(true);
        c12033x91e94797.notifyDataSetChanged();
        c43724b.m96331y();
        function1.invoke(c23032a);
        return Unit.INSTANCE;
    }
}
