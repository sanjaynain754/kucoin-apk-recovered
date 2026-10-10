package g60;

import android.content.Context;
import com.kubi.data.coin.AccountType;
import com.kubi.transfer.lib.R$string;
import com.kubi.unify.api.IUnifyAccountService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: g60.d */
/* JADX INFO: compiled from: TransferUnifiedTipExt.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000¨\u0006\u0005"}, m90084d2 = {"getUnifiedUnSupportTip", "", "Lcom/kubi/data/coin/AccountType;", "context", "Landroid/content/Context;", "TransferLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37828d {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m85385a(@NotNull AccountType accountType, @Nullable Context context) {
        Intrinsics.checkNotNullParameter(accountType, "<this>");
        IUnifyAccountService.Companion companion = IUnifyAccountService.f53155a;
        if (companion.get().mo64979C() && accountType == AccountType.TRADE) {
            if (context != null) {
                return context.getString(R$string.alert_unify_spot_trading_no_asset_upgrade);
            }
            return null;
        }
        if (companion.get().mo64979C() && accountType == AccountType.CONTRACT) {
            if (context != null) {
                return context.getString(R$string.alert_unify_contract_trading_no_asset_upgrade);
            }
            return null;
        }
        if (companion.get().mo64979C() || accountType != AccountType.UNIFIED || context == null) {
            return null;
        }
        return context.getString(R$string.alert_unify_trading_no_asset_upgrade);
    }
}
