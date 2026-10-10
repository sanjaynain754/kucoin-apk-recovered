package com.kubi.kucoin.main.knb;

import android.os.Bundle;
import com.kubi.lite.api.ILiteService;
import com.kubi.sdk.mode.AppMode;
import com.kubi.wallet.api.IWalletService;
import kotlinx.coroutines.InterfaceC41709m0;
import ml.C42566b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: KCTurboLaunchImpl.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.main.knb.KCTurboLaunchImpl$enterHome$1$1", m90122f = "KCTurboLaunchImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCTurboLaunchImpl$enterHome$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $mode;
    final /* synthetic */ KCTurboLaunchImpl $this_runCatching;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.kucoin.main.knb.KCTurboLaunchImpl$enterHome$1$1$a */
    /* JADX INFO: compiled from: KCTurboLaunchImpl.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C15446a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppMode.values().length];
            try {
                iArr[AppMode.Pro.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppMode.Lite.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppMode.Web3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboLaunchImpl$enterHome$1$1(String str, KCTurboLaunchImpl kCTurboLaunchImpl, Continuation<? super KCTurboLaunchImpl$enterHome$1$1> continuation) {
        super(2, continuation);
        this.$mode = str;
        this.$this_runCatching = kCTurboLaunchImpl;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KCTurboLaunchImpl$enterHome$1$1 kCTurboLaunchImpl$enterHome$1$1 = new KCTurboLaunchImpl$enterHome$1$1(this.$mode, this.$this_runCatching, continuation);
        kCTurboLaunchImpl$enterHome$1$1.L$0 = obj;
        return kCTurboLaunchImpl$enterHome$1$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCTurboLaunchImpl$enterHome$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str = this.$mode;
        try {
            Result.Companion companion = Result.INSTANCE;
            AppMode.Companion companion2 = AppMode.INSTANCE;
            AppMode appMode = AppMode.Pro;
            int i11 = C15446a.$EnumSwitchMapping$0[companion2.fromStringDefault(str, appMode).ordinal()];
            if (i11 == 1) {
                C42566b.f94258a.m93337c(false);
            } else if (i11 == 2) {
                Bundle bundle = new Bundle();
                bundle.putString("flutterInitialRoute", "lite/home");
                bundle.putString("from", companion2.getCurrentBizMode(appMode).name());
                companion2.updateCurrentMode(AppMode.Lite);
                ILiteService.f32003a.get().mo37531b(bundle, false, true);
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("flutterInitialRoute", "wallet/splash");
                bundle2.putString("from", companion2.getCurrentBizMode(appMode).name());
                companion2.updateCurrentMode(AppMode.Web3);
                IWalletService.f54542a.get().mo66944d(bundle2, false);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        KCTurboLaunchImpl kCTurboLaunchImpl = this.$this_runCatching;
        String str2 = this.$mode;
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            C44128b.m97266j(kCTurboLaunchImpl.getTAG(), "enterHome error, mode=" + str2);
        }
        return Unit.INSTANCE;
    }
}
