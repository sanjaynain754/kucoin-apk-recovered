package p852kotlin.reflect.jvm.internal.impl.incremental.components;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LookupLocation.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class Position implements Serializable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Position NO_POSITION = new Position(-1, -1);
    private final int column;
    private final int line;

    /* JADX INFO: compiled from: LookupLocation.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Position getNO_POSITION() {
            return Position.NO_POSITION;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return this.line == position.line && this.column == position.column;
    }

    public int hashCode() {
        return (Integer.hashCode(this.line) * 31) + Integer.hashCode(this.column);
    }

    @NotNull
    public String toString() {
        return "Position(line=" + this.line + ", column=" + this.column + ')';
    }

    public Position(int i11, int i12) {
        this.line = i11;
        this.column = i12;
    }
}
