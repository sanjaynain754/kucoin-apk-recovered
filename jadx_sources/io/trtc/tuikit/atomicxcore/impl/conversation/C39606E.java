package io.trtc.tuikit.atomicxcore.impl.conversation;

import android.os.Handler;
import android.os.Looper;
import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.p128v2.V2TIMConversation;
import com.tencent.imsdk.p128v2.V2TIMConversationListFilter;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.ReceiveMessageOpt;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationFetchOption;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationInfo;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationListFilter;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationListState;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationListStore;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType;
import io.trtc.tuikit.atomicxcore.impl.common.C39505m;
import io.trtc.tuikit.atomicxcore.impl.common.C39515w;
import io.trtc.tuikit.atomicxcore.impl.common.C39516x;
import io.trtc.tuikit.atomicxcore.impl.common.EnumC39496d;
import io.trtc.tuikit.atomicxcore.impl.conversation.C39606E;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.E */
/* JADX INFO: loaded from: classes61.dex */
public final class C39606E extends ConversationListStore {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41709m0 f87973a;

    /* JADX INFO: renamed from: b */
    public final Handler f87974b;

    /* JADX INFO: renamed from: c */
    public boolean f87975c;

    /* JADX INFO: renamed from: d */
    public final Runnable f87976d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n f87977e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n f87978f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41669n f87979g;

    /* JADX INFO: renamed from: h */
    public ConversationFetchOption f87980h;

    /* JADX INFO: renamed from: i */
    public long f87981i;

    /* JADX INFO: renamed from: j */
    public long f87982j;

    /* JADX INFO: renamed from: k */
    public ConversationListFilter f87983k;

    /* JADX INFO: renamed from: l */
    public final ConversationListState f87984l;

    /* JADX INFO: renamed from: m */
    public volatile C39634q f87985m;

    /* JADX INFO: renamed from: n */
    public volatile C39639v f87986n;

