package androidx.camera.core.impl;

import androidx.annotation.GuardedBy;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraPresenceListener;
import androidx.camera.core.CameraState;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CameraPresenseProvider.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ;2\u00020\u0001:\u00039:;B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010 \u001a\u00020\u001fJ\u0016\u0010!\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J$\u0010#\u001a\u00020\u001f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0%H\u0002J\u000e\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0016J\u000e\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0016J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001bH\u0002J\u0010\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001bH\u0002J\b\u00100\u001a\u00020\u001fH\u0002J\u0016\u00101\u001a\u00020\u001f2\u0006\u0010(\u001a\u0002022\u0006\u00103\u001a\u00020\u0003J\u000e\u00104\u001a\u00020\u001f2\u0006\u0010(\u001a\u000202J\u0016\u00105\u001a\u00020\u001f2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000e0%H\u0002J\u0016\u00107\u001a\u00020\u001f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e0%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001a8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, m90084d2 = {"Landroidx/camera/core/impl/CameraPresenceProvider;", "", "backgroundExecutor", "Ljava/util/concurrent/Executor;", "<init>", "(Ljava/util/concurrent/Executor;)V", "observerLock", "cameraFactory", "Landroidx/camera/core/impl/CameraFactory;", "cameraRepository", "Landroidx/camera/core/impl/CameraRepository;", "sourcePresenceObservable", "Landroidx/camera/core/impl/Observable;", "", "Landroidx/camera/core/CameraIdentifier;", "sourceObserver", "Landroidx/camera/core/impl/CameraPresenceProvider$SourceObservableObserver;", "currentFilteredIds", "isMonitoring", "Ljava/util/concurrent/atomic/AtomicBoolean;", "dependentInternalListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/camera/core/impl/InternalCameraPresenceListener;", "publicApiListeners", "Landroidx/camera/core/impl/CameraPresenceProvider$ListenerWrapper;", "cameraStateObservers", "", "", "Landroidx/lifecycle/Observer;", "Landroidx/camera/core/CameraState;", "startup", "", "shutdown", "processFilteredCameraIdUpdate", "newFilteredIdentifiers", "notifyPublicListeners", "addedCameras", "", "removedCameras", "addDependentInternalListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeDependentInternalListener", "conditionallySetupCameraStateObserver", "systemCameraId", "setupCameraStateObserver", "cameraInfoInternal", "Landroidx/camera/core/impl/CameraInfoInternal;", "removeCameraStateObserver", "clearAllCameraStateObservers", "addCameraPresenceListener", "Landroidx/camera/core/CameraPresenceListener;", "executor", "removeCameraPresenceListener", "notifyPublicCamerasAdded", "addedIds", "notifyPublicCamerasRemoved", "removedIds", "ListenerWrapper", "SourceObservableObserver", "Companion", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCameraPresenseProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraPresenseProvider.kt\nandroidx/camera/core/impl/CameraPresenceProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,351:1\n1557#2:352\n1628#2,3:353\n1557#2:356\n1628#2,3:357\n1863#2,2:360\n1863#2,2:362\n1863#2,2:364\n1557#2:366\n1628#2,3:367\n1863#2,2:370\n1863#2,2:372\n1863#2,2:374\n1557#2:376\n1628#2,3:377\n1863#2,2:384\n1863#2,2:386\n295#2,2:388\n126#3:380\n153#3,3:381\n*S KotlinDebug\n*F\n+ 1 CameraPresenseProvider.kt\nandroidx/camera/core/impl/CameraPresenceProvider\n*L\n77#1:352\n77#1:353,3\n145#1:356\n145#1:357,3\n149#1:360,2\n162#1:362,2\n170#1:364,2\n175#1:366\n175#1:367,3\n178#1:370,2\n189#1:372,2\n190#1:374,2\n302#1:376\n302#1:377,3\n336#1:384,2\n342#1:386,2\n308#1:388,2\n304#1:380\n304#1:381,3\n*E\n"})
public final class CameraPresenceProvider {

    @NotNull
    private static final String TAG = "CameraPresencePrvdr";

    @NotNull
    private final Executor backgroundExecutor;

    @Nullable
    private CameraFactory cameraFactory;

    @Nullable
    private CameraRepository cameraRepository;

