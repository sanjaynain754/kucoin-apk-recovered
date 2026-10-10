package com.kubi.quotefacade.widgets.calendar;

import com.kubi.quotefacade.widgets.calendar.entity.HomeCalendarEventEntity;
import com.kubi.utils.extensions.core.C27029c;
import dj.C36719d;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: HomeCalendarRepo.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0011R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarRepo;", "", "<init>", "()V", "api", "Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarApi;", "api$delegate", "Lkotlin/Lazy;", "getEventList", "", "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;", "startSecond", "", "endSecond", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeCalendarRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCalendarRepo.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarRepo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,33:1\n1#2:34\n23#3,2:35\n*S KotlinDebug\n*F\n+ 1 HomeCalendarRepo.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarRepo\n*L\n27#1:35,2\n*E\n"})
public final class HomeCalendarRepo {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f42776b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f42777a = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.widgets.calendar.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeCalendarRepo.m53380b();
        }
    });

    /* JADX INFO: compiled from: HomeCalendarRepo.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarRepo$Companion;", "", "<init>", "()V", "TAG", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: c */
    public final HomeCalendarApi m53381c() {
        return (HomeCalendarApi) this.f42777a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m53382d(long j11, long j12, @NotNull Continuation<? super List<HomeCalendarEventEntity>> continuation) {
        HomeCalendarRepo$getEventList$1 homeCalendarRepo$getEventList$1;
        if (continuation instanceof HomeCalendarRepo$getEventList$1) {
            homeCalendarRepo$getEventList$1 = (HomeCalendarRepo$getEventList$1) continuation;
            int i11 = homeCalendarRepo$getEventList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeCalendarRepo$getEventList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeCalendarRepo$getEventList$1 = new HomeCalendarRepo$getEventList$1(this, continuation);
            }
        } else {
            homeCalendarRepo$getEventList$1 = new HomeCalendarRepo$getEventList$1(this, continuation);
        }
        HomeCalendarRepo$getEventList$1 homeCalendarRepo$getEventList$2 = homeCalendarRepo$getEventList$1;
        Object objM53393a = homeCalendarRepo$getEventList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeCalendarRepo$getEventList$2.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM53393a);
                HomeCalendarApi homeCalendarApiM53381c = m53381c();
                homeCalendarRepo$getEventList$2.J$0 = j11;
                homeCalendarRepo$getEventList$2.J$1 = j12;
                homeCalendarRepo$getEventList$2.label = 1;
                objM53393a = homeCalendarApiM53381c.m53393a(j11, j12, homeCalendarRepo$getEventList$2);
                if (objM53393a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM53393a);
            }
            List list = (List) objM53393a;
            if (list == null) {
                return null;
            }
            StorageId<String> storageIdM82280y = C36719d.f79632a.m82280y();
            String strM66606i = C27029c.m66606i(list);
            Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
            C46392a.m102333p(storageIdM82280y, strM66606i);
            return list;
        } catch (Exception e11) {
            C44128b.m97263g("HomeCalendarRepo", e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final HomeCalendarApi m53380b() {
        return (HomeCalendarApi) C42597a.m93388d().create(HomeCalendarApi.class);
    }
}
