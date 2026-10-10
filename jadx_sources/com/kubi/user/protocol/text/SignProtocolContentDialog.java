package com.kubi.user.protocol.text;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import c70.C4874h0;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.R$layout;
import com.kubi.user.R$string;
import com.kubi.user.api.entity.UserTermSubRequest;
import com.kubi.user.exception.UserCenterMessage;
import com.kubi.user.loginv2.LoginV2Activity;
import com.kubi.user.protocol.entity.SignProtocolContentItem;
import com.kubi.user.protocol.entity.SignProtocolResult;
import com.kubi.user.protocol.helper.SignProtocolHelper;
import com.kubi.utils.C27017c;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: SignProtocolContentDialog.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010(\u001a\u00020\u001dH\u0002J\b\u0010)\u001a\u00020\u001dH\u0002J\b\u0010*\u001a\u00020\u001dH\u0002J\b\u0010+\u001a\u00020\u001dH\u0002J\b\u0010,\u001a\u00020\u001dH\u0002J\b\u0010-\u001a\u00020\u001dH\u0002J\b\u0010.\u001a\u00020\u001dH\u0002J\b\u0010/\u001a\u00020\u001dH\u0002J\u0018\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\u000eH\u0002J\b\u00103\u001a\u00020\u0010H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00065"}, m90084d2 = {"Lcom/kubi/user/protocol/text/SignProtocolContentDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/user/databinding/BusercenterSignProtocolContentDialogBinding;", "getBinding", "()Lcom/kubi/user/databinding/BusercenterSignProtocolContentDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "btnClickCompletable", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlin/Pair;", "Lcom/kubi/user/protocol/entity/SignProtocolResult;", "", "resultDelivered", "", "protocolList", "", "Lcom/kubi/user/protocol/entity/SignProtocolContentItem;", "getProtocolList", "()Ljava/util/List;", "value", "currentRetainProtocolIndex", "getCurrentRetainProtocolIndex", "()I", "setCurrentRetainProtocolIndex", "(I)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initProtocolContainer", "initContainer", "initSignProtocolContentView", "setProtocolTitleTextSize", "setOnProtocolLoadContentListener", "setOnProtocolCheckBoxListener", "setOnNextButtonListener", "setOnExitButtonListener", "deliverResult", DbParams.KEY_CHANNEL_RESULT, "activeIndex", "handleRecreatedAndJumpMain", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSignProtocolContentDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignProtocolContentDialog.kt\ncom/kubi/user/protocol/text/SignProtocolContentDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,237:1\n143#2,20:238\n*S KotlinDebug\n*F\n+ 1 SignProtocolContentDialog.kt\ncom/kubi/user/protocol/text/SignProtocolContentDialog\n*L\n76#1:238,20\n*E\n"})
public final class SignProtocolContentDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f53743q0 = C45681e.m100799e(this, new Function1<SignProtocolContentDialog, C4874h0>() { // from class: com.kubi.user.protocol.text.SignProtocolContentDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4874h0 invoke(@NotNull SignProtocolContentDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4874h0.m5026a(fragment.requireView());
        }
    }, new Function1<C4874h0, Unit>() { // from class: com.kubi.user.protocol.text.SignProtocolContentDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C4874h0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4874h0 c4874h0) {
            invoke(c4874h0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final InterfaceC41769w<Pair<SignProtocolResult, Integer>> f53744r0 = C41777y.m91388c(null, 1, null);

    /* JADX INFO: renamed from: s0 */
    public boolean f53745s0;

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ KProperty<Object>[] f53742u0 = {Reflection.property1(new PropertyReference1Impl(SignProtocolContentDialog.class, "binding", "getBinding()Lcom/kubi/user/databinding/BusercenterSignProtocolContentDialogBinding;", 0))};

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public static final Companion f53741t0 = new Companion(null);

    /* JADX INFO: compiled from: SignProtocolContentDialog.kt */
    @Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ<\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/user/protocol/text/SignProtocolContentDialog$Companion;", "", "<init>", "()V", "FRAGMENT_TAG", "", "PAGE_ID", "ARG_PROTOCOL_LIST", "ARG_ACTIVE_INDEX", "newInstance", "Lcom/kubi/user/protocol/text/SignProtocolContentDialog;", "protocolList", "", "Lcom/kubi/user/protocol/entity/SignProtocolContentItem;", "activeIndex", "", TIMPushProvider.f75062n, "Lkotlin/Pair;", "Lcom/kubi/user/protocol/entity/SignProtocolResult;", "isFromInitStep", "", "(Ljava/util/List;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSignProtocolContentDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignProtocolContentDialog.kt\ncom/kubi/user/protocol/text/SignProtocolContentDialog$Companion\n+ 2 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,237:1\n67#2,2:238\n*S KotlinDebug\n*F\n+ 1 SignProtocolContentDialog.kt\ncom/kubi/user/protocol/text/SignProtocolContentDialog$Companion\n*L\n62#1:238,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ SignProtocolContentDialog newInstance$default(Companion companion, List list, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return companion.newInstance(list, i11);
        }

        public static /* synthetic */ Object show$default(Companion companion, List list, int i11, boolean z11, Continuation continuation, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            if ((i12 & 4) != 0) {
                z11 = false;
            }
            return companion.show(list, i11, z11, continuation);
        }

        @NotNull
        public final SignProtocolContentDialog newInstance(@NotNull List<SignProtocolContentItem> protocolList, int activeIndex) {
            Intrinsics.checkNotNullParameter(protocolList, "protocolList");
            SignProtocolContentDialog signProtocolContentDialog = new SignProtocolContentDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("arg_protocol_list", new ArrayList<>(protocolList));
            bundle.putInt("arg_active_index", activeIndex);
            signProtocolContentDialog.setArguments(bundle);
            return signProtocolContentDialog;
        }

        @Nullable
        public final Object show(@NotNull List<SignProtocolContentItem> list, int i11, boolean z11, @NotNull Continuation<? super Pair<? extends SignProtocolResult, Integer>> continuation) {
            FragmentActivity fragmentActivity;
            SignProtocolResult signProtocolResult;
            Activity activityM6125h = C5258a.m6125h();
            if (activityM6125h instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) activityM6125h;
            } else {
                fragmentActivity = null;
            }
            if (fragmentActivity != null && !fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
                SignProtocolContentDialog signProtocolContentDialogNewInstance = newInstance(list, i11);
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                signProtocolContentDialogNewInstance.show(supportFragmentManager, "SignProtocolContentDialog");
                return signProtocolContentDialogNewInstance.f53744r0.mo91198h(continuation);
            }
            if (z11) {
                C43846g.m96568c(new UserCenterMessage("SignProtocolContentDialog", "show SignProtocolContentDialog failed", false, 4, null), null, 2, null);
                signProtocolResult = SignProtocolResult.FAILED;
            } else {
                signProtocolResult = SignProtocolResult.AGREED;
            }
            return new Pair(signProtocolResult, Boxing.boxInt(i11));
        }
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m65614A4(SignProtocolContentDialog signProtocolContentDialog, int i11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("agreement_ids", signProtocolContentDialog.m65622r4().get(i11).getTermId());
        Unit unit = Unit.INSTANCE;
        C43852m.m96591c("B1login_Agreement_Content", "Comfirm", null, jSONObject, 4, null);
        UserTermSubRequest.Companion companion = UserTermSubRequest.Companion;
        companion.resetUserTermSubRequests();
        String termId = signProtocolContentDialog.m65622r4().get(i11).getTermId();
        if (termId == null) {
            termId = "";
        }
        UserTermSubRequest.Companion.addUserTermSubRequestByTermId$default(companion, termId, (String) null, 2, (Object) null);
        SignProtocolHelper.f53730a.m65587d(companion.filterEmptyTermId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m65615B4(SignProtocolContentDialog signProtocolContentDialog, int i11) {
        signProtocolContentDialog.m65629o4(SignProtocolResult.AGREED, signProtocolContentDialog.m65631q4());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m65625y4(SignProtocolContentDialog signProtocolContentDialog, int i11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("agreement_ids", signProtocolContentDialog.m65622r4().get(i11).getTermId());
        Unit unit = Unit.INSTANCE;
        C43852m.m96591c("B1login_Agreement_Content", "Leave", null, jSONObject, 4, null);
        signProtocolContentDialog.m65634w4(i11);
        signProtocolContentDialog.m65629o4(SignProtocolResult.EXIT, signProtocolContentDialog.m65631q4());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public final void m65629o4(SignProtocolResult signProtocolResult, int i11) {
        if (this.f53745s0) {
            return;
        }
        this.f53745s0 = true;
        if (!this.f53744r0.isCompleted()) {
            this.f53744r0.mo91370n(TuplesKt.m90091to(signProtocolResult, Integer.valueOf(i11)));
        }
        dismissAllowingStateLoss();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.busercenter_sign_protocol_content_dialog, (ViewGroup) null, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (m65622r4().isEmpty()) {
            return;
        }
        m65624u4();
    }

    /* JADX INFO: renamed from: p4 */
    public final C4874h0 m65630p4() {
        return (C4874h0) this.f53743q0.getValue(this, f53742u0[0]);
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m65616E4(SignProtocolContentDialog signProtocolContentDialog, int i11) throws JSONException {
        String str;
        String blockIdPrefix = signProtocolContentDialog.m65622r4().get(i11).getBlockIdPrefix();
        String str2 = "";
        if (blockIdPrefix == null) {
            str = "";
        } else {
            str = blockIdPrefix;
        }
        JSONObject jSONObject = new JSONObject();
        String termId = signProtocolContentDialog.m65622r4().get(i11).getTermId();
        if (termId != null) {
            str2 = termId;
        }
        jSONObject.put("agreement_ids", str2);
        Unit unit = Unit.INSTANCE;
        C43852m.m96595g("B1login_Agreement_Content", str, null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    private final List<SignProtocolContentItem> m65622r4() {
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

    /* JADX INFO: renamed from: s4 */
    private final boolean m65623s4() {
        LoginV2Activity loginV2Activity;
        LoginV2Activity activity = getActivity();
        if (activity instanceof LoginV2Activity) {
            loginV2Activity = activity;
        } else {
            loginV2Activity = null;
        }
        if (loginV2Activity != null && loginV2Activity.U()) {
            m65629o4(SignProtocolResult.FAILED, m65631q4());
            InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, Boolean.TRUE, null, null, null, 59, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: u4 */
    private final void m65624u4() {
        if (m65623s4()) {
            return;
        }
        m54191p3();
        m65632t4();
        m65633v4();
    }

    /* JADX INFO: renamed from: C4 */
    public final void m65626C4() {
        SignProtocolContentView signProtocolContentView;
        C4874h0 c4874h0M65630p4 = m65630p4();
        if (c4874h0M65630p4 != null && (signProtocolContentView = c4874h0M65630p4.f5139c) != null) {
            SignProtocolContentView.m65656E(signProtocolContentView, R$string.resign_text_policy_checkbox_toast, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final void m65627D4() {
        SignProtocolContentView signProtocolContentView;
        C4874h0 c4874h0M65630p4 = m65630p4();
        if (c4874h0M65630p4 != null && (signProtocolContentView = c4874h0M65630p4.f5139c) != null) {
            signProtocolContentView.setOnProtocolLoadContentListener(new Function1() { // from class: com.kubi.user.protocol.text.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SignProtocolContentDialog.m65616E4(this.f53772b, ((Integer) obj).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final void m65628F4() {
        SignProtocolContentView signProtocolContentView;
        C4874h0 c4874h0M65630p4 = m65630p4();
        if (c4874h0M65630p4 != null && (signProtocolContentView = c4874h0M65630p4.f5139c) != null) {
            signProtocolContentView.setProtocolTitleTextSize(18.0f);
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (m65622r4().isEmpty()) {
            m65629o4(SignProtocolResult.FAILED, m65631q4());
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final int m65631q4() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return 0;
        }
        return arguments.getInt("arg_active_index", 0);
    }

    /* JADX INFO: renamed from: t4 */
    public final void m65632t4() {
        LinearLayout linearLayout;
        C4874h0 c4874h0M65630p4 = m65630p4();
        if (c4874h0M65630p4 != null && (linearLayout = c4874h0M65630p4.f5138b) != null) {
            linearLayout.getLayoutParams().height = (int) (((double) C5267e0.m6182d()) * 0.85d);
        }
        C43852m.m96595g("B1login_Agreement_Content", "Whole_Page", null, null, 12, null);
    }

    /* JADX INFO: renamed from: v4 */
    public final void m65633v4() {
        BaseActivity baseActivity;
        C4874h0 c4874h0M65630p4;
        SignProtocolContentView signProtocolContentView;
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity != null && (c4874h0M65630p4 = m65630p4()) != null && (signProtocolContentView = c4874h0M65630p4.f5139c) != null) {
            signProtocolContentView.m65682r(baseActivity, m65622r4(), m65631q4(), true);
        }
        m65628F4();
        m65627D4();
        m65626C4();
        m65636z4();
        m65635x4();
    }

    /* JADX INFO: renamed from: w4 */
    public final void m65634w4(int i11) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putInt("arg_active_index", i11);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final void m65635x4() {
        SignProtocolContentView signProtocolContentView;
        C4874h0 c4874h0M65630p4 = m65630p4();
        if (c4874h0M65630p4 != null && (signProtocolContentView = c4874h0M65630p4.f5139c) != null) {
            signProtocolContentView.m65673B(true, new Function1() { // from class: com.kubi.user.protocol.text.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SignProtocolContentDialog.m65625y4(this.f53771b, ((Integer) obj).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final void m65636z4() {
        SignProtocolContentView signProtocolContentView;
        C4874h0 c4874h0M65630p4 = m65630p4();
        if (c4874h0M65630p4 != null && (signProtocolContentView = c4874h0M65630p4.f5139c) != null) {
            signProtocolContentView.m65674C(C27017c.f54310a.m66516f(R$string.resign_text_policy_agree, new Object[0]), new Function1() { // from class: com.kubi.user.protocol.text.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SignProtocolContentDialog.m65614A4(this.f53769b, ((Integer) obj).intValue());
                }
            }, new Function1() { // from class: com.kubi.user.protocol.text.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SignProtocolContentDialog.m65615B4(this.f53770b, ((Integer) obj).intValue());
                }
            });
        }
    }
}
