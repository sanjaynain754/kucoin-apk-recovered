package p847zy;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: zy.d */
/* JADX INFO: compiled from: DynamicResourceHook.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u0002"}, m90084d2 = {"convertLegalHolder", "", "LLanguage_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDynamicResourceHook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicResourceHook.kt\ncom/kubi/sdk/function/language/dynamic/DynamicResourceHookKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,339:1\n1878#2,3:340\n*S KotlinDebug\n*F\n+ 1 DynamicResourceHook.kt\ncom/kubi/sdk/function/language/dynamic/DynamicResourceHookKt\n*L\n306#1:340,3\n*E\n"})
public final class C46942d {
    /* JADX INFO: renamed from: b */
    public static final String m103418b(String str) {
        String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(new Regex("\\\\(?![ntr\"\\\\])").replace(str, "\\"), "｛", "{", false, 4, (Object) null), "｝", "}", false, 4, (Object) null), "{ ", "{", false, 4, (Object) null), " }", "}", false, 4, (Object) null);
        int i11 = 0;
        String strReplace$default2 = strReplace$default;
        for (Object obj : SequencesKt.toList(Regex.findAll$default(new Regex("[{][\\s]*\\d[^}]*[})]"), strReplace$default, 0, 2, null))) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            strReplace$default2 = StringsKt.replace$default(strReplace$default2, ((MatchResult) obj).getValue(), '%' + i12 + "$s", false, 4, (Object) null);
            i11 = i12;
        }
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(strReplace$default2, "\\n", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, false, 4, (Object) null), "\\t", "\t", false, 4, (Object) null), "\\r", "\r", false, 4, (Object) null);
    }
}
