package repayment;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.unify.entity.RepayAsset;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import repayment.ext.C44043i;

/* JADX INFO: compiled from: RepayVM.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "repayment.RepayVM$loadUnifyLiabilityAndAssetsData$1", m90122f = "RepayVM.kt", m90123i = {}, m90124l = {164}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nRepayVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepayVM.kt\nrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n25#2:229\n26#2:231\n1#3:230\n*S KotlinDebug\n*F\n+ 1 RepayVM.kt\nrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1\n*L\n172#1:229\n172#1:231\n172#1:230\n*E\n"})
public final class RepayVM$loadUnifyLiabilityAndAssetsData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BigDecimal $amount;
    final /* synthetic */ String $currencyCode;
    int label;
    final /* synthetic */ RepayVM this$0;

    /* JADX INFO: renamed from: repayment.RepayVM$loadUnifyLiabilityAndAssetsData$1$1 */
    /* JADX INFO: compiled from: RepayVM.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "repayAsset", "Lcom/kubi/unify/entity/RepayAsset;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "repayment.RepayVM$loadUnifyLiabilityAndAssetsData$1$1", m90122f = "RepayVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nRepayVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepayVM.kt\nrepayment/RepayVM$loadUnifyLiabilityAndAssetsData$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
    public static final class C439991 extends SuspendLambda implements Function2<RepayAsset, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $currencyCode;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RepayVM this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(RepayAsset repayAsset, Continuation<? super Unit> continuation) {
            return ((C439991) create(repayAsset, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C439991(RepayVM repayVM, String str, Continuation<? super C439991> continuation) {
            super(2, continuation);
            this.this$0 = repayVM;
            this.$currencyCode = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C439991 c439991 = new C439991(this.this$0, this.$currencyCode, continuation);
            c439991.L$0 = obj;
            return c439991;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0049  */
        /* JADX WARN: Code duplicated, block: B:19:0x0053  */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<UnifyLiabilityData> unifyLiabilityList;
            Object next;
            RepayAsset repayAsset = (RepayAsset) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC44006b.PageLoaded pageLoadedM97122b = C44043i.m97122b(repayAsset);
            InterfaceC41669n interfaceC41669n = this.this$0.f97249g0;
            List<UnifyLiabilityData> unifyLiabilityList2 = pageLoadedM97122b.getRepayAsset().getUnifyLiabilityList();
            UnifyLiabilityData unifyLiabilityData = null;
            if (unifyLiabilityList2 != null) {
                String str = this.$currencyCode;
                Iterator<T> it = unifyLiabilityList2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((UnifyLiabilityData) next).getCurrencyCode(), str));
                UnifyLiabilityData unifyLiabilityData2 = (UnifyLiabilityData) next;
                if (unifyLiabilityData2 == null) {
                    unifyLiabilityList = pageLoadedM97122b.getRepayAsset().getUnifyLiabilityList();
                    if (unifyLiabilityList != null) {
                        unifyLiabilityData = (UnifyLiabilityData) CollectionsKt.firstOrNull((List) unifyLiabilityList);
                    }
                } else {
                    unifyLiabilityData = unifyLiabilityData2;
                }
            } else {
                unifyLiabilityList = pageLoadedM97122b.getRepayAsset().getUnifyLiabilityList();
                if (unifyLiabilityList != null) {
                    unifyLiabilityData = (UnifyLiabilityData) CollectionsKt.firstOrNull((List) unifyLiabilityList);
                }
            }
            interfaceC41669n.setValue(unifyLiabilityData);
            this.this$0.m96984t().setValue(pageLoadedM97122b);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepayVM$loadUnifyLiabilityAndAssetsData$1(RepayVM repayVM, String str, BigDecimal bigDecimal, Continuation<? super RepayVM$loadUnifyLiabilityAndAssetsData$1> continuation) {
        super(2, continuation);
        this.this$0 = repayVM;
        this.$currencyCode = str;
        this.$amount = bigDecimal;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RepayVM$loadUnifyLiabilityAndAssetsData$1(this.this$0, this.$currencyCode, this.$amount, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RepayVM$loadUnifyLiabilityAndAssetsData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RepayVM$loadUnifyLiabilityAndAssetsData$1 repayVM$loadUnifyLiabilityAndAssetsData$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                repayVM$loadUnifyLiabilityAndAssetsData$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<RepayAsset> interfaceC41634eM86750s = this.this$0.m96982r().m86750s();
            C439991 c439991 = new C439991(this.this$0, this.$currencyCode, null);
            this.label = 1;
            repayVM$loadUnifyLiabilityAndAssetsData$1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM86750s, false, c439991, repayVM$loadUnifyLiabilityAndAssetsData$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        RepayVM repayVM = repayVM$loadUnifyLiabilityAndAssetsData$1.this$0;
        String str = repayVM$loadUnifyLiabilityAndAssetsData$1.$currencyCode;
        BigDecimal bigDecimal = repayVM$loadUnifyLiabilityAndAssetsData$1.$amount;
        if (((C19334f) obj).getThrowable() != null) {
            repayVM.m96984t().setValue(new InterfaceC44006b.PageEmpty(C44043i.m97121a(str, bigDecimal)));
        }
        return Unit.INSTANCE;
    }
}
