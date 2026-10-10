package p852kotlin.contracts;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.internal.ContractsDsl;

/* JADX INFO: compiled from: ContractBuilder.kt */
/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "1.3")
@ContractsDsl
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lkotlin/contracts/InvocationKind;", "", "<init>", "(Ljava/lang/String;I)V", "AT_MOST_ONCE", "AT_LEAST_ONCE", "EXACTLY_ONCE", "UNKNOWN", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@ExperimentalContracts
public enum InvocationKind {
    AT_MOST_ONCE,
    AT_LEAST_ONCE,
    EXACTLY_ONCE,
    UNKNOWN;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<InvocationKind> getEntries() {
        return $ENTRIES;
    }
}
