package com.kubi.tradingbotkit.business.asset;

import com.kubi.resources.C22890g;
import com.kubi.sdk.res.R$color;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import nf.C42828b;
import o50.C42975i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.tradingbotkit.business.asset.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BotAssetsExt.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\n\u0010\u000b\u001a\u00020\u0006*\u00020\n¨\u0006\f"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/asset/BotAssetsExt;", "", "<init>", "()V", "getStyleTextByProfit", "Lcom/kubi/utils/StyledText;", "", "getTextColor", "", "profitNumber", "Ljava/math/BigDecimal;", "getPrefixString", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BotAssetsExt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BotAssetsExt f52232a = new BotAssetsExt();

    @NotNull
    /* JADX INFO: renamed from: b */
    public final C27096v0 m63783b(@Nullable String str) {
        BigDecimal bigDecimalM66535e = str != null ? DowngradeExKt.m66535e(str, null, 1, null) : null;
        String strM92640e = bigDecimalM66535e != null ? C42180b.m92640e(bigDecimalM66535e, null, 2, false, false, false, 2, null, 93, null) : null;
        String strM66668h = C27041f.m66668h(bigDecimalM66535e != null ? m63782a(bigDecimalM66535e) : null);
        int iM63784c = m63784c(bigDecimalM66535e);
        String str2 = (char) 8237 + C42828b.m93911l(strM66668h + C27041f.m66669i(strM92640e, "--")) + (char) 8236;
        C27096v0 c27096v0 = new C27096v0();
        c27096v0.append(str2);
        C42975i.m94381b(c27096v0, str2, iM63784c);
        return c27096v0;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m63782a(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return C41014a.m89921F(bigDecimal, "0").compareTo(BigDecimal.ZERO) > 0 ? "+" : "";
    }

    /* JADX INFO: renamed from: c */
    public final int m63784c(BigDecimal bigDecimal) {
        int iCompareTo = C41014a.m89921F(bigDecimal, "0").compareTo(BigDecimal.ZERO);
        if (iCompareTo == 0) {
            return C27017c.f54310a.m66512a(R$color.c_text);
        }
        return iCompareTo < 0 ? C22890g.m54289n(C27017c.f54310a.m66513b()) : C22890g.m54291p(C27017c.f54310a.m66513b());
    }
}
