package com.tencent.thumbplayer.tcmedia.tplayer;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import com.tencent.thumbplayer.tcmedia.utils.C35434n;
import com.tencent.thumbplayer.tcmedia.utils.C35437q;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.d */
/* JADX INFO: loaded from: classes64.dex */
public class C35413d implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    private C35411b f76484a;

    /* JADX INFO: renamed from: b */
    private C35437q f76485b;

    /* JADX INFO: renamed from: a */
    private int m78688a(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    /* JADX INFO: renamed from: b */
    private Object m78690b(Method method, Object[] objArr) {
        String name = method.getName();
        if (name.equals("setDataSource")) {
            objArr = m78691b(objArr);
        }
        if (method.getReturnType().getName().equals("void")) {
            this.f76485b.m78937b(name, objArr);
            return null;
        }
        Object objM78936a = this.f76485b.m78936a(name, objArr);
        TPLogUtil.m78800i(this.f76484a.m78668b(), "dealThreadSwitch: " + name + ", var count:" + m78688a(objArr) + ", result:" + objM78936a);
        return objM78936a;
    }

    /* JADX INFO: renamed from: b */
    private Object[] m78691b(Object[] objArr) {
        String strM78668b;
        StringBuilder sb2;
        Object obj = objArr[0];
        if (obj == null || !(obj instanceof ParcelFileDescriptor)) {
            if (obj != null && (obj instanceof AssetFileDescriptor)) {
                try {
                    AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                    objArr[0] = new AssetFileDescriptor(ParcelFileDescriptor.fromFd(assetFileDescriptor.getParcelFileDescriptor().detachFd()), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                    assetFileDescriptor.close();
                    return objArr;
                } catch (Exception e11) {
                    e = e11;
                    strM78668b = this.f76484a.m78668b();
                    sb2 = new StringBuilder("setDataSource, fromFd has exception:");
                }
            }
            return objArr;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
            objArr[0] = ParcelFileDescriptor.fromFd(parcelFileDescriptor.detachFd());
            parcelFileDescriptor.close();
            return objArr;
        } catch (Exception e12) {
            e = e12;
            strM78668b = this.f76484a.m78668b();
            sb2 = new StringBuilder("setDataSource, fromFd has exception:");
        }
        sb2.append(e.toString());
        TPLogUtil.m78797e(strM78668b, sb2.toString());
        return objArr;
    }

    /* JADX INFO: renamed from: a */
    public Object m78692a() {
        return Proxy.newProxyInstance(this.f76484a.getClass().getClassLoader(), this.f76484a.getClass().getInterfaces(), this);
    }

    public C35413d(C35411b c35411b) {
        this.f76484a = c35411b;
        this.f76485b = new C35437q(c35411b.m78668b(), this.f76484a.m78667a(), this.f76484a);
    }

    /* JADX INFO: renamed from: a */
    private boolean m78689a(Method method, Object[] objArr) {
        return C35434n.m78902a(this.f76484a.getClass(), method.getName(), objArr) != null;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (!m78689a(method, objArr)) {
            return method.invoke(this.f76484a, objArr);
        }
        return m78690b(method, objArr);
    }
}
