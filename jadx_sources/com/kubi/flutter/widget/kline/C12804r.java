package com.kubi.flutter.widget.kline;

import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.flutter.widget.kline.r */
/* JADX INFO: compiled from: KlineOrderEntity.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u0004¨\u0006\u0005"}, m90084d2 = {"applyActiveTrade", "", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "LKLineWidget_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C12804r {
    /* JADX INFO: renamed from: a */
    public static final void m24373a(@NotNull HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        map.put("status", "active");
        map.put("page", "1");
        map.put("size", "20");
    }
}
