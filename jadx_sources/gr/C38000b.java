package gr;

import androidx.media3.exoplayer.upstream.CmcdData;
import er.InterfaceC37236a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kr.InterfaceC41973a;
import kr.InterfaceC41974b;
import kr.InterfaceC41975c;
import lr.C42294a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gr.b */
/* JADX INFO: compiled from: SubscribeCallAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jg\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\"\b\b\u0000\u0010\u0007*\u00020\u0006\"\b\b\u0001\u0010\b*\u00020\u0006\"\b\b\u0002\u0010\t*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lgr/b;", "Lkr/b;", "Ler/a;", "client", "<init>", "(Ler/a;)V", "", "ResponseIn", "ResponseOut", "ResponseStream", "Ljava/lang/reflect/Type;", "returnType", "Lkotlin/Function1;", "Lkr/c;", "convertBuilder", "Lkr/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/reflect/Type;Lkotlin/jvm/functions/Function1;)Lkr/a;", "Ler/a;", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38000b implements InterfaceC41974b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37236a client;

    public C38000b(@NotNull InterfaceC37236a client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // kr.InterfaceC41974b
    @NotNull
    /* JADX INFO: renamed from: a */
    public <ResponseIn, ResponseOut, ResponseStream> InterfaceC41973a<ResponseIn, ResponseOut, ResponseStream> mo85874a(@NotNull Type returnType, @NotNull Function1<? super Type, ? extends InterfaceC41975c<ResponseIn, ResponseOut>> convertBuilder) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(convertBuilder, "convertBuilder");
        Class<?> clsM92828c = C42294a.m92828c(returnType);
        Intrinsics.checkNotNullExpressionValue(clsM92828c, "getRawType(returnType)");
        if (!Intrinsics.areEqual(clsM92828c, InterfaceC41634e.class)) {
            throw new IllegalStateException("only support flow type");
        }
        if (!(returnType instanceof ParameterizedType)) {
            throw new IllegalStateException("Flow return type must be parameterized as Flow<Foo> or Flow<? extends Foo>");
        }
        InterfaceC37236a interfaceC37236a = this.client;
        Type typeM92827b = C42294a.m92827b(0, (ParameterizedType) returnType);
        Intrinsics.checkNotNullExpressionValue(typeM92827b, "getParameterUpperBound(0, returnType)");
        return new C37999a(interfaceC37236a, convertBuilder.invoke(typeM92827b));
    }
}
