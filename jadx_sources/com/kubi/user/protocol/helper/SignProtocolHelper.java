package com.kubi.user.protocol.helper;

import com.kubi.user.api.entity.UserTermSubRequest;
import com.kubi.user.api.n;
import com.kubi.user.exception.UserCenterMessage;
import com.kubi.user.protocol.entity.SignProtocolContentItem;
import com.kubi.user.protocol.entity.SignProtocolLinkItem;
import com.kubi.user.protocol.entity.SignTermItem;
import com.kubi.user.signup.SignupExtKt;
import com.kubi.utils.C27099x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SignProtocolHelper.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010\r\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J.\u0010\u0013\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/user/protocol/helper/SignProtocolHelper;", "", "<init>", "()V", "TAG", "", "MAX_PROTOCOL_COUNT", "", "signTerms", "", "userTermList", "", "Lcom/kubi/user/api/entity/UserTermSubRequest;", "fetchWaitedSignTerms", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isTermValid", "", "item", "Lcom/kubi/user/protocol/entity/SignTermItem;", "convertSignTermItemList", "Lkotlin/Pair;", "", "Lcom/kubi/user/protocol/entity/SignProtocolLinkItem;", "Lcom/kubi/user/protocol/entity/SignProtocolContentItem;", "filteredSignTermListJson", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSignProtocolHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignProtocolHelper.kt\ncom/kubi/user/protocol/helper/SignProtocolHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 6 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,165:1\n774#2:166\n865#2,2:167\n1491#2:169\n1516#2,3:170\n1519#2,3:180\n382#3,7:173\n77#4:183\n97#4,5:184\n35#5,3:189\n67#6,2:192\n*S KotlinDebug\n*F\n+ 1 SignProtocolHelper.kt\ncom/kubi/user/protocol/helper/SignProtocolHelper\n*L\n79#1:166\n79#1:167,2\n80#1:169\n80#1:170,3\n80#1:180,3\n80#1:173,7\n81#1:183\n81#1:184,5\n89#1:189,3\n103#1:192,2\n*E\n"})
public final class SignProtocolHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SignProtocolHelper f53730a = new SignProtocolHelper();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m65585b(@NotNull Continuation<? super String> continuation) {
        SignProtocolHelper$fetchWaitedSignTerms$1 signProtocolHelper$fetchWaitedSignTerms$1;
        String strM66919i;
        if (continuation instanceof SignProtocolHelper$fetchWaitedSignTerms$1) {
            signProtocolHelper$fetchWaitedSignTerms$1 = (SignProtocolHelper$fetchWaitedSignTerms$1) continuation;
            int i11 = signProtocolHelper$fetchWaitedSignTerms$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                signProtocolHelper$fetchWaitedSignTerms$1.label = i11 - Integer.MIN_VALUE;
            } else {
                signProtocolHelper$fetchWaitedSignTerms$1 = new SignProtocolHelper$fetchWaitedSignTerms$1(this, continuation);
            }
        } else {
            signProtocolHelper$fetchWaitedSignTerms$1 = new SignProtocolHelper$fetchWaitedSignTerms$1(this, continuation);
        }
        Object objB = signProtocolHelper$fetchWaitedSignTerms$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = signProtocolHelper$fetchWaitedSignTerms$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objB);
                n nVar = (n) C42597a.m93388d().create(n.class);
                signProtocolHelper$fetchWaitedSignTerms$1.L$0 = SpillingKt.nullOutSpilledVariable(nVar);
                signProtocolHelper$fetchWaitedSignTerms$1.label = 1;
                objB = nVar.b(signProtocolHelper$fetchWaitedSignTerms$1);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objB);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : (List) objB) {
                if (f53730a.m65586c((SignTermItem) obj)) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : arrayList) {
                String type = ((SignTermItem) obj2).getType();
                Object arrayList2 = linkedHashMap.get(type);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(type, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList3, CollectionsKt.take((List) ((Map.Entry) it.next()).getValue(), 4));
            }
            C44128b.m97259c("SignProtocolHelper", "fetchWaitedSignTerms success, signTermList is " + arrayList3);
            return (arrayList3.isEmpty() || (strM66919i = C27099x.m66919i(arrayList3, false, 2, null)) == null) ? "" : strM66919i;
        } catch (Exception e11) {
            C44128b.m97261e("SignProtocolHelper", "fetchWaitedSignTerms failed, exception is " + e11);
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m65587d(@NotNull List<UserTermSubRequest> userTermList) {
        Intrinsics.checkNotNullParameter(userTermList, "userTermList");
        C41696j.m91104d(SignupExtKt.m65735h(null, null, 3, null), null, null, new SignProtocolHelper$signTerms$1(userTermList, null), 3, null);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m65584a(@NotNull String str, @NotNull Continuation<? super Pair<? extends List<SignProtocolLinkItem>, ? extends List<SignProtocolContentItem>>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new SignProtocolHelper$convertSignTermItemList$2(str, null), continuation);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m65586c(SignTermItem signTermItem) {
        boolean z11;
        boolean z12;
        boolean z13;
        String id2 = signTermItem.getId();
        if (id2 != null && id2.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        String title = signTermItem.getTitle();
        if (title != null && title.length() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!Intrinsics.areEqual(signTermItem.getType(), SignTermItem.LINK) && !Intrinsics.areEqual(signTermItem.getType(), "text")) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 || !z12 || !z13) {
            C43846g.m96568c(new UserCenterMessage("fetchWaitedSignTerms item.termId is " + signTermItem.getId() + ", item.title is " + signTermItem.getTitle() + ", item.agreementForm is " + signTermItem.getType() + ',', "SignProtocolHelper", false, 4, null), null, 2, null);
        }
        if (z11 && z12 && z13) {
            return true;
        }
        return false;
    }
}
