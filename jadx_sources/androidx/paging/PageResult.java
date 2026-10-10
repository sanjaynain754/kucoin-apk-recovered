package androidx.paging;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
class PageResult<T> {
    static final int APPEND = 1;
    private static final PageResult EMPTY_RESULT;
    static final int INIT = 0;
    private static final PageResult INVALID_RESULT;
    static final int PREPEND = 2;
    static final int TILE = 3;
    public final int leadingNulls;

    @NonNull
    public final List<T> page;
    public final int positionOffset;
    public final int trailingNulls;

    public static abstract class Receiver<T> {
        @MainThread
        public abstract void onPageResult(int i11, @NonNull PageResult<T> pageResult);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ResultType {
    }

    public PageResult(@NonNull List<T> list, int i11, int i12, int i13) {
        this.page = list;
        this.leadingNulls = i11;
        this.trailingNulls = i12;
        this.positionOffset = i13;
    }

    static {
        List list = Collections.EMPTY_LIST;
        EMPTY_RESULT = new PageResult(list, 0);
        INVALID_RESULT = new PageResult(list, 0);
    }

    public static <T> PageResult<T> getEmptyResult() {
        return EMPTY_RESULT;
    }

    public static <T> PageResult<T> getInvalidResult() {
        return INVALID_RESULT;
    }

    public boolean isInvalid() {
        return this == INVALID_RESULT;
    }

    public String toString() {
        return "Result " + this.leadingNulls + ", " + this.page + ", " + this.trailingNulls + ", offset " + this.positionOffset;
    }

    public PageResult(@NonNull List<T> list, int i11) {
        this.page = list;
        this.leadingNulls = 0;
        this.trailingNulls = 0;
        this.positionOffset = i11;
    }
}
