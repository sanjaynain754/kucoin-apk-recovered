package p757xd;

import android.content.Context;
import com.kubi.data.regulations.FinancialRegulationsEx;
import com.kubi.tradecorebiz.R$string;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xd.k */
/* JADX INFO: compiled from: SymbolBarData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"getFormatChangeRateV2", "", "Ljava/math/BigDecimal;", "context", "Landroid/content/Context;", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46149k {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m101742a(@Nullable BigDecimal bigDecimal, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (bigDecimal != null) {
            return FinancialRegulationsEx.f21492a.formatPercentRegular(bigDecimal, true);
        }
        String string = context.getString(R$string.stub);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
