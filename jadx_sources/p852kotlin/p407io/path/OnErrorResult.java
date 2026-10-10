package p852kotlin.p407io.path;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: OnErrorResult.kt */
/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "1.8")
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lkotlin/io/path/OnErrorResult;", "", "<init>", "(Ljava/lang/String;I)V", "SKIP_SUBTREE", "TERMINATE", "kotlin-stdlib-jdk7"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@ExperimentalPathApi
public enum OnErrorResult {
    SKIP_SUBTREE,
    TERMINATE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<OnErrorResult> getEntries() {
        return $ENTRIES;
    }
}
