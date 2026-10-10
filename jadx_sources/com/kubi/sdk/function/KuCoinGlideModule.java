package com.kubi.sdk.function;

import android.app.ActivityManager;
import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.C5310d;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.bumptech.glide.Registry;
import com.bumptech.glide.integration.okhttp3.C5317b;
import com.bumptech.glide.load.DecodeFormat;
import com.tencent.bugly.proguard.C33557b4;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import p356j2.AbstractC40246a;
import p419l2.C42032f;
import p628t1.C44612d;
import p745x1.C45987g;
import p817z1.C46628g;

/* JADX INFO: loaded from: classes12.dex */
public class KuCoinGlideModule extends AbstractC40246a {
    @Override // p356j2.AbstractC40248c
    /* JADX INFO: renamed from: a */
    public void mo6523a(@NonNull Context context, @NonNull ComponentCallbacks2C5309c componentCallbacks2C5309c, @NonNull Registry registry) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        registry.m6546t(C46628g.class, InputStream.class, new C5317b.a(builder.connectTimeout(20L, timeUnit).readTimeout(20L, timeUnit).build()));
    }

    @Override // p356j2.AbstractC40246a
    /* JADX INFO: renamed from: b */
    public void mo6524b(@NonNull Context context, @NonNull C5310d c5310d) {
        c5310d.m6576e(new C45987g(C33557b4.f69134v));
        c5310d.m6575d(6);
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            c5310d.m6574c(new C42032f().mo92201i0(C44612d.m98726e("com.github.penfeizhou.animation.glide.AnimationDecoderOption.DISABLE_ANIMATION_GIF_DECODER"), Boolean.TRUE).mo92198h().mo92214p(memoryInfo.lowMemory ? DecodeFormat.PREFER_RGB_565 : DecodeFormat.PREFER_ARGB_8888));
        }
    }
}
