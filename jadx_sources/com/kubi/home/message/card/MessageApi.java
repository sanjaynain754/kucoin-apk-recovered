package com.kubi.home.message.card;

import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.home.message.card.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MessageApi.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0010\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0003H'J\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/message/card/MessageApi;", "", "modifyMessageStatus", "Lkotlinx/coroutines/flow/Flow;", ReportDataTable.COLUMN_PARAMS, "", "", "deleteMessageBox", "getMessageConfig", "", "Lcom/kubi/home/message/card/NoticeConfigEntity;", "getMessageData", "Lcom/kubi/home/message/card/MessageBoxData;", "code", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface MessageApi {
    @POST("v1/homepage/message-box/read")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<Object> m29552a(@Body @NotNull Map<String, String> map);

    @GET("v1/message-center/subscribe")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<List<NoticeConfigEntity>> m29553b();

    @GET("v1/homepage/card")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<MessageBoxData> m29554c(@Nullable @Query("code") String str);

    @POST("v1/homepage/message-box/cancel")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<Object> m29555d();

    /* JADX INFO: renamed from: e */
    static /* synthetic */ InterfaceC41634e m29551e(MessageApi messageApi, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMessageData");
        }
        if ((i11 & 1) != 0) {
            str = "messageBox";
        }
        return messageApi.m29554c(str);
    }
}
