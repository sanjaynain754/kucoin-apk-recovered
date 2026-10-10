package androidx.paging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.bugly.proguard.C33627eb;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
final class PagedStorage<T> extends AbstractList<T> {
    private static final List PLACEHOLDER_LIST = new ArrayList();
    private int mLeadingNullCount;
    private int mLoadedCount;
    private int mNumberAppended;
    private int mNumberPrepended;
    private int mPageSize;
    private final ArrayList<List<T>> mPages;
    private int mPositionOffset;
    private int mStorageCount;
    private int mTrailingNullCount;

    public interface Callback {
        void onEmptyAppend();

        void onEmptyPrepend();

        void onInitialized(int i11);

        void onPageAppended(int i11, int i12, int i13);

        void onPageInserted(int i11, int i12);

        void onPagePlaceholderInserted(int i11);

        void onPagePrepended(int i11, int i12, int i13);

        void onPagesRemoved(int i11, int i12);

        void onPagesSwappedToPlaceholder(int i11, int i12);
    }

    public PagedStorage() {
        this.mLeadingNullCount = 0;
        this.mPages = new ArrayList<>();
        this.mTrailingNullCount = 0;
        this.mPositionOffset = 0;
        this.mLoadedCount = 0;
        this.mStorageCount = 0;
        this.mPageSize = 1;
        this.mNumberPrepended = 0;
        this.mNumberAppended = 0;
    }

    private void init(int i11, List<T> list, int i12, int i13) {
        this.mLeadingNullCount = i11;
        this.mPages.clear();
        this.mPages.add(list);
        this.mTrailingNullCount = i12;
        this.mPositionOffset = i13;
        int size = list.size();
        this.mLoadedCount = size;
        this.mStorageCount = size;
        this.mPageSize = list.size();
        this.mNumberPrepended = 0;
        this.mNumberAppended = 0;
    }

    public boolean needsTrimFromFront(int i11, int i12) {
        return needsTrim(i11, i12, 0);
    }

    public boolean trimFromEnd(boolean z11, int i11, int i12, @NonNull Callback callback) {
        int i13 = 0;
        while (needsTrimFromEnd(i11, i12)) {
            ArrayList<List<T>> arrayList = this.mPages;
            List<T> listRemove = arrayList.remove(arrayList.size() - 1);
            int size = listRemove == null ? this.mPageSize : listRemove.size();
            i13 += size;
            this.mStorageCount -= size;
            this.mLoadedCount -= listRemove == null ? 0 : listRemove.size();
        }
        if (i13 > 0) {
            int i14 = this.mLeadingNullCount + this.mStorageCount;
            if (z11) {
                this.mTrailingNullCount += i13;
                callback.onPagesSwappedToPlaceholder(i14, i13);
            } else {
                callback.onPagesRemoved(i14, i13);
            }
        }
        return i13 > 0;
    }

    public boolean trimFromFront(boolean z11, int i11, int i12, @NonNull Callback callback) {
        int i13 = 0;
        while (needsTrimFromFront(i11, i12)) {
            List<T> listRemove = this.mPages.remove(0);
            int size = listRemove == null ? this.mPageSize : listRemove.size();
            i13 += size;
            this.mStorageCount -= size;
            this.mLoadedCount -= listRemove == null ? 0 : listRemove.size();
        }
        if (i13 > 0) {
            if (z11) {
                int i14 = this.mLeadingNullCount;
                this.mLeadingNullCount = i14 + i13;
                callback.onPagesSwappedToPlaceholder(i14, i13);
            } else {
                this.mPositionOffset += i13;
                callback.onPagesRemoved(this.mLeadingNullCount, i13);
            }
        }
        return i13 > 0;
    }

    private boolean needsTrim(int i11, int i12, int i13) {
        List<T> list = this.mPages.get(i13);
        if (list != null) {
            return this.mLoadedCount > i11 && this.mPages.size() > 2 && list != PLACEHOLDER_LIST && this.mLoadedCount - list.size() >= i12;
        }
        return true;
    }

