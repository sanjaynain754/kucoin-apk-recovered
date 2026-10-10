package p813yy;

import android.os.LocaleList;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: yy.b */
/* JADX INFO: compiled from: LanguageUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0011\u0010\u0006\u001a\u00020\u0007*\u00020\u0005H\u0000¢\u0006\u0002\b\bJ\u0017\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/function/language/LanguageUtils;", "", "<init>", "()V", "getCurrentSystemLanguage", "Ljava/util/Locale;", "getLocalString", "", "getLocalString$LLanguage_googleRelease", "stringToLocale", "localeStr", "stringToLocale$LLanguage_googleRelease", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLanguageUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageUtils.kt\ncom/kubi/sdk/function/language/LanguageUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,32:1\n1#2:33\n*E\n"})
public final class C46612b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46612b f104366a = new C46612b();

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Locale m102774c(@Nullable String str) {
        List listSplit$default = str != null ? StringsKt.split$default((CharSequence) str, new String[]{"_"}, false, 0, 6, (Object) null) : null;
        Integer numValueOf = listSplit$default != null ? Integer.valueOf(listSplit$default.size()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return new Locale((String) listSplit$default.get(0), (String) listSplit$default.get(1));
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return new Locale((String) listSplit$default.get(0));
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        return locale;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m102773b(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<this>");
        String string = locale.toString();
        if (Intrinsics.areEqual("in_ID", string)) {
            return "id_ID";
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Locale m102772a() {
        Locale locale = LocaleList.getDefault().get(0);
        Intrinsics.checkNotNull(locale);
        return locale;
    }
}
