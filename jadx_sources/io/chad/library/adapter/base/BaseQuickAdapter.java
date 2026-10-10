package io.chad.library.adapter.base;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import io.chad.library.adapter.base.BaseViewHolder;
import io.chad.library.adapter.base.animation.AlphaInAnimation;
import io.chad.library.adapter.base.animation.BaseAnimation;
import io.chad.library.adapter.base.animation.ScaleInAnimation;
import io.chad.library.adapter.base.animation.SlideInBottomAnimation;
import io.chad.library.adapter.base.animation.SlideInLeftAnimation;
import io.chad.library.adapter.base.animation.SlideInRightAnimation;
import io.chad.library.adapter.base.entity.IExpandable;
import io.chad.library.adapter.base.loadmore.LoadMoreView;
import io.chad.library.adapter.base.loadmore.SimpleLoadMoreView;
import io.chad.library.adapter.base.util.MultiTypeDelegate;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes60.dex */
public abstract class BaseQuickAdapter<T, K extends BaseViewHolder> extends RecyclerView.Adapter<K> {
    public static final int ALPHAIN = 1;
    public static final int EMPTY_VIEW = 1365;
    public static final int FOOTER_VIEW = 819;
    public static final int HEADER_VIEW = 273;
    public static final int LOADING_VIEW = 546;
    public static final int SCALEIN = 2;
    public static final int SLIDEIN_BOTTOM = 3;
    public static final int SLIDEIN_LEFT = 4;
    public static final int SLIDEIN_RIGHT = 5;
    protected static final String TAG = "BaseQuickAdapter";
    private boolean footerViewAsFlow;
    private boolean headerViewAsFlow;
    protected Context mContext;
    private BaseAnimation mCustomAnimation;
    protected List<T> mData;
    private int mDuration;
    private FrameLayout mEmptyLayout;
    private boolean mEnableLoadMoreEndClick;
    private boolean mFirstOnlyEnable;
    private boolean mFootAndEmptyEnable;
    private LinearLayout mFooterLayout;
    private boolean mHeadAndEmptyEnable;
    private LinearLayout mHeaderLayout;
    private Interpolator mInterpolator;
    private boolean mIsUseEmpty;
    private int mLastPosition;
    protected LayoutInflater mLayoutInflater;
    protected int mLayoutResId;
    private boolean mLoadMoreEnable;
    private LoadMoreView mLoadMoreView;
    private boolean mLoading;
    private MultiTypeDelegate<T> mMultiTypeDelegate;
    private boolean mNextLoadEnable;
    private OnItemChildClickListener mOnItemChildClickListener;
    private OnItemChildLongClickListener mOnItemChildLongClickListener;
    private OnItemClickListener mOnItemClickListener;
    private OnItemLongClickListener mOnItemLongClickListener;
    private boolean mOpenAnimationEnable;
    private int mPreLoadNumber;
    private RecyclerView mRecyclerView;
    private RequestLoadMoreListener mRequestLoadMoreListener;
    private BaseAnimation mSelectAnimation;
    private SpanSizeLookup mSpanSizeLookup;
    private int mStartUpFetchPosition;
    private boolean mUpFetchEnable;
    private UpFetchListener mUpFetchListener;
    private boolean mUpFetching;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AnimationType {
    }

