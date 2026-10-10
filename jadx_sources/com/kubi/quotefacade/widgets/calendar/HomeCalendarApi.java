package com.kubi.quotefacade.widgets.calendar;

import com.kubi.quotefacade.widgets.calendar.entity.HomeCalendarEventEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.quotefacade.widgets.calendar.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HomeCalendarApi.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarApi;", "", "getCalendarEventList", "", "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;", "startTime", "", "endTime", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface HomeCalendarApi {
    @GET("/app/calendar_event/events")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m53393a(@Query("startTime") long j11, @Query("endTime") long j12, @NotNull Continuation<? super List<HomeCalendarEventEntity>> continuation) throws Exception;
}
