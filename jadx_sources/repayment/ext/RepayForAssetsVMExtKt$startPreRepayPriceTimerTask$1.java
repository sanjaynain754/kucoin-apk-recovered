package repayment.ext;

import androidx.lifecycle.ViewModelKt;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.unify.entity.EstimateRepay;
import com.kubi.unify.entity.PreRepayRequestBody;
import gf.C37886j;
import gf.C37890n;
import java.math.BigDecimal;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import repayment.RepayVM;
import ro.C44128b;

/* JADX INFO: compiled from: RepayForAssetsVMExt.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "repayment.ext.RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1", m90122f = "RepayForAssetsVMExt.kt", m90123i = {}, m90124l = {108}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ PreRepayRequestBody $requestEntity;
    final /* synthetic */ RepayVM $this_startPreRepayPriceTimerTask;
    int label;

    /* JADX INFO: renamed from: repayment.ext.RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1$1 */
    /* JADX INFO: compiled from: RepayForAssetsVMExt.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "resp", "Lcom/kubi/unify/entity/EstimateRepay;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "repayment.ext.RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1$1", m90122f = "RepayForAssetsVMExt.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C440291 extends SuspendLambda implements Function2<EstimateRepay, Continuation<? super Unit>, Object> {
        final /* synthetic */ RepayVM $this_startPreRepayPriceTimerTask;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(EstimateRepay estimateRepay, Continuation<? super Unit> continuation) {
            return ((C440291) create(estimateRepay, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C440291(RepayVM repayVM, Continuation<? super C440291> continuation) {
            super(2, continuation);
            this.$this_startPreRepayPriceTimerTask = repayVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C440291 c440291 = new C440291(this.$this_startPreRepayPriceTimerTask, continuation);
            c440291.L$0 = obj;
            return c440291;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0054  */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String string;
            String strM85578b;
            EstimateRepay estimateRepay = (EstimateRepay) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BigDecimal estimateRepaySize = estimateRepay.getEstimateRepaySize();
            if (estimateRepaySize == null || (strM85578b = C37886j.m85578b(estimateRepaySize, estimateRepay.getCurrencyCode(), null, false, false, false, 0, null, 0, 254, null)) == null) {
                string = "--";
            } else {
                C37890n c37890n = C37890n.f85269a;
                String currencyCode = estimateRepay.getCurrencyCode();
                if (currencyCode == null) {
                    currencyCode = "";
                }
                CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(currencyCode);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strM85578b);
                sb2.append(' ');
                sb2.append(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null);
                string = sb2.toString();
                if (string == null) {
                    string = "--";
                }
            }
            this.$this_startPreRepayPriceTimerTask.m96983s().setValue(string);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1(RepayVM repayVM, PreRepayRequestBody preRepayRequestBody, Continuation<? super RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1> continuation) {
        super(2, continuation);
        this.$this_startPreRepayPriceTimerTask = repayVM;
        this.$requestEntity = preRepayRequestBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m97087f(RepayVM repayVM, Throwable th2) {
        C44128b.m97261e("RepayVM", "fetchRepaySizePreCalculate: 协议失败");
        InterfaceC41775x1 f97239w = repayVM.getF97239W();
        if (f97239w != null) {
            InterfaceC41775x1.a.m91377a(f97239w, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1(this.$this_startPreRepayPriceTimerTask, this.$requestEntity, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        while (C41713n0.m91132h(ViewModelKt.getViewModelScope(this.$this_startPreRepayPriceTimerTask))) {
            try {
                RepayVM repayVM = this.$this_startPreRepayPriceTimerTask;
                InterfaceC41634e<EstimateRepay> interfaceC41634eM86747o = repayVM.m96982r().m86747o(this.$requestEntity);
                C440291 c440291 = new C440291(this.$this_startPreRepayPriceTimerTask, null);
                final RepayVM repayVM2 = this.$this_startPreRepayPriceTimerTask;
                repayVM.m96978F(interfaceC41634eM86747o, c440291, new Function1() { // from class: repayment.ext.f
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RepayForAssetsVMExtKt$startPreRepayPriceTimerTask$1.m97087f(repayVM2, (Throwable) obj2);
                    }
                });
            } catch (Exception e11) {
                C44128b.m97261e("RepayVM", "fetchRepaySizePreCalculate: " + e11);
                InterfaceC41775x1 f97239w = this.$this_startPreRepayPriceTimerTask.getF97239W();
                if (f97239w != null) {
                    InterfaceC41775x1.a.m91377a(f97239w, null, 1, null);
                }
            }
            this.label = 1;
            if (DelayKt.m90350b(60000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
