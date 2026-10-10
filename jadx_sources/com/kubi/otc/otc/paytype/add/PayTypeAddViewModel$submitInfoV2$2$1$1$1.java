package com.kubi.otc.otc.paytype.add;

import com.kubi.sdk.base.entity.BaseEntity;
import et.InterfaceC37241c;
import java.util.HashMap;
import kotlinx.coroutines.InterfaceC41709m0;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: PayTypeAddViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/sdk/base/entity/BaseEntity;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.otc.otc.paytype.add.PayTypeAddViewModel$submitInfoV2$2$1$1$1", m90122f = "PayTypeAddViewModel.kt", m90123i = {}, m90124l = {BuiltinOperator.RANDOM_UNIFORM, 151}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class PayTypeAddViewModel$submitInfoV2$2$1$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super BaseEntity<Object>>, Object> {
    final /* synthetic */ boolean $isEditPayType;
    final /* synthetic */ HashMap<String, String> $params;
    final /* synthetic */ String $validationToken;
    int label;
    final /* synthetic */ PayTypeAddViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayTypeAddViewModel$submitInfoV2$2$1$1$1(boolean z11, PayTypeAddViewModel payTypeAddViewModel, HashMap<String, String> map, String str, Continuation<? super PayTypeAddViewModel$submitInfoV2$2$1$1$1> continuation) {
        super(2, continuation);
        this.$isEditPayType = z11;
        this.this$0 = payTypeAddViewModel;
        this.$params = map;
        this.$validationToken = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PayTypeAddViewModel$submitInfoV2$2$1$1$1(this.$isEditPayType, this.this$0, this.$params, this.$validationToken, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super BaseEntity<Object>> continuation) {
        return ((PayTypeAddViewModel$submitInfoV2$2$1$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r5 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r5 == r0) goto L19;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return (BaseEntity) obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (BaseEntity) obj;
        }
        ResultKt.throwOnFailure(obj);
        if (this.$isEditPayType) {
            InterfaceC37241c interfaceC37241c = this.this$0.f37915V;
            HashMap<String, String> map = this.$params;
            String str = this.$validationToken;
            this.label = 1;
            obj = interfaceC37241c.m83322L(map, str, this);
        } else {
            InterfaceC37241c interfaceC37241c2 = this.this$0.f37915V;
            HashMap<String, String> map2 = this.$params;
            String str2 = this.$validationToken;
            this.label = 2;
            obj = interfaceC37241c2.m83347z(map2, str2, this);
        }
        return coroutine_suspended;
    }
}
