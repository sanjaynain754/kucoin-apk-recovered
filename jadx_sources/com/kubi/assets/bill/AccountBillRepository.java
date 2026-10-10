package com.kubi.assets.bill;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AccountDetailEntity;
import com.kubi.assets.entity.FinanceBillItemEntity;
import com.kubi.assets.entity.FinanceBillOptionsEntity;
import com.kubi.assets.history.FilterTimeHelper;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.kumex.entity.FundsRecordEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.TimeUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AccountBillRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0019\u0010\u0016J8\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u001b\u0010\u0016J8\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u001d\u0010\u0016J8\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u001f\u0010\u0016J8\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\"\u0010\u0016J\u001e\u0010#\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010$0$0\u000eH\u0086@¢\u0006\u0004\b%\u0010&JF\u0010'\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020( \u0006*\n\u0012\u0004\u0012\u00020(\u0018\u00010\u000f0\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b)\u0010\u0016J<\u0010*\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010+j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001`,2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001e\u0010-\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010/\u0012\u0006\u0012\u0004\u0018\u00010/0.*\u0004\u0018\u00010\bH\u0002J*\u00100\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000202\u0018\u000101j\n\u0012\u0004\u0012\u000202\u0018\u0001`30\u000eH\u0086@¢\u0006\u0004\b4\u0010&JB\u00105\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b \u0006*\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u000106060\u000e2\u0006\u00107\u001a\u00020\bH\u0086@¢\u0006\u0004\b8\u00109R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006:"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillRepository;", "", "<init>", "()V", "assetApi", "Lcom/kubi/assets/bill/AccountBillApi;", "kotlin.jvm.PlatformType", "systemError", "", "getSystemError", "()Ljava/lang/String;", "systemError$delegate", "Lkotlin/Lazy;", "getAccountBillList", "Lkotlin/Result;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "filter", "Lcom/kubi/assets/bill/AccountBillFilterModel;", "pageIndex", "", "pageSize", "getAccountBillList-BWLJW6A", "(Lcom/kubi/assets/bill/AccountBillFilterModel;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMainBillList", "Lcom/kubi/assets/entity/AccountDetailEntity;", "getMainBillList-BWLJW6A", "getMiningBillList", "getMiningBillList-BWLJW6A", "getTradeBillList", "getTradeBillList-BWLJW6A", "getAccountDetailBillList", "getAccountDetailBillList-BWLJW6A", "getFutureBillList", "Lcom/kubi/kumex/entity/FundsRecordEntity;", "getFutureBillList-BWLJW6A", "getFinanceOptions", "Lcom/kubi/assets/entity/FinanceBillOptionsEntity;", "getFinanceOptions-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFinanceBillList", "Lcom/kubi/assets/entity/FinanceBillItemEntity;", "getFinanceBillList-BWLJW6A", "buildRequestParams", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "buildStartEndTime", "Lkotlin/Pair;", "", "getCoinList", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/CoinInfoEntity;", "Lkotlin/collections/ArrayList;", "getCoinList-IoAF18A", "getKumexBizType", "", "fundsType", "getKumexBizType-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountBillRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBillRepository.kt\ncom/kubi/assets/bill/AccountBillRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,318:1\n1#2:319\n*E\n"})
public final class AccountBillRepository {

