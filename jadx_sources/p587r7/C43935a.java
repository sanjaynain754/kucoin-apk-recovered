package p587r7;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.forter.mobile.fortersdk.C6502a;
import com.forter.mobile.fortersdk.C6514b;
import com.forter.mobile.fortersdk.EnumC6620w;
import com.forter.mobile.fortersdk.models.NavigationType;

/* JADX INFO: renamed from: r7.a */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 14)
public class C43935a implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        C6514b.m12151b().m12157e(EnumC6620w.ON_CREATED, activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        C6514b.m12151b().m12157e(EnumC6620w.ON_DESTROYED, activity, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        C6514b.m12151b().m12157e(EnumC6620w.ON_PAUSED, activity, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        C6514b.m12151b().m12157e(EnumC6620w.ON_RESUMED, activity, null);
        C6502a.m12060g().mo12064d(NavigationType.APP, activity.getClass().getName(), null, null, "GENERIC_LS_TRACK");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        C6514b.m12151b().m12157e(EnumC6620w.ON_SAVE_INSTANCE_STATE, activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        C6514b.m12151b().m12157e(EnumC6620w.ON_STARTED, activity, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        C6514b.m12151b().m12157e(EnumC6620w.ON_STOPPED, activity, null);
    }
}
