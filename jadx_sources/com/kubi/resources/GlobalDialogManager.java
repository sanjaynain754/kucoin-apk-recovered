package com.kubi.resources;

import androidx.annotation.MainThread;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.resources.dialog.BaseDialogFragment;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.resources.k, reason: from Kotlin metadata */
/* JADX INFO: compiled from: GlobalDialogManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003 !\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u001fH\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/resources/GlobalDialogManager;", "", "<init>", "()V", "mListeners", "Ljava/util/LinkedList;", "Lcom/kubi/resources/GlobalDialogManager$OnDialogLifeCycleListener;", "mInterceptors", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/kubi/resources/GlobalDialogManager$IDialogInterceptor;", "dialogCount", "", "getDialogCount", "hasDialog", "", "registerDialogLifeCycleListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "unregisterDialogLifeCycleListener", "addDialogInterceptor", "", "interceptor", "removeDialogInterceptor", "dispatchOnCreate", "dialog", "Landroidx/fragment/app/DialogFragment;", "dispatchOnStart", "dispatchOnResume", "dispatchOnPause", "dispatchOnStop", "dispatchOnDestroy", "callInterceptor", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "OnDialogLifeCycleListener", "SimpleDialogLifeCycleListener", "IDialogInterceptor", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGlobalDialogManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalDialogManager.kt\ncom/kubi/resources/GlobalDialogManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n1869#2,2:194\n1869#2,2:196\n1869#2,2:198\n1869#2,2:200\n1869#2,2:202\n1869#2,2:204\n1761#2,3:206\n*S KotlinDebug\n*F\n+ 1 GlobalDialogManager.kt\ncom/kubi/resources/GlobalDialogManager\n*L\n63#1:194,2\n70#1:196,2\n76#1:198,2\n82#1:200,2\n88#1:202,2\n94#1:204,2\n109#1:206,3\n*E\n"})
public final class GlobalDialogManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final GlobalDialogManager f43651a = new GlobalDialogManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final LinkedList<b> f43652b = new LinkedList<>();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final CopyOnWriteArrayList<a> f43653c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d */
    public static int f43654d;

    /* JADX INFO: renamed from: com.kubi.resources.k$a */
    /* JADX INFO: compiled from: GlobalDialogManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/GlobalDialogManager$IDialogInterceptor;", "", "intercept", "", "dialog", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo37536a(@NotNull BaseDialogFragment baseDialogFragment);
    }

    /* JADX INFO: renamed from: com.kubi.resources.k$b */
    /* JADX INFO: compiled from: GlobalDialogManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/GlobalDialogManager$OnDialogLifeCycleListener;", "", "onCreate", "", "dialog", "Landroidx/fragment/app/DialogFragment;", "onResume", "onStart", "onPause", "onStop", "onDestroy", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo54347a(@NotNull DialogFragment dialogFragment);

        /* JADX INFO: renamed from: b */
        void mo33895b(@NotNull DialogFragment dialogFragment);

        /* JADX INFO: renamed from: c */
        void mo54348c(@NotNull DialogFragment dialogFragment);

        /* JADX INFO: renamed from: d */
        void mo54349d(@NotNull DialogFragment dialogFragment);

        /* JADX INFO: renamed from: e */
        void mo4777e(@NotNull DialogFragment dialogFragment);

        /* JADX INFO: renamed from: f */
        void mo54350f(@NotNull DialogFragment dialogFragment);
    }

    /* JADX INFO: renamed from: com.kubi.resources.k$c */
    /* JADX INFO: compiled from: GlobalDialogManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\r"}, m90084d2 = {"Lcom/kubi/resources/GlobalDialogManager$SimpleDialogLifeCycleListener;", "Lcom/kubi/resources/GlobalDialogManager$OnDialogLifeCycleListener;", "<init>", "()V", "onCreate", "", "dialog", "Landroidx/fragment/app/DialogFragment;", "onResume", "onStart", "onPause", "onStop", "onDestroy", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static class c implements b {
        @Override // com.kubi.resources.GlobalDialogManager.b
        /* JADX INFO: renamed from: a */
        public void mo54347a(@NotNull DialogFragment dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
        }

        @Override // com.kubi.resources.GlobalDialogManager.b
        /* JADX INFO: renamed from: b */
        public void mo33895b(@NotNull DialogFragment dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
        }

        @Override // com.kubi.resources.GlobalDialogManager.b
        /* JADX INFO: renamed from: c */
        public void mo54348c(@NotNull DialogFragment dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
        }

        @Override // com.kubi.resources.GlobalDialogManager.b
        /* JADX INFO: renamed from: d */
        public void mo54349d(@NotNull DialogFragment dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
        }

        @Override // com.kubi.resources.GlobalDialogManager.b
        /* JADX INFO: renamed from: e */
        public void mo4777e(@NotNull DialogFragment dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
        }

        @Override // com.kubi.resources.GlobalDialogManager.b
        /* JADX INFO: renamed from: f */
        public void mo54350f(@NotNull DialogFragment dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m54336a(@NotNull a interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        CopyOnWriteArrayList<a> copyOnWriteArrayList = f43653c;
        if (copyOnWriteArrayList.contains(interceptor)) {
            return;
        }
        copyOnWriteArrayList.add(interceptor);
    }

    @MainThread
    /* JADX INFO: renamed from: b */
    public final boolean m54337b(@NotNull BaseDialogFragment dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        CopyOnWriteArrayList<a> copyOnWriteArrayList = f43653c;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).mo37536a(dialog)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m54338c(@NotNull DialogFragment dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Iterator<T> it = f43652b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).mo33895b(dialog);
        }
        f43654d++;
    }

    /* JADX INFO: renamed from: d */
    public final void m54339d(@NotNull DialogFragment dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Iterator<T> it = f43652b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).mo4777e(dialog);
        }
        f43654d--;
    }

    /* JADX INFO: renamed from: e */
    public final void m54340e(@NotNull DialogFragment dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Iterator<T> it = f43652b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).mo54349d(dialog);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m54341f(@NotNull DialogFragment dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Iterator<T> it = f43652b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).mo54347a(dialog);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m54342g(@NotNull DialogFragment dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Iterator<T> it = f43652b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).mo54350f(dialog);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m54343h(@NotNull DialogFragment dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Iterator<T> it = f43652b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).mo54348c(dialog);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m54344i() {
        return f43654d != 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m54345j(@NotNull b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        LinkedList<b> linkedList = f43652b;
        if (linkedList.contains(listener)) {
            return false;
        }
        return linkedList.add(listener);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m54346k(@NotNull b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return f43652b.remove(listener);
    }
}
