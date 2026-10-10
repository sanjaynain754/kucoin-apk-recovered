package com.kubi.sdk;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.paging.DataSource;
import androidx.paging.ItemKeyedDataSource;
import androidx.paging.PageKeyedDataSource;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27100x0;
import com.kubi.utils.FlowableCompat;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k10.InterfaceC40863a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import sh0.InterfaceC44418d;

/* JADX INFO: compiled from: BasePageFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002!\"B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\n\u0010\u0018\u001a\u0004\u0018\u00010\u000eH&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH&J\b\u0010\u001f\u001a\u00020\u0014H\u0016J\b\u0010 \u001a\u00020\u0014H\u0016R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m90084d2 = {"Lcom/kubi/sdk/BasePageFragment;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/kubi/sdk/BaseFragment;", "pageKey", "", "<init>", "(Z)V", "source", "Landroidx/paging/DataSource;", "", "config", "Landroidx/paging/PagedList$Config;", "list", "Landroidx/recyclerview/widget/RecyclerView;", "getList", "()Landroidx/recyclerview/widget/RecyclerView;", "list$delegate", "Lkotlin/Lazy;", "forceLoading", "", "getItemKey", "t", "(Ljava/lang/Object;)I", "getPageList", "getFailData", "", "fetchPageData", "Lcom/kubi/sdk/PageEntity;", "page", "size", "onLoad", "refresh", "DefaultPageKeyedDataSource", "DefaultItemKeyedDataSource", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
public abstract class BasePageFragment<T> extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final DataSource<Integer, T> f46353U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final PagedList.Config f46354V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f46355W;

    /* JADX INFO: renamed from: com.kubi.sdk.BasePageFragment$a */
    /* JADX INFO: compiled from: BasePageFragment.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J$\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016J$\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J$\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J\u0015\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bR\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/sdk/BasePageFragment$DefaultItemKeyedDataSource;", "Landroidx/paging/ItemKeyedDataSource;", "", "Lcom/kubi/sdk/IInitCallBack;", "<init>", "(Lcom/kubi/sdk/BasePageFragment;)V", "loadingView", "Lcom/kubi/sdk/widget/loading/ILoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/ILoadingView;", "loadingView$delegate", "Lkotlin/Lazy;", "initCallBack", "Lkotlin/Function0;", "", "setInitCallBack", TUIConstants.TUIChat.CALL_BACK, "loadInitial", ReportDataTable.COLUMN_PARAMS, "Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "loadAfter", "Landroidx/paging/ItemKeyedDataSource$LoadParams;", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "loadBefore", "getKey", "item", "(Ljava/lang/Object;)Ljava/lang/Integer;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C23655a extends ItemKeyedDataSource<Integer, T> implements IInitCallBack {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Lazy f46356a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public Function0<Unit> f46357b;

        /* JADX INFO: renamed from: o */
        public static final PageEntity m56466o(BasePageFragment basePageFragment, ItemKeyedDataSource.LoadInitialParams loadInitialParams) {
            return basePageFragment.mo24546o3(1, loadInitialParams.requestedLoadSize);
        }

        public C23655a() {
            this.f46356a = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.o1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BasePageFragment.C23655a.m56474w(basePageFragment);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: n */
        public static final Unit m56465n(ItemKeyedDataSource.LoadParams loadParams, BasePageFragment basePageFragment, ItemKeyedDataSource.LoadCallback loadCallback) {
            Integer num = (Integer) loadParams.key;
            if (num == null || num.intValue() != -1) {
                Key key = loadParams.key;
                Intrinsics.checkNotNullExpressionValue(key, "key");
                loadCallback.onResult(basePageFragment.mo24546o3(((Number) key).intValue(), loadParams.requestedLoadSize).getItems());
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: w */
        public static final InitLoadView m56474w(BasePageFragment basePageFragment) {
            WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(basePageFragment.getList());
            Intrinsics.checkNotNullExpressionValue(wrapperLoadingViewInjectView, "injectView(...)");
            return new InitLoadView(wrapperLoadingViewInjectView);
        }

        @Override // com.kubi.sdk.IInitCallBack
        /* JADX INFO: renamed from: a */
        public void mo56422a(@NotNull Function0<Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f46357b = callback;
        }

        @Override // androidx.paging.ItemKeyedDataSource
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer getKey(@NotNull T item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return Integer.valueOf(BasePageFragment.this.mo25626r3(item));
        }

        @Override // androidx.paging.ItemKeyedDataSource
        public void loadAfter(@NotNull final ItemKeyedDataSource.LoadParams<Integer> params, @NotNull final ItemKeyedDataSource.LoadCallback<T> callback) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(callback, "callback");
            final BasePageFragment<T> basePageFragment = BasePageFragment.this;
            C27100x0.m66923d(new Function0() { // from class: com.kubi.sdk.n1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BasePageFragment.C23655a.m56465n(params, basePageFragment, callback);
                }
            });
        }

        @Override // androidx.paging.ItemKeyedDataSource
        public void loadBefore(@NotNull ItemKeyedDataSource.LoadParams<Integer> params, @NotNull ItemKeyedDataSource.LoadCallback<T> callback) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(callback, "callback");
        }

        @Override // androidx.paging.ItemKeyedDataSource
        public void loadInitial(@NotNull final ItemKeyedDataSource.LoadInitialParams<Integer> params, @NotNull final ItemKeyedDataSource.LoadInitialCallback<T> callback) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(callback, "callback");
            FlowableCompat flowableCompat = FlowableCompat.f54248a;
            final BasePageFragment<T> basePageFragment = BasePageFragment.this;
            Flowable<T> flowableObserveOn = flowableCompat.m66385b(new Function0() { // from class: com.kubi.sdk.p1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BasePageFragment.C23655a.m56466o(basePageFragment, params);
                }
            }).subscribeOn(C42916f.m94127f()).observeOn(AndroidSchedulers.mainThread());
            final Function1 function1 = new Function1() { // from class: com.kubi.sdk.q1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BasePageFragment.C23655a.m56467p(this.f47603b, (InterfaceC44418d) obj);
                }
            };
            Flowable<T> flowableDoOnSubscribe = flowableObserveOn.doOnSubscribe(new Consumer() { // from class: com.kubi.sdk.r1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BasePageFragment.C23655a.m56468q(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.sdk.s1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BasePageFragment.C23655a.m56469r(this.f47693b, callback, (PageEntity) obj);
                }
            };
            Consumer<? super T> consumer = new Consumer() { // from class: com.kubi.sdk.t1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BasePageFragment.C23655a.m56470s(function2, obj);
                }
            };
            final BasePageFragment<T> basePageFragment2 = BasePageFragment.this;
            final Function1 function3 = new Function1() { // from class: com.kubi.sdk.u1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BasePageFragment.C23655a.m56471t(basePageFragment2, this, callback, (Throwable) obj);
                }
            };
            Disposable disposableSubscribe = flowableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.sdk.v1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BasePageFragment.C23655a.m56473v(function3, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, BasePageFragment.this.getDestroyDisposable());
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public final InterfaceC40863a m56476m() {
            return (InterfaceC40863a) this.f46356a.getValue();
        }

        /* JADX INFO: renamed from: p */
        public static final Unit m56467p(C23655a c23655a, InterfaceC44418d interfaceC44418d) {
            c23655a.m56476m().showLoading();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public static final void m56468q(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m56469r(C23655a c23655a, ItemKeyedDataSource.LoadInitialCallback loadInitialCallback, PageEntity pageEntity) {
            List<T> items = pageEntity.getItems();
            if (items != null && !items.isEmpty()) {
                c23655a.m56476m().showContent();
                loadInitialCallback.onResult(pageEntity.getItems());
            } else {
                c23655a.m56476m().showEmpty(R$string.no_more_data, R$drawable.ic2_common_empty, (View.OnClickListener) null);
            }
            Function0<Unit> function0 = c23655a.f46357b;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public static final void m56470s(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: t */
        public static final Unit m56471t(final BasePageFragment basePageFragment, C23655a c23655a, ItemKeyedDataSource.LoadInitialCallback loadInitialCallback, Throwable th2) {
            Intrinsics.checkNotNull(th2);
            C19331c.m42836c(th2, null, 2, null);
            List<T> listMo35217q3 = basePageFragment.mo35217q3();
            if (listMo35217q3 != null && !listMo35217q3.isEmpty()) {
                c23655a.m56476m().showContent();
                loadInitialCallback.onResult(listMo35217q3);
            } else {
                c23655a.m56476m().showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_system_maintain, new View.OnClickListener() { // from class: com.kubi.sdk.w1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BasePageFragment.C23655a.m56472u(basePageFragment, view);
                    }
                });
            }
            Function0<Unit> function0 = c23655a.f46357b;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: u */
        public static final void m56472u(BasePageFragment basePageFragment, View view) {
            basePageFragment.m56454p3();
            basePageFragment.mo25620B0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: v */
        public static final void m56473v(Function1 function1, Object obj) {
            function1.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.BasePageFragment$b */
    /* JADX INFO: compiled from: BasePageFragment.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J*\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0014H\u0016J*\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J*\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0017H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/BasePageFragment$DefaultPageKeyedDataSource;", "Landroidx/paging/PageKeyedDataSource;", "", "Lcom/kubi/sdk/IInitCallBack;", "<init>", "(Lcom/kubi/sdk/BasePageFragment;)V", "loadingView", "Lcom/kubi/sdk/widget/loading/ILoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/ILoadingView;", "loadingView$delegate", "Lkotlin/Lazy;", "initCallBack", "Lkotlin/Function0;", "", "setInitCallBack", TUIConstants.TUIChat.CALL_BACK, "loadInitial", ReportDataTable.COLUMN_PARAMS, "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "loadAfter", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadBefore", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C23656b extends PageKeyedDataSource<Integer, T> implements IInitCallBack {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Lazy f46359a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public Function0<Unit> f46360b;

        /* JADX INFO: renamed from: n */
        public static final PageEntity m56488n(BasePageFragment basePageFragment, PageKeyedDataSource.LoadInitialParams loadInitialParams) {
            return basePageFragment.mo24546o3(1, loadInitialParams.requestedLoadSize);
        }

        public C23656b() {
            this.f46359a = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.x1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BasePageFragment.C23656b.m56496v(basePageFragment);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: m */
        public static final Unit m56487m(PageKeyedDataSource.LoadParams loadParams, BasePageFragment basePageFragment, PageKeyedDataSource.LoadCallback loadCallback) {
            Integer num;
            Key key = loadParams.key;
            if (key != 0 && ((num = (Integer) key) == null || num.intValue() != -1)) {
                Key key2 = loadParams.key;
                Intrinsics.checkNotNullExpressionValue(key2, "key");
                PageEntity<T> pageEntityMo24546o3 = basePageFragment.mo24546o3(((Number) key2).intValue(), loadParams.requestedLoadSize);
                loadCallback.onResult(pageEntityMo24546o3.getItems(), pageEntityMo24546o3.getHasNext() ? Integer.valueOf(((Number) loadParams.key).intValue() + 1) : null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: v */
        public static final InitLoadView m56496v(BasePageFragment basePageFragment) {
            WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(basePageFragment.getList());
            Intrinsics.checkNotNullExpressionValue(wrapperLoadingViewInjectView, "injectView(...)");
            return new InitLoadView(wrapperLoadingViewInjectView);
        }

        @Override // com.kubi.sdk.IInitCallBack
        /* JADX INFO: renamed from: a */
        public void mo56422a(@NotNull Function0<Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f46360b = callback;
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final InterfaceC40863a m56497l() {
            return (InterfaceC40863a) this.f46359a.getValue();
        }

        @Override // androidx.paging.PageKeyedDataSource
        public void loadAfter(@NotNull final PageKeyedDataSource.LoadParams<Integer> params, @NotNull final PageKeyedDataSource.LoadCallback<Integer, T> callback) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(callback, "callback");
            final BasePageFragment<T> basePageFragment = BasePageFragment.this;
            C27100x0.m66923d(new Function0() { // from class: com.kubi.sdk.y1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BasePageFragment.C23656b.m56487m(params, basePageFragment, callback);
                }
            });
        }

        @Override // androidx.paging.PageKeyedDataSource
        public void loadBefore(@NotNull PageKeyedDataSource.LoadParams<Integer> params, @NotNull PageKeyedDataSource.LoadCallback<Integer, T> callback) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(callback, "callback");
        }

        @Override // androidx.paging.PageKeyedDataSource
        public void loadInitial(@NotNull final PageKeyedDataSource.LoadInitialParams<Integer> params, @NotNull final PageKeyedDataSource.LoadInitialCallback<Integer, T> callback) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(callback, "callback");
            FlowableCompat flowableCompat = FlowableCompat.f54248a;
            final BasePageFragment<T> basePageFragment = BasePageFragment.this;
            Flowable<T> flowableObserveOn = flowableCompat.m66385b(new Function0() { // from class: com.kubi.sdk.z1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BasePageFragment.C23656b.m56488n(basePageFragment, params);
                }
            }).subscribeOn(C42916f.m94127f()).observeOn(AndroidSchedulers.mainThread());
            final Function1 function1 = new Function1() { // from class: com.kubi.sdk.a2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BasePageFragment.C23656b.m56489o(this.f46448b, (InterfaceC44418d) obj);
                }
            };
            Flowable<T> flowableDoOnSubscribe = flowableObserveOn.doOnSubscribe(new Consumer() { // from class: com.kubi.sdk.b2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BasePageFragment.C23656b.m56490p(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.sdk.c2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BasePageFragment.C23656b.m56491q(this.f46521b, callback, (PageEntity) obj);
                }
            };
            Consumer<? super T> consumer = new Consumer() { // from class: com.kubi.sdk.d2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BasePageFragment.C23656b.m56492r(function2, obj);
                }
            };
            final BasePageFragment<T> basePageFragment2 = BasePageFragment.this;
            final Function1 function3 = new Function1() { // from class: com.kubi.sdk.e2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BasePageFragment.C23656b.m56493s(basePageFragment2, this, callback, (Throwable) obj);
                }
            };
            Disposable disposableSubscribe = flowableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.sdk.f2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BasePageFragment.C23656b.m56495u(function3, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, BasePageFragment.this.getDestroyDisposable());
        }

        /* JADX INFO: renamed from: o */
        public static final Unit m56489o(C23656b c23656b, InterfaceC44418d interfaceC44418d) {
            c23656b.m56497l().showLoading();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public static final void m56490p(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: q */
        public static final Unit m56491q(C23656b c23656b, PageKeyedDataSource.LoadInitialCallback loadInitialCallback, PageEntity pageEntity) {
            Integer num;
            List<T> items = pageEntity.getItems();
            if (items != null && !items.isEmpty()) {
                c23656b.m56497l().showContent();
                List<T> items2 = pageEntity.getItems();
                if (pageEntity.getHasNext()) {
                    num = 2;
                } else {
                    num = null;
                }
                loadInitialCallback.onResult(items2, null, num);
            } else {
                c23656b.m56497l().showEmpty(R$string.no_more_data, R$drawable.ic2_common_empty, (View.OnClickListener) null);
            }
            Function0<Unit> function0 = c23656b.f46360b;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public static final void m56492r(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: s */
        public static final Unit m56493s(final BasePageFragment basePageFragment, C23656b c23656b, PageKeyedDataSource.LoadInitialCallback loadInitialCallback, Throwable th2) {
            Intrinsics.checkNotNull(th2);
            C19331c.m42836c(th2, null, 2, null);
            List<T> listMo35217q3 = basePageFragment.mo35217q3();
            if (listMo35217q3 != null && !listMo35217q3.isEmpty()) {
                c23656b.m56497l().showContent();
                loadInitialCallback.onResult(listMo35217q3, null, null);
            } else {
                c23656b.m56497l().showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_system_maintain, new View.OnClickListener() { // from class: com.kubi.sdk.g2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BasePageFragment.C23656b.m56494t(basePageFragment, view);
                    }
                });
            }
            Function0<Unit> function0 = c23656b.f46360b;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: t */
        public static final void m56494t(BasePageFragment basePageFragment, View view) {
            basePageFragment.m56454p3();
            basePageFragment.mo25620B0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: u */
        public static final void m56495u(Function1 function1, Object obj) {
            function1.invoke(obj);
        }
    }

    public BasePageFragment() {
        this(false, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public abstract PageEntity<T> mo24546o3(int i11, int i12);

    @Nullable
    /* JADX INFO: renamed from: s3 */
    public abstract RecyclerView mo24547s3();

    public BasePageFragment(boolean z11) {
        this.f46353U = z11 ? new C23656b() : new C23655a();
        PagedList.Config configBuild = new PagedList.Config.Builder().setPageSize(50).setPrefetchDistance(50).setInitialLoadSizeHint(50).build();
        Intrinsics.checkNotNullExpressionValue(configBuild, "build(...)");
        this.f46354V = configBuild;
        this.f46355W = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.j1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BasePageFragment.m56450t3(this.f46859b);
            }
        });
    }

    public final RecyclerView getList() {
        return (RecyclerView) this.f46355W.getValue();
    }

    /* JADX INFO: renamed from: p3 */
    public final void m56454p3() {
        InterfaceC40863a interfaceC40863aM56476m;
        AtomicInteger f47191c;
        DataSource<Integer, T> dataSource = this.f46353U;
        C23656b c23656b = dataSource instanceof C23656b ? (C23656b) dataSource : null;
        if (c23656b == null || (interfaceC40863aM56476m = c23656b.m56497l()) == null) {
            DataSource<Integer, T> dataSource2 = this.f46353U;
            C23655a c23655a = dataSource2 instanceof C23655a ? (C23655a) dataSource2 : null;
            interfaceC40863aM56476m = c23655a != null ? c23655a.m56476m() : null;
        }
        InitLoadView initLoadView = interfaceC40863aM56476m instanceof InitLoadView ? (InitLoadView) interfaceC40863aM56476m : null;
        if (initLoadView == null || (f47191c = initLoadView.getF47191c()) == null) {
            return;
        }
        f47191c.set(0);
    }

    @NotNull
    /* JADX INFO: renamed from: q3 */
    public List<T> mo35217q3() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: r3 */
    public int mo25626r3(@NotNull T t11) {
        Intrinsics.checkNotNullParameter(t11, "t");
        return -1;
    }

    /* JADX INFO: renamed from: t3 */
    public static final RecyclerView m56450t3(BasePageFragment basePageFragment) {
        return basePageFragment.mo24547s3();
    }

    /* JADX INFO: renamed from: u3 */
    public static final void m56451u3(Runnable runnable) {
        AndroidSchedulers.mainThread().scheduleDirect(runnable);
    }

    /* JADX INFO: renamed from: v3 */
    public static final void m56452v3(Runnable runnable) {
        C42916f.m94127f().scheduleDirect(runnable);
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m56453w3(BasePageFragment basePageFragment, PagedList pagedList) {
        RecyclerView.Adapter adapter;
        RecyclerView list = basePageFragment.getList();
        BasePageAdapter basePageAdapter = null;
        if (list != null) {
            adapter = list.getAdapter();
        } else {
            adapter = null;
        }
        if (adapter instanceof BasePageAdapter) {
            basePageAdapter = (BasePageAdapter) adapter;
        }
        if (basePageAdapter != null) {
            basePageAdapter.submitList(pagedList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    public void mo25620B0() {
        m56454p3();
        final PagedList pagedListBuild = new PagedList.Builder(this.f46353U, this.f46354V).setNotifyExecutor(new Executor() { // from class: com.kubi.sdk.k1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                BasePageFragment.m56451u3(runnable);
            }
        }).setFetchExecutor(new Executor() { // from class: com.kubi.sdk.l1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                BasePageFragment.m56452v3(runnable);
            }
        }).build();
        Intrinsics.checkNotNullExpressionValue(pagedListBuild, "build(...)");
        DataSource<Integer, T> dataSource = this.f46353U;
        Intrinsics.checkNotNull(dataSource, "null cannot be cast to non-null type com.kubi.sdk.IInitCallBack");
        ((IInitCallBack) dataSource).mo56422a(new Function0() { // from class: com.kubi.sdk.m1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BasePageFragment.m56453w3(this.f46987b, pagedListBuild);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        mo25620B0();
    }

    public /* synthetic */ BasePageFragment(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11);
    }
}
