package com.kubi.advert;

import com.kubi.advert.entity.AfOpenIdEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.user.api.IUserService;
import com.kubi.user.utils.b0;
import com.kubi.utils.C27100x0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p227ea.InterfaceC37124a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: AFOpenIdUtil.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.advert.AFOpenIdUtil$requestOpenId$1", m90122f = "AFOpenIdUtil.kt", m90123i = {0}, m90124l = {82}, m90125m = "invokeSuspend", m90126n = {"endMessage"}, m90127s = {"L$0"})
public final class AFOpenIdUtil$requestOpenId$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;

    public AFOpenIdUtil$requestOpenId$1(Continuation<? super AFOpenIdUtil$requestOpenId$1> continuation) {
        super(2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Unit m14718g() {
        IUserService.a.get().u();
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AFOpenIdUtil$requestOpenId$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AFOpenIdUtil$requestOpenId$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strM14711h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        String openId = null;
        boolean z11 = true;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    strM14711h = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String strD = b0.a.d();
                InterfaceC41634e interfaceC41634eM83037b = InterfaceC37124a.m83037b((InterfaceC37124a) RetrofitFlowExKt.m42820a(InterfaceC37124a.class), null, 1, null);
                this.L$0 = strD;
                this.label = 1;
                Object objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM83037b, false, null, this, 2, null);
                if (objM42826g == coroutine_suspended) {
                    return coroutine_suspended;
                }
                strM14711h = strD;
                obj = objM42826g;
            }
            C19334f c19334f = (C19334f) obj;
            AfOpenIdEntity afOpenIdEntity = (AfOpenIdEntity) c19334f.m42846a();
            if (afOpenIdEntity != null) {
                openId = afOpenIdEntity.getOpenId();
            }
            if (c19334f.getThrowable() == null && openId != null && openId.length() != 0) {
                AFOpenIdUtil.f14967a.m14715l(openId);
            } else {
                AFOpenIdUtil aFOpenIdUtil = AFOpenIdUtil.f14967a;
                Throwable throwable = c19334f.getThrowable();
                if (openId != null && openId.length() != 0) {
                    z11 = false;
                }
                strM14711h = aFOpenIdUtil.m14711h(throwable, z11);
                if (c19334f.getThrowable() != null) {
                    C44128b.m97263g("AppsFlyerOpenId", c19334f.getThrowable());
                }
            }
        } catch (Throwable th2) {
            strM14711h = AFOpenIdUtil.f14967a.m14711h(th2, false);
            C44128b.m97263g("AppsFlyerOpenId", th2);
        }
        b0.f(b0.a, "fetchOpenIdEnd", strM14711h, false, 4, (Object) null);
        C27100x0.m66923d(new Function0() { // from class: com.kubi.advert.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AFOpenIdUtil$requestOpenId$1.m14718g();
            }
        });
        return Unit.INSTANCE;
    }
}
