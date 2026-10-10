package com.kubi.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import sh0.InterfaceC44417c;

/* JADX INFO: renamed from: com.kubi.utils.t */
/* JADX INFO: compiled from: FlowableCompat.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/utils/t;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/Flowable;", "Ljava/util/concurrent/Callable;", "Lkotlin/Function0;", "callable", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lsh0/c;", CmcdData.Factory.STREAMING_FORMAT_SS, "", "subscribeActual", "(Lsh0/c;)V", "call", "()Ljava/lang/Object;", "b", "Lkotlin/jvm/functions/Function0;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class CallableC27091t<T> extends Flowable<T> implements Callable<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<T> callable;

    /* JADX WARN: Multi-variable type inference failed */
    public CallableC27091t(@NotNull Function0<? extends T> callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        this.callable = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) ObjectHelper.requireNonNull(this.callable.invoke(), "The callable returned a null value");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Flowable
    public void subscribeActual(@NotNull InterfaceC44417c<? super T> s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(s11);
        s11.onSubscribe(deferredScalarSubscription);
        if (deferredScalarSubscription.isCancelled()) {
            return;
        }
        try {
            deferredScalarSubscription.complete(ObjectHelper.requireNonNull(this.callable.invoke(), "The callable returned a null value"));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (deferredScalarSubscription.isCancelled()) {
                return;
            }
            s11.onError(th2);
        }
    }
}
