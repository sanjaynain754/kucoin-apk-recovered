package repayment.ext;

import androidx.lifecycle.ViewModelKt;
import com.kubi.unify.entity.CurrencyItem;
import com.kubi.unify.entity.PreRepayRequestBody;
import com.kubi.utils.extensions.C27024b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import repayment.InterfaceC44006b;
import repayment.RepayAssetData;
import repayment.RepayVM;
import repayment.UnifyAssetData;
import repayment.UnifyLiabilityData;

/* JADX INFO: compiled from: RepayForAssetsVMExt.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0000\u001a&\u0010\t\u001a\u00020\u0001*\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0000\u001a\u0014\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\f\u0010\u0011\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a&\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¨\u0006\u0015"}, m90084d2 = {"updateDisplayListBySearchKey", "", "Lrepayment/RepayVM;", "keyword", "", "getFilterDisplayAssetListData", "", "Lrepayment/UnifyAssetData;", "keyWord", "updatePreRepayPriceStatus", "liability", "Lrepayment/UnifyLiabilityData;", "repayAssetsList", "startPreRepayPriceTimerTask", "Lkotlinx/coroutines/Job;", "requestEntity", "Lcom/kubi/unify/entity/PreRepayRequestBody;", "clearPreRepayPriceInfo", "launchFetchPreRepaySizeTask", "liabilityData", "repayAssetList", "BUnifyAccountLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRepayForAssetsVMExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepayForAssetsVMExt.kt\nrepayment/ext/RepayForAssetsVMExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n774#2:142\n865#2,2:143\n1563#2:145\n1634#2,3:146\n*S KotlinDebug\n*F\n+ 1 RepayForAssetsVMExt.kt\nrepayment/ext/RepayForAssetsVMExtKt\n*L\n52#1:142\n52#1:143,2\n131#1:145\n131#1:146,3\n*E\n"})
public final class RepayForAssetsVMExtKt {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<UnifyAssetData> m97081b(@NotNull RepayVM repayVM, @Nullable String str) {
        RepayAssetData repayAsset;
        List<UnifyAssetData> unifyAssetList;
        Intrinsics.checkNotNullParameter(repayVM, "<this>");
        InterfaceC44006b value = repayVM.m96984t().getValue();
        InterfaceC44006b.PageLoaded pageLoaded = value instanceof InterfaceC44006b.PageLoaded ? (InterfaceC44006b.PageLoaded) value : null;
        if (pageLoaded == null || (repayAsset = pageLoaded.getRepayAsset()) == null || (unifyAssetList = repayAsset.getUnifyAssetList()) == null) {
            return CollectionsKt.emptyList();
        }
        if (str == null || str.length() == 0) {
            return unifyAssetList;
        }
        List listM66558a = C27024b.m66558a(unifyAssetList);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM66558a) {
            String currencyName = ((UnifyAssetData) obj).getCurrencyName();
            if (currencyName != null && StringsKt.contains((CharSequence) currencyName, (CharSequence) str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static final void m97082c(RepayVM repayVM, UnifyLiabilityData unifyLiabilityData, List<UnifyAssetData> list) {
        String plainString;
        List listEmptyList;
        String plainString2;
        if (unifyLiabilityData != null) {
            String currencyCode = unifyLiabilityData.getCurrencyCode();
            if (currencyCode == null) {
                currencyCode = "";
            }
            BigDecimal amount = unifyLiabilityData.getAmount();
            if (amount == null || (plainString = amount.toPlainString()) == null) {
                plainString = "";
            }
            CurrencyItem currencyItem = new CurrencyItem(currencyCode, plainString);
            if (list != null) {
                listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (UnifyAssetData unifyAssetData : list) {
                    String currencyCode2 = unifyAssetData.getCurrencyCode();
                    if (currencyCode2 == null) {
                        currencyCode2 = "";
                    }
                    BigDecimal amount2 = unifyAssetData.getAmount();
                    if (amount2 == null || (plainString2 = amount2.toPlainString()) == null) {
                        plainString2 = "";
                    }
                    listEmptyList.add(new CurrencyItem(currencyCode2, plainString2));
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            repayVM.m96977E(m97083d(repayVM, new PreRepayRequestBody(currencyItem, listEmptyList)));
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m97084e(@NotNull RepayVM repayVM, @Nullable String str) {
        InterfaceC44006b.PageLoaded pageLoadedM97018b;
        Intrinsics.checkNotNullParameter(repayVM, "<this>");
        InterfaceC44006b value = repayVM.m96984t().getValue();
        InterfaceC44006b.PageLoaded pageLoaded = value instanceof InterfaceC44006b.PageLoaded ? (InterfaceC44006b.PageLoaded) value : null;
        if (pageLoaded == null || (pageLoadedM97018b = InterfaceC44006b.PageLoaded.m97018b(pageLoaded, null, m97081b(repayVM, str), 1, null)) == null) {
            return;
        }
        repayVM.m96984t().setValue(pageLoadedM97018b);
    }

    /* JADX INFO: renamed from: f */
    public static final void m97085f(@NotNull RepayVM repayVM, @Nullable UnifyLiabilityData unifyLiabilityData, @Nullable List<UnifyAssetData> list) {
        Intrinsics.checkNotNullParameter(repayVM, "<this>");
        InterfaceC41775x1 f97239w = repayVM.getF97239W();
        if (f97239w != null) {
            InterfaceC41775x1.a.m91377a(f97239w, null, 1, null);
        }
        m97080a(repayVM);
        if (unifyLiabilityData == null || list == null || list.isEmpty()) {
            return;
        }
        m97082c(repayVM, unifyLiabilityData, list);
    }

    /* JADX INFO: renamed from: a */
    public static final void m97080a(RepayVM repayVM) {
        repayVM.m96983s().setValue("--");
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC41775x1 m97083d(RepayVM repayVM, PreRepayRequestBody preRepayRequestBody) {
        return C41696j.m91104d(ViewModelKt.getViewModelScope(repayVM), C42911a.m94120b(), null, new RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1(repayVM, preRepayRequestBody, null), 2, null);
    }
}
