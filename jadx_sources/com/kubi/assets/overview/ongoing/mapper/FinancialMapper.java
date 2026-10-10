package com.kubi.assets.overview.ongoing.mapper;

import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$color;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.PoolDetail;
import com.kubi.assets.entity.PoolItem;
import com.kubi.assets.service.C10921d;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.C22890g;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import gf.C37885i;
import gf.C37890n;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.mapper.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FinancialMapper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J+\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/FinancialMapper;", "Lcom/kubi/assets/overview/ongoing/mapper/IMapper;", "Lcom/kubi/assets/entity/PoolItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$FinancialItem;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "map", "input", "getHolderAndDateText", "Lkotlin/Pair;", "showTag", "", "listSize", "", "(ZLjava/lang/Integer;)Lkotlin/Pair;", "getMinLockEndTime", "getReturnRate", "item", "getIncomeAmountColor", "incomeAmount", "getIncomeAmount", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFinancialMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialMapper.kt\ncom/kubi/assets/overview/ongoing/mapper/FinancialMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n2423#2,14:160\n*S KotlinDebug\n*F\n+ 1 FinancialMapper.kt\ncom/kubi/assets/overview/ongoing/mapper/FinancialMapper\n*L\n94#1:160,14\n*E\n"})
public final class FinancialMapper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f18530a;

    /* JADX INFO: renamed from: f */
    public static final String m18872f(String str) {
        BigDecimal bigDecimalM66536f;
        String strM85565d;
        if (str != null && (bigDecimalM66536f = DowngradeExKt.m66536f(str)) != null && (strM85565d = C37885i.m85565d(bigDecimalM66536f, 0, 0, 3, null)) != null) {
            String str2 = strM85565d + '%';
            if (str2 != null) {
                return C42828b.m93903d(str2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final Pair<String, String> m18873a(boolean z11, Integer num) {
        Object obj;
        if (z11) {
            return new Pair<>("", C27017c.f54310a.m66516f(R$string.earn_end_date, new Object[0]));
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        C27017c c27017c = C27017c.f54310a;
        String strM66516f = c27017c.m66516f(R$string.kc_earn_holds, new Object[0]);
        if (num == null) {
            obj = num;
            obj = "--";
        }
        obj = num;
        String str = String.format(strM66516f, Arrays.copyOf(new Object[]{String.valueOf(obj)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return new Pair<>(str, c27017c.m66516f(R$string.kc_assets_latest_date, new Object[0]));
    }

    public FinancialMapper(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f18530a = title;
    }

    /* JADX INFO: renamed from: c */
    public final int m18875c(String str) {
        if (str == null) {
            return C27017c.f54310a.m66512a(R$color.c_text);
        }
        BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(str, null, 1, null);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalM66535e.compareTo(bigDecimal) > 0) {
            return C22890g.m54281f(C27017c.f54310a.m66513b(), true);
        }
        return DowngradeExKt.m66535e(str, null, 1, null).compareTo(bigDecimal) < 0 ? C22890g.m54281f(C27017c.f54310a.m66513b(), false) : C27017c.f54310a.m66512a(R$color.c_text);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public ProductItem.FinancialItem m18878g(@NotNull PoolItem input) {
        PoolDetail poolDetail;
        PoolDetail poolDetail2;
        PoolDetail poolDetail3;
        Intrinsics.checkNotNullParameter(input, "input");
        C37890n c37890n = C37890n.f85269a;
        String currency = input.getCurrency();
        if (currency == null) {
            currency = "";
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(currency);
        String currency2 = coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null;
        String currency3 = input.getCurrency();
        String strM66669i = C27041f.m66669i(currency2, currency3 != null ? currency3 : "");
        String iconUrl = coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null;
        List<PoolDetail> list = input.getList();
        boolean z11 = C27039d.m66650j(list != null ? Integer.valueOf(list.size()) : null) == 1;
        List<PoolDetail> list2 = input.getList();
        String category = (list2 == null || (poolDetail3 = (PoolDetail) CollectionsKt.getOrNull(list2, 0)) == null) ? null : poolDetail3.getCategory();
        List<PoolDetail> list3 = input.getList();
        String categoryText = (list3 == null || (poolDetail2 = (PoolDetail) CollectionsKt.getOrNull(list3, 0)) == null) ? null : poolDetail2.getCategoryText();
        List<PoolDetail> list4 = input.getList();
        Pair<String, String> pairM18873a = m18873a(z11, list4 != null ? Integer.valueOf(list4.size()) : null);
        String strComponent1 = pairM18873a.component1();
        String strComponent2 = pairM18873a.component2();
        String str = AssetExKt.m15137y(input.getHoldingAmount(), input.getCurrency()) + ' ' + strM66669i;
        String strM18874b = m18874b(input);
        String strM18877e = m18877e(input);
        String strM18876d = m18876d(input);
        List<PoolDetail> list5 = input.getList();
        String strM15122j = z11 ? AssetExKt.m15122j((list5 == null || (poolDetail = (PoolDetail) CollectionsKt.getOrNull(list5, 0)) == null) ? null : poolDetail.getJumpUrl()) : "account/asset?from=finance";
        String incomeSum = input.getIncomeSum();
        if (incomeSum == null) {
            incomeSum = input.getIncomeAmount();
        }
        int iM18875c = m18875c(incomeSum);
        List<PoolDetail> list6 = input.getList();
        ProductItem.FinancialItem financialItem = new ProductItem.FinancialItem(strM66669i, iconUrl, z11, category, categoryText, strComponent1, strComponent2, str, strM18874b, strM18877e, strM18876d, strM15122j, iM18875c, C27039d.m66650j(list6 != null ? Integer.valueOf(list6.size()) : null), input.getIncomeCurrencyCount());
        financialItem.m18776c(this.f18530a);
        return financialItem;
    }

    /* JADX INFO: renamed from: b */
    public final String m18874b(PoolItem poolItem) {
        String str;
        String strM19193d;
        String incomeSum = poolItem.getIncomeSum();
        String strM15137y = null;
        if (incomeSum != null && incomeSum.length() != 0) {
            if (poolItem.getIncomeSumForFiat()) {
                String incomeSum2 = poolItem.getIncomeSum();
                if (incomeSum2 != null && (strM19193d = C10921d.m19193d(incomeSum2, poolItem.getIncomeSumCurrency(), false, 2, null)) != null) {
                    return strM19193d;
                }
                return "--";
            }
            return poolItem.getIncomeSum() + ' ' + C10921d.m19190a(C27041f.m66668h(poolItem.getIncomeSumCurrency()));
        }
        if (DowngradeExKt.m66535e(poolItem.getIncomeAmount(), null, 1, null).compareTo(BigDecimal.ZERO) > 0) {
            str = "+";
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String incomeAmount = poolItem.getIncomeAmount();
        if (incomeAmount != null) {
            strM15137y = AssetExKt.m15137y(incomeAmount, poolItem.getCurrency());
        }
        sb2.append(strM15137y);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public final String m18876d(PoolItem poolItem) {
        Object next;
        Long lM66547q;
        List<PoolDetail> list = poolItem.getList();
        if (list != null) {
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    long jM66545o = DowngradeExKt.m66545o(((PoolDetail) next).getLockEndTime(), Long.MAX_VALUE);
                    do {
                        Object next2 = it.next();
                        long jM66545o2 = DowngradeExKt.m66545o(((PoolDetail) next2).getLockEndTime(), Long.MAX_VALUE);
                        if (jM66545o > jM66545o2) {
                            next = next2;
                            jM66545o = jM66545o2;
                        }
                    } while (it.hasNext());
                }
            }
            PoolDetail poolDetail = (PoolDetail) next;
            if (poolDetail != null && (lM66547q = DowngradeExKt.m66547q(poolDetail.getLockEndTime())) != null) {
                return AssetExKt.m15121i(lM66547q);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final String m18877e(PoolItem poolItem) {
        if (poolItem.getMinApr() != null && poolItem.getMaxApr() != null) {
            if (Intrinsics.areEqual(poolItem.getMinApr(), poolItem.getMaxApr())) {
                return m18872f(poolItem.getMinApr());
            }
            return m18872f(poolItem.getMinApr()) + '-' + m18872f(poolItem.getMaxApr());
        }
        return null;
    }
}
