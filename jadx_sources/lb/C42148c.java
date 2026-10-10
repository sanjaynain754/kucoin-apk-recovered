package lb;

import android.util.Base64;
import com.kubi.assets.R$string;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.utils.C27017c;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: lb.c */
/* JADX INFO: compiled from: GuideVideoUtils.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004`\u0005\u001a\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, m90084d2 = {"createParams", "", ReportDataTable.COLUMN_PARAMS, "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "depositGuideVideo", "", "withdrawGuideVideo", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGuideVideoUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideVideoUtils.kt\ncom/kubi/assets/utils/GuideVideoUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
public final class C42148c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m92486a(@NotNull HashMap<String, Object> params) {
        byte[] bytes;
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            String string = new JSONObject(params).toString();
            if (string != null) {
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                bytes = string.getBytes(UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            } else {
                bytes = null;
            }
            String strEncode = URLEncoder.encode(Base64.encodeToString(bytes, 10), StandardCharsets.UTF_8.name());
            Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
            return strEncode;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m92487b() throws JSONException {
        HashMap map = new HashMap();
        C27017c c27017c = C27017c.f54310a;
        map.put("title", c27017c.m66516f(R$string.lite_deposit_title, new Object[0]));
        map.put("subtitle", c27017c.m66516f(R$string.lite_deposit_video_title, new Object[0]));
        map.put("videoUrl", "https://assets.staticimg.com/cms/media/QaEHynMEjWF1eolIb0rhejkYD1fMaDdETUch4qmgK.mp4");
        map.put("imageUrl", "https://assets.staticimg.com/cms/media/6XjNXwi0aBQzGIjEguHkwDj2wABuRYGkkYZb0cknF.jpeg");
        map.put("faqTitle", "FAQ");
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("title", c27017c.m66516f(R$string.lite_deposit_faq1, new Object[0]));
        jSONObject.put("url", "https://www.kucoin.com/support/48142946141382?loading=2&appNeedLang=true");
        jSONArray.put(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("title", c27017c.m66516f(R$string.lite_deposit_faq2, new Object[0]));
        jSONObject2.put("url", "https://www.kucoin.com/support/900006118386?loading=2&appNeedLang=true");
        jSONArray.put(jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("title", c27017c.m66516f(R$string.lite_deposit_faq3, new Object[0]));
        jSONObject3.put("url", "https://www.kucoin.com/support/900007172823?loading=2&appNeedLang=true");
        jSONArray.put(jSONObject3);
        map.put("faq", jSONArray);
        map.put("showHelperCenter", Boolean.TRUE);
        map.put("blockId", "portfolioDeposit");
        C43852m.m96595g("B1LitePortfolioDepositGuide", "guide", null, null, 12, null);
        KCFlutterRouteManager.m56840m(KCFlutterRouteManager.f46704a, "lite/videoHelpDialog?isTransparent=true&params=" + m92486a(map), null, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static final void m92488c() throws JSONException {
        HashMap map = new HashMap();
        C27017c c27017c = C27017c.f54310a;
        map.put("title", c27017c.m66516f(R$string.lite_withdraw_title, new Object[0]));
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("title", c27017c.m66516f(R$string.lite_withdraw_faq1, new Object[0]));
        jSONObject.put("url", "https://www.kucoin.com/support/48142946141383?loading=2&appNeedLang=true");
        jSONArray.put(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("title", c27017c.m66516f(R$string.lite_withdraw_faq2, new Object[0]));
        jSONObject2.put("url", "https://www.kucoin.com/support/900007121923?loading=2&appNeedLang=true");
        jSONArray.put(jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("title", c27017c.m66516f(R$string.lite_withdraw_faq3, new Object[0]));
        jSONObject3.put("url", "https://www.kucoin.com/support/33904794204441?loading=2&appNeedLang=true");
        jSONArray.put(jSONObject3);
        map.put("faq", jSONArray);
        map.put("showHelperCenter", Boolean.TRUE);
        map.put("blockId", "portfolioWithdraw");
        C43852m.m96595g("B1LitePortfolioWithdrawGuide", "guide", null, null, 12, null);
        KCFlutterRouteManager.m56840m(KCFlutterRouteManager.f46704a, "lite/videoHelpDialog?isTransparent=true&params=" + m92486a(map), null, 2, null);
    }
}
