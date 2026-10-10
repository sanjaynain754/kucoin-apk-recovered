package com.kubi.quotefacade.widgets.calendar;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.quotefacade.widgets.calendar.entity.HomeCalendarEventDataWrapper;
import com.kubi.quotefacade.widgets.calendar.entity.HomeCalendarEventEntity;
import com.kubi.router.core.Router;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tv.C45075b;

/* JADX INFO: renamed from: com.kubi.quotefacade.widgets.calendar.k */
/* JADX INFO: compiled from: HomeCalendarHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\u0010\n\u001a\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0000\u001a.\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a\b\u0010\u0016\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0000\u001a\b\u0010\u0019\u001a\u00020\tH\u0000\u001a\u0013\u0010\u001a\u001a\u00020\t*\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\u0010\u001b\u001a\u0013\u0010\u001c\u001a\u00020\t*\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\u0010\u001b\u001a!\u0010\u001d\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001e\u001a\u00020\rH\u0000¢\u0006\u0002\u0010\u001f\u001a\u0012\u0010 \u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\rH\u0000\u001a\u001a\u0010!\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\rH\u0000\u001a\u0012\u0010\"\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\rH\u0000\u001a\u001a\u0010#\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\rH\u0000\u001a\u0012\u0010$\u001a\u00020\r2\b\b\u0002\u0010%\u001a\u00020\u0015H\u0000\u001a\u001a\u0010&\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\u0015H\u0000\u001a \u0010+\u001a\b\u0012\u0004\u0012\u00020,0(2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010(H\u0000\u001a2\u0010/\u001a\b\u0012\u0004\u0012\u0002000(2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010(2\b\b\u0002\u00101\u001a\u00020\u00152\b\b\u0002\u00102\u001a\u00020\u0001H\u0000\u001a(\u00103\u001a\b\u0012\u0004\u0012\u0002000(2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010(2\b\b\u0002\u00104\u001a\u00020\u0001H\u0000\u001a\u001c\u00105\u001a\u0004\u0018\u00010\r*\n\u0012\u0004\u0012\u00020.\u0018\u00010(2\u0006\u0010\u0018\u001a\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010(X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u00066"}, m90084d2 = {"DAY_STYLE_MAX_SIZE", "", "WEEK_STYLE_MAX_SIZE", "WEEK_SPAN_COUNT", "oneDaySecond", "threeWeek", "jumpToRNCalendarWithDate", "", "dateTimeSecond", "", "(Ljava/lang/Long;)V", "jumpToRNCalendarEventDetail", "eventId", "", "bindDateWeekAndClick", "dateTv", "Landroid/widget/TextView;", "weekTv", "rootView", "Landroid/view/View;", "isLargeCard", "", "getCurDayFirstSecond", "getDateDayFirstSecond", "second", "getCurWeekMondayFirstSecond", "secondToMills", "(Ljava/lang/Long;)J", "millsToSecond", "getLocalDateHHmm", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "(Ljava/lang/Long;Ljava/lang/String;)Ljava/lang/String;", "getCurrentDay", "getLocalDateDay", "getCurrentMonth", "getLocalDateMonth", "getCurrentWeek", "isSimple", "getLocalDateWeek", "weekList", "", "getWeekList", "()Ljava/util/List;", "getCurWeek", "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarWeekItemWrapper;", "dataList", "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;", "getDayEventList", "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;", "justToday", "maxSize", "getWeekEventList", BridgeParamKeyKt.MAX_COUNT, "findFirstLegalIcon", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeCalendarHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCalendarHelper.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,258:1\n1869#2,2:259\n1869#2,2:261\n1869#2,2:263\n295#2,2:265\n*S KotlinDebug\n*F\n+ 1 HomeCalendarHelper.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarHelperKt\n*L\n180#1:259,2\n203#1:261,2\n234#1:263,2\n257#1:265,2\n*E\n"})
public final class C22619k {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final List<Integer> f42803a = CollectionsKt.listOf((Object[]) new Integer[]{2, 3, 4, 5, 6, 7, 1});

    /* JADX INFO: renamed from: b */
    public static final void m53403b(@Nullable TextView textView, @Nullable TextView textView2, @Nullable View view, final boolean z11) {
        if (textView != null) {
            textView.setText(m53411j(null, 1, null) + ' ' + m53413l(null, 1, null));
        }
        if (textView2 != null) {
            textView2.setText(m53415n(false, 1, null));
        }
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.quotefacade.widgets.calendar.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) throws JSONException {
                    C22619k.m53404c(z11, view2);
                }
            });
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final String m53405d(@Nullable List<HomeCalendarEventEntity> list, long j11) {
        Object next;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                HomeCalendarEventEntity homeCalendarEventEntity = (HomeCalendarEventEntity) next;
                if (homeCalendarEventEntity.getStartTime() != null && homeCalendarEventEntity.getStartTime().longValue() >= j11 && homeCalendarEventEntity.getStartTime().longValue() < ((long) 86400) + j11) {
                    break;
                }
            }
            HomeCalendarEventEntity homeCalendarEventEntity2 = (HomeCalendarEventEntity) next;
            if (homeCalendarEventEntity2 != null) {
                return homeCalendarEventEntity2.getIcon();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public static final void m53397A(@Nullable String str) {
        if (str == null) {
            m53399C(null, 1, null);
            return;
        }
        Router router = Router.f46192a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("krn/router?biz=calendar&entry=main&component=krn_calendar&route=");
        sb2.append(Uri.encode("detail?eventId=" + str));
        router.m56184f(sb2.toString()).m4048k();
    }

    /* JADX INFO: renamed from: B */
    public static final void m53398B(@Nullable Long l11) {
        if (l11 == null) {
            l11 = Long.valueOf(m53406e());
        }
        Router router = Router.f46192a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("krn/router?biz=calendar&entry=main&component=krn_calendar&route=");
        sb2.append(Uri.encode("main?date=" + m53401E(l11)));
        router.m56184f(sb2.toString()).m4048k();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m53399C(Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = null;
        }
        m53398B(l11);
    }

    /* JADX INFO: renamed from: D */
    public static final long m53400D(@Nullable Long l11) {
        return (l11 != null ? l11.longValue() : 0L) / ((long) 1000);
    }

    /* JADX INFO: renamed from: E */
    public static final long m53401E(@Nullable Long l11) {
        return (l11 != null ? l11.longValue() : 0L) * ((long) 1000);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ List m53408g(List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = null;
        }
        return m53407f(list);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m53410i(@NotNull String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String str = simpleDateFormat.format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m53411j(String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "dd";
        }
        return m53410i(str);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final String m53412k(@NotNull String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String str = simpleDateFormat.format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m53413l(String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "MMM";
        }
        return m53412k(str);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final String m53414m(boolean z11) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(z11 ? "EEEEE" : "EEE", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String str = simpleDateFormat.format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m53415n(boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return m53414m(z11);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static final List<HomeCalendarEventDataWrapper> m53417p(@Nullable List<HomeCalendarEventEntity> list, boolean z11, int i11) {
        ArrayList arrayList = new ArrayList();
        long jM53406e = m53406e();
        if (list != null) {
            long jM53416o = jM53406e;
            for (HomeCalendarEventEntity homeCalendarEventEntity : list) {
                if (homeCalendarEventEntity.getStartTime() != null && homeCalendarEventEntity.getStartTime().longValue() >= jM53406e) {
                    if (homeCalendarEventEntity.getStartTime().longValue() - jM53406e < 86400) {
                        arrayList.add(HomeCalendarEventDataWrapper.f42793d.event(homeCalendarEventEntity));
                    } else if (!z11) {
                        if (homeCalendarEventEntity.getStartTime().longValue() - jM53416o < 86400) {
                            arrayList.add(HomeCalendarEventDataWrapper.f42793d.event(homeCalendarEventEntity));
                        } else if (arrayList.size() + 3 <= 5) {
                            HomeCalendarEventDataWrapper.Companion companion = HomeCalendarEventDataWrapper.f42793d;
                            arrayList.add(companion.blank());
                            arrayList.add(companion.date(homeCalendarEventEntity));
                            arrayList.add(companion.event(homeCalendarEventEntity));
                            jM53416o = m53416o(homeCalendarEventEntity.getStartTime().longValue());
                        }
                    }
                }
                arrayList.size();
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(HomeCalendarEventDataWrapper.f42793d.empty());
        }
        return CollectionsKt.take(arrayList, i11);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ List m53418q(List list, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 5;
        }
        return m53417p(list, z11, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static final String m53419r(long j11, @NotNull String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String str = simpleDateFormat.format(new Date(m53401E(Long.valueOf(j11))));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m53420s(long j11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "dd";
        }
        return m53419r(j11, str);
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public static final String m53421t(@Nullable Long l11, @NotNull String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        if (l11 == null) {
            return "";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String str = simpleDateFormat.format(new Date(m53401E(l11)));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m53422u(Long l11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "HH:mm";
        }
        return m53421t(l11, str);
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static final String m53423v(long j11, @NotNull String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String str = simpleDateFormat.format(new Date(m53401E(Long.valueOf(j11))));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m53424w(long j11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "MMM";
        }
        return m53423v(j11, str);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public static final String m53425x(long j11, boolean z11) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(z11 ? "EEEEE" : "EEE", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String str = simpleDateFormat.format(new Date(m53401E(Long.valueOf(j11))));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public static final List<HomeCalendarEventDataWrapper> m53426y(@Nullable List<HomeCalendarEventEntity> list, int i11) {
        ArrayList arrayList = new ArrayList();
        long jM53406e = m53406e() + ((long) 86400);
        if (list != null) {
            Long lValueOf = null;
            for (HomeCalendarEventEntity homeCalendarEventEntity : list) {
                if (homeCalendarEventEntity.getStartTime() != null && homeCalendarEventEntity.getStartTime().longValue() >= jM53406e) {
                    if (lValueOf == null) {
                        arrayList.add(HomeCalendarEventDataWrapper.f42793d.date(homeCalendarEventEntity));
                        lValueOf = Long.valueOf(m53416o(homeCalendarEventEntity.getStartTime().longValue()));
                    }
                    if (homeCalendarEventEntity.getStartTime().longValue() - lValueOf.longValue() < 86400) {
                        arrayList.add(HomeCalendarEventDataWrapper.f42793d.event(homeCalendarEventEntity));
                    } else if (arrayList.size() + 2 <= i11) {
                        HomeCalendarEventDataWrapper.Companion companion = HomeCalendarEventDataWrapper.f42793d;
                        arrayList.add(companion.date(homeCalendarEventEntity));
                        arrayList.add(companion.event(homeCalendarEventEntity));
                        lValueOf = Long.valueOf(m53416o(homeCalendarEventEntity.getStartTime().longValue()));
                    }
                }
                arrayList.size();
            }
        }
        return CollectionsKt.take(arrayList, i11);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ List m53427z(List list, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 4;
        }
        return m53426y(list, i11);
    }

    /* JADX INFO: renamed from: c */
    public static final void m53404c(boolean z11, View view) throws JSONException {
        m53398B(Long.valueOf(m53406e()));
        C22622n.m53436g(z11, null, null, null, 14, null);
    }

    /* JADX INFO: renamed from: e */
    public static final long m53406e() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return m53400D(Long.valueOf(calendar.getTimeInMillis()));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final List<C45075b> m53407f(@Nullable List<HomeCalendarEventEntity> list) {
        String strM53405d;
        long jM53409h = m53409h();
        long jM53406e = m53406e();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = f42803a.iterator();
        long j11 = jM53409h;
        while (it.hasNext()) {
            ((Number) it.next()).intValue();
            String strM53425x = m53425x(j11, true);
            String strM53419r = m53419r(j11, "d");
            if (list != null) {
                strM53405d = m53405d(list, j11);
            } else {
                strM53405d = null;
            }
            arrayList.add(new C45075b(strM53425x, strM53419r, strM53405d, j11, j11 - jM53406e));
            j11 += (long) 86400;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static final long m53409h() {
        int i11;
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int i12 = calendar.get(7);
        if (i12 == 1) {
            i11 = 6;
        } else {
            i11 = i12 - 2;
        }
        calendar.add(5, -i11);
        return m53400D(Long.valueOf(calendar.getTimeInMillis()));
    }

    /* JADX INFO: renamed from: o */
    public static final long m53416o(long j11) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTimeInMillis(m53401E(Long.valueOf(j11)));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return m53400D(Long.valueOf(calendar.getTimeInMillis()));
    }
}
