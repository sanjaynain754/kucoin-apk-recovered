package com.kubi.user.protocol.helper;

import com.kubi.user.R$string;
import com.kubi.user.protocol.entity.SignProtocolContentItem;
import com.kubi.user.protocol.entity.SignProtocolLinkItem;
import com.kubi.user.protocol.entity.SignTermItem;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27099x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SignProtocolHelper.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/kubi/user/protocol/entity/SignProtocolLinkItem;", "Lcom/kubi/user/protocol/entity/SignProtocolContentItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.protocol.helper.SignProtocolHelper$convertSignTermItemList$2", m90122f = "SignProtocolHelper.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {168}, m90125m = "invokeSuspend", m90126n = {"protocolLinkItemList", "protocolContentItemList", "this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
@SourceDebugExtension({"SMAP\nSignProtocolHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignProtocolHelper.kt\ncom/kubi/user/protocol/helper/SignProtocolHelper$convertSignTermItemList$2\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n196#2,3:166\n1869#3,2:169\n*S KotlinDebug\n*F\n+ 1 SignProtocolHelper.kt\ncom/kubi/user/protocol/helper/SignProtocolHelper$convertSignTermItemList$2\n*L\n121#1:166,3\n123#1:169,2\n*E\n"})
public final class SignProtocolHelper$convertSignTermItemList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Pair<? extends List<SignProtocolLinkItem>, ? extends List<SignProtocolContentItem>>>, Object> {
    final /* synthetic */ String $filteredSignTermListJson;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignProtocolHelper$convertSignTermItemList$2(String str, Continuation<? super SignProtocolHelper$convertSignTermItemList$2> continuation) {
        super(2, continuation);
        this.$filteredSignTermListJson = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignProtocolHelper$convertSignTermItemList$2(this.$filteredSignTermListJson, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Pair<? extends List<SignProtocolLinkItem>, ? extends List<SignProtocolContentItem>>> continuation) {
        return ((SignProtocolHelper$convertSignTermItemList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List arrayList;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    list = (List) this.L$1;
                    arrayList = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                C27099x c27099x = C27099x.f54458a;
                String str = this.$filteredSignTermListJson;
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C26756xf3e3569c(str, null)), C42911a.m94120b());
                this.L$0 = arrayList;
                this.L$1 = arrayList2;
                this.L$2 = SpillingKt.nullOutSpilledVariable(c27099x);
                this.L$3 = SpillingKt.nullOutSpilledVariable(str);
                this.I$0 = 0;
                this.label = 1;
                Object objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, this);
                if (objM90914f0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = arrayList2;
                obj = objM90914f0;
            }
            List<SignTermItem> list2 = (List) obj;
            if (list2 != null) {
                for (SignTermItem signTermItem : list2) {
                    String type = signTermItem.getType();
                    if (Intrinsics.areEqual(type, SignTermItem.LINK)) {
                        arrayList.add(new SignProtocolLinkItem(signTermItem.getId(), signTermItem.getTitle(), "Agreement"));
                    } else if (Intrinsics.areEqual(type, "text")) {
                        String id2 = signTermItem.getId();
                        C27017c c27017c = C27017c.f54310a;
                        list.add(new SignProtocolContentItem(id2, c27017c.m66516f(R$string.resign_text_policy, signTermItem.getTitle()), signTermItem.getTitle(), c27017c.m66516f(R$string.resign_text_policy_desc, signTermItem.getTitle()), "Agreement", Boxing.boxBoolean(false), Boxing.boxInt(0)));
                    }
                }
            }
            return new Pair(arrayList, list);
        } catch (Exception e11) {
            C44128b.m97263g("SignProtocolHelper", e11);
            return new Pair(new ArrayList(), new ArrayList());
        }
    }
}
