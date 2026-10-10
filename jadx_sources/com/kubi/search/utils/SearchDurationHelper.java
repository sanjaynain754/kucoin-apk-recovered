package com.kubi.search.utils;

import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27039d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43840a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.search.utils.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SearchDurationHelper.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J*\u0010\u000f\u001a\u00020\u000b2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b0\u00112\u0006\u0010\r\u001a\u00020\u0006H\u0002J&\u0010\u0012\u001a\u00020\t*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b0\u00112\u0006\u0010\u000e\u001a\u00020\u0006H\u0002R,\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/search/utils/SearchDurationHelper;", "", "<init>", "()V", "keyMap", "", "", "", "Lkotlin/Pair;", "", "clear", "", "trackDuration", "key", "stage", "logDuration", "list", "", "time", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchDurationHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchDurationHelper.kt\ncom/kubi/search/utils/SearchDurationHelper\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n15#2,2:96\n295#3,2:98\n*S KotlinDebug\n*F\n+ 1 SearchDurationHelper.kt\ncom/kubi/search/utils/SearchDurationHelper\n*L\n36#1:96,2\n68#1:98,2\n*E\n"})
public final class SearchDurationHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SearchDurationHelper f49161a = new SearchDurationHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<String, List<Pair<String, Long>>> f49162b = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public static final Unit m59617f() {
        f49162b.clear();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final void m59618h(List list, String str) throws JSONException {
        StringBuilder sb2 = new StringBuilder();
        SearchDurationHelper searchDurationHelper = f49161a;
        long jM59623i = searchDurationHelper.m59623i(list, "start");
        long jM59623i2 = searchDurationHelper.m59623i(list, "api_start");
        long jM59623i3 = searchDurationHelper.m59623i(list, "api_end");
        long jM59623i4 = searchDurationHelper.m59623i(list, "data_classify");
        long jM59623i5 = searchDurationHelper.m59623i(list, "data_convert");
        long jM59623i6 = searchDurationHelper.m59623i(list, "notify_to_ui");
        long jM59623i7 = searchDurationHelper.m59623i(list, "data_load_finish");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("搜索:");
        sb3.append(str);
        sb3.append('(');
        long j11 = jM59623i7 - jM59623i;
        sb3.append(j11);
        sb3.append("ms), ");
        sb2.append(sb3.toString());
        sb2.append("请求前:" + (jM59623i2 - jM59623i) + "ms, ");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("接口请求:");
        long j12 = jM59623i3 - jM59623i2;
        sb4.append(j12);
        sb4.append("ms, ");
        sb2.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("数据分类:");
        long j13 = jM59623i4 - jM59623i3;
        sb5.append(j13);
        sb5.append("ms, ");
        sb2.append(sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append("数据转换:");
        long j14 = jM59623i5 - jM59623i4;
        sb6.append(j14);
        sb6.append("ms, ");
        sb2.append(sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append("通知UI:");
        long j15 = jM59623i6 - jM59623i5;
        sb7.append(j15);
        sb7.append("ms, ");
        sb2.append(sb7.toString());
        StringBuilder sb8 = new StringBuilder();
        sb8.append("页面加载:");
        long j16 = jM59623i7 - jM59623i6;
        sb8.append(j16);
        sb8.append("ms");
        sb2.append(sb8.toString());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        C44128b.m97266j("SearchDuration", string);
        C43840a.m96550d(string, "SearchDuration");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", "B1SearchOrSearchResultPage");
        jSONObject.put("$event_duration", j11);
        jSONObject.put("category", str);
        jSONObject.put("duration1", j12);
        jSONObject.put("duration2", j13);
        jSONObject.put("duration3", j14);
        jSONObject.put("duration4", j15);
        jSONObject.put("duration5", j16);
        C43852m.m96605q("duration_event", jSONObject);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m59619k(final String str, String str2) {
        Map<String, List<Pair<String, Long>>> map = f49162b;
        List<Pair<String, Long>> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(TuplesKt.m90091to(str2, Long.valueOf(System.currentTimeMillis())));
        map.put(str, arrayList);
        if (Intrinsics.areEqual(str2, "data_load_finish")) {
            f49161a.m59622g(C27024b.m66558a(arrayList), str);
            C27100x0.m66923d(new Function0() { // from class: com.kubi.search.utils.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchDurationHelper.m59620l(str);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m59620l(String str) {
        f49162b.remove(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m59621e() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.utils.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchDurationHelper.m59617f();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m59622g(final List<Pair<String, Long>> list, final String str) {
        C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.search.utils.e
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                SearchDurationHelper.m59618h(list, str);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m59624j(@NotNull final String key, @NotNull final String stage) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(stage, "stage");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.utils.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchDurationHelper.m59619k(key, stage);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final long m59623i(List<Pair<String, Long>> list, String str) {
        Long l11;
        Object next;
        Iterator<T> it = list.iterator();
        do {
            l11 = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(((Pair) next).getFirst(), str));
        Pair pair = (Pair) next;
        if (pair != null) {
            l11 = (Long) pair.getSecond();
        }
        return C27039d.m66652l(l11);
    }
}
