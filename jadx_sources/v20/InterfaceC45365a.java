package v20;

import com.kubi.spot.dialog.order.AmendApi;
import com.kubi.spot.dialog.order.model.AmendParams;
import com.kubi.spot.dialog.order.model.AmendResult;
import com.kubi.spot.dialog.order.precheck.AmendPreCheck;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: v20.a */
/* JADX INFO: compiled from: AmendBizStrategy.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J0\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH¦@¢\u0006\u0002\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/strategy/AmendBizStrategy;", "", "getBizValidators", "", "Lcom/kubi/spot/dialog/order/precheck/AmendPreCheck;", "executeAmend", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/spot/dialog/order/model/AmendResult;", "api", "Lcom/kubi/spot/dialog/order/AmendApi;", "payload", "Lcom/kubi/spot/dialog/order/model/AmendParams;", "validationToken", "", "(Lcom/kubi/spot/dialog/order/AmendApi;Lcom/kubi/spot/dialog/order/model/AmendParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45365a {
    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo100266a(@NotNull AmendApi amendApi, @NotNull AmendParams amendParams, @Nullable String str, @NotNull Continuation<? super InterfaceC41634e<AmendResult>> continuation);

    @NotNull
    /* JADX INFO: renamed from: b */
    List<AmendPreCheck> mo100267b();
}
