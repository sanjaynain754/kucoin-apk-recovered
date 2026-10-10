package com.kubi.assets.exchange.p075ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.exchange.model.AccountItem;
import com.kubi.assets.exchange.p075ui.dialog.ConvertAccountSelectDialog;
import com.kubi.data.coin.AccountType;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import i10.Menu;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44823n0;
import p754xa.C46109a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: ConvertFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002J\u000e\u0010!\u001a\u00020\u000b*\u0004\u0018\u00010\rH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m90084d2 = {"Lcom/kubi/assets/exchange/ui/ConvertFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetFragmentConvertBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetFragmentConvertBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "currentAccountType", "Lcom/kubi/data/coin/AccountType;", "currentAccountTypeStr", "", "getCurrentAccountTypeStr", "()Ljava/lang/String;", "currentAccountTypeStr$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "showAccountTypeDialog", "switchTo", "type", "jumpConvertHistory", "toAccountType", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConvertFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConvertFragment.kt\ncom/kubi/assets/exchange/ui/ConvertFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n147#2,16:121\n1#3:137\n*S KotlinDebug\n*F\n+ 1 ConvertFragment.kt\ncom/kubi/assets/exchange/ui/ConvertFragment\n*L\n32#1:121,16\n*E\n"})
public final class ConvertFragment extends BaseFragment {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f17253X = {Reflection.property1(new PropertyReference1Impl(ConvertFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetFragmentConvertBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f17254U = C45681e.m100799e(this, new Function1<ConvertFragment, C44823n0>() { // from class: com.kubi.assets.exchange.ui.ConvertFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44823n0 invoke(@NotNull ConvertFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44823n0.m99171a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44823n0, Unit>() { // from class: com.kubi.assets.exchange.ui.ConvertFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44823n0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44823n0 c44823n0) {
            invoke(c44823n0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public AccountType f17255V = AccountType.TRADE;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f17256W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.exchange.ui.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ConvertFragment.m16394n3(this.f17296b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.exchange.ui.ConvertFragment$a */
    /* JADX INFO: compiled from: ConvertFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C9865a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountType.values().length];
            try {
                iArr[AccountType.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountType.TRADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountType.LEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m16397u3(ConvertFragment convertFragment, AccountItem accountItem) {
        AccountType accountType;
        if (accountItem != null && (accountType = accountItem.getAccountType()) != null) {
            convertFragment.m16402v3(accountType);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o3 */
    public final C44823n0 m16398o3() {
        return (C44823n0) this.f17254U.getValue(this, f17253X[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.asset_fragment_convert, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        AccountType accountTypeOfName = AccountType.INSTANCE.ofName(arguments != null ? RouteExKt.m56284y(arguments, "page") : null);
        if (accountTypeOfName == null) {
            accountTypeOfName = AccountType.MAIN;
        }
        this.f17255V = accountTypeOfName;
        String strM16399p3 = m16399p3();
        if (strM16399p3 != null && strM16399p3.length() > 0) {
            getTitleBar().setTitle(getString(R$string.small_asset_exchange));
            this.f17255V = m16403w3(m16399p3());
        }
        m16402v3(this.f17255V);
        getTitleBar().setMenu(new Menu(0, Integer.valueOf(R$drawable.ic2_history_20), Integer.valueOf(R$color.c_text), 0, null, 0, 0, new View.OnClickListener() { // from class: com.kubi.assets.exchange.ui.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConvertFragment.m16395r3(this.f17285b, view2);
            }
        }, 0, 377, null));
        C44823n0 c44823n0M16398o3 = m16398o3();
        if (c44823n0M16398o3 == null || (baseTextView = c44823n0M16398o3.f100476b) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.assets.exchange.ui.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConvertFragment.m16396s3(this.f17287b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: p3 */
    public final String m16399p3() {
        return (String) this.f17256W.getValue();
    }

    /* JADX INFO: renamed from: t3 */
    public final void m16401t3() {
        ConvertAccountSelectDialog convertAccountSelectDialog = new ConvertAccountSelectDialog();
        convertAccountSelectDialog.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("page", this.f17255V.name())));
        convertAccountSelectDialog.m16516m4(new Function1() { // from class: com.kubi.assets.exchange.ui.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConvertFragment.m16397u3(this.f17298b, (AccountItem) obj);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        convertAccountSelectDialog.show(childFragmentManager, ConvertAccountSelectDialog.class.getSimpleName());
    }

    /* JADX INFO: renamed from: v3 */
    public final void m16402v3(AccountType accountType) {
        Fragment mainConvertFragment;
        BaseTextView baseTextView;
        this.f17255V = accountType;
        C44823n0 c44823n0M16398o3 = m16398o3();
        if (c44823n0M16398o3 != null && (baseTextView = c44823n0M16398o3.f100476b) != null) {
            baseTextView.setText(getString(C46109a.m101610a(accountType, IUnifyAccountService.f53155a.get().mo64979C())));
        }
        int i11 = C9865a.$EnumSwitchMapping$0[accountType.ordinal()];
        if (i11 != 1) {
            mainConvertFragment = (i11 == 2 || i11 != 3) ? new TradingConvertFragment() : new MarginConvertFragment();
        } else {
            mainConvertFragment = new MainConvertFragment();
        }
        getChildFragmentManager().beginTransaction().replace(R$id.childFragmentContainer, mainConvertFragment).commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: w3 */
    public final AccountType m16403w3(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1081309778) {
                if (iHashCode != 3343801) {
                    if (iHashCode == 3537154 && str.equals(SearchCategory$Companion.SPOT)) {
                        return AccountType.TRADE;
                    }
                } else if (str.equals("main")) {
                    return AccountType.MAIN;
                }
            } else if (str.equals(ViewProps.MARGIN)) {
                return AccountType.LEVER;
            }
        }
        return AccountType.TRADE;
    }

    /* JADX INFO: renamed from: n3 */
    public static final String m16394n3(ConvertFragment convertFragment) {
        Bundle arguments = convertFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, "accountType");
        }
        return null;
    }

    /* JADX INFO: renamed from: r3 */
    public static final void m16395r3(ConvertFragment convertFragment, View view) {
        convertFragment.m16400q3();
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m16396s3(ConvertFragment convertFragment) {
        convertFragment.m16401t3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q3 */
    public final void m16400q3() {
        Context context = getContext();
        if (context != null) {
            BaseActivity.INSTANCE.launch(context, ConvertHistoryFragment.class, BundleKt.bundleOf(TuplesKt.m90091to("title", getString(R$string.exchange_record)), TuplesKt.m90091to("page", this.f17255V.name())));
        }
    }
}
