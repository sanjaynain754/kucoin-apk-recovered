package com.kubi.credential.core;

import android.content.Context;
import com.kubi.credential.exception.GetCredentialException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p230ef.C37158i;
import p230ef.C37159j;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: CredentialManagerImpl.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m90084d2 = {"Lef/j;", "<anonymous>", "()Lef/j;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.credential.core.CredentialManagerImpl$getCredential$2", m90122f = "CredentialManagerImpl.kt", m90123i = {}, m90124l = {31}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CredentialManagerImpl$getCredential$2 extends SuspendLambda implements Function1<Continuation<? super C37159j>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ C37158i $request;
    int label;
    final /* synthetic */ CredentialManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialManagerImpl$getCredential$2(CredentialManagerImpl credentialManagerImpl, Context context, C37158i c37158i, Continuation<? super CredentialManagerImpl$getCredential$2> continuation) {
        super(1, continuation);
        this.this$0 = credentialManagerImpl;
        this.$context = context;
        this.$request = c37158i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new CredentialManagerImpl$getCredential$2(this.this$0, this.$context, this.$request, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super C37159j> continuation) {
        return ((CredentialManagerImpl$getCredential$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws GetCredentialException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC12468a credentialManager = this.this$0.config.getCredentialManager();
        Context context = this.$context;
        C37158i c37158i = this.$request;
        this.label = 1;
        Object objMo23422b = credentialManager.mo23422b(context, c37158i, this);
        if (objMo23422b == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objMo23422b;
    }
}
