package com.kubi.payment.p106rn;

import android.util.Base64;
import kotlinx.coroutines.InterfaceC41709m0;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: IUnifyPaymentBridge.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.rn.IUnifyPaymentBridge$paymentGetVideoThumbnailInternal$1", m90122f = "IUnifyPaymentBridge.kt", m90123i = {}, m90124l = {BuiltinOperator.RIGHT_SHIFT}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class IUnifyPaymentBridge$paymentGetVideoThumbnailInternal$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $callback;
    final /* synthetic */ String $fileUrl;
    final /* synthetic */ boolean $isRemoteUrl;
    final /* synthetic */ Long $quality;
    int label;
    final /* synthetic */ IUnifyPaymentBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IUnifyPaymentBridge$paymentGetVideoThumbnailInternal$1(IUnifyPaymentBridge iUnifyPaymentBridge, boolean z11, String str, Long l11, Function1<? super String, Unit> function1, Continuation<? super IUnifyPaymentBridge$paymentGetVideoThumbnailInternal$1> continuation) {
        super(2, continuation);
        this.this$0 = iUnifyPaymentBridge;
        this.$isRemoteUrl = z11;
        this.$fileUrl = str;
        this.$quality = l11;
        this.$callback = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IUnifyPaymentBridge$paymentGetVideoThumbnailInternal$1(this.this$0, this.$isRemoteUrl, this.$fileUrl, this.$quality, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((IUnifyPaymentBridge$paymentGetVideoThumbnailInternal$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            IUnifyPaymentBridge iUnifyPaymentBridge = this.this$0;
            boolean z11 = this.$isRemoteUrl;
            String str = this.$fileUrl;
            Long l11 = this.$quality;
            this.label = 1;
            obj = iUnifyPaymentBridge.m49437z(z11, str, l11, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            this.$callback.invoke(Base64.encodeToString(bArr, 2));
        } else {
            this.$callback.invoke(null);
        }
        return Unit.INSTANCE;
    }
}
