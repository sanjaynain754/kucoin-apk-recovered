package com.tencent.bugly.common.replay;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.tencent.bugly.proguard.C33948u0;
import com.tencent.bugly.proguard.InterfaceC33708i8;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jdk7.AutoCloseableKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/RootViewsSpy;", "Ljava/io/Closeable;", "", "close", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/tencent/bugly/proguard/u0;", "viewListLock", "Lcom/tencent/bugly/proguard/u0;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "delegatingViewList", "Ljava/util/ArrayList;", "<init>", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final class RootViewsSpy implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ArrayList<View> delegatingViewList;

    @NotNull
    private final AtomicBoolean isClosed;

    @NotNull
    private final CopyOnWriteArrayList<OnRootViewsChangedListener> listeners;

    @NotNull
    private final C33948u0 viewListLock;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/RootViewsSpy$Companion;", "", "()V", "install", "Lcom/tencent/bugly/common/replay/RootViewsSpy;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: install$lambda-1$lambda-0, reason: not valid java name */
        public static final void m103813install$lambda1$lambda0(final RootViewsSpy this_apply) {
            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            if (this_apply.isClosed.get()) {
                return;
            }
            WindowManagerSpy.INSTANCE.swapWindowManagerGlobalMViews(new Function1<ArrayList<View>, ArrayList<View>>() { // from class: com.tencent.bugly.common.replay.RootViewsSpy$Companion$install$1$1$1
                {
                    super(1);
                }

                @Override // p852kotlin.jvm.functions.Function1
                @NotNull
                public final ArrayList<View> invoke(@NotNull ArrayList<View> mViews) {
                    Intrinsics.checkNotNullParameter(mViews, "mViews");
                    InterfaceC33708i8 interfaceC33708i8M75112a = this_apply.viewListLock.m75112a();
                    try {
                        ArrayList<View> arrayList = this_apply.delegatingViewList;
                        arrayList.addAll(mViews);
                        AutoCloseableKt.closeFinally(interfaceC33708i8M75112a, null);
                        return arrayList;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            AutoCloseableKt.closeFinally(interfaceC33708i8M75112a, th2);
                            throw th3;
                        }
                    }
                }
            });
        }

        @NotNull
        public final RootViewsSpy install() {
            final RootViewsSpy rootViewsSpy = new RootViewsSpy(null);
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.tencent.bugly.common.replay.b
                @Override // java.lang.Runnable
                public final void run() {
                    RootViewsSpy.Companion.m103813install$lambda1$lambda0(rootViewsSpy);
                }
            });
            return rootViewsSpy;
        }
    }

    public /* synthetic */ RootViewsSpy(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RootViewsSpy() {
        this.isClosed = new AtomicBoolean(false);
        this.viewListLock = new C33948u0();
        this.listeners = new CopyOnWriteArrayList<OnRootViewsChangedListener>() { // from class: com.tencent.bugly.common.replay.RootViewsSpy$listeners$1
            public /* bridge */ boolean contains(OnRootViewsChangedListener onRootViewsChangedListener) {
                return super.contains((Object) onRootViewsChangedListener);
            }

            public /* bridge */ int indexOf(OnRootViewsChangedListener onRootViewsChangedListener) {
                return super.indexOf((Object) onRootViewsChangedListener);
            }

            public /* bridge */ int lastIndexOf(OnRootViewsChangedListener onRootViewsChangedListener) {
                return super.lastIndexOf((Object) onRootViewsChangedListener);
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
            public final /* bridge */ OnRootViewsChangedListener remove(int i11) {
                return removeAt(i11);
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            public boolean add(@Nullable OnRootViewsChangedListener element) {
                InterfaceC33708i8 interfaceC33708i8M75112a = this.this$0.viewListLock.m75112a();
                try {
                    for (View view : this.this$0.delegatingViewList) {
                        if (element != null) {
                            element.onRootViewsChanged(view, true);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    AutoCloseableKt.closeFinally(interfaceC33708i8M75112a, null);
                    return super.add(element);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AutoCloseableKt.closeFinally(interfaceC33708i8M75112a, th2);
                        throw th3;
                    }
                }
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            public final /* bridge */ boolean contains(Object obj) {
                if (obj == null ? true : obj instanceof OnRootViewsChangedListener) {
                    return contains((OnRootViewsChangedListener) obj);
                }
                return false;
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
            public final /* bridge */ int indexOf(Object obj) {
                if (obj == null ? true : obj instanceof OnRootViewsChangedListener) {
                    return indexOf((OnRootViewsChangedListener) obj);
                }
                return -1;
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
            public final /* bridge */ int lastIndexOf(Object obj) {
                if (obj == null ? true : obj instanceof OnRootViewsChangedListener) {
                    return lastIndexOf((OnRootViewsChangedListener) obj);
                }
                return -1;
            }

            public /* bridge */ boolean remove(OnRootViewsChangedListener onRootViewsChangedListener) {
                return super.remove((Object) onRootViewsChangedListener);
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            public final /* bridge */ boolean remove(Object obj) {
                if (obj == null ? true : obj instanceof OnRootViewsChangedListener) {
                    return remove((OnRootViewsChangedListener) obj);
                }
                return false;
            }

            public /* bridge */ OnRootViewsChangedListener removeAt(int i11) {
                return remove(i11);
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            public final /* bridge */ int size() {
                return getSize();
            }
        };
        this.delegatingViewList = new ArrayList<View>() { // from class: com.tencent.bugly.common.replay.RootViewsSpy$delegatingViewList$1
            public /* bridge */ boolean contains(View view) {
                return super.contains((Object) view);
            }

            public /* bridge */ int indexOf(View view) {
                return super.indexOf((Object) view);
            }

            public /* bridge */ int lastIndexOf(View view) {
                return super.lastIndexOf((Object) view);
            }

            @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
            public final /* bridge */ View remove(int i11) {
                return removeAt(i11);
            }

            @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public boolean add(@NotNull View element) {
                Intrinsics.checkNotNullParameter(element, "element");
                Iterator<T> it = this.this$0.getListeners().iterator();
                while (it.hasNext()) {
                    ((OnRootViewsChangedListener) it.next()).onRootViewsChanged(element, true);
                }
                return super.add(element);
            }

            @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public boolean addAll(@NotNull Collection<? extends View> elements) {
                Intrinsics.checkNotNullParameter(elements, "elements");
                for (OnRootViewsChangedListener onRootViewsChangedListener : this.this$0.getListeners()) {
                    Iterator<T> it = elements.iterator();
                    while (it.hasNext()) {
                        onRootViewsChangedListener.onRootViewsChanged((View) it.next(), true);
                    }
                }
                return super.addAll(elements);
            }

            @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof View) {
                    return contains((View) obj);
                }
                return false;
            }

            @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
            public final /* bridge */ int indexOf(Object obj) {
                if (obj instanceof View) {
                    return indexOf((View) obj);
                }
                return -1;
            }

            @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
            public final /* bridge */ int lastIndexOf(Object obj) {
                if (obj instanceof View) {
                    return lastIndexOf((View) obj);
                }
                return -1;
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ boolean remove(View view) {
                return super.remove((Object) view);
            }

            @NotNull
            public View removeAt(int index) {
                Object objRemove = super.remove(index);
                Intrinsics.checkNotNullExpressionValue(objRemove, "super.removeAt(index)");
                View view = (View) objRemove;
                Iterator<T> it = this.this$0.getListeners().iterator();
                while (it.hasNext()) {
                    ((OnRootViewsChangedListener) it.next()).onRootViewsChanged(view, false);
                }
                return view;
            }

            @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public final /* bridge */ boolean remove(Object obj) {
                if (obj instanceof View) {
                    return remove((View) obj);
                }
                return false;
            }
        };
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.isClosed.set(true);
        this.listeners.clear();
    }

    @NotNull
    public final CopyOnWriteArrayList<OnRootViewsChangedListener> getListeners() {
        return this.listeners;
    }
}
