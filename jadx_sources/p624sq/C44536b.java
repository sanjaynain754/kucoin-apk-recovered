package p624sq;

import android.content.Context;
import android.util.Log;
import com.kubi.monitor.cls.internal.AppTrackerClsToken;
import com.kubi.monitor.cls.internal.AppTrackerCredentialManager;
import com.kubi.monitor.cls.internal.C19217a;
import java.util.Iterator;
import java.util.Map;
import jc0.C40383a;
import jc0.C40386d;
import jc0.InterfaceC40385c;
import kc0.C40988e;
import kc0.C40989f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: sq.b */
/* JADX INFO: compiled from: AppTracker.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lsq/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lsq/c;", "contextProxy", "", "b", "(Landroid/content/Context;Lsq/c;)V", "proxy", "c", "(Lsq/c;)V", "", "content", "", "dimensions", "", "d", "(Ljava/lang/String;Ljava/util/Map;)Z", "Monitor-cls_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C44536b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44536b f98715a = new C44536b();

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m98548b(@NotNull Context context, @NotNull InterfaceC44537c contextProxy) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contextProxy, "contextProxy");
        m98549c(contextProxy);
        AppTrackerCredentialManager.f35508a.m42405e(context);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m98549c(@Nullable InterfaceC44537c proxy) {
        C19217a.f35512a.m42412f(proxy);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: d */
    public static final boolean m98550d(@NotNull String content, @NotNull Map<String, ? extends Object> dimensions) {
        C19217a c19217a;
        C40383a c40383aM42409c;
        Object objM103844constructorimpl;
        Map<String, Object> mapCommonTrackerContent;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        if (StringsKt.isBlank(content) || (c40383aM42409c = (c19217a = C19217a.f35512a).m42409c()) == null) {
            return false;
        }
        AppTrackerClsToken appTrackerClsTokenM42408b = c19217a.m42408b();
        String topicId = appTrackerClsTokenM42408b == null ? null : appTrackerClsTokenM42408b.getTopicId();
        if (topicId == null) {
            return false;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            C40989f c40989f = new C40989f(System.currentTimeMillis() / ((long) 1000));
            c40989f.m89785a(new C40988e("content", content));
            Iterator<Map.Entry<String, ? extends Object>> it = dimensions.entrySet().iterator();
            while (true) {
                String str = "";
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, ? extends Object> next = it.next();
                String key = next.getKey();
                Object value = next.getValue();
                String string = value == null ? null : value.toString();
                if (string != null) {
                    str = string;
                }
                c40989f.m89785a(new C40988e(key, str));
            }
            InterfaceC44537c interfaceC44537cM42407a = C19217a.f35512a.m42407a();
            if (interfaceC44537cM42407a != null && (mapCommonTrackerContent = interfaceC44537cM42407a.commonTrackerContent()) != null) {
                for (Map.Entry<String, Object> entry : mapCommonTrackerContent.entrySet()) {
                    String key2 = entry.getKey();
                    Object value2 = entry.getValue();
                    String string2 = value2 == null ? null : value2.toString();
                    if (string2 == null) {
                        string2 = "";
                    }
                    c40989f.m89785a(new C40988e(key2, string2));
                }
            }
            c40383aM42409c.m88982a(topicId, CollectionsKt.listOf(c40989f), new InterfaceC40385c() { // from class: sq.a
                @Override // jc0.InterfaceC40385c
                /* JADX INFO: renamed from: a */
                public final void mo89001a(C40386d c40386d) {
                    C44536b.m98551e(c40386d);
                }
            });
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.TRUE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            Log.e("AppTracker", "Tencent CLS enqueue failed", thM103847exceptionOrNullimpl);
            objM103844constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM103844constructorimpl).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public static final void m98551e(C40386d c40386d) {
        if (!c40386d.m89005d()) {
            Log.e("AppTracker", "Tencent CLS upload failed: " + ((Object) c40386d.m89002a()) + ", " + ((Object) c40386d.m89003b()));
        }
    }
}
