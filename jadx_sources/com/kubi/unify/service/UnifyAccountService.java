package com.kubi.unify.service;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.LifecycleOwnerKt;
import ci.InterfaceC4984e;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.unify.R$id;
import com.kubi.unify.R$layout;
import com.kubi.unify.R$string;
import com.kubi.unify.UnifyConstant;
import com.kubi.unify.UnifyGlobalDataManager;
import com.kubi.unify.UnifyStoreIds;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.unify.api.entity.UnifyAccountType;
import com.kubi.unify.api.entity.UnifyHourlyRateEntity;
import com.kubi.unify.entity.BorrowConfigEntity;
import com.kubi.unify.entity.BorrowConfigItemEntity;
import com.kubi.unify.entity.UnifyAccountOverviewEntity;
import com.kubi.unify.entity.UnifyAccountStatusEntity;
import com.kubi.unify.entity.UnifyConfig;
import com.kubi.unify.entity.UnifyFundsInfoEntity;
import com.kubi.unify.entity.UnifyOrderEntity;
import com.kubi.unify.funds.UnifyFundsInfoFragment;
import com.kubi.unify.record.UnifyRecordMainFragment;
import com.kubi.unify.stream.UnifyDataStreamManager;
import com.kubi.unify.unify.common.order.delegate.IOrderSocketApiDelegate;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import f00.C37304a;
import g00.InterfaceC37763o;
import g00.InterfaceC37766r;
import j60.C40336a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import repayment.UnifiedRepayFragment;
import repayment.dialog.LiabilitySelectedDialog;
import y70.C46392a;

