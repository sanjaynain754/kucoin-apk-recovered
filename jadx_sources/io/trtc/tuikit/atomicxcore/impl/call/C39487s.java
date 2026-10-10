package io.trtc.tuikit.atomicxcore.impl.call;

import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.s */
/* JADX INFO: loaded from: classes61.dex */
public final class C39487s extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f87661a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39491w f87662b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39487s(C39491w c39491w, Continuation continuation) {
        super(2, continuation);
        this.f87662b = c39491w;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39487s(this.f87662b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C39487s(this.f87662b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f87661a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<UserProfile> loginUserInfo = LoginStore.shared.getLoginState().getLoginUserInfo();
            C39486r c39486r = new C39486r(this.f87662b);
            this.f87661a = 1;
            if (loginUserInfo.collect(c39486r, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
