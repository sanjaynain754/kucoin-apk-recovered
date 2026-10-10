package com.kubi.jsbridge.impl.network;

import com.kubi.network.api.subscribe.model.SubscribeMessage;
import hr.InterfaceC38288a;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.jsbridge.impl.network.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCJSWebSocket.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/network/IKrnSocketWsApi;", "", "subscribe", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "topic", "", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IKrnSocketWsApi {
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<SubscribeMessage> m31820a(@InterfaceC38288a @NotNull String str);
}
