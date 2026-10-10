package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.bumptech.glide.Registry;
import java.io.InputStream;
import p356j2.AbstractC40248c;
import p817z1.C46628g;

/* JADX INFO: renamed from: com.bumptech.glide.integration.okhttp3.a */
/* JADX INFO: compiled from: OkHttpLibraryGlideModule.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5316a extends AbstractC40248c {
    @Override // p356j2.AbstractC40248c
    /* JADX INFO: renamed from: a */
    public void mo6523a(@NonNull Context context, @NonNull ComponentCallbacks2C5309c componentCallbacks2C5309c, @NonNull Registry registry) {
        registry.m6546t(C46628g.class, InputStream.class, new C5317b.a());
    }
}
