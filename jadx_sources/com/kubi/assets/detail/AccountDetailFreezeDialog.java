package com.kubi.assets.detail;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AccountDetailFreezeEntity;
import com.kubi.assets.entity.FreezeData;
import com.kubi.assets.entity.FreezeType;
import com.kubi.assets.entity.ProjectFreeze;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37758j;
import g00.InterfaceC37762n;
import gf.C37885i;
import gf.C37890n;
import java.math.BigDecimal;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44772g3;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: AccountDetailFreezeDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 22\u00020\u0001:\u000223B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J(\u0010!\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#2\u0006\u0010%\u001a\u00020&H\u0002J<\u0010'\u001a\u00020\u001c2\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#2\u0006\u0010%\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u00142\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u0012H\u0002J\u0018\u0010,\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010-\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010.\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0002J$\u0010/\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u00142\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\b\u00100\u001a\u000201H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u00064"}, m90084d2 = {"Lcom/kubi/assets/detail/AccountDetailFreezeDialog;", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/DialogAccountDetailFreezeBinding;", "getBinding", "()Lcom/kubi/assets/databinding/DialogAccountDetailFreezeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", FirebaseAnalytics.Param.CURRENCY, "", "fromType", "getFromType", "()Ljava/lang/String;", "fromType$delegate", "Lkotlin/Lazy;", "isBottomSheet", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initData", "data", "Lcom/kubi/assets/entity/AccountDetailFreezeEntity;", "setFreezeData", "it", "", "Lcom/kubi/assets/entity/FreezeData;", "freezeType", "Lcom/kubi/assets/entity/FreezeType;", "handleRecyclerViewDisplay", "viewDivider", "viewSeeMore", "Landroid/widget/TextView;", "shouldShow", "showRv", "showRv1", "showRv2", "showSeeMore", "getItemLayoutId", "", "Companion", "SimpleClickableSpan", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountDetailFreezeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountDetailFreezeDialog.kt\ncom/kubi/assets/detail/AccountDetailFreezeDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,320:1\n143#2,20:321\n*S KotlinDebug\n*F\n+ 1 AccountDetailFreezeDialog.kt\ncom/kubi/assets/detail/AccountDetailFreezeDialog\n*L\n58#1:321,20\n*E\n"})
public final class AccountDetailFreezeDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public String f16852a0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f16850d0 = {Reflection.property1(new PropertyReference1Impl(AccountDetailFreezeDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/DialogAccountDetailFreezeBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f16849c0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f16851Z = C45681e.m100799e(this, new Function1<AccountDetailFreezeDialog, C44772g3>() { // from class: com.kubi.assets.detail.AccountDetailFreezeDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44772g3 invoke(@NotNull AccountDetailFreezeDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44772g3.m99060a(fragment.requireView());
        }
    }, new Function1<C44772g3, Unit>() { // from class: com.kubi.assets.detail.AccountDetailFreezeDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44772g3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44772g3 c44772g3) {
            invoke(c44772g3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f16853b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.detail.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AccountDetailFreezeDialog.m15850y3(this.f16890b);
        }
    });

    /* JADX INFO: compiled from: AccountDetailFreezeDialog.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/assets/detail/AccountDetailFreezeDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/detail/AccountDetailFreezeDialog;", "fromType", "", FirebaseAnalytics.Param.CURRENCY, "initData", "Lcom/kubi/assets/entity/AccountDetailFreezeEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AccountDetailFreezeDialog newInstance(@NotNull String fromType, @Nullable String currency, @NotNull AccountDetailFreezeEntity initData) {
            Intrinsics.checkNotNullParameter(fromType, "fromType");
            Intrinsics.checkNotNullParameter(initData, "initData");
            AccountDetailFreezeDialog accountDetailFreezeDialog = new AccountDetailFreezeDialog();
            accountDetailFreezeDialog.setArguments(new C27051h().m66724h("fromType", fromType).m66724h(FirebaseAnalytics.Param.CURRENCY, currency).m66721e("initParams", initData).m66717a());
            return accountDetailFreezeDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.detail.AccountDetailFreezeDialog$a */
    /* JADX INFO: compiled from: AccountDetailFreezeDialog.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/assets/detail/AccountDetailFreezeDialog$SimpleClickableSpan;", "Landroid/text/style/ClickableSpan;", "url", "", "<init>", "(Ljava/lang/String;)V", "launchH5", "", "onClick", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9671a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        @NotNull
        public final String f16854b;

        public C9671a(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f16854b = url;
        }

        /* JADX INFO: renamed from: a */
        public final void m15860a(String str) {
            if (Intrinsics.areEqual(str, "otc/orderList")) {
                InterfaceC37758j.a.m85165n(C37304a.f82764a, 1L, null, null, null, null, 30, null);
            } else {
                InterfaceC37758j.a.m85163l(C37304a.f82764a, 0L, null, null, null, null, null, null, 126, null);
            }
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            m15860a(this.f16854b);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            ds2.setColor(C27017c.f54310a.m66512a(R$color.brandGreen));
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.detail.AccountDetailFreezeDialog$c */
    /* JADX INFO: compiled from: AccountDetailFreezeDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/assets/detail/AccountDetailFreezeDialog$initData$1$2", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAccountDetailFreezeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountDetailFreezeDialog.kt\ncom/kubi/assets/detail/AccountDetailFreezeDialog$initData$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,320:1\n1#2:321\n*E\n"})
    public static final class C9673c extends ClickableSpan {
        public C9673c() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            AssetsHelper.f18684a.m19154H(AccountDetailFreezeDialog.this.getActivity());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            Context context = AccountDetailFreezeDialog.this.getContext();
            if (context != null) {
                ds2.setColor(ContextCompat.getColor(context, R$color.brandGreen));
            }
        }
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: com.kubi.assets.detail.AccountDetailFreezeDialog$b */
    /* JADX INFO: compiled from: AccountDetailFreezeDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C9672b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FreezeType.values().length];
            try {
                iArr[FreezeType.WITHDRAW_FREEZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FreezeType.TRADE_FREEZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FreezeType.P2P_FREEZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FreezeType.GREY_MARKET_FREEZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FreezeType.GEM_POOL_FREEZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: A3 */
    private final String m15844A3() {
        return (String) this.f16853b0.getValue();
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m15846K3(FreezeType freezeType, AccountDetailFreezeDialog accountDetailFreezeDialog) {
        int i11 = C9672b.$EnumSwitchMapping$0[freezeType.ordinal()];
        if (i11 == 1) {
            C37304a c37304a = C37304a.f82764a;
            C37890n c37890n = C37890n.f85269a;
            String str = accountDetailFreezeDialog.f16852a0;
            if (str == null) {
                str = "";
            }
            CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(str);
            String code = coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null;
            InterfaceC37749a.a.m85114i(c37304a, code == null ? "" : code, 1L, null, null, null, 28, null);
        } else if (i11 == 2) {
            InterfaceC37762n.a.m85178b(C37304a.f82764a, null, null, null, null, null, null, 63, null);
        } else if (i11 == 4) {
            Router.f46192a.m56184f(AssetExKt.m15122j("/pre-market/myOrder?appNeedLang=true")).m4048k();
        } else if (i11 == 5) {
            Router.f46192a.m56184f(AssetExKt.m15122j("/gempool?appNeedLang=true")).m4048k();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public final void m15852C3(List<FreezeData> list, FreezeType freezeType, View view, TextView textView, boolean z11) {
        if (z11) {
            if (!list.isEmpty()) {
                FreezeData freezeData = list.get(list.size() - 1);
                if (freezeData != null) {
                    freezeData.setHideLine(true);
                }
            } else if (view != null) {
                ViewExtKt.m66594y(view);
            }
            m15858J3(freezeType, view, textView);
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final void m15854F3(AccountDetailFreezeEntity accountDetailFreezeEntity, List<FreezeData> list, FreezeType freezeType) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        RecyclerView recyclerView5;
        RecyclerView recyclerView6;
        int i11 = C9672b.$EnumSwitchMapping$0[freezeType.ordinal()];
        if (i11 == 1 || i11 == 2) {
            BaseTextView baseTextView = null;
            AccountDetailFreezeAdapter accountDetailFreezeAdapter = new AccountDetailFreezeAdapter(m15851B3(), this.f16852a0, freezeType);
            boolean zM15855G3 = m15855G3(accountDetailFreezeEntity, freezeType);
            C44772g3 c44772g3M15859z3 = m15859z3();
            View view = c44772g3M15859z3 != null ? c44772g3M15859z3.f99987r : null;
            C44772g3 c44772g3M15859z4 = m15859z3();
            if (c44772g3M15859z4 != null) {
                baseTextView = c44772g3M15859z4.f99978i;
            }
            m15852C3(list, freezeType, view, baseTextView, zM15855G3);
            C44772g3 c44772g3M15859z5 = m15859z3();
            if (c44772g3M15859z5 != null && (recyclerView2 = c44772g3M15859z5.f99972c) != null) {
                ViewExtKt.m66594y(recyclerView2);
            }
            C44772g3 c44772g3M15859z6 = m15859z3();
            if (c44772g3M15859z6 != null && (recyclerView = c44772g3M15859z6.f99972c) != null) {
                recyclerView.setAdapter(accountDetailFreezeAdapter);
            }
            accountDetailFreezeAdapter.setNewData(list);
            return;
        }
        if (i11 == 3 || i11 == 4) {
            BaseTextView baseTextView2 = null;
            AccountDetailFreezeAdapter accountDetailFreezeAdapter2 = new AccountDetailFreezeAdapter(m15851B3(), this.f16852a0, freezeType);
            boolean zM15856H3 = m15856H3(accountDetailFreezeEntity, freezeType);
            C44772g3 c44772g3M15859z7 = m15859z3();
            View view2 = c44772g3M15859z7 != null ? c44772g3M15859z7.f99988s : null;
            C44772g3 c44772g3M15859z8 = m15859z3();
            if (c44772g3M15859z8 != null) {
                baseTextView2 = c44772g3M15859z8.f99979j;
            }
            m15852C3(list, freezeType, view2, baseTextView2, zM15856H3);
            C44772g3 c44772g3M15859z9 = m15859z3();
            if (c44772g3M15859z9 != null && (recyclerView4 = c44772g3M15859z9.f99973d) != null) {
                ViewExtKt.m66594y(recyclerView4);
            }
            C44772g3 c44772g3M15859z10 = m15859z3();
            if (c44772g3M15859z10 != null && (recyclerView3 = c44772g3M15859z10.f99973d) != null) {
                recyclerView3.setAdapter(accountDetailFreezeAdapter2);
            }
            accountDetailFreezeAdapter2.setNewData(list);
            return;
        }
        AccountDetailFreezeAdapter accountDetailFreezeAdapter3 = new AccountDetailFreezeAdapter(m15851B3(), this.f16852a0, freezeType);
        BaseTextView baseTextView3 = null;
        boolean zM15857I3 = m15857I3(accountDetailFreezeEntity, freezeType);
        C44772g3 c44772g3M15859z11 = m15859z3();
        View view3 = c44772g3M15859z11 != null ? c44772g3M15859z11.f99989t : null;
        C44772g3 c44772g3M15859z12 = m15859z3();
        if (c44772g3M15859z12 != null) {
            baseTextView3 = c44772g3M15859z12.f99980k;
        }
        m15852C3(list, freezeType, view3, baseTextView3, zM15857I3);
        C44772g3 c44772g3M15859z13 = m15859z3();
        if (c44772g3M15859z13 != null && (recyclerView6 = c44772g3M15859z13.f99974e) != null) {
            ViewExtKt.m66594y(recyclerView6);
        }
        C44772g3 c44772g3M15859z14 = m15859z3();
        if (c44772g3M15859z14 != null && (recyclerView5 = c44772g3M15859z14.f99974e) != null) {
            recyclerView5.setAdapter(accountDetailFreezeAdapter3);
        }
        accountDetailFreezeAdapter3.setNewData(list);
    }

    /* JADX INFO: renamed from: J3 */
    public final void m15858J3(final FreezeType freezeType, View view, TextView textView) {
        TextView textView2;
        if (textView != null) {
            AssetExKt.m15138z(textView, C24129b.m58030b(SiteVisibleConfigKey.P2P));
        }
        if (view != null) {
            ViewExtKt.m66594y(view);
        }
        if (freezeType != FreezeType.P2P_FREEZE) {
            if (textView != null) {
                C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.assets.detail.d
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountDetailFreezeDialog.m15846K3(freezeType, this);
                    }
                }, 1, null);
                return;
            }
            return;
        }
        if (textView != null) {
            textView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text40));
        }
        if (textView != null) {
            textView2 = textView;
            C27046k.m66694i(textView2, 0, 0, 0, 6, null);
        } else {
            textView2 = textView;
        }
        if (textView2 != null) {
            textView2.setText(getString(R$string.kc_asset_freeze_p2p));
        }
        if (textView2 != null) {
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (textView2 != null) {
            HighlightTextHelper.f43497a.m54120f(textView2, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new C9671a("otc/orderList")), new Pair(HighlightTextHelper.TextTagEnum.SPAN1, new C9671a("otc")));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.dialog_account_detail_freeze, container);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcSecondaryButton kcSecondaryButton;
        FrameLayout frameLayout;
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (frameLayout = (FrameLayout) dialog2.findViewById(R$id.design_bottom_sheet)) != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
            bottomSheetBehaviorFrom.setPeekHeight(C5267e0.m6182d());
        }
        C44772g3 c44772g3M15859z3 = m15859z3();
        if (c44772g3M15859z3 != null && (kcSecondaryButton = c44772g3M15859z3.f99977h) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.assets.detail.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountDetailFreezeDialog.m15845E3(this.f16891b);
                }
            }, 1, null);
        }
        Bundle arguments = getArguments();
        this.f16852a0 = arguments != null ? RouteExKt.m56284y(arguments, FirebaseAnalytics.Param.CURRENCY) : null;
        Bundle arguments2 = getArguments();
        m15853D3(arguments2 != null ? (AccountDetailFreezeEntity) RouteExKt.m56274t(arguments2, "initParams") : null);
    }

    /* JADX INFO: renamed from: z3 */
    public final C44772g3 m15859z3() {
        return (C44772g3) this.f16851Z.getValue(this, f16850d0[0]);
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m15845E3(AccountDetailFreezeDialog accountDetailFreezeDialog) {
        accountDetailFreezeDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static final String m15850y3(AccountDetailFreezeDialog accountDetailFreezeDialog) {
        Bundle arguments = accountDetailFreezeDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("fromType");
        }
        return null;
    }

    /* JADX INFO: renamed from: B3 */
    public final int m15851B3() {
        if (Intrinsics.areEqual(m15844A3(), "MAIN")) {
            return R$layout.asset_item_withdraw_freeze;
        }
        return R$layout.asset_item_spot_freeze;
    }

    /* JADX INFO: renamed from: D3 */
    public final void m15853D3(AccountDetailFreezeEntity accountDetailFreezeEntity) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        List<FreezeData> gemPoolList;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        List<FreezeData> greyMarketFreeze;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        List<FreezeData> tradeFreeze;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        ConstraintLayout constraintLayout;
        BaseTextView baseTextView7;
        ProjectFreeze projectFreeze;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        ConstraintLayout constraintLayout2;
        BaseTextView baseTextView11;
        List<FreezeData> p2pFreeze;
        BaseTextView baseTextView12;
        BaseTextView baseTextView13;
        List<FreezeData> withdrawFreeze;
        BaseTextView baseTextView14;
        String strM15844A3 = m15844A3();
        if (Intrinsics.areEqual(strM15844A3, "MAIN")) {
            C44772g3 c44772g3M15859z3 = m15859z3();
            if (c44772g3M15859z3 != null && (baseTextView14 = c44772g3M15859z3.f99983n) != null) {
                baseTextView14.setText(getString(R$string.asset_withdraw_order));
            }
            if (accountDetailFreezeEntity != null && (withdrawFreeze = accountDetailFreezeEntity.getWithdrawFreeze()) != null && (!withdrawFreeze.isEmpty())) {
                m15854F3(accountDetailFreezeEntity, accountDetailFreezeEntity.getWithdrawFreeze(), FreezeType.WITHDRAW_FREEZE);
            }
            if (accountDetailFreezeEntity != null && (p2pFreeze = accountDetailFreezeEntity.getP2pFreeze()) != null && (!p2pFreeze.isEmpty())) {
                C44772g3 c44772g3M15859z4 = m15859z3();
                if (c44772g3M15859z4 != null && (baseTextView13 = c44772g3M15859z4.f99985p) != null) {
                    ViewExtKt.m66594y(baseTextView13);
                }
                C44772g3 c44772g3M15859z5 = m15859z3();
                if (c44772g3M15859z5 != null && (baseTextView12 = c44772g3M15859z5.f99985p) != null) {
                    baseTextView12.setText(getString(R$string.otc));
                }
                m15854F3(accountDetailFreezeEntity, accountDetailFreezeEntity.getP2pFreeze(), FreezeType.P2P_FREEZE);
            }
        } else if (Intrinsics.areEqual(strM15844A3, "TRADE")) {
            C44772g3 c44772g3M15859z6 = m15859z3();
            if (c44772g3M15859z6 != null && (baseTextView5 = c44772g3M15859z6.f99983n) != null) {
                baseTextView5.setText(getString(R$string.asset_entrust_order));
            }
            if (accountDetailFreezeEntity != null && (tradeFreeze = accountDetailFreezeEntity.getTradeFreeze()) != null && (!tradeFreeze.isEmpty())) {
                m15854F3(accountDetailFreezeEntity, accountDetailFreezeEntity.getTradeFreeze(), FreezeType.TRADE_FREEZE);
            }
            if (accountDetailFreezeEntity != null && (greyMarketFreeze = accountDetailFreezeEntity.getGreyMarketFreeze()) != null && (!greyMarketFreeze.isEmpty())) {
                C44772g3 c44772g3M15859z7 = m15859z3();
                if (c44772g3M15859z7 != null && (baseTextView4 = c44772g3M15859z7.f99985p) != null) {
                    ViewExtKt.m66594y(baseTextView4);
                }
                C44772g3 c44772g3M15859z8 = m15859z3();
                if (c44772g3M15859z8 != null && (baseTextView3 = c44772g3M15859z8.f99985p) != null) {
                    baseTextView3.setText(getString(R$string.kc_asset_freeze_premarket_title));
                }
                m15854F3(accountDetailFreezeEntity, accountDetailFreezeEntity.getGreyMarketFreeze(), FreezeType.GREY_MARKET_FREEZE);
            }
            if (accountDetailFreezeEntity != null && (gemPoolList = accountDetailFreezeEntity.getGemPoolList()) != null && (!gemPoolList.isEmpty())) {
                C44772g3 c44772g3M15859z9 = m15859z3();
                if (c44772g3M15859z9 != null && (baseTextView2 = c44772g3M15859z9.f99986q) != null) {
                    ViewExtKt.m66594y(baseTextView2);
                }
                C44772g3 c44772g3M15859z10 = m15859z3();
                if (c44772g3M15859z10 != null && (baseTextView = c44772g3M15859z10.f99986q) != null) {
                    baseTextView.setText(getString(R$string.kc_gempool_title));
                }
                m15854F3(accountDetailFreezeEntity, accountDetailFreezeEntity.getGemPoolList(), FreezeType.GEM_POOL_FREEZE);
            }
        } else {
            C44772g3 c44772g3M15859z11 = m15859z3();
            if (c44772g3M15859z11 != null && (recyclerView3 = c44772g3M15859z11.f99972c) != null) {
                ViewExtKt.m66577h(recyclerView3);
            }
            C44772g3 c44772g3M15859z12 = m15859z3();
            if (c44772g3M15859z12 != null && (recyclerView2 = c44772g3M15859z12.f99973d) != null) {
                ViewExtKt.m66577h(recyclerView2);
            }
            C44772g3 c44772g3M15859z13 = m15859z3();
            if (c44772g3M15859z13 != null && (recyclerView = c44772g3M15859z13.f99974e) != null) {
                ViewExtKt.m66577h(recyclerView);
            }
        }
        if (accountDetailFreezeEntity != null && (projectFreeze = accountDetailFreezeEntity.getProjectFreeze()) != null) {
            C44772g3 c44772g3M15859z14 = m15859z3();
            if (c44772g3M15859z14 != null && (baseTextView11 = c44772g3M15859z14.f99984o) != null) {
                ViewExtKt.m66594y(baseTextView11);
            }
            C44772g3 c44772g3M15859z15 = m15859z3();
            if (c44772g3M15859z15 != null && (constraintLayout2 = c44772g3M15859z15.f99971b) != null) {
                ViewExtKt.m66594y(constraintLayout2);
            }
            C44772g3 c44772g3M15859z16 = m15859z3();
            if (c44772g3M15859z16 != null && (baseTextView10 = c44772g3M15859z16.f99982m) != null) {
                ViewExtKt.m66594y(baseTextView10);
                baseTextView10.setMovementMethod(LinkMovementMethod.getInstance());
                baseTextView10.setHighlightColor(0);
                HighlightTextHelper.f43497a.m54116a(baseTextView10, HighlightTextHelper.TextTagEnum.SPAN, new C9673c());
            }
            C44772g3 c44772g3M15859z17 = m15859z3();
            if (c44772g3M15859z17 != null && (baseTextView9 = c44772g3M15859z17.f99981l) != null) {
                baseTextView9.setText(AssetExKt.m15121i(projectFreeze.getOperateTime()));
            }
            String str = this.f16852a0;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            C44772g3 c44772g3M15859z18 = m15859z3();
            if (c44772g3M15859z18 != null && (baseTextView8 = c44772g3M15859z18.f99976g) != null) {
                BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(projectFreeze.getAmount());
                String strM85563b = null;
                if (bigDecimalM66536f != null) {
                    strM85563b = C37885i.m85563b(bigDecimalM66536f, str2, 0, 2, null);
                }
                baseTextView8.setText(C42828b.m93906g(strM85563b, str2, true, false, 4, null));
                return;
            }
            return;
        }
        C44772g3 c44772g3M15859z19 = m15859z3();
        if (c44772g3M15859z19 != null && (baseTextView7 = c44772g3M15859z19.f99984o) != null) {
            ViewExtKt.m66577h(baseTextView7);
        }
        C44772g3 c44772g3M15859z20 = m15859z3();
        if (c44772g3M15859z20 != null && (constraintLayout = c44772g3M15859z20.f99971b) != null) {
            ViewExtKt.m66577h(constraintLayout);
        }
        C44772g3 c44772g3M15859z21 = m15859z3();
        if (c44772g3M15859z21 != null && (baseTextView6 = c44772g3M15859z21.f99982m) != null) {
            ViewExtKt.m66577h(baseTextView6);
        }
    }

    /* JADX INFO: renamed from: G3 */
    public final boolean m15855G3(AccountDetailFreezeEntity accountDetailFreezeEntity, FreezeType freezeType) {
        Boolean hasMoreWithdrawOrder = accountDetailFreezeEntity.getHasMoreWithdrawOrder();
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.areEqual(hasMoreWithdrawOrder, bool) || freezeType != FreezeType.WITHDRAW_FREEZE) {
            if (Intrinsics.areEqual(accountDetailFreezeEntity.getHasMoreTradeOrder(), bool) && freezeType == FreezeType.TRADE_FREEZE) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: H3 */
    public final boolean m15856H3(AccountDetailFreezeEntity accountDetailFreezeEntity, FreezeType freezeType) {
        Boolean hasMoreP2pOrder = accountDetailFreezeEntity.getHasMoreP2pOrder();
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.areEqual(hasMoreP2pOrder, bool) || freezeType != FreezeType.P2P_FREEZE) {
            if (Intrinsics.areEqual(accountDetailFreezeEntity.getHasMoreGreyMarketOrder(), bool) && freezeType == FreezeType.GREY_MARKET_FREEZE) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: I3 */
    public final boolean m15857I3(AccountDetailFreezeEntity accountDetailFreezeEntity, FreezeType freezeType) {
        if (Intrinsics.areEqual(accountDetailFreezeEntity.getHasMoreGemPool(), Boolean.TRUE) && freezeType == FreezeType.GEM_POOL_FREEZE) {
            return true;
        }
        return false;
    }
}
