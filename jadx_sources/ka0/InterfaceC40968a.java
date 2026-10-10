package ka0;

import androidx.media3.exoplayer.upstream.CmcdData;
import la0.C42144a;
import la0.C42145b;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: renamed from: ka0.a */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J=\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lka0/a;", "", "", "orderPublicId", "acceptHeader", "contentTypeHeader", "Lla0/a;", "payload", "Lretrofit2/Call;", "Lla0/b;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lla0/a;)Lretrofit2/Call;", "transactionToken", "Lokhttp3/ResponseBody;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
public interface InterfaceC40968a {
    @POST("/transactions/token/{transactionToken}/rev-payment-accept")
    @NotNull
    /* JADX INFO: renamed from: a */
    Call<ResponseBody> m89721a(@Path("transactionToken") @NotNull String transactionToken, @Header("Accept") @NotNull String acceptHeader, @Header("Content-Type") @NotNull String contentTypeHeader);

    @POST("/orders/token/{orderPublicId}/authenticate/revolut")
    @NotNull
    /* JADX INFO: renamed from: b */
    Call<C42145b> m89722b(@Path("orderPublicId") @NotNull String orderPublicId, @Header("Accept") @NotNull String acceptHeader, @Header("Content-Type") @NotNull String contentTypeHeader, @Body @NotNull C42144a payload);
}
