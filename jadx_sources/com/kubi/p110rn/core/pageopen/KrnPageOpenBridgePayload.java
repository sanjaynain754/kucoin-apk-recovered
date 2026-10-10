package com.kubi.p110rn.core.pageopen;

import com.kubi.sdk.performance.pageopen.PageOpenMode;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: KrnPageOpenBridgePayload.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0010\u0011\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/rn/core/pageopen/KrnPageOpenBridgePayload;", "", "rootTag", "", "getRootTag", "()I", "routeKey", "", "getRouteKey", "()Ljava/lang/String;", "pageId", "getPageId", "openMode", "Lcom/kubi/sdk/performance/pageopen/PageOpenMode;", "getOpenMode", "()Lcom/kubi/sdk/performance/pageopen/PageOpenMode;", "Lcom/kubi/rn/core/pageopen/KrnPageOpenBindPayload;", "Lcom/kubi/rn/core/pageopen/KrnPageOpenDataReadyPayload;", "Lcom/kubi/rn/core/pageopen/KrnPageOpenFinishPayload;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface KrnPageOpenBridgePayload {
    @NotNull
    PageOpenMode getOpenMode();

    @NotNull
    String getPageId();

    int getRootTag();

    @NotNull
    String getRouteKey();
}
