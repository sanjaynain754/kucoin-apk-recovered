package p569qq;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.monitor.helper.C19223a;
import com.kubi.monitor.helper.C19226d;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p604rq.InterfaceC44169a;
import p642tq.InterfaceC45058a;
import p642tq.InterfaceC45059b;
import p642tq.InterfaceC45060c;
import p642tq.InterfaceC45063f;
import p642tq.InterfaceC45064g;
import p642tq.InterfaceC45065h;
import p699vq.C45620a;
import p840zq.C46908e;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qq.i */
/* JADX INFO: compiled from: MonitorConfigManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u000fH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!R\"\u0010'\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010.R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u0019008\u0006¢\u0006\f\n\u0004\b#\u00101\u001a\u0004\b2\u00103R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b(\u00107\"\u0004\b8\u00109R(\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b2\u0010.\u0012\u0004\b<\u0010\u0003\u001a\u0004\b\u0007\u0010:\"\u0004\b;\u0010\u0018R(\u0010?\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010.\u0012\u0004\b>\u0010\u0003\u001a\u0004\b5\u0010:\"\u0004\b=\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, m90084d2 = {"Lqq/i;", "", "<init>", "()V", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "", "isDebug", "Lqq/e;", "monitorConfig", "Lqq/d;", "commonProvider", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/app/Application;ZLqq/e;Lqq/d;)V", "", "did", "uid", "k", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", JPushConstants.Message.KEY_FOREGROUND, "j", "(Z)V", "Lqq/j;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addPageStatusListener", "(Lqq/j;)V", "removePageStatusListener", "Ltq/c;", "track", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ltq/c;)V", "Lqq/e;", "e", "()Lqq/e;", "setConfig", "(Lqq/e;)V", "config", "c", "Lqq/d;", "d", "()Lqq/d;", "setCommonProvider", "(Lqq/d;)V", "Z", "hasInitialed", "", "Ljava/util/List;", "g", "()Ljava/util/List;", "pageStatusListeners", "f", "Landroid/app/Application;", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "()Z", "setDebug", "isDebug$annotations", "i", "getEnableFramesMonitor$annotations", "enableFramesMonitor", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43848i {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static boolean hasInitialed;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static Application application;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static boolean isDebug;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43848i f96913a = new C43848i();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static InterfaceC43844e config = new a();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static InterfaceC43843d commonProvider = C45620a.f102748a;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final List<InterfaceC43849j> pageStatusListeners = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static boolean enableFramesMonitor = true;

    /* JADX INFO: renamed from: qq.i$a */
    /* JADX INFO: compiled from: MonitorConfigManager.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m90084d2 = {"qq/i$a", "Lqq/e;", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class a implements InterfaceC43844e {
        @Override // p569qq.InterfaceC43844e
        @NotNull
        /* JADX INFO: renamed from: a */
        public List<InterfaceC45065h> mo32839a() {
            return InterfaceC43844e.a.m96564e(this);
        }

        @Override // p569qq.InterfaceC43844e
        @NotNull
        /* JADX INFO: renamed from: b */
        public List<InterfaceC45058a> mo32840b() {
            return InterfaceC43844e.a.m96560a(this);
        }

        @Override // p569qq.InterfaceC43844e
        @NotNull
        /* JADX INFO: renamed from: c */
        public List<InterfaceC44169a> mo32841c() {
            return InterfaceC43844e.a.m96561b(this);
        }

        @Override // p569qq.InterfaceC43844e
        @NotNull
        /* JADX INFO: renamed from: d */
        public List<InterfaceC45059b> mo32842d() {
            return InterfaceC43844e.a.m96565f(this);
        }

        @Override // p569qq.InterfaceC43844e
        @NotNull
        /* JADX INFO: renamed from: e */
        public InterfaceC45063f mo32843e() {
            return InterfaceC43844e.a.m96562c(this);
        }

        @Override // p569qq.InterfaceC43844e
        @NotNull
        /* JADX INFO: renamed from: f */
        public List<InterfaceC45064g> mo32844f() {
            return InterfaceC43844e.a.m96563d(this);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m96577a(@NotNull InterfaceC45060c track) {
        Intrinsics.checkNotNullParameter(track, "track");
        C19226d.f35569a.m42475c(track);
    }

    @JvmStatic
    public static final void addPageStatusListener(@NotNull InterfaceC43849j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        pageStatusListeners.add(listener);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m96578b(@NotNull Continuation<? super String> continuation) {
        return f96913a.m96585d().mo42450b(continuation);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m96579f() {
        return enableFramesMonitor;
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m96580h(@NotNull Application application2, boolean isDebug2, @NotNull InterfaceC43844e monitorConfig, @NotNull InterfaceC43843d commonProvider2) {
        Intrinsics.checkNotNullParameter(application2, "application");
        Intrinsics.checkNotNullParameter(monitorConfig, "monitorConfig");
        Intrinsics.checkNotNullParameter(commonProvider2, "commonProvider");
        if (hasInitialed) {
            throw new IllegalArgumentException("MonitorConfigManager has initialed");
        }
        hasInitialed = true;
        isDebug = isDebug2;
        config = monitorConfig;
        commonProvider = commonProvider2;
        List<InterfaceC43849j> list = pageStatusListeners;
        list.add(C19226d.f35569a);
        list.add(C46908e.f104773a);
        application2.registerActivityLifecycleCallbacks(new C19223a());
        application = application2;
    }

    /* JADX INFO: renamed from: i */
    public static final void m96581i(boolean z11) {
        enableFramesMonitor = z11;
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m96582j(boolean isForeground) {
        commonProvider.mo42453e(isForeground);
        C46908e.f104773a.m103328r(isForeground);
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m96583k(@Nullable String did, @Nullable String uid) {
        commonProvider.mo42451c(did, uid);
    }

    @JvmStatic
    public static final void removePageStatusListener(@NotNull InterfaceC43849j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        pageStatusListeners.remove(listener);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Application m96584c() {
        return application;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC43843d m96585d() {
        return commonProvider;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC43844e m96586e() {
        return config;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<InterfaceC43849j> m96587g() {
        return pageStatusListeners;
    }
}
