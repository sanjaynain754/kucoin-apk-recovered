package com.kubi.mine.lib.language;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.function.language.entity.LanguageEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p058cj.C4988a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.enums.EnumEntries;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LanguageRepository.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.language.LanguageRepository$getLanguageList$1$1", m90122f = "LanguageRepository.kt", m90123i = {0}, m90124l = {57}, m90125m = "invokeSuspend", m90126n = {"typeList"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nLanguageRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageRepository.kt\ncom/kubi/mine/lib/language/LanguageRepository$getLanguageList$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CollectionsEx.kt\ncom/kubi/utils/extensions/CollectionsExKt\n*L\n1#1,183:1\n1563#2:184\n1634#2,3:185\n774#2:188\n865#2,2:189\n111#3:191\n99#3:192\n*S KotlinDebug\n*F\n+ 1 LanguageRepository.kt\ncom/kubi/mine/lib/language/LanguageRepository$getLanguageList$1$1\n*L\n56#1:184\n56#1:185,3\n57#1:188\n57#1:189,2\n62#1:191\n62#1:192\n*E\n"})
public final class LanguageRepository$getLanguageList$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ LanguageRepository $this_runCatching;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepository$getLanguageList$1$1(LanguageRepository languageRepository, Continuation<? super LanguageRepository$getLanguageList$1$1> continuation) {
        super(2, continuation);
        this.$this_runCatching = languageRepository;
    }

    /* JADX INFO: renamed from: g */
    public static final String m41689g() {
        return "language not update";
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LanguageRepository$getLanguageList$1$1(this.$this_runCatching, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((LanguageRepository$getLanguageList$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LanguageRepository$getLanguageList$1$1 languageRepository$getLanguageList$1$1;
        List list;
        Object next;
        boolean z11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                languageRepository$getLanguageList$1$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            EnumEntries<LanguageType> entries = LanguageType.getEntries();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
            Iterator<LanguageType> it = entries.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getLocalString());
            }
            InterfaceC41634e<List<LanguageEntity>> interfaceC41634eM41690a = LanguageRepository.f35075b.m41690a();
            this.L$0 = arrayList;
            this.label = 1;
            languageRepository$getLanguageList$1$1 = this;
            obj = RetrofitFlowExKt.m42826g(interfaceC41634eM41690a, false, null, languageRepository$getLanguageList$1$1, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList;
        }
        List list2 = (List) ((C19334f) obj).m42846a();
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (CollectionsKt.contains(list, ((LanguageEntity) obj2).getType())) {
                    arrayList2.add(obj2);
                }
            }
            LanguageRepository languageRepository = languageRepository$getLanguageList$1$1.$this_runCatching;
            if (MultiLanguageManager.f46805a.m56993o(arrayList2)) {
                LanguageRepository.m41679e(languageRepository, null, true, 1, null);
            } else {
                Iterator<T> it2 = languageRepository.m41684h().iterator();
                do {
                    if (it2.hasNext()) {
                        next = it2.next();
                    } else {
                        next = null;
                        break;
                    }
                } while (!Intrinsics.areEqual(((LanguageEntity) next).getType(), MultiLanguageManager.f46811g.getLocalString()));
                if (next != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    LanguageRepository.m41679e(languageRepository, null, true, 1, null);
                } else {
                    C4988a.m5288c("language", new Function0() { // from class: com.kubi.mine.lib.language.c
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LanguageRepository$getLanguageList$1$1.m41689g();
                        }
                    });
                }
            }
        }
        return Unit.INSTANCE;
    }
}
