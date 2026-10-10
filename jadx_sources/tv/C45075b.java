package tv;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tv.b */
/* JADX INFO: compiled from: HomeCalendarEventDataWrapper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarWeekItemWrapper;", "", "week", "", "date", TUIConstants.TUIChat.INPUT_MORE_ICON, "firstSecond", "", "minusSecond", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "getWeek", "()Ljava/lang/String;", "getDate", "getIcon", "getFirstSecond", "()J", "getMinusSecond", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45075b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f101473a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f101474b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f101475c;

    /* JADX INFO: renamed from: d */
    public final long f101476d;

    /* JADX INFO: renamed from: e */
    public final long f101477e;

    public C45075b(@NotNull String week, @NotNull String date, @Nullable String str, long j11, long j12) {
        Intrinsics.checkNotNullParameter(week, "week");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f101473a = week;
        this.f101474b = date;
        this.f101475c = str;
        this.f101476d = j11;
        this.f101477e = j12;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF101474b() {
        return this.f101474b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getF101476d() {
        return this.f101476d;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF101475c() {
        return this.f101475c;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getF101477e() {
        return this.f101477e;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF101473a() {
        return this.f101473a;
    }
}
