package p852kotlin.text;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.AbstractList;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.IntRange;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "matchResult", "Ljava/util/regex/MatchResult;", "getMatchResult", "()Ljava/util/regex/MatchResult;", SessionDescription.ATTR_RANGE, "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "", "getValue", "()Ljava/lang/String;", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "groupValues_", "", "groupValues", "getGroupValues", "()Ljava/util/List;", "next", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
final class MatcherMatchResult implements MatchResult {

    @Nullable
    private List<String> groupValues_;

    @NotNull
    private final MatchGroupCollection groups;

    @NotNull
    private final CharSequence input;

    @NotNull
    private final Matcher matcher;

    public MatcherMatchResult(@NotNull Matcher matcher, @NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.matcher = matcher;
        this.input = input;
        this.groups = new MatcherMatchResult$groups$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult getMatchResult() {
        return this.matcher;
    }

    @Override // p852kotlin.text.MatchResult
    @NotNull
    public List<String> getGroupValues() {
        if (this.groupValues_ == null) {
            this.groupValues_ = new AbstractList<String>() { // from class: kotlin.text.MatcherMatchResult$groupValues$1
                @Override // p852kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public final /* bridge */ boolean contains(Object obj) {
                    if (obj instanceof String) {
                        return contains((String) obj);
                    }
                    return false;
                }

                @Override // p852kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int indexOf(Object obj) {
                    if (obj instanceof String) {
                        return indexOf((String) obj);
                    }
                    return -1;
                }

                @Override // p852kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int lastIndexOf(Object obj) {
                    if (obj instanceof String) {
                        return lastIndexOf((String) obj);
                    }
                    return -1;
                }

                public /* bridge */ boolean contains(String str) {
                    return super.contains((Object) str);
                }

                @Override // p852kotlin.collections.AbstractList, java.util.List
                public String get(int index) {
                    String strGroup = this.this$0.getMatchResult().group(index);
                    return strGroup == null ? "" : strGroup;
                }

                @Override // p852kotlin.collections.AbstractList, p852kotlin.collections.AbstractCollection
                /* JADX INFO: renamed from: getSize */
                public int get_size() {
                    return this.this$0.getMatchResult().groupCount() + 1;
                }

                public /* bridge */ int indexOf(String str) {
                    return super.indexOf((Object) str);
                }

                public /* bridge */ int lastIndexOf(String str) {
                    return super.lastIndexOf((Object) str);
                }
            };
        }
        List<String> list = this.groupValues_;
        Intrinsics.checkNotNull(list);
        return list;
    }

    @Override // p852kotlin.text.MatchResult
    @NotNull
    public MatchGroupCollection getGroups() {
        return this.groups;
    }

    @Override // p852kotlin.text.MatchResult
    @NotNull
    public MatchResult.Destructured getDestructured() {
        return MatchResult.DefaultImpls.getDestructured(this);
    }

    @Override // p852kotlin.text.MatchResult
    @NotNull
    public IntRange getRange() {
        return RegexKt.range(getMatchResult());
    }

    @Override // p852kotlin.text.MatchResult
    @NotNull
    public String getValue() {
        String strGroup = getMatchResult().group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return strGroup;
    }

    @Override // p852kotlin.text.MatchResult
    @Nullable
    public MatchResult next() {
        int i11;
        int iEnd = getMatchResult().end();
        if (getMatchResult().end() == getMatchResult().start()) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i12 = iEnd + i11;
        if (i12 <= this.input.length()) {
            Matcher matcher = this.matcher.pattern().matcher(this.input);
            Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
            return RegexKt.findNext(matcher, i12, this.input);
        }
        return null;
    }
}
