package com.kubi.assets.bill;

import android.os.Bundle;
import android.view.View;
import com.kubi.assets.entity.FinanceBillItemEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountBillFinanceItemDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillFinanceItemDetailFragment;", "Lcom/kubi/assets/bill/AccountBillBaseItemDetailFragment;", "<init>", "()V", "inputData", "Lcom/kubi/assets/entity/FinanceBillItemEntity;", "getInputData", "()Lcom/kubi/assets/entity/FinanceBillItemEntity;", "inputData$delegate", "Lkotlin/Lazy;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AccountBillFinanceItemDetailFragment extends AccountBillBaseItemDetailFragment {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f16647X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.o0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AccountBillFinanceItemDetailFragment.m15604r3(this.f16785b);
        }
    });

    @Override // com.kubi.assets.bill.AccountBillBaseItemDetailFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        m15513o3(m15605q3());
        super.onViewCreated(view, savedInstanceState);
    }

    /* JADX INFO: renamed from: q3 */
    public final FinanceBillItemEntity m15605q3() {
        return (FinanceBillItemEntity) this.f16647X.getValue();
    }

    /* JADX INFO: renamed from: r3 */
    public static final FinanceBillItemEntity m15604r3(AccountBillFinanceItemDetailFragment accountBillFinanceItemDetailFragment) {
        Bundle arguments = accountBillFinanceItemDetailFragment.getArguments();
        if (arguments != null) {
            return (FinanceBillItemEntity) arguments.getParcelable("data");
        }
        return null;
    }
}
