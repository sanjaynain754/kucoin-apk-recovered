package repayment.ext;

import com.appsflyer.AppsFlyerProperties;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.unify.entity.RepayAsset;
import com.kubi.unify.entity.UnifyAssetItem;
import com.kubi.unify.entity.UnifyLiabilityItem;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import repayment.InterfaceC44006b;
import repayment.RepayAssetData;
import repayment.UnifyAssetData;
import repayment.UnifyLiabilityData;

/* JADX INFO: renamed from: repayment.ext.i */
/* JADX INFO: compiled from: RepayVMExt.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¨\u0006\n"}, m90084d2 = {"createLiability", "Lrepayment/UnifyLiabilityData;", AppsFlyerProperties.CURRENCY_CODE, "", "amount", "Ljava/math/BigDecimal;", "parseData", "Lrepayment/RepayContract$UiState$PageLoaded;", "it", "Lcom/kubi/unify/entity/RepayAsset;", "BUnifyAccountLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRepayVMExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepayVMExt.kt\nrepayment/ext/RepayVMExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1#2:58\n774#3:59\n865#3,2:60\n1563#3:62\n1634#3,3:63\n1563#3:66\n1634#3,3:67\n*S KotlinDebug\n*F\n+ 1 RepayVMExt.kt\nrepayment/ext/RepayVMExtKt\n*L\n34#1:59\n34#1:60,2\n34#1:62\n34#1:63,3\n46#1:66\n46#1:67,3\n*E\n"})
public final class C44043i {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final UnifyLiabilityData m97121a(@Nullable String str, @Nullable BigDecimal bigDecimal) {
        CoinInfoEntity coinInfoEntityM85613u = str != null ? C37890n.f85269a.m85613u(str) : null;
        return new UnifyLiabilityData(str, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null, bigDecimal);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final InterfaceC44006b.PageLoaded m97122b(@NotNull RepayAsset it) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(it, "it");
        List<UnifyAssetItem> unifyAssetItemList = it.getUnifyAssetItemList();
        ArrayList arrayList = null;
        if (unifyAssetItemList != null) {
            ArrayList<UnifyAssetItem> arrayList2 = new ArrayList();
            for (Object obj : unifyAssetItemList) {
                if (((UnifyAssetItem) obj).getCurrencyCode() != null) {
                    arrayList2.add(obj);
                }
            }
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (UnifyAssetItem unifyAssetItem : arrayList2) {
                CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(unifyAssetItem.getCurrencyCode()));
                listEmptyList.add(new UnifyAssetData(unifyAssetItem.getCurrencyCode(), coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null, unifyAssetItem.getSize(), unifyAssetItem.getSize()));
            }
        } else {
            listEmptyList = null;
        }
        List<UnifyLiabilityItem> unifyLiabilityItemList = it.getUnifyLiabilityItemList();
        if (unifyLiabilityItemList != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(unifyLiabilityItemList, 10));
            for (UnifyLiabilityItem unifyLiabilityItem : unifyLiabilityItemList) {
                arrayList.add(m97121a(unifyLiabilityItem.getCurrencyCode(), unifyLiabilityItem.getSize()));
            }
        }
        RepayAssetData repayAssetData = new RepayAssetData(listEmptyList, arrayList);
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new InterfaceC44006b.PageLoaded(repayAssetData, listEmptyList);
    }
}
