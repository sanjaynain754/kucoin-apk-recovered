package p239ep;

import com.kubi.margin.entity.CurrencyEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ep.a */
/* JADX INFO: compiled from: CurrencyEntity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"ONLY_DEBT_TARGET_TYPE", "", "isOnlyDebt", "", "Lcom/kubi/margin/entity/CurrencyEntity;", "isDefault", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37220a {
    /* JADX INFO: renamed from: a */
    public static final boolean m83267a(@NotNull CurrencyEntity currencyEntity) {
        Intrinsics.checkNotNullParameter(currencyEntity, "<this>");
        return m83268b(currencyEntity);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m83268b(@Nullable CurrencyEntity currencyEntity) {
        return Intrinsics.areEqual(currencyEntity != null ? currencyEntity.getLiquidationTargetType() : null, "CLEAR_DEBT");
    }
}
