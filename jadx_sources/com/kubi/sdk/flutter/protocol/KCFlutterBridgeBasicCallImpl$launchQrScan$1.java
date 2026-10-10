package com.kubi.sdk.flutter.protocol;

import android.app.Activity;
import android.content.Context;
import com.kubi.router.core.Router;
import com.kubi.sdk.IActivityWithResult;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import p741wy.InterfaceC45952l;
import p741wy.InterfaceC45957q;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCFlutterBridgeBasicCallImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.flutter.protocol.KCFlutterBridgeBasicCallImpl$launchQrScan$1", m90122f = "KCFlutterBridgeBasicCallImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCFlutterBridgeBasicCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeBasicCallImpl.kt\ncom/kubi/sdk/flutter/protocol/KCFlutterBridgeBasicCallImpl$launchQrScan$1\n+ 2 FlutterEx.kt\ncom/kubi/sdk/flutter/FlutterExKt\n*L\n1#1,181:1\n65#2:182\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeBasicCallImpl.kt\ncom/kubi/sdk/flutter/protocol/KCFlutterBridgeBasicCallImpl$launchQrScan$1\n*L\n140#1:182\n*E\n"})
public final class KCFlutterBridgeBasicCallImpl$launchQrScan$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bizType;
    final /* synthetic */ Function2<String, ProtocolException, Unit> $callback;
    final /* synthetic */ Context $ctx;
    int label;

    /* JADX INFO: renamed from: f */
    public static final Unit m56888f(Function2 function2, String str) {
        function2.invoke(str, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgeBasicCallImpl$launchQrScan$1(Context context, String str, Function2<? super String, ? super ProtocolException, Unit> function2, Continuation<? super KCFlutterBridgeBasicCallImpl$launchQrScan$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$bizType = str;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgeBasicCallImpl$launchQrScan$1(this.$ctx, this.$bizType, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgeBasicCallImpl$launchQrScan$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC45952l interfaceC45952l = (InterfaceC45952l) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45952l.class)));
            if (interfaceC45952l != null) {
                Object obj2 = this.$ctx;
                String strM66668h = C27041f.m66668h(this.$bizType);
                final Function2<String, ProtocolException, Unit> function2 = this.$callback;
                interfaceC45952l.mo101376j((Activity) obj2, (IActivityWithResult) obj2, strM66668h, new Function1() { // from class: com.kubi.sdk.flutter.protocol.a
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return KCFlutterBridgeBasicCallImpl$launchQrScan$1.m56888f(function2, (String) obj3);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
