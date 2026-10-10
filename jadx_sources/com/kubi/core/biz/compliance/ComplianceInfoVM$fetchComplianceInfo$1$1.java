package com.kubi.core.biz.compliance;

import com.kubi.core.spot.entity.ComplianceInfoEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import kotlinx.coroutines.InterfaceC41709m0;
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
import p852kotlin.jvm.internal.SourceDebugExtension;
import se.InterfaceC44395a;

/* JADX INFO: compiled from: ComplianceInfoVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.compliance.ComplianceInfoVM$fetchComplianceInfo$1$1", m90122f = "ComplianceInfoVM.kt", m90123i = {}, m90124l = {47}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nComplianceInfoVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplianceInfoVM.kt\ncom/kubi/core/biz/compliance/ComplianceInfoVM$fetchComplianceInfo$1$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n25#2:54\n26#2:56\n1#3:55\n*S KotlinDebug\n*F\n+ 1 ComplianceInfoVM.kt\ncom/kubi/core/biz/compliance/ComplianceInfoVM$fetchComplianceInfo$1$1\n*L\n49#1:54\n49#1:56\n49#1:55\n*E\n"})
public final class ComplianceInfoVM$fetchComplianceInfo$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ ComplianceInfoVM this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.compliance.ComplianceInfoVM$fetchComplianceInfo$1$1$1 */
    /* JADX INFO: compiled from: ComplianceInfoVM.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/spot/entity/ComplianceInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.compliance.ComplianceInfoVM$fetchComplianceInfo$1$1$1", m90122f = "ComplianceInfoVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C118611 extends SuspendLambda implements Function2<ComplianceInfoEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ComplianceInfoVM this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ComplianceInfoEntity complianceInfoEntity, Continuation<? super Unit> continuation) {
            return ((C118611) create(complianceInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118611(ComplianceInfoVM complianceInfoVM, Continuation<? super C118611> continuation) {
            super(2, continuation);
            this.this$0 = complianceInfoVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C118611 c118611 = new C118611(this.this$0, continuation);
            c118611.L$0 = obj;
            return c118611;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final ComplianceInfoEntity complianceInfoEntity = (ComplianceInfoEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.updateState(new Function1() { // from class: com.kubi.core.biz.compliance.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ComplianceInfoVM$fetchComplianceInfo$1$1.C118611.m21716f(complianceInfoEntity, (UiState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final UiState m21716f(ComplianceInfoEntity complianceInfoEntity, UiState uiState) {
            return uiState.copy(complianceInfoEntity);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final UiState m21714f(UiState uiState) {
        return uiState.copy(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplianceInfoVM$fetchComplianceInfo$1$1(ComplianceInfoVM complianceInfoVM, String str, Continuation<? super ComplianceInfoVM$fetchComplianceInfo$1$1> continuation) {
        super(2, continuation);
        this.this$0 = complianceInfoVM;
        this.$symbol = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ComplianceInfoVM$fetchComplianceInfo$1$1(this.this$0, this.$symbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ComplianceInfoVM$fetchComplianceInfo$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e interfaceC41634eM97921e = InterfaceC44395a.m97921e(this.this$0.m21709y(), this.$symbol, null, 2, null);
            C118611 c118611 = new C118611(this.this$0, null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42823d(interfaceC41634eM97921e, false, c118611, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ComplianceInfoVM complianceInfoVM = this.this$0;
        if (((C19334f) obj).getThrowable() != null) {
            complianceInfoVM.updateState(new Function1() { // from class: com.kubi.core.biz.compliance.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ComplianceInfoVM$fetchComplianceInfo$1$1.m21714f((UiState) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
