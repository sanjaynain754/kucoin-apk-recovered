package com.kubi.quotefacade.alpha.list;

import com.kubi.quotefacade.entity.AlphaItemEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.alpha.list.i */
/* JADX INFO: compiled from: AlphaListContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/list/AlphaListContract$LoadMoreDataListEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "dataList", "", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "hasMore", "", "<init>", "(Ljava/util/List;Z)V", "getDataList", "()Ljava/util/List;", "getHasMore", "()Z", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C21703i implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<AlphaItemEntity> f41341a;

    /* JADX INFO: renamed from: b */
    public final boolean f41342b;

    public C21703i(@NotNull List<AlphaItemEntity> dataList, boolean z11) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.f41341a = dataList;
        this.f41342b = z11;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<AlphaItemEntity> m50665a() {
        return this.f41341a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF41342b() {
        return this.f41342b;
    }
}
