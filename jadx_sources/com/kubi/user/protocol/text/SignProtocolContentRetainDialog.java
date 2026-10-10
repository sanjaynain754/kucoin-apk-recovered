package com.kubi.user.protocol.text;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import c70.C4876i0;
import com.blankj.utilcode.util.C5258a;
import com.kubi.host.HostManager;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.R$color;
import com.kubi.user.R$layout;
import com.kubi.user.R$string;
import com.kubi.user.config.LoginInfoConfig;
import com.kubi.user.loginv2.LoginV2Activity;
import com.kubi.user.protocol.entity.SignProtocolContentItem;
import com.kubi.user.protocol.entity.SignProtocolResult;
import com.kubi.user.utils.a0;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27018c0;
import com.kubi.utils.extensions.C27046k;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import g00.InterfaceC37766r;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: SignProtocolContentRetainDialog.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010(\u001a\u00020\u001dH\u0002J\b\u0010)\u001a\u00020\u001dH\u0002J\b\u0010*\u001a\u00020\u001dH\u0002J\b\u0010+\u001a\u00020\u001dH\u0002J\u0012\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000bH\u0002J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u0010H\u0002J\b\u00100\u001a\u00020\u0012H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u00062"}, m90084d2 = {"Lcom/kubi/user/protocol/text/SignProtocolContentRetainDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/user/databinding/BusercenterSignProtocolContentRetainDialogBinding;", "getBinding", "()Lcom/kubi/user/databinding/BusercenterSignProtocolContentRetainDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "baseSupportUrl", "", "getBaseSupportUrl", "()Ljava/lang/String;", "btnClickCompletable", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/kubi/user/protocol/entity/SignProtocolResult;", "resultDelivered", "", "protocolList", "", "Lcom/kubi/user/protocol/entity/SignProtocolContentItem;", "getProtocolList", "()Ljava/util/List;", "activeIndex", "", "getActiveIndex", "()I", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initProtocolContainer", "initRetainProtocol", "initContinueProtocolButton", "initExitProtocolButton", "getProtocolUrl", "termId", "deliverResult", DbParams.KEY_CHANNEL_RESULT, "handleRecreatedAndJumpMain", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSignProtocolContentRetainDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignProtocolContentRetainDialog.kt\ncom/kubi/user/protocol/text/SignProtocolContentRetainDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,213:1\n143#2,20:214\n*S KotlinDebug\n*F\n+ 1 SignProtocolContentRetainDialog.kt\ncom/kubi/user/protocol/text/SignProtocolContentRetainDialog\n*L\n74#1:214,20\n*E\n"})
public final class SignProtocolContentRetainDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f53748q0 = C45681e.m100799e(this, new Function1<SignProtocolContentRetainDialog, C4876i0>() { // from class: com.kubi.user.protocol.text.SignProtocolContentRetainDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4876i0 invoke(@NotNull SignProtocolContentRetainDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4876i0.m5030a(fragment.requireView());
        }
    }, new Function1<C4876i0, Unit>() { // from class: com.kubi.user.protocol.text.SignProtocolContentRetainDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C4876i0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4876i0 c4876i0) {
            invoke(c4876i0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final InterfaceC41769w<SignProtocolResult> f53749r0 = C41777y.m91388c(null, 1, null);

    /* JADX INFO: renamed from: s0 */
    public boolean f53750s0;

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ KProperty<Object>[] f53747u0 = {Reflection.property1(new PropertyReference1Impl(SignProtocolContentRetainDialog.class, "binding", "getBinding()Lcom/kubi/user/databinding/BusercenterSignProtocolContentRetainDialogBinding;", 0))};

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public static final Companion f53746t0 = new Companion(null);

    /* JADX INFO: compiled from: SignProtocolContentRetainDialog.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ$\u0010\u0010\u001a\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/user/protocol/text/SignProtocolContentRetainDialog$Companion;", "", "<init>", "()V", "FRAGMENT_TAG", "", "PAGE_ID", "ARG_PROTOCOL_LIST", "ARG_ACTIVE_INDEX", "newInstance", "Lcom/kubi/user/protocol/text/SignProtocolContentRetainDialog;", "protocolList", "", "Lcom/kubi/user/protocol/entity/SignProtocolContentItem;", "activeIndex", "", TIMPushProvider.f75062n, "Lcom/kubi/user/protocol/entity/SignProtocolResult;", "(Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final SignProtocolContentRetainDialog newInstance(@NotNull List<SignProtocolContentItem> protocolList, int activeIndex) {
            Intrinsics.checkNotNullParameter(protocolList, "protocolList");
            SignProtocolContentRetainDialog signProtocolContentRetainDialog = new SignProtocolContentRetainDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("arg_protocol_list", new ArrayList<>(protocolList));
            bundle.putInt("arg_active_index", activeIndex);
            signProtocolContentRetainDialog.setArguments(bundle);
            return signProtocolContentRetainDialog;
        }

        @Nullable
        public final Object show(@NotNull List<SignProtocolContentItem> list, int i11, @NotNull Continuation<? super SignProtocolResult> continuation) {
            FragmentActivity fragmentActivity;
            Activity activityM6125h = C5258a.m6125h();
            if (activityM6125h instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) activityM6125h;
            } else {
                fragmentActivity = null;
            }
            if (fragmentActivity != null && !fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
                SignProtocolContentRetainDialog signProtocolContentRetainDialogNewInstance = newInstance(list, i11);
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                signProtocolContentRetainDialogNewInstance.show(supportFragmentManager, "SignProtocolContentRetainDialog");
                return signProtocolContentRetainDialogNewInstance.f53749r0.mo91198h(continuation);
            }
            return SignProtocolResult.EXIT;
        }
    }

    /* JADX INFO: renamed from: com.kubi.user.protocol.text.SignProtocolContentRetainDialog$a */
    /* JADX INFO: compiled from: SignProtocolContentRetainDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/user/protocol/text/SignProtocolContentRetainDialog$initRetainProtocol$1$1", "Lcom/kubi/utils/MyClickSpan;", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26763a extends C27018c0 {
        @Override // com.kubi.utils.C27018c0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            ds2.setUnderlineText(false);
        }

        public C26763a(int i11, ViewOnClickListenerC26764b viewOnClickListenerC26764b) {
            super(i11, viewOnClickListenerC26764b);
        }
    }

    /* JADX INFO: renamed from: com.kubi.user.protocol.text.SignProtocolContentRetainDialog$b */
    /* JADX INFO: compiled from: SignProtocolContentRetainDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/user/protocol/text/SignProtocolContentRetainDialog$initRetainProtocol$1$2", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewOnClickListenerC26764b implements View.OnClickListener {
        public ViewOnClickListenerC26764b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            Intrinsics.checkNotNullParameter(v11, "v");
            C37304a c37304a = C37304a.f82764a;
            SignProtocolContentRetainDialog signProtocolContentRetainDialog = SignProtocolContentRetainDialog.this;
            String termId = ((SignProtocolContentItem) signProtocolContentRetainDialog.m65645t4().get(SignProtocolContentRetainDialog.this.m65651q4())).getTermId();
            if (termId == null) {
                termId = "";
            }
            String strDecode = Uri.decode(signProtocolContentRetainDialog.m65654u4(termId));
            Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
            InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, null, null, null, 126, null);
        }
    }

    /* JADX INFO: renamed from: p4 */
    private final void m65644p4(SignProtocolResult signProtocolResult) {
        if (this.f53750s0) {
            return;
        }
        this.f53750s0 = true;
        if (!this.f53749r0.isCompleted()) {
            this.f53749r0.mo91370n(signProtocolResult);
        }
        dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m65647x4(SignProtocolContentRetainDialog signProtocolContentRetainDialog) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String termId = signProtocolContentRetainDialog.m65645t4().get(signProtocolContentRetainDialog.m65651q4()).getTermId();
        if (termId == null) {
            termId = "";
        }
        jSONObject.put("agreement_ids", termId);
        Unit unit = Unit.INSTANCE;
        C43852m.m96591c("B1login_Agreement_Content_Retain", "Comfirm", null, jSONObject, 4, null);
        signProtocolContentRetainDialog.m65644p4(SignProtocolResult.AGREED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m65649z4(SignProtocolContentRetainDialog signProtocolContentRetainDialog) throws JSONException {
        C44128b.m97261e("SignProtocolContentRetainDialog", "btnExitProtocol login out");
        a0.a("SignProtocolContentRetainDialog btnExitProtocol login out");
        LoginInfoConfig.a.I(false, true);
        JSONObject jSONObject = new JSONObject();
        String termId = signProtocolContentRetainDialog.m65645t4().get(signProtocolContentRetainDialog.m65651q4()).getTermId();
        if (termId == null) {
            termId = "";
        }
        jSONObject.put("agreement_ids", termId);
        Unit unit = Unit.INSTANCE;
        C43852m.m96591c("B1login_Agreement_Content_Retain", "Leave", null, jSONObject, 4, null);
        signProtocolContentRetainDialog.m65644p4(SignProtocolResult.EXIT);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.busercenter_sign_protocol_content_retain_dialog, (ViewGroup) null, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (m65645t4().isEmpty()) {
            return;
        }
        m65637A4();
    }

    /* JADX INFO: renamed from: r4 */
    public final String m65652r4() {
        return HostManager.a.m() + "/support";
    }

    /* JADX INFO: renamed from: s4 */
    public final C4876i0 m65653s4() {
        return (C4876i0) this.f53748q0.getValue(this, f53747u0[0]);
    }

    /* JADX INFO: renamed from: u4 */
    public final String m65654u4(String str) {
        return m65652r4() + '/' + str + "?appNeedLang=true";
    }

    /* JADX INFO: renamed from: A4 */
    private final void m65637A4() throws JSONException {
        if (m65646v4()) {
            return;
        }
        m54191p3();
        m65650B4();
        m65655w4();
        m65648y4();
        JSONObject jSONObject = new JSONObject();
        String termId = m65645t4().get(m65651q4()).getTermId();
        if (termId == null) {
            termId = "";
        }
        jSONObject.put("agreement_ids", termId);
        Unit unit = Unit.INSTANCE;
        C43852m.m96595g("B1login_Agreement_Content_Retain", "Whole_Page", null, jSONObject, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public final List<SignProtocolContentItem> m65645t4() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        ArrayList parcelableArrayList = BundleCompat.getParcelableArrayList(arguments, "arg_protocol_list", SignProtocolContentItem.class);
        if (parcelableArrayList == null) {
            return CollectionsKt.emptyList();
        }
        return parcelableArrayList;
    }

    /* JADX INFO: renamed from: v4 */
    private final boolean m65646v4() {
        LoginV2Activity loginV2Activity;
        LoginV2Activity activity = getActivity();
        if (activity instanceof LoginV2Activity) {
            loginV2Activity = activity;
        } else {
            loginV2Activity = null;
        }
        if (loginV2Activity != null && loginV2Activity.U()) {
            m65644p4(SignProtocolResult.EXIT);
            InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, Boolean.TRUE, null, null, null, 59, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: y4 */
    private final void m65648y4() {
        BaseTextView baseTextView;
        C4876i0 c4876i0M65653s4 = m65653s4();
        if (c4876i0M65653s4 != null && (baseTextView = c4876i0M65653s4.f5150c) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.user.protocol.text.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SignProtocolContentRetainDialog.m65649z4(this.f53773b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: B4 */
    public final void m65650B4() {
        BaseTextView baseTextView;
        C4876i0 c4876i0M65653s4 = m65653s4();
        if (c4876i0M65653s4 != null && (baseTextView = c4876i0M65653s4.f5152e) != null) {
            baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
            baseTextView.setText(getString(R$string.resign_retain_text_policy, m65645t4().get(m65651q4()).getProtocolName()));
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            C27017c c27017c = C27017c.f54310a;
            int i11 = R$color.c_text;
            highlightTextHelper.m54120f(baseTextView, new Pair(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(i11))), new Pair(textTagEnum, new C26763a(i11, new ViewOnClickListenerC26764b())));
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (m65645t4().isEmpty()) {
            m65644p4(SignProtocolResult.EXIT);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final int m65651q4() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return 0;
        }
        return arguments.getInt("arg_active_index", 0);
    }

    /* JADX INFO: renamed from: w4 */
    public final void m65655w4() {
        KcPrimaryButton kcPrimaryButton;
        C4876i0 c4876i0M65653s4 = m65653s4();
        if (c4876i0M65653s4 != null && (kcPrimaryButton = c4876i0M65653s4.f5149b) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.user.protocol.text.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SignProtocolContentRetainDialog.m65647x4(this.f53774b);
                }
            }, 1, null);
        }
    }
}
