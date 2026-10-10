package com.kubi.sdk.util;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C41690i;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: PreLoader.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0016B'\b\u0002\u0012\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00028\u0000H\u0086@¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0015\u001a\u00020\u0012R&\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR(\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \f*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/util/PreLoader;", ExifInterface.GPS_DIRECTION_TRUE, "", "loader", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "comparableRef", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/CompletableDeferred;", "kotlin.jvm.PlatformType", "loadState", "Ljava/util/concurrent/atomic/AtomicInteger;", "locker", "Lkotlinx/coroutines/sync/Mutex;", "preload", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "reset", "Companion", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPreLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreLoader.kt\ncom/kubi/sdk/util/PreLoader\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,78:1\n116#2,11:79\n*S KotlinDebug\n*F\n+ 1 PreLoader.kt\ncom/kubi/sdk/util/PreLoader\n*L\n37#1:79,11\n*E\n"})
public final class PreLoader<T> {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f48118e = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Function1<Continuation<? super T>, Object> f48119a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AtomicReference<InterfaceC41769w<T>> f48120b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final AtomicInteger f48121c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC44082a f48122d;

    /* JADX INFO: compiled from: PreLoader.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0001\u0010\n2\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/util/PreLoader$Companion;", "", "<init>", "()V", "STATUE_NONE", "", "STATUE_LOADING", "STATUE_FINISH", "create", "Lcom/kubi/sdk/util/PreLoader;", ExifInterface.GPS_DIRECTION_TRUE, "loader", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/util/PreLoader;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final <T> PreLoader<T> create(@NotNull Function1<? super Continuation<? super T>, ? extends Object> loader) {
            Intrinsics.checkNotNullParameter(loader, "loader");
            return new PreLoader<>(loader, null);
        }
    }

    public /* synthetic */ PreLoader(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreLoader(Function1<? super Continuation<? super T>, ? extends Object> function1) {
        this.f48119a = function1;
        this.f48120b = new AtomicReference<>(C41777y.m91388c(null, 1, null));
        this.f48121c = new AtomicInteger(0);
        this.f48122d = C44087f.m97144b(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m58344d(@NotNull Continuation<? super T> continuation) {
        PreLoader$loadData$1 preLoader$loadData$1;
        if (continuation instanceof PreLoader$loadData$1) {
            preLoader$loadData$1 = (PreLoader$loadData$1) continuation;
            int i11 = preLoader$loadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                preLoader$loadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                preLoader$loadData$1 = new PreLoader$loadData$1(this, continuation);
            }
        } else {
            preLoader$loadData$1 = new PreLoader$loadData$1(this, continuation);
        }
        Object obj = preLoader$loadData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = preLoader$loadData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f48121c.get() == 0) {
                preLoader$loadData$1.label = 1;
                if (m58345e(preLoader$loadData$1) != coroutine_suspended) {
                }
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41769w<T> interfaceC41769w = this.f48120b.get();
        preLoader$loadData$1.label = 2;
        Object objMo91198h = interfaceC41769w.mo91198h(preLoader$loadData$1);
        return objMo91198h == coroutine_suspended ? coroutine_suspended : objMo91198h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [rg0.a] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18, types: [rg0.a] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.kubi.sdk.util.PreLoader$preload$1, java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [rg0.a] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, rg0.a] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, rg0.a] */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlinx.coroutines.w] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlinx.coroutines.w] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlinx.coroutines.w] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m58345e(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        ?? preLoader$preload$1;
        Throwable th2;
        ?? r11;
        int i11;
        Throwable th3;
        ?? r12;
        AtomicInteger atomicInteger;
        ?? r13;
        if (continuation instanceof PreLoader$preload$1) {
            PreLoader$preload$1 preLoader$preload$2 = (PreLoader$preload$1) continuation;
            int i12 = preLoader$preload$2.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                preLoader$preload$2.label = i12 - Integer.MIN_VALUE;
                preLoader$preload$1 = preLoader$preload$2;
            } else {
                preLoader$preload$1 = new PreLoader$preload$1(this, continuation);
            }
        } else {
            preLoader$preload$1 = new PreLoader$preload$1(this, continuation);
        }
        Object obj = preLoader$preload$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = preLoader$preload$1.label;
        try {
            try {
                if (i13 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.f48121c.get() != 0) {
                        return Unit.INSTANCE;
                    }
                    ?? r14 = this.f48122d;
                    preLoader$preload$1.L$0 = r14;
                    preLoader$preload$1.I$0 = 0;
                    preLoader$preload$1.label = 1;
                    if (r14.mo91344d(null, preLoader$preload$1) != coroutine_suspended) {
                        i11 = 0;
                        r11 = r14;
                    }
                    return coroutine_suspended;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r12 = (InterfaceC41769w) preLoader$preload$1.L$1;
                    preLoader$preload$1 = (InterfaceC44082a) preLoader$preload$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        preLoader$preload$1 = preLoader$preload$1;
                        r12 = r12;
                        r12.mo91370n(obj);
                        atomicInteger = this.f48121c;
                        r13 = preLoader$preload$1;
                    } catch (Throwable th4) {
                        th3 = th4;
                        try {
                            r12.mo91369m(th3);
                            atomicInteger = this.f48121c;
                            r13 = preLoader$preload$1;
                        } catch (Throwable th5) {
                            this.f48121c.set(2);
                            throw th5;
                        }
                    }
                    atomicInteger.set(2);
                    r13.mo91345e(null);
                    return Unit.INSTANCE;
                }
                i11 = preLoader$preload$1.I$0;
                InterfaceC44082a interfaceC44082a = (InterfaceC44082a) preLoader$preload$1.L$0;
                ResultKt.throwOnFailure(obj);
                r11 = interfaceC44082a;
                InterfaceC41769w<T> interfaceC41769w = this.f48120b.get();
                if (this.f48121c.get() != 0) {
                    Unit unit = Unit.INSTANCE;
                    r11.mo91345e(null);
                    return unit;
                }
                this.f48121c.set(1);
                try {
                    Function1<Continuation<? super T>, Object> function1 = this.f48119a;
                    preLoader$preload$1.L$0 = r11;
                    preLoader$preload$1.L$1 = interfaceC41769w;
                    preLoader$preload$1.I$0 = i11;
                    preLoader$preload$1.I$1 = 0;
                    preLoader$preload$1.label = 2;
                    Object objInvoke = function1.invoke(preLoader$preload$1);
                    if (objInvoke != coroutine_suspended) {
                        preLoader$preload$1 = r11;
                        obj = objInvoke;
                        r12 = interfaceC41769w;
                        r12.mo91370n(obj);
                        atomicInteger = this.f48121c;
                        r13 = preLoader$preload$1;
                        atomicInteger.set(2);
                        r13.mo91345e(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Throwable th6) {
                    preLoader$preload$1 = r11;
                    th3 = th6;
                    r12 = interfaceC41769w;
                    r12.mo91369m(th3);
                    atomicInteger = this.f48121c;
                    r13 = preLoader$preload$1;
                }
            } catch (Throwable th7) {
                th2 = th7;
                r11.mo91345e(null);
                throw th2;
            }
        } catch (Throwable th8) {
            ?? r15 = preLoader$preload$1;
            th2 = th8;
            r11 = r15;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m58346f() throws InterruptedException {
        if (this.f48121c.get() == 0) {
            return;
        }
        C41690i.m91067b(null, new PreLoader$reset$1(this, null), 1, null);
    }
}
