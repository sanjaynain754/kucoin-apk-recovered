package kotlinx.coroutines.sync;

import androidx.concurrent.futures.C1481a;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.C41717o0;
import kotlinx.coroutines.C41724q;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41784z2;
import kotlinx.coroutines.selects.InterfaceC41754i;
import kotlinx.coroutines.sync.C41756a;
import og0.AbstractC43081x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.a */
/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0004\b\u0016\u0010\u000bJ\u0019\u0010\u0017\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0015R\u007f\u0010$\u001am\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t0\u00180\u0018j\u0002`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070(8\u0002X\u0082\u0004¨\u0006)"}, m90084d2 = {"Lkotlinx/coroutines/sync/a;", "Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "Lrg0/a;", "", "locked", "<init>", "(Z)V", "", TUIConstants.TUIChat.OWNER, "", "d", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Z", "e", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Ljava/lang/Object;)I", "C", "F", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/i;", "Lkotlin/ParameterName;", "name", "select", "param", "internalResult", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lkotlin/jvm/functions/Function3;", "onSelectCancellationUnlockConstructor", "b", "()Z", "isLocked", "Lkotlinx/atomicfu/AtomicRef;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n444#2,12:315\n1#3:327\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n171#1:315,12\n*E\n"})
public class C41756a extends SemaphoreAndMutexImpl implements InterfaceC44082a {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91859i = AtomicReferenceFieldUpdater.newUpdater(C41756a.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Function3<InterfaceC41754i<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> onSelectCancellationUnlockConstructor;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.a$a */
    /* JADX INFO: compiled from: Mutex.kt */
    @Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ|\u0010\u0015\u001a\u0004\u0018\u00010\u0006\"\b\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00062M\u0010\u0014\u001aI\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016Jp\u0010\u0017\u001a\u00020\u0002\"\b\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u00002M\u0010\u0014\u001aI\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\b \u0010!J9\u0010%\u001a\u00020\u00022'\u0010$\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00020\"j\u0002`#H\u0096\u0001¢\u0006\u0004\b%\u0010&J$\u0010+\u001a\u00020\u00022\n\u0010(\u001a\u0006\u0012\u0002\b\u00030'2\u0006\u0010*\u001a\u00020)H\u0096\u0001¢\u0006\u0004\b+\u0010,J\u001c\u0010.\u001a\u00020\u0002*\u00020-2\u0006\u0010\u000b\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b.\u0010/J\u001e\u00102\u001a\u00020\u00022\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000200H\u0096\u0001¢\u0006\u0004\b2\u0010\u001eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u00105R\u0014\u00106\u001a\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00107R\u0014\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006;"}, m90084d2 = {"Lkotlinx/coroutines/sync/a$a;", "Lkotlinx/coroutines/m;", "", "Lkotlinx/coroutines/z2;", "Lkotlinx/coroutines/o;", "cont", "", TUIConstants.TUIChat.OWNER, "<init>", "(Lkotlinx/coroutines/sync/a;Lkotlinx/coroutines/o;Ljava/lang/Object;)V", "R", "value", "idempotent", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "onCancellation", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlin/Unit;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "d", "(Lkotlin/Unit;Lkotlin/jvm/functions/Function3;)V", "exception", "y", "(Ljava/lang/Throwable;)Ljava/lang/Object;", InterfaceC33826o0.f71244p, CmcdData.Factory.STREAMING_FORMAT_SS, "(Ljava/lang/Object;)V", "", "c", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "t", "(Lkotlin/jvm/functions/Function1;)V", "Log0/x;", "segment", "", "index", "e", "(Log0/x;I)V", "Lkotlinx/coroutines/j0;", "g", "(Lkotlinx/coroutines/j0;Lkotlin/Unit;)V", "Lkotlin/Result;", DbParams.KEY_CHANNEL_RESULT, "resumeWith", "b", "Lkotlinx/coroutines/o;", "Ljava/lang/Object;", "isActive", "()Z", "isCompleted", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n1#2:315\n*E\n"})
    public final class a implements InterfaceC41708m<Unit>, InterfaceC41784z2 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final C41716o<Unit> cont;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Object owner;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Nullable C41716o<? super Unit> c41716o, Object obj) {
            this.cont = c41716o;
            this.owner = obj;
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m91348f(C41756a c41756a, a aVar, Throwable th2) {
            c41756a.mo91345e(aVar.owner);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.InterfaceC41708m
        /* JADX INFO: renamed from: c */
        public boolean mo91116c(@Nullable Throwable cause) {
            return this.cont.mo91116c(cause);
        }

        @Override // kotlinx.coroutines.InterfaceC41784z2
        /* JADX INFO: renamed from: e */
        public void mo90632e(@NotNull AbstractC43081x<?> segment, int index) {
            this.cont.mo90632e(segment, index);
        }

        @Override // kotlinx.coroutines.InterfaceC41708m
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo91114B(@NotNull AbstractC41697j0 abstractC41697j0, @NotNull Unit unit) {
            this.cont.mo91114B(abstractC41697j0, unit);
        }

        @Override // p852kotlin.coroutines.Continuation
        @NotNull
        /* JADX INFO: renamed from: getContext */
        public CoroutineContext get$context() {
            return this.cont.get$context();
        }

        @Override // kotlinx.coroutines.InterfaceC41708m
        @Nullable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public <R extends Unit> Object mo91115G(@NotNull R value, @Nullable Object idempotent, @Nullable Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
            final C41756a c41756a = C41756a.this;
            Object objMo91115G = this.cont.mo91115G(value, idempotent, new Function3() { // from class: rg0.d
                @Override // p852kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return C41756a.a.m91349i(c41756a, this, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
                }
            });
            if (objMo91115G != null) {
                C41756a.m91338z().set(C41756a.this, this.owner);
            }
            return objMo91115G;
        }

        @Override // kotlinx.coroutines.InterfaceC41708m
        public boolean isActive() {
            return this.cont.isActive();
        }

        @Override // kotlinx.coroutines.InterfaceC41708m
        public boolean isCompleted() {
            return this.cont.isCompleted();
        }

        @Override // p852kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object result) {
            this.cont.resumeWith(result);
        }

        @Override // kotlinx.coroutines.InterfaceC41708m
        /* JADX INFO: renamed from: s */
        public void mo91118s(@NotNull Object token) {
            this.cont.mo91118s(token);
        }

        @Override // kotlinx.coroutines.InterfaceC41708m
        /* JADX INFO: renamed from: t */
        public void mo91119t(@NotNull Function1<? super Throwable, Unit> handler) {
            this.cont.mo91119t(handler);
        }

        @Override // kotlinx.coroutines.InterfaceC41708m
        @Nullable
        /* JADX INFO: renamed from: y */
        public Object mo91120y(@NotNull Throwable exception) {
            return this.cont.mo91120y(exception);
        }

        /* JADX INFO: renamed from: i */
        public static final Unit m91349i(C41756a c41756a, a aVar, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
            C41756a.m91338z().set(c41756a, aVar.owner);
            c41756a.mo91345e(aVar.owner);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.InterfaceC41708m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public <R extends Unit> void mo91117r(@NotNull R value, @Nullable Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
            C41756a.m91338z().set(C41756a.this, this.owner);
            C41716o<Unit> c41716o = this.cont;
            final C41756a c41756a = C41756a.this;
            c41716o.m91151P(value, new Function1() { // from class: rg0.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C41756a.a.m91348f(c41756a, this, (Throwable) obj);
                }
            });
        }
    }

    public C41756a(boolean z11) {
        super(1, z11 ? 1 : 0);
        this.owner$volatile = z11 ? null : C44087f.f97335a;
        this.onSelectCancellationUnlockConstructor = new Function3() { // from class: rg0.b
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C41756a.m91333D(this.f97328b, (InterfaceC41754i) obj, obj2, obj3);
            }
        };
    }

    /* JADX INFO: renamed from: D */
    public static final Function3 m91333D(final C41756a c41756a, InterfaceC41754i interfaceC41754i, final Object obj, Object obj2) {
        return new Function3() { // from class: rg0.c
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return C41756a.m91334E(this.f97329b, obj, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m91338z() {
        return f91859i;
    }

    @NotNull
    public String toString() {
        return "Mutex@" + C41717o0.m91175b(this) + "[isLocked=" + mo91343b() + ",owner=" + f91859i.get(this) + ']';
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Object m91332B(C41756a c41756a, Object obj, Continuation<? super Unit> continuation) {
        if (c41756a.mo91342a(obj)) {
            return Unit.INSTANCE;
        }
        Object objM91340C = c41756a.m91340C(obj, continuation);
        if (objM91340C == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91340C;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m91334E(C41756a c41756a, Object obj, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        c41756a.mo91345e(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final int m91339A(Object owner) {
        while (mo91343b()) {
            Object obj = f91859i.get(this);
            if (obj != C44087f.f97335a) {
                if (obj == owner) {
                    return 1;
                }
                return 2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: C */
    public final Object m91340C(Object obj, Continuation<? super Unit> continuation) {
        C41716o c41716oM91187b = C41724q.m91187b(IntrinsicsKt.intercepted(continuation));
        try {
            m91323h(new a(c41716oM91187b, obj));
            Object objM91171w = c41716oM91187b.m91171w();
            if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objM91171w;
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            c41716oM91187b.m91149N();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: F */
    public final int m91341F(Object owner) {
        while (!m91329t()) {
            if (owner == null) {
                return 1;
            }
            int iM91339A = m91339A(owner);
            if (iM91339A == 1) {
                return 2;
            }
            if (iM91339A == 2) {
                return 1;
            }
        }
        f91859i.set(this, owner);
        return 0;
    }

    @Override // rg0.InterfaceC44082a
    /* JADX INFO: renamed from: a */
    public boolean mo91342a(@Nullable Object owner) {
        int iM91341F = m91341F(owner);
        if (iM91341F == 0) {
            return true;
        }
        if (iM91341F != 1) {
            if (iM91341F != 2) {
                throw new IllegalStateException("unexpected");
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + owner).toString());
        }
        return false;
    }

    @Override // rg0.InterfaceC44082a
    /* JADX INFO: renamed from: b */
    public boolean mo91343b() {
        if (m91328m() == 0) {
            return true;
        }
        return false;
    }

    @Override // rg0.InterfaceC44082a
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo91344d(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
        return m91332B(this, obj, continuation);
    }

    @Override // rg0.InterfaceC44082a
    /* JADX INFO: renamed from: e */
    public void mo91345e(@Nullable Object owner) {
        while (mo91343b()) {
            Object obj = f91859i.get(this);
            if (obj != C44087f.f97335a) {
                if (obj != owner && owner != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj + ", but " + owner + " is expected").toString());
                }
                if (C1481a.m2260a(f91859i, this, obj, C44087f.f97335a)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }
}
