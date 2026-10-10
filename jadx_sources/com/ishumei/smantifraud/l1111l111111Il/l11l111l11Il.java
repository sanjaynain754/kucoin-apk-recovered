package com.ishumei.smantifraud.l1111l111111Il;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.ishumei.smantifraud.AbsDetector;
import com.ishumei.smantifraud.SmAntiFraud;
import com.ishumei.smantifraud.VDataListener;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes56.dex */
public class l11l111l11Il {
    private static final String l1111l111111Il = "eventId";
    private static final String l111l11111I1l = "screenrecord";
    private static final String l111l11111Il = "screenshot";
    private static final String l111l11111lIl = "wevent";
    private static final String l111l1111l1Il = "gpsevent";
    private static final String l111l1111lI1l = "mem";
    private static final int l111l1111lIl = 0;
    private static final String l111l1111llIl = "textinput";
    private static final int l11l1111I11l = 2;
    private static final int l11l1111I1l = 0;
    private static final int l11l1111I1ll = 1;
    private static final int l11l1111Il = 2;
    private static final int l11l1111Il1l = 3;
    private static final int l11l1111Ill = 10;
    private static final int l11l1111lIIl = 1;
    private static l11l111l11Il l11l111l11Il = null;
    private static final int l11l11IlIIll = 50;
    private Handler l111l111lIlll;
    private final int l111l111llIl;
    private final HandlerThread l111l11IlIlIl;
    private HandlerThread l11l111I111l;
    private int l11l111I11l;
    private final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<JSONObject> l11l111l1I1l;
    private final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<JSONObject> l11l111l1Il;
    private final Handler l11l111l1lll;
    private final int l11l111lI1l;
    private final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<JSONObject> l11l111ll11l;
    private final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<JSONObject> l11l111ll1Il;
    private final List<AbsDetector> l11l111llI1l;
    private final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<JSONObject> l11l111lll;
    private final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<JSONObject> l11l111lllIl;
    private final l11l1111lIIl l11l11l1lIl;
    private final VDataListener l11l111lIll = new VDataListener() { // from class: com.ishumei.smantifraud.l1111l111111Il.l11l111l11Il.1
        @Override // com.ishumei.smantifraud.VDataListener
        public final void onResult(JSONObject jSONObject, boolean z11) {
            synchronized (l11l111l11Il.class) {
                l11l111l11Il.l1111l111111Il(l11l111l11Il.this, jSONObject, z11);
            }
        }
    };
    private final Runnable l111l111I1l = new Runnable() { // from class: com.ishumei.smantifraud.l1111l111111Il.l11l111l11Il.6
        @Override // java.lang.Runnable
        public final void run() {
            try {
                l11l111l11Il.this.l111l111lIlll.postDelayed(l11l111l11Il.this.l111l111I1l, l11l111l11Il.this.l111l111llIl);
                l11l111l11Il.this.l111l11111I1l();
            } catch (Exception unused) {
            }
        }
    };

