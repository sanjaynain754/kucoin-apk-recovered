package com.kubi.network.api.subscribe.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkRequest;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.network.api.subscribe.model.SubscribeRequest;
import er.InterfaceC37236a;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.network.api.subscribe.utils.a */
/* JADX INFO: compiled from: ChannelUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/network/api/subscribe/utils/a;", "", "<init>", "()V", "Ler/a;", "client", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "Lkotlinx/coroutines/flow/e;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ler/a;Lcom/kubi/network/api/model/NetworkRequest;)Lkotlinx/coroutines/flow/e;", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19315a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19315a f35838a = new C19315a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC41634e<SubscribeMessage> m42746a(@NotNull InterfaceC37236a client, @NotNull NetworkRequest request) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(request, "request");
        if (!(request instanceof SubscribeRequest)) {
            throw new IllegalArgumentException("only support subscribe request");
        }
        SubscribeRequest subscribeRequest = (SubscribeRequest) request;
        return ChannelUtilsKt.m42745i(client, subscribeRequest, C19316b.m42747m(C19316b.f35839a, subscribeRequest, null, 2, null));
    }
}
