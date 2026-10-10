package repayment;

import gf.C37886j;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: repayment.f */
/* JADX INFO: compiled from: UiData.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0004H\u0000\u001a\u0018\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\bH\u0000¨\u0006\t"}, m90084d2 = {"formatDisplayAmount", "", "Lrepayment/UnifyAssetData;", "formatDisplayLegalPrice", "Lrepayment/UnifyLiabilityData;", "isApprox", "", "calculateAssetListForDisplay", "", "BUnifyAccountLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUiData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiData.kt\nrepayment/UiDataKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1869#2,2:87\n*S KotlinDebug\n*F\n+ 1 UiData.kt\nrepayment/UiDataKt\n*L\n78#1:87,2\n*E\n"})
public final class C44044f {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m97128f(UnifyLiabilityData unifyLiabilityData, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return m97127e(unifyLiabilityData, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m97123a(@NotNull List<UnifyAssetData> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return C41014a.m89933g(ZERO, null, null, 0, false, false, false, 47, null);
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        BigDecimal element = bigDecimal;
        for (UnifyAssetData unifyAssetData : list) {
            Intrinsics.checkNotNullExpressionValue(element, "element");
            BigDecimal amount = unifyAssetData.getAmount();
            BigDecimal bigDecimal2 = amount != null ? new BigDecimal(String.valueOf(C41014a.m89940n(amount, unifyAssetData.getCurrencyCode()))) : BigDecimal.ZERO;
            Intrinsics.checkNotNull(bigDecimal2);
            element = element.add(bigDecimal2);
            Intrinsics.checkNotNullExpressionValue(element, "add(...)");
        }
        Intrinsics.checkNotNullExpressionValue(element, "element");
        return C41014a.m89933g(element, null, null, 0, false, false, false, 47, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m97124b(@Nullable UnifyAssetData unifyAssetData) {
        BigDecimal amount;
        String strM85578b;
        return (unifyAssetData == null || (amount = unifyAssetData.getAmount()) == null || (strM85578b = C37886j.m85578b(amount, unifyAssetData.getCurrencyCode(), null, false, false, false, 0, null, 0, 254, null)) == null) ? "--" : strM85578b;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m97125c(@Nullable UnifyLiabilityData unifyLiabilityData) {
        BigDecimal amount;
        String strM85578b;
        if (unifyLiabilityData == null || (amount = unifyLiabilityData.getAmount()) == null || (strM85578b = C37886j.m85578b(amount, unifyLiabilityData.getCurrencyCode(), null, false, false, false, 0, null, 0, 254, null)) == null) {
            return "--";
        }
        String str = strM85578b + ' ' + unifyLiabilityData.getCurrencyCode();
        return str != null ? str : "--";
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m97126d(@Nullable UnifyAssetData unifyAssetData) {
        BigDecimal amount;
        String strM89933g;
        return (unifyAssetData == null || (amount = unifyAssetData.getAmount()) == null || (strM89933g = C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89940n(amount, unifyAssetData.getCurrencyCode()))), null, null, 0, false, true, false, 47, null)) == null) ? "--" : strM89933g;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m97127e(@Nullable UnifyLiabilityData unifyLiabilityData, boolean z11) {
        BigDecimal amount;
        String strM89933g;
        return (unifyLiabilityData == null || (amount = unifyLiabilityData.getAmount()) == null || (strM89933g = C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89940n(amount, unifyLiabilityData.getCurrencyCode()))), null, null, 0, false, z11, false, 47, null)) == null) ? "--" : strM89933g;
    }
}
