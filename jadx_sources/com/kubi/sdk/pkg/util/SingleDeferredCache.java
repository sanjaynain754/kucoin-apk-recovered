package com.kubi.sdk.pkg.util;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41729r0;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: SingleDeferredCache.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000  *\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002!\u0011B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004JK\u0010\r\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, m90084d2 = {"Lcom/kubi/sdk/pkg/util/SingleDeferredCache;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "", "key", "Lkotlin/Function0;", "", "onReuse", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timeout", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(J)V", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlinx/coroutines/r0;", "Ljava/util/concurrent/ConcurrentHashMap;", "singleCache", "Lcom/kubi/sdk/pkg/util/SingleDeferredCache$a;", "resultCache", "Lrg0/a;", "Lrg0/a;", "singleLock", "d", "resultLock", "e", "Companion", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSingleDeferredCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleDeferredCache.kt\ncom/kubi/sdk/pkg/util/SingleDeferredCache\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 SingleDeferredCache.kt\ncom/kubi/sdk/pkg/util/SingleDeferredCache$Companion\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n108#2,10:112\n108#2,10:133\n515#3:122\n500#3,2:123\n502#3,4:127\n26#4:125\n25#4:126\n1855#5,2:131\n*S KotlinDebug\n*F\n+ 1 SingleDeferredCache.kt\ncom/kubi/sdk/pkg/util/SingleDeferredCache\n*L\n47#1:112,10\n92#1:133,10\n78#1:122\n78#1:123,2\n78#1:127,4\n78#1:125\n78#1:126\n79#1:131,2\n*E\n"})
public final class SingleDeferredCache<T> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, InterfaceC41729r0<T>> singleCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, C23980a<T>> resultCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44082a singleLock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44082a resultLock;

    /* JADX INFO: compiled from: SingleDeferredCache.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/pkg/util/SingleDeferredCache$Companion;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/sdk/pkg/util/SingleDeferredCache;", "create", "()Lcom/kubi/sdk/pkg/util/SingleDeferredCache;", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSingleDeferredCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleDeferredCache.kt\ncom/kubi/sdk/pkg/util/SingleDeferredCache$Companion\n*L\n1#1,111:1\n25#1:112\n*S KotlinDebug\n*F\n+ 1 SingleDeferredCache.kt\ncom/kubi/sdk/pkg/util/SingleDeferredCache$Companion\n*L\n26#1:112\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final <T> SingleDeferredCache<T> create() {
            return new SingleDeferredCache<>(null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.util.SingleDeferredCache$a */
    /* JADX INFO: compiled from: SingleDeferredCache.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\f¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/pkg/util/SingleDeferredCache$a;", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "<init>", "(Ljava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "", "J", "()J", "timestamp", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSingleDeferredCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleDeferredCache.kt\ncom/kubi/sdk/pkg/util/SingleDeferredCache$Item\n+ 2 SingleDeferredCache.kt\ncom/kubi/sdk/pkg/util/SingleDeferredCache$Companion\n*L\n1#1,111:1\n25#2:112\n*S KotlinDebug\n*F\n+ 1 SingleDeferredCache.kt\ncom/kubi/sdk/pkg/util/SingleDeferredCache$Item\n*L\n30#1:112\n*E\n"})
    public static final class C23980a<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final T value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long timestamp;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: b */
        public final T m57849b() {
            return this.value;
        }

        public C23980a(T t11) {
            this.value = t11;
            Companion companion = SingleDeferredCache.INSTANCE;
            this.timestamp = System.currentTimeMillis();
        }
    }

    public /* synthetic */ SingleDeferredCache(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public SingleDeferredCache() {
        this.singleCache = new ConcurrentHashMap<>();
        this.resultCache = new ConcurrentHashMap<>();
        this.singleLock = C44087f.m97144b(false, 1, null);
        this.resultLock = C44087f.m97144b(false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m57844d(SingleDeferredCache singleDeferredCache, String str, Function0 function0, Function1 function1, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        return singleDeferredCache.m57847c(str, function0, function1, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m57845a(@NotNull String str, long j11, @NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> continuation) throws Throwable {
        SingleDeferredCache$cache$1 singleDeferredCache$cache$1;
        InterfaceC44082a interfaceC44082a;
        SingleDeferredCache<T> singleDeferredCache;
        Function1<? super Continuation<? super T>, ? extends Object> function2;
        Throwable th2;
        InterfaceC44082a interfaceC44082a2;
        SingleDeferredCache<T> singleDeferredCache2;
        String str2;
        if (continuation instanceof SingleDeferredCache$cache$1) {
            singleDeferredCache$cache$1 = (SingleDeferredCache$cache$1) continuation;
            int i11 = singleDeferredCache$cache$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                singleDeferredCache$cache$1.label = i11 - Integer.MIN_VALUE;
            } else {
                singleDeferredCache$cache$1 = new SingleDeferredCache$cache$1(this, continuation);
            }
        } else {
            singleDeferredCache$cache$1 = new SingleDeferredCache$cache$1(this, continuation);
        }
        SingleDeferredCache$cache$1 singleDeferredCache$cache$2 = singleDeferredCache$cache$1;
        Object obj = singleDeferredCache$cache$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = singleDeferredCache$cache$2.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                interfaceC44082a = this.resultLock;
                singleDeferredCache$cache$2.L$0 = this;
                singleDeferredCache$cache$2.L$1 = str;
                singleDeferredCache$cache$2.L$2 = function1;
                singleDeferredCache$cache$2.L$3 = interfaceC44082a;
                singleDeferredCache$cache$2.J$0 = j11;
                singleDeferredCache$cache$2.label = 1;
                if (interfaceC44082a.mo91344d(null, singleDeferredCache$cache$2) != coroutine_suspended) {
                    singleDeferredCache = this;
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC44082a2 = (InterfaceC44082a) singleDeferredCache$cache$2.L$2;
                str2 = (String) singleDeferredCache$cache$2.L$1;
                singleDeferredCache2 = (SingleDeferredCache) singleDeferredCache$cache$2.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    singleDeferredCache2.resultCache.put(str2, new C23980a<>(obj));
                    interfaceC44082a2.mo91345e(null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    interfaceC44082a2.mo91345e(null);
                    throw th2;
                }
            }
            j11 = singleDeferredCache$cache$2.J$0;
            InterfaceC44082a interfaceC44082a3 = (InterfaceC44082a) singleDeferredCache$cache$2.L$3;
            function1 = (Function1) singleDeferredCache$cache$2.L$2;
            String str3 = (String) singleDeferredCache$cache$2.L$1;
            SingleDeferredCache<T> singleDeferredCache3 = (SingleDeferredCache) singleDeferredCache$cache$2.L$0;
            ResultKt.throwOnFailure(obj);
            interfaceC44082a = interfaceC44082a3;
            str = str3;
            singleDeferredCache = singleDeferredCache3;
            singleDeferredCache.m57846b(j11);
            C23980a<T> c23980a = singleDeferredCache.resultCache.get(str);
            if (c23980a != null) {
                T tM57849b = c23980a.m57849b();
                interfaceC44082a.mo91345e(null);
                return tM57849b;
            }
            singleDeferredCache$cache$2.L$0 = singleDeferredCache;
            singleDeferredCache$cache$2.L$1 = str;
            singleDeferredCache$cache$2.L$2 = interfaceC44082a;
            singleDeferredCache$cache$2.L$3 = null;
            singleDeferredCache$cache$2.label = 2;
            String str4 = str;
            Object objM57844d = m57844d(singleDeferredCache, str4, null, function2, singleDeferredCache$cache$2, 2, null);
            if (objM57844d != coroutine_suspended) {
                InterfaceC44082a interfaceC44082a4 = interfaceC44082a;
                obj = objM57844d;
                interfaceC44082a2 = interfaceC44082a4;
                singleDeferredCache2 = singleDeferredCache;
                str2 = str4;
                singleDeferredCache2.resultCache.put(str2, new C23980a<>(obj));
                interfaceC44082a2.mo91345e(null);
                return obj;
            }
            return coroutine_suspended;
        } catch (Throwable th4) {
            th2 = th4;
            interfaceC44082a2 = interfaceC44082a;
            interfaceC44082a2.mo91345e(null);
            throw th2;
        }
        function2 = function1;
    }

    /* JADX INFO: renamed from: b */
    public final void m57846b(long timeout) {
        ConcurrentHashMap<String, C23980a<T>> concurrentHashMap = this.resultCache;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C23980a<T>> entry : concurrentHashMap.entrySet()) {
            long timestamp = entry.getValue().getTimestamp();
            if (timeout <= 0 || System.currentTimeMillis() - timestamp > timeout) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator<T> it = MapsKt.toList(linkedHashMap).iterator();
        while (it.hasNext()) {
            this.resultCache.remove(((Pair) it.next()).getFirst());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m57847c(@NotNull String str, @Nullable Function0<Unit> function0, @NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> continuation) {
        SingleDeferredCache$single$1 singleDeferredCache$single$1;
        Ref.BooleanRef booleanRef;
        InterfaceC44082a interfaceC44082a;
        Function1<? super Continuation<? super T>, ? extends Object> function2;
        InterfaceC41769w interfaceC41769w;
        SingleDeferredCache<T> singleDeferredCache;
        String str2;
        InterfaceC41769w interfaceC41769w2;
        SingleDeferredCache<T> singleDeferredCache2;
        if (continuation instanceof SingleDeferredCache$single$1) {
            singleDeferredCache$single$1 = (SingleDeferredCache$single$1) continuation;
            int i11 = singleDeferredCache$single$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                singleDeferredCache$single$1.label = i11 - Integer.MIN_VALUE;
            } else {
                singleDeferredCache$single$1 = new SingleDeferredCache$single$1(this, continuation);
            }
        } else {
            singleDeferredCache$single$1 = new SingleDeferredCache$single$1(this, continuation);
        }
        Object objInvoke = singleDeferredCache$single$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = singleDeferredCache$single$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
                booleanRef = new Ref.BooleanRef();
                interfaceC44082a = this.singleLock;
                singleDeferredCache$single$1.L$0 = this;
                singleDeferredCache$single$1.L$1 = str;
                singleDeferredCache$single$1.L$2 = function0;
                singleDeferredCache$single$1.L$3 = function1;
                singleDeferredCache$single$1.L$4 = interfaceC41769wM91388c;
                singleDeferredCache$single$1.L$5 = booleanRef;
                singleDeferredCache$single$1.L$6 = interfaceC44082a;
                singleDeferredCache$single$1.label = 1;
                if (interfaceC44082a.mo91344d(null, singleDeferredCache$single$1) != coroutine_suspended) {
                    function2 = function1;
                    interfaceC41769w = interfaceC41769wM91388c;
                    singleDeferredCache = this;
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 == 2) {
                    ResultKt.throwOnFailure(objInvoke);
                    return objInvoke;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC41769w2 = (InterfaceC41769w) singleDeferredCache$single$1.L$2;
                str2 = (String) singleDeferredCache$single$1.L$1;
                singleDeferredCache2 = (SingleDeferredCache) singleDeferredCache$single$1.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke);
                    interfaceC41769w2 = interfaceC41769w2;
                    interfaceC41769w2.mo91370n(objInvoke);
                    singleDeferredCache2.singleCache.remove(str2, interfaceC41769w2);
                    return objInvoke;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        interfaceC41769w2.mo91369m(th);
                        throw th;
                    } catch (Throwable th3) {
                        singleDeferredCache2.singleCache.remove(str2, interfaceC41769w2);
                        throw th3;
                    }
                }
            }
            InterfaceC44082a interfaceC44082a2 = (InterfaceC44082a) singleDeferredCache$single$1.L$6;
            Ref.BooleanRef booleanRef2 = (Ref.BooleanRef) singleDeferredCache$single$1.L$5;
            interfaceC41769w = (InterfaceC41769w) singleDeferredCache$single$1.L$4;
            Function1<? super Continuation<? super T>, ? extends Object> function3 = (Function1) singleDeferredCache$single$1.L$3;
            Function0<Unit> function4 = (Function0) singleDeferredCache$single$1.L$2;
            String str3 = (String) singleDeferredCache$single$1.L$1;
            singleDeferredCache = (SingleDeferredCache) singleDeferredCache$single$1.L$0;
            ResultKt.throwOnFailure(objInvoke);
            function2 = function3;
            booleanRef = booleanRef2;
            function0 = function4;
            interfaceC44082a = interfaceC44082a2;
            str = str3;
            InterfaceC41729r0<T> interfaceC41729r0 = singleDeferredCache.singleCache.get(str);
            if (interfaceC41729r0 == null) {
                singleDeferredCache.singleCache.put(str, interfaceC41769w);
                booleanRef.element = true;
                interfaceC41729r0 = interfaceC41769w;
            } else if (function0 != null) {
                function0.invoke();
            }
            interfaceC44082a.mo91345e(null);
            if (booleanRef.element) {
                try {
                    singleDeferredCache$single$1.L$0 = singleDeferredCache;
                    singleDeferredCache$single$1.L$1 = str;
                    singleDeferredCache$single$1.L$2 = interfaceC41769w;
                    singleDeferredCache$single$1.L$3 = null;
                    singleDeferredCache$single$1.L$4 = null;
                    singleDeferredCache$single$1.L$5 = null;
                    singleDeferredCache$single$1.L$6 = null;
                    singleDeferredCache$single$1.label = 3;
                    objInvoke = function2.invoke(singleDeferredCache$single$1);
                    if (objInvoke != coroutine_suspended) {
                        str2 = str;
                        interfaceC41769w2 = interfaceC41769w;
                        singleDeferredCache2 = singleDeferredCache;
                        interfaceC41769w2.mo91370n(objInvoke);
                        singleDeferredCache2.singleCache.remove(str2, interfaceC41769w2);
                        return objInvoke;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str2 = str;
                    interfaceC41769w2 = interfaceC41769w;
                    singleDeferredCache2 = singleDeferredCache;
                    interfaceC41769w2.mo91369m(th);
                    throw th;
                }
            } else {
                singleDeferredCache$single$1.L$0 = null;
                singleDeferredCache$single$1.L$1 = null;
                singleDeferredCache$single$1.L$2 = null;
                singleDeferredCache$single$1.L$3 = null;
                singleDeferredCache$single$1.L$4 = null;
                singleDeferredCache$single$1.L$5 = null;
                singleDeferredCache$single$1.L$6 = null;
                singleDeferredCache$single$1.label = 2;
                Object objMo91198h = interfaceC41729r0.mo91198h(singleDeferredCache$single$1);
                if (objMo91198h != coroutine_suspended) {
                    return objMo91198h;
                }
            }
            return coroutine_suspended;
        } catch (Throwable th5) {
            interfaceC44082a.mo91345e(null);
            throw th5;
        }
    }
}