    public static synchronized l11l111l11Il l1111l111111Il() {
        try {
            if (l11l111l11Il == null) {
                l11l111l11Il = new l11l111l11Il();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return l11l111l11Il;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<JSONObject> l111l1111l1Il() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.l11l111l1I1l.l111l11111lIl(0, 2));
        hashSet.addAll(this.l11l111l1Il.l111l11111lIl(0, 2));
        hashSet.addAll(this.l11l111ll11l.l111l11111lIl(0, 2));
        hashSet.addAll(this.l11l111ll1Il.l111l11111lIl(0, 2));
        hashSet.addAll(this.l11l111lll.l111l11111lIl(0, 2));
        hashSet.addAll(this.l11l111lllIl.l111l11111lIl(0, 2));
        return hashSet;
    }

    private synchronized void l111l1111lI1l() {
        try {
            if (this.l11l111I111l == null) {
                return;
            }
            Handler handler = this.l111l111lIlll;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.l11l111I111l.quitSafely();
            this.l11l111I111l = null;
        } catch (Exception unused) {
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void l111l1111llIl() {
        if (this.l11l111I111l != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("sm-vd-thread");
        this.l11l111I111l = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.l11l111I111l.getLooper());
        this.l111l111lIlll = handler;
        handler.postDelayed(this.l111l111I1l, this.l111l111llIl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l111l11111I1l() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        this.l11l111l1lll.sendMessage(messageObtain);
    }

    private Set<JSONObject> l111l11111Il() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.l11l111l1I1l.l1111l111111Il());
        hashSet.addAll(this.l11l111l1Il.l1111l111111Il());
        hashSet.addAll(this.l11l111ll11l.l1111l111111Il());
        hashSet.addAll(this.l11l111ll1Il.l1111l111111Il());
        hashSet.addAll(this.l11l111lll.l1111l111111Il());
        hashSet.addAll(this.l11l111lllIl.l1111l111111Il());
        return hashSet;
    }

    private void l111l1111llIl(Set<JSONObject> set) {
        if (set.isEmpty()) {
            return;
        }
        this.l11l111l1I1l.l1111l111111Il(set, 2);
        this.l11l111l1Il.l1111l111111Il(set, 2);
        this.l11l111ll11l.l1111l111111Il(set, 2);
        this.l11l111ll1Il.l1111l111111Il(set, 2);
        this.l11l111lll.l1111l111111Il(set, 2);
        this.l11l111lllIl.l1111l111111Il(set, 2);
    }

    public final String l111l11111lIl() {
        l111l11111I1l();
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.l11l111l1I1l.l1111l111111Il());
        hashSet.addAll(this.l11l111l1Il.l1111l111111Il());
        hashSet.addAll(this.l11l111ll11l.l1111l111111Il());
        hashSet.addAll(this.l11l111ll1Il.l1111l111111Il());
        hashSet.addAll(this.l11l111lll.l1111l111111Il());
        hashSet.addAll(this.l11l111lllIl.l1111l111111Il());
        return l11l1111Ill.l1111l111111Il(hashSet, this.l11l11l1lIl.l1111l111111Il(), false);
    }

    private l11l111l11Il() {
        HandlerThread handlerThread = new HandlerThread("sm-vd-work");
        this.l111l11IlIlIl = handlerThread;
        handlerThread.start();
        this.l11l111l1lll = new Handler(handlerThread.getLooper()) { // from class: com.ishumei.smantifraud.l1111l111111Il.l11l111l11Il.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                try {
                    int i11 = message.what;
                    boolean z11 = true;
                    if (i11 == 0) {
                        l11l111l11Il l11l111l11il = l11l111l11Il.this;
                        JSONObject jSONObject = (JSONObject) message.obj;
                        if (message.arg1 != 1) {
                            z11 = false;
                        }
                        l11l111l11Il.l111l11111lIl(l11l111l11il, jSONObject, z11);
                        return;
                    }
                    if (i11 == 1) {
                        l11l111l11Il.l1111l111111Il(l11l111l11Il.this, (Set) message.obj);
                        return;
                    }
                    if (i11 == 2) {
                        l11l111l11Il.l111l11111lIl(l11l111l11Il.this, (Set) message.obj);
                    } else {
                        if (i11 != 3) {
                            return;
                        }
                        l11l111l11Il l11l111l11il2 = l11l111l11Il.this;
                        l11l111l11il2.l111l11111I1l((Set<JSONObject>) l11l111l11il2.l111l1111l1Il());
                    }
                } catch (Exception unused) {
                }
            }
        };
        this.l11l111llI1l = new LinkedList();
        l111l11111Il l111l11111ilL111l11111lIl = l111l1111l1Il.l1111l111111Il().l111l11111lIl();
        this.l11l111lI1l = l111l11111ilL111l11111lIl.l111l1111lIl();
        this.l111l111llIl = l111l11111ilL111l11111lIl.l111l1111lI1l() * 1000;
        this.l11l11l1lIl = new l11l1111lIIl();
        this.l11l111l1I1l = new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<>(50);
        this.l11l111l1Il = new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<>(10);
        this.l11l111ll11l = new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<>(10);
        this.l11l111ll1Il = new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<>(10);
        this.l11l111lll = new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<>(10);
        this.l11l111lllIl = new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il<>(10);
    }

    public static /* synthetic */ void l111l11111Il(l11l111l11Il l11l111l11il, Set set) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = set;
        l11l111l11il.l11l111l1lll.sendMessage(messageObtain);
    }

    public static /* synthetic */ void l111l1111l1Il(l11l111l11Il l11l111l11il, Set set) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = set;
        l11l111l11il.l11l111l1lll.sendMessage(messageObtain);
    }

    public final void l1111l111111Il(AbsDetector absDetector) {
        if (absDetector == null) {
            return;
        }
        absDetector.register(this.l11l111lIll);
        try {
            Method declaredMethod = AbsDetector.class.getDeclaredMethod("start", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(absDetector, new Object[0]);
            this.l11l111I11l = 0;
        } catch (Exception unused) {
        }
        l111l1111llIl();
        this.l11l111llI1l.add(absDetector);
    }

    public final void l111l11111lIl(AbsDetector absDetector) {
        if (absDetector == null) {
            return;
        }
        absDetector.unregister();
        try {
            Method declaredMethod = AbsDetector.class.getDeclaredMethod(InterfaceC33730j9.f70350a, new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(absDetector, new Object[0]);
        } catch (Exception unused) {
        }
        this.l11l111llI1l.remove(absDetector);
        if (this.l11l111llI1l.isEmpty()) {
            l111l1111lI1l();
        }
    }

    public static /* synthetic */ void l1111l111111Il(l11l111l11Il l11l111l11il, Set set) {
        if (set.isEmpty()) {
            return;
        }
        l11l111l11il.l11l111l1I1l.l1111l111111Il((Set<JSONObject>) set, 2);
        l11l111l11il.l11l111l1Il.l1111l111111Il((Set<JSONObject>) set, 2);
        l11l111l11il.l11l111ll11l.l1111l111111Il((Set<JSONObject>) set, 2);
        l11l111l11il.l11l111ll1Il.l1111l111111Il((Set<JSONObject>) set, 2);
        l11l111l11il.l11l111lll.l1111l111111Il((Set<JSONObject>) set, 2);
        l11l111l11il.l11l111lllIl.l1111l111111Il((Set<JSONObject>) set, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l111l11111I1l(final Set<JSONObject> set) {
        if (set.isEmpty()) {
            return;
        }
        try {
            String strL1111l111111Il = l11l1111Ill.l1111l111111Il(set, null, true);
            if (!set.isEmpty()) {
                this.l11l111l1I1l.l1111l111111Il(set, 1);
                this.l11l111l1Il.l1111l111111Il(set, 1);
                this.l11l111ll11l.l1111l111111Il(set, 1);
                this.l11l111ll1Il.l1111l111111Il(set, 1);
                this.l11l111lll.l1111l111111Il(set, 1);
                this.l11l111lllIl.l1111l111111Il(set, 1);
            }
            this.l11l111I11l++;
            com.ishumei.smantifraud.l111l11111Il.l111l1111llIl<Object> l111l1111llil = new com.ishumei.smantifraud.l111l11111Il.l111l1111llIl<Object>(1, SmAntiFraud.option.l11l1111I1ll(), SmAntiFraud.option.l11l1111Il(), strL1111l111111Il, new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl.l111l11111lIl<Object>() { // from class: com.ishumei.smantifraud.l1111l111111Il.l11l111l11Il.3
                @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl.l111l11111lIl
                public final void l1111l111111Il(Object obj) {
                    l11l111l11Il.this.l111l111lIlll.removeCallbacksAndMessages(null);
                    l11l111l11Il.this.l111l111lIlll.postDelayed(l11l111l11Il.this.l111l111I1l, l11l111l11Il.this.l111l111llIl);
                    l11l111l11Il.l111l11111Il(l11l111l11Il.this, set);
                }
            }, new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl.l1111l111111Il() { // from class: com.ishumei.smantifraud.l1111l111111Il.l11l111l11Il.4
                @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl.l1111l111111Il
                public final void l1111l111111Il(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111I1ll l11l1111i1ll) {
                    l11l111l11Il.l111l1111l1Il(l11l111l11Il.this, set);
                }
            }) { // from class: com.ishumei.smantifraud.l1111l111111Il.l11l111l11Il.5
                {
                    super(1, str, str, strL1111l111111Il, l111l11111lil, l1111l111111il);
                }

                @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l1111llIl, com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lI1l
                public final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl<Object> l1111l111111Il(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111llIl l111l1111llil2) {
                    return com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl.l1111l111111Il(new Object());
                }
            };
            l111l1111llil.l1111l111111Il((com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111I1l) new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il(2000, 1, 1.0f));
            com.ishumei.smantifraud.l111l11111Il.l111l1111l1Il.l1111l111111Il().l1111l111111Il(l111l1111llil);
        } catch (Exception unused) {
        }
    }

    private void l111l11111Il(Set<JSONObject> set) {
        if (set.isEmpty()) {
            return;
        }
        this.l11l111l1I1l.l1111l111111Il(set, 1);
        this.l11l111l1Il.l1111l111111Il(set, 1);
        this.l11l111ll11l.l1111l111111Il(set, 1);
        this.l11l111ll1Il.l1111l111111Il(set, 1);
        this.l11l111lll.l1111l111111Il(set, 1);
        this.l11l111lllIl.l1111l111111Il(set, 1);
    }

    public static /* synthetic */ void l111l11111lIl(l11l111l11Il l11l111l11il, Set set) {
        if (set.isEmpty()) {
            return;
        }
        l11l111l11il.l11l111l1I1l.l1111l111111Il((Set<JSONObject>) set);
        l11l111l11il.l11l111l1Il.l1111l111111Il((Set<JSONObject>) set);
        l11l111l11il.l11l111ll11l.l1111l111111Il((Set<JSONObject>) set);
        l11l111l11il.l11l111ll1Il.l1111l111111Il((Set<JSONObject>) set);
        l11l111l11il.l11l111lll.l1111l111111Il((Set<JSONObject>) set);
        l11l111l11il.l11l111lllIl.l1111l111111Il((Set<JSONObject>) set);
    }

    private void l111l1111l1Il(Set<JSONObject> set) {
        if (set.isEmpty()) {
            return;
        }
        this.l11l111l1I1l.l1111l111111Il(set);
        this.l11l111l1Il.l1111l111111Il(set);
        this.l11l111ll11l.l1111l111111Il(set);
        this.l11l111ll1Il.l1111l111111Il(set);
        this.l11l111lll.l1111l111111Il(set);
        this.l11l111lllIl.l1111l111111Il(set);
    }

    public static /* synthetic */ void l1111l111111Il(l11l111l11Il l11l111l11il, JSONObject jSONObject, boolean z11) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        messageObtain.obj = jSONObject;
        messageObtain.arg1 = z11 ? 1 : 0;
        l11l111l11il.l11l111l1lll.sendMessage(messageObtain);
    }

    public static /* synthetic */ void l111l11111lIl(l11l111l11Il l11l111l11il, JSONObject jSONObject, boolean z11) {
        if (jSONObject != null) {
            if (z11 || l11l111l11il.l11l111I11l < l11l111l11il.l11l111lI1l) {
                String strOptString = jSONObject.optString(l1111l111111Il, "");
                strOptString.getClass();
                switch (strOptString) {
                    case "gpsevent":
                        l11l111l11il.l11l111ll1Il.l1111l111111Il(jSONObject, 0);
                        if (!z11 && l11l111l11il.l11l111ll1Il.l1111l111111Il(0, 2) < 10) {
                            return;
                        }
                        break;
                    case "textinput":
                        l11l111l11il.l11l111lll.l1111l111111Il(jSONObject, 0);
                        if (!z11 && l11l111l11il.l11l111lll.l1111l111111Il(0, 2) < 10) {
                            return;
                        }
                        break;
                    case "screenrecord":
                        l11l111l11il.l11l111l1Il.l1111l111111Il(jSONObject, 0);
                        if (!z11 && l11l111l11il.l11l111l1Il.l1111l111111Il(0, 2) < 10) {
                            return;
                        }
                        break;
                    case "wevent":
                        l11l111l11il.l11l111l1I1l.l1111l111111Il(jSONObject, 0);
                        if (!z11 && l11l111l11il.l11l111l1I1l.l1111l111111Il(0, 2) < 50) {
                            return;
                        }
                        break;
                    case "screenshot":
                        l11l111l11il.l11l111ll11l.l1111l111111Il(jSONObject, 0);
                        if (!z11 && l11l111l11il.l11l111ll11l.l1111l111111Il(0, 2) < 10) {
                            return;
                        }
                        break;
                    case "mem":
                        l11l111l11il.l11l111lllIl.l1111l111111Il(jSONObject, 0);
                        if (!z11 && l11l111l11il.l11l111lllIl.l1111l111111Il(0, 2) < 10) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
                l11l111l11il.l111l11111I1l(l11l111l11il.l111l1111l1Il());
            }
        }
    }

    private void l1111l111111Il(Set<JSONObject> set) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = set;
        this.l11l111l1lll.sendMessage(messageObtain);
    }

    private void l111l11111lIl(Set<JSONObject> set) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = set;
        this.l11l111l1lll.sendMessage(messageObtain);
    }

    private void l1111l111111Il(JSONObject jSONObject, boolean z11) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        messageObtain.obj = jSONObject;
        messageObtain.arg1 = z11 ? 1 : 0;
        this.l11l111l1lll.sendMessage(messageObtain);
    }

    private void l111l11111lIl(JSONObject jSONObject, boolean z11) {
        if (jSONObject == null) {
            return;
        }
        if (z11 || this.l11l111I11l < this.l11l111lI1l) {
            String strOptString = jSONObject.optString(l1111l111111Il, "");
            strOptString.getClass();
            switch (strOptString) {
                case "gpsevent":
                    this.l11l111ll1Il.l1111l111111Il(jSONObject, 0);
                    if (!z11 && this.l11l111ll1Il.l1111l111111Il(0, 2) < 10) {
                        return;
                    }
                    break;
                case "textinput":
                    this.l11l111lll.l1111l111111Il(jSONObject, 0);
                    if (!z11 && this.l11l111lll.l1111l111111Il(0, 2) < 10) {
                        return;
                    }
                    break;
                case "screenrecord":
                    this.l11l111l1Il.l1111l111111Il(jSONObject, 0);
                    if (!z11 && this.l11l111l1Il.l1111l111111Il(0, 2) < 10) {
                        return;
                    }
                    break;
                case "wevent":
                    this.l11l111l1I1l.l1111l111111Il(jSONObject, 0);
                    if (!z11 && this.l11l111l1I1l.l1111l111111Il(0, 2) < 50) {
                        return;
                    }
                    break;
                case "screenshot":
                    this.l11l111ll11l.l1111l111111Il(jSONObject, 0);
                    if (!z11 && this.l11l111ll11l.l1111l111111Il(0, 2) < 10) {
                        return;
                    }
                    break;
                case "mem":
                    this.l11l111lllIl.l1111l111111Il(jSONObject, 0);
                    if (!z11 && this.l11l111lllIl.l1111l111111Il(0, 2) < 10) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            l111l11111I1l(l111l1111l1Il());
        }
    }
}
