package com.kubi.network.retrofit.adapter;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlinx.coroutines.flow.InterfaceC41634e;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* JADX INFO: compiled from: MultiCallAdapterFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/network/retrofit/adapter/MultiCallAdapterFactory;", "Lretrofit2/CallAdapter$Factory;", "<init>", "()V", "Ljava/lang/reflect/Type;", "returnType", "", "", "annotations", "Lretrofit2/Retrofit;", "retrofit", "Lretrofit2/CallAdapter;", "get", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/CallAdapter;", "b", "Companion", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class MultiCallAdapterFactory extends CallAdapter.Factory {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: MultiCallAdapterFactory.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/network/retrofit/adapter/MultiCallAdapterFactory$Companion;", "", "()V", "create", "Lcom/kubi/network/retrofit/adapter/MultiCallAdapterFactory;", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MultiCallAdapterFactory create() {
            return new MultiCallAdapterFactory();
        }
    }

    /* JADX INFO: renamed from: com.kubi.network.retrofit.adapter.MultiCallAdapterFactory$a */
    /* JADX INFO: compiled from: MultiCallAdapterFactory.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"com/kubi/network/retrofit/adapter/MultiCallAdapterFactory$a", "Lretrofit2/CallAdapter;", "", "Lretrofit2/Call;", "Ljava/lang/reflect/Type;", "responseType", "()Ljava/lang/reflect/Type;", "call", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lretrofit2/Call;)Lretrofit2/Call;", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C19324a implements CallAdapter<Object, Call<?>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Type f35942a;

        public C19324a(Type type) {
            this.f35942a = type;
        }

        @Override // retrofit2.CallAdapter
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Call<Object> adapt(@NotNull Call<Object> call) {
            Intrinsics.checkNotNullParameter(call, "call");
            return call;
        }

        @Override // retrofit2.CallAdapter
        @NotNull
        /* JADX INFO: renamed from: responseType */
        public Type getType() {
            Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) this.f35942a);
            Intrinsics.checkNotNullExpressionValue(parameterUpperBound, "getParameterUpperBound(0, returnType)");
            return parameterUpperBound;
        }
    }

    @Override // retrofit2.CallAdapter.Factory
    @NotNull
    public CallAdapter<?, ?> get(@NotNull Type returnType, @NotNull Annotation[] annotations, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Class<?> rawType = CallAdapter.Factory.getRawType(returnType);
        if (Intrinsics.areEqual(rawType, Request.class)) {
            return new C19325a(returnType);
        }
        if (Intrinsics.areEqual(rawType, InterfaceC41634e.class)) {
            if (!(returnType instanceof ParameterizedType)) {
                throw new IllegalStateException("Flow return type must be parameterized as Flow<Foo> or Flow<? extends Foo>");
            }
            Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) returnType);
            Intrinsics.checkNotNullExpressionValue(parameterUpperBound, "getParameterUpperBound(0, returnType)");
            return new FlowCallAdapter(parameterUpperBound);
        }
        if (Intrinsics.areEqual(rawType, Call.class)) {
            if (returnType instanceof ParameterizedType) {
                return new C19324a(returnType);
            }
            throw new IllegalStateException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        }
        throw new IllegalStateException("not support return type: " + rawType + ", please use Request、Call or Flow as return type");
    }
}
