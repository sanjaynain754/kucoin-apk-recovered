package p269fs;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.FragmentActivity;
import b80.InterfaceC4506b;
import com.kubi.kucoin.api.IMainActivity;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import java.util.concurrent.atomic.AtomicBoolean;
import ky.InterfaceC42005d;
import ms.C42610l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import vn.InterfaceC45608b;
import xb0.C46126b;

/* JADX INFO: renamed from: fs.a */
/* JADX INFO: compiled from: NoticeMainActivityLifecycle.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\f\u0010\u000e\u001a\u00020\b*\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/notice/lib/NoticeMainActivityLifecycle;", "Lcom/kubi/sdk/delegate/IActivityLifecycle;", "<init>", "()V", "isAddedListener", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRequestNotificationPermission", "onActivityPostCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityStarted", "requestNotificationPermission", "Landroidx/fragment/app/FragmentActivity;", "NoticeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37590a implements InterfaceC42005d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final AtomicBoolean f83583a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AtomicBoolean f83584b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final void m84765a(FragmentActivity fragmentActivity) {
        if (Build.VERSION.SDK_INT < 33 || NotificationManagerCompat.from(fragmentActivity).areNotificationsEnabled()) {
            return;
        }
        new C46126b(fragmentActivity).m101655n("android.permission.POST_NOTIFICATIONS").subscribe();
    }

    @Override // ky.InterfaceC42005d
    public void onActivityPostCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onActivityPostCreated(activity, savedInstanceState);
        if ((activity instanceof IMainActivity) && (activity instanceof BaseActivity) && !this.f83583a.getAndSet(true)) {
            MultiLanguageManager.f46805a.addOnLanguageChangeListener(C42610l.f94327a);
        }
    }

    @Override // ky.InterfaceC42005d
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onActivityStarted(activity);
        if (((activity instanceof IMainActivity) || (activity instanceof InterfaceC4506b) || (activity instanceof InterfaceC45608b)) && !this.f83584b.getAndSet(true) && (activity instanceof FragmentActivity)) {
            m84765a((FragmentActivity) activity);
        }
    }
}
