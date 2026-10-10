package com.kubi.widget.web.startup;

import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41690i;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KWebParallelPrepareRunner.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u009a\u0001\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\t0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\n0\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00070\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00070\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00070\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/widget/web/startup/KWebParallelPrepareRunner;", "", "prepareDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "run", "", "Experiment", "WhitePage", "Ssg", "prepareExperiment", "Lkotlin/Function0;", "prepareWhitePage", "prepareSsg", "applyExperiment", "Lkotlin/Function1;", "applySiteAndBase", "applyWhitePage", "applySsg", "registerSsgObserver", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KWebParallelPrepareRunner {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final AbstractC41697j0 f55236a;

    public KWebParallelPrepareRunner(@NotNull AbstractC41697j0 prepareDispatcher) {
        Intrinsics.checkNotNullParameter(prepareDispatcher, "prepareDispatcher");
        this.f55236a = prepareDispatcher;
    }

    /* JADX INFO: renamed from: b */
    public final <Experiment, WhitePage, Ssg> void m67370b(@NotNull Function0<? extends Experiment> prepareExperiment, @NotNull Function0<? extends WhitePage> prepareWhitePage, @NotNull Function0<? extends Ssg> prepareSsg, @NotNull Function1<? super Experiment, Unit> applyExperiment, @NotNull Function0<Unit> applySiteAndBase, @NotNull Function1<? super WhitePage, Unit> applyWhitePage, @NotNull Function1<? super Ssg, Unit> applySsg, @NotNull Function0<Unit> registerSsgObserver) throws InterruptedException {
        Intrinsics.checkNotNullParameter(prepareExperiment, "prepareExperiment");
        Intrinsics.checkNotNullParameter(prepareWhitePage, "prepareWhitePage");
        Intrinsics.checkNotNullParameter(prepareSsg, "prepareSsg");
        Intrinsics.checkNotNullParameter(applyExperiment, "applyExperiment");
        Intrinsics.checkNotNullParameter(applySiteAndBase, "applySiteAndBase");
        Intrinsics.checkNotNullParameter(applyWhitePage, "applyWhitePage");
        Intrinsics.checkNotNullParameter(applySsg, "applySsg");
        Intrinsics.checkNotNullParameter(registerSsgObserver, "registerSsgObserver");
        C41690i.m91067b(null, new KWebParallelPrepareRunner$run$1(this, applyExperiment, applySiteAndBase, applyWhitePage, applySsg, registerSsgObserver, prepareExperiment, prepareWhitePage, prepareSsg, null), 1, null);
    }
}
