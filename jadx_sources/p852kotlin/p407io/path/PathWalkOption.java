package p852kotlin.p407io.path;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.WasExperimental;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: PathWalkOption.kt */
/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "2.1")
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lkotlin/io/path/PathWalkOption;", "", "<init>", "(Ljava/lang/String;I)V", "INCLUDE_DIRECTORIES", "BREADTH_FIRST", "FOLLOW_LINKS", "kotlin-stdlib-jdk7"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@WasExperimental(markerClass = {ExperimentalPathApi.class})
public enum PathWalkOption {
    INCLUDE_DIRECTORIES,
    BREADTH_FIRST,
    FOLLOW_LINKS;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<PathWalkOption> getEntries() {
        return $ENTRIES;
    }
}
