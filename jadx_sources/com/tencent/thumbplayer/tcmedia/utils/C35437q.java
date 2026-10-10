package com.tencent.thumbplayer.tcmedia.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.q */
/* JADX INFO: loaded from: classes64.dex */
public class C35437q {

    /* JADX INFO: renamed from: a */
    private String f76615a;

    /* JADX INFO: renamed from: b */
    private a f76616b;

    /* JADX INFO: renamed from: c */
    private Looper f76617c;

    /* JADX INFO: renamed from: d */
    private C35433m f76618d = new C35433m();

    /* JADX INFO: renamed from: e */
    private Object f76619e;

    /* JADX INFO: renamed from: f */
    private Class<?> f76620f;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.q$a */
    public class a extends Handler {
        private a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C35437q.this.m78931a(message);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.q$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        Object f76622a;

        /* JADX INFO: renamed from: b */
        C35425e f76623b;

        private b() {
        }
    }

    /* JADX INFO: renamed from: a */
    private Object m78927a(int i11, int i12, int i13, Object obj, boolean z11, boolean z12, long j11) {
        C35425e c35425e = new C35425e();
        b bVar = new b();
        bVar.f76622a = obj;
        bVar.f76623b = c35425e;
        m78935b(i11, i12, i13, bVar, z11, z12, j11);
        return c35425e.m78862a(500L);
    }

