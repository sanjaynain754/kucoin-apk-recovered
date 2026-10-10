package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.bumptech.glide.ComponentCallbacks2C5314h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p329i2.C38409a;
import p329i2.InterfaceC38425q;

/* JADX INFO: loaded from: classes.dex */
public class SupportRequestManagerFragment extends Fragment {

    /* JADX INFO: renamed from: U */
    public final C38409a f7017U;

    /* JADX INFO: renamed from: V */
    public final InterfaceC38425q f7018V;

    /* JADX INFO: renamed from: W */
    public final Set<SupportRequestManagerFragment> f7019W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public SupportRequestManagerFragment f7020X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public ComponentCallbacks2C5314h f7021Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public Fragment f7022Z;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.SupportRequestManagerFragment$a */
    public class C5372a implements InterfaceC38425q {
        public C5372a() {
        }

        @Override // p329i2.InterfaceC38425q
        @NonNull
        /* JADX INFO: renamed from: a */
        public Set<ComponentCallbacks2C5314h> mo6914a() {
            Set<SupportRequestManagerFragment> setM6917e3 = SupportRequestManagerFragment.this.m6917e3();
            HashSet hashSet = new HashSet(setM6917e3.size());
            for (SupportRequestManagerFragment supportRequestManagerFragment : setM6917e3) {
                if (supportRequestManagerFragment.m6920h3() != null) {
                    hashSet.add(supportRequestManagerFragment.m6920h3());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + SupportRequestManagerFragment.this + "}";
        }
    }

    public SupportRequestManagerFragment() {
        this(new C38409a());
    }

    @SuppressLint({"ValidFragment"})
    @VisibleForTesting
    public SupportRequestManagerFragment(@NonNull C38409a c38409a) {
        this.f7018V = new C5372a();
        this.f7019W = new HashSet();
        this.f7017U = c38409a;
    }

    /* JADX INFO: renamed from: d3 */
    public final void m6916d3(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f7019W.add(supportRequestManagerFragment);
    }

    @NonNull
    /* JADX INFO: renamed from: e3 */
    public Set<SupportRequestManagerFragment> m6917e3() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f7020X;
        if (supportRequestManagerFragment == null) {
            return Collections.EMPTY_SET;
        }
        if (equals(supportRequestManagerFragment)) {
            return Collections.unmodifiableSet(this.f7019W);
        }
        HashSet hashSet = new HashSet();
        for (SupportRequestManagerFragment supportRequestManagerFragment2 : this.f7020X.m6917e3()) {
            if (m6922k3(supportRequestManagerFragment2.m6919g3())) {
                hashSet.add(supportRequestManagerFragment2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @NonNull
    /* JADX INFO: renamed from: f3 */
    public C38409a m6918f3() {
        return this.f7017U;
    }

    @Nullable
    /* JADX INFO: renamed from: h3 */
    public ComponentCallbacks2C5314h m6920h3() {
        return this.f7021Y;
    }

    @NonNull
    /* JADX INFO: renamed from: i3 */
    public InterfaceC38425q m6921i3() {
        return this.f7018V;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m6924m3(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f7019W.remove(supportRequestManagerFragment);
    }

    /* JADX INFO: renamed from: n3 */
    public void m6925n3(@Nullable Fragment fragment) {
        FragmentManager fragmentManagerM6915j3;
        this.f7022Z = fragment;
        if (fragment == null || fragment.getContext() == null || (fragmentManagerM6915j3 = m6915j3(fragment)) == null) {
            return;
        }
        m6923l3(fragment.getContext(), fragmentManagerM6915j3);
    }

    /* JADX INFO: renamed from: o3 */
    public void m6926o3(@Nullable ComponentCallbacks2C5314h componentCallbacks2C5314h) {
        this.f7021Y = componentCallbacks2C5314h;
    }

    /* JADX INFO: renamed from: p3 */
    public final void m6927p3() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f7020X;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.m6924m3(this);
            this.f7020X = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m6919g3() + "}";
    }

    @Nullable
    /* JADX INFO: renamed from: j3 */
    public static FragmentManager m6915j3(@NonNull Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    @Nullable
    /* JADX INFO: renamed from: g3 */
    public final Fragment m6919g3() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return this.f7022Z;
    }

    /* JADX INFO: renamed from: k3 */
    public final boolean m6922k3(@NonNull Fragment fragment) {
        Fragment fragmentM6919g3 = m6919g3();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment != null) {
                if (parentFragment.equals(fragmentM6919g3)) {
                    return true;
                }
                fragment = fragment.getParentFragment();
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: l3 */
    public final void m6923l3(@NonNull Context context, @NonNull FragmentManager fragmentManager) {
        m6927p3();
        SupportRequestManagerFragment supportRequestManagerFragmentM86632s = ComponentCallbacks2C5309c.m6550c(context).m6567k().m86632s(fragmentManager);
        this.f7020X = supportRequestManagerFragmentM86632s;
        if (!equals(supportRequestManagerFragmentM86632s)) {
            this.f7020X.m6916d3(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager fragmentManagerM6915j3 = m6915j3(this);
        if (fragmentManagerM6915j3 == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                m6923l3(getContext(), fragmentManagerM6915j3);
            } catch (IllegalStateException e11) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e11);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f7017U.m86604c();
        m6927p3();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f7022Z = null;
        m6927p3();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f7017U.m86605d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f7017U.m86606e();
    }
}
