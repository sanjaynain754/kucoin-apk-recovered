package com.kubi.home.v2.guide;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import bw.C4719f0;
import com.blankj.utilcode.util.C5267e0;
import com.cpiz.android.bubbleview.BubbleTextView;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.R$mipmap;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.v2.card.C15000n;
import com.kubi.home.v2.card.HomeCardsRepositoryV2;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.resources.C22912t;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.guideview.C22896d;
import com.kubi.resources.guideview.InterfaceC22894b;
import com.kubi.resources.guideview.ViewOnKeyListenerC22895c;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p289gj.C37967a;
import p315hj.InterfaceC38221a;
import p562qj.C43745a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sj.C44510a;
import y70.C46392a;

/* JADX INFO: compiled from: WidgetGuideCenter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J \u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/home/v2/guide/WidgetGuideCenter;", "", "<init>", "()V", "DIALOG_TAG", "", "showShowBottomSheet", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onShowed", "Lkotlin/Function0;", "getPicDesResId", "", "closeGuideDialog", "findValidViewShowTip", "showDragTips", "target", "Landroid/view/View;", "hasFeed", "", "showAddTips", "rootView", "Landroid/view/ViewGroup;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWidgetGuideCenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetGuideCenter.kt\ncom/kubi/home/v2/guide/WidgetGuideCenter\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n+ 7 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,213:1\n136#2:214\n84#2:215\n136#2:219\n126#2,2:220\n126#2,2:235\n75#2,2:237\n295#3,2:216\n1#4:218\n93#5,13:222\n75#6:239\n77#6:244\n47#7,4:240\n*S KotlinDebug\n*F\n+ 1 WidgetGuideCenter.kt\ncom/kubi/home/v2/guide/WidgetGuideCenter\n*L\n66#1:214\n70#1:215\n195#1:219\n198#1:220,2\n94#1:235,2\n96#1:237,2\n132#1:216,2\n199#1:222,13\n117#1:239\n117#1:244\n117#1:240,4\n*E\n"})
public final class WidgetGuideCenter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WidgetGuideCenter f26561a = new WidgetGuideCenter();

    /* JADX INFO: renamed from: com.kubi.home.v2.guide.WidgetGuideCenter$a */
    /* JADX INFO: compiled from: View.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, m90084d2 = {"androidx/core/view/ViewKt$doOnAttach$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onViewDetachedFromWindow", "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnAttach$1\n+ 2 WidgetGuideCenter.kt\ncom/kubi/home/v2/guide/WidgetGuideCenter\n*L\n1#1,414:1\n200#2:415\n211#2:416\n*E\n"})
    public static final class ViewOnAttachStateChangeListenerC15016a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f26562b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ViewGroup f26563c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ View f26564d;

        public ViewOnAttachStateChangeListenerC15016a(View view, ViewGroup viewGroup, View view2) {
            this.f26562b = view;
            this.f26563c = viewGroup;
            this.f26564d = view2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            LifecycleCoroutineScope lifecycleScope;
            this.f26562b.removeOnAttachStateChangeListener(this);
            Context context = this.f26563c.getContext();
            BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
            if (baseActivity == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(baseActivity)) == null) {
                return;
            }
            C41696j.m91104d(lifecycleScope, C42911a.m94121c(), null, new WidgetGuideCenter$showAddTips$1$1(this.f26563c, this.f26564d, null), 2, null);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.guide.WidgetGuideCenter$b */
    /* JADX INFO: compiled from: WidgetGuideCenter.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/home/v2/guide/WidgetGuideCenter$showDragTips$guide$1", "Lcom/kubi/resources/guideview/Component;", "getView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "getAnchor", "", "getFitPosition", "getXOffset", "getYOffset", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15017b implements InterfaceC22894b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f26565a;

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: a */
        public int mo18889a() {
            return 0;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: b */
        public int mo18890b() {
            return C27040e.m66658b(-5);
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: c */
        public int mo18891c() {
            return 2;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: e */
        public View mo18893e(LayoutInflater layoutInflater) {
            View viewInflate;
            if (layoutInflater == null || (viewInflate = layoutInflater.inflate(R$layout.home_widget_bubble_hint, (ViewGroup) null)) == null) {
                return null;
            }
            View view = this.f26565a;
            BubbleTextView bubbleTextView = viewInflate instanceof BubbleTextView ? (BubbleTextView) viewInflate : null;
            if (bubbleTextView != null) {
                bubbleTextView.setMaxWidth((int) (C5267e0.m6183e() * 0.9f));
                bubbleTextView.setArrowTo(view);
            }
            return viewInflate;
        }

        public C15017b(View view) {
            this.f26565a = view;
        }

        @Override // com.kubi.resources.guideview.InterfaceC22894b
        /* JADX INFO: renamed from: d */
        public int mo18892d() {
            return 16;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.guide.WidgetGuideCenter$c */
    /* JADX INFO: compiled from: WidgetGuideCenter.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/kubi/home/v2/guide/WidgetGuideCenter$showDragTips$guide$2", "Lcom/kubi/resources/guideview/GuideBuilder$OnVisibilityChangedListener;", "onShown", "", "onDismiss", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15018c implements C22896d.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f26566a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Ref.ObjectRef<View.OnLayoutChangeListener> f26567b;

        public C15018c(View view, Ref.ObjectRef<View.OnLayoutChangeListener> objectRef) {
            this.f26566a = view;
            this.f26567b = objectRef;
        }

        @Override // com.kubi.resources.guideview.C22896d.a
        public void onDismiss() {
            this.f26566a.removeOnLayoutChangeListener(this.f26567b.element);
        }

        @Override // com.kubi.resources.guideview.C22896d.a
        public void onShown() {
            this.f26566a.addOnLayoutChangeListener(this.f26567b.element);
        }
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m30911v(RecyclerView recyclerView, int i11, int i12, final ViewOnKeyListenerC22895c viewOnKeyListenerC22895c) {
        recyclerView.smoothScrollBy(0, i11 - i12);
        C22912t.m54417o(recyclerView, new Runnable() { // from class: com.kubi.home.v2.guide.l
            @Override // java.lang.Runnable
            public final void run() {
                WidgetGuideCenter.m30912w(viewOnKeyListenerC22895c);
            }
        }, 150L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m30890A(final BaseFragment baseFragment, final RecyclerView recyclerView, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        ((ImageView) viewHolder.itemView.findViewById(R$id.iv_pic_des)).setImageResource(f26561a.m30917q());
        View viewFindViewById = viewHolder.itemView.findViewById(R$id.tvBtnOk);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.home.v2.guide.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WidgetGuideCenter.m30891B(dialogFragmentHelper, baseFragment, recyclerView);
            }
        }, 1, null);
        View viewFindViewById2 = viewHolder.itemView.findViewById(R$id.tvBtnCancel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        C27046k.m66711z(viewFindViewById2, 0L, new Function0() { // from class: com.kubi.home.v2.guide.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WidgetGuideCenter.m30892C(dialogFragmentHelper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final void m30893D(long j11, DialogInterface dialogInterface) {
        if (j11 > 0) {
            C46392a.m102328k(C44510a.f98560a.m98480f(), true);
        }
        C46392a.m102330m(C44510a.f98560a.m98481g(), System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: t */
    public static final void m30909t(final RecyclerView recyclerView, final ViewOnKeyListenerC22895c viewOnKeyListenerC22895c, View view, int i11, final int i12, int i13, int i14, int i15, final int i16, int i17, int i18) {
        if (i11 == i15 && i12 == i16 && i13 == i17 && i14 == i18) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: com.kubi.home.v2.guide.u
            @Override // java.lang.Runnable
            public final void run() {
                WidgetGuideCenter.m30910u(recyclerView, i12, i16, viewOnKeyListenerC22895c);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static final void m30910u(final RecyclerView recyclerView, final int i11, final int i12, final ViewOnKeyListenerC22895c viewOnKeyListenerC22895c) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.guide.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WidgetGuideCenter.m30911v(recyclerView, i11, i12, viewOnKeyListenerC22895c);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static final void m30912w(final ViewOnKeyListenerC22895c viewOnKeyListenerC22895c) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.guide.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WidgetGuideCenter.m30913x(viewOnKeyListenerC22895c);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public static final void m30914z(final BaseFragment baseFragment, Function0 function0, final RecyclerView recyclerView, final long j11) {
        final BaseDialogFragment baseDialogFragmentM54192r3 = DialogFragmentHelper.f43568p0.newInstance(R$layout.home_widget_guide_bottom_sheet, true).m54237f4(new Function2() { // from class: com.kubi.home.v2.guide.o
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return WidgetGuideCenter.m30890A(baseFragment, recyclerView, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.home.v2.guide.p
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                WidgetGuideCenter.m30893D(j11, dialogInterface);
            }
        });
        if (!baseFragment.isShowing()) {
            C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.guide.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WidgetGuideCenter.m30894E(baseDialogFragmentM54192r3);
                }
            });
            return;
        }
        C4719f0 c4719f0 = C4719f0.f4716a;
        FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        c4719f0.m4771g(baseDialogFragmentM54192r3, childFragmentManager, "WidgetGuideBottomSheet", 20);
        function0.invoke();
    }

    /* JADX INFO: renamed from: n */
    public final void m30915n(@NotNull final BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.guide.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WidgetGuideCenter.m30908o(fragment);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m30916p(RecyclerView recyclerView) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        if (HomeCardsRepositoryV2.f26494a.m30800r()) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            Object obj = null;
            C43745a c43745a = adapter instanceof C43745a ? (C43745a) adapter : null;
            if (c43745a != null) {
                List data = c43745a.getData();
                if (data != null) {
                    for (Object obj2 : data) {
                        if (Intrinsics.areEqual(((BaseCardDataV2) obj2).getCode(), HomeWidgetCode.HomeFeed.getCode())) {
                            obj = obj2;
                            break;
                        }
                    }
                    obj = (BaseCardDataV2) obj;
                }
                boolean z11 = obj != null;
                List data2 = c43745a.getData();
                if (data2 == null || (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(C15000n.m30812b(data2))) == null) {
                    return;
                }
                WidgetGuideCenter widgetGuideCenter = f26561a;
                View itemView = viewHolderFindViewHolderForAdapterPosition.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                widgetGuideCenter.m30919s(itemView, recyclerView, z11);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m30917q() {
        try {
            InterfaceC38221a interfaceC38221a = (InterfaceC38221a) Router.f46192a.m56186h(InterfaceC38221a.class, SiteInfoManager.f47913a.m58109c());
            return interfaceC38221a != null ? interfaceC38221a.mo86286a() : R$mipmap.home_card_guide_img;
        } catch (Exception unused) {
            return R$mipmap.home_card_guide_img;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m30918r(@NotNull ViewGroup rootView, @NotNull View target) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(target, "target");
        C44510a c44510a = C44510a.f98560a;
        if (C46392a.m102322d(c44510a.m98479e(), false)) {
            return;
        }
        C46392a.m102328k(c44510a.m98479e(), true);
        if (!target.isAttachedToWindow()) {
            target.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC15016a(target, rootView, target));
            return;
        }
        Context context = rootView.getContext();
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        if (baseActivity == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(baseActivity)) == null) {
            return;
        }
        C41696j.m91104d(lifecycleScope, C42911a.m94121c(), null, new WidgetGuideCenter$showAddTips$1$1(rootView, target, null), 2, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m30920y(@NotNull final BaseFragment fragment, @NotNull final RecyclerView recyclerView, @NotNull final Function0<Unit> onShowed) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(onShowed, "onShowed");
        if (HomeCardsRepositoryV2.f26494a.m30800r()) {
            C44510a c44510a = C44510a.f98560a;
            if (C46392a.m102322d(c44510a.m98480f(), false)) {
                return;
            }
            final long jM102324f = C46392a.m102324f(c44510a.m98481g(), 0L);
            if (jM102324f <= 0 || ((long) 604800000) + jM102324f <= System.currentTimeMillis()) {
                C22912t.m54417o(recyclerView, new Runnable() { // from class: com.kubi.home.v2.guide.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        WidgetGuideCenter.m30914z(fragment, onShowed, recyclerView, jM102324f);
                    }
                }, 250L);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m30891B(DialogFragmentHelper dialogFragmentHelper, BaseFragment baseFragment, RecyclerView recyclerView) {
        dialogFragmentHelper.dismissAllowingStateLoss();
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseFragment), C42911a.m94121c(), null, new WidgetGuideCenter$showShowBottomSheet$1$helper$1$1$1(recyclerView, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m30892C(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m30894E(BaseDialogFragment baseDialogFragment) {
        if (baseDialogFragment.isAdded()) {
            baseDialogFragment.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m30908o(BaseFragment baseFragment) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseFragment), C42911a.m94121c().plus(new C37967a(CoroutineExceptionHandler.INSTANCE)), null, new WidgetGuideCenter$closeGuideDialog$1$1(baseFragment, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m30913x(ViewOnKeyListenerC22895c viewOnKeyListenerC22895c) {
        viewOnKeyListenerC22895c.m54316n();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [T, com.kubi.home.v2.guide.t] */
    /* JADX INFO: renamed from: s */
    public final void m30919s(View view, final RecyclerView recyclerView, boolean z11) {
        FragmentActivity fragmentActivity;
        int i11;
        Context context = view.getContext();
        if (context instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) context;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity == null) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final ViewOnKeyListenerC22895c viewOnKeyListenerC22895cM54318b = new C22896d().m54333q(view).m54319c(77).m54321e(C27040e.m66658b(16)).m54323g(0).m54317a(new C15017b(view)).m54320d(true).m54329m(new C15018c(view, objectRef)).m54318b();
        objectRef.element = new View.OnLayoutChangeListener() { // from class: com.kubi.home.v2.guide.t
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                WidgetGuideCenter.m30909t(recyclerView, viewOnKeyListenerC22895cM54318b, view2, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        if (z11) {
            i11 = 90;
        } else {
            i11 = 50;
        }
        viewOnKeyListenerC22895cM54318b.m54312j(C27040e.m66658b(i11));
        viewOnKeyListenerC22895cM54318b.m54313k(false);
        viewOnKeyListenerC22895cM54318b.m54314l(fragmentActivity);
    }
}
