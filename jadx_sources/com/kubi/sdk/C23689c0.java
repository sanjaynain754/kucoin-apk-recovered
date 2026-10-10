package com.kubi.sdk;

import android.content.Context;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.AbstractC43178a;

/* JADX INFO: renamed from: com.kubi.sdk.c0 */
/* JADX INFO: compiled from: BaseApplication.kt */
/* JADX INFO: loaded from: classes12.dex */
public class C23689c0 extends AbstractC43178a {
    @Override // org.aspectj.runtime.internal.AbstractC43178a
    public Object run(Object[] objArr) {
        Object[] objArr2 = this.state;
        BaseApplication.attachBaseContext_aroundBody0((BaseApplication) objArr2[0], (Context) objArr2[1], (InterfaceC43175a) objArr2[2]);
        return null;
    }

    public C23689c0(Object[] objArr) {
        super(objArr);
    }
}
