package com.kubi.router.utils;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.router.utils.a */
/* JADX INFO: compiled from: BundleUtils.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/router/utils/a;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "", "key", "", "value", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/os/Bundle;Ljava/lang/String;Z)V", "RouterSDK_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBundleUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleUtils.kt\ncom/kubi/router/utils/BundleUtils\n+ 2 RouteEx.kt\ncom/kubi/router/utils/RouteExKt\n*L\n1#1,124:1\n305#2:125\n*S KotlinDebug\n*F\n+ 1 BundleUtils.kt\ncom/kubi/router/utils/BundleUtils\n*L\n119#1:125\n*E\n"})
public final class C23635a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C23635a f46211a = new C23635a();

    /* JADX INFO: renamed from: a */
    public final void m56286a(@NotNull Bundle bundle, @NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        RouteExKt.m56249g0(bundle, key, value);
    }
}
