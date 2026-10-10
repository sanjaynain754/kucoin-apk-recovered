package com.kubi.sdk.pkg.bundle.pkgplatform;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.Gson;
import okhttp3.MediaType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.pkgplatform.a */
/* JADX INFO: compiled from: PkgPlatformClient.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m90084d2 = {"Lcom/google/gson/Gson;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/google/gson/Gson;", "gson", "Lokhttp3/MediaType;", "b", "Lokhttp3/MediaType;", "JSON_MEDIA_TYPE", "Package_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C23958a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Gson f47369a = new Gson();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final MediaType f47370b = MediaType.INSTANCE.get("application/json; charset=utf-8");
}
