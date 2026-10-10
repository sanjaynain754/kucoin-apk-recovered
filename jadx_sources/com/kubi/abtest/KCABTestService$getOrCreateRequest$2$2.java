package com.kubi.abtest;

import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: KCABTestService.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.abtest.KCABTestService$getOrCreateRequest$2$2", m90122f = "KCABTestService.kt", m90123i = {1, 1, 2, 2}, m90124l = {70, BuiltinOperator.UNSORTED_SEGMENT_MIN, BuiltinOperator.UNSORTED_SEGMENT_MIN}, m90125m = "invokeSuspend", m90126n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock"}, m90127s = {"L$1", "I$0", "L$1", "I$0"})
@SourceDebugExtension({"SMAP\nKCABTestService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCABTestService.kt\ncom/kubi/abtest/KCABTestService$getOrCreateRequest$2$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,151:1\n116#2,11:152\n*S KotlinDebug\n*F\n+ 1 KCABTestService.kt\ncom/kubi/abtest/KCABTestService$getOrCreateRequest$2$2\n*L\n73#1:152,11\n*E\n"})
public final class KCABTestService$getOrCreateRequest$2$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
    final /* synthetic */ String $cacheKey;
    final /* synthetic */ String $defaultValue;
    final /* synthetic */ String $experimentId;
    final /* synthetic */ KCABTestIdentity $identity;
    final /* synthetic */ Ref.ObjectRef<InterfaceC41729r0<String>> $request;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ KCABTestService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCABTestService$getOrCreateRequest$2$2(KCABTestService kCABTestService, String str, String str2, String str3, KCABTestIdentity kCABTestIdentity, Ref.ObjectRef<InterfaceC41729r0<String>> objectRef, Continuation<? super KCABTestService$getOrCreateRequest$2$2> continuation) {
        super(2, continuation);
        this.this$0 = kCABTestService;
        this.$cacheKey = str;
        this.$experimentId = str2;
        this.$defaultValue = str3;
        this.$identity = kCABTestIdentity;
        this.$request = objectRef;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCABTestService$getOrCreateRequest$2$2(this.this$0, this.$cacheKey, this.$experimentId, this.$defaultValue, this.$identity, this.$request, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super String> continuation) {
        return ((KCABTestService$getOrCreateRequest$2$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a7 A[Catch: all -> 0x00ac, TryCatch #4 {all -> 0x00ac, blocks: (B:27:0x009b, B:29:0x00a7, B:34:0x00b3, B:35:0x00ba, B:32:0x00af), top: B:69:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00af A[Catch: all -> 0x00ac, TryCatch #4 {all -> 0x00ac, blocks: (B:27:0x009b, B:29:0x00a7, B:34:0x00b3, B:35:0x00ba, B:32:0x00af), top: B:69:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3 A[Catch: all -> 0x00ac, TryCatch #4 {all -> 0x00ac, blocks: (B:27:0x009b, B:29:0x00a7, B:34:0x00b3, B:35:0x00ba, B:32:0x00af), top: B:69:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fb A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:48:0x00ef, B:50:0x00fb, B:55:0x0107, B:56:0x010e, B:53:0x0103), top: B:61:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0103 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:48:0x00ef, B:50:0x00fb, B:55:0x0107, B:56:0x010e, B:53:0x0103), top: B:61:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0107 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:48:0x00ef, B:50:0x00fb, B:55:0x0107, B:56:0x010e, B:53:0x0103), top: B:61:0x00ef }] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        KCABTestService$getOrCreateRequest$2$2 kCABTestService$getOrCreateRequest$2$2;
        Throwable th2;
        Throwable th3;
        InterfaceC44082a interfaceC44082a;
        KCABTestService kCABTestService;
        String str;
        Ref.ObjectRef<InterfaceC41729r0<String>> objectRef;
        InterfaceC44082a interfaceC44082a2;
        KCABTestService kCABTestService2;
        String str2;
        Ref.ObjectRef<InterfaceC41729r0<String>> objectRef2;
        InterfaceC44082a interfaceC44082a3;
        String str3;
        KCABTestService kCABTestService3;
        String str4;
        Ref.ObjectRef<InterfaceC41729r0<String>> objectRef3;
        Object obj2;
        InterfaceC41729r0<String> interfaceC41729r0;
        InterfaceC41729r0<String> interfaceC41729r1;
        Object obj3;
        InterfaceC41729r0<String> interfaceC41729r2;
        InterfaceC41729r0<String> interfaceC41729r3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        objectRef2 = (Ref.ObjectRef) this.L$4;
                        str2 = (String) this.L$3;
                        kCABTestService2 = (KCABTestService) this.L$2;
                        interfaceC44082a2 = (InterfaceC44082a) this.L$1;
                        th3 = (Throwable) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        try {
                            obj3 = kCABTestService2.f14771h.get(str2);
                            interfaceC41729r2 = objectRef2.element;
                            if (interfaceC41729r2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("request");
                                interfaceC41729r3 = null;
                            } else {
                                interfaceC41729r3 = interfaceC41729r2;
                            }
                            if (obj3 == interfaceC41729r3) {
                                kCABTestService2.f14771h.remove(str2);
                            }
                            Unit unit = Unit.INSTANCE;
                            throw th3;
                        } finally {
                            interfaceC44082a2.mo91345e(null);
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef3 = (Ref.ObjectRef) this.L$4;
                str4 = (String) this.L$3;
                kCABTestService3 = (KCABTestService) this.L$2;
                interfaceC44082a3 = (InterfaceC44082a) this.L$1;
                str3 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                try {
                    ResultKt.throwOnFailure(obj);
                    kCABTestService$getOrCreateRequest$2$2 = this;
                } catch (Throwable th4) {
                    th2 = th4;
                    kCABTestService$getOrCreateRequest$2$2 = this;
                    th3 = th2;
                    interfaceC44082a = kCABTestService$getOrCreateRequest$2$2.this$0.f14769f;
                    kCABTestService = kCABTestService$getOrCreateRequest$2$2.this$0;
                    str = kCABTestService$getOrCreateRequest$2$2.$cacheKey;
                    objectRef = kCABTestService$getOrCreateRequest$2$2.$request;
                    kCABTestService$getOrCreateRequest$2$2.L$0 = th3;
                    kCABTestService$getOrCreateRequest$2$2.L$1 = interfaceC44082a;
                    kCABTestService$getOrCreateRequest$2$2.L$2 = kCABTestService;
                    kCABTestService$getOrCreateRequest$2$2.L$3 = str;
                    kCABTestService$getOrCreateRequest$2$2.L$4 = objectRef;
                    kCABTestService$getOrCreateRequest$2$2.I$0 = 0;
                    kCABTestService$getOrCreateRequest$2$2.label = 3;
                    if (interfaceC44082a.mo91344d(null, this) != coroutine_suspended) {
                        interfaceC44082a2 = interfaceC44082a;
                        kCABTestService2 = kCABTestService;
                        str2 = str;
                        objectRef2 = objectRef;
                        obj3 = kCABTestService2.f14771h.get(str2);
                        interfaceC41729r2 = objectRef2.element;
                        if (interfaceC41729r2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("request");
                            interfaceC41729r3 = null;
                        } else {
                            interfaceC41729r3 = interfaceC41729r2;
                        }
                        if (obj3 == interfaceC41729r3) {
                            kCABTestService2.f14771h.remove(str2);
                        }
                        Unit unit2 = Unit.INSTANCE;
                        throw th3;
                    }
                }
            }
            try {
                obj2 = kCABTestService3.f14771h.get(str4);
                interfaceC41729r0 = objectRef3.element;
                if (interfaceC41729r0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("request");
                    interfaceC41729r1 = null;
                } else {
                    interfaceC41729r1 = interfaceC41729r0;
                }
                if (obj2 == interfaceC41729r1) {
                    kCABTestService3.f14771h.remove(str4);
                }
                Unit unit3 = Unit.INSTANCE;
                return str3;
            } finally {
                interfaceC44082a3.mo91345e(null);
            }
        }
        ResultKt.throwOnFailure(obj);
        try {
            KCABTestService kCABTestService4 = this.this$0;
            String str5 = this.$cacheKey;
            String str6 = this.$experimentId;
            String str7 = this.$defaultValue;
            KCABTestIdentity kCABTestIdentity = this.$identity;
            this.label = 1;
            kCABTestService$getOrCreateRequest$2$2 = this;
            try {
                obj = kCABTestService4.m14636j(str5, str6, str7, kCABTestIdentity, kCABTestService$getOrCreateRequest$2$2);
                if (obj == coroutine_suspended) {
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                th3 = th2;
                interfaceC44082a = kCABTestService$getOrCreateRequest$2$2.this$0.f14769f;
                kCABTestService = kCABTestService$getOrCreateRequest$2$2.this$0;
                str = kCABTestService$getOrCreateRequest$2$2.$cacheKey;
                objectRef = kCABTestService$getOrCreateRequest$2$2.$request;
                kCABTestService$getOrCreateRequest$2$2.L$0 = th3;
                kCABTestService$getOrCreateRequest$2$2.L$1 = interfaceC44082a;
                kCABTestService$getOrCreateRequest$2$2.L$2 = kCABTestService;
                kCABTestService$getOrCreateRequest$2$2.L$3 = str;
                kCABTestService$getOrCreateRequest$2$2.L$4 = objectRef;
                kCABTestService$getOrCreateRequest$2$2.I$0 = 0;
                kCABTestService$getOrCreateRequest$2$2.label = 3;
                if (interfaceC44082a.mo91344d(null, this) != coroutine_suspended) {
                    interfaceC44082a2 = interfaceC44082a;
                    kCABTestService2 = kCABTestService;
                    str2 = str;
                    objectRef2 = objectRef;
                    obj3 = kCABTestService2.f14771h.get(str2);
                    interfaceC41729r2 = objectRef2.element;
                    if (interfaceC41729r2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("request");
                        interfaceC41729r3 = null;
                    } else {
                        interfaceC41729r3 = interfaceC41729r2;
                    }
                    if (obj3 == interfaceC41729r3) {
                        kCABTestService2.f14771h.remove(str2);
                    }
                    Unit unit4 = Unit.INSTANCE;
                    throw th3;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            kCABTestService$getOrCreateRequest$2$2 = this;
            th2 = th;
            th3 = th2;
            interfaceC44082a = kCABTestService$getOrCreateRequest$2$2.this$0.f14769f;
            kCABTestService = kCABTestService$getOrCreateRequest$2$2.this$0;
            str = kCABTestService$getOrCreateRequest$2$2.$cacheKey;
            objectRef = kCABTestService$getOrCreateRequest$2$2.$request;
            kCABTestService$getOrCreateRequest$2$2.L$0 = th3;
            kCABTestService$getOrCreateRequest$2$2.L$1 = interfaceC44082a;
            kCABTestService$getOrCreateRequest$2$2.L$2 = kCABTestService;
            kCABTestService$getOrCreateRequest$2$2.L$3 = str;
            kCABTestService$getOrCreateRequest$2$2.L$4 = objectRef;
            kCABTestService$getOrCreateRequest$2$2.I$0 = 0;
            kCABTestService$getOrCreateRequest$2$2.label = 3;
            if (interfaceC44082a.mo91344d(null, this) != coroutine_suspended) {
                interfaceC44082a2 = interfaceC44082a;
                kCABTestService2 = kCABTestService;
                str2 = str;
                objectRef2 = objectRef;
                obj3 = kCABTestService2.f14771h.get(str2);
                interfaceC41729r2 = objectRef2.element;
                if (interfaceC41729r2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("request");
                    interfaceC41729r3 = null;
                } else {
                    interfaceC41729r3 = interfaceC41729r2;
                }
                if (obj3 == interfaceC41729r3) {
                    kCABTestService2.f14771h.remove(str2);
                }
                Unit unit5 = Unit.INSTANCE;
                throw th3;
            }
        }
        return coroutine_suspended;
        String str8 = (String) obj;
        interfaceC44082a3 = kCABTestService$getOrCreateRequest$2$2.this$0.f14769f;
        KCABTestService kCABTestService5 = kCABTestService$getOrCreateRequest$2$2.this$0;
        String str9 = kCABTestService$getOrCreateRequest$2$2.$cacheKey;
        Ref.ObjectRef<InterfaceC41729r0<String>> objectRef4 = kCABTestService$getOrCreateRequest$2$2.$request;
        kCABTestService$getOrCreateRequest$2$2.L$0 = str8;
        kCABTestService$getOrCreateRequest$2$2.L$1 = interfaceC44082a3;
        kCABTestService$getOrCreateRequest$2$2.L$2 = kCABTestService5;
        kCABTestService$getOrCreateRequest$2$2.L$3 = str9;
        kCABTestService$getOrCreateRequest$2$2.L$4 = objectRef4;
        kCABTestService$getOrCreateRequest$2$2.I$0 = 0;
        kCABTestService$getOrCreateRequest$2$2.label = 2;
        if (interfaceC44082a3.mo91344d(null, this) != coroutine_suspended) {
            str3 = str8;
            kCABTestService3 = kCABTestService5;
            str4 = str9;
            objectRef3 = objectRef4;
            obj2 = kCABTestService3.f14771h.get(str4);
            interfaceC41729r0 = objectRef3.element;
            if (interfaceC41729r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("request");
                interfaceC41729r1 = null;
            } else {
                interfaceC41729r1 = interfaceC41729r0;
            }
            if (obj2 == interfaceC41729r1) {
                kCABTestService3.f14771h.remove(str4);
            }
            Unit unit6 = Unit.INSTANCE;
            return str3;
        }
        return coroutine_suspended;
    }
}
