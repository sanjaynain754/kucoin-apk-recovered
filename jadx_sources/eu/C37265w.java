package eu;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.AdPayType;
import com.kubi.payment.p2p.order.ReleaseCryptoDialog;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: eu.w */
/* JADX INFO: compiled from: OrderDialogHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00050\u000eJ\u001c\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010J\u001c\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010JH\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010J\"\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000eJ2\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010J*\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010J*\u0010 \u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010¨\u0006!"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/helper/OrderDialogHelper;", "", "<init>", "()V", "showPayTypeSelectView", "", "selectId", "", "payTypeList", "", "Lcom/kubi/otc/entity/AdPayType;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "payCoinAlertView", "Lkotlin/Function0;", "cancelAppealAlertView", "cancelOrderAlertView", "context", "Landroid/content/Context;", "fiatCurrency", "cryptoCurrency", "status", "consultConfirmView", "consultSuccessConfirmInfoView", "content", "consultSuccessAction", "consultDisAgreeAction", "consultSuccessConfirmView", "consultConfirmAction", "backAction", "consultDisagreeConfirmView", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOrderDialogHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderDialogHelper.kt\ncom/kubi/payment/p2p/order/helper/OrderDialogHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,278:1\n1563#2:279\n1634#2,3:280\n1#3:283\n58#4,23:284\n93#4,3:307\n*S KotlinDebug\n*F\n+ 1 OrderDialogHelper.kt\ncom/kubi/payment/p2p/order/helper/OrderDialogHelper\n*L\n46#1:279\n46#1:280,3\n161#1:284,23\n161#1:307,3\n*E\n"})
public final class C37265w {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37265w f82633a = new C37265w();

    /* JADX INFO: renamed from: eu.w$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 OrderDialogHelper.kt\ncom/kubi/payment/p2p/order/helper/OrderDialogHelper\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n162#2,3:98\n71#3:101\n77#4:102\n*E\n"})
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseViewHolder f82634b;

        public a(BaseViewHolder baseViewHolder) {
            this.f82634b = baseViewHolder;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            this.f82634b.setText(R$id.tv_input_num, String.valueOf(C27039d.m66650j(s11 != null ? Integer.valueOf(s11.length()) : null)));
            this.f82634b.setEnabled(R$id.tv_confirm_consult, String.valueOf(s11).length() > 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: Z */
    public static final void m83377Z(Function1 function1, List list, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                if (Intrinsics.areEqual(((AdPayType) obj2).getId(), interfaceC24339a.getId())) {
                    obj = obj2;
                    break;
                }
            }
            obj = (AdPayType) obj;
        }
        function1.invoke(obj);
        C43852m.m96591c("B7P2POrderDetails", "button", "3", null, 8, null);
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m83361E(final Function1 function1, final BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        final EditText editText = (EditText) viewHolder.getView(R$id.et_consent_content);
        editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(500)});
        Intrinsics.checkNotNull(editText);
        editText.addTextChangedListener(new a(viewHolder));
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: eu.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                C37265w.m83362F(viewHolder, view, z11);
            }
        });
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        View view = viewHolder.getView(R$id.tv_consent_tip_title);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        highlightTextHelper.m54120f((TextView) view, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.secondary))));
        View view2 = viewHolder.getView(R$id.iv_cancel);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: eu.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37265w.m83363G(helper);
            }
        }, 1, null);
        View view3 = viewHolder.getView(R$id.tv_confirm_consult);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: eu.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37265w.m83364H(helper, function1, editText);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final void m83362F(BaseViewHolder baseViewHolder, View view, boolean z11) {
        baseViewHolder.getView(R$id.view_focus).setSelected(z11);
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m83365J(final Function0 function0, final Function0 function1, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        View view = viewHolder.getView(R$id.iv_cancel);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: eu.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37265w.m83366K(helper);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.tv_consult_disagree_confirm);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: eu.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37265w.m83367L(helper, function0);
            }
        }, 1, null);
        View view3 = viewHolder.getView(R$id.tv_consult_back);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: eu.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37265w.m83368M(helper, function1);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m83369O(String str, final Function0 function0, final Function0 function1, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        int i11 = R$id.tv_consult_content;
        if (str.length() == 0) {
            Context context = helper.getContext();
            str = C27041f.m66668h(context != null ? context.getString(R$string.payment_p2p_order_consensus_conclusion_default) : null);
        }
        viewHolder.setText(i11, str);
        View view = viewHolder.getView(R$id.iv_cancel);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: eu.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37265w.m83370P(helper);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.tv_consult_success_confirm);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: eu.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37265w.m83371Q(helper, function0);
            }
        }, 1, null);
        View view3 = viewHolder.getView(R$id.tv_consult_disagree);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: eu.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37265w.m83372R(helper, function1);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m83373T(final Function0 function0, final Function0 function1, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        View view = viewHolder.getView(R$id.iv_cancel);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: eu.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37265w.m83374U(helper);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.tv_consult_confirm);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: eu.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37265w.m83375V(helper, function0);
            }
        }, 1, null);
        View view3 = viewHolder.getView(R$id.tv_consult_back);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: eu.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37265w.m83376W(helper, function1);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m83401z(Context context, final String str, final String str2, final String str3, final Function0 function0, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        String string = context.getString(R$string.payment_order_detail_dialog_tip_2_index);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R$string.payment_order_detail_dialog_tip_1));
        sb2.append(context.getString(R$string.payment_order_detail_dialog_tip_3));
        sb2.append(context.getString(R$string.payment_order_detail_dialog_tip_2, string));
        int i11 = R$id.tv_info_3;
        SpannableString spannableString = new SpannableString(sb2);
        spannableString.setSpan(new ForegroundColorSpan(C27046k.m66699n(context, R$color.complementary)), StringsKt.indexOf$default((CharSequence) spannableString, string, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) spannableString, string, 0, false, 6, (Object) null) + string.length(), 18);
        Unit unit = Unit.INSTANCE;
        viewHolder.setText(i11, spannableString);
        View view = viewHolder.getView(R$id.iv_cancel);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: eu.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37265w.m83358A(helper);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.tv_back_order);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: eu.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37265w.m83359B(helper, str, str2, str3);
            }
        }, 1, null);
        View view3 = viewHolder.getView(R$id.tv_confirm_cancel);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: eu.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37265w.m83360C(helper, function0, str, str2, str3);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public final void m83402D(@NotNull FragmentManager fragmentManager, @NotNull final Function1<? super String, Unit> action) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(action, "action");
        DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.payment_order_consult_confirm_dialog, 8, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: eu.r
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C37265w.m83361E(action, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(fragmentManager, "consultConfirmView");
    }

    /* JADX INFO: renamed from: I */
    public final void m83403I(@NotNull FragmentManager fragmentManager, @NotNull final Function0<Unit> consultDisAgreeAction, @NotNull final Function0<Unit> backAction) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(consultDisAgreeAction, "consultDisAgreeAction");
        Intrinsics.checkNotNullParameter(backAction, "backAction");
        DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.payment_order_confirm_consult_disagree, 8, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: eu.l
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C37265w.m83365J(consultDisAgreeAction, backAction, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(fragmentManager, "consultDisagreeConfirmView");
    }

    /* JADX INFO: renamed from: N */
    public final void m83404N(@NotNull FragmentManager fragmentManager, @NotNull final String content, @NotNull final Function0<Unit> consultSuccessAction, @NotNull final Function0<Unit> consultDisAgreeAction) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(consultSuccessAction, "consultSuccessAction");
        Intrinsics.checkNotNullParameter(consultDisAgreeAction, "consultDisAgreeAction");
        DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.payment_order_consult_success_confirm_dialog, 0, 0, 0, false, false, false, false, false, 510, null).m54237f4(new Function2() { // from class: eu.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C37265w.m83369O(content, consultSuccessAction, consultDisAgreeAction, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(fragmentManager, "consultSuccessConfirmInfoView");
    }

    /* JADX INFO: renamed from: S */
    public final void m83405S(@NotNull FragmentManager fragmentManager, @NotNull final Function0<Unit> consultConfirmAction, @NotNull final Function0<Unit> backAction) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(consultConfirmAction, "consultConfirmAction");
        Intrinsics.checkNotNullParameter(backAction, "backAction");
        DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.payment_order_confirm_consult_success, 0, 0, 0, false, false, false, false, false, 510, null).m54237f4(new Function2() { // from class: eu.v
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C37265w.m83373T(consultConfirmAction, backAction, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(fragmentManager, "consultSuccessConfirmView");
    }

    /* JADX INFO: renamed from: X */
    public final void m83406X(@NotNull FragmentManager fragmentManager, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(action, "action");
        ReleaseCryptoDialog.f39778u0.show(fragmentManager, action);
    }

    /* JADX INFO: renamed from: Y */
    public final void m83407Y(@Nullable String str, @Nullable final List<AdPayType> list, @NotNull FragmentManager fragmentManager, @NotNull final Function1<? super AdPayType, Unit> action) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(action, "action");
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (AdPayType adPayType : list) {
                arrayList.add(new SelectEntity(C27041f.m66668h(adPayType.getId()), C27041f.m66668h(adPayType.getPayTypeNameEn()), null, null, null, null, null, null, null, false, Intrinsics.areEqual(adPayType.getId(), str), null, 3068, null));
            }
        } else {
            arrayList = null;
        }
        BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, C27024b.m66560c(arrayList), new BiConsumer() { // from class: eu.p
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C37265w.m83377Z(action, list, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 56, null).show(fragmentManager, "showPayTypeSelectView");
    }

    /* JADX INFO: renamed from: w */
    public final void m83408w(@NotNull FragmentManager fragmentManager, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(action, "action");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_detail_confirm_withdraw_appeal).m54153J4(R$string.payment_detail_confirm_withdraw_appeal_tip1).m54159P4(R$string.cancel, null).m54162S4(R$string.payment_detail_confirm_withdraw_appeal_action, new DialogInterface.OnClickListener() { // from class: eu.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C37265w.m83400x(action, dialogInterface, i11);
            }
        }).m54172c5(fragmentManager);
    }

    /* JADX INFO: renamed from: y */
    public final void m83409y(@NotNull final Context context, @NotNull FragmentManager fragmentManager, @Nullable final String str, @Nullable final String str2, @Nullable final String str3, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(action, "action");
        C43852m.m96594f("B7P2POrderDetails", "cancelPopup", "1", TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(str)), TuplesKt.m90091to("pay_crypto_currency", C27041f.m66668h(str2)), TuplesKt.m90091to("status", C27041f.m66668h(str3)));
        DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.payment_order_cancel_dialog, 8, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: eu.o
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C37265w.m83401z(context, str, str2, str3, action, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(fragmentManager, "cancelOrderAlertView");
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m83358A(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m83359B(DialogFragmentHelper dialogFragmentHelper, String str, String str2, String str3) {
        dialogFragmentHelper.dismiss();
        C43852m.m96590b("B7P2POrderDetails", "cancelReturnButton", "1", TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(str)), TuplesKt.m90091to("pay_crypto_currency", C27041f.m66668h(str2)), TuplesKt.m90091to("status", C27041f.m66668h(str3)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m83360C(DialogFragmentHelper dialogFragmentHelper, Function0 function0, String str, String str2, String str3) {
        dialogFragmentHelper.dismiss();
        function0.invoke();
        C43852m.m96590b("B7P2POrderDetails", "cancelConfirmButton", "1", TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(str)), TuplesKt.m90091to("pay_crypto_currency", C27041f.m66668h(str2)), TuplesKt.m90091to("status", C27041f.m66668h(str3)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m83363G(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m83364H(DialogFragmentHelper dialogFragmentHelper, Function1 function1, EditText editText) {
        dialogFragmentHelper.dismiss();
        function1.invoke(editText.getText().toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m83366K(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m83367L(DialogFragmentHelper dialogFragmentHelper, Function0 function0) {
        dialogFragmentHelper.dismiss();
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m83368M(DialogFragmentHelper dialogFragmentHelper, Function0 function0) {
        dialogFragmentHelper.dismiss();
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m83370P(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m83371Q(DialogFragmentHelper dialogFragmentHelper, Function0 function0) {
        dialogFragmentHelper.dismiss();
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m83372R(DialogFragmentHelper dialogFragmentHelper, Function0 function0) {
        dialogFragmentHelper.dismiss();
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final Unit m83374U(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m83375V(DialogFragmentHelper dialogFragmentHelper, Function0 function0) {
        dialogFragmentHelper.dismiss();
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m83376W(DialogFragmentHelper dialogFragmentHelper, Function0 function0) {
        dialogFragmentHelper.dismiss();
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final void m83400x(Function0 function0, DialogInterface dialogInterface, int i11) {
        function0.invoke();
    }
}
