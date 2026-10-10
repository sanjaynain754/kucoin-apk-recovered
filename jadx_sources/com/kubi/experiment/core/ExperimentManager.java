package com.kubi.experiment.core;

import com.kubi.experiment.data.ExperimentConfigRepository;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.kubi.experiment.core.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ExperimentManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ \u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0011J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0011R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/experiment/core/ExperimentManager;", "", "<init>", "()V", "repository", "Lcom/kubi/experiment/data/ExperimentConfigRepository;", "getRepository", "()Lcom/kubi/experiment/data/ExperimentConfigRepository;", "repository$delegate", "Lkotlin/Lazy;", "refreshConfig", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExperimentResult", "code", "", "defaultValue", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCachedExperimentResult", "LExperiment_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ExperimentManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ExperimentManager f21686a = new ExperimentManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f21687b = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.kubi.experiment.core.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ExperimentManager.m23717h();
        }
    });

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m23715c(ExperimentManager experimentManager, String str, boolean z11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return experimentManager.m23718b(str, z11, continuation);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m23716e(ExperimentManager experimentManager, String str, boolean z11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return experimentManager.m23719d(str, z11, continuation);
    }

    /* JADX INFO: renamed from: h */
    public static final ExperimentConfigRepository m23717h() {
        return ExperimentConfigRepository.f21688i.create();
    }

    /* JADX INFO: renamed from: f */
    public final ExperimentConfigRepository m23720f() {
        return (ExperimentConfigRepository) f21687b.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m23718b(@NotNull String str, boolean z11, @NotNull Continuation<? super Boolean> continuation) {
        return m23720f().m23729h(str, z11, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m23719d(@NotNull String str, boolean z11, @NotNull Continuation<? super Boolean> continuation) {
        return m23720f().m23730i(str, z11, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m23721g(@NotNull Continuation<? super Boolean> continuation) {
        return m23720f().m23732k(continuation);
    }
}
