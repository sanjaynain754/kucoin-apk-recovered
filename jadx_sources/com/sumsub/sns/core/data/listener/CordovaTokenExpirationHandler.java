package com.sumsub.sns.core.data.listener;

import androidx.annotation.Keep;
import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41690i;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/CordovaTokenExpirationHandler;", "Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "<init>", "()V", "onTokenExpired", "", "onTokenExpiredMain", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class CordovaTokenExpirationHandler implements TokenExpirationHandler {

    /* JADX INFO: renamed from: com.sumsub.sns.core.data.listener.CordovaTokenExpirationHandler$onTokenExpired$1 */
    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Ljava/lang/String;"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.sumsub.sns.core.data.listener.CordovaTokenExpirationHandler$onTokenExpired$1", m90122f = "TokenExpirationHandler.kt", m90123i = {}, m90124l = {25}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C280281 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
        int label;

        /* JADX INFO: renamed from: com.sumsub.sns.core.data.listener.CordovaTokenExpirationHandler$onTokenExpired$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Ljava/lang/String;"}, m90085k = 3, m90086mv = {2, 1, 0})
        @DebugMetadata(m90121c = "com.sumsub.sns.core.data.listener.CordovaTokenExpirationHandler$onTokenExpired$1$1", m90122f = "TokenExpirationHandler.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
            int label;
            final /* synthetic */ CordovaTokenExpirationHandler this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CordovaTokenExpirationHandler cordovaTokenExpirationHandler, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cordovaTokenExpirationHandler;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super String> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    return this.this$0.onTokenExpiredMain();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public C280281(Continuation<? super C280281> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CordovaTokenExpirationHandler.this.new C280281(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super String> continuation) {
            return ((C280281) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
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
            AbstractC41586e2 abstractC41586e2M91393c = C41782z0.m91393c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(CordovaTokenExpirationHandler.this, null);
            this.label = 1;
            Object objM91049g = C41686h.m91049g(abstractC41586e2M91393c, anonymousClass1, this);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objM91049g;
        }
    }

    @Nullable
    public abstract String onTokenExpiredMain();

    @Override // com.sumsub.sns.core.data.listener.TokenExpirationHandler
    @Nullable
    public String onTokenExpired() {
        return (String) C41690i.m91067b(null, new C280281(null), 1, null);
    }
}
