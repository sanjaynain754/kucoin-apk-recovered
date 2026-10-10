package g10;

import com.kubi.mvi.p102vm.InterfaceC19308c;
import com.kubi.sdk.websocket.SocketTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: g10.l */
/* JADX INFO: compiled from: SocketTaskManager.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0018\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/websocket/SocketTaskManager;", "", "<init>", "()V", "socketTaskList", "", "Lcom/kubi/sdk/websocket/SocketTask;", "addSocketHelper", "", "socketTask", "getSocketTask", "topic", "", "widgetLifecycleOwner", "Lcom/kubi/mvi/vm/WidgetLifecycleOwner;", "getSocketHelperList", "", "destroySocketHelper", "removeSocketHelper", "LWebSocket_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSocketTaskManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketTaskManager.kt\ncom/kubi/sdk/websocket/SocketTaskManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1#2:102\n1#2:107\n774#3:103\n865#3,2:104\n2756#3:106\n*S KotlinDebug\n*F\n+ 1 SocketTaskManager.kt\ncom/kubi/sdk/websocket/SocketTaskManager\n*L\n82#1:107\n66#1:103\n66#1:104,2\n82#1:106\n*E\n"})
public final class C37781l {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37781l f85093a = new C37781l();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final List<SocketTask> f85094b = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final synchronized void m85212b(@NotNull SocketTask socketTask) {
        Object next;
        Intrinsics.checkNotNullParameter(socketTask, "socketTask");
        List<SocketTask> list = f85094b;
        synchronized (list) {
            try {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    SocketTask socketTask2 = (SocketTask) next;
                    if (Intrinsics.areEqual(socketTask2.getF48572a(), socketTask.getF48572a()) && Intrinsics.areEqual(socketTask2.getF48573b(), socketTask.getF48573b())) {
                        break;
                    }
                }
                if (next == null) {
                    List<SocketTask> list2 = f85094b;
                    if (!list2.contains(socketTask)) {
                        list2.add(socketTask);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final synchronized List<SocketTask> m85214d(@NotNull String topic, @NotNull InterfaceC19308c widgetLifecycleOwner) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(widgetLifecycleOwner, "widgetLifecycleOwner");
        List<SocketTask> list = f85094b;
        synchronized (list) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                SocketTask socketTask = (SocketTask) obj;
                if (Intrinsics.areEqual(socketTask.getF48572a(), topic) && Intrinsics.areEqual(socketTask.getF48573b(), widgetLifecycleOwner)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final synchronized SocketTask m85215e(@NotNull String topic, @NotNull InterfaceC19308c widgetLifecycleOwner) {
        Object next;
        SocketTask socketTask;
        try {
            Intrinsics.checkNotNullParameter(topic, "topic");
            Intrinsics.checkNotNullParameter(widgetLifecycleOwner, "widgetLifecycleOwner");
            List<SocketTask> list = f85094b;
            synchronized (list) {
                try {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        SocketTask socketTask2 = (SocketTask) next;
                        if (Intrinsics.areEqual(socketTask2.getF48572a(), topic) && Intrinsics.areEqual(socketTask2.getF48573b(), widgetLifecycleOwner)) {
                            break;
                        }
                    }
                    socketTask = (SocketTask) next;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return socketTask;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m85216f(@NotNull final SocketTask socketTask) {
        Intrinsics.checkNotNullParameter(socketTask, "socketTask");
        List<SocketTask> list = f85094b;
        synchronized (list) {
            CollectionsKt.removeAll((List) list, new Function1() { // from class: g10.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C37781l.m85211g(socketTask, (SocketTask) obj));
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m85211g(SocketTask socketTask, SocketTask it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getF48572a(), socketTask.getF48572a()) && Intrinsics.areEqual(it.getF48573b(), socketTask.getF48573b());
    }

    /* JADX INFO: renamed from: c */
    public final void m85213c(@NotNull String topic, @NotNull InterfaceC19308c widgetLifecycleOwner) {
        List<SocketTask> list;
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(widgetLifecycleOwner, "widgetLifecycleOwner");
        List<SocketTask> listM85214d = m85214d(topic, widgetLifecycleOwner);
        if (listM85214d == null || (list = CollectionsKt.toList(listM85214d)) == null) {
            return;
        }
        for (SocketTask socketTask : list) {
            socketTask.m58916p();
            widgetLifecycleOwner.getWidgetLifecycle().m42732f(socketTask);
        }
    }
}
