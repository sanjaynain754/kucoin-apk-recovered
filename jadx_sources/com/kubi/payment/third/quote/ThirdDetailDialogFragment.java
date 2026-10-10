package com.kubi.payment.third.quote;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5258a;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.third.data.entities.PayChannelSelect;
import com.kubi.payment.third.data.entities.PayDetail;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p778xy.C46338a;
import p778xy.C46341d;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: ThirdDetailDialogFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0002*+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0001H\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J2\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002J\u0010\u0010$\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0006H\u0002J\u0010\u0010'\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010(\u001a\u00020 2\b\b\u0001\u0010)\u001a\u00020 H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006,"}, m90084d2 = {"Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "<init>", "()V", "fiatSelected", "", "currencySelected", "payMethodIdSelected", "payChannelSelected", "Lcom/kubi/payment/third/data/entities/PayChannelSelect;", "checkSimplexKycAction", "Lkotlin/Function0;", "", "createOrderAction", "dialogContext", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getDialogContext", "()Landroid/content/Context;", "dialogContext$delegate", "Lkotlin/Lazy;", "setupView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "helper", "handleCoinTRStatement", "statementView", "Landroid/widget/TextView;", "handleTreasuraStatement", "handleStatement", "statementResId", "", "channelUrl", "termsUrl", "privacyUrl", "handleBanxaStatement", "viewRemotePdf", "url", "handleLegendTradingStatement", "getColorRes", "id", "SimpleClickableSpan", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ThirdDetailDialogFragment extends DialogFragmentHelper implements DialogFragmentHelper.InterfaceC22882b {

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public static final Companion f40248x0 = new Companion(null);

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public String f40251s0;

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public PayChannelSelect f40252t0;

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public Function0<Unit> f40253u0;

    /* JADX INFO: renamed from: v0 */
    @Nullable
    public Function0<Unit> f40254v0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public String f40249q0 = "";

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public String f40250r0 = "";

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f40255w0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.third.quote.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ThirdDetailDialogFragment.m49628v4(this.f40308b);
        }
    });

    /* JADX INFO: compiled from: ThirdDetailDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment;", "fiatSelected", "", "currencySelected", "payMethodIdSelected", "payChannelSelected", "Lcom/kubi/payment/third/data/entities/PayChannelSelect;", "checkSimplexKycAction", "Lkotlin/Function0;", "", "createOrderAction", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ThirdDetailDialogFragment newInstance(@Nullable String fiatSelected, @Nullable String currencySelected, @Nullable String payMethodIdSelected, @Nullable PayChannelSelect payChannelSelected, @Nullable Function0<Unit> checkSimplexKycAction, @Nullable Function0<Unit> createOrderAction) {
            ThirdDetailDialogFragment thirdDetailDialogFragment = new ThirdDetailDialogFragment();
            thirdDetailDialogFragment.f40249q0 = C27041f.m66668h(fiatSelected);
            thirdDetailDialogFragment.f40250r0 = C27041f.m66668h(currencySelected);
            thirdDetailDialogFragment.f40251s0 = payMethodIdSelected;
            thirdDetailDialogFragment.f40252t0 = payChannelSelected;
            thirdDetailDialogFragment.f40253u0 = checkSimplexKycAction;
            thirdDetailDialogFragment.f40254v0 = createOrderAction;
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.botc_view_third_detail_dialog);
            thirdDetailDialogFragment.setArguments(bundle);
            return thirdDetailDialogFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.third.quote.ThirdDetailDialogFragment$a */
    /* JADX INFO: compiled from: ThirdDetailDialogFragment.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/payment/third/quote/ThirdDetailDialogFragment$SimpleClickableSpan;", "Landroid/text/style/ClickableSpan;", "context", "Landroid/content/Context;", "url", "", "isUnderlineText", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;Z)V", "launchH5", "", "onClick", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21398a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Context f40256b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final String f40257c;

        /* JADX INFO: renamed from: d */
        public final boolean f40258d;

        public C21398a(@NotNull Context context, @NotNull String url, boolean z11) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            this.f40256b = context;
            this.f40257c = url;
            this.f40258d = z11;
        }

        /* JADX INFO: renamed from: a */
        public final void m49636a(String str) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, str, null, null, null, null, null, null, 126, null);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            m49636a(this.f40257c);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            ds2.setColor(ContextCompat.getColor(this.f40256b, R$color.emphasis60));
            ds2.setUnderlineText(this.f40258d);
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.third.quote.ThirdDetailDialogFragment$b */
    /* JADX INFO: compiled from: ThirdDetailDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/third/quote/ThirdDetailDialogFragment$handleBanxaStatement$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21399b extends ClickableSpan {
        public C21399b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            InterfaceC37766r.a.m85190a(C37304a.f82764a, "https://banxa.com", null, null, null, null, null, null, 126, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            ds2.setColor(ThirdDetailDialogFragment.this.getColorRes(R$color.emphasis60));
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.third.quote.ThirdDetailDialogFragment$c */
    /* JADX INFO: compiled from: ThirdDetailDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/third/quote/ThirdDetailDialogFragment$handleBanxaStatement$1$2", "Landroid/text/style/ClickableSpan;", "onClick", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21400c extends ClickableSpan {
        public C21400c() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            ThirdDetailDialogFragment.this.m49631F4("https://banxa.com/terms");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            ds2.setColor(ThirdDetailDialogFragment.this.getColorRes(R$color.emphasis60));
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.third.quote.ThirdDetailDialogFragment$d */
    /* JADX INFO: compiled from: ThirdDetailDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/third/quote/ThirdDetailDialogFragment$handleBanxaStatement$1$3", "Landroid/text/style/ClickableSpan;", "onClick", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21401d extends ClickableSpan {
        public C21401d() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            ThirdDetailDialogFragment.this.m49631F4("https://banxa.com/privacy-and-cookies-policy");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            ds2.setColor(ThirdDetailDialogFragment.this.getColorRes(R$color.emphasis60));
        }
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m49614D4(View view, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        view.setEnabled(z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public final void m49630B4(TextView textView) {
        m49629A4(textView, R$string.payment_third_treasura_disclaimer, "https://www.trytreasura.com", "https://trytreasura.com/terms-and-conditions", "https://trytreasura.com/privacy-policy");
    }

    /* JADX INFO: renamed from: F4 */
    public final void m49631F4(String str) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, "https://docs.google.com/gview?embedded=true&url=" + str, null, null, null, null, null, null, 126, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0134  */
    /* JADX WARN: Code duplicated, block: B:57:0x0138  */
    /* JADX WARN: Code duplicated, block: B:58:0x013d  */
    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
    /* JADX INFO: renamed from: b3 */
    public void mo16191b3(@NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper helper) {
        PayChannelSelect payChannelSelect;
        String disclaimer;
        PayDetail payDetail;
        PayDetail payDetail2;
        BigDecimal payFiatCurrencyAmount;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        int i11 = R$id.tv_fiat;
        C27096v0 c27096v0 = new C27096v0();
        PayChannelSelect payChannelSelect2 = this.f40252t0;
        String strM66669i = C27041f.m66669i((payChannelSelect2 == null || (payDetail2 = payChannelSelect2.getPayDetail()) == null || (payFiatCurrencyAmount = payDetail2.getPayFiatCurrencyAmount()) == null) ? null : payFiatCurrencyAmount.toPlainString(), "--");
        int i12 = R$color.emphasis;
        C27096v0 c27096v0M66905e = c27096v0.m66905e(strM66669i, getColorRes(i12));
        String str = ' ' + C27041f.m66668h(this.f40249q0);
        int i13 = R$color.emphasis60;
        viewHolder.setText(i11, c27096v0M66905e.m66905e(str, getColorRes(i13)));
        int i14 = R$id.tv_amount;
        C27096v0 c27096v1 = new C27096v0();
        PayChannelSelect payChannelSelect3 = this.f40252t0;
        viewHolder.setText(i14, c27096v1.m66905e(C27041f.m66669i(payChannelSelect3 != null ? payChannelSelect3.getCurrencyAmount() : null, "--"), getColorRes(i12)).m66905e(' ' + C27041f.m66668h(this.f40250r0), getColorRes(i13)));
        int i15 = R$id.tv_account;
        PayChannelSelect payChannelSelect4 = this.f40252t0;
        viewHolder.setText(i15, C27041f.m66668h((payChannelSelect4 == null || (payDetail = payChannelSelect4.getPayDetail()) == null) ? null : payDetail.getAccount()));
        int i16 = R$id.tv_statement;
        TextView textView = (TextView) viewHolder.getView(i16);
        PayChannelSelect payChannelSelect5 = this.f40252t0;
        String channel = payChannelSelect5 != null ? payChannelSelect5.getChannel() : null;
        if (channel != null) {
            switch (channel) {
                case "banxa_au":
                    Intrinsics.checkNotNull(textView);
                    m49633x4(textView);
                    break;
                case "cointr":
                    Intrinsics.checkNotNull(textView);
                    m49634y4(textView);
                    break;
                case "onramp":
                    PayChannelSelect payChannelSelect6 = this.f40252t0;
                    textView.setText(C27041f.m66668h(payChannelSelect6 != null ? payChannelSelect6.getDisclaimer() : null));
                    break;
                case "legendtrading":
                    Intrinsics.checkNotNull(textView);
                    m49635z4(textView);
                    break;
                case "banxa":
                    Intrinsics.checkNotNull(textView);
                    m49633x4(textView);
                    break;
                case "treasura":
                    Intrinsics.checkNotNull(textView);
                    m49630B4(textView);
                    break;
                default:
                    payChannelSelect = this.f40252t0;
                    if (payChannelSelect != null) {
                        disclaimer = payChannelSelect.getDisclaimer();
                    } else {
                        disclaimer = null;
                    }
                    viewHolder.setText(i16, C27041f.m66668h(disclaimer));
                    break;
            }
        } else {
            payChannelSelect = this.f40252t0;
            if (payChannelSelect != null) {
                disclaimer = payChannelSelect.getDisclaimer();
            } else {
                disclaimer = null;
            }
            viewHolder.setText(i16, C27041f.m66668h(disclaimer));
        }
        C46341d c46341dM102151a = C46338a.m102151a(m49632w4());
        PayChannelSelect payChannelSelect7 = this.f40252t0;
        c46341dM102151a.mo6634v(payChannelSelect7 != null ? payChannelSelect7.getIconUrl() : null).m6594E0((ImageView) viewHolder.getView(R$id.iv_channel));
        final View view = viewHolder.getView(R$id.tv_buy);
        View view2 = viewHolder.getView(R$id.iv_cancel);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.payment.third.quote.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThirdDetailDialogFragment.m49613C4(this.f40303b);
            }
        }, 1, null);
        View view3 = viewHolder.getView(R$id.cb_check);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66708w((CompoundButton) view3, new Function2() { // from class: com.kubi.payment.third.quote.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ThirdDetailDialogFragment.m49614D4(view, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
            }
        });
        Intrinsics.checkNotNull(view);
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.payment.third.quote.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThirdDetailDialogFragment.m49615E4(this.f40307b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: w4 */
    public final Context m49632w4() {
        return (Context) this.f40255w0.getValue();
    }

    /* JADX INFO: renamed from: x4 */
    public final void m49633x4(TextView textView) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        C27096v0 c27096v0 = new C27096v0();
        String string = getString(R$string.payment_terms);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R$string.payment_privacy);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = getString(R$string.payment_banxa_statement, "https://banxa.com", string, string2);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        c27096v0.append(string3);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) string3, "https://banxa.com", 0, false, 6, (Object) null);
        int i11 = iIndexOf$default + 17;
        c27096v0.setSpan(new UnderlineSpan(), iIndexOf$default, i11, 33);
        c27096v0.setSpan(new C21399b(), iIndexOf$default, i11, 18);
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) string3, string, 0, false, 6, (Object) null);
        int length = string.length() + iIndexOf$default2;
        c27096v0.setSpan(new UnderlineSpan(), iIndexOf$default2, length, 33);
        c27096v0.setSpan(new C21400c(), iIndexOf$default2, length, 18);
        int iIndexOf$default3 = StringsKt.indexOf$default((CharSequence) string3, string2, 0, false, 6, (Object) null);
        int length2 = string2.length() + iIndexOf$default3;
        c27096v0.setSpan(new UnderlineSpan(), iIndexOf$default3, length2, 33);
        c27096v0.setSpan(new C21401d(), iIndexOf$default3, length2, 18);
        textView.setText(c27096v0);
    }

    /* JADX INFO: renamed from: y4 */
    public final void m49634y4(TextView textView) {
        m49629A4(textView, R$string.payment_3d_disclaimer_cointr, "https://cointr.com", "https://support.cointr.com/hc/tr/articles/5538297429903", "https://support.cointr.com/hc/tr/articles/5538328908943");
    }

    /* JADX INFO: renamed from: z4 */
    public final void m49635z4(TextView textView) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        C27096v0 c27096v0 = new C27096v0();
        String string = getString(R$string.payment_terms);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R$string.payment_privacy);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = getString(R$string.payment_3d_statement_template, "https://legendtrading.com", "LegendTrading", "LegendTrading", string, string2, "LegendTrading", "support@legendtrading.com");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        c27096v0.append(string3);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) string3, "https://legendtrading.com", 0, false, 6, (Object) null);
        Context contextM49632w4 = m49632w4();
        Intrinsics.checkNotNullExpressionValue(contextM49632w4, "<get-dialogContext>(...)");
        c27096v0.setSpan(new C21398a(contextM49632w4, "https://legendtrading.com", true), iIndexOf$default, iIndexOf$default + 25, 18);
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) string3, string, 0, false, 6, (Object) null);
        int length = string.length() + iIndexOf$default2;
        Context contextM49632w5 = m49632w4();
        Intrinsics.checkNotNullExpressionValue(contextM49632w5, "<get-dialogContext>(...)");
        c27096v0.setSpan(new C21398a(contextM49632w5, "https://legendtrading.com/terms", true), iIndexOf$default2, length, 18);
        int iIndexOf$default3 = StringsKt.indexOf$default((CharSequence) string3, string2, 0, false, 6, (Object) null);
        int length2 = string2.length() + iIndexOf$default3;
        Context contextM49632w6 = m49632w4();
        Intrinsics.checkNotNullExpressionValue(contextM49632w6, "<get-dialogContext>(...)");
        c27096v0.setSpan(new C21398a(contextM49632w6, "https://legendtrading.com/policy", true), iIndexOf$default3, length2, 18);
        textView.setText(c27096v0);
    }

    public ThirdDetailDialogFragment() {
        m54236e4(this);
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m49613C4(ThirdDetailDialogFragment thirdDetailDialogFragment) {
        thirdDetailDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m49615E4(ThirdDetailDialogFragment thirdDetailDialogFragment) {
        Boolean boolValueOf;
        thirdDetailDialogFragment.dismiss();
        PayChannelSelect payChannelSelect = thirdDetailDialogFragment.f40252t0;
        String channel = null;
        if (payChannelSelect != null) {
            boolValueOf = Boolean.valueOf(payChannelSelect.isSimplex());
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            Function0<Unit> function0 = thirdDetailDialogFragment.f40253u0;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
        Function0<Unit> function1 = thirdDetailDialogFragment.f40254v0;
        if (function1 != null) {
            function1.invoke();
        }
        Pair pairM90091to = TuplesKt.m90091to("fiat", C27041f.m66668h(thirdDetailDialogFragment.f40249q0));
        Pair pairM90091to2 = TuplesKt.m90091to("coin", C27041f.m66668h(thirdDetailDialogFragment.f40250r0));
        Pair pairM90091to3 = TuplesKt.m90091to("PaymentMethod", C27041f.m66668h(thirdDetailDialogFragment.f40251s0));
        PayChannelSelect payChannelSelect2 = thirdDetailDialogFragment.f40252t0;
        if (payChannelSelect2 != null) {
            channel = payChannelSelect2.getChannel();
        }
        C43852m.m96590b("B7ThirdParty", "button", "1", pairM90091to, pairM90091to2, pairM90091to3, TuplesKt.m90091to("PaymentChannel", C27041f.m66668h(channel)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getColorRes(@ColorRes int id2) {
        return ContextCompat.getColor(m49632w4(), id2);
    }

    /* JADX INFO: renamed from: v4 */
    public static final Context m49628v4(ThirdDetailDialogFragment thirdDetailDialogFragment) {
        Context context = thirdDetailDialogFragment.getContext();
        if (context == null) {
            return C5258a.m6125h();
        }
        return context;
    }

    /* JADX INFO: renamed from: A4 */
    public final void m49629A4(TextView textView, @StringRes int i11, String str, String str2, String str3) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(getString(i11, str));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        Context contextM49632w4 = m49632w4();
        Intrinsics.checkNotNullExpressionValue(contextM49632w4, "<get-dialogContext>(...)");
        Pair pair = new Pair(textTagEnum, new C21398a(contextM49632w4, str, true));
        HighlightTextHelper.TextTagEnum textTagEnum2 = HighlightTextHelper.TextTagEnum.SPAN1;
        Context contextM49632w5 = m49632w4();
        Intrinsics.checkNotNullExpressionValue(contextM49632w5, "<get-dialogContext>(...)");
        Pair pair2 = new Pair(textTagEnum2, new C21398a(contextM49632w5, str2, true));
        HighlightTextHelper.TextTagEnum textTagEnum3 = HighlightTextHelper.TextTagEnum.SPAN2;
        Context contextM49632w6 = m49632w4();
        Intrinsics.checkNotNullExpressionValue(contextM49632w6, "<get-dialogContext>(...)");
        highlightTextHelper.m54120f(textView, pair, pair2, new Pair(textTagEnum3, new C21398a(contextM49632w6, str3, true)));
    }
}
