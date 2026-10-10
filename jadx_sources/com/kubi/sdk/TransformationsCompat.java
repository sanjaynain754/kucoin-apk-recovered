package com.kubi.sdk;

import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.l3, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BaseViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JZ\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u00052\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u0001H\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\b\u0012\u0004\u0012\u0002H\u00060\fH\u0007Jv\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0005\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0010\"\u0004\b\u0002\u0010\u0011\"\u0004\b\u0003\u0010\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00052$\u0010\u000b\u001a \u0012\u0006\u0012\u0004\u0018\u0001H\u000f\u0012\u0006\u0012\u0004\u0018\u0001H\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0011\u0012\u0004\u0012\u0002H\u000e0\u0013H\u0007J\u0092\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0005\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0010\"\u0004\b\u0002\u0010\u0011\"\u0004\b\u0003\u0010\u0015\"\u0004\b\u0004\u0010\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00052,\u0010\u000b\u001a(\u0012\u0006\u0012\u0004\u0018\u0001H\u000f\u0012\u0006\u0012\u0004\u0018\u0001H\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0011\u0012\u0006\u0012\u0004\u0018\u0001H\u0015\u0012\u0004\u0012\u0002H\u000e0\u0017H\u0007¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/sdk/TransformationsCompat;", "", "<init>", "()V", "zip", "Landroidx/lifecycle/LiveData;", "Z", "X", "Y", "source1", "source2", "func", "Lkotlin/Function2;", "zip3", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "source3", "Lkotlin/Function3;", "zip4", "D", "source4", "Lkotlin/Function4;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TransformationsCompat {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TransformationsCompat f46881a = new TransformationsCompat();

    /* JADX INFO: renamed from: com.kubi.sdk.l3$a */
    /* JADX INFO: compiled from: BaseViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f46882b;

        public a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f46882b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f46882b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46882b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @MainThread
    @NotNull
    /* JADX INFO: renamed from: g */
    public final <X, Y, Z> LiveData<Z> m57060g(@NotNull final LiveData<X> source1, @NotNull final LiveData<Y> source2, @NotNull final Function2<? super X, ? super Y, ? extends Z> func) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(func, "func");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(source1, new a(new Function1() { // from class: com.kubi.sdk.f3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransformationsCompat.m57054h(mediatorLiveData, func, source2, obj);
            }
        }));
        mediatorLiveData.addSource(source2, new a(new Function1() { // from class: com.kubi.sdk.g3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransformationsCompat.m57055i(mediatorLiveData, func, source1, obj);
            }
        }));
        return mediatorLiveData;
    }

    @MainThread
    @NotNull
    /* JADX INFO: renamed from: j */
    public final <A, B, C, D, T> LiveData<T> m57061j(@NotNull final LiveData<A> source1, @NotNull final LiveData<B> source2, @NotNull final LiveData<C> source3, @NotNull final LiveData<D> source4, @NotNull final Function4<? super A, ? super B, ? super C, ? super D, ? extends T> func) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(source4, "source4");
        Intrinsics.checkNotNullParameter(func, "func");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(source1, new a(new Function1() { // from class: com.kubi.sdk.h3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransformationsCompat.m57056k(mediatorLiveData, func, source2, source3, source4, obj);
            }
        }));
        mediatorLiveData.addSource(source2, new a(new Function1() { // from class: com.kubi.sdk.i3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransformationsCompat.m57057l(mediatorLiveData, func, source1, source3, source4, obj);
            }
        }));
        mediatorLiveData.addSource(source3, new a(new Function1() { // from class: com.kubi.sdk.j3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransformationsCompat.m57058m(mediatorLiveData, func, source1, source2, source4, obj);
            }
        }));
        mediatorLiveData.addSource(source4, new a(new Function1() { // from class: com.kubi.sdk.k3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransformationsCompat.m57059n(mediatorLiveData, func, source1, source2, source3, obj);
            }
        }));
        return mediatorLiveData;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m57054h(MediatorLiveData mediatorLiveData, Function2 function2, LiveData liveData, Object obj) {
        mediatorLiveData.setValue(function2.invoke(obj, liveData.getValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m57055i(MediatorLiveData mediatorLiveData, Function2 function2, LiveData liveData, Object obj) {
        mediatorLiveData.setValue(function2.invoke(liveData.getValue(), obj));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m57056k(MediatorLiveData mediatorLiveData, Function4 function4, LiveData liveData, LiveData liveData2, LiveData liveData3, Object obj) {
        mediatorLiveData.setValue(function4.invoke(obj, liveData.getValue(), liveData2.getValue(), liveData3.getValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m57057l(MediatorLiveData mediatorLiveData, Function4 function4, LiveData liveData, LiveData liveData2, LiveData liveData3, Object obj) {
        mediatorLiveData.setValue(function4.invoke(liveData.getValue(), obj, liveData2.getValue(), liveData3.getValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m57058m(MediatorLiveData mediatorLiveData, Function4 function4, LiveData liveData, LiveData liveData2, LiveData liveData3, Object obj) {
        mediatorLiveData.setValue(function4.invoke(liveData.getValue(), liveData2.getValue(), obj, liveData3.getValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m57059n(MediatorLiveData mediatorLiveData, Function4 function4, LiveData liveData, LiveData liveData2, LiveData liveData3, Object obj) {
        mediatorLiveData.setValue(function4.invoke(liveData.getValue(), liveData2.getValue(), liveData3.getValue(), obj));
        return Unit.INSTANCE;
    }
}
