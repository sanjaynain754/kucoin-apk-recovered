package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.C5310d;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.bumptech.glide.Registry;
import java.io.InputStream;
import p356j2.InterfaceC40247b;
import p817z1.C46628g;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class OkHttpGlideModule implements InterfaceC40247b {
    @Override // p356j2.InterfaceC40247b
    /* JADX INFO: renamed from: b */
    public void mo6646b(Context context, ComponentCallbacks2C5309c componentCallbacks2C5309c, Registry registry) {
        registry.m6546t(C46628g.class, InputStream.class, new C5317b.a());
    }

    @Override // p356j2.InterfaceC40247b
    /* JADX INFO: renamed from: a */
    public void mo6645a(@NonNull Context context, @NonNull C5310d c5310d) {
    }
}
