package com.kubi.quotefacade.favorites.edit;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4686p;
import com.blankj.utilcode.util.C5271g0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.FavEditChildEntity;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FavEditChildFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0016\u001a\u00020\fH\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0014J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u0006\u0010 \u001a\u00020\u0018J\u0006\u0010!\u001a\u00020\"R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010#\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020%0$8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/edit/FavEditChildFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentFavoriteEditChildFragmentBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentFavoriteEditChildFragmentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "favType", "", "getFavType", "()Ljava/lang/Integer;", "favType$delegate", "Lkotlin/Lazy;", "mAdapter", "Lcom/kubi/quotefacade/favorites/edit/FavEditChildAdapter;", "originalList", "", "Lcom/kubi/quotefacade/entity/FavEditChildEntity;", "getLayout", "initView", "", "handleItemSelectedListener", "enableDragSort", "loadDataByType", "bindState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "handleFavoriteDone", "isListOrderChanged", "", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFavEditChildFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavEditChildFragment.kt\ncom/kubi/quotefacade/favorites/edit/FavEditChildFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,229:1\n147#2,16:230\n1761#3,3:246\n827#3:249\n855#3,2:250\n774#3:252\n865#3,2:253\n*S KotlinDebug\n*F\n+ 1 FavEditChildFragment.kt\ncom/kubi/quotefacade/favorites/edit/FavEditChildFragment\n*L\n40#1:230,16\n83#1:246,3\n172#1:249\n172#1:250,2\n69#1:252\n69#1:253,2\n*E\n"})
public final class FavEditChildFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: W */
    @Nullable
    public FavEditChildAdapter f41795W;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f41792Z = {Reflection.property1(new PropertyReference1Impl(FavEditChildFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentFavoriteEditChildFragmentBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f41791Y = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f41793U = C45681e.m100799e(this, new Function1<FavEditChildFragment, C4686p>() { // from class: com.kubi.quotefacade.favorites.edit.FavEditChildFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4686p invoke(@NotNull FavEditChildFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4686p.m4684a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4686p, Unit>() { // from class: com.kubi.quotefacade.favorites.edit.FavEditChildFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4686p it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4686p c4686p) {
            invoke(c4686p);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f41794V = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.favorites.edit.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FavEditChildFragment.m51564v3(this.f41812b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public List<FavEditChildEntity> f41796X = new ArrayList();

    /* JADX INFO: compiled from: FavEditChildFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/edit/FavEditChildFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/quotefacade/favorites/edit/FavEditChildFragment;", "type", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FavEditChildFragment newInstance(int type) {
            FavEditChildFragment favEditChildFragment = new FavEditChildFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("favPageType", type);
            favEditChildFragment.setArguments(bundle);
            return favEditChildFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.edit.FavEditChildFragment$a */
    /* JADX INFO: compiled from: FavEditChildFragment.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/quotefacade/favorites/edit/FavEditChildFragment$enableDragSort$callback$1", "Lio/chad/library/adapter/base/callback/ItemDragAndSwipeCallback;", "onSelectedChanged", "", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "actionState", "", "clearView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFavEditChildFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavEditChildFragment.kt\ncom/kubi/quotefacade/favorites/edit/FavEditChildFragment$enableDragSort$callback$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,229:1\n172#2,2:230\n*S KotlinDebug\n*F\n+ 1 FavEditChildFragment.kt\ncom/kubi/quotefacade/favorites/edit/FavEditChildFragment$enableDragSort$callback$1\n*L\n112#1:230,2\n*E\n"})
    public static final class C22004a extends ItemDragAndSwipeCallback {
        public C22004a(FavEditChildAdapter favEditChildAdapter) {
            super(favEditChildAdapter);
        }

        @Override // io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            viewHolder.itemView.setBackgroundColor(0);
            View itemView = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            itemView.setPadding(0, 0, 0, 0);
            super.clearView(recyclerView, viewHolder);
        }

        @Override // io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
            if (actionState != 0) {
                View view = viewHolder != null ? viewHolder.itemView : null;
                C5271g0.a aVar = new C5271g0.a();
                aVar.m6216g(FavEditChildFragment.this.getColorRes(R$color.c_cover4));
                aVar.m6218i(C5275i0.m6236a(4.0f));
                C5271g0.m6208a(view, aVar);
            }
            super.onSelectedChanged(viewHolder, actionState);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.edit.FavEditChildFragment$bindState$2 */
    /* JADX INFO: compiled from: FavEditChildFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/quotefacade/entity/FavEditChildEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.edit.FavEditChildFragment$bindState$2", m90122f = "FavEditChildFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C220062 extends SuspendLambda implements Function2<List<? extends FavEditChildEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends FavEditChildEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<FavEditChildEntity>) list, continuation);
        }

        public C220062(Continuation<? super C220062> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C220062 c220062 = FavEditChildFragment.this.new C220062(continuation);
            c220062.L$0 = obj;
            return c220062;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<FavEditChildEntity> list, Continuation<? super Unit> continuation) {
            return ((C220062) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (list != null) {
                FavEditChildFragment favEditChildFragment = FavEditChildFragment.this;
                if (list.isEmpty()) {
                    favEditChildFragment.showEmpty();
                } else {
                    favEditChildFragment.showContent();
                }
                favEditChildFragment.f41796X.clear();
                favEditChildFragment.f41796X.addAll(list);
                FavEditChildAdapter favEditChildAdapter = favEditChildFragment.f41795W;
                if (favEditChildAdapter != null) {
                    favEditChildAdapter.replaceData(list);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.edit.FavEditChildFragment$bindState$4 */
    /* JADX INFO: compiled from: FavEditChildFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.edit.FavEditChildFragment$bindState$4", m90122f = "FavEditChildFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C220084 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C220084(Continuation<? super C220084> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C220084 c220084 = FavEditChildFragment.this.new C220084(continuation);
            c220084.L$0 = obj;
            return c220084;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C220084) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (obj2 != null) {
                FavEditChildFragment.this.showEmpty();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.edit.FavEditChildFragment$bindState$6 */
    /* JADX INFO: compiled from: FavEditChildFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.edit.FavEditChildFragment$bindState$6", m90122f = "FavEditChildFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C220106 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C220106(Continuation<? super C220106> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C220106 c220106 = FavEditChildFragment.this.new C220106(continuation);
            c220106.L$0 = obj;
            return c220106;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C220106) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (obj2 != null) {
                final FavEditChildFragment favEditChildFragment = FavEditChildFragment.this;
                BaseFragment.showFailView$default(favEditChildFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.quotefacade.favorites.edit.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FavEditChildFragment.C220106.m51573f(favEditChildFragment, view);
                    }
                }, 3, (Object) null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final void m51573f(FavEditChildFragment favEditChildFragment, View view) {
            favEditChildFragment.m51566F3();
        }
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m51554C3(final FavEditChildFragment favEditChildFragment) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.dialog_title_text_tip).m54153J4(R$string.kc_fav_delete_symbol_title).m54161R4(0).m54162S4(R$string.confirm_delete, new DialogInterface.OnClickListener() { // from class: com.kubi.quotefacade.favorites.edit.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                FavEditChildFragment.m51555D3(this.f41816b, dialogInterface, i11);
            }
        }).m54159P4(R$string.cancel, null).m54172c5(favEditChildFragment.getChildFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final void m51555D3(FavEditChildFragment favEditChildFragment, DialogInterface dialogInterface, int i11) {
        List<FavEditChildEntity> data;
        FavEditChildAdapter favEditChildAdapter = favEditChildFragment.f41795W;
        if (favEditChildAdapter == null || (data = favEditChildAdapter.getData()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (!((FavEditChildEntity) obj).isSelect()) {
                arrayList.add(obj);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (mutableList != null) {
            favEditChildFragment.sendIntent(new FavEditChildContract$UiIntent.UpdateFavoriteList(favEditChildFragment.m51569x3(), mutableList, true));
        }
    }

    /* JADX INFO: renamed from: E3 */
    public final boolean m51565E3() {
        List<FavEditChildEntity> listEmptyList;
        FavEditChildAdapter favEditChildAdapter = this.f41795W;
        if (favEditChildAdapter == null || (listEmptyList = favEditChildAdapter.getData()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        int i11 = 0;
        for (FavEditChildEntity favEditChildEntity : listEmptyList) {
            while (i11 < this.f41796X.size() && !Intrinsics.areEqual(this.f41796X.get(i11).getSymbol(), favEditChildEntity.getSymbol())) {
                i11++;
            }
            if (i11 >= this.f41796X.size()) {
                return true;
            }
            i11++;
        }
        return false;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        List<FavEditChildEntity> data;
        List<FavEditChildEntity> data2;
        FavEditChildAdapter favEditChildAdapter;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C22015c) {
            if (!((C22015c) singleEvent).getF41811a()) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            FavEditChildAdapter favEditChildAdapter2 = this.f41795W;
            if (favEditChildAdapter2 != null && (data2 = favEditChildAdapter2.getData()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : data2) {
                    if (!((FavEditChildEntity) obj).isSelect()) {
                        arrayList.add(obj);
                    }
                }
                List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                if (mutableList != null && (favEditChildAdapter = this.f41795W) != null) {
                    favEditChildAdapter.replaceData(mutableList);
                }
            }
            FavEditChildAdapter favEditChildAdapter3 = this.f41795W;
            if (favEditChildAdapter3 == null || (data = favEditChildAdapter3.getData()) == null || !data.isEmpty()) {
                return;
            }
            showEmpty();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_favorite_edit_child_fragment;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(FavEditChildVM.class);
    }

    /* JADX INFO: renamed from: u3 */
    public final void m51567u3() {
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new C22004a(this.f41795W));
        C4686p c4686pM51568w3 = m51568w3();
        itemTouchHelper.attachToRecyclerView(c4686pM51568w3 != null ? c4686pM51568w3.f4482h : null);
        FavEditChildAdapter favEditChildAdapter = this.f41795W;
        if (favEditChildAdapter != null) {
            favEditChildAdapter.enableDragItem(itemTouchHelper, R$id.ivSort, true);
        }
    }

    /* JADX INFO: renamed from: w3 */
    public final C4686p m51568w3() {
        return (C4686p) this.f41793U.getValue(this, f41792Z[0]);
    }

    /* JADX INFO: renamed from: x3 */
    public final Integer m51569x3() {
        return (Integer) this.f41794V.getValue();
    }

    /* JADX INFO: renamed from: y3 */
    public final void m51570y3() {
        List<FavEditChildEntity> data;
        FavEditChildAdapter favEditChildAdapter = this.f41795W;
        if (favEditChildAdapter == null || (data = favEditChildAdapter.getData()) == null) {
            return;
        }
        sendIntent(new FavEditChildContract$UiIntent.UpdateFavoriteList(m51569x3(), data, false, 4, null));
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m51552A3(FavEditChildFragment favEditChildFragment) {
        favEditChildFragment.m51571z3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m51553B3(FavEditChildFragment favEditChildFragment) {
        ImageView imageView;
        ImageView imageView2;
        Boolean boolValueOf;
        ImageView imageView3;
        C4686p c4686pM51568w3 = favEditChildFragment.m51568w3();
        Boolean boolValueOf2 = null;
        if (c4686pM51568w3 != null && (imageView2 = c4686pM51568w3.f4479e) != null) {
            C4686p c4686pM51568w4 = favEditChildFragment.m51568w3();
            if (c4686pM51568w4 != null && (imageView3 = c4686pM51568w4.f4479e) != null) {
                boolValueOf = Boolean.valueOf(imageView3.isSelected());
            } else {
                boolValueOf = null;
            }
            imageView2.setSelected(!C27025c.m66566d(boolValueOf));
        }
        FavEditChildAdapter favEditChildAdapter = favEditChildFragment.f41795W;
        if (favEditChildAdapter != null) {
            C4686p c4686pM51568w5 = favEditChildFragment.m51568w3();
            if (c4686pM51568w5 != null && (imageView = c4686pM51568w5.f4479e) != null) {
                boolValueOf2 = Boolean.valueOf(imageView.isSelected());
            }
            favEditChildAdapter.m51551m(C27025c.m66566d(boolValueOf2));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final Integer m51564v3(FavEditChildFragment favEditChildFragment) {
        Bundle arguments = favEditChildFragment.getArguments();
        if (arguments != null) {
            return Integer.valueOf(RouteExKt.m56260m(arguments, "favPageType"));
        }
        return null;
    }

    /* JADX INFO: renamed from: F3 */
    public final void m51566F3() {
        Integer numM51569x3 = m51569x3();
        if (numM51569x3 != null && numM51569x3.intValue() == 0) {
            sendIntent(FavEditChildContract$UiIntent.GetAllFavoriteList.INSTANCE);
            return;
        }
        if (numM51569x3 != null && numM51569x3.intValue() == 1) {
            sendIntent(FavEditChildContract$UiIntent.GetSpotFavoriteList.INSTANCE);
            return;
        }
        if (numM51569x3 != null && numM51569x3.intValue() == 2) {
            sendIntent(FavEditChildContract$UiIntent.GetFuturesFavoriteList.INSTANCE);
        } else if (numM51569x3 != null && numM51569x3.intValue() == 3) {
            sendIntent(FavEditChildContract$UiIntent.GetEtfFavoriteList.INSTANCE);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.favorites.edit.FavEditChildFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getFavoriteList();
            }
        }, new C220062(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.favorites.edit.FavEditChildFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getEmpty();
            }
        }, new C220084(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.favorites.edit.FavEditChildFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getError();
            }
        }, new C220106(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ConstraintLayout constraintLayout3;
        super.initView();
        showLoading();
        C4686p c4686pM51568w3 = m51568w3();
        if (c4686pM51568w3 != null && (constraintLayout3 = c4686pM51568w3.f4478d) != null) {
            constraintLayout3.setEnabled(false);
        }
        this.f41795W = new FavEditChildAdapter(m51569x3(), new Function0() { // from class: com.kubi.quotefacade.favorites.edit.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FavEditChildFragment.m51552A3(this.f41813b);
            }
        });
        C4686p c4686pM51568w4 = m51568w3();
        if (c4686pM51568w4 != null && (recyclerView2 = c4686pM51568w4.f4482h) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        C4686p c4686pM51568w5 = m51568w3();
        if (c4686pM51568w5 != null && (recyclerView = c4686pM51568w5.f4482h) != null) {
            recyclerView.setAdapter(this.f41795W);
        }
        m51567u3();
        m51566F3();
        C4686p c4686pM51568w6 = m51568w3();
        if (c4686pM51568w6 != null && (constraintLayout2 = c4686pM51568w6.f4476b) != null) {
            C27046k.m66711z(constraintLayout2, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.edit.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FavEditChildFragment.m51553B3(this.f41814b);
                }
            }, 1, null);
        }
        C4686p c4686pM51568w7 = m51568w3();
        if (c4686pM51568w7 != null && (constraintLayout = c4686pM51568w7.f4478d) != null) {
            C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.edit.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FavEditChildFragment.m51554C3(this.f41815b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: z3 */
    public final void m51571z3() {
        ImageView imageView;
        BaseTextView baseTextView;
        ConstraintLayout constraintLayout;
        ImageView imageView2;
        BaseTextView baseTextView2;
        ConstraintLayout constraintLayout2;
        List<FavEditChildEntity> data;
        C4686p c4686pM51568w3 = m51568w3();
        if (c4686pM51568w3 != null && (constraintLayout2 = c4686pM51568w3.f4478d) != null) {
            FavEditChildAdapter favEditChildAdapter = this.f41795W;
            boolean z11 = false;
            if (favEditChildAdapter != null && (data = favEditChildAdapter.getData()) != null && !data.isEmpty()) {
                Iterator<T> it = data.iterator();
                while (it.hasNext()) {
                    if (((FavEditChildEntity) it.next()).isSelect()) {
                        z11 = true;
                        break;
                    }
                }
            }
            constraintLayout2.setEnabled(z11);
        }
        C4686p c4686pM51568w4 = m51568w3();
        if (c4686pM51568w4 != null && (constraintLayout = c4686pM51568w4.f4478d) != null && constraintLayout.isEnabled()) {
            C4686p c4686pM51568w5 = m51568w3();
            if (c4686pM51568w5 != null && (baseTextView2 = c4686pM51568w5.f4484j) != null) {
                baseTextView2.setTextColor(getColorRes(R$color.c_text));
            }
            C4686p c4686pM51568w6 = m51568w3();
            if (c4686pM51568w6 != null && (imageView2 = c4686pM51568w6.f4480f) != null) {
                C27046k.m66701p(imageView2, getColorRes(R$color.c_text));
                return;
            }
            return;
        }
        C4686p c4686pM51568w7 = m51568w3();
        if (c4686pM51568w7 != null && (baseTextView = c4686pM51568w7.f4484j) != null) {
            baseTextView.setTextColor(getColorRes(R$color.c_text40));
        }
        C4686p c4686pM51568w8 = m51568w3();
        if (c4686pM51568w8 != null && (imageView = c4686pM51568w8.f4480f) != null) {
            C27046k.m66701p(imageView, getColorRes(R$color.c_icon60));
        }
    }
}
