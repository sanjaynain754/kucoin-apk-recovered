package retrofit2.adapter.rxjava2;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* JADX INFO: loaded from: classes23.dex */
final class RxJava2CallAdapter<R> implements CallAdapter<R, Object> {
    private final boolean isAsync;
    private final boolean isBody;
    private final boolean isCompletable;
    private final boolean isFlowable;
    private final boolean isMaybe;
    private final boolean isResult;
    private final boolean isSingle;
    private final Type responseType;
    private final Scheduler scheduler;

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    @Override // retrofit2.CallAdapter
    public Object adapt(Call<R> call) {
        Observable bodyObservable;
        Scheduler scheduler;
        Observable callEnqueueObservable = this.isAsync ? new CallEnqueueObservable(call) : new CallExecuteObservable(call);
        if (!this.isResult) {
            if (this.isBody) {
                bodyObservable = new BodyObservable(callEnqueueObservable);
            }
            scheduler = this.scheduler;
            if (scheduler != null) {
                callEnqueueObservable = callEnqueueObservable.subscribeOn(scheduler);
            }
            if (this.isFlowable) {
                return callEnqueueObservable.toFlowable(BackpressureStrategy.LATEST);
            }
            if (this.isSingle) {
                return callEnqueueObservable.singleOrError();
            }
            if (this.isMaybe) {
                return callEnqueueObservable.singleElement();
            }
            return this.isCompletable ? callEnqueueObservable.ignoreElements() : RxJavaPlugins.onAssembly(callEnqueueObservable);
        }
        bodyObservable = new ResultObservable(callEnqueueObservable);
        callEnqueueObservable = bodyObservable;
        scheduler = this.scheduler;
        if (scheduler != null) {
            callEnqueueObservable = callEnqueueObservable.subscribeOn(scheduler);
        }
        if (this.isFlowable) {
            return callEnqueueObservable.toFlowable(BackpressureStrategy.LATEST);
        }
        if (this.isSingle) {
            return callEnqueueObservable.singleOrError();
        }
        if (this.isMaybe) {
            return callEnqueueObservable.singleElement();
        }
        if (this.isCompletable) {
        }
    }

    @Override // retrofit2.CallAdapter
    /* JADX INFO: renamed from: responseType */
    public Type getType() {
        return this.responseType;
    }

    public RxJava2CallAdapter(Type type, Scheduler scheduler, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.responseType = type;
        this.scheduler = scheduler;
        this.isAsync = z11;
        this.isResult = z12;
        this.isBody = z13;
        this.isFlowable = z14;
        this.isSingle = z15;
        this.isMaybe = z16;
        this.isCompletable = z17;
    }
}
