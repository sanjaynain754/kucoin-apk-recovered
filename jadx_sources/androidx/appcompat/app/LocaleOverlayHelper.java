package androidx.appcompat.app;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(24)
final class LocaleOverlayHelper {
    public static LocaleListCompat combineLocalesIfOverlayExists(LocaleListCompat localeListCompat, LocaleListCompat localeListCompat2) {
        return (localeListCompat == null || localeListCompat.isEmpty()) ? LocaleListCompat.getEmptyLocaleList() : combineLocales(localeListCompat, localeListCompat2);
    }

    private static LocaleListCompat combineLocales(LocaleListCompat localeListCompat, LocaleListCompat localeListCompat2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i11 = 0;
        while (i11 < localeListCompat.size() + localeListCompat2.size()) {
            Locale locale = i11 < localeListCompat.size() ? localeListCompat.get(i11) : localeListCompat2.get(i11 - localeListCompat.size());
            if (locale != null) {
                linkedHashSet.add(locale);
            }
            i11++;
        }
        return LocaleListCompat.create((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    private LocaleOverlayHelper() {
    }

    public static LocaleListCompat combineLocalesIfOverlayExists(LocaleList localeList, LocaleList localeList2) {
        if (localeList != null && !localeList.isEmpty()) {
            return combineLocales(LocaleListCompat.wrap(localeList), LocaleListCompat.wrap(localeList2));
        }
        return LocaleListCompat.getEmptyLocaleList();
    }
}
