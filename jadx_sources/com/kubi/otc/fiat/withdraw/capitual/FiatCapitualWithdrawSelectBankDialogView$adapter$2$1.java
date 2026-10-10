package com.kubi.otc.fiat.withdraw.capitual;

import android.view.View;
import com.kubi.otc.R$id;
import com.kubi.otc.entity.FiatCapitualBank;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatCapitualWithdrawSelectBankDialogView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/otc/fiat/withdraw/capitual/FiatCapitualWithdrawSelectBankDialogView$adapter$2$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/otc/entity/FiatCapitualBank;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FiatCapitualWithdrawSelectBankDialogView$adapter$2$1 extends BaseQuickAdapter<FiatCapitualBank, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ FiatCapitualWithdrawSelectBankDialogView f37522i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiatCapitualWithdrawSelectBankDialogView$adapter$2$1(FiatCapitualWithdrawSelectBankDialogView fiatCapitualWithdrawSelectBankDialogView, int i11) {
        super(i11);
        this.f37522i = fiatCapitualWithdrawSelectBankDialogView;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(final BaseViewHolder helper, final FiatCapitualBank item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        final FiatCapitualWithdrawSelectBankDialogView fiatCapitualWithdrawSelectBankDialogView = this.f37522i;
        helper.setText(R$id.tv_code, C27041f.m66668h(item.getIspbCode()));
        helper.setText(R$id.tv_short_name, C27041f.m66668h(item.getShortName()));
        helper.setText(R$id.tv_name, C27041f.m66668h(item.getName()));
        helper.setVisible(R$id.iv_select, Intrinsics.areEqual(item.getIspbCode(), fiatCapitualWithdrawSelectBankDialogView.f37518q0));
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.capitual.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatCapitualWithdrawSelectBankDialogView$adapter$2$1.m44634i(fiatCapitualWithdrawSelectBankDialogView, helper, item);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m44634i(FiatCapitualWithdrawSelectBankDialogView fiatCapitualWithdrawSelectBankDialogView, BaseViewHolder baseViewHolder, FiatCapitualBank fiatCapitualBank) throws Exception {
        BiConsumer biConsumer = fiatCapitualWithdrawSelectBankDialogView.f37520s0;
        if (biConsumer != null) {
            biConsumer.accept(baseViewHolder, fiatCapitualBank);
        }
        fiatCapitualWithdrawSelectBankDialogView.dismiss();
        return Unit.INSTANCE;
    }
}
