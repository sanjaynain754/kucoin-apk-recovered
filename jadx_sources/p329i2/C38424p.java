package p329i2;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C5310d;
import com.bumptech.glide.C5312f;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.bumptech.glide.ComponentCallbacks2C5314h;
import com.bumptech.glide.manager.RequestManagerFragment;
import com.bumptech.glide.manager.SupportRequestManagerFragment;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p048c2.C4805v;
import p523p2.C43363j;
import p523p2.C43364k;

/* JADX INFO: renamed from: i2.p */
/* JADX INFO: compiled from: RequestManagerRetriever.java */
/* JADX INFO: loaded from: classes.dex */
public class C38424p implements Handler.Callback {

    /* JADX INFO: renamed from: k */
    public static final b f86209k = new a();

    /* JADX INFO: renamed from: b */
    public volatile ComponentCallbacks2C5314h f86210b;

    /* JADX INFO: renamed from: e */
    public final Handler f86213e;

    /* JADX INFO: renamed from: f */
    public final b f86214f;

    /* JADX INFO: renamed from: j */
    public final InterfaceC38419k f86218j;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public final Map<FragmentManager, RequestManagerFragment> f86211c = new HashMap();

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public final Map<androidx.fragment.app.FragmentManager, SupportRequestManagerFragment> f86212d = new HashMap();

    /* JADX INFO: renamed from: g */
    public final ArrayMap<View, Fragment> f86215g = new ArrayMap<>();

    /* JADX INFO: renamed from: h */
    public final ArrayMap<View, android.app.Fragment> f86216h = new ArrayMap<>();

    /* JADX INFO: renamed from: i */
    public final Bundle f86217i = new Bundle();

    /* JADX INFO: renamed from: i2.p$a */
    /* JADX INFO: compiled from: RequestManagerRetriever.java */
    public class a implements b {
        @Override // p329i2.C38424p.b
        @NonNull
        /* JADX INFO: renamed from: a */
        public ComponentCallbacks2C5314h mo6548a(@NonNull ComponentCallbacks2C5309c componentCallbacks2C5309c, @NonNull InterfaceC38420l interfaceC38420l, @NonNull InterfaceC38425q interfaceC38425q, @NonNull Context context) {
            return new ComponentCallbacks2C5314h(componentCallbacks2C5309c, interfaceC38420l, interfaceC38425q, context);
        }
    }

