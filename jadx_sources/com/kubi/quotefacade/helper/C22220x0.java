package com.kubi.quotefacade.helper;

import com.kubi.user.api.IUserService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.x0 */
/* JADX INFO: compiled from: FavCacheManager.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00060\u0004\"\u0014\u0010\u0000\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0002¨\u0006\u0007"}, m90084d2 = {"isLogin", "", "()Z", "convert", "", "Lcom/kubi/quotefacade/helper/FavItem;", "", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFavCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavCacheManager.kt\ncom/kubi/quotefacade/helper/FavCacheManagerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,654:1\n1563#2:655\n1634#2,3:656\n*S KotlinDebug\n*F\n+ 1 FavCacheManager.kt\ncom/kubi/quotefacade/helper/FavCacheManagerKt\n*L\n39#1:655\n39#1:656,3\n*E\n"})
public final class C22220x0 {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<FavItem> m52129b(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List listReversed = CollectionsKt.reversed(list);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listReversed, 10));
        Iterator it = listReversed.iterator();
        while (it.hasNext()) {
            arrayList.add(new FavItem((String) it.next(), System.nanoTime()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m52130c() {
        return IUserService.a.get().c();
    }
}