    @GuardedBy("observerLock")
    @NotNull
    private final Map<String, Observer<CameraState>> cameraStateObservers;

    @NotNull
    private volatile List<CameraIdentifier> currentFilteredIds;

    @NotNull
    private final CopyOnWriteArrayList<InternalCameraPresenceListener> dependentInternalListeners;

    @NotNull
    private final AtomicBoolean isMonitoring;

    @NotNull
    private final Object observerLock;

    @NotNull
    private final CopyOnWriteArrayList<ListenerWrapper> publicApiListeners;

    @NotNull
    private final SourceObservableObserver sourceObserver;

    @Nullable
    private Observable<List<CameraIdentifier>> sourcePresenceObservable;

    /* JADX INFO: compiled from: CameraPresenseProvider.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Landroidx/camera/core/impl/CameraPresenceProvider$ListenerWrapper;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/camera/core/CameraPresenceListener;", "executor", "Ljava/util/concurrent/Executor;", "<init>", "(Landroidx/camera/core/CameraPresenceListener;Ljava/util/concurrent/Executor;)V", "getListener", "()Landroidx/camera/core/CameraPresenceListener;", "getExecutor", "()Ljava/util/concurrent/Executor;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final /* data */ class ListenerWrapper {

        @NotNull
        private final Executor executor;

        @NotNull
        private final CameraPresenceListener listener;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListenerWrapper)) {
                return false;
            }
            ListenerWrapper listenerWrapper = (ListenerWrapper) other;
            return Intrinsics.areEqual(this.listener, listenerWrapper.listener) && Intrinsics.areEqual(this.executor, listenerWrapper.executor);
        }

        public static /* synthetic */ ListenerWrapper copy$default(ListenerWrapper listenerWrapper, CameraPresenceListener cameraPresenceListener, Executor executor, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cameraPresenceListener = listenerWrapper.listener;
            }
            if ((i11 & 2) != 0) {
                executor = listenerWrapper.executor;
            }
            return listenerWrapper.copy(cameraPresenceListener, executor);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CameraPresenceListener getListener() {
            return this.listener;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Executor getExecutor() {
            return this.executor;
        }

        @NotNull
        public final Executor getExecutor() {
            return this.executor;
        }

        @NotNull
        public final CameraPresenceListener getListener() {
            return this.listener;
        }

        public int hashCode() {
            return (this.listener.hashCode() * 31) + this.executor.hashCode();
        }

        @NotNull
        public String toString() {
            return "ListenerWrapper(listener=" + this.listener + ", executor=" + this.executor + ')';
        }

        public ListenerWrapper(@NotNull CameraPresenceListener listener, @NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.listener = listener;
            this.executor = executor;
        }

        @NotNull
        public final ListenerWrapper copy(@NotNull CameraPresenceListener listener, @NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(executor, "executor");
            return new ListenerWrapper(listener, executor);
        }
    }

    /* JADX INFO: compiled from: CameraPresenseProvider.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"Landroidx/camera/core/impl/CameraPresenceProvider$SourceObservableObserver;", "Landroidx/camera/core/impl/Observable$Observer;", "", "Landroidx/camera/core/CameraIdentifier;", "<init>", "(Landroidx/camera/core/impl/CameraPresenceProvider;)V", "onNewData", "", "rawCameraIdentifiers", "onError", "t", "", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCameraPresenseProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraPresenseProvider.kt\nandroidx/camera/core/impl/CameraPresenceProvider$SourceObservableObserver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,351:1\n1557#2:352\n1628#2,3:353\n1557#2:356\n1628#2,3:357\n*S KotlinDebug\n*F\n+ 1 CameraPresenseProvider.kt\nandroidx/camera/core/impl/CameraPresenceProvider$SourceObservableObserver\n*L\n109#1:352\n109#1:353,3\n119#1:356\n119#1:357,3\n*E\n"})
    public final class SourceObservableObserver implements Observable.Observer<List<? extends CameraIdentifier>> {
        @Override // androidx.camera.core.impl.Observable.Observer
        public /* bridge */ /* synthetic */ void onNewData(List<? extends CameraIdentifier> list) {
            onNewData2((List<CameraIdentifier>) list);
        }

        public SourceObservableObserver() {
        }

        /* JADX INFO: renamed from: onNewData, reason: avoid collision after fix types in other method */
        public void onNewData2(@Nullable List<CameraIdentifier> rawCameraIdentifiers) {
            CameraFactory cameraFactory;
            List<String> listEmptyList;
            if (CameraPresenceProvider.this.isMonitoring.get() && (cameraFactory = CameraPresenceProvider.this.cameraFactory) != null) {
                if (rawCameraIdentifiers != null) {
                    listEmptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(rawCameraIdentifiers, 10));
                    Iterator<T> it = rawCameraIdentifiers.iterator();
                    while (it.hasNext()) {
                        listEmptyList.add(((CameraIdentifier) it.next()).getInternalId());
                    }
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                try {
                    cameraFactory.onCameraIdsUpdated(listEmptyList);
                    Set<String> availableCameraIds = cameraFactory.getAvailableCameraIds();
                    Intrinsics.checkNotNullExpressionValue(availableCameraIds, "getAvailableCameraIds(...)");
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(availableCameraIds, 10));
                    for (String str : availableCameraIds) {
                        CameraIdentifier.Companion companion = CameraIdentifier.INSTANCE;
                        Intrinsics.checkNotNull(str);
                        arrayList.add(CameraIdentifier.Companion.create$default(companion, str, null, null, 6, null));
                    }
                    CameraPresenceProvider.this.processFilteredCameraIdUpdate(arrayList);
                } catch (Exception e11) {
                    Logger.m1869e(CameraPresenceProvider.TAG, "CameraFactory failed to update. Triggering refresh.", e11);
                    Observable observable = CameraPresenceProvider.this.sourcePresenceObservable;
                    if (observable != null) {
                        observable.fetchData();
                    }
                }
            }
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(@NotNull Throwable t11) {
            Intrinsics.checkNotNullParameter(t11, "t");
            if (CameraPresenceProvider.this.isMonitoring.get()) {
                Logger.m1869e(CameraPresenceProvider.TAG, "Error from source camera presence observable. Triggering refresh.", t11);
                Observable observable = CameraPresenceProvider.this.sourcePresenceObservable;
                if (observable != null) {
                    observable.fetchData();
                }
            }
        }
    }

    public CameraPresenceProvider(@NotNull Executor backgroundExecutor) {
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        this.backgroundExecutor = backgroundExecutor;
        this.observerLock = new Object();
        this.sourceObserver = new SourceObservableObserver();
        this.currentFilteredIds = CollectionsKt.emptyList();
        this.isMonitoring = new AtomicBoolean(false);
        this.dependentInternalListeners = new CopyOnWriteArrayList<>();
        this.publicApiListeners = new CopyOnWriteArrayList<>();
        this.cameraStateObservers = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addCameraPresenceListener$lambda$20(CameraPresenceProvider cameraPresenceProvider, CameraPresenceListener cameraPresenceListener) {
        Set<CameraIdentifier> set = CollectionsKt.toSet(cameraPresenceProvider.currentFilteredIds);
        if (set.isEmpty()) {
            return;
        }
        cameraPresenceListener.onCamerasAdded(set);
    }

    private final void clearAllCameraStateObservers() {
        synchronized (this.observerLock) {
            if (this.cameraStateObservers.isEmpty()) {
                return;
            }
            Map map = MapsKt.toMap(this.cameraStateObservers);
            this.cameraStateObservers.clear();
            Unit unit = Unit.INSTANCE;
            CameraRepository cameraRepository = this.cameraRepository;
            if (cameraRepository != null) {
                LinkedHashSet<CameraInternal> cameras = cameraRepository.getCameras();
                Intrinsics.checkNotNullExpressionValue(cameras, "getCameras(...)");
                final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(cameras, 10));
                Iterator<T> it = cameras.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CameraInternal) it.next()).getCameraInfoInternal());
                }
                Logger.m1866d(TAG, "Clearing all " + map.size() + " state observers.");
                ArrayList arrayList2 = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    final String str = (String) entry.getKey();
                    final Observer observer = (Observer) entry.getValue();
                    CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.impl.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraPresenceProvider.clearAllCameraStateObservers$lambda$19$lambda$18(arrayList, observer, str);
                        }
                    });
                    arrayList2.add(Unit.INSTANCE);
                }
            }
        }
    }

    private final void conditionallySetupCameraStateObserver(String systemCameraId) {
        CameraRepository cameraRepository = this.cameraRepository;
        if (cameraRepository == null) {
            return;
        }
        try {
            CameraInternal camera = cameraRepository.getCamera(systemCameraId);
            Intrinsics.checkNotNullExpressionValue(camera, "getCamera(...)");
            CameraInfoInternal cameraInfoInternal = camera.getCameraInfoInternal();
            Intrinsics.checkNotNullExpressionValue(cameraInfoInternal, "getCameraInfoInternal(...)");
            setupCameraStateObserver(cameraInfoInternal);
        } catch (IllegalArgumentException unused) {
            Logger.m1872w(TAG, "CameraInternal not found for " + systemCameraId + ". Cannot setup state observer.");
        }
    }

    private final void notifyPublicCamerasAdded(final Set<CameraIdentifier> addedIds) {
        for (final ListenerWrapper listenerWrapper : this.publicApiListeners) {
            listenerWrapper.getExecutor().execute(new Runnable() { // from class: androidx.camera.core.impl.k
                @Override // java.lang.Runnable
                public final void run() {
                    CameraPresenceProvider.notifyPublicCamerasAdded$lambda$23$lambda$22(listenerWrapper, addedIds);
                }
            });
        }
    }

    private final void notifyPublicCamerasRemoved(final Set<CameraIdentifier> removedIds) {
        for (final ListenerWrapper listenerWrapper : this.publicApiListeners) {
            listenerWrapper.getExecutor().execute(new Runnable() { // from class: androidx.camera.core.impl.h
                @Override // java.lang.Runnable
                public final void run() {
                    CameraPresenceProvider.notifyPublicCamerasRemoved$lambda$25$lambda$24(listenerWrapper, removedIds);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processFilteredCameraIdUpdate(List<CameraIdentifier> newFilteredIdentifiers) {
        List list = CollectionsKt.toList(this.currentFilteredIds);
        if (Intrinsics.areEqual(newFilteredIdentifiers, list)) {
            return;
        }
        Set set = CollectionsKt.toSet(list);
        Set set2 = CollectionsKt.toSet(newFilteredIdentifiers);
        Set<CameraIdentifier> setMinus = SetsKt.minus(set2, (Iterable) set);
        Set<CameraIdentifier> setMinus2 = SetsKt.minus(set, (Iterable) set2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(newFilteredIdentifiers, 10));
        Iterator<T> it = newFilteredIdentifiers.iterator();
        while (it.hasNext()) {
            arrayList2.add(((CameraIdentifier) it.next()).getInternalId());
        }
        try {
            Iterator<T> it2 = setMinus2.iterator();
            while (it2.hasNext()) {
                removeCameraStateObserver(((CameraIdentifier) it2.next()).getInternalId());
            }
            CameraRepository cameraRepository = this.cameraRepository;
            if (cameraRepository != null) {
                Logger.m1866d(TAG, "Updating CameraRepository...");
                cameraRepository.onCamerasUpdated(arrayList2);
                arrayList.add(cameraRepository);
                Logger.m1866d(TAG, "CameraRepository updated successfully.");
            }
            if (!this.dependentInternalListeners.isEmpty()) {
                Logger.m1866d(TAG, "Updating " + this.dependentInternalListeners.size() + " dependent listeners...");
                for (InternalCameraPresenceListener internalCameraPresenceListener : this.dependentInternalListeners) {
                    internalCameraPresenceListener.onCamerasUpdated(arrayList2);
                    Intrinsics.checkNotNull(internalCameraPresenceListener);
                    arrayList.add(internalCameraPresenceListener);
                }
            }
            this.currentFilteredIds = newFilteredIdentifiers;
            Iterator<T> it3 = setMinus.iterator();
            while (it3.hasNext()) {
                conditionallySetupCameraStateObserver(((CameraIdentifier) it3.next()).getInternalId());
            }
            notifyPublicListeners(setMinus, setMinus2);
        } catch (Exception e11) {
            Logger.m1869e(TAG, "A core module failed to update. Rolling back changes.", e11);
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((CameraIdentifier) it4.next()).getInternalId());
            }
            for (InternalCameraPresenceListener internalCameraPresenceListener2 : CollectionsKt.asReversedMutable(arrayList)) {
                try {
                    internalCameraPresenceListener2.onCamerasUpdated(arrayList3);
                } catch (Exception e12) {
                    Logger.m1869e(TAG, "Failed to rollback listener: " + internalCameraPresenceListener2, e12);
                }
            }
            Iterator<T> it5 = setMinus2.iterator();
            while (it5.hasNext()) {
                conditionallySetupCameraStateObserver(((CameraIdentifier) it5.next()).getInternalId());
            }
            Iterator<T> it6 = setMinus.iterator();
            while (it6.hasNext()) {
                removeCameraStateObserver(((CameraIdentifier) it6.next()).getInternalId());
            }
        }
    }

    private final void removeCameraStateObserver(String systemCameraId) {
        synchronized (this.observerLock) {
            final Observer<CameraState> observerRemove = this.cameraStateObservers.remove(systemCameraId);
            CameraRepository cameraRepository = this.cameraRepository;
            if (observerRemove != null && cameraRepository != null) {
                try {
                    final CameraInternal camera = cameraRepository.getCamera(systemCameraId);
                    Intrinsics.checkNotNullExpressionValue(camera, "getCamera(...)");
                    CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.impl.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraPresenceProvider.removeCameraStateObserver$lambda$14$lambda$13(camera, observerRemove);
                        }
                    });
                    Logger.m1866d(TAG, "Removed state observer for: " + systemCameraId);
                } catch (IllegalArgumentException unused) {
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCameraStateObserver$lambda$12$lambda$10(CameraPresenceProvider cameraPresenceProvider, String str, CameraState cameraState) {
        if (!cameraPresenceProvider.isMonitoring.get()) {
            Logger.m1866d(TAG, "Ignore camera state change handling since already stop monitoring");
            return;
        }
        if ((cameraState != null ? cameraState.getError() : null) == null) {
            if ((cameraState != null ? cameraState.getType() : null) != CameraState.Type.CLOSED) {
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Camera ");
        sb2.append(str);
        sb2.append(" state changed to ");
        sb2.append(cameraState.getType());
        sb2.append(" with error: ");
        CameraState.StateError error = cameraState.getError();
        sb2.append(error != null ? Integer.valueOf(error.getCode()) : null);
        sb2.append(". Triggering refresh.");
        Logger.m1872w(TAG, sb2.toString());
        Observable<List<CameraIdentifier>> observable = cameraPresenceProvider.sourcePresenceObservable;
        if (observable != null) {
            observable.fetchData();
        }
    }

    public final void shutdown() {
        if (!this.isMonitoring.getAndSet(false)) {
            Logger.m1866d(TAG, "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        Logger.m1870i(TAG, "Shutting down CameraPresenceProvider monitoring.");
        Observable<List<CameraIdentifier>> observable = this.sourcePresenceObservable;
        if (observable != null) {
            observable.removeObserver(this.sourceObserver);
        }
        clearAllCameraStateObservers();
        this.dependentInternalListeners.clear();
        this.publicApiListeners.clear();
        this.currentFilteredIds = CollectionsKt.emptyList();
        this.cameraFactory = null;
        this.cameraRepository = null;
    }

    public final void startup(@NotNull CameraFactory cameraFactory, @NotNull CameraRepository cameraRepository) {
        Intrinsics.checkNotNullParameter(cameraFactory, "cameraFactory");
        Intrinsics.checkNotNullParameter(cameraRepository, "cameraRepository");
        if (this.isMonitoring.compareAndSet(false, true)) {
            Logger.m1870i(TAG, "Starting CameraPresenceProvider monitoring.");
            Set<String> availableCameraIds = cameraFactory.getAvailableCameraIds();
            Intrinsics.checkNotNullExpressionValue(availableCameraIds, "getAvailableCameraIds(...)");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(availableCameraIds, 10));
            for (String str : availableCameraIds) {
                CameraIdentifier.Companion companion = CameraIdentifier.INSTANCE;
                Intrinsics.checkNotNull(str);
                arrayList.add(CameraIdentifier.Companion.create$default(companion, str, null, null, 6, null));
            }
            this.currentFilteredIds = arrayList;
            this.cameraFactory = cameraFactory;
            this.cameraRepository = cameraRepository;
            Observable<List<CameraIdentifier>> cameraPresenceSource = cameraFactory.getCameraPresenceSource();
            this.sourcePresenceObservable = cameraPresenceSource;
            if (cameraPresenceSource != null) {
                cameraPresenceSource.addObserver(this.backgroundExecutor, this.sourceObserver);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearAllCameraStateObservers$lambda$19$lambda$18(List list, Observer observer, String str) {
        Object next;
        LiveData<CameraState> cameraState;
        try {
            Iterator it = list.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(((CameraInfoInternal) next).getCameraId(), str));
            CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) next;
            if (cameraInfoInternal != null && (cameraState = cameraInfoInternal.getCameraState()) != null) {
                cameraState.removeObserver(observer);
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyPublicCamerasAdded$lambda$23$lambda$22(ListenerWrapper listenerWrapper, Set set) {
        listenerWrapper.getListener().onCamerasAdded(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyPublicCamerasRemoved$lambda$25$lambda$24(ListenerWrapper listenerWrapper, Set set) {
        listenerWrapper.getListener().onCamerasRemoved(set);
    }

    private final void notifyPublicListeners(Set<CameraIdentifier> addedCameras, Set<CameraIdentifier> removedCameras) {
        if (!addedCameras.isEmpty()) {
            Logger.m1870i(TAG, "Notifying " + addedCameras.size() + " cameras added.");
            notifyPublicCamerasAdded(addedCameras);
        }
        if (!removedCameras.isEmpty()) {
            Logger.m1870i(TAG, "Notifying " + removedCameras.size() + " cameras removed.");
            notifyPublicCamerasRemoved(removedCameras);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeCameraPresenceListener$lambda$21(CameraPresenceListener cameraPresenceListener, ListenerWrapper listenerWrapper) {
        return Intrinsics.areEqual(listenerWrapper.getListener(), cameraPresenceListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeCameraStateObserver$lambda$14$lambda$13(CameraInternal cameraInternal, Observer observer) {
        cameraInternal.getCameraInfoInternal().getCameraState().removeObserver(observer);
    }

    private final void setupCameraStateObserver(final CameraInfoInternal cameraInfoInternal) {
        final String cameraId = cameraInfoInternal.getCameraId();
        Intrinsics.checkNotNullExpressionValue(cameraId, "getCameraId(...)");
        if (!this.isMonitoring.get()) {
            return;
        }
        synchronized (this.observerLock) {
            if (this.cameraStateObservers.containsKey(cameraId)) {
                return;
            }
            final Observer<CameraState> observer = new Observer() { // from class: androidx.camera.core.impl.m
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    CameraPresenceProvider.setupCameraStateObserver$lambda$12$lambda$10(this.f1681b, cameraId, (CameraState) obj);
                }
            };
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.impl.n
                @Override // java.lang.Runnable
                public final void run() {
                    CameraPresenceProvider.setupCameraStateObserver$lambda$12$lambda$11(cameraInfoInternal, observer);
                }
            });
            this.cameraStateObservers.put(cameraId, observer);
            Logger.m1866d(TAG, "Registered state observer for camera: " + cameraId);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCameraStateObserver$lambda$12$lambda$11(CameraInfoInternal cameraInfoInternal, Observer observer) {
        cameraInfoInternal.getCameraState().observeForever(observer);
    }

    public final void addCameraPresenceListener(@NotNull final CameraPresenceListener listener, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.publicApiListeners.add(new ListenerWrapper(listener, executor));
        executor.execute(new Runnable() { // from class: androidx.camera.core.impl.l
            @Override // java.lang.Runnable
            public final void run() {
                CameraPresenceProvider.addCameraPresenceListener$lambda$20(this.f1679b, listener);
            }
        });
    }

    public final void addDependentInternalListener(@NotNull InternalCameraPresenceListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.dependentInternalListeners.add(listener);
    }

    public final void removeCameraPresenceListener(@NotNull final CameraPresenceListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CollectionsKt.removeAll((List) this.publicApiListeners, new Function1() { // from class: androidx.camera.core.impl.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CameraPresenceProvider.removeCameraPresenceListener$lambda$21(listener, (CameraPresenceProvider.ListenerWrapper) obj));
            }
        });
    }

    public final void removeDependentInternalListener(@NotNull InternalCameraPresenceListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.dependentInternalListeners.remove(listener);
    }
}
