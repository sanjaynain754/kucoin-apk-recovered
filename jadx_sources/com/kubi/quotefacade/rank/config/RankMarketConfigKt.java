package com.kubi.quotefacade.rank.config;

import com.kubi.quotefacade.R$string;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27017c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: RankMarketConfig.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\r\u001a\u000e\u0010\u000e\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u000f\u001a\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0086@¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0011\u001a\u00020\u000b2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003H\u0086@¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"defaultMarketType", "", "defaultMarketConfig", "", "marketSeparator", "curMarketConfig", "Lcom/kubi/sdk/widget/dialog/SelectEntity;", "chooseMarketEntity", "Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;", "chooseMarketValue", "updateCurMarket", "", "selectItem", "(Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurMarketEntity", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRankMarketConfig", "updateMarketConfig", "marketList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankMarketConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankMarketConfig.kt\ncom/kubi/quotefacade/rank/config/RankMarketConfigKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n295#2,2:112\n1869#2,2:114\n*S KotlinDebug\n*F\n+ 1 RankMarketConfig.kt\ncom/kubi/quotefacade/rank/config/RankMarketConfigKt\n*L\n54#1:112,2\n83#1:114,2\n*E\n"})
public final class RankMarketConfigKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final List<String> f42413a = CollectionsKt.listOf("ALL");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static List<SelectEntity> f42414b = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: c */
    @Nullable
    public static BottomSheetDialogHelper.InterfaceC24339a f42415c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public static String f42416d;

    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Object m52711c(@NotNull Continuation<? super BottomSheetDialogHelper.InterfaceC24339a> continuation) {
        RankMarketConfigKt$getCurMarketEntity$1 rankMarketConfigKt$getCurMarketEntity$1;
        SelectEntity selectEntity;
        String str;
        SelectEntity selectEntity2;
        String str2;
        SelectEntity selectEntity3;
        SelectEntity selectEntity4;
        Object objM91049g;
        Iterator it;
        Object next;
        if (continuation instanceof RankMarketConfigKt$getCurMarketEntity$1) {
            rankMarketConfigKt$getCurMarketEntity$1 = (RankMarketConfigKt$getCurMarketEntity$1) continuation;
            int i11 = rankMarketConfigKt$getCurMarketEntity$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rankMarketConfigKt$getCurMarketEntity$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rankMarketConfigKt$getCurMarketEntity$1 = new RankMarketConfigKt$getCurMarketEntity$1(continuation);
            }
        } else {
            rankMarketConfigKt$getCurMarketEntity$1 = new RankMarketConfigKt$getCurMarketEntity$1(continuation);
        }
        Object objM91049g2 = rankMarketConfigKt$getCurMarketEntity$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = rankMarketConfigKt$getCurMarketEntity$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                selectEntity2 = (SelectEntity) rankMarketConfigKt$getCurMarketEntity$1.L$0;
                ResultKt.throwOnFailure(objM91049g2);
            } else {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objM91049g2);
                    return objM91049g2;
                }
                str2 = (String) rankMarketConfigKt$getCurMarketEntity$1.L$1;
                selectEntity4 = (SelectEntity) rankMarketConfigKt$getCurMarketEntity$1.L$0;
                ResultKt.throwOnFailure(objM91049g2);
            }
            it = ((Iterable) objM91049g2).iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((SelectEntity) next).getValue(), str2));
            selectEntity3 = (SelectEntity) next;
            selectEntity = selectEntity4;
            AbstractC41586e2 abstractC41586e2M91393c = C41782z0.m91393c();
            RankMarketConfigKt$getCurMarketEntity$3 rankMarketConfigKt$getCurMarketEntity$3 = new RankMarketConfigKt$getCurMarketEntity$3(selectEntity3, selectEntity, null);
            rankMarketConfigKt$getCurMarketEntity$1.L$0 = SpillingKt.nullOutSpilledVariable(selectEntity);
            rankMarketConfigKt$getCurMarketEntity$1.L$1 = SpillingKt.nullOutSpilledVariable(str2);
            rankMarketConfigKt$getCurMarketEntity$1.L$2 = SpillingKt.nullOutSpilledVariable(selectEntity3);
            rankMarketConfigKt$getCurMarketEntity$1.label = 3;
            objM91049g = C41686h.m91049g(abstractC41586e2M91393c, rankMarketConfigKt$getCurMarketEntity$3, rankMarketConfigKt$getCurMarketEntity$1);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objM91049g;
        }
        ResultKt.throwOnFailure(objM91049g2);
        BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a = f42415c;
        if (interfaceC24339a != null) {
            return interfaceC24339a;
        }
        selectEntity = new SelectEntity(null, C27017c.f54310a.m66516f(R$string.all_market, new Object[0]), "ALL", null, null, null, null, null, null, false, false, null, 4089, null);
        str = f42416d;
        if (str == null) {
            AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
            RankMarketConfigKt$getCurMarketEntity$preChoose$1 rankMarketConfigKt$getCurMarketEntity$preChoose$1 = new RankMarketConfigKt$getCurMarketEntity$preChoose$1(null);
            rankMarketConfigKt$getCurMarketEntity$1.L$0 = selectEntity;
            rankMarketConfigKt$getCurMarketEntity$1.label = 1;
            objM91049g2 = C41686h.m91049g(abstractC41697j0M91392b, rankMarketConfigKt$getCurMarketEntity$preChoose$1, rankMarketConfigKt$getCurMarketEntity$1);
            if (objM91049g2 != coroutine_suspended) {
                selectEntity2 = selectEntity;
            }
        } else {
            str2 = str;
            if (str2 != null || str2.length() == 0) {
                selectEntity3 = null;
                AbstractC41586e2 abstractC41586e2M91393c2 = C41782z0.m91393c();
                RankMarketConfigKt$getCurMarketEntity$3 rankMarketConfigKt$getCurMarketEntity$4 = new RankMarketConfigKt$getCurMarketEntity$3(selectEntity3, selectEntity, null);
                rankMarketConfigKt$getCurMarketEntity$1.L$0 = SpillingKt.nullOutSpilledVariable(selectEntity);
                rankMarketConfigKt$getCurMarketEntity$1.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                rankMarketConfigKt$getCurMarketEntity$1.L$2 = SpillingKt.nullOutSpilledVariable(selectEntity3);
                rankMarketConfigKt$getCurMarketEntity$1.label = 3;
                objM91049g = C41686h.m91049g(abstractC41586e2M91393c2, rankMarketConfigKt$getCurMarketEntity$4, rankMarketConfigKt$getCurMarketEntity$1);
                if (objM91049g == coroutine_suspended) {
                    return objM91049g;
                }
            } else {
                rankMarketConfigKt$getCurMarketEntity$1.L$0 = selectEntity;
                rankMarketConfigKt$getCurMarketEntity$1.L$1 = str2;
                rankMarketConfigKt$getCurMarketEntity$1.label = 2;
                objM91049g2 = m52712d(rankMarketConfigKt$getCurMarketEntity$1);
                if (objM91049g2 != coroutine_suspended) {
                    selectEntity4 = selectEntity;
                    it = ((Iterable) objM91049g2).iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((SelectEntity) next).getValue(), str2));
                    selectEntity3 = (SelectEntity) next;
                    selectEntity = selectEntity4;
                    AbstractC41586e2 abstractC41586e2M91393c3 = C41782z0.m91393c();
                    RankMarketConfigKt$getCurMarketEntity$3 rankMarketConfigKt$getCurMarketEntity$5 = new RankMarketConfigKt$getCurMarketEntity$3(selectEntity3, selectEntity, null);
                    rankMarketConfigKt$getCurMarketEntity$1.L$0 = SpillingKt.nullOutSpilledVariable(selectEntity);
                    rankMarketConfigKt$getCurMarketEntity$1.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                    rankMarketConfigKt$getCurMarketEntity$1.L$2 = SpillingKt.nullOutSpilledVariable(selectEntity3);
                    rankMarketConfigKt$getCurMarketEntity$1.label = 3;
                    objM91049g = C41686h.m91049g(abstractC41586e2M91393c3, rankMarketConfigKt$getCurMarketEntity$5, rankMarketConfigKt$getCurMarketEntity$1);
                    if (objM91049g == coroutine_suspended) {
                        return objM91049g;
                    }
                }
            }
        }
        return coroutine_suspended;
        str = (String) objM91049g2;
        selectEntity = selectEntity2;
        str2 = str;
        if (str2 != null) {
        }
        selectEntity3 = null;
        AbstractC41586e2 abstractC41586e2M91393c4 = C41782z0.m91393c();
        RankMarketConfigKt$getCurMarketEntity$3 rankMarketConfigKt$getCurMarketEntity$6 = new RankMarketConfigKt$getCurMarketEntity$3(selectEntity3, selectEntity, null);
        rankMarketConfigKt$getCurMarketEntity$1.L$0 = SpillingKt.nullOutSpilledVariable(selectEntity);
        rankMarketConfigKt$getCurMarketEntity$1.L$1 = SpillingKt.nullOutSpilledVariable(str2);
        rankMarketConfigKt$getCurMarketEntity$1.L$2 = SpillingKt.nullOutSpilledVariable(selectEntity3);
        rankMarketConfigKt$getCurMarketEntity$1.label = 3;
        objM91049g = C41686h.m91049g(abstractC41586e2M91393c4, rankMarketConfigKt$getCurMarketEntity$6, rankMarketConfigKt$getCurMarketEntity$1);
        if (objM91049g == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM91049g;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r0 == r2) goto L28;
     */
    @Nullable
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m52712d(@NotNull Continuation<? super List<SelectEntity>> continuation) {
        RankMarketConfigKt$getRankMarketConfig$1 rankMarketConfigKt$getRankMarketConfig$1;
        String str;
        ArrayList arrayList;
        Object objM91049g;
        String str2;
        List<SelectEntity> list;
        String str3;
        List<String> listSplit$default;
        if (continuation instanceof RankMarketConfigKt$getRankMarketConfig$1) {
            rankMarketConfigKt$getRankMarketConfig$1 = (RankMarketConfigKt$getRankMarketConfig$1) continuation;
            int i11 = rankMarketConfigKt$getRankMarketConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rankMarketConfigKt$getRankMarketConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rankMarketConfigKt$getRankMarketConfig$1 = new RankMarketConfigKt$getRankMarketConfig$1(continuation);
            }
        } else {
            rankMarketConfigKt$getRankMarketConfig$1 = new RankMarketConfigKt$getRankMarketConfig$1(continuation);
        }
        Object objM91049g2 = rankMarketConfigKt$getRankMarketConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = rankMarketConfigKt$getRankMarketConfig$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                ResultKt.throwOnFailure(objM91049g2);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) rankMarketConfigKt$getRankMarketConfig$1.L$1;
                str2 = (String) rankMarketConfigKt$getRankMarketConfig$1.L$0;
                ResultKt.throwOnFailure(objM91049g2);
            }
            str3 = (String) objM91049g2;
            if (str3.length() == 0) {
                listSplit$default = f42413a;
            } else {
                listSplit$default = StringsKt.split$default((CharSequence) str3, new String[]{","}, false, 0, 6, (Object) null);
            }
            for (String str4 : listSplit$default) {
                if (Intrinsics.areEqual("ALL", str4)) {
                    list.add(new SelectEntity(null, C27017c.f54310a.m66516f(R$string.all_market, new Object[0]), "ALL", null, null, null, null, null, null, false, Intrinsics.areEqual(str2, "ALL"), null, 3065, null));
                } else {
                    list.add(new SelectEntity(null, str4, str4, null, null, null, null, null, null, false, Intrinsics.areEqual(str2, str4), null, 3065, null));
                }
            }
            f42414b = list;
            return list;
        }
        ResultKt.throwOnFailure(objM91049g2);
        if (!f42414b.isEmpty()) {
            return f42414b;
        }
        str = f42416d;
        if (str == null) {
            AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
            RankMarketConfigKt$getRankMarketConfig$preChoose$1 rankMarketConfigKt$getRankMarketConfig$preChoose$1 = new RankMarketConfigKt$getRankMarketConfig$preChoose$1(null);
            rankMarketConfigKt$getRankMarketConfig$1.label = 1;
            objM91049g2 = C41686h.m91049g(abstractC41697j0M91392b, rankMarketConfigKt$getRankMarketConfig$preChoose$1, rankMarketConfigKt$getRankMarketConfig$1);
        } else {
            arrayList = new ArrayList();
            AbstractC41697j0 abstractC41697j0M91392b2 = C41782z0.m91392b();
            RankMarketConfigKt$getRankMarketConfig$config$1 rankMarketConfigKt$getRankMarketConfig$config$1 = new RankMarketConfigKt$getRankMarketConfig$config$1(null);
            rankMarketConfigKt$getRankMarketConfig$1.L$0 = str;
            rankMarketConfigKt$getRankMarketConfig$1.L$1 = arrayList;
            rankMarketConfigKt$getRankMarketConfig$1.label = 2;
            objM91049g = C41686h.m91049g(abstractC41697j0M91392b2, rankMarketConfigKt$getRankMarketConfig$config$1, rankMarketConfigKt$getRankMarketConfig$1);
            if (objM91049g != coroutine_suspended) {
                str2 = str;
                objM91049g2 = objM91049g;
                list = arrayList;
                str3 = (String) objM91049g2;
                if (str3.length() == 0) {
                    listSplit$default = f42413a;
                } else {
                    listSplit$default = StringsKt.split$default((CharSequence) str3, new String[]{","}, false, 0, 6, (Object) null);
                }
                while (r0.hasNext()) {
                    if (Intrinsics.areEqual("ALL", str4)) {
                        list.add(new SelectEntity(null, C27017c.f54310a.m66516f(R$string.all_market, new Object[0]), "ALL", null, null, null, null, null, null, false, Intrinsics.areEqual(str2, "ALL"), null, 3065, null));
                    } else {
                        list.add(new SelectEntity(null, str4, str4, null, null, null, null, null, null, false, Intrinsics.areEqual(str2, str4), null, 3065, null));
                    }
                }
                f42414b = list;
                return list;
            }
        }
        return coroutine_suspended;
        str = (String) objM91049g2;
        arrayList = new ArrayList();
        AbstractC41697j0 abstractC41697j0M91392b3 = C41782z0.m91392b();
        RankMarketConfigKt$getRankMarketConfig$config$1 rankMarketConfigKt$getRankMarketConfig$config$2 = new RankMarketConfigKt$getRankMarketConfig$config$1(null);
        rankMarketConfigKt$getRankMarketConfig$1.L$0 = str;
        rankMarketConfigKt$getRankMarketConfig$1.L$1 = arrayList;
        rankMarketConfigKt$getRankMarketConfig$1.label = 2;
        objM91049g = C41686h.m91049g(abstractC41697j0M91392b3, rankMarketConfigKt$getRankMarketConfig$config$2, rankMarketConfigKt$getRankMarketConfig$1);
        if (objM91049g != coroutine_suspended) {
            str2 = str;
            objM91049g2 = objM91049g;
            list = arrayList;
            str3 = (String) objM91049g2;
            if (str3.length() == 0) {
                listSplit$default = f42413a;
            } else {
                listSplit$default = StringsKt.split$default((CharSequence) str3, new String[]{","}, false, 0, 6, (Object) null);
            }
            while (r0.hasNext()) {
                if (Intrinsics.areEqual("ALL", str4)) {
                    list.add(new SelectEntity(null, C27017c.f54310a.m66516f(R$string.all_market, new Object[0]), "ALL", null, null, null, null, null, null, false, Intrinsics.areEqual(str2, "ALL"), null, 3065, null));
                } else {
                    list.add(new SelectEntity(null, str4, str4, null, null, null, null, null, null, false, Intrinsics.areEqual(str2, str4), null, 3065, null));
                }
            }
            f42414b = list;
            return list;
        }
        return coroutine_suspended;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final Object m52713e(@NotNull BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a, @NotNull Continuation<? super Unit> continuation) {
        f42415c = interfaceC24339a;
        f42416d = interfaceC24339a.getValue();
        return C41686h.m91049g(C41782z0.m91392b(), new RankMarketConfigKt$updateCurMarket$2(null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final Object m52714f(@Nullable List<String> list, @NotNull Continuation<? super Unit> continuation) {
        if (list == null) {
            C44128b.m97261e("rankMarketConfig", "marketList is empty.");
            return Unit.INSTANCE;
        }
        Object objM91049g = C41686h.m91049g(C41782z0.m91392b(), new RankMarketConfigKt$updateMarketConfig$2(CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null), null), continuation);
        return objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91049g : Unit.INSTANCE;
    }
}
