package cn.jiguang.privates.common.component;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import cn.jiguang.privates.common.JCommon;
import cn.jiguang.privates.common.business.lifecycle.JLifecycleBusiness;
import cn.jiguang.privates.common.business.network.JNetworkBusiness;
import cn.jiguang.privates.common.observer.JObservable;
import com.google.android.gms.actions.SearchIntents;
import com.kubi.sdk.util.ProviderAspect;
import dh0.C36686b;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.AbstractC43178a;

/* JADX INFO: loaded from: classes.dex */
public class JCommonProvider extends ContentProvider {
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_0;

    /* JADX INFO: loaded from: classes34.dex */
    public class AjcClosure1 extends AbstractC43178a {
        @Override // org.aspectj.runtime.internal.AbstractC43178a
        public Object run(Object[] objArr) {
            Object[] objArr2 = this.state;
            return JCommonProvider.query_aroundBody0((JCommonProvider) objArr2[0], (Uri) objArr2[1], (String[]) objArr2[2], (String) objArr2[3], (String[]) objArr2[4], (String) objArr2[5], (InterfaceC43175a) objArr2[6]);
        }

        public AjcClosure1(Object[] objArr) {
            super(objArr);
        }
    }

    public static final /* synthetic */ Cursor query_aroundBody0(JCommonProvider jCommonProvider, Uri uri, String[] strArr, String str, String[] strArr2, String str2, InterfaceC43175a interfaceC43175a) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("JCommonProvider.java", JCommonProvider.class);
        ajc$tjp_0 = c36686b.m82128h("method-execution", c36686b.m82127g("1", SearchIntents.EXTRA_QUERY, "cn.jiguang.privates.common.component.JCommonProvider", "android.net.Uri:[Ljava.lang.String;:java.lang.String:[Ljava.lang.String;:java.lang.String", "uri:projection:selection:selectionArgs:sortOrder", "", "android.database.Cursor"), 25);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return (Cursor) ProviderAspect.m58515b().m58516c(new AjcClosure1(new Object[]{this, uri, strArr, str, strArr2, str2, C36686b.m82125e(ajc$tjp_0, this, this, new Object[]{uri, strArr, str, strArr2, str2})}).linkClosureAndJoinPoint(69648));
    }

    static {
        ajc$preClinit();
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        JObservable.getInstance().observer(getContext().getApplicationContext(), new JCommon());
        JLifecycleBusiness.getInstance().init(getContext().getApplicationContext());
        JNetworkBusiness.getInstance().init(getContext().getApplicationContext());
        return true;
    }
}
