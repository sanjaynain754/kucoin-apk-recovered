package x50;

import com.kubi.tradingbotkit.widget.entity.RobotWidgetEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* JADX INFO: renamed from: x50.a */
/* JADX INFO: compiled from: RobotWidgetApi.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H§@¢\u0006\u0002\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradingbotkit/widget/api/RobotWidgetApi;", "", "fetchRobotWidgetData", "", "Lcom/kubi/tradingbotkit/widget/entity/RobotWidgetEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46081a {
    @GET("v1/robot/task/rank/daily-picks")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m101592a(@NotNull Continuation<? super List<RobotWidgetEntity>> continuation) throws Throwable;
}
