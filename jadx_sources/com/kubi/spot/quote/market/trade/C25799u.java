package com.kubi.spot.quote.market.trade;

import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33556b3;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.quote.market.trade.u */
/* JADX INFO: compiled from: MarketOrderBookFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\u001a\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003*\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"getPrecisionList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "", "SpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C25799u {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ArrayList<String> m63003a(int i11) {
        ArrayList<String> arrayList = new ArrayList<>();
        int i12 = i11 > 4 ? 4 : i11;
        for (int i13 = 0; i13 < i12; i13++) {
            BigDecimal bigDecimalPow = new BigDecimal("0.1").pow(i11 - i13);
            Intrinsics.checkNotNullExpressionValue(bigDecimalPow, "pow(...)");
            arrayList.add(C42180b.m92640e(bigDecimalPow, null, 20, false, false, false, 0, null, 125, null));
        }
        if (arrayList.size() < 4) {
            arrayList.add("1");
        }
        if (arrayList.size() < 4) {
            arrayList.add("10");
        }
        if (arrayList.size() < 4) {
            arrayList.add(C33556b3.f68995S);
        }
        if (arrayList.size() < 4) {
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f("1000");
            String strM92640e = bigDecimalM66536f != null ? C42180b.m92640e(bigDecimalM66536f, null, 20, false, false, false, 0, null, 125, null) : null;
            if (strM92640e == null) {
                strM92640e = "";
            }
            arrayList.add(strM92640e);
        }
        return arrayList;
    }
}
