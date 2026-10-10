package kf0;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cf0.C4952g;
import cf0.InterfaceC4962q;
import cf0.InterfaceC4964s;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf0.AbstractC37904b;
import gf0.InterfaceC37908f;
import ih0.C38631m;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import lf0.AbstractC42184c;
import lf0.C42185d;

/* JADX INFO: renamed from: kf0.d */
/* JADX INFO: compiled from: ImageHandler.java */
/* JADX INFO: loaded from: classes60.dex */
public class C41020d extends AbstractC41024h {

    /* JADX INFO: renamed from: a */
    public final a f91252a;

    /* JADX INFO: renamed from: kf0.d$a */
    /* JADX INFO: compiled from: ImageHandler.java */
    public interface a {
        @Nullable
        C42185d parse(@NonNull Map<String, String> map);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static C41020d m89975e() {
        return new C41020d(new C41021e(AbstractC37904b.m85679a()));
    }

    @Override // gf0.AbstractC37915m
    @NonNull
    /* JADX INFO: renamed from: b */
    public Collection<String> mo85735b() {
        return Collections.singleton("img");
    }

    public C41020d(@NonNull a aVar) {
        this.f91252a = aVar;
    }

    @Override // kf0.AbstractC41024h
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo89974d(@NonNull C4952g c4952g, @NonNull InterfaceC4962q interfaceC4962q, @NonNull InterfaceC37908f interfaceC37908f) {
        InterfaceC4964s interfaceC4964s;
        String str = interfaceC37908f.mo85696b().get(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY);
        if (TextUtils.isEmpty(str) || (interfaceC4964s = c4952g.m5180c().get(C38631m.class)) == null) {
            return null;
        }
        String strMo93248b = c4952g.m5178a().mo93248b(str);
        C42185d c42185d = this.f91252a.parse(interfaceC37908f.mo85696b());
        AbstractC42184c.f93651a.m5239d(interfaceC4962q, strMo93248b);
        AbstractC42184c.f93653c.m5239d(interfaceC4962q, c42185d);
        AbstractC42184c.f93652b.m5239d(interfaceC4962q, Boolean.FALSE);
        return interfaceC4964s.mo5246a(c4952g, interfaceC4962q);
    }
}
