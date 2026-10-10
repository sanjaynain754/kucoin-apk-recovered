package com.kubi.applet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.home.api.entity.HomeQuickAccessEntity;
import com.kubi.home.api.entity.QuickAccessEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AppletAddDialogHelper.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jw\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122Q\b\u0002\u0010\u0013\u001aK\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/applet/AppletAddDialogHelper;", "", "<init>", "()V", "SPAN_COUNT", "", "replaceItem", "Landroidx/constraintlayout/widget/ConstraintLayout;", "tvNotOften", "Lcom/kubi/resources/widget/BaseTextView;", "notOftenUsedEntity", "Lcom/kubi/home/api/entity/QuickAccessEntity;", "replaceId", "", "getAppletAddDialog", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "currentQuickAccessEntity", "homeQuickAccessEntity", "Lcom/kubi/home/api/entity/HomeQuickAccessEntity;", "onActionButtonClick", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "helper", "", "isReplace", "", "onDismissed", "Lkotlin/Function0;", "getNotOftenUsedEntity", "homeListIsFull", "setAppletItemStyle", "isNightMode", "item", "GridSpacingItemDecoration", "AppletLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppletAddDialogHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppletAddDialogHelper.kt\ncom/kubi/applet/AppletAddDialogHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,369:1\n1#2:370\n*E\n"})
public final class AppletAddDialogHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AppletAddDialogHelper f16190a = new AppletAddDialogHelper();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static ConstraintLayout f16191b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public static BaseTextView f16192c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public static QuickAccessEntity f16193d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public static String f16194e;

    /* JADX INFO: renamed from: com.kubi.applet.AppletAddDialogHelper$a */
    /* JADX INFO: compiled from: AppletAddDialogHelper.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/applet/AppletAddDialogHelper$GridSpacingItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "spanCount", "", "spacing", "includeEdge", "", "<init>", "(IIZ)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "AppletLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9430a extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: d */
        public final int f16195d;

        /* JADX INFO: renamed from: e */
        public final int f16196e;

        /* JADX INFO: renamed from: f */
        public final boolean f16197f;

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                outRect.setEmpty();
                return;
            }
            int i11 = childAdapterPosition % this.f16195d;
            boolean z11 = parent.getLayoutDirection() == 1;
            if (this.f16197f) {
                if (z11) {
                    int i12 = this.f16196e;
                    int i13 = this.f16195d;
                    outRect.right = i12 - ((i11 * i12) / i13);
                    outRect.left = ((i11 + 1) * i12) / i13;
                } else {
                    int i14 = this.f16196e;
                    int i15 = this.f16195d;
                    outRect.left = i14 - ((i11 * i14) / i15);
                    outRect.right = ((i11 + 1) * i14) / i15;
                }
                if (childAdapterPosition < this.f16195d) {
                    outRect.top = this.f16196e;
                }
                outRect.bottom = this.f16196e;
                return;
            }
            if (z11) {
                int i16 = this.f16196e;
                int i17 = this.f16195d;
                outRect.right = (i11 * i16) / i17;
                outRect.left = i16 - (((i11 + 1) * i16) / i17);
            } else {
                int i18 = this.f16196e;
                int i19 = this.f16195d;
                outRect.left = (i11 * i18) / i19;
                outRect.right = i18 - (((i11 + 1) * i18) / i19);
            }
            if (childAdapterPosition >= this.f16195d) {
                outRect.top = this.f16196e;
            }
        }

        public C9430a(int i11, int i12, boolean z11) {
            this.f16195d = i11;
            this.f16196e = i12;
            this.f16197f = z11;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m15034m(Function0 function0, DialogInterface dialogInterface) {
        f16193d = null;
        f16192c = null;
        f16191b = null;
        f16194e = null;
        function0.invoke();
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m15035n(QuickAccessEntity quickAccessEntity, HomeQuickAccessEntity homeQuickAccessEntity, final Function3 function3, BaseViewHolder appLetAddViewHolder, final DialogFragmentHelper helper) {
        QuickAccessEntity quickAccessEntity2;
        Intrinsics.checkNotNullParameter(appLetAddViewHolder, "appLetAddViewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        boolean z11 = AppCompatDelegate.getDefaultNightMode() == 2;
        String name = quickAccessEntity.getName();
        String iconUrl = quickAccessEntity.getIconUrl();
        AppletAddDialogHelper appletAddDialogHelper = f16190a;
        final boolean zM15040r = appletAddDialogHelper.m15040r(homeQuickAccessEntity);
        BaseTextView baseTextView = (BaseTextView) appLetAddViewHolder.getView(R$id.tvAppletTitle);
        if (baseTextView != null) {
            baseTextView.setText(zM15040r ? baseTextView.getContext().getString(R$string.mini_app_replace_title) : baseTextView.getContext().getString(R$string.mini_app_add_title, name));
        }
        BaseTextView baseTextView2 = (BaseTextView) appLetAddViewHolder.getView(R$id.tvAppletContent);
        if (baseTextView2 != null) {
            baseTextView2.setText(baseTextView2.getContext().getString(R$string.mini_app_sub_title, name));
        }
        if (zM15040r) {
            int i11 = R$id.clReplace;
            View view = appLetAddViewHolder.getView(i11);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            ViewExtKt.m66594y(view);
            f16193d = appletAddDialogHelper.m15039q(homeQuickAccessEntity);
            View viewById = ((ConstraintLayout) appLetAddViewHolder.getView(i11)).getViewById(R$id.tvNotOften);
            Intrinsics.checkNotNull(viewById, "null cannot be cast to non-null type com.kubi.resources.widget.BaseTextView");
            f16192c = (BaseTextView) viewById;
            View viewById2 = ((ConstraintLayout) appLetAddViewHolder.getView(i11)).getViewById(R$id.itemNew);
            Intrinsics.checkNotNull(viewById2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) viewById2;
            View viewById3 = ((ConstraintLayout) appLetAddViewHolder.getView(i11)).getViewById(R$id.itemReplace);
            Intrinsics.checkNotNull(viewById3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            f16191b = (ConstraintLayout) viewById3;
            int i12 = R$id.ivIcon;
            ImageView imageView = (ImageView) constraintLayout.findViewById(i12);
            ConstraintLayout constraintLayout2 = f16191b;
            Intrinsics.checkNotNull(constraintLayout2);
            ImageView imageView2 = (ImageView) constraintLayout2.findViewById(i12);
            C24277v.m58540e(imageView.getContext(), iconUrl, imageView);
            Context context = imageView2 != null ? imageView2.getContext() : null;
            QuickAccessEntity quickAccessEntity3 = f16193d;
            C24277v.m58540e(context, quickAccessEntity3 != null ? quickAccessEntity3.getIconUrl() : null, imageView2);
            appletAddDialogHelper.m15041s(z11, constraintLayout);
            ConstraintLayout constraintLayout3 = f16191b;
            Intrinsics.checkNotNull(constraintLayout3);
            appletAddDialogHelper.m15041s(z11, constraintLayout3);
            int i13 = R$id.tvName;
            BaseTextView baseTextView3 = (BaseTextView) constraintLayout.findViewById(i13);
            if (baseTextView3 != null) {
                baseTextView3.setText(name);
                baseTextView3.setTextColor(ContextCompat.getColor(baseTextView3.getContext(), R$color.c_text));
            }
            ConstraintLayout constraintLayout4 = f16191b;
            Intrinsics.checkNotNull(constraintLayout4);
            BaseTextView baseTextView4 = (BaseTextView) constraintLayout4.findViewById(i13);
            if (baseTextView4 != null) {
                QuickAccessEntity quickAccessEntity4 = f16193d;
                baseTextView4.setText(quickAccessEntity4 != null ? quickAccessEntity4.getName() : null);
                baseTextView4.setTextColor(ContextCompat.getColor(baseTextView4.getContext(), R$color.c_text));
            }
            imageView.setAlpha(1.0f);
            imageView2.setAlpha(1.0f);
        }
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) appLetAddViewHolder.getView(R$id.tvBtnAdd);
        if (kcPrimaryButton != null) {
            kcPrimaryButton.setText(zM15040r ? kcPrimaryButton.getContext().getString(R$string.mini_app_replace_btn_title) : kcPrimaryButton.getContext().getString(R$string.assets_address_confirm_add));
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.applet.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AppletAddDialogHelper.m15036o(function3, helper, zM15040r);
                }
            }, 1, null);
        }
        KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) appLetAddViewHolder.getView(R$id.tvBtnLatter);
        if (kcPrimaryButton2 != null) {
            C27046k.m66711z(kcPrimaryButton2, 0L, new Function0() { // from class: com.kubi.applet.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AppletAddDialogHelper.m15037p(helper);
                }
            }, 1, null);
        }
        RecyclerView recyclerView = (RecyclerView) appLetAddViewHolder.getView(R$id.recyclerApplet);
        recyclerView.setLayoutManager(new GridLayoutManager(appLetAddViewHolder.itemView.getContext(), 4));
        Context context2 = appLetAddViewHolder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerView.addItemDecoration(new C9430a(4, (int) C27025c.m66565c(context2, 8), false));
        List<QuickAccessEntity> homeList = homeQuickAccessEntity.getHomeList();
        List mutableList = homeList != null ? CollectionsKt.toMutableList((Collection) homeList) : null;
        if (zM15040r || mutableList == null) {
            quickAccessEntity2 = quickAccessEntity;
        } else {
            quickAccessEntity2 = quickAccessEntity;
            mutableList.add(quickAccessEntity2);
        }
        QuickAccessEntity moreItem = homeQuickAccessEntity.getMoreItem();
        if (moreItem != null && mutableList != null) {
            mutableList.add(moreItem);
        }
        recyclerView.setAdapter(new AppletAddDialogHelper$getAppletAddDialog$1$8(mutableList, zM15040r, z11, quickAccessEntity2, R$layout.dialog_bottom_dalog_applet_item));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m15033l(DialogFragmentHelper dialogFragmentHelper, BaseViewHolder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Dialog dialog = dialogFragmentHelper.getDialog();
        if (dialog != null) {
            int iM6182d = (int) (((double) C5267e0.m6182d()) * 0.8d);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, iM6182d);
            }
            FrameLayout frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet);
            if (frameLayout != null) {
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
                Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
                bottomSheetBehaviorFrom.setPeekHeight(iM6182d);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m15036o(Function3 function3, DialogFragmentHelper dialogFragmentHelper, boolean z11) {
        if (function3 != null) {
            function3.invoke(dialogFragmentHelper, f16194e, Boolean.valueOf(z11));
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final DialogFragmentHelper m15038k(@NotNull final QuickAccessEntity currentQuickAccessEntity, @NotNull final HomeQuickAccessEntity homeQuickAccessEntity, @Nullable final Function3<? super DialogFragmentHelper, ? super String, ? super Boolean, Unit> function3, @NotNull final Function0<Unit> onDismissed) {
        Intrinsics.checkNotNullParameter(currentQuickAccessEntity, "currentQuickAccessEntity");
        Intrinsics.checkNotNullParameter(homeQuickAccessEntity, "homeQuickAccessEntity");
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        final DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.dialog_bottom_dialog_applet_add, true).m54237f4(new Function2() { // from class: com.kubi.applet.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AppletAddDialogHelper.m15035n(currentQuickAccessEntity, homeQuickAccessEntity, function3, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        dialogFragmentHelperM54237f4.m54238g4(new Function1() { // from class: com.kubi.applet.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppletAddDialogHelper.m15033l(dialogFragmentHelperM54237f4, (BaseViewHolder) obj);
            }
        });
        dialogFragmentHelperM54237f4.m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.applet.c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AppletAddDialogHelper.m15034m(onDismissed, dialogInterface);
            }
        });
        return dialogFragmentHelperM54237f4;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m15040r(@NotNull HomeQuickAccessEntity homeQuickAccessEntity) {
        Intrinsics.checkNotNullParameter(homeQuickAccessEntity, "homeQuickAccessEntity");
        List<QuickAccessEntity> homeList = homeQuickAccessEntity.getHomeList();
        return Intrinsics.areEqual(homeList != null ? Integer.valueOf(homeList.size()) : null, homeQuickAccessEntity.getCanShowMaximum());
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m15037p(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public final QuickAccessEntity m15039q(HomeQuickAccessEntity homeQuickAccessEntity) {
        List<QuickAccessEntity> homeList;
        String str;
        List<QuickAccessEntity> homeList2;
        List<String> clickedIdList = homeQuickAccessEntity.getClickedIdList();
        if ((clickedIdList == null || clickedIdList.isEmpty() || Intrinsics.areEqual(CollectionsKt.last((List) clickedIdList), "0") || (homeList2 = homeQuickAccessEntity.getHomeList()) == null || clickedIdList.size() != homeList2.size()) && (homeList = homeQuickAccessEntity.getHomeList()) != null && !homeList.isEmpty()) {
            List<QuickAccessEntity> homeList3 = homeQuickAccessEntity.getHomeList();
            Intrinsics.checkNotNull(homeList3);
            for (QuickAccessEntity quickAccessEntity : homeList3) {
                if (clickedIdList == null || !CollectionsKt.contains(clickedIdList, quickAccessEntity.getId())) {
                    return quickAccessEntity;
                }
            }
        }
        List<QuickAccessEntity> homeList4 = homeQuickAccessEntity.getHomeList();
        if (homeList4 != null && !homeList4.isEmpty()) {
            List<QuickAccessEntity> homeList5 = homeQuickAccessEntity.getHomeList();
            Intrinsics.checkNotNull(homeList5);
            for (QuickAccessEntity quickAccessEntity2 : homeList5) {
                String id2 = quickAccessEntity2.getId();
                if (clickedIdList != null) {
                    str = (String) CollectionsKt.last((List) clickedIdList);
                } else {
                    str = null;
                }
                if (Intrinsics.areEqual(id2, str)) {
                    return quickAccessEntity2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final void m15041s(boolean z11, ConstraintLayout constraintLayout) {
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fM66565c = C27025c.m66565c(context, 12);
        if (z11) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(fM66565c);
            gradientDrawable.setStroke(1, ContextCompat.getColor(constraintLayout.getContext(), R$color.c_cover12));
            constraintLayout.setBackground(gradientDrawable);
            return;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(fM66565c);
        gradientDrawable2.setColor(ContextCompat.getColor(constraintLayout.getContext(), R$color.brandGreen4));
        constraintLayout.setBackground(gradientDrawable2);
    }
}
