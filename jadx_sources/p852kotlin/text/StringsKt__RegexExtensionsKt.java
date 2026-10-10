package p852kotlin.text;

import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Set;
import p852kotlin.Metadata;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RegexExtensions.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0087\b¨\u0006\u0007"}, m90084d2 = {"toRegex", "Lkotlin/text/Regex;", "", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "Lkotlin/text/RegexOption;", "options", "", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/text/StringsKt")
class StringsKt__RegexExtensionsKt extends StringsKt__RegexExtensionsJVMKt {
    @InlineOnly
    private static final Regex toRegex(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex(str);
    }

    @InlineOnly
    private static final Regex toRegex(String str, RegexOption option) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(option, "option");
        return new Regex(str, option);
    }

    @InlineOnly
    private static final Regex toRegex(String str, Set<? extends RegexOption> options) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return new Regex(str, options);
    }
}
