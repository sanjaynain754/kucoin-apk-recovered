package com.kubi.utaspotlib.service;

import androidx.fragment.app.FragmentManager;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog;
import com.kubi.sdk.BaseFragment;
import com.kubi.unify.api.IUnifyAccountService;
import com.tencent.thumbplayer.tcmedia.core.common.TPPixelFormat;
import java.math.BigDecimal;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p311hf.C38184b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UtaSpotService.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.utaspotlib.service.UtaSpotService$updateRiskConfirmViewSwitchVisible$2$1", m90122f = "UtaSpotService.kt", m90123i = {}, m90124l = {TPPixelFormat.TP_PIX_FMT_MEDIACODEC}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UtaSpotService$updateRiskConfirmViewSwitchVisible$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseFragment $fragment;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtaSpotService$updateRiskConfirmViewSwitchVisible$2$1(BaseFragment baseFragment, Continuation<? super UtaSpotService$updateRiskConfirmViewSwitchVisible$2$1> continuation) {
        super(2, continuation);
        this.$fragment = baseFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtaSpotService$updateRiskConfirmViewSwitchVisible$2$1(this.$fragment, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UtaSpotService$updateRiskConfirmViewSwitchVisible$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BigDecimal bigDecimal;
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
            InterfaceC41634e<Map<String, BigDecimal>> interfaceC41634eMo65005u = IUnifyAccountService.f53155a.get().mo65005u();
            this.label = 1;
            obj = C41636g.m90884H(interfaceC41634eMo65005u, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Map map = (Map) obj;
        if (map == null || (bigDecimal = (BigDecimal) map.get(C38184b.f85884a.m86146a())) == null) {
            bigDecimal = new BigDecimal(10);
        }
        UtaLeverageSettingDialog utaLeverageSettingDialogNewInstance$default = UtaLeverageSettingDialog.Companion.newInstance$default(UtaLeverageSettingDialog.f20464C0, C6447a.m11724a(bigDecimal), C38184b.f85884a.m86146a(), null, null, 12, null);
        FragmentManager childFragmentManager = this.$fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        utaLeverageSettingDialogNewInstance$default.show(childFragmentManager, "UtaLeverageSettingDialog");
        return Unit.INSTANCE;
    }
}
