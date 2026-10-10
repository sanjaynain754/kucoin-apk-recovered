package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.integration.okhttp3.C5316a;
import com.kubi.sdk.function.KuCoinGlideModule;
import java.util.Collections;
import java.util.Set;
import p362j8.C40347e;

/* JADX INFO: loaded from: classes.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* JADX INFO: renamed from: a */
    public final KuCoinGlideModule f6635a = new KuCoinGlideModule();

    @Override // p356j2.AbstractC40248c
    /* JADX INFO: renamed from: a */
    public void mo6523a(@NonNull Context context, @NonNull ComponentCallbacks2C5309c componentCallbacks2C5309c, @NonNull Registry registry) {
        new C5316a().mo6523a(context, componentCallbacks2C5309c, registry);
        new C40347e().mo6523a(context, componentCallbacks2C5309c, registry);
        this.f6635a.mo6523a(context, componentCallbacks2C5309c, registry);
    }

    @Override // p356j2.AbstractC40246a
    /* JADX INFO: renamed from: b */
    public void mo6524b(@NonNull Context context, @NonNull C5310d c5310d) {
        this.f6635a.mo6524b(context, c5310d);
    }

    @Override // p356j2.AbstractC40246a
    /* JADX INFO: renamed from: c */
    public boolean mo6525c() {
        return this.f6635a.mo6525c();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    /* JADX INFO: renamed from: d */
    public Set<Class<?>> mo6521d() {
        return Collections.EMPTY_SET;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C5307a mo6522e() {
        return new C5307a();
    }

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.kubi.sdk.function.KuCoinGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.github.penfeizhou.animation.glide.GlideAnimationModule");
        }
    }
}
