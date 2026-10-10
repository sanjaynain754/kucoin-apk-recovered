package ja0;

import com.revolut.revolutpay.api.exceptions.ApiException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: renamed from: ja0.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C40360b<T, R> implements Callback<T> {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function1<T, R> f89636b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function1<R, Unit> f89637c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Function1<Throwable, Unit> f89638d;

    /* JADX WARN: Multi-variable type inference failed */
    public C40360b(@NotNull Function1<? super T, ? extends R> mapper, @NotNull Function1<? super R, Unit> onSuccess, @NotNull Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f89636b = mapper;
        this.f89637c = onSuccess;
        this.f89638d = onError;
    }

    @Override // retrofit2.Callback
    public void onFailure(@NotNull Call<T> call, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f89638d.invoke(throwable);
    }

    @Override // retrofit2.Callback
    public void onResponse(@NotNull Call<T> call, @NotNull Response<T> response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isSuccessful()) {
            this.f89637c.invoke(this.f89636b.invoke(response.body()));
        } else {
            this.f89638d.invoke(new ApiException(response.code(), response.errorBody()));
        }
    }
}
