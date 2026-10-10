package fm;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: fm.a */
/* JADX INFO: compiled from: CoinEntityEx.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u0004H\u0086\b\u001a\u000f\u0010\u0005\u001a\u00020\u0003*\u0004\u0018\u00010\u0004H\u0086\b\u001a\u000f\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u0001H\u0086\b\u001a\u000f\u0010\u0005\u001a\u00020\u0003*\u0004\u0018\u00010\u0001H\u0086\b\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0001\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"CONTRACT_SUFFIX", "", "getLongPrecision", "", "Lcom/kubi/kumex/data/platform/model/CoinEntity;", "getShortPrecision", "toContractCoin", "convert", "", "isContractCoin", "getContractCoin", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoinEntityEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n*L\n1#1,43:1\n16#1:44\n20#1:45\n*S KotlinDebug\n*F\n+ 1 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n*L\n24#1:44\n28#1:45\n*E\n"})
public final class C37566a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m84609a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.removeSuffix(str, (CharSequence) "_contract");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m84610b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "_contract", false, 2, (Object) null);
    }
}
