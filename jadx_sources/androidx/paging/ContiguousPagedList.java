package androidx.paging;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
class ContiguousPagedList<K, V> extends PagedList<V> implements PagedStorage.Callback {
    private static final int DONE_FETCHING = 2;
    private static final int FETCHING = 1;
    static final int LAST_LOAD_UNSPECIFIED = -1;
    private static final int READY_TO_FETCH = 0;
    int mAppendItemsRequested;
    int mAppendWorkerState;
    final ContiguousDataSource<K, V> mDataSource;
    int mPrependItemsRequested;
    int mPrependWorkerState;
    PageResult.Receiver<V> mReceiver;
    boolean mReplacePagesWithNulls;
    final boolean mShouldTrim;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchState {
    }

    public static int getAppendItemsRequested(int i11, int i12, int i13) {
        return ((i12 + i11) + 1) - i13;
    }

    public static int getPrependItemsRequested(int i11, int i12, int i13) {
        return i11 - (i12 - i13);
    }

    @Override // androidx.paging.PagedList
    public boolean isContiguous() {
        return true;
    }

    @Override // androidx.paging.PagedStorage.Callback
    @MainThread
    public void onEmptyAppend() {
        this.mAppendWorkerState = 2;
    }

    @Override // androidx.paging.PagedStorage.Callback
    @MainThread
    public void onEmptyPrepend() {
        this.mPrependWorkerState = 2;
    }

    @Override // androidx.paging.PagedStorage.Callback
    @MainThread
    public void onInitialized(int i11) {
        notifyInserted(0, i11);
        this.mReplacePagesWithNulls = this.mStorage.getLeadingNullCount() > 0 || this.mStorage.getTrailingNullCount() > 0;
    }

