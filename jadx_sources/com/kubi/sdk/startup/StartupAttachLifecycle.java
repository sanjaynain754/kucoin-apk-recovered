package com.kubi.sdk.startup;

import android.app.Activity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: StartupAttachLifecycle.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bH\u0002¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupAttachLifecycle;", "", "()V", "attachLifecycleCallbacks", "Ljava/util/ArrayList;", "Lcom/kubi/sdk/startup/StartupAttachLifecycle$IAttachLifecycleCallbacks;", "Lkotlin/collections/ArrayList;", "collectAttachLifecycleCallbacks", "", "()[Lcom/kubi/sdk/startup/StartupAttachLifecycle$IAttachLifecycleCallbacks;", "dispatchActivityAttach", "", "activity", "Landroid/app/Activity;", "registerAttachLifecycleCallbacks", TUIConstants.TUIChat.CALL_BACK, "registerAttachLifecycleCallbacks$Startup_release", "unregisterAttachLifecycleCallbacks", "unregisterAttachLifecycleCallbacks$Startup_release", "IAttachLifecycleCallbacks", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStartupAttachLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupAttachLifecycle.kt\ncom/kubi/sdk/startup/StartupAttachLifecycle\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n13579#2,2:47\n37#3,2:49\n1#4:51\n*S KotlinDebug\n*F\n+ 1 StartupAttachLifecycle.kt\ncom/kubi/sdk/startup/StartupAttachLifecycle\n*L\n15#1:47,2\n23#1:49,2\n*E\n"})
public final class StartupAttachLifecycle {

    @NotNull
    public static final StartupAttachLifecycle INSTANCE = new StartupAttachLifecycle();

    @NotNull
    private static final ArrayList<IAttachLifecycleCallbacks> attachLifecycleCallbacks = new ArrayList<>();

    /* JADX INFO: compiled from: StartupAttachLifecycle.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupAttachLifecycle$IAttachLifecycleCallbacks;", "", "onActivityAttach", "", "activity", "Landroid/app/Activity;", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface IAttachLifecycleCallbacks {
        void onActivityAttach(@NotNull Activity activity);
    }

    private final IAttachLifecycleCallbacks[] collectAttachLifecycleCallbacks() {
        ArrayList<IAttachLifecycleCallbacks> arrayList = attachLifecycleCallbacks;
        synchronized (arrayList) {
            if (arrayList.size() > 0) {
                return (IAttachLifecycleCallbacks[]) arrayList.toArray(new IAttachLifecycleCallbacks[0]);
            }
            Unit unit = Unit.INSTANCE;
            return null;
        }
    }

    public final void dispatchActivityAttach(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IAttachLifecycleCallbacks[] iAttachLifecycleCallbacksArrCollectAttachLifecycleCallbacks = collectAttachLifecycleCallbacks();
        if (iAttachLifecycleCallbacksArrCollectAttachLifecycleCallbacks != null) {
            for (IAttachLifecycleCallbacks iAttachLifecycleCallbacks : iAttachLifecycleCallbacksArrCollectAttachLifecycleCallbacks) {
                iAttachLifecycleCallbacks.onActivityAttach(activity);
            }
        }
    }

    public final void registerAttachLifecycleCallbacks$Startup_release(@NotNull IAttachLifecycleCallbacks callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList<IAttachLifecycleCallbacks> arrayList = attachLifecycleCallbacks;
        synchronized (arrayList) {
            arrayList.add(callback);
        }
    }

    public final void unregisterAttachLifecycleCallbacks$Startup_release(@NotNull IAttachLifecycleCallbacks callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList<IAttachLifecycleCallbacks> arrayList = attachLifecycleCallbacks;
        synchronized (arrayList) {
            arrayList.remove(callback);
        }
    }

    private StartupAttachLifecycle() {
    }
}
