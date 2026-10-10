package com.kubi.quotefacade.alpha.container;

import com.kubi.quotefacade.entity.AlphaMenuModel;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.alpha.container.a */
/* JADX INFO: compiled from: AlphaContainerContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/container/AlphaContainerContract$InitDataEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "alphaMenuModel", "Lcom/kubi/quotefacade/entity/AlphaMenuModel;", "<init>", "(Lcom/kubi/quotefacade/entity/AlphaMenuModel;)V", "getAlphaMenuModel", "()Lcom/kubi/quotefacade/entity/AlphaMenuModel;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C21611a implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final AlphaMenuModel f41176a;

    public C21611a(@NotNull AlphaMenuModel alphaMenuModel) {
        Intrinsics.checkNotNullParameter(alphaMenuModel, "alphaMenuModel");
        this.f41176a = alphaMenuModel;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AlphaMenuModel getF41176a() {
        return this.f41176a;
    }
}
