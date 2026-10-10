package com.chad.library.adapter.base;

import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.loadState.LoadState;
import com.chad.library.adapter.base.loadState.leading.DefaultLeadingLoadStateAdapter;
import com.chad.library.adapter.base.loadState.leading.LeadingLoadStateAdapter;
import com.chad.library.adapter.base.loadState.trailing.DefaultTrailingLoadStateAdapter;
import com.chad.library.adapter.base.loadState.trailing.TrailingLoadStateAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: QuickAdapterHelper.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00014B;\b\u0002\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010-\u001a\u00020\u00002\u000e\u0010\u000b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003J\u001e\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u000e\u0010\u000b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003J\u0016\u00100\u001a\u00020\u00002\u000e\u0010\u000b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003J\u001e\u00100\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u000e\u0010\u000b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003J\u0006\u00101\u001a\u00020\u0000J\u0006\u00102\u001a\u00020\u0000J\u0016\u00103\u001a\u00020\u00002\u000e\u0010\u000b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00030\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00030\u00108F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010$\u001a\"\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00030%j\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003`&X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010'\u001a\"\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00030%j\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003`&X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010(\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\u0017\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u00065"}, m90084d2 = {"Lcom/chad/library/adapter/base/QuickAdapterHelper;", "", "contentAdapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "leadingLoadStateAdapter", "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;", "trailingLoadStateAdapter", "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;", "config", "Landroidx/recyclerview/widget/ConcatAdapter$Config;", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/ConcatAdapter$Config;)V", "adapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "getAdapter", "()Landroidx/recyclerview/widget/ConcatAdapter;", "afterAdapterList", "", "getAfterAdapterList", "()Ljava/util/List;", "beforeAdapterList", "getBeforeAdapterList", "getContentAdapter", "()Lcom/chad/library/adapter/base/BaseQuickAdapter;", "firstAdapterOnViewAttachChangeListener", "Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;", "lastAdapterOnViewAttachChangeListener", "value", "Lcom/chad/library/adapter/base/loadState/LoadState;", "leadingLoadState", "getLeadingLoadState", "()Lcom/chad/library/adapter/base/loadState/LoadState;", "setLeadingLoadState", "(Lcom/chad/library/adapter/base/loadState/LoadState;)V", "getLeadingLoadStateAdapter", "()Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;", "mAdapter", "mAfterList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mBeforeList", "trailingLoadState", "getTrailingLoadState", "setTrailingLoadState", "getTrailingLoadStateAdapter", "()Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;", "addAfterAdapter", "index", "", "addBeforeAdapter", "clearAfterAdapters", "clearBeforeAdapters", "removeAdapter", "Builder", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuickAdapterHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickAdapterHelper.kt\ncom/chad/library/adapter/base/QuickAdapterHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,343:1\n1#2:344\n1855#3,2:345\n1855#3,2:347\n*S KotlinDebug\n*F\n+ 1 QuickAdapterHelper.kt\ncom/chad/library/adapter/base/QuickAdapterHelper\n*L\n157#1:345,2\n225#1:347,2\n*E\n"})
public final class QuickAdapterHelper {

    @NotNull
    private final BaseQuickAdapter<?, ?> contentAdapter;

    @Nullable
    private BaseQuickAdapter.OnViewAttachStateChangeListener firstAdapterOnViewAttachChangeListener;

    @Nullable
    private BaseQuickAdapter.OnViewAttachStateChangeListener lastAdapterOnViewAttachChangeListener;

    @Nullable
    private final LeadingLoadStateAdapter<?> leadingLoadStateAdapter;

    @NotNull
    private final ConcatAdapter mAdapter;

    @NotNull
    private final ArrayList<BaseQuickAdapter<?, ?>> mAfterList;

    @NotNull
    private final ArrayList<BaseQuickAdapter<?, ?>> mBeforeList;

    @Nullable
    private final TrailingLoadStateAdapter<?> trailingLoadStateAdapter;

