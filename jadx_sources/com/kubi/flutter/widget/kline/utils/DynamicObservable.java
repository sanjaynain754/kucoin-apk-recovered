package com.kubi.flutter.widget.kline.utils;

import com.kubi.network.websocket.model.Message;
import io.reactivex.Observable;
import io.reactivex.Observer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.flutter.widget.kline.utils.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DynamicObservable.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\nH\u0014R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/utils/DynamicObservable;", "Lio/reactivex/Observable;", "Lcom/kubi/network/websocket/model/Message;", "obtainObs", "Lkotlin/Function0;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "subscribeActual", "", "observer", "Lio/reactivex/Observer;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DynamicObservable extends Observable<Message> {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function0<Observable<Message>> f22492b;

    /* JADX WARN: Multi-variable type inference failed */
    public DynamicObservable(@NotNull Function0<? extends Observable<Message>> obtainObs) {
        Intrinsics.checkNotNullParameter(obtainObs, "obtainObs");
        this.f22492b = obtainObs;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(@NotNull Observer<? super Message> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        DynamicDisposable dynamicDisposable = new DynamicDisposable(this.f22492b, observer);
        observer.onSubscribe(dynamicDisposable);
        dynamicDisposable.run();
    }
}