    /* JADX INFO: renamed from: i2.p$b */
    /* JADX INFO: compiled from: RequestManagerRetriever.java */
    public interface b {
        @NonNull
        /* JADX INFO: renamed from: a */
        ComponentCallbacks2C5314h mo6548a(@NonNull ComponentCallbacks2C5309c componentCallbacks2C5309c, @NonNull InterfaceC38420l interfaceC38420l, @NonNull InterfaceC38425q interfaceC38425q, @NonNull Context context);
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public final void m86619e(@NonNull FragmentManager fragmentManager, @NonNull ArrayMap<View, android.app.Fragment> arrayMap) {
        android.app.Fragment fragment;
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            this.f86217i.putInt("key", i11);
            try {
                fragment = fragmentManager.getFragment(this.f86217i, "key");
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                arrayMap.put(fragment.getView(), fragment);
                m86618d(fragment.getChildFragmentManager(), arrayMap);
            }
            i11 = i12;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public SupportRequestManagerFragment m86632s(androidx.fragment.app.FragmentManager fragmentManager) {
        return m86633t(fragmentManager, null);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC38419k m86614b(C5312f c5312f) {
        if (C4805v.f4819h && C4805v.f4818g) {
            return c5312f.m6587a(C5310d.e.class) ? new ComponentCallbacks2C38417i() : new C38418j();
        }
        return new C38415g();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static Activity m86615c(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m86615c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m86616f(@Nullable Collection<Fragment> collection, @NonNull Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                m86616f(fragment.getChildFragmentManager().getFragments(), map);
            }
        }
    }

    @TargetApi(26)
    @Deprecated
    /* JADX INFO: renamed from: d */
    public final void m86618d(@NonNull FragmentManager fragmentManager, @NonNull ArrayMap<View, android.app.Fragment> arrayMap) {
        if (Build.VERSION.SDK_INT < 26) {
            m86619e(fragmentManager, arrayMap);
            return;
        }
        for (android.app.Fragment fragment : fragmentManager.getFragments()) {
            if (fragment.getView() != null) {
                arrayMap.put(fragment.getView(), fragment);
                m86618d(fragment.getChildFragmentManager(), arrayMap);
            }
        }
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: g */
    public final android.app.Fragment m86620g(@NonNull View view, @NonNull Activity activity) {
        this.f86216h.clear();
        m86618d(activity.getFragmentManager(), this.f86216h);
        View viewFindViewById = activity.findViewById(R.id.content);
        android.app.Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.f86216h.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f86216h.clear();
        return fragment;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final Fragment m86621h(@NonNull View view, @NonNull FragmentActivity fragmentActivity) {
        this.f86215g.clear();
        m86616f(fragmentActivity.getSupportFragmentManager().getFragments(), this.f86215g);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.f86215g.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f86215g.clear();
        return fragment;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        ComponentCallbacks componentCallbacksRemove;
        Object obj2;
        ComponentCallbacks componentCallbacks;
        int i11 = message.what;
        boolean z11 = true;
        if (i11 != 1) {
            if (i11 != 2) {
                componentCallbacks = null;
                z11 = false;
                obj2 = null;
            } else {
                obj = (androidx.fragment.app.FragmentManager) message.obj;
                componentCallbacksRemove = this.f86212d.remove(obj);
            }
            if (z11 && componentCallbacks == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z11;
        }
        obj = (FragmentManager) message.obj;
        componentCallbacksRemove = this.f86211c.remove(obj);
        ComponentCallbacks componentCallbacks2 = componentCallbacksRemove;
        obj2 = obj;
        componentCallbacks = componentCallbacks2;
        if (z11) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z11;
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public ComponentCallbacks2C5314h m86625l(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (C43364k.m95526s() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return m86628o((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                return m86623j((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m86625l(contextWrapper.getBaseContext());
                }
            }
        }
        return m86629p(context);
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public final ComponentCallbacks2C5314h m86629p(@NonNull Context context) {
        if (this.f86210b == null) {
            synchronized (this) {
                try {
                    if (this.f86210b == null) {
                        this.f86210b = this.f86214f.mo6548a(ComponentCallbacks2C5309c.m6550c(context.getApplicationContext()), new C38410b(), new C38416h(), context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f86210b;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public final RequestManagerFragment m86631r(@NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment) {
        RequestManagerFragment requestManagerFragment = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment != null) {
            return requestManagerFragment;
        }
        RequestManagerFragment requestManagerFragment2 = this.f86211c.get(fragmentManager);
        if (requestManagerFragment2 != null) {
            return requestManagerFragment2;
        }
        RequestManagerFragment requestManagerFragment3 = new RequestManagerFragment();
        requestManagerFragment3.m6911j(fragment);
        this.f86211c.put(fragmentManager, requestManagerFragment3);
        fragmentManager.beginTransaction().add(requestManagerFragment3, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.f86213e.obtainMessage(1, fragmentManager).sendToTarget();
        return requestManagerFragment3;
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public final SupportRequestManagerFragment m86633t(@NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment) {
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (supportRequestManagerFragment != null) {
            return supportRequestManagerFragment;
        }
        SupportRequestManagerFragment supportRequestManagerFragment2 = this.f86212d.get(fragmentManager);
        if (supportRequestManagerFragment2 != null) {
            return supportRequestManagerFragment2;
        }
        SupportRequestManagerFragment supportRequestManagerFragment3 = new SupportRequestManagerFragment();
        supportRequestManagerFragment3.m6925n3(fragment);
        this.f86212d.put(fragmentManager, supportRequestManagerFragment3);
        fragmentManager.beginTransaction().add(supportRequestManagerFragment3, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.f86213e.obtainMessage(2, fragmentManager).sendToTarget();
        return supportRequestManagerFragment3;
    }

    public C38424p(@Nullable b bVar, C5312f c5312f) {
        this.f86214f = bVar == null ? f86209k : bVar;
        this.f86213e = new Handler(Looper.getMainLooper(), this);
        this.f86218j = m86614b(c5312f);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: a */
    public static void m86613a(@NonNull Activity activity) {
        if (!activity.isDestroyed()) {
        } else {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* JADX INFO: renamed from: u */
    public static boolean m86617u(Context context) {
        Activity activityM86615c = m86615c(context);
        if (activityM86615c != null && activityM86615c.isFinishing()) {
            return false;
        }
        return true;
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: i */
    public final ComponentCallbacks2C5314h m86622i(@NonNull Context context, @NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z11) {
        RequestManagerFragment requestManagerFragmentM86631r = m86631r(fragmentManager, fragment);
        ComponentCallbacks2C5314h componentCallbacks2C5314hM6906e = requestManagerFragmentM86631r.m6906e();
        if (componentCallbacks2C5314hM6906e == null) {
            ComponentCallbacks2C5314h componentCallbacks2C5314hMo6548a = this.f86214f.mo6548a(ComponentCallbacks2C5309c.m6550c(context), requestManagerFragmentM86631r.m6904c(), requestManagerFragmentM86631r.m6907f(), context);
            if (z11) {
                componentCallbacks2C5314hMo6548a.onStart();
            }
            requestManagerFragmentM86631r.m6912k(componentCallbacks2C5314hMo6548a);
            return componentCallbacks2C5314hMo6548a;
        }
        return componentCallbacks2C5314hM6906e;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public ComponentCallbacks2C5314h m86623j(@NonNull Activity activity) {
        if (C43364k.m95525r()) {
            return m86625l(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return m86628o((FragmentActivity) activity);
        }
        m86613a(activity);
        this.f86218j.mo86611a(activity);
        return m86622i(activity, activity.getFragmentManager(), null, m86617u(activity));
    }

    @NonNull
    @TargetApi(17)
    @Deprecated
    /* JADX INFO: renamed from: k */
    public ComponentCallbacks2C5314h m86624k(@NonNull android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            if (!C43364k.m95525r()) {
                if (fragment.getActivity() != null) {
                    this.f86218j.mo86611a(fragment.getActivity());
                }
                return m86622i(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
            }
            return m86625l(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public ComponentCallbacks2C5314h m86626m(@NonNull View view) {
        if (C43364k.m95525r()) {
            return m86625l(view.getContext().getApplicationContext());
        }
        C43363j.m95506d(view);
        C43363j.m95507e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityM86615c = m86615c(view.getContext());
        if (activityM86615c == null) {
            return m86625l(view.getContext().getApplicationContext());
        }
        if (activityM86615c instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activityM86615c;
            Fragment fragmentM86621h = m86621h(view, fragmentActivity);
            if (fragmentM86621h != null) {
                return m86627n(fragmentM86621h);
            }
            return m86628o(fragmentActivity);
        }
        android.app.Fragment fragmentM86620g = m86620g(view, activityM86615c);
        if (fragmentM86620g == null) {
            return m86623j(activityM86615c);
        }
        return m86624k(fragmentM86620g);
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public ComponentCallbacks2C5314h m86627n(@NonNull Fragment fragment) {
        C43363j.m95507e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (C43364k.m95525r()) {
            return m86625l(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f86218j.mo86611a(fragment.getActivity());
        }
        return m86634v(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public ComponentCallbacks2C5314h m86628o(@NonNull FragmentActivity fragmentActivity) {
        if (C43364k.m95525r()) {
            return m86625l(fragmentActivity.getApplicationContext());
        }
        m86613a(fragmentActivity);
        this.f86218j.mo86611a(fragmentActivity);
        return m86634v(fragmentActivity, fragmentActivity.getSupportFragmentManager(), null, m86617u(fragmentActivity));
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: q */
    public RequestManagerFragment m86630q(Activity activity) {
        return m86631r(activity.getFragmentManager(), null);
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public final ComponentCallbacks2C5314h m86634v(@NonNull Context context, @NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z11) {
        SupportRequestManagerFragment supportRequestManagerFragmentM86633t = m86633t(fragmentManager, fragment);
        ComponentCallbacks2C5314h componentCallbacks2C5314hM6920h3 = supportRequestManagerFragmentM86633t.m6920h3();
        if (componentCallbacks2C5314hM6920h3 == null) {
            ComponentCallbacks2C5314h componentCallbacks2C5314hMo6548a = this.f86214f.mo6548a(ComponentCallbacks2C5309c.m6550c(context), supportRequestManagerFragmentM86633t.m6918f3(), supportRequestManagerFragmentM86633t.m6921i3(), context);
            if (z11) {
                componentCallbacks2C5314hMo6548a.onStart();
            }
            supportRequestManagerFragmentM86633t.m6926o3(componentCallbacks2C5314hMo6548a);
            return componentCallbacks2C5314hMo6548a;
        }
        return componentCallbacks2C5314hM6920h3;
    }
}
