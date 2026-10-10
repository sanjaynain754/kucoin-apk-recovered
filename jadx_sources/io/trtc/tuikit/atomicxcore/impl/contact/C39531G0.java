package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.p128v2.V2TIMGroupInfo;
import com.tencent.imsdk.p128v2.V2TIMGroupMemberFullInfo;
import com.tencent.imsdk.p128v2.V2TIMGroupMemberInfo;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.GroupJoinOption;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMember;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMemberRole;
import io.trtc.tuikit.atomicxcore.api.contact.GroupSettingState;
import io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore;
import io.trtc.tuikit.atomicxcore.api.contact.GroupType;
import io.trtc.tuikit.atomicxcore.api.contact.ReceiveMessageOpt;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39512t;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import io.trtc.tuikit.atomicxcore.impl.common.C39505m;
import io.trtc.tuikit.atomicxcore.impl.common.C39515w;
import io.trtc.tuikit.atomicxcore.impl.common.C39516x;
import io.trtc.tuikit.atomicxcore.impl.common.C39517y;
import io.trtc.tuikit.atomicxcore.impl.common.EnumC39496d;
import io.trtc.tuikit.atomicxcore.impl.common.InterfaceC39513u;
import io.trtc.tuikit.atomicxcore.impl.contact.C39531G0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.G0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39531G0 extends GroupSettingStore {

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ int f87756C = 0;

    /* JADX INFO: renamed from: A */
    public volatile C39577n0 f87757A;

    /* JADX INFO: renamed from: B */
    public volatile C39569j0 f87758B;

    /* JADX INFO: renamed from: a */
    public final String f87759a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41709m0 f87760b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f87761c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n f87762d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n f87763e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n f87764f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41669n f87765g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41669n f87766h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41669n f87767i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC41669n f87768j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC41669n f87769k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC41669n f87770l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC41669n f87771m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC41669n f87772n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC41669n f87773o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC41669n f87774p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC41669n f87775q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC41669n f87776r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC41669n f87777s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC41669n f87778t;

    /* JADX INFO: renamed from: u */
    public long f87779u;

    /* JADX INFO: renamed from: v */
    public GroupMemberRole f87780v;

    /* JADX INFO: renamed from: w */
    public V2TIMGroupInfo f87781w;

    /* JADX INFO: renamed from: x */
    public final GroupSettingState f87782x;

    /* JADX INFO: renamed from: y */
    public volatile C39545V f87783y;

    /* JADX INFO: renamed from: z */
    public volatile InterfaceC39513u f87784z;

    /* JADX INFO: renamed from: a */
    public static final Object m88267a(C39531G0 c39531g0, List list, C39541Q c39541q) {
        c39531g0.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39541q), 1);
        c41716o.m91142E();
        V2TIMManager.getGroupManager().inviteUserToGroup(c39531g0.f87759a, list, new C39542S(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39541q);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39531G0(String groupID) {
        super(groupID);
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        this.f87759a = groupID;
        this.f87760b = C41713n0.m91125a(C41782z0.m91393c());
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(GroupType.WORK);
        this.f87761c = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a("");
        this.f87762d = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a("");
        this.f87763e = interfaceC41669nM91009a3;
        InterfaceC41669n interfaceC41669nM91009a4 = C41679x.m91009a("");
        this.f87764f = interfaceC41669nM91009a4;
        Boolean bool = Boolean.FALSE;
        InterfaceC41669n interfaceC41669nM91009a5 = C41679x.m91009a(bool);
        this.f87765g = interfaceC41669nM91009a5;
        InterfaceC41669n interfaceC41669nM91009a6 = C41679x.m91009a(bool);
        this.f87766h = interfaceC41669nM91009a6;
        InterfaceC41669n interfaceC41669nM91009a7 = C41679x.m91009a(bool);
        this.f87767i = interfaceC41669nM91009a7;
        InterfaceC41669n interfaceC41669nM91009a8 = C41679x.m91009a(null);
        this.f87768j = interfaceC41669nM91009a8;
        InterfaceC41669n interfaceC41669nM91009a9 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f87769k = interfaceC41669nM91009a9;
        InterfaceC41669n interfaceC41669nM91009a10 = C41679x.m91009a(GroupMemberRole.MEMBER);
        this.f87770l = interfaceC41669nM91009a10;
        InterfaceC41669n interfaceC41669nM91009a11 = C41679x.m91009a(null);
        this.f87771m = interfaceC41669nM91009a11;
        InterfaceC41669n interfaceC41669nM91009a12 = C41679x.m91009a(0);
        this.f87772n = interfaceC41669nM91009a12;
        GroupJoinOption groupJoinOption = GroupJoinOption.FORBID;
        InterfaceC41669n interfaceC41669nM91009a13 = C41679x.m91009a(groupJoinOption);
        this.f87773o = interfaceC41669nM91009a13;
        InterfaceC41669n interfaceC41669nM91009a14 = C41679x.m91009a(groupJoinOption);
        this.f87774p = interfaceC41669nM91009a14;
        InterfaceC41669n interfaceC41669nM91009a15 = C41679x.m91009a(bool);
        this.f87775q = interfaceC41669nM91009a15;
        InterfaceC41669n interfaceC41669nM91009a16 = C41679x.m91009a(MapsKt.emptyMap());
        this.f87776r = interfaceC41669nM91009a16;
        InterfaceC41669n interfaceC41669nM91009a17 = C41679x.m91009a(ReceiveMessageOpt.RECEIVE);
        this.f87777s = interfaceC41669nM91009a17;
        InterfaceC41669n interfaceC41669nM91009a18 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f87778t = interfaceC41669nM91009a18;
        this.f87780v = GroupMemberRole.ALL;
        this.f87782x = new GroupSettingState(C41636g.m90907c(interfaceC41669nM91009a), C41636g.m90907c(interfaceC41669nM91009a2), C41636g.m90907c(interfaceC41669nM91009a3), C41636g.m90907c(interfaceC41669nM91009a4), C41636g.m90907c(interfaceC41669nM91009a5), C41636g.m90907c(interfaceC41669nM91009a6), C41636g.m90907c(interfaceC41669nM91009a7), C41636g.m90907c(interfaceC41669nM91009a8), C41636g.m90907c(interfaceC41669nM91009a9), C41636g.m90907c(interfaceC41669nM91009a18), C41636g.m90907c(interfaceC41669nM91009a10), C41636g.m90907c(interfaceC41669nM91009a11), C41636g.m90907c(interfaceC41669nM91009a12), C41636g.m90907c(interfaceC41669nM91009a13), C41636g.m90907c(interfaceC41669nM91009a14), C41636g.m90907c(interfaceC41669nM91009a15), C41636g.m90907c(interfaceC41669nM91009a16), C41636g.m90907c(interfaceC41669nM91009a17));
        this.f87783y = new C39545V(this);
        this.f87784z = new InterfaceC39513u() { // from class: dg0.a
            @Override // io.trtc.tuikit.atomicxcore.impl.common.InterfaceC39513u
            /* JADX INFO: renamed from: a */
            public final void mo82103a(String str, Object obj) {
                C39531G0.m88273a(this.f79540a, str, obj);
            }
        };
        this.f87757A = new C39577n0(this);
        this.f87758B = new C39569j0(this);
        C39516x c39516x = new C39516x(this.f87758B);
        C39517y c39517y = new C39517y(this.f87757A);
        C39515w c39515w = new C39515w(this.f87783y);
        V2TIMManager.getInstance().addGroupListener(c39517y);
        V2TIMManager.getConversationManager().addConversationListener(c39515w);
        V2TIMManager.getFriendshipManager().addFriendListener(c39516x);
        ConcurrentHashMap concurrentHashMap = AbstractC39512t.f87709a;
        AbstractC39512t.m88253a("onConversationMutedChanged", this.f87784z);
    }

    /* JADX INFO: renamed from: b */
    public static void m88274b(C39531G0 c39531g0) {
        C41696j.m91104d(c39531g0.f87760b, null, null, new C39555c0(c39531g0, null, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void changeGroupOwner(String newOwnerID, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(newOwnerID, "newOwnerID");
        C41696j.m91104d(this.f87760b, null, null, new C39543T(this, newOwnerID, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void deleteGroupMember(List groupMembers, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(groupMembers, "groupMembers");
        C41696j.m91104d(this.f87760b, null, null, new C39546W(this, groupMembers, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void dismissGroup(CompletionHandler completionHandler) {
        C41696j.m91104d(this.f87760b, null, null, new C39548Y(this, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void fetchGroupAttributes(List list, CompletionHandler completionHandler) {
        C41696j.m91104d(this.f87760b, null, null, new C39551a0(this, list, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void fetchGroupInfo(CompletionHandler completionHandler) throws JSONException {
        EnumC39496d componentType = EnumC39496d.GROUP_SETTING;
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("UIComponentType", 1008);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        V2TIMManager.getInstance().callExperimentalAPI("reportTUIFeatureUsage", string, new C39505m());
        C41696j.m91104d(this.f87760b, null, null, new C39555c0(this, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void fetchGroupMemberList(GroupMemberRole role, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(role, "role");
        C41696j.m91104d(this.f87760b, null, null, new C39557d0(this, role, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void fetchMoreGroupMemberList(CompletionHandler completionHandler) {
        C41696j.m91104d(this.f87760b, null, null, new C39565h0(this, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void fetchSelfMemberInfo(CompletionHandler completionHandler) {
        C41696j.m91104d(this.f87760b, null, null, new C39567i0(this, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final String getGroupID() {
        return this.f87759a;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final GroupSettingState getGroupSettingState() {
        return this.f87782x;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void quitGroup(CompletionHandler completionHandler) {
        C41696j.m91104d(this.f87760b, null, null, new C39579o0(this, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void setGroupInviteOption(GroupJoinOption option, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(option, "option");
        C41696j.m91104d(this.f87760b, null, null, new C39583q0(this, option, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void setGroupJoinOption(GroupJoinOption option, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(option, "option");
        C41696j.m91104d(this.f87760b, null, null, new C39587s0(this, option, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void setMuteAllMembers(boolean z11, CompletionHandler completionHandler) {
        C41696j.m91104d(this.f87760b, null, null, new C39599y0(this, z11, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void setReceiveMessageOpt(ReceiveMessageOpt opt, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(opt, "opt");
        C41696j.m91104d(this.f87760b, null, null, new C39519A0(this, opt, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void setSelfGroupNameCard(String str, CompletionHandler completionHandler) {
        C41696j.m91104d(this.f87760b, null, null, new C39523C0(this, str, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void updateGroupProfile(String str, String str2, String str3, CompletionHandler completionHandler) {
        C41696j.m91104d(this.f87760b, null, null, new C39527E0(this, str, str2, str3, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void addGroupMember(List userIDList, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userIDList, "userIDList");
        C41696j.m91104d(this.f87760b, null, null, new C39541Q(this, userIDList, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void fetchGroupMembersInfo(List userIDList, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userIDList, "userIDList");
        C41696j.m91104d(this.f87760b, null, null, new C39561f0(this, userIDList, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void setGroupMemberMuteTime(String userID, long j11, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        C41696j.m91104d(this.f87760b, null, null, new C39591u0(this, userID, j11, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.GroupSettingStore
    public final void setGroupMemberRole(String userID, GroupMemberRole role, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(role, "role");
        C41696j.m91104d(this.f87760b, null, null, new C39595w0(this, userID, role, completionHandler, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88265a(C39531G0 c39531g0, String str, C39543T c39543t) {
        c39531g0.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39543t), 1);
        c41716o.m91142E();
        V2TIMManager.getGroupManager().transferGroupOwner(c39531g0.f87759a, str, new C39544U(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39543t);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final GroupMember m88255a(C39531G0 c39531g0, V2TIMGroupMemberInfo v2TIMGroupMemberInfo) {
        c39531g0.getClass();
        String userID = v2TIMGroupMemberInfo.getUserID();
        Intrinsics.checkNotNullExpressionValue(userID, "getUserID(...)");
        GroupMember groupMember = new GroupMember(userID, v2TIMGroupMemberInfo.getNickName(), v2TIMGroupMemberInfo.getFaceUrl(), v2TIMGroupMemberInfo.getNameCard(), null, 0L, 48, null);
        if (v2TIMGroupMemberInfo instanceof V2TIMGroupMemberFullInfo) {
            V2TIMGroupMemberFullInfo v2TIMGroupMemberFullInfo = (V2TIMGroupMemberFullInfo) v2TIMGroupMemberInfo;
            groupMember.setRole(GroupMemberRole.INSTANCE.parse(v2TIMGroupMemberFullInfo.getRole()));
            groupMember.setMuteUntil(v2TIMGroupMemberFullInfo.getMuteUntil());
        }
        return groupMember;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88268a(C39531G0 c39531g0, List list, C39546W c39546w) {
        c39531g0.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39546w), 1);
        c41716o.m91142E();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((GroupMember) it.next()).getUserID());
        }
        V2TIMManager.getGroupManager().kickGroupMember(c39531g0.f87759a, arrayList, "", 0, new C39547X(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39546w);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88260a(C39531G0 c39531g0, C39548Y c39548y) {
        c39531g0.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39548y), 1);
        c41716o.m91142E();
        V2TIMManager.getInstance().dismissGroup(c39531g0.f87759a, new C39549Z(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39548y);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88269a(C39531G0 c39531g0, List list, C39551a0 c39551a0) {
        c39531g0.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39551a0), 1);
        c41716o.m91142E();
        V2TIMManager.getGroupManager().getGroupAttributes(c39531g0.f87759a, list, new C39553b0(c39531g0, c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39551a0);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88258a(C39531G0 c39531g0, GroupMemberRole groupMemberRole, long j11, SuspendLambda suspendLambda) {
        int i11;
        c39531g0.getClass();
        int i12 = AbstractC39540P.f87811a[groupMemberRole.ordinal()];
        if (i12 != 1) {
            int i13 = 2;
            if (i12 != 2) {
                i11 = 4;
                if (i12 != 3) {
                    if (i12 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i13 = 0;
                    i11 = i13;
                }
            } else {
                i11 = i13;
            }
        } else {
            i11 = 1;
        }
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(suspendLambda), 1);
        c41716o.m91142E();
        V2TIMManager.getGroupManager().getGroupMemberList(c39531g0.f87759a, i11, j11, new C39559e0(c39531g0, c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(suspendLambda);
        }
        return objM91171w;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88270a(C39531G0 c39531g0, List list, C39561f0 c39561f0) {
        c39531g0.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39561f0), 1);
        c41716o.m91142E();
        if (list.isEmpty()) {
            Result.Companion companion = Result.INSTANCE;
            c41716o.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new C39497e(BaseConstants.ERR_INVALID_PARAMETERS, "userIDList is empty"))));
        } else {
            V2TIMManager.getGroupManager().getGroupMembersInfo(c39531g0.f87759a, list, new C39563g0(c39531g0, c41716o));
        }
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39561f0);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final String m88272a(C39531G0 c39531g0) {
        c39531g0.getClass();
        String loginUser = V2TIMManager.getInstance().getLoginUser();
        return loginUser == null ? "" : loginUser;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88261a(C39531G0 c39531g0, C39579o0 c39579o0) {
        c39531g0.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39579o0), 1);
        c41716o.m91142E();
        V2TIMManager.getInstance().quitGroup(c39531g0.f87759a, new C39581p0(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39579o0);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88256a(C39531G0 c39531g0, GroupJoinOption groupJoinOption, C39583q0 c39583q0) {
        c39531g0.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39583q0), 1);
        c41716o.m91142E();
        V2TIMGroupInfo v2TIMGroupInfo = new V2TIMGroupInfo();
        v2TIMGroupInfo.setGroupID(c39531g0.f87759a);
        v2TIMGroupInfo.setGroupApproveOpt(groupJoinOption.getValue());
        V2TIMManager.getGroupManager().setGroupInfo(v2TIMGroupInfo, new C39585r0(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39583q0);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88257a(C39531G0 c39531g0, GroupJoinOption groupJoinOption, C39587s0 c39587s0) {
        c39531g0.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39587s0), 1);
        c41716o.m91142E();
        V2TIMGroupInfo v2TIMGroupInfo = new V2TIMGroupInfo();
        v2TIMGroupInfo.setGroupID(c39531g0.f87759a);
        v2TIMGroupInfo.setGroupAddOpt(groupJoinOption.getValue());
        V2TIMManager.getGroupManager().setGroupInfo(v2TIMGroupInfo, new C39589t0(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39587s0);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88262a(C39531G0 c39531g0, String str, long j11, C39591u0 c39591u0) {
        c39531g0.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39591u0), 1);
        c41716o.m91142E();
        V2TIMManager.getGroupManager().muteGroupMember(c39531g0.f87759a, str, (int) j11, new C39593v0(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39591u0);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88263a(C39531G0 c39531g0, String str, GroupMemberRole groupMemberRole, C39595w0 c39595w0) {
        c39531g0.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39595w0), 1);
        c41716o.m91142E();
        V2TIMManager.getGroupManager().setGroupMemberRole(c39531g0.f87759a, str, groupMemberRole.getValue(), new C39597x0(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39595w0);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88271a(C39531G0 c39531g0, boolean z11, C39599y0 c39599y0) {
        c39531g0.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39599y0), 1);
        c41716o.m91142E();
        V2TIMManager.getGroupManager().muteAllGroupMembers(c39531g0.f87759a, z11, new C39601z0(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39599y0);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88259a(C39531G0 c39531g0, ReceiveMessageOpt receiveMessageOpt, C39519A0 c39519a0) {
        c39531g0.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39519a0), 1);
        c41716o.m91142E();
        V2TIMManager.getMessageManager().setGroupReceiveMessageOpt(c39531g0.f87759a, receiveMessageOpt.getValue(), new C39521B0(c39531g0, receiveMessageOpt, c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39519a0);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88264a(C39531G0 c39531g0, String str, C39523C0 c39523c0) {
        c39531g0.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39523c0), 1);
        c41716o.m91142E();
        V2TIMGroupMemberFullInfo v2TIMGroupMemberFullInfo = new V2TIMGroupMemberFullInfo();
        v2TIMGroupMemberFullInfo.setUserID(m88272a(c39531g0));
        v2TIMGroupMemberFullInfo.setNameCard(str);
        V2TIMManager.getGroupManager().setGroupMemberInfo(c39531g0.f87759a, v2TIMGroupMemberFullInfo, new C39525D0(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39523c0);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88266a(C39531G0 c39531g0, String str, String str2, String str3, C39527E0 c39527e0) {
        c39531g0.getClass();
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c39527e0), 1);
        c41716o.m91142E();
        V2TIMGroupInfo v2TIMGroupInfo = new V2TIMGroupInfo();
        v2TIMGroupInfo.setGroupID(c39531g0.f87759a);
        if (str != null) {
            v2TIMGroupInfo.setGroupName(str);
        }
        if (str2 != null) {
            v2TIMGroupInfo.setNotification(str2);
        }
        if (str3 != null) {
            v2TIMGroupInfo.setFaceUrl(str3);
        }
        V2TIMManager.getGroupManager().setGroupInfo(v2TIMGroupInfo, new C39529F0(str, c39531g0, v2TIMGroupInfo, str2, str3, c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39527e0);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m88273a(C39531G0 this$0, String str, Object data) {
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
            if (Intrinsics.areEqual(str2, TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX + this$0.f87759a)) {
                this$0.f87765g.setValue(bool);
            }
        }
    }
}
