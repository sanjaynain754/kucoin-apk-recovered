package com.kubi.futures.dialog;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CompoundButton;
import androidx.core.content.res.ResourcesCompat;
import com.blankj.utilcode.util.C5303w0;
import com.cpiz.android.bubbleview.BubbleTextView;
import com.kubi.futures.data.platform.model.OpenFuturesAgreement;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$string;
import com.kubi.resources.widget.AlignTopCheckBox;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.utils.C27018c0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33627eb;
import dm.C36859w;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: OpenFuturesTradingDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.dialog.OpenFuturesTradingDialog$initViewAccording$2", m90122f = "OpenFuturesTradingDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nOpenFuturesTradingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenFuturesTradingDialog.kt\ncom/kubi/futures/dialog/OpenFuturesTradingDialog$initViewAccording$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,312:1\n1878#2,3:313\n1869#2,2:316\n*S KotlinDebug\n*F\n+ 1 OpenFuturesTradingDialog.kt\ncom/kubi/futures/dialog/OpenFuturesTradingDialog$initViewAccording$2\n*L\n156#1:313,3\n163#1:316,2\n*E\n"})
public final class OpenFuturesTradingDialog$initViewAccording$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<OpenFuturesAgreement> $unsignedAgreements;
    int label;
    final /* synthetic */ OpenFuturesTradingDialog this$0;

    /* JADX INFO: renamed from: com.kubi.futures.dialog.OpenFuturesTradingDialog$initViewAccording$2$a */
    /* JADX INFO: compiled from: OpenFuturesTradingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/futures/dialog/OpenFuturesTradingDialog$initViewAccording$2$2$clickSpan$1", "Lcom/kubi/utils/MyClickSpan;", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13043a extends C27018c0 {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Context f22792d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13043a(Context context, int i11, View.OnClickListener onClickListener) {
            super(i11, onClickListener);
            this.f22792d = context;
        }

        @Override // com.kubi.utils.C27018c0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setUnderlineText(true);
            ds2.setColor(ResourcesCompat.getColor(this.f22792d.getResources(), R$color.brandGreen, this.f22792d.getTheme()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenFuturesTradingDialog$initViewAccording$2(OpenFuturesTradingDialog openFuturesTradingDialog, List<OpenFuturesAgreement> list, Continuation<? super OpenFuturesTradingDialog$initViewAccording$2> continuation) {
        super(2, continuation);
        this.this$0 = openFuturesTradingDialog;
        this.$unsignedAgreements = list;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    /* JADX INFO: renamed from: i */
    public static final Unit m25182i(List list, OpenFuturesTradingDialog openFuturesTradingDialog) {
        BubbleTextView bubbleTextView;
        AlignTopCheckBox alignTopCheckBox;
        if (list == null || list.isEmpty()) {
            openFuturesTradingDialog.m25175L4();
        } else {
            C36859w c36859wM25171D4 = openFuturesTradingDialog.m25171D4();
            if (C27025c.m66566d((c36859wM25171D4 == null || (alignTopCheckBox = c36859wM25171D4.f81267d) == null) ? null : Boolean.valueOf(alignTopCheckBox.isChecked()))) {
                openFuturesTradingDialog.m25175L4();
            } else {
                C36859w c36859wM25171D5 = openFuturesTradingDialog.m25171D4();
                if (c36859wM25171D5 != null && (bubbleTextView = c36859wM25171D5.f81266c) != null) {
                    ViewExtKt.m66594y(bubbleTextView);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m25183j(OpenFuturesTradingDialog openFuturesTradingDialog, CompoundButton compoundButton, boolean z11) {
        C36859w c36859wM25171D4;
        BubbleTextView bubbleTextView;
        if (z11 && (c36859wM25171D4 = openFuturesTradingDialog.m25171D4()) != null && (bubbleTextView = c36859wM25171D4.f81266c) != null) {
            ViewExtKt.m66577h(bubbleTextView);
        }
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OpenFuturesTradingDialog$initViewAccording$2(this.this$0, this.$unsignedAgreements, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OpenFuturesTradingDialog$initViewAccording$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: h */
    public static final void m25181h(OpenFuturesTradingDialog openFuturesTradingDialog, OpenFuturesAgreement openFuturesAgreement, View view) {
        view.cancelPendingInputEvents();
        String agreementLink = openFuturesAgreement.getAgreementLink();
        if (agreementLink == null) {
            agreementLink = "";
        }
        String strDecode = Uri.decode(openFuturesTradingDialog.m25170C4(agreementLink));
        if (strDecode != null) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, strDecode, null, null, null, null, null, null, 126, null);
        }
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AlignTopCheckBox alignTopCheckBox;
        AlignTopCheckBox alignTopCheckBox2;
        KcPrimaryButton kcPrimaryButton;
        List<OpenFuturesAgreement> listReversed;
        AlignTopCheckBox alignTopCheckBox3;
        AlignTopCheckBox alignTopCheckBox4;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = this.this$0.getContext();
            if (context == null) {
                return Unit.INSTANCE;
            }
            List<OpenFuturesAgreement> list = this.$unsignedAgreements;
            if (list == null || list.isEmpty()) {
                C36859w c36859wM25171D4 = this.this$0.m25171D4();
                if (c36859wM25171D4 != null && (alignTopCheckBox = c36859wM25171D4.f81267d) != null) {
                    C27046k.m66700o(alignTopCheckBox);
                }
            } else {
                StringBuilder sb2 = new StringBuilder(C33627eb.f69716f);
                if (C5303w0.m6511a()) {
                    listReversed = CollectionsKt.reversed(this.$unsignedAgreements);
                } else {
                    listReversed = this.$unsignedAgreements;
                }
                int i11 = 0;
                for (Object obj2 : listReversed) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    OpenFuturesAgreement openFuturesAgreement = (OpenFuturesAgreement) obj2;
                    if (i11 != 0) {
                        sb2.append(" & ");
                    }
                    sb2.append(openFuturesAgreement.getAgreementName());
                    i11 = i12;
                }
                String string = this.this$0.getString(R$string.click_confirm_mean_agree, sb2);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                List listReversed2 = CollectionsKt.reversed(listReversed);
                final OpenFuturesTradingDialog openFuturesTradingDialog = this.this$0;
                Iterator it = listReversed2.iterator();
                loop1: while (true) {
                    String str = string;
                    while (true) {
                        if (!it.hasNext()) {
                            break loop1;
                        }
                        final OpenFuturesAgreement openFuturesAgreement2 = (OpenFuturesAgreement) it.next();
                        String agreementName = openFuturesAgreement2.getAgreementName();
                        if (agreementName != null && agreementName.length() != 0) {
                            int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, openFuturesAgreement2.getAgreementName(), 0, false, 6, (Object) null);
                            spannableStringBuilder.setSpan(new C13043a(context, R$color.c_text, new View.OnClickListener() { // from class: com.kubi.futures.dialog.v0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    OpenFuturesTradingDialog$initViewAccording$2.m25181h(openFuturesTradingDialog, openFuturesAgreement2, view);
                                }
                            }), iLastIndexOf$default, openFuturesAgreement2.getAgreementName().length() + iLastIndexOf$default, 17);
                            string = str.substring(0, iLastIndexOf$default);
                            Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
                        }
                    }
                }
                C36859w c36859wM25171D5 = this.this$0.m25171D4();
                if (c36859wM25171D5 != null && (alignTopCheckBox4 = c36859wM25171D5.f81267d) != null) {
                    alignTopCheckBox4.setMovementMethod(LinkMovementMethod.getInstance());
                }
                C36859w c36859wM25171D6 = this.this$0.m25171D4();
                if (c36859wM25171D6 != null && (alignTopCheckBox3 = c36859wM25171D6.f81267d) != null) {
                    alignTopCheckBox3.setText(spannableStringBuilder);
                }
            }
            C36859w c36859wM25171D7 = this.this$0.m25171D4();
            if (c36859wM25171D7 != null && (kcPrimaryButton = c36859wM25171D7.f81265b) != null) {
                final List<OpenFuturesAgreement> list2 = this.$unsignedAgreements;
                final OpenFuturesTradingDialog openFuturesTradingDialog2 = this.this$0;
                C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.futures.dialog.w0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OpenFuturesTradingDialog$initViewAccording$2.m25182i(list2, openFuturesTradingDialog2);
                    }
                }, 1, null);
            }
            C36859w c36859wM25171D8 = this.this$0.m25171D4();
            if (c36859wM25171D8 != null && (alignTopCheckBox2 = c36859wM25171D8.f81267d) != null) {
                final OpenFuturesTradingDialog openFuturesTradingDialog3 = this.this$0;
                C27046k.m66708w(alignTopCheckBox2, new Function2() { // from class: com.kubi.futures.dialog.x0
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return OpenFuturesTradingDialog$initViewAccording$2.m25183j(openFuturesTradingDialog3, (CompoundButton) obj3, ((Boolean) obj4).booleanValue());
                    }
                });
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
