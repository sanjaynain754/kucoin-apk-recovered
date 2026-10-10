package com.kubi.network.api.subscribe.adapter;

import gr.C38002d;
import io.reactivex.Completable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* JADX INFO: compiled from: PeriodCallAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/network/api/subscribe/adapter/PeriodCallAdapterFactory;", "Lretrofit2/CallAdapter$Factory;", "<init>", "()V", "Ljava/lang/reflect/Type;", "returnType", "", "", "annotations", "Lretrofit2/Retrofit;", "retrofit", "Lretrofit2/CallAdapter;", "get", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/CallAdapter;", "b", "Companion", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class PeriodCallAdapterFactory extends CallAdapter.Factory {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: PeriodCallAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/network/api/subscribe/adapter/PeriodCallAdapterFactory$Companion;", "", "()V", "create", "Lcom/kubi/network/api/subscribe/adapter/PeriodCallAdapterFactory;", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final PeriodCallAdapterFactory create() {
            return new PeriodCallAdapterFactory();
        }
    }

    @Override // retrofit2.CallAdapter.Factory
    @NotNull
    public CallAdapter<?, ?> get(@NotNull Type returnType, @NotNull Annotation[] annotations, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return Intrinsics.areEqual(CallAdapter.Factory.getRawType(returnType), Completable.class) ? new C38002d(Void.class) : new C38002d(returnType);
    }
}
