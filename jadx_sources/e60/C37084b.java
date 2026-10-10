package e60;

import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.actions.SearchIntents;
import com.kubi.transfer.api.R$color;
import com.kubi.utils.C27017c;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import p002a0.C0006b;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: e60.b */
/* JADX INFO: compiled from: SearchCoinHelper.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u00004\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ab\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00040\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t0\u0006\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004¨\u0006\u0012"}, m90084d2 = {"searchAndSort", "", ExifInterface.GPS_DIRECTION_TRUE, SearchIntents.EXTRA_QUERY, "", "nameSelector", "Lkotlin/Function1;", "fullNameSelector", "valueSelector", "Ljava/math/BigDecimal;", "containsPosition", "", "text", "highlightSearchText", "", "textView", "Landroid/widget/TextView;", "keyword", "TransferApi_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchCoinHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCoinHelper.kt\ncom/kubi/transfer/search/SearchCoinHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n774#2:99\n865#2,2:100\n*S KotlinDebug\n*F\n+ 1 SearchCoinHelper.kt\ncom/kubi/transfer/search/SearchCoinHelperKt\n*L\n35#1:99\n35#1:100,2\n*E\n"})
public final class C37084b {

    /* JADX INFO: renamed from: e60.b$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 SearchCoinHelper.kt\ncom/kubi/transfer/search/SearchCoinHelperKt\n*L\n1#1,328:1\n45#2:329\n*E\n"})
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f82348b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f82349c;

        public a(Function1 function1, String str) {
            this.f82348b = function1;
            this.f82349c = str;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Boolean.valueOf(StringsKt.equals((String) this.f82348b.invoke(t12), this.f82349c, true)), Boolean.valueOf(StringsKt.equals((String) this.f82348b.invoke(t11), this.f82349c, true)));
        }
    }

    /* JADX INFO: renamed from: e60.b$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 SearchCoinHelper.kt\ncom/kubi/transfer/search/SearchCoinHelperKt\n*L\n1#1,328:1\n48#2:329\n*E\n"})
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Comparator f82350b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function1 f82351c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f82352d;

        public b(Comparator comparator, Function1 function1, String str) {
            this.f82350b = comparator;
            this.f82351c = function1;
            this.f82352d = str;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int iCompare = this.f82350b.compare(t11, t12);
            return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(Integer.valueOf(C37084b.m83007b((String) this.f82351c.invoke(t11), this.f82352d)), Integer.valueOf(C37084b.m83007b((String) this.f82351c.invoke(t12), this.f82352d)));
        }
    }

    /* JADX INFO: renamed from: e60.b$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 SearchCoinHelper.kt\ncom/kubi/transfer/search/SearchCoinHelperKt\n*L\n1#1,328:1\n49#2:329\n*E\n"})
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Comparator f82353b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function1 f82354c;

        public c(Comparator comparator, Function1 function1) {
            this.f82353b = comparator;
            this.f82354c = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int iCompare = this.f82353b.compare(t11, t12);
            if (iCompare != 0) {
                return iCompare;
            }
            String str = (String) this.f82354c.invoke(t11);
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((String) this.f82354c.invoke(t12)).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            return ComparisonsKt.compareValues(lowerCase, lowerCase2);
        }
    }

    /* JADX INFO: renamed from: e60.b$d */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 SearchCoinHelper.kt\ncom/kubi/transfer/search/SearchCoinHelperKt\n*L\n1#1,328:1\n50#2:329\n*E\n"})
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Comparator f82355b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function1 f82356c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f82357d;

        public d(Comparator comparator, Function1 function1, String str) {
            this.f82355b = comparator;
            this.f82356c = function1;
            this.f82357d = str;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int iCompare = this.f82355b.compare(t11, t12);
            return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(Integer.valueOf(C37084b.m83007b((String) this.f82356c.invoke(t11), this.f82357d)), Integer.valueOf(C37084b.m83007b((String) this.f82356c.invoke(t12), this.f82357d)));
        }
    }

    /* JADX INFO: renamed from: e60.b$e */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 SearchCoinHelper.kt\ncom/kubi/transfer/search/SearchCoinHelperKt\n*L\n1#1,328:1\n51#2:329\n*E\n"})
    public static final class e<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Comparator f82358b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function1 f82359c;

        public e(Comparator comparator, Function1 function1) {
            this.f82358b = comparator;
            this.f82359c = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int iCompare = this.f82358b.compare(t11, t12);
            if (iCompare != 0) {
                return iCompare;
            }
            String str = (String) this.f82359c.invoke(t11);
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((String) this.f82359c.invoke(t12)).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            return ComparisonsKt.compareValues(lowerCase, lowerCase2);
        }
    }

    /* JADX INFO: renamed from: e60.b$f */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n+ 2 SearchCoinHelper.kt\ncom/kubi/transfer/search/SearchCoinHelperKt\n*L\n1#1,328:1\n46#2:329\n*E\n"})
    public static final class f<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Comparator f82360b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function1 f82361c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f82362d;

        public f(Comparator comparator, Function1 function1, String str) {
            this.f82360b = comparator;
            this.f82361c = function1;
            this.f82362d = str;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int iCompare = this.f82360b.compare(t11, t12);
            return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(Boolean.valueOf(StringsKt.equals((String) this.f82361c.invoke(t12), this.f82362d, true)), Boolean.valueOf(StringsKt.equals((String) this.f82361c.invoke(t11), this.f82362d, true)));
        }
    }

    /* JADX INFO: renamed from: e60.b$g */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n+ 2 SearchCoinHelper.kt\ncom/kubi/transfer/search/SearchCoinHelperKt\n*L\n1#1,328:1\n47#2:329\n*E\n"})
    public static final class g<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Comparator f82363b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function1 f82364c;

        public g(Comparator comparator, Function1 function1) {
            this.f82363b = comparator;
            this.f82364c = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int iCompare = this.f82363b.compare(t11, t12);
            return iCompare != 0 ? iCompare : ComparisonsKt.compareValues((Comparable) this.f82364c.invoke(t12), (Comparable) this.f82364c.invoke(t11));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m83007b(String str, String str2) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) lowerCase, str2, 0, false, 6, (Object) null);
        if (iIndexOf$default >= 0) {
            return iIndexOf$default;
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: c */
    public static final void m83008c(@NotNull TextView textView, @NotNull String keyword) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        C27017c c27017c = C27017c.f54310a;
        int iM66512a = c27017c.m66512a(R$color.c_aaffd6);
        int iM66512a2 = c27017c.m66512a(R$color.asset_span_search_text_color);
        String string = textView.getText().toString();
        if (keyword.length() == 0) {
            return;
        }
        SpannableString spannableString = new SpannableString(string);
        Matcher matcher = Pattern.compile(Pattern.quote(keyword), 2).matcher(string);
        while (matcher.find()) {
            spannableString.setSpan(new BackgroundColorSpan(iM66512a), matcher.start(), matcher.end(), 33);
            spannableString.setSpan(new ForegroundColorSpan(iM66512a2), matcher.start(), matcher.end(), 33);
        }
        textView.setText(spannableString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> List<T> m83009d(@NotNull List<? extends T> list, @NotNull String query, @NotNull Function1<? super T, String> nameSelector, @NotNull Function1<? super T, String> fullNameSelector, @NotNull Function1<? super T, ? extends BigDecimal> valueSelector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(nameSelector, "nameSelector");
        Intrinsics.checkNotNullParameter(fullNameSelector, "fullNameSelector");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        if (StringsKt.isBlank(query)) {
            return list;
        }
        String lowerCase = query.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0006b c0006b = (Object) it.next();
            String strInvoke = nameSelector.invoke(c0006b);
            Locale locale = Locale.ROOT;
            String lowerCase2 = strInvoke.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            String lowerCase3 = fullNameSelector.invoke(c0006b).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            if (Intrinsics.areEqual(lowerCase2, lowerCase) || Intrinsics.areEqual(lowerCase3, lowerCase) || StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) lowerCase, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) lowerCase, false, 2, (Object) null)) {
                arrayList.add(c0006b);
            }
        }
        return arrayList.isEmpty() ? CollectionsKt.emptyList() : CollectionsKt.sortedWith(arrayList, new e(new d(new c(new b(new g(new f(new a(nameSelector, lowerCase), fullNameSelector, lowerCase), valueSelector), nameSelector, lowerCase), nameSelector), fullNameSelector, lowerCase), nameSelector));
    }
}
