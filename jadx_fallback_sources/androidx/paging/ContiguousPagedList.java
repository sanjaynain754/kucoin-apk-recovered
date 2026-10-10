package androidx.paging;

/* JADX INFO: loaded from: classes34.dex */
class ContiguousPagedList<K, V> extends androidx.paging.PagedList<V> implements androidx.paging.PagedStorage.Callback {
    private static final int DONE_FETCHING = 2;
    private static final int FETCHING = 1;
    static final int LAST_LOAD_UNSPECIFIED = -1;
    private static final int READY_TO_FETCH = 0;
    int mAppendItemsRequested;
    int mAppendWorkerState;
    final androidx.paging.ContiguousDataSource<K, V> mDataSource;
    int mPrependItemsRequested;
    int mPrependWorkerState;
    androidx.paging.PageResult.Receiver<V> mReceiver;
    boolean mReplacePagesWithNulls;
    final boolean mShouldTrim;




    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FetchState {
    }

    public ContiguousPagedList(@androidx.annotation.NonNull androidx.paging.ContiguousDataSource<K, V> r9, @androidx.annotation.NonNull java.util.concurrent.Executor r10, @androidx.annotation.NonNull java.util.concurrent.Executor r11, @androidx.annotation.Nullable androidx.paging.PagedList.BoundaryCallback<V> r12, @androidx.annotation.NonNull androidx.paging.PagedList.Config r13, @androidx.annotation.Nullable K r14, int r15) {
            r8 = this;
            androidx.paging.PagedStorage r1 = new androidx.paging.PagedStorage
            r1.<init>()
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r10 = 0
            r0.mPrependWorkerState = r10
            r0.mAppendWorkerState = r10
            r0.mPrependItemsRequested = r10
            r0.mAppendItemsRequested = r10
            r0.mReplacePagesWithNulls = r10
            androidx.paging.ContiguousPagedList$1 r11 = new androidx.paging.ContiguousPagedList$1
            r11.<init>(r8)
            r0.mReceiver = r11
            r0.mDataSource = r9
            r0.mLastLoad = r15
            boolean r11 = r9.isInvalid()
            if (r11 == 0) goto L2e
            r8.detach()
            r1 = r9
            goto L3f
        L2e:
            androidx.paging.PagedList$Config r11 = r0.mConfig
            int r3 = r11.initialLoadSizeHint
            int r4 = r11.pageSize
            boolean r5 = r11.enablePlaceholders
            java.util.concurrent.Executor r6 = r0.mMainThreadExecutor
            androidx.paging.PageResult$Receiver<V> r7 = r0.mReceiver
            r1 = r9
            r2 = r14
            r1.dispatchLoadInitial(r2, r3, r4, r5, r6, r7)
        L3f:
            boolean r9 = r1.supportsPageDropping()
            if (r9 == 0) goto L4f
            androidx.paging.PagedList$Config r9 = r0.mConfig
            int r9 = r9.maxSize
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r11) goto L4f
            r10 = 1
        L4f:
            r0.mShouldTrim = r10
            return
    }

    public static int getAppendItemsRequested(int r0, int r1, int r2) {
            int r1 = r1 + r0
            int r1 = r1 + 1
            int r1 = r1 - r2
            return r1
    }

    public static int getPrependItemsRequested(int r0, int r1, int r2) {
            int r1 = r1 - r2
            int r0 = r0 - r1
            return r0
    }

    @androidx.annotation.MainThread
    private void scheduleAppend() {
            r4 = this;
            int r0 = r4.mAppendWorkerState
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.mAppendWorkerState = r0
            androidx.paging.PagedStorage<T> r1 = r4.mStorage
            int r1 = r1.getLeadingNullCount()
            androidx.paging.PagedStorage<T> r2 = r4.mStorage
            int r2 = r2.getStorageCount()
            int r1 = r1 + r2
            int r1 = r1 - r0
            androidx.paging.PagedStorage<T> r0 = r4.mStorage
            int r0 = r0.getPositionOffset()
            int r1 = r1 + r0
            androidx.paging.PagedStorage<T> r0 = r4.mStorage
            java.lang.Object r0 = r0.getLastLoadedItem()
            java.util.concurrent.Executor r2 = r4.mBackgroundThreadExecutor
            androidx.paging.ContiguousPagedList$3 r3 = new androidx.paging.ContiguousPagedList$3
            r3.<init>(r4, r1, r0)
            r2.execute(r3)
            return
    }

    @androidx.annotation.MainThread
    private void schedulePrepend() {
            r4 = this;
            int r0 = r4.mPrependWorkerState
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.mPrependWorkerState = r0
            androidx.paging.PagedStorage<T> r0 = r4.mStorage
            int r0 = r0.getLeadingNullCount()
            androidx.paging.PagedStorage<T> r1 = r4.mStorage
            int r1 = r1.getPositionOffset()
            int r0 = r0 + r1
            androidx.paging.PagedStorage<T> r1 = r4.mStorage
            java.lang.Object r1 = r1.getFirstLoadedItem()
            java.util.concurrent.Executor r2 = r4.mBackgroundThreadExecutor
            androidx.paging.ContiguousPagedList$2 r3 = new androidx.paging.ContiguousPagedList$2
            r3.<init>(r4, r0, r1)
            r2.execute(r3)
            return
    }

    @Override // androidx.paging.PagedList
    @androidx.annotation.MainThread
    public void dispatchUpdatesSinceSnapshot(@androidx.annotation.NonNull androidx.paging.PagedList<V> r8, @androidx.annotation.NonNull androidx.paging.PagedList.Callback r9) {
            r7 = this;
            androidx.paging.PagedStorage<T> r8 = r8.mStorage
            androidx.paging.PagedStorage<T> r0 = r7.mStorage
            int r0 = r0.getNumberAppended()
            int r1 = r8.getNumberAppended()
            int r0 = r0 - r1
            androidx.paging.PagedStorage<T> r1 = r7.mStorage
            int r1 = r1.getNumberPrepended()
            int r2 = r8.getNumberPrepended()
            int r1 = r1 - r2
            int r2 = r8.getTrailingNullCount()
            int r3 = r8.getLeadingNullCount()
            boolean r4 = r8.isEmpty()
            if (r4 != 0) goto L82
            if (r0 < 0) goto L82
            if (r1 < 0) goto L82
            androidx.paging.PagedStorage<T> r4 = r7.mStorage
            int r4 = r4.getTrailingNullCount()
            int r5 = r2 - r0
            r6 = 0
            int r5 = java.lang.Math.max(r5, r6)
            if (r4 != r5) goto L82
            androidx.paging.PagedStorage<T> r4 = r7.mStorage
            int r4 = r4.getLeadingNullCount()
            int r5 = r3 - r1
            int r5 = java.lang.Math.max(r5, r6)
            if (r4 != r5) goto L82
            androidx.paging.PagedStorage<T> r4 = r7.mStorage
            int r4 = r4.getStorageCount()
            int r5 = r8.getStorageCount()
            int r5 = r5 + r0
            int r5 = r5 + r1
            if (r4 != r5) goto L82
            if (r0 == 0) goto L70
            int r2 = java.lang.Math.min(r2, r0)
            int r0 = r0 - r2
            int r4 = r8.getLeadingNullCount()
            int r8 = r8.getStorageCount()
            int r4 = r4 + r8
            if (r2 == 0) goto L6a
            r9.onChanged(r4, r2)
        L6a:
            if (r0 == 0) goto L70
            int r4 = r4 + r2
            r9.onInserted(r4, r0)
        L70:
            if (r1 == 0) goto L81
            int r8 = java.lang.Math.min(r3, r1)
            int r1 = r1 - r8
            if (r8 == 0) goto L7c
            r9.onChanged(r3, r8)
        L7c:
            if (r1 == 0) goto L81
            r9.onInserted(r6, r1)
        L81:
            return
        L82:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList"
            r8.<init>(r9)
            throw r8
    }

    @Override // androidx.paging.PagedList
    @androidx.annotation.NonNull
    public androidx.paging.DataSource<?, V> getDataSource() {
            r1 = this;
            androidx.paging.ContiguousDataSource<K, V> r0 = r1.mDataSource
            return r0
    }

    @Override // androidx.paging.PagedList
    @androidx.annotation.Nullable
    public java.lang.Object getLastKey() {
            r3 = this;
            androidx.paging.ContiguousDataSource<K, V> r0 = r3.mDataSource
            int r1 = r3.mLastLoad
            T r2 = r3.mLastItem
            java.lang.Object r0 = r0.getKey(r1, r2)
            return r0
    }

    @Override // androidx.paging.PagedList
    public boolean isContiguous() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.paging.PagedList
    @androidx.annotation.MainThread
    public void loadAroundInternal(int r5) {
            r4 = this;
            androidx.paging.PagedList$Config r0 = r4.mConfig
            int r0 = r0.prefetchDistance
            androidx.paging.PagedStorage<T> r1 = r4.mStorage
            int r1 = r1.getLeadingNullCount()
            int r0 = getPrependItemsRequested(r0, r5, r1)
            androidx.paging.PagedList$Config r1 = r4.mConfig
            int r1 = r1.prefetchDistance
            androidx.paging.PagedStorage<T> r2 = r4.mStorage
            int r2 = r2.getLeadingNullCount()
            androidx.paging.PagedStorage<T> r3 = r4.mStorage
            int r3 = r3.getStorageCount()
            int r2 = r2 + r3
            int r5 = getAppendItemsRequested(r1, r5, r2)
            int r1 = r4.mPrependItemsRequested
            int r0 = java.lang.Math.max(r0, r1)
            r4.mPrependItemsRequested = r0
            if (r0 <= 0) goto L30
            r4.schedulePrepend()
        L30:
            int r0 = r4.mAppendItemsRequested
            int r5 = java.lang.Math.max(r5, r0)
            r4.mAppendItemsRequested = r5
            if (r5 <= 0) goto L3d
            r4.scheduleAppend()
        L3d:
            return
    }

    @Override // androidx.paging.PagedStorage.Callback
    @androidx.annotation.MainThread
    public void onEmptyAppend() {
            r1 = this;
            r0 = 2
            r1.mAppendWorkerState = r0
            return
    }

    @Override // androidx.paging.PagedStorage.Callback
    @androidx.annotation.MainThread
    public void onEmptyPrepend() {
            r1 = this;
            r0 = 2
            r1.mPrependWorkerState = r0
            return
    }

    @Override // androidx.paging.PagedStorage.Callback
    @androidx.annotation.MainThread
    public void onInitialized(int r2) {
            r1 = this;
            r0 = 0
            r1.notifyInserted(r0, r2)
            androidx.paging.PagedStorage<T> r2 = r1.mStorage
            int r2 = r2.getLeadingNullCount()
            if (r2 > 0) goto L14
            androidx.paging.PagedStorage<T> r2 = r1.mStorage
            int r2 = r2.getTrailingNullCount()
            if (r2 <= 0) goto L15
        L14:
            r0 = 1
        L15:
            r1.mReplacePagesWithNulls = r0
            return
    }

    @Override // androidx.paging.PagedStorage.Callback
    @androidx.annotation.MainThread
    public void onPageAppended(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.mAppendItemsRequested
            int r0 = r0 - r4
            int r0 = r0 - r5
            r2.mAppendItemsRequested = r0
            r1 = 0
            r2.mAppendWorkerState = r1
            if (r0 <= 0) goto Le
            r2.scheduleAppend()
        Le:
            r2.notifyChanged(r3, r4)
            int r3 = r3 + r4
            r2.notifyInserted(r3, r5)
            return
    }

    @Override // androidx.paging.PagedStorage.Callback
    @androidx.annotation.MainThread
    public void onPageInserted(int r1, int r2) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Tiled callback on ContiguousPagedList"
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.paging.PagedStorage.Callback
    @androidx.annotation.MainThread
    public void onPagePlaceholderInserted(int r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Tiled callback on ContiguousPagedList"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.paging.PagedStorage.Callback
    @androidx.annotation.MainThread
    public void onPagePrepended(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.mPrependItemsRequested
            int r0 = r0 - r4
            int r0 = r0 - r5
            r2.mPrependItemsRequested = r0
            r1 = 0
            r2.mPrependWorkerState = r1
            if (r0 <= 0) goto Le
            r2.schedulePrepend()
        Le:
            r2.notifyChanged(r3, r4)
            r2.notifyInserted(r1, r5)
            r2.offsetAccessIndices(r5)
            return
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPagesRemoved(int r1, int r2) {
            r0 = this;
            r0.notifyRemoved(r1, r2)
            return
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPagesSwappedToPlaceholder(int r1, int r2) {
            r0 = this;
            r0.notifyChanged(r1, r2)
            return
    }
}