/* JADX INFO: compiled from: UnifyAccountService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bH\u0016J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015H\u0016J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0016J,\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\u0010!\u001a\u0004\u0018\u00010\u00172\u0006\u0010\"\u001a\u00020\u001cH\u0016J\u0010\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0015H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\tH\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\tH\u0016J\u001a\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020/0.0\u0015H\u0016J!\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170)2\f\u00101\u001a\b\u0012\u0004\u0012\u0002020)H\u0000¢\u0006\u0002\b3J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\u00170)2\u0006\u0010\u0019\u001a\u00020\tH\u0016J \u00105\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170)0.0\u0015H\u0016J\u001a\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00170.0\u0015H\u0016J\b\u00107\u001a\u00020\u0005H\u0016J\b\u00108\u001a\u00020\u0005H\u0016J\u0014\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0)0\u0015H\u0016J\b\u0010;\u001a\u00020\u0005H\u0016J\b\u0010<\u001a\u00020\u0005H\u0016J\b\u0010=\u001a\u00020\u0005H\u0016J\b\u0010>\u001a\u00020\u0005H\u0016J\b\u0010?\u001a\u00020\u0005H\u0016J\b\u0010@\u001a\u00020\u0005H\u0016J\n\u0010A\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010B\u001a\u00020\u0012H\u0016J\u001a\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020K0J0\u0015H\u0016J6\u0010L\u001a\u00020\u00052\u0006\u0010M\u001a\u00020 2\b\u0010N\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010\t2\b\u0010O\u001a\u0004\u0018\u00010\t2\u0006\u0010P\u001a\u00020\tH\u0016J\b\u0010Q\u001a\u00020\u0012H\u0016J\b\u0010R\u001a\u00020\u0012H\u0016R\u001b\u0010C\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bE\u0010F¨\u0006S"}, m90084d2 = {"Lcom/kubi/unify/service/UnifyAccountService;", "Lcom/kubi/unify/api/IUnifyAccountService;", "<init>", "()V", "handleUnifyAccountToggleView", "", "viewGroup", "Landroid/view/ViewGroup;", "fromType", "", "onClickListener", "Lkotlin/Function0;", "getUnifyRecordsFragment", "Lcom/kubi/sdk/BaseFragment;", "arguments", "Landroid/os/Bundle;", "getUnifyFundsFragment", "hasToggledUnifyAccount", "", "isUnifiedAccount", "isUnifiedAccountFlow", "Lkotlinx/coroutines/flow/Flow;", "getAccountRiskRateStateFlow", "Ljava/math/BigDecimal;", "getUnifyAccountAvailableEquity", FirebaseAnalytics.Param.CURRENCY, "showAddFundsDialog", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "tag", "gotoRepay", "context", "Landroid/content/Context;", "amount", "fragmentManager", "steamsOnErrorFlow", "Lcom/kubi/futures/exception/IFuturesCoreApiException;", "refreshStreamDataFlow", "updateFuturesCurrencySymbol", "symbol", "getRiskGradeConfig", "", "", "jump2AccountRiskRatioMore", "fetchUnifyHourlyRates", "getUnifyHourlyRatesStateFlow", "", "Lcom/kubi/unify/api/entity/UnifyHourlyRateEntity;", "buildSelectableLeverageLevels", "loanConfigs", "Lcom/kubi/unify/entity/BorrowConfigItemEntity;", "buildSelectableLeverageLevels$BUnifyAccountLib_googleRelease", "getLeverageLevels", "getLoanConfigStateFlow", "getUserLoanLeverageConfigStateFlow", "updateUserLoanLeverageConfig", "updateLoanCurrencyConfig", "observeFundsInfoChange", "", "startSpotStream", "startMarginStream", "stopSpotStream", "stopMarginStream", "refreshFundsInfo", "refreshPositions", "getAvgCostUpdateTime", "isOrderCenterRnEnabled", "orderSocketApiDelegate", "Lcom/kubi/unify/unify/common/order/delegate/IOrderSocketApiDelegate;", "getOrderSocketApiDelegate", "()Lcom/kubi/unify/unify/common/order/delegate/IOrderSocketApiDelegate;", "orderSocketApiDelegate$delegate", "Lkotlin/Lazy;", "refreshFuturesOrderCounts", "Lkotlin/Pair;", "", "jumpToUtaFuturesOrderDetail", "ctx", "orderId", "content", "businessType", "getUnifySiteVisible", "isUnifyAccountHitGray", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyAccountService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyAccountService.kt\ncom/kubi/unify/service/UnifyAccountService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 8 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n1#1,334:1\n1#2:335\n49#3:336\n51#3:340\n49#3:341\n51#3:345\n49#3:346\n51#3:350\n49#3:359\n51#3:363\n46#4:337\n51#4:339\n46#4:342\n51#4:344\n46#4:347\n51#4:349\n46#4:360\n51#4:362\n105#5:338\n105#5:343\n105#5:348\n105#5:361\n1563#6:351\n1634#6,3:352\n1563#6:355\n1634#6,3:356\n153#7,2:364\n178#8:366\n*S KotlinDebug\n*F\n+ 1 UnifyAccountService.kt\ncom/kubi/unify/service/UnifyAccountService\n*L\n129#1:336\n129#1:340\n134#1:341\n134#1:345\n139#1:346\n139#1:350\n243#1:359\n243#1:363\n129#1:337\n129#1:339\n134#1:342\n134#1:344\n139#1:347\n139#1:349\n243#1:360\n243#1:362\n129#1:338\n134#1:343\n139#1:348\n243#1:361\n197#1:351\n197#1:352,3\n223#1:355\n223#1:356,3\n295#1:364,2\n295#1:366\n*E\n"})
public final class UnifyAccountService implements IUnifyAccountService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f53350b = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.service.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyAccountService.m65323P();
        }
    });

    /* JADX INFO: renamed from: O */
    public static final Unit m65322O(String str, Function0 function0) {
        C43852m.m96591c(Intrinsics.areEqual(str, SearchCategory$Companion.SPOT) ? "B5UnifyTrading" : "B6UnifiedFuturesTrade", "accountSwitch", null, null, 12, null);
        InterfaceC37763o.a.m85179a(C37304a.f82764a, str, null, null, null, 14, null);
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final IOrderSocketApiDelegate m65323P() {
        return new IOrderSocketApiDelegate();
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    @NotNull
    /* JADX INFO: renamed from: A */
    public List<Double> mo64977A() {
        String riskGrade = UnifyGlobalDataManager.f53084a.m64884v().getValue().getRiskGrade();
        if (riskGrade == null) {
            riskGrade = "";
        }
        List listSplit$default = StringsKt.split$default((CharSequence) riskGrade, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(DowngradeExKt.m66538h((String) it.next(), 0.0d, 1, null)));
        }
        return arrayList;
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    @Nullable
    /* JADX INFO: renamed from: B */
    public BaseFragment mo64978B(@Nullable Bundle bundle) {
        if (!C24129b.m58030b(UnifyConstant.f53295a.m65222a()) || !mo64979C()) {
            return null;
        }
        UnifyFundsInfoFragment unifyFundsInfoFragment = new UnifyFundsInfoFragment();
        unifyFundsInfoFragment.setArguments(bundle);
        return unifyFundsInfoFragment;
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: C */
    public boolean mo64979C() {
        return UnifyGlobalDataManager.f53084a.m64881s().getValue().isUnifyAccount();
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: D */
    public boolean mo64980D() {
        return C40336a.f89568a.m88837a() && mo64979C();
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: E */
    public void mo64981E() {
        UnifyGlobalDataManager.f53084a.m64872E();
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: F */
    public void mo64982F(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        UnifyGlobalDataManager.f53084a.m64877o(currency);
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    @Nullable
    /* JADX INFO: renamed from: G */
    public String mo64983G() {
        UnifyConfig unifyConfig = (UnifyConfig) C46392a.f104043a.m102336j(UnifyStoreIds.f53305a.m65252n(), UnifyConfig.class, null);
        if (unifyConfig != null) {
            return unifyConfig.getAvgCostPriceTime();
        }
        return null;
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    @Nullable
    /* JADX INFO: renamed from: H */
    public BaseFragment mo64984H(@Nullable Bundle bundle) {
        if (!C24129b.m58030b(UnifyConstant.f53295a.m65222a()) || !mo64991e()) {
            return null;
        }
        UnifyRecordMainFragment unifyRecordMainFragment = new UnifyRecordMainFragment();
        unifyRecordMainFragment.setArguments(bundle);
        return unifyRecordMainFragment;
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: I */
    public void mo64985I() {
        UnifyDataStreamManager.f53365a.m65347G();
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: J */
    public void mo64986J() {
        UnifyDataStreamManager.f53365a.m65350J();
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final List<BigDecimal> m65324M(@NotNull List<BorrowConfigItemEntity> loanConfigs) {
        BigDecimal maxLeverage;
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(loanConfigs, "loanConfigs");
        BorrowConfigItemEntity borrowConfigItemEntity = (BorrowConfigItemEntity) CollectionsKt.firstOrNull((List) loanConfigs);
        if (borrowConfigItemEntity == null || (maxLeverage = borrowConfigItemEntity.getMaxLeverage()) == null) {
            return CollectionsKt.emptyList();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Integer.valueOf(maxLeverage.setScale(0, RoundingMode.DOWN).intValueExact()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        Integer num = (Integer) objM103844constructorimpl;
        if (num != null) {
            Integer num2 = num.intValue() >= 1 ? num : null;
            if (num2 != null) {
                IntRange intRange = new IntRange(1, num2.intValue());
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
                Iterator<Integer> it = intRange.iterator();
                while (it.hasNext()) {
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(((IntIterator) it).nextInt());
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                    arrayList.add(bigDecimalValueOf);
                }
                return arrayList;
            }
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: N */
    public final IOrderSocketApiDelegate m65325N() {
        return (IOrderSocketApiDelegate) this.f53350b.getValue();
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC41634e<BigDecimal> mo64987a(@Nullable final String str) {
        final InterfaceC41678w<List<UnifyFundsInfoEntity>> interfaceC41678wM65393c = UnifyDataStreamManager.f53365a.m65362u().m65393c();
        return new InterfaceC41634e<BigDecimal>() { // from class: com.kubi.unify.service.UnifyAccountService$getUnifyAccountAvailableEquity$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.unify.service.UnifyAccountService$getUnifyAccountAvailableEquity$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyAccountService.kt\ncom/kubi/unify/service/UnifyAccountService\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n50#2:50\n140#3,6:51\n146#3:58\n1#4:57\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53359b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f53360c;

                /* JADX INFO: renamed from: com.kubi.unify.service.UnifyAccountService$getUnifyAccountAvailableEquity$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.service.UnifyAccountService$getUnifyAccountAvailableEquity$$inlined$map$1$2", m90122f = "UnifyAccountService.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f, String str) {
                    this.f53359b = interfaceC41635f;
                    this.f53360c = str;
                }

                /* JADX WARN: Code duplicated, block: B:31:0x0078  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    BigDecimal availableEquity;
                    T next;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53359b;
                        List list = (List) obj;
                        String str = this.f53360c;
                        if (str == null || str.length() == 0 || list == null) {
                            availableEquity = BigDecimal.ZERO;
                        } else {
                            Iterator<T> it = list.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = (T) null;
                                    break;
                                }
                                next = it.next();
                            } while (!Intrinsics.areEqual(((UnifyFundsInfoEntity) next).getCurrency(), this.f53360c));
                            UnifyFundsInfoEntity unifyFundsInfoEntity = next;
                            if (unifyFundsInfoEntity == null || (availableEquity = unifyFundsInfoEntity.getAvailableEquity()) == null) {
                                availableEquity = BigDecimal.ZERO;
                            }
                        }
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(availableEquity, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super BigDecimal> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41678wM65393c.collect(new AnonymousClass2(interfaceC41635f, str), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    @NotNull
    /* JADX INFO: renamed from: b */
    public List<BigDecimal> mo64988b(@NotNull String currency) {
        Object next;
        List<BigDecimal> listM65324M;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Iterator<T> it = UnifyGlobalDataManager.f53084a.m64886x().getValue().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((BorrowConfigEntity) next).getCurrency(), currency));
        BorrowConfigEntity borrowConfigEntity = (BorrowConfigEntity) next;
        return (borrowConfigEntity == null || (listM65324M = m65324M(borrowConfigEntity.getLoanConfigs())) == null) ? CollectionsKt.emptyList() : listM65324M;
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: c */
    public void mo64989c() {
        UnifyDataStreamManager unifyDataStreamManager = UnifyDataStreamManager.f53365a;
        unifyDataStreamManager.m65364w();
        unifyDataStreamManager.m65344D();
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC41634e<Map<String, List<BigDecimal>>> mo64990d() {
        final InterfaceC41678w<List<BorrowConfigEntity>> interfaceC41678wM64886x = UnifyGlobalDataManager.f53084a.m64886x();
        return new InterfaceC41634e<Map<String, ? extends List<? extends BigDecimal>>>() { // from class: com.kubi.unify.service.UnifyAccountService$getLoanConfigStateFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.unify.service.UnifyAccountService$getLoanConfigStateFlow$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyAccountService.kt\ncom/kubi/unify/service/UnifyAccountService\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n244#3:51\n245#3:56\n246#3:58\n1193#4,2:52\n1267#4,2:54\n1270#4:57\n*S KotlinDebug\n*F\n+ 1 UnifyAccountService.kt\ncom/kubi/unify/service/UnifyAccountService\n*L\n244#1:52,2\n244#1:54,2\n244#1:57\n*E\n"})
            public static final class C266292<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53355b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ UnifyAccountService f53356c;

                /* JADX INFO: renamed from: com.kubi.unify.service.UnifyAccountService$getLoanConfigStateFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.service.UnifyAccountService$getLoanConfigStateFlow$$inlined$map$1$2", m90122f = "UnifyAccountService.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266292.this.emit(null, this);
                    }
                }

                public C266292(InterfaceC41635f interfaceC41635f, UnifyAccountService unifyAccountService) {
                    this.f53355b = interfaceC41635f;
                    this.f53356c = unifyAccountService;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53355b;
                        List<BorrowConfigEntity> list = (List) obj;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (BorrowConfigEntity borrowConfigEntity : list) {
                            String currency = borrowConfigEntity.getCurrency();
                            if (currency == null) {
                                currency = "";
                            }
                            Pair pairM90091to = TuplesKt.m90091to(currency, this.f53356c.m65324M(borrowConfigEntity.getLoanConfigs()));
                            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
                        }
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super Map<String, ? extends List<? extends BigDecimal>>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41678wM64886x.collect(new C266292(interfaceC41635f, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: e */
    public boolean mo64991e() {
        return C27025c.m66566d(UnifyGlobalDataManager.f53084a.m64881s().getValue().getHasOpened()) || mo64979C();
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    @NotNull
    /* JADX INFO: renamed from: f */
    public InterfaceC41634e<List<Object>> mo64992f() {
        return UnifyDataStreamManager.f53365a.m65365x();
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    @NotNull
    /* JADX INFO: renamed from: h */
    public InterfaceC41634e<BigDecimal> mo64993h() {
        final InterfaceC41678w<UnifyAccountOverviewEntity> interfaceC41678wM65392b = UnifyDataStreamManager.f53365a.m65362u().m65392b();
        return C41636g.m90881E(new InterfaceC41634e<BigDecimal>() { // from class: com.kubi.unify.service.UnifyAccountService$getAccountRiskRateStateFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.unify.service.UnifyAccountService$getAccountRiskRateStateFlow$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyAccountService.kt\ncom/kubi/unify/service/UnifyAccountService\n*L\n1#1,49:1\n50#2:50\n134#3:51\n*E\n"})
            public static final class C266282<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53352b;

                /* JADX INFO: renamed from: com.kubi.unify.service.UnifyAccountService$getAccountRiskRateStateFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.service.UnifyAccountService$getAccountRiskRateStateFlow$$inlined$map$1$2", m90122f = "UnifyAccountService.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266282.this.emit(null, this);
                    }
                }

                public C266282(InterfaceC41635f interfaceC41635f) {
                    this.f53352b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53352b;
                        UnifyAccountOverviewEntity unifyAccountOverviewEntity = (UnifyAccountOverviewEntity) obj;
                        BigDecimal displayRiskRatio = unifyAccountOverviewEntity != null ? unifyAccountOverviewEntity.getDisplayRiskRatio() : null;
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(displayRiskRatio, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super BigDecimal> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41678wM65392b.collect(new C266282(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    @NotNull
    /* JADX INFO: renamed from: i */
    public InterfaceC41634e<Map<String, UnifyHourlyRateEntity>> mo64994i() {
        return UnifyGlobalDataManager.f53084a.m64885w();
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: k */
    public void mo64995k() {
        UnifyDataStreamManager.f53365a.m65345E();
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: l */
    public void mo64996l() {
        UnifyDataStreamManager.f53365a.m65353O();
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: m */
    public void mo64997m(@Nullable ViewGroup viewGroup, @NotNull final String fromType, @Nullable final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fromType, "fromType");
        if (C24129b.m58030b(UnifyConstant.f53295a.m65222a()) && viewGroup != null) {
            if (Intrinsics.areEqual(fromType, SearchCategory$Companion.SPOT) || Intrinsics.areEqual(fromType, SearchCategory$Companion.FUTURES) || Intrinsics.areEqual(fromType, ViewProps.MARGIN)) {
                UnifyAccountStatusEntity value = UnifyGlobalDataManager.f53084a.m64881s().getValue();
                if (!C27025c.m66566d(value.isHitGray())) {
                    ViewExtKt.m66577h(viewGroup);
                    return;
                }
                ViewExtKt.m66594y(viewGroup);
                viewGroup.removeAllViews();
                LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.include_unify_account_toggle, viewGroup, true);
                TextView textView = (TextView) viewGroup.findViewById(R$id.tvUnifyToggle);
                if (textView != null) {
                    textView.setText(!value.isUnifyAccount() ? R$string.unify_account_mode_classic : R$string.unify_account_mode_unify);
                }
                C27046k.m66711z(viewGroup, 0L, new Function0() { // from class: com.kubi.unify.service.b
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UnifyAccountService.m65322O(fromType, function0);
                    }
                }, 1, null);
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(ViewKt.findFragment(viewGroup)), null, null, new UnifyAccountService$handleUnifyAccountToggleView$2(viewGroup, null), 3, null);
            }
        }
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: n */
    public void mo64998n() {
        UnifyGlobalDataManager.f53084a.m64871D();
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    @NotNull
    /* JADX INFO: renamed from: o */
    public InterfaceC41634e<InterfaceC4984e> mo64999o() {
        return C41636g.m90897U(UnifyDataStreamManager.f53365a.m65362u().m65398h(), new UnifyAccountService$steamsOnErrorFlow$1(null));
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: p */
    public void mo65000p() {
        UnifyDataStreamManager.f53365a.m65354P();
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: q */
    public boolean mo65001q() {
        return C24129b.m58030b(UnifyConstant.f53295a.m65222a());
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: r */
    public void mo65002r() {
        UnifyDataStreamManager.f53365a.m65351K();
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: t */
    public void mo65004t(@NotNull Context ctx, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String businessType) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        if (str3 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(((UnifyOrderEntity) C27099x.m66913c(str3, UnifyOrderEntity.class)).toOrderEntity());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            OrderEntity orderEntity = (OrderEntity) objM103844constructorimpl;
            if (orderEntity == null) {
                return;
            }
            IKuMexService iKuMexService = IKuMexService.f28731a.get();
            orderEntity.setMultiBizType(MultiBizType.UNIFIED);
            Unit unit = Unit.INSTANCE;
            iKuMexService.mo33259H(ctx, str, str2, orderEntity);
        }
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    @NotNull
    /* JADX INFO: renamed from: u */
    public InterfaceC41634e<Map<String, BigDecimal>> mo65005u() {
        return UnifyGlobalDataManager.f53084a.m64887y();
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: v */
    public void mo65006v(@NotNull Context context, @Nullable String str, @Nullable BigDecimal bigDecimal, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (str == null) {
            LiabilitySelectedDialog.f97280w0.show(null, fragmentManager);
        } else {
            UnifiedRepayFragment.f97253Z.start(context, str, bigDecimal);
        }
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: w */
    public void mo65007w() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, UnifyConstant.f53295a.m65223b(), null, null, null, null, null, null, 126, null);
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: x */
    public boolean mo65008x() {
        return C27025c.m66566d(UnifyGlobalDataManager.f53084a.m64881s().getValue().isHitGray());
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    @NotNull
    /* JADX INFO: renamed from: y */
    public InterfaceC41634e<Boolean> mo65009y() {
        final InterfaceC41678w<UnifyAccountStatusEntity> interfaceC41678wM64881s = UnifyGlobalDataManager.f53084a.m64881s();
        return new InterfaceC41634e<Boolean>() { // from class: com.kubi.unify.service.UnifyAccountService$isUnifiedAccountFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.unify.service.UnifyAccountService$isUnifiedAccountFlow$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyAccountService.kt\ncom/kubi/unify/service/UnifyAccountService\n*L\n1#1,49:1\n50#2:50\n129#3:51\n*E\n"})
            public static final class C266322<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53362b;

                /* JADX INFO: renamed from: com.kubi.unify.service.UnifyAccountService$isUnifiedAccountFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.service.UnifyAccountService$isUnifiedAccountFlow$$inlined$map$1$2", m90122f = "UnifyAccountService.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266322.this.emit(null, this);
                    }
                }

                public C266322(InterfaceC41635f interfaceC41635f) {
                    this.f53362b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53362b;
                        Boolean boolBoxBoolean = Boxing.boxBoolean(Intrinsics.areEqual(((UnifyAccountStatusEntity) obj).getAccountType(), UnifyAccountType.UNIFIED.getValue()));
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super Boolean> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41678wM64881s.collect(new C266322(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    /* JADX INFO: renamed from: z */
    public void mo65010z(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        UnifyDataStreamManager.f53365a.m65359r().setValue(symbol);
    }

    @Override // com.kubi.unify.api.IUnifyAccountService
    @NotNull
    /* JADX INFO: renamed from: s */
    public InterfaceC41634e<Pair<Long, Long>> mo65003s() {
        return m65325N().m65425n();
    }
}
