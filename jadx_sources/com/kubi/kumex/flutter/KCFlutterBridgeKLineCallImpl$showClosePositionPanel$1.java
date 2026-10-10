package com.kubi.kumex.flutter;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.dialog.LimitCloseDialog;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.C27099x;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: KCFlutterBridgeKLineCallImpl.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.flutter.KCFlutterBridgeKLineCallImpl$showClosePositionPanel$1", m90122f = "KCFlutterBridgeKLineCallImpl.kt", m90123i = {0, 0, 0}, m90124l = {1061}, m90125m = "invokeSuspend", m90126n = {"this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "I$0"})
@SourceDebugExtension({"SMAP\nKCFlutterBridgeKLineCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeKLineCallImpl.kt\ncom/kubi/kumex/flutter/KCFlutterBridgeKLineCallImpl$showClosePositionPanel$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,1058:1\n196#2,3:1059\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeKLineCallImpl.kt\ncom/kubi/kumex/flutter/KCFlutterBridgeKLineCallImpl$showClosePositionPanel$1\n*L\n658#1:1059,3\n*E\n"})
public final class KCFlutterBridgeKLineCallImpl$showClosePositionPanel$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $positionInfo;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ KCFlutterBridgeKLineCallImpl this$0;

    /* JADX INFO: renamed from: g */
    public static final Unit m33724g(Ref.BooleanRef booleanRef, final KCFlutterBridgeKLineCallImpl kCFlutterBridgeKLineCallImpl, final PositionEntity positionEntity, final Function2 function2, final FragmentActivity fragmentActivity) {
        booleanRef.element = true;
        fragmentActivity.runOnUiThread(new Runnable() { // from class: com.kubi.kumex.flutter.h
            @Override // java.lang.Runnable
            public final void run() {
                KCFlutterBridgeKLineCallImpl$showClosePositionPanel$1.m33725h(fragmentActivity, kCFlutterBridgeKLineCallImpl, positionEntity, function2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgeKLineCallImpl$showClosePositionPanel$1(String str, Function2<? super Boolean, ? super ProtocolException, Unit> function2, KCFlutterBridgeKLineCallImpl kCFlutterBridgeKLineCallImpl, Continuation<? super KCFlutterBridgeKLineCallImpl$showClosePositionPanel$1> continuation) {
        super(2, continuation);
        this.$positionInfo = str;
        this.$callback = function2;
        this.this$0 = kCFlutterBridgeKLineCallImpl;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgeKLineCallImpl$showClosePositionPanel$1(this.$positionInfo, this.$callback, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgeKLineCallImpl$showClosePositionPanel$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: h */
    public static final void m33725h(FragmentActivity fragmentActivity, KCFlutterBridgeKLineCallImpl kCFlutterBridgeKLineCallImpl, PositionEntity positionEntity, Function2 function2) {
        try {
            if (fragmentActivity.getSupportFragmentManager().findFragmentByTag(kCFlutterBridgeKLineCallImpl.f29028b) == null) {
                LimitCloseDialog limitCloseDialogNewInstance = LimitCloseDialog.D0.newInstance(positionEntity);
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                limitCloseDialogNewInstance.show(supportFragmentManager, kCFlutterBridgeKLineCallImpl.f29028b);
            }
            function2.invoke(Boolean.TRUE, null);
        } catch (Exception e11) {
            C44128b.m97261e(kCFlutterBridgeKLineCallImpl.getF29027a(), "showClosePositionPanel error: " + e11.getMessage());
            Boolean bool = Boolean.FALSE;
            String message = e11.getMessage();
            if (message == null) {
                message = "showClosePositionPanel error";
            }
            function2.invoke(bool, new ProtocolException(message, e11, null, false, 12, null));
        }
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
                if (StringsKt.isBlank(this.$positionInfo)) {
                    this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("positionInfo is empty", null, null, false, 14, null));
                    return Unit.INSTANCE;
                }
                C27099x c27099x = C27099x.f54458a;
                String str = this.$positionInfo;
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C15969xacd0c63(str, null)), C42911a.m94120b());
                this.L$0 = SpillingKt.nullOutSpilledVariable(c27099x);
                this.L$1 = SpillingKt.nullOutSpilledVariable(str);
                this.I$0 = 0;
                this.label = 1;
                obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            final PositionEntity positionEntity = (PositionEntity) obj;
            if (positionEntity == null) {
                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("positionInfo parse failed", null, null, false, 14, null));
                return Unit.INSTANCE;
            }
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            final KCFlutterBridgeKLineCallImpl kCFlutterBridgeKLineCallImpl = this.this$0;
            final Function2<Boolean, ProtocolException, Unit> function2 = this.$callback;
            C42899b.m94073c(new Function1() { // from class: com.kubi.kumex.flutter.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return KCFlutterBridgeKLineCallImpl$showClosePositionPanel$1.m33724g(booleanRef, kCFlutterBridgeKLineCallImpl, positionEntity, function2, (FragmentActivity) obj2);
                }
            });
            if (!booleanRef.element) {
                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("top activity not found", null, null, false, 14, null));
            }
            return Unit.INSTANCE;
        } catch (Exception e11) {
            C44128b.m97261e(this.this$0.getF29027a(), "showClosePositionPanel error: " + e11.getMessage());
            Function2<Boolean, ProtocolException, Unit> function3 = this.$callback;
            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
            String message = e11.getMessage();
            if (message == null) {
                message = "showClosePositionPanel error";
            }
            function3.invoke(boolBoxBoolean, new ProtocolException(message, e11, null, false, 12, null));
        }
    }
}