    public void allocatePageRange(int i11, int i12) {
        int i13;
        int i14 = this.mLeadingNullCount / this.mPageSize;
        if (i11 < i14) {
            int i15 = 0;
            while (true) {
                i13 = i14 - i11;
                if (i15 >= i13) {
                    break;
                }
                this.mPages.add(0, null);
                i15++;
            }
            int i16 = i13 * this.mPageSize;
            this.mStorageCount += i16;
            this.mLeadingNullCount -= i16;
        } else {
            i11 = i14;
        }
        if (i12 >= this.mPages.size() + i11) {
            int iMin = Math.min(this.mTrailingNullCount, ((i12 + 1) - (this.mPages.size() + i11)) * this.mPageSize);
            for (int size = this.mPages.size(); size <= i12 - i11; size++) {
                ArrayList<List<T>> arrayList = this.mPages;
                arrayList.add(arrayList.size(), null);
            }
            this.mStorageCount += iMin;
            this.mTrailingNullCount -= iMin;
        }
    }

    public void allocatePlaceholders(int i11, int i12, int i13, Callback callback) {
        int i14 = this.mPageSize;
        if (i13 != i14) {
            if (i13 < i14) {
                throw new IllegalArgumentException("Page size cannot be reduced");
            }
            if (this.mPages.size() != 1 || this.mTrailingNullCount != 0) {
                throw new IllegalArgumentException("Page size can change only if last page is only one present");
            }
            this.mPageSize = i13;
        }
        int size = size();
        int i15 = this.mPageSize;
        int i16 = ((size + i15) - 1) / i15;
        int iMax = Math.max((i11 - i12) / i15, 0);
        int iMin = Math.min((i11 + i12) / this.mPageSize, i16 - 1);
        allocatePageRange(iMax, iMin);
        int i17 = this.mLeadingNullCount / this.mPageSize;
        while (iMax <= iMin) {
            int i18 = iMax - i17;
            if (this.mPages.get(i18) == null) {
                this.mPages.set(i18, PLACEHOLDER_LIST);
                callback.onPagePlaceholderInserted(iMax);
            }
            iMax++;
        }
    }

    public int computeLeadingNulls() {
        int i11 = this.mLeadingNullCount;
        int size = this.mPages.size();
        for (int i12 = 0; i12 < size; i12++) {
            List<T> list = this.mPages.get(i12);
            if (list != null && list != PLACEHOLDER_LIST) {
                break;
            }
            i11 += this.mPageSize;
        }
        return i11;
    }