    /* JADX INFO: compiled from: QuickAdapterHelper.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bJ\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0014\u0010\u0012\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/chad/library/adapter/base/QuickAdapterHelper$Builder;", "", "contentAdapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "config", "Landroidx/recyclerview/widget/ConcatAdapter$Config;", "leadingLoadStateAdapter", "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter;", "trailingLoadStateAdapter", "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;", "build", "Lcom/chad/library/adapter/base/QuickAdapterHelper;", "setConfig", "setLeadingLoadStateAdapter", "loadListener", "Lcom/chad/library/adapter/base/loadState/leading/LeadingLoadStateAdapter$OnLeadingListener;", "loadStateAdapter", "setTrailingLoadStateAdapter", "loadMoreListener", "Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter$OnTrailingListener;", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Builder {

        @NotNull
        private ConcatAdapter.Config config;

        @NotNull
        private final BaseQuickAdapter<?, ?> contentAdapter;

        @Nullable
        private LeadingLoadStateAdapter<?> leadingLoadStateAdapter;

        @Nullable
        private TrailingLoadStateAdapter<?> trailingLoadStateAdapter;

        @NotNull
        public final Builder setLeadingLoadStateAdapter(@Nullable LeadingLoadStateAdapter<?> loadStateAdapter) {
            this.leadingLoadStateAdapter = loadStateAdapter;
            return this;
        }

        @NotNull
        public final Builder setTrailingLoadStateAdapter(@Nullable TrailingLoadStateAdapter<?> loadStateAdapter) {
            this.trailingLoadStateAdapter = loadStateAdapter;
            return this;
        }

        public Builder(@NotNull BaseQuickAdapter<?, ?> contentAdapter) {
            Intrinsics.checkNotNullParameter(contentAdapter, "contentAdapter");
            this.contentAdapter = contentAdapter;
            ConcatAdapter.Config DEFAULT = ConcatAdapter.Config.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            this.config = DEFAULT;
        }

        @NotNull
        public final QuickAdapterHelper build() {
            return new QuickAdapterHelper(this.contentAdapter, this.leadingLoadStateAdapter, this.trailingLoadStateAdapter, this.config, null);
        }

        @NotNull
        public final Builder setConfig(@NotNull ConcatAdapter.Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.config = config;
            return this;
        }

        @NotNull
        public final Builder setLeadingLoadStateAdapter(@Nullable LeadingLoadStateAdapter.OnLeadingListener loadListener) {
            DefaultLeadingLoadStateAdapter defaultLeadingLoadStateAdapter = new DefaultLeadingLoadStateAdapter();
            defaultLeadingLoadStateAdapter.setOnLeadingListener(loadListener);
            return setLeadingLoadStateAdapter(defaultLeadingLoadStateAdapter);
        }

        @NotNull
        public final Builder setTrailingLoadStateAdapter(@Nullable TrailingLoadStateAdapter.OnTrailingListener loadMoreListener) {
            DefaultTrailingLoadStateAdapter defaultTrailingLoadStateAdapter = new DefaultTrailingLoadStateAdapter(false, 1, null);
            defaultTrailingLoadStateAdapter.setOnLoadMoreListener(loadMoreListener);
            return setTrailingLoadStateAdapter(defaultTrailingLoadStateAdapter);
        }
    }

    public /* synthetic */ QuickAdapterHelper(BaseQuickAdapter baseQuickAdapter, LeadingLoadStateAdapter leadingLoadStateAdapter, TrailingLoadStateAdapter trailingLoadStateAdapter, ConcatAdapter.Config config, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseQuickAdapter, leadingLoadStateAdapter, trailingLoadStateAdapter, config);
    }

    @NotNull
    public final QuickAdapterHelper addAfterAdapter(@NotNull BaseQuickAdapter<?, ?> adapter) {
        boolean zAddAdapter;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        BaseQuickAdapter.OnViewAttachStateChangeListener onViewAttachStateChangeListener = this.lastAdapterOnViewAttachChangeListener;
        if (onViewAttachStateChangeListener != null) {
            if (this.mAfterList.isEmpty()) {
                this.contentAdapter.removeOnViewAttachStateChangeListener(onViewAttachStateChangeListener);
            } else {
                ((BaseQuickAdapter) CollectionsKt.last((List) this.mAfterList)).removeOnViewAttachStateChangeListener(onViewAttachStateChangeListener);
            }
            adapter.addOnViewAttachStateChangeListener(onViewAttachStateChangeListener);
        }
        if (this.trailingLoadStateAdapter == null) {
            zAddAdapter = this.mAdapter.addAdapter(adapter);
        } else {
            ConcatAdapter concatAdapter = this.mAdapter;
            zAddAdapter = concatAdapter.addAdapter(concatAdapter.getAdapters().size() - 1, adapter);
        }
        if (zAddAdapter) {
            this.mAfterList.add(adapter);
        }
        return this;
    }

    @NotNull
    public final QuickAdapterHelper addBeforeAdapter(@NotNull BaseQuickAdapter<?, ?> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        addBeforeAdapter(this.mBeforeList.size(), adapter);
        return this;
    }

    private QuickAdapterHelper(BaseQuickAdapter<?, ?> baseQuickAdapter, LeadingLoadStateAdapter<?> leadingLoadStateAdapter, TrailingLoadStateAdapter<?> trailingLoadStateAdapter, ConcatAdapter.Config config) {
        this.contentAdapter = baseQuickAdapter;
        this.leadingLoadStateAdapter = leadingLoadStateAdapter;
        this.trailingLoadStateAdapter = trailingLoadStateAdapter;
        this.mBeforeList = new ArrayList<>(0);
        this.mAfterList = new ArrayList<>(0);
        ConcatAdapter concatAdapter = new ConcatAdapter(config, (RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[0]);
        this.mAdapter = concatAdapter;
        if (leadingLoadStateAdapter != null) {
            concatAdapter.addAdapter(leadingLoadStateAdapter);
            BaseQuickAdapter.OnViewAttachStateChangeListener onViewAttachStateChangeListener = new BaseQuickAdapter.OnViewAttachStateChangeListener() { // from class: com.chad.library.adapter.base.QuickAdapterHelper$1$1
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnViewAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder holder) {
                    Intrinsics.checkNotNullParameter(holder, "holder");
                    this.this$0.getLeadingLoadStateAdapter().checkPreload$com_github_CymChad_brvah(holder.getBindingAdapterPosition());
                }

                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnViewAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder holder) {
                    Intrinsics.checkNotNullParameter(holder, "holder");
                }
            };
            baseQuickAdapter.addOnViewAttachStateChangeListener(onViewAttachStateChangeListener);
            this.firstAdapterOnViewAttachChangeListener = onViewAttachStateChangeListener;
        }
        concatAdapter.addAdapter(baseQuickAdapter);
        if (trailingLoadStateAdapter != null) {
            concatAdapter.addAdapter(trailingLoadStateAdapter);
            BaseQuickAdapter.OnViewAttachStateChangeListener onViewAttachStateChangeListener2 = new BaseQuickAdapter.OnViewAttachStateChangeListener() { // from class: com.chad.library.adapter.base.QuickAdapterHelper$2$1
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnViewAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder holder) {
                    Intrinsics.checkNotNullParameter(holder, "holder");
                    TrailingLoadStateAdapter<?> trailingLoadStateAdapter2 = this.this$0.getTrailingLoadStateAdapter();
                    RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = holder.getBindingAdapter();
                    trailingLoadStateAdapter2.checkPreload$com_github_CymChad_brvah(bindingAdapter != null ? bindingAdapter.getItemCount() : 0, holder.getBindingAdapterPosition());
                }

                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnViewAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder holder) {
                    Intrinsics.checkNotNullParameter(holder, "holder");
                }
            };
            baseQuickAdapter.addOnViewAttachStateChangeListener(onViewAttachStateChangeListener2);
            this.lastAdapterOnViewAttachChangeListener = onViewAttachStateChangeListener2;
        }
    }

    @NotNull
    public final QuickAdapterHelper addBeforeAdapter(int index, @NotNull BaseQuickAdapter<?, ?> adapter) {
        BaseQuickAdapter.OnViewAttachStateChangeListener onViewAttachStateChangeListener;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (index < 0 || index > this.mBeforeList.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + this.mBeforeList.size() + ". Given:" + index);
        }
        if (index == 0 && (onViewAttachStateChangeListener = this.firstAdapterOnViewAttachChangeListener) != null) {
            if (this.mBeforeList.isEmpty()) {
                this.contentAdapter.removeOnViewAttachStateChangeListener(onViewAttachStateChangeListener);
            } else {
                ((BaseQuickAdapter) CollectionsKt.first((List) this.mBeforeList)).removeOnViewAttachStateChangeListener(onViewAttachStateChangeListener);
            }
            adapter.addOnViewAttachStateChangeListener(onViewAttachStateChangeListener);
        }
        if (this.leadingLoadStateAdapter != null) {
            index++;
        }
        if (this.mAdapter.addAdapter(index, adapter)) {
            this.mBeforeList.add(adapter);
        }
        return this;
    }

    @NotNull
    public final QuickAdapterHelper clearAfterAdapters() {
        Iterator<T> it = this.mAfterList.iterator();
        while (it.hasNext()) {
            BaseQuickAdapter baseQuickAdapter = (BaseQuickAdapter) it.next();
            this.mAdapter.removeAdapter(baseQuickAdapter);
            BaseQuickAdapter.OnViewAttachStateChangeListener onViewAttachStateChangeListener = this.lastAdapterOnViewAttachChangeListener;
            if (onViewAttachStateChangeListener != null) {
                baseQuickAdapter.removeOnViewAttachStateChangeListener(onViewAttachStateChangeListener);
            }
        }
        this.mAfterList.clear();
        return this;
    }

    @NotNull
    public final QuickAdapterHelper clearBeforeAdapters() {
        Iterator<T> it = this.mBeforeList.iterator();
        while (it.hasNext()) {
            BaseQuickAdapter baseQuickAdapter = (BaseQuickAdapter) it.next();
            this.mAdapter.removeAdapter(baseQuickAdapter);
            BaseQuickAdapter.OnViewAttachStateChangeListener onViewAttachStateChangeListener = this.firstAdapterOnViewAttachChangeListener;
            if (onViewAttachStateChangeListener != null) {
                baseQuickAdapter.removeOnViewAttachStateChangeListener(onViewAttachStateChangeListener);
            }
        }
        this.mBeforeList.clear();
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: getAdapter, reason: from getter */
    public final ConcatAdapter getMAdapter() {
        return this.mAdapter;
    }

    @NotNull
    public final List<BaseQuickAdapter<?, ?>> getAfterAdapterList() {
        List<BaseQuickAdapter<?, ?>> listUnmodifiableList = Collections.unmodifiableList(this.mAfterList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(mAfterList)");
        return listUnmodifiableList;
    }

    @NotNull
    public final List<BaseQuickAdapter<?, ?>> getBeforeAdapterList() {
        List<BaseQuickAdapter<?, ?>> listUnmodifiableList = Collections.unmodifiableList(this.mBeforeList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(mBeforeList)");
        return listUnmodifiableList;
    }

    @NotNull
    public final BaseQuickAdapter<?, ?> getContentAdapter() {
        return this.contentAdapter;
    }

    @NotNull
    public final LoadState getLeadingLoadState() {
        LoadState loadState;
        LeadingLoadStateAdapter<?> leadingLoadStateAdapter = this.leadingLoadStateAdapter;
        return (leadingLoadStateAdapter == null || (loadState = leadingLoadStateAdapter.getLoadState()) == null) ? new LoadState.NotLoading(false) : loadState;
    }

    @Nullable
    public final LeadingLoadStateAdapter<?> getLeadingLoadStateAdapter() {
        return this.leadingLoadStateAdapter;
    }

    @NotNull
    public final LoadState getTrailingLoadState() {
        LoadState loadState;
        TrailingLoadStateAdapter<?> trailingLoadStateAdapter = this.trailingLoadStateAdapter;
        return (trailingLoadStateAdapter == null || (loadState = trailingLoadStateAdapter.getLoadState()) == null) ? new LoadState.NotLoading(false) : loadState;
    }

    @Nullable
    public final TrailingLoadStateAdapter<?> getTrailingLoadStateAdapter() {
        return this.trailingLoadStateAdapter;
    }

    @NotNull
    public final QuickAdapterHelper removeAdapter(@NotNull BaseQuickAdapter<?, ?> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (!Intrinsics.areEqual(adapter, this.contentAdapter)) {
            this.mAdapter.removeAdapter(adapter);
            this.mBeforeList.remove(adapter);
            this.mAfterList.remove(adapter);
            BaseQuickAdapter.OnViewAttachStateChangeListener onViewAttachStateChangeListener = this.firstAdapterOnViewAttachChangeListener;
            if (onViewAttachStateChangeListener != null) {
                adapter.removeOnViewAttachStateChangeListener(onViewAttachStateChangeListener);
                if (this.mBeforeList.isEmpty()) {
                    this.contentAdapter.addOnViewAttachStateChangeListener(onViewAttachStateChangeListener);
                } else {
                    ((BaseQuickAdapter) CollectionsKt.first((List) this.mBeforeList)).addOnViewAttachStateChangeListener(onViewAttachStateChangeListener);
                }
            }
            BaseQuickAdapter.OnViewAttachStateChangeListener onViewAttachStateChangeListener2 = this.lastAdapterOnViewAttachChangeListener;
            if (onViewAttachStateChangeListener2 != null) {
                adapter.removeOnViewAttachStateChangeListener(onViewAttachStateChangeListener2);
                if (this.mAfterList.isEmpty()) {
                    this.contentAdapter.addOnViewAttachStateChangeListener(onViewAttachStateChangeListener2);
                    return this;
                }
                ((BaseQuickAdapter) CollectionsKt.last((List) this.mAfterList)).addOnViewAttachStateChangeListener(onViewAttachStateChangeListener2);
            }
        }
        return this;
    }

    public final void setLeadingLoadState(@NotNull LoadState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        LeadingLoadStateAdapter<?> leadingLoadStateAdapter = this.leadingLoadStateAdapter;
        if (leadingLoadStateAdapter == null) {
            return;
        }
        leadingLoadStateAdapter.setLoadState(value);
    }

    public final void setTrailingLoadState(@NotNull LoadState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        TrailingLoadStateAdapter<?> trailingLoadStateAdapter = this.trailingLoadStateAdapter;
        if (trailingLoadStateAdapter == null) {
            return;
        }
        trailingLoadStateAdapter.setLoadState(value);
    }

    @NotNull
    public final QuickAdapterHelper addAfterAdapter(int index, @NotNull BaseQuickAdapter<?, ?> adapter) {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (index >= 0 && index <= this.mAfterList.size()) {
            if (index == this.mAfterList.size()) {
                addAfterAdapter(adapter);
                return this;
            }
            if (this.trailingLoadStateAdapter == null) {
                size = this.mAdapter.getAdapters().size();
                size2 = this.mAfterList.size();
            } else {
                size = this.mAdapter.getAdapters().size() - 1;
                size2 = this.mAfterList.size();
            }
            if (this.mAdapter.addAdapter((size - size2) + index, adapter)) {
                this.mAfterList.add(adapter);
            }
            return this;
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and " + this.mAfterList.size() + ". Given:" + index);
    }
}
