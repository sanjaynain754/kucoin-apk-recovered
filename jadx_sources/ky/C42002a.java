package ky;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ky.a */
/* JADX INFO: compiled from: ActivityDelegate.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/delegate/ActivityDelegate;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "fragmentDelegate", "Lcom/kubi/sdk/delegate/FragmentDelegate;", "injectActivityList", "", "Lcom/kubi/sdk/delegate/IActivityLifecycle;", "<init>", "(Lcom/kubi/sdk/delegate/FragmentDelegate;Ljava/util/List;)V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityPostCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivitySaveInstanceState", "outState", "onActivityStopped", "onActivityDestroyed", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nActivityDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityDelegate.kt\ncom/kubi/sdk/delegate/ActivityDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1869#2,2:77\n1869#2,2:79\n1869#2,2:81\n1869#2,2:83\n1869#2,2:85\n1869#2,2:87\n1869#2,2:89\n1869#2,2:91\n*S KotlinDebug\n*F\n+ 1 ActivityDelegate.kt\ncom/kubi/sdk/delegate/ActivityDelegate\n*L\n19#1:77,2\n32#1:79,2\n38#1:81,2\n44#1:83,2\n50#1:85,2\n57#1:87,2\n63#1:89,2\n70#1:91,2\n*E\n"})
public final class C42002a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final C42004c f92201b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<InterfaceC42005d> f92202c;

    /* JADX WARN: Multi-variable type inference failed */
    public C42002a(@NotNull C42004c fragmentDelegate, @NotNull List<? extends InterfaceC42005d> injectActivityList) {
        Intrinsics.checkNotNullParameter(fragmentDelegate, "fragmentDelegate");
        Intrinsics.checkNotNullParameter(injectActivityList, "injectActivityList");
        this.f92201b = fragmentDelegate;
        this.f92202c = injectActivityList;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator<T> it = this.f92202c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42005d) it.next()).onActivityCreated(activity, savedInstanceState);
        }
        if (activity instanceof FragmentActivity) {
            ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.f92201b, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator<T> it = this.f92202c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42005d) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator<T> it = this.f92202c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42005d) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator<T> it = this.f92202c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42005d) it.next()).onActivityPostCreated(activity, savedInstanceState);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator<T> it = this.f92202c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42005d) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
        Iterator<T> it = this.f92202c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42005d) it.next()).onActivitySaveInstanceState(activity, outState);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator<T> it = this.f92202c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42005d) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator<T> it = this.f92202c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42005d) it.next()).onActivityStopped(activity);
        }
    }
}