    public int computeTrailingNulls() {
        int i11 = this.mTrailingNullCount;
        for (int size = this.mPages.size() - 1; size >= 0; size--) {
            List<T> list = this.mPages.get(size);
            if (list != null && list != PLACEHOLDER_LIST) {
                break;
            }
            i11 += this.mPageSize;
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i11) {
        int i12;
        if (i11 < 0 || i11 >= size()) {
            throw new IndexOutOfBoundsException("Index: " + i11 + ", Size: " + size());
        }
        int i13 = i11 - this.mLeadingNullCount;
        if (i13 >= 0 && i13 < this.mStorageCount) {
            if (isTiled()) {
                int i14 = this.mPageSize;
                i12 = i13 / i14;
                i13 %= i14;
            } else {
                int size = this.mPages.size();
                i12 = 0;
                while (i12 < size) {
                    int size2 = this.mPages.get(i12).size();
                    if (size2 > i13) {
                        break;
                    }
                    i13 -= size2;
                    i12++;
                }
            }
            List<T> list = this.mPages.get(i12);
            if (list != null && list.size() != 0) {
                return list.get(i13);
            }
        }
        return null;
    }

    public T getFirstLoadedItem() {
        return this.mPages.get(0).get(0);
    }

    public T getLastLoadedItem() {
        ArrayList<List<T>> arrayList = this.mPages;
        List<T> list = arrayList.get(arrayList.size() - 1);
        return list.get(list.size() - 1);
    }

    public int getLeadingNullCount() {
        return this.mLeadingNullCount;
    }

    public int getLoadedCount() {
        return this.mLoadedCount;
    }

    public int getMiddleOfLoadedRange() {
        return this.mLeadingNullCount + this.mPositionOffset + (this.mStorageCount / 2);
    }

    public int getNumberAppended() {
        return this.mNumberAppended;
    }

    public int getNumberPrepended() {
        return this.mNumberPrepended;
    }

    public int getPageCount() {
        return this.mPages.size();
    }

    public int getPositionOffset() {
        return this.mPositionOffset;
    }

    public int getStorageCount() {
        return this.mStorageCount;
    }

    public int getTrailingNullCount() {
        return this.mTrailingNullCount;
    }

    public boolean hasPage(int i11, int i12) {
        List<T> list;
        int i13 = this.mLeadingNullCount / i11;
        return i12 >= i13 && i12 < this.mPages.size() + i13 && (list = this.mPages.get(i12 - i13)) != null && list != PLACEHOLDER_LIST;
    }

    public boolean isTiled() {
        return this.mPageSize > 0;
    }

    public boolean needsTrimFromEnd(int i11, int i12) {
        return needsTrim(i11, i12, this.mPages.size() - 1);
    }

    public boolean pageWouldBeBoundary(int i11, boolean z11) {
        if (this.mPageSize < 1 || this.mPages.size() < 2) {
            throw new IllegalStateException("Trimming attempt before sufficient load");
        }
        int i12 = this.mLeadingNullCount;
        if (i11 < i12) {
            return z11;
        }
        if (i11 >= this.mStorageCount + i12) {
            return !z11;
        }
        int i13 = (i11 - i12) / this.mPageSize;
        if (z11) {
            for (int i14 = 0; i14 < i13; i14++) {
                if (this.mPages.get(i14) != null) {
                    return false;
                }
            }
        } else {
            for (int size = this.mPages.size() - 1; size > i13; size--) {
                if (this.mPages.get(size) != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean shouldPreTrimNewPage(int i11, int i12, int i13) {
        return this.mLoadedCount + i13 > i11 && this.mPages.size() > 1 && this.mLoadedCount >= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.mLeadingNullCount + this.mStorageCount + this.mTrailingNullCount;
    }

    public PagedStorage<T> snapshot() {
        return new PagedStorage<>(this);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb2 = new StringBuilder("leading " + this.mLeadingNullCount + ", storage " + this.mStorageCount + ", trailing " + getTrailingNullCount());
        for (int i11 = 0; i11 < this.mPages.size(); i11++) {
            sb2.append(C33627eb.f69716f);
            sb2.append(this.mPages.get(i11));
        }
        return sb2.toString();
    }

    public void appendPage(@NonNull List<T> list, @NonNull Callback callback) {
        int size = list.size();
        if (size == 0) {
            callback.onEmptyAppend();
            return;
        }
        if (this.mPageSize > 0) {
            ArrayList<List<T>> arrayList = this.mPages;
            int size2 = arrayList.get(arrayList.size() - 1).size();
            int i11 = this.mPageSize;
            if (size2 != i11 || size > i11) {
                this.mPageSize = -1;
            }
        }
        this.mPages.add(list);
        this.mLoadedCount += size;
        this.mStorageCount += size;
        int iMin = Math.min(this.mTrailingNullCount, size);
        int i12 = size - iMin;
        if (iMin != 0) {
            this.mTrailingNullCount -= iMin;
        }
        this.mNumberAppended += size;
        callback.onPageAppended((this.mLeadingNullCount + this.mStorageCount) - size, iMin, i12);
    }

    public void initAndSplit(int i11, @NonNull List<T> list, int i12, int i13, int i14, @NonNull Callback callback) {
        int size = (list.size() + (i14 - 1)) / i14;
        int i15 = 0;
        while (i15 < size) {
            int i16 = i15 * i14;
            int i17 = i15 + 1;
            List<T> listSubList = list.subList(i16, Math.min(list.size(), i17 * i14));
            if (i15 == 0) {
                init(i11, listSubList, (list.size() + i12) - listSubList.size(), i13);
            } else {
                insertPage(i16 + i11, listSubList, null);
            }
            i15 = i17;
        }
        callback.onInitialized(size());
    }

    public void insertPage(int i11, @NonNull List<T> list, @Nullable Callback callback) {
        boolean z11;
        int size = list.size();
        if (size != this.mPageSize) {
            int size2 = size();
            int i12 = this.mPageSize;
            boolean z12 = false;
            if (i11 == size2 - (size2 % i12) && size < i12) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.mTrailingNullCount == 0 && this.mPages.size() == 1 && size > this.mPageSize) {
                z12 = true;
            }
            if (!z12 && !z11) {
                throw new IllegalArgumentException("page introduces incorrect tiling");
            }
            if (z12) {
                this.mPageSize = size;
            }
        }
        int i13 = i11 / this.mPageSize;
        allocatePageRange(i13, i13);
        int i14 = i13 - (this.mLeadingNullCount / this.mPageSize);
        List<T> list2 = this.mPages.get(i14);
        if (list2 != null && list2 != PLACEHOLDER_LIST) {
            throw new IllegalArgumentException("Invalid position " + i11 + ": data already loaded");
        }
        this.mPages.set(i14, list);
        this.mLoadedCount += size;
        if (callback != null) {
            callback.onPageInserted(i11, size);
        }
    }

    public void prependPage(@NonNull List<T> list, @NonNull Callback callback) {
        int size = list.size();
        if (size == 0) {
            callback.onEmptyPrepend();
            return;
        }
        int i11 = this.mPageSize;
        if (i11 > 0 && size != i11) {
            if (this.mPages.size() == 1 && size > this.mPageSize) {
                this.mPageSize = size;
            } else {
                this.mPageSize = -1;
            }
        }
        this.mPages.add(0, list);
        this.mLoadedCount += size;
        this.mStorageCount += size;
        int iMin = Math.min(this.mLeadingNullCount, size);
        int i12 = size - iMin;
        if (iMin != 0) {
            this.mLeadingNullCount -= iMin;
        }
        this.mPositionOffset -= i12;
        this.mNumberPrepended += size;
        callback.onPagePrepended(this.mLeadingNullCount, iMin, i12);
    }

    public void tryInsertPageAndTrim(int i11, @NonNull List<T> list, int i12, int i13, int i14, @NonNull Callback callback) {
        boolean z11;
        boolean z12;
        if (i13 != Integer.MAX_VALUE) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i12 > getMiddleOfLoadedRange()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && shouldPreTrimNewPage(i13, i14, list.size()) && pageWouldBeBoundary(i11, z12)) {
            this.mPages.set((i11 - this.mLeadingNullCount) / this.mPageSize, null);
            this.mStorageCount -= list.size();
            if (z12) {
                this.mPages.remove(0);
                this.mLeadingNullCount += list.size();
            } else {
                ArrayList<List<T>> arrayList = this.mPages;
                arrayList.remove(arrayList.size() - 1);
                this.mTrailingNullCount += list.size();
            }
        } else {
            insertPage(i11, list, callback);
        }
        if (z11) {
            if (z12) {
                trimFromFront(true, i13, i14, callback);
            } else {
                trimFromEnd(true, i13, i14, callback);
            }
        }
    }

    public PagedStorage(int i11, List<T> list, int i12) {
        this();
        init(i11, list, i12, 0);
    }

    public void init(int i11, @NonNull List<T> list, int i12, int i13, @NonNull Callback callback) {
        init(i11, list, i12, i13);
        callback.onInitialized(size());
    }

    private PagedStorage(PagedStorage<T> pagedStorage) {
        this.mLeadingNullCount = pagedStorage.mLeadingNullCount;
        this.mPages = new ArrayList<>(pagedStorage.mPages);
        this.mTrailingNullCount = pagedStorage.mTrailingNullCount;
        this.mPositionOffset = pagedStorage.mPositionOffset;
        this.mLoadedCount = pagedStorage.mLoadedCount;
        this.mStorageCount = pagedStorage.mStorageCount;
        this.mPageSize = pagedStorage.mPageSize;
        this.mNumberPrepended = pagedStorage.mNumberPrepended;
        this.mNumberAppended = pagedStorage.mNumberAppended;
    }
}
