package com.kubi.sdk.pkg.bundle;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.b */
/* JADX INFO: compiled from: DebugUtil.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0007\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/b;", "", "<init>", "()V", "Lkotlin/Function1;", "", "", "b", "Lkotlin/jvm/functions/Function1;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lkotlin/jvm/functions/Function1;", "setHandler", "(Lkotlin/jvm/functions/Function1;)V", "handler", "Ljava/util/concurrent/ConcurrentHashMap;", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "()Ljava/util/concurrent/ConcurrentHashMap;", "lockRnConfig", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDebugUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugUtil.kt\ncom/kubi/sdk/pkg/bundle/BundleDebugUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class C23936b {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static Function1<? super String, Unit> handler;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C23936b f47308a = new C23936b();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, String> lockRnConfig = new ConcurrentHashMap<>();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Function1<String, Unit> m57547a() {
        return handler;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap<String, String> m57548b() {
        return lockRnConfig;
    }
}
