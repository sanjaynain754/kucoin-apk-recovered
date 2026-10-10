package com.kubi.config.kcrc;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.config.Config;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.p110rn.Constants;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.config.kcrc.k */
/* JADX INFO: compiled from: KCRemoteConfigTrack.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/config/kcrc/k;", "", "<init>", "()V", "", "isWrite", "", "time", "success", "", "msg", "", "d", "(ZJZLjava/lang/String;)V", "f", "(JZLjava/lang/String;)V", "what", "b", "(Ljava/lang/String;ZLjava/lang/String;)V", "by", "key", "config", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class C11425k {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C11425k f19692a = new C11425k();

    /* JADX INFO: renamed from: com.kubi.config.kcrc.k$a */
    /* JADX INFO: compiled from: KCRemoteConfigUtils.kt */
    @Metadata(m90083d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m90084d2 = {"", "run", "()V", "<anonymous>"}, m90085k = 3, m90086mv = {1, 7, 1})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f19693b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f19694c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f19695d;

        public a(String str, String str2, String str3) {
            this.f19693b = str;
            this.f19694c = str2;
            this.f19695d = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Function1<Throwable, Unit> function1M20447c;
            try {
                C11426l.m20568a("getConfig:[" + this.f19693b + "], " + this.f19694c + ':' + this.f19695d);
                TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
                eventParametersBuilderAcquire.m42393d("category", "get_config");
                eventParametersBuilderAcquire.m42393d(FirebaseAnalytics.Param.METHOD, this.f19693b);
                eventParametersBuilderAcquire.m42393d(Constants.BIZ, this.f19694c);
                TechnologyEvent.m42388d("kc_remote_config", eventParametersBuilderAcquire);
            } catch (Exception e11) {
                Config configM20528H = KCRemoteConfigFetcher.f19652a.m20528H();
                if (configM20528H == null || (function1M20447c = configM20528H.m20447c()) == null) {
                    return;
                }
                function1M20447c.invoke(e11);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.config.kcrc.k$b */
    /* JADX INFO: compiled from: KCRemoteConfigUtils.kt */
    @Metadata(m90083d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m90084d2 = {"", "run", "()V", "<anonymous>"}, m90085k = 3, m90086mv = {1, 7, 1})
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f19696b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f19697c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f19698d;

        public b(String str, boolean z11, String str2) {
            this.f19696b = str;
            this.f19697c = z11;
            this.f19698d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Function1<Throwable, Unit> function1M20447c;
            try {
                C11426l.m20568a("fetchBy [" + this.f19696b + "] [" + this.f19697c + "] msg=" + this.f19698d + " .");
                TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
                eventParametersBuilderAcquire.m42393d("category", "fetchby");
                eventParametersBuilderAcquire.m42394e("success", this.f19697c);
                eventParametersBuilderAcquire.m42393d(FirebaseAnalytics.Param.METHOD, this.f19696b);
                if (this.f19698d.length() > 0) {
                    eventParametersBuilderAcquire.m42393d("error_message", this.f19698d);
                }
                TechnologyEvent.m42388d("kc_remote_config", eventParametersBuilderAcquire);
            } catch (Exception e11) {
                Config configM20528H = KCRemoteConfigFetcher.f19652a.m20528H();
                if (configM20528H == null || (function1M20447c = configM20528H.m20447c()) == null) {
                    return;
                }
                function1M20447c.invoke(e11);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.config.kcrc.k$c */
    /* JADX INFO: compiled from: KCRemoteConfigUtils.kt */
    @Metadata(m90083d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m90084d2 = {"", "run", "()V", "<anonymous>"}, m90085k = 3, m90086mv = {1, 7, 1})
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f19699b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f19700c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f19701d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f19702e;

        public c(boolean z11, boolean z12, long j11, String str) {
            this.f19699b = z11;
            this.f19700c = z12;
            this.f19701d = j11;
            this.f19702e = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Function1<Throwable, Unit> function1M20447c;
            try {
                String str = this.f19699b ? "write" : "read";
                C11426l.m20568a("jsonFile [" + str + "] [" + this.f19700c + "], use " + this.f19701d + " ms. msg=" + this.f19702e + " .");
                TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
                eventParametersBuilderAcquire.m42393d("category", "file_io");
                eventParametersBuilderAcquire.m42394e("success", this.f19700c);
                eventParametersBuilderAcquire.m42393d(FirebaseAnalytics.Param.METHOD, str);
                eventParametersBuilderAcquire.m42396g(TypedValues.TransitionType.S_DURATION, this.f19701d);
                if (this.f19702e.length() > 0) {
                    eventParametersBuilderAcquire.m42393d("error_message", this.f19702e);
                }
                TechnologyEvent.m42388d("kc_remote_config", eventParametersBuilderAcquire);
            } catch (Exception e11) {
                Config configM20528H = KCRemoteConfigFetcher.f19652a.m20528H();
                if (configM20528H == null || (function1M20447c = configM20528H.m20447c()) == null) {
                    return;
                }
                function1M20447c.invoke(e11);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.config.kcrc.k$d */
    /* JADX INFO: compiled from: KCRemoteConfigUtils.kt */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m90083d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m90084d2 = {"", "run", "()V", "<anonymous>"}, m90085k = 3, m90086mv = {1, 7, 1})
    public static final class d implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f19703b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f19704c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f19705d;

        public d(boolean z11, long j11, String str) {
            this.f19703b = z11;
            this.f19704c = j11;
            this.f19705d = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Function1<Throwable, Unit> function1M20447c;
            try {
                C11426l.m20568a("jsonParse [" + this.f19703b + "], use " + this.f19704c + " ms. msg=" + this.f19705d + " .");
                TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
                eventParametersBuilderAcquire.m42393d("category", "json_parse");
                eventParametersBuilderAcquire.m42394e("success", this.f19703b);
                eventParametersBuilderAcquire.m42396g(TypedValues.TransitionType.S_DURATION, this.f19704c);
                if (this.f19705d.length() > 0) {
                    eventParametersBuilderAcquire.m42393d("error_message", this.f19705d);
                }
                TechnologyEvent.m42388d("kc_remote_config", eventParametersBuilderAcquire);
            } catch (Exception e11) {
                Config configM20528H = KCRemoteConfigFetcher.f19652a.m20528H();
                if (configM20528H == null || (function1M20447c = configM20528H.m20447c()) == null) {
                    return;
                }
                function1M20447c.invoke(e11);
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m20562a(@NotNull String by, @NotNull String key, @Nullable String config) {
        Intrinsics.checkNotNullParameter(by, "by");
        Intrinsics.checkNotNullParameter(key, "key");
        C42917g.m94137c().execute(new a(by, key, config));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m20564c(String str, boolean z11, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        m20563b(str, z11, str2);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m20565d(boolean isWrite, long time, boolean success, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        C42917g.m94137c().execute(new c(isWrite, success, time, msg));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m20566e(boolean z11, long j11, boolean z12, String str, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = "";
        }
        m20565d(z11, j11, z12, str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m20567f(long time, boolean success, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        C42917g.m94137c().execute(new d(success, time, msg));
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m20563b(@NotNull String what, boolean success, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(what, "what");
        Intrinsics.checkNotNullParameter(msg, "msg");
        C42917g.m94137c().execute(new b(what, success, msg));
    }
}
