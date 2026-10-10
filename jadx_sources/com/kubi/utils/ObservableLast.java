package com.kubi.utils;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.internal.observers.BasicFuseableObserver;
import io.reactivex.schedulers.Schedulers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ObservableLast.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0016B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/utils/ObservableLast;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/Observable;", "Lio/reactivex/ObservableSource;", "source", "Lcom/kubi/utils/a0;", "predicate", "<init>", "(Lio/reactivex/ObservableSource;Lcom/kubi/utils/a0;)V", "Lio/reactivex/Observer;", "observer", "", "subscribeActual", "(Lio/reactivex/Observer;)V", "b", "Lio/reactivex/ObservableSource;", "getSource", "()Lio/reactivex/ObservableSource;", "c", "Lcom/kubi/utils/a0;", "getPredicate", "()Lcom/kubi/utils/a0;", "ScrollObserver", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ObservableLast<T> extends Observable<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ObservableSource<T> source;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC27013a0<? super T> predicate;

    /* JADX INFO: compiled from: ObservableLast.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0002B)\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0000\u0012\u00028\u0001\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\fR\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m90084d2 = {"Lcom/kubi/utils/ObservableLast$ScrollObserver;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/internal/observers/BasicFuseableObserver;", "Lio/reactivex/Observer;", "actual", "Lcom/kubi/utils/a0;", "filter", "<init>", "(Lio/reactivex/Observer;Lcom/kubi/utils/a0;)V", "t", "", "onNext", "(Ljava/lang/Object;)V", "", "mode", "requestFusion", "(I)I", "dispose", "()V", "poll", "()Ljava/lang/Object;", "e", "b", "Lcom/kubi/utils/a0;", "getFilter", "()Lcom/kubi/utils/a0;", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/Function0;", TUIConstants.TUIChat.CALL_BACK, "d", "Ljava/lang/Object;", "last", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class ScrollObserver<T> extends BasicFuseableObserver<T, T> {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final AbstractC27013a0<? super T> filter;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> callback;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public volatile T last;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScrollObserver(@Nullable Observer<? super T> observer, @NotNull AbstractC27013a0<? super T> filter) {
            super(observer);
            Intrinsics.checkNotNullParameter(filter, "filter");
            this.filter = filter;
            Function0<Unit> function0 = new Function0<Unit>(this) { // from class: com.kubi.utils.ObservableLast$ScrollObserver$callback$1
                final /* synthetic */ ObservableLast.ScrollObserver<T> this$0;

                @Override // p852kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Object obj = this.this$0.last;
                    this.this$0.last = null;
                    if (obj != null) {
                        this.this$0.m66409e(obj);
                    }
                }
            };
            this.callback = function0;
            filter.m66498a(function0);
        }

        /* JADX INFO: renamed from: f */
        public static final void m66408f(ScrollObserver this$0, Object obj) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.onNext(obj);
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.disposables.Disposable
        public void dispose() {
            this.filter.m66500c(this.callback);
            super.dispose();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                if (this.filter.test(t11)) {
                    this.downstream.onNext((Object) t11);
                } else {
                    this.last = t11;
                }
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f87122qd.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.filter.test(tPoll));
            return tPoll;
        }

        /* JADX INFO: renamed from: e */
        public final void m66409e(final T t11) {
            Schedulers.m87969io().scheduleDirect(new Runnable() { // from class: com.kubi.utils.f0
                @Override // java.lang.Runnable
                public final void run() {
                    ObservableLast.ScrollObserver.m66408f(this.f54335b, t11);
                }
            });
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int mode) {
            return transitiveBoundaryFusion(mode);
        }
    }

    public ObservableLast(@NotNull ObservableSource<T> source, @NotNull AbstractC27013a0<? super T> predicate) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.source = source;
        this.predicate = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(@NotNull Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.source.subscribe(new ScrollObserver(observer, this.predicate));
    }
}
