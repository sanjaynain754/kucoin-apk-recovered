package com.kubi.futures;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.utils.extensions.C27025c;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.k, reason: from Kotlin metadata */
/* JADX INFO: compiled from: Observers.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\rB%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\fH\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/futures/ObservableFirstSource;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/Observable;", "source", "Lio/reactivex/ObservableSource;", "firstCall", "Lio/reactivex/functions/Consumer;", "<init>", "(Lio/reactivex/ObservableSource;Lio/reactivex/functions/Consumer;)V", "subscribeActual", "", "observer", "Lio/reactivex/Observer;", "FirstObserver", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ObservableFirstSource<T> extends Observable<T> {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ObservableSource<T> f23116b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Consumer<? super T> f23117c;

    /* JADX INFO: renamed from: com.kubi.futures.k$a */
    /* JADX INFO: compiled from: Observers.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u001a\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\b\u00028\u0001H\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00018\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b9¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/futures/ObservableFirstSource$FirstObserver;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/Observer;", "Lio/reactivex/disposables/Disposable;", "downStream", "onFirst", "Lio/reactivex/functions/Consumer;", "<init>", "(Lio/reactivex/Observer;Lio/reactivex/functions/Consumer;)V", "upStream", "done", "", "firstSource", "Ljava/lang/Object;", "onSubscribe", "", "d", "onError", "e", "", "onComplete", "onNext", "t", "(Ljava/lang/Object;)V", "dispose", "isDisposed", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Observer<? super T> f23118b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final Consumer<? super T> f23119c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public Disposable f23120d;

        /* JADX INFO: renamed from: e */
        public boolean f23121e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public volatile T f23122f;

        public a(@NotNull Observer<? super T> downStream, @NotNull Consumer<? super T> onFirst) {
            Intrinsics.checkNotNullParameter(downStream, "downStream");
            Intrinsics.checkNotNullParameter(onFirst, "onFirst");
            this.f23118b = downStream;
            this.f23119c = onFirst;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Disposable disposable = this.f23120d;
            if (disposable != null) {
                disposable.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            Disposable disposable = this.f23120d;
            return C27025c.m66566d(disposable != null ? Boolean.valueOf(disposable.getDisposed()) : null);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f23121e) {
                return;
            }
            this.f23121e = true;
            this.f23118b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(@NotNull Throwable e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            if (this.f23121e) {
                RxJavaPlugins.onError(e11);
            } else {
                this.f23121e = true;
                this.f23118b.onError(e11);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(@NotNull T t11) {
            Intrinsics.checkNotNullParameter(t11, "t");
            try {
                if (this.f23122f == null) {
                    this.f23122f = t11;
                    this.f23119c.accept(t11);
                }
                this.f23118b.onNext(t11);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                Disposable disposable = this.f23120d;
                if (disposable != null) {
                    disposable.dispose();
                }
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(@NotNull Disposable d11) {
            Intrinsics.checkNotNullParameter(d11, "d");
            if (DisposableHelper.validate(this.f23120d, d11)) {
                this.f23120d = d11;
                this.f23118b.onSubscribe(this);
            }
        }
    }

    public ObservableFirstSource(@NotNull ObservableSource<T> source, @NotNull Consumer<? super T> firstCall) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(firstCall, "firstCall");
        this.f23116b = source;
        this.f23117c = firstCall;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(@NotNull Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f23116b.subscribe(new a(observer, this.f23117c));
    }
}
