package com.kubi.network.socket.core;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkRequest;
import com.kubi.network.api.model.NetworkResponse;
import fr.InterfaceC37581b;
import java.io.IOException;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.network.socket.core.c */
/* JADX INFO: compiled from: InterceptorChain.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\rJ\u001f\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m90084d2 = {"Lcom/kubi/network/socket/core/c;", "Lcom/kubi/network/socket/core/a;", "", "Lcom/kubi/network/socket/core/b;", "interceptors", "", "index", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "Lfr/b;", "call", "<init>", "(Ljava/util/List;ILcom/kubi/network/api/model/NetworkRequest;Lfr/b;)V", "()Lcom/kubi/network/api/model/NetworkRequest;", "Lcom/kubi/network/api/model/NetworkResponse;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/api/model/NetworkRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(ILcom/kubi/network/api/model/NetworkRequest;)Lcom/kubi/network/socket/core/c;", "Ljava/util/List;", "getInterceptors$network_core_socket_release", "()Ljava/util/List;", "I", "getIndex$network_core_socket_release", "()I", "c", "Lcom/kubi/network/api/model/NetworkRequest;", "getRequest$network_core_socket_release", "d", "Lfr/b;", "getCall$network_core_socket_release", "()Lfr/b;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19357c implements InterfaceC19355a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC19356b> interceptors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final NetworkRequest request;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37581b call;

    public C19357c(@NotNull List<InterfaceC19356b> interceptors, int i11, @NotNull NetworkRequest request, @NotNull InterfaceC37581b call) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(call, "call");
        this.interceptors = interceptors;
        this.index = i11;
        this.request = request;
        this.call = call;
    }

    @Override // com.kubi.network.socket.core.InterfaceC19355a
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo42946a(@NotNull NetworkRequest networkRequest, @NotNull Continuation<? super NetworkResponse<?>> continuation) throws IOException {
        if (this.call.isCancelled()) {
            throw new IOException("request is cancelled");
        }
        return this.interceptors.get(this.index).mo42947a(m42948b(this.index + 1, networkRequest), continuation);
    }

    /* JADX INFO: renamed from: b */
    public final C19357c m42948b(int index, NetworkRequest request) {
        return new C19357c(this.interceptors, index, request, this.call);
    }

    @Override // com.kubi.network.socket.core.InterfaceC19355a
    @NotNull
    /* JADX INFO: renamed from: request, reason: from getter */
    public NetworkRequest getRequest() {
        return this.request;
    }
}
