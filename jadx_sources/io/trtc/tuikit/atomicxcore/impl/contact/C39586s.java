package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMFriendInfo;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.C2CSettingState;
import io.trtc.tuikit.atomicxcore.api.contact.C2CSettingStore;
import io.trtc.tuikit.atomicxcore.api.contact.ReceiveMessageOpt;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39512t;
import io.trtc.tuikit.atomicxcore.impl.common.C39505m;
import io.trtc.tuikit.atomicxcore.impl.common.C39515w;
import io.trtc.tuikit.atomicxcore.impl.common.EnumC39496d;
import io.trtc.tuikit.atomicxcore.impl.common.InterfaceC39513u;
import io.trtc.tuikit.atomicxcore.impl.contact.C39586s;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.s */
/* JADX INFO: loaded from: classes61.dex */
public final class C39586s extends C2CSettingStore {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f87907o = 0;

    /* JADX INFO: renamed from: a */
    public final String f87908a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41709m0 f87909b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f87910c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n f87911d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n f87912e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n f87913f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41669n f87914g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41669n f87915h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41669n f87916i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC41669n f87917j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC41669n f87918k;

    /* JADX INFO: renamed from: l */
    public volatile C39558e f87919l;

    /* JADX INFO: renamed from: m */
    public volatile InterfaceC39513u f87920m;

    /* JADX INFO: renamed from: n */
    public final C2CSettingState f87921n;

    /* JADX INFO: renamed from: a */
    public static final Object m88280a(C39586s c39586s, String str, String str2, C39584r c39584r) {
        c39586s.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39584r), 1);
        c41716o.m91142E();
        V2TIMFriendInfo v2TIMFriendInfo = new V2TIMFriendInfo();
        v2TIMFriendInfo.setUserID(str);
        v2TIMFriendInfo.setFriendRemark(str2);
        V2TIMManager.getFriendshipManager().setFriendInfo(v2TIMFriendInfo, new C39578o(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39584r);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39586s(String userID) {
        super(userID);
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.f87908a = userID;
        this.f87909b = C41713n0.m91125a(C41782z0.m91393c());
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a("");
        this.f87910c = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a("");
        this.f87911d = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a("");
        this.f87912e = interfaceC41669nM91009a3;
        InterfaceC41669n interfaceC41669nM91009a4 = C41679x.m91009a("");
        this.f87913f = interfaceC41669nM91009a4;
        Boolean bool = Boolean.FALSE;
        InterfaceC41669n interfaceC41669nM91009a5 = C41679x.m91009a(bool);
        this.f87914g = interfaceC41669nM91009a5;
        InterfaceC41669n interfaceC41669nM91009a6 = C41679x.m91009a(bool);
        this.f87915h = interfaceC41669nM91009a6;
        InterfaceC41669n interfaceC41669nM91009a7 = C41679x.m91009a(bool);
        this.f87916i = interfaceC41669nM91009a7;
        InterfaceC41669n interfaceC41669nM91009a8 = C41679x.m91009a(bool);
        this.f87917j = interfaceC41669nM91009a8;
        InterfaceC41669n interfaceC41669nM91009a9 = C41679x.m91009a(ReceiveMessageOpt.RECEIVE);
        this.f87918k = interfaceC41669nM91009a9;
        this.f87919l = new C39558e(this);
        this.f87920m = new InterfaceC39513u() { // from class: dg0.b
            @Override // io.trtc.tuikit.atomicxcore.impl.common.InterfaceC39513u
            /* JADX INFO: renamed from: a */
            public final void mo82103a(String str, Object obj) {
                C39586s.m88281a(this.f79541a, str, obj);
            }
        };
        this.f87921n = new C2CSettingState(C41636g.m90907c(interfaceC41669nM91009a), C41636g.m90907c(interfaceC41669nM91009a2), C41636g.m90907c(interfaceC41669nM91009a3), C41636g.m90907c(interfaceC41669nM91009a4), C41636g.m90907c(interfaceC41669nM91009a5), C41636g.m90907c(interfaceC41669nM91009a6), C41636g.m90907c(interfaceC41669nM91009a7), C41636g.m90907c(interfaceC41669nM91009a8), C41636g.m90907c(interfaceC41669nM91009a9));
        V2TIMManager.getConversationManager().addConversationListener(new C39515w(this.f87919l));
        ConcurrentHashMap concurrentHashMap = AbstractC39512t.f87709a;
        AbstractC39512t.m88253a("onConversationMutedChanged", this.f87920m);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.C2CSettingStore
    public final void addToBlacklist(CompletionHandler completionHandler) {
        C41696j.m91104d(this.f87909b, null, null, new C39550a(this, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.C2CSettingStore
    public final void deleteFriend(CompletionHandler completionHandler) {
        C41696j.m91104d(this.f87909b, null, null, new C39560f(this, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.C2CSettingStore
    public final void fetchUserInfo(CompletionHandler completionHandler) throws JSONException {
        EnumC39496d componentType = EnumC39496d.C2C_SETTING;
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("UIComponentType", 1009);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        V2TIMManager.getInstance().callExperimentalAPI("reportTUIFeatureUsage", string, new C39505m());
        C41696j.m91104d(this.f87909b, null, null, new C39564h(this, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.C2CSettingStore
    public final C2CSettingState getC2cSettingState() {
        return this.f87921n;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.C2CSettingStore
    public final String getUserID() {
        return this.f87908a;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.C2CSettingStore
    public final void removeFromBlacklist(CompletionHandler completionHandler) {
        C41696j.m91104d(this.f87909b, null, null, new C39574m(this, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.C2CSettingStore
    public final void setReceiveMessageOpt(ReceiveMessageOpt opt, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(opt, "opt");
        C41696j.m91104d(this.f87909b, null, null, new C39580p(this, opt, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.C2CSettingStore
    public final void setUserRemark(String remark, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(remark, "remark");
        C41696j.m91104d(this.f87909b, null, null, new C39584r(this, remark, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.C2CSettingStore
    public final void checkBlacklistStatus(CompletionHandler completionHandler) {
        V2TIMManager.getFriendshipManager().getBlackList(new C39556d(this, completionHandler));
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88279a(C39586s c39586s, ReceiveMessageOpt receiveMessageOpt, C39580p c39580p) {
        c39586s.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39580p), 1);
        c41716o.m91142E();
        V2TIMManager.getMessageManager().setC2CReceiveMessageOpt(CollectionsKt.listOf(c39586s.f87908a), receiveMessageOpt.getValue(), new C39582q(c39586s, receiveMessageOpt, c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39580p);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m88281a(C39586s this$0, String str, Object data) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(data, "data");
        Map map = data instanceof Map ? (Map) data : null;
        if (map == null) {
            return;
        }
        Object obj = map.get("conversationID");
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 == null) {
            return;
        }
        Object obj2 = map.get("mute");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        if (bool != null) {
            if (Intrinsics.areEqual(str2, TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX + this$0.f87908a)) {
                this$0.f87914g.setValue(bool);
            }
        }
    }
}
