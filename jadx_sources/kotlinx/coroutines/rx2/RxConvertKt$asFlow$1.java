package kotlinx.coroutines.rx2;

import androidx.camera.view.C1454t;
import androidx.exifinterface.media.ExifInterface;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.channels.C41570i;
import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.channels.InterfaceC41577p;
import kotlinx.coroutines.channels.ProduceKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: RxConvert.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/m;", "", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "kotlinx.coroutines.rx2.RxConvertKt$asFlow$1", m90122f = "RxConvert.kt", m90123i = {}, m90124l = {91}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RxConvertKt$asFlow$1<T> extends SuspendLambda implements Function2<InterfaceC41574m<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ObservableSource<T> $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.rx2.RxConvertKt$asFlow$1$a */
    /* JADX INFO: compiled from: RxConvert.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"kotlinx/coroutines/rx2/RxConvertKt$asFlow$1$a", "Lio/reactivex/Observer;", "", "onComplete", "()V", "Lio/reactivex/disposables/Disposable;", "d", "onSubscribe", "(Lio/reactivex/disposables/Disposable;)V", "t", "onNext", "(Ljava/lang/Object;)V", "", "e", "onError", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-rx2"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C41732a implements Observer<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41574m<T> f91779b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AtomicReference<Disposable> f91780c;

        /* JADX WARN: Multi-variable type inference failed */
        public C41732a(InterfaceC41574m<? super T> interfaceC41574m, AtomicReference<Disposable> atomicReference) {
            this.f91779b = interfaceC41574m;
            this.f91780c = atomicReference;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            InterfaceC41577p.a.m90714a(this.f91779b, null, 1, null);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable e11) {
            this.f91779b.mo90553F(e11);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            try {
                C41570i.m90707b(this.f91779b, t11);
            } catch (InterruptedException unused) {
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable d11) {
            if (C1454t.m2255a(this.f91780c, null, d11)) {
                return;
            }
            d11.dispose();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxConvertKt$asFlow$1(ObservableSource<T> observableSource, Continuation<? super RxConvertKt$asFlow$1> continuation) {
        super(2, continuation);
        this.$this_asFlow = observableSource;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RxConvertKt$asFlow$1 rxConvertKt$asFlow$1 = new RxConvertKt$asFlow$1(this.$this_asFlow, continuation);
        rxConvertKt$asFlow$1.L$0 = obj;
        return rxConvertKt$asFlow$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41574m<? super T> interfaceC41574m, Continuation<? super Unit> continuation) {
        return ((RxConvertKt$asFlow$1) create(interfaceC41574m, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m91210f(AtomicReference atomicReference) {
        Disposable disposable = (Disposable) atomicReference.getAndSet(Disposables.disposed());
        if (disposable != null) {
            disposable.dispose();
        }
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41574m interfaceC41574m = (InterfaceC41574m) this.L$0;
            final AtomicReference atomicReference = new AtomicReference();
            this.$this_asFlow.subscribe(new C41732a(interfaceC41574m, atomicReference));
            Function0 function0 = new Function0() { // from class: kotlinx.coroutines.rx2.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RxConvertKt$asFlow$1.m91210f(atomicReference);
                }
            };
            this.label = 1;
            if (ProduceKt.m90681a(interfaceC41574m, function0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
