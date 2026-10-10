package androidx.lifecycle.internal;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateWriter;
import com.kubi.kumex.data.platform.model.NasdaqMarketStatusEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SavedStateHandleImpl.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001d\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001f\u0010\u001aJ\u001f\u0010!\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0007H\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0004\b#\u0010$R%\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R(\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00130%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R+\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00130%8\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\t¨\u00060"}, m90084d2 = {"Landroidx/lifecycle/internal/SavedStateHandleImpl;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateProvider", "()Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "key", "", "contains", "(Ljava/lang/String;)Z", ExifInterface.GPS_DIRECTION_TRUE, "initialValue", "Lkotlinx/coroutines/flow/w;", "getStateFlow", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;", "Lkotlinx/coroutines/flow/n;", "getMutableStateFlow", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;", "", "keys", "()Ljava/util/Set;", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "remove", "provider", "setSavedStateProvider", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;)V", "clearSavedStateProvider", "(Ljava/lang/String;)V", "", NasdaqMarketStatusEntity.MARKET_STATUS_REGULAR, "Ljava/util/Map;", "getRegular", "()Ljava/util/Map;", "providers", "flows", "mutableFlows", "getMutableFlows", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "getSavedStateProvider", "lifecycle-viewmodel-savedstate_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateHandleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleImpl.kt\nandroidx/lifecycle/internal/SavedStateHandleImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 8 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,129:1\n381#2,7:130\n381#2,7:137\n27#3:144\n46#3:145\n32#3,4:146\n31#3,7:156\n126#4:150\n153#4,3:151\n37#5,2:154\n1#6:163\n106#7:164\n46#8:165\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleImpl.kt\nandroidx/lifecycle/internal/SavedStateHandleImpl\n*L\n60#1:130,7\n76#1:137,7\n47#1:144\n47#1:145\n47#1:146,4\n47#1:156,7\n47#1:150\n47#1:151,3\n47#1:154,2\n47#1:163\n47#1:164\n47#1:165\n*E\n"})
public final class SavedStateHandleImpl {

    @NotNull
    private final Map<String, InterfaceC41669n<Object>> flows;

    @NotNull
    private final Map<String, InterfaceC41669n<Object>> mutableFlows;

    @NotNull
    private final Map<String, SavedStateRegistry.SavedStateProvider> providers;

    @NotNull
    private final Map<String, Object> regular;

    @NotNull
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandleImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SavedStateHandleImpl(@NotNull Map<String, ? extends Object> initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.regular = MapsKt.toMutableMap(initialState);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: k0.a
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandleImpl.savedStateProvider$lambda$0(this.f90719a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle savedStateProvider$lambda$0(SavedStateHandleImpl savedStateHandleImpl) {
        Pair[] pairArr;
        for (Map.Entry entry : MapsKt.toMap(savedStateHandleImpl.mutableFlows).entrySet()) {
            savedStateHandleImpl.set((String) entry.getKey(), ((InterfaceC41669n) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : MapsKt.toMap(savedStateHandleImpl.providers).entrySet()) {
            savedStateHandleImpl.set((String) entry2.getKey(), ((SavedStateRegistry.SavedStateProvider) entry2.getValue()).saveState());
        }
        Map<String, Object> map = savedStateHandleImpl.regular;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                arrayList.add(TuplesKt.m90091to(entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m103675constructorimpl(bundleBundleOf);
        return bundleBundleOf;
    }

    @MainThread
    public final void clearSavedStateProvider(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.providers.remove(key);
    }

    @MainThread
    public final boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.regular.containsKey(key);
    }

    @MainThread
    @Nullable
    public final <T> T get(@NotNull String key) {
        T t11;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            InterfaceC41669n<Object> interfaceC41669n = this.mutableFlows.get(key);
            if (interfaceC41669n != null && (t11 = (T) interfaceC41669n.getValue()) != null) {
                return t11;
            }
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    @NotNull
    public final Map<String, InterfaceC41669n<Object>> getMutableFlows() {
        return this.mutableFlows;
    }

    @MainThread
    @NotNull
    public final <T> InterfaceC41669n<T> getMutableStateFlow(@NotNull String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, InterfaceC41669n<Object>> map = this.mutableFlows;
        InterfaceC41678w interfaceC41678wM91009a = map.get(key);
        if (interfaceC41678wM91009a == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            interfaceC41678wM91009a = C41679x.m91009a(this.regular.get(key));
            map.put(key, (InterfaceC41669n<Object>) interfaceC41678wM91009a);
        }
        InterfaceC41669n<T> interfaceC41669n = (InterfaceC41669n) interfaceC41678wM91009a;
        Intrinsics.checkNotNull(interfaceC41669n, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getMutableStateFlow>");
        return interfaceC41669n;
    }

    @NotNull
    public final Map<String, Object> getRegular() {
        return this.regular;
    }

    @NotNull
    public final SavedStateRegistry.SavedStateProvider getSavedStateProvider() {
        return this.savedStateProvider;
    }

    @MainThread
    @NotNull
    public final <T> InterfaceC41678w<T> getStateFlow(@NotNull String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, InterfaceC41669n<Object>> map = this.flows;
        InterfaceC41669n<Object> interfaceC41669nM91009a = map.get(key);
        if (interfaceC41669nM91009a == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            interfaceC41669nM91009a = C41679x.m91009a(this.regular.get(key));
            map.put(key, interfaceC41669nM91009a);
        }
        InterfaceC41678w<T> interfaceC41678wM90907c = C41636g.m90907c(interfaceC41669nM91009a);
        Intrinsics.checkNotNull(interfaceC41678wM90907c, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getStateFlow>");
        return interfaceC41678wM90907c;
    }

    @MainThread
    @NotNull
    public final Set<String> keys() {
        return SetsKt.plus((Set) this.regular.keySet(), (Iterable) this.providers.keySet());
    }

    @MainThread
    @Nullable
    public final <T> T remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t11 = (T) this.regular.remove(key);
        this.flows.remove(key);
        this.mutableFlows.remove(key);
        return t11;
    }

    @NotNull
    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.savedStateProvider;
    }

    @MainThread
    public final <T> void set(@NotNull String key, @Nullable T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.regular.put(key, value);
        InterfaceC41669n<Object> interfaceC41669n = this.flows.get(key);
        if (interfaceC41669n != null) {
            interfaceC41669n.setValue(value);
        }
        InterfaceC41669n<Object> interfaceC41669n2 = this.mutableFlows.get(key);
        if (interfaceC41669n2 != null) {
            interfaceC41669n2.setValue(value);
        }
    }

    @MainThread
    public final void setSavedStateProvider(@NotNull String key, @NotNull SavedStateRegistry.SavedStateProvider provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.providers.put(key, provider);
    }

    public /* synthetic */ SavedStateHandleImpl(Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? MapsKt.emptyMap() : map);
    }
}
