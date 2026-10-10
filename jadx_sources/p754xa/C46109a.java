package p754xa;

import androidx.annotation.StringRes;
import com.kubi.assets.R$string;
import com.kubi.data.coin.AccountType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xa.a */
/* JADX INFO: compiled from: AccountItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m90084d2 = {"convertAccountNameRes", "", "Lcom/kubi/data/coin/AccountType;", "isUnifiedAccount", "", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46109a {
    @StringRes
    /* JADX INFO: renamed from: a */
    public static final int m101610a(@NotNull AccountType accountType, boolean z11) {
        Intrinsics.checkNotNullParameter(accountType, "<this>");
        return (z11 && accountType == AccountType.LEVER) ? R$string.margin_single_account : accountType.getStrRes();
    }
}
