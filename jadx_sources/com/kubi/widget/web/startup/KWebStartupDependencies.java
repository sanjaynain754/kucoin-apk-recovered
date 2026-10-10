package com.kubi.widget.web.startup;

import com.kubi.widget.web.helper.WhitePageCheckHelper;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import x00.C45979d;

/* JADX INFO: renamed from: com.kubi.widget.web.startup.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KWebStartupDependencies.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\tH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eH&J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000eH&J\u0016\u0010\u0014\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH&J\b\u0010\u0016\u001a\u00020\tH&J\u0016\u0010\u0017\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eH&J\u001c\u0010\u0018\u001a\u00020\t2\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000eH&J\b\u0010\u0019\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/widget/web/startup/KWebStartupDependencies;", "", "prepareDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getPrepareDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "isParallelEnabled", "", "loadExperimentLegacy", "", "loadSiteAndBaseLegacy", "loadWhitePageLegacy", "loadSsgLegacy", "prepareExperiment", "Lcom/kubi/widget/web/startup/PreparedConfig;", "prepareWhitePage", "Lcom/kubi/widget/web/helper/WhitePageCheckHelper$PreparedWhitePageConfig;", "prepareSsg", "", "Lcom/kubi/sdk/web/config/WebSsgInfo;", "applyExperiment", "prepared", "applySiteAndBase", "applyWhitePage", "applySsg", "registerSsgObserver", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface KWebStartupDependencies {
    @NotNull
    /* JADX INFO: renamed from: a */
    PreparedConfig<List<C45979d>> mo67381a();

    /* JADX INFO: renamed from: b */
    boolean mo67382b();

    /* JADX INFO: renamed from: c */
    void mo67383c(@NotNull PreparedConfig<Boolean> preparedConfig);

    /* JADX INFO: renamed from: d */
    void mo67384d(@NotNull PreparedConfig<? extends List<C45979d>> preparedConfig);

    /* JADX INFO: renamed from: e */
    void mo67385e();

    /* JADX INFO: renamed from: f */
    void mo67386f();

    @NotNull
    /* JADX INFO: renamed from: g */
    PreparedConfig<WhitePageCheckHelper.PreparedWhitePageConfig> mo67387g();

    /* JADX INFO: renamed from: h */
    void mo67388h();

    @NotNull
    /* JADX INFO: renamed from: i */
    AbstractC41697j0 mo67389i();

    /* JADX INFO: renamed from: j */
    void mo67390j();

    /* JADX INFO: renamed from: k */
    void mo67391k();

    @NotNull
    /* JADX INFO: renamed from: l */
    PreparedConfig<Boolean> mo67392l();

    /* JADX INFO: renamed from: m */
    void mo67393m(@NotNull PreparedConfig<WhitePageCheckHelper.PreparedWhitePageConfig> preparedConfig);

    /* JADX INFO: renamed from: n */
    void mo67394n();
}
