package androidx.media3.common;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class FlagSet {
    private final SparseBooleanArray flags;

    public static final class Builder {
        private boolean buildCalled;
        private final SparseBooleanArray flags = new SparseBooleanArray();

        @CanIgnoreReturnValue
        public Builder addAll(int... iArr) {
            for (int i11 : iArr) {
                add(i11);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder removeAll(int... iArr) {
            for (int i11 : iArr) {
                remove(i11);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder add(int i11) {
            Assertions.checkState(!this.buildCalled);
            this.flags.append(i11, true);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addIf(int i11, boolean z11) {
            return z11 ? add(i11) : this;
        }

        public FlagSet build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new FlagSet(this.flags);
        }

        @CanIgnoreReturnValue
        public Builder remove(int i11) {
            Assertions.checkState(!this.buildCalled);
            this.flags.delete(i11);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder removeIf(int i11, boolean z11) {
            return z11 ? remove(i11) : this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(FlagSet flagSet) {
            for (int i11 = 0; i11 < flagSet.size(); i11++) {
                add(flagSet.get(i11));
            }
            return this;
        }
    }

    public boolean containsAny(int... iArr) {
        for (int i11 : iArr) {
            if (contains(i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagSet)) {
            return false;
        }
        FlagSet flagSet = (FlagSet) obj;
        if (Util.SDK_INT >= 24) {
            return this.flags.equals(flagSet.flags);
        }
        if (size() != flagSet.size()) {
            return false;
        }
        for (int i11 = 0; i11 < size(); i11++) {
            if (get(i11) != flagSet.get(i11)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i11) {
        Assertions.checkIndex(i11, 0, size());
        return this.flags.keyAt(i11);
    }

    private FlagSet(SparseBooleanArray sparseBooleanArray) {
        this.flags = sparseBooleanArray;
    }

    public boolean contains(int i11) {
        return this.flags.get(i11);
    }

    public int hashCode() {
        if (Util.SDK_INT >= 24) {
            return this.flags.hashCode();
        }
        int size = size();
        for (int i11 = 0; i11 < size(); i11++) {
            size = (size * 31) + get(i11);
        }
        return size;
    }

    public int size() {
        return this.flags.size();
    }
}
