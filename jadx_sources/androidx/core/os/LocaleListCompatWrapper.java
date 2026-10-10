package androidx.core.os;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
final class LocaleListCompatWrapper implements LocaleListInterface {
    private final Locale[] mList;

    @NonNull
    private final String mStringRepresentation;
    private static final Locale[] sEmptyList = new Locale[0];
    private static final Locale LOCALE_EN_XA = new Locale(TUIThemeManager.LANGUAGE_EN, "XA");
    private static final Locale LOCALE_AR_XB = new Locale(TUIThemeManager.LANGUAGE_AR, "XB");
    private static final Locale EN_LATN = LocaleListCompat.forLanguageTagCompat("en-Latn");

    private int findFirstMatchIndex(Locale locale) {
        int i11 = 0;
        while (true) {
            Locale[] localeArr = this.mList;
            if (i11 >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (matchScore(locale, localeArr[i11]) > 0) {
                return i11;
            }
            i11++;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocaleListCompatWrapper)) {
            return false;
        }
        Locale[] localeArr = ((LocaleListCompatWrapper) obj).mList;
        if (this.mList.length != localeArr.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            Locale[] localeArr2 = this.mList;
            if (i11 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i11].equals(localeArr[i11])) {
                return false;
            }
            i11++;
        }
    }

    @Override // androidx.core.os.LocaleListInterface
    @Nullable
    public Object getLocaleList() {
        return null;
    }

    @Override // androidx.core.os.LocaleListInterface
    public int indexOf(Locale locale) {
        int i11 = 0;
        while (true) {
            Locale[] localeArr = this.mList;
            if (i11 >= localeArr.length) {
                return -1;
            }
            if (localeArr[i11].equals(locale)) {
                return i11;
            }
            i11++;
        }
    }

    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static String getScript(Locale locale) {
            return locale.getScript();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001e  */
    private int computeFirstMatchIndex(Collection<String> collection, boolean z11) {
        int iFindFirstMatchIndex;
        Locale[] localeArr = this.mList;
        if (localeArr.length == 1) {
            return 0;
        }
        if (localeArr.length == 0) {
            return -1;
        }
        if (z11) {
            iFindFirstMatchIndex = findFirstMatchIndex(EN_LATN);
            if (iFindFirstMatchIndex == 0) {
                return 0;
            }
            if (iFindFirstMatchIndex >= Integer.MAX_VALUE) {
                iFindFirstMatchIndex = Integer.MAX_VALUE;
            }
        } else {
            iFindFirstMatchIndex = Integer.MAX_VALUE;
        }
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            int iFindFirstMatchIndex2 = findFirstMatchIndex(LocaleListCompat.forLanguageTagCompat(it.next()));
            if (iFindFirstMatchIndex2 == 0) {
                return 0;
            }
            if (iFindFirstMatchIndex2 < iFindFirstMatchIndex) {
                iFindFirstMatchIndex = iFindFirstMatchIndex2;
            }
        }
        if (iFindFirstMatchIndex == Integer.MAX_VALUE) {
            return 0;
        }
        return iFindFirstMatchIndex;
    }

    private static boolean isPseudoLocale(Locale locale) {
        return LOCALE_EN_XA.equals(locale) || LOCALE_AR_XB.equals(locale);
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale get(int i11) {
        if (i11 < 0) {
            return null;
        }
        Locale[] localeArr = this.mList;
        if (i11 < localeArr.length) {
            return localeArr[i11];
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.mList) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // androidx.core.os.LocaleListInterface
    public boolean isEmpty() {
        return this.mList.length == 0;
    }

    @Override // androidx.core.os.LocaleListInterface
    public int size() {
        return this.mList.length;
    }

    @Override // androidx.core.os.LocaleListInterface
    public String toLanguageTags() {
        return this.mStringRepresentation;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i11 = 0;
        while (true) {
            Locale[] localeArr = this.mList;
            if (i11 >= localeArr.length) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(localeArr[i11]);
            if (i11 < this.mList.length - 1) {
                sb2.append(',');
            }
            i11++;
        }
    }

    public LocaleListCompatWrapper(@NonNull Locale... localeArr) {
        if (localeArr.length == 0) {
            this.mList = sEmptyList;
            this.mStringRepresentation = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < localeArr.length; i11++) {
            Locale locale = localeArr[i11];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    toLanguageTag(sb2, locale2);
                    if (i11 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i11 + "] is null");
            }
        }
        this.mList = (Locale[]) arrayList.toArray(new Locale[0]);
        this.mStringRepresentation = sb2.toString();
    }

    private Locale computeFirstMatch(Collection<String> collection, boolean z11) {
        int iComputeFirstMatchIndex = computeFirstMatchIndex(collection, z11);
        if (iComputeFirstMatchIndex == -1) {
            return null;
        }
        return this.mList[iComputeFirstMatchIndex];
    }

    private static String getLikelyScript(Locale locale) {
        String script = Api21Impl.getScript(locale);
        if (!script.isEmpty()) {
            return script;
        }
        return "";
    }

    @IntRange(from = 0, m1553to = 1)
    private static int matchScore(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || isPseudoLocale(locale) || isPseudoLocale(locale2)) {
            return 0;
        }
        String likelyScript = getLikelyScript(locale);
        if (!likelyScript.isEmpty()) {
            return likelyScript.equals(getLikelyScript(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        if (country.isEmpty() || country.equals(locale2.getCountry())) {
            return 1;
        }
        return 0;
    }

    @VisibleForTesting
    public static void toLanguageTag(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb2.append('-');
            sb2.append(locale.getCountry());
        }
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale getFirstMatch(@NonNull String[] strArr) {
        return computeFirstMatch(Arrays.asList(strArr), false);
    }
}
