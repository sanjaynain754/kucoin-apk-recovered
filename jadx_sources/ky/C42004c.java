package ky;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ky.c */
/* JADX INFO: compiled from: FragmentDelegate.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\"\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/sdk/delegate/FragmentDelegate;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "injectFragmentList", "", "Lcom/kubi/sdk/delegate/IFragmentLifecycle;", "<init>", "(Ljava/util/List;)V", "onFragmentViewCreated", "", "fm", "Landroidx/fragment/app/FragmentManager;", "f", "Landroidx/fragment/app/Fragment;", "v", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentStopped", "onFragmentCreated", "onFragmentResumed", "onFragmentAttached", "context", "Landroid/content/Context;", "onFragmentPreAttached", "onFragmentDestroyed", "onFragmentSaveInstanceState", "outState", "onFragmentStarted", "onFragmentViewDestroyed", "onFragmentPreCreated", "onFragmentActivityCreated", "onFragmentPaused", "onFragmentDetached", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFragmentDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentDelegate.kt\ncom/kubi/sdk/delegate/FragmentDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1869#2,2:135\n1869#2,2:137\n1869#2,2:139\n1869#2,2:141\n1869#2,2:143\n1869#2,2:145\n1869#2,2:147\n1869#2,2:149\n1869#2,2:151\n1869#2,2:153\n1869#2,2:155\n1869#2,2:157\n*S KotlinDebug\n*F\n+ 1 FragmentDelegate.kt\ncom/kubi/sdk/delegate/FragmentDelegate\n*L\n26#1:135,2\n34#1:137,2\n42#1:139,2\n50#1:141,2\n58#1:143,2\n70#1:145,2\n78#1:147,2\n86#1:149,2\n94#1:151,2\n114#1:153,2\n122#1:155,2\n130#1:157,2\n*E\n"})
public final class C42004c extends FragmentManager.FragmentLifecycleCallbacks {

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<InterfaceC42006e> f92208c;

    /* JADX WARN: Multi-variable type inference failed */
    public C42004c(@NotNull List<? extends InterfaceC42006e> injectFragmentList) {
        Intrinsics.checkNotNullParameter(injectFragmentList, "injectFragmentList");
        this.f92208c = injectFragmentList;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentActivityCreated(@NotNull FragmentManager fm2, @NotNull Fragment f11, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
        super.onFragmentActivityCreated(fm2, f11, savedInstanceState);
        Iterator<T> it = this.f92208c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42006e) it.next()).m92088g(fm2, f11, savedInstanceState);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentAttached(@NotNull FragmentManager fm2, @NotNull Fragment f11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
        Intrinsics.checkNotNullParameter(context, "context");
        super.onFragmentAttached(fm2, f11, context);
        Iterator<T> it = this.f92208c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42006e) it.next()).m92087f(fm2, f11, context);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentCreated(@NotNull FragmentManager fm2, @NotNull Fragment f11, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
        super.onFragmentCreated(fm2, f11, savedInstanceState);
        Iterator<T> it = this.f92208c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42006e) it.next()).m92085d(fm2, f11, savedInstanceState);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDestroyed(@NotNull FragmentManager fm2, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
        super.onFragmentDestroyed(fm2, f11);
        Iterator<T> it = this.f92208c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42006e) it.next()).m92093l(fm2, f11);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDetached(@NotNull FragmentManager fm2, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
        super.onFragmentDetached(fm2, f11);
        Iterator<T> it = this.f92208c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42006e) it.next()).m92092k(fm2, f11);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(@NotNull FragmentManager fm2, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
        super.onFragmentPaused(fm2, f11);
        Iterator<T> it = this.f92208c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42006e) it.next()).m92084c(fm2, f11);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPreAttached(@NotNull FragmentManager fm2, @NotNull Fragment f11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
        Intrinsics.checkNotNullParameter(context, "context");
        super.onFragmentPreAttached(fm2, f11, context);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPreCreated(@NotNull FragmentManager fm2, @NotNull Fragment f11, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
        super.onFragmentPreCreated(fm2, f11, savedInstanceState);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(@NotNull FragmentManager fm2, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
        super.onFragmentResumed(fm2, f11);
        Iterator<T> it = this.f92208c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42006e) it.next()).m92086e(fm2, f11);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentSaveInstanceState(@NotNull FragmentManager fm2, @NotNull Fragment f11, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onFragmentSaveInstanceState(fm2, f11, outState);
        Iterator<T> it = this.f92208c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42006e) it.next()).m92082a(fm2, f11, outState);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStarted(@NotNull FragmentManager fm2, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
        super.onFragmentStarted(fm2, f11);
        Iterator<T> it = this.f92208c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42006e) it.next()).m92089h(fm2, f11);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStopped(@NotNull FragmentManager fm2, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
        super.onFragmentStopped(fm2, f11);
        Iterator<T> it = this.f92208c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42006e) it.next()).m92083b(fm2, f11);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewCreated(@NotNull FragmentManager fm2, @NotNull Fragment f11, @NotNull View v11, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
        Intrinsics.checkNotNullParameter(v11, "v");
        super.onFragmentViewCreated(fm2, f11, v11, savedInstanceState);
        Iterator<T> it = this.f92208c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42006e) it.next()).m92090i(fm2, f11, v11, savedInstanceState);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewDestroyed(@NotNull FragmentManager fm2, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(f11, "f");
        super.onFragmentViewDestroyed(fm2, f11);
        Iterator<T> it = this.f92208c.iterator();
        while (it.hasNext()) {
            ((InterfaceC42006e) it.next()).m92091j(fm2, f11);
        }
    }
}
