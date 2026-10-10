package com.kubi.kucoin.main.knb;

import android.os.Bundle;
import com.kubi.lite.api.ILiteService;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.wallet.api.IWalletService;
import kotlinx.coroutines.InterfaceC41709m0;
import ml.C42566b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCFlutterBridgeModeCallImpl.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.main.knb.KCFlutterBridgeModeCallImpl$switchMode$1", m90122f = "KCFlutterBridgeModeCallImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCFlutterBridgeModeCallImpl$switchMode$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Boolean $animate;
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $toMode;
    int label;

    /* JADX INFO: renamed from: com.kubi.kucoin.main.knb.KCFlutterBridgeModeCallImpl$switchMode$1$a */
    /* JADX INFO: compiled from: KCFlutterBridgeModeCallImpl.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C15445a {
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
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgeModeCallImpl$switchMode$1(String str, Boolean bool, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KCFlutterBridgeModeCallImpl$switchMode$1> continuation) {
        super(2, continuation);
        this.$toMode = str;
        this.$animate = bool;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgeModeCallImpl$switchMode$1(this.$toMode, this.$animate, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgeModeCallImpl$switchMode$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            AppMode.Companion companion = AppMode.INSTANCE;
            String str = this.$toMode;
            AppMode appMode = AppMode.Pro;
            AppMode appModeFromStringDefault = companion.fromStringDefault(str, appMode);
            Boolean bool = this.$animate;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            boolean z11 = zBooleanValue;
            int i11 = C15445a.$EnumSwitchMapping$0[appModeFromStringDefault.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        Bundle bundle = new Bundle();
                        bundle.putString("flutterInitialRoute", "wallet/splash");
                        bundle.putString("from", companion.getCurrentBizMode(appMode).name());
                        companion.updateCurrentMode(AppMode.Web3);
                        IWalletService.f54542a.get().mo66944d(bundle, z11);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("flutterInitialRoute", "lite/home");
                    bundle2.putString("from", companion.getCurrentBizMode(appMode).name());
                    companion.updateCurrentMode(AppMode.Lite);
                    ILiteService.m37529d(ILiteService.f32003a.get(), bundle2, z11, false, 4, null);
                }
            } else {
                C42566b.f94258a.m93337c(z11);
            }
            this.$callback.invoke(Boxing.boxBoolean(true), null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
