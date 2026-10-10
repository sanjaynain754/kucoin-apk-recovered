package com.kubi.quotefacade.widgets.calendar.entity;

import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeCalendarEventDataWrapper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "type", "", "data", "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;", "<init>", "(ILcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;)V", "getType", "()I", "getData", "()Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;", "getItemType", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HomeCalendarEventDataWrapper implements MultiItemEntity {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f42793d = new Companion(null);

    /* JADX INFO: renamed from: b */
    public final int f42794b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final HomeCalendarEventEntity f42795c;

    /* JADX INFO: compiled from: HomeCalendarEventDataWrapper.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper$Companion;", "", "<init>", "()V", "empty", "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;", "blank", "date", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;", "event", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final HomeCalendarEventDataWrapper blank() {
            return new HomeCalendarEventDataWrapper(4, null);
        }

        @NotNull
        public final HomeCalendarEventDataWrapper date(@NotNull HomeCalendarEventEntity entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            return new HomeCalendarEventDataWrapper(2, entity);
        }

        @NotNull
        public final HomeCalendarEventDataWrapper empty() {
            return new HomeCalendarEventDataWrapper(3, null);
        }

        @NotNull
        public final HomeCalendarEventDataWrapper event(@NotNull HomeCalendarEventEntity entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            return new HomeCalendarEventDataWrapper(1, entity);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final HomeCalendarEventEntity getF42795c() {
        return this.f42795c;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType, reason: from getter */
    public int getF42794b() {
        return this.f42794b;
    }

    public HomeCalendarEventDataWrapper(int i11, @Nullable HomeCalendarEventEntity homeCalendarEventEntity) {
        this.f42794b = i11;
        this.f42795c = homeCalendarEventEntity;
    }
}
