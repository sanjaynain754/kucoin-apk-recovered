package com.kubi.home.widgets.grid;

import com.kubi.home.entity.GridNavigationEntity;
import com.kubi.home.utils.HomeCoroutineScope;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: GridNavigationWidgetPreloader.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, m90084d2 = {"Lcom/kubi/home/widgets/grid/GridNavigationWidgetPreloader;", "", "<init>", "()V", "caceDataList", "", "Lcom/kubi/home/entity/GridNavigationEntity;", "getCaceDataList", "()Ljava/util/List;", "setCaceDataList", "(Ljava/util/List;)V", "preloadCache", "Lkotlinx/coroutines/Job;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GridNavigationWidgetPreloader {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final GridNavigationWidgetPreloader f26749a = new GridNavigationWidgetPreloader();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static List<? extends GridNavigationEntity> f26750b;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final List<GridNavigationEntity> m31193a() {
        return f26750b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC41775x1 m31194b() {
        return C41696j.m91104d(new HomeCoroutineScope(C42911a.m94120b(), "gridNavi-preload"), null, null, new GridNavigationWidgetPreloader$preloadCache$1(null), 3, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m31195c(@Nullable List<? extends GridNavigationEntity> list) {
        f26750b = list;
    }
}