    /* JADX INFO: renamed from: b */
    public Object m78937b(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            TPLogUtil.m78797e(this.f76615a, "dealThreadSwitch failed , methodName is null");
            throw new RuntimeException("dealThreadSwitch failed , methodName is null");
        }
        int iM78907b = C35434n.m78907b(this.f76620f, str, m78934a(obj));
        if (iM78907b < 0) {
            TPLogUtil.m78797e(this.f76615a, "dealThreadSwitch failed , not match method:".concat(String.valueOf(str)));
            throw new RuntimeException("dealThreadSwitch failed , not match method:".concat(String.valueOf(str)));
        }
        boolean zM78911d = C35434n.m78911d(this.f76620f, iM78907b);
        boolean zM78912e = C35434n.m78912e(this.f76620f, iM78907b);
        if (C35434n.m78910c(this.f76620f, iM78907b)) {
            return m78927a(iM78907b, 0, 0, obj, zM78912e, zM78911d, 0L);
        }
        m78935b(iM78907b, 0, 0, obj, zM78912e, zM78911d, 0L);
        return null;
    }

    /* JADX INFO: renamed from: b */
    private boolean m78935b(int i11, int i12, int i13, Object obj, boolean z11, boolean z12, long j11) {
        String str;
        StringBuilder sb2;
        String str2;
        if (this.f76616b == null) {
            str = this.f76615a;
            sb2 = new StringBuilder();
            sb2.append(m78929a(i11));
            str2 = " , send failed , handler null";
        } else if (z11 && obj == null) {
            str = this.f76615a;
            sb2 = new StringBuilder();
            sb2.append(m78929a(i11));
            str2 = ", send failed , params null";
        } else {
            if (this.f76617c.getThread().isAlive()) {
                if (!m78933a()) {
                    this.f76618d.readLock().lock();
                }
                if (z12) {
                    this.f76616b.removeMessages(i11);
                }
                Message messageObtainMessage = this.f76616b.obtainMessage();
                messageObtainMessage.what = i11;
                messageObtainMessage.arg1 = i12;
                messageObtainMessage.arg2 = i13;
                messageObtainMessage.obj = obj;
                if (m78933a()) {
                    m78931a(messageObtainMessage);
                    return true;
                }
                this.f76616b.sendMessageDelayed(messageObtainMessage, j11);
                this.f76618d.readLock().unlock();
                return true;
            }
            str = this.f76615a;
            sb2 = new StringBuilder();
            sb2.append(m78929a(i11));
            str2 = ", send failed , thread had dead";
        }
        sb2.append(str2);
        TPLogUtil.m78797e(str, sb2.toString());
        return false;
    }

    /* JADX INFO: renamed from: a */
    public Object m78936a(String str, Object obj) {
        return m78928a(str, m78937b(str, obj), obj);
    }

    public C35437q(String str, Looper looper, Object obj) {
        this.f76615a = str;
        this.f76617c = looper;
        this.f76616b = new a(this.f76617c);
        this.f76619e = obj;
        Class<?> cls = obj.getClass();
        this.f76620f = cls;
        if (C35434n.m78904a(cls, 0)) {
            return;
        }
        TPLogUtil.m78797e(this.f76615a, "Register " + this.f76620f.getName() + " @ThreadSwitch method failed, version: 2.32.0.573");
        throw new RuntimeException("register @ThreadSwitch method failed, player can not work");
    }

    /* JADX INFO: renamed from: a */
    private Object m78928a(String str, Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        String name = C35434n.m78902a(this.f76620f, str, m78934a(obj2)).getReturnType().getName();
        if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
            return Boolean.FALSE;
        }
        if (name.equals("int")) {
            return 0;
        }
        if (name.equals("long")) {
            return 0L;
        }
        if (name.equals(TypedValues.Custom.S_FLOAT)) {
            return Float.valueOf(0.0f);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private String m78929a(int i11) {
        String strM78908b = C35434n.m78908b(this.f76620f, i11);
        if (!TextUtils.isEmpty(strM78908b) && !strM78908b.equals("unknown")) {
            return strM78908b;
        }
        return i11 + " not find";
    }

    /* JADX INFO: renamed from: a */
    private void m78930a(int i11, Object obj) {
        Object objInvoke;
        C35425e c35425e = obj instanceof b ? ((b) obj).f76623b : null;
        Method methodM78913f = C35434n.m78913f(this.f76620f, i11);
        if (methodM78913f == null) {
            TPLogUtil.m78797e(this.f76615a, "invokeMethod, handle method name is empty, msg:".concat(String.valueOf(i11)));
            if (c35425e != null) {
                c35425e.m78864a((Throwable) new RuntimeException("invokeMethod, handle method name is empty"));
                return;
            }
            return;
        }
        try {
            if (methodM78913f.getParameterTypes().length == 0) {
                objInvoke = methodM78913f.invoke(this.f76619e, new Object[0]);
            } else {
                objInvoke = methodM78913f.invoke(this.f76619e, m78934a(obj));
            }
            if (c35425e != null) {
                c35425e.m78863a(objInvoke);
            }
        } catch (InvocationTargetException e11) {
            TPLogUtil.m78797e(this.f76615a, "invokeMethod " + methodM78913f.getName() + " has excecption: " + e11.getTargetException().toString());
            if (c35425e == null) {
                return;
            }
            if (e11.getTargetException() instanceof IllegalArgumentException) {
                c35425e.m78864a((Throwable) new IllegalArgumentException("invokeMethod " + methodM78913f.getName() + " failed, params invalid", e11.getCause()));
                return;
            }
            if (!(e11.getTargetException() instanceof IllegalStateException)) {
                c35425e.m78864a(e11.getTargetException());
                return;
            }
            c35425e.m78864a((Throwable) new IllegalStateException("invokeMethod " + methodM78913f.getName() + " failed, state invalid", e11.getCause()));
        } catch (Exception e12) {
            TPLogUtil.m78797e(this.f76615a, "invokeMethod " + methodM78913f.getName() + " has excecption: " + e12.toString());
            if (c35425e != null) {
                c35425e.m78864a((Throwable) e12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m78931a(Message message) {
        if (this.f76619e == null) {
            TPLogUtil.m78797e(this.f76615a, "handle listener is null, return");
        } else {
            m78930a(message.what, message.obj);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m78933a() {
        return Looper.myLooper() == this.f76617c;
    }

    /* JADX INFO: renamed from: a */
    private Object[] m78934a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof b)) {
            return (Object[]) obj;
        }
        Object obj2 = ((b) obj).f76622a;
        if (obj2 == null) {
            return null;
        }
        return (Object[]) obj2;
    }
}
