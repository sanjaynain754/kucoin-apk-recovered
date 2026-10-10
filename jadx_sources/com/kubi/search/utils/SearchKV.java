package com.kubi.search.utils;

import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.search.entity.SearchHistoryBean;
import com.kubi.utils.C27099x;
import com.kubi.utils.storage.StorageType;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import s10.InterfaceC44268b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: SearchKV.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/search/utils/SearchKV;", "", "<init>", "()V", "KV_CATE", "", "KEY_HISTORY", "historyCached", "", "Lcom/kubi/search/entity/SearchHistoryBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "historySave", "", "KEY_WEB3_ALERT", "Lcom/kubi/utils/storage/StorageId;", "", "getKEY_WEB3_ALERT", "()Lcom/kubi/utils/storage/StorageId;", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchKV.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchKV.kt\ncom/kubi/search/utils/SearchKV\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,40:1\n196#2,3:41\n17#3,2:44\n*S KotlinDebug\n*F\n+ 1 SearchKV.kt\ncom/kubi/search/utils/SearchKV\n*L\n27#1:41,3\n19#1:44,2\n*E\n"})
public final class SearchKV {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SearchKV f49147a = new SearchKV();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f49148b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<Boolean> f49149c;

    static {
        String strM97687a;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC44268b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h == null || (strM97687a = ((InterfaceC44268b) objM56186h).m97687a()) == null) {
            strM97687a = "KEY_HISTORY";
        }
        f49148b = strM97687a;
        f49149c = new StorageId<>("KV_CATE_SEARCH", "KEY_WEB3_ALERT", StorageType.Shared, false, 8, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<Boolean> m59589a() {
        return f49149c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m59590b(@NotNull Continuation<? super List<SearchHistoryBean>> continuation) {
        SearchKV$historyCached$1 searchKV$historyCached$1;
        if (continuation instanceof SearchKV$historyCached$1) {
            searchKV$historyCached$1 = (SearchKV$historyCached$1) continuation;
            int i11 = searchKV$historyCached$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                searchKV$historyCached$1.label = i11 - Integer.MIN_VALUE;
            } else {
                searchKV$historyCached$1 = new SearchKV$historyCached$1(this, continuation);
            }
        } else {
            searchKV$historyCached$1 = new SearchKV$historyCached$1(this, continuation);
        }
        Object objM90914f0 = searchKV$historyCached$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = searchKV$historyCached$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90914f0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f49148b);
            sb2.append(SearchExKt.m59516J() ? "_TRADEPAIR" : "_ALL");
            String string = sb2.toString();
            String strM102326h = C46392a.m102326h(new StorageId("KV_CATE_SEARCH", string, null, true, 4, null), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            C27099x c27099x = C27099x.f54458a;
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new SearchKV$historyCached$$inlined$fromJsonOrNull$1(strM102326h, null)), C42911a.m94120b());
            searchKV$historyCached$1.L$0 = SpillingKt.nullOutSpilledVariable(string);
            searchKV$historyCached$1.L$1 = SpillingKt.nullOutSpilledVariable(strM102326h);
            searchKV$historyCached$1.L$2 = SpillingKt.nullOutSpilledVariable(c27099x);
            searchKV$historyCached$1.L$3 = SpillingKt.nullOutSpilledVariable(strM102326h);
            searchKV$historyCached$1.I$0 = 0;
            searchKV$historyCached$1.label = 1;
            objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, searchKV$historyCached$1);
            if (objM90914f0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90914f0);
        }
        List list = (List) objM90914f0;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: c */
    public final void m59591c(@NotNull List<SearchHistoryBean> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f49148b);
        sb2.append(SearchExKt.m59516J() ? "_TRADEPAIR" : "_ALL");
        C46392a.m102333p(new StorageId("KV_CATE_SEARCH", sb2.toString(), null, false, 12, null), C27099x.m66919i(list, false, 2, null));
    }
}
