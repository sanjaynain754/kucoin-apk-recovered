package ky;

import android.app.Application;
import android.content.Context;
import androidx.media3.common.MimeTypes;
import com.kubi.sdk.startup.StartupDispatcher;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ky.b */
/* JADX INFO: compiled from: AppDelegate.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/delegate/AppDelegate;", "", "<init>", "()V", "injectActivityList", "", "Lcom/kubi/sdk/delegate/IActivityLifecycle;", "injectFragmentList", "Lcom/kubi/sdk/delegate/IFragmentLifecycle;", "fragmentDelegate", "Lcom/kubi/sdk/delegate/FragmentDelegate;", "activityDelegate", "Lcom/kubi/sdk/delegate/ActivityDelegate;", "registerLifecycle", "Lcom/kubi/sdk/delegate/RegisterLifecycle;", "attachBaseContext", "", "context", "Landroid/content/Context;", "isMainProcess", "", "onCreate", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "onTerminate", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class C42003b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<InterfaceC42005d> f92203a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<InterfaceC42006e> f92204b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final C42004c f92205c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final C42002a f92206d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final C42007f f92207e;

    /* JADX INFO: renamed from: a */
    public void m92079a(@NotNull Context context, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        C42007f c42007f = this.f92207e;
        c42007f.m92094a(this.f92203a);
        c42007f.m92095b(this.f92204b);
    }

    /* JADX INFO: renamed from: b */
    public void m92080b(@NotNull Application application, boolean z11) {
        Intrinsics.checkNotNullParameter(application, "application");
        application.registerActivityLifecycleCallbacks(this.f92206d);
        StartupDispatcher.setup$default(application, z11, null, 4, null);
        StartupDispatcher.startup$default(false, 1, null);
    }

    /* JADX INFO: renamed from: c */
    public void m92081c(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        application.unregisterActivityLifecycleCallbacks(this.f92206d);
    }

    public C42003b() {
        ArrayList arrayList = new ArrayList();
        this.f92203a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f92204b = arrayList2;
        C42004c c42004c = new C42004c(arrayList2);
        this.f92205c = c42004c;
        this.f92206d = new C42002a(c42004c, arrayList);
        this.f92207e = new C42007f();
    }
}
