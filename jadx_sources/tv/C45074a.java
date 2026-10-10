package tv;

import com.kubi.quotefacade.R$layout;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: tv.a */
/* JADX INFO: compiled from: HomeCalendarEventDataWrapper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\" \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"HCE_ITEM_TYPE_EVENT", "", "HCE_ITEM_TYPE_DATE", "HCE_ITEM_TYPE_EMPTY", "HCE_ITEM_TYPE_BLANK", "eventItemMapper", "", "getEventItemMapper", "()Ljava/util/Map;", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45074a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Map<Integer, Integer> f101472a;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = R$layout.item_home_calendar_event;
        linkedHashMap.put(1, Integer.valueOf(i11));
        linkedHashMap.put(2, Integer.valueOf(R$layout.item_home_calendar_date));
        linkedHashMap.put(3, Integer.valueOf(R$layout.item_home_calendar_empty));
        linkedHashMap.put(4, Integer.valueOf(i11));
        f101472a = linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Map<Integer, Integer> m99673a() {
        return f101472a;
    }
}
