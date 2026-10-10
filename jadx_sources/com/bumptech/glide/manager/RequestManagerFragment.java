package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.bumptech.glide.ComponentCallbacks2C5314h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p329i2.C38409a;
import p329i2.InterfaceC38425q;

/* JADX INFO: loaded from: classes34.dex */
@Deprecated
public class RequestManagerFragment extends Fragment {

    /* JADX INFO: renamed from: b */
    public final C38409a f7010b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC38425q f7011c;

    /* JADX INFO: renamed from: d */
    public final Set<RequestManagerFragment> f7012d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public ComponentCallbacks2C5314h f7013e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public RequestManagerFragment f7014f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Fragment f7015g;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.RequestManagerFragment$a */
    public class C5371a implements InterfaceC38425q {
        public C5371a() {
        }

        @Override // p329i2.InterfaceC38425q
        @NonNull
        /* JADX INFO: renamed from: a */
        public Set<ComponentCallbacks2C5314h> mo6914a() {
            Set<RequestManagerFragment> setM6903b = RequestManagerFragment.this.m6903b();
            HashSet hashSet = new HashSet(setM6903b.size());
            for (RequestManagerFragment requestManagerFragment : setM6903b) {
                if (requestManagerFragment.m6906e() != null) {
                    hashSet.add(requestManagerFragment.m6906e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + RequestManagerFragment.this + "}";
        }
    }

    public RequestManagerFragment() {
        this(new C38409a());
    }

    @SuppressLint({"ValidFragment"})
    @VisibleForTesting
    public RequestManagerFragment(@NonNull C38409a c38409a) {
        this.f7011c = new C5371a();
        this.f7012d = new HashSet();
        this.f7010b = c38409a;
    }

    /* JADX INFO: renamed from: a */
    public final void m6902a(RequestManagerFragment requestManagerFragment) {
        this.f7012d.add(requestManagerFragment);
    }

    @NonNull
    @TargetApi(17)
    /* JADX INFO: renamed from: b */
    public Set<RequestManagerFragment> m6903b() {
        if (equals(this.f7014f)) {
            return Collections.unmodifiableSet(this.f7012d);
        }
        if (this.f7014f == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        for (RequestManagerFragment requestManagerFragment : this.f7014f.m6903b()) {
            if (m6908g(requestManagerFragment.getParentFragment())) {
                hashSet.add(requestManagerFragment);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public C38409a m6904c() {
        return this.f7010b;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public ComponentCallbacks2C5314h m6906e() {
        return this.f7013e;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public InterfaceC38425q m6907f() {
        return this.f7011c;
    }

    /* JADX INFO: renamed from: i */
    public final void m6910i(RequestManagerFragment requestManagerFragment) {
        this.f7012d.remove(requestManagerFragment);
    }

    /* JADX INFO: renamed from: j */
    public void m6911j(@Nullable Fragment fragment) {
        this.f7015g = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        m6909h(fragment.getActivity());
    }

    /* JADX INFO: renamed from: k */
    public void m6912k(@Nullable ComponentCallbacks2C5314h componentCallbacks2C5314h) {
        this.f7013e = componentCallbacks2C5314h;
    }

    /* JADX INFO: renamed from: l */
    public final void m6913l() {
        RequestManagerFragment requestManagerFragment = this.f7014f;
        if (requestManagerFragment != null) {
            requestManagerFragment.m6910i(this);
            this.f7014f = null;
        }
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m6905d() + "}";
    }

    @Nullable
    @TargetApi(17)
    /* JADX INFO: renamed from: d */
    public final Fragment m6905d() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return this.f7015g;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: g */
    public final boolean m6908g(@NonNull Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 != null) {
                if (parentFragment2.equals(parentFragment)) {
                    return true;
                }
                fragment = fragment.getParentFragment();
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6909h(@NonNull Activity activity) {
        m6913l();
        RequestManagerFragment requestManagerFragmentM86630q = ComponentCallbacks2C5309c.m6550c(activity).m6567k().m86630q(activity);
        this.f7014f = requestManagerFragmentM86630q;
        if (!equals(requestManagerFragmentM86630q)) {
            this.f7014f.m6902a(this);
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m6909h(activity);
        } catch (IllegalStateException e11) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e11);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f7010b.m86604c();
        m6913l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        m6913l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f7010b.m86605d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f7010b.m86606e();
    }
}
