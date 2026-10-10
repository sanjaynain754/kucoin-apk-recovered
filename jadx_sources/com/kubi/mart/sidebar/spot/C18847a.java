package com.kubi.mart.sidebar.spot;

import com.kubi.mart.entity.SpotMenuModel;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.a */
/* JADX INFO: compiled from: SpotSidebarContract.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/SpotSidebarContract$MenusDataEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "menus", "", "Lcom/kubi/mart/entity/SpotMenuModel;", "hasFavoriteData", "", "<init>", "(Ljava/util/List;Z)V", "getMenus", "()Ljava/util/List;", "getHasFavoriteData", "()Z", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C18847a implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<SpotMenuModel> f34721a;

    /* JADX INFO: renamed from: b */
    public final boolean f34722b;

    public C18847a(@NotNull List<SpotMenuModel> menus, boolean z11) {
        Intrinsics.checkNotNullParameter(menus, "menus");
        this.f34721a = menus;
        this.f34722b = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF34722b() {
        return this.f34722b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<SpotMenuModel> m41444b() {
        return this.f34721a;
    }
}
