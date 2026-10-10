package com.kubi.search.config;

import com.kubi.event.api.C12572a;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.search.SearchApi;
import com.kubi.search.api.entity.SearchHintEntity;
import com.kubi.search.entity.SearchGuideWordEntity;
import com.kubi.search.utils.SearchCoroutineScope;
import com.kubi.utils.extensions.C27041f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SearchHintConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/search/config/SearchHintConfig;", "", "<init>", "()V", "api", "Lcom/kubi/search/SearchApi;", "hintList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/kubi/search/api/entity/SearchHintEntity;", "fetchSearchHint", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "index", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCurrentHint", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchHintConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchHintConfig.kt\ncom/kubi/search/config/SearchHintConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n774#2:65\n865#2,2:66\n1869#2,2:68\n*S KotlinDebug\n*F\n+ 1 SearchHintConfig.kt\ncom/kubi/search/config/SearchHintConfig\n*L\n48#1:65\n48#1:66,2\n48#1:68,2\n*E\n"})
public final class SearchHintConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SearchHintConfig f48860a = new SearchHintConfig();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final SearchApi f48861b = (SearchApi) RetrofitFlowExKt.m42820a(SearchApi.class);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final CopyOnWriteArrayList<SearchHintEntity> f48862c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static AtomicInteger f48863d;

    @Nullable
    /* JADX INFO: renamed from: c */
    public final SearchHintEntity m59120c() {
        synchronized (this) {
            CopyOnWriteArrayList<SearchHintEntity> copyOnWriteArrayList = f48862c;
            if (copyOnWriteArrayList.isEmpty()) {
                return null;
            }
            if (copyOnWriteArrayList.size() == 1) {
                return (SearchHintEntity) CollectionsKt.firstOrNull((List) copyOnWriteArrayList);
            }
            Object orNull = CollectionsKt.getOrNull(copyOnWriteArrayList, f48863d.getAndIncrement());
            if (f48863d.get() >= copyOnWriteArrayList.size()) {
                f48863d.set(0);
            }
            return (SearchHintEntity) orNull;
        }
    }

    static {
        MultiLanguageManager.f46805a.addOnLanguageChangeListener(new MultiLanguageManager.a() { // from class: com.kubi.search.config.SearchHintConfig.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.kubi.sdk.function.language.MultiLanguageManager.a
            public void onLanguageChange(LanguageType language) {
                Intrinsics.checkNotNullParameter(language, "language");
                C41696j.m91104d(new SearchCoroutineScope(C42911a.m94120b(), null, 2, 0 == true ? 1 : 0), null, null, new SearchHintConfig$1$onLanguageChange$1(null), 3, null);
            }
        });
        f48863d = new AtomicInteger(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m59119b(@NotNull Continuation<? super Unit> continuation) {
        SearchHintConfig$fetchSearchHint$1 searchHintConfig$fetchSearchHint$1;
        List listMutableListOf;
        if (continuation instanceof SearchHintConfig$fetchSearchHint$1) {
            searchHintConfig$fetchSearchHint$1 = (SearchHintConfig$fetchSearchHint$1) continuation;
            int i11 = searchHintConfig$fetchSearchHint$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                searchHintConfig$fetchSearchHint$1.label = i11 - Integer.MIN_VALUE;
            } else {
                searchHintConfig$fetchSearchHint$1 = new SearchHintConfig$fetchSearchHint$1(this, continuation);
            }
        } else {
            searchHintConfig$fetchSearchHint$1 = new SearchHintConfig$fetchSearchHint$1(this, continuation);
        }
        Object objM42830k = searchHintConfig$fetchSearchHint$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = searchHintConfig$fetchSearchHint$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42830k);
            if (!f48862c.isEmpty()) {
                return Unit.INSTANCE;
            }
            InterfaceC41634e<SearchGuideWordEntity> interfaceC41634eM59630e = f48861b.m59630e();
            searchHintConfig$fetchSearchHint$1.label = 1;
            objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM59630e, searchHintConfig$fetchSearchHint$1);
            if (objM42830k == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42830k);
        }
        SearchGuideWordEntity searchGuideWordEntity = (SearchGuideWordEntity) objM42830k;
        if (searchGuideWordEntity == null) {
            return Unit.INSTANCE;
        }
        f48863d.set(0);
        List<String> valueList = searchGuideWordEntity.getValueList();
        if (valueList == null || (listMutableListOf = CollectionsKt.toMutableList((Collection) valueList)) == null) {
            String value = searchGuideWordEntity.getValue();
            if (value == null) {
                value = "";
            }
            listMutableListOf = CollectionsKt.mutableListOf(value);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMutableListOf) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = CollectionsKt.distinct(arrayList).iterator();
        while (it.hasNext()) {
            f48862c.add(new SearchHintEntity(C27041f.m66668h(searchGuideWordEntity.getType()), (String) it.next()));
        }
        C12572a.m23695d("SearchEvent:UPDATE_HINT_WORD", null, 0L, 6, null);
        return Unit.INSTANCE;
    }
}