    public interface OnItemChildClickListener {
        void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i11);
    }

    public interface OnItemChildLongClickListener {
        boolean onItemChildLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i11);
    }

    public interface OnItemClickListener {
        void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11);
    }

    public interface OnItemLongClickListener {
        boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i11);
    }

    public interface RequestLoadMoreListener {
        void onLoadMoreRequested();
    }

    public interface SpanSizeLookup {
        int getSpanSize(GridLayoutManager gridLayoutManager, int i11);
    }

    public interface UpFetchListener {
        void onUpFetch();
    }

    public BaseQuickAdapter(@LayoutRes int i11, @Nullable List<T> list) {
        this.mNextLoadEnable = false;
        this.mLoadMoreEnable = false;
        this.mLoading = false;
        this.mLoadMoreView = new SimpleLoadMoreView();
        this.mEnableLoadMoreEndClick = false;
        this.mFirstOnlyEnable = true;
        this.mOpenAnimationEnable = false;
        this.mInterpolator = new LinearInterpolator();
        this.mDuration = 300;
        this.mLastPosition = -1;
        this.mSelectAnimation = new AlphaInAnimation();
        this.mIsUseEmpty = true;
        this.mStartUpFetchPosition = 1;
        this.mPreLoadNumber = 1;
        this.mData = list == null ? new ArrayList<>() : list;
        if (i11 != 0) {
            this.mLayoutResId = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTheBiggestNumber(int[] iArr) {
        int i11 = -1;
        if (iArr != null && iArr.length != 0) {
            for (int i12 : iArr) {
                if (i12 > i11) {
                    i11 = i12;
                }
            }
        }
        return i11;
    }

    public void addData(@IntRange(from = 0) int i11, @NonNull T t11) {
        this.mData.add(i11, t11);
        notifyItemInserted(i11 + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    public int addFooterView(View view) {
        return addFooterView(view, -1, 1);
    }

    public int addHeaderView(View view) {
        return addHeaderView(view, -1);
    }

    public void closeLoadAnimation() {
        this.mOpenAnimationEnable = false;
    }

    public int collapse(@IntRange(from = 0) int i11, boolean z11, boolean z12) {
        int headerLayoutCount = i11 - getHeaderLayoutCount();
        IExpandable expandableItem = getExpandableItem(headerLayoutCount);
        if (expandableItem == null) {
            return 0;
        }
        int iRecursiveCollapse = recursiveCollapse(headerLayoutCount);
        expandableItem.setExpanded(false);
        int headerLayoutCount2 = headerLayoutCount + getHeaderLayoutCount();
        if (z12) {
            if (z11) {
                notifyItemChanged(headerLayoutCount2);
                notifyItemRangeRemoved(headerLayoutCount2 + 1, iRecursiveCollapse);
                return iRecursiveCollapse;
            }
            notifyDataSetChanged();
        }
        return iRecursiveCollapse;
    }

    public abstract void convert(K k11, T t11);

    public K createBaseViewHolder(ViewGroup viewGroup, int i11) {
        return (K) createBaseViewHolder(getItemView(i11, viewGroup));
    }

    public void disableLoadMoreIfNotFullPage() {
        checkNotNull();
        disableLoadMoreIfNotFullPage(getRecyclerView());
    }

    public int expand(@IntRange(from = 0) int i11, boolean z11, boolean z12) {
        int headerLayoutCount = i11 - getHeaderLayoutCount();
        IExpandable expandableItem = getExpandableItem(headerLayoutCount);
        int iRecursiveExpand = 0;
        if (expandableItem == null) {
            return 0;
        }
        if (!hasSubItems(expandableItem)) {
            expandableItem.setExpanded(true);
            notifyItemChanged(headerLayoutCount);
            return 0;
        }
        if (!expandableItem.isExpanded()) {
            List<T> subItems = expandableItem.getSubItems();
            int i12 = headerLayoutCount + 1;
            this.mData.addAll(i12, subItems);
            iRecursiveExpand = recursiveExpand(i12, subItems);
            expandableItem.setExpanded(true);
        }
        int headerLayoutCount2 = headerLayoutCount + getHeaderLayoutCount();
        if (z12) {
            if (z11) {
                notifyItemChanged(headerLayoutCount2);
                notifyItemRangeInserted(headerLayoutCount2 + 1, iRecursiveExpand);
                return iRecursiveExpand;
            }
            notifyDataSetChanged();
        }
        return iRecursiveExpand;
    }

    public int expandAll(int i11, boolean z11, boolean z12) {
        T item;
        int headerLayoutCount = i11 - getHeaderLayoutCount();
        int i12 = headerLayoutCount + 1;
        T item2 = i12 < this.mData.size() ? getItem(i12) : null;
        IExpandable expandableItem = getExpandableItem(headerLayoutCount);
        if (expandableItem == null) {
            return 0;
        }
        if (!hasSubItems(expandableItem)) {
            expandableItem.setExpanded(true);
            notifyItemChanged(headerLayoutCount);
            return 0;
        }
        int iExpand = expand(getHeaderLayoutCount() + headerLayoutCount, false, false);
        while (i12 < this.mData.size() && (item = getItem(i12)) != item2) {
            if (isExpandable(item)) {
                iExpand += expand(getHeaderLayoutCount() + i12, false, false);
            }
            i12++;
        }
        if (z12) {
            if (z11) {
                notifyItemRangeInserted(headerLayoutCount + getHeaderLayoutCount() + 1, iExpand);
                return iExpand;
            }
            notifyDataSetChanged();
        }
        return iExpand;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Nullable
    public View getViewByPosition(int i11, @IdRes int i12) {
        checkNotNull();
        return getViewByPosition(getRecyclerView(), i11, i12);
    }

    public boolean hasSubItems(IExpandable iExpandable) {
        List<T> subItems;
        return (iExpandable == null || (subItems = iExpandable.getSubItems()) == null || subItems.size() <= 0) ? false : true;
    }

    public void loadMoreEnd() {
        loadMoreEnd(false);
    }

    public void openLoadAnimation(int i11) {
        this.mOpenAnimationEnable = true;
        this.mCustomAnimation = null;
        if (i11 == 1) {
            this.mSelectAnimation = new AlphaInAnimation();
            return;
        }
        if (i11 == 2) {
            this.mSelectAnimation = new ScaleInAnimation();
            return;
        }
        if (i11 == 3) {
            this.mSelectAnimation = new SlideInBottomAnimation();
        } else if (i11 == 4) {
            this.mSelectAnimation = new SlideInLeftAnimation();
        } else {
            if (i11 != 5) {
                return;
            }
            this.mSelectAnimation = new SlideInRightAnimation();
        }
    }

    public void setEmptyView(int i11, ViewGroup viewGroup) {
        setEmptyView(LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, false));
    }

    public int setFooterView(View view) {
        return setFooterView(view, 0, 1);
    }

    public void setHeaderAndEmpty(boolean z11) {
        setHeaderFooterEmpty(z11, false);
    }

    public int setHeaderView(View view) {
        return setHeaderView(view, 0, 1);
    }

    @Deprecated
    public void setOnLoadMoreListener(RequestLoadMoreListener requestLoadMoreListener) {
        openLoadMore(requestLoadMoreListener);
    }

    public void setPreLoadNumber(int i11) {
        if (i11 > 1) {
            this.mPreLoadNumber = i11;
        }
    }

    private void addAnimation(RecyclerView.ViewHolder viewHolder) {
        if (this.mOpenAnimationEnable) {
            if (!this.mFirstOnlyEnable || viewHolder.getLayoutPosition() > this.mLastPosition) {
                BaseAnimation baseAnimation = this.mCustomAnimation;
                if (baseAnimation == null) {
                    baseAnimation = this.mSelectAnimation;
                }
                for (Animator animator : baseAnimation.getAnimators(viewHolder.itemView)) {
                    startAnim(animator, viewHolder.getLayoutPosition());
                }
                this.mLastPosition = viewHolder.getLayoutPosition();
            }
        }
    }

    private void bindViewClickListener(final BaseViewHolder baseViewHolder) {
        View view;
        if (baseViewHolder == null || (view = baseViewHolder.itemView) == null) {
            return;
        }
        if (getOnItemClickListener() != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: io.chad.library.adapter.base.BaseQuickAdapter.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    BaseQuickAdapter.this.setOnItemClick(view2, baseViewHolder.getLayoutPosition() - BaseQuickAdapter.this.getHeaderLayoutCount());
                }
            });
        }
        if (getOnItemLongClickListener() != null) {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: io.chad.library.adapter.base.BaseQuickAdapter.6
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view2) {
                    return BaseQuickAdapter.this.setOnItemLongClick(view2, baseViewHolder.getLayoutPosition() - BaseQuickAdapter.this.getHeaderLayoutCount());
                }
            });
        }
    }

    private void compatibilityDataSizeChanged(int i11) {
        List<T> list = this.mData;
        if ((list == null ? 0 : list.size()) == i11) {
            notifyDataSetChanged();
        }
    }

    private int getItemPosition(T t11) {
        List<T> list;
        if (t11 == null || (list = this.mData) == null || list.isEmpty()) {
            return -1;
        }
        return this.mData.indexOf(t11);
    }

    private K getLoadingView(ViewGroup viewGroup) {
        K k11 = (K) createBaseViewHolder(getItemView(this.mLoadMoreView.getLayoutId(), viewGroup));
        k11.itemView.setOnClickListener(new View.OnClickListener() { // from class: io.chad.library.adapter.base.BaseQuickAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BaseQuickAdapter.this.mLoadMoreView.getLoadMoreStatus() == 3) {
                    BaseQuickAdapter.this.notifyLoadMoreToLoading();
                }
                if (BaseQuickAdapter.this.mEnableLoadMoreEndClick && BaseQuickAdapter.this.mLoadMoreView.getLoadMoreStatus() == 4) {
                    BaseQuickAdapter.this.notifyLoadMoreToLoading();
                }
            }
        });
        return k11;
    }

    private void openLoadMore(RequestLoadMoreListener requestLoadMoreListener) {
        this.mRequestLoadMoreListener = requestLoadMoreListener;
        this.mNextLoadEnable = true;
        this.mLoadMoreEnable = true;
        this.mLoading = false;
    }

    private void setRecyclerView(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
    }

    public int addFooterView(View view, int i11) {
        return addFooterView(view, i11, 1);
    }

    public int addHeaderView(View view, int i11) {
        return addHeaderView(view, i11, 1);
    }

    public K createBaseViewHolder(View view) {
        Class instancedGenericKClass = null;
        for (Class<?> superclass = getClass(); instancedGenericKClass == null && superclass != null; superclass = superclass.getSuperclass()) {
            instancedGenericKClass = getInstancedGenericKClass(superclass);
        }
        K k11 = instancedGenericKClass == null ? (K) new BaseViewHolder(view) : (K) createGenericKInstance(instancedGenericKClass, view);
        return k11 != null ? k11 : (K) new BaseViewHolder(view);
    }

    public void enableLoadMoreEndClick(boolean z11) {
        this.mEnableLoadMoreEndClick = z11;
    }

    @NonNull
    public List<T> getData() {
        return this.mData;
    }

    public int getDefItemViewType(int i11) {
        MultiTypeDelegate<T> multiTypeDelegate = this.mMultiTypeDelegate;
        return multiTypeDelegate != null ? multiTypeDelegate.getDefItemViewType(this.mData, i11) : super.getItemViewType(i11);
    }

    public View getEmptyView() {
        return this.mEmptyLayout;
    }

    public int getEmptyViewCount() {
        FrameLayout frameLayout = this.mEmptyLayout;
        return (frameLayout == null || frameLayout.getChildCount() == 0 || !this.mIsUseEmpty || this.mData.size() != 0) ? 0 : 1;
    }

    public LinearLayout getFooterLayout() {
        return this.mFooterLayout;
    }

    public int getFooterLayoutCount() {
        LinearLayout linearLayout = this.mFooterLayout;
        return (linearLayout == null || linearLayout.getChildCount() == 0) ? 0 : 1;
    }

    public LinearLayout getHeaderLayout() {
        return this.mHeaderLayout;
    }

    public int getHeaderLayoutCount() {
        LinearLayout linearLayout = this.mHeaderLayout;
        return (linearLayout == null || linearLayout.getChildCount() == 0) ? 0 : 1;
    }

    @Nullable
    public T getItem(@IntRange(from = 0) int i11) {
        if (i11 < 0 || i11 >= this.mData.size()) {
            return null;
        }
        return this.mData.get(i11);
    }

    public View getItemView(@LayoutRes int i11, ViewGroup viewGroup) {
        return this.mLayoutInflater.inflate(i11, viewGroup, false);
    }

    public int getLoadMoreViewCount() {
        if (this.mRequestLoadMoreListener == null || !this.mLoadMoreEnable) {
            return 0;
        }
        return ((this.mNextLoadEnable || !this.mLoadMoreView.isLoadEndMoreGone()) && this.mData.size() != 0) ? 1 : 0;
    }

    public MultiTypeDelegate<T> getMultiTypeDelegate() {
        return this.mMultiTypeDelegate;
    }

    @Nullable
    public final OnItemChildClickListener getOnItemChildClickListener() {
        return this.mOnItemChildClickListener;
    }

    @Nullable
    public final OnItemChildLongClickListener getOnItemChildLongClickListener() {
        return this.mOnItemChildLongClickListener;
    }

    public final OnItemClickListener getOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    public final OnItemLongClickListener getOnItemLongClickListener() {
        return this.mOnItemLongClickListener;
    }

    public RecyclerView getRecyclerView() {
        return this.mRecyclerView;
    }

    public boolean isExpandable(T t11) {
        return t11 != null && (t11 instanceof IExpandable);
    }

    public void isFirstOnly(boolean z11) {
        this.mFirstOnlyEnable = z11;
    }

    public boolean isFixedViewType(int i11) {
        return i11 == 1365 || i11 == 273 || i11 == 819 || i11 == 546;
    }

    public boolean isFooterViewAsFlow() {
        return this.footerViewAsFlow;
    }

    public boolean isHeaderViewAsFlow() {
        return this.headerViewAsFlow;
    }

    public boolean isLoadMoreEnable() {
        return this.mLoadMoreEnable;
    }

    public boolean isLoading() {
        return this.mLoading;
    }

    public boolean isUpFetchEnable() {
        return this.mUpFetchEnable;
    }

    public boolean isUpFetching() {
        return this.mUpFetching;
    }

    public void isUseEmpty(boolean z11) {
        this.mIsUseEmpty = z11;
    }

    public void loadMoreEnd(boolean z11) {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.mLoading = false;
        this.mNextLoadEnable = false;
        this.mLoadMoreView.setLoadMoreEndGone(z11);
        if (z11) {
            notifyItemRemoved(getLoadMoreViewPosition());
        } else {
            this.mLoadMoreView.setLoadMoreStatus(4);
            notifyItemChanged(getLoadMoreViewPosition());
        }
    }

    public void notifyLoadMoreToLoading() {
        if (this.mLoadMoreView.getLoadMoreStatus() == 2) {
            return;
        }
        this.mLoadMoreView.setLoadMoreStatus(1);
        notifyItemChanged(getLoadMoreViewPosition());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(K k11, int i11) {
        autoUpFetch(i11);
        autoLoadMore(i11);
        int itemViewType = k11.getItemViewType();
        if (itemViewType == 0) {
            convert(k11, getItem(i11 - getHeaderLayoutCount()));
            return;
        }
        if (itemViewType != 273) {
            if (itemViewType == 546) {
                this.mLoadMoreView.convert(k11);
            } else {
                if (itemViewType == 819 || itemViewType == 1365) {
                    return;
                }
                convert(k11, getItem(i11 - getHeaderLayoutCount()));
            }
        }
    }

    public K onCreateDefViewHolder(ViewGroup viewGroup, int i11) {
        int layoutId = this.mLayoutResId;
        MultiTypeDelegate<T> multiTypeDelegate = this.mMultiTypeDelegate;
        if (multiTypeDelegate != null) {
            layoutId = multiTypeDelegate.getLayoutId(i11);
        }
        return (K) createBaseViewHolder(viewGroup, layoutId);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public K onCreateViewHolder(ViewGroup viewGroup, int i11) {
        K k11;
        Context context = viewGroup.getContext();
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
        if (i11 == 273) {
            k11 = (K) createBaseViewHolder(this.mHeaderLayout);
        } else if (i11 == 546) {
            k11 = (K) getLoadingView(viewGroup);
        } else if (i11 == 819) {
            k11 = (K) createBaseViewHolder(this.mFooterLayout);
        } else if (i11 != 1365) {
            k11 = (K) onCreateDefViewHolder(viewGroup, i11);
            bindViewClickListener(k11);
        } else {
            k11 = (K) createBaseViewHolder(this.mEmptyLayout);
        }
        k11.setAdapter(this);
        return k11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(K k11) {
        super.onViewAttachedToWindow(k11);
        int itemViewType = k11.getItemViewType();
        if (itemViewType == 1365 || itemViewType == 273 || itemViewType == 819 || itemViewType == 546) {
            setFullSpan(k11);
        } else {
            addAnimation(k11);
        }
    }

    public void remove(@IntRange(from = 0) int i11) {
        this.mData.remove(i11);
        int headerLayoutCount = i11 + getHeaderLayoutCount();
        notifyItemRemoved(headerLayoutCount);
        compatibilityDataSizeChanged(0);
        notifyItemRangeChanged(headerLayoutCount, this.mData.size() - headerLayoutCount);
    }

    public void replaceData(@NonNull Collection<? extends T> collection) {
        List<T> list = this.mData;
        if (collection != list) {
            list.clear();
            this.mData.addAll(collection);
        }
        notifyDataSetChanged();
    }

    public void setData(@IntRange(from = 0) int i11, @NonNull T t11) {
        this.mData.set(i11, t11);
        notifyItemChanged(i11 + getHeaderLayoutCount());
    }

    public void setDuration(int i11) {
        this.mDuration = i11;
    }

    public int setFooterView(View view, int i11) {
        return setFooterView(view, i11, 1);
    }

    public void setFooterViewAsFlow(boolean z11) {
        this.footerViewAsFlow = z11;
    }

    public void setFullSpan(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) viewHolder.itemView.getLayoutParams()).setFullSpan(true);
        }
    }

    public void setHeaderFooterEmpty(boolean z11, boolean z12) {
        this.mHeadAndEmptyEnable = z11;
        this.mFootAndEmptyEnable = z12;
    }

    public int setHeaderView(View view, int i11) {
        return setHeaderView(view, i11, 1);
    }

    public void setHeaderViewAsFlow(boolean z11) {
        this.headerViewAsFlow = z11;
    }

    public void setLoadMoreView(LoadMoreView loadMoreView) {
        this.mLoadMoreView = loadMoreView;
    }

    public void setMultiTypeDelegate(MultiTypeDelegate<T> multiTypeDelegate) {
        this.mMultiTypeDelegate = multiTypeDelegate;
    }

    public void setNewData(@Nullable List<T> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.mData = list;
        if (this.mRequestLoadMoreListener != null) {
            this.mNextLoadEnable = true;
            this.mLoadMoreEnable = true;
            this.mLoading = false;
            this.mLoadMoreView.setLoadMoreStatus(1);
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
    }

    public void setNotDoAnimationCount(int i11) {
        this.mLastPosition = i11;
    }

    public void setOnItemChildClickListener(OnItemChildClickListener onItemChildClickListener) {
        this.mOnItemChildClickListener = onItemChildClickListener;
    }

    public void setOnItemChildLongClickListener(OnItemChildLongClickListener onItemChildLongClickListener) {
        this.mOnItemChildLongClickListener = onItemChildLongClickListener;
    }

    public void setOnItemClickListener(@Nullable OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        this.mOnItemLongClickListener = onItemLongClickListener;
    }

    public void setOnLoadMoreListener(RequestLoadMoreListener requestLoadMoreListener, RecyclerView recyclerView) {
        openLoadMore(requestLoadMoreListener);
        if (getRecyclerView() == null) {
            setRecyclerView(recyclerView);
        }
    }

    public void setSpanSizeLookup(SpanSizeLookup spanSizeLookup) {
        this.mSpanSizeLookup = spanSizeLookup;
    }

    public void setStartUpFetchPosition(int i11) {
        this.mStartUpFetchPosition = i11;
    }

    public void setUpFetchEnable(boolean z11) {
        this.mUpFetchEnable = z11;
    }

    public void setUpFetchListener(UpFetchListener upFetchListener) {
        this.mUpFetchListener = upFetchListener;
    }

    public void setUpFetching(boolean z11) {
        this.mUpFetching = z11;
    }

    public void startAnim(Animator animator, int i11) {
        animator.setDuration(this.mDuration).start();
        animator.setInterpolator(this.mInterpolator);
    }

    private void autoLoadMore(int i11) {
        if (getLoadMoreViewCount() != 0 && i11 >= getItemCount() - this.mPreLoadNumber && this.mLoadMoreView.getLoadMoreStatus() == 1) {
            this.mLoadMoreView.setLoadMoreStatus(2);
            if (!this.mLoading) {
                this.mLoading = true;
                if (getRecyclerView() != null) {
                    getRecyclerView().post(new Runnable() { // from class: io.chad.library.adapter.base.BaseQuickAdapter.7
                        @Override // java.lang.Runnable
                        public void run() {
                            BaseQuickAdapter.this.mRequestLoadMoreListener.onLoadMoreRequested();
                        }
                    });
                } else {
                    this.mRequestLoadMoreListener.onLoadMoreRequested();
                }
            }
        }
    }

    private void autoUpFetch(int i11) {
        UpFetchListener upFetchListener;
        if (isUpFetchEnable() && !isUpFetching() && i11 <= this.mStartUpFetchPosition && (upFetchListener = this.mUpFetchListener) != null) {
            upFetchListener.onUpFetch();
        }
    }

    private void checkNotNull() {
        if (getRecyclerView() != null) {
        } else {
            throw new RuntimeException("please bind recyclerView first!");
        }
    }

    private K createGenericKInstance(Class cls, View view) {
        try {
            if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(getClass(), View.class);
                declaredConstructor.setAccessible(true);
                return (K) declaredConstructor.newInstance(this, view);
            }
            Constructor<T> declaredConstructor2 = cls.getDeclaredConstructor(View.class);
            declaredConstructor2.setAccessible(true);
            return (K) declaredConstructor2.newInstance(view);
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
            return null;
        } catch (InstantiationException e12) {
            e12.printStackTrace();
            return null;
        } catch (NoSuchMethodException e13) {
            e13.printStackTrace();
            return null;
        } catch (InvocationTargetException e14) {
            e14.printStackTrace();
            return null;
        }
    }

    private IExpandable getExpandableItem(int i11) {
        T item = getItem(i11);
        if (isExpandable(item)) {
            return (IExpandable) item;
        }
        return null;
    }

    private int getFooterViewPosition() {
        int i11 = 1;
        if (getEmptyViewCount() == 1) {
            if (this.mHeadAndEmptyEnable && getHeaderLayoutCount() != 0) {
                i11 = 2;
            }
            if (this.mFootAndEmptyEnable) {
                return i11;
            }
            return -1;
        }
        return getHeaderLayoutCount() + this.mData.size();
    }

    private int getHeaderViewPosition() {
        if (getEmptyViewCount() != 1 || this.mHeadAndEmptyEnable) {
            return 0;
        }
        return -1;
    }

    private Class getInstancedGenericKClass(Class cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            for (Type type : ((ParameterizedType) genericSuperclass).getActualTypeArguments()) {
                if (type instanceof Class) {
                    Class cls2 = (Class) type;
                    if (BaseViewHolder.class.isAssignableFrom(cls2)) {
                        return cls2;
                    }
                } else if (type instanceof ParameterizedType) {
                    Type rawType = ((ParameterizedType) type).getRawType();
                    if (rawType instanceof Class) {
                        Class cls3 = (Class) rawType;
                        if (BaseViewHolder.class.isAssignableFrom(cls3)) {
                            return cls3;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isFullScreen(LinearLayoutManager linearLayoutManager) {
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() + 1 != getItemCount() || linearLayoutManager.findFirstCompletelyVisibleItemPosition() != 0) {
            return true;
        }
        return false;
    }

    private int recursiveCollapse(@IntRange(from = 0) int i11) {
        T item = getItem(i11);
        int iRecursiveCollapse = 0;
        if (!isExpandable(item)) {
            return 0;
        }
        IExpandable iExpandable = (IExpandable) item;
        if (iExpandable.isExpanded()) {
            List<T> subItems = iExpandable.getSubItems();
            if (subItems == null) {
                return 0;
            }
            for (int size = subItems.size() - 1; size >= 0; size--) {
                T t11 = subItems.get(size);
                int itemPosition = getItemPosition(t11);
                if (itemPosition >= 0 && (itemPosition >= i11 || (itemPosition = i11 + size + 1) < this.mData.size())) {
                    if (t11 instanceof IExpandable) {
                        iRecursiveCollapse += recursiveCollapse(itemPosition);
                    }
                    this.mData.remove(itemPosition);
                    iRecursiveCollapse++;
                }
            }
        }
        return iRecursiveCollapse;
    }

    private int recursiveExpand(int i11, @NonNull List list) {
        int size = list.size();
        int size2 = (i11 + list.size()) - 1;
        int size3 = list.size() - 1;
        while (size3 >= 0) {
            if (list.get(size3) instanceof IExpandable) {
                IExpandable iExpandable = (IExpandable) list.get(size3);
                if (iExpandable.isExpanded() && hasSubItems(iExpandable)) {
                    List<T> subItems = iExpandable.getSubItems();
                    int i12 = size2 + 1;
                    this.mData.addAll(i12, subItems);
                    size += recursiveExpand(i12, subItems);
                }
            }
            size3--;
            size2--;
        }
        return size;
    }

    @Deprecated
    public void add(@IntRange(from = 0) int i11, @NonNull T t11) {
        addData(i11, t11);
    }

    public int addFooterView(View view, int i11, int i12) {
        int footerViewPosition;
        if (this.mFooterLayout == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.mFooterLayout = linearLayout;
            if (i12 == 1) {
                linearLayout.setOrientation(1);
                this.mFooterLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                linearLayout.setOrientation(0);
                this.mFooterLayout.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
            }
        }
        int childCount = this.mFooterLayout.getChildCount();
        if (i11 < 0 || i11 > childCount) {
            i11 = childCount;
        }
        this.mFooterLayout.addView(view, i11);
        if (this.mFooterLayout.getChildCount() == 1 && (footerViewPosition = getFooterViewPosition()) != -1) {
            notifyItemInserted(footerViewPosition);
        }
        return i11;
    }

    public int addHeaderView(View view, int i11, int i12) {
        int headerViewPosition;
        if (this.mHeaderLayout == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.mHeaderLayout = linearLayout;
            if (i12 == 1) {
                linearLayout.setOrientation(1);
                this.mHeaderLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                linearLayout.setOrientation(0);
                this.mHeaderLayout.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
            }
        }
        int childCount = this.mHeaderLayout.getChildCount();
        if (i11 < 0 || i11 > childCount) {
            i11 = childCount;
        }
        this.mHeaderLayout.addView(view, i11);
        if (this.mHeaderLayout.getChildCount() == 1 && (headerViewPosition = getHeaderViewPosition()) != -1) {
            notifyItemInserted(headerViewPosition);
        }
        return i11;
    }

    public void bindToRecyclerView(RecyclerView recyclerView) {
        if (getRecyclerView() == null) {
            setRecyclerView(recyclerView);
            getRecyclerView().setAdapter(this);
            return;
        }
        throw new RuntimeException("Don't bind twice");
    }

    public void disableLoadMoreIfNotFullPage(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager;
        setEnableLoadMore(false);
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            recyclerView.postDelayed(new Runnable() { // from class: io.chad.library.adapter.base.BaseQuickAdapter.1
                @Override // java.lang.Runnable
                public void run() {
                    if (BaseQuickAdapter.this.isFullScreen(linearLayoutManager)) {
                        BaseQuickAdapter.this.setEnableLoadMore(true);
                    }
                }
            }, 50L);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            final StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            recyclerView.postDelayed(new Runnable() { // from class: io.chad.library.adapter.base.BaseQuickAdapter.2
                @Override // java.lang.Runnable
                public void run() {
                    int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
                    staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(iArr);
                    if (BaseQuickAdapter.this.getTheBiggestNumber(iArr) + 1 != BaseQuickAdapter.this.getItemCount()) {
                        BaseQuickAdapter.this.setEnableLoadMore(true);
                    }
                }
            }, 50L);
        }
    }

    @Deprecated
    public int getFooterViewsCount() {
        return getFooterLayoutCount();
    }

    @Deprecated
    public int getHeaderViewsCount() {
        return getHeaderLayoutCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i11;
        if (getEmptyViewCount() == 1) {
            if (this.mHeadAndEmptyEnable && getHeaderLayoutCount() != 0) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            if (this.mFootAndEmptyEnable && getFooterLayoutCount() != 0) {
                return i11 + 1;
            }
            return i11;
        }
        return getHeaderLayoutCount() + this.mData.size() + getFooterLayoutCount() + getLoadMoreViewCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        boolean z11;
        if (getEmptyViewCount() == 1) {
            if (this.mHeadAndEmptyEnable && getHeaderLayoutCount() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return FOOTER_VIEW;
                    }
                    return EMPTY_VIEW;
                }
                if (!z11) {
                    return FOOTER_VIEW;
                }
                return EMPTY_VIEW;
            }
            if (z11) {
                return HEADER_VIEW;
            }
            return EMPTY_VIEW;
        }
        int headerLayoutCount = getHeaderLayoutCount();
        if (i11 < headerLayoutCount) {
            return HEADER_VIEW;
        }
        int i12 = i11 - headerLayoutCount;
        int size = this.mData.size();
        if (i12 < size) {
            return getDefItemViewType(i12);
        }
        if (i12 - size < getFooterLayoutCount()) {
            return FOOTER_VIEW;
        }
        return LOADING_VIEW;
    }

    public int getLoadMoreViewPosition() {
        return getHeaderLayoutCount() + this.mData.size() + getFooterLayoutCount();
    }

    public int getParentPosition(@NonNull T t11) {
        int level;
        int itemPosition = getItemPosition(t11);
        if (itemPosition == -1) {
            return -1;
        }
        if (t11 instanceof IExpandable) {
            level = ((IExpandable) t11).getLevel();
        } else {
            level = Integer.MAX_VALUE;
        }
        if (level == 0) {
            return itemPosition;
        }
        if (level == -1) {
            return -1;
        }
        while (itemPosition >= 0) {
            T t12 = this.mData.get(itemPosition);
            if (t12 instanceof IExpandable) {
                IExpandable iExpandable = (IExpandable) t12;
                if (iExpandable.getLevel() >= 0 && iExpandable.getLevel() < level) {
                    return itemPosition;
                }
            }
            itemPosition--;
        }
        return -1;
    }

    @Nullable
    public View getViewByPosition(RecyclerView recyclerView, int i11, @IdRes int i12) {
        BaseViewHolder baseViewHolder;
        if (recyclerView == null || (baseViewHolder = (BaseViewHolder) recyclerView.findViewHolderForLayoutPosition(i11)) == null) {
            return null;
        }
        return baseViewHolder.getView(i12);
    }

    public void loadMoreComplete() {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.mLoading = false;
        this.mNextLoadEnable = true;
        this.mLoadMoreView.setLoadMoreStatus(1);
        notifyItemChanged(getLoadMoreViewPosition());
    }

    public void loadMoreFail() {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.mLoading = false;
        this.mLoadMoreView.setLoadMoreStatus(3);
        notifyItemChanged(getLoadMoreViewPosition());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: io.chad.library.adapter.base.BaseQuickAdapter.4
                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public int getSpanSize(int i11) {
                    int itemViewType = BaseQuickAdapter.this.getItemViewType(i11);
                    if (itemViewType == 273 && BaseQuickAdapter.this.isHeaderViewAsFlow()) {
                        return 1;
                    }
                    if (itemViewType == 819 && BaseQuickAdapter.this.isFooterViewAsFlow()) {
                        return 1;
                    }
                    if (BaseQuickAdapter.this.mSpanSizeLookup != null) {
                        return BaseQuickAdapter.this.isFixedViewType(itemViewType) ? gridLayoutManager.getSpanCount() : BaseQuickAdapter.this.mSpanSizeLookup.getSpanSize(gridLayoutManager, i11 - BaseQuickAdapter.this.getHeaderLayoutCount());
                    }
                    if (BaseQuickAdapter.this.isFixedViewType(itemViewType)) {
                        return gridLayoutManager.getSpanCount();
                    }
                    return 1;
                }
            });
        }
    }

    public final void refreshNotifyItemChanged(int i11) {
        notifyItemChanged(i11 + getHeaderLayoutCount());
    }

    public void removeAllFooterView() {
        if (getFooterLayoutCount() != 0) {
            this.mFooterLayout.removeAllViews();
            int footerViewPosition = getFooterViewPosition();
            if (footerViewPosition != -1) {
                notifyItemRemoved(footerViewPosition);
            }
        }
    }

    public void removeAllHeaderView() {
        if (getHeaderLayoutCount() != 0) {
            this.mHeaderLayout.removeAllViews();
            int headerViewPosition = getHeaderViewPosition();
            if (headerViewPosition != -1) {
                notifyItemRemoved(headerViewPosition);
            }
        }
    }

    public void removeFooterView(View view) {
        int footerViewPosition;
        if (getFooterLayoutCount() != 0) {
            this.mFooterLayout.removeView(view);
            if (this.mFooterLayout.getChildCount() == 0 && (footerViewPosition = getFooterViewPosition()) != -1) {
                notifyItemRemoved(footerViewPosition);
            }
        }
    }

    public void removeHeaderView(View view) {
        int headerViewPosition;
        if (getHeaderLayoutCount() != 0) {
            this.mHeaderLayout.removeView(view);
            if (this.mHeaderLayout.getChildCount() == 0 && (headerViewPosition = getHeaderViewPosition()) != -1) {
                notifyItemRemoved(headerViewPosition);
            }
        }
    }

    @Deprecated
    public void setAutoLoadMoreSize(int i11) {
        setPreLoadNumber(i11);
    }

    @Deprecated
    public void setEmptyView(int i11) {
        checkNotNull();
        setEmptyView(i11, getRecyclerView());
    }

    public void setEnableLoadMore(boolean z11) {
        int loadMoreViewCount = getLoadMoreViewCount();
        this.mLoadMoreEnable = z11;
        int loadMoreViewCount2 = getLoadMoreViewCount();
        if (loadMoreViewCount == 1) {
            if (loadMoreViewCount2 == 0) {
                notifyItemRemoved(getLoadMoreViewPosition());
            }
        } else if (loadMoreViewCount2 == 1) {
            this.mLoadMoreView.setLoadMoreStatus(1);
            notifyItemInserted(getLoadMoreViewPosition());
        }
    }

    public int setFooterView(View view, int i11, int i12) {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout != null && linearLayout.getChildCount() > i11) {
            this.mFooterLayout.removeViewAt(i11);
            this.mFooterLayout.addView(view, i11);
            return i11;
        }
        return addFooterView(view, i11, i12);
    }

    public int setHeaderView(View view, int i11, int i12) {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout != null && linearLayout.getChildCount() > i11) {
            this.mHeaderLayout.removeViewAt(i11);
            this.mHeaderLayout.addView(view, i11);
            return i11;
        }
        return addHeaderView(view, i11, i12);
    }

    public void setOnItemClick(View view, int i11) {
        getOnItemClickListener().onItemClick(this, view, i11);
    }

    public boolean setOnItemLongClick(View view, int i11) {
        return getOnItemLongClickListener().onItemLongClick(this, view, i11);
    }

    public void addData(@NonNull T t11) {
        this.mData.add(t11);
        notifyItemInserted(this.mData.size() + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    public void setEmptyView(View view) {
        boolean z11;
        if (this.mEmptyLayout == null) {
            this.mEmptyLayout = new FrameLayout(view.getContext());
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -1);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).width = layoutParams2.width;
                ((ViewGroup.MarginLayoutParams) layoutParams).height = layoutParams2.height;
            }
            this.mEmptyLayout.setLayoutParams(layoutParams);
            z11 = true;
        } else {
            z11 = false;
        }
        this.mEmptyLayout.removeAllViews();
        this.mEmptyLayout.addView(view);
        this.mIsUseEmpty = true;
        if (z11 && getEmptyViewCount() == 1) {
            notifyItemInserted((!this.mHeadAndEmptyEnable || getHeaderLayoutCount() == 0) ? 0 : 1);
        }
    }

    public void addData(@IntRange(from = 0) int i11, @NonNull Collection<? extends T> collection) {
        this.mData.addAll(i11, collection);
        notifyItemRangeInserted(i11 + getHeaderLayoutCount(), collection.size());
        compatibilityDataSizeChanged(collection.size());
    }

    public void openLoadAnimation(BaseAnimation baseAnimation) {
        this.mOpenAnimationEnable = true;
        this.mCustomAnimation = baseAnimation;
    }

    public int collapse(@IntRange(from = 0) int i11) {
        return collapse(i11, true, true);
    }

    public void addData(@NonNull Collection<? extends T> collection) {
        this.mData.addAll(collection);
        notifyItemRangeInserted((this.mData.size() - collection.size()) + getHeaderLayoutCount(), collection.size());
        compatibilityDataSizeChanged(collection.size());
    }

    public int collapse(@IntRange(from = 0) int i11, boolean z11) {
        return collapse(i11, z11, true);
    }

    public void openLoadAnimation() {
        this.mOpenAnimationEnable = true;
    }

    public int expand(@IntRange(from = 0) int i11, boolean z11) {
        return expand(i11, z11, true);
    }

    public int expandAll(int i11, boolean z11) {
        return expandAll(i11, true, !z11);
    }

    public int expand(@IntRange(from = 0) int i11) {
        return expand(i11, true, true);
    }

    public void expandAll() {
        for (int size = (this.mData.size() - 1) + getHeaderLayoutCount(); size >= getHeaderLayoutCount(); size--) {
            expandAll(size, false, false);
        }
    }

    public BaseQuickAdapter(@Nullable List<T> list) {
        this(0, list);
    }

    public BaseQuickAdapter(@LayoutRes int i11) {
        this(i11, null);
    }
}
