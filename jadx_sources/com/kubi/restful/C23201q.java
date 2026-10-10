package com.kubi.restful;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.restful.q */
/* JADX INFO: compiled from: RestfulReturnFactory.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/restful/q;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/Observable;", "Lcom/kubi/restful/RestfulCall;", "originalCall", "<init>", "(Lcom/kubi/restful/RestfulCall;)V", "Lio/reactivex/Observer;", "subscriber", "", "subscribeActual", "(Lio/reactivex/Observer;)V", "b", "Lcom/kubi/restful/RestfulCall;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
public final class C23201q<T> extends Observable<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final RestfulCall<T> originalCall;

    /* JADX INFO: renamed from: com.kubi.restful.q$a */
    /* JADX INFO: compiled from: RestfulReturnFactory.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\u00020\u0004B'\b\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u0012R\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u001c\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m90084d2 = {"Lcom/kubi/restful/q$a;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/disposables/Disposable;", "Lcom/kubi/restful/e;", "Lcom/kubi/restful/f;", "Lcom/kubi/restful/RestfulCall;", "call", "Lio/reactivex/Observer;", "observer", "<init>", "(Lcom/kubi/restful/RestfulCall;Lio/reactivex/Observer;)V", "", "key", "", "c", "(Ljava/lang/String;)V", "response", "b", "(Ljava/lang/Object;)V", "", "t", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)V", "dispose", "()V", "", "isDisposed", "()Z", "e", "Z", "disposed", "Lcom/kubi/restful/RestfulCall;", "d", "Lio/reactivex/Observer;", "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
    public static final class a<T> implements Disposable, InterfaceC23189e<T>, InterfaceC23190f {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public volatile boolean disposed;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final RestfulCall<T> call;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final Observer<? super T> observer;

        /* JADX INFO: renamed from: com.kubi.restful.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RestfulReturnFactory.kt */
        @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "run"}, m90085k = 3, m90086mv = {1, 4, 2})
        public static final class RunnableC46980a implements Runnable {
            public RunnableC46980a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.call.m55640b(a.this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.call.m55641c();
            this.call.m55645g().unregisterOnChangeListener(this);
        }

        public a(@NotNull RestfulCall<T> call, @NotNull Observer<? super T> observer) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.call = call;
            this.observer = observer;
            call.m55645g().registerOnChangeListener(this);
        }

        @Override // com.kubi.restful.InterfaceC23189e
        /* JADX INFO: renamed from: a */
        public void mo55656a(@NotNull Throwable t11) {
            Intrinsics.checkNotNullParameter(t11, "t");
            if (this.disposed) {
                return;
            }
            try {
                this.observer.onError(t11);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(new CompositeException(t11, th2));
            }
        }

        @Override // com.kubi.restful.InterfaceC23190f
        /* JADX INFO: renamed from: c */
        public void mo55658c(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!Intrinsics.areEqual(key, this.call.m55644f()) || this.disposed) {
                return;
            }
            Schedulers.m87969io().scheduleDirect(new RunnableC46980a());
        }

        /* JADX INFO: renamed from: e */
        public final void m55673e(T response) {
            if (this.disposed) {
                return;
            }
            try {
                this.observer.onNext(response);
            } catch (Throwable th2) {
                if (this.disposed) {
                    return;
                }
                try {
                    this.observer.onError(th2);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RxJavaPlugins.onError(new CompositeException(th2, th3));
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed, reason: from getter */
        public boolean getDisposed() {
            return this.disposed;
        }

        @Override // com.kubi.restful.InterfaceC23189e
        /* JADX INFO: renamed from: b */
        public void mo55657b(T response) {
            m55673e(response);
        }
    }

    public C23201q(@NotNull RestfulCall<T> originalCall) {
        Intrinsics.checkNotNullParameter(originalCall, "originalCall");
        this.originalCall = originalCall;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(@NotNull Observer<? super T> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        RestfulCall<T> restfulCallM55642d = this.originalCall.m55642d();
        a aVar = new a(restfulCallM55642d, subscriber);
        subscriber.onSubscribe(aVar);
        if (aVar.getDisposed()) {
            return;
        }
        restfulCallM55642d.m55643e(aVar);
    }
}
