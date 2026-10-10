package com.kubi.notice.lib.api;

import com.kubi.notice.lib.entity.MessageUnreadSum;
import com.kubi.notice.lib.entity.Unread;
import com.kubi.notice.notice.NoticeDialogEntity;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.welfare.api.entity.RemainAwardNumEntity;
import io.reactivex.Observable;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: renamed from: com.kubi.notice.lib.api.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: INoticeApi.kt */
/* JADX INFO: loaded from: classes30.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003H'J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H'J\u001a\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\u000f0\u000eH'J \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f0\u000e2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\nH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/notice/lib/api/INoticeApi;", "", "getMessageUnreadSum", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/notice/lib/entity/MessageUnreadSum;", "getMessageUnread", "", "Lcom/kubi/notice/lib/entity/Unread;", "setMessageRead", "letterIds", "", "remainAwardNum", "Lcom/kubi/welfare/api/entity/RemainAwardNumEntity;", "getNoticeContent", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/notice/notice/NoticeDialogEntity;", "markReadNotice", "id", "NoticeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface INoticeApi {
    @GET("v1/promotion/not-received-num")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<RemainAwardNumEntity> m43156a();

    @GET("v1/message-center/letter/unread")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<List<Unread>> m43157b();

    @GET("v1/notice/content")
    @NotNull
    /* JADX INFO: renamed from: c */
    Observable<BaseEntity<List<NoticeDialogEntity>>> m43158c();

    @POST("v1/message-center/letter/read")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<Object> m43159d(@Body @NotNull List<String> list);

    @GET("v1/message-center/letter/unread/sum2")
    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC41634e<MessageUnreadSum> m43160e();

    @FormUrlEncoded
    @POST("v1/notice/mark-read")
    @NotNull
    /* JADX INFO: renamed from: f */
    Observable<BaseEntity<Object>> m43161f(@Field("id") @Nullable String str);
}
