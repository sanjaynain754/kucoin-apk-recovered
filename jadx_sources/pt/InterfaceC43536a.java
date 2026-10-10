package pt;

import com.kubi.payment.chat.entity.ChatInfo;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: pt.a */
/* JADX INFO: compiled from: ChatApi.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/chat/api/ChatApi;", "", "getOtcIm", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/payment/chat/entity/ChatInfo;", "orderId", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC43536a {
    @GET("v4/otc/im/getImRelationship")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<ChatInfo> m95806a(@NotNull @Query("orderId") String str);
}
