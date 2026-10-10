package p833zi;

import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.actions.SearchIntents;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.kubi.helpcenter.api.CustomerServiceType;
import com.kubi.helpcenter.api.local.IHelpCenterService;
import com.kubi.helpcenter.exception.HelpCenterException;
import com.kubi.helpcenter.exception.HelpCenterMessage;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27099x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p569qq.C43840a;
import p569qq.C43846g;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: zi.a */
/* JADX INFO: compiled from: HelpCenterInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J@\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102&\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0012j\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e`\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/helpcenter/interceptor/HelpCenterInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "handleStaffService", "", "postcard", "Lcom/kubi/router/model/Postcard;", "serviceAda", "source", "", "jsonObject", "Lcom/google/gson/JsonObject;", "map", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "handleCustomerService", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHelpCenterInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterInterceptor.kt\ncom/kubi/helpcenter/interceptor/HelpCenterInterceptor\n+ 2 HelpCenterIssue.kt\ncom/kubi/helpcenter/exception/HelpCenterIssueKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n44#2,2:118\n48#2,2:122\n44#2,2:124\n48#2,2:126\n1869#3,2:120\n*S KotlinDebug\n*F\n+ 1 HelpCenterInterceptor.kt\ncom/kubi/helpcenter/interceptor/HelpCenterInterceptor\n*L\n68#1:118,2\n98#1:122,2\n101#1:124,2\n114#1:126,2\n86#1:120,2\n*E\n"})
public final class C46880a implements InterfaceC46936b {
    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        if (Intrinsics.areEqual(RouteExKt.m56216G(postcard.getUri()), "staffService")) {
            m103213c(postcard);
            return true;
        }
        if (!Intrinsics.areEqual(RouteExKt.m56216G(postcard.getUri()), "help/customerservice")) {
            return chain.mo103413a(postcard);
        }
        m103212a(postcard);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m103213c(C4400a c4400a) {
        try {
            HashMap<String, String> map = new HashMap<>();
            String queryParameter = c4400a.getUri().getQueryParameter(SearchIntents.EXTRA_QUERY);
            if (queryParameter == null) {
                queryParameter = "";
            }
            String queryParameter2 = c4400a.getUri().getQueryParameter("source");
            if (queryParameter2 == null) {
                queryParameter2 = CustomerServiceType.NONE.getServiceType();
            }
            C43840a.m96550d("staffService: query=" + queryParameter, "HelpCenterInterceptor");
            JsonObject jsonObject = (JsonObject) C27099x.m66913c(queryParameter, JsonObject.class);
            if (Intrinsics.areEqual(jsonObject.has(AppsFlyerProperties.CHANNEL) ? jsonObject.get(AppsFlyerProperties.CHANNEL).getAsString() : "", "ada")) {
                m103214d(queryParameter2, jsonObject, map);
            }
        } catch (Throwable th2) {
            C43846g.m96568c(new HelpCenterException(th2, "HelpCenterInterceptor", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final void m103214d(String str, JsonObject jsonObject, HashMap<String, String> map) {
        try {
            String string = jsonObject.has("metaFields") ? jsonObject.get("metaFields").toString() : "";
            Intrinsics.checkNotNull(string);
            String asString = jsonObject.has("greeting") ? jsonObject.get("greeting").getAsString() : "";
            boolean asBoolean = jsonObject.has("reset") ? jsonObject.get("reset").getAsBoolean() : false;
            Set<Map.Entry<String, JsonElement>> setEntrySet = ((JsonObject) C27099x.m66913c(string, JsonObject.class)).entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "entrySet(...)");
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                map.put(entry.getKey(), C27099x.m66913c(((JsonElement) entry.getValue()).toString(), String.class));
            }
            map.put("greetings", asString);
            CustomerServiceType customerServiceTypeFromValue = CustomerServiceType.INSTANCE.fromValue(str);
            IHelpCenterService.m28904f(IHelpCenterService.f25326a.get(), C27017c.f54310a.m66513b(), null, customerServiceTypeFromValue, map, asBoolean, 2, null);
            if (customerServiceTypeFromValue == CustomerServiceType.NONE) {
                C43846g.m96568c(new HelpCenterMessage("staffService ada source is " + str, "HelpCenterInterceptor", false, 4, null), null, 2, null);
            }
        } catch (Throwable th2) {
            C43846g.m96568c(new HelpCenterException(th2, "HelpCenterInterceptor", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m103212a(C4400a c4400a) {
        String queryParameter = c4400a.getUri().getQueryParameter("source");
        if (queryParameter == null) {
            queryParameter = CustomerServiceType.NONE.getServiceType();
        }
        CustomerServiceType customerServiceTypeFromValue = CustomerServiceType.INSTANCE.fromValue(queryParameter);
        IHelpCenterService.m28904f(IHelpCenterService.f25326a.get(), C27017c.f54310a.m66513b(), null, customerServiceTypeFromValue, null, false, 26, null);
        if (customerServiceTypeFromValue == CustomerServiceType.NONE) {
            C43846g.m96568c(new HelpCenterMessage("help/customerservice source is " + queryParameter, "HelpCenterInterceptor", false, 4, null), null, 2, null);
        }
    }
}
