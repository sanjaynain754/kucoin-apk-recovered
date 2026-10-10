package p441lz;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.lib.kunlun.sdk.network.KunlunReportEvents;
import com.kubi.sdk.lib.kunlun.sdk.network.KunlunResponse;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: lz.a */
/* JADX INFO: compiled from: KunlunAPI.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Llz/a;", "", "Lcom/kubi/sdk/lib/kunlun/sdk/network/KunlunReportEvents;", "kunlunReportEvents", "Lcom/kubi/sdk/lib/kunlun/sdk/network/KunlunResponse;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/sdk/lib/kunlun/sdk/network/KunlunReportEvents;)Lcom/kubi/sdk/lib/kunlun/sdk/network/KunlunResponse;", "kunlun-sdk_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC42330a {
    @POST("v1/frontend/events/upload")
    @NotNull
    /* JADX INFO: renamed from: a */
    KunlunResponse m92878a(@Body @NotNull KunlunReportEvents kunlunReportEvents);
}
