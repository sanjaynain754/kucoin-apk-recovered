package com.kubi.payment.p2p.trade.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.p2p.trade.view.P2PExpressQuestionDialog;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: P2PExpressQuestionDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/view/P2PExpressQuestionDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "<init>", "()V", "videoUrl", "", FirebaseAnalytics.Param.CURRENCY, "onAttach", "", "context", "Landroid/content/Context;", "setupView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nP2PExpressQuestionDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2PExpressQuestionDialog.kt\ncom/kubi/payment/p2p/trade/view/P2PExpressQuestionDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
public final class P2PExpressQuestionDialog extends DialogFragmentHelper implements DialogFragmentHelper.InterfaceC22882b {

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f40141s0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public String f40142q0;

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public String f40143r0;

    /* JADX INFO: compiled from: P2PExpressQuestionDialog.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/view/P2PExpressQuestionDialog$Companion;", "", "<init>", "()V", "KEY_IS_BOTTOM_SHEET", "", "KEY_LAYOUT", "KEY_VIDEO_URL", "KEY_CURRENCY", TIMPushProvider.f75062n, "", FirebaseAnalytics.Param.CURRENCY, "videoUrl", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@Nullable String currency, @Nullable String videoUrl, @NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            P2PExpressQuestionDialog p2PExpressQuestionDialog = new P2PExpressQuestionDialog();
            Bundle bundle = new Bundle();
            bundle.putBoolean("isBottomSheet", true);
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.payment_dialog_p2p_express_question);
            bundle.putString("videoUrl", videoUrl);
            bundle.putString(FirebaseAnalytics.Param.CURRENCY, currency);
            p2PExpressQuestionDialog.setArguments(bundle);
            p2PExpressQuestionDialog.show(fragmentManager, "payment_dialog_p2p_express_question");
        }
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m49401n4(final P2PExpressQuestionDialog p2PExpressQuestionDialog) {
        String str = p2PExpressQuestionDialog.f40142q0;
        if (str == null || str.length() == 0) {
            return Unit.INSTANCE;
        }
        final Intent intentAddFlags = new Intent("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").addFlags(268435456);
        intentAddFlags.setData(Uri.parse(p2PExpressQuestionDialog.f40142q0));
        C27100x0.m66924e(new Function0() { // from class: gu.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PExpressQuestionDialog.m49402o4(this.f85643b, intentAddFlags);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
    /* JADX INFO: renamed from: b3 */
    public void mo16191b3(@NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        View view = viewHolder.getView(R$id.tvConfirm);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: gu.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PExpressQuestionDialog.m49400m4(this.f85641b);
            }
        }, 1, null);
        BaseTextView baseTextView = (BaseTextView) viewHolder.getView(R$id.tv_watch_video);
        baseTextView.getPaint().setFlags(baseTextView.getPaint().getFlags() | 8);
        baseTextView.getPaint().setUnderlineText(true);
        baseTextView.setText(baseTextView.getText());
        Intrinsics.checkNotNull(baseTextView);
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: gu.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PExpressQuestionDialog.m49401n4(this.f85642b);
            }
        }, 1, null);
        BaseTextView baseTextView2 = (BaseTextView) viewHolder.getView(R$id.tv_receive_desc);
        int i11 = R$string.payment_p2p_express_receive_desc;
        String str = this.f40143r0;
        baseTextView2.setText(getString(i11, str, str));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        m54236e4(this);
        Bundle arguments = getArguments();
        this.f40142q0 = arguments != null ? RouteExKt.m56284y(arguments, "videoUrl") : null;
        Bundle arguments2 = getArguments();
        this.f40143r0 = C27041f.m66668h(arguments2 != null ? RouteExKt.m56284y(arguments2, FirebaseAnalytics.Param.CURRENCY) : null);
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m49400m4(P2PExpressQuestionDialog p2PExpressQuestionDialog) {
        p2PExpressQuestionDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m49402o4(P2PExpressQuestionDialog p2PExpressQuestionDialog, Intent intent) {
        p2PExpressQuestionDialog.startActivity(intent);
        return Unit.INSTANCE;
    }
}
