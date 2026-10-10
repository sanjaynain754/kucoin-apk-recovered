package p852kotlin.text;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\rH\u0096\u0002J\t\u0010\u000e\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lkotlin/text/LinesIterator;", "", "", TypedValues.Custom.S_STRING, "", "<init>", "(Ljava/lang/CharSequence;)V", "state", "", "tokenStartIndex", "delimiterStartIndex", "delimiterLength", "hasNext", "", "next", "State", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
final class LinesIterator implements Iterator<String>, KMappedMarker {

    @Deprecated
    public static final int EXHAUSTED = 2;

    @Deprecated
    public static final int HAS_NEXT = 1;

    @NotNull
    private static final State State = new State(null);

    @Deprecated
    public static final int UNKNOWN = 0;
    private int delimiterLength;
    private int delimiterStartIndex;
    private int state;

    @NotNull
    private final CharSequence string;
    private int tokenStartIndex;

    /* JADX INFO: compiled from: Strings.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lkotlin/text/LinesIterator$State;", "", "<init>", "()V", "UNKNOWN", "", "HAS_NEXT", "EXHAUSTED", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class State {
        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private State() {
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i11;
        int i12;
        int i13 = this.state;
        if (i13 != 0) {
            return i13 == 1;
        }
        if (this.delimiterLength < 0) {
            this.state = 2;
            return false;
        }
        int length = this.string.length();
        int length2 = this.string.length();
        for (int i14 = this.tokenStartIndex; i14 < length2; i14++) {
            char cCharAt = this.string.charAt(i14);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i11 = (cCharAt == '\r' && (i12 = i14 + 1) < this.string.length() && this.string.charAt(i12) == '\n') ? 2 : 1;
                length = i14;
                this.state = 1;
                this.delimiterLength = i11;
                this.delimiterStartIndex = length;
                return true;
            }
        }
        i11 = -1;
        this.state = 1;
        this.delimiterLength = i11;
        this.delimiterStartIndex = length;
        return true;
    }

    @Override // java.util.Iterator
    @NotNull
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.state = 0;
        int i11 = this.delimiterStartIndex;
        int i12 = this.tokenStartIndex;
        this.tokenStartIndex = this.delimiterLength + i11;
        return this.string.subSequence(i12, i11).toString();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public LinesIterator(@NotNull CharSequence string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.string = string;
    }
}
