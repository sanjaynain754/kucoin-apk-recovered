package io.trtc.tuikit.atomicxcore.impl.search;

import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.p128v2.V2TIMConversation;
import com.tencent.imsdk.p128v2.V2TIMFriendSearchParam;
import com.tencent.imsdk.p128v2.V2TIMGroupInfo;
import com.tencent.imsdk.p128v2.V2TIMGroupMemberSearchParam;
import com.tencent.imsdk.p128v2.V2TIMGroupSearchParam;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMMessage;
import com.tencent.imsdk.p128v2.V2TIMMessageSearchParam;
import com.tencent.imsdk.p128v2.V2TIMMessageSearchResult;
import com.tencent.imsdk.p128v2.V2TIMMessageSearchResultItem;
import com.tencent.imsdk.p128v2.V2TIMUserSearchParam;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.GroupJoinOption;
import io.trtc.tuikit.atomicxcore.api.contact.GroupType;
import io.trtc.tuikit.atomicxcore.api.message.MessageType;
import io.trtc.tuikit.atomicxcore.api.search.GroupMemberSearchFilter;
import io.trtc.tuikit.atomicxcore.api.search.GroupSearchInfo;
import io.trtc.tuikit.atomicxcore.api.search.KeywordListMatchType;
import io.trtc.tuikit.atomicxcore.api.search.MessageSearchFilter;
import io.trtc.tuikit.atomicxcore.api.search.MessageSearchResultItem;
import io.trtc.tuikit.atomicxcore.api.search.SearchOption;
import io.trtc.tuikit.atomicxcore.api.search.SearchState;
import io.trtc.tuikit.atomicxcore.api.search.SearchStore;
import io.trtc.tuikit.atomicxcore.api.search.SearchType;
import io.trtc.tuikit.atomicxcore.api.search.UserSearchFilter;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39504l;
import io.trtc.tuikit.atomicxcore.impl.common.C39505m;
import io.trtc.tuikit.atomicxcore.impl.common.EnumC39496d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.SafeContinuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.search.p */
/* JADX INFO: loaded from: classes61.dex */
public final class C39981p extends SearchStore {

    /* JADX INFO: renamed from: c */
    public SearchOption f88894c;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41669n f88899h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41669n f88900i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC41669n f88901j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC41669n f88902k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC41669n f88903l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC41669n f88904m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC41669n f88905n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC41669n f88906o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC41669n f88907p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC41669n f88908q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC41669n f88909r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC41669n f88910s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC41669n f88911t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC41669n f88912u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC41669n f88913v;

    /* JADX INFO: renamed from: w */
    public final SearchState f88914w;

