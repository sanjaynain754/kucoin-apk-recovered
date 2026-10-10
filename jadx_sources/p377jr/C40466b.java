package p377jr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.restful.C19322c;
import java.lang.reflect.Type;
import kr.InterfaceC41975c;
import kr.InterfaceC41976d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jr.b */
/* JADX INFO: compiled from: DefaultConvertAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Ljr/b;", "Lkr/d;", "<init>", "()V", "ResponseIn", "ResponseOut", "Lcom/kubi/network/restful/c;", "request", "Ljava/lang/reflect/Type;", "type", "Lkr/c;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/restful/c;Ljava/lang/reflect/Type;)Lkr/c;", "network-adapter-restful_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C40466b implements InterfaceC41976d {
    @Override // kr.InterfaceC41976d
    @NotNull
    /* JADX INFO: renamed from: a */
    public <ResponseIn, ResponseOut> InterfaceC41975c<ResponseIn, ResponseOut> mo85877a(@NotNull C19322c request, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(type, "type");
        return new C40465a(request, type);
    }
}
