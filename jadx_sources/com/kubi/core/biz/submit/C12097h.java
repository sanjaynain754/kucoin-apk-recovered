package com.kubi.core.biz.submit;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.core.biz.submit.h */
/* JADX INFO: compiled from: SubmitOrderConfig.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"getTitleList", "", "", "Lcom/kubi/core/biz/submit/TradeTypeUiData;", "context", "Landroid/content/Context;", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSubmitOrderConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitOrderConfig.kt\ncom/kubi/core/biz/submit/SubmitOrderConfigKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1563#2:110\n1634#2,3:111\n*S KotlinDebug\n*F\n+ 1 SubmitOrderConfig.kt\ncom/kubi/core/biz/submit/SubmitOrderConfigKt\n*L\n38#1:110\n38#1:111,3\n*E\n"})
public final class C12097h {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<String> m22544a(@Nullable List<? extends TradeTypeUiData> list, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(context.getString(((TradeTypeUiData) it.next()).getF20772c()));
        }
        return arrayList;
    }
}
