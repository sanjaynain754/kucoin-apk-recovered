package com.kubi.quotefacade.alpha.list;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.alpha.list.g */
/* JADX INFO: compiled from: AlphaListContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/list/AlphaListContract$AlphaAddOrCancelFavEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "alphaItem", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", ViewProps.POSITION, "", "<init>", "(Lcom/kubi/quotefacade/entity/AlphaItemEntity;I)V", "getAlphaItem", "()Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "getPosition", "()I", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C21699g implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final AlphaItemEntity f41334a;

    /* JADX INFO: renamed from: b */
    public final int f41335b;

    public C21699g(@NotNull AlphaItemEntity alphaItem, int i11) {
        Intrinsics.checkNotNullParameter(alphaItem, "alphaItem");
        this.f41334a = alphaItem;
        this.f41335b = i11;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AlphaItemEntity getF41334a() {
        return this.f41334a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF41335b() {
        return this.f41335b;
    }
}
