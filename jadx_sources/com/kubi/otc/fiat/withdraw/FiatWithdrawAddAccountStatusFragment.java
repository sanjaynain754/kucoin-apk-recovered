package com.kubi.otc.fiat.withdraw;

import android.os.Bundle;
import android.view.View;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatWithdrawAddAccountStatusFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAddAccountStatusFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FiatWithdrawAddAccountStatusFragment extends OldBaseFragment {
    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_fiat_withdraw_add_acount_status;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        View viewFindViewById = findViewById(R$id.tv_continue);
        if (viewFindViewById != null) {
            C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.z0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatWithdrawAddAccountStatusFragment.m44462l3(this.f37649b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: l3 */
    public static final Unit m44462l3(FiatWithdrawAddAccountStatusFragment fiatWithdrawAddAccountStatusFragment) {
        fiatWithdrawAddAccountStatusFragment.preformBackPressed();
        return Unit.INSTANCE;
    }
}
