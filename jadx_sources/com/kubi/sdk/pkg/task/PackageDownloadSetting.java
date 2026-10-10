package com.kubi.sdk.pkg.task;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.pkg.config.PackConfigManager;
import com.tencent.bugly.proguard.C33812n7;
import java.util.ArrayList;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: HttpHelper.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/PackageDownloadSetting;", "", "<init>", "()V", "", "b", "Lkotlin/Lazy;", "()Ljava/lang/String;", C33812n7.f71057p, "Ljava/util/ArrayList;", "Lokhttp3/Interceptor;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/ArrayList;", "interceptors", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class PackageDownloadSetting {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PackageDownloadSetting f47421a = new PackageDownloadSetting();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy userAgent = LazyKt.lazy(new Function0<String>() { // from class: com.kubi.sdk.pkg.task.PackageDownloadSetting$userAgent$2
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Mozilla/5.0 (Linux; Android 7.0; SM-G930V Build/NRD90M) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.125 Mobile Safari/537.36 " + PackConfigManager.f47378a.m57688b();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final ArrayList<Interceptor> interceptors = new ArrayList<>();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ArrayList<Interceptor> m57786a() {
        return interceptors;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m57787b() {
        return (String) userAgent.getValue();
    }
}
