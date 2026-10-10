package com.kubi.futures.trade.marginMode.perpetualSwap.viewModel;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.ModifyMarginModeErrorAggregationModel;
import com.kubi.kumex.data.platform.model.ModifyMarginModeErrorEntity;
import com.kubi.kumex.data.platform.model.ModifyMarginModeResultEntity;
import com.kubi.kumex.data.platform.model.SwitchFailedAggregationInfo;
import com.kubi.utils.C27096v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.futures.trade.marginMode.perpetualSwap.viewModel.c */
/* JADX INFO: compiled from: PerpetualSwapViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m90084d2 = {"generateErrorAggregationModels", "Lcom/kubi/kumex/data/platform/model/SwitchFailedAggregationInfo;", "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPerpetualSwapViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PerpetualSwapViewModel.kt\ncom/kubi/futures/trade/marginMode/perpetualSwap/viewModel/PerpetualSwapViewModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1491#2:197\n1516#2,3:198\n1519#2,3:208\n1617#2,9:214\n1869#2:223\n1870#2:225\n1626#2:226\n382#3,7:201\n126#4:211\n153#4,2:212\n155#4:227\n1#5:224\n*S KotlinDebug\n*F\n+ 1 PerpetualSwapViewModel.kt\ncom/kubi/futures/trade/marginMode/perpetualSwap/viewModel/PerpetualSwapViewModelKt\n*L\n185#1:197\n185#1:198,3\n185#1:208,3\n189#1:214,9\n189#1:223\n189#1:225\n189#1:226\n185#1:201,7\n185#1:211\n185#1:212,2\n185#1:227\n189#1:224\n*E\n"})
public final class C13782c {
    /* JADX INFO: renamed from: b */
    public static final SwitchFailedAggregationInfo m27125b(ModifyMarginModeResultEntity modifyMarginModeResultEntity) {
        int size;
        String msg;
        String string;
        C27096v0 c27096v0M24440e;
        List<ModifyMarginModeErrorEntity> errors = modifyMarginModeResultEntity.getErrors();
        if (errors != null) {
            size = errors.size();
        } else {
            size = 0;
        }
        List<ModifyMarginModeErrorEntity> errors2 = modifyMarginModeResultEntity.getErrors();
        ArrayList arrayList = null;
        if (errors2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : errors2) {
                String code = ((ModifyMarginModeErrorEntity) obj).getCode();
                Object arrayList2 = linkedHashMap.get(code);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(code, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                ModifyMarginModeErrorEntity modifyMarginModeErrorEntity = (ModifyMarginModeErrorEntity) CollectionsKt.firstOrNull((List) entry.getValue());
                if (modifyMarginModeErrorEntity == null || (msg = modifyMarginModeErrorEntity.getMsg()) == null) {
                    msg = "";
                }
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList4 = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ContractEntity contractEntityMo24978D = RepositoryServiceLocator.f19236a.m20288g().mo24978D(((ModifyMarginModeErrorEntity) it.next()).getSymbol(), false);
                    if (contractEntityMo24978D != null && (c27096v0M24440e = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityMo24978D)) != null) {
                        string = c27096v0M24440e.toString();
                    } else {
                        string = null;
                    }
                    if (string != null) {
                        arrayList4.add(string);
                    }
                }
                arrayList3.add(new ModifyMarginModeErrorAggregationModel(str, msg, CollectionsKt.joinToString$default(arrayList4, "、", null, null, 0, null, null, 62, null)));
            }
            arrayList = arrayList3;
        }
        return new SwitchFailedAggregationInfo(size, arrayList);
    }
}
