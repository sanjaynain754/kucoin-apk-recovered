package p538pq;

import androidx.annotation.StringRes;
import com.kubi.mine.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: pq.g */
/* JADX INFO: compiled from: SubAccountTypeText.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/mine/lib/util/SubAccountTypeText;", "", "<init>", "()V", "SUB_TYPE_CUSTODIAL", "", "SUB_TYPE_THIRD_CUSTODIAL", "stringResForSubType", "", "subType", "(Ljava/lang/Long;)I", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43527g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43527g f96062a = new C43527g();

    @StringRes
    /* JADX INFO: renamed from: a */
    public final int m95791a(@Nullable Long l11) {
        if (l11 != null && l11.longValue() == 5) {
            return R$string.subaccount_subtype_custodial;
        }
        return (l11 != null && l11.longValue() == 9) ? R$string.subaccount_subtype_thirdcustodial : R$string.subaccount_subtype_normal;
    }
}
