package com.kubi.p072ad.service;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.app.p073ad.R$color;
import com.kubi.app.p073ad.R$id;
import com.kubi.app.p073ad.R$layout;
import com.kubi.app.p073ad.R$string;
import com.kubi.launch.helper.SensorAbConfigHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.api.site.protocol.b;
import com.kubi.utils.C27012a;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27018c0;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.extensions.core.ViewExtKt;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseViewHolder;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: ProtocolGuide.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0006H\u0002J\r\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000fJ\b\u0010\u0010\u001a\u00020\nH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/ad/service/ProtocolGuide;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "callBack", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "agree", "", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function1;)V", "isAgreed", "checkGuide", "checkGuide$AdLib_googleRelease", "showStep1", "showStep2", "preformNext", "getFullProtocol", "", "Companion", "AdLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ProtocolGuide {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f14937c = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FragmentActivity f14938a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function1<Boolean, Unit> f14939b;

    /* JADX INFO: compiled from: ProtocolGuide.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/ad/service/ProtocolGuide$Companion;", "", "<init>", "()V", "TAG", "", "AB_TEST_TIMEOUT", "", "AdLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtocolGuide(@NotNull FragmentActivity activity, @NotNull Function1<? super Boolean, Unit> callBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.f14938a = activity;
        this.f14939b = callBack;
    }

    /* JADX INFO: renamed from: l */
    public static final void m14664l(View view) {
        C37304a c37304a = C37304a.f82764a;
        String strDecode = Uri.decode(b.a.b());
        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
        InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: m */
    public static final void m14665m(View view) {
        C37304a c37304a = C37304a.f82764a;
        String strDecode = Uri.decode(b.a.e());
        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
        InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m14666q(final ProtocolGuide protocolGuide, final InterfaceC41769w interfaceC41769w, BaseViewHolder holder, final DialogFragmentHelper dialog) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        C44128b.m97259c("ProtocolGuide", "[showStep1] Listener called. holder is null:false, activity:" + protocolGuide.f14938a);
        C43852m.m96595g("BTsplashPage", "safePolicyPopUp", "1", null, 8, null);
        C43852m.m96595g("BTsplashPage", "safePolicyPopUp", "2", null, 8, null);
        dialog.setCancelable(false);
        TextView textView = (TextView) holder.getView(R$id.title);
        if (textView != null) {
            textView.setText(R$string.splash_protocol_title);
        }
        TextView textView2 = (TextView) holder.getView(R$id.content);
        if (textView2 != null) {
            textView2.setText(R$string.splash_protocol_step1_content);
        }
        TextView textView3 = (TextView) holder.getView(R$id.footer);
        if (textView3 != null) {
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            textView3.setText(protocolGuide.m14673k());
        }
        final KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) holder.getView(R$id.agree);
        if (kcPrimaryButton != null) {
            kcPrimaryButton.setText(C27017c.f54310a.m66516f(R$string.splash_protocol_agree, new Object[0]));
            ViewExtKt.m66575f(kcPrimaryButton, new Function1() { // from class: com.kubi.ad.service.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProtocolGuide.m14667r(dialog, protocolGuide, interfaceC41769w, kcPrimaryButton, (View) obj);
                }
            });
        }
        TextView textView4 = (TextView) holder.getView(R$id.disagree);
        if (textView4 != null) {
            textView4.setText(C27017c.f54310a.m66516f(R$string.splash_protocol_disagree, new Object[0]));
            ViewExtKt.m66575f(textView4, new Function1() { // from class: com.kubi.ad.service.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProtocolGuide.m14668s(dialog, protocolGuide, (View) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static final Unit m14667r(DialogFragmentHelper dialogFragmentHelper, ProtocolGuide protocolGuide, InterfaceC41769w interfaceC41769w, KcPrimaryButton kcPrimaryButton, View it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c("BTsplashPage", "safePolicyPopUp", "1", null, 8, null);
        SensorAbConfigHelper sensorAbConfigHelper = SensorAbConfigHelper.f31790a;
        if (!sensorAbConfigHelper.m37469j()) {
            dialogFragmentHelper.dismissAllowingStateLoss();
            protocolGuide.m14675o(true);
            return Unit.INSTANCE;
        }
        if (interfaceC41769w.isCompleted() && !interfaceC41769w.isCancelled()) {
            C44128b.m97259c("ProtocolGuide", "ABTest 结果已就绪，直接执行，无需 loading");
            sensorAbConfigHelper.m37473n(((Boolean) interfaceC41769w.mo91197b()).booleanValue());
            if (sensorAbConfigHelper.m37471l()) {
                sensorAbConfigHelper.m37465f();
            } else {
                sensorAbConfigHelper.m37466g();
            }
            dialogFragmentHelper.dismissAllowingStateLoss();
            protocolGuide.m14675o(true);
        } else if (interfaceC41769w.isCancelled()) {
            C44128b.m97259c("ProtocolGuide", "ABTest 请求已取消，降级为旧流程");
            sensorAbConfigHelper.m37464e("fetch_failed");
            dialogFragmentHelper.dismissAllowingStateLoss();
            protocolGuide.m14675o(true);
        } else {
            C44128b.m97259c("ProtocolGuide", "ABTest 结果尚未返回，showLoading 等待，最多 4 秒超时后仍继续");
            kcPrimaryButton.m55043o();
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(protocolGuide.f14938a), null, null, new ProtocolGuide$showStep1$1$2$1$1(kcPrimaryButton, dialogFragmentHelper, protocolGuide, interfaceC41769w, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m14668s(DialogFragmentHelper dialogFragmentHelper, ProtocolGuide protocolGuide, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c("BTsplashPage", "safePolicyPopUp", "2", null, 8, null);
        dialogFragmentHelper.dismissAllowingStateLoss();
        protocolGuide.m14677t();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m14669u(final ProtocolGuide protocolGuide, BaseViewHolder holder, final DialogFragmentHelper dialog) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        C44128b.m97259c("ProtocolGuide", "[showStep2] Listener called. holder is null:false, activity:" + protocolGuide.f14938a);
        C43852m.m96595g("BTsplashPage", "safePolicySavePopUp", "1", null, 8, null);
        C43852m.m96595g("BTsplashPage", "safePolicySavePopUp", "2", null, 8, null);
        dialog.setCancelable(false);
        TextView textView = (TextView) holder.getView(R$id.title);
        if (textView != null) {
            textView.setText(R$string.splash_protocol_title);
        }
        TextView textView2 = (TextView) holder.getView(R$id.content);
        if (textView2 != null) {
            textView2.setText(R$string.splash_protocol_step2_content);
        }
        TextView textView3 = (TextView) holder.getView(R$id.footer);
        if (textView3 != null) {
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            textView3.setText(protocolGuide.m14673k());
        }
        TextView textView4 = (TextView) holder.getView(R$id.agree);
        if (textView4 != null) {
            textView4.setText(C27017c.f54310a.m66516f(R$string.splash_protocol_agree, new Object[0]));
            ViewExtKt.m66575f(textView4, new Function1() { // from class: com.kubi.ad.service.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProtocolGuide.m14671w(dialog, protocolGuide, (View) obj);
                }
            });
        }
        TextView textView5 = (TextView) holder.getView(R$id.disagree);
        if (textView5 != null) {
            textView5.setText(C27017c.f54310a.m66516f(R$string.splash_protocol_disagree_exit, new Object[0]));
            ViewExtKt.m66575f(textView5, new Function1() { // from class: com.kubi.ad.service.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProtocolGuide.m14670v(dialog, protocolGuide, (View) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m14670v(DialogFragmentHelper dialogFragmentHelper, ProtocolGuide protocolGuide, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c("BTsplashPage", "safePolicySavePopUp", "2", null, 8, null);
        dialogFragmentHelper.dismissAllowingStateLoss();
        protocolGuide.m14675o(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m14671w(DialogFragmentHelper dialogFragmentHelper, ProtocolGuide protocolGuide, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c("BTsplashPage", "safePolicySavePopUp", "1", null, 8, null);
        dialogFragmentHelper.dismissAllowingStateLoss();
        protocolGuide.m14675o(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final CharSequence m14673k() {
        C27017c c27017c = C27017c.f54310a;
        String strM66516f = c27017c.m66516f(R$string.splash_privacy_policy, new Object[0]);
        String strM66516f2 = c27017c.m66516f(R$string.splash_service_protocol, new Object[0]);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c27017c.m66516f(R$string.splash_protocol_read_full_version, strM66516f, strM66516f2));
        int i11 = R$color.primary;
        C27018c0 c27018c0 = new C27018c0(i11, new View.OnClickListener() { // from class: com.kubi.ad.service.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProtocolGuide.m14664l(view);
            }
        });
        C27018c0 c27018c1 = new C27018c0(i11, new View.OnClickListener() { // from class: com.kubi.ad.service.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProtocolGuide.m14665m(view);
            }
        });
        int iLastIndexOf = StringsKt.lastIndexOf((CharSequence) spannableStringBuilder, strM66516f, spannableStringBuilder.length() - 1, false);
        spannableStringBuilder.setSpan(c27018c0, iLastIndexOf, strM66516f.length() + iLastIndexOf, 33);
        int iLastIndexOf2 = StringsKt.lastIndexOf((CharSequence) spannableStringBuilder, strM66516f2, spannableStringBuilder.length() - 1, false);
        spannableStringBuilder.setSpan(c27018c1, iLastIndexOf2, strM66516f2.length() + iLastIndexOf2, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m14674n() {
        return DataMapUtil.f54245a.m66370a("AGREE_PROTOCOL", false);
    }

    /* JADX INFO: renamed from: o */
    public final void m14675o(boolean z11) {
        if (z11) {
            DataMapUtil.f54245a.m66377l("AGREE_PROTOCOL", true);
        } else {
            C27012a.m66486i().m66490d();
        }
        this.f14939b.invoke(Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: p */
    public final void m14676p() {
        if (this.f14938a.isFinishing() || this.f14938a.isDestroyed()) {
            this.f14939b.invoke(Boolean.TRUE);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[showStep1] activity:");
        sb2.append(this.f14938a);
        sb2.append(". layoutId:");
        int i11 = R$layout.dialog_protocol_guide;
        sb2.append(i11);
        C44128b.m97259c("ProtocolGuide", sb2.toString());
        final InterfaceC41769w<Boolean> interfaceC41769wM37476s = SensorAbConfigHelper.f31790a.m37476s();
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, i11, 3, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.ad.service.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ProtocolGuide.m14666q(this.f14944b, interfaceC41769wM37476s, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager supportFragmentManager = this.f14938a.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(supportFragmentManager, "step1_dialog");
    }

    /* JADX INFO: renamed from: t */
    public final void m14677t() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[showStep2] activity:");
        sb2.append(this.f14938a);
        sb2.append(". layoutId:");
        int i11 = R$layout.dialog_protocol_guide;
        sb2.append(i11);
        C44128b.m97259c("ProtocolGuide", sb2.toString());
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, i11, 3, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.ad.service.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ProtocolGuide.m14669u(this.f14952b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager supportFragmentManager = this.f14938a.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(supportFragmentManager, "step2_dialog");
    }

    /* JADX INFO: renamed from: j */
    public final void m14672j() {
        if (m14674n()) {
            m14675o(true);
        } else {
            m14676p();
        }
    }
}
