package p377jr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkResponse;
import com.kubi.network.restful.C19322c;
import com.kubi.utils.C27099x;
import java.lang.reflect.Type;
import kr.InterfaceC41975c;
import lr.C42294a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jr.a */
/* JADX INFO: compiled from: DefaultConvertAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u0004\u0018\u00018\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Ljr/a;", "ResponseIn", "ResponseOut", "Lkr/c;", "Lcom/kubi/network/restful/c;", "request", "Ljava/lang/reflect/Type;", "type", "<init>", "(Lcom/kubi/network/restful/c;Ljava/lang/reflect/Type;)V", "value", "convert", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/kubi/network/api/model/NetworkResponse;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/api/model/NetworkResponse;)Ljava/lang/Object;", "Lcom/kubi/network/restful/c;", "b", "Ljava/lang/reflect/Type;", "network-adapter-restful_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C40465a<ResponseIn, ResponseOut> implements InterfaceC41975c<ResponseIn, ResponseOut> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C19322c request;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Type type;

    public C40465a(@NotNull C19322c request, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(type, "type");
        this.request = request;
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final ResponseOut m89113a(NetworkResponse<?> value) {
        if (Intrinsics.areEqual(C42294a.m92828c(this.type), NetworkResponse.class)) {
            return value;
        }
        Object data = value.getData();
        Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
        return (ResponseOut) C27099x.m66914d((String) data, this.type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kr.InterfaceC41975c
    @Nullable
    public ResponseOut convert(ResponseIn value) {
        if (value instanceof NetworkResponse) {
            return m89113a((NetworkResponse) value);
        }
        return null;
    }
}
