package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeMarketEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/PageInfo;", "", "pageTitle", "", "tabChangedLocationId", "fragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/Fragment;)V", "getPageTitle", "()Ljava/lang/String;", "getTabChangedLocationId", "getFragment", "()Landroidx/fragment/app/Fragment;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PageInfo {

    @NotNull
    private final Fragment fragment;

    @NotNull
    private final String pageTitle;

    @NotNull
    private final String tabChangedLocationId;

    public PageInfo(@NotNull String pageTitle, @NotNull String tabChangedLocationId, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(pageTitle, "pageTitle");
        Intrinsics.checkNotNullParameter(tabChangedLocationId, "tabChangedLocationId");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.pageTitle = pageTitle;
        this.tabChangedLocationId = tabChangedLocationId;
        this.fragment = fragment;
    }

    @NotNull
    public final Fragment getFragment() {
        return this.fragment;
    }

    @NotNull
    public final String getPageTitle() {
        return this.pageTitle;
    }

    @NotNull
    public final String getTabChangedLocationId() {
        return this.tabChangedLocationId;
    }
}
