package io.trtc.tuikit.atomicxcore.hybridapi.dispatcher;

import android.util.Log;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridListenerKey;
import io.trtc.tuikit.atomicxcore.hybridapi.json.JsonParserKt;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0013\u0010\u000bJ+\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0014H\u0004¢\u0006\u0004\b\u0016\u0010\u0017R,\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020 8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;", "", "Lkotlin/Function2;", "", "", "eventEmitter", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;", "key", "addListener", "(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;)V", "removeListener", "", "hasListeners", "()Z", "startObserving", "()V", "stopObserving", "dispatchCurrentState", "", ReportDataTable.COLUMN_PARAMS, "dispatchEvent", "(Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;Ljava/util/Map;)V", "Lkotlin/jvm/functions/Function2;", "getEventEmitter", "()Lkotlin/jvm/functions/Function2;", "", "keys", "Ljava/util/Set;", "getKeys", "()Ljava/util/Set;", "Lkotlinx/coroutines/m0;", "_observerScope", "Lkotlinx/coroutines/m0;", "getObserverScope", "()Lkotlinx/coroutines/m0;", "observerScope", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,67:1\n1855#2:68\n1856#2:71\n35#3,2:69\n*S KotlinDebug\n*F\n+ 1 Dispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher\n*L\n53#1:68\n53#1:71\n57#1:69,2\n*E\n"})
public abstract class Dispatcher {

    @Nullable
    private InterfaceC41709m0 _observerScope;

    @NotNull
    private final Function2<String, String, Unit> eventEmitter;

    @NotNull
    private final Set<HybridListenerKey> keys;

    public abstract void dispatchCurrentState(@NotNull HybridListenerKey key);

    public abstract void startObserving();

    public abstract void stopObserving();

    /* JADX WARN: Multi-variable type inference failed */
    public Dispatcher(@NotNull Function2<? super String, ? super String, Unit> eventEmitter) {
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        this.eventEmitter = eventEmitter;
        this.keys = new LinkedHashSet();
    }

    public final void addListener(@NotNull HybridListenerKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.keys.isEmpty()) {
            this._observerScope = C41713n0.m91125a(C41782z0.m91393c().plus(C41727q2.m91192b(null, 1, null)));
            startObserving();
        }
        this.keys.add(key);
        dispatchCurrentState(key);
    }

    public final void dispatchEvent(@NotNull HybridListenerKey key, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(params, "params");
        for (HybridListenerKey hybridListenerKey : CollectionsKt.toSet(this.keys)) {
            if (Intrinsics.areEqual(hybridListenerKey.getName(), key.getName()) && Intrinsics.areEqual(hybridListenerKey.getRoomID(), key.getRoomID()) && (key.getListenerID() == null || Intrinsics.areEqual(hybridListenerKey.getListenerID(), key.getListenerID()))) {
                try {
                    String json = hybridListenerKey.toJson();
                    String json2 = JsonParserKt.getSharedGson().toJson(params);
                    Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                    this.eventEmitter.invoke(json, json2);
                } catch (Exception e11) {
                    Log.e("Dispatcher", "Error sending event: " + e11.getMessage(), e11);
                }
            }
        }
    }

    @NotNull
    public final Function2<String, String, Unit> getEventEmitter() {
        return this.eventEmitter;
    }

    @NotNull
    public final Set<HybridListenerKey> getKeys() {
        return this.keys;
    }

    @NotNull
    public final InterfaceC41709m0 getObserverScope() {
        InterfaceC41709m0 interfaceC41709m0 = this._observerScope;
        return interfaceC41709m0 == null ? C41713n0.m91125a(C41782z0.m91393c().plus(C41727q2.m91192b(null, 1, null))) : interfaceC41709m0;
    }

    public final boolean hasListeners() {
        return !this.keys.isEmpty();
    }

    public final void removeListener(@NotNull HybridListenerKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.keys.remove(key);
        if (!this.keys.isEmpty() || this._observerScope == null) {
            return;
        }
        stopObserving();
        InterfaceC41709m0 interfaceC41709m0 = this._observerScope;
        if (interfaceC41709m0 != null) {
            C41713n0.m91129e(interfaceC41709m0, null, 1, null);
        }
        this._observerScope = null;
    }
}
