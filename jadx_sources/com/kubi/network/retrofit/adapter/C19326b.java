package com.kubi.network.retrofit.adapter;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.IOException;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: renamed from: com.kubi.network.retrofit.adapter.b */
/* JADX INFO: compiled from: SyncCallAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u0004\u0018\u00018\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/network/retrofit/adapter/b;", "R", "Lretrofit2/CallAdapter;", "Ljava/lang/reflect/Type;", "type", "<init>", "(Ljava/lang/reflect/Type;)V", "Lretrofit2/Call;", "call", "adapt", "(Lretrofit2/Call;)Ljava/lang/Object;", "responseType", "()Ljava/lang/reflect/Type;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/reflect/Type;", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19326b<R> implements CallAdapter<R, R> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Type type;

    public C19326b(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }

    @Override // retrofit2.CallAdapter
    @Nullable
    public R adapt(@NotNull Call<R> call) throws IOException {
        Intrinsics.checkNotNullParameter(call, "call");
        Response<R> responseExecute = call.execute();
        if (responseExecute.isSuccessful()) {
            return responseExecute.body();
        }
        throw new HttpException(responseExecute);
    }

    @Override // retrofit2.CallAdapter
    @NotNull
    /* JADX INFO: renamed from: responseType, reason: from getter */
    public Type getType() {
        return this.type;
    }
}
