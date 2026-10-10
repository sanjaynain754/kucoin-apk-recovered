package com.kubi.kumex.dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.PriceEntity;
import com.kubi.kumex.utils.C17056l0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import fm.C37569d;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.kumex.dialog.u */
/* JADX INFO: compiled from: DialogHelper.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u00012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u001a(\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\"\u0010\r\u001a\u00020\u00012\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u001a \u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015\u001a,\u0010\r\u001a\u00020\u00012\b\b\u0001\u0010\u0016\u001a\u00020\u000f2\b\b\u0001\u0010\u0017\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u001a4\u0010\r\u001a\u00020\u00012\b\b\u0001\u0010\u0016\u001a\u00020\u000f2\b\b\u0001\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\f2\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u001a,\u0010\r\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u001aF\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0 2\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00040!2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u0018\u0010\"\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u001a8\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0 2\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00040!¨\u0006#"}, m90084d2 = {"createNowDealDialog", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "close", "Lkotlin/Function0;", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "Landroidx/fragment/app/DialogFragment;", "createAutoEnsureDialog", "isOpen", "", "spmId", "", "createTipsDialog", "resId", "", "onFuturesFragmentMarkPriceClick", FirebaseAnalytics.Param.PRICE, "Lcom/kubi/kumex/data/market/model/PriceEntity;", "precision", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "title", "message", "url", "tips", "", "initViewListener", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "createBottomDialog", "indexPos", "data", "", "Lkotlin/Function2;", "createTransferDialog", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDialogHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHelper.kt\ncom/kubi/kumex/dialog/DialogHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,256:1\n1573#2:257\n1604#2,4:258\n1573#2:262\n1604#2,4:263\n*S KotlinDebug\n*F\n+ 1 DialogHelper.kt\ncom/kubi/kumex/dialog/DialogHelperKt\n*L\n215#1:257\n215#1:258,4\n245#1:262\n245#1:263,4\n*E\n"})
public final class C15943u {
    /* JADX INFO: renamed from: A */
    public static final Unit m33658A(final Function1 function1, BaseViewHolder holder, final DialogFragmentHelper dialog) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        C43852m.m96595g(C17060n0.m36552b(), "DeepOrderBookAlert", null, null, 12, null);
        TextView textView = (TextView) holder.getView(R$id.tvDesc);
        textView.setText(R$string.kumex_deep_orderbook_desc);
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(textView);
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        Pair pair = new Pair(textTagEnum, new ForegroundColorSpan(textView.getResources().getColor(R$color.c_text)));
        TypefaceSpan typefaceSpanM36545b = C17056l0.m36545b(R$font.semi);
        if (typefaceSpanM36545b == null) {
            typefaceSpanM36545b = new TypefaceSpan("sans-serif-medium");
        }
        highlightTextHelper.m54120f(textView, pair, new Pair(textTagEnum, typefaceSpanM36545b));
        View view = holder.getView(R$id.tv_cancel);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.kumex.dialog.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C15943u.m33659B(dialog);
            }
        }, 1, null);
        View view2 = holder.getView(R$id.tv_confirm);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.kumex.dialog.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C15943u.m33660C(function1, dialog);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final void m33661D(Function0 function0, DialogInterface dialogInterface) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public static final BaseDialogFragment m33662E(@StringRes int i11, @StringRes int i12, @NotNull final String url, @Nullable final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(url, "url");
        return AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54148E4(R$layout.bkumex_dialog_tips_with_url, new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.kumex.dialog.l
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                C15943u.m33671N(url, baseViewHolder, dialogFragmentHelper);
            }
        }).m54167X4(i11).m54153J4(i12).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.kumex.dialog.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                C15943u.m33673P(function0, dialogInterface, i13);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public static final BaseDialogFragment m33663F(@StringRes int i11, @StringRes int i12, @Nullable final Function0<Unit> function0) {
        return AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(i11).m54153J4(i12).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.kumex.dialog.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                C15943u.m33670M(function0, dialogInterface, i13);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public static final BaseDialogFragment m33664G(@StringRes int i11, @Nullable final Function0<Unit> function0) {
        return AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54153J4(i11).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.kumex.dialog.n
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                C15943u.m33675R(function0, dialogInterface, i12);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public static final BaseDialogFragment m33665H(@NotNull CharSequence tips, @Nullable final Function0<Unit> function0, @Nullable DialogFragmentHelper.InterfaceC22882b interfaceC22882b) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        return AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54156M4(tips).m54150G4(interfaceC22882b).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.kumex.dialog.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C15943u.m33674Q(function0, dialogInterface, i11);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ BaseDialogFragment m33666I(int i11, int i12, String str, Function0 function0, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            function0 = null;
        }
        return m33662E(i11, i12, str, function0);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ BaseDialogFragment m33667J(int i11, int i12, Function0 function0, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            function0 = null;
        }
        return m33663F(i11, i12, function0);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ BaseDialogFragment m33668K(int i11, Function0 function0, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            function0 = null;
        }
        return m33664G(i11, function0);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ BaseDialogFragment m33669L(CharSequence charSequence, Function0 function0, DialogFragmentHelper.InterfaceC22882b interfaceC22882b, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        if ((i11 & 4) != 0) {
            interfaceC22882b = null;
        }
        return m33665H(charSequence, function0, interfaceC22882b);
    }

    /* JADX INFO: renamed from: M */
    public static final void m33670M(Function0 function0, DialogInterface dialogInterface, int i11) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: N */
    public static final void m33671N(final String str, BaseViewHolder holder, DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        TextView textView = (TextView) holder.getView(R$id.url);
        Intrinsics.checkNotNull(textView);
        C27046k.m66684G(textView, str.length() > 0);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.kumex.dialog.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C15943u.m33672O(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public static final void m33672O(String str, View view) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, str, null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: P */
    public static final void m33673P(Function0 function0, DialogInterface dialogInterface, int i11) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final void m33674Q(Function0 function0, DialogInterface dialogInterface, int i11) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: R */
    public static final void m33675R(Function0 function0, DialogInterface dialogInterface, int i11) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public static final BaseDialogFragment m33676S(@Nullable final Function0<Unit> function0) {
        return AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54153J4(BrokerConfig.f19211a.m20201d().mo4515x() == MultiBizType.UNIFIED ? R$string.unify_plz_transfer_to_unify_account : R$string.balance_insufficient_please_transfer_funds).m54159P4(R$string.cancel, null).m54162S4(R$string.go_transfer, new DialogInterface.OnClickListener() { // from class: com.kubi.kumex.dialog.t
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C15943u.m33677T(function0, dialogInterface, i11);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public static final void m33677T(Function0 function0, DialogInterface dialogInterface, int i11) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: U */
    public static final void m33678U(@Nullable final PriceEntity priceEntity, final int i11, @NotNull FragmentManager childFragmentManager) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.bkumex_dialog_mark_index_price, 8, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.kumex.dialog.o
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C15943u.m33679V(priceEntity, i11, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(childFragmentManager, "onFuturesFragmentMarkPriceClick");
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m33679V(PriceEntity priceEntity, int i11, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        int i12;
        String strM92640e;
        BigDecimal indexPrice;
        BigDecimal markPrice;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        int i13 = R$id.tvMarkPrice;
        String strM92640e2 = null;
        if (priceEntity == null || (markPrice = priceEntity.getMarkPrice()) == null) {
            i12 = i11;
            strM92640e = null;
        } else {
            i12 = i11;
            strM92640e = C42180b.m92640e(markPrice, null, i12, true, false, true, 0, null, 105, null);
        }
        viewHolder.setText(i13, C27041f.m66669i(strM92640e, C37569d.m84684y()));
        int i14 = R$id.tvIndexPrice;
        if (priceEntity != null && (indexPrice = priceEntity.getIndexPrice()) != null) {
            strM92640e2 = C42180b.m92640e(indexPrice, null, i12, true, false, true, 0, null, 105, null);
        }
        viewHolder.setText(i14, C27041f.m66669i(strM92640e2, C37569d.m84684y()));
        viewHolder.setOnClickListener(R$id.close, new View.OnClickListener() { // from class: com.kubi.kumex.dialog.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C15943u.m33680W(dialogFragmentHelper, view);
            }
        });
        viewHolder.setOnClickListener(R$id.confirm, new View.OnClickListener() { // from class: com.kubi.kumex.dialog.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C15943u.m33681X(dialogFragmentHelper, view);
            }
        });
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public static final BaseDialogFragment m33700s(final boolean z11, @Nullable String str, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        AlertDialogFragmentHelper alertDialogFragmentHelperNewInstanceAlert = AlertDialogFragmentHelper.f43512a1.newInstanceAlert();
        if (str != null && str.length() != 0) {
            Bundle arguments = alertDialogFragmentHelperNewInstanceAlert.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putString("spm", str);
            alertDialogFragmentHelperNewInstanceAlert.setArguments(arguments);
        }
        return alertDialogFragmentHelperNewInstanceAlert.m54150G4(new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.kumex.dialog.q
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                C15943u.m33702u(baseViewHolder, dialogFragmentHelper);
            }
        }).m54167X4(z11 ? R$string.open_auto_deposit_margin : R$string.close_auto_deposit_margin).m54153J4(z11 ? R$string.open_auto_deposit_tips : R$string.close_auto_deposit_margin_tips).m54162S4(z11 ? R$string.confirm_open : R$string.confirm_close, new DialogInterface.OnClickListener() { // from class: com.kubi.kumex.dialog.r
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C15943u.m33703v(z11, action, dialogInterface, i11);
            }
        }).m54159P4(z11 ? R$string.not_open : R$string.not_close, new DialogInterface.OnClickListener() { // from class: com.kubi.kumex.dialog.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C15943u.m33704w(dialogInterface, i11);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ BaseDialogFragment m33701t(boolean z11, String str, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return m33700s(z11, str, function0);
    }

    /* JADX INFO: renamed from: u */
    public static final void m33702u(BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        C43852m.m96595g(C17060n0.m36552b(), "AutoAddMargin", null, null, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public static final BaseDialogFragment m33705x(int i11, @NotNull List<? extends CharSequence> data, @NotNull final Function2<? super Integer, ? super CharSequence, Unit> action) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(action, "action");
        BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
        int i12 = 0;
        for (Object obj : data) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new SelectEntity(null, (CharSequence) obj, null, null, null, null, null, null, null, false, i12 == i11, null, 3069, null));
            i12 = i13;
        }
        return BottomSheetDialogHelper.m58944B(bottomSheetDialogHelper, CollectionsKt.toList(arrayList), new BiConsumer() { // from class: com.kubi.kumex.dialog.p
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj2, Object obj3) {
                C15943u.m33706y(action, (BaseViewHolder) obj2, (BottomSheetDialogHelper.InterfaceC24339a) obj3);
            }
        }, false, null, null, false, 28, null);
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public static final BaseDialogFragment m33707z(@Nullable final Function0<Unit> function0, @NotNull final Function1<? super DialogFragment, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.bkumex_dialog_deal_now_confirm, 4, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.kumex.dialog.g
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C15943u.m33658A(action, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.kumex.dialog.h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C15943u.m33661D(function0, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m33659B(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        C43852m.m96591c(C17060n0.m36552b(), "DeepOrderBookAlert", "2", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m33660C(Function1 function1, DialogFragmentHelper dialogFragmentHelper) {
        function1.invoke(dialogFragmentHelper);
        dialogFragmentHelper.dismiss();
        C43852m.m96591c(C17060n0.m36552b(), "DeepOrderBookAlert", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W */
    public static final void m33680W(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: X */
    public static final void m33681X(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: v */
    public static final void m33703v(boolean z11, Function0 function0, DialogInterface dialogInterface, int i11) {
        String str;
        String strM36552b = C17060n0.m36552b();
        if (z11) {
            str = TtmlNode.TEXT_EMPHASIS_MARK_OPEN;
        } else {
            str = "close";
        }
        C43852m.m96590b(strM36552b, "AutoAddMargin", "1", TuplesKt.m90091to("status", str));
        function0.invoke();
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: w */
    public static final void m33704w(DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: y */
    public static final void m33706y(Function2 function2, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        function2.invoke(Integer.valueOf(baseViewHolder.getAdapterPosition()), interfaceC24339a.getLabel());
    }
}
