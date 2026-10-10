package p852kotlin.text.jdk8;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.MatchGroup;
import p852kotlin.text.MatchGroupCollection;
import p852kotlin.text.MatchNamedGroupCollection;

/* JADX INFO: compiled from: RegexExtensions.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0002¨\u0006\u0005"}, m90084d2 = {"get", "Lkotlin/text/MatchGroup;", "Lkotlin/text/MatchGroupCollection;", "name", "", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90087pn = "kotlin.text", m90088xi = 48)
@JvmName(name = "RegexExtensionsJDK8Kt")
public final class RegexExtensionsJDK8Kt {
    @SinceKotlin(version = "1.2")
    @Nullable
    public static final MatchGroup get(@NotNull MatchGroupCollection matchGroupCollection, @NotNull String name) {
        Intrinsics.checkNotNullParameter(matchGroupCollection, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        MatchNamedGroupCollection matchNamedGroupCollection = matchGroupCollection instanceof MatchNamedGroupCollection ? (MatchNamedGroupCollection) matchGroupCollection : null;
        if (matchNamedGroupCollection != null) {
            return matchNamedGroupCollection.get(name);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
