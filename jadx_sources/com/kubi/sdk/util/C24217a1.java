package com.kubi.sdk.util;

import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import o00.C42916f;
import sh0.InterfaceC44416b;

/* JADX INFO: renamed from: com.kubi.sdk.util.a1 */
/* JADX INFO: compiled from: SchedulersCompat.java */
/* JADX INFO: loaded from: classes12.dex */
public class C24217a1 {

    /* JADX INFO: renamed from: a */
    public static final ObservableTransformer f48144a = new ObservableTransformer() { // from class: com.kubi.sdk.util.s0
        @Override // io.reactivex.ObservableTransformer
        public final ObservableSource apply(Observable observable) {
            return observable.subscribeOn(C42916f.m94126e()).observeOn(AndroidSchedulers.mainThread());
        }
    };

    /* JADX INFO: renamed from: b */
    public static final ObservableTransformer f48145b = new ObservableTransformer() { // from class: com.kubi.sdk.util.t0
        @Override // io.reactivex.ObservableTransformer
        public final ObservableSource apply(Observable observable) {
            return observable.subscribeOn(C42916f.m94127f()).observeOn(AndroidSchedulers.mainThread());
        }
    };

    /* JADX INFO: renamed from: c */
    public static final FlowableTransformer f48146c = new FlowableTransformer() { // from class: com.kubi.sdk.util.u0
        @Override // io.reactivex.FlowableTransformer
        public final InterfaceC44416b apply(Flowable flowable) {
            return flowable.subscribeOn(C42916f.m94127f()).observeOn(AndroidSchedulers.mainThread());
        }
    };

    /* JADX INFO: renamed from: d */
    public static final ObservableTransformer f48147d = new ObservableTransformer() { // from class: com.kubi.sdk.util.v0
        @Override // io.reactivex.ObservableTransformer
        public final ObservableSource apply(Observable observable) {
            return observable.subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94127f());
        }
    };

    /* JADX INFO: renamed from: i */
    public static <T> ObservableTransformer<T, T> m58385i() {
        return f48144a;
    }

    /* JADX INFO: renamed from: j */
    public static <T> FlowableTransformer<T, T> m58386j() {
        return f48146c;
    }

    /* JADX INFO: renamed from: k */
    public static <T> ObservableTransformer<T, T> m58387k() {
        return f48145b;
    }

    /* JADX INFO: renamed from: l */
    public static <T> ObservableTransformer<T, T> m58388l() {
        return f48147d;
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public static <T> ObservableTransformer<BaseEntity<T>, T> m58389m() {
        return new ObservableTransformer() { // from class: com.kubi.sdk.util.x0
            @Override // io.reactivex.ObservableTransformer
            public final ObservableSource apply(Observable observable) {
                return observable.map(new Function() { // from class: com.kubi.sdk.util.z0
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return C24217a1.m58378b((BaseEntity) obj);
                    }
                }).compose(C24217a1.m58387k());
            }
        };
    }

    /* JADX INFO: renamed from: n */
    public static <T> ObservableTransformer<BaseEntity<T>, T> m58390n() {
        return new ObservableTransformer() { // from class: com.kubi.sdk.util.w0
            @Override // io.reactivex.ObservableTransformer
            public final ObservableSource apply(Observable observable) {
                return observable.map(new Function() { // from class: com.kubi.sdk.util.y0
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return C24217a1.m58382f((BaseEntity) obj);
                    }
                }).compose(C24217a1.m58388l());
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m58378b(BaseEntity baseEntity) throws ApiException {
        if (baseEntity.getSuccess()) {
            return baseEntity.getData();
        }
        throw new ApiException(baseEntity.getCode(), baseEntity.getMsg(), baseEntity.getData());
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m58382f(BaseEntity baseEntity) throws ApiException {
        if (baseEntity.getSuccess()) {
            return baseEntity.getData();
        }
        throw new ApiException(baseEntity.getCode(), baseEntity.getMsg(), baseEntity.getData());
    }
}
