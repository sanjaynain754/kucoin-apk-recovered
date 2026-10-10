package com.kubi.quotefacade.widgets.calendar;

import com.kubi.mvi.state.InterfaceC19282d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: HomeCalendarWidgetContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWidgetContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "LoadData", "Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWidgetContract$UiIntent$LoadData;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class HomeCalendarWidgetContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: HomeCalendarWidgetContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWidgetContract$UiIntent$LoadData;", "Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWidgetContract$UiIntent;", "startSecond", "", "endSecond", "<init>", "(JJ)V", "getStartSecond", "()J", "getEndSecond", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class LoadData extends HomeCalendarWidgetContract$UiIntent {
        private final long endSecond;
        private final long startSecond;

        public LoadData(long j11, long j12) {
            super(null);
            this.startSecond = j11;
            this.endSecond = j12;
        }

        public final long getEndSecond() {
            return this.endSecond;
        }

        public final long getStartSecond() {
            return this.startSecond;
        }
    }

    public /* synthetic */ HomeCalendarWidgetContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HomeCalendarWidgetContract$UiIntent() {
    }
}
