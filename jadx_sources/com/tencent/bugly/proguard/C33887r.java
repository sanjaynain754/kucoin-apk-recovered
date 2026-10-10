package com.tencent.bugly.proguard;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.tencent.bugly.common.util.ClassUtil;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.r */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33887r extends FragmentManager.FragmentLifecycleCallbacks implements InterfaceC33583c9 {

    /* JADX INFO: renamed from: b */
    public static final String f71579b = "androidx.fragment.app.FragmentActivity";

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArraySet<InterfaceC33562b9> f71580a;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.r$b */
    /* JADX INFO: compiled from: BUGLY */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C33887r f71581a = new C33887r();
    }

    /* JADX INFO: renamed from: a */
    public static C33887r m74704a() {
        return b.f71581a;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33583c9
    /* JADX INFO: renamed from: b */
    public void mo72661b(InterfaceC33562b9 interfaceC33562b9) {
        if (interfaceC33562b9 != null) {
            this.f71580a.add(interfaceC33562b9);
        }
    }

    public C33887r() {
        this.f71580a = new CopyOnWriteArraySet<>();
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33583c9
    /* JADX INFO: renamed from: a */
    public void mo72658a(InterfaceC33562b9 interfaceC33562b9) {
        this.f71580a.remove(interfaceC33562b9);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33583c9
    /* JADX INFO: renamed from: b */
    public void mo72660b(Activity activity) {
        if (activity instanceof FragmentActivity) {
            ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(this, true);
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33583c9
    /* JADX INFO: renamed from: c */
    public void mo72662c(Activity activity) {
        if (activity instanceof FragmentActivity) {
            ((FragmentActivity) activity).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this);
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33583c9
    /* JADX INFO: renamed from: a */
    public boolean mo72659a(Activity activity) {
        return ClassUtil.objectIsInstanceClass(activity, "androidx.fragment.app.FragmentActivity");
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentDestroyed(fragmentManager, fragment);
        Iterator<InterfaceC33562b9> it = this.f71580a.iterator();
        while (it.hasNext()) {
            it.next().onFragmentDestroyed(fragment);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        super.onFragmentPreAttached(fragmentManager, fragment, context);
        Iterator<InterfaceC33562b9> it = this.f71580a.iterator();
        while (it.hasNext()) {
            it.next().onFragmentPreAttached(fragment);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentResumed(fragmentManager, fragment);
        Iterator<InterfaceC33562b9> it = this.f71580a.iterator();
        while (it.hasNext()) {
            it.next().onFragmentResumed(fragment);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentViewDestroyed(fragmentManager, fragment);
        View view = fragment.getView();
        if (view != null) {
            Iterator<InterfaceC33562b9> it = this.f71580a.iterator();
            while (it.hasNext()) {
                it.next().onFragmentViewDestroyed(view);
            }
        }
    }
}
