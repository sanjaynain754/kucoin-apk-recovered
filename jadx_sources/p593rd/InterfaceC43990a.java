package p593rd;

import com.kubi.core.biz.loan.entity.MarginLeverageEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: rd.a */
/* JADX INFO: compiled from: ILoanApi.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/loan/ILoanApi;", "", "fetchMarginLeverageBySymbol", "", "Lcom/kubi/core/biz/loan/entity/MarginLeverageEntity;", "symbol", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC43990a {
    @GET("ultra-loan/unified/inner/loan/get-margin-symbol-list")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m96948a(@NotNull @Query("symbol") String str, @NotNull Continuation<? super List<MarginLeverageEntity>> continuation) throws Throwable;
}
