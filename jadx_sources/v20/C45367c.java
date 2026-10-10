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
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: v20.c */
/* JADX INFO: compiled from: SpotAmendStrategy.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/spot/dialog/order/strategy/SpotAmendStrategy;", "Lcom/kubi/spot/dialog/order/strategy/AmendBizStrategy;", "<init>", "()V", "getBizValidators", "", "Lcom/kubi/spot/dialog/order/precheck/AmendPreCheck;", "executeAmend", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/spot/dialog/order/model/AmendResult;", "api", "Lcom/kubi/spot/dialog/order/AmendApi;", "payload", "Lcom/kubi/spot/dialog/order/model/AmendParams;", "validationToken", "", "(Lcom/kubi/spot/dialog/order/AmendApi;Lcom/kubi/spot/dialog/order/model/AmendParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45367c implements InterfaceC45365a {
    @Override // v20.InterfaceC45365a
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo100266a(@NotNull AmendApi amendApi, @NotNull AmendParams amendParams, @Nullable String str, @NotNull Continuation<? super InterfaceC41634e<AmendResult>> continuation) {
        return (str == null || str.length() == 0) ? amendApi.m61723c(amendParams) : amendApi.m61722b(amendParams, str);
    }

    @Override // v20.InterfaceC45365a
    @NotNull
    /* JADX INFO: renamed from: b */
    public List<AmendPreCheck> mo100267b() {
        return CollectionsKt.emptyList();
    }
}
