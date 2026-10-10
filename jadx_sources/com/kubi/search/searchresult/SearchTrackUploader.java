package com.kubi.search.searchresult;

import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.search.SearchApi;
import com.kubi.search.entity.SearchEntity;
import com.kubi.search.entity.SearchEventUploadEntity;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineName;
import o00.C42911a;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SearchTrackUploader.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rJ\u0006\u0010\u0013\u001a\u00020\u0010J(\u0010\u0016\u001a\u00020\u00102\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/search/searchresult/SearchTrackUploader;", "", "<init>", "()V", "MAX_COUNT_TO_UPLOAD_CLICK", "", "MAX_COUNT_TO_UPLOAD_EXPOSE", "cacheExposeList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "", "getCacheExposeList", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "clickList", "Lcom/kubi/search/entity/SearchEntity;", "exposeList", "addClick", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "addExpose", "onPageClose", "api", "Lcom/kubi/search/SearchApi;", "upload", "uploadList", "Ljava/util/ArrayList;", "Lcom/kubi/search/entity/SearchEventUploadEntity;", "Lkotlin/collections/ArrayList;", "click", "", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchTrackUploader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchTrackUploader.kt\ncom/kubi/search/searchresult/SearchTrackUploader\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n15#2,2:149\n15#2,2:151\n15#2,2:153\n1869#3,2:155\n1869#3,2:157\n*S KotlinDebug\n*F\n+ 1 SearchTrackUploader.kt\ncom/kubi/search/searchresult/SearchTrackUploader\n*L\n48#1:149,2\n76#1:151,2\n100#1:153,2\n107#1:155,2\n121#1:157,2\n*E\n"})
public final class SearchTrackUploader {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SearchTrackUploader f49039a = new SearchTrackUploader();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final CopyOnWriteArrayList<String> f49040b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final CopyOnWriteArrayList<SearchEntity> f49041c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final CopyOnWriteArrayList<SearchEntity> f49042d = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final SearchApi f49043e = (SearchApi) RetrofitFlowExKt.m42820a(SearchApi.class);

    /* JADX INFO: renamed from: i */
    public static final Unit m59476i(ArrayList arrayList) {
        for (int i11 = 0; i11 < 3; i11++) {
            SearchEntity searchEntity = (SearchEntity) CollectionsKt.removeFirstOrNull(f49041c);
            if (searchEntity != null) {
                arrayList.add(new SearchEventUploadEntity(C27041f.m66668h(searchEntity.getResourceId()), C27041f.m66668h(searchEntity.getResourceType()), C27041f.m66668h(searchEntity.getSearchResultType())));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m59478l(ArrayList arrayList) {
        for (int i11 = 0; i11 < 10; i11++) {
            SearchEntity searchEntity = (SearchEntity) CollectionsKt.removeFirstOrNull(f49042d);
            if (searchEntity != null) {
                arrayList.add(new SearchEventUploadEntity(C27041f.m66668h(searchEntity.getResourceId()), C27041f.m66668h(searchEntity.getResourceType()), C27041f.m66668h(searchEntity.getSearchResultType())));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final void m59475h() {
        if (f49041c.size() >= 3) {
            final ArrayList<SearchEventUploadEntity> arrayList = new ArrayList<>();
            C27100x0.m66924e(new Function0() { // from class: com.kubi.search.searchresult.x0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchTrackUploader.m59476i(arrayList);
                }
            });
            f49039a.m59484p(arrayList, true);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m59477k() {
        if (f49042d.size() >= 10) {
            final ArrayList<SearchEventUploadEntity> arrayList = new ArrayList<>();
            C27100x0.m66924e(new Function0() { // from class: com.kubi.search.searchresult.w0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchTrackUploader.m59478l(arrayList);
                }
            });
            f49039a.m59484p(arrayList, false);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m59479o() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onPageClose: clickList=");
        CopyOnWriteArrayList<SearchEntity> copyOnWriteArrayList = f49041c;
        sb2.append(copyOnWriteArrayList.size());
        sb2.append(",exposeList=");
        sb2.append(f49042d.size());
        C44128b.m97268l("searchV2", sb2.toString());
        if (!copyOnWriteArrayList.isEmpty()) {
            ArrayList<SearchEventUploadEntity> arrayList = new ArrayList<>();
            for (SearchEntity searchEntity : copyOnWriteArrayList) {
                arrayList.add(new SearchEventUploadEntity(C27041f.m66668h(searchEntity.getResourceId()), C27041f.m66668h(searchEntity.getResourceType()), C27041f.m66668h(searchEntity.getSearchResultType())));
            }
            f49039a.m59484p(arrayList, true);
            f49041c.clear();
        }
        CopyOnWriteArrayList<SearchEntity> copyOnWriteArrayList2 = f49042d;
        if (copyOnWriteArrayList2.isEmpty()) {
            return;
        }
        ArrayList<SearchEventUploadEntity> arrayList2 = new ArrayList<>();
        for (SearchEntity searchEntity2 : copyOnWriteArrayList2) {
            arrayList2.add(new SearchEventUploadEntity(C27041f.m66668h(searchEntity2.getResourceId()), C27041f.m66668h(searchEntity2.getResourceType()), C27041f.m66668h(searchEntity2.getSearchResultType())));
        }
        f49039a.m59484p(arrayList2, false);
        f49042d.clear();
    }

    /* JADX INFO: renamed from: g */
    public final void m59480g(@NotNull SearchEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        f49041c.add(entity);
        C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.search.searchresult.v0
            @Override // java.lang.Runnable
            public final void run() {
                SearchTrackUploader.m59475h();
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m59481j(@NotNull SearchEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        f49042d.add(entity);
        C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.search.searchresult.t0
            @Override // java.lang.Runnable
            public final void run() {
                SearchTrackUploader.m59477k();
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final CopyOnWriteArrayList<String> m59482m() {
        return f49040b;
    }

    /* JADX INFO: renamed from: n */
    public final void m59483n() {
        C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.search.searchresult.u0
            @Override // java.lang.Runnable
            public final void run() {
                SearchTrackUploader.m59479o();
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m59484p(ArrayList<SearchEventUploadEntity> arrayList, boolean z11) {
        if (!arrayList.isEmpty()) {
            C41696j.m91104d(C41713n0.m91125a(new CoroutineName("SearchTrackUploader").plus(C42911a.m94120b())), null, null, new SearchTrackUploader$upload$1(z11, arrayList, null), 3, null);
        }
    }
}
