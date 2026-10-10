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
import c70.C4880k0;
import com.blankj.utilcode.util.C5258a;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.R$layout;
import com.kubi.user.api.entity.UserTermSubRequest;
import com.kubi.user.loginv2.LoginV2Activity;
import com.kubi.user.protocol.entity.SignProtocolLinkItem;
import com.kubi.user.protocol.entity.SignProtocolResult;
import com.kubi.user.protocol.helper.ShowSignProtocolDialogHelper;
import com.kubi.user.protocol.helper.SignProtocolHelper;
import com.kubi.user.protocol.link.SignProtocolLinkDialog;
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
import w00.C45681e;

/* JADX INFO: compiled from: SignProtocolLinkDialog.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010 \u001a\u00020\u0015H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002J\b\u0010\"\u001a\u00020\u0015H\u0002J\b\u0010#\u001a\u00020\u0015H\u0002J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\fH\u0002J\b\u0010&\u001a\u00020\u000eH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, m90084d2 = {"Lcom/kubi/user/protocol/link/SignProtocolLinkDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/user/databinding/BusercenterSignProtocolLinkDialogBinding;", "getBinding", "()Lcom/kubi/user/databinding/BusercenterSignProtocolLinkDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "btnClickCompletable", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/kubi/user/protocol/entity/SignProtocolResult;", "resultDelivered", "", "protocolList", "", "Lcom/kubi/user/protocol/entity/SignProtocolLinkItem;", "getProtocolList", "()Ljava/util/List;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initProtocolContainer", "initLinkProtocolList", "initAgreeProtocolButton", "initExitProtocolButton", "deliverResult", DbParams.KEY_CHANNEL_RESULT, "handleRecreatedAndJumpMain", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSignProtocolLinkDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignProtocolLinkDialog.kt\ncom/kubi/user/protocol/link/SignProtocolLinkDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n143#2,20:164\n1563#3:184\n1634#3,3:185\n1869#3,2:188\n*S KotlinDebug\n*F\n+ 1 SignProtocolLinkDialog.kt\ncom/kubi/user/protocol/link/SignProtocolLinkDialog\n*L\n60#1:164,20\n103#1:184\n103#1:185,3\n124#1:188,2\n*E\n"})
public final class SignProtocolLinkDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f53733q0 = C45681e.m100799e(this, new Function1<SignProtocolLinkDialog, C4880k0>() { // from class: com.kubi.user.protocol.link.SignProtocolLinkDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4880k0 invoke(@NotNull SignProtocolLinkDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4880k0.m5039a(fragment.requireView());
        }
    }, new Function1<C4880k0, Unit>() { // from class: com.kubi.user.protocol.link.SignProtocolLinkDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C4880k0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4880k0 c4880k0) {
            invoke(c4880k0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final InterfaceC41769w<SignProtocolResult> f53734r0 = C41777y.m91388c(null, 1, null);

    /* JADX INFO: renamed from: s0 */
    public boolean f53735s0;

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ KProperty<Object>[] f53732u0 = {Reflection.property1(new PropertyReference1Impl(SignProtocolLinkDialog.class, "binding", "getBinding()Lcom/kubi/user/databinding/BusercenterSignProtocolLinkDialogBinding;", 0))};

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public static final Companion f53731t0 = new Companion(null);

    /* JADX INFO: compiled from: SignProtocolLinkDialog.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u001c\u0010\r\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/user/protocol/link/SignProtocolLinkDialog$Companion;", "", "<init>", "()V", "FRAGMENT_TAG", "", "PAGE_ID", "ARG_PROTOCOL_LIST", "newInstance", "Lcom/kubi/user/protocol/link/SignProtocolLinkDialog;", "protocolList", "", "Lcom/kubi/user/protocol/entity/SignProtocolLinkItem;", TIMPushProvider.f75062n, "Lcom/kubi/user/protocol/entity/SignProtocolResult;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final SignProtocolLinkDialog newInstance(@NotNull List<SignProtocolLinkItem> protocolList) {
            Intrinsics.checkNotNullParameter(protocolList, "protocolList");
            SignProtocolLinkDialog signProtocolLinkDialog = new SignProtocolLinkDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("arg_protocol_list", new ArrayList<>(protocolList));
            signProtocolLinkDialog.setArguments(bundle);
            return signProtocolLinkDialog;
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
                SignProtocolLinkDialog signProtocolLinkDialogNewInstance = newInstance(list);
                signProtocolLinkDialogNewInstance.requireArguments().putInt("type", 4);
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                signProtocolLinkDialogNewInstance.show(supportFragmentManager, "SignProtocolLinkDialog");
                return signProtocolLinkDialogNewInstance.f53734r0.mo91198h(continuation);
            }
            return SignProtocolResult.FAILED;
        }
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m65591r4(SignProtocolLinkDialog signProtocolLinkDialog) {
        UserTermSubRequest.Companion.resetUserTermSubRequests();
        Iterator<T> it = signProtocolLinkDialog.m65595o4().iterator();
        while (it.hasNext()) {
            String termId = ((SignProtocolLinkItem) it.next()).getTermId();
            if (termId != null) {
                UserTermSubRequest.Companion.addUserTermSubRequestByTermId$default(UserTermSubRequest.Companion, termId, (String) null, 2, (Object) null);
            }
        }
        SignProtocolHelper.f53730a.m65587d(UserTermSubRequest.Companion.filterEmptyTermId());
        C43852m.m96591c("B1login_Agreement_Link", "Comfirm", null, null, 12, null);
        signProtocolLinkDialog.m65593m4(SignProtocolResult.AGREED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m65592t4(SignProtocolLinkDialog signProtocolLinkDialog) {
        C43852m.m96591c("B1login_Agreement_Link", "Leave", null, null, 12, null);
        signProtocolLinkDialog.m65593m4(SignProtocolResult.EXIT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public final void m65593m4(SignProtocolResult signProtocolResult) {
        if (this.f53735s0) {
            return;
        }
        this.f53735s0 = true;
        if (!this.f53734r0.isCompleted()) {
            this.f53734r0.mo91370n(signProtocolResult);
        }
        dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: n4 */
    public final C4880k0 m65594n4() {
        return (C4880k0) this.f53733q0.getValue(this, f53732u0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.busercenter_sign_protocol_link_dialog, (ViewGroup) null, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (m65595o4().isEmpty()) {
            return;
        }
        m65600v4();
    }

    /* JADX INFO: renamed from: o4 */
    public final List<SignProtocolLinkItem> m65595o4() {
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

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (m65595o4().isEmpty()) {
            m65593m4(SignProtocolResult.FAILED);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final boolean m65596p4() {
        LoginV2Activity loginV2Activity;
        LoginV2Activity activity = getActivity();
        if (activity instanceof LoginV2Activity) {
            loginV2Activity = activity;
        } else {
            loginV2Activity = null;
        }
        if (loginV2Activity != null && loginV2Activity.U()) {
            m65593m4(SignProtocolResult.FAILED);
            InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, Boolean.TRUE, null, null, null, 59, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: q4 */
    public final void m65597q4() {
        KcPrimaryButton kcPrimaryButton;
        C4880k0 c4880k0M65594n4 = m65594n4();
        if (c4880k0M65594n4 != null && (kcPrimaryButton = c4880k0M65594n4.f5186b) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: j70.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SignProtocolLinkDialog.m65591r4(this.f89599b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final void m65598s4() {
        BaseTextView baseTextView;
        C4880k0 c4880k0M65594n4 = m65594n4();
        if (c4880k0M65594n4 != null && (baseTextView = c4880k0M65594n4.f5187c) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: j70.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SignProtocolLinkDialog.m65592t4(this.f89598b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final void m65599u4() {
        BaseTextView baseTextView;
        C4880k0 c4880k0M65594n4 = m65594n4();
        if (c4880k0M65594n4 != null && (baseTextView = c4880k0M65594n4.f5188d) != null) {
            baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
            ShowSignProtocolDialogHelper.f53727a.m65579d(baseTextView, m65595o4(), "resign_link_policy_list_", "B1login_Agreement_Link");
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final void m65600v4() throws JSONException {
        String str;
        if (!m65596p4()) {
            m54191p3();
            m65599u4();
            m65597q4();
            m65598s4();
            List<SignProtocolLinkItem> listM65595o4 = m65595o4();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM65595o4, 10));
            for (SignProtocolLinkItem signProtocolLinkItem : listM65595o4) {
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
                C43852m.m96595g("B1login_Agreement_Link", str, null, jSONObject, 4, null);
                arrayList.add(Unit.INSTANCE);
            }
        }
    }
}
