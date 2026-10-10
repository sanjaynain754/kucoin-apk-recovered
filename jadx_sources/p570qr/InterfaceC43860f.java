package p570qr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkRequest;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qr.f */
/* JADX INFO: compiled from: IChannelCodec.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0006\u001a\u00020\u0001H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lqr/f;", "", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "b", "(Lcom/kubi/network/api/model/NetworkRequest;)Ljava/lang/Object;", "message", "Lqr/k;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Lqr/k;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC43860f {

    /* JADX INFO: renamed from: qr.f$a */
    /* JADX INFO: compiled from: IChannelCodec.kt */
    /* JADX INFO: loaded from: classes64.dex */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        @NotNull
        /* JADX INFO: renamed from: a */
        public static JSONObject m96631a(@NotNull InterfaceC43860f interfaceC43860f, @NotNull Pair<String, ? extends Object>... pairs) throws JSONException {
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            JSONObject jSONObject = new JSONObject();
            for (Pair<String, ? extends Object> pair : pairs) {
                if (pair.getSecond() != null) {
                    jSONObject.put(pair.getFirst(), pair.getSecond());
                }
            }
            return jSONObject;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    C43865k<?> mo42990a(@NotNull Object message) throws IOException;

    @NotNull
    /* JADX INFO: renamed from: b */
    Object mo42991b(@NotNull NetworkRequest request) throws IOException;
}
