package com.kubi.user.protocol.link;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import c70.C4882l0;
import com.blankj.utilcode.util.C5258a;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.R$layout;
import com.kubi.user.api.entity.UserTermSubRequest;
import com.kubi.user.config.LoginInfoConfig;
import com.kubi.user.loginv2.LoginV2Activity;
import com.kubi.user.protocol.entity.SignProtocolLinkItem;
import com.kubi.user.protocol.entity.SignProtocolResult;
import com.kubi.user.protocol.helper.ShowSignProtocolDialogHelper;
import com.kubi.user.protocol.helper.SignProtocolHelper;
import com.kubi.user.protocol.link.SignProtocolLinkRetainDialog;
import com.kubi.user.utils.a0;
import com.kubi.utils.extensions.C27046k;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
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

/* JADX INFO: compiled from: SignProtocolLinkRetainDialog.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010 \u001a\u00020\u0015H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002J\b\u0010\"\u001a\u00020\u0015H\u0002J\b\u0010#\u001a\u00020\u0015H\u0002J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\fH\u0002J\b\u0010&\u001a\u00020\u000eH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, m90084d2 = {"Lcom/kubi/user/protocol/link/SignProtocolLinkRetainDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/user/databinding/BusercenterSignProtocolLinkRetainDialogBinding;", "getBinding", "()Lcom/kubi/user/databinding/BusercenterSignProtocolLinkRetainDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "btnClickCompletable", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/kubi/user/protocol/entity/SignProtocolResult;", "resultDelivered", "", "protocolList", "", "Lcom/kubi/user/protocol/entity/SignProtocolLinkItem;", "getProtocolList", "()Ljava/util/List;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initProtocolContainer", "initLinkProtocolList", "initAgreeProtocolButton", "initExitProtocolButton", "deliverResult", DbParams.KEY_CHANNEL_RESULT, "handleRecreatedAndJumpMain", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSignProtocolLinkRetainDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignProtocolLinkRetainDialog.kt\ncom/kubi/user/protocol/link/SignProtocolLinkRetainDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n143#2,20:170\n1563#3:190\n1634#3,3:191\n1869#3,2:194\n*S KotlinDebug\n*F\n+ 1 SignProtocolLinkRetainDialog.kt\ncom/kubi/user/protocol/link/SignProtocolLinkRetainDialog\n*L\n63#1:170,20\n106#1:190\n106#1:191,3\n127#1:194,2\n*E\n"})
public final class SignProtocolLinkRetainDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f53738q0 = C45681e.m100799e(this, new Function1<SignProtocolLinkRetainDialog, C4882l0>() { // from class: com.kubi.user.protocol.link.SignProtocolLinkRetainDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4882l0 invoke(@NotNull SignProtocolLinkRetainDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4882l0.m5043a(fragment.requireView());
        }
    }, new Function1<C4882l0, Unit>() { // from class: com.kubi.user.protocol.link.SignProtocolLinkRetainDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C4882l0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4882l0 c4882l0) {
            invoke(c4882l0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final InterfaceC41769w<SignProtocolResult> f53739r0 = C41777y.m91388c(null, 1, null);

    /* JADX INFO: renamed from: s0 */
    public boolean f53740s0;

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ KProperty<Object>[] f53737u0 = {Reflection.property1(new PropertyReference1Impl(SignProtocolLinkRetainDialog.class, "binding", "getBinding()Lcom/kubi/user/databinding/BusercenterSignProtocolLinkRetainDialogBinding;", 0))};

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public static final Companion f53736t0 = new Companion(null);

    /* JADX INFO: compiled from: SignProtocolLinkRetainDialog.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u001c\u0010\r\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/user/protocol/link/SignProtocolLinkRetainDialog$Companion;", "", "<init>", "()V", "FRAGMENT_TAG", "", "PAGE_ID", "ARG_PROTOCOL_LIST", "newInstance", "Lcom/kubi/user/protocol/link/SignProtocolLinkRetainDialog;", "protocolList", "", "Lcom/kubi/user/protocol/entity/SignProtocolLinkItem;", TIMPushProvider.f75062n, "Lcom/kubi/user/protocol/entity/SignProtocolResult;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final SignProtocolLinkRetainDialog newInstance(@NotNull List<SignProtocolLinkItem> protocolList) {
            Intrinsics.checkNotNullParameter(protocolList, "protocolList");
            SignProtocolLinkRetainDialog signProtocolLinkRetainDialog = new SignProtocolLinkRetainDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("arg_protocol_list", new ArrayList<>(protocolList));
            signProtocolLinkRetainDialog.setArguments(bundle);
            return signProtocolLinkRetainDialog;
        }

        @Nullable
        public final Object show(@NotNull List<SignProtocolLinkItem> list, @NotNull Continuation<? super SignProtocolResult> continuation) {
            FragmentActivity fragmentActivity;
            Activity activityM6125h = C5258a.m6125h();
            if (activityM6125h instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) activityM6125h;
            } else {
                fragmentActivity = null;
            }
            if (fragmentActivity != null && !fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
                SignProtocolLinkRetainDialog signProtocolLinkRetainDialogNewInstance = newInstance(list);
                signProtocolLinkRetainDialogNewInstance.requireArguments().putInt("type", 4);
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                signProtocolLinkRetainDialogNewInstance.show(supportFragmentManager, "SignProtocolLinkRetainDialog");
                return signProtocolLinkRetainDialogNewInstance.f53739r0.mo91198h(continuation);
            }
            return SignProtocolResult.EXIT;
        }
    }

    /* JADX INFO: renamed from: m4 */
    private final void m65604m4(SignProtocolResult signProtocolResult) {
        if (this.f53740s0) {
            return;
        }
        this.f53740s0 = true;
        if (!this.f53739r0.isCompleted()) {
            this.f53739r0.mo91370n(signProtocolResult);
        }
        dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m65608r4(SignProtocolLinkRetainDialog signProtocolLinkRetainDialog) {
        UserTermSubRequest.Companion.resetUserTermSubRequests();
        Iterator<T> it = signProtocolLinkRetainDialog.m65605o4().iterator();
        while (it.hasNext()) {
            String termId = ((SignProtocolLinkItem) it.next()).getTermId();
            if (termId != null) {
                UserTermSubRequest.Companion.addUserTermSubRequestByTermId$default(UserTermSubRequest.Companion, termId, (String) null, 2, (Object) null);
            }
        }
        SignProtocolHelper.f53730a.m65587d(UserTermSubRequest.Companion.filterEmptyTermId());
        C43852m.m96591c("B1login_Agreement_Link_Retain", "Comfirm", null, null, 12, null);
        signProtocolLinkRetainDialog.m65604m4(SignProtocolResult.AGREED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m65610t4(SignProtocolLinkRetainDialog signProtocolLinkRetainDialog) {
        C44128b.m97261e("SignProtocolLinkRetainDialog", "btnExitProtocol login out");
        a0.a("SignProtocolLinkRetainDialog btnExitProtocol login out");
        LoginInfoConfig.a.I(false, true);
        C43852m.m96591c("B1login_Agreement_Link_Retain", "Leave", null, null, 12, null);
        signProtocolLinkRetainDialog.m65604m4(SignProtocolResult.EXIT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public final C4882l0 m65613n4() {
        return (C4882l0) this.f53738q0.getValue(this, f53737u0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.busercenter_sign_protocol_link_retain_dialog, (ViewGroup) null, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (m65605o4().isEmpty()) {
            return;
        }
        m65612v4();
    }

    /* JADX INFO: renamed from: o4 */
    private final List<SignProtocolLinkItem> m65605o4() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        ArrayList parcelableArrayList = BundleCompat.getParcelableArrayList(arguments, "arg_protocol_list", SignProtocolLinkItem.class);
        if (parcelableArrayList == null) {
            return CollectionsKt.emptyList();
        }
        return parcelableArrayList;
    }

    /* JADX INFO: renamed from: p4 */
    private final boolean m65606p4() {
        LoginV2Activity loginV2Activity;
        LoginV2Activity activity = getActivity();
        if (activity instanceof LoginV2Activity) {
            loginV2Activity = activity;
        } else {
            loginV2Activity = null;
        }
        if (loginV2Activity != null && loginV2Activity.U()) {
            m65604m4(SignProtocolResult.EXIT);
            InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, Boolean.TRUE, null, null, null, 59, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: q4 */
    private final void m65607q4() {
        KcPrimaryButton kcPrimaryButton;
        C4882l0 c4882l0M65613n4 = m65613n4();
        if (c4882l0M65613n4 != null && (kcPrimaryButton = c4882l0M65613n4.f5193b) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: j70.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SignProtocolLinkRetainDialog.m65608r4(this.f89600b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: s4 */
    private final void m65609s4() {
        BaseTextView baseTextView;
        C4882l0 c4882l0M65613n4 = m65613n4();
        if (c4882l0M65613n4 != null && (baseTextView = c4882l0M65613n4.f5194c) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: j70.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SignProtocolLinkRetainDialog.m65610t4(this.f89601b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: u4 */
    private final void m65611u4() {
        BaseTextView baseTextView;
        C4882l0 c4882l0M65613n4 = m65613n4();
        if (c4882l0M65613n4 != null && (baseTextView = c4882l0M65613n4.f5195d) != null) {
            baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
            ShowSignProtocolDialogHelper.f53727a.m65579d(baseTextView, m65605o4(), "resign_retain_link_policy_list_", "B1login_Agreement_Link_Retain");
        }
    }

    /* JADX INFO: renamed from: v4 */
    private final void m65612v4() throws JSONException {
        String str;
        if (!m65606p4()) {
            m54191p3();
            m65611u4();
            m65607q4();
            m65609s4();
            List<SignProtocolLinkItem> listM65605o4 = m65605o4();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM65605o4, 10));
            for (SignProtocolLinkItem signProtocolLinkItem : listM65605o4) {
                String blockIdPrefix = signProtocolLinkItem.getBlockIdPrefix();
                String str2 = "";
                if (blockIdPrefix == null) {
                    str = "";
                } else {
                    str = blockIdPrefix;
                }
                JSONObject jSONObject = new JSONObject();
                String termId = signProtocolLinkItem.getTermId();
                if (termId != null) {
                    str2 = termId;
                }
                jSONObject.put("agreement_ids", str2);
                Unit unit = Unit.INSTANCE;
                C43852m.m96595g("B1login_Agreement_Link_Retain", str, null, jSONObject, 4, null);
                arrayList.add(Unit.INSTANCE);
            }
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (m65605o4().isEmpty()) {
            m65604m4(SignProtocolResult.EXIT);
        }
    }
}
