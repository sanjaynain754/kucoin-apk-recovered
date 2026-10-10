package com.kubi.kyc.ui.kycv2;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKycKycFaceDataResult;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function6;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pf.C43460a;
import pf.InterfaceC43461b;
import ro.C44128b;

/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kyc.ui.kycv2.KycBridgeManager$launchLivenessAdvance$$inlined$bindFlowEvent$1", m90122f = "KycBridgeManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 KycBridgeManager.kt\ncom/kubi/kyc/ui/kycv2/KycBridgeManager\n*L\n1#1,187:1\n379#2,17:188\n*E\n"})
public final class KycBridgeManager$launchLivenessAdvance$$inlined$bindFlowEvent$1 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function6 $callBack$inlined;
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycBridgeManager$launchLivenessAdvance$$inlined$bindFlowEvent$1(String str, Continuation continuation, Function6 function6) {
        super(2, continuation);
        this.$key = str;
        this.$callBack$inlined = function6;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        KycBridgeManager$launchLivenessAdvance$$inlined$bindFlowEvent$1 kycBridgeManager$launchLivenessAdvance$$inlined$bindFlowEvent$1 = new KycBridgeManager$launchLivenessAdvance$$inlined$bindFlowEvent$1(this.$key, continuation, this.$callBack$inlined);
        kycBridgeManager$launchLivenessAdvance$$inlined$bindFlowEvent$1.L$0 = obj;
        return kycBridgeManager$launchLivenessAdvance$$inlined$bindFlowEvent$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((KycBridgeManager$launchLivenessAdvance$$inlined$bindFlowEvent$1) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
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
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof AdvanceFaceFragment.FaceLivenessInfo)) {
                    AdvanceFaceFragment.FaceLivenessInfo faceLivenessInfo = (AdvanceFaceFragment.FaceLivenessInfo) c43460a.getData();
                    KCFlutterBridgeKycKycFaceDataResult kCFlutterBridgeKycKycFaceDataResult = new KCFlutterBridgeKycKycFaceDataResult(C27041f.m66668h(faceLivenessInfo.getChannel()), C27041f.m66668h(faceLivenessInfo.getLivenessId()), "", "", "");
                    C44128b.m97259c("KycBridgeManager", "[launchLivenessAdvance] isSuccess:" + faceLivenessInfo.isSuccess() + ", errorCode:" + faceLivenessInfo.getErrorCode() + ", errorMsg:" + faceLivenessInfo.getErrorMsg());
                    this.$callBack$inlined.invoke(kCFlutterBridgeKycKycFaceDataResult, faceLivenessInfo.getTransactionId(), faceLivenessInfo.isSuccess(), faceLivenessInfo.getChannel(), faceLivenessInfo.getErrorCode(), faceLivenessInfo.getErrorMsg());
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
