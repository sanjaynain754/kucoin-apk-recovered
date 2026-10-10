package com.kubi.jsbridge.impl.biz;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.kubi.permissions.utils.PermissionCompatKt;
import com.kubi.sdk.protocol.ProtocolException;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
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
import xb0.C46126b;

/* JADX INFO: compiled from: KCJSApiCalendarModuleImpl.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.jsbridge.impl.biz.KCJSApiCalendarModuleImpl$requestPermission$1", m90122f = "KCJSApiCalendarModuleImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCJSApiCalendarModuleImpl$requestPermission$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<String, ProtocolException, Unit> $callback;
    final /* synthetic */ Context $ctx;
    int label;
    final /* synthetic */ KCJSApiCalendarModuleImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCJSApiCalendarModuleImpl$requestPermission$1(Context context, Function2<? super String, ? super ProtocolException, Unit> function2, KCJSApiCalendarModuleImpl kCJSApiCalendarModuleImpl, Continuation<? super KCJSApiCalendarModuleImpl$requestPermission$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$callback = function2;
        this.this$0 = kCJSApiCalendarModuleImpl;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCJSApiCalendarModuleImpl$requestPermission$1(this.$ctx, this.$callback, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCJSApiCalendarModuleImpl$requestPermission$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m31548i(Function2 function2, Boolean bool) {
        if (bool.booleanValue()) {
            function2.invoke("authorized", null);
        } else {
            function2.invoke("denied", null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m31549j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m31550k(KCJSApiCalendarModuleImpl kCJSApiCalendarModuleImpl, Function2 function2, Throwable th2) {
        C44128b.m97262f(kCJSApiCalendarModuleImpl.f27359a, "requestPermission error", th2);
        String message = th2.getMessage();
        if (message == null) {
            message = "Request permission failed";
        }
        function2.invoke(null, new ProtocolException(message, null, null, false, 14, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m31551l(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Activity currentActivity;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                Context context = this.$ctx;
                if (context instanceof ReactApplicationContext) {
                    currentActivity = ((ReactApplicationContext) context).getCurrentActivity();
                } else if (context instanceof Activity) {
                    currentActivity = (Activity) context;
                } else {
                    currentActivity = null;
                }
                if (currentActivity == null) {
                    this.$callback.invoke(null, new ProtocolException("Cannot get Activity from Context", null, null, false, 14, null));
                    return Unit.INSTANCE;
                }
                if (!(currentActivity instanceof FragmentActivity)) {
                    this.$callback.invoke(null, new ProtocolException("Activity must be FragmentActivity", null, null, false, 14, null));
                    return Unit.INSTANCE;
                }
                Observable<Boolean> observableM49936e = PermissionCompatKt.m49936e(new C46126b((FragmentActivity) currentActivity), "android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR");
                final Function2<String, ProtocolException, Unit> function2 = this.$callback;
                final Function1 function1 = new Function1() { // from class: com.kubi.jsbridge.impl.biz.a
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return KCJSApiCalendarModuleImpl$requestPermission$1.m31548i(function2, (Boolean) obj2);
                    }
                };
                Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.jsbridge.impl.biz.b
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj2) {
                        KCJSApiCalendarModuleImpl$requestPermission$1.m31549j(function1, obj2);
                    }
                };
                final KCJSApiCalendarModuleImpl kCJSApiCalendarModuleImpl = this.this$0;
                final Function2<String, ProtocolException, Unit> function3 = this.$callback;
                final Function1 function4 = new Function1() { // from class: com.kubi.jsbridge.impl.biz.c
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return KCJSApiCalendarModuleImpl$requestPermission$1.m31550k(kCJSApiCalendarModuleImpl, function3, (Throwable) obj2);
                    }
                };
                observableM49936e.subscribe(consumer, new Consumer() { // from class: com.kubi.jsbridge.impl.biz.d
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj2) {
                        KCJSApiCalendarModuleImpl$requestPermission$1.m31551l(function4, obj2);
                    }
                });
                return Unit.INSTANCE;
            } catch (Exception e11) {
                C44128b.m97262f(this.this$0.f27359a, "requestPermission error", e11);
                Function2<String, ProtocolException, Unit> function5 = this.$callback;
                String message = e11.getMessage();
                if (message == null) {
                    message = "Request permission failed";
                }
                function5.invoke(null, new ProtocolException(message, null, null, false, 14, null));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
