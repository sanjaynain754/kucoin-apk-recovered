package androidx.paging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;

/* JADX INFO: loaded from: classes34.dex */
class PagedStorageDiffHelper {

    public static class OffsettingListUpdateCallback implements ListUpdateCallback {
        private final ListUpdateCallback mCallback;
        private final int mOffset;

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onChanged(int i11, int i12, Object obj) {
            this.mCallback.onChanged(i11 + this.mOffset, i12, obj);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i11, int i12) {
            this.mCallback.onInserted(i11 + this.mOffset, i12);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i11, int i12) {
            ListUpdateCallback listUpdateCallback = this.mCallback;
            int i13 = this.mOffset;
            listUpdateCallback.onMoved(i11 + i13, i12 + i13);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i11, int i12) {
            this.mCallback.onRemoved(i11 + this.mOffset, i12);
        }

        public OffsettingListUpdateCallback(int i11, ListUpdateCallback listUpdateCallback) {
            this.mOffset = i11;
            this.mCallback = listUpdateCallback;
        }
    }

    private PagedStorageDiffHelper() {
    }

    public static <T> DiffUtil.DiffResult computeDiff(final PagedStorage<T> pagedStorage, final PagedStorage<T> pagedStorage2, final DiffUtil.ItemCallback<T> itemCallback) {
        final int iComputeLeadingNulls = pagedStorage.computeLeadingNulls();
        int iComputeLeadingNulls2 = pagedStorage2.computeLeadingNulls();
        final int size = (pagedStorage.size() - iComputeLeadingNulls) - pagedStorage.computeTrailingNulls();
        final int size2 = (pagedStorage2.size() - iComputeLeadingNulls2) - pagedStorage2.computeTrailingNulls();
        return DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: androidx.paging.PagedStorageDiffHelper.1
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areContentsTheSame(int i11, int i12) {
                Object obj = pagedStorage.get(i11 + iComputeLeadingNulls);
                PagedStorage pagedStorage3 = pagedStorage2;
                Object obj2 = pagedStorage3.get(i12 + pagedStorage3.getLeadingNullCount());
                if (obj == obj2) {
                    return true;
                }
                if (obj == null || obj2 == null) {
                    return false;
                }
                return itemCallback.areContentsTheSame(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areItemsTheSame(int i11, int i12) {
                Object obj = pagedStorage.get(i11 + iComputeLeadingNulls);
                PagedStorage pagedStorage3 = pagedStorage2;
                Object obj2 = pagedStorage3.get(i12 + pagedStorage3.getLeadingNullCount());
                if (obj == obj2) {
                    return true;
                }
                if (obj == null || obj2 == null) {
                    return false;
                }
                return itemCallback.areItemsTheSame(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            @Nullable
            public Object getChangePayload(int i11, int i12) {
                Object obj = pagedStorage.get(i11 + iComputeLeadingNulls);
                PagedStorage pagedStorage3 = pagedStorage2;
                Object obj2 = pagedStorage3.get(i12 + pagedStorage3.getLeadingNullCount());
                if (obj == null || obj2 == null) {
                    return null;
                }
                return itemCallback.getChangePayload(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getNewListSize() {
                return size2;
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getOldListSize() {
                return size;
            }
        }, true);
    }

    public static <T> void dispatchDiff(ListUpdateCallback listUpdateCallback, PagedStorage<T> pagedStorage, PagedStorage<T> pagedStorage2, DiffUtil.DiffResult diffResult) {
        int iComputeTrailingNulls = pagedStorage.computeTrailingNulls();
        int iComputeTrailingNulls2 = pagedStorage2.computeTrailingNulls();
        int iComputeLeadingNulls = pagedStorage.computeLeadingNulls();
        int iComputeLeadingNulls2 = pagedStorage2.computeLeadingNulls();
        if (iComputeTrailingNulls == 0 && iComputeTrailingNulls2 == 0 && iComputeLeadingNulls == 0 && iComputeLeadingNulls2 == 0) {
            diffResult.dispatchUpdatesTo(listUpdateCallback);
            return;
        }
        if (iComputeTrailingNulls > iComputeTrailingNulls2) {
            int i11 = iComputeTrailingNulls - iComputeTrailingNulls2;
            listUpdateCallback.onRemoved(pagedStorage.size() - i11, i11);
        } else if (iComputeTrailingNulls < iComputeTrailingNulls2) {
            listUpdateCallback.onInserted(pagedStorage.size(), iComputeTrailingNulls2 - iComputeTrailingNulls);
        }
        if (iComputeLeadingNulls > iComputeLeadingNulls2) {
            listUpdateCallback.onRemoved(0, iComputeLeadingNulls - iComputeLeadingNulls2);
        } else if (iComputeLeadingNulls < iComputeLeadingNulls2) {
            listUpdateCallback.onInserted(0, iComputeLeadingNulls2 - iComputeLeadingNulls);
        }
        if (iComputeLeadingNulls2 != 0) {
            diffResult.dispatchUpdatesTo(new OffsettingListUpdateCallback(iComputeLeadingNulls2, listUpdateCallback));
        } else {
            diffResult.dispatchUpdatesTo(listUpdateCallback);
        }
    }

    public static int transformAnchorIndex(@NonNull DiffUtil.DiffResult diffResult, @NonNull PagedStorage pagedStorage, @NonNull PagedStorage pagedStorage2, int i11) {
        int i12;
        int iComputeLeadingNulls = pagedStorage.computeLeadingNulls();
        int i13 = i11 - iComputeLeadingNulls;
        int size = (pagedStorage.size() - iComputeLeadingNulls) - pagedStorage.computeTrailingNulls();
        if (i13 >= 0 && i13 < size) {
            for (int i14 = 0; i14 < 30; i14++) {
                int i15 = i14 / 2;
                if (i14 % 2 == 1) {
                    i12 = -1;
                } else {
                    i12 = 1;
                }
                int i16 = (i15 * i12) + i13;
                if (i16 >= 0 && i16 < pagedStorage.getStorageCount()) {
                    try {
                        int iConvertOldPositionToNew = diffResult.convertOldPositionToNew(i16);
                        if (iConvertOldPositionToNew != -1) {
                            return iConvertOldPositionToNew + pagedStorage2.getLeadingNullCount();
                        }
                    } catch (IndexOutOfBoundsException unused) {
                    }
                }
            }
        }
        return Math.max(0, Math.min(i11, pagedStorage2.size() - 1));
    }
}
