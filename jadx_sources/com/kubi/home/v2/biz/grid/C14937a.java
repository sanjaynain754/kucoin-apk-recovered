package com.kubi.home.v2.biz.grid;

import com.kubi.home.entity.GridNavigationEntity;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.home.v2.biz.grid.a */
/* JADX INFO: compiled from: GridNavigationContract.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001BO\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012.\u0010\u0005\u001a*\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006j\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR9\u0010\u0005\u001a*\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006j\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/home/v2/biz/grid/GridNavigationContract$DataEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "showHomeList", "", "Lcom/kubi/home/entity/GridNavigationEntity;", "gourpMap", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "needClosePage", "", "<init>", "(Ljava/util/List;Ljava/util/LinkedHashMap;Z)V", "getShowHomeList", "()Ljava/util/List;", "getGourpMap", "()Ljava/util/LinkedHashMap;", "getNeedClosePage", "()Z", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C14937a implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<GridNavigationEntity> f26390a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LinkedHashMap<String, List<GridNavigationEntity>> f26391b;

    /* JADX INFO: renamed from: c */
    public final boolean f26392c;

    /* JADX WARN: Multi-variable type inference failed */
    public C14937a(@NotNull List<? extends GridNavigationEntity> showHomeList, @NotNull LinkedHashMap<String, List<GridNavigationEntity>> gourpMap, boolean z11) {
        Intrinsics.checkNotNullParameter(showHomeList, "showHomeList");
        Intrinsics.checkNotNullParameter(gourpMap, "gourpMap");
        this.f26390a = showHomeList;
        this.f26391b = gourpMap;
        this.f26392c = z11;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<String, List<GridNavigationEntity>> m30579a() {
        return this.f26391b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF26392c() {
        return this.f26392c;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<GridNavigationEntity> m30581c() {
        return this.f26390a;
    }
}
