package com.kubi.network.retrofit.adapter;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.retrofit.exception.DataNullException;
import java.lang.reflect.Type;
import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: compiled from: FlowCallAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/network/retrofit/adapter/FlowCallAdapter;", "R", "Lretrofit2/CallAdapter;", "Lkotlinx/coroutines/flow/e;", "Ljava/lang/reflect/Type;", "type", "<init>", "(Ljava/lang/reflect/Type;)V", "Lretrofit2/Call;", "call", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lretrofit2/Call;)Lkotlinx/coroutines/flow/e;", "responseType", "()Ljava/lang/reflect/Type;", "Ljava/lang/reflect/Type;", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FlowCallAdapter<R> implements CallAdapter<R, InterfaceC41634e<? extends R>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Type type;

    /* JADX INFO: renamed from: com.kubi.network.retrofit.adapter.FlowCallAdapter$adapt$1 */
    /* JADX INFO: compiled from: FlowCallAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"R", "Lkotlinx/coroutines/channels/m;", "", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
    @DebugMetadata(m90121c = "com.kubi.network.retrofit.adapter.FlowCallAdapter$adapt$1", m90122f = "FlowCallAdapter.kt", m90123i = {}, m90124l = {42}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C193231 extends SuspendLambda implements Function2<InterfaceC41574m<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Call<R> $call;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.kubi.network.retrofit.adapter.FlowCallAdapter$adapt$1$a */
        /* JADX INFO: compiled from: FlowCallAdapter.kt */
        @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"com/kubi/network/retrofit/adapter/FlowCallAdapter$adapt$1$a", "Lretrofit2/Callback;", "Lretrofit2/Call;", "call", "Lretrofit2/Response;", "response", "", "onResponse", "(Lretrofit2/Call;Lretrofit2/Response;)V", "", "t", "onFailure", "(Lretrofit2/Call;Ljava/lang/Throwable;)V", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class a implements Callback<R> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC41574m<R> f35939b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC41574m<? super R> interfaceC41574m) {
                this.f35939b = interfaceC41574m;
            }

            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<R> call, @NotNull Throwable t11) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t11, "t");
                this.f35939b.mo90553F(t11);
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<R> call, @NotNull Response<R> response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!response.isSuccessful()) {
                    this.f35939b.mo90553F(new HttpException(response));
                    return;
                }
                if (response.body() == null) {
                    this.f35939b.mo90553F(new DataNullException(call.request().url().getUrl()));
                    return;
                }
                InterfaceC41574m<R> interfaceC41574m = this.f35939b;
                R rBody = response.body();
                Intrinsics.checkNotNull(rBody);
                interfaceC41574m.mo90594e(rBody);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C193231(Call<R> call, Continuation<? super C193231> continuation) {
            super(2, continuation);
            this.$call = call;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C193231 c193231 = new C193231(this.$call, continuation);
            c193231.L$0 = obj;
            return c193231;
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41574m<? super R> interfaceC41574m, @Nullable Continuation<? super Unit> continuation) {
            return ((C193231) create(interfaceC41574m, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41574m interfaceC41574m = (InterfaceC41574m) this.L$0;
                this.$call.enqueue(new a(interfaceC41574m));
                final Call<R> call = this.$call;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: com.kubi.network.retrofit.adapter.FlowCallAdapter.adapt.1.2
                    @Override // p852kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        call.cancel();
                    }
                };
                this.label = 1;
                if (ProduceKt.m90681a(interfaceC41574m, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public FlowCallAdapter(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }

    @Override // retrofit2.CallAdapter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC41634e<R> adapt(@NotNull Call<R> call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return C41636g.m90913f(new C193231(call, null));
    }

    @Override // retrofit2.CallAdapter
    @NotNull
    /* JADX INFO: renamed from: responseType, reason: from getter */
    public Type getType() {
        return this.type;
    }
}
