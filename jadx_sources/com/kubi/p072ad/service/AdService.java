package com.kubi.p072ad.service;

import com.kubi.p072ad.api.entity.ResAdEntity;
import com.kubi.p072ad.api.service.IAdService;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.kubi.ad.service.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AdService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/ad/service/AdService;", "Lcom/kubi/ad/api/service/IAdService;", "<init>", "()V", "fetchResourceAd", "", "Lcom/kubi/ad/api/entity/ResAdEntity;", "code", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AdLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AdService implements IAdService {
    @Override // com.kubi.p072ad.api.service.IAdService
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo14647a(@NotNull String str, @NotNull Continuation<? super List<ResAdEntity>> continuation) {
        return AdManager.f14936a.m14650c(str, continuation);
    }
}
