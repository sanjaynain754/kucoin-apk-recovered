package p764xk;

import androidx.media3.extractor.text.ttml.TtmlNode;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xk.a, reason: from toString */
/* JADX INFO: compiled from: INetBusinessErrorReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kucoin/callback/BizErrorInfo;", "", "request", "Lokhttp3/Request;", TtmlNode.TAG_BODY, "Lorg/json/JSONObject;", "<init>", "(Lokhttp3/Request;Lorg/json/JSONObject;)V", "getRequest", "()Lokhttp3/Request;", "getBody", "()Lorg/json/JSONObject;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BizErrorInfo {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final Request request;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final JSONObject body;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BizErrorInfo)) {
            return false;
        }
        BizErrorInfo bizErrorInfo = (BizErrorInfo) other;
        return Intrinsics.areEqual(this.request, bizErrorInfo.request) && Intrinsics.areEqual(this.body, bizErrorInfo.body);
    }

    public BizErrorInfo(@NotNull Request request, @NotNull JSONObject body) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(body, "body");
        this.request = request;
        this.body = body;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final JSONObject getBody() {
        return this.body;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Request getRequest() {
        return this.request;
    }

    public int hashCode() {
        return (this.request.hashCode() * 31) + this.body.hashCode();
    }

    @NotNull
    public String toString() {
        return "BizErrorInfo(request=" + this.request + ", body=" + this.body + ')';
    }
}
