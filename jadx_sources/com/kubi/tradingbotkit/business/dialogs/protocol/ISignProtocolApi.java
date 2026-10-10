package com.kubi.tradingbotkit.business.dialogs.protocol;

import com.kubi.tradingbotkit.business.dialogs.protocol.model.SignProtocolRequestBody;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: com.kubi.tradingbotkit.business.dialogs.protocol.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ISignProtocolApi.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\u001a\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/dialogs/protocol/ISignProtocolApi;", "", "requestProtocols", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/ArrayList;", "Lcom/kubi/tradingbotkit/business/dialogs/protocol/model/Protocol;", "Lkotlin/collections/ArrayList;", "templateId", "", "signProtocols", "requestBody", "Lcom/kubi/tradingbotkit/business/dialogs/protocol/model/SignProtocolRequestBody;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ISignProtocolApi {
    @POST("v1/robot/user/terms/sign")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<Object> m63977a(@Body @NotNull SignProtocolRequestBody signProtocolRequestBody);
}