    /* JADX INFO: renamed from: a */
    public final AccountBillApi f16654a = (AccountBillApi) C42597a.m93386b().create(AccountBillApi.class);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f16655b = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.z0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AccountBillRepository.m15640r();
        }
    });

    /* JADX INFO: renamed from: r */
    public static final String m15640r() {
        return C27017c.f54310a.m66516f(R$string.system_error, new Object[0]);
    }

    /* JADX INFO: renamed from: f */
    public final HashMap<String, Object> m15641f(int i11, int i12, AccountBillFilterModel accountBillFilterModel) {
        HashMap<String, Object> map = new HashMap<>();
        Pair<Long, Long> pairM15642g = m15642g(accountBillFilterModel.getTime());
        map.put("size", Integer.valueOf(i12));
        map.put("page", Integer.valueOf(i11));
        String currency = accountBillFilterModel.getCurrency();
        if (currency != null) {
            map.put(FirebaseAnalytics.Param.CURRENCY, currency);
        }
        Long first = pairM15642g.getFirst();
        if (first != null) {
            map.put("startAt", Long.valueOf(first.longValue()));
        }
        Long second = pairM15642g.getSecond();
        if (second != null) {
            map.put("endAt", Long.valueOf(second.longValue()));
        }
        String direction = accountBillFilterModel.getDirection();
        if (direction != null) {
            map.put("direction", direction);
        }
        String bizType = accountBillFilterModel.getBizType();
        if (bizType != null) {
            map.put("bizType", bizType);
        }
        return map;
    }

    /* JADX INFO: renamed from: g */
    public final Pair<Long, Long> m15642g(String str) {
        TimeUtils.C27004b c27004b = new TimeUtils.C27004b();
        if (str == null || StringsKt.isBlank(str)) {
            return new Pair<>(null, null);
        }
        long j11 = Long.parseLong(FilterTimeHelper.f17645a.m17312c(str, c27004b));
        String endTime = c27004b.f54265b;
        Intrinsics.checkNotNullExpressionValue(endTime, "endTime");
        return new Pair<>(Long.valueOf(j11), Long.valueOf(Long.parseLong(endTime)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: h */
    public final Object m15643h(@NotNull AccountBillFilterModel accountBillFilterModel, int i11, int i12, @NotNull Continuation<? super Result<? extends BasePageEntity<? extends Object>>> continuation) {
        AccountBillRepository$getAccountBillList$1 accountBillRepository$getAccountBillList$1;
        if (continuation instanceof AccountBillRepository$getAccountBillList$1) {
            accountBillRepository$getAccountBillList$1 = (AccountBillRepository$getAccountBillList$1) continuation;
            int i13 = accountBillRepository$getAccountBillList$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                accountBillRepository$getAccountBillList$1.label = i13 - Integer.MIN_VALUE;
            } else {
                accountBillRepository$getAccountBillList$1 = new AccountBillRepository$getAccountBillList$1(this, continuation);
            }
        } else {
            accountBillRepository$getAccountBillList$1 = new AccountBillRepository$getAccountBillList$1(this, continuation);
        }
        Object objM91049g = accountBillRepository$getAccountBillList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = accountBillRepository$getAccountBillList$1.label;
        if (i14 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            AccountBillRepository$getAccountBillList$2 accountBillRepository$getAccountBillList$2 = new AccountBillRepository$getAccountBillList$2(accountBillFilterModel, this, i11, i12, null);
            accountBillRepository$getAccountBillList$1.L$0 = SpillingKt.nullOutSpilledVariable(accountBillFilterModel);
            accountBillRepository$getAccountBillList$1.I$0 = i11;
            accountBillRepository$getAccountBillList$1.I$1 = i12;
            accountBillRepository$getAccountBillList$1.label = 1;
            objM91049g = C41686h.m91049g(abstractC41697j0M94120b, accountBillRepository$getAccountBillList$2, accountBillRepository$getAccountBillList$1);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM91049g);
        }
        return ((Result) objM91049g).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m15644i(@NotNull AccountBillFilterModel accountBillFilterModel, int i11, int i12, @NotNull Continuation<? super Result<? extends BasePageEntity<AccountDetailEntity>>> continuation) {
        AccountBillRepository$getAccountDetailBillList$1 accountBillRepository$getAccountDetailBillList$1;
        if (continuation instanceof AccountBillRepository$getAccountDetailBillList$1) {
            accountBillRepository$getAccountDetailBillList$1 = (AccountBillRepository$getAccountDetailBillList$1) continuation;
            int i13 = accountBillRepository$getAccountDetailBillList$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                accountBillRepository$getAccountDetailBillList$1.label = i13 - Integer.MIN_VALUE;
            } else {
                accountBillRepository$getAccountDetailBillList$1 = new AccountBillRepository$getAccountDetailBillList$1(this, continuation);
            }
        } else {
            accountBillRepository$getAccountDetailBillList$1 = new AccountBillRepository$getAccountDetailBillList$1(this, continuation);
        }
        Object objM91049g = accountBillRepository$getAccountDetailBillList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = accountBillRepository$getAccountDetailBillList$1.label;
        if (i14 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            AccountBillRepository$getAccountDetailBillList$2 accountBillRepository$getAccountDetailBillList$2 = new AccountBillRepository$getAccountDetailBillList$2(this, i11, i12, accountBillFilterModel, null);
            accountBillRepository$getAccountDetailBillList$1.L$0 = SpillingKt.nullOutSpilledVariable(accountBillFilterModel);
            accountBillRepository$getAccountDetailBillList$1.I$0 = i11;
            accountBillRepository$getAccountDetailBillList$1.I$1 = i12;
            accountBillRepository$getAccountDetailBillList$1.label = 1;
            objM91049g = C41686h.m91049g(abstractC41697j0M94120b, accountBillRepository$getAccountDetailBillList$2, accountBillRepository$getAccountDetailBillList$1);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM91049g);
        }
        return ((Result) objM91049g).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: j */
    public final Object m15645j(@NotNull Continuation<? super Result<? extends ArrayList<CoinInfoEntity>>> continuation) {
        AccountBillRepository$getCoinList$1 accountBillRepository$getCoinList$1;
        if (continuation instanceof AccountBillRepository$getCoinList$1) {
            accountBillRepository$getCoinList$1 = (AccountBillRepository$getCoinList$1) continuation;
            int i11 = accountBillRepository$getCoinList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                accountBillRepository$getCoinList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                accountBillRepository$getCoinList$1 = new AccountBillRepository$getCoinList$1(this, continuation);
            }
        } else {
            accountBillRepository$getCoinList$1 = new AccountBillRepository$getCoinList$1(this, continuation);
        }
        Object objM91049g = accountBillRepository$getCoinList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = accountBillRepository$getCoinList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            AccountBillRepository$getCoinList$2 accountBillRepository$getCoinList$2 = new AccountBillRepository$getCoinList$2(this, null);
            accountBillRepository$getCoinList$1.label = 1;
            objM91049g = C41686h.m91049g(abstractC41697j0M94120b, accountBillRepository$getCoinList$2, accountBillRepository$getCoinList$1);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM91049g);
        }
        return ((Result) objM91049g).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: k */
    public final Object m15646k(@NotNull AccountBillFilterModel accountBillFilterModel, int i11, int i12, @NotNull Continuation<? super Result<? extends BasePageEntity<FinanceBillItemEntity>>> continuation) {
        AccountBillRepository$getFinanceBillList$1 accountBillRepository$getFinanceBillList$1;
        if (continuation instanceof AccountBillRepository$getFinanceBillList$1) {
            accountBillRepository$getFinanceBillList$1 = (AccountBillRepository$getFinanceBillList$1) continuation;
            int i13 = accountBillRepository$getFinanceBillList$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                accountBillRepository$getFinanceBillList$1.label = i13 - Integer.MIN_VALUE;
            } else {
                accountBillRepository$getFinanceBillList$1 = new AccountBillRepository$getFinanceBillList$1(this, continuation);
            }
        } else {
            accountBillRepository$getFinanceBillList$1 = new AccountBillRepository$getFinanceBillList$1(this, continuation);
        }
        Object objM91049g = accountBillRepository$getFinanceBillList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = accountBillRepository$getFinanceBillList$1.label;
        if (i14 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            AccountBillRepository$getFinanceBillList$2 accountBillRepository$getFinanceBillList$2 = new AccountBillRepository$getFinanceBillList$2(this, accountBillFilterModel, i11, i12, null);
            accountBillRepository$getFinanceBillList$1.L$0 = SpillingKt.nullOutSpilledVariable(accountBillFilterModel);
            accountBillRepository$getFinanceBillList$1.I$0 = i11;
            accountBillRepository$getFinanceBillList$1.I$1 = i12;
            accountBillRepository$getFinanceBillList$1.label = 1;
            objM91049g = C41686h.m91049g(abstractC41697j0M94120b, accountBillRepository$getFinanceBillList$2, accountBillRepository$getFinanceBillList$1);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM91049g);
        }
        return ((Result) objM91049g).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: l */
    public final Object m15647l(@NotNull Continuation<? super Result<FinanceBillOptionsEntity>> continuation) {
        AccountBillRepository$getFinanceOptions$1 accountBillRepository$getFinanceOptions$1;
        if (continuation instanceof AccountBillRepository$getFinanceOptions$1) {
            accountBillRepository$getFinanceOptions$1 = (AccountBillRepository$getFinanceOptions$1) continuation;
            int i11 = accountBillRepository$getFinanceOptions$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                accountBillRepository$getFinanceOptions$1.label = i11 - Integer.MIN_VALUE;
            } else {
                accountBillRepository$getFinanceOptions$1 = new AccountBillRepository$getFinanceOptions$1(this, continuation);
            }
        } else {
            accountBillRepository$getFinanceOptions$1 = new AccountBillRepository$getFinanceOptions$1(this, continuation);
        }
        Object objM91049g = accountBillRepository$getFinanceOptions$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = accountBillRepository$getFinanceOptions$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            AccountBillRepository$getFinanceOptions$2 accountBillRepository$getFinanceOptions$2 = new AccountBillRepository$getFinanceOptions$2(this, null);
            accountBillRepository$getFinanceOptions$1.label = 1;
            objM91049g = C41686h.m91049g(abstractC41697j0M94120b, accountBillRepository$getFinanceOptions$2, accountBillRepository$getFinanceOptions$1);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM91049g);
        }
        return ((Result) objM91049g).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m15648m(@NotNull AccountBillFilterModel accountBillFilterModel, int i11, int i12, @NotNull Continuation<? super Result<? extends BasePageEntity<FundsRecordEntity>>> continuation) {
        AccountBillRepository$getFutureBillList$1 accountBillRepository$getFutureBillList$1;
        if (continuation instanceof AccountBillRepository$getFutureBillList$1) {
            accountBillRepository$getFutureBillList$1 = (AccountBillRepository$getFutureBillList$1) continuation;
            int i13 = accountBillRepository$getFutureBillList$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                accountBillRepository$getFutureBillList$1.label = i13 - Integer.MIN_VALUE;
            } else {
                accountBillRepository$getFutureBillList$1 = new AccountBillRepository$getFutureBillList$1(this, continuation);
            }
        } else {
            accountBillRepository$getFutureBillList$1 = new AccountBillRepository$getFutureBillList$1(this, continuation);
        }
        Object objM91049g = accountBillRepository$getFutureBillList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = accountBillRepository$getFutureBillList$1.label;
        if (i14 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            AccountBillRepository$getFutureBillList$2 accountBillRepository$getFutureBillList$2 = new AccountBillRepository$getFutureBillList$2(this, accountBillFilterModel, i11, i12, null);
            accountBillRepository$getFutureBillList$1.L$0 = SpillingKt.nullOutSpilledVariable(accountBillFilterModel);
            accountBillRepository$getFutureBillList$1.I$0 = i11;
            accountBillRepository$getFutureBillList$1.I$1 = i12;
            accountBillRepository$getFutureBillList$1.label = 1;
            objM91049g = C41686h.m91049g(abstractC41697j0M94120b, accountBillRepository$getFutureBillList$2, accountBillRepository$getFutureBillList$1);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM91049g);
        }
        return ((Result) objM91049g).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: n */
    public final Object m15649n(@NotNull String str, @NotNull Continuation<? super Result<? extends Map<String, String>>> continuation) {
        AccountBillRepository$getKumexBizType$1 accountBillRepository$getKumexBizType$1;
        if (continuation instanceof AccountBillRepository$getKumexBizType$1) {
            accountBillRepository$getKumexBizType$1 = (AccountBillRepository$getKumexBizType$1) continuation;
            int i11 = accountBillRepository$getKumexBizType$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                accountBillRepository$getKumexBizType$1.label = i11 - Integer.MIN_VALUE;
            } else {
                accountBillRepository$getKumexBizType$1 = new AccountBillRepository$getKumexBizType$1(this, continuation);
            }
        } else {
            accountBillRepository$getKumexBizType$1 = new AccountBillRepository$getKumexBizType$1(this, continuation);
        }
        Object objM91049g = accountBillRepository$getKumexBizType$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = accountBillRepository$getKumexBizType$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            AccountBillRepository$getKumexBizType$2 accountBillRepository$getKumexBizType$2 = new AccountBillRepository$getKumexBizType$2(this, str, null);
            accountBillRepository$getKumexBizType$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            accountBillRepository$getKumexBizType$1.label = 1;
            objM91049g = C41686h.m91049g(abstractC41697j0M94120b, accountBillRepository$getKumexBizType$2, accountBillRepository$getKumexBizType$1);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM91049g);
        }
        return ((Result) objM91049g).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: o */
    public final Object m15650o(@NotNull AccountBillFilterModel accountBillFilterModel, int i11, int i12, @NotNull Continuation<? super Result<? extends BasePageEntity<AccountDetailEntity>>> continuation) {
        AccountBillRepository$getMainBillList$1 accountBillRepository$getMainBillList$1;
        if (continuation instanceof AccountBillRepository$getMainBillList$1) {
            accountBillRepository$getMainBillList$1 = (AccountBillRepository$getMainBillList$1) continuation;
            int i13 = accountBillRepository$getMainBillList$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                accountBillRepository$getMainBillList$1.label = i13 - Integer.MIN_VALUE;
            } else {
                accountBillRepository$getMainBillList$1 = new AccountBillRepository$getMainBillList$1(this, continuation);
            }
        } else {
            accountBillRepository$getMainBillList$1 = new AccountBillRepository$getMainBillList$1(this, continuation);
        }
        Object objM91049g = accountBillRepository$getMainBillList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = accountBillRepository$getMainBillList$1.label;
        if (i14 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            AccountBillRepository$getMainBillList$2 accountBillRepository$getMainBillList$2 = new AccountBillRepository$getMainBillList$2(this, i11, i12, accountBillFilterModel, null);
            accountBillRepository$getMainBillList$1.L$0 = SpillingKt.nullOutSpilledVariable(accountBillFilterModel);
            accountBillRepository$getMainBillList$1.I$0 = i11;
            accountBillRepository$getMainBillList$1.I$1 = i12;
            accountBillRepository$getMainBillList$1.label = 1;
            objM91049g = C41686h.m91049g(abstractC41697j0M94120b, accountBillRepository$getMainBillList$2, accountBillRepository$getMainBillList$1);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM91049g);
        }
        return ((Result) objM91049g).getValue();
    }

    /* JADX INFO: renamed from: p */
    public final String m15651p() {
        return (String) this.f16655b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: q */
    public final Object m15652q(@NotNull AccountBillFilterModel accountBillFilterModel, int i11, int i12, @NotNull Continuation<? super Result<? extends BasePageEntity<AccountDetailEntity>>> continuation) {
        AccountBillRepository$getTradeBillList$1 accountBillRepository$getTradeBillList$1;
        if (continuation instanceof AccountBillRepository$getTradeBillList$1) {
            accountBillRepository$getTradeBillList$1 = (AccountBillRepository$getTradeBillList$1) continuation;
            int i13 = accountBillRepository$getTradeBillList$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                accountBillRepository$getTradeBillList$1.label = i13 - Integer.MIN_VALUE;
            } else {
                accountBillRepository$getTradeBillList$1 = new AccountBillRepository$getTradeBillList$1(this, continuation);
            }
        } else {
            accountBillRepository$getTradeBillList$1 = new AccountBillRepository$getTradeBillList$1(this, continuation);
        }
        Object objM91049g = accountBillRepository$getTradeBillList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = accountBillRepository$getTradeBillList$1.label;
        if (i14 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            AccountBillRepository$getTradeBillList$2 accountBillRepository$getTradeBillList$2 = new AccountBillRepository$getTradeBillList$2(this, i11, i12, accountBillFilterModel, null);
            accountBillRepository$getTradeBillList$1.L$0 = SpillingKt.nullOutSpilledVariable(accountBillFilterModel);
            accountBillRepository$getTradeBillList$1.I$0 = i11;
            accountBillRepository$getTradeBillList$1.I$1 = i12;
            accountBillRepository$getTradeBillList$1.label = 1;
            objM91049g = C41686h.m91049g(abstractC41697j0M94120b, accountBillRepository$getTradeBillList$2, accountBillRepository$getTradeBillList$1);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM91049g);
        }
        return ((Result) objM91049g).getValue();
    }
}
