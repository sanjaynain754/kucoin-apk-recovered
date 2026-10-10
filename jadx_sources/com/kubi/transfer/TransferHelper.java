package com.kubi.transfer;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5288p;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.transfer.entity.AccountItem;
import com.kubi.transfer.entity.TransferAccountBalance;
import com.kubi.transfer.entity.TransferCurrencyResult;
import com.kubi.transfer.lib.R$id;
import com.kubi.transfer.lib.R$layout;
import com.kubi.transfer.lib.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37749a;
import g60.C37826b;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Action;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: TransferHelper.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001e\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0012\u001a\u00020\u00052\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014J\u0014\u0010\u0016\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/transfer/TransferHelper;", "", "<init>", "()V", "jumpToTransferRecord", "", "code", "", "showTransferFailureDialog", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "data", "", "Lcom/kubi/transfer/entity/TransferCurrencyResult;", "callBack", "Lio/reactivex/functions/Action;", "showTransferAutoRepayTipDialog", "isLiability", "", "sortDatasByAccountOrder", "datas", "", "Lcom/kubi/transfer/entity/AccountItem;", "sortWithAccountOrder", "list", "Lcom/kubi/transfer/entity/TransferAccountBalance;", "getAccountOrders", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTransferHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferHelper.kt\ncom/kubi/transfer/TransferHelper\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n32#2:177\n32#2:180\n32#2:181\n1869#3,2:178\n*S KotlinDebug\n*F\n+ 1 TransferHelper.kt\ncom/kubi/transfer/TransferHelper\n*L\n93#1:177\n121#1:180\n153#1:181\n95#1:178,2\n*E\n"})
public final class TransferHelper {
    /* JADX INFO: renamed from: l */
    public static final Unit m64480l(boolean z11, final Action action, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        if (z11) {
            int i11 = R$id.tvAutoTitle;
            C27017c c27017c = C27017c.f54310a;
            viewHolder.setText(i11, c27017c.m66516f(R$string.lever_trasnsfer_status_text, new Object[0])).setText(R$id.tvAutoTip, c27017c.m66516f(R$string.lever_trasnsfer_tips, new Object[0]));
        }
        View view = viewHolder.getView(R$id.iv_cancel);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.transfer.r0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferHelper.m64481m(dialogFragmentHelper);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.tvContinue);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.transfer.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferHelper.m64482n(dialogFragmentHelper, action);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m64483p(final List list, final Action action, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        final int i11 = R$layout.btransfer_view_item_transfer_fail;
        recyclerView.setAdapter(new BaseQuickAdapter<TransferCurrencyResult, BaseViewHolder>(list, i11) { // from class: com.kubi.transfer.TransferHelper$showTransferFailureDialog$1$1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder helper, TransferCurrencyResult item) {
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(item, "item");
                helper.setText(R$id.tvCoinName, item.getCurrency()).setText(R$id.tvMsg, item.getFailMsg());
            }
        });
        View view = viewHolder.getView(R$id.tvCancle);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.transfer.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferHelper.m64484q(dialogFragmentHelper);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.tvRetry);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.transfer.q0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferHelper.m64485r(dialogFragmentHelper, action);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<String> m64488i() {
        try {
            List<String> list = (List) C5288p.m6343e(C46392a.m102326h(C37826b.f85205a.m85381b(), ""), List.class);
            Intrinsics.checkNotNull(list);
            return list;
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m64489j(@Nullable String str) {
        InterfaceC37749a.a.m85114i(C37304a.f82764a, str, 2L, null, null, null, 28, null);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final DialogFragmentHelper m64490k(final boolean z11, @NotNull final Action callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        return DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.btransfer_dialog_margin_tip, 0, 0, 0, false, false, false, false, false, 510, null).m54237f4(new Function2() { // from class: com.kubi.transfer.o0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TransferHelper.m64480l(z11, callBack, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final DialogFragmentHelper m64491o(@Nullable final List<TransferCurrencyResult> list, @NotNull final Action callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        return DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.btransfer_dialog_bottom_button_list, 0, 0, 0, false, false, false, false, false, 510, null).m54237f4(new Function2() { // from class: com.kubi.transfer.n0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TransferHelper.m64483p(list, callBack, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m64492s(@Nullable List<AccountItem> list) {
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            final List<String> list2 = (List) C5288p.m6343e(C46392a.m102326h(C37826b.f85205a.m85381b(), ""), List.class);
            if (list2 != null) {
                for (String str : list2) {
                    TransferLog.f52948a.m64781c("sort: " + str);
                }
            }
            if (list != null) {
                CollectionsKt.sortWith(list, new Comparator() { // from class: com.kubi.transfer.m0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return TransferHelper.m64486t(list2, (AccountItem) obj, (AccountItem) obj2);
                    }
                });
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m64493u(@NotNull List<TransferAccountBalance> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        try {
            Result.Companion companion = Result.INSTANCE;
            final List list2 = (List) C5288p.m6343e(C46392a.m102326h(C37826b.f85205a.m85381b(), ""), List.class);
            CollectionsKt.sortWith(list, new Comparator() { // from class: com.kubi.transfer.t0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return TransferHelper.m64487v(list2, (TransferAccountBalance) obj, (TransferAccountBalance) obj2);
                }
            });
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m64481m(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m64482n(DialogFragmentHelper dialogFragmentHelper, Action action) throws Exception {
        dialogFragmentHelper.dismiss();
        action.run();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m64484q(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m64485r(DialogFragmentHelper dialogFragmentHelper, Action action) throws Exception {
        dialogFragmentHelper.dismiss();
        action.run();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final int m64486t(List list, AccountItem accountItem, AccountItem accountItem2) {
        int iIndexOf = list.indexOf(accountItem.getAccountType().name());
        int iIndexOf2 = list.indexOf(accountItem2.getAccountType().name());
        if (iIndexOf != -1 && iIndexOf2 != -1) {
            return Intrinsics.compare(iIndexOf, iIndexOf2);
        }
        if (iIndexOf == -1 && iIndexOf2 != -1) {
            return 1;
        }
        if (iIndexOf != -1 && iIndexOf2 == -1) {
            return -1;
        }
        return accountItem.getAccountType().name().compareTo(accountItem2.getAccountType().name());
    }

    /* JADX INFO: renamed from: v */
    public static final int m64487v(List list, TransferAccountBalance transferAccountBalance, TransferAccountBalance transferAccountBalance2) {
        Intrinsics.checkNotNull(list);
        int iIndexOf = CollectionsKt.indexOf((List<? extends String>) list, transferAccountBalance.getAccountType());
        int iIndexOf2 = CollectionsKt.indexOf((List<? extends String>) list, transferAccountBalance2.getAccountType());
        if (iIndexOf != -1 && iIndexOf2 != -1) {
            return Intrinsics.compare(iIndexOf, iIndexOf2);
        }
        if (iIndexOf == -1 && iIndexOf2 != -1) {
            return 1;
        }
        if (iIndexOf != -1 && iIndexOf2 == -1) {
            return -1;
        }
        if (transferAccountBalance.getAccountType() != null && transferAccountBalance2.getAccountType() != null) {
            return transferAccountBalance.getAccountType().compareTo(transferAccountBalance2.getAccountType());
        }
        if (transferAccountBalance.getAccountType() == null) {
            return -1;
        }
        return 1;
    }
}
