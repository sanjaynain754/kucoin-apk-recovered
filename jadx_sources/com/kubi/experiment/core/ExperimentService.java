package com.kubi.experiment.core;

import com.kubi.experiment.IExperimentService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.kubi.experiment.core.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ExperimentService.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/experiment/core/ExperimentService;", "Lcom/kubi/experiment/IExperimentService;", "<init>", "()V", "getExperimentResult", "", "code", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCachedExperimentResult", "LExperiment_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ExperimentService implements IExperimentService {
    @Override // com.kubi.experiment.IExperimentService
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo23705a(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return ExperimentManager.m23716e(ExperimentManager.f21686a, str, false, continuation, 2, null);
    }

    @Override // com.kubi.experiment.IExperimentService
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo23706b(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return ExperimentManager.m23715c(ExperimentManager.f21686a, str, false, continuation, 2, null);
    }
}
