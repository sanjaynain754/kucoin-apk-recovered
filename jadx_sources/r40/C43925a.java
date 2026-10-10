package r40;

import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.spot.viewmodel.t0;
import com.kubi.tradingbotkit.entity.coupons.AllCouponsItemEntity;
import com.kubi.tradingbotkit.entity.coupons.Rules;
import com.kubi.tradingbotkit.model.AllCouponsItemModel;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import gf.C37886j;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p429lf.C42179a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: r40.a */
/* JADX INFO: compiled from: AllCouponsMapper.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u001e\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0010\f\u001a\u00060\rj\u0002`\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/coupons/map/AllCouponsMapper;", "Lcom/kubi/tradingbotkit/mapper/IMapper;", "Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;", "Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;", "<init>", "()V", "map", "input", "handleShowStrategyName", "", "rules", "Lcom/kubi/tradingbotkit/entity/coupons/Rules;", "name", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "showRules", "model", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAllCouponsMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCouponsMapper.kt\ncom/kubi/tradingbotkit/business/coupons/map/AllCouponsMapper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,166:1\n216#2,2:167\n*S KotlinDebug\n*F\n+ 1 AllCouponsMapper.kt\ncom/kubi/tradingbotkit/business/coupons/map/AllCouponsMapper\n*L\n60#1:167,2\n*E\n"})
public final class C43925a {
    /* JADX INFO: renamed from: a */
    public final void m96827a(Rules rules, StringBuilder sb2) {
        if (rules != null) {
            LinkedHashMap<String, List<String>> scope = rules.getScope();
            if (scope == null) {
                scope = new LinkedHashMap<>();
            }
            Map<String, String> strategyNames = rules.getStrategyNames();
            if (strategyNames == null) {
                strategyNames = new HashMap<>();
            }
            for (Map.Entry<String, List<String>> entry : scope.entrySet()) {
                Intrinsics.checkNotNullExpressionValue(entry, "next(...)");
                Map.Entry<String, List<String>> entry2 = entry;
                String str = strategyNames.get(entry2.getKey());
                if (str != null && str.length() != 0) {
                    if (sb2.length() == 0) {
                        sb2.append(strategyNames.get(entry2.getKey()));
                    } else {
                        sb2.append(",");
                        sb2.append(strategyNames.get(entry2.getKey()));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:99:0x0291  */
    @NotNull
    /* JADX INFO: renamed from: b */
    public AllCouponsItemModel m96828b(@NotNull AllCouponsItemEntity input) {
        String strM66516f;
        LinkedHashMap<String, List<String>> scope;
        boolean z11;
        Map<String, String> strategyNames;
        Set<String> setKeySet;
        LinkedHashMap<String, List<String>> scope2;
        Set<String> setKeySet2;
        BigDecimal rewardPercent;
        Intrinsics.checkNotNullParameter(input, "input");
        AllCouponsItemModel allCouponsItemModel = new AllCouponsItemModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 16777215, null);
        m96829c(input, allCouponsItemModel);
        allCouponsItemModel.setCouponsId(input.getId());
        allCouponsItemModel.setDiscountTitle(input.getName());
        Rules rules = input.getRules();
        allCouponsItemModel.setDiscountPercentage((rules == null || (rewardPercent = rules.getRewardPercent()) == null) ? null : C42180b.m92640e(rewardPercent, null, 2, false, false, false, 0, null, 125, null));
        Rules rules2 = input.getRules();
        allCouponsItemModel.setDiscountPercentageShowBd(rules2 != null ? rules2.getRewardPercent() : null);
        String receiveTime = input.getReceiveTime();
        allCouponsItemModel.setReceiveTime(Long.valueOf(C27039d.m66652l(receiveTime != null ? Long.valueOf(Long.parseLong(receiveTime)) : null)));
        allCouponsItemModel.setDiscountReceiveDateScope(C42179a.m92629b(C27039d.m66652l(allCouponsItemModel.getReceiveTime()), null, false, null, false, 15, null));
        String expirationTime = input.getExpirationTime();
        allCouponsItemModel.setExpirationTime(Long.valueOf(C27039d.m66652l(expirationTime != null ? Long.valueOf(Long.parseLong(expirationTime)) : null)));
        C27017c c27017c = C27017c.f54310a;
        allCouponsItemModel.setDiscountExpireDate(c27017c.m66516f(R$string.kc_tb_coupon_expired, t0.a(C42179a.m92629b(C27039d.m66652l(allCouponsItemModel.getExpirationTime()), null, false, null, false, 15, null), "(UTC)").toString()));
        allCouponsItemModel.setDiscountExpireDateScope(C42179a.m92629b(C27039d.m66652l(allCouponsItemModel.getExpirationTime()), null, false, null, false, 15, null));
        Rules rules3 = input.getRules();
        allCouponsItemModel.setSupportTypeCode((rules3 == null || (scope2 = rules3.getScope()) == null || (setKeySet2 = scope2.keySet()) == null) ? null : CollectionsKt.toMutableList((Collection) setKeySet2));
        Rules rules4 = input.getRules();
        List mutableList = (rules4 == null || (strategyNames = rules4.getStrategyNames()) == null || (setKeySet = strategyNames.keySet()) == null) ? null : CollectionsKt.toMutableList((Collection) setKeySet);
        if (mutableList == null || mutableList.isEmpty()) {
            strM66516f = c27017c.m66516f(R$string.kc_tb_coupon_all_scope, new Object[0]);
        } else {
            Rules rules5 = input.getRules();
            StringBuilder sb2 = new StringBuilder();
            m96827a(rules5, sb2);
            strM66516f = c27017c.m66516f(R$string.kc_tb_coupon_only_scope, sb2.toString());
        }
        allCouponsItemModel.setShowTypeName(strM66516f);
        Rules rules6 = input.getRules();
        boolean z12 = true;
        if (rules6 != null && (scope = rules6.getScope()) != null) {
            Iterator<Map.Entry<String, List<String>>> it = scope.entrySet().iterator();
            loop0: while (true) {
                z11 = true;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    Map.Entry<String, List<String>> next = it.next();
                    if (!z11 || !next.getValue().isEmpty()) {
                        z11 = false;
                    }
                }
            }
            z12 = z11;
        }
        allCouponsItemModel.setShowSupportSymbol(z12 ? C27017c.f54310a.m66516f(R$string.kc_tb_coupon_support_all, new Object[0]) : C27017c.f54310a.m66516f(R$string.kc_tb_coupon_support_part, new Object[0]));
        Rules rules7 = input.getRules();
        allCouponsItemModel.setMaxReward(rules7 != null ? rules7.getMaxReward() : null);
        Rules rules8 = input.getRules();
        allCouponsItemModel.setRewardSeconds(C41014a.m89921F(rules8 != null ? rules8.getRewardSeconds() : null, "0"));
        Rules rules9 = input.getRules();
        allCouponsItemModel.setMinTotalInvestments(rules9 != null ? rules9.getMinTotalInvestments() : null);
        BigDecimal minTotalInvestments = allCouponsItemModel.getMinTotalInvestments();
        String strM92647l = C42180b.m92647l(minTotalInvestments != null ? C37886j.m85578b(minTotalInvestments, "USDT", null, false, false, false, 0, null, 0, 254, null) : null);
        C27017c c27017c2 = C27017c.f54310a;
        String strM66516f2 = c27017c2.m66516f(R$string.kc_tb_coupon_least_invest, t0.a(strM92647l, "USDT").toString());
        allCouponsItemModel.setValidityPeriod(c27017c2.m66516f(R$string.kc_tb_coupon_validity_scope, allCouponsItemModel.getDiscountReceiveDateScope(), t0.a(C27041f.m66668h(allCouponsItemModel.getDiscountExpireDateScope()), "(UTC)").toString()));
        allCouponsItemModel.setUnUsableReason(input.getUnUsableReason());
        if (allCouponsItemModel.getUnUsableReason() != null) {
            String unUsableReason = allCouponsItemModel.getUnUsableReason();
            if (unUsableReason == null) {
                allCouponsItemModel.setUnUsableReasonShow(c27017c2.m66516f(R$string.kc_tb_unknown_tip, new Object[0]));
            } else {
                int iHashCode = unUsableReason.hashCode();
                if (iHashCode != -1880875309) {
                    if (iHashCode != -1834194536) {
                        if (iHashCode == -1724542093 && unUsableReason.equals(AllCouponsItemModel.UNAVAILABLE_REASON_STRATEGY)) {
                            allCouponsItemModel.setUnUsableReasonShow(allCouponsItemModel.getShowTypeName());
                        } else {
                            allCouponsItemModel.setUnUsableReasonShow(c27017c2.m66516f(R$string.kc_tb_unknown_tip, new Object[0]));
                        }
                    } else if (unUsableReason.equals(AllCouponsItemModel.UNAVAILABLE_REASON_SYMBOL)) {
                        allCouponsItemModel.setUnUsableReasonShow(allCouponsItemModel.getShowSupportSymbol());
                    } else {
                        allCouponsItemModel.setUnUsableReasonShow(c27017c2.m66516f(R$string.kc_tb_unknown_tip, new Object[0]));
                    }
                } else if (unUsableReason.equals(AllCouponsItemModel.UNAVAILABLE_REASON_INVESTMENT)) {
                    allCouponsItemModel.setUnUsableReasonShow(strM66516f2);
                } else {
                    allCouponsItemModel.setUnUsableReasonShow(c27017c2.m66516f(R$string.kc_tb_unknown_tip, new Object[0]));
                }
            }
        }
        m96829c(input, allCouponsItemModel);
        return allCouponsItemModel;
    }

    /* JADX INFO: renamed from: c */
    public final void m96829c(AllCouponsItemEntity allCouponsItemEntity, AllCouponsItemModel allCouponsItemModel) {
        Rules rules = allCouponsItemEntity.getRules();
        if (rules != null) {
            AllCouponsItemModel.Rules rules2 = new AllCouponsItemModel.Rules(null, null, null, null, null, null, null, null, 255, null);
            rules2.setMaxReward(rules.getMaxReward());
            rules2.setMinTotalInvestments(rules.getMinTotalInvestments());
            rules2.setRewardCurrency(rules.getRewardCurrency());
            rules2.setRewardPercent(rules.getRewardPercent());
            rules2.setRewardSeconds(rules.getRewardSeconds());
            LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<>();
            LinkedHashMap<String, List<String>> scope = rules.getScope();
            if (scope != null) {
                for (Map.Entry<String, List<String>> entry : scope.entrySet()) {
                    Intrinsics.checkNotNullExpressionValue(entry, "next(...)");
                    Map.Entry<String, List<String>> entry2 = entry;
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> it = entry2.getValue().iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                    }
                    linkedHashMap.put(entry2.getKey(), arrayList);
                }
            }
            rules2.setScope(linkedHashMap);
            Map<String, String> linkedHashMap2 = new LinkedHashMap<>();
            Map<String, String> strategyNames = rules.getStrategyNames();
            if (strategyNames != null) {
                for (Map.Entry<String, String> entry3 : strategyNames.entrySet()) {
                    linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                }
            }
            rules2.setStrategyNames(linkedHashMap2);
            rules2.setValidPeriodSeconds(rules.getValidPeriodSeconds());
            allCouponsItemModel.setRules(rules2);
        }
    }
}
