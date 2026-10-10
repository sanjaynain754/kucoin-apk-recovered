package com.kubi.network.socket.core;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkRequest;
import com.kubi.network.api.model.NetworkResponse;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.kubi.network.socket.core.a */
/* JADX INFO: compiled from: IChain.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m90084d2 = {"Lcom/kubi/network/socket/core/a;", "", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "()Lcom/kubi/network/api/model/NetworkRequest;", "Lcom/kubi/network/api/model/NetworkResponse;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/api/model/NetworkRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC19355a {
    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo42946a(@NotNull NetworkRequest networkRequest, @NotNull Continuation<? super NetworkResponse<?>> continuation) throws IOException;

    @NotNull
    NetworkRequest request();
}
