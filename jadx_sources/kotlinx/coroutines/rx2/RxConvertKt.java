package kotlinx.coroutines.rx2;

import androidx.exifinterface.media.ExifInterface;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41726q1;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: RxConvert.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/ObservableSource;", "Lkotlinx/coroutines/flow/e;", "b", "(Lio/reactivex/ObservableSource;)Lkotlinx/coroutines/flow/e;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lio/reactivex/Observable;", "c", "(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;)Lio/reactivex/Observable;", "kotlinx-coroutines-rx2"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class RxConvertKt {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC41634e<T> m91205b(@NotNull ObservableSource<T> observableSource) {
        return C41636g.m90913f(new RxConvertKt$asFlow$1(observableSource, null));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> Observable<T> m91206c(@NotNull final InterfaceC41634e<? extends T> interfaceC41634e, @NotNull final CoroutineContext coroutineContext) {
        return Observable.create(new ObservableOnSubscribe() { // from class: kotlinx.coroutines.rx2.d
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                RxConvertKt.m91208e(coroutineContext, interfaceC41634e, observableEmitter);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Observable m91207d(InterfaceC41634e interfaceC41634e, CoroutineContext coroutineContext, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return m91206c(interfaceC41634e, coroutineContext);
    }

    /* JADX INFO: renamed from: e */
    public static final void m91208e(CoroutineContext coroutineContext, InterfaceC41634e interfaceC41634e, ObservableEmitter observableEmitter) {
        observableEmitter.setCancellable(new C41735b(C41686h.m91045c(C41726q1.f91773b, C41782z0.m91394d().plus(coroutineContext), CoroutineStart.ATOMIC, new RxConvertKt$asObservable$1$job$1(interfaceC41634e, observableEmitter, null))));
    }
}