    public ContiguousPagedList(@NonNull ContiguousDataSource<K, V> contiguousDataSource, @NonNull Executor executor, @NonNull Executor executor2, @Nullable PagedList.BoundaryCallback<V> boundaryCallback, @NonNull PagedList.Config config, @Nullable K k11, int i11) {
        ContiguousDataSource<K, V> contiguousDataSource2;
        super(new PagedStorage(), executor, executor2, boundaryCallback, config);
        boolean z11 = false;
        this.mPrependWorkerState = 0;
        this.mAppendWorkerState = 0;
        this.mPrependItemsRequested = 0;
        this.mAppendItemsRequested = 0;
        this.mReplacePagesWithNulls = false;
        this.mReceiver = new PageResult.Receiver<V>() { // from class: androidx.paging.ContiguousPagedList.1
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v6 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                */
            @Override // androidx.paging.PageResult.Receiver
            @androidx.annotation.AnyThread
            public void onPageResult(int r10, @androidx.annotation.NonNull androidx.paging.PageResult<V> r11) {
                /*
                    Method dump skipped, instruction units count: 280
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.ContiguousPagedList.C36801.onPageResult(int, androidx.paging.PageResult):void");
            }
        };
        this.mDataSource = contiguousDataSource;
        this.mLastLoad = i11;
        if (contiguousDataSource.isInvalid()) {
            detach();
            contiguousDataSource2 = contiguousDataSource;
        } else {
            PagedList.Config config2 = this.mConfig;
            contiguousDataSource2 = contiguousDataSource;
            contiguousDataSource2.dispatchLoadInitial(k11, config2.initialLoadSizeHint, config2.pageSize, config2.enablePlaceholders, this.mMainThreadExecutor, this.mReceiver);
        }
        if (contiguousDataSource2.supportsPageDropping() && this.mConfig.maxSize != Integer.MAX_VALUE) {
            z11 = true;
        }
        this.mShouldTrim = z11;
    }

    @MainThread
    private void scheduleAppend() {
        if (this.mAppendWorkerState != 0) {
            return;
        }
        this.mAppendWorkerState = 1;
        final int leadingNullCount = ((this.mStorage.getLeadingNullCount() + this.mStorage.getStorageCount()) - 1) + this.mStorage.getPositionOffset();
        final Object lastLoadedItem = this.mStorage.getLastLoadedItem();
        this.mBackgroundThreadExecutor.execute(new Runnable() { // from class: androidx.paging.ContiguousPagedList.3
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public void run() {
                if (ContiguousPagedList.this.isDetached()) {
                    return;
                }
                if (ContiguousPagedList.this.mDataSource.isInvalid()) {
                    ContiguousPagedList.this.detach();
                } else {
                    ContiguousPagedList contiguousPagedList = ContiguousPagedList.this;
                    contiguousPagedList.mDataSource.dispatchLoadAfter(leadingNullCount, lastLoadedItem, contiguousPagedList.mConfig.pageSize, contiguousPagedList.mMainThreadExecutor, contiguousPagedList.mReceiver);
                }
            }
        });
    }

    @MainThread
    private void schedulePrepend() {
        if (this.mPrependWorkerState != 0) {
            return;
        }
        this.mPrependWorkerState = 1;
        final int leadingNullCount = this.mStorage.getLeadingNullCount() + this.mStorage.getPositionOffset();
        final Object firstLoadedItem = this.mStorage.getFirstLoadedItem();
        this.mBackgroundThreadExecutor.execute(new Runnable() { // from class: androidx.paging.ContiguousPagedList.2
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public void run() {
                if (ContiguousPagedList.this.isDetached()) {
                    return;
                }
                if (ContiguousPagedList.this.mDataSource.isInvalid()) {
                    ContiguousPagedList.this.detach();
                } else {
                    ContiguousPagedList contiguousPagedList = ContiguousPagedList.this;
                    contiguousPagedList.mDataSource.dispatchLoadBefore(leadingNullCount, firstLoadedItem, contiguousPagedList.mConfig.pageSize, contiguousPagedList.mMainThreadExecutor, contiguousPagedList.mReceiver);
                }
            }
        });
    }

    @Override // androidx.paging.PagedList
    @MainThread
    public void dispatchUpdatesSinceSnapshot(@NonNull PagedList<V> pagedList, @NonNull PagedList.Callback callback) {
        PagedStorage<V> pagedStorage = pagedList.mStorage;
        int numberAppended = this.mStorage.getNumberAppended() - pagedStorage.getNumberAppended();
        int numberPrepended = this.mStorage.getNumberPrepended() - pagedStorage.getNumberPrepended();
        int trailingNullCount = pagedStorage.getTrailingNullCount();
        int leadingNullCount = pagedStorage.getLeadingNullCount();
        if (pagedStorage.isEmpty() || numberAppended < 0 || numberPrepended < 0 || this.mStorage.getTrailingNullCount() != Math.max(trailingNullCount - numberAppended, 0) || this.mStorage.getLeadingNullCount() != Math.max(leadingNullCount - numberPrepended, 0) || this.mStorage.getStorageCount() != pagedStorage.getStorageCount() + numberAppended + numberPrepended) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        if (numberAppended != 0) {
            int iMin = Math.min(trailingNullCount, numberAppended);
            int i11 = numberAppended - iMin;
            int leadingNullCount2 = pagedStorage.getLeadingNullCount() + pagedStorage.getStorageCount();
            if (iMin != 0) {
                callback.onChanged(leadingNullCount2, iMin);
            }
            if (i11 != 0) {
                callback.onInserted(leadingNullCount2 + iMin, i11);
            }
        }
        if (numberPrepended != 0) {
            int iMin2 = Math.min(leadingNullCount, numberPrepended);
            int i12 = numberPrepended - iMin2;
            if (iMin2 != 0) {
                callback.onChanged(leadingNullCount, iMin2);
            }
            if (i12 != 0) {
                callback.onInserted(0, i12);
            }
        }
    }

    @Override // androidx.paging.PagedList
    @NonNull
    public DataSource<?, V> getDataSource() {
        return this.mDataSource;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.paging.PagedList
    @Nullable
    public Object getLastKey() {
        return this.mDataSource.getKey(this.mLastLoad, this.mLastItem);
    }

    @Override // androidx.paging.PagedList
    @MainThread
    public void loadAroundInternal(int i11) {
        int prependItemsRequested = getPrependItemsRequested(this.mConfig.prefetchDistance, i11, this.mStorage.getLeadingNullCount());
        int appendItemsRequested = getAppendItemsRequested(this.mConfig.prefetchDistance, i11, this.mStorage.getLeadingNullCount() + this.mStorage.getStorageCount());
        int iMax = Math.max(prependItemsRequested, this.mPrependItemsRequested);
        this.mPrependItemsRequested = iMax;
        if (iMax > 0) {
            schedulePrepend();
        }
        int iMax2 = Math.max(appendItemsRequested, this.mAppendItemsRequested);
        this.mAppendItemsRequested = iMax2;
        if (iMax2 > 0) {
            scheduleAppend();
        }
    }

    @Override // androidx.paging.PagedStorage.Callback
    @MainThread
    public void onPageAppended(int i11, int i12, int i13) {
        int i14 = (this.mAppendItemsRequested - i12) - i13;
        this.mAppendItemsRequested = i14;
        this.mAppendWorkerState = 0;
        if (i14 > 0) {
            scheduleAppend();
        }
        notifyChanged(i11, i12);
        notifyInserted(i11 + i12, i13);
    }

    @Override // androidx.paging.PagedStorage.Callback
    @MainThread
    public void onPageInserted(int i11, int i12) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    @Override // androidx.paging.PagedStorage.Callback
    @MainThread
    public void onPagePlaceholderInserted(int i11) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    @Override // androidx.paging.PagedStorage.Callback
    @MainThread
    public void onPagePrepended(int i11, int i12, int i13) {
        int i14 = (this.mPrependItemsRequested - i12) - i13;
        this.mPrependItemsRequested = i14;
        this.mPrependWorkerState = 0;
        if (i14 > 0) {
            schedulePrepend();
        }
        notifyChanged(i11, i12);
        notifyInserted(0, i13);
        offsetAccessIndices(i13);
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPagesRemoved(int i11, int i12) {
        notifyRemoved(i11, i12);
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPagesSwappedToPlaceholder(int i11, int i12) {
        notifyChanged(i11, i12);
    }
}
