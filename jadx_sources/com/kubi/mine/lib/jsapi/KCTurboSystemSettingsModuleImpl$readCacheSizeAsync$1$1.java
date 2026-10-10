package com.kubi.mine.lib.jsapi;

import android.content.Context;
import com.kubi.utils.C27053i;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCTurboSystemSettingsModuleImpl.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl$readCacheSizeAsync$1$1", m90122f = "KCTurboSystemSettingsModuleImpl.kt", m90123i = {0, 0}, m90124l = {283}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "cacheSizeText"}, m90127s = {"L$0", "L$1"})
public final class KCTurboSystemSettingsModuleImpl$readCacheSizeAsync$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Function1<String, Unit> $onResult;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ KCTurboSystemSettingsModuleImpl this$0;

    /* JADX INFO: renamed from: com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl$readCacheSizeAsync$1$1$1 */
    /* JADX INFO: compiled from: KCTurboSystemSettingsModuleImpl.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl$readCacheSizeAsync$1$1$1", m90122f = "KCTurboSystemSettingsModuleImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C189411 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $cacheSizeText;
        final /* synthetic */ Function1<String, Unit> $onResult;
        int label;
        final /* synthetic */ KCTurboSystemSettingsModuleImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C189411(KCTurboSystemSettingsModuleImpl kCTurboSystemSettingsModuleImpl, Function1<? super String, Unit> function1, String str, Continuation<? super C189411> continuation) {
            super(2, continuation);
            this.this$0 = kCTurboSystemSettingsModuleImpl;
            this.$onResult = function1;
            this.$cacheSizeText = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C189411(this.this$0, this.$onResult, this.$cacheSizeText, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C189411) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.this$0.getReactApplicationContext().hasActiveReactInstance()) {
                    return Unit.INSTANCE;
                }
                this.$onResult.invoke(this.$cacheSizeText);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCTurboSystemSettingsModuleImpl$readCacheSizeAsync$1$1(Context context, KCTurboSystemSettingsModuleImpl kCTurboSystemSettingsModuleImpl, Function1<? super String, Unit> function1, Continuation<? super KCTurboSystemSettingsModuleImpl$readCacheSizeAsync$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.this$0 = kCTurboSystemSettingsModuleImpl;
        this.$onResult = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KCTurboSystemSettingsModuleImpl$readCacheSizeAsync$1$1 kCTurboSystemSettingsModuleImpl$readCacheSizeAsync$1$1 = new KCTurboSystemSettingsModuleImpl$readCacheSizeAsync$1$1(this.$ctx, this.this$0, this.$onResult, continuation);
        kCTurboSystemSettingsModuleImpl$readCacheSizeAsync$1$1.L$0 = obj;
        return kCTurboSystemSettingsModuleImpl$readCacheSizeAsync$1$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCTurboSystemSettingsModuleImpl$readCacheSizeAsync$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = this.$ctx;
            try {
                Result.Companion companion = Result.INSTANCE;
                C27053i c27053i = C27053i.f54338a;
                Intrinsics.checkNotNull(context);
                objM103844constructorimpl = Result.m103844constructorimpl(c27053i.m66736f(context));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = KCTurboSystemSettingsModuleImpl.CACHE_SIZE_FALLBACK;
            }
            String str = (String) objM103844constructorimpl;
            AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
            C189411 c189411 = new C189411(this.this$0, this.$onResult, str, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(str);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94121c, c189411, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
