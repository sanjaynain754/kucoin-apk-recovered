package kotlinx.coroutines.rx2;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.AuthenticationTokenClaims;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.NoSuchElementException;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41708m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.rx2.a */
/* JADX INFO: compiled from: RxAwait.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a \u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0003\u001a4\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0082@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/ObservableSource;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lio/reactivex/ObservableSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "Lkotlinx/coroutines/rx2/Mode;", "mode", "default", "b", "(Lio/reactivex/ObservableSource;Lkotlinx/coroutines/rx2/Mode;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-rx2"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRxAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxAwait.kt\nkotlinx/coroutines/rx2/RxAwaitKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,294:1\n426#2,11:295\n426#2,11:306\n426#2,11:317\n426#2,11:328\n*S KotlinDebug\n*F\n+ 1 RxAwait.kt\nkotlinx/coroutines/rx2/RxAwaitKt\n*L\n21#1:295,11\n48#1:306,11\n134#1:317,11\n239#1:328,11\n*E\n"})
public final class C41734a {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.rx2.a$a */
    /* JADX INFO: compiled from: RxAwait.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\b\u00028\u0000H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b9¨\u0006\u001a"}, m90084d2 = {"kotlinx/coroutines/rx2/a$a", "Lio/reactivex/Observer;", "Lio/reactivex/disposables/Disposable;", AuthenticationTokenClaims.JSON_KEY_SUB, "", "onSubscribe", "(Lio/reactivex/disposables/Disposable;)V", "t", "onNext", "(Ljava/lang/Object;)V", "onComplete", "()V", "", "e", "onError", "(Ljava/lang/Throwable;)V", "b", "Lio/reactivex/disposables/Disposable;", "subscription", "c", "Ljava/lang/Object;", "value", "", "d", "Z", "seenValue", "kotlinx-coroutines-rx2"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class a<T> implements Observer<T> {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public Disposable subscription;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public T value;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public boolean seenValue;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC41708m<T> f91785e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Mode f91786f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ T f91787g;

        /* JADX INFO: renamed from: kotlinx.coroutines.rx2.a$a$b */
        /* JADX INFO: compiled from: RxAwait.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class b implements Function1<Throwable, Unit> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Disposable f91788b;

            public b(Disposable disposable) {
                this.f91788b = disposable;
            }

            /* JADX INFO: renamed from: a */
            public final void m91215a(Throwable th2) {
                this.f91788b.dispose();
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                m91215a(th2);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.rx2.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RxAwait.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        public /* synthetic */ class C47012a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Mode.values().length];
                try {
                    iArr[Mode.FIRST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Mode.FIRST_OR_DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Mode.LAST.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Mode.SINGLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC41708m<? super T> interfaceC41708m, Mode mode, T t11) {
            this.f91785e = interfaceC41708m;
            this.f91786f = mode;
            this.f91787g = t11;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.seenValue) {
                if (this.f91785e.isActive()) {
                    InterfaceC41708m<T> interfaceC41708m = this.f91785e;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC41708m.resumeWith(Result.m103844constructorimpl(this.value));
                    return;
                }
                return;
            }
            if (this.f91786f == Mode.FIRST_OR_DEFAULT) {
                InterfaceC41708m<T> interfaceC41708m2 = this.f91785e;
                Result.Companion companion2 = Result.INSTANCE;
                interfaceC41708m2.resumeWith(Result.m103844constructorimpl(this.f91787g));
            } else if (this.f91785e.isActive()) {
                InterfaceC41708m<T> interfaceC41708m3 = this.f91785e;
                Result.Companion companion3 = Result.INSTANCE;
                interfaceC41708m3.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new NoSuchElementException("No value received via onNext for " + this.f91786f))));
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable e11) {
            InterfaceC41708m<T> interfaceC41708m = this.f91785e;
            Result.Companion companion = Result.INSTANCE;
            interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(e11)));
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            int i11 = C47012a.$EnumSwitchMapping$0[this.f91786f.ordinal()];
            Disposable disposable = null;
            if (i11 == 1 || i11 == 2) {
                if (this.seenValue) {
                    return;
                }
                this.seenValue = true;
                this.f91785e.resumeWith(Result.m103844constructorimpl(t11));
                Disposable disposable2 = this.subscription;
                if (disposable2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subscription");
                } else {
                    disposable = disposable2;
                }
                disposable.dispose();
                return;
            }
            if (i11 != 3 && i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.f91786f != Mode.SINGLE || !this.seenValue) {
                this.value = t11;
                this.seenValue = true;
                return;
            }
            if (this.f91785e.isActive()) {
                InterfaceC41708m<T> interfaceC41708m = this.f91785e;
                Result.Companion companion = Result.INSTANCE;
                interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new IllegalArgumentException("More than one onNext value for " + this.f91786f))));
            }
            Disposable disposable3 = this.subscription;
            if (disposable3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subscription");
            } else {
                disposable = disposable3;
            }
            disposable.dispose();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable sub) {
            this.subscription = sub;
            this.f91785e.mo91119t(new b(sub));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m91211a(@NotNull ObservableSource<T> observableSource, @NotNull Continuation<? super T> continuation) {
        return m91213c(observableSource, Mode.FIRST, null, continuation, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public static final <T> Object m91212b(ObservableSource<T> observableSource, Mode mode, T t11, Continuation<? super T> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        observableSource.subscribe(new a(c41716o, mode, t11));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m91213c(ObservableSource observableSource, Mode mode, Object obj, Continuation continuation, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        return m91212b(observableSource, mode, obj, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <T> Object m91214d(@NotNull ObservableSource<T> observableSource, @NotNull Continuation<? super T> continuation) {
        return m91213c(observableSource, Mode.SINGLE, null, continuation, 2, null);
    }
}
