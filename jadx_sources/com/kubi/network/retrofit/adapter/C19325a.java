package com.kubi.network.retrofit.adapter;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.reflect.Type;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* JADX INFO: renamed from: com.kubi.network.retrofit.adapter.a */
/* JADX INFO: compiled from: RequestCallAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/network/retrofit/adapter/a;", "R", "Lretrofit2/CallAdapter;", "Lokhttp3/Request;", "Ljava/lang/reflect/Type;", "type", "<init>", "(Ljava/lang/reflect/Type;)V", "Lretrofit2/Call;", "call", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lretrofit2/Call;)Lokhttp3/Request;", "responseType", "()Ljava/lang/reflect/Type;", "Ljava/lang/reflect/Type;", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19325a<R> implements CallAdapter<R, Request> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Type type;

    public C19325a(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }

    @Override // retrofit2.CallAdapter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Request adapt(@NotNull Call<R> call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Request request = call.request();
        Intrinsics.checkNotNullExpressionValue(request, "call.request()");
        return request;
    }

    @Override // retrofit2.CallAdapter
    @NotNull
    /* JADX INFO: renamed from: responseType, reason: from getter */
    public Type getType() {
        return this.type;
    }
}
