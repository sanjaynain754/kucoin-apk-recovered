package com.tencent.bugly.proguard;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentManager$FragmentLifecycleCallbacks;
import android.content.Context;
import android.view.View;
import androidx.annotation.RequiresApi;
import com.tencent.bugly.common.utils.AndroidVersion;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.q */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RequiresApi(api = 26)
public class FragmentManagerFragmentLifecycleCallbacksC33867q extends FragmentManager$FragmentLifecycleCallbacks implements InterfaceC33583c9 {

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArraySet<InterfaceC33562b9> f71509a;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.q$b */
    /* JADX INFO: compiled from: BUGLY */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final FragmentManagerFragmentLifecycleCallbacksC33867q f71510a = new FragmentManagerFragmentLifecycleCallbacksC33867q();
    }

    /* JADX INFO: renamed from: a */
    public static FragmentManagerFragmentLifecycleCallbacksC33867q m74633a() {
        return b.f71510a;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33583c9
    /* JADX INFO: renamed from: b */
    public void mo72661b(InterfaceC33562b9 interfaceC33562b9) {
        if (interfaceC33562b9 != null) {
            this.f71509a.add(interfaceC33562b9);
        }
    }

    public FragmentManagerFragmentLifecycleCallbacksC33867q() {
        this.f71509a = new CopyOnWriteArraySet<>();
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33583c9
    /* JADX INFO: renamed from: a */
    public void mo72658a(InterfaceC33562b9 interfaceC33562b9) {
        this.f71509a.remove(interfaceC33562b9);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33583c9
    /* JADX INFO: renamed from: b */
    public void mo72660b(Activity activity) {
        if (activity != null) {
            activity.getFragmentManager().registerFragmentLifecycleCallbacks(this, true);
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33583c9
    /* JADX INFO: renamed from: c */
    public void mo72662c(Activity activity) {
        if (activity != null) {
            activity.getFragmentManager().unregisterFragmentLifecycleCallbacks(this);
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33583c9
    /* JADX INFO: renamed from: a */
    public boolean mo72659a(Activity activity) {
        return AndroidVersion.isOverO();
    }

    public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentDestroyed(fragmentManager, fragment);
        Iterator<InterfaceC33562b9> it = this.f71509a.iterator();
        while (it.hasNext()) {
            it.next().onFragmentDestroyed(fragment);
        }
    }

    public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        super.onFragmentPreAttached(fragmentManager, fragment, context);
        Iterator<InterfaceC33562b9> it = this.f71509a.iterator();
        while (it.hasNext()) {
            it.next().onFragmentPreAttached(fragment);
        }
    }

    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentResumed(fragmentManager, fragment);
        Iterator<InterfaceC33562b9> it = this.f71509a.iterator();
        while (it.hasNext()) {
            it.next().onFragmentResumed(fragment);
        }
    }

    public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentViewDestroyed(fragmentManager, fragment);
        View view = fragment.getView();
        if (view != null) {
            Iterator<InterfaceC33562b9> it = this.f71509a.iterator();
            while (it.hasNext()) {
                it.next().onFragmentViewDestroyed(view);
            }
        }
    }
}
