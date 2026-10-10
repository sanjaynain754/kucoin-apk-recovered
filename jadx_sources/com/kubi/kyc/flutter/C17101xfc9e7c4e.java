package com.kubi.kyc.flutter;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.kyc.KycKey;
import com.kubi.kyc.ui.kycv2.ImagePreviewActivity;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pf.C43460a;
import pf.InterfaceC43461b;

/* JADX INFO: renamed from: com.kubi.kyc.flutter.FlutterKycTransmit$handleMethod$lambda$2$$inlined$bindFlowEvent$1 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kyc.flutter.FlutterKycTransmit$handleMethod$lambda$2$$inlined$bindFlowEvent$1", m90122f = "FlutterKycTransmit.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 FlutterKycTransmit.kt\ncom/kubi/kyc/flutter/FlutterKycTransmit\n*L\n1#1,187:1\n50#2,9:188\n*E\n"})
public final class C17101xfc9e7c4e extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ MethodChannel.Result $result$inlined;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FlutterKycTransmit this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17101xfc9e7c4e(String str, Continuation continuation, FlutterKycTransmit flutterKycTransmit, MethodChannel.Result result) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = flutterKycTransmit;
        this.$result$inlined = result;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C17101xfc9e7c4e c17101xfc9e7c4e = new C17101xfc9e7c4e(this.$key, continuation, this.this$0, this.$result$inlined);
        c17101xfc9e7c4e.L$0 = obj;
        return c17101xfc9e7c4e;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C17101xfc9e7c4e) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof ImagePreviewActivity.PhotoInfo)) {
                    ImagePreviewActivity.PhotoInfo photoInfo = (ImagePreviewActivity.PhotoInfo) c43460a.getData();
                    if (this.this$0.f31214a.getAndIncrement() == 0) {
                        HashMap map = new HashMap();
                        map.put(KycKey.frontPhoto, C27041f.m66668h(photoInfo.getFrontPhoto()));
                        map.put(KycKey.backendPhoto, C27041f.m66668h(photoInfo.getBackendPhoto()));
                        map.put("isSuccess", Boxing.boxBoolean(C27025c.m66566d(photoInfo.getIsSuccess())));
                        map.put("cameraTypeEnum", "KUCOIN");
                        this.this$0.m36787s(this.$result$inlined, map);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
