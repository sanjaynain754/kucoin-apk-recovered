package com.kubi.sdk.util;

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
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.kubi.sdk.util.m0 */
/* JADX INFO: compiled from: LiveDataEx.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001at\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00060\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\t2<\b\u0002\u0010\n\u001a6\u0012\u0015\u0012\u0013\u0018\u0001H\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u0001H\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00030\u0001\u001aV\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u000528\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u0011H\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u0011H\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00030\u0001\u001a$\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00052\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u0005\u001a$\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00052\u0006\u0010\u0014\u001a\u00020\u0015\u001a0\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00052\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00030\t\u001a*\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"$\u0010\u0000\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"defaultAreEquivalent", "Lkotlin/Function2;", "", "", "distinctUntilChangedBy", "Landroidx/lifecycle/LiveData;", ExifInterface.GPS_DIRECTION_TRUE, "K", "keySelector", "Lkotlin/Function1;", "areEquivalent", "Lkotlin/ParameterName;", "name", "old", "new", "debounce", "time", "", "skipFirst", "skip", "count", "", "filter", "predicate", "merge", "other", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C24252m0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Function2<Object, Object, Boolean> f48216a = new Function2() { // from class: com.kubi.sdk.util.j0
        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(C24252m0.m58475k(obj, obj2));
        }
    };

    /* JADX INFO: renamed from: com.kubi.sdk.util.m0$a */
    /* JADX INFO: compiled from: LiveDataEx.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f48217b;

        public a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f48217b = function;
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
            return this.f48217b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48217b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final <T> LiveData<T> m58473i(@NotNull LiveData<T> liveData, final long j11) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        final Ref.LongRef longRef = new Ref.LongRef();
        mediatorLiveData.addSource(liveData, new a(new Function1() { // from class: com.kubi.sdk.util.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C24252m0.m58474j(longRef, j11, mediatorLiveData, obj);
            }
        }));
        return mediatorLiveData;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final <T, K> LiveData<T> m58476l(@NotNull LiveData<T> liveData, @NotNull final Function1<? super T, ? extends K> keySelector, @NotNull final Function2<? super K, ? super K, Boolean> areEquivalent) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(areEquivalent, "areEquivalent");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        mediatorLiveData.addSource(liveData, new a(new Function1() { // from class: com.kubi.sdk.util.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C24252m0.m58479o(keySelector, objectRef, areEquivalent, mediatorLiveData, obj);
            }
        }));
        return mediatorLiveData;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final <T> LiveData<T> m58477m(@NotNull LiveData<T> liveData, @NotNull final Function2<? super T, ? super T, Boolean> areEquivalent) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(areEquivalent, "areEquivalent");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        mediatorLiveData.addSource(liveData, new a(new Function1() { // from class: com.kubi.sdk.util.l0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C24252m0.m58480p(objectRef, areEquivalent, mediatorLiveData, obj);
            }
        }));
        return mediatorLiveData;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ LiveData m58478n(LiveData liveData, Function1 function1, Function2 function2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function2 = f48216a;
        }
        return m58476l(liveData, function1, function2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static final Unit m58480p(Ref.ObjectRef objectRef, Function2 function2, MediatorLiveData mediatorLiveData, Object obj) {
        T t11 = objectRef.element;
        if (t11 != 0) {
            Intrinsics.checkNotNull(t11);
            if (!((Boolean) function2.invoke(t11, obj)).booleanValue()) {
                objectRef.element = obj;
                mediatorLiveData.setValue(obj);
            }
        } else {
            objectRef.element = obj;
            mediatorLiveData.setValue(obj);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static final <T> LiveData<T> m58481q(@NotNull LiveData<T> liveData, @NotNull final Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new a(new Function1() { // from class: com.kubi.sdk.util.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C24252m0.m58482r(predicate, mediatorLiveData, obj);
            }
        }));
        return mediatorLiveData;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public static final <T> LiveData<T> m58483s(@NotNull LiveData<T> liveData, @NotNull LiveData<T> other) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new a(new Function1() { // from class: com.kubi.sdk.util.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C24252m0.m58484t(mediatorLiveData, obj);
            }
        }));
        mediatorLiveData.addSource(other, new a(new Function1() { // from class: com.kubi.sdk.util.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C24252m0.m58485u(mediatorLiveData, obj);
            }
        }));
        return mediatorLiveData;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static final <T> LiveData<T> m58486v(@NotNull LiveData<T> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = liveData.getValue() != null;
        mediatorLiveData.addSource(liveData, new a(new Function1() { // from class: com.kubi.sdk.util.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C24252m0.m58487w(booleanRef, mediatorLiveData, obj);
            }
        }));
        return mediatorLiveData;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m58487w(Ref.BooleanRef booleanRef, MediatorLiveData mediatorLiveData, Object obj) {
        if (booleanRef.element) {
            booleanRef.element = false;
        } else {
            mediatorLiveData.setValue(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m58474j(Ref.LongRef longRef, long j11, MediatorLiveData mediatorLiveData, Object obj) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j12 = longRef.element;
        if (j12 <= 0 || jCurrentTimeMillis - j12 > j11) {
            longRef.element = jCurrentTimeMillis;
            mediatorLiveData.setValue(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m58475k(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: o */
    public static final Unit m58479o(Function1 function1, Ref.ObjectRef objectRef, Function2 function2, MediatorLiveData mediatorLiveData, Object obj) {
        ?? Invoke = function1.invoke(obj);
        T t11 = objectRef.element;
        if (t11 == 0 || !((Boolean) function2.invoke(t11, Invoke)).booleanValue()) {
            objectRef.element = Invoke;
            mediatorLiveData.setValue(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m58482r(Function1 function1, MediatorLiveData mediatorLiveData, Object obj) {
        if (((Boolean) function1.invoke(obj)).booleanValue()) {
            mediatorLiveData.setValue(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m58484t(MediatorLiveData mediatorLiveData, Object obj) {
        mediatorLiveData.setValue(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m58485u(MediatorLiveData mediatorLiveData, Object obj) {
        mediatorLiveData.setValue(obj);
        return Unit.INSTANCE;
    }
}
