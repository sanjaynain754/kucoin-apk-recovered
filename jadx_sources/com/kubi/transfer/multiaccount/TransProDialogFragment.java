package com.kubi.transfer.multiaccount;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c60.C4857k;
import com.blankj.utilcode.util.C5271g0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.data.coin.AccountType;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.transfer.C26268b;
import com.kubi.transfer.TransferHelper;
import com.kubi.transfer.TransferLog;
import com.kubi.transfer.entity.AccountItem;
import com.kubi.transfer.exception.TransferMessage;
import com.kubi.transfer.lib.R$color;
import com.kubi.transfer.lib.R$id;
import com.kubi.transfer.lib.R$layout;
import com.kubi.transfer.lib.R$string;
import com.kubi.transfer.multiaccount.TransProDialogFragment;
import com.kubi.transfer.view.TransferNoticeView;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import g60.C37826b;
import g60.C37827c;
import io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: TransProDialogFragment.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010/\u001a\u00020\u0015H\u0002J\b\u00100\u001a\u00020\u0015H\u0002J\b\u00101\u001a\u00020\u0015H\u0002J\u0010\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u00020!H\u0002J\f\u00104\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\b\u00105\u001a\u00020\u0015H\u0002J\u0016\u00106\u001a\u00020\u00152\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0016\u00107\u001a\u00020\u00152\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000RB\u0010\u0012\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, m90084d2 = {"Lcom/kubi/transfer/multiaccount/TransProDialogFragment;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "isBottomSheet", "", "isFrom", "isMultiAccountTransOpen", "coin", "", "datas", "", "Lcom/kubi/transfer/entity/AccountItem;", "selectFromType", "Lcom/kubi/data/coin/AccountType;", "selectToType", "fromSymbolBean", "toSymbolBean", "onCloseCallBack", "Lkotlin/Function4;", "", "", "getOnCloseCallBack", "()Lkotlin/jvm/functions/Function4;", "setOnCloseCallBack", "(Lkotlin/jvm/functions/Function4;)V", "binding", "Lcom/kubi/transfer/lib/databinding/TransProDialogFragmentBinding;", "getBinding", "()Lcom/kubi/transfer/lib/databinding/TransProDialogFragmentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "transProAccountAdapter", "Lcom/kubi/transfer/multiaccount/TransProAccountAdapter;", "selectAccount", "isClickedItem", "isDragging", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "readArguments", "initViews", "reInitRecyclerView", "enableDragSort", "adapter", "getFilterData", "showMultiAccountTipsDialog", "initSelectFromItem", "initSelectToItem", "Companion", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTransProDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransProDialogFragment.kt\ncom/kubi/transfer/multiaccount/TransProDialogFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 TransferIssue.kt\ncom/kubi/transfer/exception/TransferIssueKt\n*L\n1#1,459:1\n143#2,20:460\n136#3:480\n126#3,2:496\n774#4:481\n865#4,2:482\n1869#4,2:484\n295#4,2:486\n295#4,2:488\n295#4,2:490\n295#4,2:492\n1869#4,2:494\n54#5,2:498\n*S KotlinDebug\n*F\n+ 1 TransProDialogFragment.kt\ncom/kubi/transfer/multiaccount/TransProDialogFragment\n*L\n131#1:460,20\n223#1:480\n229#1:496,2\n327#1:481\n327#1:482,2\n350#1:484,2\n362#1:486,2\n363#1:488,2\n366#1:490,2\n367#1:492,2\n376#1:494,2\n235#1:498,2\n*E\n"})
public final class TransProDialogFragment extends DialogFragmentHelper {

    /* JADX INFO: renamed from: A0 */
    @Nullable
    public TransProAccountAdapter f52817A0;

    /* JADX INFO: renamed from: B0 */
    @Nullable
    public AccountItem f52818B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f52819C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f52820D0;

    /* JADX INFO: renamed from: q0 */
    public boolean f52821q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f52822r0;

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public String f52823s0;

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public List<AccountItem> f52824t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public AccountType f52825u0;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public AccountType f52826v0;

    /* JADX INFO: renamed from: w0 */
    @Nullable
    public String f52827w0;

    /* JADX INFO: renamed from: x0 */
    @Nullable
    public String f52828x0;

    /* JADX INFO: renamed from: y0 */
    @Nullable
    public Function4<? super Boolean, ? super List<AccountItem>, ? super AccountItem, ? super Boolean, Unit> f52829y0;

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public final InterfaceC24293a f52830z0;

    /* JADX INFO: renamed from: F0 */
    public static final /* synthetic */ KProperty<Object>[] f52816F0 = {Reflection.property1(new PropertyReference1Impl(TransProDialogFragment.class, "binding", "getBinding()Lcom/kubi/transfer/lib/databinding/TransProDialogFragmentBinding;", 0))};

    /* JADX INFO: renamed from: E0 */
    @NotNull
    public static final Companion f52815E0 = new Companion(null);

    /* JADX INFO: compiled from: TransProDialogFragment.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/transfer/multiaccount/TransProDialogFragment$Companion;", "", "<init>", "()V", "TAG", "", "ARG_IS_FROM", "ARG_IS_MULTI_ACCOUNT_TRANS_OPEN", "ARG_COIN", "ARG_DATAS", "ARG_SELECT_FROM_TYPE", "ARG_SELECT_TO_TYPE", "ARG_FROM_SYMBOL_BEAN", "ARG_TO_SYMBOL_BEAN", "create", "Lcom/kubi/transfer/multiaccount/TransProDialogFragment;", "isFrom", "", "isMultiAccountTransOpen", "coin", "datas", "", "Lcom/kubi/transfer/entity/AccountItem;", "selectFromType", "Lcom/kubi/data/coin/AccountType;", "selectToType", "fromSymbolBean", "toSymbolBean", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTransProDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransProDialogFragment.kt\ncom/kubi/transfer/multiaccount/TransProDialogFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,459:1\n1#2:460\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TransProDialogFragment create(boolean isFrom, boolean isMultiAccountTransOpen, @Nullable String coin, @Nullable List<AccountItem> datas, @NotNull AccountType selectFromType, @NotNull AccountType selectToType, @Nullable String fromSymbolBean, @Nullable String toSymbolBean) {
            List<AccountItem> list;
            String strJoinToString$default;
            Intrinsics.checkNotNullParameter(selectFromType, "selectFromType");
            Intrinsics.checkNotNullParameter(selectToType, "selectToType");
            TransferLog transferLog = TransferLog.f52948a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("TransProDialogFragment\nisFrom: ");
            sb2.append(isFrom);
            sb2.append(",\nisMultiAccountTransOpen: ");
            sb2.append(isMultiAccountTransOpen);
            sb2.append(",\ncoin: ");
            sb2.append(coin);
            sb2.append(", \ndatas: ");
            if (datas != null) {
                list = datas;
                strJoinToString$default = CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: d60.f
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TransProDialogFragment.Companion.m64635b((AccountItem) obj);
                    }
                }, 30, null);
            } else {
                list = datas;
                strJoinToString$default = null;
            }
            sb2.append(strJoinToString$default);
            sb2.append(", \nselectFromType: ");
            sb2.append(selectFromType);
            sb2.append(" \nselectToType: ");
            sb2.append(selectToType);
            sb2.append(" \n");
            transferLog.m64781c(sb2.toString());
            TransProDialogFragment transProDialogFragment = new TransProDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("arg_isFrom", isFrom);
            bundle.putBoolean("arg_isMultiAccountTransOpen", isMultiAccountTransOpen);
            bundle.putString("arg_coin", coin);
            bundle.putParcelableArrayList("arg_datas", list != null ? new ArrayList<>(list) : null);
            bundle.putString("arg_selectFromType", selectFromType.name());
            bundle.putString("arg_selectToType", selectToType.name());
            bundle.putString("arg_fromSymbolBean", fromSymbolBean);
            bundle.putString("arg_toSymbolBean", toSymbolBean);
            transProDialogFragment.setArguments(bundle);
            return transProDialogFragment;
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: b */
        public static final CharSequence m64635b(AccountItem it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getAccountType().name();
        }

        public static /* synthetic */ TransProDialogFragment create$default(Companion companion, boolean z11, boolean z12, String str, List list, AccountType accountType, AccountType accountType2, String str2, String str3, int i11, Object obj) {
            if ((i11 & 64) != 0) {
                str2 = null;
            }
            if ((i11 & 128) != 0) {
                str3 = null;
            }
            return companion.create(z11, z12, str, list, accountType, accountType2, str2, str3);
        }
    }

    /* JADX INFO: renamed from: com.kubi.transfer.multiaccount.TransProDialogFragment$a */
    /* JADX INFO: compiled from: TransProDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/transfer/multiaccount/TransProDialogFragment$enableDragSort$callback$1", "Lio/chad/library/adapter/base/callback/ItemDragAndSwipeCallback;", "onSelectedChanged", "", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "actionState", "", "clearView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTransProDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransProDialogFragment.kt\ncom/kubi/transfer/multiaccount/TransProDialogFragment$enableDragSort$callback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,459:1\n1563#2:460\n1634#2,3:461\n23#3,2:464\n172#4,2:466\n*S KotlinDebug\n*F\n+ 1 TransProDialogFragment.kt\ncom/kubi/transfer/multiaccount/TransProDialogFragment$enableDragSort$callback$1\n*L\n285#1:460\n285#1:461,3\n284#1:464,2\n309#1:466,2\n*E\n"})
    public static final class C26343a extends ItemDragAndSwipeCallback {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TransProDialogFragment f52831b;

        @Override // io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
            List<AccountItem> listEmptyList;
            if (actionState != 0) {
                if (actionState == 2) {
                    this.f52831b.f52820D0 = true;
                }
            } else if (this.f52831b.f52820D0) {
                this.f52831b.f52820D0 = false;
                TransProAccountAdapter transProAccountAdapter = this.f52831b.f52817A0;
                if (transProAccountAdapter == null || (listEmptyList = transProAccountAdapter.m64608j()) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                StorageId<String> storageIdM85381b = C37826b.f85205a.m85381b();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listEmptyList, 10));
                Iterator<T> it = listEmptyList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AccountItem) it.next()).getAccountType().name());
                }
                C46392a.m102333p(storageIdM85381b, C27099x.m66919i(arrayList, false, 2, null));
            }
            if (actionState != 0) {
                View view = viewHolder != null ? viewHolder.itemView : null;
                C5271g0.a aVar = new C5271g0.a();
                aVar.m6216g(ContextCompat.getColor(BaseApplication.INSTANCE.get(), R$color.c_cover4));
                aVar.m6218i(C5275i0.m6236a(4.0f));
                C5271g0.m6208a(view, aVar);
            }
            super.onSelectedChanged(viewHolder, actionState);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26343a(TransProAccountAdapter transProAccountAdapter, TransProDialogFragment transProDialogFragment) {
            super(transProAccountAdapter);
            this.f52831b = transProDialogFragment;
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
    }

    /* JADX INFO: renamed from: com.kubi.transfer.multiaccount.TransProDialogFragment$b */
    /* JADX INFO: compiled from: TransProDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/transfer/multiaccount/TransProDialogFragment$initViews$1$2", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "onCheckedChanged", "", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26344b implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C4857k f52833c;

        public C26344b(C4857k c4857k) {
            this.f52833c = c4857k;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            TransProDialogFragment.this.f52822r0 = isChecked;
            BaseTextView switchNotice = this.f52833c.f5026g;
            Intrinsics.checkNotNullExpressionValue(switchNotice, "switchNotice");
            C26268b.m64515d(switchNotice, TransProDialogFragment.this.f52821q0 && TransProDialogFragment.this.f52822r0);
            TransProDialogFragment.this.m64625D4();
            C43852m.m96590b("B1transferNew", "multiAccountSwitch", isChecked ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close", TuplesKt.m90091to("norm_version", "1"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX INFO: renamed from: z4 */
    private final void m64624z4() {
        final C4857k c4857kM64630v4 = m64630v4();
        if (c4857kM64630v4 != null) {
            c4857kM64630v4.f5021b.setText(getString(this.f52821q0 ? R$string.from : R$string.f52763to));
            if (this.f52822r0 && this.f52821q0) {
                new TransferHelper().m64492s(this.f52824t0);
            }
            List<AccountItem> list = this.f52824t0;
            if (list != null) {
                if (this.f52821q0) {
                    m64632x4(list);
                } else {
                    m64633y4(list);
                }
                m64625D4();
            }
            LinearLayoutCompat llMultiAccountSwitch = c4857kM64630v4.f5022c;
            Intrinsics.checkNotNullExpressionValue(llMultiAccountSwitch, "llMultiAccountSwitch");
            boolean z11 = false;
            C26268b.m64515d(llMultiAccountSwitch, C37827c.m85384c() && this.f52821q0);
            if (this.f52821q0 && this.f52825u0 == AccountType.ISOLATED) {
                LinearLayoutCompat llMultiAccountSwitch2 = c4857kM64630v4.f5022c;
                Intrinsics.checkNotNullExpressionValue(llMultiAccountSwitch2, "llMultiAccountSwitch");
                ViewExtKt.m66577h(llMultiAccountSwitch2);
            }
            List<AccountItem> list2 = this.f52824t0;
            if (list2 != null) {
                Intrinsics.checkNotNull(list2);
                if (list2.size() <= 2) {
                    LinearLayoutCompat llMultiAccountSwitch3 = c4857kM64630v4.f5022c;
                    Intrinsics.checkNotNullExpressionValue(llMultiAccountSwitch3, "llMultiAccountSwitch");
                    ViewExtKt.m66577h(llMultiAccountSwitch3);
                }
            } else {
                LinearLayoutCompat llMultiAccountSwitch4 = c4857kM64630v4.f5022c;
                Intrinsics.checkNotNullExpressionValue(llMultiAccountSwitch4, "llMultiAccountSwitch");
                ViewExtKt.m66577h(llMultiAccountSwitch4);
            }
            BaseTextView switchNotice = c4857kM64630v4.f5026g;
            Intrinsics.checkNotNullExpressionValue(switchNotice, "switchNotice");
            C26268b.m64515d(switchNotice, this.f52821q0 && this.f52822r0);
            c4857kM64630v4.f5025f.setChecked(this.f52822r0);
            c4857kM64630v4.f5025f.setOnCheckedChangeListener(new C26344b(c4857kM64630v4));
            c4857kM64630v4.f5027h.setNeedDash(true);
            c4857kM64630v4.f5027h.setDashColor(C27017c.f54310a.m66512a(R$color.c_text20));
            c4857kM64630v4.f5027h.setOnClickListener(new View.OnClickListener() { // from class: d60.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TransProDialogFragment.m64609A4(this.f79436b, view);
                }
            });
            TransferNoticeView noticeView = c4857kM64630v4.f5023d;
            Intrinsics.checkNotNullExpressionValue(noticeView, "noticeView");
            if (C37827c.m85384c() && this.f52821q0 && !C46392a.m102322d(C37826b.f85205a.m85380a(), true)) {
                z11 = true;
            }
            C26268b.m64515d(noticeView, z11);
            TransferNoticeView transferNoticeView = c4857kM64630v4.f5023d;
            String string = getString(R$string.kc_transferpro_multi_earn_guide);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            transferNoticeView.setTipText(string);
            c4857kM64630v4.f5023d.setOnCloseClickListener(new Function0() { // from class: d60.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransProDialogFragment.m64610B4(c4857kM64630v4);
                }
            });
        }
        m54192r3(new DialogInterface.OnDismissListener() { // from class: d60.d
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                TransProDialogFragment.m64611C4(this.f79438b, dialogInterface);
            }
        });
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m64610B4(C4857k c4857k) {
        C46392a.m102328k(C37826b.f85205a.m85380a(), true);
        c4857k.f5023d.m64831c();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final void m64611C4(TransProDialogFragment transProDialogFragment, DialogInterface dialogInterface) {
        List<AccountItem> listEmptyList;
        List<AccountItem> list = transProDialogFragment.f52824t0;
        if (list == null || list.isEmpty()) {
            C43846g.m96568c(new TransferMessage("打开弹窗时数据为空", "TransProDialogFragment.close", true), null, 2, null);
            return;
        }
        Function4<? super Boolean, ? super List<AccountItem>, ? super AccountItem, ? super Boolean, Unit> function4 = transProDialogFragment.f52829y0;
        if (function4 != null) {
            Boolean boolValueOf = Boolean.valueOf(transProDialogFragment.f52822r0);
            TransProAccountAdapter transProAccountAdapter = transProDialogFragment.f52817A0;
            if (transProAccountAdapter == null || (listEmptyList = transProAccountAdapter.m64608j()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            function4.invoke(boolValueOf, listEmptyList, transProDialogFragment.f52818B0, Boolean.valueOf(transProDialogFragment.f52819C0));
        }
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m64612E4(TransProDialogFragment transProDialogFragment, AccountItem accountItem) {
        Intrinsics.checkNotNullParameter(accountItem, "accountItem");
        transProDialogFragment.f52818B0 = accountItem;
        transProDialogFragment.f52819C0 = true;
        transProDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public final void m64625D4() {
        this.f52817A0 = new TransProAccountAdapter(this.f52821q0, this.f52823s0, m64631w4(), this.f52822r0, this.f52827w0, this.f52828x0, new Function1() { // from class: d60.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransProDialogFragment.m64612E4(this.f79439b, (AccountItem) obj);
            }
        });
        C4857k c4857kM64630v4 = m64630v4();
        if (c4857kM64630v4 != null) {
            c4857kM64630v4.f5024e.setLayoutManager(new LinearLayoutManager(requireContext()));
            c4857kM64630v4.f5024e.setAdapter(this.f52817A0);
            TransProAccountAdapter transProAccountAdapter = this.f52817A0;
            Intrinsics.checkNotNull(transProAccountAdapter);
            m64629u4(transProAccountAdapter);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final void m64627G4(@Nullable Function4<? super Boolean, ? super List<AccountItem>, ? super AccountItem, ? super Boolean, Unit> function4) {
        this.f52829y0 = function4;
    }

    /* JADX INFO: renamed from: H4 */
    public final void m64628H4() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.note).m54156M4(getString(R$string.kc_transfer_pro_multi_prompt)).m54162S4(R$string.confirm, null).m54172c5(getChildFragmentManager());
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return getLayoutInflater().inflate(R$layout.trans_pro_dialog_fragment, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m64626F4();
        m64624z4();
    }

    /* JADX INFO: renamed from: u4 */
    public final void m64629u4(TransProAccountAdapter transProAccountAdapter) {
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new C26343a(transProAccountAdapter, this));
        C4857k c4857kM64630v4 = m64630v4();
        itemTouchHelper.attachToRecyclerView(c4857kM64630v4 != null ? c4857kM64630v4.f5024e : null);
        transProAccountAdapter.enableDragItem(itemTouchHelper, R$id.dragIcon, true);
    }

    /* JADX INFO: renamed from: v4 */
    public final C4857k m64630v4() {
        return (C4857k) this.f52830z0.getValue(this, f52816F0[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: w4 */
    public final List<AccountItem> m64631w4() {
        if (!this.f52822r0 || !this.f52821q0) {
            List<AccountItem> list = this.f52824t0;
            return list == null ? new ArrayList() : list;
        }
        List<AccountItem> list2 = this.f52824t0;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (((AccountItem) obj).getAccountType() != AccountType.ISOLATED) {
                    arrayList.add(obj);
                }
            }
            List<AccountItem> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
            if (mutableList != null) {
                return mutableList;
            }
        }
        return new ArrayList();
    }

    public TransProDialogFragment() {
        AccountType accountType = AccountType.MAIN;
        this.f52825u0 = accountType;
        this.f52826v0 = accountType;
        this.f52830z0 = C45681e.m100799e(this, new Function1<TransProDialogFragment, C4857k>() { // from class: com.kubi.transfer.multiaccount.TransProDialogFragment$special$$inlined$viewBindingFragment$default$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C4857k invoke(@NotNull TransProDialogFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C4857k.m4988a(fragment.requireView());
            }
        }, new Function1<C4857k, Unit>() { // from class: com.kubi.transfer.multiaccount.TransProDialogFragment$special$$inlined$viewBindingFragment$default$1
            public final void invoke(@NotNull C4857k it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4857k c4857k) {
                invoke(c4857k);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public static final void m64609A4(TransProDialogFragment transProDialogFragment, View view) {
        transProDialogFragment.m64628H4();
    }

    /* JADX INFO: renamed from: F4 */
    public final void m64626F4() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.f52821q0 = arguments.getBoolean("arg_isFrom");
        this.f52822r0 = arguments.getBoolean("arg_isMultiAccountTransOpen");
        this.f52823s0 = arguments.getString("arg_coin");
        this.f52824t0 = arguments.getParcelableArrayList("arg_datas");
        AccountType.Companion companion = AccountType.INSTANCE;
        AccountType accountTypeOfName = companion.ofName(arguments.getString("arg_selectFromType"));
        if (accountTypeOfName == null) {
            accountTypeOfName = AccountType.MAIN;
        }
        this.f52825u0 = accountTypeOfName;
        AccountType accountTypeOfName2 = companion.ofName(arguments.getString("arg_selectToType"));
        if (accountTypeOfName2 == null) {
            accountTypeOfName2 = AccountType.MAIN;
        }
        this.f52826v0 = accountTypeOfName2;
        this.f52827w0 = arguments.getString("arg_fromSymbolBean");
        this.f52828x0 = arguments.getString("arg_toSymbolBean");
    }

    /* JADX INFO: renamed from: x4 */
    public final void m64632x4(List<AccountItem> list) {
        Object next;
        Object next2;
        for (AccountItem accountItem : list) {
            if (accountItem.getAccountType() == this.f52825u0) {
                this.f52818B0 = accountItem;
                accountItem.setChecked(true);
            } else {
                accountItem.setChecked(false);
            }
        }
        if (this.f52818B0 == null) {
            Object obj = null;
            if (this.f52826v0 == AccountType.MAIN) {
                Iterator<T> it = list.iterator();
                do {
                    if (it.hasNext()) {
                        next2 = it.next();
                    } else {
                        next2 = null;
                        break;
                    }
                } while (((AccountItem) next2).getAccountType() != AccountType.TRADE);
                this.f52818B0 = (AccountItem) next2;
                for (Object obj2 : list) {
                    if (((AccountItem) obj2).getAccountType() == AccountType.TRADE) {
                        obj = obj2;
                        break;
                    }
                }
                AccountItem accountItem2 = (AccountItem) obj;
                if (accountItem2 != null) {
                    accountItem2.setChecked(true);
                    return;
                }
                return;
            }
            Iterator<T> it2 = list.iterator();
            do {
                if (it2.hasNext()) {
                    next = it2.next();
                } else {
                    next = null;
                    break;
                }
            } while (((AccountItem) next).getAccountType() != AccountType.MAIN);
            this.f52818B0 = (AccountItem) next;
            for (Object obj3 : list) {
                if (((AccountItem) obj3).getAccountType() == AccountType.MAIN) {
                    obj = obj3;
                    break;
                }
            }
            AccountItem accountItem3 = (AccountItem) obj;
            if (accountItem3 != null) {
                accountItem3.setChecked(true);
            }
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final void m64633y4(List<AccountItem> list) {
        for (AccountItem accountItem : list) {
            if (accountItem.getAccountType() == this.f52826v0) {
                this.f52818B0 = accountItem;
                accountItem.setChecked(true);
            } else {
                accountItem.setChecked(false);
            }
        }
    }
}
