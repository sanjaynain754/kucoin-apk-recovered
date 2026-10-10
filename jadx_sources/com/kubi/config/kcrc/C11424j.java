package com.kubi.config.kcrc;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.config.exception.KCConfigException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Regex;
import ro.C44128b;
import y70.C46396e;

/* JADX INFO: renamed from: com.kubi.config.kcrc.j */
/* JADX INFO: compiled from: KCRemoteConfigReport.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/config/kcrc/j;", "", "<init>", "()V", "", "key", "value", "", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "info", "b", "(Ljava/lang/String;)V", "errorMsg", "", "e", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/Throwable;)V", "", "d", "()J", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class C11424j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C11424j f19691a = new C11424j();

    /* JADX INFO: renamed from: a */
    public final void m20558a(@NotNull String errorMsg, @NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        Intrinsics.checkNotNullParameter(e11, "e");
        String str = "[error]-(" + m20561d() + ")-" + errorMsg;
        C44128b.m97262f("KCRemoteConfig", str, e11);
        C43840a.m96548b(str, "KCRemoteConfig");
    }

    /* JADX INFO: renamed from: b */
    public final void m20559b(@NotNull String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        String str = "[info]-(" + m20561d() + ")-" + info;
        C44128b.m97266j("KCRemoteConfig", str);
        C43840a.m96550d(str, "KCRemoteConfig");
    }

    /* JADX INFO: renamed from: c */
    public final void m20560c(@Nullable String key, @Nullable String value) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[query]-[");
        sb2.append(key);
        sb2.append("](");
        sb2.append(m20561d());
        sb2.append("):");
        sb2.append(value != null ? new Regex("\\s").replace(value, "") : null);
        String string = sb2.toString();
        C44128b.m97266j("KCRemoteConfig", string);
        C43840a.m96550d(string, "KCRemoteConfig");
    }

    /* JADX INFO: renamed from: d */
    public final long m20561d() {
        try {
            return C46396e.m102349f("category_kc_remote_config", "key_kc_remote_config_data_version", 0L);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "KCRemoteConfigReport", false, null, 8, null), null, 2, null);
            return -1L;
        }
    }
}
