package com.kubi.user.signup;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.media3.exoplayer.RendererCapabilities;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.user.R$string;
import com.kubi.user.api.entity.UserTermSubRequest;
import com.kubi.user.api.site.protocol.b;
import com.kubi.user.exception.UserCenterException;
import com.kubi.user.signupv2.create.f0;
import com.kubi.user.utils.w;
import com.kubi.utils.C27017c;
import d70.C36638a;
import e70.InterfaceC37088c;
import f00.C37304a;
import g00.InterfaceC37764p;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SignupExt.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a,\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0000\u001a\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u001a\u0006\u0010\u0012\u001a\u00020\u0013\u001a$\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\b2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0018H\u0000\u001a\u001a\u0010\u0019\u001a\u00020\u001a2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0018H\u0000\u001a\u0006\u0010\u001b\u001a\u00020\n\u001a\u0006\u0010\u001c\u001a\u00020\n\u001a\n\u0010\u001d\u001a\u00020\u0001*\u00020\u001e\u001a\n\u0010\u001f\u001a\u00020\u0001*\u00020\u001e\u001a\f\u0010 \u001a\u00020\u0001*\u00020\u001eH\u0002\u001a\u0006\u0010!\u001a\u00020\u0001\u001a\u0006\u0010\"\u001a\u00020\u0001\u001a\b\u0010#\u001a\u00020\nH\u0002\u001a\b\u0010$\u001a\u00020\bH\u0002¨\u0006%"}, m90084d2 = {"drawableLeft", "", "Landroid/widget/TextView;", "resId", "", "goLogin", "Landroid/app/Activity;", "pageId", "", "isByPhone", "", "accountData", "areaCode", "tryHiddenSoftInput", "ev", "Landroid/view/MotionEvent;", "currentFocus", "Landroid/view/View;", "fetchEmailSuffixs", "Lkotlinx/coroutines/Job;", "coroutineScopeIO", "Lkotlinx/coroutines/CoroutineScope;", "name", "onError", "Lkotlin/Function0;", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getRegisterProtocolDefaultChecked", "getRegisterMarketingProtocolDefaultChecked", "bindRegisterProtocolList", "Lcom/kubi/resources/widget/BaseTextView;", "bindRegisterDialogProtocolList", "bindRegisterTagStyle", "addUserTermSubForRegister", "addMarkerPolicyForRegister", "isRiskDisclosureShow", "getMarketPolicyVersionCode", "UserCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSignupExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignupExt.kt\ncom/kubi/user/signup/SignupExtKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,234:1\n47#2,4:235\n17#3,2:239\n17#3,2:241\n17#3,2:243\n17#3,2:245\n*S KotlinDebug\n*F\n+ 1 SignupExt.kt\ncom/kubi/user/signup/SignupExtKt\n*L\n118#1:235,4\n142#1:239,2\n159#1:241,2\n222#1:243,2\n229#1:245,2\n*E\n"})
public final class SignupExtKt {

    /* JADX INFO: renamed from: com.kubi.user.signup.SignupExtKt$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SignupExt.kt\ncom/kubi/user/signup/SignupExtKt\n+ 3 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,49:1\n119#2,2:50\n121#2,2:60\n57#3,8:52\n*S KotlinDebug\n*F\n+ 1 SignupExt.kt\ncom/kubi/user/signup/SignupExtKt\n*L\n120#1:52,8\n*E\n"})
    public static final class C26794a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function0 f53815b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26794a(CoroutineExceptionHandler.Companion companion, Function0 function0) {
            super(companion);
            this.f53815b = function0;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            Throwable th2;
            Function0 function0 = this.f53815b;
            if (function0 != null) {
                function0.invoke();
            }
            if (C42899b.m94075e(exception)) {
                th2 = exception;
            } else if (C36638a.m81972c(exception)) {
                th2 = exception;
                C43846g.m96568c(new UserCenterException(th2, "SignupExt", true, null, 8, null), null, 2, null);
            } else {
                th2 = exception;
                C36638a.m81973d(th2, "SignupExt");
            }
            C44128b.m97263g("Signup", th2);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final InterfaceC41775x1 m65737j() {
        return C41696j.m91104d(m65735h(null, null, 3, null), null, null, new SignupExtKt$fetchEmailSuffixs$1(null), 3, null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m65729b() {
        UserTermSubRequest.Companion companion = UserTermSubRequest.Companion;
        UserTermSubRequest.Companion.addUserTermSubRequestByTermCode$default(companion, "agreementTerm", (String) null, 2, (Object) null);
        UserTermSubRequest.Companion.addUserTermSubRequestByTermCode$default(companion, "privacyUserTerm", (String) null, 2, (Object) null);
        if (m65742o()) {
            UserTermSubRequest.Companion.addUserTermSubRequestByTermCode$default(companion, "riskDisclosureTerm", (String) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m65730c(@NotNull BaseTextView baseTextView) {
        String strM66516f;
        Intrinsics.checkNotNullParameter(baseTextView, "<this>");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37088c.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h == null || (strM66516f = ((InterfaceC37088c) objM56186h).mo83017f()) == null) {
            C27017c c27017c = C27017c.f54310a;
            strM66516f = c27017c.m66516f(R$string.register_policy_check_popup_message2, c27017c.m66516f(R$string.service_protocol, new Object[0]), c27017c.m66516f(R$string.privacy_policy, new Object[0]));
        }
        baseTextView.setText(strM66516f);
        baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
        m65732e(baseTextView);
    }

    /* JADX INFO: renamed from: d */
    public static final void m65731d(@NotNull BaseTextView baseTextView) {
        String strM66516f;
        Intrinsics.checkNotNullParameter(baseTextView, "<this>");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37088c.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h == null || (strM66516f = ((InterfaceC37088c) objM56186h).mo83014c()) == null) {
            C27017c c27017c = C27017c.f54310a;
            strM66516f = c27017c.m66516f(R$string.register_terms_of_use_and_privacy_policy, c27017c.m66516f(R$string.service_protocol, new Object[0]), c27017c.m66516f(R$string.privacy_policy, new Object[0]));
        }
        baseTextView.setText(strM66516f);
        baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
        m65732e(baseTextView);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final CoroutineExceptionHandler m65733f(@Nullable Function0<Unit> function0) {
        return new C26794a(CoroutineExceptionHandler.INSTANCE, function0);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ InterfaceC41709m0 m65735h(String str, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "scope-user";
        }
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        return m65734g(str, function0);
    }

    /* JADX INFO: renamed from: i */
    public static final void m65736i(@Nullable TextView textView, int i11) {
        try {
            Result.Companion companion = Result.INSTANCE;
            Unit unit = null;
            Drawable drawableM66510d = C27017c.m66510d(C27017c.f54310a, i11, null, 2, null);
            drawableM66510d.setBounds(0, 0, drawableM66510d.getMinimumWidth(), drawableM66510d.getMinimumHeight());
            if (textView != null) {
                textView.setCompoundDrawablesRelative(drawableM66510d, null, null, null);
                unit = Unit.INSTANCE;
            }
            Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: k */
    public static final String m65738k() {
        String strMo83012a;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37088c.class, SiteInfoManager.f47913a.m58109c());
        return (objM56186h == null || (strMo83012a = ((InterfaceC37088c) objM56186h).mo83012a()) == null) ? "" : strMo83012a;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m65739l() {
        return C24129b.m58030b(SiteVisibleConfigKey.MarketTermsConditions);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m65740m() {
        return C24129b.m58030b(SiteVisibleConfigKey.TermsConditions);
    }

    /* JADX INFO: renamed from: n */
    public static final void m65741n(@NotNull Activity activity, @NotNull String pageId, boolean z11, @NotNull String accountData, @NotNull String areaCode) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(accountData, "accountData");
        Intrinsics.checkNotNullParameter(areaCode, "areaCode");
        C43852m.m96591c(pageId, FirebaseAnalytics.Event.LOGIN, "1", null, 8, null);
        w wVar = w.a;
        wVar.l(true);
        InterfaceC37764p.a.m85181b(C37304a.f82764a, Boolean.valueOf(z11), accountData, areaCode, Boolean.valueOf(wVar.b()), Boolean.valueOf(wVar.d()), wVar.g(), C43852m.m96601m(pageId, FirebaseAnalytics.Event.LOGIN, "1"), null, null, RendererCapabilities.DECODER_SUPPORT_MASK, null);
        activity.finish();
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m65742o() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37088c.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC37088c) objM56186h).mo83013b();
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m65743p(@NotNull MotionEvent ev2, @Nullable View view) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (view instanceof EditText) {
            int[] iArr = {0, 0};
            EditText editText = (EditText) view;
            editText.getLocationOnScreen(iArr);
            boolean z11 = ev2.getX() > ((float) iArr[0]) && ev2.getX() < ((float) (iArr[0] + editText.getWidth()));
            boolean z12 = ev2.getY() > ((float) iArr[1]) && ev2.getY() < ((float) (iArr[1] + editText.getHeight()));
            if (!z11 || !z12) {
                try {
                    KeyboardUtils.m6034f(view);
                    return true;
                } catch (Exception e11) {
                    C44128b.m97263g("tryHiddenSoftInput", e11);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static final void m65728a() {
        String strM65738k = m65738k();
        if (strM65738k.length() > 0) {
            UserTermSubRequest.Companion.addUserTermSubRequestByTermCode("marketingMsgAuthoriseTerm", strM65738k);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m65732e(BaseTextView baseTextView) {
        if (m65742o()) {
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            b bVar = b.a;
            highlightTextHelper.m54120f(baseTextView, new Pair(textTagEnum, new f0(bVar.d())), new Pair(HighlightTextHelper.TextTagEnum.SPAN1, new f0(bVar.a())), new Pair(HighlightTextHelper.TextTagEnum.SPAN2, new f0(bVar.c())));
            return;
        }
        HighlightTextHelper highlightTextHelper2 = HighlightTextHelper.f43497a;
        HighlightTextHelper.TextTagEnum textTagEnum2 = HighlightTextHelper.TextTagEnum.SPAN;
        b bVar2 = b.a;
        highlightTextHelper2.m54120f(baseTextView, new Pair(textTagEnum2, new f0(bVar2.d())), new Pair(HighlightTextHelper.TextTagEnum.SPAN1, new f0(bVar2.a())));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final InterfaceC41709m0 m65734g(@NotNull String name, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        return C41713n0.m91125a(new CoroutineName(name).plus(C42911a.m94120b()).plus(m65733f(function0)));
    }
}
