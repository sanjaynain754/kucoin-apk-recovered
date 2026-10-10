package p569qq;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p642tq.InterfaceC45065h;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: qq.m */
/* JADX INFO: compiled from: TrackEvent.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJU\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00110\u0010\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JU\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00110\u0010\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0013J5\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0015J)\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019JK\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00110\u0010\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010\u000bJ#\u0010!\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m90084d2 = {"Lqq/m;", "", "<init>", "()V", "", "pageId", "preSpmId", "Lorg/json/JSONObject;", ReportDataTable.COLUMN_PARAMS, "", "j", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "i", "(Ljava/lang/String;Ljava/lang/String;)V", "blockId", "locationId", "", "Lkotlin/Pair;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "b", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "name", "category", "p", "(Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V", "paramObj", "o", "param", "q", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43852m {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43852m f96922a = new C43852m();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m96589a(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable JSONObject params) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        if (params == null) {
            try {
                params = new JSONObject();
            } catch (Exception e11) {
                C44128b.m97263g("TrackEvent", e11);
                return;
            }
        }
        String strM96601m = m96601m(pageId, blockId, locationId);
        params.put("spm_id", strM96601m);
        m96605q("page_click", params);
        C43840a.m96551e(Intrinsics.stringPlus("CLICK: ", strM96601m), null, 2, null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m96590b(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @NotNull Pair<String, ? extends Object>... params) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            String strM96601m = m96601m(pageId, blockId, locationId);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("spm_id", strM96601m);
            int length = params.length;
            int i11 = 0;
            while (i11 < length) {
                Pair<String, ? extends Object> pair = params[i11];
                i11++;
                jSONObject.put(pair.component1(), pair.component2());
            }
            m96605q("page_click", jSONObject);
            C43840a.m96551e(Intrinsics.stringPlus("CLICK: ", strM96601m), null, 2, null);
        } catch (Exception e11) {
            C44128b.m97263g("TrackEvent", e11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m96591c(String str, String str2, String str3, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "1";
        }
        if ((i11 & 8) != 0) {
            jSONObject = null;
        }
        m96589a(str, str2, str3, jSONObject);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m96592d(String str, String str2, String str3, Pair[] pairArr, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "1";
        }
        m96590b(str, str2, str3, pairArr);
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m96593e(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable JSONObject params) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        try {
            String strM96601m = m96601m(pageId, blockId, locationId);
            if (params == null) {
                params = new JSONObject();
            }
            params.put("spm_id", strM96601m);
            m96605q("expose", params);
            C43840a.m96551e(Intrinsics.stringPlus("EXPOSE: ", strM96601m), null, 2, null);
        } catch (Exception e11) {
            C44128b.m97263g("TrackEvent", e11);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m96594f(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @NotNull Pair<String, ? extends Object>... params) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            String strM96601m = m96601m(pageId, blockId, locationId);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("spm_id", strM96601m);
            int length = params.length;
            int i11 = 0;
            while (i11 < length) {
                Pair<String, ? extends Object> pair = params[i11];
                i11++;
                jSONObject.put(pair.component1(), pair.component2());
            }
            m96605q("expose", jSONObject);
            C43840a.m96551e(Intrinsics.stringPlus("EXPOSE: ", strM96601m), null, 2, null);
        } catch (Exception e11) {
            C44128b.m97263g("TrackEvent", e11);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m96595g(String str, String str2, String str3, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "1";
        }
        if ((i11 & 8) != 0) {
            jSONObject = null;
        }
        m96593e(str, str2, str3, jSONObject);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m96596h(String str, String str2, String str3, Pair[] pairArr, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "1";
        }
        m96594f(str, str2, str3, pairArr);
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m96597i(@NotNull String pageId, @Nullable String preSpmId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        try {
            JSONObject jSONObject = new JSONObject();
            if (preSpmId != null) {
                jSONObject.put("pre_spm_id", preSpmId);
            }
            jSONObject.put("page_id", pageId);
            jSONObject.put("site_id", "kcApp");
            m96605q("app_page_expose", jSONObject);
        } catch (Exception e11) {
            C44128b.m97263g("TrackEvent", e11);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m96598j(@NotNull String pageId, @Nullable String preSpmId, @Nullable JSONObject params) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        if (params == null) {
            try {
                params = new JSONObject();
            } catch (Exception e11) {
                C44128b.m97263g("TrackEvent", e11);
                return;
            }
        }
        if (preSpmId != null) {
            params.put("pre_spm_id", preSpmId);
        }
        params.put("page_id", pageId);
        params.put("site_id", "kcApp");
        m96605q("app_page_expose", params);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m96599k(String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        m96597i(str, str2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m96600l(String str, String str2, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            jSONObject = null;
        }
        m96598j(str, str2, jSONObject);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final String m96601m(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        return "kcApp." + pageId + '.' + blockId + '.' + locationId;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m96602n(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "1";
        }
        return m96601m(str, str2, str3);
    }

    @Deprecated(message = "神策不再做技术埋点", replaceWith = @ReplaceWith(expression = "TechnologyEvent", imports = {}))
    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final void m96603o(@NotNull String name, @NotNull String category, @NotNull JSONObject paramObj) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(paramObj, "paramObj");
        try {
            paramObj.put("name", name);
            paramObj.put("category", category);
            m96605q("technology_event", paramObj);
        } catch (Exception e11) {
            C44128b.m97263g("TrackEvent", e11);
        }
    }

    @Deprecated(message = "神策不再做技术埋点", replaceWith = @ReplaceWith(expression = "TechnologyEvent", imports = {}))
    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final void m96604p(@NotNull String name, @NotNull String category, @NotNull Pair<String, ? extends Object>... params) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            JSONObject jSONObject = new JSONObject();
            int length = params.length;
            int i11 = 0;
            while (i11 < length) {
                Pair<String, ? extends Object> pair = params[i11];
                i11++;
                jSONObject.put(pair.component1(), pair.component2());
            }
            m96603o(name, category, jSONObject);
        } catch (Exception e11) {
            C44128b.m97263g("TrackEvent", e11);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final void m96605q(@NotNull String name, @Nullable JSONObject param) {
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<InterfaceC45065h> it = C43848i.f96913a.m96586e().mo32839a().iterator();
        while (it.hasNext()) {
            it.next().track(name, param);
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m96606r(String str, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            jSONObject = null;
        }
        m96605q(str, jSONObject);
    }
}
