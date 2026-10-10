package com.kubi.fallback;

import com.kubi.fallback.internal.config.FallbackConfigHelper;
import com.kubi.fallback.internal.config.FallbackData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.fallback.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DefaultFallbackService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/fallback/DefaultFallbackService;", "Lcom/kubi/fallback/IFallbackService;", "<init>", "()V", "isFallbackEnabled", "", "dynamicRoutesFallback", "Lcom/kubi/fallback/internal/config/FallbackData;", "route", "", "errorCodesFallback", "errorCode", "path", "globalFallbackFragment", "Landroidx/fragment/app/Fragment;", "LFallback_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DefaultFallbackService implements IFallbackService {
    @Override // com.kubi.fallback.IFallbackService
    /* JADX INFO: renamed from: a */
    public boolean mo23748a() {
        return FallbackConfigHelper.f21941a.m23763l();
    }

    @Override // com.kubi.fallback.IFallbackService
    @Nullable
    /* JADX INFO: renamed from: b */
    public FallbackData mo23749b(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return FallbackConfigHelper.f21941a.m23760i(route);
    }

    @Override // com.kubi.fallback.IFallbackService
    @Nullable
    /* JADX INFO: renamed from: c */
    public FallbackData mo23750c(@NotNull String errorCode, @NotNull String path) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(path, "path");
        return FallbackConfigHelper.f21941a.m23761j(errorCode, path);
    }
}
