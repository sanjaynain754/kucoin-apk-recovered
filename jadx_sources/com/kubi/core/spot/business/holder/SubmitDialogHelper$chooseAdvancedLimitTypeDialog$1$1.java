package com.kubi.core.spot.business.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.core.spot.entity.AdvancedLimitItemEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.tradecorebiz.R$id;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SubmitDialogHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/core/spot/business/holder/SubmitDialogHelper$chooseAdvancedLimitTypeDialog$1$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/core/spot/entity/AdvancedLimitItemEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SubmitDialogHelper$chooseAdvancedLimitTypeDialog$1$1 extends BaseQuickAdapter<AdvancedLimitItemEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ DialogFragmentHelper f21096i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Function1<AdvancedLimitItemEntity, Unit> f21097j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubmitDialogHelper$chooseAdvancedLimitTypeDialog$1$1(List<AdvancedLimitItemEntity> list, DialogFragmentHelper dialogFragmentHelper, Function1<? super AdvancedLimitItemEntity, Unit> function1, int i11) {
        super(i11, list);
        this.f21096i = dialogFragmentHelper;
        this.f21097j = function1;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final AdvancedLimitItemEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        final DialogFragmentHelper dialogFragmentHelper = this.f21096i;
        final Function1<AdvancedLimitItemEntity, Unit> function1 = this.f21097j;
        ((TextView) helper.getView(R$id.tv_title)).setText(item.getTitle());
        ((TextView) helper.getView(R$id.tv_desc)).setText(item.getDesc());
        helper.getView(R$id.view_item).setSelected(item.isSelect());
        ((ImageView) helper.getView(R$id.iv_check)).setVisibility(item.isSelect() ? 0 : 4);
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.core.spot.business.holder.j3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubmitDialogHelper$chooseAdvancedLimitTypeDialog$1$1.m23249i(dialogFragmentHelper, function1, item);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m23249i(DialogFragmentHelper dialogFragmentHelper, Function1 function1, AdvancedLimitItemEntity advancedLimitItemEntity) {
        dialogFragmentHelper.dismiss();
        function1.invoke(advancedLimitItemEntity);
        return Unit.INSTANCE;
    }
}
