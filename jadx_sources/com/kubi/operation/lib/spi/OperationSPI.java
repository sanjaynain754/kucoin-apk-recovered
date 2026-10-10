package com.kubi.operation.lib.spi;

import com.kubi.operation.api.entity.WelfareGuideInfo;
import com.kubi.operation.lib.utils.OperationGuideHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p668un.InterfaceC45267d;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: compiled from: OperationSPI.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/operation/lib/spi/OperationSPI;", "Lcom/kubi/launch/spi/IOperationSPI;", "<init>", "()V", "getRewardText", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OperationSPI implements InterfaceC45267d {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p668un.InterfaceC45267d
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo43565a(@NotNull Continuation<? super String> continuation) {
        OperationSPI$getRewardText$1 operationSPI$getRewardText$1;
        String f36587e;
        String f36586d;
        if (continuation instanceof OperationSPI$getRewardText$1) {
            operationSPI$getRewardText$1 = (OperationSPI$getRewardText$1) continuation;
            int i11 = operationSPI$getRewardText$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                operationSPI$getRewardText$1.label = i11 - Integer.MIN_VALUE;
            } else {
                operationSPI$getRewardText$1 = new OperationSPI$getRewardText$1(this, continuation);
            }
        } else {
            operationSPI$getRewardText$1 = new OperationSPI$getRewardText$1(this, continuation);
        }
        Object objM43649b = operationSPI$getRewardText$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = operationSPI$getRewardText$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM43649b);
            OperationGuideHelper operationGuideHelper = OperationGuideHelper.f36851a;
            operationSPI$getRewardText$1.label = 1;
            objM43649b = operationGuideHelper.m43649b(operationSPI$getRewardText$1);
            if (objM43649b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM43649b);
        }
        WelfareGuideInfo welfareGuideInfo = (WelfareGuideInfo) objM43649b;
        if (welfareGuideInfo == null || (f36587e = welfareGuideInfo.getF36587e()) == null || f36587e.length() == 0 || (f36586d = welfareGuideInfo.getF36586d()) == null || f36586d.length() == 0) {
            return null;
        }
        return welfareGuideInfo.getF36586d() + '\n' + welfareGuideInfo.getF36587e();
    }
}
