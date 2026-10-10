package io.trtc.tuikit.atomicxcore.impl.contact;

import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.tencent.imsdk.p128v2.V2TIMCreateGroupMemberInfo;
import com.tencent.imsdk.p128v2.V2TIMFriendAddApplication;
import com.tencent.imsdk.p128v2.V2TIMFriendApplication;
import com.tencent.imsdk.p128v2.V2TIMFriendInfo;
import com.tencent.imsdk.p128v2.V2TIMGroupInfo;
import com.tencent.imsdk.p128v2.V2TIMGroupManager;
import com.tencent.imsdk.p128v2.V2TIMManager;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.ContactInfo;
import io.trtc.tuikit.atomicxcore.api.contact.ContactListState;
import io.trtc.tuikit.atomicxcore.api.contact.ContactListStore;
import io.trtc.tuikit.atomicxcore.api.contact.ContactType;
import io.trtc.tuikit.atomicxcore.api.contact.FriendApplicationInfo;
import io.trtc.tuikit.atomicxcore.api.contact.FriendApplicationType;
import io.trtc.tuikit.atomicxcore.api.contact.GroupApplicationInfo;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39512t;
import io.trtc.tuikit.atomicxcore.impl.common.C39505m;
import io.trtc.tuikit.atomicxcore.impl.common.C39516x;
import io.trtc.tuikit.atomicxcore.impl.common.C39517y;
import io.trtc.tuikit.atomicxcore.impl.common.EnumC39496d;
import io.trtc.tuikit.atomicxcore.impl.common.InterfaceC39513u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.O */
/* JADX INFO: loaded from: classes61.dex */
public final class C39539O extends ContactListStore {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41669n f87798a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n f87799b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f87800c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n f87801d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n f87802e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n f87803f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41669n f87804g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41669n f87805h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41669n f87806i;

    /* JADX INFO: renamed from: j */
    public volatile C39533I f87807j;

    /* JADX INFO: renamed from: k */
    public volatile C39534J f87808k;

    /* JADX INFO: renamed from: l */
    public volatile C39536L f87809l;

    /* JADX INFO: renamed from: m */
    public final ContactListState f87810m;

