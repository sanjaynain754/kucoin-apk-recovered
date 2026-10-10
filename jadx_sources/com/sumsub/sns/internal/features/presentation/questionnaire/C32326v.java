package com.sumsub.sns.internal.features.presentation.questionnaire;

import androidx.lifecycle.SavedStateHandle;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32326v extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65865a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65866b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SavedStateHandle f65867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32326v(SavedStateHandle savedStateHandle, Continuation continuation) {
        super(2, continuation);
        this.f65867c = savedStateHandle;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32326v c32326v = new C32326v(this.f65867c, continuation);
        c32326v.f65866b = obj;
        return c32326v;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32326v c32326v = new C32326v(this.f65867c, (Continuation) obj2);
        c32326v.f65866b = (InterfaceC41635f) obj;
        return c32326v.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65865a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.f65866b;
            String str = (String) this.f65867c.get("QUESTIONNAIRE_ID");
            if (str != null) {
                this.f65865a = 1;
                if (interfaceC41635f.emit(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new IllegalArgumentException("questionnaire id missing");
            }
        }
        return Unit.INSTANCE;
    }
}
