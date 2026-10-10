package ja0;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.revolut.revolutpay.data.OrderStateDto;
import com.revolut.revolutpay.data.SessionDto;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: renamed from: ja0.a */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lja0/a;", "", "", "bearer", "orderToken", "Lretrofit2/Call;", "Lcom/revolut/revolutpay/data/SessionDto;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;", "Lcom/revolut/revolutpay/data/OrderStateDto;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Lretrofit2/Call;", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
public interface InterfaceC40359a {
    @GET("/orders/token/{order_token}")
    @NotNull
    /* JADX INFO: renamed from: a */
    Call<OrderStateDto> m88944a(@Path("order_token") @NotNull String orderToken);

    @POST("/api/revolut-pay/orders/{order_token}/sessions")
    @NotNull
    /* JADX INFO: renamed from: b */
    Call<SessionDto> m88945b(@Header("Authorization") @NotNull String bearer, @Path("order_token") @NotNull String orderToken);
}
