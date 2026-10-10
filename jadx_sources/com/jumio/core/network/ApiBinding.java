package com.jumio.core.network;

import com.jumio.core.models.ApiCallDataModel;
import jumio.core.InterfaceC40662g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R$\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/network/ApiBinding;", "Lcom/jumio/core/network/ApiResult;", "bindingClasses", "", "Ljava/lang/Class;", "Lcom/jumio/core/network/ApiCall;", "getBindingClasses", "()[Ljava/lang/Class;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ApiBinding extends InterfaceC40662g {
    @NotNull
    Class<? extends ApiCall<?>>[] getBindingClasses();

    @Override // jumio.core.InterfaceC40662g
    /* synthetic */ void onError(@NotNull ApiCallDataModel apiCallDataModel, @Nullable Throwable th2);

    @Override // jumio.core.InterfaceC40662g
    /* synthetic */ void onResult(@NotNull ApiCallDataModel apiCallDataModel, @Nullable Object obj);
}
