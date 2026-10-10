package il;

import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: il.k */
/* JADX INFO: compiled from: RequestLimitInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/ResponseWrap;", "", "response", "Lokhttp3/Response;", "<init>", "(Lokhttp3/Response;)V", "type", "Lokhttp3/MediaType;", "content", "", "receivedResponseAtMillis", "", "get", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRequestLimitInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestLimitInterceptor.kt\ncom/kubi/kucoin/interceptor/ResponseWrap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class C38669k {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Response f86679a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final MediaType f86680b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final byte[] f86681c;

    public C38669k(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f86679a = response;
        ResponseBody responseBodyBody = response.body();
        this.f86680b = responseBodyBody != null ? responseBodyBody.get$contentType() : null;
        ResponseBody responseBodyBody2 = response.body();
        this.f86681c = responseBodyBody2 != null ? responseBodyBody2.bytes() : null;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Response m87404a() {
        Response.Builder builderNewBuilder = this.f86679a.newBuilder();
        byte[] bArr = this.f86681c;
        return builderNewBuilder.body(bArr != null ? ResponseBody.INSTANCE.create(bArr, this.f86680b) : null).build();
    }

    /* JADX INFO: renamed from: b */
    public final long m87405b() {
        return this.f86679a.receivedResponseAtMillis();
    }
}
