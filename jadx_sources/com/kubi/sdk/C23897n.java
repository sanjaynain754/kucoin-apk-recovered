package com.kubi.sdk;

import android.content.Context;
import org.aspectj.runtime.internal.AbstractC43178a;

/* JADX INFO: renamed from: com.kubi.sdk.n */
/* JADX INFO: compiled from: BaseActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
public class C23897n extends AbstractC43178a {
    @Override // org.aspectj.runtime.internal.AbstractC43178a
    public Object run(Object[] objArr) {
        Object[] objArr2 = this.state;
        BaseActivity baseActivity = (BaseActivity) objArr2[0];
        Context context = (Context) objArr2[1];
        super/*androidx.appcompat.app.AppCompatActivity*/.attachBaseContext(context);
        return null;
    }

    public C23897n(Object[] objArr) {
        super(objArr);
    }
}
