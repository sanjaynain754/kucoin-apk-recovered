package com.kubi.payment.p106rn;

import com.kubi.payment.flutter.upload.UploadHelper;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: IUnifyPaymentBridge.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.rn.IUnifyPaymentBridge$paymentUploadFileListInternal$1", m90122f = "IUnifyPaymentBridge.kt", m90123i = {}, m90124l = {104, 106}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class IUnifyPaymentBridge$paymentUploadFileListInternal$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $businessType;
    final /* synthetic */ Function1<List<String>, Unit> $callback;
    final /* synthetic */ boolean $isPdf;
    final /* synthetic */ List<String> $pathList;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IUnifyPaymentBridge$paymentUploadFileListInternal$1(boolean z11, List<String> list, String str, Function1<? super List<String>, Unit> function1, Continuation<? super IUnifyPaymentBridge$paymentUploadFileListInternal$1> continuation) {
        super(2, continuation);
        this.$isPdf = z11;
        this.$pathList = list;
        this.$businessType = str;
        this.$callback = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IUnifyPaymentBridge$paymentUploadFileListInternal$1(this.$isPdf, this.$pathList, this.$businessType, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((IUnifyPaymentBridge$paymentUploadFileListInternal$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r5 == r0) goto L23;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<String> list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                        list = (List) obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    list = (List) obj;
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (this.$isPdf) {
                    UploadHelper uploadHelper = UploadHelper.f39536a;
                    List<String> list2 = this.$pathList;
                    String str = this.$businessType;
                    this.label = 1;
                    obj = uploadHelper.m48222d(list2, str, this);
                    if (obj == coroutine_suspended) {
                    }
                    list = (List) obj;
                } else {
                    UploadHelper uploadHelper2 = UploadHelper.f39536a;
                    List<String> list3 = this.$pathList;
                    String str2 = this.$businessType;
                    this.label = 2;
                    obj = uploadHelper2.m48220b(list3, str2, this);
                }
                return coroutine_suspended;
            }
        } catch (Exception e11) {
            C44128b.m97265i("文件上传失败: msg:" + e11.getMessage());
            list = null;
        }
        this.$callback.invoke(list);
        return Unit.INSTANCE;
    }
}
