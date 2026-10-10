package gr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.subscribe.model.SubscribeRequest;
import com.kubi.network.api.subscribe.utils.C19316b;
import com.kubi.network.api.subscribe.utils.ChannelUtilsKt;
import com.kubi.network.restful.C19322c;
import er.InterfaceC37236a;
import hr.C38293f;
import java.lang.reflect.Type;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.rx2.RxConvertKt;
import kr.InterfaceC41973a;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: gr.f */
/* JADX INFO: compiled from: SubscribeCallAdapter.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00028\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lgr/f;", "", "ResponseIn", "ResponseOut", "ResponseStream", "Lkr/a;", "Ler/a;", "client", "Lkr/c;", "convert", "<init>", "(Ler/a;Lkr/c;)V", "Lcom/kubi/network/restful/c;", "request", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/restful/c;)Ljava/lang/Object;", "Ler/a;", "b", "Lkr/c;", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSubscribeCallAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscribeCallAdapter.kt\ncom/kubi/network/api/subscribe/adapter/RxJavaSubscribeCallAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class C38004f<ResponseIn, ResponseOut, ResponseStream> implements InterfaceC41973a<ResponseIn, ResponseOut, ResponseStream> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37236a client;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41975c<ResponseIn, ResponseOut> convert;

    public C38004f(@NotNull InterfaceC37236a client, @NotNull InterfaceC41975c<ResponseIn, ResponseOut> convert) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(convert, "convert");
        this.client = client;
        this.convert = convert;
    }

    @Override // kr.InterfaceC41973a
    @NotNull
    /* JADX INFO: renamed from: a */
    public ResponseStream mo85873a(@NotNull C19322c request) {
        Intrinsics.checkNotNullParameter(request, "request");
        InterfaceC37236a interfaceC37236a = this.client;
        C19316b c19316b = C19316b.f35839a;
        SubscribeRequest subscribeRequestM42754g = c19316b.m42754g(request);
        InterfaceC41975c<ResponseIn, ResponseOut> interfaceC41975cM42748a = c19316b.m42748a(request);
        if (interfaceC41975cM42748a == null) {
            interfaceC41975cM42748a = this.convert;
        }
        Intrinsics.checkNotNull(interfaceC41975cM42748a, "null cannot be cast to non-null type com.kubi.network.restful.core.IConverter<com.kubi.network.api.subscribe.model.SubscribeMessage, ResponseOut of com.kubi.network.api.subscribe.adapter.RxJavaSubscribeCallAdapter>");
        C38293f c38293fM42750c = c19316b.m42750c(request);
        InterfaceC41668m interfaceC41668mM86422f = c38293fM42750c != null ? c38293fM42750c.m86422f() : null;
        Type typeM42752e = c19316b.m42752e(request);
        ResponseStream responsestream = (ResponseStream) RxConvertKt.m91207d(ChannelUtilsKt.m42737a(interfaceC37236a, subscribeRequestM42754g, interfaceC41975cM42748a, interfaceC41668mM86422f, typeM42752e != null ? new C38007i(typeM42752e) : null), null, 1, null);
        Intrinsics.checkNotNull(responsestream, "null cannot be cast to non-null type ResponseStream of com.kubi.network.api.subscribe.adapter.RxJavaSubscribeCallAdapter");
        return responsestream;
    }
}
