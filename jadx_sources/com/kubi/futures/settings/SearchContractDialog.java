package com.kubi.futures.settings;

import android.app.Dialog;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.C4634g;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5303w0;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36877z0;
import fm.C37567b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: SearchContractDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 62\u00020\u0001:\u000267B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010)\u001a\u00020'H\u0002J\u0010\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020\u000bH\u0002J\u001e\u0010,\u001a\u00020'2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00172\u0006\u0010/\u001a\u000200H\u0002J\u0012\u00101\u001a\u00020'2\b\u00102\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020'H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR)\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u000b0\u000b0\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001a¨\u00068"}, m90084d2 = {"Lcom/kubi/futures/settings/SearchContractDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogSearchContractBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogSearchContractBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "currentSymbol", "", "getCurrentSymbol", "()Ljava/lang/String;", "currentSymbol$delegate", "Lkotlin/Lazy;", "trialContractList", "Ljava/util/ArrayList;", "kotlin.jvm.PlatformType", "getTrialContractList", "()Ljava/util/ArrayList;", "trialContractList$delegate", "contractList", "", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContractList", "()Ljava/util/List;", "contractList$delegate", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "handleSearch", "text", "setContractAdapter", "list", "Lcom/kubi/futures/settings/SearchContractDialog$ContractAdapter$ContractIndex;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dismiss", "symbol", "isBottomSheet", "", "onStart", "Companion", "ContractAdapter", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchContractDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchContractDialog.kt\ncom/kubi/futures/settings/SearchContractDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n143#2,20:262\n65#3,16:282\n93#3,3:298\n774#4:301\n865#4,2:302\n1869#4,2:304\n1869#4:306\n1870#4:308\n1#5:307\n*S KotlinDebug\n*F\n+ 1 SearchContractDialog.kt\ncom/kubi/futures/settings/SearchContractDialog\n*L\n54#1:262,20\n100#1:282,16\n100#1:298,3\n128#1:301\n128#1:302,2\n130#1:304,2\n71#1:306\n71#1:308\n*E\n"})
public final class SearchContractDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f23192q0 = C45681e.m100799e(this, new Function1<SearchContractDialog, C36877z0>() { // from class: com.kubi.futures.settings.SearchContractDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36877z0 invoke(@NotNull SearchContractDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36877z0.m82622a(fragment.requireView());
        }
    }, new Function1<C36877z0, Unit>() { // from class: com.kubi.futures.settings.SearchContractDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36877z0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36877z0 c36877z0) {
            invoke(c36877z0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f23193r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.j2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchContractDialog.m25912r4(this.f23365b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f23194s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.k2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchContractDialog.m25903C4(this.f23374b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f23195t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.l2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchContractDialog.m25911q4(this.f23383b);
        }
    });

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f23191v0 = {Reflection.property1(new PropertyReference1Impl(SearchContractDialog.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogSearchContractBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f23190u0 = new Companion(null);

    /* JADX INFO: compiled from: SearchContractDialog.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\tj\b\u0012\u0004\u0012\u00020\u0007`\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/futures/settings/SearchContractDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/futures/settings/SearchContractDialog;", "symbol", "", "trialContractList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final SearchContractDialog newInstance(@NotNull String symbol, @NotNull ArrayList<String> trialContractList) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(trialContractList, "trialContractList");
            SearchContractDialog searchContractDialog = new SearchContractDialog();
            searchContractDialog.setArguments(BundleKt.bundleOf(new Pair("symbol", symbol), new Pair("data", trialContractList)));
            return searchContractDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.SearchContractDialog$a */
    /* JADX INFO: compiled from: SearchContractDialog.kt */
    @Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002'(B\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0019\u001a\u00020\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bJ\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00022\u0006\u0010$\u001a\u00020 H\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0017j\b\u0012\u0004\u0012\u00020\u0005`\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/futures/settings/SearchContractDialog$ContractAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/futures/settings/SearchContractDialog$ContractAdapter$ContractViewHolder;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/kubi/futures/settings/SearchContractDialog$ContractAdapter$ContractIndex;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "selectDrawable", "Landroid/graphics/drawable/Drawable;", "getSelectDrawable", "()Landroid/graphics/drawable/Drawable;", "selectDrawable$delegate", "Lkotlin/Lazy;", "font", "Landroid/graphics/Typeface;", "getFont", "()Landroid/graphics/Typeface;", "font$delegate", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setDatas", "datas", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "getItemId", "", ViewProps.POSITION, "onBindViewHolder", C33954u6.f72238i, "ContractViewHolder", "ContractIndex", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13263a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: i */
        @NotNull
        public final Function1<ContractIndex, Unit> f23196i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final Lazy f23197j;

        /* JADX INFO: renamed from: k */
        @NotNull
        public final Lazy f23198k;

        /* JADX INFO: renamed from: l */
        @NotNull
        public final ArrayList<ContractIndex> f23199l;

        /* JADX INFO: renamed from: com.kubi.futures.settings.SearchContractDialog$a$a, reason: from toString */
        /* JADX INFO: compiled from: SearchContractDialog.kt */
        @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/futures/settings/SearchContractDialog$ContractAdapter$ContractIndex;", "", "symbol", "", "name", "checked", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getSymbol", "()Ljava/lang/String;", "getName", "getChecked", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class ContractIndex {

            /* JADX INFO: renamed from: a, reason: from toString */
            @NotNull
            public final String symbol;

            /* JADX INFO: renamed from: b, reason: from toString */
            @NotNull
            public final String name;

            /* JADX INFO: renamed from: c, reason: from toString */
            public final boolean checked;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ContractIndex)) {
                    return false;
                }
                ContractIndex contractIndex = (ContractIndex) other;
                return Intrinsics.areEqual(this.symbol, contractIndex.symbol) && Intrinsics.areEqual(this.name, contractIndex.name) && this.checked == contractIndex.checked;
            }

            public ContractIndex(@NotNull String symbol, @NotNull String name, boolean z11) {
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                Intrinsics.checkNotNullParameter(name, "name");
                this.symbol = symbol;
                this.name = name;
                this.checked = z11;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getChecked() {
                return this.checked;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getSymbol() {
                return this.symbol;
            }

            public int hashCode() {
                return (((this.symbol.hashCode() * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.checked);
            }

            @NotNull
            public String toString() {
                return "ContractIndex(symbol=" + this.symbol + ", name=" + this.name + ", checked=" + this.checked + ')';
            }
        }

        /* JADX INFO: renamed from: com.kubi.futures.settings.SearchContractDialog$a$b */
        /* JADX INFO: compiled from: SearchContractDialog.kt */
        @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/settings/SearchContractDialog$ContractAdapter$ContractViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class b extends RecyclerView.ViewHolder {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "view");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int position) {
            return position;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C13263a(@NotNull Function1<? super ContractIndex, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f23196i = callback;
            setHasStableIds(true);
            this.f23197j = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.p2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchContractDialog.C13263a.m25928p();
                }
            });
            this.f23198k = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.q2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchContractDialog.C13263a.m25925j();
                }
            });
            this.f23199l = new ArrayList<>();
        }

        /* JADX INFO: renamed from: j */
        public static final Typeface m25925j() {
            return ResourcesCompat.getFont(C27017c.f54310a.m66513b(), R$font.medium);
        }

        /* JADX INFO: renamed from: k */
        private final Typeface m25926k() {
            return (Typeface) this.f23198k.getValue();
        }

        /* JADX INFO: renamed from: p */
        public static final Drawable m25928p() {
            Drawable drawableM66514c = C27017c.f54310a.m66514c(R$drawable.ic2_hook_20, Integer.valueOf(R$color.c_text));
            drawableM66514c.setBounds(0, 0, drawableM66514c.getMinimumWidth(), drawableM66514c.getMinimumHeight());
            return drawableM66514c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f23199l.size();
        }

        /* JADX INFO: renamed from: l */
        public final Drawable m25929l() {
            return (Drawable) this.f23197j.getValue();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull b holder, int i11) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            ContractIndex contractIndex = this.f23199l.get(i11);
            Intrinsics.checkNotNullExpressionValue(contractIndex, "get(...)");
            ContractIndex contractIndex2 = contractIndex;
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
            AppCompatTextView appCompatTextView = (AppCompatTextView) view;
            appCompatTextView.setText(contractIndex2.getName());
            if (contractIndex2.getChecked()) {
                appCompatTextView.setCompoundDrawablesRelative(null, null, m25929l(), null);
            } else {
                appCompatTextView.setCompoundDrawablesRelative(null, null, null, null);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            AppCompatTextView appCompatTextView = new AppCompatTextView(parent.getContext());
            appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, C27029c.m66601d(appCompatTextView, 48)));
            appCompatTextView.setTextSize(16.0f);
            appCompatTextView.setTypeface(m25926k());
            int i12 = GravityCompat.START;
            appCompatTextView.setGravity(GravityCompat.START);
            appCompatTextView.setTextAlignment(5);
            appCompatTextView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
            if (C5303w0.m6511a()) {
                i12 = GravityCompat.END;
            }
            appCompatTextView.setGravity(i12 | 16);
            final b bVar = new b(appCompatTextView);
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.futures.settings.o2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchContractDialog.C13263a.m25927o(bVar, this, view);
                }
            });
            return bVar;
        }

        /* JADX INFO: renamed from: q */
        public final void m25932q(@NotNull List<ContractIndex> datas) {
            Intrinsics.checkNotNullParameter(datas, "datas");
            this.f23199l.clear();
            this.f23199l.addAll(datas);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: o */
        public static final void m25927o(b bVar, C13263a c13263a, View view) {
            int bindingAdapterPosition = bVar.getBindingAdapterPosition();
            if (bindingAdapterPosition >= 0 && bindingAdapterPosition < c13263a.f23199l.size()) {
                Function1<ContractIndex, Unit> function1 = c13263a.f23196i;
                ContractIndex contractIndex = c13263a.f23199l.get(bindingAdapterPosition);
                Intrinsics.checkNotNullExpressionValue(contractIndex, "get(...)");
                function1.invoke(contractIndex);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.SearchContractDialog$b */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 SearchContractDialog.kt\ncom/kubi/futures/settings/SearchContractDialog\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n101#2,2:98\n71#3:100\n77#4:101\n*E\n"})
    public static final class C13264b implements TextWatcher {
        public C13264b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            SearchContractDialog.this.m25921x4(C27041f.m66668h(s11 != null ? s11.toString() : null));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m25902B4(SearchContractDialog searchContractDialog, C13263a.ContractIndex it) {
        Intrinsics.checkNotNullParameter(it, "it");
        searchContractDialog.m25916s4(it.getSymbol());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q4 */
    public static final List m25911q4(SearchContractDialog searchContractDialog) {
        Object next;
        List<ContractEntity> listMo25016k = RepositoryServiceLocator.f19236a.m20288g().mo25016k();
        if (searchContractDialog.m25920w4().isEmpty()) {
            return listMo25016k;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : searchContractDialog.m25920w4()) {
            Iterator<T> it = listMo25016k.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((ContractEntity) next).getSymbol(), str));
            ContractEntity contractEntity = (ContractEntity) next;
            if (contractEntity != null) {
                arrayList.add(contractEntity);
            }
        }
        return arrayList;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 10;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m54235d4(0.8f);
        return inflater.inflate(R$layout.bkumex_dialog_search_contract, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewExtKt.m66578i(view, (int) (C5267e0.m6179a() * getF43576g0()));
        initView();
        m25921x4("");
    }

    /* JADX INFO: renamed from: s4 */
    public final void m25916s4(String str) {
        String name = SearchContractDialog.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        FragmentKt.setFragmentResult(this, name, BundleKt.bundleOf(new Pair("symbol", str)));
        dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: t4 */
    public final C36877z0 m25917t4() {
        return (C36877z0) this.f23192q0.getValue(this, f23191v0[0]);
    }

    /* JADX INFO: renamed from: u4 */
    public final List<ContractEntity> m25918u4() {
        return (List) this.f23195t0.getValue();
    }

    /* JADX INFO: renamed from: v4 */
    public final String m25919v4() {
        return (String) this.f23193r0.getValue();
    }

    /* JADX INFO: renamed from: w4 */
    public final ArrayList<String> m25920w4() {
        return (ArrayList) this.f23194s0.getValue();
    }

    /* JADX INFO: renamed from: C4 */
    public static final ArrayList m25903C4(SearchContractDialog searchContractDialog) {
        ArrayList<String> stringArrayList;
        Bundle arguments = searchContractDialog.getArguments();
        if (arguments != null && (stringArrayList = arguments.getStringArrayList("data")) != null) {
            return stringArrayList;
        }
        return new ArrayList();
    }

    private final void initView() {
        final C36877z0 c36877z0M25917t4 = m25917t4();
        if (c36877z0M25917t4 == null) {
            return;
        }
        ClearEditText edit = c36877z0M25917t4.f81399b;
        Intrinsics.checkNotNullExpressionValue(edit, "edit");
        edit.addTextChangedListener(new C13264b());
        final Ref.IntRef intRef = new Ref.IntRef();
        int size = m25918u4().size();
        for (int i11 = 0; i11 < size && !Intrinsics.areEqual(m25918u4().get(i11).getSymbol(), m25919v4()); i11++) {
            intRef.element++;
        }
        KcSecondaryButton tvConfirm = c36877z0M25917t4.f81402e;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.futures.settings.m2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchContractDialog.m25913y4(this.f23391b);
            }
        }, 1, null);
        c36877z0M25917t4.f81401d.post(new Runnable() { // from class: com.kubi.futures.settings.n2
            @Override // java.lang.Runnable
            public final void run() {
                SearchContractDialog.m25914z4(this.f23400b, c36877z0M25917t4, intRef);
            }
        });
    }

    /* JADX INFO: renamed from: r4 */
    public static final String m25912r4(SearchContractDialog searchContractDialog) {
        String string;
        Bundle arguments = searchContractDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("symbol");
        } else {
            string = null;
        }
        return C27041f.m66669i(string, C4634g.m4564a());
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m25913y4(SearchContractDialog searchContractDialog) {
        searchContractDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final void m25914z4(SearchContractDialog searchContractDialog, C36877z0 c36877z0, Ref.IntRef intRef) {
        if (searchContractDialog.isVisible()) {
            c36877z0.f81401d.scrollToPosition(intRef.element);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final void m25915A4(List<C13263a.ContractIndex> list, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            adapter = new C13263a(new Function1() { // from class: com.kubi.futures.settings.i2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchContractDialog.m25902B4(this.f23357b, (SearchContractDialog.C13263a.ContractIndex) obj);
                }
            });
            recyclerView.setAdapter(adapter);
        }
        ((C13263a) adapter).m25932q(list);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        BottomSheetDialog bottomSheetDialog;
        BottomSheetBehavior<FrameLayout> behavior;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog instanceof BottomSheetDialog) {
            bottomSheetDialog = (BottomSheetDialog) dialog;
        } else {
            bottomSheetDialog = null;
        }
        if (bottomSheetDialog != null && (behavior = bottomSheetDialog.getBehavior()) != null) {
            behavior.setMaxHeight((int) (C5267e0.m6182d() * getF43576g0()));
            behavior.setPeekHeight((int) (C5267e0.m6182d() * getF43576g0()));
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final void m25921x4(String str) {
        C36877z0 c36877z0M25917t4 = m25917t4();
        if (c36877z0M25917t4 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<ContractEntity> listM25918u4 = m25918u4();
        ArrayList<ContractEntity> arrayList2 = new ArrayList();
        for (Object obj : listM25918u4) {
            if (C37567b.m84628r((ContractEntity) obj, str)) {
                arrayList2.add(obj);
            }
        }
        for (ContractEntity contractEntity : arrayList2) {
            String strM66668h = C27041f.m66668h(contractEntity.getSymbol());
            String string = FuturesDisplayNameUtils.m24435g(FuturesDisplayNameUtils.f22525a, contractEntity, false, 1, null).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList.add(new C13263a.ContractIndex(strM66668h, string, Intrinsics.areEqual(contractEntity.getSymbol(), m25919v4())));
        }
        if (arrayList.isEmpty()) {
            RecyclerView recyclerView = c36877z0M25917t4.f81401d;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            C27046k.m66684G(recyclerView, false);
            BaseTextView empty = c36877z0M25917t4.f81400c;
            Intrinsics.checkNotNullExpressionValue(empty, "empty");
            C27046k.m66684G(empty, true);
            return;
        }
        RecyclerView recyclerView2 = c36877z0M25917t4.f81401d;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
        C27046k.m66684G(recyclerView2, true);
        BaseTextView empty2 = c36877z0M25917t4.f81400c;
        Intrinsics.checkNotNullExpressionValue(empty2, "empty");
        C27046k.m66684G(empty2, false);
        RecyclerView recyclerView3 = c36877z0M25917t4.f81401d;
        Intrinsics.checkNotNullExpressionValue(recyclerView3, "recyclerView");
        m25915A4(arrayList, recyclerView3);
    }
}
