package vi;

import com.kubi.helpcenter.entity.BotTypeEntity;
import com.kubi.helpcenter.entity.QueryBotTypeParams;
import com.kubi.helpcenter.entity.WorkOrderParams;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: renamed from: vi.a */
/* JADX INFO: compiled from: HelpCenterApi.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\tH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/helpcenter/api/HelpCenterApi;", "", "queryBotType", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/helpcenter/entity/BotTypeEntity;", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/helpcenter/entity/QueryBotTypeParams;", "queryWorkOrderUrl", "", "Lcom/kubi/helpcenter/entity/WorkOrderParams;", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45554a {
    @POST("v1/intelligent-bot-server/api/open/index/ticket")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<String> m100607a(@Body @NotNull WorkOrderParams workOrderParams);

    @POST("v1/intelligent-bot-server/api/open/index/entry")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<BotTypeEntity> m100608b(@Body @NotNull QueryBotTypeParams queryBotTypeParams);
}
