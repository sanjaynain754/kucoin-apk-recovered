package com.kubi.otc.fiat.finger;

import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.SessionData;
import com.kubi.sdk.base.entity.BaseWrapEntity;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import et.InterfaceC37240b;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: DeviceFingerHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.otc.fiat.finger.DeviceFingerHelper$getSessionId$2", m90122f = "DeviceFingerHelper.kt", m90123i = {}, m90124l = {102}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class DeviceFingerHelper$getSessionId$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
    final /* synthetic */ String $type;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFingerHelper$getSessionId$2(String str, Continuation<? super DeviceFingerHelper$getSessionId$2> continuation) {
        super(2, continuation);
        this.$type = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceFingerHelper$getSessionId$2(this.$type, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super String> continuation) {
        return ((DeviceFingerHelper$getSessionId$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC37240b interfaceC37240bM44051d = DeviceFingerHelper.f37296a.m44051d();
                String str = this.$type;
                this.label = 1;
                obj = interfaceC37240bM44051d.m83303p(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            BaseWrapEntity baseWrapEntity = (BaseWrapEntity) obj;
            String sessionId = null;
            if (baseWrapEntity.isSuccess()) {
                SessionData sessionData = (SessionData) baseWrapEntity.getData();
                if (sessionData != null) {
                    sessionId = sessionData.getSessionId();
                }
                return C27041f.m66668h(sessionId);
            }
            C19331c.m42836c(new ApiException(baseWrapEntity.getCode(), baseWrapEntity.getMsg(), baseWrapEntity.getData()), null, 2, null);
            return "";
        } catch (Exception e11) {
            C44128b.m97261e("DeviceFinger", "getSessionId: " + e11);
            ToastCompat.m66437C(R$string.system_error);
            return "";
        }
    }
}
