package com.kubi.flutter.plugin.cloud_storage_plugin;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.flutter.plugin.cloud_storage_plugin.b */
/* JADX INFO: compiled from: CloudStorageUtil.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;", "", "<init>", "()V", "Ljava/io/Closeable;", "", "b", "(Ljava/io/Closeable;)V", "", "e", "", "source", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;Ljava/lang/String;)V", "cloud_storage_plugin_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C12631b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12631b f22061a = new C12631b();

    /* JADX INFO: renamed from: a */
    public final void m23888a(@NotNull Throwable e11, @NotNull String source) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Intrinsics.checkNotNullParameter(source, "source");
        C43846g.m96568c(new CloudStorageException(e11, source, false, null, 8, null), null, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m23889b(@NotNull Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }
}
