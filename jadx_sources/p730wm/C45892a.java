package p730wm;

import android.text.InputFilter;
import android.text.Spanned;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.futures.FuturesRemote;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33978va;
import java.math.BigDecimal;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.Nullable;
import p236em.C37214b;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: wm.a */
/* JADX INFO: compiled from: TPSLPointInputFilter.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/kumex/utils/inputfilter/TPSLPointInputFilter;", "Landroid/text/InputFilter;", "decimal_digits", "", "<init>", "(I)V", "filter", "", "source", "start", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTPSLPointInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TPSLPointInputFilter.kt\ncom/kubi/kumex/utils/inputfilter/TPSLPointInputFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,93:1\n739#2,9:94\n37#3:103\n36#3,3:104\n*S KotlinDebug\n*F\n+ 1 TPSLPointInputFilter.kt\ncom/kubi/kumex/utils/inputfilter/TPSLPointInputFilter\n*L\n75#1:94,9\n75#1:103\n75#1:104,3\n*E\n"})
public final class C45892a implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final int f103362a;

    @Override // android.text.InputFilter
    @Nullable
    public CharSequence filter(@Nullable CharSequence source, int start, int end, @Nullable Spanned dest, int dstart, int dend) {
        List listEmptyList;
        String strValueOf = String.valueOf(dest);
        String strValueOf2 = String.valueOf(source);
        if (FuturesRemote.f23108a.m25652s() && Intrinsics.areEqual(strValueOf2, C33978va.f72339h) && this.f103362a > 0) {
            if (StringsKt.contains$default((CharSequence) strValueOf, (CharSequence) C33978va.f72339h, false, 2, (Object) null)) {
                return "";
            }
            if (Intrinsics.areEqual(strValueOf, C33820nf.f71144W)) {
                return "0.";
            }
            if ((StringsKt.contains$default((CharSequence) strValueOf, (CharSequence) C33820nf.f71144W, false, 2, (Object) null) && StringsKt.toBigDecimalOrNull(strValueOf) != null && dstart == 1) || strValueOf.length() == 0 || (StringsKt.toBigDecimalOrNull(strValueOf) != null && dstart == 0)) {
                return "0.";
            }
        }
        String strSubstring = String.valueOf(source).substring(start, end);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = String.valueOf(dest).substring(dstart, dend);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        if (Intrinsics.areEqual("", strSubstring)) {
            if (dstart == 0 && StringsKt.indexOf$default((CharSequence) String.valueOf(dest), C33978va.f72339h, 0, false, 6, (Object) null) == dend) {
                return strSubstring2;
            }
            return null;
        }
        if (dstart == 0 && StringsKt.indexOf$default((CharSequence) strSubstring, C33978va.f72339h, 0, false, 6, (Object) null) == 0) {
            return "";
        }
        if (this.f103362a <= 0 && StringsKt.contains$default((CharSequence) strSubstring, (CharSequence) C33978va.f72339h, false, 2, (Object) null)) {
            if (strSubstring.length() == 1) {
                return "";
            }
            String strSubstring3 = strSubstring.substring(0, StringsKt.indexOf$default((CharSequence) strSubstring, C33978va.f72339h, 0, false, 6, (Object) null));
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            return strSubstring3;
        }
        List<String> listSplit = new Regex("\\.").split(String.valueOf(dest), 0);
        if (!listSplit.isEmpty()) {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listEmptyList = CollectionsKt.emptyList();
                    break;
                }
                if (listIterator.previous().length() != 0) {
                    listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
            break;
        }
        String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
        if (strArr.length > 1 && strArr[1].length() >= this.f103362a && dstart > strArr[0].length()) {
            return "";
        }
        if (strSubstring.length() <= 1 || !StringsKt.contains$default((CharSequence) strSubstring, (CharSequence) C33978va.f72339h, false, 2, (Object) null)) {
            return null;
        }
        try {
            return C6447a.m11724a(new BigDecimal(strSubstring).setScale(this.f103362a, 1)).toPlainString();
        } catch (Exception e11) {
            C37214b.m83255a(e11, "TPSLPointInputFilter");
            return "";
        }
    }

    public C45892a(int i11) {
        this.f103362a = i11;
    }
}