    /* JADX INFO: renamed from: a */
    public final InterfaceC41709m0 f88892a = C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C41782z0.m91393c()));

    /* JADX INFO: renamed from: b */
    public List f88893b = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: d */
    public String f88895d = "";

    /* JADX INFO: renamed from: e */
    public String f88896e = "";

    /* JADX INFO: renamed from: f */
    public String f88897f = "";

    /* JADX INFO: renamed from: g */
    public String f88898g = "";

    /* JADX INFO: renamed from: a */
    public static final GroupSearchInfo m88371a(C39981p c39981p, V2TIMGroupInfo v2TIMGroupInfo) {
        c39981p.getClass();
        String groupID = v2TIMGroupInfo.getGroupID();
        if (groupID == null) {
            return null;
        }
        GroupType.Companion companion = GroupType.INSTANCE;
        String groupType = v2TIMGroupInfo.getGroupType();
        if (groupType == null) {
            groupType = "";
        }
        GroupType groupType2 = companion.parse(groupType);
        String groupName = v2TIMGroupInfo.getGroupName();
        if (groupName == null) {
            groupName = "";
        }
        int memberCount = v2TIMGroupInfo.getMemberCount();
        String faceUrl = v2TIMGroupInfo.getFaceUrl();
        if (faceUrl == null) {
            faceUrl = "";
        }
        String introduction = v2TIMGroupInfo.getIntroduction();
        if (introduction == null) {
            introduction = "";
        }
        GroupJoinOption.Companion companion2 = GroupJoinOption.INSTANCE;
        return new GroupSearchInfo(groupID, groupType2, groupName, memberCount, faceUrl, introduction, companion2.parse(v2TIMGroupInfo.getGroupAddOpt()), companion2.parse(v2TIMGroupInfo.getGroupApproveOpt()));
    }

    public C39981p() {
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88899h = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(0);
        this.f88900i = interfaceC41669nM91009a2;
        Boolean bool = Boolean.TRUE;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a(bool);
        this.f88901j = interfaceC41669nM91009a3;
        InterfaceC41669n interfaceC41669nM91009a4 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88902k = interfaceC41669nM91009a4;
        InterfaceC41669n interfaceC41669nM91009a5 = C41679x.m91009a(0);
        this.f88903l = interfaceC41669nM91009a5;
        InterfaceC41669n interfaceC41669nM91009a6 = C41679x.m91009a(bool);
        this.f88904m = interfaceC41669nM91009a6;
        InterfaceC41669n interfaceC41669nM91009a7 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88905n = interfaceC41669nM91009a7;
        InterfaceC41669n interfaceC41669nM91009a8 = C41679x.m91009a(0);
        this.f88906o = interfaceC41669nM91009a8;
        InterfaceC41669n interfaceC41669nM91009a9 = C41679x.m91009a(bool);
        this.f88907p = interfaceC41669nM91009a9;
        InterfaceC41669n interfaceC41669nM91009a10 = C41679x.m91009a(MapsKt.emptyMap());
        this.f88908q = interfaceC41669nM91009a10;
        InterfaceC41669n interfaceC41669nM91009a11 = C41679x.m91009a(0);
        this.f88909r = interfaceC41669nM91009a11;
        InterfaceC41669n interfaceC41669nM91009a12 = C41679x.m91009a(bool);
        this.f88910s = interfaceC41669nM91009a12;
        InterfaceC41669n interfaceC41669nM91009a13 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88911t = interfaceC41669nM91009a13;
        InterfaceC41669n interfaceC41669nM91009a14 = C41679x.m91009a(0);
        this.f88912u = interfaceC41669nM91009a14;
        InterfaceC41669n interfaceC41669nM91009a15 = C41679x.m91009a(bool);
        this.f88913v = interfaceC41669nM91009a15;
        this.f88914w = new SearchState(C41636g.m90907c(interfaceC41669nM91009a), C41636g.m90907c(interfaceC41669nM91009a2), C41636g.m90907c(interfaceC41669nM91009a3), C41636g.m90907c(interfaceC41669nM91009a4), C41636g.m90907c(interfaceC41669nM91009a5), C41636g.m90907c(interfaceC41669nM91009a6), C41636g.m90907c(interfaceC41669nM91009a7), C41636g.m90907c(interfaceC41669nM91009a8), C41636g.m90907c(interfaceC41669nM91009a9), C41636g.m90907c(interfaceC41669nM91009a10), C41636g.m90907c(interfaceC41669nM91009a11), C41636g.m90907c(interfaceC41669nM91009a12), C41636g.m90907c(interfaceC41669nM91009a13), C41636g.m90907c(interfaceC41669nM91009a14), C41636g.m90907c(interfaceC41669nM91009a15));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.search.SearchStore
    public final SearchState getSearchState() {
        return this.f88914w;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.search.SearchStore
    public final void search(List keywordList, SearchOption option, CompletionHandler completionHandler) throws JSONException {
        Intrinsics.checkNotNullParameter(keywordList, "keywordList");
        Intrinsics.checkNotNullParameter(option, "option");
        EnumC39496d componentType = EnumC39496d.SEARCH;
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("UIComponentType", 1006);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        V2TIMManager.getInstance().callExperimentalAPI("reportTUIFeatureUsage", string, new C39505m());
        if (keywordList.isEmpty()) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Keyword list cannot be empty");
                return;
            }
            return;
        }
        if (option.getSearchType().getValue() == 0) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Search type cannot be empty");
                return;
            }
            return;
        }
        if (option.getSearchCount() == 0) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Search count must be greater than 0");
                return;
            }
            return;
        }
        this.f88893b = keywordList;
        this.f88894c = option;
        SearchType searchType = option.getSearchType();
        SearchType searchType2 = SearchType.User;
        if (searchType.contains(searchType2)) {
            this.f88895d = "";
            this.f88899h.setValue(CollectionsKt.emptyList());
            this.f88900i.setValue(0);
            this.f88901j.setValue(Boolean.TRUE);
        }
        SearchType searchType3 = SearchType.Friend;
        if (searchType.contains(searchType3)) {
            this.f88902k.setValue(CollectionsKt.emptyList());
            this.f88903l.setValue(0);
            this.f88904m.setValue(Boolean.TRUE);
        }
        SearchType searchType4 = SearchType.Group;
        if (searchType.contains(searchType4)) {
            this.f88896e = "";
            this.f88905n.setValue(CollectionsKt.emptyList());
            this.f88906o.setValue(0);
            this.f88907p.setValue(Boolean.TRUE);
        }
        SearchType searchType5 = SearchType.GroupMember;
        if (searchType.contains(searchType5)) {
            this.f88897f = "";
            this.f88908q.setValue(MapsKt.emptyMap());
            this.f88909r.setValue(0);
            this.f88910s.setValue(Boolean.TRUE);
        }
        SearchType searchType6 = SearchType.Message;
        if (searchType.contains(searchType6)) {
            this.f88898g = "";
            this.f88911t.setValue(CollectionsKt.emptyList());
            this.f88912u.setValue(0);
            this.f88913v.setValue(Boolean.TRUE);
        }
        ArrayList arrayList = new ArrayList();
        if (option.getSearchType().contains(searchType2)) {
            arrayList.add(searchType2);
        }
        if (option.getSearchType().contains(searchType3)) {
            arrayList.add(searchType3);
        }
        if (option.getSearchType().contains(searchType4)) {
            arrayList.add(searchType4);
        }
        if (option.getSearchType().contains(searchType5)) {
            arrayList.add(searchType5);
        }
        if (option.getSearchType().contains(searchType6)) {
            arrayList.add(searchType6);
        }
        C41696j.m91104d(this.f88892a, null, null, new C39970e(arrayList, completionHandler, this, keywordList, option, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.search.SearchStore
    public final void searchMore(SearchType searchType, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        SearchOption searchOption = this.f88894c;
        if (searchOption == null) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Please call search first");
            }
        } else if (searchType.getValue() != 0 && Integer.bitCount(searchType.getValue()) == 1) {
            C41696j.m91104d(this.f88892a, null, null, new C39979n(searchType, this, searchOption, completionHandler, null), 3, null);
        } else if (completionHandler != null) {
            completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "searchMore only supports single search type");
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m88376b(C39981p c39981p, List list, SearchOption searchOption, SuspendLambda suspendLambda) {
        c39981p.getClass();
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(suspendLambda));
        V2TIMGroupSearchParam v2TIMGroupSearchParam = new V2TIMGroupSearchParam();
        v2TIMGroupSearchParam.setKeywordList(list);
        int i11 = 1;
        if (searchOption.isCloudSearch()) {
            v2TIMGroupSearchParam.setSearchCount(searchOption.getSearchCount());
            v2TIMGroupSearchParam.setSearchCursor(c39981p.f88896e);
            if (searchOption.getKeywordListMatchType() == KeywordListMatchType.OR) {
                i11 = 0;
            }
            v2TIMGroupSearchParam.setKeywordListMatchType(i11);
            V2TIMManager.getGroupManager().searchCloudGroups(v2TIMGroupSearchParam, new C39974i(c39981p, safeContinuation));
        } else {
            v2TIMGroupSearchParam.setSearchGroupID(true);
            v2TIMGroupSearchParam.setSearchGroupName(true);
            V2TIMManager.getGroupManager().searchGroups(v2TIMGroupSearchParam, new C39975j(c39981p, safeContinuation));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(suspendLambda);
        }
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return orThrow;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m88377c(C39981p c39981p, List list, SearchOption searchOption, SuspendLambda suspendLambda) {
        c39981p.getClass();
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(suspendLambda));
        V2TIMUserSearchParam v2TIMUserSearchParam = new V2TIMUserSearchParam();
        v2TIMUserSearchParam.setKeywordList(list);
        UserSearchFilter userFilter = searchOption.getUserFilter();
        if (userFilter != null) {
            v2TIMUserSearchParam.setGender(userFilter.getGender().getValue());
            v2TIMUserSearchParam.setMinBirthday(userFilter.getMinBirthday());
            Integer maxBirthday = userFilter.getMaxBirthday();
            if (maxBirthday != null) {
                v2TIMUserSearchParam.setMaxBirthday(maxBirthday.intValue());
            }
        }
        v2TIMUserSearchParam.setSearchCount(searchOption.getSearchCount());
        v2TIMUserSearchParam.setSearchCursor(c39981p.f88895d);
        V2TIMManager.getInstance().searchUsers(v2TIMUserSearchParam, new C39980o(c39981p, safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(suspendLambda);
        }
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return orThrow;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88375a(C39981p c39981p, List list, C39969d c39969d) {
        c39981p.getClass();
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(c39969d));
        V2TIMFriendSearchParam v2TIMFriendSearchParam = new V2TIMFriendSearchParam();
        v2TIMFriendSearchParam.setKeywordList(list);
        v2TIMFriendSearchParam.setSearchUserID(true);
        v2TIMFriendSearchParam.setSearchNickName(true);
        v2TIMFriendSearchParam.setSearchRemark(true);
        V2TIMManager.getFriendshipManager().searchFriends(v2TIMFriendSearchParam, new C39971f(c39981p, safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c39969d);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m88374a(C39981p c39981p, List list, SearchOption searchOption, SuspendLambda suspendLambda) {
        List<String> groupIDList;
        c39981p.getClass();
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(suspendLambda));
        V2TIMGroupMemberSearchParam v2TIMGroupMemberSearchParam = new V2TIMGroupMemberSearchParam();
        v2TIMGroupMemberSearchParam.setKeywordList(list);
        GroupMemberSearchFilter groupMemberFilter = searchOption.getGroupMemberFilter();
        if (groupMemberFilter != null && (groupIDList = groupMemberFilter.getGroupIDList()) != null && !groupIDList.isEmpty()) {
            v2TIMGroupMemberSearchParam.setGroupIDList(groupIDList);
        }
        if (searchOption.isCloudSearch()) {
            v2TIMGroupMemberSearchParam.setSearchCount(searchOption.getSearchCount());
            v2TIMGroupMemberSearchParam.setSearchCursor(c39981p.f88897f);
            v2TIMGroupMemberSearchParam.setKeywordListMatchType(searchOption.getKeywordListMatchType() == KeywordListMatchType.OR ? 0 : 1);
            V2TIMManager.getGroupManager().searchCloudGroupMembers(v2TIMGroupMemberSearchParam, new C39972g(c39981p, safeContinuation));
        } else {
            v2TIMGroupMemberSearchParam.setSearchMemberUserID(true);
            v2TIMGroupMemberSearchParam.setSearchMemberNickName(true);
            v2TIMGroupMemberSearchParam.setSearchMemberRemark(true);
            v2TIMGroupMemberSearchParam.setSearchMemberNameCard(true);
            V2TIMManager.getGroupManager().searchGroupMembers(v2TIMGroupMemberSearchParam, new C39973h(c39981p, safeContinuation));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(suspendLambda);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x023f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0241  */
    /* JADX WARN: Code duplicated, block: B:110:0x0248  */
    /* JADX WARN: Code duplicated, block: B:113:0x025b A[LOOP:0: B:111:0x0255->B:113:0x025b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x026f  */
    /* JADX WARN: Code duplicated, block: B:117:0x027f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0282  */
    /* JADX WARN: Code duplicated, block: B:121:0x0288  */
    /* JADX WARN: Code duplicated, block: B:122:0x028a  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:137:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:138:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:141:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:60:0x0161  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163  */
    /* JADX WARN: Code duplicated, block: B:64:0x016a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0174  */
    /* JADX WARN: Code duplicated, block: B:70:0x0187 A[LOOP:1: B:68:0x0181->B:70:0x0187, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0198  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:87:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ea  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [io.trtc.tuikit.atomicxcore.impl.search.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.trtc.tuikit.atomicxcore.impl.search.p] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4, types: [io.trtc.tuikit.atomicxcore.impl.search.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20, types: [io.trtc.tuikit.atomicxcore.impl.search.p] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [io.trtc.tuikit.atomicxcore.impl.search.p] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX INFO: renamed from: a */
    public static final Object m88373a(C39981p c39981p, List list, SearchOption searchOption, ContinuationImpl continuationImpl) {
        C39976k c39976k;
        int i11;
        int iIntValue;
        SearchOption searchOption2;
        ArrayList arrayList;
        int i12;
        int i13;
        String searchCursor;
        List<V2TIMMessageSearchResultItem> messageSearchResultItems;
        ?? EmptyList;
        int totalCount;
        int i14;
        Object objM88378a;
        int i15;
        ?? r11;
        int i16;
        int i17;
        int i18;
        ?? r13;
        int i19;
        ?? r12;
        boolean z11;
        boolean z12;
        boolean z13;
        int i21;
        List<V2TIMMessageSearchResultItem> messageSearchResultItems2;
        ?? EmptyList2;
        int totalCount2;
        int searchCount;
        int i22;
        int i23;
        int i24;
        Object objM88378a2;
        int i25;
        ?? r14;
        int i26;
        int i27;
        int i28;
        ?? r15;
        int i29;
        ?? r16;
        boolean z14;
        boolean z15;
        boolean z16;
        ?? r17 = c39981p;
        r17.getClass();
        if (continuationImpl instanceof C39976k) {
            c39976k = (C39976k) continuationImpl;
            int i31 = c39976k.f88881i;
            if ((i31 & Integer.MIN_VALUE) != 0) {
                c39976k.f88881i = i31 - Integer.MIN_VALUE;
            } else {
                c39976k = new C39976k(r17, continuationImpl);
            }
        } else {
            c39976k = new C39976k(r17, continuationImpl);
        }
        Object orThrow = c39976k.f88879g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i32 = c39976k.f88881i;
        if (i32 == 0) {
            ResultKt.throwOnFailure(orThrow);
            V2TIMMessageSearchParam v2TIMMessageSearchParam = new V2TIMMessageSearchParam();
            v2TIMMessageSearchParam.setKeywordList(list);
            MessageSearchFilter messageFilter = searchOption.getMessageFilter();
            if (messageFilter != null) {
                v2TIMMessageSearchParam.setConversationID(messageFilter.getConversationID());
                v2TIMMessageSearchParam.setSearchTimePosition(messageFilter.getSearchTimePosition());
                v2TIMMessageSearchParam.setSearchTimePeriod(messageFilter.getSearchTimePeriod());
                v2TIMMessageSearchParam.setSenderUserIDList(messageFilter.getSenderUserIDList());
                List<MessageType> messageTypeList = messageFilter.getMessageTypeList();
                if (messageTypeList != null) {
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(messageTypeList, 10));
                    Iterator it = messageTypeList.iterator();
                    while (it.hasNext()) {
                        switch (AbstractC39966a.f88844a[((MessageType) it.next()).ordinal()]) {
                            case 1:
                                i12 = 1;
                                break;
                            case 2:
                                i12 = 3;
                                break;
                            case 3:
                                i12 = 5;
                                break;
                            case 4:
                                i12 = 4;
                                break;
                            case 5:
                                i12 = 6;
                                break;
                            case 6:
                                i12 = 8;
                                break;
                            case 7:
                                i12 = 9;
                                break;
                            case 8:
                                i12 = 2;
                                break;
                            default:
                                i12 = 0;
                                break;
                        }
                        arrayList.add(Boxing.boxInt(i12));
                    }
                } else {
                    arrayList = null;
                }
                v2TIMMessageSearchParam.setMessageTypeList(arrayList);
            }
            MessageSearchFilter messageFilter2 = searchOption.getMessageFilter();
            String conversationID = messageFilter2 != null ? messageFilter2.getConversationID() : null;
            i11 = ((conversationID == null || conversationID.length() == 0) ? 1 : 0) ^ 1;
            if (searchOption.isCloudSearch()) {
                v2TIMMessageSearchParam.setSearchCount(searchOption.getSearchCount());
                v2TIMMessageSearchParam.setSearchCursor(r17.f88898g);
                c39976k.f88873a = r17;
                c39976k.f88874b = v2TIMMessageSearchParam;
                c39976k.f88875c = i11;
                c39976k.f88881i = 1;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(c39976k));
                V2TIMManager.getMessageManager().searchCloudMessages(v2TIMMessageSearchParam, new C39977l(safeContinuation));
                orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(c39976k);
                }
                if (orThrow != coroutine_suspended) {
                    V2TIMMessageSearchResult v2TIMMessageSearchResult = (V2TIMMessageSearchResult) orThrow;
                    if (r17.f88898g.length() == 0) {
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                    searchCursor = v2TIMMessageSearchResult.getSearchCursor();
                    if (searchCursor == null) {
                        searchCursor = "";
                    }
                    r17.f88898g = searchCursor;
                    messageSearchResultItems = v2TIMMessageSearchResult.getMessageSearchResultItems();
                    if (messageSearchResultItems != null) {
                        EmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(messageSearchResultItems, 10));
                        for (V2TIMMessageSearchResultItem v2TIMMessageSearchResultItem : messageSearchResultItems) {
                            Intrinsics.checkNotNull(v2TIMMessageSearchResultItem);
                            EmptyList.add(m88372a(v2TIMMessageSearchResultItem));
                        }
                    } else {
                        EmptyList = CollectionsKt.emptyList();
                    }
                    totalCount = v2TIMMessageSearchResult.getTotalCount();
                    if (r17.f88898g.length() > 0) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if (i13 == 0) {
                    }
                    c39976k.f88873a = r17;
                    c39976k.f88874b = null;
                    c39976k.f88875c = i11;
                    c39976k.f88876d = i13;
                    c39976k.f88877e = totalCount;
                    c39976k.f88878f = i14;
                    c39976k.f88881i = 2;
                    objM88378a = r17.m88378a(EmptyList, c39976k);
                    if (objM88378a != coroutine_suspended) {
                        i15 = totalCount;
                        orThrow = objM88378a;
                        r11 = r17;
                        i16 = i14;
                        i17 = i11;
                        i18 = i13;
                        r13 = r11;
                        i19 = i15;
                        i13 = i18;
                        i11 = i17;
                        i14 = i16;
                        r12 = (List) orThrow;
                        ?? r18 = r12;
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i11 != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        r13.m88379a(z11, z12, r18, i19, z13);
                    }
                }
            } else {
                Integer intOrNull = StringsKt.toIntOrNull(r17.f88898g);
                iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
                v2TIMMessageSearchParam.setPageIndex(iIntValue);
                v2TIMMessageSearchParam.setPageSize(searchOption.getSearchCount());
                c39976k.f88873a = r17;
                searchOption2 = searchOption;
                c39976k.f88874b = searchOption2;
                c39976k.f88875c = i11;
                c39976k.f88876d = iIntValue;
                c39976k.f88881i = 3;
                SafeContinuation safeContinuation2 = new SafeContinuation(IntrinsicsKt.intercepted(c39976k));
                V2TIMManager.getMessageManager().searchLocalMessages(v2TIMMessageSearchParam, new C39978m(safeContinuation2));
                orThrow = safeContinuation2.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(c39976k);
                }
                if (orThrow != coroutine_suspended) {
                    V2TIMMessageSearchResult v2TIMMessageSearchResult2 = (V2TIMMessageSearchResult) orThrow;
                    if (iIntValue == 0) {
                        i21 = 1;
                    } else {
                        i21 = 0;
                    }
                    messageSearchResultItems2 = v2TIMMessageSearchResult2.getMessageSearchResultItems();
                    if (messageSearchResultItems2 != null) {
                        EmptyList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(messageSearchResultItems2, 10));
                        for (V2TIMMessageSearchResultItem v2TIMMessageSearchResultItem2 : messageSearchResultItems2) {
                            Intrinsics.checkNotNull(v2TIMMessageSearchResultItem2);
                            r17.getClass();
                            EmptyList2.add(m88372a(v2TIMMessageSearchResultItem2));
                        }
                    } else {
                        EmptyList2 = CollectionsKt.emptyList();
                    }
                    totalCount2 = v2TIMMessageSearchResult2.getTotalCount();
                    searchCount = searchOption2.getSearchCount();
                    if (totalCount2 % searchCount == 0) {
                        i22 = totalCount2 / searchCount;
                    } else {
                        i22 = (totalCount2 / searchCount) + 1;
                    }
                    i23 = iIntValue + 1;
                    if (i23 < i22) {
                        i24 = 1;
                    } else {
                        i24 = 0;
                    }
                    r17.f88898g = String.valueOf(i23);
                    if (i21 == 0) {
                    }
                    c39976k.f88873a = r17;
                    c39976k.f88874b = null;
                    c39976k.f88875c = i11;
                    c39976k.f88876d = i21;
                    c39976k.f88877e = totalCount2;
                    c39976k.f88878f = i24;
                    c39976k.f88881i = 4;
                    objM88378a2 = r17.m88378a(EmptyList2, c39976k);
                    if (objM88378a2 != coroutine_suspended) {
                        i25 = totalCount2;
                        orThrow = objM88378a2;
                        r14 = r17;
                        i26 = i24;
                        i27 = i11;
                        i28 = i21;
                        r15 = r14;
                        i29 = i25;
                        i21 = i28;
                        i11 = i27;
                        i24 = i26;
                        r16 = (List) orThrow;
                        ?? r19 = r16;
                        if (i21 != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i11 != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        r15.m88379a(z14, z15, r19, i29, z16);
                    }
                }
            }
            return coroutine_suspended;
        }
        if (i32 == 1) {
            int i33 = c39976k.f88875c;
            C39981p c39981p2 = c39976k.f88873a;
            ResultKt.throwOnFailure(orThrow);
            i11 = i33;
            r17 = c39981p2;
            V2TIMMessageSearchResult v2TIMMessageSearchResult3 = (V2TIMMessageSearchResult) orThrow;
            if (r17.f88898g.length() == 0) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            searchCursor = v2TIMMessageSearchResult3.getSearchCursor();
            if (searchCursor == null) {
                searchCursor = "";
            }
            r17.f88898g = searchCursor;
            messageSearchResultItems = v2TIMMessageSearchResult3.getMessageSearchResultItems();
            if (messageSearchResultItems != null) {
                EmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(messageSearchResultItems, 10));
                while (r5.hasNext()) {
                    Intrinsics.checkNotNull(v2TIMMessageSearchResultItem);
                    EmptyList.add(m88372a(v2TIMMessageSearchResultItem));
                }
            } else {
                EmptyList = CollectionsKt.emptyList();
            }
            totalCount = v2TIMMessageSearchResult3.getTotalCount();
            if (r17.f88898g.length() > 0) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            if (i13 == 0 || i11 == 0) {
                c39976k.f88873a = r17;
                c39976k.f88874b = null;
                c39976k.f88875c = i11;
                c39976k.f88876d = i13;
                c39976k.f88877e = totalCount;
                c39976k.f88878f = i14;
                c39976k.f88881i = 2;
                objM88378a = r17.m88378a(EmptyList, c39976k);
                if (objM88378a != coroutine_suspended) {
                    i15 = totalCount;
                    orThrow = objM88378a;
                    r11 = r17;
                    i16 = i14;
                    i17 = i11;
                    i18 = i13;
                }
                return coroutine_suspended;
            }
            r13 = r17;
            i19 = totalCount;
            r12 = EmptyList;
            ?? r110 = r12;
            if (i13 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i11 != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i14 != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            r13.m88379a(z11, z12, r110, i19, z13);
        } else if (i32 != 2) {
            if (i32 == 3) {
                int i34 = c39976k.f88876d;
                i11 = c39976k.f88875c;
                SearchOption searchOption3 = (SearchOption) c39976k.f88874b;
                C39981p c39981p3 = c39976k.f88873a;
                ResultKt.throwOnFailure(orThrow);
                iIntValue = i34;
                r17 = c39981p3;
                searchOption2 = searchOption3;
                V2TIMMessageSearchResult v2TIMMessageSearchResult4 = (V2TIMMessageSearchResult) orThrow;
                if (iIntValue == 0) {
                    i21 = 1;
                } else {
                    i21 = 0;
                }
                messageSearchResultItems2 = v2TIMMessageSearchResult4.getMessageSearchResultItems();
                if (messageSearchResultItems2 != null) {
                    EmptyList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(messageSearchResultItems2, 10));
                    while (r5.hasNext()) {
                        Intrinsics.checkNotNull(v2TIMMessageSearchResultItem2);
                        r17.getClass();
                        EmptyList2.add(m88372a(v2TIMMessageSearchResultItem2));
                    }
                } else {
                    EmptyList2 = CollectionsKt.emptyList();
                }
                totalCount2 = v2TIMMessageSearchResult4.getTotalCount();
                searchCount = searchOption2.getSearchCount();
                if (totalCount2 % searchCount == 0) {
                    i22 = totalCount2 / searchCount;
                } else {
                    i22 = (totalCount2 / searchCount) + 1;
                }
                i23 = iIntValue + 1;
                if (i23 < i22) {
                    i24 = 1;
                } else {
                    i24 = 0;
                }
                r17.f88898g = String.valueOf(i23);
                if (i21 == 0 || i11 == 0) {
                    c39976k.f88873a = r17;
                    c39976k.f88874b = null;
                    c39976k.f88875c = i11;
                    c39976k.f88876d = i21;
                    c39976k.f88877e = totalCount2;
                    c39976k.f88878f = i24;
                    c39976k.f88881i = 4;
                    objM88378a2 = r17.m88378a(EmptyList2, c39976k);
                    if (objM88378a2 != coroutine_suspended) {
                        i25 = totalCount2;
                        orThrow = objM88378a2;
                        r14 = r17;
                        i26 = i24;
                        i27 = i11;
                        i28 = i21;
                    }
                    return coroutine_suspended;
                }
                r15 = r17;
                i29 = totalCount2;
                r16 = EmptyList2;
                ?? r111 = r16;
                if (i21 != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i11 != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i24 != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                r15.m88379a(z14, z15, r111, i29, z16);
            } else {
                if (i32 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i26 = c39976k.f88878f;
                i25 = c39976k.f88877e;
                i28 = c39976k.f88876d;
                i27 = c39976k.f88875c;
                C39981p c39981p4 = c39976k.f88873a;
                ResultKt.throwOnFailure(orThrow);
                r14 = c39981p4;
            }
            r15 = r14;
            i29 = i25;
            i21 = i28;
            i11 = i27;
            i24 = i26;
            r16 = (List) orThrow;
            ?? r112 = r16;
            if (i21 != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (i11 != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (i24 != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            r15.m88379a(z14, z15, r112, i29, z16);
        } else {
            i16 = c39976k.f88878f;
            i15 = c39976k.f88877e;
            i18 = c39976k.f88876d;
            i17 = c39976k.f88875c;
            C39981p c39981p5 = c39976k.f88873a;
            ResultKt.throwOnFailure(orThrow);
            r11 = c39981p5;
        }
        r13 = r11;
        i19 = i15;
        i13 = i18;
        i11 = i17;
        i14 = i16;
        r12 = (List) orThrow;
        ?? r113 = r12;
        if (i13 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i14 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        r13.m88379a(z11, z12, r113, i19, z13);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m88379a(boolean z11, boolean z12, List list, int i11, boolean z13) {
        if (z11) {
            this.f88911t.setValue(list);
        } else if (z12) {
            List list2 = (List) this.f88911t.getValue();
            if (!list2.isEmpty() && !list.isEmpty()) {
                MessageSearchResultItem messageSearchResultItem = (MessageSearchResultItem) CollectionsKt.first(list2);
                this.f88911t.setValue(CollectionsKt.listOf(new MessageSearchResultItem(messageSearchResultItem.getConversationID(), messageSearchResultItem.getConversationShowName(), messageSearchResultItem.getConversationAvatarURL(), messageSearchResultItem.getMessageCount() + ((MessageSearchResultItem) CollectionsKt.first(list)).getMessageCount(), CollectionsKt.plus((Collection) messageSearchResultItem.getMessageList(), (Iterable) ((MessageSearchResultItem) CollectionsKt.first(list)).getMessageList()))));
            }
        } else {
            InterfaceC41669n interfaceC41669n = this.f88911t;
            interfaceC41669n.setValue(CollectionsKt.plus((Collection) interfaceC41669n.getValue(), (Iterable) list));
        }
        this.f88912u.setValue(Integer.valueOf(i11));
        this.f88913v.setValue(Boolean.valueOf(z13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX INFO: renamed from: a */
    public static MessageSearchResultItem m88372a(V2TIMMessageSearchResultItem v2TIMMessageSearchResultItem) {
        ?? EmptyList;
        String conversationID = v2TIMMessageSearchResultItem.getConversationID();
        if (conversationID == null) {
            conversationID = "";
        }
        String str = conversationID;
        int messageCount = v2TIMMessageSearchResultItem.getMessageCount();
        List<V2TIMMessage> messageList = v2TIMMessageSearchResultItem.getMessageList();
        if (messageList != null) {
            EmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(messageList, 10));
            for (V2TIMMessage v2TIMMessage : messageList) {
                Intrinsics.checkNotNull(v2TIMMessage);
                EmptyList.add(AbstractC39504l.m88244a(v2TIMMessage));
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        return new MessageSearchResultItem(str, "", "", messageCount, EmptyList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m88378a(List list, ContinuationImpl continuationImpl) {
        C39967b c39967b;
        String str;
        if (continuationImpl instanceof C39967b) {
            c39967b = (C39967b) continuationImpl;
            int i11 = c39967b.f88848d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c39967b.f88848d = i11 - Integer.MIN_VALUE;
            } else {
                c39967b = new C39967b(this, continuationImpl);
            }
        } else {
            c39967b = new C39967b(this, continuationImpl);
        }
        Object orThrow = c39967b.f88846b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c39967b.f88848d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(orThrow);
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MessageSearchResultItem) it.next()).getConversationID());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((String) obj).length() > 0) {
                        arrayList2.add(obj);
                    }
                }
                List<String> listDistinct = CollectionsKt.distinct(arrayList2);
                if (!listDistinct.isEmpty()) {
                    c39967b.f88845a = list;
                    c39967b.f88848d = 1;
                    SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(c39967b));
                    V2TIMManager.getConversationManager().getConversationList(listDistinct, new C39968c(safeContinuation));
                    orThrow = safeContinuation.getOrThrow();
                    if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(c39967b);
                    }
                    if (orThrow == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return list;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list = c39967b.f88845a;
        ResultKt.throwOnFailure(orThrow);
        Map map = (Map) orThrow;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (MessageSearchResultItem messageSearchResultItemCopy$default : list) {
            V2TIMConversation v2TIMConversation = (V2TIMConversation) map.get(messageSearchResultItemCopy$default.getConversationID());
            if (v2TIMConversation != null) {
                String showName = v2TIMConversation.getShowName();
                if (showName == null) {
                    showName = "";
                } else {
                    Intrinsics.checkNotNull(showName);
                }
                String faceUrl = v2TIMConversation.getFaceUrl();
                if (faceUrl == null) {
                    str = "";
                } else {
                    Intrinsics.checkNotNull(faceUrl);
                    str = faceUrl;
                }
                messageSearchResultItemCopy$default = MessageSearchResultItem.copy$default(messageSearchResultItemCopy$default, null, showName, str, 0, null, 25, null);
            }
            arrayList3.add(messageSearchResultItemCopy$default);
        }
        return arrayList3;
    }
}
