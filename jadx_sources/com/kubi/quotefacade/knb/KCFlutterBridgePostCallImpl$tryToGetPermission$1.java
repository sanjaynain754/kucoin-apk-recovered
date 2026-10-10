package com.kubi.quotefacade.knb;

import androidx.fragment.app.FragmentActivity;
import com.kubi.permissions.utils.PermissionCompatKt;
import com.kubi.sdk.protocol.ProtocolException;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
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
import p852kotlin.jvm.internal.Intrinsics;
import xb0.C46126b;

/* JADX INFO: compiled from: KCFlutterBridgePostCallImpl.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.knb.KCFlutterBridgePostCallImpl$tryToGetPermission$1", m90122f = "KCFlutterBridgePostCallImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCFlutterBridgePostCallImpl$tryToGetPermission$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<List<String>, ProtocolException, Unit> $callback;
    final /* synthetic */ FragmentActivity $fragmentActivity;
    final /* synthetic */ long $maxCount;
    final /* synthetic */ String[] $permissionList;
    final /* synthetic */ C46126b $rxPermissions;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KCFlutterBridgePostCallImpl this$0;

    /* JADX INFO: renamed from: g */
    public static final Unit m52214g(InterfaceC41709m0 interfaceC41709m0, KCFlutterBridgePostCallImpl kCFlutterBridgePostCallImpl, FragmentActivity fragmentActivity, long j11, Function2 function2, Boolean bool) {
        C41696j.m91104d(interfaceC41709m0, C41782z0.m91392b(), null, new KCFlutterBridgePostCallImpl$tryToGetPermission$1$1$1(bool, kCFlutterBridgePostCallImpl, fragmentActivity, j11, function2, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgePostCallImpl$tryToGetPermission$1(C46126b c46126b, String[] strArr, KCFlutterBridgePostCallImpl kCFlutterBridgePostCallImpl, FragmentActivity fragmentActivity, long j11, Function2<? super List<String>, ? super ProtocolException, Unit> function2, Continuation<? super KCFlutterBridgePostCallImpl$tryToGetPermission$1> continuation) {
        super(2, continuation);
        this.$rxPermissions = c46126b;
        this.$permissionList = strArr;
        this.this$0 = kCFlutterBridgePostCallImpl;
        this.$fragmentActivity = fragmentActivity;
        this.$maxCount = j11;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KCFlutterBridgePostCallImpl$tryToGetPermission$1 kCFlutterBridgePostCallImpl$tryToGetPermission$1 = new KCFlutterBridgePostCallImpl$tryToGetPermission$1(this.$rxPermissions, this.$permissionList, this.this$0, this.$fragmentActivity, this.$maxCount, this.$callback, continuation);
        kCFlutterBridgePostCallImpl$tryToGetPermission$1.L$0 = obj;
        return kCFlutterBridgePostCallImpl$tryToGetPermission$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgePostCallImpl$tryToGetPermission$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C46126b c46126b = this.$rxPermissions;
        String[] strArr = this.$permissionList;
        Observable<Boolean> observableM49936e = PermissionCompatKt.m49936e(c46126b, (String[]) Arrays.copyOf(strArr, strArr.length));
        final KCFlutterBridgePostCallImpl kCFlutterBridgePostCallImpl = this.this$0;
        final FragmentActivity fragmentActivity = this.$fragmentActivity;
        final long j11 = this.$maxCount;
        final Function2<List<String>, ProtocolException, Unit> function2 = this.$callback;
        final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.knb.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return KCFlutterBridgePostCallImpl$tryToGetPermission$1.m52214g(interfaceC41709m0, kCFlutterBridgePostCallImpl, fragmentActivity, j11, function2, (Boolean) obj2);
            }
        };
        Disposable disposableSubscribe = observableM49936e.subscribe(new Consumer() { // from class: com.kubi.quotefacade.knb.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                KCFlutterBridgePostCallImpl$tryToGetPermission$1.m52215h(function1, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, new CompositeDisposable());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m52215h(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
