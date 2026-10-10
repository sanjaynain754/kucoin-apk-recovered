package com.kubi.fallback;

import com.kubi.fallback.internal.config.FallbackConfigHelper;
import com.kubi.fallback.internal.config.FallbackData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import wf.C45825b;

/* JADX INFO: renamed from: com.kubi.fallback.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FallbackManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0001J\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/fallback/FallbackManager;", "Lcom/kubi/fallback/IFallbackService;", "<init>", "()V", "fallbackService", "setFallbackService", "", "initFallback", "isFallbackEnabled", "", "dynamicRoutesFallback", "Lcom/kubi/fallback/internal/config/FallbackData;", "route", "", "errorCodesFallback", "errorCode", "path", "globalFallbackFragment", "Landroidx/fragment/app/Fragment;", "LFallback_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FallbackManager implements IFallbackService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FallbackManager f21936a = new FallbackManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static IFallbackService f21937b = new DefaultFallbackService();

    @Override // com.kubi.fallback.IFallbackService
    /* JADX INFO: renamed from: a */
    public boolean mo23748a() {
        return f21937b.mo23748a();
    }

    @Override // com.kubi.fallback.IFallbackService
    @Nullable
    /* JADX INFO: renamed from: b */
    public FallbackData mo23749b(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (!mo23748a()) {
            return null;
        }
        FallbackData fallbackDataMo23749b = f21937b.mo23749b(route);
        if (fallbackDataMo23749b != null) {
            C45825b.f103310a.m101239b("Dynamic route disaster recovery triggered." + fallbackDataMo23749b);
        }
        return fallbackDataMo23749b;
    }

    @Override // com.kubi.fallback.IFallbackService
    @Nullable
    /* JADX INFO: renamed from: c */
    public FallbackData mo23750c(@NotNull String errorCode, @NotNull String path) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(path, "path");
        if (!mo23748a()) {
            return null;
        }
        FallbackData fallbackDataMo23750c = f21937b.mo23750c(errorCode, path);
        if (fallbackDataMo23750c != null) {
            C45825b.f103310a.m101239b("Error code disaster recovery triggered." + fallbackDataMo23750c);
        }
        return fallbackDataMo23750c;
    }

    /* JADX INFO: renamed from: d */
    public final void m23751d() {
        FallbackConfigHelper.f21941a.m23762k();
    }
}
