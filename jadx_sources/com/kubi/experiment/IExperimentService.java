package com.kubi.experiment;

import com.kubi.router.core.Router;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: IExperimentService.kt */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/experiment/IExperimentService;", "", "getExperimentResult", "", "code", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCachedExperimentResult", "Companion", "LExperiment_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IExperimentService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f21603a = Companion.f21604a;

    /* JADX INFO: compiled from: IExperimentService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/experiment/IExperimentService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/experiment/IExperimentService;", "LExperiment_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f21604a = new Companion();

        @NotNull
        public final IExperimentService get() {
            return (IExperimentService) Router.f46192a.m56192n(IExperimentService.class);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo23705a(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    /* JADX INFO: renamed from: b */
    Object mo23706b(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);
}
