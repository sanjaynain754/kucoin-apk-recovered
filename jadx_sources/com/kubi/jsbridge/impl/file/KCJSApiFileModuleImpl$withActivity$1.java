package com.kubi.jsbridge.impl.file;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C5258a;
import com.kubi.sdk.protocol.ProtocolException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCJSApiFileModuleImpl.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.jsbridge.impl.file.KCJSApiFileModuleImpl$withActivity$1", m90122f = "KCJSApiFileModuleImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCJSApiFileModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJSApiFileModuleImpl.kt\ncom/kubi/jsbridge/impl/file/KCJSApiFileModuleImpl$withActivity$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
public final class KCJSApiFileModuleImpl$withActivity$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<FragmentActivity, Unit> $action;
    final /* synthetic */ Function2<T, ProtocolException, Unit> $callback;
    final /* synthetic */ Context $ctx;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCJSApiFileModuleImpl$withActivity$1(Context context, Function2<? super T, ? super ProtocolException, Unit> function2, Function1<? super FragmentActivity, Unit> function1, Continuation<? super KCJSApiFileModuleImpl$withActivity$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$callback = function2;
        this.$action = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KCJSApiFileModuleImpl$withActivity$1 kCJSApiFileModuleImpl$withActivity$1 = new KCJSApiFileModuleImpl$withActivity$1(this.$ctx, this.$callback, this.$action, continuation);
        kCJSApiFileModuleImpl$withActivity$1.L$0 = obj;
        return kCJSApiFileModuleImpl$withActivity$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCJSApiFileModuleImpl$withActivity$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Context context = this.$ctx;
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null) {
            Activity activityM6125h = C5258a.m6125h();
            fragmentActivity = activityM6125h instanceof FragmentActivity ? (FragmentActivity) activityM6125h : null;
        }
        if (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            this.$callback.invoke(null, new ProtocolException("File bridge requires an active FragmentActivity", null, null, false, 14, null));
            return Unit.INSTANCE;
        }
        Function1<FragmentActivity, Unit> function1 = this.$action;
        try {
            Result.Companion companion = Result.INSTANCE;
            function1.invoke(fragmentActivity);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Function2<T, ProtocolException, Unit> function2 = this.$callback;
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            function2.invoke(null, new ProtocolException("File bridge failed: " + thM103847exceptionOrNullimpl.getMessage(), thM103847exceptionOrNullimpl, null, false, 12, null));
        }
        return Unit.INSTANCE;
    }
}
