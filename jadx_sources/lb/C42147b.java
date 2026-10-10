package lb;

import com.kubi.assets.R$string;
import com.kubi.data.coin.AccountType;
import com.kubi.unify.api.IUnifyAccountService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: lb.b */
/* JADX INFO: compiled from: DepositUnifiedTipExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"getUnifiedUnSupportTip", "", "Lcom/kubi/data/coin/AccountType;", "(Lcom/kubi/data/coin/AccountType;)Ljava/lang/Integer;", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42147b {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Integer m92485a(@NotNull AccountType accountType) {
        Intrinsics.checkNotNullParameter(accountType, "<this>");
        IUnifyAccountService.Companion companion = IUnifyAccountService.f53155a;
        if (companion.get().mo64979C() && accountType == AccountType.TRADE) {
            return Integer.valueOf(R$string.unify_asset_deposit_account_upgrade_trade);
        }
        if (companion.get().mo64979C() && accountType == AccountType.CONTRACT) {
            return Integer.valueOf(R$string.unify_asset_deposit_account_upgrade_trade);
        }
        if (companion.get().mo64979C() || accountType != AccountType.UNIFIED) {
            return null;
        }
        return Integer.valueOf(R$string.unify_asset_deposit_account_upgrade_uta);
    }
}