    /* JADX INFO: renamed from: a */
    public static final void m88282a(C39606E this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f87975c = false;
        this$0.m88283a();
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationListStore
    public final void clearConversationMessages(String conversationID, CompletionHandler completionHandler) {
        String conversationID2;
        String strReplaceFirst$default;
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        if (StringsKt.startsWith$default(conversationID, TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX, false, 2, (Object) null)) {
            conversationID2 = conversationID;
            strReplaceFirst$default = StringsKt.replaceFirst$default(conversationID2, TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX, "", false, 4, (Object) null);
        } else {
            conversationID2 = conversationID;
            strReplaceFirst$default = null;
        }
        Intrinsics.checkNotNullParameter(conversationID2, "conversationID");
        String strReplaceFirst$default2 = StringsKt.startsWith$default(conversationID2, TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX, false, 2, (Object) null) ? StringsKt.replaceFirst$default(conversationID2, TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX, "", false, 4, (Object) null) : null;
        if (strReplaceFirst$default != null && strReplaceFirst$default.length() > 0) {
            V2TIMManager.getMessageManager().clearC2CHistoryMessage(strReplaceFirst$default, new C39630m(conversationID2, completionHandler));
        } else {
            if (strReplaceFirst$default2 == null || strReplaceFirst$default2.length() <= 0) {
                return;
            }
            V2TIMManager.getMessageManager().clearGroupHistoryMessage(strReplaceFirst$default2, new C39631n(conversationID2, completionHandler));
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationListStore
    public final void clearConversationUnreadCount(String conversationID, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        V2TIMManager.getConversationManager().cleanConversationUnreadMessageCount(conversationID, 0L, 0L, new C39632o(completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationListStore
    public final void deleteConversation(String conversationID, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        V2TIMManager.getConversationManager().deleteConversation(conversationID, new C39635r(this, completionHandler, conversationID));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationListStore
    public final void fetchConversationInfo(String conversationID, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        V2TIMManager.getConversationManager().getConversation(conversationID, new C39636s(completionHandler, this));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationListStore
    public final void fetchConversationList(ConversationFetchOption option, CompletionHandler completionHandler) throws JSONException {
        Intrinsics.checkNotNullParameter(option, "option");
        ConversationListFilter filter = option.getFilter();
        V2TIMConversationListFilter v2TIMConversationListFilter = new V2TIMConversationListFilter();
        if (filter != null) {
            v2TIMConversationListFilter.setConversationType(filter.getType().getValue());
            String conversationGroup = filter.getConversationGroup();
            if (conversationGroup != null) {
                v2TIMConversationListFilter.setConversationGroup(conversationGroup);
            }
            ConversationMarkType markType = filter.getMarkType();
            if (markType != null) {
                v2TIMConversationListFilter.setMarkType(markType.getValue());
            }
            Boolean hasUnreadCount = filter.getHasUnreadCount();
            if (hasUnreadCount != null) {
                v2TIMConversationListFilter.setHasUnreadCount(hasUnreadCount.booleanValue());
            }
            Boolean hasGroupAtInfo = filter.getHasGroupAtInfo();
            if (hasGroupAtInfo != null) {
                v2TIMConversationListFilter.setHasGroupAtInfo(hasGroupAtInfo.booleanValue());
            }
        }
        EnumC39496d componentType = EnumC39496d.CONVERSATION_LIST;
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("UIComponentType", 1004);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        V2TIMManager.getInstance().callExperimentalAPI("reportTUIFeatureUsage", string, new C39505m());
        this.f87980h = option;
        V2TIMManager.getConversationManager().getConversationListByFilter(v2TIMConversationListFilter, 0L, option.getCount(), new C39637t(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationListStore
    public final void fetchMoreConversationList(CompletionHandler completionHandler) {
        if (!((Boolean) this.f87978f.getValue()).booleanValue()) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "No more conversation");
                return;
            }
            return;
        }
        ConversationFetchOption conversationFetchOption = this.f87980h;
        if (conversationFetchOption == null) {
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Please call fetchConversationList first");
                return;
            }
            return;
        }
        ConversationListFilter filter = conversationFetchOption.getFilter();
        V2TIMConversationListFilter v2TIMConversationListFilter = new V2TIMConversationListFilter();
        if (filter != null) {
            v2TIMConversationListFilter.setConversationType(filter.getType().getValue());
            String conversationGroup = filter.getConversationGroup();
            if (conversationGroup != null) {
                v2TIMConversationListFilter.setConversationGroup(conversationGroup);
            }
            ConversationMarkType markType = filter.getMarkType();
            if (markType != null) {
                v2TIMConversationListFilter.setMarkType(markType.getValue());
            }
            Boolean hasUnreadCount = filter.getHasUnreadCount();
            if (hasUnreadCount != null) {
                v2TIMConversationListFilter.setHasUnreadCount(hasUnreadCount.booleanValue());
            }
            Boolean hasGroupAtInfo = filter.getHasGroupAtInfo();
            if (hasGroupAtInfo != null) {
                v2TIMConversationListFilter.setHasGroupAtInfo(hasGroupAtInfo.booleanValue());
            }
        }
        V2TIMManager.getConversationManager().getConversationListByFilter(v2TIMConversationListFilter, this.f87981i, conversationFetchOption.getCount(), new C39638u(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationListStore
    public final ConversationListState getConversationListState() {
        return this.f87984l;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationListStore
    public final void getConversationTotalUnreadCount(CompletionHandler completionHandler) {
        C41696j.m91104d(this.f87973a, null, null, new C39641x(this, completionHandler, null), 3, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationListStore
    public final void markConversation(List conversationIDList, ConversationMarkType markType, boolean z11, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(conversationIDList, "conversationIDList");
        Intrinsics.checkNotNullParameter(markType, "markType");
        V2TIMManager.getConversationManager().markConversation(conversationIDList, markType.getValue(), z11, new C39643z(completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationListStore
    public final void muteConversation(String conversationID, boolean z11, CompletionHandler completionHandler) {
        String conversationID2;
        String strReplaceFirst$default;
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        if (StringsKt.startsWith$default(conversationID, TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX, false, 2, (Object) null)) {
            conversationID2 = conversationID;
            strReplaceFirst$default = StringsKt.replaceFirst$default(conversationID2, TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX, "", false, 4, (Object) null);
        } else {
            conversationID2 = conversationID;
            strReplaceFirst$default = null;
        }
        Intrinsics.checkNotNullParameter(conversationID2, "conversationID");
        String strReplaceFirst$default2 = StringsKt.startsWith$default(conversationID2, TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX, false, 2, (Object) null) ? StringsKt.replaceFirst$default(conversationID2, TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX, "", false, 4, (Object) null) : null;
        int i11 = z11 ? 2 : 0;
        if (strReplaceFirst$default2 != null && strReplaceFirst$default2.length() != 0) {
            V2TIMManager.getMessageManager().setGroupReceiveMessageOpt(strReplaceFirst$default2, i11, new C39602A(completionHandler, conversationID2, z11));
            return;
        }
        if (strReplaceFirst$default != null && strReplaceFirst$default.length() != 0) {
            V2TIMManager.getMessageManager().setC2CReceiveMessageOpt(CollectionsKt.listOf(strReplaceFirst$default), i11, new C39603B(completionHandler, conversationID2, z11));
        } else if (completionHandler != null) {
            completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "conversationID is invalid");
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationListStore
    public final void pinConversation(String conversationID, boolean z11, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        V2TIMManager.getConversationManager().pinConversation(conversationID, z11, new C39604C(this, completionHandler, conversationID, z11));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.conversation.ConversationListStore
    public final void setConversationDraft(String conversationID, String str, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        V2TIMManager.getConversationManager().setConversationDraft(conversationID, str == null ? "" : str, new C39605D(this, completionHandler, conversationID, str));
    }

    public C39606E() {
        InterfaceC41709m0 interfaceC41709m0M91125a = C41713n0.m91125a(C41782z0.m91393c());
        this.f87973a = interfaceC41709m0M91125a;
        this.f87974b = new Handler(Looper.getMainLooper());
        this.f87976d = new Runnable() { // from class: eg0.a
            @Override // java.lang.Runnable
            public final void run() {
                C39606E.m88282a(this.f82470b);
            }
        };
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(CollectionsKt.emptyList());
        this.f87977e = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(Boolean.TRUE);
        this.f87978f = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a(0L);
        this.f87979g = interfaceC41669nM91009a3;
        this.f87984l = new ConversationListState(C41636g.m90907c(interfaceC41669nM91009a), C41636g.m90907c(interfaceC41669nM91009a2), C41636g.m90907c(interfaceC41669nM91009a3));
        this.f87985m = new C39634q(this);
        this.f87986n = new C39639v(this);
        C39515w c39515w = new C39515w(this.f87985m);
        C39516x c39516x = new C39516x(this.f87986n);
        V2TIMManager.getConversationManager().addConversationListener(c39515w);
        V2TIMManager.getFriendshipManager().addFriendListener(c39516x);
        C41696j.m91104d(interfaceC41709m0M91125a, null, null, new C39629l(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0154  */
    /* JADX INFO: renamed from: a */
    public final void m88283a() {
        int i11;
        boolean z11;
        C39617P c39617p = C39617P.f88005a;
        if (C39617P.f88012h) {
            ConversationFetchOption conversationFetchOption = this.f87980h;
            ConversationListFilter filter = conversationFetchOption != null ? conversationFetchOption.getFilter() : null;
            InterfaceC41669n interfaceC41669n = this.f87979g;
            long jMax = this.f87982j;
            if (C39617P.f88012h) {
                Collection collectionValues = C39617P.f88006b.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                ArrayList<ConversationInfo> arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    ConversationInfo conversationInfo = (ConversationInfo) obj;
                    C39617P c39617p2 = C39617P.f88005a;
                    Intrinsics.checkNotNull(conversationInfo);
                    if (C39617P.m88287a(conversationInfo, filter) && conversationInfo.getReceiveOption() != ReceiveMessageOpt.NOT_NOTIFY && conversationInfo.getReceiveOption() != ReceiveMessageOpt.NOT_NOTIFY_EXCEPT_MENTION) {
                        arrayList.add(obj);
                    }
                }
                long unreadCount = 0;
                for (ConversationInfo conversationInfo2 : arrayList) {
                    C39617P c39617p3 = C39617P.f88005a;
                    Intrinsics.checkNotNull(conversationInfo2);
                    V2TIMConversation rawConversation$atomicxcore_release = conversationInfo2.getRawConversation$atomicxcore_release();
                    unreadCount += (long) (rawConversation$atomicxcore_release != null ? rawConversation$atomicxcore_release.getUnreadCount() : 0);
                }
                Collection collectionValues2 = C39617P.f88007c.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues2, "<get-values>(...)");
                ArrayList<ConversationInfo> arrayList2 = new ArrayList();
                for (Object obj2 : collectionValues2) {
                    ConversationInfo conversationInfo3 = (ConversationInfo) obj2;
                    C39617P c39617p4 = C39617P.f88005a;
                    Intrinsics.checkNotNull(conversationInfo3);
                    if (C39617P.m88287a(conversationInfo3, filter) && conversationInfo3.getReceiveOption() != ReceiveMessageOpt.NOT_NOTIFY && conversationInfo3.getReceiveOption() != ReceiveMessageOpt.NOT_NOTIFY_EXCEPT_MENTION) {
                        arrayList2.add(obj2);
                    }
                }
                long unreadCount2 = 0;
                for (ConversationInfo conversationInfo4 : arrayList2) {
                    C39617P c39617p5 = C39617P.f88005a;
                    Intrinsics.checkNotNull(conversationInfo4);
                    V2TIMConversation rawConversation$atomicxcore_release2 = conversationInfo4.getRawConversation$atomicxcore_release();
                    unreadCount2 += (long) (rawConversation$atomicxcore_release2 != null ? rawConversation$atomicxcore_release2.getUnreadCount() : 0);
                }
                Collection<ConversationInfo> collectionValues3 = C39617P.f88008d.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues3, "<get-values>(...)");
                if (collectionValues3.isEmpty()) {
                    i11 = 0;
                } else {
                    i11 = 0;
                    for (ConversationInfo conversationInfo5 : collectionValues3) {
                        C39617P c39617p6 = C39617P.f88005a;
                        Intrinsics.checkNotNull(conversationInfo5);
                        if (!C39617P.m88287a(conversationInfo5, filter) || conversationInfo5.getReceiveOption() == ReceiveMessageOpt.NOT_NOTIFY || conversationInfo5.getReceiveOption() == ReceiveMessageOpt.NOT_NOTIFY_EXCEPT_MENTION || C39617P.f88006b.containsKey(conversationInfo5.getConversationID()) || C39617P.f88007c.containsKey(conversationInfo5.getConversationID())) {
                            z11 = false;
                        } else {
                            V2TIMConversation rawConversation$atomicxcore_release3 = conversationInfo5.getRawConversation$atomicxcore_release();
                            if ((rawConversation$atomicxcore_release3 != null ? rawConversation$atomicxcore_release3.getUnreadCount() : 0) == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        if (z11 && (i11 = i11 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                jMax = Math.max(0L, ((jMax + ((long) i11)) - unreadCount) - unreadCount2);
            }
            interfaceC41669n.setValue(Long.valueOf(jMax));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m88284a(ConversationListFilter conversationListFilter) {
        V2TIMConversationListFilter v2TIMConversationListFilter = new V2TIMConversationListFilter();
        if (conversationListFilter != null) {
            v2TIMConversationListFilter.setConversationType(conversationListFilter.getType().getValue());
            String conversationGroup = conversationListFilter.getConversationGroup();
            if (conversationGroup != null) {
                v2TIMConversationListFilter.setConversationGroup(conversationGroup);
            }
            ConversationMarkType markType = conversationListFilter.getMarkType();
            if (markType != null) {
                v2TIMConversationListFilter.setMarkType(markType.getValue());
            }
            Boolean hasUnreadCount = conversationListFilter.getHasUnreadCount();
            if (hasUnreadCount != null) {
                v2TIMConversationListFilter.setHasUnreadCount(hasUnreadCount.booleanValue());
            }
            Boolean hasGroupAtInfo = conversationListFilter.getHasGroupAtInfo();
            if (hasGroupAtInfo != null) {
                v2TIMConversationListFilter.setHasGroupAtInfo(hasGroupAtInfo.booleanValue());
            }
        }
        V2TIMManager.getConversationManager().unsubscribeUnreadMessageCountByFilter(v2TIMConversationListFilter);
        this.f87983k = null;
    }
}