    /* JADX INFO: renamed from: a */
    public static final ArrayList m88277a(C39539O c39539o, List list) {
        c39539o.getClass();
        ArrayList<V2TIMFriendApplication> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((V2TIMFriendApplication) obj).getType() == 1) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (V2TIMFriendApplication v2TIMFriendApplication : arrayList) {
            String userID = v2TIMFriendApplication.getUserID();
            if (userID == null) {
                userID = "";
            }
            String str = userID;
            String faceUrl = v2TIMFriendApplication.getFaceUrl();
            String nickname = v2TIMFriendApplication.getNickname();
            arrayList2.add(new FriendApplicationInfo(v2TIMFriendApplication, str, faceUrl, (nickname == null || nickname.length() == 0) ? v2TIMFriendApplication.getUserID() : v2TIMFriendApplication.getNickname(), null, FriendApplicationType.INSTANCE.parse(v2TIMFriendApplication.getType()), v2TIMFriendApplication.getAddWording(), 16, null));
        }
        return arrayList2;
    }

    public C39539O() {
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(CollectionsKt.emptyList());
        this.f87798a = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f87799b = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f87800c = interfaceC41669nM91009a3;
        InterfaceC41669n interfaceC41669nM91009a4 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f87801d = interfaceC41669nM91009a4;
        InterfaceC41669n interfaceC41669nM91009a5 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f87802e = interfaceC41669nM91009a5;
        InterfaceC41669n interfaceC41669nM91009a6 = C41679x.m91009a(0);
        this.f87803f = interfaceC41669nM91009a6;
        InterfaceC41669n interfaceC41669nM91009a7 = C41679x.m91009a(0);
        this.f87804g = interfaceC41669nM91009a7;
        InterfaceC41669n interfaceC41669nM91009a8 = C41679x.m91009a(null);
        this.f87805h = interfaceC41669nM91009a8;
        InterfaceC41669n interfaceC41669nM91009a9 = C41679x.m91009a(null);
        this.f87806i = interfaceC41669nM91009a9;
        this.f87807j = new C39533I(this);
        this.f87808k = new C39534J(this);
        this.f87809l = new C39536L(this);
        C39516x c39516x = new C39516x(this.f87807j);
        C39517y c39517y = new C39517y(this.f87808k);
        V2TIMManager.getFriendshipManager().addFriendListener(c39516x);
        V2TIMManager.getInstance().addGroupListener(c39517y);
        ConcurrentHashMap concurrentHashMap = AbstractC39512t.f87709a;
        AbstractC39512t.m88253a("groupApplicationUnreadCountCleared", (InterfaceC39513u) this.f87809l);
        this.f87810m = new ContactListState(C41636g.m90907c(interfaceC41669nM91009a), C41636g.m90907c(interfaceC41669nM91009a2), C41636g.m90907c(interfaceC41669nM91009a3), C41636g.m90907c(interfaceC41669nM91009a4), C41636g.m90907c(interfaceC41669nM91009a5), C41636g.m90907c(interfaceC41669nM91009a6), C41636g.m90907c(interfaceC41669nM91009a7), C41636g.m90907c(interfaceC41669nM91009a8), C41636g.m90907c(interfaceC41669nM91009a9));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.ContactListStore
    public final void acceptFriendApplication(FriendApplicationInfo info, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(info, "info");
        V2TIMManager.getFriendshipManager().acceptFriendApplication(info.getApplication$atomicxcore_release(), 1, new C39588t(this, completionHandler, info));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.ContactListStore
    public final void acceptGroupApplication(GroupApplicationInfo info, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(info, "info");
        V2TIMManager.getGroupManager().acceptGroupApplication(info.getApplication$atomicxcore_release(), info.getRequestMsg(), new C39590u(this, completionHandler, info));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.ContactListStore
    public final void createGroup(String groupType, String groupName, String str, String str2, List list, CompletionHandler completionHandler) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        V2TIMGroupInfo v2TIMGroupInfo = new V2TIMGroupInfo();
        v2TIMGroupInfo.setGroupType(groupType);
        v2TIMGroupInfo.setGroupName(groupName);
        v2TIMGroupInfo.setGroupID(str);
        v2TIMGroupInfo.setFaceUrl(str2);
        V2TIMGroupManager groupManager = V2TIMManager.getGroupManager();
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ContactInfo contactInfo = (ContactInfo) it.next();
                V2TIMCreateGroupMemberInfo v2TIMCreateGroupMemberInfo = new V2TIMCreateGroupMemberInfo();
                v2TIMCreateGroupMemberInfo.setUserID(contactInfo.getContactID());
                v2TIMCreateGroupMemberInfo.setRole(200);
                arrayList.add(v2TIMCreateGroupMemberInfo);
            }
        } else {
            arrayList = null;
        }
        groupManager.createGroup(v2TIMGroupInfo, arrayList, new C39598y(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.ContactListStore
    public final void fetchFriendList(CompletionHandler completionHandler) throws JSONException {
        EnumC39496d componentType = EnumC39496d.CONTACT_LIST;
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("UIComponentType", 1007);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        V2TIMManager.getInstance().callExperimentalAPI("reportTUIFeatureUsage", string, new C39505m());
        V2TIMManager.getFriendshipManager().getFriendList(new C39520B(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.ContactListStore
    public final void fetchGroupInfo(String groupID, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        this.f87806i.setValue(null);
        V2TIMManager.getGroupManager().getGroupsInfo(CollectionsKt.listOf(groupID), new C39526E(this, completionHandler, groupID));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.ContactListStore
    public final ContactListState getContactListState() {
        return this.f87810m;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.ContactListStore
    public final void joinGroup(String groupID, String str, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        V2TIMManager.getInstance().joinGroup(groupID, str, new C39535K(completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.ContactListStore
    public final void refuseFriendApplication(FriendApplicationInfo info, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(info, "info");
        V2TIMManager.getFriendshipManager().refuseFriendApplication(info.getApplication$atomicxcore_release(), new C39537M(this, completionHandler, info));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.ContactListStore
    public final void refuseGroupApplication(GroupApplicationInfo info, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(info, "info");
        V2TIMManager.getGroupManager().refuseGroupApplication(info.getApplication$atomicxcore_release(), info.getRequestMsg(), new C39538N(this, completionHandler, info));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.ContactListStore
    public final void addFriend(String userID, String str, String str2, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        V2TIMFriendAddApplication v2TIMFriendAddApplication = new V2TIMFriendAddApplication(userID);
        v2TIMFriendAddApplication.setAddWording(str2);
        v2TIMFriendAddApplication.setAddSource(KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
        v2TIMFriendAddApplication.setFriendRemark(str);
        v2TIMFriendAddApplication.setAddType(2);
        V2TIMManager.getFriendshipManager().addFriend(v2TIMFriendAddApplication, new C39592v(completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.ContactListStore
    public final void clearFriendApplicationUnreadCount(CompletionHandler completionHandler) {
        V2TIMManager.getFriendshipManager().setFriendApplicationRead(new C39594w(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.ContactListStore
    public final void clearGroupApplicationUnreadCount(CompletionHandler completionHandler) {
        V2TIMManager.getGroupManager().setGroupApplicationRead(new C39596x(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.ContactListStore
    public final void fetchBlackList(CompletionHandler completionHandler) {
        V2TIMManager.getFriendshipManager().getBlackList(new C39600z(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.ContactListStore
    public final void fetchFriendApplicationList(CompletionHandler completionHandler) {
        V2TIMManager.getFriendshipManager().getFriendApplicationList(new C39518A(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.ContactListStore
    public final void fetchGroupApplicationList(CompletionHandler completionHandler) {
        V2TIMManager.getGroupManager().getGroupApplicationList(new C39522C(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.ContactListStore
    public final void fetchJoinedGroupList(CompletionHandler completionHandler) {
        V2TIMManager.getGroupManager().getJoinedGroupList(new C39528F(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.contact.ContactListStore
    public final void fetchUserInfo(String userID, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.f87805h.setValue(null);
        V2TIMManager.getInstance().getUsersInfo(CollectionsKt.listOf(userID), new C39532H(this, completionHandler, userID));
    }

    /* JADX INFO: renamed from: a */
    public static ContactInfo m88275a(V2TIMFriendInfo v2TIMFriendInfo) {
        String userID;
        String userID2 = v2TIMFriendInfo.getUserID();
        if (userID2 == null) {
            userID2 = "";
        }
        ContactType contactType = ContactType.USER;
        String faceUrl = v2TIMFriendInfo.getUserProfile().getFaceUrl();
        String friendRemark = v2TIMFriendInfo.getFriendRemark();
        if (friendRemark == null || friendRemark.length() == 0) {
            String nickName = v2TIMFriendInfo.getUserProfile().getNickName();
            userID = (nickName == null || nickName.length() == 0) ? v2TIMFriendInfo.getUserID() : v2TIMFriendInfo.getUserProfile().getNickName();
        } else {
            userID = v2TIMFriendInfo.getFriendRemark();
        }
        return new ContactInfo(userID2, contactType, faceUrl, userID, null, null, null, 112, null);
    }

    /* JADX INFO: renamed from: a */
    public static ContactInfo m88276a(V2TIMGroupInfo v2TIMGroupInfo) {
        String groupID = v2TIMGroupInfo.getGroupID();
        Intrinsics.checkNotNullExpressionValue(groupID, "getGroupID(...)");
        return new ContactInfo(groupID, ContactType.GROUP, v2TIMGroupInfo.getFaceUrl(), v2TIMGroupInfo.getGroupName(), null, null, null, 112, null);
    }
}
