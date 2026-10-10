package com.kubi.sdk;

import android.annotation.SuppressLint;
import androidx.annotation.MainThread;
import androidx.lifecycle.MutableLiveData;
import com.kubi.utils.FlowableCompat;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import sh0.InterfaceC44418d;

/* JADX INFO: renamed from: com.kubi.sdk.b3, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BaseViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0003J\u000f\u0010\u000b\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/RemoteResource;", "Result", "", "<init>", "()V", DbParams.KEY_CHANNEL_RESULT, "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/sdk/Resource;", "setValue", "", "newValue", "get", "()Ljava/lang/Object;", "asLiveData", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
public abstract class RemoteResource<Result> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final MutableLiveData<Resource<Result>> f46491a = new MutableLiveData<>();

    @Nullable
    /* JADX INFO: renamed from: n */
    public abstract Result m56570n();

    /* JADX INFO: renamed from: h */
    public static final Unit m56564h(RemoteResource remoteResource, InterfaceC44418d interfaceC44418d) {
        remoteResource.m56571o(Resource.f46439d.loading(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final void m56566j(RemoteResource remoteResource, Object obj) {
        if (obj == Status.SUCCESS) {
            remoteResource.m56571o(Resource.f46439d.success(null));
        } else {
            remoteResource.m56571o(Resource.f46439d.success(obj));
        }
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m56567k(RemoteResource remoteResource, Throwable th2) {
        remoteResource.m56571o(Resource.Companion.error$default(Resource.f46439d, th2, null, 2, null));
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final MutableLiveData<Resource<Result>> m56569m() {
        return this.f46491a;
    }

    @MainThread
    /* JADX INFO: renamed from: o */
    public final void m56571o(Resource<? extends Result> resource) {
        if (Intrinsics.areEqual(this.f46491a.getValue(), resource)) {
            return;
        }
        this.f46491a.setValue(resource);
    }

    @MainThread
    public RemoteResource() {
        Flowable flowableSubscribeOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.sdk.v2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RemoteResource.m56563g(this.f48304b);
            }
        }).subscribeOn(C42916f.m94127f());
        final Function1 function1 = new Function1() { // from class: com.kubi.sdk.w2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RemoteResource.m56564h(this.f48321b, (InterfaceC44418d) obj);
            }
        };
        Flowable flowableObserveOn = flowableSubscribeOn.doOnSubscribe(new Consumer() { // from class: com.kubi.sdk.x2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RemoteResource.m56565i(function1, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        Consumer consumer = new Consumer() { // from class: com.kubi.sdk.y2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RemoteResource.m56566j(this.f48682b, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.sdk.z2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RemoteResource.m56567k(this.f48688b, (Throwable) obj);
            }
        };
        flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.sdk.a3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RemoteResource.m56568l(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final Object m56563g(RemoteResource remoteResource) {
        Object objM56570n = remoteResource.m56570n();
        if (objM56570n == null) {
            return Status.SUCCESS;
        }
        return objM56570n;
    }

    /* JADX INFO: renamed from: i */
    public static final void m56565i(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l */
    public static final void m56568l(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
