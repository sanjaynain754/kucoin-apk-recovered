package com.kubi.fallback;

import com.kubi.fallback.internal.config.FallbackData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.fallback.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IFallbackService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/fallback/IFallbackService;", "", "isFallbackEnabled", "", "dynamicRoutesFallback", "Lcom/kubi/fallback/internal/config/FallbackData;", "route", "", "errorCodesFallback", "errorCode", "path", "globalFallbackFragment", "Landroidx/fragment/app/Fragment;", "LFallback_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IFallbackService {
    /* JADX INFO: renamed from: a */
    boolean mo23748a();

    @Nullable
    /* JADX INFO: renamed from: b */
    FallbackData mo23749b(@NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: c */
    FallbackData mo23750c(@NotNull String str, @NotNull String str2);
}
