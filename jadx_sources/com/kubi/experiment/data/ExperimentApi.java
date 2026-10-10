package com.kubi.experiment.data;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* JADX INFO: renamed from: com.kubi.experiment.data.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ExperimentApi.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H§@¢\u0006\u0002\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/experiment/data/ExperimentApi;", "", "fetchExperimentConfig", "", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LExperiment_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ExperimentApi {
    @GET("v1/kucoin-app-review")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m23739a(@NotNull Continuation<? super Map<String, Boolean>> continuation);
}
