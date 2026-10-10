package com.kubi.sdk;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.paging.DataSource;
import androidx.paging.ItemKeyedDataSource;
import androidx.paging.PageKeyedDataSource;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.resources.dialog.DialogFragmentHelper;
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

/* JADX INFO: compiled from: BasePageDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002\u001f B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\n\u0010\u0016\u001a\u0004\u0018\u00010\u000eH&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH&J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, m90084d2 = {"Lcom/kubi/sdk/BasePageDialog;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "pageKey", "", "<init>", "(Z)V", "source", "Landroidx/paging/DataSource;", "", "config", "Landroidx/paging/PagedList$Config;", "list", "Landroidx/recyclerview/widget/RecyclerView;", "getList", "()Landroidx/recyclerview/widget/RecyclerView;", "list$delegate", "Lkotlin/Lazy;", "getItemKey", "t", "(Ljava/lang/Object;)I", "getPageList", "getFailData", "", "fetchPageData", "Lcom/kubi/sdk/PageEntity;", "page", "size", "refresh", "", "DefaultPageKeyedDataSource", "DefaultItemKeyedDataSource", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BasePageDialog<T> extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final DataSource<Integer, T> f46344q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final PagedList.Config f46345r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f46346s0;

    /* JADX INFO: renamed from: com.kubi.sdk.BasePageDialog$a */
    /* JADX INFO: compiled from: BasePageDialog.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J$\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016J$\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J$\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J\u0015\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bR\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/sdk/BasePageDialog$DefaultItemKeyedDataSource;", "Landroidx/paging/ItemKeyedDataSource;", "", "Lcom/kubi/sdk/IInitCallBack;", "<init>", "(Lcom/kubi/sdk/BasePageDialog;)V", "loadingView", "Lcom/kubi/sdk/widget/loading/ILoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/ILoadingView;", "loadingView$delegate", "Lkotlin/Lazy;", "initCallBack", "Lkotlin/Function0;", "", "setInitCallBack", TUIConstants.TUIChat.CALL_BACK, "loadInitial", ReportDataTable.COLUMN_PARAMS, "Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "loadAfter", "Landroidx/paging/ItemKeyedDataSource$LoadParams;", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "loadBefore", "getKey", "item", "(Ljava/lang/Object;)Ljava/lang/Integer;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C23653a extends ItemKeyedDataSource<Integer, T> implements IInitCallBack {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Lazy f46347a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public Function0<Unit> f46348b;

        /* JADX INFO: renamed from: o */
        public static final PageEntity m56413o(BasePageDialog basePageDialog, ItemKeyedDataSource.LoadInitialParams loadInitialParams) {
            return basePageDialog.mo24513p4(1, loadInitialParams.requestedLoadSize);
        }

        public C23653a() {
            this.f46347a = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.w0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BasePageDialog.C23653a.m56421w(basePageDialog);
                }
            });
        }

        /* JADX INFO: renamed from: m */
        private final InterfaceC40863a m56411m() {
            return (InterfaceC40863a) this.f46347a.getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: n */
        public static final Unit m56412n(ItemKeyedDataSource.LoadParams loadParams, BasePageDialog basePageDialog, ItemKeyedDataSource.LoadCallback loadCallback) {
            Integer num = (Integer) loadParams.key;
            if (num == null || num.intValue() != -1) {
                Key key = loadParams.key;
                Intrinsics.checkNotNullExpressionValue(key, "key");
                loadCallback.onResult(basePageDialog.mo24513p4(((Number) key).intValue(), loadParams.requestedLoadSize).getItems());
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: w */
        public static final InitLoadView m56421w(BasePageDialog basePageDialog) {
            WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(basePageDialog.getList());
            Intrinsics.checkNotNullExpressionValue(wrapperLoadingViewInjectView, "injectView(...)");
            return new InitLoadView(wrapperLoadingViewInjectView);
        }

        @Override // com.kubi.sdk.IInitCallBack
        /* JADX INFO: renamed from: a */
        public void mo56422a(@NotNull Function0<Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f46348b = callback;
        }

        @Override // androidx.paging.ItemKeyedDataSource
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer getKey(@NotNull T item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return Integer.valueOf(BasePageDialog.this.m56400r4(item));
        }

        @Override // androidx.paging.ItemKeyedDataSource
        public void loadAfter(@NotNull final ItemKeyedDataSource.LoadParams<Integer> params, @NotNull final ItemKeyedDataSource.LoadCallback<T> callback) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(callback, "callback");
            final BasePageDialog<T> basePageDialog = BasePageDialog.this;
            C27100x0.m66923d(new Function0() { // from class: com.kubi.sdk.x0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BasePageDialog.C23653a.m56412n(params, basePageDialog, callback);
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
            final BasePageDialog<T> basePageDialog = BasePageDialog.this;
            Flowable<T> flowableObserveOn = flowableCompat.m66385b(new Function0() { // from class: com.kubi.sdk.p0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BasePageDialog.C23653a.m56413o(basePageDialog, params);
                }
            }).subscribeOn(C42916f.m94127f()).observeOn(AndroidSchedulers.mainThread());
            final Function1 function1 = new Function1() { // from class: com.kubi.sdk.q0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BasePageDialog.C23653a.m56414p(this.f47602b, (InterfaceC44418d) obj);
                }
            };
            Flowable<T> flowableDoOnSubscribe = flowableObserveOn.doOnSubscribe(new Consumer() { // from class: com.kubi.sdk.r0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BasePageDialog.C23653a.m56415q(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.sdk.s0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BasePageDialog.C23653a.m56416r(this.f47691b, callback, (PageEntity) obj);
                }
            };
            Consumer<? super T> consumer = new Consumer() { // from class: com.kubi.sdk.t0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BasePageDialog.C23653a.m56417s(function2, obj);
                }
            };
            final BasePageDialog<T> basePageDialog2 = BasePageDialog.this;
            final Function1 function3 = new Function1() { // from class: com.kubi.sdk.u0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BasePageDialog.C23653a.m56418t(basePageDialog2, this, callback, (Throwable) obj);
                }
            };
            Disposable disposableSubscribe = flowableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.sdk.v0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BasePageDialog.C23653a.m56420v(function3, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, BasePageDialog.this.getF43550U());
        }

        /* JADX INFO: renamed from: p */
        public static final Unit m56414p(C23653a c23653a, InterfaceC44418d interfaceC44418d) {
            c23653a.m56411m().showLoading();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: q */
        public static final void m56415q(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m56416r(C23653a c23653a, ItemKeyedDataSource.LoadInitialCallback loadInitialCallback, PageEntity pageEntity) {
            List<T> items = pageEntity.getItems();
            if (items != null && !items.isEmpty()) {
                c23653a.m56411m().showContent();
                loadInitialCallback.onResult(pageEntity.getItems());
            } else {
                c23653a.m56411m().showEmpty(R$string.no_more_data, R$drawable.ic2_common_empty, (View.OnClickListener) null);
            }
            Function0<Unit> function0 = c23653a.f46348b;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: s */
        public static final void m56417s(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: t */
        public static final Unit m56418t(final BasePageDialog basePageDialog, final C23653a c23653a, ItemKeyedDataSource.LoadInitialCallback loadInitialCallback, Throwable th2) {
            Intrinsics.checkNotNull(th2);
            C19331c.m42836c(th2, null, 2, null);
            List<T> listM56399q4 = basePageDialog.m56399q4();
            if (listM56399q4 != null && !listM56399q4.isEmpty()) {
                c23653a.m56411m().showContent();
                loadInitialCallback.onResult(listM56399q4);
            } else {
                c23653a.m56411m().showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_system_maintain, new View.OnClickListener() { // from class: com.kubi.sdk.y0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BasePageDialog.C23653a.m56419u(this.f48677b, basePageDialog, view);
                    }
                });
            }
            Function0<Unit> function0 = c23653a.f46348b;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: u */
        public static final void m56419u(C23653a c23653a, BasePageDialog basePageDialog, View view) {
            c23653a.m56411m().showLoading();
            basePageDialog.m56398B0();
        }

        /* JADX INFO: renamed from: v */
        public static final void m56420v(Function1 function1, Object obj) {
            function1.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.BasePageDialog$b */
    /* JADX INFO: compiled from: BasePageDialog.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J*\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0014H\u0016J*\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J*\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0017H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/BasePageDialog$DefaultPageKeyedDataSource;", "Landroidx/paging/PageKeyedDataSource;", "", "Lcom/kubi/sdk/IInitCallBack;", "<init>", "(Lcom/kubi/sdk/BasePageDialog;)V", "loadingView", "Lcom/kubi/sdk/widget/loading/ILoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/ILoadingView;", "loadingView$delegate", "Lkotlin/Lazy;", "initCallBack", "Lkotlin/Function0;", "", "setInitCallBack", TUIConstants.TUIChat.CALL_BACK, "loadInitial", ReportDataTable.COLUMN_PARAMS, "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "loadAfter", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadBefore", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C23654b extends PageKeyedDataSource<Integer, T> implements IInitCallBack {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Lazy f46350a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public Function0<Unit> f46351b;

        /* JADX INFO: renamed from: n */
        public static final PageEntity m56436n(BasePageDialog basePageDialog, PageKeyedDataSource.LoadInitialParams loadInitialParams) {
            return basePageDialog.mo24513p4(1, loadInitialParams.requestedLoadSize);
        }

        public C23654b() {
            this.f46350a = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.a1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BasePageDialog.C23654b.m56444v(basePageDialog);
                }
            });
        }

        /* JADX INFO: renamed from: l */
        private final InterfaceC40863a m56434l() {
            return (InterfaceC40863a) this.f46350a.getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: m */
        public static final Unit m56435m(PageKeyedDataSource.LoadParams loadParams, BasePageDialog basePageDialog, PageKeyedDataSource.LoadCallback loadCallback) {
            Integer num;
            Key key = loadParams.key;
            if (key != 0 && ((num = (Integer) key) == null || num.intValue() != -1)) {
                Key key2 = loadParams.key;
                Intrinsics.checkNotNullExpressionValue(key2, "key");
                PageEntity<T> pageEntityMo24513p4 = basePageDialog.mo24513p4(((Number) key2).intValue(), loadParams.requestedLoadSize);
                loadCallback.onResult(pageEntityMo24513p4.getItems(), pageEntityMo24513p4.getHasNext() ? Integer.valueOf(((Number) loadParams.key).intValue() + 1) : null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: v */
        public static final InitLoadView m56444v(BasePageDialog basePageDialog) {
            WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(basePageDialog.getList());
            Intrinsics.checkNotNullExpressionValue(wrapperLoadingViewInjectView, "injectView(...)");
            return new InitLoadView(wrapperLoadingViewInjectView);
        }

        @Override // com.kubi.sdk.IInitCallBack
        /* JADX INFO: renamed from: a */
        public void mo56422a(@NotNull Function0<Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f46351b = callback;
        }

        @Override // androidx.paging.PageKeyedDataSource
        public void loadAfter(@NotNull final PageKeyedDataSource.LoadParams<Integer> params, @NotNull final PageKeyedDataSource.LoadCallback<Integer, T> callback) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(callback, "callback");
            final BasePageDialog<T> basePageDialog = BasePageDialog.this;
            C27100x0.m66923d(new Function0() { // from class: com.kubi.sdk.z0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BasePageDialog.C23654b.m56435m(params, basePageDialog, callback);
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
            final BasePageDialog<T> basePageDialog = BasePageDialog.this;
            Flowable<T> flowableObserveOn = flowableCompat.m66385b(new Function0() { // from class: com.kubi.sdk.b1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BasePageDialog.C23654b.m56436n(basePageDialog, params);
                }
            }).subscribeOn(C42916f.m94127f()).observeOn(AndroidSchedulers.mainThread());
            final Function1 function1 = new Function1() { // from class: com.kubi.sdk.c1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BasePageDialog.C23654b.m56437o(this.f46520b, (InterfaceC44418d) obj);
                }
            };
            Flowable<T> flowableDoOnSubscribe = flowableObserveOn.doOnSubscribe(new Consumer() { // from class: com.kubi.sdk.d1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BasePageDialog.C23654b.m56438p(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.sdk.e1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BasePageDialog.C23654b.m56439q(this.f46546b, callback, (PageEntity) obj);
                }
            };
            Consumer<? super T> consumer = new Consumer() { // from class: com.kubi.sdk.f1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BasePageDialog.C23654b.m56440r(function2, obj);
                }
            };
            final BasePageDialog<T> basePageDialog2 = BasePageDialog.this;
            final Function1 function3 = new Function1() { // from class: com.kubi.sdk.g1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BasePageDialog.C23654b.m56441s(basePageDialog2, this, callback, (Throwable) obj);
                }
            };
            Disposable disposableSubscribe = flowableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: com.kubi.sdk.h1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BasePageDialog.C23654b.m56443u(function3, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, BasePageDialog.this.getF43550U());
        }

        /* JADX INFO: renamed from: o */
        public static final Unit m56437o(C23654b c23654b, InterfaceC44418d interfaceC44418d) {
            c23654b.m56434l().showLoading();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public static final void m56438p(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: q */
        public static final Unit m56439q(C23654b c23654b, PageKeyedDataSource.LoadInitialCallback loadInitialCallback, PageEntity pageEntity) {
            Integer num;
            List<T> items = pageEntity.getItems();
            if (items != null && !items.isEmpty()) {
                c23654b.m56434l().showContent();
                List<T> items2 = pageEntity.getItems();
                if (pageEntity.getHasNext()) {
                    num = 2;
                } else {
                    num = null;
                }
                loadInitialCallback.onResult(items2, null, num);
            } else {
                c23654b.m56434l().showEmpty(R$string.no_more_data, R$drawable.ic2_common_empty, (View.OnClickListener) null);
            }
            Function0<Unit> function0 = c23654b.f46351b;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public static final void m56440r(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: s */
        public static final Unit m56441s(final BasePageDialog basePageDialog, C23654b c23654b, PageKeyedDataSource.LoadInitialCallback loadInitialCallback, Throwable th2) {
            Intrinsics.checkNotNull(th2);
            C19331c.m42836c(th2, null, 2, null);
            List<T> listM56399q4 = basePageDialog.m56399q4();
            if (listM56399q4 != null && !listM56399q4.isEmpty()) {
                c23654b.m56434l().showContent();
                loadInitialCallback.onResult(listM56399q4, null, null);
            } else {
                c23654b.m56434l().showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_system_maintain, new View.OnClickListener() { // from class: com.kubi.sdk.i1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BasePageDialog.C23654b.m56442t(basePageDialog, view);
                    }
                });
            }
            Function0<Unit> function0 = c23654b.f46351b;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: t */
        public static final void m56442t(BasePageDialog basePageDialog, View view) {
            basePageDialog.m56398B0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: u */
        public static final void m56443u(Function1 function1, Object obj) {
            function1.invoke(obj);
        }
    }

    public BasePageDialog() {
        this(false, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: p4 */
    public abstract PageEntity<T> mo24513p4(int i11, int i12);

    @Nullable
    /* JADX INFO: renamed from: s4 */
    public abstract RecyclerView mo24514s4();

    public BasePageDialog(boolean z11) {
        this.f46344q0 = z11 ? new C23654b() : new C23653a();
        PagedList.Config configBuild = new PagedList.Config.Builder().setPageSize(50).setPrefetchDistance(50).setInitialLoadSizeHint(50).build();
        Intrinsics.checkNotNullExpressionValue(configBuild, "build(...)");
        this.f46345r0 = configBuild;
        this.f46346s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BasePageDialog.m56394t4(this.f46880b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getList() {
        return (RecyclerView) this.f46346s0.getValue();
    }

    /* JADX INFO: renamed from: B0 */
    public void m56398B0() {
        final PagedList pagedListBuild = new PagedList.Builder(this.f46344q0, this.f46345r0).setNotifyExecutor(new Executor() { // from class: com.kubi.sdk.m0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                BasePageDialog.m56395u4(runnable);
            }
        }).setFetchExecutor(new Executor() { // from class: com.kubi.sdk.n0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                BasePageDialog.m56396v4(runnable);
            }
        }).build();
        Intrinsics.checkNotNullExpressionValue(pagedListBuild, "build(...)");
        DataSource<Integer, T> dataSource = this.f46344q0;
        Intrinsics.checkNotNull(dataSource, "null cannot be cast to non-null type com.kubi.sdk.IInitCallBack");
        ((IInitCallBack) dataSource).mo56422a(new Function0() { // from class: com.kubi.sdk.o0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BasePageDialog.m56397w4(this.f47161b, pagedListBuild);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: q4 */
    public List<T> m56399q4() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: r4 */
    public int m56400r4(@NotNull T t11) {
        Intrinsics.checkNotNullParameter(t11, "t");
        return -1;
    }

    /* JADX INFO: renamed from: t4 */
    public static final RecyclerView m56394t4(BasePageDialog basePageDialog) {
        return basePageDialog.mo24514s4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public static final void m56395u4(Runnable runnable) {
        AndroidSchedulers.mainThread().scheduleDirect(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public static final void m56396v4(Runnable runnable) {
        C42916f.m94127f().scheduleDirect(runnable);
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m56397w4(BasePageDialog basePageDialog, PagedList pagedList) {
        RecyclerView.Adapter adapter;
        RecyclerView list = basePageDialog.getList();
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

    public /* synthetic */ BasePageDialog(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11);
    }
}
